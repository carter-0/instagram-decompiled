package X;

public final class NPJ extends AnonymousClass4AA {
    public final C67109MiT A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NPJ) {
                NPJ npj = (NPJ) obj;
                if (this.A01 != npj.A01 || !0qQ.A0K(this.A00, npj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, C51965G9l.A05(this.A01));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NPJ npj = (NPJ) obj;
        0qQ.A0B(npj, 0);
        return AnonymousClass7TF.A1S(this.A01 ? 1 : 0, npj.A01 ? 1 : 0);
    }

    public NPJ(C67109MiT miT, boolean z) {
        this.A01 = z;
        this.A00 = miT;
    }
}
