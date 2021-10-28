public abstract class FileMultimedia extends FileGeneralInfo{
    private String nameFormat;
    private String nameContent;

    public void setNameFormat (String nameFormat) {
        try {
            if (nameFormat.trim().equals("")) throw new IncorrectInputNameException("нельзя вводить пустую строчку");
            this.nameFormat = nameFormat;
        } catch (IncorrectInputNameException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public String getNameFormat() {
        return nameFormat;
    }

    public void setNameContent (String nameContent) {
        try {
            if (nameContent.equals("")) throw new IncorrectInputNameException("нельзя вводить пустую строчку");
            this.nameContent = nameContent;
        } catch (IncorrectInputNameException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public String getNameContent() {
        return nameContent;
    }

    public abstract String printTimeCodeAndImgSize();

    @Override
    public String printDetails() {
        return getNameFormat() + ", " + getNameContent() + ", " + printTimeCodeAndImgSize();
    }
}
