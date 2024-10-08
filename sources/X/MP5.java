package X;

public final class MP5 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MP5(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MP5 A00(Object obj, int i) {
        return new MP5(obj, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: X.8Yu[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: X.8Yu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v329, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v323, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v98, resolved type: java.util.ArrayList} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0b01: MOVE  (r1v89 X.Jkb) = (r1v88 X.Jkb)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:622:0x0c7f  */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r22) {
        /*
            r21 = this;
            r4 = r21
            r0 = r22
            int r1 = r4.A00
            switch(r1) {
                case 0: goto L_0x01fb;
                case 1: goto L_0x020a;
                case 2: goto L_0x0d8d;
                case 3: goto L_0x0266;
                case 4: goto L_0x027b;
                case 5: goto L_0x0284;
                case 6: goto L_0x02d8;
                case 7: goto L_0x02ff;
                case 8: goto L_0x0362;
                case 9: goto L_0x03d7;
                case 10: goto L_0x0428;
                case 11: goto L_0x044c;
                case 12: goto L_0x0d9e;
                case 13: goto L_0x045a;
                case 14: goto L_0x0009;
                case 15: goto L_0x0b6a;
                case 16: goto L_0x04dd;
                case 17: goto L_0x04f9;
                case 18: goto L_0x051d;
                case 19: goto L_0x095f;
                case 20: goto L_0x0009;
                case 21: goto L_0x060f;
                case 22: goto L_0x0009;
                case 23: goto L_0x0009;
                case 24: goto L_0x0640;
                case 25: goto L_0x0640;
                case 26: goto L_0x064d;
                case 27: goto L_0x0660;
                case 28: goto L_0x0669;
                case 29: goto L_0x0672;
                case 30: goto L_0x0684;
                case 31: goto L_0x0695;
                case 32: goto L_0x069a;
                case 33: goto L_0x0791;
                case 34: goto L_0x07a3;
                case 35: goto L_0x07ac;
                case 36: goto L_0x07b5;
                case 37: goto L_0x07ea;
                case 38: goto L_0x0db6;
                case 39: goto L_0x0de0;
                case 40: goto L_0x0e3e;
                case 41: goto L_0x09c8;
                case 42: goto L_0x09d2;
                case 43: goto L_0x07a3;
                case 44: goto L_0x09f5;
                case 45: goto L_0x0a00;
                case 46: goto L_0x0a14;
                case 47: goto L_0x0b1b;
                case 48: goto L_0x0a2c;
                case 49: goto L_0x0ccf;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.MTa r0 = (X.C66472MTa) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r4 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
        L_0x0013:
            X.0eM r1 = r4.A15
            java.lang.Object r7 = r1.getValue()
            X.Jfl r7 = (X.C60105Jfl) r7
            boolean r1 = r0 instanceof X.C61189Jyi
            if (r1 == 0) goto L_0x0037
            X.8Lv r5 = r7.A07
            X.Jyi r0 = (X.C61189Jyi) r0
            int r4 = r0.A00
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r0 = 10
            X.MGb r1 = new X.MGb
            r1.<init>(r5, r2, r4, r0)
        L_0x0031:
            X.AnonymousClass7TE.A1Z(r1, r3)
        L_0x0034:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0037:
            boolean r1 = r0 instanceof X.C61191Jyk
            if (r1 == 0) goto L_0x0133
            X.Jyk r0 = (X.C61191Jyk) r0
            java.lang.String r8 = r0.A01
            if (r8 == 0) goto L_0x0034
            X.KMu r2 = r7.A0B
            X.8RF r7 = r2.A09
            X.8RH r4 = r7.A0E()
            android.content.Context r0 = r2.A05
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131955959(0x7f1310f7, float:1.954846E38)
            java.lang.String r10 = X.AnonymousClass7TF.A0d(r1, r0)
            boolean r0 = r4 instanceof X.C355838Ro
            if (r0 == 0) goto L_0x0034
            X.LTY r5 = r2.A01
            X.Jyn r6 = r5.A0F()
            boolean r0 = r8.equals(r10)
            r9 = 0
            if (r0 == 0) goto L_0x00b1
            X.8Ro r4 = (X.C355838Ro) r4
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x00a7
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00a7
            if (r6 == 0) goto L_0x0090
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r2.A08
            java.lang.String r1 = r6.A0B
            X.0qQ.A0B(r1, r3)
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.83A r0 = r0.A0A
            r0.A01(r1)
            int r3 = X.JTR.A0E(r5)
            int r1 = X.JTS.A03(r5)
            java.lang.String r0 = ""
            r5.A0O(r3, r1, r0, r0)
        L_0x0090:
            r5 = 0
            int r3 = r4.A01
            int r1 = r4.A00
            X.8Ro r0 = new X.8Ro
            r0.<init>(r3, r1, r5)
            r7.A0G(r0)
        L_0x009d:
            com.instagram.common.session.UserSession r0 = r2.A00
            X.27r r0 = X.27p.A01(r0)
            r0.A1g(r9)
            goto L_0x0034
        L_0x00a7:
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 46
            X.MGE.A01(r2, r10, r1, r0)
            goto L_0x009d
        L_0x00b1:
            if (r6 == 0) goto L_0x0034
            X.A9J r0 = r2.A06
            java.util.List r0 = r0.A00()
            java.util.Iterator r7 = r0.iterator()
            r10 = r9
            r5 = 0
        L_0x00bf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r7.next()
            r0 = r1
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r0 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x00bf
            if (r5 != 0) goto L_0x0d79
            r10 = r1
            r5 = 1
            goto L_0x00bf
        L_0x00d9:
            if (r5 == 0) goto L_0x0d80
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r10 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r10
            X.8Ro r4 = (X.C355838Ro) r4
            java.lang.String r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x0118
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r2.A08
            java.lang.String r7 = r6.A0B
            java.lang.String r5 = r2.A03
            X.0qQ.A0B(r7, r3)
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.83A r1 = r0.A0A
            java.util.Map r0 = r1.A02
            java.lang.Object r0 = r0.get(r7)
            X.JvY r0 = (X.C61034JvY) r0
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = r0.A00()
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0115
            X.6oS r3 = X.C318116oQ.A00(r2)
            r0 = 47
            X.MGE r1 = new X.MGE
            r1.<init>(r2, r8, r9, r0)
            goto L_0x0031
        L_0x0115:
            r1.A01(r7)
        L_0x0118:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r8 = r2.A08
            com.instagram.common.session.UserSession r9 = r2.A00
            java.lang.String r11 = r6.A0B
            int r13 = r6.A05
            java.lang.String r12 = r6.A0C
            r8.A0W(r9, r10, r11, r12, r13)
            X.27r r0 = X.27p.A01(r9)
            r0.A1g(r10)
            int r0 = r4.A01
            r2.A0I(r0)
            goto L_0x0034
        L_0x0133:
            boolean r1 = r0 instanceof X.C61190Jyj
            if (r1 == 0) goto L_0x0151
            X.8II r1 = r7.A04
            r1.A0D = r3
            android.app.Application r2 = r7.A0D()
            X.Jyj r0 = (X.C61190Jyj) r0
            int r6 = r0.A00
            r3 = 0
            r0 = 11
            X.JK0 r5 = new X.JK0
            r5.<init>(r7, r0)
            r4 = r3
            r1.A0H(r2, r3, r4, r5, r6)
            goto L_0x0034
        L_0x0151:
            boolean r1 = r0 instanceof X.C61192Jyl
            if (r1 == 0) goto L_0x018e
            X.8M1 r1 = r7.A0A
            X.Jyl r0 = (X.C61192Jyl) r0
            X.0qQ.A0B(r0, r3)
            float r10 = r0.A01
            float r11 = r0.A00
            float r12 = r0.A02
            float r13 = r0.A03
            r9 = 2
            X.9Hy r4 = new X.9Hy
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            X.9bu r2 = X.AnonymousClass8M1.A00(r1)
            if (r2 == 0) goto L_0x0034
            X.9sM r0 = r2.A05
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0034
            X.9sM r5 = X.C391109sM.ON_TAP_QUICK_EDIT
            int r8 = r2.A02
            X.9Hy r3 = r2.A03
            float r6 = r2.A00
            float r7 = r2.A01
            X.0qQ.A0B(r3, r9)
            X.9bu r2 = new X.9bu
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass8M1.A04(r2, r1)
            goto L_0x0034
        L_0x018e:
            boolean r1 = r0 instanceof X.C61188Jyh
            if (r1 == 0) goto L_0x0d88
            X.8RF r1 = r7.A09
            X.8RH r8 = r1.A0E()
            boolean r1 = r8 instanceof X.KM1
            if (r1 == 0) goto L_0x0034
            X.Jyh r0 = (X.C61188Jyh) r0
            java.lang.String r6 = r0.A03
            if (r6 != 0) goto L_0x01c0
            X.Jff r4 = r7.A05
            X.KM1 r8 = (X.KM1) r8
            java.lang.Integer r0 = r8.A02
            X.0qQ.A0B(r0, r3)
            r2 = 0
            X.C60099Jff.A00(r2, r4)
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x01f3
            r0 = 2
            if (r1 != r0) goto L_0x0034
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A00
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.05G r0 = r0.A0T
            goto L_0x09c0
        L_0x01c0:
            X.8Yu[] r5 = X.C357588Yu.values()
            int r4 = r5.length
            r1 = 0
        L_0x01c6:
            if (r1 >= r4) goto L_0x0034
            r2 = r5[r1]
            java.lang.String r0 = r2.A04
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x01f0
            X.Jff r4 = r7.A05
            X.KM1 r8 = (X.KM1) r8
            java.lang.Integer r0 = r8.A02
            X.0qQ.A0B(r0, r3)
            X.C60099Jff.A00(r2, r4)
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x01f3
            r0 = 2
            if (r1 != r0) goto L_0x0034
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A00
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            r0.A0A(r2)
            goto L_0x0034
        L_0x01f0:
            int r1 = r1 + 1
            goto L_0x01c6
        L_0x01f3:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A00
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.05G r0 = r0.A0L
            goto L_0x09c0
        L_0x01fb:
            java.lang.Object r0 = r4.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            X.Jj2 r0 = X.C65787Lzf.A00(r0)
            X.8Bz r0 = r0.A03
            r0.A03()
            goto L_0x0034
        L_0x020a:
            java.lang.Object r2 = r4.A01
            X.Lzf r2 = (X.C65787Lzf) r2
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r2.A0H
            X.LcB r0 = X.LcB.A00
            java.util.ArrayList r0 = r1.A0U(r0)
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0034
            X.Jj2 r1 = X.C65787Lzf.A00(r2)
            int r4 = X.C51970G9q.A0B(r0)
            java.lang.Object r3 = r0.A01
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.8Bz r2 = r1.A03
            boolean r0 = r3 instanceof X.C321026tS
            if (r0 == 0) goto L_0x0263
            r1 = r3
            X.6tS r1 = (X.C321026tS) r1
            com.instagram.common.session.UserSession r0 = r2.A02
            boolean r0 = r1.CZ7(r0)
            if (r0 == 0) goto L_0x0263
            java.util.Set r0 = r2.A00
            java.util.Set r1 = X.00k.A0k(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x025d
            X.C352168Bz.A00(r3, r2, r4)
            X.KLL r0 = X.KLL.A00
        L_0x0258:
            X.C352168Bz.A02(r0, r2)
            goto L_0x0034
        L_0x025d:
            X.C352168Bz.A01(r3, r2, r4, r5)
            X.KLM r0 = X.KLM.A00
            goto L_0x0258
        L_0x0263:
            X.KLP r0 = X.KLP.A00
            goto L_0x0258
        L_0x0266:
            java.lang.String r1 = X.C41847B3o.A1E(r0)
            java.lang.Object r0 = r4.A01
            X.8Hw r0 = (X.C353498Hw) r0
            X.9QR r0 = r0.A0E
            if (r0 == 0) goto L_0x0034
            android.widget.TextView r0 = r0.A04
            if (r0 == 0) goto L_0x0034
            r0.setText(r1)
            goto L_0x0034
        L_0x027b:
            java.lang.Object r0 = r4.A01
            X.8Hw r0 = (X.C353498Hw) r0
            X.C353498Hw.A0f(r0)
            goto L_0x0034
        L_0x0284:
            X.8IO r1 = X.AnonymousClass8IO.LOADING
            r7 = 1
            boolean r6 = X.AnonymousClass7TF.A1W(r0, r1)
            X.8IO r1 = X.AnonymousClass8IO.FAILED
            boolean r5 = X.AnonymousClass7TF.A1W(r0, r1)
            X.8IO r1 = X.AnonymousClass8IO.NOT_AVAILABLE
            boolean r1 = X.AnonymousClass7TF.A1W(r0, r1)
            java.lang.Object r3 = r4.A01
            X.8Hw r3 = (X.C353498Hw) r3
            if (r6 == 0) goto L_0x02b3
            X.85M r0 = r3.A1d
            r0.A01()
        L_0x02a2:
            r3.A0k = r6
            r1 = 0
            X.8Hv r0 = r3.A1q
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x02ae
            X.C353498Hw.A1B(r3, r1)
        L_0x02ae:
            X.C353498Hw.A0m(r3)
            goto L_0x0034
        L_0x02b3:
            X.8Im r0 = r3.A0P
            if (r0 != 0) goto L_0x02bb
            java.lang.String r13 = "trackDownloader"
            goto L_0x0c46
        L_0x02bb:
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x02c4
            X.85M r0 = r3.A1d
            r0.A00()
        L_0x02c4:
            if (r5 != 0) goto L_0x02c8
            if (r1 == 0) goto L_0x02a2
        L_0x02c8:
            android.content.Context r2 = r3.A11
            r1 = 2131955514(0x7f130f3a, float:1.9547558E38)
            if (r5 == 0) goto L_0x02d2
            r1 = 2131955513(0x7f130f39, float:1.9547556E38)
        L_0x02d2:
            java.lang.String r0 = "clips_music_load_isrc_failed"
            X.C59689JTv.A01(r2, r0, r1, r7)
            goto L_0x02a2
        L_0x02d8:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.9rn r1 = X.C390759rn.AssetHubCutoutTextSticker
            if (r0 != r1) goto L_0x0034
            java.lang.Object r2 = r4.A01
            X.8cb r2 = (X.C359318cb) r2
            X.80U r1 = r2.A0l
            X.8Sv r0 = new X.8Sv
            r0.<init>()
            r1.E3H(r0)
            X.0eM r0 = r2.A1B
            java.lang.Object r1 = r0.getValue()
            X.Hrl r1 = (X.C56038Hrl) r1
            if (r1 == 0) goto L_0x0034
            X.9rn r0 = X.C390759rn.None
            r1.A01(r0)
            goto L_0x0034
        L_0x02ff:
            X.8fx r0 = (X.C361278fx) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r5 = r4.A01
            X.JXi r5 = (X.C59767JXi) r5
            X.8Hv r4 = r5.A0b
            boolean r1 = r4.A0B
            if (r1 == 0) goto L_0x0034
            int r3 = r0.A00
            r1 = 3
            r2 = 0
            if (r3 == r1) goto L_0x0324
            r1 = 2
            if (r3 == r1) goto L_0x0324
            r5.A0E = r2
            X.2Fj r0 = r4.A0E
            r0.A0B(r2)
            r5.A0F()
            goto L_0x0034
        L_0x0324:
            java.lang.Object r1 = r0.A00()
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            r5.A0E = r1
            if (r1 == 0) goto L_0x034b
            com.instagram.music.common.model.DownloadedTrack r1 = r1.A06
            if (r1 == 0) goto L_0x034b
            X.MWv r1 = r5.A0B
            if (r1 == 0) goto L_0x034b
            r1.reset()
            X.C59767JXi.A05(r5)
            X.831 r2 = r5.A0D
            int r1 = r5.A05
            X.51O r2 = r2.A03(r1)
            X.51M r2 = (X.AnonymousClass51M) r2
            int r1 = r5.A02
            X.C59767JXi.A09(r5, r2, r1)
        L_0x034b:
            java.lang.Object r0 = r0.A00()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            X.2Fj r1 = r4.A0E
            if (r0 == 0) goto L_0x0360
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            if (r0 == 0) goto L_0x0360
            com.instagram.common.typedurl.ImageUrl r0 = r0.A03
        L_0x035b:
            r1.A0B(r0)
            goto L_0x0034
        L_0x0360:
            r0 = 0
            goto L_0x035b
        L_0x0362:
            X.8IM r0 = (X.AnonymousClass8IM) r0
            r6 = 0
            X.0qQ.A0B(r0, r6)
            boolean r1 = r0 instanceof X.AnonymousClass8IL
            if (r1 == 0) goto L_0x0034
            java.lang.Object r5 = r4.A01
            X.KLp r5 = (X.C61776KLp) r5
            X.8II r8 = r5.A04
            r11 = 0
            if (r8 == 0) goto L_0x03b9
            X.8IL r1 = r8.A0E()
            if (r1 == 0) goto L_0x03b7
            X.8IJ r1 = r1.A01
        L_0x037d:
            X.8IL r0 = (X.AnonymousClass8IL) r0
            X.8IJ r7 = r0.A01
            if (r1 == r7) goto L_0x0034
            X.L1z r1 = r5.A07
            X.8a4 r2 = r1.A00
            X.8IJ r1 = r2.A0L
            if (r7 == r1) goto L_0x038d
            r2.A0h = r6
        L_0x038d:
            X.85t r1 = r2.A0b
            if (r1 == 0) goto L_0x0394
            r1.pause()
        L_0x0394:
            com.instagram.common.session.UserSession r1 = r5.A03
            X.27r r4 = X.27p.A01(r1)
            X.4yP r1 = r4.A0J()
            if (r1 == 0) goto L_0x03ad
            X.283 r1 = r4.A04
            X.JVj r3 = r1.A0C
            X.80P r2 = X.27r.A00(r7)
            java.lang.String r1 = "AUDIO_FILTERS_FROM_BROWSER_SELECT_TAP"
            X.27r.A04(r3, r2, r4, r1, r6)
        L_0x03ad:
            if (r8 == 0) goto L_0x0034
            android.view.View r1 = r5.A00
            if (r1 != 0) goto L_0x03bb
            java.lang.String r13 = "contentView"
            goto L_0x0c46
        L_0x03b7:
            r1 = 0
            goto L_0x037d
        L_0x03b9:
            r1 = r11
            goto L_0x037d
        L_0x03bb:
            android.content.Context r9 = X.AnonymousClass7TE.A0S(r1)
            X.8a9 r10 = r5.A05
            r1 = 10
            X.JK0 r12 = new X.JK0
            r12.<init>(r5, r1)
            X.05G r1 = r8.A0G
            java.util.List r1 = X.JTO.A16(r1)
            int r13 = r1.indexOf(r0)
            r8.A0H(r9, r10, r11, r12, r13)
            goto L_0x0034
        L_0x03d7:
            X.831 r0 = (X.AnonymousClass831) r0
            java.lang.Object r4 = r4.A01
            X.JjR r4 = (X.C60322JjR) r4
            java.util.List r1 = r4.A04
            boolean r7 = r1.isEmpty()
            java.util.ArrayList r2 = r0.A05()
            r4.A04 = r2
            X.LOG r1 = r4.A09
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.util.Set r6 = X.00k.A0k(r2)
            java.util.Map r5 = r1.A05
            java.util.Set r0 = r5.keySet()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0401:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0413
            java.lang.Object r1 = r2.next()
            boolean r0 = r6.contains(r1)
            X.DbV.A1U(r1, r3, r0)
            goto L_0x0401
        L_0x0413:
            java.util.Iterator r1 = r3.iterator()
        L_0x0417:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0425
            java.lang.Object r0 = r1.next()
            r5.remove(r0)
            goto L_0x0417
        L_0x0425:
            if (r7 != 0) goto L_0x0034
            goto L_0x0445
        L_0x0428:
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.Object r4 = r4.A01
            X.JjR r4 = (X.C60322JjR) r4
            float r1 = r4.A00
            r3 = 1
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x043d
            boolean r1 = X.0qQ.A0I(r0, r2)
            if (r1 != 0) goto L_0x043d
            r3 = 0
        L_0x043d:
            float r0 = r0.floatValue()
            r4.A00 = r0
            if (r3 == 0) goto L_0x0034
        L_0x0445:
            android.content.Context r0 = r4.A07
            r4.AUS(r0)
            goto L_0x0034
        L_0x044c:
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r1 = r4.A01
            X.JjR r1 = (X.C60322JjR) r1
            float r0 = r0.floatValue()
            r1.A01 = r0
            goto L_0x0034
        L_0x045a:
            X.863 r0 = (X.AnonymousClass863) r0
            r8 = 0
            X.0qQ.A0B(r0, r8)
            java.lang.Object r3 = r4.A01
            X.K5P r3 = (X.K5P) r3
            X.861 r1 = r3.A07
            if (r1 != 0) goto L_0x046c
            java.lang.String r5 = "videoPlaybackViewModel"
            goto L_0x0eb4
        L_0x046c:
            X.2Fj r1 = r1.A0A
            java.lang.Object r2 = r1.A02()
            X.8YU r1 = X.AnonymousClass8YU.PLAYING
            if (r2 != r1) goto L_0x0034
            X.LAJ r7 = r3.A02
            if (r7 != 0) goto L_0x047e
            java.lang.String r5 = "miniTimelineController"
            goto L_0x0eb4
        L_0x047e:
            android.content.Context r1 = r3.requireContext()
            int r0 = r0.CEG()
            int r6 = X.C63117Krl.A00(r1, r0)
            java.lang.String r5 = "try to scroll by=%d, recyclerViewItemCount=%d"
            java.lang.String r3 = "ClipsPostCapMiniTimelineController"
            r4 = 2
            r2 = 0
            androidx.recyclerview.widget.RecyclerView r1 = r7.A03     // Catch:{ IndexOutOfBoundsException -> 0x04bc, IllegalArgumentException -> 0x049b }
            int r0 = r7.A00     // Catch:{ IndexOutOfBoundsException -> 0x04bc, IllegalArgumentException -> 0x049b }
            int r0 = r6 - r0
            r1.scrollBy(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x04bc, IllegalArgumentException -> 0x049b }
            goto L_0x0034
        L_0x049b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x04ba
            int r0 = r0.getItemCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04ad:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = X.JTR.A14(r5, r0, r4)
            X.0kD.A07(r3, r0, r2)
            goto L_0x0034
        L_0x04ba:
            r0 = r2
            goto L_0x04ad
        L_0x04bc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x04db
            int r0 = r0.getItemCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04ce:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = X.JTR.A14(r5, r0, r4)
            X.0kD.A07(r3, r0, r2)
            goto L_0x0034
        L_0x04db:
            r0 = r2
            goto L_0x04ce
        L_0x04dd:
            X.8fx r0 = (X.C361278fx) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0034
            java.lang.Object r0 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            X.Jfo r0 = r0.A0h
            if (r0 != 0) goto L_0x04f4
            java.lang.String r2 = "stackedTimelineViewModel"
            goto L_0x05e0
        L_0x04f4:
            r0.A0I()
            goto L_0x0034
        L_0x04f9:
            X.8YU r0 = (X.AnonymousClass8YU) r0
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0N(r2, r0)
            X.8YU r1 = X.AnonymousClass8YU.PAUSED
            if (r0 != r1) goto L_0x0034
            X.8RF r0 = r2.A0d
            if (r0 == 0) goto L_0x05ec
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.KM8
            if (r0 == 0) goto L_0x0034
            X.Lmu r1 = r2.A0S
            if (r1 == 0) goto L_0x0034
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C65074Lmu.A00(r1, r0)
            goto L_0x0034
        L_0x051d:
            X.863 r0 = (X.AnonymousClass863) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r4 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            boolean r1 = r4.A0r
            if (r1 != 0) goto L_0x05f8
            X.Jfo r1 = r4.A0h
            java.lang.String r3 = "stackedTimelineViewModel"
            if (r1 == 0) goto L_0x0dc2
            boolean r1 = r1.A0Y()
            if (r1 != 0) goto L_0x05f8
            X.861 r1 = r4.A0j
            java.lang.String r9 = "videoPlaybackViewModel"
            if (r1 == 0) goto L_0x0dbd
            X.2Fj r1 = r1.A0A
            java.lang.Object r2 = r1.A02()
            X.8YU r1 = X.AnonymousClass8YU.PLAYING
            if (r2 != r1) goto L_0x0570
            X.8RF r1 = r4.A0d
            java.lang.String r2 = "clipsTimelineEditorViewModel"
            if (r1 == 0) goto L_0x05e0
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RX
            if (r1 != 0) goto L_0x0570
            X.8RF r1 = r4.A0d
            if (r1 == 0) goto L_0x05e0
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RU
            if (r1 != 0) goto L_0x0570
            X.Jfo r1 = r4.A0h
            if (r1 == 0) goto L_0x0dc2
            boolean r1 = r1.A06
            if (r1 != 0) goto L_0x0570
            int r1 = r0.CEG()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0D(r4, r1)
        L_0x0570:
            X.8RF r1 = r4.A0d
            if (r1 == 0) goto L_0x05ec
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.KM8
            if (r1 == 0) goto L_0x05b4
            X.Lmu r8 = r4.A0S
            if (r8 == 0) goto L_0x05b4
            int r7 = r0.CEG()
            X.LQg r6 = r8.A07
            boolean r1 = r6.A05
            if (r1 == 0) goto L_0x05b4
            X.M1Y r3 = r8.A00
            r2 = 0
            if (r3 == 0) goto L_0x0593
            X.M1Y r2 = r3.A00()
        L_0x0593:
            if (r2 == 0) goto L_0x05b4
            X.L6K r1 = r6.A04
            if (r1 == 0) goto L_0x05ab
            java.util.List r1 = r1.A02
            r2.A07 = r1
            r1 = 1
            r2.A08 = r1
            int r1 = r2.A01
            if (r7 <= r1) goto L_0x05a8
            r2.A00 = r7
            r2.A02 = r7
        L_0x05a8:
            r8.A00 = r2
            r3 = r2
        L_0x05ab:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r8.A08
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            X.05G r1 = r1.A0N
            r1.Epw(r3)
        L_0x05b4:
            X.861 r1 = r4.A0j
            if (r1 == 0) goto L_0x0dbd
            X.2Fj r1 = r1.A0A
            java.lang.Object r1 = r1.A02()
            X.8YU r1 = (X.AnonymousClass8YU) r1
            boolean r1 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0N(r4, r1)
            if (r1 != 0) goto L_0x05f8
            int r3 = r0.CEG()
            X.8RF r0 = r4.A0d
            if (r0 == 0) goto L_0x05ec
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.AnonymousClass8RW
            if (r0 != 0) goto L_0x05f8
            boolean r0 = r1 instanceof X.KM2
            if (r0 != 0) goto L_0x05f8
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r4.A0F
            if (r2 != 0) goto L_0x05e5
            java.lang.String r2 = "viewController"
        L_0x05e0:
            X.0qQ.A0F(r2)
            goto L_0x0eb7
        L_0x05e5:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0Z
            if (r0 != 0) goto L_0x05ef
            java.lang.String r2 = "clipsCreationViewModel"
            goto L_0x05e0
        L_0x05ec:
            java.lang.String r2 = "clipsTimelineEditorViewModel"
            goto L_0x05e0
        L_0x05ef:
            int r1 = X.JTO.A07(r0)
            X.MXL r0 = r2.A0B
            r0.Eoh(r3, r5, r1)
        L_0x05f8:
            X.Lgf r2 = r4.A0Q
            if (r2 == 0) goto L_0x0034
            X.8RF r0 = r2.A06
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355868Rr
            if (r0 != 0) goto L_0x060a
            boolean r0 = r1 instanceof X.C355858Rq
            if (r0 == 0) goto L_0x0034
        L_0x060a:
            X.C64707Lgf.A03(r2)
            goto L_0x0034
        L_0x060f:
            X.MTa r0 = (X.C66472MTa) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r4 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            android.media.MediaPlayer r2 = r4.A04
            if (r2 == 0) goto L_0x062d
            boolean r1 = r2.isPlaying()     // Catch:{ IllegalStateException -> 0x062a }
            if (r1 == 0) goto L_0x062d
            r2.stop()     // Catch:{ IllegalStateException -> 0x062a }
            r2.reset()     // Catch:{ IllegalStateException -> 0x062a }
            goto L_0x062d
        L_0x062a:
            r2.reset()
        L_0x062d:
            boolean r1 = r0 instanceof X.C61191Jyk
            if (r1 == 0) goto L_0x0013
            r1 = r0
            X.Jyk r1 = (X.C61191Jyk) r1
            if (r1 == 0) goto L_0x0013
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x0013
            r1 = 1
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0H(r4, r2, r1)
            goto L_0x0013
        L_0x0640:
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r4.A01
            X.LPJ r0 = (X.LPJ) r0
            r0.A0I(r1)
            goto L_0x0034
        L_0x064d:
            X.8YU r0 = (X.AnonymousClass8YU) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            X.LgX r1 = (X.C64702LgX) r1
            r1.A00 = r0
            X.MXI r1 = r1.A02
            r1.ADd(r0)
            goto L_0x0034
        L_0x0660:
            java.lang.Object r0 = r4.A01
            X.Lge r0 = (X.C64706Lge) r0
            X.C64706Lge.A01(r0)
            goto L_0x0034
        L_0x0669:
            java.lang.Object r0 = r4.A01
            X.Lge r0 = (X.C64706Lge) r0
            X.C64706Lge.A02(r0)
            goto L_0x0034
        L_0x0672:
            java.lang.Object r2 = r4.A01
            X.Lge r2 = (X.C64706Lge) r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A05
            boolean r1 = r1.A0s()
            if (r1 != 0) goto L_0x0034
            X.0sP r1 = r2.A02
            X.0qQ.A0A(r0)
            goto L_0x0690
        L_0x0684:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            X.Lgk r1 = (X.C64711Lgk) r1
            X.0Ya r1 = r1.A0A
            X.0sP r1 = (X.0sP) r1
        L_0x0690:
            r1.invoke(r0)
            goto L_0x0034
        L_0x0695:
            X.C51965G9l.A1U(r0)
            goto L_0x0034
        L_0x069a:
            X.8RH r0 = (X.AnonymousClass8RH) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            boolean r1 = r0 instanceof X.AnonymousClass8RU
            r3 = -2
            r5 = 8
            java.lang.Object r4 = r4.A01
            X.Lgk r4 = (X.C64711Lgk) r4
            if (r1 == 0) goto L_0x0733
            android.animation.AnimatorSet r1 = r4.A03
            if (r1 == 0) goto L_0x06b2
            r1.cancel()
        L_0x06b2:
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r4.A05
            if (r1 == 0) goto L_0x0727
            X.2Rw r1 = r1.A0A
            if (r1 == 0) goto L_0x0727
            int r1 = r1.getItemCount()
        L_0x06c3:
            X.2HY r1 = X.C229632nm.A0C(r2, r1)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r1.iterator()
        L_0x06cf:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0729
            r1 = r10
            X.0sh r1 = (X.0sh) r1
            int r9 = r1.A00()
            androidx.recyclerview.widget.RecyclerView r1 = r4.A05
            if (r1 == 0) goto L_0x06cf
            X.3kE r8 = r1.A0W(r9)
            if (r8 == 0) goto L_0x06cf
            boolean r1 = r8 instanceof X.C60691Jpc
            if (r1 == 0) goto L_0x06cf
            X.Jpc r8 = (X.C60691Jpc) r8
            if (r8 == 0) goto L_0x0711
            android.view.View r7 = r8.A04
            int r2 = r4.A0C
            r1 = 2
            if (r2 != r1) goto L_0x0724
            r1 = r0
            X.8RU r1 = (X.AnonymousClass8RU) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0724
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A0N
            X.83H r1 = r1.A0L
            X.8J0 r1 = r1.A00
            if (r1 == 0) goto L_0x0722
            X.8JI r2 = r1.A03
        L_0x0706:
            X.8JI r1 = X.AnonymousClass8JI.SEQUENTIAL_REMIX
            if (r2 != r1) goto L_0x070d
            r1 = 1
            if (r9 == r1) goto L_0x0724
        L_0x070d:
            r1 = 0
        L_0x070e:
            r7.setVisibility(r1)
        L_0x0711:
            if (r8 == 0) goto L_0x06cf
            r8.A01(r0, r3)
            android.view.View r1 = r8.itemView
            if (r1 == 0) goto L_0x06cf
            android.animation.ObjectAnimator r1 = X.C3516489r.A01(r1)
            r5.add(r1)
            goto L_0x06cf
        L_0x0722:
            r2 = 0
            goto L_0x0706
        L_0x0724:
            r1 = 8
            goto L_0x070e
        L_0x0727:
            r1 = 0
            goto L_0x06c3
        L_0x0729:
            r6.playTogether(r5)
            r6.start()
            r4.A03 = r6
            goto L_0x0034
        L_0x0733:
            androidx.recyclerview.widget.RecyclerView r1 = r4.A05
            if (r1 == 0) goto L_0x0786
            X.2Rw r1 = r1.A0A
            if (r1 == 0) goto L_0x0786
            int r1 = r1.getItemCount()
        L_0x073f:
            X.2HY r1 = X.C229632nm.A0C(r2, r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x0747:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0788
            r1 = r3
            X.0sh r1 = (X.0sh) r1
            int r2 = r1.A00()
            androidx.recyclerview.widget.RecyclerView r1 = r4.A05
            if (r1 == 0) goto L_0x0747
            X.3kE r2 = r1.A0W(r2)
            if (r2 == 0) goto L_0x0747
            boolean r1 = r2 instanceof X.C60691Jpc
            if (r1 == 0) goto L_0x0747
            X.Jpc r2 = (X.C60691Jpc) r2
            android.view.View r1 = r2.A04
            r1.setVisibility(r5)
            boolean r1 = r0 instanceof X.AnonymousClass8RS
            if (r1 == 0) goto L_0x0778
            r1 = r0
            X.8RS r1 = (X.AnonymousClass8RS) r1
            int r1 = r1.getSegmentIndex()
        L_0x0774:
            r2.A01(r0, r1)
            goto L_0x0747
        L_0x0778:
            boolean r1 = r0 instanceof X.AnonymousClass8RT
            if (r1 == 0) goto L_0x0784
            r1 = r0
            X.8RT r1 = (X.AnonymousClass8RT) r1
            int r1 = r1.getSegmentIndex()
            goto L_0x0774
        L_0x0784:
            r1 = -2
            goto L_0x0774
        L_0x0786:
            r1 = 0
            goto L_0x073f
        L_0x0788:
            android.animation.AnimatorSet r0 = r4.A03
            if (r0 == 0) goto L_0x0034
            r0.cancel()
            goto L_0x0034
        L_0x0791:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r4.A01
            X.LBF r0 = (X.LBF) r0
            android.view.View r1 = r0.A05
            if (r1 == 0) goto L_0x0034
            r0 = 0
            r1.scrollBy(r0, r2)
            goto L_0x0034
        L_0x07a3:
            java.lang.Object r0 = r4.A01
            X.1TA r0 = (X.AnonymousClass1TA) r0
            r0.cancel()
            goto L_0x0034
        L_0x07ac:
            java.lang.Object r0 = r4.A01
            X.Tgt r0 = (X.C13778Tgt) r0
            r0.cancel()
            goto L_0x0034
        L_0x07b5:
            X.8YU r0 = (X.AnonymousClass8YU) r0
            if (r0 != 0) goto L_0x07cb
            r0 = -1
        L_0x07ba:
            r2 = 1
            r1 = 2
            java.lang.String r13 = "buttonPlayPause"
            if (r0 == r1) goto L_0x07db
            r1 = 3
            java.lang.Object r3 = r4.A01
            X.K6R r3 = (X.K6R) r3
            if (r0 == r1) goto L_0x07d0
            android.widget.ImageView r1 = r3.A00
            goto L_0x0b2f
        L_0x07cb:
            int r0 = r0.ordinal()
            goto L_0x07ba
        L_0x07d0:
            android.widget.ImageView r0 = r3.A00
            if (r0 == 0) goto L_0x0c46
            r0.setEnabled(r2)
            android.widget.ImageView r2 = r3.A00
            goto L_0x0b5c
        L_0x07db:
            java.lang.Object r1 = r4.A01
            X.K6R r1 = (X.K6R) r1
            android.widget.ImageView r0 = r1.A00
            if (r0 == 0) goto L_0x0c46
            r0.setEnabled(r2)
            android.widget.ImageView r2 = r1.A00
            goto L_0x0b49
        L_0x07ea:
            X.863 r0 = (X.AnonymousClass863) r0
            int r2 = r0.CEG()
            int r5 = r0.Bd7()
            java.lang.Object r4 = r4.A01
            X.K6R r4 = (X.K6R) r4
            android.widget.TextView r9 = r4.A03
            r10 = 0
            if (r9 != 0) goto L_0x0801
            java.lang.String r5 = "textVideoStartTime"
            goto L_0x0eb4
        L_0x0801:
            android.content.Context r8 = r4.getContext()
            r16 = 1
            r3 = 0
            if (r8 == 0) goto L_0x0827
            r7 = 2131973437(0x7f13553d, float:1.958391E38)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = (long) r2
            long r0 = r6.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = X.DbW.A0h(r8, r0, r7)
        L_0x081c:
            r9.setText(r0)
            android.widget.TextView r9 = r4.A02
            if (r9 != 0) goto L_0x0829
            java.lang.String r5 = "textVideoEndTime"
            goto L_0x0eb4
        L_0x0827:
            r0 = r10
            goto L_0x081c
        L_0x0829:
            android.content.Context r8 = r4.getContext()
            if (r8 == 0) goto L_0x0841
            r7 = 2131973437(0x7f13553d, float:1.958391E38)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = (long) r5
            long r0 = r6.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r10 = X.DbW.A0h(r8, r0, r7)
        L_0x0841:
            r9.setText(r10)
            X.0eM r0 = r4.A0F
            java.lang.Object r0 = r0.getValue()
            X.Jin r0 = (X.C60290Jin) r0
            X.LR9 r0 = r0.A00
            X.L6L r7 = r0.A03
            int r0 = r7.A00
            if (r2 >= r0) goto L_0x0873
            r7.A00 = r3
            X.LR9 r7 = r7.A01
            android.media.SoundPool r6 = X.LR9.A00(r7)
            r6.autoPause()
            java.util.Set r0 = r7.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x0865:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0939
            int r0 = X.AnonymousClass7TG.A0F(r1)
            r6.stop(r0)
            goto L_0x0865
        L_0x0873:
            java.util.Map r6 = r7.A02
            java.util.Set r0 = r6.keySet()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x0881:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0899
            java.lang.Object r8 = r9.next()
            int r1 = X.AnonymousClass7TE.A0M(r8)
            int r0 = r7.A00
            if (r0 > r1) goto L_0x0881
            if (r1 > r2) goto L_0x0881
            r10.add(r8)
            goto L_0x0881
        L_0x0899:
            java.util.List r0 = X.00k.A0Z(r10)
            r7.A00 = r2
            java.util.Iterator r11 = r0.iterator()
        L_0x08a3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0949
            int r0 = X.AnonymousClass7TG.A0F(r11)
            java.lang.Object r0 = X.C51968G9o.A10(r6, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x08a3
            int r13 = r0.intValue()
            X.LR9 r1 = r7.A01
            float r14 = r1.A00
            java.util.Set r8 = r1.A05
            android.media.SoundPool r12 = X.LR9.A00(r1)
            r18 = 1065353216(0x3f800000, float:1.0)
            r15 = r14
            r17 = r3
            int r0 = r12.play(r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
            java.util.Map r0 = r1.A04
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r0)
        L_0x08d9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0937
            java.lang.Object r8 = r9.next()
            r0 = r8
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r13 != r0) goto L_0x08d9
        L_0x08f0:
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            if (r8 == 0) goto L_0x08a3
            java.lang.Object r9 = r8.getKey()
            if (r9 == 0) goto L_0x08a3
            X.L0X r0 = r1.A01
            if (r0 == 0) goto L_0x08a3
            X.Jin r8 = r0.A00
            X.01W r0 = r8.A03
            java.util.Iterator r10 = r0.iterator()
        L_0x0906:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0935
            java.lang.Object r1 = r10.next()
            r0 = r1
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r0 = r0.A00
            X.9cM r0 = (X.C381809cM) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x0906
        L_0x0923:
            X.0eP r1 = (X.0eP) r1
            if (r1 == 0) goto L_0x08a3
            java.lang.Object r1 = r1.A01
            X.JwH r1 = (X.C61079JwH) r1
            X.KMn r0 = new X.KMn
            r0.<init>(r1)
            X.C60290Jin.A00(r8, r0)
            goto L_0x08a3
        L_0x0935:
            r1 = 0
            goto L_0x0923
        L_0x0937:
            r8 = 0
            goto L_0x08f0
        L_0x0939:
            X.L0X r0 = r7.A01
            if (r0 == 0) goto L_0x0949
            X.Jin r6 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.KMo r0 = new X.KMo
            r0.<init>(r1)
            X.C60290Jin.A00(r6, r0)
        L_0x0949:
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView r1 = r4.A08
            java.lang.String r6 = "sfxSeekBarView"
            if (r1 == 0) goto L_0x096b
            int r0 = java.lang.Math.max(r5, r3)
            r1.setMax(r0)
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView r0 = r4.A08
            if (r0 == 0) goto L_0x096b
            r0.setProgress(r2)
            goto L_0x0034
        L_0x095f:
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r1 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            X.Jfp r3 = r1.A0a
            if (r3 != 0) goto L_0x0970
            java.lang.String r6 = "clipsTimelineActionBarViewModel"
        L_0x096b:
            X.0qQ.A0F(r6)
            goto L_0x0eb7
        L_0x0970:
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r11 = X.AnonymousClass7TF.A1R(r0)
            X.0Ud r0 = r3.A0E
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r2 = X.00k.A0U(r0)
            java.util.Iterator r5 = r2.iterator()
            r4 = 0
        L_0x098c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x09be
            java.lang.Object r0 = r5.next()
            X.Jzw r0 = (X.C61263Jzw) r0
            X.KjH r1 = r0.A00
            X.KjH r0 = X.C62636KjH.A0F
            if (r1 != r0) goto L_0x09c5
            if (r4 < 0) goto L_0x09be
            java.lang.Object r0 = r2.get(r4)
            X.Jzw r0 = (X.C61263Jzw) r0
            X.KjH r6 = r0.A00
            boolean r9 = r0.A06
            boolean r12 = r0.A07
            java.lang.String r8 = r0.A02
            boolean r13 = r0.A03
            java.lang.Integer r7 = r0.A01
            boolean r10 = X.JTQ.A1X(r6)
            X.Jzw r5 = new X.Jzw
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2.set(r4, r5)
        L_0x09be:
            X.05G r0 = r3.A0C
        L_0x09c0:
            r0.Epw(r2)
            goto L_0x0034
        L_0x09c5:
            int r4 = r4 + 1
            goto L_0x098c
        L_0x09c8:
            java.lang.String r1 = X.C41847B3o.A1E(r0)
            r0 = 0
            X.AnonymousClass83R.A01(r0, r1)
            goto L_0x0034
        L_0x09d2:
            X.0eR r0 = (X.0eR) r0
            java.lang.Object r0 = r0.A00
            java.lang.Object r4 = r4.A01
            X.83e r4 = (X.C3500883e) r4
            X.83f r3 = r4.A03
            long r1 = r3.A00()
            boolean r0 = r0 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x09ee
            X.C3500883e.A01(r4, r1)
            r3.A01(r1)
            goto L_0x0034
        L_0x09ee:
            java.lang.String r0 = "voltron_not_ready_et"
            r3.A02(r1, r0)
            goto L_0x0034
        L_0x09f5:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            X.2Fj r1 = r1.A02
            goto L_0x0a27
        L_0x0a00:
            X.5kq r0 = (X.C293505kq) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r1.A07
            X.50r r1 = r0.A0H
            r0 = 0
            r2.A0P(r1, r0)
            goto L_0x0034
        L_0x0a14:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r3
            X.2Fj r2 = r3.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.JTQ.A0x(r2, r1)
            X.2Fj r1 = r3.A01
        L_0x0a27:
            X.JTQ.A0x(r1, r0)
            goto L_0x0034
        L_0x0a2c:
            X.8IM r0 = (X.AnonymousClass8IM) r0
            r8 = 0
            X.0qQ.A0B(r0, r8)
            java.lang.Object r3 = r4.A01
            X.KLo r3 = (X.C61775KLo) r3
            X.L44 r1 = r3.A03
            java.lang.String r6 = r0.getName()
            X.LQi r4 = r1.A00
            X.5MI r5 = r4.A02
            if (r5 == 0) goto L_0x0034
            java.lang.String r9 = r1.A01
            android.media.MediaPlayer r2 = r4.A00
            if (r2 == 0) goto L_0x0a64
            boolean r1 = r2.isPlaying()     // Catch:{ Exception -> 0x0a55 }
            if (r1 == 0) goto L_0x0a64
            r2.stop()     // Catch:{ Exception -> 0x0a55 }
            r2.reset()     // Catch:{ Exception -> 0x0a55 }
            goto L_0x0a64
        L_0x0a55:
            r7 = move-exception
            java.lang.String r2 = "stopTtsPlaybackOnDismiss"
            android.media.MediaPlayer r1 = r4.A00
            if (r1 == 0) goto L_0x0a5f
            r1.reset()
        L_0x0a5f:
            java.lang.String r1 = "TextToSpeechController"
            X.0kD.A07(r1, r2, r7)
        L_0x0a64:
            boolean r2 = X.0qQ.A0K(r6, r9)
            java.lang.String r1 = r4.A04
            if (r2 == 0) goto L_0x0a86
            boolean r0 = X.0qQ.A0K(r1, r9)
            if (r0 != 0) goto L_0x0034
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A09
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r5.getId()
            X.0qQ.A0B(r1, r8)
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.83A r0 = r0.A0A
            r0.A01(r1)
            goto L_0x0034
        L_0x0a86:
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 == 0) goto L_0x0a9b
            java.lang.String r2 = r4.A03
            if (r2 == 0) goto L_0x0a9b
            boolean r1 = X.JTQ.A1Z(r2)
            if (r1 == 0) goto L_0x0a9b
            X.C64145LQi.A00(r4, r2)
            goto L_0x0034
        L_0x0a9b:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r4.A09
            if (r7 == 0) goto L_0x0ade
            com.instagram.common.session.UserSession r8 = r4.A07
            java.lang.String r10 = r5.getId()
            int r12 = r5.Byn()
            android.text.Spannable r1 = r5.C4k()
            java.lang.String r11 = java.lang.String.valueOf(r1)
            X.A9J r1 = r4.A08
            java.util.List r1 = r1.A00()
            r9 = 0
            r5 = 0
            java.util.Iterator r4 = r1.iterator()
        L_0x0abd:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0ad7
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r1 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r1
            java.lang.String r1 = r1.A00
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 == 0) goto L_0x0abd
            if (r5 != 0) goto L_0x0dc7
            r5 = 1
            r9 = r2
            goto L_0x0abd
        L_0x0ad7:
            if (r5 == 0) goto L_0x0dce
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r9 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r9
            r7.A0W(r8, r9, r10, r11, r12)
        L_0x0ade:
            r1 = r0
            X.Jyd r1 = (X.C61184Jyd) r1
            java.lang.String r5 = r1.A02
            java.lang.String r6 = r1.A01
            boolean r8 = r1.A04
            int r7 = r1.A00
            r9 = 1
            X.Jyd r4 = new X.Jyd
            r4.<init>(r5, r6, r7, r8, r9)
            X.Jkb r1 = r3.A02
            java.util.List r1 = r1.A00
            int r2 = r1.indexOf(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00()
            X.2Rw r1 = r0.A0A
            boolean r0 = r1 instanceof X.C60382Jkb
            if (r0 == 0) goto L_0x0034
            X.Jkb r1 = (X.C60382Jkb) r1
            if (r1 == 0) goto L_0x0034
            if (r2 < 0) goto L_0x0034
            int r0 = r1.getItemCount()
            if (r2 >= r0) goto L_0x0034
            java.util.List r0 = r1.A00
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r0.set(r2, r4)
            r1.A00(r0)
            goto L_0x0034
        L_0x0b1b:
            X.8YU r0 = (X.AnonymousClass8YU) r0
            if (r0 != 0) goto L_0x0b37
            r0 = -1
        L_0x0b20:
            r2 = 1
            r1 = 2
            java.lang.String r13 = "buttonPlayPause"
            if (r0 == r1) goto L_0x0b3c
            r1 = 3
            java.lang.Object r3 = r4.A01
            X.K6O r3 = (X.K6O) r3
            if (r0 == r1) goto L_0x0b53
            android.widget.ImageView r1 = r3.A01
        L_0x0b2f:
            if (r1 == 0) goto L_0x0c46
            r0 = 0
            r1.setEnabled(r0)
            goto L_0x0034
        L_0x0b37:
            int r0 = r0.ordinal()
            goto L_0x0b20
        L_0x0b3c:
            java.lang.Object r1 = r4.A01
            X.K6O r1 = (X.K6O) r1
            android.widget.ImageView r0 = r1.A01
            if (r0 == 0) goto L_0x0c46
            r0.setEnabled(r2)
            android.widget.ImageView r2 = r1.A01
        L_0x0b49:
            if (r2 == 0) goto L_0x0c46
            android.content.Context r1 = r1.requireContext()
            r0 = 2131238615(0x7f081ed7, float:1.8093514E38)
            goto L_0x0b65
        L_0x0b53:
            android.widget.ImageView r0 = r3.A01
            if (r0 == 0) goto L_0x0c46
            r0.setEnabled(r2)
            android.widget.ImageView r2 = r3.A01
        L_0x0b5c:
            if (r2 == 0) goto L_0x0c46
            android.content.Context r1 = r3.requireContext()
            r0 = 2131238650(0x7f081efa, float:1.8093585E38)
        L_0x0b65:
            X.DbU.A13(r1, r2, r0)
            goto L_0x0034
        L_0x0b6a:
            X.831 r0 = (X.AnonymousClass831) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r5 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.8RF r1 = r5.A0d
            java.lang.String r12 = "clipsTimelineEditorViewModel"
            r16 = 0
            if (r1 == 0) goto L_0x0b93
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RV
            if (r1 != 0) goto L_0x0034
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r5.A0Z
            java.lang.String r11 = "clipsCreationViewModel"
            if (r1 == 0) goto L_0x0ddb
            r1.A0Q()
            X.KMt r3 = r5.A0g
            if (r3 != 0) goto L_0x0b98
            java.lang.String r12 = "stackedTimelineVoiceoverViewModel"
        L_0x0b93:
            X.0qQ.A0F(r12)
            goto L_0x0eb7
        L_0x0b98:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r5.A0Z
            if (r1 == 0) goto L_0x0ddb
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            X.05G r1 = r1.A0S
            java.util.List r1 = X.JTO.A16(r1)
            r3.A0R(r1)
            java.util.List r4 = r0.A01
            int r6 = r4.size()
            X.Jfo r1 = r5.A0h
            java.lang.String r13 = "stackedTimelineViewModel"
            if (r1 == 0) goto L_0x0c46
            int r1 = r1.A0E()
            int r6 = r6 - r1
            r3 = 2
            if (r6 <= 0) goto L_0x0bea
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r5.A0Z
            if (r1 == 0) goto L_0x0ddb
            int r10 = X.JTO.A07(r1)
            int r9 = r5.A00
            int r9 = r9 / r3
            android.content.Context r7 = r5.requireContext()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r5.A0Z
            if (r1 == 0) goto L_0x0ddb
            int r3 = X.JTO.A07(r1)
            r1 = 15000(0x3a98, float:2.102E-41)
            if (r3 >= r1) goto L_0x0c01
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0bd8:
            X.LQO.A01 = r8
            float r7 = X.JTS.A01(r7, r8)
            float r1 = (float) r10
            float r7 = r7 * r1
            float r3 = (float) r9
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0be8
            float r3 = r3 * r8
            float r8 = r3 / r7
        L_0x0be8:
            X.LQO.A01 = r8
        L_0x0bea:
            java.lang.String r8 = "viewController"
            r3 = 1
            if (r6 != r3) goto L_0x0c24
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r7 = r5.A0F
            if (r7 == 0) goto L_0x0dd6
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r5.A0Z
            if (r1 == 0) goto L_0x0ddb
            X.LPJ.A07(r7, r1, r2)
            X.LGg r7 = r5.A0D
            if (r7 != 0) goto L_0x0c13
            java.lang.String r12 = "timedElementTracksManager"
            goto L_0x0b93
        L_0x0c01:
            r1 = 30000(0x7530, float:4.2039E-41)
            if (r3 >= r1) goto L_0x0c08
            r8 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0bd8
        L_0x0c08:
            r1 = 60000(0xea60, float:8.4078E-41)
            r8 = 1042983594(0x3e2aaaaa, float:0.16666666)
            if (r3 >= r1) goto L_0x0bd8
            r8 = 1048576000(0x3e800000, float:0.25)
            goto L_0x0bd8
        L_0x0c13:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r5.A0Z
            if (r1 == 0) goto L_0x0ddb
            int r1 = X.JTO.A07(r1)
            r7.A03(r1)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0A(r5)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0B(r5)
        L_0x0c24:
            X.Jfo r14 = r5.A0h
            if (r14 == 0) goto L_0x0c46
            android.content.Context r15 = r5.requireContext()
            int r1 = r5.A00
            int r1 = r1 / 2
            java.util.ArrayList r17 = r0.A05()
            r18 = r1
            r19 = r2
            r20 = r2
            r14.A0R(r15, r16, r17, r18, r19, r20)
            if (r6 <= 0) goto L_0x0c4b
            X.8RL r1 = r5.A0c
            r2 = 0
            if (r1 != 0) goto L_0x0c54
            java.lang.String r13 = "clipsTimelineButtonEventProvider"
        L_0x0c46:
            X.0qQ.A0F(r13)
            goto L_0x0eb7
        L_0x0c4b:
            if (r6 >= 0) goto L_0x0c7b
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r5.A0F
            if (r0 == 0) goto L_0x0dd6
            int r0 = r0.A00
            goto L_0x0c78
        L_0x0c54:
            X.2Fj r1 = r1.A00
            java.lang.Object r1 = r1.A02()
            X.88W r1 = (X.AnonymousClass88W) r1
            if (r1 == 0) goto L_0x0c62
            java.lang.Object r2 = r1.A01
            X.MQQ r2 = (X.MQQ) r2
        L_0x0c62:
            boolean r1 = X.AnonymousClass9IF.A00(r3, r2)
            if (r1 == 0) goto L_0x0c8b
            X.9IF r2 = (X.AnonymousClass9IF) r2
            java.lang.Object r1 = r2.A01
            java.lang.Number r1 = (java.lang.Number) r1
        L_0x0c6e:
            if (r1 == 0) goto L_0x0ca1
            int r1 = r1.intValue()
        L_0x0c74:
            int r0 = r0.A01(r1)
        L_0x0c78:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0D(r5, r0)
        L_0x0c7b:
            X.8RF r0 = r5.A0d
            if (r0 == 0) goto L_0x0b93
            X.8RH r2 = r0.A0E()
            X.861 r0 = r5.A0j
            if (r0 != 0) goto L_0x0ca6
            java.lang.String r12 = "videoPlaybackViewModel"
            goto L_0x0b93
        L_0x0c8b:
            boolean r1 = r2 instanceof X.C61186Jyf
            if (r1 == 0) goto L_0x0ca1
            X.Jyf r2 = (X.C61186Jyf) r2
            int r1 = r2.A00
            if (r1 != r3) goto L_0x0c9e
            int r1 = r2.A01
            int r1 = r1 + 1
        L_0x0c99:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0c6e
        L_0x0c9e:
            int r1 = r2.A01
            goto L_0x0c99
        L_0x0ca1:
            int r1 = X.C51966G9m.A06(r4)
            goto L_0x0c74
        L_0x0ca6:
            X.2Fj r0 = r0.A04
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x0cbf
            X.8RF r1 = r5.A0d
            if (r1 == 0) goto L_0x0b93
            int r0 = X.DbT.A02(r4, r3)
        L_0x0cba:
            X.JTP.A1N(r1, r0)
            goto L_0x0034
        L_0x0cbf:
            boolean r0 = r2 instanceof X.KM3
            if (r0 == 0) goto L_0x0034
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A08(r5)
            X.8RF r1 = r5.A0d
            if (r1 == 0) goto L_0x0b93
            X.KM3 r2 = (X.KM3) r2
            int r0 = r2.A00
            goto L_0x0cba
        L_0x0ccf:
            X.Juj r0 = (X.C60987Juj) r0
            X.0qQ.A0A(r0)
            java.lang.Object r5 = r4.A01
            X.K7s r5 = (X.C61442K7s) r5
            r7 = 0
            X.MIX r9 = new X.MIX
            r9.<init>(r5, r7)
            X.0eM r3 = r5.A01
            java.lang.Object r2 = r3.getValue()
            r1 = 48
            X.MId r6 = X.JTO.A1C(r2, r1)
            java.lang.Object r2 = r3.getValue()
            r1 = 1
            X.MIC r8 = new X.MIC
            r8.<init>(r2, r1)
            X.0qQ.A0B(r0, r7)
            X.01N r4 = X.0jo.A1H()
            r1 = 11
            X.LYB r3 = new X.LYB
            r3.<init>((java.lang.Object) r9, (int) r1)
            r1 = 12
            X.LYB r2 = new X.LYB
            r2.<init>((java.lang.Object) r8, (int) r1)
            X.KNC r1 = new X.KNC
            r1.<init>(r3, r2)
            r4.add(r1)
            X.KNB r1 = new X.KNB
            r1.<init>()
            r4.add(r1)
            X.Jul r8 = r0.A00
            java.util.List r0 = r8.A01
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0d25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d50
            java.lang.Object r0 = r1.next()
            X.Jvo r0 = (X.C61050Jvo) r0
            java.lang.String r15 = r0.A06
            java.lang.Object r11 = r0.A04
            X.4Yx r11 = (X.C266444Yx) r11
            java.lang.Object r12 = r0.A03
            X.4Yx r12 = (X.C266444Yx) r12
            java.lang.Object r14 = r0.A05
            X.Khl r14 = (X.C62555Khl) r14
            java.lang.Object r10 = r0.A02
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            java.lang.Object r13 = r0.A01
            X.4Yx r13 = (X.C266444Yx) r13
            X.L9f r9 = new X.L9f
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3.add(r9)
            goto L_0x0d25
        L_0x0d50:
            X.Jvo r9 = r8.A00
            java.lang.Object r0 = r9.A05
            X.Khl r0 = (X.C62555Khl) r0
            java.lang.String r2 = r0.A00
            X.Weu r1 = new X.Weu
            r1.<init>(r7, r8, r6)
            X.KND r0 = new X.KND
            r0.<init>(r1, r2, r3)
            r6.invoke(r9)
            r4.add(r0)
            X.01N r2 = X.0jo.A1I(r4)
            X.2rL r1 = r5.getAdapter()
            X.K96 r1 = (X.K96) r1
            java.util.List r0 = r1.A00
            X.DbW.A0z(r1, r2, r0)
            goto L_0x0034
        L_0x0d79:
            java.lang.String r0 = "Collection contains more than one matching element."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            throw r1
        L_0x0d80:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x0d88:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0d8d:
            X.8ve r0 = (X.C369988ve) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r0 = r0.A07
            boolean r3 = X.00k.A0u(r1, r0)
            goto L_0x0e1b
        L_0x0d9e:
            X.UOk r0 = (X.C15092UOk) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            X.2HZ r1 = (X.2HZ) r1
            int r2 = r1.A00
            int r1 = r1.A01
            int r0 = r0.A01()
            r3 = 0
            if (r2 > r0) goto L_0x0e1b
            if (r0 > r1) goto L_0x0e1b
            goto L_0x0dbb
        L_0x0db6:
            java.lang.Object r0 = r4.A01
            X.Dba.A1Q(r0)
        L_0x0dbb:
            r3 = 1
            goto L_0x0e1b
        L_0x0dbd:
            X.0qQ.A0F(r9)
            goto L_0x0eb7
        L_0x0dc2:
            X.0qQ.A0F(r3)
            goto L_0x0eb7
        L_0x0dc7:
            java.lang.String r0 = "Collection contains more than one matching element."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            throw r1
        L_0x0dce:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x0dd6:
            X.0qQ.A0F(r8)
            goto L_0x0eb7
        L_0x0ddb:
            X.0qQ.A0F(r11)
            goto L_0x0eb7
        L_0x0de0:
            java.lang.Object r4 = r4.A01
            X.K6R r4 = (X.K6R) r4
            X.861 r0 = r4.A09
            java.lang.String r5 = "videoPlaybackViewModel"
            if (r0 == 0) goto L_0x0eb4
            X.2Fj r0 = r0.A0A
            java.lang.Object r0 = r0.A02()
            X.8YU r0 = (X.AnonymousClass8YU) r0
            if (r0 != 0) goto L_0x0e39
            r0 = -1
        L_0x0df5:
            r3 = 1
            r2 = 2
            X.861 r1 = r4.A09
            if (r0 != r2) goto L_0x0e20
            if (r1 == 0) goto L_0x0eb4
            r1.A01()
            X.0eM r0 = r4.A0F
            java.lang.Object r2 = r0.getValue()
            X.Jin r2 = (X.C60290Jin) r2
            X.LR9 r0 = r2.A00
            android.media.SoundPool r0 = X.LR9.A00(r0)
            r0.autoPause()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0e13:
            X.KMo r0 = new X.KMo
            r0.<init>(r1)
            X.C60290Jin.A00(r2, r0)
        L_0x0e1b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0e20:
            if (r1 == 0) goto L_0x0eb4
            r1.A03()
            X.0eM r0 = r4.A0F
            java.lang.Object r2 = r0.getValue()
            X.Jin r2 = (X.C60290Jin) r2
            X.LR9 r0 = r2.A00
            android.media.SoundPool r0 = X.LR9.A00(r0)
            r0.autoResume()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0e13
        L_0x0e39:
            int r0 = r0.ordinal()
            goto L_0x0df5
        L_0x0e3e:
            android.view.View r0 = (android.view.View) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0e1b
            java.lang.Object r8 = r4.A01
            X.K6R r8 = (X.K6R) r8
            X.0eM r0 = r8.A0F
            java.lang.Object r7 = r0.getValue()
            X.Jin r7 = (X.C60290Jin) r7
            X.01W r9 = r7.A03
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0ee8
            java.lang.Object r0 = r9.removeLast()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r6 = r0.A00
            java.lang.Number r6 = (java.lang.Number) r6
            int r10 = r6.intValue()
            java.lang.Object r5 = r0.A01
            X.JwH r5 = (X.C61079JwH) r5
            X.LR9 r2 = r7.A00
            java.lang.Object r0 = r5.A00
            X.9cM r0 = (X.C381809cM) r0
            java.lang.String r1 = r0.A04
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.util.Map r0 = r2.A04
            java.lang.Number r0 = X.C51966G9m.A14(r1, r0)
            if (r0 == 0) goto L_0x0e9f
            int r4 = r0.intValue()
            X.L6L r0 = r2.A03
            java.util.Map r2 = r0.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Number r0 = X.C51966G9m.A14(r1, r2)
            if (r0 == 0) goto L_0x0e9f
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x0e9f
            r2.remove(r1)
        L_0x0e9f:
            int r0 = r9.size()
            if (r0 != 0) goto L_0x0eaa
            X.KMq r0 = X.C61802KMq.A00
            X.C60290Jin.A00(r7, r0)
        L_0x0eaa:
            int r7 = r6.intValue()
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView r6 = r8.A08
            if (r6 != 0) goto L_0x0ebc
            java.lang.String r5 = "sfxSeekBarView"
        L_0x0eb4:
            X.0qQ.A0F(r5)
        L_0x0eb7:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0ebc:
            java.lang.String r5 = r5.A02
            X.0qQ.A0B(r5, r3)
            java.util.List r4 = r6.A0C
            java.util.Iterator r3 = r4.iterator()
        L_0x0ec7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0ee8
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.LMn r1 = (X.C64094LMn) r1
            java.lang.String r0 = r1.A03
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0ec7
            int r0 = r1.A01
            if (r0 != r7) goto L_0x0ec7
            if (r2 == 0) goto L_0x0ee8
            r4.remove(r2)
            r6.postInvalidate()
        L_0x0ee8:
            X.0eM r0 = r8.A0E
            X.27r r2 = X.C51971G9r.A0g(r0)
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "SOUND_EFFECTS_SOUNDBOARD_UNDO"
            r2.A1Q(r1, r0)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP5.invoke(java.lang.Object):java.lang.Object");
    }
}
