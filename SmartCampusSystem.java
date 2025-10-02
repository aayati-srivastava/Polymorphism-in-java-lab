// Base class
class SmartDevice {
    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    void status() {
        System.out.println(deviceName + " status: Active");
    }
}

// SmartClassroom subclass
class SmartClassroom extends SmartDevice {
    SmartClassroom(String deviceName) {
        super(deviceName);
    }

    void controlLighting() {
        System.out.println(deviceName + ": Controlling classroom lighting.");
    }

    void controlAC() {
        System.out.println(deviceName + ": Adjusting air conditioning.");
    }

    void controlProjector() {
        System.out.println(deviceName + ": Managing projector.");
    }
}

// SmartLab subclass
class SmartLab extends SmartDevice {
    SmartLab(String deviceName) {
        super(deviceName);
    }

    void manageEquipment() {
        System.out.println(deviceName + ": Managing lab equipment.");
    }

    void safetyCheck() {
        System.out.println(deviceName + ": Performing safety checks.");
    }
}

// SmartLibrary subclass
class SmartLibrary extends SmartDevice {
    SmartLibrary(String deviceName) {
        super(deviceName);
    }

    void trackOccupancy() {
        System.out.println(deviceName + ": Tracking occupancy.");
    }

    void checkBookAvailability() {
        System.out.println(deviceName + ": Checking book availability.");
    }
}

// Main class
public class SmartCampusSystem {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];

        devices[0] = new SmartClassroom("Classroom 101");
        devices[1] = new SmartLab("Lab A");
        devices[2] = new SmartLibrary("Central Library");

        System.out.println("🏫 Smart Campus Device Control 🏫\n");

        for (SmartDevice device : devices) {
            device.status();

            // Safe downcasting using instanceof
            if (device instanceof SmartClassroom) {
                SmartClassroom classroom = (SmartClassroom) device;
                classroom.controlLighting();
                classroom.controlAC();
                classroom.controlProjector();
            } 
            else if (device instanceof SmartLab) {
                SmartLab lab = (SmartLab) device;
                lab.manageEquipment();
                lab.safetyCheck();
            } 
            else if (device instanceof SmartLibrary) {
                SmartLibrary library = (SmartLibrary) device;
                library.trackOccupancy();
                library.checkBookAvailability();
            }

            System.out.println();
        }
    }
}
