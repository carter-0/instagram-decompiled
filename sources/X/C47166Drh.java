package X;

/* renamed from: X.Drh  reason: case insensitive filesystem */
public final class C47166Drh extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C266444Yx A04;
    public final C266444Yx A05;
    public final C266444Yx A06;
    public final C266444Yx A07;
    public final C266444Yx A08;
    public final C266444Yx A09;
    public final C51862G4v A0A;
    public final C51862G4v A0B;
    public final C51862G4v A0C;

    public /* synthetic */ C47166Drh(C266444Yx r3, C266444Yx r4, C266444Yx r5, C266444Yx r6, C266444Yx r7, C51862G4v g4v, C51862G4v g4v2, C51862G4v g4v3, int i, int i2, int i3, int i4) {
        GKO A0Q = DbS.A0Q(new Object[0], 2131955053);
        this.A03 = i;
        this.A06 = r3;
        this.A00 = i2;
        this.A07 = r4;
        this.A0A = g4v;
        this.A01 = i3;
        this.A08 = r5;
        this.A0B = g4v2;
        this.A02 = i4;
        this.A09 = r6;
        this.A0C = g4v3;
        this.A05 = A0Q;
        this.A04 = r7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47166Drh) {
                C47166Drh drh = (C47166Drh) obj;
                if (this.A03 != drh.A03 || !0qQ.A0K(this.A06, drh.A06) || this.A00 != drh.A00 || !0qQ.A0K(this.A07, drh.A07) || !0qQ.A0K(this.A0A, drh.A0A) || this.A01 != drh.A01 || !0qQ.A0K(this.A08, drh.A08) || !0qQ.A0K(this.A0B, drh.A0B) || this.A02 != drh.A02 || !0qQ.A0K(this.A09, drh.A09) || !0qQ.A0K(this.A0C, drh.A0C) || !0qQ.A0K(this.A05, drh.A05) || !0qQ.A0K(this.A04, drh.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A03 * 31;
        int A072 = AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A07(this.A06, i) + this.A00) * 31);
        int A073 = AnonymousClass7TF.A07(this.A08, (AnonymousClass7TF.A07(this.A0A, A072) + this.A01) * 31);
        return AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A0C, AnonymousClass7TF.A07(this.A09, (AnonymousClass7TF.A07(this.A0B, A073) + this.A02) * 31))) + AnonymousClass7TG.A0C(this.A04);
    }
}
