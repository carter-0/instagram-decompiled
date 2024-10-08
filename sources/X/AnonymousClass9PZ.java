package X;

import android.view.ViewGroup;

/* renamed from: X.9PZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9PZ implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ AnonymousClass9PY A01;

    public /* synthetic */ AnonymousClass9PZ(ViewGroup viewGroup, AnonymousClass9PY r2) {
        this.A01 = r2;
        this.A00 = viewGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007d, code lost:
        if (r1 != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.9PY r3 = r13.A01
            android.view.ViewGroup r5 = r13.A00
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0133
            X.80D r2 = X.AnonymousClass80D.A00()
            r1 = 4
            X.WUP r0 = new X.WUP
            r0.<init>(r3, r1)
            r0.getClass()
            r2.A0l = r0
            com.instagram.common.session.UserSession r0 = r3.A05
            r0.getClass()
            r2.A0S = r0
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r2.A05 = r0
            r2.A0M = r3
            com.instagram.common.session.UserSession r4 = r3.A05
            r10 = 1
            X.80M r6 = X.AnonymousClass80M.A00
            r11 = 0
            X.4yO[] r1 = new X.C279284yO[]{r6}
            X.80I r0 = X.AnonymousClass80H.A02
            X.80H r0 = r0.A01(r4, r1)
            r0.getClass()
            r2.A0W = r0
            r4 = 1
            r2.A3h = r10
            X.2k2 r0 = r3.volumeKeyPressController
            r2.A0R = r0
            X.80C r0 = r3.A08
            r0.getClass()
            r2.A0t = r0
            r5.getClass()
            r2.A09 = r5
            X.28D r0 = r3.A02
            r2.A0B = r0
            r2.A0O = r3
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r3.A0A
            r2.A1I = r0
            boolean r0 = r3.A0M
            r5 = 0
            if (r0 == 0) goto L_0x013d
            java.lang.String r8 = r3.A0F
            X.A6k r0 = r3.A09
            r0.getClass()
            com.instagram.model.mediasize.ImageInfo r7 = r0.A00
        L_0x0066:
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x0071
            X.A6k r0 = r3.A09
            r0.getClass()
            java.lang.String r5 = r0.A01
        L_0x0071:
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x007f
            X.A6k r0 = r3.A09
            r0.getClass()
            boolean r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L_0x0080
        L_0x007f:
            r0 = 1
        L_0x0080:
            r1 = 0
            r2.A2q = r8
            r2.A1K = r7
            r2.A2l = r5
            r2.A37 = r0
            r2.A3V = r11
            java.lang.String r0 = r3.A0D
            r2.A2P = r0
            android.graphics.RectF r0 = r3.A01
            r2.A08 = r0
            r2.A3H = r10
            X.9Pa r0 = new X.9Pa
            r0.<init>(r3)
            r2.A0f = r0
            com.instagram.creation.cameraconfiguration.CameraConfiguration r5 = r3.A06
            if (r5 == 0) goto L_0x013a
            boolean r0 = r5.A01
        L_0x00a2:
            r2.A3N = r0
            r2.A3M = r10
            r2.A3L = r10
            r0 = 2
            r2.A03 = r0
            r2.A47 = r10
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0136
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00b3:
            r2.A28 = r0
            r8 = 2131960439(0x7f132277, float:1.9557547E38)
            X.80F r7 = new X.80F
            r9 = r8
            r12 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A17 = r7
            if (r5 != 0) goto L_0x00c9
            X.8aL[] r0 = new X.C358088aL[r11]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r5 = X.C358098aM.A00(r6, r0)
        L_0x00c9:
            r2.A0V = r5
            java.lang.String r0 = r3.A0C
            r2.A2G = r0
            r2.A3Q = r10
            boolean r0 = r3.A0L
            r0 = r0 ^ 1
            r2.A3n = r0
            r2.A3C = r10
            X.87G r0 = r3.A04
            r2.A0N = r0
            boolean r5 = r3.A0J
            if (r5 == 0) goto L_0x0134
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r3.A06
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0134
        L_0x00e9:
            r2.A3G = r10
            r2.A3D = r5
            r2.A3t = r5
            r2.A3s = r5
            boolean r0 = r3.A0K
            r2.A3K = r0
            android.graphics.RectF r0 = r3.A00
            if (r0 == 0) goto L_0x00fe
            float r0 = r0.height()
            int r11 = (int) r0
        L_0x00fe:
            r2.A01 = r11
            boolean r0 = r3.A0K
            r2.A43 = r0
            X.3sy r0 = r3.A0B
            r2.A1J = r0
            r2.A3J = r4
            r2.A0r = r3
            java.lang.String r0 = "direct_gallery"
            r2.A2S = r0
            boolean r0 = r3.A0H
            r2.A3B = r0
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r3.A0A
            com.instagram.model.direct.DirectShareTarget r0 = r0.A03
            r2.A1H = r0
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x0123
            android.graphics.RectF r0 = r3.A00
            X.AnonymousClass80D.A04(r0, r2, r1, r4)
        L_0x0123:
            X.80Q r1 = new X.80Q
            r1.<init>(r2)
            r3.A07 = r1
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x0133
            r1.A01()
        L_0x0133:
            return
        L_0x0134:
            r10 = 0
            goto L_0x00e9
        L_0x0136:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x00b3
        L_0x013a:
            r0 = 1
            goto L_0x00a2
        L_0x013d:
            r8 = r5
            r7 = r5
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9PZ.run():void");
    }
}
