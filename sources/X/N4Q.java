package X;

import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.user.model.User;
import java.util.List;

public final class N4Q extends AnonymousClass0T0 {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    public N4Q(Object obj, String str, int i, int i2) {
        this.A03 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof N4Q) || ((N4Q) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        r3 = (X.N4Q) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a8, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (X.N4Q) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x0026;
                case 2: goto L_0x0060;
                case 3: goto L_0x0087;
                case 4: goto L_0x008b;
                case 5: goto L_0x0040;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00b2
            r0 = 6
        L_0x0008:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0020
            X.N4Q r3 = (X.N4Q) r3
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0020
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007c
        L_0x0020:
            r0 = 0
            return r0
        L_0x0022:
            if (r2 == r3) goto L_0x00b2
            r0 = 0
            goto L_0x0008
        L_0x0026:
            if (r2 == r3) goto L_0x00b2
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0020
            X.N4Q r3 = (X.N4Q) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00a4
        L_0x0040:
            if (r2 == r3) goto L_0x00b2
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0020
            X.N4Q r3 = (X.N4Q) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0020
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0020
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0080
        L_0x0060:
            if (r2 == r3) goto L_0x00b2
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0020
            X.N4Q r3 = (X.N4Q) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0020
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x007c
            goto L_0x0020
        L_0x007c:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x0080:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0020
        L_0x0087:
            if (r2 == r3) goto L_0x00b2
            r0 = 3
            goto L_0x008e
        L_0x008b:
            if (r2 == r3) goto L_0x00b2
            r0 = 4
        L_0x008e:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0020
            X.N4Q r3 = (X.N4Q) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x00a4:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0020
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00b2
            goto L_0x0020
        L_0x00b2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4Q.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        r1 = (r2 + r1) * 31;
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return r2 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r1 = (r1 + r0) * 31;
        r2 = r3.A02.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x001a;
                case 1: goto L_0x0025;
                case 2: goto L_0x0032;
                case 3: goto L_0x0044;
                case 4: goto L_0x0053;
                case 5: goto L_0x0065;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r3.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A02
            int r1 = X.C41845B3m.A00(r0)
        L_0x0018:
            int r2 = r2 + r1
            return r2
        L_0x001a:
            int r0 = r3.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            goto L_0x003a
        L_0x0025:
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TG.A0E(r0)
            goto L_0x005f
        L_0x0032:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            int r0 = r3.A00
        L_0x003a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r2 = r0.hashCode()
            goto L_0x0018
        L_0x0044:
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x005f
        L_0x0053:
            java.lang.String r0 = r3.A02
            int r2 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A01
            int r1 = r0.hashCode()
        L_0x005f:
            int r2 = r2 + r1
            int r1 = r2 * 31
            int r2 = r3.A00
            goto L_0x0018
        L_0x0065:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = r0.hashCode()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4Q.hashCode():int");
    }

    public final String toString() {
        if (1 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RecommendedUserRowLoggingItem(user=");
        A1A.append(this.A01);
        A1A.append(", uuid=");
        A1A.append(this.A02);
        A1A.append(", position=");
        return C51975G9x.A0j(A1A, this.A00);
    }

    public N4Q(User user, String str, int i) {
        this.A03 = 1;
        this.A01 = user;
        this.A02 = str;
        this.A00 = i;
    }

    public N4Q(View.OnClickListener onClickListener, String str, int i) {
        this.A03 = 5;
        this.A02 = str;
        this.A00 = i;
        this.A01 = onClickListener;
    }

    public N4Q(C270194gL r2, String str, int i) {
        this.A03 = 2;
        AnonymousClass7TG.A1P(r2, str);
        this.A01 = r2;
        this.A00 = i;
        this.A02 = str;
    }

    public N4Q(Medium medium, String str, int i) {
        this.A03 = 4;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = medium;
        this.A00 = i;
    }

    public N4Q(List list, int i, String str) {
        this.A03 = 0;
        0qQ.A0B(str, 3);
        this.A00 = i;
        this.A01 = list;
        this.A02 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4Q(String str) {
        this((Object) null, str, 2131972184, 6);
        this.A03 = 6;
    }
}
