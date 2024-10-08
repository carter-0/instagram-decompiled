package X;

public final class SIT {
    public static final SIT A03;
    public int A00 = 0;
    public int[] A01 = new int[8];
    public Object[] A02 = new Object[8];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SIT, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A00 = 0;
        obj.A01 = new int[0];
        obj.A02 = new Object[0];
        A03 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof SIT)) {
                SIT sit = (SIT) obj;
                int i = this.A00;
                if (i == sit.A00) {
                    int[] iArr = this.A01;
                    int[] iArr2 = sit.A01;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A02;
                            Object[] objArr2 = sit.A02;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        int A012 = C66583MXo.A01(i);
        int[] iArr = this.A01;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (A012 + i2) * 31;
        Object[] objArr = this.A02;
        int i5 = 17;
        for (int i6 = 0; i6 < i; i6++) {
            i5 = AnonymousClass7TE.A0N(objArr[i6], i5 * 31);
        }
        return i4 + i5;
    }
}
