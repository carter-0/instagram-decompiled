package X;

/* renamed from: X.JvG  reason: case insensitive filesystem */
public final class C61016JvG extends AnonymousClass0T0 {
    public boolean A00;
    public final long A01;
    public final C266444Yx A02;
    public final C266444Yx A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61016JvG) {
                C61016JvG jvG = (C61016JvG) obj;
                if (!(this.A01 == jvG.A01 && 0qQ.A0K(this.A03, jvG.A03) && 0qQ.A0K(this.A02, jvG.A02) && this.A00 == jvG.A00 && this.A04 == jvG.A04 && this.A05 == jvG.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, C51975G9x.A03(this.A01))))));
    }

    public C61016JvG(C266444Yx r1, C266444Yx r2, long j, boolean z, boolean z2, boolean z3) {
        this.A01 = j;
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DealItem(id=");
        A1A.append(this.A01);
        A1A.append(", title=");
        A1A.append(this.A03);
        A1A.append(", subtitle=");
        A1A.append(this.A02);
        A1A.append(", isSelected=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(2025));
        A1A.append(this.A04);
        A1A.append(", showReelsBoostTooltip=");
        return G9t.A1C(A1A, this.A05);
    }

    public C61016JvG() {
        this(JUH.A00(""), JUH.A00(""), -1, false, true, false);
    }
}
