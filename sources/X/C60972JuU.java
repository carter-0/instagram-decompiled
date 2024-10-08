package X;

import java.util.Arrays;

/* renamed from: X.JuU  reason: case insensitive filesystem */
public final class C60972JuU extends AnonymousClass0T0 {
    public final long A00;
    public final C60948Ju6 A01;
    public final AnonymousClass4EC A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final byte[] A0A;

    public C60972JuU(C60948Ju6 ju6, AnonymousClass4EC r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, byte[] bArr, long j) {
        0qQ.A0B(str, 1);
        C51974G9v.A1S(str2, str3, str4, str5, str6);
        AnonymousClass7TF.A1F(str7, 7, r3);
        0qQ.A0B(bArr, 11);
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A09 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A02 = r3;
        this.A01 = ju6;
        this.A00 = j;
        this.A0A = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60972JuU) {
                C60972JuU juU = (C60972JuU) obj;
                if (!0qQ.A0K(this.A07, juU.A07) || !0qQ.A0K(this.A08, juU.A08) || !0qQ.A0K(this.A05, juU.A05) || !0qQ.A0K(this.A06, juU.A06) || !0qQ.A0K(this.A09, juU.A09) || !0qQ.A0K(this.A03, juU.A03) || !0qQ.A0K(this.A04, juU.A04) || this.A02 != juU.A02 || !0qQ.A0K(this.A01, juU.A01) || this.A00 != juU.A00 || !0qQ.A0K(this.A0A, juU.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51972G9s.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A08, AnonymousClass7TE.A0O(this.A07)))))))))) + Arrays.hashCode(this.A0A);
    }
}
