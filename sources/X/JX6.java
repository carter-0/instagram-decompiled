package X;

public final class JX6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ JW7 A01;
    public final /* synthetic */ boolean A02;

    public JX6(JW7 jw7, int i, boolean z) {
        this.A01 = jw7;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A0z, 36319493290466752L) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r7.A0B != null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.JW7 r7 = r14.A01
            X.JW8 r6 = r7.A14
            X.JWM r9 = r6.A0F
            r5 = 0
            r9.A09 = r5
            r9.A07()
            X.8XW r8 = r6.A0O
            java.util.Map r0 = r8.A04
            int r2 = r14.A00
            java.lang.Object r1 = X.C51968G9o.A10(r0, r2)
            com.instagram.ui.widget.mediapicker.Folder r1 = (com.instagram.ui.widget.mediapicker.Folder) r1
            if (r1 != 0) goto L_0x0023
            java.lang.String r2 = "GalleryPickerView_error_folder_selection"
            java.lang.String r1 = "Folder is null"
            r0 = 0
            X.0kD.A0A(r2, r1, r0)
        L_0x0022:
            return
        L_0x0023:
            r6.A0J(r1)
            boolean r0 = r8.A0D(r2)
            r6.A0I(r1, r0)
            com.instagram.ui.widget.mediapicker.Folder r10 = r8.A02
            int r0 = r10.A02
            if (r0 != r2) goto L_0x0022
            r6.A0C()
            java.util.List r11 = r9.A0T
            java.lang.Object r12 = X.00k.A0J(r11)
            com.instagram.common.gallery.model.GalleryItem r12 = (com.instagram.common.gallery.model.GalleryItem) r12
            java.util.Set r0 = r10.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0022
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x0022
            r4 = 1
            r6.A04 = r4
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x0093
            if (r12 == 0) goto L_0x0093
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0093
            boolean r0 = r7.A1P
            if (r0 != 0) goto L_0x0093
            boolean r3 = r7.A1O
            if (r3 != 0) goto L_0x0070
            com.instagram.common.session.UserSession r13 = r7.A0z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319493290466752(0x81086300001dc0, double:3.0319320315275094E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x0093
        L_0x0070:
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r0 = r7.A0I
            if (r0 != 0) goto L_0x0077
            r7.DQg(r12, r5)
        L_0x0077:
            r6.A0L(r4, r3)
            if (r3 == 0) goto L_0x008b
            int r0 = r11.size()
            if (r0 <= r4) goto L_0x008b
            java.lang.Object r0 = r11.get(r4)
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
        L_0x0088:
            r9.Ejh(r0, r4, r5)
        L_0x008b:
            r6.A04 = r5
            r7.A0N = r4
            X.JW7.A0F(r7)
            return
        L_0x0093:
            boolean r0 = r7.A1M
            if (r0 == 0) goto L_0x009c
            com.instagram.common.gallery.model.GalleryItem r0 = r7.A0B
            if (r0 == 0) goto L_0x00ba
            goto L_0x008b
        L_0x009c:
            com.instagram.common.session.UserSession r3 = r7.A0z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316662907540027(0x8105d00008123b, double:3.030142085967611E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ba
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A05()
            if (r0 == 0) goto L_0x008b
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A05()
            goto L_0x0088
        L_0x00ba:
            java.util.List r0 = r10.A01()
            java.lang.Object r0 = r0.get(r5)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            r8.A0B(r0)
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JX6.run():void");
    }
}
