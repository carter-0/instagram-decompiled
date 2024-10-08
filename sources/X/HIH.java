package X;

public final class HIH extends HQ3 {
    public final C56146HtY A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HIH) {
                HIH hih = (HIH) obj;
                if (!0qQ.A0K(this.A00, hih.A00) || this.A01 != hih.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public HIH(C56146HtY htY, boolean z) {
        this.A00 = htY;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Edit(selectedMedia=");
        A1A.append(this.A00);
        A1A.append(", primaryActionIsSave=");
        return G9t.A1C(A1A, this.A01);
    }
}
