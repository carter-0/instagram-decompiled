package X;

import com.instagram.creation.activity.MediaCaptureActivity;

public final class M63 implements Runnable {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ boolean A01;

    public M63(MediaCaptureActivity mediaCaptureActivity, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A01 = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.4cN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: X.4cI} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r2 = r19
            com.instagram.creation.activity.MediaCaptureActivity r8 = r2.A00
            X.82p r0 = r8.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            java.lang.String r0 = r0.A0C
            if (r0 == 0) goto L_0x0036
            boolean r5 = r2.A01
            com.instagram.common.session.UserSession r0 = r8.A04
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            X.82p r0 = r8.A09
            X.82q r0 = r0.A00
            r0.getClass()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            java.lang.String r0 = r0.A0C
            X.3Q2 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.A5S
            if (r0 != 0) goto L_0x0073
            r8.DgW(r5)
        L_0x0035:
            return
        L_0x0036:
            com.instagram.common.session.UserSession r0 = r8.A04
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            X.82p r0 = r8.A09
            X.82q r0 = r0.A00
            r0.getClass()
            java.lang.String r0 = r0.E2M()
            X.3Q2 r4 = r1.A03(r0)
            if (r4 == 0) goto L_0x0035
            java.lang.String r1 = r4.A3L
            java.util.Map r0 = X.C63518KyT.A00
            java.lang.Object r1 = r0.get(r1)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r1
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r4.A13
            r0.A00(r1)
            boolean r0 = r4.A12()
            if (r0 != 0) goto L_0x0035
            boolean r5 = r2.A01
            boolean r0 = r4.A5U
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r4.A3Z
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r4.A33
            if (r0 == 0) goto L_0x007c
            r8.AIU()
        L_0x0073:
            X.M64 r0 = new X.M64
            r0.<init>(r8, r5)
            r8.runOnUiThread(r0)
            return
        L_0x007c:
            com.instagram.common.session.UserSession r0 = r8.A04
            X.JaN r1 = X.JW1.A00(r0)
            X.28D r0 = r8.A01
            r1.A05(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r4.A0Q(r0)
            com.instagram.common.session.UserSession r0 = r8.A04
            boolean r0 = X.C59961JcU.A00(r0)
            if (r0 == 0) goto L_0x00bc
            X.0hq r1 = r8.getSupportFragmentManager()
            r0 = 4373(0x1115, float:6.128E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            androidx.fragment.app.Fragment r6 = r1.A0R(r7)
            boolean r0 = r6 instanceof X.C59962JcV
            if (r0 == 0) goto L_0x00bc
            X.JcV r6 = (X.C59962JcV) r6
            r6.A0D()
            X.JcW r3 = X.C59962JcV.A01(r6)
            android.content.Context r2 = r6.requireContext()
            X.3Q2 r1 = r6.A0S
            X.8Jj r0 = r6.A0D
            r3.A08(r2, r0, r1, r7)
        L_0x00bc:
            X.82p r0 = r8.A09
            X.82q r13 = r0.A00
            r13.getClass()
            com.instagram.common.session.UserSession r9 = r8.A04
            r0 = r13
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.creation.base.PhotoSession r11 = r0.A02()
            X.JWG r12 = r8.A07
            r12.getClass()
            X.LkD r10 = new X.LkD
            r10.<init>(r8, r4, r5)
            com.instagram.model.creation.MediaCaptureConfig r15 = r0.A09
            int r0 = r0.A02
            r2 = 0
            X.LoQ r7 = new X.LoQ
            r14 = r8
            r16 = r8
            r17 = r2
            r18 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.82p r0 = r8.A09
            X.82q r0 = r0.A00
            r0.getClass()
            com.instagram.creation.base.PhotoSession r0 = X.JWE.A02(r0)
            if (r0 == 0) goto L_0x00f8
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r2 = r0.A07
        L_0x00f8:
            X.82p r0 = r8.A09
            X.82q r0 = r0.A00
            r0.getClass()
            java.lang.String r0 = r0.E2g()
            X.8m7 r1 = r8.Blh(r0)
            r5 = 1
            X.KgB r0 = X.C62461KgB.UPLOAD
            r3 = 0
            X.KgB[] r0 = new X.C62461KgB[]{r0}
            boolean r0 = r1.Cmo(r7, r2, r0, r3)
            if (r0 == 0) goto L_0x012c
            X.JWG r2 = r8.A07
            r2.getClass()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            r2.A0A(r0, r1)
            com.instagram.common.session.UserSession r0 = r8.A04
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r0 = r4.A2e
            r1.A1z(r0, r3)
            return
        L_0x012c:
            com.instagram.common.session.UserSession r0 = r8.A04
            X.JaN r1 = X.JW1.A00(r0)
            java.lang.String r0 = "savePhotoDraft(exitCreationFlowAfterSave): final render request failed"
            r1.A08(r0)
            r1 = 2131975833(0x7f135e99, float:1.958877E38)
            java.lang.String r0 = "unable_to_save_image"
            X.C59689JTv.A01(r8, r0, r1, r3)
            boolean r3 = X.AnonymousClass7TF.A1V(r2)
            java.lang.String r0 = r4.A33
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = r4.A3Z
            if (r0 != 0) goto L_0x014e
            r5 = 0
        L_0x014e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = " Has FilterGroup: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " Has ImageFilePath: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " Has Original photo: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "MediaCaptureActivity_SaveDraftFailure"
            X.0kD.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M63.run():void");
    }
}
