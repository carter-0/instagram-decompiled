package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7yI  reason: invalid class name and case insensitive filesystem */
public final class C348347yI implements AnonymousClass85D {
    public final C358348al A00;
    public final AnonymousClass86T A01;
    public final AnonymousClass85B A02;
    public final AnonymousClass85C A03;
    public final UserSession A04;

    public C348347yI(AnonymousClass86T r2, AnonymousClass85B r3, AnonymousClass85C r4, C358348al r5, UserSession userSession) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r5;
        this.A04 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CmT(com.instagram.camera.effect.models.CameraAREffect r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.8al r2 = r6.A00
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Set r0 = r7.A0b
            java.util.Iterator r5 = r0.iterator()
        L_0x0011:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x005c
            java.util.Map r1 = X.C358348al.A01
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r0 = r4.toLowerCase(r0)
            X.0qQ.A07(r0)
            java.lang.Object r1 = r1.get(r0)
        L_0x0033:
            X.8al r0 = X.C358348al.PRECAPTURE_VIDEO
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            X.8al r1 = X.C358348al.PRECAPTURE_PHOTO
        L_0x003d:
            r3.add(r1)
        L_0x0040:
            X.8al r0 = X.C358348al.LIVE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0011
            X.8al r0 = X.C358348al.VIDEO_CALL
            r3.add(r0)
            goto L_0x0011
        L_0x004e:
            X.8al r0 = X.C358348al.POSTCAPTURE_VIDEO
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0059
            X.8al r1 = X.C358348al.POSTCAPTURE_PHOTO
            goto L_0x003d
        L_0x0059:
            if (r1 == 0) goto L_0x0040
            goto L_0x003d
        L_0x005c:
            r1 = 0
            goto L_0x0033
        L_0x005e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x006a
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x009e
        L_0x006a:
            r3 = 1
            r4 = 0
            java.lang.Integer r1 = r7.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x009e
            java.lang.String r1 = com.instagram.camera.effect.models.CameraAREffect.A00(r1)
            java.lang.String r0 = "SUPERZOOMV3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009e
            java.lang.Integer r0 = r7.A09
            java.lang.String r1 = com.instagram.camera.effect.models.CameraAREffect.A00(r0)
            java.lang.String r0 = "FOCUSV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009e
            java.lang.String r1 = r7.A0K
            java.util.Set r0 = X.C348357yJ.A00
            boolean r0 = X.00k.A0u(r0, r1)
            if (r0 != 0) goto L_0x009e
            X.8al r0 = X.C358348al.LIVE
            if (r2 != r0) goto L_0x00a0
            boolean r0 = r7.A0f
            if (r0 == 0) goto L_0x00a0
        L_0x009e:
            r4 = 1
        L_0x009f:
            return r4
        L_0x00a0:
            X.86T r2 = r6.A01
            java.lang.String r1 = r7.A0K
            X.4x5 r0 = X.C278544x5.A06
            X.C278544x5.A00(r0, r3)
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00b6
            java.util.Set r0 = r2.A00
            boolean r0 = X.00k.A0u(r0, r1)
            if (r0 == 0) goto L_0x00b6
            goto L_0x009e
        L_0x00b6:
            X.85C r0 = r6.A03
            if (r0 == 0) goto L_0x009f
            boolean r0 = r0.CmT(r7)
            if (r0 != r3) goto L_0x009f
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348347yI.CmT(com.instagram.camera.effect.models.CameraAREffect):boolean");
    }
}
