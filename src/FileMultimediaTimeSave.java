public class FileMultimediaTimeSave extends FileMultimedia{
    private int timeOf;

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
        return (int) (getTimeOf()-(getHours()*60*60)/60);
    }

    public int getSeconds () {
        return (int) (getTimeOf()-(getHours()*60*60)-(getMinutes()*60));
    }

    @Override
    public String printTimeCodeAndImgSize(){
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }
}
