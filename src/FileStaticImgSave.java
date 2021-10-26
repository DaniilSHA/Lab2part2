public class FileStaticImgSave extends FileStaticImg{
    private int height;
    private int width;

    public FileStaticImgSave (String name, String nameFormat, int size, int height, int width) {
        setName(name);
        setNameFormat(nameFormat);
        setSize(size);
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
    public String printImgSize() {
        return getHeight() + "x" + getWidth();
    }
}
