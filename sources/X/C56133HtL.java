package X;

/* renamed from: X.HtL  reason: case insensitive filesystem */
public final class C56133HtL {
    public final C293795lM A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56133HtL) {
                C56133HtL htL = (C56133HtL) obj;
                if (!0qQ.A0K(this.A01, htL.A01) || !0qQ.A0K(this.A00, htL.A00) || this.A03 != htL.A03 || this.A02 != htL.A02 || this.A04 != htL.A04 || !0qQ.A0K(this.A05, htL.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01))))) + AnonymousClass7TG.A0E(this.A05);
    }

    public C56133HtL(C293795lM r1, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A00 = r1;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A05 = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PendingStateUpdate(key=");
        A1A.append(this.A01);
        A1A.append(", updater=");
        A1A.append(this.A00);
        A1A.append(", isLayoutState=");
        A1A.append(this.A03);
        A1A.append(", isAsync=");
        A1A.append(this.A02);
        A1A.append(", isLazy=");
        A1A.append(this.A04);
        A1A.append(", attribution=");
        return C51975G9x.A0i(this.A05, A1A);
    }
}
