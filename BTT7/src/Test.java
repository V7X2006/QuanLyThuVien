import java.util.ArrayList;
public class Test {
    public static void main (String[] args){
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        Sach sach1 = new Sach("001","Toan","Alan",2025,2);
        Sach sach2 = new Sach("002","Ly","Becky",2026,3);
        Sach sach3 = new Sach("003","Hoa","Carl",2027,4);

        danhSachSach.add(sach1);
        danhSachSach.add(sach2);
        danhSachSach.add(sach3);

        System.out.println("Danh sach sach trong thu vien: ");
        for (Sach s : danhSachSach){
            s.hienThiThongTin();
        }
    }
}
