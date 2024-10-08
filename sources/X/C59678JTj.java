package X;

/* renamed from: X.JTj  reason: case insensitive filesystem */
public final class C59678JTj extends AnonymousClass0T0 implements MQ0 {
    public final int A00;
    public final Object A01;

    public static C59678JTj A00(Object obj) {
        return new C59678JTj(obj, 0);
    }

    public static boolean A02(Object obj) {
        return A01(0, obj);
    }

    public static boolean A03(Object obj) {
        return A01(1, obj);
    }

    public C59678JTj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C59678JTj) || ((C59678JTj) obj).A00 != i) {
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
        if (!A01(i, obj) || !0qQ.A0K(this.A01, ((C59678JTj) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A01);
    }
}
