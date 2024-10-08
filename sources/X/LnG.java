package X;

public final class LnG implements MVk {
    public final int A00;
    public final Object A01;

    public LnG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void Cu4() {
    }

    public final /* synthetic */ void DhE() {
        if (2 - this.A00 == 0) {
            KMS kms = (KMS) this.A01;
            if (kms.A0M()) {
                kms.A08.removeCallbacks(kms.A0L);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DrV(int r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            r2 = r17
            switch(r0) {
                case 0: goto L_0x01a8;
                case 1: goto L_0x0058;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r1.A01
            X.KMS r1 = (X.KMS) r1
            boolean r0 = r1.A0Q()
            if (r0 == 0) goto L_0x004c
            X.Jfo r4 = r1.A0K
            r7 = 1
            int r0 = r17 / 2
            int r3 = r0 + -1
            if (r17 == 0) goto L_0x0043
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r4.A0E
            boolean r0 = r6.A0s()
            if (r0 == 0) goto L_0x004d
            X.0sn r5 = X.0sn.A00
            r1 = 0
            X.831 r0 = new X.831
            r0.<init>(r5, r1)
        L_0x002c:
            int r0 = X.JTO.A08(r0)
            int r0 = r0 * 2
            int r0 = r0 + 3
            int r0 = r0 - r7
            if (r2 == r0) goto L_0x0043
            java.lang.Integer r0 = r4.A0G()
            if (r0 == 0) goto L_0x0250
            int r0 = r0.intValue()
            if (r3 != r0) goto L_0x0250
        L_0x0043:
            X.8RF r1 = r4.A0F
        L_0x0045:
            X.8Rs r0 = X.JTQ.A0J()
        L_0x0049:
            r1.A0G(r0)
        L_0x004c:
            return
        L_0x004d:
            X.2gB r0 = r6.A0G
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0286
            X.831 r0 = (X.AnonymousClass831) r0
            goto L_0x002c
        L_0x0058:
            java.lang.Object r3 = r1.A01
            X.KMT r3 = (X.KMT) r3
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x004c
            boolean r1 = r3.A0K
            r0 = 1
            if (r1 == 0) goto L_0x00c0
            if (r2 != r0) goto L_0x019d
        L_0x0069:
            X.JlR r0 = r3.A0C
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x004c
            if (r1 == 0) goto L_0x00c7
            X.KMu r2 = r3.A0J
            int r4 = r3.A01
            X.LTY r6 = r2.A01
            X.0eP r5 = r6.A04
            int r1 = r6.A00
            X.0Ud r0 = r6.A09
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = X.C51966G9m.A19(r0, r4)
            X.Jym r0 = (X.C61193Jym) r0
            boolean r3 = r0.A05
            r9 = 0
            if (r3 != 0) goto L_0x00a2
            com.instagram.common.session.UserSession r0 = r2.A00
            X.27r r8 = X.27p.A01(r0)
            java.lang.String r12 = "STICKER"
            X.4yP r0 = r8.A0J()
            if (r0 == 0) goto L_0x00a2
            X.JVj r7 = X.C59725JVj.POST_CAPTURE
            java.lang.String r11 = "TIMELINE_ELEMENT_SELECT"
            r10 = r9
            X.27r.A05(r7, r8, r9, r10, r11, r12)
        L_0x00a2:
            boolean r0 = r6.A0U(r4)
            if (r0 == 0) goto L_0x004c
            r0 = r3 ^ 1
            r6.A0T(r4, r0)
            r2.A0T(r4)
            X.0eP r0 = X.LTY.A0C
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0194
            int r0 = X.C51970G9q.A0B(r5)
            r2.A0I(r0)
            return
        L_0x00c0:
            if (r17 == 0) goto L_0x019d
            int r0 = r17 % 2
            if (r0 != 0) goto L_0x019d
            goto L_0x0069
        L_0x00c7:
            int r0 = r17 + -2
            int r4 = r0 / 2
            X.KMu r2 = r3.A0J
            int r0 = r3.A01
            X.LTY r6 = r2.A01
            X.Jyn r0 = r6.A0G(r0, r4)
            java.lang.Integer r1 = r0.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 != r0) goto L_0x00f4
            X.8RL r1 = r3.A0G
            X.Ln1 r0 = X.C65081Ln1.A00
            r1.A0F(r0)
            com.instagram.common.session.UserSession r0 = r3.A0A
            X.27r r1 = X.27p.A01(r0)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "TIMELINE_GHOST_ADD_TEXT_TAP"
            X.27r.A0C(r1, r0)
            return
        L_0x00f4:
            int r5 = r3.A01
            X.0eP r3 = r6.A04
            int r1 = r6.A00
            X.Jyn r0 = r6.A0G(r5, r4)
            boolean r7 = r0.A0D
            r10 = 0
            if (r7 != 0) goto L_0x0158
            boolean r0 = r6.A0V(r5, r4)
            if (r0 == 0) goto L_0x0191
            X.Jyn r0 = r6.A0G(r5, r4)
            X.KhL r8 = r0.A09
        L_0x010f:
            X.KhL r0 = X.C62529KhL.TEXT
            boolean r9 = X.AnonymousClass7TF.A1W(r8, r0)
            boolean r0 = r6.A0V(r5, r4)
            if (r0 == 0) goto L_0x018f
            X.Jyn r0 = r6.A0G(r5, r4)
            X.KhL r8 = r0.A09
        L_0x0121:
            X.KhL r0 = X.C62529KhL.MUSIC
            boolean r8 = X.AnonymousClass7TF.A1W(r8, r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.27r r11 = X.27p.A01(r0)
            if (r9 == 0) goto L_0x018c
            java.lang.String r15 = "TEXT"
        L_0x0131:
            if (r8 == 0) goto L_0x018a
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r9 = r2.A08
            r8 = 0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r9.A0K
            int r0 = r0.A02(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.A0m()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x0148:
            X.4yP r0 = r11.A0J()
            if (r0 == 0) goto L_0x0158
            if (r10 != 0) goto L_0x0185
            r13 = 0
        L_0x0151:
            X.JVj r10 = X.C59725JVj.POST_CAPTURE
            java.lang.String r14 = "TIMELINE_ELEMENT_SELECT"
            X.27r.A05(r10, r11, r12, r13, r14, r15)
        L_0x0158:
            boolean r0 = r6.A0V(r5, r4)
            if (r0 == 0) goto L_0x004c
            r0 = r7 ^ 1
            r6.A0R(r5, r4, r0)
            r2.A0I(r5)
            X.0eP r0 = X.LTY.A0C
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0183
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.0eP r0 = X.AnonymousClass7TF.A0x(r0, r4)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0183
            int r0 = X.C51970G9q.A0B(r3)
            r2.A0I(r0)
        L_0x0183:
            r4 = -1
            goto L_0x0197
        L_0x0185:
            java.lang.Long r13 = X.C51969G9p.A0r(r10)
            goto L_0x0151
        L_0x018a:
            r12 = r10
            goto L_0x0148
        L_0x018c:
            java.lang.String r15 = "STICKER"
            goto L_0x0131
        L_0x018f:
            r8 = 0
            goto L_0x0121
        L_0x0191:
            r8 = 0
            goto L_0x010f
        L_0x0194:
            r0 = -1
            if (r1 == r0) goto L_0x004c
        L_0x0197:
            if (r1 == r4) goto L_0x004c
            r2.A0T(r1)
            return
        L_0x019d:
            X.8RF r1 = r3.A0H
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8RW
            if (r0 == 0) goto L_0x0045
            return
        L_0x01a8:
            java.lang.Object r1 = r1.A01
            X.KMU r1 = (X.KMU) r1
            boolean r0 = r1.A0R()
            if (r0 == 0) goto L_0x004c
            X.KMt r3 = r1.A0H
            int r5 = r1.A05
            X.JlQ r0 = r1.A0D
            X.KMF r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0239
            X.Jyn r4 = r0.A04
            java.lang.Integer r1 = r4.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x0200
            X.8RF r1 = r3.A06
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.C355838Ro
            if (r0 != 0) goto L_0x0045
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.C355808Rl
            if (r0 != 0) goto L_0x0045
            X.8RL r1 = r3.A05
            X.Lmx r0 = X.C65077Lmx.A00
            r1.A0F(r0)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.27r r4 = X.27p.A01(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r3.A04
            r1 = 0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r2.A0K
            int r3 = r0.A02(r1)
            boolean r2 = r2.A0m()
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x004c
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "TIMELINE_GHOST_ADD_AUDIO_TAP"
            X.27r.A06(r1, r4, r0, r3, r2)
            return
        L_0x0200:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x004c
            X.LTY r1 = r3.A01
            java.util.List r0 = r1.A0H(r5)
            int r2 = r0.indexOf(r4)
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x021d
            r0 = 0
            r1.A0R(r5, r2, r0)
            r3.A0I(r5)
            X.8RF r1 = r3.A06
            goto L_0x0045
        L_0x021d:
            X.KhL r1 = r4.A09
            X.KhL r0 = X.C62529KhL.MUSIC
            if (r1 != r0) goto L_0x022c
            X.8RF r1 = r3.A06
            X.8Rf r0 = new X.8Rf
            r0.<init>(r2, r5)
            goto L_0x0049
        L_0x022c:
            X.KhL r0 = X.C62529KhL.VOICEOVER
            if (r1 != r0) goto L_0x004c
            X.8RF r1 = r3.A06
            X.8Rg r0 = new X.8Rg
            r0.<init>(r2, r5)
            goto L_0x0049
        L_0x0239:
            X.8RF r1 = r3.A06
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.C355748Rf
            if (r0 != 0) goto L_0x024b
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.C355758Rg
            if (r0 == 0) goto L_0x004c
        L_0x024b:
            r3.A0H()
            goto L_0x0045
        L_0x0250:
            X.8RF r1 = r4.A0F
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8RW
            if (r0 == 0) goto L_0x0280
            X.831 r0 = X.JTQ.A0K(r6)
            if (r0 == 0) goto L_0x026c
            X.51M r0 = X.JTO.A0f(r0, r3)
            if (r0 == 0) goto L_0x026c
            X.51R r0 = r0.A0F
            boolean r0 = r0.A0K
            if (r0 != 0) goto L_0x0280
        L_0x026c:
            X.8RW r0 = new X.8RW
            r0.<init>(r3)
        L_0x0271:
            X.8RH r0 = (X.AnonymousClass8RH) r0
            r1.A0G(r0)
            com.instagram.common.session.UserSession r0 = r4.A0C
            X.27r r0 = X.27p.A01(r0)
            r0.A0U()
            return
        L_0x0280:
            X.8Rr r0 = new X.8Rr
            r0.<init>(r3)
            goto L_0x0271
        L_0x0286:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LnG.DrV(int):void");
    }

    public final /* synthetic */ void DsO() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                KMT kmt = (KMT) this.A01;
                if (kmt.A0Q()) {
                    boolean z = kmt.A0H.A0E() instanceof C355718Rb;
                    C61806KMu kMu = kmt.A0J;
                    if (z) {
                        kMu.A0Q();
                    } else {
                        kMu.A0R();
                    }
                    kmt.A0C.A09 = false;
                    return;
                }
                return;
            default:
                KMS kms = (KMS) this.A01;
                if (kms.A0M()) {
                    kms.A08.removeCallbacks(kms.A0L);
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ void DsR(int i) {
        if (2 - this.A00 == 0) {
            KMS kms = (KMS) this.A01;
            if (kms.A0M()) {
                kms.A00 = i;
                kms.A08.postDelayed(kms.A0L, 100);
            }
        }
    }

    public final /* synthetic */ void Dtq(int i) {
        C249703kE A0W;
        C380589Yt r2;
        if (2 - this.A00 == 0) {
            KMS kms = (KMS) this.A01;
            if (kms.A0Q() && (A0W = kms.A0A.A0W(i)) != null && (A0W instanceof C380589Yt) && (r2 = (C380589Yt) A0W) != null && r2.A03) {
                27r A012 = 27p.A01(kms.A0B);
                if (A012.A0J() != null) {
                    27r.A09(C59725JVj.POST_CAPTURE, A012, "TIMELINE_EDIT_CLIP_TRANSITION", A012.A04.A0W);
                }
                kms.A0J.A0G(new AnonymousClass8RX(i));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if ((r1 instanceof X.C355778Ri) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EsN(int r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x0008
            r4 = 0
        L_0x0007:
            return r4
        L_0x0008:
            java.lang.Object r5 = r6.A01
            X.KMS r5 = (X.KMS) r5
            X.8RF r2 = r5.A0J
            X.8RH r1 = r2.A0E()
            boolean r0 = r1 instanceof X.AnonymousClass8RG
            if (r0 == 0) goto L_0x001d
            r0 = r1
            X.8RG r0 = (X.AnonymousClass8RG) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x003e
        L_0x001d:
            boolean r0 = r1 instanceof X.AnonymousClass8RX
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C355878Rs
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C355868Rr
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C355748Rf
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C355758Rg
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C355858Rq
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C355768Rh
            if (r0 != 0) goto L_0x003e
            boolean r1 = r1 instanceof X.C355778Ri
            r0 = 0
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            r4 = 0
            if (r0 == 0) goto L_0x0007
            X.8RH r0 = r2.A0E()
            boolean r0 = r0 instanceof X.C355868Rr
            if (r0 != 0) goto L_0x0007
            X.8RH r0 = r2.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8RX
            if (r0 != 0) goto L_0x0007
            r4 = 1
            if (r7 <= 0) goto L_0x0007
            int r0 = r7 / 2
            int r3 = r0 + -1
            android.content.Context r2 = r5.A07
            r0 = 44
            float r1 = X.0nA.A04(r2, r0)
            float r0 = X.LQO.A00
            float r0 = X.JTS.A01(r2, r0)
            float r1 = r1 / r0
            int r1 = (int) r1
            X.Jfo r0 = r5.A0K
            java.lang.Boolean r0 = r0.A0F(r3, r1)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            r4 = r0 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LnG.EsN(int):boolean");
    }

    public final /* synthetic */ void DrT(int i) {
    }
}
