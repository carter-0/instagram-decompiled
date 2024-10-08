package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Jw9  reason: case insensitive filesystem */
public final class C61071Jw9 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 8;
    public final Object A04;

    public final List A01(C16679UzF uzF) {
        Object obj;
        int A022 = DbU.A02(uzF, 0);
        if (A022 == 0) {
            obj = this.A00;
        } else if (A022 == 1) {
            obj = this.A04;
        } else if (A022 == 3 || A022 == 2) {
            obj = this.A01;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return (List) obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61071Jw9) || ((C61071Jw9) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r2.A02 == r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0188, code lost:
        if (X.0qQ.A0K(r2.A04, r3.A04) != false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018c, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0191, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0199, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0037;
                case 1: goto L_0x005d;
                case 2: goto L_0x008a;
                case 3: goto L_0x00da;
                case 4: goto L_0x0101;
                case 5: goto L_0x00af;
                case 6: goto L_0x0124;
                case 7: goto L_0x014b;
                case 8: goto L_0x0168;
                case 9: goto L_0x019d;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x01b9
            r0 = 10
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x001f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0029:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x01b9
        L_0x0035:
            r0 = 0
            return r0
        L_0x0037:
            if (r2 == r3) goto L_0x01b9
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x0083
            goto L_0x0035
        L_0x005d:
            if (r2 == r3) goto L_0x01b9
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x0035
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0083
            goto L_0x0035
        L_0x0083:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x01b9
            goto L_0x0035
        L_0x008a:
            if (r2 == r3) goto L_0x01b9
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x0029
        L_0x00af:
            if (r2 == r3) goto L_0x01b9
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x0035
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0195
        L_0x00da:
            if (r2 == r3) goto L_0x01b9
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x018c
            goto L_0x0035
        L_0x0101:
            if (r2 == r3) goto L_0x01b9
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x0035
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0191
            goto L_0x0035
        L_0x0124:
            if (r2 == r3) goto L_0x01b9
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x0035
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0191
            goto L_0x0035
        L_0x014b:
            if (r2 == r3) goto L_0x01b9
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x0180
            goto L_0x0035
        L_0x0168:
            if (r2 == r3) goto L_0x01b9
            r0 = 8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0180
            goto L_0x0035
        L_0x0180:
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x018c
            goto L_0x0035
        L_0x018c:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0195
        L_0x0191:
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
        L_0x0195:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01b9
            goto L_0x0035
        L_0x019d:
            if (r2 == r3) goto L_0x01b9
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0035
            X.Jw9 r3 = (X.C61071Jw9) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x001f
        L_0x01b9:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61071Jw9.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r3 = r1 * 31;
        r1 = r4.A04.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        r3 = (r3 + r1) * 31;
        r1 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b8, code lost:
        r3 = (r3 + r1) * 31;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bd, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fd, code lost:
        r3 = (r3 + r1) * 31;
        r1 = X.C63043KqY.A00((java.lang.Integer) r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r2 = X.AnonymousClass7TE.A0N(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r3 = r2 * 31;
        r1 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r4.A02 == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r1 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r3 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A03
            switch(r1) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00d3;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00a4;
                case 4: goto L_0x0080;
                case 5: goto L_0x006b;
                case 6: goto L_0x0058;
                case 7: goto L_0x0043;
                case 8: goto L_0x003c;
                case 9: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A04
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
        L_0x0013:
            int r2 = X.AnonymousClass7TE.A0N(r1, r2)
        L_0x0017:
            int r3 = r2 * 31
            boolean r2 = r4.A02
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x0021
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x0021:
            int r3 = r3 + r1
            return r3
        L_0x0023:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A04
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TE.A0L(r1)
            int r2 = r2 + r1
            goto L_0x0017
        L_0x003c:
            java.lang.Object r1 = r4.A00
            int r1 = r1.hashCode()
            goto L_0x004f
        L_0x0043:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            boolean r1 = r4.A02
            int r1 = X.DbS.A06(r1, r2)
        L_0x004f:
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A04
            int r1 = r1.hashCode()
            goto L_0x00b8
        L_0x0058:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            boolean r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A09(r1, r2)
            java.lang.Object r1 = r4.A01
            int r1 = r1.hashCode()
            goto L_0x009b
        L_0x006b:
            boolean r1 = r4.A02
            int r2 = X.C51965G9l.A05(r1)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A04
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
            goto L_0x00bd
        L_0x0080:
            boolean r1 = r4.A02
            int r2 = X.C51965G9l.A05(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x00a1
            java.lang.String r1 = "HIGHLIGHT_HUB"
        L_0x0097:
            int r1 = X.C51966G9m.A04(r1, r2)
        L_0x009b:
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r4.A04
            goto L_0x00bd
        L_0x00a1:
            java.lang.String r1 = "POST_SUGGESTION"
            goto L_0x0097
        L_0x00a4:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A04
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            boolean r2 = r4.A02
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x00b8
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x00b8:
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r4.A01
        L_0x00bd:
            int r1 = r1.hashCode()
            goto L_0x0021
        L_0x00c3:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A04
            goto L_0x0013
        L_0x00d3:
            java.lang.Object r1 = r4.A04
            int r2 = X.AnonymousClass7TE.A0K(r1)
            boolean r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A09(r1, r2)
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            goto L_0x00fd
        L_0x00e6:
            java.lang.Object r1 = r4.A04
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            boolean r2 = r4.A02
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x00fd
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x00fd:
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r4.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = X.C63043KqY.A00(r1)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61071Jw9.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        Object obj;
        switch (this.A03) {
            case 5:
                sb = AnonymousClass7TE.A1A();
                sb.append("AdUniversalCTAUiState(isCarousel=");
                sb.append(this.A02);
                sb.append(AnonymousClass000.A00(202));
                sb.append(this.A01);
                sb.append(", modelWithMedia=");
                sb.append(this.A04);
                sb.append(", actions=");
                obj = this.A00;
                break;
            case 8:
                sb = AnonymousClass7TE.A1A();
                sb.append("RecentlyUpdatedItemsFeed(cartFeed=");
                sb.append(this.A00);
                sb.append(", wishListFeed=");
                sb.append(this.A04);
                sb.append(", likedAndRecentlyViewedFeed=");
                obj = this.A01;
                break;
            default:
                return super.toString();
        }
        return AnonymousClass7TG.A0n(obj, sb);
    }

    public C61071Jw9(GTI gti, 1Xl r3, GTG gtg, boolean z) {
        this.A02 = z;
        this.A01 = gtg;
        this.A04 = r3;
        this.A00 = gti;
    }

    public C61071Jw9(View.OnClickListener onClickListener, Integer num, List list, boolean z) {
        this.A02 = z;
        this.A01 = list;
        this.A00 = num;
        this.A04 = onClickListener;
    }

    public C61071Jw9(C53359Gmj gmj, AnonymousClass62P r3, AnonymousClass62P r4, boolean z) {
        0qQ.A0B(r4, 3);
        this.A04 = gmj;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = z;
    }

    public C61071Jw9(Integer num, Integer num2, Integer num3, boolean z) {
        this.A00 = num;
        this.A04 = num2;
        this.A01 = num3;
        this.A02 = z;
    }

    public C61071Jw9(C310336ap r2, C62320sa r3, C62320sa r4, boolean z) {
        AnonymousClass7TG.A0w(1, r2, r3, r4);
        this.A00 = r2;
        this.A02 = z;
        this.A04 = r3;
        this.A01 = r4;
    }

    public C61071Jw9(C56000Hr6 hr6, C62320sa r3, C62320sa r4, boolean z) {
        AnonymousClass7TG.A0w(1, hr6, r3, r4);
        this.A00 = hr6;
        this.A02 = z;
        this.A01 = r3;
        this.A04 = r4;
    }

    public C61071Jw9(C53384GnG gnG, Map map, Set set, boolean z) {
        C51974G9v.A1L(gnG, map, set);
        this.A00 = gnG;
        this.A04 = map;
        this.A02 = z;
        this.A01 = set;
    }

    public C61071Jw9(C61081JwJ jwJ, Integer num, List list, boolean z) {
        AnonymousClass7TF.A1D(list, 1, num);
        this.A04 = list;
        this.A02 = z;
        this.A01 = jwJ;
        this.A00 = num;
    }

    public C61071Jw9(Integer num, List list) {
        this.A04 = list;
        this.A01 = null;
        this.A02 = true;
        this.A00 = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61071Jw9() {
        /*
            r1 = this;
            r0 = 8
            r1.A03 = r0
            X.0sn r0 = X.0sn.A00
            r1.<init>(r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61071Jw9.<init>():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61071Jw9(boolean r3) {
        /*
            r2 = this;
            r0 = 10
            r2.A03 = r0
            X.Gmj r1 = new X.Gmj
            r1.<init>()
            X.62M r0 = X.AnonymousClass62M.A01
            r2.<init>((X.C53359Gmj) r1, (X.AnonymousClass62P) r0, (X.AnonymousClass62P) r0, (boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61071Jw9.<init>(boolean):void");
    }

    public C61071Jw9(N4E n4e, ImageUrl imageUrl, ImageUrl imageUrl2, boolean z) {
        0qQ.A0B(n4e, 1);
        AnonymousClass7TF.A1C(imageUrl, 2, imageUrl2);
        this.A01 = n4e;
        this.A00 = imageUrl;
        this.A04 = imageUrl2;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r5.isEmpty() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61071Jw9(java.util.List r3, java.util.List r4, java.util.List r5) {
        /*
            r2 = this;
            r0 = 8
            r2.A03 = r0
            r2.<init>()
            r2.A00 = r3
            r2.A04 = r4
            r2.A01 = r5
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0020
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61071Jw9.<init>(java.util.List, java.util.List, java.util.List):void");
    }
}
