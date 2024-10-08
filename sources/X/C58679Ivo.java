package X;

/* renamed from: X.Ivo  reason: case insensitive filesystem */
public final class C58679Ivo extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58679Ivo(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C58679Ivo(obj, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01b5: MOVE  (r1v26 X.H0o) = (r1v25 X.H0o)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0048;
                case 2: goto L_0x0057;
                case 3: goto L_0x0075;
                case 4: goto L_0x00a4;
                case 5: goto L_0x00af;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00cf;
                case 8: goto L_0x00e1;
                case 9: goto L_0x00ec;
                case 10: goto L_0x00fa;
                case 11: goto L_0x010e;
                case 12: goto L_0x011e;
                case 13: goto L_0x0145;
                case 14: goto L_0x000c;
                case 15: goto L_0x0152;
                case 16: goto L_0x015a;
                case 17: goto L_0x017b;
                case 18: goto L_0x01ab;
                case 19: goto L_0x0033;
                case 20: goto L_0x01c7;
                case 21: goto L_0x0005;
                case 22: goto L_0x01ce;
                case 23: goto L_0x01dd;
                case 24: goto L_0x01e6;
                case 25: goto L_0x0033;
                case 26: goto L_0x01c7;
                case 27: goto L_0x0005;
                case 28: goto L_0x01fd;
                case 29: goto L_0x0028;
                case 30: goto L_0x0219;
                case 31: goto L_0x0221;
                case 32: goto L_0x0245;
                case 33: goto L_0x02a0;
                case 34: goto L_0x0033;
                case 35: goto L_0x01c7;
                case 36: goto L_0x0005;
                case 37: goto L_0x02d6;
                case 38: goto L_0x0310;
                case 39: goto L_0x0318;
                case 40: goto L_0x0322;
                case 41: goto L_0x032a;
                case 42: goto L_0x032a;
                case 43: goto L_0x0333;
                case 44: goto L_0x0033;
                case 45: goto L_0x01c7;
                case 46: goto L_0x0005;
                case 47: goto L_0x0341;
                case 48: goto L_0x037f;
                case 49: goto L_0x039e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.07f r5 = X.DbY.A0I(r0)
        L_0x000b:
            return r5
        L_0x000c:
            java.lang.Object r0 = r15.A01
            X.Ghc r0 = (X.C53044Ghc) r0
            java.lang.String r1 = r0.A0E
            r5 = 0
            if (r1 == 0) goto L_0x000b
            com.instagram.common.session.UserSession r0 = r0.A0A
            X.1Xj r0 = X.DbV.A0U(r0, r1)
            if (r0 == 0) goto L_0x000b
            X.1sQ r0 = X.C51966G9m.A0n(r0)
            if (r0 == 0) goto L_0x000b
            X.46i r5 = X.C291335gz.A01(r0)
            return r5
        L_0x0028:
            java.lang.Object r0 = r15.A01
            X.Gt2 r0 = (X.C53711Gt2) r0
            com.instagram.api.schemas.AudioFilterType r5 = r0.A00
            if (r5 != 0) goto L_0x000b
            com.instagram.api.schemas.AudioFilterType r5 = com.instagram.api.schemas.AudioFilterType.UNRECOGNIZED
            return r5
        L_0x0033:
            java.lang.Object r5 = r15.A01
            return r5
        L_0x0036:
            java.lang.Object r0 = r15.A01
            X.OMg r0 = (X.C70811OMg) r0
            android.os.PowerManager r2 = r0.A01
            java.lang.String r1 = "ProximitySensorManager:ProximitySensor"
            r0 = 32
            android.os.PowerManager$WakeLock r5 = r2.newWakeLock(r0, r1)
            X.0BX.A02(r5, r1)
            return r5
        L_0x0048:
            java.lang.Object r0 = r15.A01
            X.GzU r0 = (X.C54099GzU) r0
            android.os.Bundle r1 = r0.requireArguments()
            java.lang.String r0 = r0.A01
            java.lang.String r5 = r1.getString(r0)
            return r5
        L_0x0057:
            java.lang.Object r1 = r15.A01
            X.GHj r1 = (X.C52167GHj) r1
            X.2ur r0 = r1.A03
            java.util.List r10 = r1.A0c
            r2 = 0
            r11 = 0
            X.4LN r1 = new X.4LN
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r12 = r11
            r13 = r11
            r14 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.DFK(r1)
            goto L_0x033e
        L_0x0075:
            java.lang.Object r3 = r15.A01
            X.GHj r3 = (X.C52167GHj) r3
            com.instagram.common.session.UserSession r9 = r3.A0P
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319239887592477(0x81082800031c1d, double:3.0317717785294464E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00a2
            android.content.Context r6 = r3.A0L
            X.93T r12 = r3.A0W
            X.4DU r10 = r3.A0R
            X.HJk r13 = r3.A0V
            X.GEP r8 = r3.A0O
            X.2uu r11 = r3.A04
            r0 = 2
            X.Ivo r14 = new X.Ivo
            r14.<init>(r3, r0)
            X.4h9 r7 = r3.A0N
            X.GHm r5 = new X.GHm
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L_0x00a2:
            r5 = 0
            return r5
        L_0x00a4:
            java.lang.Object r0 = r15.A01
            X.GHj r0 = (X.C52167GHj) r0
            com.instagram.common.session.UserSession r0 = r0.A0P
            X.93a r5 = X.AnonymousClass93Z.A01(r0)
            return r5
        L_0x00af:
            java.lang.Object r0 = r15.A01
            X.GYe r0 = (X.C52579GYe) r0
            java.lang.String r2 = r0.A04
            X.4DU r1 = r0.A02
            com.instagram.common.session.UserSession r0 = r0.A01
            X.GYg r5 = new X.GYg
            r5.<init>(r0, r1, r2)
            return r5
        L_0x00bf:
            java.lang.Object r0 = r15.A01
            X.GYe r0 = (X.C52579GYe) r0
            java.lang.String r2 = r0.A04
            X.4DU r1 = r0.A02
            com.instagram.common.session.UserSession r0 = r0.A01
            X.GYh r5 = new X.GYh
            r5.<init>(r0, r1, r2)
            return r5
        L_0x00cf:
            java.lang.Object r0 = r15.A01
            X.GYe r0 = (X.C52579GYe) r0
            android.content.Context r3 = r0.A00
            X.4DU r2 = r0.A02
            com.instagram.common.session.UserSession r1 = r0.A01
            X.93U r0 = r0.A03
            X.GYi r5 = new X.GYi
            r5.<init>(r3, r1, r2, r0)
            return r5
        L_0x00e1:
            java.lang.Object r0 = r15.A01
            X.GAv r0 = (X.C51998GAv) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            X.93a r5 = X.AnonymousClass93Z.A01(r0)
            return r5
        L_0x00ec:
            java.lang.Object r0 = r15.A01
            X.ILp r0 = (X.C57023ILp) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            X.GAh r0 = r0.A03
            X.IPI r5 = new X.IPI
            r5.<init>(r1, r0)
            return r5
        L_0x00fa:
            java.lang.Object r0 = r15.A01
            X.ILp r0 = (X.C57023ILp) r0
            com.instagram.common.session.UserSession r6 = r0.A00
            java.lang.String r10 = r0.A04
            X.4DU r8 = r0.A02
            X.2uY r7 = r0.A01
            X.GAh r9 = r0.A03
            X.H8g r5 = new X.H8g
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x010e:
            java.lang.Object r0 = r15.A01
            X.ILp r0 = (X.C57023ILp) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.String r1 = r0.A04
            X.4DU r0 = r0.A02
            X.H8j r5 = new X.H8j
            r5.<init>(r2, r0, r1)
            return r5
        L_0x011e:
            java.lang.Object r0 = r15.A01
            X.Hoz r0 = (X.C55878Hoz) r0
            com.instagram.common.session.UserSession r3 = r0.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316138921005053(0x81055600000ffd, double:3.029810714772969E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0134
            X.5nD r5 = X.C294895nD.DEFER_STREAMING
            return r5
        L_0x0134:
            r0 = 36316138921201664(0x81055600031000, double:3.029810714897307E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0142
            X.5nD r5 = X.C294895nD.CHUNK_STREAMING
            return r5
        L_0x0142:
            X.5nD r5 = X.C294895nD.DEFAULT
            return r5
        L_0x0145:
            java.lang.Object r0 = r15.A01
            X.6sL r0 = (X.C320416sL) r0
            X.6sN r0 = r0.A02
            java.util.Set r0 = r0.A02
            r0.clear()
            goto L_0x033e
        L_0x0152:
            java.lang.Object r0 = r15.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            java.lang.Object[] r5 = new java.lang.Object[r0]
            return r5
        L_0x015a:
            java.lang.Object r7 = r15.A01
            X.Gzv r7 = (X.C54126Gzv) r7
            android.content.Context r6 = r7.requireContext()
            X.0eM r0 = r7.A07
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r10 = r7.A02
            if (r10 != 0) goto L_0x0170
            java.lang.String r0 = "musicBrowseSessionId"
            goto L_0x01f0
        L_0x0170:
            X.Hjc r9 = new X.Hjc
            r9.<init>(r7)
            X.IQE r5 = new X.IQE
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x017b:
            java.lang.Object r5 = r15.A01
            X.Gzv r5 = (X.C54126Gzv) r5
            X.0eM r0 = r5.A07
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.Class<com.instagram.common.gallery.Medium> r1 = com.instagram.common.gallery.Medium.class
            java.lang.String r0 = "selected_media"
            java.util.ArrayList r2 = X.C320236s2.A02(r2, r1, r0)
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 389(0x185, float:5.45E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            X.KEC r5 = new X.KEC
            r5.<init>(r3, r4, r0, r2)
            return r5
        L_0x01ab:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof X.C54144H0o
            if (r0 == 0) goto L_0x01c0
            X.H0o r1 = (X.C54144H0o) r1
            if (r1 == 0) goto L_0x01c0
            X.GgR r5 = X.C39602A1s.A00(r1)
            if (r5 == 0) goto L_0x01c0
            return r5
        L_0x01c0:
            java.lang.String r0 = "Invalid parent fragment for AudioPickerFragment"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01c7:
            java.lang.Object r0 = r15.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x01ce:
            X.Gzv r5 = new X.Gzv
            r5.<init>()
            java.lang.Object r0 = r15.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            r5.setArguments(r0)
            return r5
        L_0x01dd:
            java.lang.Object r0 = r15.A01
            X.H0o r0 = (X.C54144H0o) r0
            X.GgR r5 = X.C39602A1s.A00(r0)
            return r5
        L_0x01e6:
            java.lang.Object r0 = r15.A01
            X.H1J r0 = (X.H1J) r0
            X.U94 r0 = r0.A04
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = "adapter"
        L_0x01f0:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f8:
            r0.A05()
            goto L_0x033e
        L_0x01fd:
            java.lang.Object r1 = r15.A01
            X.H1J r1 = (X.H1J) r1
            android.app.Application r6 = X.DbY.A05(r1)
            X.0eM r0 = r1.A0A
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r10 = r1.A07
            com.instagram.api.schemas.TrackOrOriginalSoundSchema r7 = r1.A01
            X.HM8 r9 = r1.A05
            java.lang.String r11 = r1.A06
            X.H6k r5 = new X.H6k
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x0219:
            java.lang.Object r0 = r15.A01
            X.Hiw r0 = (X.C55514Hiw) r0
            X.0sa r0 = r0.A00
            goto L_0x0314
        L_0x0221:
            java.lang.Object r0 = r15.A01
            X.DcO r0 = (X.DcO) r0
            X.1Av r0 = r0.A01
            X.0xa r1 = r0.A01
            r0 = 4530(0x11b2, float:6.348E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xY r3 = X.AnonymousClass7TG.A0g(r1, r0)
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 4529(0x11b1, float:6.346E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.E5c(r0, r1)
            r3.apply()
            goto L_0x033e
        L_0x0245:
            java.lang.Object r3 = r15.A01
            X.Eyg r3 = (X.C49571Eyg) r3
            android.content.Context r0 = r3.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624902(0x7f0e03c6, float:1.8876997E38)
            android.view.View r5 = X.DbU.A08(r1, r0)
            X.0qQ.A07(r5)
            r0 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r2 = r5.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r2.getContext()
            r0 = 2131238413(0x7f081e0d, float:1.8093104E38)
            X.DbU.A13(r1, r2, r0)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r5, r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131955302(0x7f130e66, float:1.9547128E38)
            X.DbT.A18(r1, r2, r0)
            r0 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r5, r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131955301(0x7f130e65, float:1.9547126E38)
            X.DbT.A18(r1, r2, r0)
            r0 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.view.View r2 = r5.findViewById(r0)
            r1 = 26
            X.FOz r0 = new X.FOz
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            return r5
        L_0x02a0:
            java.lang.Object r0 = r15.A01
            X.H01 r0 = (X.H01) r0
            X.0eM r0 = r0.A09
            java.lang.Object r5 = r0.getValue()
            X.Ggx r5 = (X.C53006Ggx) r5
            X.KWh r0 = r5.A00
            X.0Ud r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.MQ0 r1 = (X.MQ0) r1
            r0 = 1
            boolean r0 = X.C59678JTj.A01(r0, r1)
            r4 = 0
            if (r0 == 0) goto L_0x02d4
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r0 = r1.A01
            X.Gmn r0 = (X.C53363Gmn) r0
            java.lang.String r3 = r0.A04
        L_0x02c6:
            X.6oS r2 = X.C318116oQ.A00(r5)
            r1 = 5
            X.IlT r0 = new X.IlT
            r0.<init>(r5, r3, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            goto L_0x033e
        L_0x02d4:
            r3 = r4
            goto L_0x02c6
        L_0x02d6:
            java.lang.Object r1 = r15.A01
            X.H01 r1 = (X.H01) r1
            X.0eM r0 = r1.A06
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A08
            java.lang.String r7 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A00
            java.lang.String r8 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A02
            java.lang.String r9 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A03
            java.lang.String r10 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A05
            java.lang.String r11 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A07
            boolean r12 = X.AnonymousClass7TF.A1Z(r0)
            X.0eM r0 = r1.A04
            boolean r13 = X.AnonymousClass7TF.A1Z(r0)
            X.H6s r5 = new X.H6s
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x0310:
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x0314:
            r0.invoke()
            goto L_0x033e
        L_0x0318:
            java.lang.Object r1 = r15.A01
            X.5Oz r1 = (X.C284945Oz) r1
            X.HLR r0 = X.HLR.MESSAGE_BAR
            r1.Epw(r0)
            goto L_0x033e
        L_0x0322:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0z(r0)
            goto L_0x033e
        L_0x032a:
            java.lang.Object r0 = r15.A01
            X.Hmp r0 = (X.C55754Hmp) r0
            X.05G r1 = r0.A01
            X.HLx r0 = X.C54640HLx.MENU
            goto L_0x033b
        L_0x0333:
            java.lang.Object r0 = r15.A01
            X.Hmp r0 = (X.C55754Hmp) r0
            X.05G r1 = r0.A01
            X.HLx r0 = X.C54640HLx.MEMBER_LIST
        L_0x033b:
            r1.FIA(r0)
        L_0x033e:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0341:
            java.lang.Object r1 = r15.A01
            X.H00 r1 = (X.H00) r1
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A03
            java.lang.String r7 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A00
            java.lang.String r8 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            if (r0 == 0) goto L_0x037c
            java.util.Set r9 = X.03t.A0K(r0)
        L_0x0365:
            X.0eM r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            if (r0 == 0) goto L_0x0379
            java.util.Set r10 = X.03t.A0K(r0)
        L_0x0373:
            X.H6g r5 = new X.H6g
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0379:
            X.0sl r10 = X.0sl.A00
            goto L_0x0373
        L_0x037c:
            X.0sl r9 = X.0sl.A00
            goto L_0x0365
        L_0x037f:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x039c
            java.lang.String r1 = r0.getPackageName()
        L_0x038d:
            r0 = 4624(0x1210, float:6.48E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x039c:
            r1 = 0
            goto L_0x038d
        L_0x039e:
            java.lang.Object r0 = r15.A01
            X.H18 r0 = (X.H18) r0
            X.Idd r5 = new X.Idd
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58679Ivo.invoke():java.lang.Object");
    }
}
