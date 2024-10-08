package X;

/* renamed from: X.HHt  reason: case insensitive filesystem */
public final class C54532HHt extends HQ1 {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54532HHt) {
                C54532HHt hHt = (C54532HHt) obj;
                if (!(this.A01 == hHt.A01 && this.A00 == hHt.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A01) + this.A00;
    }

    public C54532HHt(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EmuFlashMediaRendered(isMemu=");
        A1A.append(this.A01);
        A1A.append(", instanceKey=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
