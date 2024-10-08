package X;

/* renamed from: X.Gpe  reason: case insensitive filesystem */
public final class C53508Gpe extends AnonymousClass0T0 implements C59550JNw {
    public final int A00;
    public final String A01;

    public static C53508Gpe A00(C286575Wy r3, int i) {
        return new C53508Gpe(C288035bG.A00(r3, i), 0);
    }

    public C53508Gpe(String str, int i) {
        this.A00 = i;
        0qQ.A0B(str, 1);
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ CharSequence Bfa() {
        return this.A01;
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
        if (!(obj instanceof C53508Gpe)) {
            return false;
        }
        C53508Gpe gpe = (C53508Gpe) obj;
        if (gpe.A00 != i || !0qQ.A0K(this.A01, gpe.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
