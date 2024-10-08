package X;

/* renamed from: X.5nZ  reason: invalid class name and case insensitive filesystem */
public final class C295095nZ extends AnonymousClass0T0 {
    public boolean A00;
    public final C295085nY A01;
    public final C295065nW A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C295095nZ) {
                C295095nZ r5 = (C295095nZ) obj;
                if (!(0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A03, r5.A03) && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        return ((hashCode2 + i2) * 31) + this.A01.hashCode();
    }

    public C295095nZ(C295085nY r1, C295065nW r2, String str, String str2, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = z;
        this.A02 = r2;
        this.A05 = z2;
        this.A01 = r1;
    }
}
