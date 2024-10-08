package X;

import java.util.List;

/* renamed from: X.GmH  reason: case insensitive filesystem */
public final class C53331GmH extends AnonymousClass0T0 {
    public final float A00;
    public final AnonymousClass9IB A01;
    public final AnonymousClass9IQ A02;
    public final AnonymousClass9J0 A03;
    public final C61059Jvx A04;
    public final C246953fX A05;
    public final C245853da A06;
    public final AnonymousClass50X A07;
    public final C262744Fv A08;
    public final C247083fk A09;
    public final AnonymousClass3TO A0A;
    public final Integer A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final String A0H;
    public final String A0I;

    public C53331GmH(AnonymousClass9IB r2, AnonymousClass9IQ r3, AnonymousClass9J0 r4, C61059Jvx jvx, C246953fX r6, C245853da r7, AnonymousClass50X r8, C262744Fv r9, C247083fk r10, AnonymousClass3TO r11, Integer num, String str, String str2, List list, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        C51969G9p.A1P(num, 3, r11);
        0qQ.A0B(r7, 15);
        this.A0I = str;
        this.A0H = str2;
        this.A0B = num;
        this.A00 = f;
        this.A05 = r6;
        this.A01 = r2;
        this.A0C = list;
        this.A02 = r3;
        this.A0D = z;
        this.A08 = r9;
        this.A07 = r8;
        this.A09 = r10;
        this.A03 = r4;
        this.A0A = r11;
        this.A06 = r7;
        this.A0E = z2;
        this.A04 = jvx;
        this.A0F = z3;
        this.A0G = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53331GmH) {
                C53331GmH gmH = (C53331GmH) obj;
                if (!0qQ.A0K(this.A0I, gmH.A0I) || !0qQ.A0K(this.A0H, gmH.A0H) || this.A0B != gmH.A0B || Float.compare(this.A00, gmH.A00) != 0 || !0qQ.A0K(this.A05, gmH.A05) || !0qQ.A0K(this.A01, gmH.A01) || !0qQ.A0K(this.A0C, gmH.A0C) || !0qQ.A0K(this.A02, gmH.A02) || this.A0D != gmH.A0D || !0qQ.A0K(this.A08, gmH.A08) || !0qQ.A0K(this.A07, gmH.A07) || !0qQ.A0K(this.A09, gmH.A09) || !0qQ.A0K(this.A03, gmH.A03) || this.A0A != gmH.A0A || this.A06 != gmH.A06 || this.A0E != gmH.A0E || !0qQ.A0K(this.A04, gmH.A04) || this.A0F != gmH.A0F || this.A0G != gmH.A0G) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0O = (AnonymousClass7TE.A0O(this.A0I) + AnonymousClass7TG.A0E(this.A0H)) * 31;
        int intValue = this.A0B.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "ROUNDED_BORDER";
        }
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A0C, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A00(C51971G9r.A0F(str, intValue, A0O), this.A00)))));
        return DbS.A06(this.A0G, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A09(this.A0D, A072) + AnonymousClass7TE.A0L(this.A08)) * 31)))))))));
    }
}
