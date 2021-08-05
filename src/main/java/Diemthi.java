public class Diemthi {
    public static void main(String[] args) {
        float dtoan = 7F, dly = 7F, dhoa = 8F;
        int hstoan = 2, hsly = 1, hshoa = 1;
        float diemtb;

        diemtb = (dtoan * hstoan + dly * hsly + dhoa * hshoa)/4;

        System.out.println("Điểm toán = "  + dtoan + ", Hệ số = " + hstoan);
        System.out.println("Điểm lý = " + dly + ", Hệ số = " + hsly);
        System.out.println("Điểm hóa = " + dhoa + ", Hệ số = " + hshoa);
        System.out.println("Điểm trung bình ba môn = " + diemtb);
    }
}
