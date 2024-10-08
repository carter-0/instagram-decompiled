package X;

/* renamed from: X.DrS  reason: case insensitive filesystem */
public final class C47151DrS extends AnonymousClass0T0 {
    public final int A00;
    public final C266444Yx A01;
    public final C266444Yx A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47151DrS) {
                C47151DrS drS = (C47151DrS) obj;
                if (!0qQ.A0K(this.A02, drS.A02) || !0qQ.A0K(this.A01, drS.A01) || this.A00 != drS.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)) + this.A00;
    }

    public C47151DrS(C266444Yx r1, C266444Yx r2, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = i;
    }
}
