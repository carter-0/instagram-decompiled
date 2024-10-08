package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Jvt  reason: case insensitive filesystem */
public final class C61055Jvt extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public C61055Jvt(Double d, String str, String str2, boolean z) {
        this.A04 = 2;
        this.A02 = str;
        this.A00 = d;
        this.A03 = z;
        this.A01 = str2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61055Jvt) || ((C61055Jvt) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (X.0qQ.A0K(r3.A01, r4.A01) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r3.A00 == r4.A00) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r3.A03 == r4.A03) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00be, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r3.A03 != r4.A03) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r1 = r3.A00;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x005d;
                case 2: goto L_0x0077;
                case 3: goto L_0x00a1;
                case 4: goto L_0x00d2;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r3 == r4) goto L_0x0106
            r0 = 5
            boolean r0 = A00(r0, r4)
            if (r0 == 0) goto L_0x002e
            X.Jvt r4 = (X.C61055Jvt) r4
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0056
        L_0x002e:
            r2 = 0
        L_0x002f:
            return r2
        L_0x0030:
            if (r3 == r4) goto L_0x0106
            r0 = 0
            boolean r0 = A00(r0, r4)
            if (r0 == 0) goto L_0x002e
            X.Jvt r4 = (X.C61055Jvt) r4
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
            if (r1 == r0) goto L_0x0056
            goto L_0x002e
        L_0x0056:
            boolean r1 = r3.A03
            boolean r0 = r4.A03
            if (r1 == r0) goto L_0x0106
            goto L_0x002e
        L_0x005d:
            if (r3 == r4) goto L_0x0106
            r0 = 1
            boolean r0 = A00(r0, r4)
            if (r0 == 0) goto L_0x002e
            X.Jvt r4 = (X.C61055Jvt) r4
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            goto L_0x00ba
        L_0x0077:
            if (r3 == r4) goto L_0x0106
            r0 = 2
            boolean r0 = A00(r0, r4)
            if (r0 == 0) goto L_0x002e
            X.Jvt r4 = (X.C61055Jvt) r4
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            boolean r1 = r3.A03
            boolean r0 = r4.A03
            if (r1 != r0) goto L_0x002e
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            goto L_0x00ca
        L_0x00a1:
            if (r3 == r4) goto L_0x0106
            r0 = 3
            boolean r0 = A00(r0, r4)
            if (r0 == 0) goto L_0x002e
            X.Jvt r4 = (X.C61055Jvt) r4
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
        L_0x00ba:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            boolean r1 = r3.A03
            boolean r0 = r4.A03
            if (r1 != r0) goto L_0x002e
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r4.A00
        L_0x00ca:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0106
            goto L_0x002e
        L_0x00d2:
            r2 = 0
            if (r4 == 0) goto L_0x002f
            r0 = 4
            boolean r0 = A00(r0, r4)
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r3.A01
            X.Jvt r4 = (X.C61055Jvt) r4
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r3.A00
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r4.A00
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002f
            boolean r1 = r3.A03
            boolean r0 = r4.A03
            if (r1 != r0) goto L_0x002f
        L_0x0106:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61055Jvt.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ae, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r1 = r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        return X.DbS.A06(r3.A03, r1 * 31);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0092;
                case 2: goto L_0x0076;
                case 3: goto L_0x0058;
                case 4: goto L_0x0021;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TG.A0E(r0)
        L_0x0017:
            int r1 = r1 + r2
        L_0x0018:
            int r1 = r1 * 31
            boolean r0 = r3.A03
            int r1 = X.DbS.A06(r0, r1)
            return r1
        L_0x0021:
            java.lang.String r0 = r3.A01
            r2 = 0
            int r0 = X.JTR.A0G(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0040
            int r0 = java.util.Arrays.hashCode(r0)
        L_0x0034:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x0017
            int r2 = r0.hashCode()
            goto L_0x0017
        L_0x0040:
            r0 = 0
            goto L_0x0034
        L_0x0042:
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0N(r0, r1)
            goto L_0x0018
        L_0x0058:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x00ad
        L_0x0076:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.String r0 = r3.A01
            int r0 = X.C41845B3m.A00(r0)
            goto L_0x00ad
        L_0x0092:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TE.A0L(r0)
        L_0x00ad:
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61055Jvt.hashCode():int");
    }

    public C61055Jvt(C62608Kif kif, String str, String str2, boolean z) {
        this.A04 = 0;
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = kif;
        this.A03 = z;
    }

    public C61055Jvt(String str, String str2, byte[] bArr, boolean z) {
        this.A04 = 4;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bArr;
        this.A03 = z;
    }

    public C61055Jvt(List list, boolean z, String str, String str2) {
        this.A04 = 5;
        0qQ.A0B(list, 2);
        this.A02 = str;
        this.A00 = list;
        this.A01 = str2;
        this.A03 = z;
    }

    public C61055Jvt(ImageUrl imageUrl, String str, String str2, boolean z) {
        this.A04 = 1;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = imageUrl;
    }

    public C61055Jvt() {
        this.A04 = 3;
        this.A04 = 3;
        this.A04 = 3;
        this.A01 = null;
        this.A02 = null;
        this.A03 = false;
        this.A00 = null;
    }
}
