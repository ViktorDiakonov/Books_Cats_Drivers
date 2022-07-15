package drive;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // здесь выводим в консоль данные
        List<Driver> driverList = new ArrayList<>();
        System.out.println("Общий список:" + "\n" + generalListOfDrivers() + "\n\n" +
                "Список людей, кому разрешено водить авто:" + "\n" + permissionToDrive(driverList));
    }

    // здесь создаю общий список водителей с произвольными данными
    public static List<Driver> generalListOfDrivers() {
        List<Driver> list = new ArrayList<>();
        list.add(new Driver("Viktor", true, 26, 480));
        list.add(new Driver("Elena", false, 49, 50));
        list.add(new Driver("Oksana", false, 32, 458));
        list.add(new Driver("Ivan", true, 56, 390));
        list.add(new Driver("Vladimer", true, 38, 157));
        return list;
    }

    // здесь проверяются условия на возможность управлять автомобилем
    public static List<Driver> permissionToDrive(List<Driver> list) {
        for (Driver driver : generalListOfDrivers()) {
            if (driver.driversLicense() && (driver.getAge() > 18) & driver.getNoFinesDays() >= 365) {
                list.add(driver);
            }
        }
        return list;
    }
}