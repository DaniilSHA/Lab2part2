import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileGeneralInfo[] array = new FileGeneralInfo []{
            new FileDocument("j110-lab2-hiers.docx", "docx", 23212, 2),
            new FileStaticImgSave("spb-map.png", "image", 1703527, 1024, 3072),
            new FileMultimediaTimeSave("06-PrettyGirl.mp3", "audio", 7893454, "Eric Clapton, Pretty Girl", 328),
            new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325)
        };

        FileGeneralInfo.printAll(array, array.length+1);

        System.out.println();

        FileGeneralInfo[] arrayChild = new FileGeneralInfo []{
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
                new FileVideo("BackToTheFuture1.avi", "video", 1470984192, "Back to the future I, 1985", 6488, 640, 325),
        };

        FileGeneralInfo.printAll(arrayChild, arrayChild.length+1);

//        Если я правильно понял, этот метод подходит для массива из объектов дочерних типов, потому что
//        во всех дочерних класссах, во-первых, всегда содержаться поля "имя файла" и " размер", а, во-вторых,
//        я реализовал в каждом дочерним классе метод printDetails (с помощью @Override) таким образом, чтобы
//        он выводил информацию по типу файла согласно задания. Таким образом, я могу использовать данный метод
//        для любого класса (типа файла) ведь у меня есть реализация на все возможные дочернии классы.
    }
}
