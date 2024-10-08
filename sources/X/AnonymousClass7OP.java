package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7OP  reason: invalid class name */
public final class AnonymousClass7OP {
    public final UserSession A00;
    public final HashSet A01 = new HashSet();

    public AnonymousClass7OP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r3 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r3.length() == 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r8.equals("https://www.facebook.com/") != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r2 = X.0wj.A01.AEf("invalid clip xma media id", 817891009);
        r2.ERJ(new java.lang.RuntimeException(X.002.A0R("no valid media id provided when fetch: ", r8)));
        r2.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        if (r3 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r3.length() == 0) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        if (X.1E7.A00(r6).A02(r3) != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        r1 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        if (r1.contains(r3) != false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r1.add(r3);
        r7.put(r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r12) {
        /*
            r11 = this;
            r5 = 0
            java.lang.String r1 = "ClipMediaPrefetchUtil.maybeFetchClipMediasForMessages"
            r0 = 360448994(0x157c03e2, float:5.0894058E-26)
            X.0fh.A01(r1, r0)
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0117 }
            r7.<init>()     // Catch:{ all -> 0x0117 }
            java.util.Iterator r10 = r12.iterator()     // Catch:{ all -> 0x0117 }
        L_0x0012:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x0117 }
            X.3su r4 = (X.C254703su) r4     // Catch:{ all -> 0x0117 }
            com.instagram.common.session.UserSession r6 = r11.A00     // Catch:{ all -> 0x0117 }
            java.util.List r1 = A00(r6, r4)     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x0012
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x0012
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x0117 }
            X.3tC r0 = (X.C254873tC) r0     // Catch:{ all -> 0x0117 }
            java.lang.String r8 = r0.A0u     // Catch:{ all -> 0x0117 }
            if (r8 == 0) goto L_0x0012
            int r0 = r8.length()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0012
            android.net.Uri r9 = X.0cp.A03(r8)     // Catch:{ all -> 0x0117 }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x0117 }
            java.util.List r2 = r9.getPathSegments()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "id"
            java.lang.String r3 = r9.getQueryParameter(r0)     // Catch:{ all -> 0x0117 }
            if (r3 != 0) goto L_0x0055
            java.lang.String r0 = "target_media_igid"
            java.lang.String r3 = r9.getQueryParameter(r0)     // Catch:{ all -> 0x0117 }
        L_0x0055:
            r1 = 0
            int r0 = r2.size()     // Catch:{ all -> 0x0117 }
            r2 = 1
            if (r0 <= r2) goto L_0x0067
            java.util.List r0 = r9.getPathSegments()     // Catch:{ all -> 0x0117 }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ all -> 0x0117 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0117 }
        L_0x0067:
            if (r3 == 0) goto L_0x006f
            int r0 = r3.length()     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x007d
        L_0x006f:
            if (r1 == 0) goto L_0x007b
            int r0 = r1.length()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r3 = X.C70282O0m.A00(r1)     // Catch:{ all -> 0x0117 }
        L_0x007b:
            if (r3 == 0) goto L_0x0083
        L_0x007d:
            int r0 = r3.length()     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x00a9
        L_0x0083:
            java.lang.String r0 = "https://www.facebook.com/"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x00a7
            X.0wj r2 = X.0wj.A01     // Catch:{ all -> 0x0117 }
            r1 = 817891009(0x30c006c1, float:1.3971758E-9)
            java.lang.String r0 = "invalid clip xma media id"
            X.0f9 r2 = r2.AEf(r0, r1)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "no valid media id provided when fetch: "
            java.lang.String r1 = X.002.A0R(r0, r8)     // Catch:{ all -> 0x0117 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0117 }
            r0.<init>(r1)     // Catch:{ all -> 0x0117 }
            r2.ERJ(r0)     // Catch:{ all -> 0x0117 }
            r2.report()     // Catch:{ all -> 0x0117 }
        L_0x00a7:
            if (r3 == 0) goto L_0x0012
        L_0x00a9:
            int r0 = r3.length()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0012
            X.1E8 r0 = X.1E7.A00(r6)     // Catch:{ all -> 0x0117 }
            X.1Xj r0 = r0.A02(r3)     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x0012
            java.util.HashSet r1 = r11.A01     // Catch:{ all -> 0x0117 }
            boolean r0 = r1.contains(r3)     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x0012
            r1.add(r3)     // Catch:{ all -> 0x0117 }
            r7.put(r3, r4)     // Catch:{ all -> 0x0117 }
            goto L_0x0012
        L_0x00c9:
            com.instagram.common.session.UserSession r6 = r11.A00     // Catch:{ all -> 0x0117 }
            java.util.Set r4 = r7.keySet()     // Catch:{ all -> 0x0117 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0117 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x0110
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x0117 }
            r2.<init>()     // Catch:{ all -> 0x0117 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x0117 }
        L_0x00e1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0117 }
            r2.put(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x00e1
        L_0x00ef:
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0117 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0117 }
            int r0 = r1.length()     // Catch:{ all -> 0x0117 }
            r3 = 1
            if (r0 == 0) goto L_0x0110
            r0 = 0
            X.1OC r2 = X.AnonymousClass93V.A03(r0, r6, r1)     // Catch:{ all -> 0x0117 }
            X.73d r0 = new X.73d     // Catch:{ all -> 0x0117 }
            r0.<init>(r6, r11, r7, r4)     // Catch:{ all -> 0x0117 }
            r2.A00 = r0     // Catch:{ all -> 0x0117 }
            r1 = 1368380687(0x518fd50f, float:7.7219357E10)
            r0 = 2
            X.1ES.A05(r2, r1, r0, r3, r5)     // Catch:{ all -> 0x0117 }
        L_0x0110:
            r0 = 458106308(0x1b4e25c4, float:1.7052123E-22)
            X.0fh.A00(r0)
            return
        L_0x0117:
            r1 = move-exception
            r0 = 145746882(0x8afebc2, float:1.0587856E-33)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7OP.A01(java.util.List):void");
    }

    public static final List A00(UserSession userSession, C254703su r5) {
        boolean A06 = 182.A06(0Tu.A05, userSession, 36322924969339569L);
        if (AnonymousClass48R.A01(r5.A1F) && A06) {
            return null;
        }
        2FW r0 = r5.A10;
        2FW r3 = 2FW.A1p;
        if (r0 != r3) {
            C254933tI A0P = r5.A0P();
            if (A0P == null || A0P.A0F != r3 || (A0P.A05() && A06)) {
                return null;
            }
            return A0P.A01();
        } else if (r5.A1S() && A06) {
            return null;
        } else {
            Object obj = r5.A1T;
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.model.GenericFBAttachment>");
            return (List) obj;
        }
    }
}
