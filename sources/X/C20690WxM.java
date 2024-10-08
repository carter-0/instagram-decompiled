package X;

/* renamed from: X.WxM  reason: case insensitive filesystem */
public final class C20690WxM extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20690WxM(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C20690WxM(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.0iw} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00fd: MOVE  (r1v1 X.XAI) = (r1v0 X.XAI)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x011e;
                case 1: goto L_0x0005;
                case 2: goto L_0x0117;
                case 3: goto L_0x0110;
                case 4: goto L_0x0005;
                case 5: goto L_0x0117;
                case 6: goto L_0x0110;
                case 7: goto L_0x011e;
                case 8: goto L_0x0005;
                case 9: goto L_0x0117;
                case 10: goto L_0x0110;
                case 11: goto L_0x00f0;
                case 12: goto L_0x0005;
                case 13: goto L_0x0117;
                case 14: goto L_0x0110;
                case 15: goto L_0x00f0;
                case 16: goto L_0x0005;
                case 17: goto L_0x0117;
                case 18: goto L_0x0110;
                case 19: goto L_0x00f0;
                case 20: goto L_0x0005;
                case 21: goto L_0x0117;
                case 22: goto L_0x0110;
                case 23: goto L_0x00cc;
                case 24: goto L_0x0005;
                case 25: goto L_0x0117;
                case 26: goto L_0x0110;
                case 27: goto L_0x00a9;
                case 28: goto L_0x0005;
                case 29: goto L_0x0117;
                case 30: goto L_0x0110;
                case 31: goto L_0x00c1;
                case 32: goto L_0x00a9;
                case 33: goto L_0x0005;
                case 34: goto L_0x0117;
                case 35: goto L_0x0110;
                case 36: goto L_0x0005;
                case 37: goto L_0x0117;
                case 38: goto L_0x0110;
                case 39: goto L_0x0093;
                case 40: goto L_0x0086;
                case 41: goto L_0x0005;
                case 42: goto L_0x0117;
                case 43: goto L_0x0110;
                case 44: goto L_0x005c;
                case 45: goto L_0x0052;
                case 46: goto L_0x0052;
                case 47: goto L_0x003e;
                case 48: goto L_0x0008;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A01
            return r3
        L_0x0008:
            java.lang.Object r0 = r10.A01
            X.U8T r0 = (X.U8T) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.String r4 = r0.A03
            java.lang.String r3 = r0.A02
            X.WGU r0 = X.WGU.A00(r2)
            java.lang.String r1 = r0.A03
            X.0qQ.A07(r1)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r0 = "ads/ads_manager/fetch_promotion_information_v2/"
            X.C51968G9o.A1K(r2, r0, r4)
            java.lang.String r0 = "fb_auth_token"
            r2.A9m(r0, r3)
            java.lang.String r0 = "flow_id"
            r2.A0G(r0, r1)
            java.lang.Class<X.NHR> r1 = X.NHR.class
            java.lang.Class<X.OOl> r0 = X.C70856OOl.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 1010569493(0x3c3c1115, float:0.011478682)
            X.032 r3 = r1.A03(r0)
            return r3
        L_0x003e:
            java.lang.Object r2 = r10.A01
            X.UZE r2 = (X.UZE) r2
            X.WGU r1 = r2.A00
            if (r1 != 0) goto L_0x004a
            java.lang.String r0 = "promoteLogger"
            goto L_0x00da
        L_0x004a:
            r0 = 13
            X.UcZ r3 = new X.UcZ
            r3.<init>(r1, r2, r0)
            return r3
        L_0x0052:
            java.lang.Object r0 = r10.A01
            X.UaS r0 = (X.C15320UaS) r0
            X.C15320UaS.A01(r0)
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x005c:
            java.lang.Object r6 = r10.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            android.os.Bundle r5 = r6.requireArguments()
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "selected_audio_overlay_track"
            r0 = 0
            r2 = 33
            android.os.Bundle r1 = r6.mArguments
            if (r4 < r2) goto L_0x007f
            if (r1 == 0) goto L_0x0079
            java.lang.Class<com.instagram.music.common.model.AudioOverlayTrack> r0 = com.instagram.music.common.model.AudioOverlayTrack.class
            java.lang.Object r0 = X.2Yc.A01(r1, r0, r3)
        L_0x0077:
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
        L_0x0079:
            X.U89 r3 = new X.U89
            r3.<init>(r5, r6, r0)
            return r3
        L_0x007f:
            if (r1 == 0) goto L_0x0079
            android.os.Parcelable r0 = r1.getParcelable(r3)
            goto L_0x0077
        L_0x0086:
            java.lang.Object r0 = r10.A01
            X.UaR r0 = (X.C15319UaR) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            if (r0 == 0) goto L_0x00e2
            X.WGU r3 = X.WGU.A00(r0)
            return r3
        L_0x0093:
            java.lang.Object r5 = r10.A01
            X.4DH r5 = (X.AnonymousClass4DH) r5
            com.instagram.business.promote.model.PromoteData r7 = X.XAI.A00(r5)
            android.os.Bundle r4 = r5.mArguments
            com.instagram.business.promote.model.PromoteState r8 = X.XA9.A00(r5)
            r6 = 0
            X.U8J r3 = new X.U8J
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x00a9:
            java.lang.Object r5 = r10.A01
            X.4DH r5 = (X.AnonymousClass4DH) r5
            com.instagram.business.promote.model.PromoteData r7 = X.XAI.A00(r5)
            com.instagram.common.session.UserSession r0 = r7.A0y
            X.W1k r6 = X.C18784W1k.A01(r5, r0)
            android.os.Bundle r4 = r5.mArguments
            r8 = 0
            X.U8J r3 = new X.U8J
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x00c1:
            java.lang.Object r0 = r10.A01
            X.UaW r0 = (X.C15324UaW) r0
            com.instagram.common.session.UserSession r1 = r0.getSession()
            com.instagram.business.promote.model.PromoteData r0 = r0.A09
            goto L_0x00d6
        L_0x00cc:
            java.lang.Object r0 = r10.A01
            X.UaC r0 = (X.C15305UaC) r0
            com.instagram.common.session.UserSession r1 = r0.A04
            if (r1 == 0) goto L_0x00e2
            com.instagram.business.promote.model.PromoteData r0 = r0.A03
        L_0x00d6:
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "promoteData"
        L_0x00da:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e2:
            java.lang.String r0 = "session"
            goto L_0x00da
        L_0x00e5:
            java.lang.String r0 = r0.A1A
            X.0qQ.A06(r0)
            X.Uh9 r3 = new X.Uh9
            r3.<init>(r1, r0)
            return r3
        L_0x00f0:
            java.lang.Object r5 = r10.A01
            X.4DH r5 = (X.AnonymousClass4DH) r5
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            boolean r0 = r1 instanceof X.XAI
            r7 = 0
            if (r0 == 0) goto L_0x0105
            X.XAI r1 = (X.XAI) r1
            if (r1 == 0) goto L_0x0105
            com.instagram.business.promote.model.PromoteData r7 = r1.Bhh()
        L_0x0105:
            android.os.Bundle r4 = r5.mArguments
            r6 = 0
            X.U8J r3 = new X.U8J
            r8 = r6
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x0110:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x0117:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x011e:
            java.lang.Object r5 = r10.A01
            X.4DH r5 = (X.AnonymousClass4DH) r5
            com.instagram.business.promote.model.PromoteData r7 = X.XAI.A00(r5)
            com.instagram.business.promote.model.PromoteState r8 = X.XA9.A00(r5)
            android.os.Bundle r4 = r5.mArguments
            r6 = 0
            X.U8J r3 = new X.U8J
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20690WxM.invoke():java.lang.Object");
    }
}
