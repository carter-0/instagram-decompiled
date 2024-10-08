package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.shopping.model.taggingfeed.SourceType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jw0  reason: case insensitive filesystem */
public final class C61062Jw0 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61062Jw0) || ((C61062Jw0) obj).A05 != i) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        List list = (List) this.A01;
        if ((list == null || list.isEmpty()) && this.A03 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f0, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e9, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012c, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a3, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a5, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ad, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01af, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A05
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0070;
                case 2: goto L_0x009e;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00fb;
                case 5: goto L_0x0134;
                case 6: goto L_0x0158;
                case 7: goto L_0x017c;
                case 8: goto L_0x01b4;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x01f4
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x01f4
        L_0x003f:
            r0 = 0
            return r0
        L_0x0041:
            if (r2 == r3) goto L_0x01f4
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0128
        L_0x0070:
            if (r2 == r3) goto L_0x01f4
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00ef
        L_0x009e:
            if (r2 == r3) goto L_0x01f4
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x00e5
        L_0x00c2:
            if (r2 == r3) goto L_0x01f4
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x00e5:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x00ef:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x01ec
        L_0x00fb:
            if (r2 == r3) goto L_0x01f4
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
        L_0x0128:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x01ec
        L_0x0134:
            if (r2 == r3) goto L_0x01f4
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x01a9
        L_0x0158:
            if (r2 == r3) goto L_0x01f4
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L_0x019f
        L_0x017c:
            if (r2 == r3) goto L_0x01f4
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x019f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x01a9:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x01ec
        L_0x01b4:
            if (r2 == r3) goto L_0x01f4
            r0 = 8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x003f
            X.Jw0 r3 = (X.C61062Jw0) r3
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
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x01ec:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01f4
            goto L_0x003f
        L_0x01f4:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61062Jw0.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009a, code lost:
        r2 = X.AnonymousClass7TF.A07(r3.A01, (r1 + r0) * 31);
        r1 = r3.A04.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00d0, code lost:
        r2 = X.C41845B3m.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        return r2 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A05
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0047;
                case 2: goto L_0x006d;
                case 3: goto L_0x0085;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00ec;
                case 7: goto L_0x0115;
                case 8: goto L_0x0140;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A01
        L_0x0022:
            int r1 = r0.hashCode()
        L_0x0026:
            int r2 = r2 + r1
            return r2
        L_0x0028:
            java.lang.String r0 = r3.A04
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TG.A0E(r0)
            goto L_0x0026
        L_0x0047:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            goto L_0x00d0
        L_0x006d:
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x009a
        L_0x0085:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.C41845B3m.A00(r0)
        L_0x009a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A04
            int r1 = r0.hashCode()
            goto L_0x0026
        L_0x00ab:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
        L_0x00d0:
            int r2 = X.C41845B3m.A00(r0)
            goto L_0x0026
        L_0x00d6:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A04
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A01
            goto L_0x0022
        L_0x00ec:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0026
        L_0x0115:
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0026
        L_0x0140:
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61062Jw0.hashCode():int");
    }

    public final String toString() {
        if (5 - this.A05 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsSfxCategory(id=");
        A1A.append(this.A02);
        A1A.append(", title=");
        A1A.append(this.A03);
        A1A.append(", type=");
        A1A.append(this.A04);
        A1A.append(", previewItems=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61062Jw0() {
        this((Object) null, (Object) null, (String) null, (String) null, (String) null, 4);
        this.A05 = 4;
        this.A05 = 4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61062Jw0(com.instagram.user.model.ProductCollectionImpl r8, java.lang.String r9, java.lang.String r10, java.util.List r11) {
        /*
            r7 = this;
            r6 = 4
            r0 = r7
            r7.A05 = r6
            r5 = 0
            r1 = r8
            r4 = r9
            r3 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61062Jw0.<init>(com.instagram.user.model.ProductCollectionImpl, java.lang.String, java.lang.String, java.util.List):void");
    }

    public C61062Jw0(AnonymousClass7QP r2, AnonymousClass7QP r3, String str, String str2, String str3) {
        this.A05 = 0;
        AnonymousClass7TG.A1P(str, r2);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = str3;
    }

    public C61062Jw0(User user, String str, String str2, String str3, List list) {
        this.A05 = 2;
        AnonymousClass7TG.A1R(list, str3);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = user;
        this.A01 = list;
        this.A04 = str3;
    }

    public C61062Jw0(Boolean bool, String str, String str2, String str3, List list) {
        this.A05 = 6;
        this.A00 = list;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = bool;
    }

    public C61062Jw0(ImageUrl imageUrl, User user, String str, String str2, String str3) {
        this.A05 = 3;
        C51973G9u.A0r(1, str, user, str3);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A01 = user;
        this.A04 = str3;
    }

    public C61062Jw0(SourceType sourceType, String str, String str2, String str3, List list) {
        this.A05 = 9;
        0qQ.A0B(list, 1);
        C51973G9u.A0r(3, str2, str3, sourceType);
        this.A00 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = sourceType;
    }

    public C61062Jw0(String str, String str2, String str3, List list) {
        this.A05 = 5;
        C51974G9v.A1P(str, str2, str3, list);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = list;
        this.A00 = MMR.A00(this, 10);
    }

    public C61062Jw0(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = obj2;
    }
}
