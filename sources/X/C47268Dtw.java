package X;

/* renamed from: X.Dtw  reason: case insensitive filesystem */
public final class C47268Dtw extends AnonymousClass0T0 implements G5E {
    public final int A00 = 1;
    public final Object A01;

    public C47268Dtw(C21251XQw xQw) {
        this.A01 = xQw;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C47268Dtw) || ((C47268Dtw) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj) || this.A01 != ((C47268Dtw) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return this.A01.hashCode();
        }
        Integer num = (Integer) this.A01;
        return C21345XXm.A00(num).hashCode() + num.intValue();
    }

    public C47268Dtw(Integer num) {
        this.A01 = num;
    }
}
