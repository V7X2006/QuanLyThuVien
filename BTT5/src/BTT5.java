
import java.util.Scanner;

public class BTT5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int luaChon;

        int tongSoLuong = 0;
        double tongGiaTri = 0;

        boolean timThay = false;

        do {
            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap thong tin sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: ");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {

                case 1: {
                    System.out.print("Nhap so luong sach can nhap: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    tongSoLuong = 0;
                    tongGiaTri = 0;

                    timThay = false;

                    for (int i = 1; i <= n; i++) {

                        System.out.println("\n--- Nhap sach thu " + i + " ---");

                        System.out.print("Nhap ma sach: ");
                        String maSach = sc.nextLine();

                        System.out.print("Nhap ten sach: ");
                        String tenSach = sc.nextLine();

                        System.out.print("Nhap so luong: ");
                        int soLuong = sc.nextInt();

                        System.out.print("Nhap don gia: ");
                        double donGia = sc.nextDouble();
                        sc.nextLine();

                        tongSoLuong += soLuong;
                        tongGiaTri += soLuong * donGia;

                        if (!timThay) {
                            System.out.print("Nhap ma sach can tim (Enter de bo qua): ");
                            String maCanTim = sc.nextLine();

                            if (!maCanTim.isEmpty()) {
                                if (maSach.equalsIgnoreCase(maCanTim)) {
                                    System.out.println("\n>>> TIM THAY SACH <<<");
                                    System.out.println("Ma sach: " + maSach);
                                    System.out.println("Ten sach: " + tenSach);
                                    System.out.println("So luong: " + soLuong);
                                    System.out.println("Don gia: " + donGia);

                                    timThay = true;
                                }
                            }
                        } else {
                        }
                    }

                    System.out.println("\nDa nhap xong " + n + " sach.");
                    break;
                }

                case 2: {
                    System.out.println("\n--- TONG KET SACH ---");
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                }

                case 3: {
                    System.out.println("\nChuc nang tim sach duoc thuc hien");
                    System.out.println("ngay trong qua trinh nhap sach o Bai 1.");
                    System.out.println("Hay chon Bai 1 de nhap sach va tim theo ma.");
                    break;
                }

                case 4: {
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                }

                default: {
                    System.out.println("Lua chon khong hop le. Vui long nhap lai!");
                }
            }

        } while (luaChon != 4);

        sc.close();
    }
}
