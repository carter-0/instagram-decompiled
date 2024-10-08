package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.VwF  reason: case insensitive filesystem */
public final class C18659VwF {
    public C18649Vw1 A00;
    public C18649Vw1 A01;
    public C18649Vw1 A02;
    public C18649Vw1 A03;
    public C18649Vw1 A04;
    public C18649Vw1 A05;
    public C18649Vw1 A06;
    public C18649Vw1 A07;
    public C18649Vw1 A08;
    public C18649Vw1 A09;
    public C18649Vw1 A0A;
    public C18649Vw1 A0B;
    public C18649Vw1 A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0057, code lost:
        if (r0 == null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C18651Vw5 A00(android.content.Context r6, float r7, float r8, int r9) {
        /*
            r5 = this;
            r2 = 1
            X.0qQ.A0B(r6, r2)
            r0 = 0
            X.W08 r1 = new X.W08
            r1.<init>(r0, r0)
            if (r9 == 0) goto L_0x0072
            if (r9 != r2) goto L_0x0103
            com.facebook.react.modules.i18nmanager.I18nUtil r0 = com.facebook.react.modules.i18nmanager.I18nUtil.A00
            boolean r2 = r0.A00(r6)
            X.Vw1 r0 = r5.A05
            if (r2 == 0) goto L_0x00b7
            if (r0 != 0) goto L_0x006d
            X.Vw1 r0 = r5.A08
            if (r0 != 0) goto L_0x006d
            X.Vw1 r0 = r5.A0A
            if (r0 != 0) goto L_0x006d
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x006d
            r4 = r1
        L_0x0027:
            X.Vw1 r0 = r5.A07
            if (r0 != 0) goto L_0x0068
            X.Vw1 r0 = r5.A0B
            if (r0 != 0) goto L_0x0068
            X.Vw1 r0 = r5.A09
            if (r0 != 0) goto L_0x0068
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x0068
            r3 = r1
        L_0x0038:
            X.Vw1 r0 = r5.A04
            if (r0 != 0) goto L_0x0063
            X.Vw1 r0 = r5.A03
            if (r0 != 0) goto L_0x0063
            X.Vw1 r0 = r5.A02
            if (r0 != 0) goto L_0x0063
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x0063
            r2 = r1
        L_0x0049:
            X.Vw1 r0 = r5.A06
            if (r0 != 0) goto L_0x0059
            X.Vw1 r0 = r5.A00
            if (r0 != 0) goto L_0x0059
            X.Vw1 r0 = r5.A01
        L_0x0053:
            if (r0 != 0) goto L_0x0059
            X.Vw1 r0 = r5.A0C
            if (r0 == 0) goto L_0x005d
        L_0x0059:
            X.W08 r1 = r0.A00(r7, r8)
        L_0x005d:
            X.Vw5 r0 = new X.Vw5
            r0.<init>(r4, r3, r2, r1)
            return r0
        L_0x0063:
            X.W08 r2 = r0.A00(r7, r8)
            goto L_0x0049
        L_0x0068:
            X.W08 r3 = r0.A00(r7, r8)
            goto L_0x0038
        L_0x006d:
            X.W08 r4 = r0.A00(r7, r8)
            goto L_0x0027
        L_0x0072:
            X.Vw1 r0 = r5.A07
            if (r0 != 0) goto L_0x00b2
            X.Vw1 r0 = r5.A0B
            if (r0 != 0) goto L_0x00b2
            X.Vw1 r0 = r5.A09
            if (r0 != 0) goto L_0x00b2
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x00b2
            r4 = r1
        L_0x0083:
            X.Vw1 r0 = r5.A05
            if (r0 != 0) goto L_0x00ad
            X.Vw1 r0 = r5.A08
            if (r0 != 0) goto L_0x00ad
            X.Vw1 r0 = r5.A0A
            if (r0 != 0) goto L_0x00ad
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x00ad
            r3 = r1
        L_0x0094:
            X.Vw1 r0 = r5.A06
            if (r0 != 0) goto L_0x00a8
            X.Vw1 r0 = r5.A03
            if (r0 != 0) goto L_0x00a8
            X.Vw1 r0 = r5.A01
            if (r0 != 0) goto L_0x00a8
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x00a8
            r2 = r1
        L_0x00a5:
            X.Vw1 r0 = r5.A04
            goto L_0x00ea
        L_0x00a8:
            X.W08 r2 = r0.A00(r7, r8)
            goto L_0x00a5
        L_0x00ad:
            X.W08 r3 = r0.A00(r7, r8)
            goto L_0x0094
        L_0x00b2:
            X.W08 r4 = r0.A00(r7, r8)
            goto L_0x0083
        L_0x00b7:
            if (r0 != 0) goto L_0x00fe
            X.Vw1 r0 = r5.A08
            if (r0 != 0) goto L_0x00fe
            X.Vw1 r0 = r5.A09
            if (r0 != 0) goto L_0x00fe
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x00fe
            r4 = r1
        L_0x00c6:
            X.Vw1 r0 = r5.A07
            if (r0 != 0) goto L_0x00f9
            X.Vw1 r0 = r5.A0B
            if (r0 != 0) goto L_0x00f9
            X.Vw1 r0 = r5.A0A
            if (r0 != 0) goto L_0x00f9
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x00f9
            r3 = r1
        L_0x00d7:
            X.Vw1 r0 = r5.A04
            if (r0 != 0) goto L_0x00f4
            X.Vw1 r0 = r5.A03
            if (r0 != 0) goto L_0x00f4
            X.Vw1 r0 = r5.A01
            if (r0 != 0) goto L_0x00f4
            X.Vw1 r0 = r5.A0C
            if (r0 != 0) goto L_0x00f4
            r2 = r1
        L_0x00e8:
            X.Vw1 r0 = r5.A06
        L_0x00ea:
            if (r0 != 0) goto L_0x0059
            X.Vw1 r0 = r5.A00
            if (r0 != 0) goto L_0x0059
            X.Vw1 r0 = r5.A02
            goto L_0x0053
        L_0x00f4:
            X.W08 r2 = r0.A00(r7, r8)
            goto L_0x00e8
        L_0x00f9:
            X.W08 r3 = r0.A00(r7, r8)
            goto L_0x00d7
        L_0x00fe:
            X.W08 r4 = r0.A00(r7, r8)
            goto L_0x00c6
        L_0x0103:
            java.lang.String r1 = "Expected?.resolved layout direction"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18659VwF.A00(android.content.Context, float, float, int):X.Vw5");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18659VwF) {
                C18659VwF vwF = (C18659VwF) obj;
                if (!0qQ.A0K(this.A0C, vwF.A0C) || !0qQ.A0K(this.A09, vwF.A09) || !0qQ.A0K(this.A0A, vwF.A0A) || !0qQ.A0K(this.A01, vwF.A01) || !0qQ.A0K(this.A02, vwF.A02) || !0qQ.A0K(this.A0B, vwF.A0B) || !0qQ.A0K(this.A08, vwF.A08) || !0qQ.A0K(this.A03, vwF.A03) || !0qQ.A0K(this.A00, vwF.A00) || !0qQ.A0K(this.A07, vwF.A07) || !0qQ.A0K(this.A06, vwF.A06) || !0qQ.A0K(this.A05, vwF.A05) || !0qQ.A0K(this.A04, vwF.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (this.A0C == null && this.A09 == null && this.A0A == null && this.A01 == null && this.A02 == null && this.A0B == null && this.A08 == null && this.A03 == null && this.A00 == null && this.A07 == null && this.A06 == null && this.A05 == null && this.A04 == null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AnonymousClass7TG.A0C(this.A0C) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BorderRadiusStyle(uniform=");
        sb.append(this.A0C);
        sb.append(", topLeft=");
        sb.append(this.A09);
        sb.append(", topRight=");
        sb.append(this.A0A);
        sb.append(", bottomLeft=");
        sb.append(this.A01);
        sb.append(", bottomRight=");
        sb.append(this.A02);
        sb.append(", topStart=");
        sb.append(this.A0B);
        sb.append(", topEnd=");
        sb.append(this.A08);
        sb.append(", bottomStart=");
        sb.append(this.A03);
        sb.append(", bottomEnd=");
        sb.append(this.A00);
        sb.append(", startStart=");
        sb.append(this.A07);
        sb.append(", startEnd=");
        sb.append(this.A06);
        sb.append(", endStart=");
        sb.append(this.A05);
        sb.append(", endEnd=");
        return AnonymousClass7TG.A0n(this.A04, sb);
    }

    public C18659VwF(C18649Vw1 vw1, C18649Vw1 vw12, C18649Vw1 vw13, C18649Vw1 vw14, C18649Vw1 vw15, C18649Vw1 vw16, C18649Vw1 vw17, C18649Vw1 vw18, C18649Vw1 vw19, C18649Vw1 vw110, C18649Vw1 vw111, C18649Vw1 vw112, C18649Vw1 vw113) {
        this.A0C = vw1;
        this.A09 = vw12;
        this.A0A = vw13;
        this.A01 = vw14;
        this.A02 = vw15;
        this.A0B = vw16;
        this.A08 = vw17;
        this.A03 = vw18;
        this.A00 = vw19;
        this.A07 = vw110;
        this.A06 = vw111;
        this.A05 = vw112;
        this.A04 = vw113;
    }

    public final void A01(C16525UwU uwU, C18649Vw1 vw1) {
        switch (uwU.ordinal()) {
            case 0:
                this.A0C = vw1;
                return;
            case 1:
                this.A09 = vw1;
                return;
            case 2:
                this.A0A = vw1;
                return;
            case 3:
                this.A02 = vw1;
                return;
            case 4:
                this.A01 = vw1;
                return;
            case 5:
                this.A0B = vw1;
                return;
            case 6:
                this.A08 = vw1;
                return;
            case 7:
                this.A03 = vw1;
                return;
            case 8:
                this.A00 = vw1;
                return;
            case 9:
                this.A04 = vw1;
                return;
            case 10:
                this.A05 = vw1;
                return;
            case 11:
                this.A06 = vw1;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                this.A07 = vw1;
                return;
            default:
                return;
        }
    }

    public C18659VwF() {
        this((C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null, (C18649Vw1) null);
    }
}
