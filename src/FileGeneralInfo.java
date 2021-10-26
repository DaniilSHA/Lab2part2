import java.util.Arrays;

public abstract class FileGeneralInfo {
    private String name;
    private int size;

    public void setName(String name) {
        try {
            if (name.equals("")) throw new IncorrectInputNameException("нельзя вводить пустую строчку");
            this.name = name;
        } catch (IncorrectInputNameException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public void setSize(int size) {
        try {
            if (size <= 0)
                throw new IncorrectInputSizeException("размер не может быть отрицательным числом или ровняться нулю");
            this.size = size;
        } catch (IncorrectInputSizeException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public abstract String printDetails();

    public static void printAll(FileGeneralInfo[] file, int count){
        String[][] array = new String[count][3];
        array[0][0] = "File name |";
        array[0][1] = " Size |";
        array[0][2] = " Details";

        for (int i = 1; i< array.length; i++) {
            array[i][0] = "|" + file[i-1].getName();
            array[i][1] = "|" + file[i-1].getSize();
            array[i][2] = "|" + file[i-1].printDetails();
        }

        for (int i = 0; i< array.length; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }

}
