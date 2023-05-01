public class UsingMain {

    public static void main(String[] args) {
        int choice;
        VehicleList vl = new VehicleList();
        String check = null;
        int count = 1;

        try {
            do {
                Utils.printMenu();
                choice = Utils.getInt("Enter your choice");
                switch (choice) {
                    case 1 -> vl.readFile();
                    case 2 -> {
                        vl.add();
                        count++;
                        System.out.println(" ");
                    }
                    case 3 -> {
                        vl.update();
                        count++;
                        System.out.println(" ");
                    }
                    case 4 -> {
                        vl.delete();
                        count++;
                        System.out.println(" ");
                    }
                    case 5 -> {
                        vl.search();
                        System.out.println(" ");
                    }
                    case 6 -> {
                        vl.output();
                        System.out.println(" ");
                    }
                    case 7 -> {
                        vl.writeFile();
                        count = 1;
                        System.out.println(" ");
                    }
                }
            }
            while (choice >= 8 || choice <= 0);
            {
                if (count != 1){
                    check = Utils.getYesNo("You have not saved it! Do you want to save it to a file (Yes/No): ");
                    if (check.equalsIgnoreCase("Yeap")){
                        vl.writeFile();
                        System.out.println("---------End Program-------");
                    }else {
                        System.out.println("---------End Program-------");
                    }
                }else {
                    System.out.println("---------End Program-------");
                }
            }
        }catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
