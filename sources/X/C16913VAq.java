package X;

/* renamed from: X.VAq  reason: case insensitive filesystem */
public abstract class C16913VAq {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        if (r9 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r17, X.C15697Uh3 r18, X.C15433Ucj r19, X.UD5 r20, X.AnonymousClass0iw r21, com.instagram.user.model.Product r22, java.lang.String r23) {
        /*
            r2 = 1
            r5 = r20
            X.0qQ.A0B(r5, r2)
            r1 = 2
            r12 = r18
            r14 = r19
            r11 = r21
            r15 = r23
            X.C51974G9v.A0d(r1, r14, r12, r11, r15)
            com.instagram.feed.widget.IgProgressImageView r4 = r5.A01
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.getIgImageView()
            r0.clearColorFilter()
            X.3gz r0 = new X.3gz
            r0.<init>()
            r4.setProgressiveImageConfig(r0)
            r4.setEnableProgressBar(r2)
            java.util.List r0 = r14.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ab
            r0 = 0
            r4.setOnClickListener(r0)
        L_0x0032:
            com.instagram.model.mediasize.ImageInfo r9 = r14.A01
            if (r9 == 0) goto L_0x00a3
            java.util.List r1 = r9.Al9()
            if (r1 == 0) goto L_0x00a3
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = (com.instagram.model.mediasize.ExtendedImageUrl) r0
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.getWidth()
            float r8 = (float) r0
        L_0x004a:
            java.util.List r1 = r9.Al9()
            if (r1 == 0) goto L_0x00a8
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = (com.instagram.model.mediasize.ExtendedImageUrl) r0
            if (r0 == 0) goto L_0x00a8
            int r0 = r0.getHeight()
            float r7 = (float) r0
        L_0x005e:
            X.VXq r6 = r14.C25()
            if (r6 == 0) goto L_0x00b9
            X.VuF r3 = r6.A01
            X.Vu6 r0 = r3.A03
            r10 = r17
            int r1 = X.C18179Vmt.A00(r10, r0)
            X.Vu6 r0 = r3.A00
            int r0 = X.C18179Vmt.A00(r10, r0)
            int r1 = r1 + r0
            float r2 = (float) r1
            X.Vu6 r0 = r3.A01
            int r1 = X.C18179Vmt.A00(r10, r0)
            X.Vu6 r0 = r3.A02
            int r0 = X.C18179Vmt.A00(r10, r0)
            int r1 = r1 + r0
            float r0 = (float) r1
            float r8 = r8 + r0
            float r7 = r7 + r2
            float r8 = r8 / r7
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r5.A02
            r0.A00 = r8
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A01(r10, r9)
            if (r0 == 0) goto L_0x0094
            r4.setUrl(r0, r11)
        L_0x0094:
            android.view.View r2 = r5.A00
            X.C18179Vmt.A01(r2, r3)
            int r1 = r6.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r2.setBackgroundColor(r1)
            return
        L_0x00a3:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x00a8
            goto L_0x004a
        L_0x00a8:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x005e
        L_0x00ab:
            X.ICS r10 = new X.ICS
            r13 = r22
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.AnonymousClass0fU.A00(r10, r4)
            goto L_0x0032
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16913VAq.A00(android.content.Context, X.Uh3, X.Ucj, X.UD5, X.0iw, com.instagram.user.model.Product, java.lang.String):void");
    }
}
