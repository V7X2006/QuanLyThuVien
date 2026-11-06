import java.util.ArrayList;
import java.util.Scanner;

public class BTT6 {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> danhSachSach = new ArrayList<>();

    public static void main(String[] args) {
        int luaChon;
        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong sach");
            System.out.println("7. Tinh tong gia tri sach");
            System.out.println("8. Chay thu Bai 1 (Mang int co dinh 5 phan tu)");
            System.out.println("9. Thoat");
            System.out.print("Nhap lua chon cua ban: ");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1: themSach(); break;
                case 2: hienThiSach(); break;
                case 3: timSach(); break;
                case 4: xoaSach(); break;
                case 5: suaSach(); break;
                case 6: tinhTongSoLuong(); break;
                case 7: tinhTongGiaTri(); break;
                case 8: thucHanhBai1(); break;
                case 9: System.out.println("Cam on ban da su dung chuong trinh!"); break;
                default: System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        } while (luaChon != 9);
    }

    public static void themSach() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        sc.nextLine();

        String thongTinSach = ma + "|" + ten + "|" + soLuong + "|" + donGia;
        danhSachSach.add(thongTinSach);
        System.out.println(">>> Them sach thanh cong!");
    }

    public static void hienThiSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach hien dang trong!");
            return;
        }
        System.out.println("\n--- DANH SACH SACH ---");
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] info = danhSachSach.get(i).split("\\|");
            System.out.println((i + 1) + ". Ma: " + info[0] + " | Ten: " + info[1]
                    + " | SL: " + info[2] + " | Gia: " + info[3]);
        }
    }

    public static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String maCanTim = sc.nextLine();
        boolean timThay = false;

        for (String sach : danhSachSach) {
            if (sach.startsWith(maCanTim + "|")) {
                System.out.println(">>> TIM THAY: " + sach.replace("|", " - "));
                timThay = true;
                break;
            }
        }
        if (!timThay) System.out.println("Khong tim thay sach co ma: " + maCanTim);
    }

    public static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String maCanXoa = sc.nextLine();

        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).startsWith(maCanXoa + "|")) {
                danhSachSach.remove(i);
                System.out.println(">>> Xoa sach thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach de xoa!");
    }

    public static void suaSach() {
        System.out.print("Nhap ma sach can sua thong tin: ");
        String maCanSua = sc.nextLine();

        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).startsWith(maCanSua + "|")) {
                System.out.println("Nhap thong tin moi cho sach nay:");
                System.out.print("Ten moi: ");
                String tenMoi = sc.nextLine();
                System.out.print("So luong moi: ");
                int slMoi = sc.nextInt();
                System.out.print("Don gia moi: ");
                double giaMoi = sc.nextDouble();
                sc.nextLine();

                String thongTinMoi = maCanSua + "|" + tenMoi + "|" + slMoi + "|" + giaMoi;
                danhSachSach.set(i, thongTinMoi);
                System.out.println(">>> Sua thong tin thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach de sua!");
    }

    public static void tinhTongSoLuong() {
        int tongSL = 0;
        for (String sach : danhSachSach) {
            String[] info = sach.split("\\|");
            tongSL += Integer.parseInt(info[2]); // info[2] là vị trí của số lượng
        }
        System.out.println(">>> Tong so luong sach trong thu vien: " + tongSL);
    }

    public static void tinhTongGiaTri() {
        double tongGiaTri = 0;
        for (String sach : danhSachSach) {
            String[] info = sach.split("\\|");
            int sl = Integer.parseInt(info[2]);
            double gia = Double.parseDouble(info[3]);
            tongGiaTri += (sl * gia);
        }
        System.out.println(">>> Tong gia tri sach trong thu vien: " + tongGiaTri);
    }

    public static void thucHanhBai1() {
        System.out.println("\n--- THUC HANH BAI 1: MANG CO DINH ---");
        int[] soLuong = new int[5];

        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhap so luong cuon sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }
        sc.nextLine();

        int tong = 0;
        int max = soLuong[0];

        System.out.print("So luong vua nhap: ");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print(soLuong[i] + " ");
            tong += soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }

        System.out.println("\n>>> Tong so luong: " + tong);
        System.out.println(">>> So luong lon nhat: " + max);
        System.out.println("-------------------------------------");
    }
}