import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileGeneralInfo[] array = new FileGeneralInfo []{
            new FileDocument("j110-lab2-hiers.docx", "docx", 23212, 2),
            new FileStaticImgSave("spb-map.png", "image", 1703527, 1024, 3072),
            new FileMultimediaTimeSave("06-PrettyGirl.mp3", "audio", 7893454, "Eric Clapton, Pretty Girl", 328),
            new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325)
        };

        FileGeneralInfo.printAll(array, array.length+2);

        System.out.println();

        FileVideo[] arrayChild = new FileVideo []{
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
        };

        FileGeneralInfo.printAll(arrayChild, arrayChild.length+2);

//        Метод printAll напечатал мне массив дочернего типа, потому что дочерний тип унаследовал данный метод у своего
//        родителя.
    }
}
