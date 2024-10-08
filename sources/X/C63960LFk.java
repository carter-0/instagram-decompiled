package X;

/* renamed from: X.LFk  reason: case insensitive filesystem */
public final class C63960LFk {
    public final C11020S5r A00;
    public final boolean A01;

    public C63960LFk(C11020S5r s5r, boolean z) {
        0qQ.A0B(s5r, 1);
        this.A00 = s5r;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63960LFk) {
                C63960LFk lFk = (C63960LFk) obj;
                if (!0qQ.A0K(this.A00, lFk.A00) || this.A01 != lFk.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StickerEditRequest(uploadEditInputData=");
        A1A.append(this.A00);
        A1A.append(", optimisticallySaveSticker=");
        return G9t.A1C(A1A, this.A01);
    }
}
