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
//        pic1.getHeight()
//        pic1.translate(x ,y); 이동
//        pic1.draw();

//        1 번답


        int j = 0;
        int k = 0;
        for (int i = 0; i < list.size(); i++) {

            Picture picture = list.get(i);
            k = picture.getWidth() + 30;

            picture.translate(j, 0);


            picture.draw();
            j += k;


        }

    }
}

////2번답
//
//    int j=0;
//
//for(int i=0;i<list.size();i++){
//
//        Picture picture=list.get(i);
//        j+=picture.getWidth();
//
//
//        }
//        System.out.println(j);
//
//        }
//        }
//
////        3번답
//
//
//        int j=0;
//        int k=0;
//        for(int i=0;i<list.size();i++){
//
//        Picture picture=list.get(i);
//        k=picture.getWidth();
//
//        picture.translate(j,0);
//
//
//        if(picture.getHeight()>k){
//        picture.draw();
//        j+=k;
//
//        }
//
//        }
//
//
////        4번답
//
//
//        int j=0;
//        int k=0;
//        int l=0;
//        for(int i=0;i<list.size();i++){
//
//        Picture picture=list.get(i);
//        k=picture.getWidth();
//
//        picture.translate(j,0);
//
//
//        if(picture.getHeight()>k){
//        picture.draw();
//        j+=k;
//        l++;
//        }
//        }
//        System.out.println(l);
//
//        }
//        }
//
//
////        5번답
//
//
//        int k=0;
//
//        for(int i=0;i<list.size();i++){
//
//        Picture picture=list.get(i);
//        k=picture.getWidth();
//
//
//        if(picture.getHeight()>k){
//        picture.draw();
//
//        break;
//
//        }
//
//
////        6번답
//
//        ArrayList<Picture>matches=new ArrayList<>();
//
//        for(int i=0;i<list.size();i++){
//
//        Picture picture=list.get(i);
//
//
//        if(picture.getHeight()>picture.getWidth()){
//        matches.add(picture);
//        }
//        }
//
//        }
//        }
//








