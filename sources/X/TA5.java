package X;

public final class TA5 implements Comparable {
    public final int A00;
    public final C10853RzD A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.A00;
        int i2 = ((TA5) obj).A00;
        if (i == i2) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }

    public TA5(C10853RzD rzD, int i) {
        this.A00 = i;
        this.A01 = rzD;
    }
}
