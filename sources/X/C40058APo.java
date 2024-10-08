package X;

/* renamed from: X.APo  reason: case insensitive filesystem */
public final class C40058APo implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;

    public C40058APo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015c, code lost:
        if ((r11 instanceof X.AnonymousClass8RX) != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = r7.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x016b;
                case 1: goto L_0x0126;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0148;
                case 5: goto L_0x013e;
                case 6: goto L_0x00f8;
                case 7: goto L_0x0074;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r10.A01
            X.A78 r7 = (X.A78) r7
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r7.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.2Fk r6 = r0.A06
            java.lang.Object r2 = r6.A02()
            X.8fx r2 = (X.C361278fx) r2
            r1 = 1
            if (r2 == 0) goto L_0x0030
            boolean r0 = r2.A01()
            if (r0 == r1) goto L_0x006c
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0030
            X.88B r1 = r7.A04
            X.82i r0 = r1.A00
            if (r0 == 0) goto L_0x006d
            X.1Xj r0 = r0.A04
            boolean r0 = r0.A5U()
            if (r0 == 0) goto L_0x006d
        L_0x0030:
            X.88B r0 = r7.A04
            X.2Fj r5 = r0.A06
            java.lang.Object r1 = r5.A02()
            X.88C r0 = X.AnonymousClass88C.DOWNLOADING
            if (r1 == r0) goto L_0x006c
            X.A5B r8 = r7.A00
            if (r8 == 0) goto L_0x006c
            X.8Ia r4 = r8.A00
            boolean r0 = r4 instanceof X.C367128qE
            if (r0 == 0) goto L_0x005a
            X.8Hw r0 = r8.A01
            X.8A2 r1 = r0.A1h
            X.1QP r0 = r1.A0J
            long r2 = r1.A02
            X.AE4 r1 = new X.AE4
            r1.<init>(r0)
            r1.A01 = r2
            java.lang.String r0 = "AUDIO_TRACK_DOWNLOAD_FINISH"
            r1.A04(r0)
        L_0x005a:
            X.8Hw r0 = r8.A01
            X.C353498Hw.A0P(r4, r0)
            r0 = 0
            r7.A00 = r0
            X.2gO r0 = r7.A02
            r5.A08(r0)
            X.2gO r0 = r7.A01
            r6.A08(r0)
        L_0x006c:
            return
        L_0x006d:
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0030
            return
        L_0x0074:
            X.8pU r11 = (X.C366678pU) r11
            if (r11 == 0) goto L_0x006c
            java.lang.Object r6 = r10.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r6
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r6)
            if (r0 == 0) goto L_0x006c
            X.8vh r4 = new X.8vh
            r4.<init>(r11)
            com.instagram.common.session.UserSession r3 = r6.A0E
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320378053730679(0x81093100002177, double:3.0324915593782725E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            X.0rm r7 = new X.0rm
            r7.<init>()
            if (r0 == 0) goto L_0x00a5
            X.8pR r0 = r11.A01
            X.8pN r0 = r0.A04
            java.util.List r0 = X.C18686Vwk.A02(r0)
            r7.A00 = r0
        L_0x00a5:
            X.0sa r0 = r6.A0N
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r5 = r0.invoke()
            if (r5 == 0) goto L_0x00bf
            X.6oS r0 = X.C318116oQ.A00(r6)
            r8 = 0
            r9 = 8
            X.9KM r3 = new X.9KM
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9)
            X.AnonymousClass7TE.A1Z(r3, r0)
            return
        L_0x00bf:
            X.JXe r2 = new X.JXe
            r2.<init>()
            X.JXc r0 = new X.JXc
            r0.<init>(r4)
            r2.A0i = r0
            java.lang.Object r1 = r7.A00
            X.JXc r0 = new X.JXc
            r0.<init>(r1)
            r2.A0n = r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r6.A0F
            java.util.List r1 = r3.A0M()
            X.JXc r0 = new X.JXc
            r0.<init>(r1)
            r2.A01 = r0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r3.A0K
            X.0Ud r0 = r0.A0f
            java.lang.Object r1 = r0.getValue()
            X.JXc r0 = new X.JXc
            r0.<init>(r1)
            r2.A0l = r0
            X.87s r0 = r6.A0G
            com.instagram.clips.template.creation.model.ClipsTemplateModel r0 = r0.A05
            r2.A04(r0)
            goto L_0x0116
        L_0x00f8:
            int r1 = X.AnonymousClass7TE.A0M(r11)
            java.lang.Object r6 = r10.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r6
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r6)
            if (r0 == 0) goto L_0x006c
            X.JXe r2 = new X.JXe
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.JXc r0 = new X.JXc
            r0.<init>(r1)
            r2.A0Y = r0
        L_0x0116:
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r6)
            if (r0 == 0) goto L_0x0173
            X.5kq r1 = r2.A01(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r6.A0H
            r0.A0N(r1)
            return
        L_0x0126:
            java.lang.Object r1 = r10.A01
            X.ALf r1 = (X.C39963ALf) r1
            java.util.List r11 = (java.util.List) r11
            r1.A08 = r11
            com.instagram.ui.text.ConstrainedEditText r0 = r1.A06
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006c
            X.C39963ALf.A00(r1)
            return
        L_0x013e:
            java.lang.Object r0 = r10.A01
            X.Ab8 r0 = (X.C40375Ab8) r0
            X.88D r0 = r0.A09
            r0.A00()
            return
        L_0x0148:
            X.8RH r11 = (X.AnonymousClass8RH) r11
            r2 = 0
            X.0qQ.A0B(r11, r2)
            boolean r0 = r11 instanceof X.AnonymousClass8RG
            if (r0 == 0) goto L_0x0159
            r0 = r11
            X.8RG r0 = (X.AnonymousClass8RG) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x015e
        L_0x0159:
            boolean r0 = r11 instanceof X.AnonymousClass8RX
            r1 = 0
            if (r0 == 0) goto L_0x015f
        L_0x015e:
            r1 = 1
        L_0x015f:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            if (r1 != 0) goto L_0x0167
            r2 = 8
        L_0x0167:
            r0.setVisibility(r2)
            return
        L_0x016b:
            java.lang.Object r0 = r10.A01
            X.3jv r0 = (X.C249523jv) r0
            r0.FIG(r11)
            return
        L_0x0173:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40058APo.onChanged(java.lang.Object):void");
    }
}
