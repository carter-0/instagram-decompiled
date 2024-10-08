package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;

public final class N4M extends AnonymousClass0T0 {
    public final C69671Npt A00;
    public final C69671Npt A01;
    public final Object A02;
    public final boolean A03;
    public final GridSelfViewLocation A04;
    public final C69671Npt A05;
    public final C69671Npt A06;
    public final C69671Npt A07;
    public final C69671Npt A08;
    public final C69671Npt A09;
    public final C69671Npt A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public N4M() {
        this((GridSelfViewLocation) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (Object) null, 32767, false, false, false, false);
    }

    public final GridLayoutConfigForLayoutInput A02(Context context) {
        0qQ.A0B(context, 0);
        return new GridLayoutConfigForLayoutInput(this.A08.A01(), this.A09.A01(), this.A0A.A01(), this.A06.A01(), this.A00.A01(), this.A01.A01(), this.A05.A01(), this.A07.A01(), this.A03, this.A0E, this.A0D, this.A0B, this.A0C, this.A04, this.A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N4M) {
                N4M n4m = (N4M) obj;
                if (!0qQ.A0K(this.A08, n4m.A08) || !0qQ.A0K(this.A09, n4m.A09) || !0qQ.A0K(this.A0A, n4m.A0A) || !0qQ.A0K(this.A06, n4m.A06) || !0qQ.A0K(this.A00, n4m.A00) || !0qQ.A0K(this.A01, n4m.A01) || !0qQ.A0K(this.A05, n4m.A05) || !0qQ.A0K(this.A07, n4m.A07) || this.A03 != n4m.A03 || this.A0E != n4m.A0E || this.A0D != n4m.A0D || this.A0B != n4m.A0B || this.A0C != n4m.A0C || this.A04 != n4m.A04 || !0qQ.A0K(this.A02, n4m.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ N4M(com.facebook.rtc.views.omnigrid.GridSelfViewLocation r19, X.C69671Npt r20, X.C69671Npt r21, X.C69671Npt r22, X.C69671Npt r23, X.C69671Npt r24, X.C69671Npt r25, X.C69671Npt r26, X.C69671Npt r27, java.lang.Object r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r18 = this;
            r0 = r29
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r3 = r19
            r12 = r28
            r1 = r29 & 1
            r17 = 0
            if (r1 == 0) goto L_0x0020
            X.NE8 r4 = X.NE8.A00(r17)
        L_0x0020:
            r1 = r29 & 2
            if (r1 == 0) goto L_0x0028
            X.NE8 r5 = X.NE8.A00(r17)
        L_0x0028:
            r1 = r29 & 4
            if (r1 == 0) goto L_0x0030
            X.NE8 r6 = X.NE8.A00(r17)
        L_0x0030:
            r1 = r29 & 8
            if (r1 == 0) goto L_0x0038
            X.NE8 r7 = X.NE8.A00(r17)
        L_0x0038:
            r1 = r29 & 16
            if (r1 == 0) goto L_0x0040
            X.NE8 r8 = X.NE8.A00(r17)
        L_0x0040:
            r1 = r29 & 32
            if (r1 == 0) goto L_0x0048
            X.NE8 r9 = X.NE8.A00(r17)
        L_0x0048:
            r1 = r29 & 64
            if (r1 == 0) goto L_0x0050
            X.NE8 r10 = X.NE8.A00(r17)
        L_0x0050:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0058
            X.NE8 r11 = X.NE8.A00(r17)
        L_0x0058:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = r30
            boolean r13 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = r31
            boolean r14 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = r32
            boolean r15 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = r33
            boolean r16 = X.C51966G9m.A1Q(r1, r2)
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007e
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r3 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT
        L_0x007e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0083
            r12 = 0
        L_0x0083:
            r2 = r18
            r2.<init>((com.facebook.rtc.views.omnigrid.GridSelfViewLocation) r3, (X.C69671Npt) r4, (X.C69671Npt) r5, (X.C69671Npt) r6, (X.C69671Npt) r7, (X.C69671Npt) r8, (X.C69671Npt) r9, (X.C69671Npt) r10, (X.C69671Npt) r11, (java.lang.Object) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4M.<init>(com.facebook.rtc.views.omnigrid.GridSelfViewLocation, X.Npt, X.Npt, X.Npt, X.Npt, X.Npt, X.Npt, X.Npt, X.Npt, java.lang.Object, int, boolean, boolean, boolean, boolean):void");
    }

    public static /* synthetic */ N4M A00(N4M n4m, GridSelfViewLocation gridSelfViewLocation, C69671Npt npt, C69671Npt npt2, C69671Npt npt3, C69671Npt npt4, Object obj, int i, boolean z, boolean z2) {
        C69671Npt npt5;
        C69671Npt npt6;
        C69671Npt npt7;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj2 = obj;
        GridSelfViewLocation gridSelfViewLocation2 = gridSelfViewLocation;
        boolean z6 = z2;
        boolean z7 = z;
        C69671Npt npt8 = npt4;
        C69671Npt npt9 = npt3;
        C69671Npt npt10 = npt2;
        C69671Npt npt11 = npt;
        C69671Npt npt12 = null;
        int i2 = i;
        N4M n4m2 = n4m;
        if ((i & 1) != 0) {
            npt5 = n4m2.A08;
        } else {
            npt5 = null;
        }
        if ((i & 2) != 0) {
            npt6 = n4m2.A09;
        } else {
            npt6 = null;
        }
        if ((i & 4) != 0) {
            npt11 = n4m2.A0A;
        }
        if ((i & 8) != 0) {
            npt10 = n4m2.A06;
        }
        if ((i & 16) != 0) {
            npt9 = n4m2.A00;
        }
        if ((i & 32) != 0) {
            npt8 = n4m2.A01;
        }
        if ((i & 64) != 0) {
            npt7 = n4m2.A05;
        } else {
            npt7 = null;
        }
        if ((i2 & 128) != 0) {
            npt12 = n4m2.A07;
        }
        if ((i2 & 256) != 0) {
            z7 = n4m2.A03;
        }
        if ((i2 & 512) != 0) {
            z3 = n4m2.A0E;
        } else {
            z3 = false;
        }
        if ((i2 & 1024) != 0) {
            z4 = n4m2.A0D;
        } else {
            z4 = false;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            z6 = n4m2.A0B;
        }
        if ((i2 & 4096) != 0) {
            z5 = n4m2.A0C;
        } else {
            z5 = false;
        }
        if ((i2 & 8192) != 0) {
            gridSelfViewLocation2 = n4m2.A04;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            obj2 = n4m2.A02;
        }
        AnonymousClass7TG.A1N(npt5, npt6);
        C51974G9v.A1S(npt11, npt10, npt9, npt8, npt7);
        C51969G9p.A1O(npt12, 7, gridSelfViewLocation2);
        return new N4M(gridSelfViewLocation2, npt5, npt6, npt11, npt10, npt9, npt8, npt7, npt12, obj2, z7, z3, z4, z6, z5);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A09, AnonymousClass7TE.A0K(this.A08)))))))))))))) + AnonymousClass7TG.A0C(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridLayoutConfig(leftPadding=");
        A1A.append(this.A08);
        A1A.append(", rightPadding=");
        A1A.append(this.A09);
        A1A.append(", topPadding=");
        A1A.append(this.A0A);
        A1A.append(", bottomPadding=");
        A1A.append(this.A06);
        A1A.append(", horizontalSpacing=");
        A1A.append(this.A00);
        A1A.append(", verticalSpacing=");
        A1A.append(this.A01);
        A1A.append(", bottomInset=");
        A1A.append(this.A05);
        A1A.append(", itemHeightOffset=");
        A1A.append(this.A07);
        A1A.append(", disablesFloatingSelfView=");
        A1A.append(this.A03);
        A1A.append(", skipsDefaultGridLayout=");
        A1A.append(this.A0E);
        A1A.append(", forcesHorizontalLayoutForTwoPersonLayout=");
        A1A.append(this.A0D);
        A1A.append(", appliesPaddingToFullscreenLayout=");
        A1A.append(this.A0B);
        A1A.append(", aspectFillFullscreenSingleItem=");
        A1A.append(this.A0C);
        A1A.append(", selfViewLocation=");
        A1A.append(this.A04);
        A1A.append(", layoutExtras=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }

    public N4M(GridSelfViewLocation gridSelfViewLocation, C69671Npt npt, C69671Npt npt2, C69671Npt npt3, C69671Npt npt4, C69671Npt npt5, C69671Npt npt6, C69671Npt npt7, C69671Npt npt8, Object obj, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(npt, 1);
        C51974G9v.A1S(npt2, npt3, npt4, npt5, npt6);
        AnonymousClass7TF.A1F(npt7, 7, npt8);
        0qQ.A0B(gridSelfViewLocation, 14);
        this.A08 = npt;
        this.A09 = npt2;
        this.A0A = npt3;
        this.A06 = npt4;
        this.A00 = npt5;
        this.A01 = npt6;
        this.A05 = npt7;
        this.A07 = npt8;
        this.A03 = z;
        this.A0E = z2;
        this.A0D = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A04 = gridSelfViewLocation;
        this.A02 = obj;
    }
}
