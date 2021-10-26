public class FileDocument extends FileGeneralInfo{
    private String nameFormat;
    private int pages;

    public void setNameFormat (String nameFormat) {
        try {
            if (nameFormat.equals("")) throw new IncorrectInputNameException("нельзя вводить пустую строчку");
            this.nameFormat = nameFormat;
        } catch (IncorrectInputNameException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public void setPages(int pages) {
        try {
            if (pages <= 0)
                throw new IncorrectInputPageException("количество страниц не может быть отрицательным числом или ровняться нулю");
            this.pages = pages;
        } catch (IncorrectInputPageException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public int getPages() {
        return pages;
    }

    public String getNameFormat() {
        return nameFormat;
    }

    @Override
    public String printDetails() {
        return getNameFormat() + ", " + getPages() + "pages";
    }

}

