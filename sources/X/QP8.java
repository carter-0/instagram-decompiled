package X;

import android.net.Uri;
import com.facebook.iabbwpextension.IABBwPExtension;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;

public final class QP8 extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof QP8) || ((QP8) obj).A05 != i) {
            return false;
        }
        return true;
    }

    public static boolean A01(QP8 qp8, QP8 qp82) {
        return 0qQ.A0K(qp8.A02, qp82.A02);
    }

    public static boolean A02(QP8 qp8, QP8 qp82) {
        return 0qQ.A0K(qp8.A01, qp82.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ab, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ad, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x022f, code lost:
        r0 = X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0233, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0235, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A05
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0067;
                case 2: goto L_0x0088;
                case 3: goto L_0x00b8;
                case 4: goto L_0x00d9;
                case 5: goto L_0x0100;
                case 6: goto L_0x0127;
                case 7: goto L_0x0148;
                case 8: goto L_0x017d;
                case 9: goto L_0x01b3;
                case 10: goto L_0x01df;
                case 11: goto L_0x0213;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x023b
            r0 = 12
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x0025:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x002f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x0039:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x023b
        L_0x003f:
            r0 = 0
            return r0
        L_0x0041:
            if (r2 == r3) goto L_0x023b
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00ad
        L_0x0067:
            if (r2 == r3) goto L_0x023b
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A02(r2, r3)
            goto L_0x0233
        L_0x0088:
            if (r2 == r3) goto L_0x023b
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x00ad:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x0039
        L_0x00b8:
            if (r2 == r3) goto L_0x023b
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x022f
        L_0x00d9:
            if (r2 == r3) goto L_0x023b
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x01a7
        L_0x0100:
            if (r2 == r3) goto L_0x023b
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L_0x002f
        L_0x0127:
            if (r2 == r3) goto L_0x023b
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x0025
        L_0x0148:
            if (r2 == r3) goto L_0x023b
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x0039
        L_0x017d:
            if (r2 == r3) goto L_0x023b
            r0 = 8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x01a7:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L_0x0039
        L_0x01b3:
            if (r2 == r3) goto L_0x023b
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x002f
        L_0x01df:
            if (r2 == r3) goto L_0x023b
            r0 = 10
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x023b
            goto L_0x003f
        L_0x0213:
            if (r2 == r3) goto L_0x023b
            r0 = 11
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.QP8 r3 = (X.QP8) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x003f
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x022f:
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x0233:
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x002f
        L_0x023b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP8.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0131, code lost:
        r1 = (r1 + X.AnonymousClass7TG.A0E(r0)) * 31;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x01cc, code lost:
        r1 = (r1 + X.AnonymousClass7TG.A0E(r0)) * 31;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x01d5, code lost:
        r2 = X.C41845B3m.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A05
            switch(r0) {
                case 0: goto L_0x01aa;
                case 1: goto L_0x0184;
                case 2: goto L_0x0167;
                case 3: goto L_0x013c;
                case 4: goto L_0x0115;
                case 5: goto L_0x00f5;
                case 6: goto L_0x00d2;
                case 7: goto L_0x00b2;
                case 8: goto L_0x0099;
                case 9: goto L_0x006f;
                case 10: goto L_0x0047;
                case 11: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TG.A0C(r0)
        L_0x0023:
            int r1 = r1 + r2
            return r1
        L_0x0025:
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0023
        L_0x0047:
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0023
        L_0x006f:
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0023
        L_0x0099:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
            goto L_0x0131
        L_0x00b2:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A02
            int r1 = r0.hashCode()
            goto L_0x0023
        L_0x00d2:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0023
        L_0x00f5:
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A03
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r1 = r0.hashCode()
            goto L_0x0023
        L_0x0115:
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
        L_0x0131:
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            goto L_0x01d5
        L_0x013c:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0023
        L_0x0167:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            goto L_0x01cc
        L_0x0184:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
            int r0 = X.C41845B3m.A00(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r1 = r0.hashCode()
            goto L_0x0023
        L_0x01aa:
            java.lang.Object r1 = r3.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = X.RVU.A00(r1)
            int r0 = X.C51971G9r.A0D(r1, r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
        L_0x01cc:
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
        L_0x01d5:
            int r2 = X.C41845B3m.A00(r0)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP8.hashCode():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00df, code lost:
        r1.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e6, code lost:
        return X.AnonymousClass7TG.A0p(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0067, code lost:
        r1.append(r0);
        r1.append(r2.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r2 = this;
            int r0 = r2.A05
            switch(r0) {
                case 0: goto L_0x00a4;
                case 4: goto L_0x0070;
                case 10: goto L_0x0039;
                case 12: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "IgLiveCommentShoppingLoggingInfo(mediaId="
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", productId="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            r1.append(r0)
            java.lang.String r0 = ", merchantId="
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = ", broadcastId="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", socialContextCount="
            goto L_0x0067
        L_0x0039:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "TokenCredentials(loginUserId="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            r1.append(r0)
            java.lang.String r0 = ", accessToken="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", deviceBasedLoginToken="
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", fbId="
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = ", accountType="
        L_0x0067:
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            goto L_0x00e2
        L_0x0070:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "PicsPleaseResponseViewModel(prompt="
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", backgroundColor="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", originalQuestionId="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", questionResponseId="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            r1.append(r0)
            java.lang.String r0 = ", questionResponderId="
            r1.append(r0)
            java.lang.String r0 = r2.A03
            goto L_0x00df
        L_0x00a4:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "BwPAdsInfo(bwPType="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = X.RVU.A00(r0)
        L_0x00b7:
            r1.append(r0)
            java.lang.String r0 = ", initialUrl="
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = ", apiKey="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", bauProductUrl="
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", pageName="
            r1.append(r0)
            java.lang.String r0 = r2.A04
        L_0x00df:
            r1.append(r0)
        L_0x00e2:
            java.lang.String r0 = X.AnonymousClass7TG.A0p(r1)
            return r0
        L_0x00e7:
            java.lang.String r0 = "null"
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP8.toString():java.lang.String");
    }

    public QP8(Long l, String str, String str2, String str3, String str4) {
        this.A05 = 6;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A00 = l;
    }

    public QP8(C61067Jw5 jw5, String str, String str2, String str3, String str4) {
        this.A05 = 7;
        this.A00 = jw5;
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
    }

    public QP8(N49 n49, String str, String str2, String str3, String str4) {
        this.A05 = 8;
        this.A00 = n49;
        this.A02 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public QP8(Uri uri, String str, String str2, String str3, String str4) {
        this.A05 = 5;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = uri;
    }

    public QP8(ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this.A05 = 1;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A00 = imageUrl;
    }

    public QP8(FxcalAccountType fxcalAccountType, String str, String str2, String str3, String str4) {
        this.A05 = 10;
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = fxcalAccountType;
    }

    public QP8(Integer num, String str, String str2, String str3, String str4) {
        this.A05 = 0;
        0qQ.A0B(num, 1);
        this.A00 = num;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    public QP8(Object obj, String str, String str2, String str3, String str4, int i) {
        this.A05 = i;
        this.A02 = str;
        this.A00 = obj;
        this.A01 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public QP8(String str, String str2, String str3, String str4) {
        this.A05 = 3;
        this.A05 = 3;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str4;
        this.A04 = str3;
        this.A00 = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QP8(IABBwPExtension iABBwPExtension) {
        this(iABBwPExtension.A01, iABBwPExtension.A05, iABBwPExtension.A03, iABBwPExtension.A04, iABBwPExtension.A06);
        this.A05 = 0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QP8(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            r5 = r10
            r2 = 0
            r0 = 10
            r1 = r7
            r7.A05 = r0
            r0 = r11 & 4
            if (r0 == 0) goto L_0x000c
            r5 = r2
        L_0x000c:
            r3 = r8
            r4 = r9
            r6 = r2
            r1.<init>((com.instagram.fx.access.constants.FxcalAccountType) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP8.<init>(java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        r10.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r10.A05 = r9;
        this(r4, r4, r4, r4, r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QP8(int r11) {
        /*
            r10 = this;
            r3 = r10
            r10.A05 = r11
            switch(r11) {
                case 4: goto L_0x0036;
                case 9: goto L_0x0032;
                case 11: goto L_0x001d;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            r1 = 12
            r10.A05 = r1
            java.lang.String r0 = ""
            r10.A05 = r1
            r10.<init>()
            r10.A02 = r0
            r10.A04 = r0
            r10.A03 = r0
            r10.A01 = r0
        L_0x001a:
            r10.A00 = r2
            return
        L_0x001d:
            r2 = 0
            r1 = 11
            r10.A05 = r1
            java.lang.String r0 = ""
            r10.A05 = r1
            r10.<init>()
            r10.A01 = r0
            r10.A02 = r0
            r10.A03 = r0
            r10.A04 = r2
            goto L_0x001a
        L_0x0032:
            r4 = 0
            r9 = 9
            goto L_0x0038
        L_0x0036:
            r4 = 0
            r9 = 4
        L_0x0038:
            r10.A05 = r9
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP8.<init>(int):void");
    }
}
