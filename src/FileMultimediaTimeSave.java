public class FileMultimediaTimeSave extends FileMultimedia{
    private int timeOf;

    public FileMultimediaTimeSave (String name, String nameFormat, int size, String content, int timeOf) {
        setName(name);
        setNameFormat(nameFormat);
        setSize(size);
        setNameContent(content);
        setTimeOf(timeOf);
    }

    public void setTimeOf(int timeOf) {
        try {
            if (timeOf <= 0)
                throw new IncorrectInputTimeException("длительность файла не может быть отрицательным числом или ровняться нулю");
            this.timeOf = timeOf;
        } catch (IncorrectInputTimeException e) {
            System.out.println("Ошибка в том, что " + e.getMessage());
        }
    }

    public int getTimeOf() {
        return timeOf;
    }

    public int getHours () {
        return (int) getTimeOf()/60/60;
    }

    public int getMinutes () {
        return (int) (getTimeOf()-(double)((getHours()*60*60)))/60;
    }

    public int getSeconds () {
        return (int) (getTimeOf()-(getHours()*60*60)-(getMinutes()*60));
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

        return h + ":" + m + ":" + s;
    }
}
