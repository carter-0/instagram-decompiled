package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.80d  reason: invalid class name and case insensitive filesystem */
public final class C3493780d {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;

    public C3493780d(Context context, UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
        this.A00 = z;
        this.A01 = z2;
    }

    public final C3494580l A00(28D r3, AnonymousClass80H r4, C279284yO r5, Map map) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(map, 2);
        if (!A01(r3, r4).contains(r5)) {
            return C3494580l.A03;
        }
        C3494480k r0 = (C3494480k) map.get(r5);
        if (r0 != null) {
            C3494580l r1 = (C3494580l) ((Pair) r0.A01.A00).second;
            r1.A02(r4.A01);
            return r1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown destination: ");
        sb.append(r5);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A03, 36324462567829609L) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010e, code lost:
        if (r3 == 3) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012b, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A03, 2342153435828191290L) == false) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashSet A01(X.28D r9, X.AnonymousClass80H r10) {
        /*
            r8 = this;
            X.28D r0 = X.28D.A2T
            if (r9 == r0) goto L_0x0110
            X.28D r0 = X.28D.A2S
            if (r9 == r0) goto L_0x0110
            X.28D r0 = X.28D.A2K
            if (r9 == r0) goto L_0x0110
            X.28D r0 = X.28D.A03
            if (r9 == r0) goto L_0x0110
            X.28D r0 = X.28D.A04
            if (r9 == r0) goto L_0x0110
            X.28D r0 = X.28D.A2D
            if (r9 == r0) goto L_0x0110
            X.28D r0 = X.28D.A5B
            if (r9 == r0) goto L_0x00e3
            com.instagram.common.session.UserSession r3 = r8.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324462567829609(0x810ce800033069, double:3.035074622541454E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00e3
        L_0x002b:
            X.81K r5 = X.AnonymousClass81K.A00
        L_0x002d:
            X.81M r0 = X.AnonymousClass81M.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0087
            r0 = 8
            X.4yO[] r2 = new X.C279284yO[r0]
            X.8jC r1 = X.C363138jC.A00
            r0 = 0
            r2[r0] = r1
            X.9QA r1 = X.AnonymousClass9QA.A00
            r0 = 1
            r2[r0] = r1
            X.80N r1 = X.AnonymousClass80N.A00
            r0 = 2
            r2[r0] = r1
            X.80M r6 = X.AnonymousClass80M.A00
            r0 = 3
            r2[r0] = r6
            X.80L r7 = X.AnonymousClass80L.A00
            r0 = 4
            r2[r0] = r7
            X.80f r1 = X.C3493980f.A00
            r0 = 5
            r2[r0] = r1
            X.80g r1 = X.C3494080g.A00
            r0 = 6
            r2[r0] = r1
            X.80h r1 = X.C3494180h.A00
            r0 = 7
        L_0x005f:
            r2[r0] = r1
            java.util.List r0 = X.0sr.A1P(r2)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r0)
            java.util.Iterator r2 = r4.iterator()
            X.0qQ.A07(r2)
        L_0x0071:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0114
            java.util.Set r1 = r10.A00
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0071
            r2.remove()
            goto L_0x0071
        L_0x0087:
            X.81N r0 = X.AnonymousClass81N.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00a5
            X.81K r0 = X.AnonymousClass81K.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00a5
            X.9Pp r0 = X.C378389Pp.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00a5
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00a5:
            r0 = 11
            X.4yO[] r2 = new X.C279284yO[r0]
            X.80J r1 = X.AnonymousClass80J.A00
            r0 = 0
            r2[r0] = r1
            X.80K r1 = X.AnonymousClass80K.A00
            r0 = 1
            r2[r0] = r1
            X.8jC r1 = X.C363138jC.A00
            r0 = 2
            r2[r0] = r1
            X.9QA r1 = X.AnonymousClass9QA.A00
            r0 = 3
            r2[r0] = r1
            X.80N r1 = X.AnonymousClass80N.A00
            r0 = 4
            r2[r0] = r1
            X.80e r1 = X.C3493880e.A00
            r0 = 5
            r2[r0] = r1
            X.80L r7 = X.AnonymousClass80L.A00
            r0 = 6
            r2[r0] = r7
            X.80f r1 = X.C3493980f.A00
            r0 = 7
            r2[r0] = r1
            X.80M r6 = X.AnonymousClass80M.A00
            r0 = 8
            r2[r0] = r6
            X.80g r1 = X.C3494080g.A00
            r0 = 9
            r2[r0] = r1
            X.80h r1 = X.C3494180h.A00
            r0 = 10
            goto L_0x005f
        L_0x00e3:
            com.instagram.common.session.UserSession r3 = r8.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36605937544467801(0x820ce800021559, double:3.2130805311762036E-306)
            long r3 = X.182.A01(r2, r3, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002b
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            X.81M r5 = X.AnonymousClass81M.A00
            goto L_0x002d
        L_0x0100:
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x010a
            X.81N r5 = X.AnonymousClass81N.A00
            goto L_0x002d
        L_0x010a:
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
        L_0x0110:
            X.9Pp r5 = X.C378389Pp.A00
            goto L_0x002d
        L_0x0114:
            android.content.Context r0 = r8.A02
            int r1 = X.AnonymousClass0Ke.A00(r0)
            r0 = 2011(0x7db, float:2.818E-42)
            if (r1 < r0) goto L_0x012d
            com.instagram.common.session.UserSession r3 = r8.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342153435828191290(0x208100240000003a, double:4.057468461418627E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0130
        L_0x012d:
            r4.remove(r7)
        L_0x0130:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0137
            r4.remove(r6)
        L_0x0137:
            com.instagram.common.session.UserSession r3 = r8.A03
            java.lang.Boolean r0 = X.AnonymousClass39V.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0148
            X.80K r0 = X.AnonymousClass80K.A00
            r4.remove(r0)
        L_0x0148:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324230639398802(0x810cb200002f92, double:3.034927950067911E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x015a
            X.80J r0 = X.AnonymousClass80J.A00
            r4.remove(r0)
        L_0x015a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3493780d.A01(X.28D, X.80H):java.util.LinkedHashSet");
    }
}
