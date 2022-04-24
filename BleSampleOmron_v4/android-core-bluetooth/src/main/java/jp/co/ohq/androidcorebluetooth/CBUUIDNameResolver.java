package jp.co.ohq.androidcorebluetooth;

import androidx.annotation.NonNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class CBUUIDNameResolver {
    private static final Map<String, String> UUID_NAME_MAP;

    static {
        HashMap<String, String> map = new HashMap<>();

        // GATT Services
        // https://www.bluetooth.com/specifications/gatt/services
        map.put("1800", "Generic Access");
        map.put("1801", "Generic Attribute");
        map.put("1802", "Immediate Alert");
        map.put("1803", "Link Loss");
        map.put("1804", "Tx Power");
        map.put("1805", "Current Time Service");
        map.put("1806", "Reference Time Update Service");
        map.put("1807", "Next DST Change Service");
        map.put("1808", "Glucose");
        map.put("1809", "Health Thermometer");
        map.put("180A", "Device Information");
        map.put("180D", "Heart Rate");
        map.put("180E", "Phone Alert Status Service");
        map.put("180F", "Battery Service");
        map.put("1810", "Blood Pressure");
        map.put("1811", "Alert Notification Service");
        map.put("1812", "Human Interface Device");
        map.put("1813", "Scan Parameters");
        map.put("1814", "Running Speed and Cadence");
        map.put("1815", "Automation IO");
        map.put("1816", "Cycling Speed and Cadence");
        map.put("1818", "Cycling Power");
        map.put("1819", "Location and Navigation");
        map.put("181A", "Environmental Sensing");
        map.put("181B", "Body Composition");
        map.put("181C", "User Data");
        map.put("181D", "Weight Scale");
        map.put("181E", "Bond Management Service");
        map.put("181F", "Continuous Glucose Monitoring");
        map.put("1820", "Internet Protocol Support Service");
        map.put("1821", "Indoor Positioning");
        map.put("1822", "Pulse Oximeter Service");
        map.put("1823", "HTTP Proxy");
        map.put("1824", "Transport Discovery");
        map.put("1825", "Object Transfer Service");
        map.put("1826", "Fitness Machine");
        map.put("1827", "Mesh Provisioning Service");
        map.put("1828", "Mesh Proxy Service");

        // GATT Characteristics
        // https://www.bluetooth.com/specifications/gatt/characteristics
        map.put("2A00", "Device Name");
        map.put("2A01", "Appearance");
        map.put("2A02", "Peripheral Privacy Flag");
        map.put("2A03", "Reconnection Address");
        map.put("2A04", "Peripheral Preferred Connection Parameters");
        map.put("2A05", "Service Changed");
        map.put("2A06", "Alert Level");
        map.put("2A07", "Tx Power Level");
        map.put("2A08", "Date Time");
        map.put("2A09", "Day of Week");
        map.put("2A0A", "Day Date Time");
        map.put("2A0B", "Exact Time 100");
        map.put("2A0C", "Exact Time 256");
        map.put("2A0D", "DST Offset");
        map.put("2A0E", "Time Zone");
        map.put("2A0F", "Local Time Information");
        map.put("2A10", "Secondary Time Zone");
        map.put("2A11", "Time with DST");
        map.put("2A12", "Time Accuracy");
        map.put("2A13", "Time Source");
        map.put("2A14", "Reference Time Information");
        map.put("2A15", "Time Broadcast");
        map.put("2A16", "Time Update Control Point");
        map.put("2A17", "Time Update State");
        map.put("2A18", "Glucose Measurement");
        map.put("2A19", "Battery Level");
        map.put("2A1A", "Battery Power State");
        map.put("2A1B", "Battery Level State");
        map.put("2A1C", "Temperature Measurement");
        map.put("2A1D", "Temperature Type");
        map.put("2A1E", "Intermediate Temperature");
        map.put("2A1F", "Temperature Celsius");
        map.put("2A20", "Temperature Fahrenheit");
        map.put("2A21", "Measurement Interval");
        map.put("2A22", "Boot Keyboard Input Report");
        map.put("2A23", "System ID");
        map.put("2A24", "Model Number String");
        map.put("2A25", "Serial Number String");
        map.put("2A26", "Firmware Revision String");
        map.put("2A27", "Hardware Revision String");
        map.put("2A28", "Software Revision String");
        map.put("2A29", "Manufacturer Name String");
        map.put("2A2A", "IEEE 11073-20601 Regulatory Certification Data List");
        map.put("2A2B", "Current Time");
        map.put("2A2C", "Magnetic Declination");
        map.put("2A2F", "Position 2D");
        map.put("2A30", "Position 3D");
        map.put("2A31", "Scan Refresh");
        map.put("2A32", "Boot Keyboard Output Report");
        map.put("2A33", "Boot Mouse Input Report");
        map.put("2A34", "Glucose Measurement Context");
        map.put("2A35", "Blood Pressure Measurement");
        map.put("2A36", "Intermediate Cuff Pressure");
        map.put("2A37", "Heart Rate Measurement");
        map.put("2A38", "Body Sensor Location");
        map.put("2A39", "Heart Rate Control Point");
        map.put("2A3A", "Removable");
        map.put("2A3B", "Service Required");
        map.put("2A3C", "Scientific Temperature Celsius");
        map.put("2A3D", "String");
        map.put("2A3E", "Network Availability");
        map.put("2A3F", "Alert Status");
        map.put("2A40", "Ringer Control point");
        map.put("2A41", "Ringer Setting");
        map.put("2A42", "Alert Category ID Bit Mask");
        map.put("2A43", "Alert Category ID");
        map.put("2A44", "Alert Notification Control Point");
        map.put("2A45", "Unread Alert Status");
        map.put("2A46", "New Alert");
        map.put("2A47", "Supported New Alert Category");
        map.put("2A48", "Supported Unread Alert Category");
        map.put("2A49", "Blood Pressure Feature");
        map.put("2A4A", "HID Information");
        map.put("2A4B", "Report Map");
        map.put("2A4C", "HID Control Point");
        map.put("2A4D", "Report");
        map.put("2A4E", "Protocol Mode");
        map.put("2A4F", "Scan Interval Window");
        map.put("2A50", "PnP ID");
        map.put("2A51", "Glucose Feature");
        map.put("2A52", "Record Access Control Point");
        map.put("2A53", "RSC Measurement");
        map.put("2A54", "RSC Feature");
        map.put("2A55", "SC Control Point");
        map.put("2A56", "Digital");
        map.put("2A57", "Digital Output");
        map.put("2A58", "Analog");
        map.put("2A59", "Analog Output");
        map.put("2A5A", "Aggregate");
        map.put("2A5B", "CSC Measurement");
        map.put("2A5C", "CSC Feature");
        map.put("2A5D", "Sensor Location");
        map.put("2A5E", "PLX Spot-Check Measurement");
        map.put("2A5F", "PLX Continuous Measurement Characteristic");
        map.put("2A60", "PLX Features");
        map.put("2A62", "Pulse Oximetry Control Point");
        map.put("2A63", "Cycling Power Measurement");
        map.put("2A64", "Cycling Power Vector");
        map.put("2A65", "Cycling Power Feature");
        map.put("2A66", "Cycling Power Control Point");
        map.put("2A67", "Location and Speed Characteristic");
        map.put("2A68", "Navigation");
        map.put("2A69", "Position Quality");
        map.put("2A6A", "LN Feature");
        map.put("2A6B", "LN Control Point");
        map.put("2A6C", "Elevation");
        map.put("2A6D", "Pressure");
        map.put("2A6E", "Temperature");
        map.put("2A6F", "Humidity");
        map.put("2A70", "True Wind Speed");
        map.put("2A71", "True Wind Direction");
        map.put("2A72", "Apparent Wind Speed");
        map.put("2A73", "Apparent Wind Direction");
        map.put("2A74", "Gust Factor");
        map.put("2A75", "Pollen Concentration");
        map.put("2A76", "UV Index");
        map.put("2A77", "Irradiance");
        map.put("2A78", "Rainfall");
        map.put("2A79", "Wind Chill");
        map.put("2A7A", "Heat Index");
        map.put("2A7B", "Dew Point");
        map.put("2A7D", "Descriptor Value Changed");
        map.put("2A7E", "Aerobic Heart Rate Lower Limit");
        map.put("2A7F", "Aerobic Threshold");
        map.put("2A80", "Age");
        map.put("2A81", "Anaerobic Heart Rate Lower Limit");
        map.put("2A82", "Anaerobic Heart Rate Upper Limit");
        map.put("2A83", "Anaerobic Threshold");
        map.put("2A84", "Aerobic Heart Rate Upper Limit");
        map.put("2A85", "Date of Birth");
        map.put("2A86", "Date of Threshold Assessment");
        map.put("2A87", "Email Address");
        map.put("2A88", "Fat Burn Heart Rate Lower Limit");
        map.put("2A89", "Fat Burn Heart Rate Upper Limit");
        map.put("2A8A", "First Name");
        map.put("2A8B", "Five Zone Heart Rate Limits");
        map.put("2A8C", "Gender");
        map.put("2A8D", "Heart Rate Max");
        map.put("2A8E", "Height");
        map.put("2A8F", "Hip Circumference");
        map.put("2A90", "Last Name");
        map.put("2A91", "Maximum Recommended Heart Rate");
        map.put("2A92", "Resting Heart Rate");
        map.put("2A93", "Sport Type for Aerobic and Anaerobic Thresholds");
        map.put("2A94", "Three Zone Heart Rate Limits");
        map.put("2A95", "Two Zone Heart Rate Limit");
        map.put("2A96", "VO2 Max");
        map.put("2A97", "Waist Circumference");
        map.put("2A98", "Weight");
        map.put("2A99", "Database Change Increment");
        map.put("2A9A", "User Index");
        map.put("2A9B", "Body Composition Feature");
        map.put("2A9C", "Body Composition Measurement");
        map.put("2A9D", "Weight Measurement");
        map.put("2A9E", "Weight Scale Feature");
        map.put("2A9F", "User Control Point");
        map.put("2AA0", "Magnetic Flux Density - 2D");
        map.put("2AA1", "Magnetic Flux Density - 3D");
        map.put("2AA2", "Language");
        map.put("2AA3", "Barometric Pressure Trend");
        map.put("2AA4", "Bond Management Control Point");
        map.put("2AA5", "Bond Management Features");
        map.put("2AA6", "Central Address Resolution");
        map.put("2AA7", "CGM Measurement");
        map.put("2AA8", "CGM Feature");
        map.put("2AA9", "CGM Status");
        map.put("2AAA", "CGM Session Start Time");
        map.put("2AAB", "CGM Session Run Time");
        map.put("2AAC", "CGM Specific Ops Control Point");
        map.put("2AAD", "Indoor Positioning Configuration");
        map.put("2AAE", "Latitude");
        map.put("2AAF", "Longitude");
        map.put("2AB0", "Local North Coordinate");
        map.put("2AB1", "Local East Coordinate");
        map.put("2AB2", "Floor Number");
        map.put("2AB3", "Altitude");
        map.put("2AB4", "Uncertainty");
        map.put("2AB5", "Location Name");
        map.put("2AB6", "URI");
        map.put("2AB7", "HTTP Headers");
        map.put("2AB8", "HTTP Status Code");
        map.put("2AB9", "HTTP Entity Body");
        map.put("2ABA", "HTTP Control Point");
        map.put("2ABB", "HTTPS Security");
        map.put("2ABC", "TDS Control Point");
        map.put("2ABD", "OTS Feature");
        map.put("2ABE", "Object Name");
        map.put("2ABF", "Object Type");
        map.put("2AC0", "Object Size");
        map.put("2AC1", "Object First-Created");
        map.put("2AC2", "Object Last-Modified");
        map.put("2AC3", "Object ID");
        map.put("2AC4", "Object Properties");
        map.put("2AC5", "Object Action Control Point");
        map.put("2AC6", "Object List Control Point");
        map.put("2AC7", "Object List Filter");
        map.put("2AC8", "Object Changed");
        map.put("2AC9", "Resolvable Private Address Only");
        map.put("2ACC", "Fitness Machine Feature");
        map.put("2ACD", "Treadmill Data");
        map.put("2ACE", "Cross Trainer Data");
        map.put("2ACF", "Step Climber Data");
        map.put("2AD0", "Stair Climber Data");
        map.put("2AD1", "Rower Data");
        map.put("2AD2", "Indoor Bike Data");
        map.put("2AD3", "Training Status");
        map.put("2AD4", "Supported Speed Range");
        map.put("2AD5", "Supported Inclination Range");
        map.put("2AD6", "Supported Resistance Level Range");
        map.put("2AD7", "Supported Heart Rate Range");
        map.put("2AD8", "Supported Power Range");
        map.put("2AD9", "Fitness Machine Control Point");
        map.put("2ADA", "Fitness Machine Status");

        // GATT Descriptors
        // https://www.bluetooth.com/specifications/gatt/descriptors
        map.put("2900", "Characteristic Extended Properties");
        map.put("2901", "Characteristic User Description");
        map.put("2902", "Client Characteristic Configuration");
        map.put("2903", "Server Characteristic Configuration");
        map.put("2904", "Characteristic Presentation Format");
        map.put("2905", "Characteristic Aggregate Format");
        map.put("2906", "Valid Range");
        map.put("2907", "External Report Reference");
        map.put("2908", "Report Reference");
        map.put("2909", "Number of Digitals");
        map.put("290A", "Value Trigger Setting");
        map.put("290B", "Environmental Sensing Configuration");
        map.put("290C", "Environmental Sensing Measurement");
        map.put("290D", "Environmental Sensing Trigger Setting");
        map.put("290E", "Time Trigger Setting");

        UUID_NAME_MAP = Collections.unmodifiableMap(map);
    }

    public static String getName(@NonNull String uuidString) {
        final String name;
        if (UUID_NAME_MAP.containsKey(uuidString)) {
            name = UUID_NAME_MAP.get(uuidString);
        } else {
            name = uuidString;
        }
        return name;
    }
}
