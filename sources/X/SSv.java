package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;

public final class SSv {
    public final Point A00;
    public final AnonymousClass3Q2 A01;
    public final Context A02;
    public final UserSession A03;
    public final ClipInfo A04;
    public final C10763Rxh A05;

    private int A00() {
        float min;
        double d;
        Point point = this.A00;
        int i = point.x;
        int i2 = point.y;
        String str = this.A04.A0E;
        Context context = this.A02;
        float f = this.A01.A02;
        boolean A1S = AnonymousClass7TF.A1S(i, 1080);
        UserSession userSession = this.A03;
        Point A012 = AEW.A01(context, userSession, f, C63472Kxb.A00(context, userSession, Integer.MAX_VALUE, A1S, false));
        C10763Rxh rxh = this.A05;
        float f2 = (float) rxh.A04;
        float f3 = ((float) i) / ((float) i2);
        if (((double) f3) < rxh.A00) {
            if (i2 < i) {
                min = Math.min(Math.max((f3 - 1.0f) / 0.7777778f, 0.0f), 1.0f);
                d = rxh.A02;
            } else if (i2 > i) {
                min = Math.min(Math.max((f3 - 1.0f) / -0.4375f, 0.0f), 1.0f);
                d = rxh.A03;
            }
            f2 += min * (((float) d) - f2);
        }
        if ("boomerang".equals(str)) {
            f2 = (float) (((double) f2) * rxh.A01);
        }
        return Math.max(AnonymousClass7TE.A05((float) (A012.x * A012.y), f2), AnonymousClass7TE.A05((float) (i * i2), f2));
    }

    public static SSv A01(Context context, UserSession userSession, AnonymousClass3Q2 r10, boolean z) {
        boolean z2;
        Point A002;
        long j;
        boolean z3 = r10.A60;
        boolean z4 = r10.A61;
        boolean A1V = AnonymousClass7TF.A1V(r10.A1K);
        if (z3 && (A1V || z4)) {
            0qg.A01();
            long A003 = 0qg.A00(context, false);
            0Tu r3 = 0Tu.A05;
            if (182.A01(r3, userSession, 36601646872400146L) * 1048576 <= A003) {
                if (r10.A0r != null) {
                    j = 36319587779812871L;
                } else {
                    j = 36320171895431246L;
                }
                z2 = 182.A06(r3, userSession, j);
                A002 = AEW.A00(r10.A02, C63472Kxb.A00(context, userSession, r10.A1N.A09, z, z2));
                if (A002.x <= 0 || A002.y <= 0) {
                    0f9 AEf = 0wj.A01.AEf("NEGATIVE_RENDER_SIZE", 817901174);
                    AEf.ABQ("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for portrait surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A002, r10)));
                    AEf.report();
                }
                return new SSv(context, A002, userSession, r10);
            }
        }
        z2 = false;
        A002 = AEW.A00(r10.A02, C63472Kxb.A00(context, userSession, r10.A1N.A09, z, z2));
        0f9 AEf2 = 0wj.A01.AEf("NEGATIVE_RENDER_SIZE", 817901174);
        AEf2.ABQ("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for portrait surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A002, r10)));
        AEf2.report();
        return new SSv(context, A002, userSession, r10);
    }

    public static SSv A02(Context context, UserSession userSession, AnonymousClass3Q2 r11, boolean z, boolean z2) {
        boolean z3;
        Point A002;
        long j;
        if (!z) {
            return A01(context, userSession, r11, z2);
        }
        boolean z4 = r11.A60;
        boolean z5 = r11.A61;
        boolean A1V = AnonymousClass7TF.A1V(r11.A1K);
        if (z4 && (A1V || z5)) {
            0qg.A01();
            long A003 = 0qg.A00(context, false);
            0Tu r4 = 0Tu.A05;
            if (182.A01(r4, userSession, 36601646872400146L) * 1048576 <= A003) {
                if (r11.A0r != null) {
                    j = 36319587779812871L;
                } else {
                    j = 36320171895431246L;
                }
                z3 = 182.A06(r4, userSession, j);
                A002 = AEW.A00(r11.A02, (C63472Kxb.A00(context, userSession, r11.A1N.A09, false, z3) * 16) / 9);
                if (A002.x <= 0 || A002.y <= 0) {
                    0f9 AEf = 0wj.A01.AEf("NEGATIVE_RENDER_SIZE", 817901174);
                    AEf.ABQ("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for landscape surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A002, r11)));
                    AEf.report();
                }
                return new SSv(context, A002, userSession, r11);
            }
        }
        z3 = false;
        A002 = AEW.A00(r11.A02, (C63472Kxb.A00(context, userSession, r11.A1N.A09, false, z3) * 16) / 9);
        0f9 AEf2 = 0wj.A01.AEf("NEGATIVE_RENDER_SIZE", 817901174);
        AEf2.ABQ("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for landscape surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A002, r11)));
        AEf2.report();
        return new SSv(context, A002, userSession, r11);
    }

    public static Object[] A03(Point point, AnonymousClass3Q2 r8) {
        Integer valueOf = Integer.valueOf(point.x);
        Integer valueOf2 = Integer.valueOf(point.y);
        String str = r8.A3t;
        Integer valueOf3 = Integer.valueOf(r8.A0K);
        String str2 = r8.A2V;
        ClipInfo clipInfo = r8.A1N;
        return new Object[]{valueOf, valueOf2, str, valueOf3, str2, Integer.valueOf(clipInfo.A09), Integer.valueOf(clipInfo.A06)};
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Object, X.V5i] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final int A04() {
        /*
            r13 = this;
            com.instagram.pendingmedia.model.ClipInfo r4 = r13.A04
            long r5 = r4.A0A
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0190
            long r2 = r4.A00()
            r0 = 8000(0x1f40, double:3.9525E-320)
            long r2 = r2 * r0
            long r0 = r4.A0A
            long r2 = r2 / r0
            int r7 = (int) r2
        L_0x0015:
            X.3Q2 r6 = r13.A01
            boolean r0 = r6.A0v()
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r3 = r13.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36591931655979073(0x82002b00000041, double:3.204223150898746E-306)
        L_0x0026:
            int r5 = X.Pxg.A05(r2, r3, r0)
        L_0x002a:
            return r5
        L_0x002b:
            boolean r0 = r6.A0x()
            if (r0 != 0) goto L_0x003f
            com.instagram.pendingmedia.model.constants.ShareType r1 = r6.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            if (r1 != r0) goto L_0x0049
            X.1iA r1 = r6.A1G
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x0049
        L_0x003f:
            com.instagram.common.session.UserSession r3 = r13.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36592717634994847(0x8200e20000029f, double:3.204720207193205E-306)
            goto L_0x0026
        L_0x0049:
            int r5 = r13.A00()
            boolean r0 = r6.A5V
            if (r0 == 0) goto L_0x0153
            com.instagram.pendingmedia.model.constants.ShareType r1 = r6.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            if (r1 == r0) goto L_0x0153
            android.content.Context r3 = r13.A02
            X.AnonymousClass0Ke.A00(r3)
            com.instagram.common.session.UserSession r2 = r13.A03
            X.0Tu r8 = X.0Tu.A05
            r0 = 36594070550021699(0x82021d00050643, double:3.2055757961039375E-306)
            int r0 = X.Pxg.A05(r8, r2, r0)
            if (r0 <= 0) goto L_0x006e
            return r0
        L_0x006e:
            r0 = 36594070549890626(0x82021d00030642, double:3.2055757960210464E-306)
            int r0 = X.Pxg.A05(r8, r2, r0)
            int r5 = r5 * r0
            int r5 = r5 / 100
            android.graphics.Point r0 = r13.A00
            int r12 = r0.x
            int r9 = r0.y
            r0 = 2342155604786676931(0x2081021d000004c3, double:4.059307554226866E-152)
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x0153
            r0 = 36875545526468679(0x83021d00010047, double:3.383581704617764E-306)
            java.lang.String r11 = X.182.A04(r8, r2, r0)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x00a5
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131886193(0x7f120071, float:1.9406958E38)
            java.lang.String r11 = X.C9874Rin.A00(r1, r0)
        L_0x00a5:
            int r1 = r4.A05
            int r0 = r4.A07
            int r1 = r1 - r0
            X.VXH r10 = new X.VXH
            r10.<init>(r12, r9, r1)
            X.0xN r0 = X.C60510iO.A00(r2)
            X.0kZ r2 = new X.0kZ
            r2.<init>(r0)
            android.content.Context r0 = r3.getApplicationContext()
            X.0kX r1 = new X.0kX
            r1.<init>(r0)
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            X.V5i r0 = new X.V5i
            r0.<init>()
            X.Vs4 r8 = new X.Vs4
            r8.<init>(r0, r2, r1)
            monitor-enter(r9)
            java.lang.Object r4 = r9.get(r11)     // Catch:{ all -> 0x0198 }
            X.TiQ r4 = (X.C13848TiQ) r4     // Catch:{ all -> 0x0198 }
            monitor-exit(r9)     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x012a
            java.lang.System.currentTimeMillis()
            X.S7E r3 = new X.S7E
            r3.<init>(r11)
            java.lang.String r1 = r3.A02     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            java.lang.String r0 = "\"version\":"
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = "\"cctype\":\"dense\""
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            if (r0 == 0) goto L_0x0101
            X.UIM r2 = X.C18093VlN.A00(r1)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            X.0kX r1 = r8.A02     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            X.X5t r0 = r8.A01     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            X.UII r4 = new X.UII     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            r4.<init>(r3, r0, r2, r1)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            goto L_0x0125
        L_0x0101:
            java.lang.String r0 = "\"cctype\":\"table\""
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            if (r0 == 0) goto L_0x0117
            X.UIN r2 = X.C18093VlN.A01(r1)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            X.0kX r1 = r8.A02     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            X.X5t r0 = r8.A01     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            X.UIJ r4 = new X.UIJ     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            r4.<init>((X.S7E) r3, (X.X5t) r0, (X.UIN) r2, (X.0kX) r1)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            goto L_0x0125
        L_0x0117:
            X.TiQ r4 = X.C18456Vs4.A00(r3, r8)     // Catch:{ IOException -> 0x0121, V1q -> 0x011c }
            goto L_0x0125
        L_0x011c:
            X.TiQ r4 = X.C18456Vs4.A00(r3, r8)     // Catch:{ all -> 0x0196 }
            goto L_0x0125
        L_0x0121:
            X.TiQ r4 = X.C18456Vs4.A00(r3, r8)     // Catch:{ all -> 0x0196 }
        L_0x0125:
            monitor-enter(r9)
            r9.put(r11, r4)     // Catch:{ all -> 0x0193 }
            monitor-exit(r9)     // Catch:{ all -> 0x0193 }
        L_0x012a:
            X.RrL r3 = r4.EIR(r10)     // Catch:{ V1q -> 0x012f }
            goto L_0x0135
        L_0x012f:
            r0 = 0
            X.RrL r3 = new X.RrL
            r3.<init>(r4, r0)
        L_0x0135:
            java.lang.String r8 = "min_bitrate"
            r1 = 0
            X.W2K[] r4 = r3.A01
            if (r4 == 0) goto L_0x014b
            X.TiQ r3 = r3.A00
            int r0 = r3.BaR(r8)
            if (r0 >= 0) goto L_0x017e
            java.lang.String r0 = "Requested param not found"
            r3.EGM(r8, r0)
        L_0x014b:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            int r0 = (int) r1
            int r5 = java.lang.Math.max(r0, r5)
        L_0x0153:
            if (r7 <= 0) goto L_0x002a
            boolean r0 = r6.A5V
            if (r0 == 0) goto L_0x019b
            int r1 = java.lang.Math.min(r5, r7)
            int r0 = r13.A00()
            int r5 = java.lang.Math.max(r1, r0)
            com.instagram.pendingmedia.model.constants.ShareType r1 = r6.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            if (r1 != r0) goto L_0x002a
            com.instagram.common.session.UserSession r3 = r13.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36593954585576993(0x82020200000621, double:3.205502459722154E-306)
            int r0 = X.Pxg.A05(r2, r3, r0)
            int r5 = r5 * r0
            int r5 = r5 / 100
            return r5
        L_0x017e:
            r0 = r4[r0]
            if (r0 == 0) goto L_0x014b
            long r1 = r0.A01()     // Catch:{ V1q -> 0x0187 }
            goto L_0x014b
        L_0x0187:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r3.EGM(r8, r0)
            goto L_0x014b
        L_0x0190:
            r7 = -1
            goto L_0x0015
        L_0x0193:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0193 }
            throw r0
        L_0x0196:
            r0 = move-exception
            throw r0
        L_0x0198:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0198 }
            throw r0
        L_0x019b:
            float r1 = (float) r7
            r0 = 1067030938(0x3f99999a, float:1.2)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = java.lang.Math.min(r5, r0)
            r0 = 200000(0x30d40, float:2.8026E-40)
            int r5 = java.lang.Math.max(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSv.A04():int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Rxh, java.lang.Object] */
    public SSv(Context context, Point point, UserSession userSession, AnonymousClass3Q2 r7) {
        double d;
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = r7;
        this.A04 = r7.A1N;
        this.A00 = point;
        ? obj = new Object();
        if (r7.A5V || r7.A5D) {
            d = 2.2d;
        } else {
            d = 7.0d;
        }
        obj.A04 = d;
        obj.A03 = d;
        obj.A02 = 9.722200393676758d;
        obj.A01 = 1.2999999523162842d;
        obj.A00 = 100000.0d;
        this.A05 = obj;
    }

    public SSv() {
    }
}
