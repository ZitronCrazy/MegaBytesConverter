public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int xx = kiloBytes;
        int yy = kiloBytes / 1024;
        int zz = kiloBytes % 1024;

        if (kiloBytes >= 0) {
            System.out.println(xx + " KB = " + yy + " MB and " + zz + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
