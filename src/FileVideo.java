public class FileVideo extends FileMultimediaTimeSave{
    private int height;
    private int width;

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
        return getHours() + ":" + getMinutes() + ":" + getSeconds() + ", " + getHeight() + "x" + getWidth();
    }

}
