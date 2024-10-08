package X;

import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;

/* renamed from: X.GnH  reason: case insensitive filesystem */
public final class C53385GnH extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C53385GnH(GSY gsy, C266444Yx r12, C266444Yx r13, C266444Yx r14, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        GSY gsy2 = null;
        r12 = (i & 1) != 0 ? null : r12;
        r13 = (i & 2) != 0 ? null : r13;
        r14 = (i & 4) != 0 ? null : r14;
        boolean z7 = false;
        boolean A1Q = C51966G9m.A1Q(i & 8, z);
        boolean A1Q2 = C51966G9m.A1Q(i & 16, z2);
        boolean A1Q3 = C51966G9m.A1Q(i & 32, z3);
        boolean A1Q4 = C51966G9m.A1Q(i & 64, z4);
        boolean A1Q5 = C51966G9m.A1Q(i & 256, z5);
        z7 = (i & 512) == 0 ? z6 : z7;
        gsy2 = (i & 1024) == 0 ? gsy : gsy2;
        this.A00 = 0;
        this.A03 = r12;
        this.A02 = r13;
        this.A04 = r14;
        this.A0B = A1Q;
        this.A07 = A1Q2;
        this.A0A = A1Q3;
        this.A09 = A1Q4;
        this.A01 = null;
        this.A08 = A1Q5;
        this.A06 = z7;
        this.A05 = gsy2;
    }

    public static /* synthetic */ C53385GnH A00(C285975Tl r12, C53385GnH gnH, C55817Hnx hnx, WallPostItem wallPostItem, WallText wallText, int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C285975Tl r2 = r12;
        WallText wallText2 = wallText;
        boolean z7 = z2;
        boolean z8 = z;
        C55817Hnx hnx2 = hnx;
        WallPostItem wallPostItem2 = wallPostItem;
        WallText wallText3 = null;
        int i2 = i;
        if ((i & 1) != 0) {
            wallPostItem2 = (WallPostItem) gnH.A02;
        }
        if ((i & 2) != 0) {
            wallText3 = (WallText) gnH.A03;
        }
        if ((i & 4) != 0) {
            z3 = gnH.A07;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            hnx2 = (C55817Hnx) gnH.A01;
        }
        if ((i & 16) != 0) {
            z8 = gnH.A0B;
        }
        if ((i & 32) != 0) {
            z4 = gnH.A08;
        } else {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z7 = gnH.A06;
        }
        if ((i2 & 128) != 0) {
            wallText2 = (WallText) gnH.A04;
        }
        if ((i2 & 256) != 0) {
            z5 = gnH.A0A;
        } else {
            z5 = false;
        }
        if ((i2 & 512) != 0) {
            z6 = gnH.A09;
        } else {
            z6 = false;
        }
        if ((i2 & 1024) != 0) {
            r2 = (C285975Tl) gnH.A05;
        }
        AnonymousClass7TG.A1N(wallPostItem2, wallText3);
        C51969G9p.A1N(wallText2, 7, r2);
        return new C53385GnH(r2, hnx2, wallPostItem2, wallText3, wallText2, z3, z8, z4, z7, z5, z6);
    }

    public final boolean equals(Object obj) {
        C53385GnH gnH;
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53385GnH)) {
                return false;
            }
            gnH = (C53385GnH) obj;
            if (gnH.A00 != 1 || !0qQ.A0K(this.A02, gnH.A02) || !0qQ.A0K(this.A03, gnH.A03) || this.A07 != gnH.A07 || !0qQ.A0K(this.A01, gnH.A01) || this.A0B != gnH.A0B || this.A08 != gnH.A08 || this.A06 != gnH.A06 || !0qQ.A0K(this.A04, gnH.A04) || this.A0A != gnH.A0A) {
                return false;
            }
            z = this.A09;
            z2 = gnH.A09;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53385GnH)) {
                return false;
            }
            gnH = (C53385GnH) obj;
            if (gnH.A00 != 0 || !0qQ.A0K(this.A03, gnH.A03) || !0qQ.A0K(this.A02, gnH.A02) || !0qQ.A0K(this.A04, gnH.A04) || this.A0B != gnH.A0B || this.A07 != gnH.A07 || this.A0A != gnH.A0A || this.A09 != gnH.A09 || !0qQ.A0K(this.A01, gnH.A01) || this.A08 != gnH.A08) {
                return false;
            }
            z = this.A06;
            z2 = gnH.A06;
        }
        if (z != z2 || !0qQ.A0K(this.A05, gnH.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A02));
            return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(this.A07, A072) + AnonymousClass7TG.A0C(this.A01)) * 31)))))));
        }
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A0B, ((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31)));
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A08, (AnonymousClass7TF.A09(this.A09, A092) + AnonymousClass7TG.A0C(this.A01)) * 31)) + AnonymousClass7TE.A0L(this.A05);
    }

    public C53385GnH(C285975Tl r2, C55817Hnx hnx, WallPostItem wallPostItem, WallText wallText, WallText wallText2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = wallPostItem;
        this.A03 = wallText;
        this.A07 = z;
        this.A01 = hnx;
        this.A0B = z2;
        this.A08 = z3;
        this.A06 = z4;
        this.A04 = wallText2;
        this.A0A = z5;
        this.A09 = z6;
        this.A05 = r2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53385GnH(com.instagram.wonderwall.model.WallPostItem r14, com.instagram.wonderwall.model.WallText r15, com.instagram.wonderwall.model.WallText r16, boolean r17, boolean r18, boolean r19) {
        /*
            r13 = this;
            r10 = 1
            r1 = r13
            r13.A00 = r10
            r3 = 0
            r8 = 0
            com.instagram.wonderwall.model.WallText r0 = X.C56485HzH.A00
            r6 = r16
            boolean r12 = X.C51966G9m.A1a(r6, r0)
            java.lang.String r0 = ""
            X.5Tl r2 = X.C51967G9n.A0L(r0)
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r18
            r11 = r19
            r1.<init>((X.C285975Tl) r2, (X.C55817Hnx) r3, (com.instagram.wonderwall.model.WallPostItem) r4, (com.instagram.wonderwall.model.WallText) r5, (com.instagram.wonderwall.model.WallText) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53385GnH.<init>(com.instagram.wonderwall.model.WallPostItem, com.instagram.wonderwall.model.WallText, com.instagram.wonderwall.model.WallText, boolean, boolean, boolean):void");
    }
}
