package X;

import com.instagram.creatortools.api.schemas.EligibilityCriteria;
import java.util.List;

/* renamed from: X.GnV  reason: case insensitive filesystem */
public final class C53398GnV extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C53398GnV(C69597Nof nof, C254743sy r3, String str, String str2, boolean z) {
        this.A00 = 6;
        C51974G9v.A1L(r3, str, nof);
        this.A02 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = nof;
        this.A05 = z;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53398GnV) || ((C53398GnV) obj).A00 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (X.0qQ.A0K(r2.A03, r3.A03) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r2.A05 == r3.A05) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (X.C53398GnV) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012c, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0132, code lost:
        if (r2.A05 == r3.A05) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013e, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (X.0qQ.A0K(r2.A04, r3.A04) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x006a;
                case 2: goto L_0x009a;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00d8;
                case 5: goto L_0x0105;
                case 6: goto L_0x0142;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0147
            r0 = 7
        L_0x0008:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003e
            X.GnV r3 = (X.C53398GnV) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0032:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            boolean r1 = r2.A05
            boolean r0 = r3.A05
            if (r1 == r0) goto L_0x0147
        L_0x003e:
            r0 = 0
            return r0
        L_0x0040:
            if (r2 == r3) goto L_0x0147
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003e
            X.GnV r3 = (X.C53398GnV) r3
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ff
            goto L_0x003e
        L_0x006a:
            if (r2 == r3) goto L_0x0147
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003e
            X.GnV r3 = (X.C53398GnV) r3
            boolean r1 = r2.A05
            boolean r0 = r3.A05
            if (r1 != r0) goto L_0x003e
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0136
            goto L_0x003e
        L_0x009a:
            if (r2 == r3) goto L_0x0147
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003e
            X.GnV r3 = (X.C53398GnV) r3
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x00d3
            goto L_0x003e
        L_0x00b6:
            if (r2 == r3) goto L_0x0147
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003e
            X.GnV r3 = (X.C53398GnV) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L_0x003e
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x003e
        L_0x00d3:
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L_0x0128
        L_0x00d8:
            if (r2 == r3) goto L_0x0147
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003e
            X.GnV r3 = (X.C53398GnV) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x00ff
            goto L_0x003e
        L_0x00ff:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0032
        L_0x0105:
            if (r2 == r3) goto L_0x0147
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003e
            X.GnV r3 = (X.C53398GnV) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
        L_0x0128:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003e
            boolean r1 = r2.A05
            boolean r0 = r3.A05
            if (r1 == r0) goto L_0x0136
            goto L_0x003e
        L_0x0136:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0147
            goto L_0x003e
        L_0x0142:
            if (r2 == r3) goto L_0x0147
            r0 = 6
            goto L_0x0008
        L_0x0147:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53398GnV.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        r2 = (r1 + r0) * 31;
        r1 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r3.A05 == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r1 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00d8;
                case 2: goto L_0x00a3;
                case 3: goto L_0x0084;
                case 4: goto L_0x006c;
                case 5: goto L_0x0045;
                case 6: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.C41845B3m.A00(r0)
        L_0x001c:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
        L_0x0021:
            int r0 = r0.hashCode()
        L_0x0025:
            int r1 = r1 + r0
            int r2 = r1 * 31
            boolean r0 = r3.A05
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L_0x0030
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x0030:
            int r1 = r1 + r2
            return r1
        L_0x0032:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            goto L_0x001c
        L_0x0045:
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A05
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0030
        L_0x006c:
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L_0x0021
            r0 = 0
            goto L_0x0025
        L_0x0084:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            boolean r0 = r3.A05
            int r2 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TG.A0C(r0)
            goto L_0x0030
        L_0x00a3:
            java.lang.String r0 = r3.A04
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x00cf;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00d5;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            java.lang.String r0 = "Default"
        L_0x00b4:
            int r1 = X.C51971G9r.A0F(r0, r1, r2)
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A05
            int r2 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = r0.hashCode()
            goto L_0x0030
        L_0x00cf:
            java.lang.String r0 = "Emphasized"
            goto L_0x00b4
        L_0x00d2:
            java.lang.String r0 = "Destructive"
            goto L_0x00b4
        L_0x00d5:
            java.lang.String r0 = "DestructiveEmphasized"
            goto L_0x00b4
        L_0x00d8:
            boolean r0 = r3.A05
            int r1 = X.C51965G9l.A05(r0)
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0030
        L_0x0101:
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53398GnV.hashCode():int");
    }

    public final String toString() {
        if (7 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IgFeedFundedIncentiveBannerSectionUiState(buyerIncentiveAdsInfo=");
        A1A.append(this.A02);
        A1A.append(", buyerIncentiveAdsInfoDescriptionText=");
        A1A.append(this.A04);
        A1A.append(", buyerIncentiveAdsInfoButtonText=");
        A1A.append(this.A03);
        A1A.append(", actions=");
        A1A.append(this.A01);
        A1A.append(", isNewDesign=");
        return G9t.A1C(A1A, this.A05);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53398GnV(Integer num, String str, C62320sa r5, int i) {
        this((i & 2) != 0 ? AnonymousClass05K.A00 : num, str, (i & 16) != 0 ? C58320Iq1.A00 : r5, AnonymousClass7TF.A1P(i & 8));
        this.A00 = 2;
    }

    public C53398GnV(Object obj, Object obj2, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = obj2;
        this.A05 = z;
    }

    public C53398GnV(String str, String str2, List list, List list2, boolean z) {
        this.A00 = 0;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = list;
        this.A02 = list2;
        this.A05 = z;
    }

    public C53398GnV(EligibilityCriteria eligibilityCriteria, String str, String str2, List list, boolean z) {
        this.A00 = 4;
        AnonymousClass7TG.A1U(str, str2, eligibilityCriteria);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = eligibilityCriteria;
        this.A02 = list;
        this.A05 = z;
    }

    public C53398GnV(HND hnd, Integer num, String str, String str2, boolean z) {
        this.A00 = 3;
        this.A02 = hnd;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A01 = num;
    }

    public C53398GnV(Integer num, String str, C62320sa r6, boolean z) {
        this.A00 = 2;
        0qQ.A0B(str, 1);
        DbW.A1N(num, 2, r6);
        this.A04 = str;
        this.A02 = num;
        this.A03 = null;
        this.A05 = z;
        this.A01 = r6;
    }
}
