package X;

/* renamed from: X.Gpf  reason: case insensitive filesystem */
public final class C53509Gpf extends AnonymousClass0T0 implements C59550JNw {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53509Gpf) {
                C53509Gpf gpf = (C53509Gpf) obj;
                if (!0qQ.A0K(this.A00, gpf.A00) || !0qQ.A0K(this.A01, gpf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ CharSequence Bfa() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C53509Gpf(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public static C53509Gpf A00(C286575Wy r1, String str, int i) {
        return new C53509Gpf(str, C288035bG.A00(r1, i));
    }
}
