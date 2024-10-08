package X;

/* renamed from: X.KSp  reason: case insensitive filesystem */
public final class C61940KSp extends C61416K6n implements AnonymousClass4DR, C66518MUw {
    public static final String __redex_internal_original_name = "IGTVVideoCoverPickerFragment";
    public LZQ A00;
    public AnonymousClass6ST A01;
    public boolean A02;
    public boolean A03;
    public LP1 A04;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131964098);
        DbX.A19(LY6.A00(this, 11), LJA.A00(this, r3), r3);
    }

    public final String getModuleName() {
        return "igtv_cover_picker";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.MUw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r0 = 0
            r5 = r26
            X.0qQ.A0B(r5, r0)
            r11 = r25
            r0 = r27
            super.onViewCreated(r5, r0)
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            X.0qQ.A0A(r0)
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0111
            X.3Q2 r0 = X.LJ9.A00(r11)     // Catch:{ IOException -> 0x0036 }
            com.instagram.pendingmedia.model.ClipInfo r0 = r0.A1N     // Catch:{ IOException -> 0x0036 }
            X.LA8 r4 = X.LKM.A00(r0)     // Catch:{ IOException -> 0x0036 }
            int r3 = r11.A01     // Catch:{ IOException -> 0x0036 }
            int r2 = r11.A00     // Catch:{ IOException -> 0x0036 }
            X.0eM r0 = r11.A0C     // Catch:{ IOException -> 0x0036 }
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)     // Catch:{ IOException -> 0x0036 }
            X.LP1 r0 = new X.LP1     // Catch:{ IOException -> 0x0036 }
            r0.<init>(r1, r4, r3, r2)     // Catch:{ IOException -> 0x0036 }
            r11.A04 = r0     // Catch:{ IOException -> 0x0036 }
            goto L_0x003e
        L_0x0036:
            r2 = move-exception
            java.lang.String r1 = "igtv_cover_picker"
            java.lang.String r0 = "Video frame generator setup failed"
            X.0kD.A09(r1, r0, r2)
        L_0x003e:
            android.content.Context r7 = r11.requireContext()
            int r23 = X.LQM.A01(r7)
            int r24 = X.LQM.A00(r7)
            X.3Q2 r0 = X.LJ9.A00(r11)
            float r4 = r0.A02
            r0 = 2131432840(0x7f0b1588, float:1.8487449E38)
            android.view.View r9 = r5.findViewById(r0)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 10
            X.Phf r6 = new X.Phf
            r6.<init>(r0, r7, r11)
            java.lang.Class<X.Ji7> r0 = X.C60250Ji7.class
            X.0Yh r5 = X.DbS.A0z(r0)
            r0 = 33
            X.MMp r2 = X.C66306MMp.A02(r11, r0)
            r3 = 0
            r1 = 9
            X.Phf r0 = new X.Phf
            r0.<init>(r1, r3, r11)
            X.2kA r6 = X.DbS.A0I(r2, r6, r0, r5)
            java.lang.Object r0 = r6.getValue()
            X.Ji7 r0 = (X.C60250Ji7) r0
            X.2Fk r1 = r0.A07
            r0 = 21
            X.MPA r0 = X.MPA.A00(r11, r0)
            r2 = 66
            X.Dba.A15(r11, r1, r0, r2)
            java.lang.Object r0 = r6.getValue()
            X.Ji7 r0 = (X.C60250Ji7) r0
            X.0r6 r5 = r0.A0G
            r1 = 41
            X.Pfo r0 = new X.Pfo
            r0.<init>(r11, r3, r1)
            X.JTS.A10(r11, r0, r5)
            java.lang.Object r0 = r6.getValue()
            X.Ji7 r0 = (X.C60250Ji7) r0
            X.2Fk r1 = r0.A04
            r0 = 22
            X.MPA r0 = X.MPA.A00(r11, r0)
            X.Dba.A15(r11, r1, r0, r2)
            java.lang.Object r0 = r6.getValue()
            X.Ji7 r0 = (X.C60250Ji7) r0
            X.2Fk r1 = r0.A08
            r0 = 23
            X.MPA r0 = X.MPA.A00(r11, r0)
            X.Dba.A15(r11, r1, r0, r2)
            X.0eM r0 = r11.A0C
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r0)
            android.widget.FrameLayout r8 = r11.A03
            if (r8 == 0) goto L_0x0104
            android.widget.SeekBar r10 = r11.A05
            if (r10 == 0) goto L_0x0101
            X.Jcv r13 = r11.A07
            if (r13 == 0) goto L_0x0107
            java.lang.Object r15 = r6.getValue()
            X.Ji7 r15 = (X.C60250Ji7) r15
            int r2 = r11.A01
            int r1 = r11.A00
            X.LP1 r0 = r11.A04
            java.lang.String r17 = "live_cover_photo_selector"
            X.LZQ r6 = new X.LZQ
            r14 = r11
            r18 = r3
            r19 = r4
            r20 = r4
            r21 = r2
            r22 = r1
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11.A00 = r6
            android.widget.SeekBar r1 = r11.A05
            if (r1 == 0) goto L_0x0101
            X.3Q2 r0 = X.LJ9.A00(r11)
            int r0 = r0.A05
            r1.setProgress(r0)
            return
        L_0x0101:
            java.lang.String r0 = "seekBar"
            goto L_0x0109
        L_0x0104:
            java.lang.String r0 = "frameContainer"
            goto L_0x0109
        L_0x0107:
            java.lang.String r0 = "thumb"
        L_0x0109:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61940KSp.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void D6S(String str) {
        11Z.A02(new C65993M7e(this, str));
    }

    public final boolean onBackPressed() {
        JTO.A0k(this.A0D).A04(this, C61945KSu.A00);
        this.A03 = false;
        return false;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(576360717);
        C61940KSp.super.onPause();
        LZQ lzq = this.A00;
        if (lzq == null) {
            0qQ.A0F("singleVideoCoverFrameScrubbingController");
            throw AnonymousClass00P.createAndThrow();
        }
        lzq.onPause();
        AnonymousClass0fD.A09(291789363, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-46245513);
        super.onResume();
        LZQ lzq = this.A00;
        if (lzq == null) {
            0qQ.A0F("singleVideoCoverFrameScrubbingController");
            throw AnonymousClass00P.createAndThrow();
        }
        lzq.onResume();
        AnonymousClass0fD.A09(-879352578, A022);
    }
}
