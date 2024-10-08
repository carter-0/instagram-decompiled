package X;

/* renamed from: X.Jxn  reason: case insensitive filesystem */
public final class C61137Jxn extends AnonymousClass0T0 implements C66383MPp {
    public final int A00;
    public final Object A01;

    public C61137Jxn(C53379Gn9 gn9, int i) {
        this.A00 = i;
        this.A01 = gn9;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61137Jxn) || ((C61137Jxn) obj).A00 != i) {
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
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((C61137Jxn) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
