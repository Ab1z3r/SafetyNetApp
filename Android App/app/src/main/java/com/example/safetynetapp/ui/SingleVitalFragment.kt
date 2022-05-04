package com.example.safetynetapp.ui

import android.content.DialogInterface
import com.github.mikephil.charting.charts.LineChart
import android.widget.RadioGroup
import android.os.Bundle
import android.util.Log
import android.view.*
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.data.LineData
import java.util.ArrayList

import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.safetynetapp.HomeActivity
import com.example.safetynetapp.R
import com.example.safetynetapp.adapters.DashboardAdapter
import com.example.safetynetapp.adapters.VitalAdapter
import com.example.safetynetapp.databinding.FragmentSingleVitalBinding
import com.example.safetynetapp.models.DashboardViewModel

class SingleVitalFragment : Fragment() {
    private lateinit var adapter: VitalAdapter

    private lateinit var binding: FragmentSingleVitalBinding
    private var lineChart: LineChart? = null
    private var periodRadioGroup: RadioGroup? = null
    private var intervalRadioGroup // for later use
            : RadioGroup? = null

    private lateinit var model: DashboardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        super.onCreate(savedInstanceState)
        binding = FragmentSingleVitalBinding.inflate(inflater, container, false)
        model = ViewModelProvider(requireActivity()).get(DashboardViewModel::class.java)

        (activity as AppCompatActivity).supportActionBar?.title =
            model.vitals[model.currentPos].title

        updateView()
        adapter = VitalAdapter(this)
        binding.vitalRecyclerView.adapter = adapter
        binding.vitalRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.vitalRecyclerView.setHasFixedSize(true)


        lineChart = this.binding.lineChart.findViewById(R.id.linechart)
        periodRadioGroup = view?.findViewById(R.id.period_radiogroup)
        intervalRadioGroup = view?.findViewById(R.id.interval)
        this.binding.lineChart.findViewById<Button>(R.id.activity_main_getprices)
            ?.setOnClickListener {
                getData()
            }

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.single_vital_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_add_vital -> {
            AddVitalDialogFragment().show(childFragmentManager, AddVitalDialogFragment.TAG)
//            val inflater = requireActivity().layoutInflater
//
//            AlertDialog.Builder(requireContext())
//                .setView(inflater.inflate(R.layout.dialog_add_vital, this.view))
////                    .setTitle("Title")
////                    .setMessage("Message")
//                .setPositiveButton(android.R.string.ok) { dialog, which ->
////                        findNavController().popBackStack()
//                }.setNegativeButton(
//                    android.R.string.cancel,
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // User cancelled the dialog
//                    })
//                .show()
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }


    private fun getData() {
        val data = ArrayList<Entry>()
        data.add(Entry(0F, 75F))
        data.add(Entry(1F, 73F))
        data.add(Entry(2F, 80F))
        data.add(Entry(3F, 80F))
        data.add(Entry(4F, 85F))
        data.add(Entry(5F, 90F))
        data.add(Entry(6F, 75F))
        data.add(Entry(7F, 83F))
        setLineChartData(data)
    }

    private fun setLineChartData(data: ArrayList<Entry>) {
        val dataSets = ArrayList<ILineDataSet>()
        val highLineDataSet = LineDataSet(data, "Blood Pressure")
        highLineDataSet.setDrawCircles(true)
        highLineDataSet.circleRadius = 4f
        highLineDataSet.setDrawValues(false)
        highLineDataSet.lineWidth = 3f
        highLineDataSet.color = R.color.unionHealth
        highLineDataSet.setCircleColor(R.color.unionHealth)
        dataSets.add(highLineDataSet)
        val lineData = LineData(dataSets)
        lineChart?.setData(lineData);
        lineChart?.invalidate();
    }

    fun updateView() {

        // EXAMPLE
        // How I get information from the vital classes
        Log.d("VITAL", "in ${model.vitals[model.currentPos].title} vital page")

//        if(model.vitals[model.currentPos].){
//
//        }

    }
}