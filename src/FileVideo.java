public class FileVideo extends FileMultimediaTimeSave{
    private int height;
    private int width;

    public FileVideo (String name, String nameFormat, int size, String content, int timeOf, int height, int width) {
        super(name, nameFormat, size, content, timeOf);
        setHeight(height);
        setWidth(width);
    }


    public void setHeight(int height) {
        try {
            if (height <= 0)
                throw new IncorrectInputSizeException("размер не может быть отрицательным числом или ровняться нулю");
            this.height = height;
        } catch (IncorrectInputSizeException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public void setWidth(int width) {
        try {
            if (width <= 0)
                throw new IncorrectInputSizeException("размер не может быть отрицательным числом или ровняться нулю");
            this.width = width;
        } catch (IncorrectInputSizeException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String printTimeCodeAndImgSize(){
        String h, m, s;
        if (getHours()<10) h = "0" + getHours();
        else h = Integer.toString(getHours());

        if (getMinutes()<10) m = "0" + getMinutes();
        else m = Integer.toString(getMinutes());

        if (getSeconds()<10) s = "0" + getSeconds();
        else s = Integer.toString(getSeconds());

        return h + ":" + m + ":" + s + ", " + getHeight() + "x" + getWidth();
    }

}
