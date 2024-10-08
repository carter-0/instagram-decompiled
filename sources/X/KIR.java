package X;

public final class KIR extends AnonymousClass0mG {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIR(Object obj, int i, int i2) {
        super(500);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011f, code lost:
        if (r1.isActivated() != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0045, code lost:
        X.DbT.A1L(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b1, code lost:
        X.LRF.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x018a;
                case 1: goto L_0x00cb;
                case 2: goto L_0x0083;
                case 3: goto L_0x017e;
                case 4: goto L_0x0149;
                case 5: goto L_0x0128;
                case 6: goto L_0x0049;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r1.A01
            X.K4f r5 = (X.C61363K4f) r5
            X.0eM r0 = r5.A0b
            java.lang.Object r2 = r0.getValue()
            X.LEg r2 = (X.C63942LEg) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A00(r1, r0)
            X.0eM r0 = r5.A0a
            X.0lg r4 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            r6 = 0
            r0 = 3834(0xefa, float:5.373E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r0)
            r15 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r14 = r6
            r16 = r15
            android.os.Bundle r2 = X.C55247Hec.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 374(0x176, float:5.24E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbS.A0b(r1, r2, r4, r3, r0)
        L_0x0045:
            X.DbT.A1L(r5, r0)
        L_0x0048:
            return
        L_0x0049:
            java.lang.Object r5 = r1.A01
            X.K4f r5 = (X.C61363K4f) r5
            X.0eM r0 = r5.A0b
            java.lang.Object r1 = r0.getValue()
            X.LEg r1 = (X.C63942LEg) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A00(r0, r0)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            r0 = 860(0x35c, float:1.205E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Meta View"
            r4.putString(r1, r0)
            X.0eM r0 = r5.A0a
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 27
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r1, r4, r3, r2, r0)
            r0.A07()
            goto L_0x0045
        L_0x0083:
            java.lang.Object r6 = r1.A01
            X.Ll0 r6 = (X.C64961Ll0) r6
            com.instagram.common.gallery.Medium r7 = r6.A00
            if (r7 == 0) goto L_0x0048
            X.LRF r5 = r6.A02
            if (r5 == 0) goto L_0x0048
            int r4 = r5.A01
            int r3 = r7.A03
            int r2 = r5.A00
            int r0 = r5.A05
            int r1 = r0 * 1000
            int r0 = r4 + r1
            int r0 = java.lang.Math.min(r2, r0)
            int r2 = java.lang.Math.min(r3, r0)
            int r0 = r2 - r4
            if (r0 > r1) goto L_0x01b1
            android.widget.TextView r1 = r5.A09
            r0 = 8
            r1.setVisibility(r0)
            X.8MV r8 = r6.A08
            long r9 = (long) r4
            long r11 = (long) r2
            X.8ME r8 = (X.AnonymousClass8ME) r8
            X.80U r1 = r8.A1B
            X.8U2 r0 = new X.8U2
            r0.<init>()
            r1.E3H(r0)
            X.0nO r0 = X.0nY.A00()
            X.RAU r6 = new X.RAU
            r6.<init>(r7, r8, r9, r11)
            r0.ATE(r6)
            return
        L_0x00cb:
            java.lang.Object r3 = r1.A01
            X.Ll1 r3 = (X.C64962Ll1) r3
            com.instagram.common.gallery.Medium r12 = r3.A00
            if (r12 == 0) goto L_0x0048
            X.LRF r5 = r3.A02
            if (r5 == 0) goto L_0x0048
            int r4 = r5.A01
            int r6 = r12.A03
            int r2 = r5.A00
            int r0 = r5.A05
            int r1 = r0 * 1000
            int r0 = r4 + r1
            int r0 = java.lang.Math.min(r2, r0)
            int r2 = java.lang.Math.min(r6, r0)
            int r0 = r2 - r4
            if (r0 > r1) goto L_0x01b1
            X.8aR r6 = r3.A09
            java.lang.Integer r9 = r3.A03
            java.lang.String r11 = "video_trimming_next_button_tapped"
            r8 = 0
            java.lang.Integer r7 = X.AnonymousClass05K.A0Y
            r10 = r8
            X.C358148aR.A00(r6, r7, r8, r9, r10, r11)
            android.widget.TextView r1 = r5.A09
            r0 = 8
            r1.setVisibility(r0)
            X.8MI r11 = r3.A08
            long r13 = (long) r4
            long r15 = (long) r2
            X.LRF r0 = r3.A02
            if (r0 == 0) goto L_0x0125
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A0C
            int r0 = r1.getVisibility()
            r17 = 1
            if (r0 != 0) goto L_0x0125
            boolean r0 = r1.isSelected()
            if (r0 == 0) goto L_0x0125
            boolean r0 = r1.isActivated()
            if (r0 == 0) goto L_0x0125
        L_0x0121:
            r11.CgT(r12, r13, r15, r17)
            return
        L_0x0125:
            r17 = 0
            goto L_0x0121
        L_0x0128:
            java.lang.Object r3 = r1.A01
            X.K4f r3 = (X.C61363K4f) r3
            X.0eM r0 = r3.A0b
            java.lang.Object r2 = r0.getValue()
            X.LEg r2 = (X.C63942LEg) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A00(r1, r0)
            java.lang.String r0 = "https://www.meta.com/help/smart-glasses/articles/ray-ban-meta/livestream-ray-ban-meta-smart-glasses/"
            android.net.Uri r1 = X.0cp.A03(r0)
            android.content.Context r0 = r3.requireContext()
            X.0kR.A0F(r0, r1)
            return
        L_0x0149:
            java.lang.Object r3 = r1.A01
            X.K66 r3 = (X.K66) r3
            X.27r r0 = X.JTP.A0X(r3)
            X.29R r1 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0178
            X.JTO.A1V(r2)
            java.lang.String r0 = "SHARE_SHEET_EDIT_BUTTON_TAP"
            X.JTU.A16(r2, r1, r0)
            X.283 r1 = r1.A04
            X.JTQ.A1B(r2, r1)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            r2.A0d(r0)
            X.JTQ.A1A(r2)
            X.JTT.A1E(r2, r1)
            r2.Cgf()
        L_0x0178:
            java.lang.String r0 = "share_sheet_edit_draft_button_tap"
            X.K66.A0L(r3, r0)
            return
        L_0x017e:
            java.lang.Object r0 = r1.A01
            X.LxB r0 = (X.C65634LxB) r0
            X.K7n r1 = r0.A05
            X.Ki2 r0 = X.C62571Ki2.YOUR_STORY
            r1.A08(r0)
            return
        L_0x018a:
            java.lang.Object r1 = r1.A01
            X.Ll4 r1 = (X.C64965Ll4) r1
            X.0eM r0 = r1.A0X
            java.lang.Object r2 = r0.getValue()
            X.8aR r2 = (X.C358148aR) r2
            java.lang.Integer r3 = r1.A0T
            X.L05 r0 = r1.A04
            boolean r0 = r0 instanceof X.C61734KJz
            java.lang.Integer r4 = X.JTP.A0j(r0)
            java.lang.Integer r5 = r1.A0D
            X.AnonymousClass7TG.A1N(r3, r4)
            java.lang.String r7 = "manual_selection_button_tapped"
            r6 = 0
            X.C358148aR.A00(r2, r3, r4, r5, r6, r7)
            X.8N2 r0 = r1.A0S
            r0.A0H()
            return
        L_0x01b1:
            X.LRF.A00(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIR.A00(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIR(Object obj, int i) {
        super(1000);
        this.A00 = i;
        this.A01 = obj;
    }
}
