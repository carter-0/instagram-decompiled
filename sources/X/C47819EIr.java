package X;

/* renamed from: X.EIr  reason: case insensitive filesystem */
public final class C47819EIr extends C48169EaB {
    public final int A00;
    public final C266444Yx A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47819EIr) {
                C47819EIr eIr = (C47819EIr) obj;
                if (!(this.A00 == eIr.A00 && this.A03 == eIr.A03 && this.A05 == eIr.A05 && this.A06 == eIr.A06 && 0qQ.A0K(this.A01, eIr.A01) && this.A04 == eIr.A04 && 0qQ.A0K(this.A02, eIr.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A03, this.A00 * 31);
        int A002 = C54732HQn.A00();
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A05, (A09 + A002) * 31) + A002) * 31))) + AnonymousClass7TG.A0E(this.A02);
    }

    public C47819EIr(C266444Yx r1, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A03 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = r1;
        this.A04 = z4;
        this.A02 = str;
    }
}
