package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHc  reason: case insensitive filesystem */
public final class C42099BHc extends AnonymousClass0T0 implements DV2 {
    public final DSB A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;

    public final C42099BHc FC0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42099BHc) {
                C42099BHc bHc = (C42099BHc) obj;
                if (!0qQ.A0K(this.A0D, bHc.A0D) || !0qQ.A0K(this.A01, bHc.A01) || !0qQ.A0K(this.A02, bHc.A02) || !0qQ.A0K(this.A09, bHc.A09) || !0qQ.A0K(this.A0A, bHc.A0A) || !0qQ.A0K(this.A0B, bHc.A0B) || !0qQ.A0K(this.A0C, bHc.A0C) || !0qQ.A0K(this.A03, bHc.A03) || !0qQ.A0K(this.A04, bHc.A04) || !0qQ.A0K(this.A00, bHc.A00) || !0qQ.A0K(this.A05, bHc.A05) || !0qQ.A0K(this.A06, bHc.A06) || !0qQ.A0K(this.A07, bHc.A07) || !0qQ.A0K(this.A08, bHc.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ad0() {
        return this.A0D;
    }

    public final Float B1i() {
        return this.A01;
    }

    public final Float BCt() {
        return this.A02;
    }

    public final Float Bof() {
        return this.A03;
    }

    public final Float Byt() {
        return this.A04;
    }

    public final DSB CGS() {
        return this.A00;
    }

    public final Float CGX() {
        return this.A05;
    }

    public final Float CGt() {
        return this.A06;
    }

    public final Float CHS() {
        return this.A07;
    }

    public final Float CHZ() {
        return this.A08;
    }

    public final Integer CTN() {
        return this.A09;
    }

    public final Integer CUa() {
        return this.A0A;
    }

    public final Integer CZ9() {
        return this.A0B;
    }

    public final Integer CcV() {
        return this.A0C;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryWhatsAppStickerTappableObject", C44475CfX.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((AnonymousClass7TG.A0E(this.A0D) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public C42099BHc(DSB dsb, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        this.A0D = str;
        this.A01 = f;
        this.A02 = f2;
        this.A09 = num;
        this.A0A = num2;
        this.A0B = num3;
        this.A0C = num4;
        this.A03 = f3;
        this.A04 = f4;
        this.A00 = dsb;
        this.A05 = f5;
        this.A06 = f6;
        this.A07 = f7;
        this.A08 = f8;
    }
}
