import java.util.Arrays;

public abstract class FileGeneralInfo {
    private String name;
    private int size;

    public void setName(String name) {
        try {
            if (name.trim().equals("")) throw new IncorrectInputNameException("нельзя вводить пустую строчку");
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
        String[][] array = new String[count][5];
        array[0][0] = "File name ";
        array[0][1] = "|";
        array[0][2] = " Size ";
        array[0][3] = "|";
        array[0][4] = " Details";


        for (int i = 1; i< array.length; i++) {
            array[i][0] = file[i-1].getName();
            array[i][1] = "|";
            array[i][2] = Integer.toString(file[i-1].getSize());
            array[i][3] = "|";
            array[i][4] = file[i-1].printDetails();
        }

        int indexMaxName = array[1][0].length();
        for (int i = 1; i< array.length; i++) {
            if (indexMaxName < array[i][0].length()) indexMaxName = array[i][0].length();
        }

        for (int j=0; j<((indexMaxName/2)-(array[0][0].length())/2); j++)
            array[0][0] = " " + array[0][0];

        for (int j=array[0][0].length(); j<indexMaxName; j++)
        array[0][0] += " ";

        for (int i = 1; i< array.length; i++) {
            if (array[i][0].length() < indexMaxName)
            {
                for (int j=array[i][0].length(); j<indexMaxName; j++) {
                    array[i][0] += " ";
                }
            }
        }

        int indexMaxSize = array[1][2].length();
        for (int i = 1; i< array.length; i++) {
            if (indexMaxSize < array[i][2].length()) indexMaxSize = array[i][2].length();
        }

        for (int i = 1; i< array.length; i++) {
            if (array[i][2].length() < indexMaxSize)
            {
                int lengthOfArraySecoundColumn = array[i][2].length();
                for (int j=0; j<indexMaxSize-lengthOfArraySecoundColumn; j++) {
                    array[i][2] = " " + array[i][2];
                }
            }
        }

        for (int j=0; j<((indexMaxSize/2)-(array[0][2].length())/2); j++)
            array[0][2] = " " + array[0][2];

        for (int j=array[0][2].length(); j<indexMaxSize; j++)
            array[0][2] += " ";

        for (int i = 0; i< array.length; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
