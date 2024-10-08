package X;

/* renamed from: X.Lh4  reason: case insensitive filesystem */
public final class C64727Lh4 implements 1DN {
    public final int A00;
    public final Object A01;

    public C64727Lh4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        X.W38.A02(r1, 2131974228);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e2, code lost:
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        r0.A06(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DWm(java.util.Map r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x00ce;
                case 2: goto L_0x009e;
                case 3: goto L_0x0051;
                case 4: goto L_0x003b;
                case 5: goto L_0x0015;
                case 6: goto L_0x0083;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A01
            X.SFH r2 = (X.SFH) r2
            android.content.Context r1 = r2.A02
            boolean r0 = X.C2604245p.A03(r1)
            if (r0 == 0) goto L_0x0080
            X.SFH.A00(r2)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r1 = r4.A01
            com.instagram.ui.widget.gallery.GalleryView r1 = (com.instagram.ui.widget.gallery.GalleryView) r1
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x00ca
            X.7kB r0 = r1.A0A
            if (r0 == 0) goto L_0x002a
            r0.A00()
        L_0x002a:
            r0 = 0
            r1.A0A = r0
            com.instagram.ui.widget.gallery.GalleryView.A04(r1)
            r1.A0C()
            X.0sa r0 = r1.A0G
            if (r0 == 0) goto L_0x0014
            r0.invoke()
            return
        L_0x003b:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r1 = r5.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 == r0) goto L_0x0014
            java.lang.Object r1 = r4.A01
            X.K6Y r1 = (X.K6Y) r1
            X.0vF r0 = X.K6Y.A0O
            X.7kB r0 = r1.A08
            if (r0 == 0) goto L_0x0014
            goto L_0x00e5
        L_0x0051:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r1 = r5.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 == r0) goto L_0x0014
            java.lang.Object r0 = r4.A01
            X.LYG r0 = (X.LYG) r0
            java.lang.Object r0 = r0.A01
            X.K7x r0 = (X.C61445K7x) r0
            X.7kB r0 = r0.A04
            goto L_0x00e2
        L_0x0066:
            r1 = 0
            X.0qQ.A0B(r5, r1)
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r0 = r5.get(r0)
            X.7vz r0 = (X.C346927vz) r0
            if (r0 == 0) goto L_0x0014
            int r0 = r0.ordinal()
            if (r0 != r1) goto L_0x0014
            java.lang.Object r0 = r4.A01
            X.DbS.A1U(r0)
            return
        L_0x0080:
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x0097
        L_0x0083:
            java.lang.Object r2 = r4.A01
            com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment r2 = (com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment) r2
            X.7vz r1 = X.C2604245p.A00(r5)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 != r0) goto L_0x0093
            com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment.A00(r2)
            return
        L_0x0093:
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
        L_0x0097:
            r0 = 2131974228(0x7f135854, float:1.9585514E38)
            X.W38.A02(r1, r0)
            return
        L_0x009e:
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Object r2 = r4.A01
            X.JW8 r2 = (X.JW8) r2
            X.7vz r1 = X.C2604245p.A00(r5)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 == r0) goto L_0x00c4
            android.content.Context r0 = r2.A09
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 != 0) goto L_0x00c4
            r0 = 1
            X.JW8.A0X = r0
            X.JWm r1 = r2.A0H
            X.LlG r0 = new X.LlG
            r0.<init>(r2)
            r1.A00(r0)
            return
        L_0x00c4:
            X.JW8.A0X = r3
            X.JW8.A02(r2)
            return
        L_0x00ca:
            com.instagram.ui.widget.gallery.GalleryView.A05(r1)
            return
        L_0x00ce:
            java.lang.Object r2 = r4.A01
            X.Jal r2 = (X.C59867Jal) r2
            java.lang.String r0 = "android.permission.CAMERA"
            java.lang.Object r1 = r5.get(r0)
            X.7vz r0 = X.C346927vz.GRANTED
            if (r1 != r0) goto L_0x00e0
            X.C59867Jal.A02(r2)
            return
        L_0x00e0:
            X.7kB r0 = r2.A08
        L_0x00e2:
            r0.getClass()
        L_0x00e5:
            r0.A06(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64727Lh4.DWm(java.util.Map):void");
    }
}
