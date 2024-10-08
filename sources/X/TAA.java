package X;

public final class TAA implements Comparable {
    public int A00;
    public final float[] A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TAA taa = (TAA) obj;
        0qQ.A0B(taa, 0);
        return this.A00 - taa.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TAA) || ((TAA) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        float[] fArr = this.A01;
        StringBuilder A0l = C51975G9x.A0l(fArr);
        A0l.append("");
        int i2 = 0;
        int i3 = 0;
        do {
            float f = fArr[i2];
            i3++;
            if (i3 > 1) {
                A0l.append(" ");
            }
            A0l.append(String.valueOf(f));
            i2++;
        } while (i2 < 4);
        A0l.append("");
        return 002.A0H(DbT.A10(A0l), '_', i);
    }

    public TAA(int i, float[] fArr) {
        this.A00 = i;
        this.A01 = fArr;
    }
}
