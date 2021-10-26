public abstract class FileStaticImg extends FileGeneralInfo{
    private String nameFormat;

    public void setNameFormat (String nameFormat) {
        try {
            if (nameFormat.equals("")) throw new IncorrectInputNameException("нельзя вводить пустую строчку");
            this.nameFormat = nameFormat;
        } catch (IncorrectInputNameException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public String getNameFormat() {
        return nameFormat;
    }

    public abstract String printImgSize ();

    @Override
    public String printDetails() {
        return getNameFormat() + ", " + printImgSize();
    }

}
