package X;

import android.graphics.Point;
import com.instagram.common.session.UserSession;

public final class LS5 {
    public static final LS5 A00;
    public static final String A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.LS5, java.lang.Object] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C51968G9o.A16(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36315473202580719L) == false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Point A00(android.graphics.Point r6, com.instagram.common.session.UserSession r7, int r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L_0x0044
            int r1 = X.LTE.A01(r7)
            int r0 = r6.x
            if (r0 >= r1) goto L_0x001a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315473202580719(0x8104bb00170cef, double:3.0293897117607875E-306)
            boolean r1 = X.182.A06(r2, r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0044
            int r3 = X.LTE.A01(r7)
        L_0x0021:
            int r0 = r6.y
            int r0 = r0 * r3
            float r1 = (float) r0
            int r0 = r6.x
            float r0 = (float) r0
            float r1 = r1 / r0
            float r1 = r1 + r5
            int r2 = (int) r1
            if (r9 != 0) goto L_0x008a
            float r1 = (float) r3
            float r0 = (float) r2
            float r1 = r1 / r0
            r0 = 0
            boolean r0 = X.C64138LPn.A02(r0, r1, r11)
            if (r0 != 0) goto L_0x008a
            java.lang.String r1 = "Output aspect ratio error: "
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = X.002.A0J(r1, r0, r3, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0044:
            int r0 = r6.x
            r4 = 1440(0x5a0, float:2.018E-42)
            if (r0 >= r4) goto L_0x0062
            if (r8 <= r0) goto L_0x0062
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310349305085979(0x8100120000001b, double:3.026149338352835E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0062
            r3 = 1440(0x5a0, float:2.018E-42)
        L_0x005b:
            if (r4 <= r8) goto L_0x005e
            r3 = r8
        L_0x005e:
            java.lang.Class<X.LTE> r2 = X.LTE.class
            monitor-enter(r2)
            goto L_0x0070
        L_0x0062:
            int r3 = r6.x
            if (r3 >= r4) goto L_0x007b
            if (r8 <= r3) goto L_0x007b
            if (r10 == 0) goto L_0x007b
            int r4 = X.LTE.A01(r7)
            r3 = r4
            goto L_0x005b
        L_0x0070:
            r1 = 320(0x140, float:4.48E-43)
            int r0 = X.LTE.A01(r7)     // Catch:{ all -> 0x0090 }
            int r3 = X.1WJ.A00(r3, r1, r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0088
        L_0x007b:
            java.lang.Class<X.LTE> r2 = X.LTE.class
            monitor-enter(r2)
            r1 = 320(0x140, float:4.48E-43)
            int r0 = X.LTE.A01(r7)     // Catch:{ all -> 0x0090 }
            int r3 = X.1WJ.A00(r3, r1, r0)     // Catch:{ all -> 0x0090 }
        L_0x0088:
            monitor-exit(r2)
            goto L_0x0021
        L_0x008a:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            return r0
        L_0x0090:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LS5.A00(android.graphics.Point, com.instagram.common.session.UserSession, int, boolean, boolean, boolean, boolean):android.graphics.Point");
    }

    public static final Point A01(Point point, UserSession userSession, boolean z) {
        int i;
        int i2;
        if (!z || point.x >= LTE.A01(userSession) || !182.A06(0Tu.A05, userSession, 36315473202580719L)) {
            i = point.x;
            i2 = point.y;
        } else {
            i = LTE.A01(userSession);
            i2 = (int) ((((float) (point.y * i)) / ((float) point.x)) + 0.5f);
        }
        return new Point(i, i2);
    }
}
