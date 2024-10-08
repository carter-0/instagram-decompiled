package X;

/* renamed from: X.KaJ  reason: case insensitive filesystem */
public final class C62111KaJ extends C62871Knl {
    public final C266444Yx A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62111KaJ) {
                C62111KaJ kaJ = (C62111KaJ) obj;
                if (!0qQ.A0K(this.A00, kaJ.A00) || !0qQ.A0K(this.A01, kaJ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C62111KaJ(C266444Yx r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
