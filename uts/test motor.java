public class test_motor {
    public static void main(String[] args) {
        motor_listrik m1 = new motor_listrik("Polytron", 2023, 20000);
        motor_bensin m2 = new motor_bensin("Honda", 2024, "Matic", 160);
        motor_bensin m3 = new motor_bensin("Honda", "Manual", 110);

        m1.getInfo();
        m2.getInfo();
        m3.getInfo();
    }
}