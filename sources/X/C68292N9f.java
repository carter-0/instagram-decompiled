package X;

/* renamed from: X.N9f  reason: case insensitive filesystem */
public final class C68292N9f extends AnonymousClass0T0 implements C74270Pry {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C68292N9f() {
        this(true, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68292N9f) {
                C68292N9f n9f = (C68292N9f) obj;
                if (!(this.A00 == n9f.A00 && this.A01 == n9f.A01 && this.A03 == n9f.A03 && this.A02 == n9f.A02 && this.A04 == n9f.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A00)))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallScreenViewModel(detectCallTouchInteractions=");
        A1A.append(this.A00);
        A1A.append(", detectCoWatchTouchInteractions=");
        A1A.append(this.A01);
        A1A.append(", detectRootTouchInteractions=");
        A1A.append(this.A03);
        A1A.append(", detectCoWatchVerticalSwipeInterations=");
        A1A.append(this.A02);
        A1A.append(", shouldLogPinchToZoomEndEvent=");
        return G9t.A1C(A1A, this.A04);
    }

    public C68292N9f(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A02 = z4;
        this.A04 = z5;
    }
}
