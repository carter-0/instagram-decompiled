package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Mds  reason: case insensitive filesystem */
public final class C66859Mds extends AnonymousClass7FV implements AnonymousClass7FW {
    public final int A00;
    public final Drawable A01;
    public final C69465Nm9 A02;
    public final AnonymousClass7FE A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final AnonymousClass7FT A0C;
    public final C331537Rj A0D;
    public final String A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66859Mds(Drawable drawable, C69465Nm9 nm9, AnonymousClass7FT r4, AnonymousClass7FE r5, C331537Rj r6, Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3) {
        super(r4);
        0qQ.A0B(str2, 2);
        0qQ.A0B(drawable, 10);
        0qQ.A0B(str5, 14);
        this.A06 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A0D = r6;
        this.A0E = str4;
        this.A09 = z;
        this.A03 = r5;
        this.A04 = num;
        this.A02 = nm9;
        this.A01 = drawable;
        this.A00 = i;
        this.A0A = z2;
        this.A0B = z3;
        this.A05 = str5;
        this.A0C = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66859Mds) {
                C66859Mds mds = (C66859Mds) obj;
                if (!0qQ.A0K(this.A06, mds.A06) || !0qQ.A0K(this.A08, mds.A08) || !0qQ.A0K(this.A07, mds.A07) || this.A0D != mds.A0D || !0qQ.A0K(this.A0E, mds.A0E) || this.A09 != mds.A09 || !0qQ.A0K(this.A03, mds.A03) || this.A04 != mds.A04 || this.A02 != mds.A02 || !0qQ.A0K(this.A01, mds.A01) || this.A00 != mds.A00 || this.A0A != mds.A0A || this.A0B != mds.A0B || !0qQ.A0K(this.A05, mds.A05) || !0qQ.A0K(this.A0C, mds.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A082 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TE.A0O(this.A06));
        int i = 0;
        C331537Rj r1 = this.A0D;
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A07(r1, (A082 + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31));
        Integer num = this.A04;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "INITIATE_VIDEO";
                    break;
                case 2:
                    str = "JOIN_AUDIO";
                    break;
                case 3:
                    str = "JOIN_VIDEO";
                    break;
                default:
                    str = "INITIATE_AUDIO";
                    break;
            }
            i = C51966G9m.A04(str, intValue);
        }
        int A073 = AnonymousClass7TF.A07(this.A02, (A072 + i) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A07(this.A01, A073) + this.A00) * 31));
        return AnonymousClass7TE.A0N(this.A0C, (AnonymousClass7TF.A08(this.A05, A092) + 1231) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
