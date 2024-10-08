package X;

import com.instagram.user.model.User;
import java.util.List;

public final class F2g {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public final User A04;
    public final List A05;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1 <= 2500) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.A05
            int r3 = r0.size()
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x001e
            r2 = 50
        L_0x000c:
            if (r3 > r2) goto L_0x0019
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L_0x0019
            r4.A00 = r3
            int r0 = r3 + 1
        L_0x0016:
            r4.A01 = r0
            return
        L_0x0019:
            r4.A00 = r2
            int r0 = r2 + 2
            goto L_0x0016
        L_0x001e:
            if (r5 == 0) goto L_0x002f
            int r1 = X.0nA.A05(r5)
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r1 >= r0) goto L_0x002a
            r2 = 3
            goto L_0x000c
        L_0x002a:
            r0 = 2500(0x9c4, float:3.503E-42)
            r2 = 7
            if (r1 > r0) goto L_0x000c
        L_0x002f:
            r2 = 5
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F2g.A00(android.content.Context):void");
    }

    public F2g(User user, String str, List list) {
        this.A04 = user;
        this.A05 = list;
        this.A02 = str;
    }
}
