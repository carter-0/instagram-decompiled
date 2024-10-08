package X;

public final class TA8 implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TA8 ta8 = (TA8) obj;
        0qQ.A0B(ta8, 0);
        int i = this.A00 - ta8.A00;
        if (i == 0) {
            return this.A01 - ta8.A01;
        }
        return i;
    }

    public TA8(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }
}
