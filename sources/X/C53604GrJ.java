package X;

/* renamed from: X.GrJ  reason: case insensitive filesystem */
public final class C53604GrJ extends AnonymousClass0T0 implements JNJ {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass62P A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53604GrJ) {
                C53604GrJ grJ = (C53604GrJ) obj;
                if (!0qQ.A0K(this.A02, grJ.A02) || !0qQ.A0K(this.A06, grJ.A06) || !0qQ.A0K(this.A03, grJ.A03) || !0qQ.A0K(this.A05, grJ.A05) || !0qQ.A0K(this.A07, grJ.A07) || !0qQ.A0K(this.A04, grJ.A04) || this.A01 != grJ.A01 || !0qQ.A0K(this.A08, grJ.A08) || this.A00 != grJ.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A07, ((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A05)) * 31);
        return AnonymousClass7TF.A07(this.A08, (AnonymousClass7TF.A08(this.A04, A082) + this.A01) * 31) + this.A00;
    }

    public C53604GrJ(String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass62P r8, int i, int i2) {
        AnonymousClass7TG.A1S(str5, str6);
        0qQ.A0B(r8, 8);
        this.A02 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A01 = i;
        this.A08 = r8;
        this.A00 = i2;
    }
}
