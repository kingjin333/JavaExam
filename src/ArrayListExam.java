import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {

        Picture pic1 = new Picture("degas1.jpg");
        Picture pic2 = new Picture("gaugin1.jpg");
        Picture pic3 = new Picture("monet1.jpg");
        Picture pic4 = new Picture("monet2.jpg");
        Picture pic5 = new Picture("renoir1.jpg");

        ArrayList<Picture> list = new ArrayList<>();
        list.add(pic1);
        list.add(pic2);
        list.add(pic3);
        list.add(pic4);
        list.add(pic5);

//        pic1.getMaxX() : 오른쪽 끝 x좌표
//        pic1.getWidth() : 가로길이
//        pic1.translate(x ,y); 이동
//        pic1.draw();
        for (int i = 0; i < list.size(); i++) {
            Picture picture = list.get(i);
            picture.draw();

        }

    }
}
