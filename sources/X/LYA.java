package X;

import android.view.View;

public final class LYA implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public LYA(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj3;
        this.A01 = obj2;
    }

    public static LYA A00(Object obj, Object obj2, Object obj3, int i) {
        return new LYA(i, obj, obj2, obj3);
    }

    public static void A01(View view, Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass0fU.A00(new LYA(i, obj, obj2, obj3), view);
    }

    /* JADX WARNING: type inference failed for: r1v76, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.widget.ImageView] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0bd5: MOVE  (r2v31 X.2t9) = (r2v30 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0d7c  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0d84  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0f0b  */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.A00
            r2 = r23
            switch(r1) {
                case 0: goto L_0x0060;
                case 1: goto L_0x0c0e;
                case 2: goto L_0x0da7;
                case 3: goto L_0x0bb8;
                case 4: goto L_0x0b1b;
                case 5: goto L_0x0b59;
                case 6: goto L_0x0ae5;
                case 7: goto L_0x0d93;
                case 8: goto L_0x0ac0;
                case 9: goto L_0x0d43;
                case 10: goto L_0x0a6a;
                case 11: goto L_0x0f18;
                case 12: goto L_0x0a22;
                case 13: goto L_0x09c5;
                case 14: goto L_0x0cb0;
                case 15: goto L_0x095d;
                case 16: goto L_0x0919;
                case 17: goto L_0x08cb;
                case 18: goto L_0x08a4;
                case 19: goto L_0x0885;
                case 20: goto L_0x086a;
                case 21: goto L_0x07f3;
                case 22: goto L_0x0767;
                case 23: goto L_0x0740;
                case 24: goto L_0x068f;
                case 25: goto L_0x0ecf;
                case 26: goto L_0x0c5d;
                case 27: goto L_0x0650;
                case 28: goto L_0x060c;
                case 29: goto L_0x05cd;
                case 30: goto L_0x058b;
                case 31: goto L_0x056e;
                case 32: goto L_0x0551;
                case 33: goto L_0x0531;
                case 34: goto L_0x050e;
                case 35: goto L_0x034a;
                case 36: goto L_0x03cf;
                case 37: goto L_0x030d;
                case 38: goto L_0x02f2;
                case 39: goto L_0x02b8;
                case 40: goto L_0x026a;
                case 41: goto L_0x01ee;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01b6;
                case 44: goto L_0x018a;
                case 45: goto L_0x0165;
                case 46: goto L_0x0140;
                case 47: goto L_0x011b;
                case 48: goto L_0x0035;
                case 49: goto L_0x00f5;
                case 50: goto L_0x00cf;
                case 51: goto L_0x00b0;
                case 52: goto L_0x0087;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = -866971968(0xffffffffcc530ec0, float:-5.5327488E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            instagram.features.clips.edit.ClipsEditMetadataController r8 = (instagram.features.clips.edit.ClipsEditMetadataController) r8
            java.lang.Object r7 = r0.A02
            X.0qQ.A0A(r7)
            java.lang.Object r6 = r0.A01
            android.content.Context r5 = r8.A0n
            com.instagram.common.session.UserSession r4 = r8.A0s
            X.1Xj r3 = r8.A0D
            r2 = 5
            X.OrO r0 = new X.OrO
            r0.<init>(r2, r7, r6, r8)
            X.8ab r0 = X.AnonymousClass4LK.A01(r5, r0, r4, r3)
            X.DbT.A1V(r0)
            r0 = 1448752326(0x565a34c6, float:5.9980049E13)
        L_0x0031:
            X.AnonymousClass0fD.A0C(r0, r1)
        L_0x0034:
            return
        L_0x0035:
            r1 = -623774529(0xffffffffdad1f4bf, float:-2.95486857E16)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r9 = X.LRB.A00(r1)
            java.lang.Object r7 = r0.A02
            java.lang.Object r8 = r0.A01
            boolean r0 = r8 instanceof X.M0V
            r10 = 0
            if (r0 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x005b
            X.6oS r0 = X.C318116oQ.A00(r9)
            r11 = 12
            X.MHK r6 = new X.MHK
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r11)
            X.AnonymousClass7TE.A1Z(r6, r0)
        L_0x005b:
            r0 = -672511844(0xffffffffd7ea489c, float:-5.15195152E14)
            goto L_0x0423
        L_0x0060:
            r1 = -816731505(0xffffffffcf51aa8f, float:-3.51761587E9)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.4tV r3 = (X.C276544tV) r3
            java.lang.Object r2 = r0.A03
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            r1.A01(r3)
            X.6Tm r1 = r1.A00()
            java.lang.Object r0 = r0.A01
            X.6Rm r0 = (X.C307786Rm) r0
            X.C307886Rw.A03(r0, r3, r1, r2)
            r0 = 1270923192(0x4bc0bfb8, float:2.5263984E7)
            goto L_0x0423
        L_0x0087:
            r1 = -347757330(0xffffffffeb45a4ee, float:-2.3893724E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            instagram.features.clips.edit.ClipsEditMetadataController r8 = (instagram.features.clips.edit.ClipsEditMetadataController) r8
            java.lang.Object r7 = r0.A02
            X.0qQ.A0A(r7)
            java.lang.Object r6 = r0.A01
            android.content.Context r5 = r8.A0n
            com.instagram.common.session.UserSession r4 = r8.A0s
            X.1Xj r3 = r8.A0D
            r2 = 5
            X.OrO r0 = new X.OrO
            r0.<init>(r2, r7, r6, r8)
            X.8ab r0 = X.AnonymousClass4LK.A01(r5, r0, r4, r3)
            X.DbT.A1V(r0)
            r0 = 468595254(0x1bee3236, float:3.9406245E-22)
            goto L_0x0031
        L_0x00b0:
            r1 = 1451498303(0x56841b3f, float:7.2626278E13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.Kcx r5 = (X.C62263Kcx) r5
            java.lang.Object r4 = r0.A01
            android.view.View r4 = (android.view.View) r4
            android.view.View r3 = r5.A00
            java.lang.Object r2 = r0.A02
            com.instagram.common.ui.base.IgEditText r2 = (com.instagram.common.ui.base.IgEditText) r2
            com.instagram.igds.components.button.IgdsButton r0 = r5.A02
            r5.A0F(r4, r3, r2, r0)
            r0 = -473087906(0xffffffffe3cd405e, float:-7.5724414E21)
            goto L_0x0031
        L_0x00cf:
            r1 = -1386864053(0xffffffffad56224b, float:-1.2172106E-11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r2)
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A01
            r8 = 0
            X.6oS r0 = X.C318116oQ.A00(r5)
            r6 = 0
            r7 = 21
            X.JTf r2 = new X.JTf
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = -607398895(0xffffffffdbcbd411, float:-1.1474518E17)
            goto L_0x0031
        L_0x00f5:
            r1 = 1181358707(0x466a1a73, float:14982.612)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r2)
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A01
            r8 = 1
            X.6oS r0 = X.C318116oQ.A00(r5)
            r6 = 0
            r7 = 21
            X.JTf r2 = new X.JTf
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = -746317739(0xffffffffd3841855, float:-1.13468781E12)
            goto L_0x0031
        L_0x011b:
            r1 = 292592060(0x117099bc, float:1.8980035E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r2)
            java.lang.Object r3 = r0.A02
            java.lang.Object r4 = r0.A01
            X.6oS r0 = X.C318116oQ.A00(r5)
            r6 = 0
            r7 = 11
            X.MHK r2 = new X.MHK
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 1445302063(0x56258f2f, float:4.5508597E13)
            goto L_0x0031
        L_0x0140:
            r1 = -936602552(0xffffffffc82c9448, float:-176721.12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r2)
            java.lang.Object r3 = r0.A02
            java.lang.Object r4 = r0.A01
            X.6oS r0 = X.C318116oQ.A00(r5)
            r6 = 0
            r7 = 16
            X.MHK r2 = new X.MHK
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 518447910(0x1ee6e326, float:2.4446144E-20)
            goto L_0x0031
        L_0x0165:
            r1 = 2145774892(0x7fe5ed2c, float:NaN)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r2)
            java.lang.Object r3 = r0.A02
            java.lang.Object r4 = r0.A01
            X.6oS r0 = X.C318116oQ.A00(r5)
            r6 = 0
            r7 = 11
            X.MHK r2 = new X.MHK
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = -14976312(0xffffffffff1b7ac8, float:-2.0666786E38)
            goto L_0x0031
        L_0x018a:
            r1 = -1977406952(0xffffffff8a232a18, float:-7.8560815E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r4 = X.LRB.A00(r2)
            java.lang.Object r3 = r0.A02
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x01b3
            java.lang.String r5 = "comment_action_sheet"
        L_0x019f:
            X.6oS r0 = X.C318116oQ.A00(r4)
            r6 = 0
            r7 = 23
            X.MGk r2 = new X.MGk
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 44989464(0x2ae7c18, float:2.5638228E-37)
            goto L_0x0031
        L_0x01b3:
            java.lang.String r5 = "header"
            goto L_0x019f
        L_0x01b6:
            r1 = -972859770(0xffffffffc6035686, float:-8405.631)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.LRB r4 = (X.LRB) r4
            java.lang.Object r3 = r0.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r2 = r0.A01
            X.MVW r2 = (X.MVW) r2
            r0 = 1
            X.LRB.A01(r3, r2, r4, r0)
            r0 = -375925394(0xffffffffe997d56e, float:-2.2944461E25)
            goto L_0x0031
        L_0x01d2:
            r1 = 1381019124(0x5250adf4, float:2.24067912E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.LRB r4 = (X.LRB) r4
            java.lang.Object r3 = r0.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r2 = r0.A01
            X.MVW r2 = (X.MVW) r2
            r0 = 0
            X.LRB.A01(r3, r2, r4, r0)
            r0 = -1691223762(0xffffffff9b31f92e, float:-1.4721611E-22)
            goto L_0x0031
        L_0x01ee:
            r1 = 1038488186(0x3de6127a, float:0.11233993)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r8 = X.LRB.A00(r2)
            java.lang.Object r6 = r0.A02
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x024d
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0205:
            X.M0X r5 = r8.A07
            if (r5 == 0) goto L_0x0256
            java.lang.String r3 = r6.getId()
            java.lang.Integer r2 = r6.A0M()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r2 = X.AnonymousClass7TF.A1W(r2, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0k
            X.1Ln r4 = X.M0X.A02(r5, r0)
            java.lang.String r0 = X.C63484Kxo.A00(r7)
            r4.A0p(r0)
            java.lang.String r0 = "guest_id"
            r4.A0R(r0, r3)
            if (r2 == 0) goto L_0x024a
            r2 = 1
        L_0x022d:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "is_invitable"
            r4.A0Q(r0, r2)
            java.util.concurrent.ConcurrentHashMap r0 = r5.A0U
            java.util.ArrayList r3 = X.JTT.A0q(r4, r0)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r0)
        L_0x0240:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0250
            X.JTT.A1T(r3, r2)
            goto L_0x0240
        L_0x024a:
            r2 = 0
            goto L_0x022d
        L_0x024d:
            java.lang.Integer r7 = X.AnonymousClass05K.A05
            goto L_0x0205
        L_0x0250:
            X.M0X.A07(r4, r5, r3)
            r4.Cgf()
        L_0x0256:
            X.6oS r0 = X.C318116oQ.A00(r8)
            r9 = 0
            r10 = 13
            X.MHK r5 = new X.MHK
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.AnonymousClass7TE.A1Z(r5, r0)
            r0 = -142634370(0xfffffffff77f927e, float:-5.1836208E33)
            goto L_0x0031
        L_0x026a:
            r1 = 1246929861(0x4a52a3c5, float:3451121.2)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.GUi r5 = X.C63556Kz5.A01
            java.lang.Object r8 = r0.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            android.app.Activity r6 = X.C61270mF.A00(r2)
            java.lang.Object r2 = r0.A03
            r0 = 11
            X.LdB r7 = new X.LdB
            r7.<init>(r2, r0)
            r4 = 0
            X.0Tu r0 = X.0Tu.A05
            r2 = 36321262817322200(0x8109ff000524d8, double:3.0330510874362074E-306)
            boolean r0 = X.182.A06(r0, r8, r2)
            X.6nx r3 = X.C317846nw.A01
            X.6ny r2 = X.C317866ny.LIVE_REACTION
            if (r0 == 0) goto L_0x02b5
            X.6nw r0 = X.C317846nw.LIVE_REACTIONS_STATIC_STICKER_PACK
        L_0x029c:
            r11 = 0
            java.lang.String r0 = r3.A00(r0, r2, r8, r4)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r12 = X.0sr.A1L(r0)
            java.lang.String r9 = "ig_live"
            java.lang.String r10 = "ig_live_post_live"
            r5.A04(r6, r7, r8, r9, r10, r11, r12)
            r0 = 680566626(0x28909f62, float:1.6056333E-14)
            goto L_0x0031
        L_0x02b5:
            X.6nw r0 = X.C317846nw.LIVE_REACTIONS_ANIMATED_STICKER_PACK
            goto L_0x029c
        L_0x02b8:
            r1 = 1517882779(0x5a790d9b, float:1.75255571E16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            r9 = 0
            X.0qQ.A0B(r2, r9)
            java.lang.Object r4 = r0.A03
            X.JeZ r4 = (X.C60058JeZ) r4
            java.lang.Object r5 = r0.A01
            X.5nZ r5 = (X.C295095nZ) r5
            boolean r3 = r5.A00
            if (r3 == 0) goto L_0x02e2
            java.lang.String r7 = r5.A04
        L_0x02d1:
            java.lang.Object r6 = r0.A02
            com.instagram.igds.components.switchbutton.IgdsSwitch r6 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r6
            java.lang.String r8 = "share_sheet_toggle"
            r4.A05(r5, r6, r7, r8, r9)
            r0 = 1
            r4.A09 = r0
            r0 = -331887550(0xffffffffec37cc42, float:-8.88792E26)
            goto L_0x0031
        L_0x02e2:
            android.content.Context r2 = r2.getContext()
            X.0qQ.A07(r2)
            X.5w9 r2 = X.AnonymousClass5w8.A05
            com.instagram.common.session.UserSession r2 = r4.A0J
            X.AnonymousClass5w9.A00(r2)
            r7 = 0
            goto L_0x02d1
        L_0x02f2:
            r1 = 1412244690(0x542d24d2, float:2.97458834E12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.LT3 r3 = (X.LT3) r3
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r0.A02
            X.KiL r0 = (X.C62588KiL) r0
            X.LT3.A01(r2, r0, r3)
            r0 = 811947681(0x306556a1, float:8.343282E-10)
            goto L_0x0031
        L_0x030d:
            r1 = -62402807(0xfffffffffc47cf09, float:-4.149865E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            com.instagram.ui.widget.gallery.GalleryView r2 = (com.instagram.ui.widget.gallery.GalleryView) r2
            int r4 = r2.A02
            java.lang.Object r3 = r0.A03
            X.LPF r3 = (X.LPF) r3
            com.instagram.common.session.UserSession r0 = r3.A05
            X.OYk r2 = X.C63234Ktf.A00(r0)
            if (r4 != 0) goto L_0x0336
            X.KQn r0 = X.C61894KQn.A00
        L_0x0328:
            X.C71012OYk.A00(r0, r2)
            r3.A04()
            com.instagram.ui.widget.gallery.GalleryView r2 = r3.A03
            if (r2 != 0) goto L_0x0339
            java.lang.String r6 = "galleryView"
            goto L_0x0b98
        L_0x0336:
            X.KQh r0 = X.KQh.A00
            goto L_0x0328
        L_0x0339:
            int r0 = r2.A02
            if (r0 != 0) goto L_0x0345
            X.LPF.A00(r3)
        L_0x0340:
            r0 = -1139454232(0xffffffffbc154ee8, float:-0.009113051)
            goto L_0x0031
        L_0x0345:
            r0 = 0
            r2.setMaxMultiSelectCount(r0)
            goto L_0x0340
        L_0x034a:
            r1 = 1023621291(0x3d0338ab, float:0.032036465)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.tagging.widget.TagsInteractiveLayout r2 = (com.instagram.tagging.widget.TagsInteractiveLayout) r2
            java.lang.Object r3 = r0.A01
            com.instagram.tagging.api.model.MediaSuggestedProductTag r3 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r3
            java.util.ArrayList r1 = r2.A0C
            r1.remove(r3)
            android.view.View r1 = r2.findViewWithTag(r3)
            r2.removeView(r1)
            X.MVH r2 = r2.A08
            r1 = 0
            r2.DqQ(r1)
            java.lang.Object r8 = r0.A03
            com.instagram.tagging.activity.TaggingActivity r8 = (com.instagram.tagging.activity.TaggingActivity) r8
            r6 = 0
            java.util.List r0 = r3.A02
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            java.lang.Object r4 = r0.get(r6)
            com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer r4 = (com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer) r4
            X.0eM r0 = r8.A0o
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r13 = r8.A0K
            if (r13 != 0) goto L_0x038a
            java.lang.String r6 = "_shoppingCreationSessionId"
            goto L_0x0b98
        L_0x038a:
            boolean r0 = com.instagram.tagging.activity.TaggingActivity.A0U(r8)
            r21 = r0 ^ 1
            int r2 = r8.A00
            java.lang.String r15 = X.JTT.A0n(r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            float r0 = r4.A00
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            android.graphics.PointF r6 = r3.A00
            X.Jqt r7 = com.instagram.tagging.activity.TaggingActivity.A02(r8)
            X.Khv r10 = r3.A01
            X.0qQ.A07(r10)
            java.lang.String r0 = r8.A0L
            if (r0 != 0) goto L_0x03b3
            java.lang.String r6 = "priorSubmodule"
            goto L_0x0b98
        L_0x03b3:
            boolean r3 = com.instagram.tagging.activity.TaggingActivity.A0S(r8)
            if (r3 == 0) goto L_0x03cc
            java.lang.String r19 = "opt"
        L_0x03bb:
            java.lang.String r14 = "remove"
            java.lang.String r18 = "feed"
            r17 = r0
            r20 = r2
            r16 = r1
            X.LTQ.A04(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 1620266889(0x60934f89, float:8.491883E19)
            goto L_0x0423
        L_0x03cc:
            java.lang.String r19 = "seller"
            goto L_0x03bb
        L_0x03cf:
            r1 = 800284109(0x2fb35dcd, float:3.262656E-10)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.LB9 r1 = (X.LB9) r1
            java.lang.Object r2 = r0.A03
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel r2 = (com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel) r2
            java.lang.Object r4 = r0.A01
            X.7Pu r4 = (X.C331157Pu) r4
            com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel$MixedAttributionType r0 = r2.A03
            int r7 = r0.ordinal()
            r0 = 1
            r3 = 0
            r12 = 0
            if (r7 == r3) goto L_0x046b
            if (r7 == r0) goto L_0x04aa
            r6 = 2
            if (r7 == r6) goto L_0x0427
            r0 = 3
            if (r7 != r0) goto L_0x0420
            java.lang.Object r10 = r2.A01
            if (r10 == 0) goto L_0x050a
            java.lang.String r10 = (java.lang.String) r10
            X.0iw r0 = r1.A03
            java.lang.String r11 = r0.getModuleName()
            boolean r13 = r1.A01
            X.G6I r6 = r1.A06
            X.6ac r7 = r1.A07
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r0 = 79
            java.lang.String r9 = X.C273654mx.A00(r0)
            X.DxF r6 = X.C49091EpG.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r6.A08 = r4
        L_0x0417:
            com.instagram.common.session.UserSession r0 = r1.A04
            X.7Pr r0 = X.DbS.A0W(r0)
            r4.A0E(r6, r0)
        L_0x0420:
            r0 = -1598371016(0xffffffffa0bacb38, float:-3.1644105E-19)
        L_0x0423:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0427:
            X.0iw r10 = r1.A03
            com.instagram.common.session.UserSession r11 = r1.A04
            java.lang.String r13 = r10.getModuleName()
            java.lang.String r15 = r1.A00
            java.lang.String r14 = "camera_format_attribution_bottom_sheet"
            X.0qQ.A0B(r11, r0)
            X.0qQ.A0B(r13, r6)
            r16 = r12
            X.C63978LGs.A01(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.A01
            if (r2 == 0) goto L_0x050a
            X.6Ku r2 = (X.C306106Ku) r2
            if (r2 == 0) goto L_0x0420
            X.9so r0 = X.C391389so.NORMAL
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r2.A00
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0420
            X.K7C r6 = new X.K7C
            r6.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "reel_capture_type"
            r2.putString(r0, r3)
            java.lang.String r0 = "source_media_id"
            r2.putString(r0, r15)
            r6.setArguments(r2)
            goto L_0x0417
        L_0x046b:
            X.0iw r10 = r1.A03
            com.instagram.common.session.UserSession r11 = r1.A04
            java.lang.String r13 = r10.getModuleName()
            java.lang.String r15 = r1.A00
            java.lang.String r14 = "music_attribution_bottom_sheet"
            X.AnonymousClass7TF.A1B(r11, r0, r13)
            r16 = r12
            X.C63978LGs.A01(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r2.A01
            if (r1 == 0) goto L_0x050a
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = (com.instagram.music.common.model.MusicOverlayStickerModel) r1
            com.instagram.clips.model.metadata.AudioPageMetadata r3 = X.LT9.A05(r1)
            X.8ZN r2 = X.AnonymousClass8ZN.STORY_VIEWER_BOTTOM_SHEET
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            android.os.Bundle r1 = X.C250563lf.A02(r12, r2, r3, r1)
            X.0qQ.A0B(r1, r0)
            X.GVT r6 = new X.GVT
            r6.<init>()
            r6.setArguments(r1)
            X.7Pr r2 = X.DbX.A0e(r11, r0)
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            r2.A03 = r0
            r2.A0T = r6
            goto L_0x0503
        L_0x04aa:
            X.0iw r10 = r1.A03
            com.instagram.common.session.UserSession r11 = r1.A04
            java.lang.String r13 = r10.getModuleName()
            java.lang.String r15 = r1.A00
            r6 = 534(0x216, float:7.48E-43)
            java.lang.String r14 = X.AnonymousClass000.A00(r6)
            X.AnonymousClass7TF.A1B(r11, r0, r13)
            r16 = r12
            X.C63978LGs.A01(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r9 = r2.A01
            if (r9 == 0) goto L_0x050a
            if (r15 == 0) goto L_0x0508
            java.util.concurrent.atomic.AtomicBoolean r2 = X.1Xj.A0i
            java.lang.String r8 = X.1Xv.A04(r15)
        L_0x04ce:
            r7 = 5
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r6 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration
            r6.<init>()
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r9)
            r6.A02 = r2
            r6.A00 = r7
            X.28D r2 = X.28D.A4f
            r6.A01 = r2
            r6.A06 = r3
            r6.A03 = r8
            r6.A04 = r3
            X.6e6 r2 = r1.A05
            X.JVj r10 = X.C59725JVj.PRE_CAPTURE
            r13 = r6
            r14 = r2
            r15 = r3
            X.K79 r6 = X.LPQ.A00(r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.Fragment r1 = r1.A02
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.7Pr r2 = X.DbS.A0W(r11)
            r1 = 2131165450(0x7f07010a, float:1.7945117E38)
            r2.A05(r3, r1)
            r2.A1G = r0
        L_0x0503:
            r4.A0E(r6, r2)
            goto L_0x0420
        L_0x0508:
            r8 = r12
            goto L_0x04ce
        L_0x050a:
            java.lang.String r6 = "attributionObject"
            goto L_0x0b98
        L_0x050e:
            r1 = -1033742277(0xffffffffc262583b, float:-56.586163)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.K6S r3 = (X.K6S) r3
            java.lang.Object r2 = r0.A01
            X.Jva r2 = (X.C61036Jva) r2
            java.lang.Object r0 = r0.A03
            X.L9H r0 = (X.L9H) r0
            X.3oV r0 = r0.A03
            android.view.View r0 = r0.getView()
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = (com.instagram.igds.components.checkbox.IgdsCheckBox) r0
            r3.A0C(r0, r2)
            r0 = 1471748906(0x57b91b2a, float:4.0705264E14)
            goto L_0x0031
        L_0x0531:
            r1 = -766171891(0xffffffffd255250d, float:-2.28862411E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.MVe r3 = (X.C66526MVe) r3
            if (r3 == 0) goto L_0x054c
            java.lang.Object r2 = r0.A01
            X.Nfi r2 = (X.C69159Nfi) r2
            java.lang.Object r0 = r0.A03
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.onStopButtonClicked()
            r3.Cwp(r2, r0)
        L_0x054c:
            r0 = 186985938(0xb252dd2, float:3.1812315E-32)
            goto L_0x0031
        L_0x0551:
            r1 = 334414993(0x13eec491, float:6.0273476E-27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.MVe r3 = (X.C66526MVe) r3
            if (r3 == 0) goto L_0x0569
            java.lang.Object r2 = r0.A01
            X.Nfi r2 = (X.C69159Nfi) r2
            java.lang.Object r0 = r0.A03
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.Cwq(r2, r0)
        L_0x0569:
            r0 = 2044551065(0x79dd5f99, float:1.4367957E35)
            goto L_0x0031
        L_0x056e:
            r1 = 1900219344(0x71430bd0, float:9.658217E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.MU7 r3 = (X.MU7) r3
            java.lang.Object r2 = r0.A02
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r0 = r0.A03
            X.Jor r0 = (X.C60644Jor) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A02
            r3.DWJ(r2, r0)
            r0 = 1500458028(0x596f2c2c, float:4.20756793E15)
            goto L_0x0031
        L_0x058b:
            r1 = -904974415(0xffffffffca0f2fb1, float:-2345964.2)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Dh0 r2 = (X.C46558Dh0) r2
            java.lang.Object r5 = r0.A01
            X.WW4 r5 = (X.WW4) r5
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.explore.topiccluster.ExploreTopicCluster r4 = r2.A00
            java.lang.Integer r0 = r2.A01
            int r3 = r0.intValue()
            r2 = 1
            r0 = 4
            if (r3 == r0) goto L_0x05c7
            r0 = 0
            if (r3 == r0) goto L_0x05c1
            r0 = 3
            if (r3 == r0) goto L_0x05bb
            if (r3 == r2) goto L_0x05c1
            r0 = 2
            if (r3 != r0) goto L_0x0e65
            r5.A0B()
        L_0x05b6:
            r0 = 1963155026(0x75035e52, float:1.6652928E32)
            goto L_0x0031
        L_0x05bb:
            if (r4 == 0) goto L_0x05b6
            r5.A0L(r4, r2)
            goto L_0x05b6
        L_0x05c1:
            if (r4 == 0) goto L_0x05b6
            r5.A0J(r4)
            goto L_0x05b6
        L_0x05c7:
            if (r4 == 0) goto L_0x05b6
            r5.A0M(r4, r2)
            goto L_0x05b6
        L_0x05cd:
            r1 = -1909195261(0xffffffff8e33fe03, float:-2.2185756E-30)
            int r1 = X.DbX.A03(r2, r1)
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r2)
            java.lang.Object r6 = r0.A02
            X.MWx r6 = (X.C66569MWx) r6
            boolean r3 = X.C64131LPf.A02(r3, r6)
            if (r3 != 0) goto L_0x05e7
            r0 = -1371124107(0xffffffffae464e75, float:-4.508967E-11)
            goto L_0x0031
        L_0x05e7:
            java.lang.Object r5 = r0.A03
            X.KVM r5 = (X.KVM) r5
            int r3 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.LFN r3 = r5.A0J
            boolean r2 = r3.A01(r2, r6)
            if (r2 != 0) goto L_0x05fa
            r0 = 1305458822(0x4dcfb886, float:4.3562208E8)
            goto L_0x0031
        L_0x05fa:
            X.MVU r4 = r5.A0K
            java.lang.String r3 = r5.A0N
            java.lang.String r2 = r5.A0O
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4.Dt5(r6, r0, r3, r2)
            r0 = 243463651(0xe82f5e3, float:3.2284255E-30)
            goto L_0x0031
        L_0x060c:
            r1 = 461021782(0x1b7aa256, float:2.0731969E-22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.KUO r3 = (X.KUO) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            boolean r2 = r3.A03
            if (r2 != 0) goto L_0x064b
            java.lang.Object r2 = r0.A01
            X.LiT r2 = (X.C64808LiT) r2
            X.LrS r7 = r2.A03
            java.lang.Object r0 = r0.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r6 = r0.getUsername()
            java.lang.String r5 = r0.getId()
            X.MXF r4 = r7.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0c
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "ig_profile_id"
            r2.put(r0, r5)
            X.C64127LPb.A02(r4, r3, r2)
            X.Ltl r0 = new X.Ltl
            r0.<init>(r6)
            X.MQn[] r0 = new X.C66407MQn[]{r0}
            X.C65329LrS.A00(r7, r0)
        L_0x064b:
            r0 = 1205144857(0x47d50d19, float:109082.195)
            goto L_0x0031
        L_0x0650:
            r1 = -1605350627(0xffffffffa0504b1d, float:-1.7643138E-19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.Jon r4 = (X.C60640Jon) r4
            com.instagram.igds.components.checkbox.IgdsCheckBox r3 = r4.A03
            r3.performClick()
            java.lang.Object r2 = r0.A02
            X.L1n r2 = (X.C63651L1n) r2
            int r7 = r4.getBindingAdapterPosition()
            boolean r6 = r3.isChecked()
            java.lang.Object r5 = r0.A01
            X.K1d r5 = (X.C61292K1d) r5
            X.KFk r4 = r2.A00
            int r3 = r4.A00
            r0 = -1
            r2 = 0
            if (r6 != 0) goto L_0x0687
            r4.A00 = r0
            r0 = 0
            r4.A01 = r0
        L_0x067d:
            X.K8C r0 = r4.A02
            r0.A0C(r3, r2)
            r0 = 1085322328(0x40b0b458, float:5.5220146)
            goto L_0x0031
        L_0x0687:
            r4.A00 = r7
            r4.A01 = r5
            if (r3 == r0) goto L_0x067d
            r2 = 1
            goto L_0x067d
        L_0x068f:
            r1 = -267658676(0xfffffffff00bda4c, float:-1.7312928E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.JVX r3 = (X.JVX) r3
            java.lang.Object r2 = r0.A03
            X.JcV r2 = (X.C59962JcV) r2
            java.lang.Object r11 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r11 = (com.instagram.music.common.model.AudioOverlayTrack) r11
            X.0eM r5 = r2.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.AnonymousClass30D.A0F(r0)
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0736
            android.content.Context r8 = r2.requireContext()
            androidx.fragment.app.FragmentActivity r13 = r2.requireActivity()
            boolean r0 = r13 instanceof X.C267834cI
            if (r0 == 0) goto L_0x0734
            X.4cI r13 = (X.C267834cI) r13
        L_0x06be:
            X.3Q2 r12 = r2.A0S
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r5)
            X.82q r0 = r2.A0G
            java.lang.String r6 = "creationCameraSession"
            if (r0 == 0) goto L_0x0b98
            java.util.List r15 = r0.FN1()
            X.82q r0 = r2.A0G
            if (r0 == 0) goto L_0x0b98
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r10 = r0.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.JbO r0 = X.JZM.A00(r0)
            java.lang.String r14 = r0.A02
            if (r14 != 0) goto L_0x06e5
            r14 = r7
        L_0x06e5:
            X.82q r0 = r2.A0G
            if (r0 == 0) goto L_0x0b98
            java.util.List r0 = r0.FN1()
            boolean r16 = X.AnonymousClass7TE.A1b(r0)
            r17 = 1
            X.C64132LPg.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.widget.ImageView r6 = r2.A06
            if (r6 == 0) goto L_0x0709
            android.content.Context r4 = r2.requireContext()
            com.instagram.common.typedurl.ImageUrl r0 = r3.As5()
            X.GIH r0 = X.C63350KvX.A00(r4, r0)
            r6.setImageDrawable(r0)
        L_0x0709:
            X.8Xk r2 = r2.A0H
            if (r2 == 0) goto L_0x0711
            r0 = 1
            r2.A04(r0)
        L_0x0711:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.JbO r0 = X.JZM.A00(r0)
            java.lang.String r4 = r0.A02
            if (r4 != 0) goto L_0x0722
            r4 = r7
        L_0x0722:
            java.lang.String r2 = "photo_filter"
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.AnonymousClass30D.A0F(r0)
            X.LPP.A02(r6, r3, r4, r2, r0)
            r0 = 296673776(0x11aee1f0, float:2.7591604E-28)
            goto L_0x0031
        L_0x0734:
            r13 = 0
            goto L_0x06be
        L_0x0736:
            X.LG9 r4 = r2.A0L
            if (r4 == 0) goto L_0x0709
            X.Kk4 r0 = X.C62642Kk4.A02
            r4.A01(r0, r3)
            goto L_0x0709
        L_0x0740:
            r1 = -677530602(0xffffffffd79db416, float:-3.46793578E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.JcV r5 = (X.C59962JcV) r5
            X.0eM r2 = r5.A0i
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.Lka r4 = new X.Lka
            r4.<init>(r2)
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A01
            com.instagram.creation.base.ui.filterview.FilterViewContainer r2 = (com.instagram.creation.base.ui.filterview.FilterViewContainer) r2
            r0 = 1
            X.C59962JcV.A09(r3, r4, r2, r5, r0)
            r0 = 274239370(0x10588f8a, float:4.2709067E-29)
            goto L_0x0031
        L_0x0767:
            r1 = -55156372(0xfffffffffcb6616c, float:-7.575792E36)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.JVX r3 = (X.JVX) r3
            java.lang.Object r1 = r0.A03
            com.instagram.creation.fragment.AlbumEditFragment r1 = (com.instagram.creation.fragment.AlbumEditFragment) r1
            java.lang.Object r11 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r11 = (com.instagram.music.common.model.AudioOverlayTrack) r11
            X.0eM r2 = r1.A0d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.AnonymousClass30D.A0F(r0)
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0e6a
            android.content.Context r8 = r1.requireContext()
            androidx.fragment.app.FragmentActivity r13 = r1.requireActivity()
            boolean r0 = r13 instanceof X.C267834cI
            if (r0 == 0) goto L_0x079e
            X.4cI r13 = (X.C267834cI) r13
        L_0x0796:
            X.4cI r5 = r1.A0Q
            if (r5 != 0) goto L_0x07a0
            java.lang.String r6 = "pendingMediaProvider"
            goto L_0x0b98
        L_0x079e:
            r13 = 0
            goto L_0x0796
        L_0x07a0:
            X.82q r0 = r1.A0H
            java.lang.String r6 = "creationCameraSession"
            if (r0 == 0) goto L_0x0b98
            X.3Q2 r12 = X.JWE.A05(r5, r0)
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            X.82q r0 = r1.A0H
            if (r0 == 0) goto L_0x0b98
            java.util.List r15 = r0.FN1()
            X.82q r0 = r1.A0H
            if (r0 == 0) goto L_0x0b98
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r10 = r0.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.JbO r0 = X.JZM.A00(r0)
            java.lang.String r14 = r0.A02
            if (r14 != 0) goto L_0x07cd
            r14 = r7
        L_0x07cd:
            X.82q r0 = r1.A0H
            if (r0 == 0) goto L_0x0b98
            java.util.List r0 = r0.FN1()
            boolean r16 = X.AnonymousClass7TE.A1b(r0)
            r17 = 1
            X.C64132LPg.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.widget.ImageView r6 = r1.A08
            if (r6 == 0) goto L_0x0e73
            android.content.Context r5 = r1.requireContext()
            com.instagram.common.typedurl.ImageUrl r0 = r3.As5()
            X.GIH r0 = X.C63350KvX.A00(r5, r0)
            r6.setImageDrawable(r0)
            goto L_0x0e73
        L_0x07f3:
            r1 = 144822172(0x8a1cf9c, float:9.738644E-34)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.JoJ r3 = (X.C60610JoJ) r3
            java.lang.Object r6 = r0.A01
            X.JwH r6 = (X.C61079JwH) r6
            java.lang.Object r1 = r6.A00
            X.9cM r1 = (X.C381809cM) r1
            int r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView r1 = r3.A01
            r1.A0L(r2)
            java.lang.Object r0 = r0.A03
            X.Jks r0 = (X.C60399Jks) r0
            X.K6R r5 = r0.A03
            X.Jks r0 = r3.A02
            android.content.Context r0 = r0.A01
            int r3 = X.AnonymousClass7TG.A05(r0)
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            if (r2 != 0) goto L_0x0832
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
        L_0x0827:
            X.0qQ.A07(r7)
            X.861 r0 = r5.A09
            if (r0 != 0) goto L_0x084b
            java.lang.String r6 = "videoPlaybackViewModel"
            goto L_0x0b98
        L_0x0832:
            int r1 = r2.getIntrinsicWidth()
            int r0 = r2.getIntrinsicHeight()
            android.graphics.Bitmap r1 = X.AnonymousClass7TF.A0B(r1, r0)
            android.graphics.Canvas r0 = X.JTO.A0B(r1)
            r2.draw(r0)
            r0 = 0
            android.graphics.Bitmap r7 = X.0fO.A00(r1, r3, r3, r0)
            goto L_0x0827
        L_0x084b:
            X.863 r0 = X.JTP.A0Z(r0)
            if (r0 == 0) goto L_0x0868
            int r3 = r0.CEG()
        L_0x0855:
            X.0eM r0 = r5.A0F
            java.lang.Object r0 = r0.getValue()
            X.Jin r0 = (X.C60290Jin) r0
            r0.A02(r6, r3)
            com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView r2 = r5.A08
            if (r2 != 0) goto L_0x0e97
            java.lang.String r6 = "sfxSeekBarView"
            goto L_0x0b98
        L_0x0868:
            r3 = 0
            goto L_0x0855
        L_0x086a:
            r1 = -174807887(0xfffffffff594a4b1, float:-3.768556E32)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.8cq r3 = (X.C359448cq) r3
            java.lang.Object r2 = r0.A01
            X.JVj r2 = (X.C59725JVj) r2
            java.lang.Object r0 = r0.A02
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.C359448cq.A02(r2, r3, r0)
            r0 = 1554761267(0x5cabc633, float:3.86801147E17)
            goto L_0x0031
        L_0x0885:
            r1 = 1427849044(0x551b3f54, float:1.06685184E13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.8cq r4 = (X.C359448cq) r4
            java.lang.Object r3 = r0.A01
            X.JVj r3 = (X.C59725JVj) r3
            r2 = 0
            X.C359448cq.A02(r3, r4, r2)
            java.lang.Object r0 = r0.A02
            X.LOZ r0 = (X.LOZ) r0
            r0.A01()
            r0 = 858634676(0x332db9b4, float:4.0448597E-8)
            goto L_0x0031
        L_0x08a4:
            r1 = 1269773975(0x4baf3697, float:2.296555E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.8cq r2 = (X.C359448cq) r2
            java.lang.Object r5 = r0.A01
            X.JVj r5 = (X.C59725JVj) r5
            r4 = 0
            X.27r r3 = r2.A06
            r2 = 232(0xe8, float:3.25E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r3.A1N(r5, r4, r2)
            java.lang.Object r0 = r0.A02
            X.LOZ r0 = (X.LOZ) r0
            r0.A01()
            r0 = -1268635599(0xffffffffb4622831, float:-2.1062512E-7)
            goto L_0x0031
        L_0x08cb:
            r1 = 565839543(0x21ba06b7, float:1.2605628E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            android.widget.HorizontalScrollView r8 = (android.widget.HorizontalScrollView) r8
            int r7 = r8.getScrollX()
            int r6 = r8.getWidth()
            int r5 = r7 + r6
            java.lang.Object r4 = r0.A02
            android.view.View r4 = (android.view.View) r4
            int r2 = r4.getLeft()
            r3 = 0
            if (r2 >= r7) goto L_0x090d
            int r2 = r4.getLeft()
        L_0x08ef:
            r8.smoothScrollTo(r2, r3)
        L_0x08f2:
            boolean r2 = r4.isSelected()
            r2 = r2 ^ 1
            r4.setSelected(r2)
            java.lang.Object r0 = r0.A01
            X.L7t r0 = (X.C63813L7t) r0
            X.0sP r2 = r0.A03
            boolean r0 = r4.isSelected()
            X.C51968G9o.A1O(r2, r0)
            r0 = 294012805(0x11864785, float:2.118555E-28)
            goto L_0x0031
        L_0x090d:
            int r2 = r4.getRight()
            if (r5 >= r2) goto L_0x08f2
            int r2 = r4.getRight()
            int r2 = r2 - r6
            goto L_0x08ef
        L_0x0919:
            java.lang.Object r6 = r0.A01
            X.Jpf r6 = (X.C60694Jpf) r6
            java.lang.Object r5 = r0.A02
            X.LAc r5 = (X.C63873LAc) r5
            java.lang.Object r4 = r0.A03
            X.L6E r4 = (X.L6E) r4
            X.7zv r1 = r5.A05
            if (r1 == 0) goto L_0x0034
            boolean r0 = r1.A1H
            r3 = r0 ^ 1
            r1.A1H = r3
            X.Jpf r0 = r4.A00
            X.4MN r2 = r0.A03
            if (r2 == 0) goto L_0x0942
            X.JYl r0 = r4.A01
            X.Jc5 r0 = r0.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A01
            r0.put(r2, r1)
        L_0x0942:
            X.C60694Jpf.A02(r6, r5)
            X.4MN r2 = r6.A03
            if (r2 == 0) goto L_0x0034
            if (r3 == 0) goto L_0x095b
            r1 = 1065353216(0x3f800000, float:1.0)
            X.Jc5 r0 = r6.A0E
            java.util.concurrent.ConcurrentHashMap r0 = r0.A01
            int r0 = r0.size()
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0957:
            r2.Eqq(r1)
            return
        L_0x095b:
            r1 = 0
            goto L_0x0957
        L_0x095d:
            r1 = 261777322(0xf9a67aa, float:1.5225502E-29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            r2 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r8 = X.AnonymousClass7TF.A03(r3, r2)
            java.lang.Object r7 = r0.A03
            X.K5J r7 = (X.K5J) r7
            com.instagram.common.session.UserSession r10 = r7.A00
            if (r10 == 0) goto L_0x09c1
            java.lang.Class<com.instagram.modal.ModalActivity> r9 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r2 = r7.A00
            if (r2 == 0) goto L_0x09c1
            X.DbU.A1D(r6, r2)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config r3 = r7.A01
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0eb4
            java.lang.String r5 = r3.A00
            java.util.ArrayList r4 = r7.A03
            if (r4 != 0) goto L_0x0994
            java.lang.String r6 = "selectedMedia"
            goto L_0x0b98
        L_0x0994:
            java.util.List r2 = r3.A01
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config r3 = new com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config
            r3.<init>(r4, r2, r5)
            java.lang.String r2 = "edit_media_selection_config"
            r6.putParcelable(r2, r3)
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 2409(0x969, float:3.376E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r2 = X.DbS.A0b(r2, r6, r10, r9, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A04 = r0
            r2.A09(r8)
            r0 = 9223(0x2407, float:1.2924E-41)
            r2.A0D(r7, r0)
            r0 = 1821311209(0x6c8f00e9, float:1.3830455E27)
            goto L_0x0031
        L_0x09c1:
            java.lang.String r6 = "session"
            goto L_0x0b98
        L_0x09c5:
            r1 = 1855678850(0x6e9b6982, float:2.4048864E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.JpQ r5 = (X.C60679JpQ) r5
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.app.Activity r3 = r5.A05
            boolean r2 = r3.isFinishing()
            if (r2 == 0) goto L_0x09df
            r0 = -393006970(0xffffffffe8933086, float:-5.560664E24)
            goto L_0x0031
        L_0x09df:
            X.8ab r4 = X.DbS.A0X(r3)
            int r8 = r5.A01
            int r9 = r5.A03
            int r10 = r5.A02
            int r11 = r5.A00
            java.lang.Object r3 = r0.A03
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            com.instagram.common.typedurl.ImageUrl r6 = r3.Bh3()
            java.lang.Object r2 = r0.A02
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.String r7 = r2.getModuleName()
            X.3ay r5 = new X.3ay
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.A0i(r5)
            java.lang.String r2 = r3.getUsername()
            r4.A05 = r2
            X.Dba.A1M(r4)
            r3 = 2131976660(0x7f1361d4, float:1.9590447E38)
            r2 = 41
            X.LV3.A01(r4, r0, r2, r3)
            r2 = 40
            X.LV3 r0 = X.LV3.A00(r0, r2)
            X.DbX.A16(r0, r4)
            r0 = 832571471(0x31a0084f, float:4.6575575E-9)
            goto L_0x0031
        L_0x0a22:
            r1 = 2105784851(0x7d83ba13, float:2.1886878E37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            android.app.Activity r7 = X.C61270mF.A00(r2)
            java.lang.Object r6 = r0.A02
            X.0sa r6 = (X.C62320sa) r6
            boolean r0 = X.C2604245p.A03(r7)
            if (r0 == 0) goto L_0x0a43
            r6.invoke()
        L_0x0a3e:
            r0 = 555104729(0x211639d9, float:5.089854E-19)
            goto L_0x0031
        L_0x0a43:
            java.lang.String[] r5 = X.C2604245p.A05(r7)
            int r4 = r5.length
            r3 = 0
        L_0x0a49:
            if (r3 >= r4) goto L_0x0a60
            r2 = r5[r3]
            boolean r0 = X.1DL.A07(r7, r2)
            if (r0 != 0) goto L_0x0a5d
            boolean r0 = X.1DL.A05(r7, r2)
            if (r0 != 0) goto L_0x0a5d
            X.W38.A01(r7)
            goto L_0x0a3e
        L_0x0a5d:
            int r3 = r3 + 1
            goto L_0x0a49
        L_0x0a60:
            r2 = 4
            X.Lh6 r0 = new X.Lh6
            r0.<init>(r2, r7, r6)
            X.C2604245p.A01(r7, r0)
            goto L_0x0a3e
        L_0x0a6a:
            r1 = -1846140761(0xffffffff91f620a7, float:-3.883208E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.KFU r2 = (X.KFU) r2
            X.JWd r7 = r2.A01
            java.lang.Object r2 = r0.A01
            X.3kE r2 = (X.C249703kE) r2
            int r8 = r2.getBindingAdapterPosition()
            java.lang.Object r0 = r0.A02
            X.JX4 r0 = (X.JX4) r0
            X.8Xf r6 = r0.A00
            r0 = 1
            X.0qQ.A0B(r6, r0)
            java.lang.Integer r2 = r6.CAp()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0aae
            X.JWc r5 = r7.A00
            X.0eM r0 = r5.A03
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = r6.getName()
            java.lang.String r3 = "posts"
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = "folder_name"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r0, r2)
            java.lang.String r0 = "cloud_album_tap"
            X.AnonymousClass9PQ.A08(r5, r4, r0, r3, r2)
        L_0x0aae:
            X.JWc r0 = r7.A00
            X.0sL r2 = r0.A00
            if (r2 == 0) goto L_0x0abb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.invoke(r0, r6)
        L_0x0abb:
            r0 = -1047852693(0xffffffffc18b096b, float:-17.379599)
            goto L_0x0031
        L_0x0ac0:
            r1 = -386788685(0xffffffffe8f212b3, float:-9.145261E24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.JlU r2 = (X.C60436JlU) r2
            X.Kzz r4 = r2.A04
            if (r4 == 0) goto L_0x0ae0
            java.lang.Object r3 = r0.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r0 = r0.A01
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r2 = X.JTO.A0F(r0)
            X.KB5 r0 = r4.A00
            X.KB5.A04(r2, r0, r3)
        L_0x0ae0:
            r0 = -414670687(0xffffffffe748a0a1, float:-9.474364E23)
            goto L_0x0031
        L_0x0ae5:
            r1 = 2143999474(0x7fcad5f2, float:NaN)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r6 = r2.getResources()
            r4 = 2131968544(0x7f134220, float:1.9573986E38)
            java.lang.Object r5 = r0.A03
            X.L3c r5 = (X.C63692L3c) r5
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r2 = r5.A00
            java.lang.String r3 = r2.A06
            java.lang.String r2 = r2.A08
            java.lang.String r4 = X.DbV.A0w(r6, r3, r2, r4)
            X.0qQ.A07(r4)
            X.LBw r3 = r5.A01
            java.lang.Object r0 = r0.A02
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            r0 = 0
            r3.A00(r2, r4, r0)
            r0 = -1708003636(0xffffffff9a31eecc, float:-3.679564E-23)
            goto L_0x0031
        L_0x0b1b:
            r1 = -956463832(0xffffffffc6fd8528, float:-32450.578)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.LE4 r3 = (X.LE4) r3
            X.LrN r5 = r3.A00
            if (r5 == 0) goto L_0x0ec4
            java.lang.Object r2 = r0.A02
            X.Li4 r2 = (X.C64788Li4) r2
            X.1Xj r4 = r2.A00
            X.2t9 r3 = r3.A07
            java.lang.String r2 = r4.getId()
            if (r2 == 0) goto L_0x0ebf
            int r9 = r3.A02(r2)
            java.lang.Object r6 = r0.A01
            X.Jps r6 = (X.C60707Jps) r6
            X.2uK r3 = r5.A08
            X.1Xj r0 = r3.A0G()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0b54
            X.3W1 r7 = X.C65324LrN.A00(r5, r4)
            r8 = 0
            r3.A0Q(r4, r5, r6, r7, r8, r9)
        L_0x0b54:
            r0 = -1139551377(0xffffffffbc13d36f, float:-0.009022578)
            goto L_0x0031
        L_0x0b59:
            r1 = 1291522972(0x4cfb139c, float:1.31636448E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.K8H r3 = (X.K8H) r3
            java.lang.Object r2 = r0.A03
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r2 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r2
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0b92
            java.lang.String r5 = r2.A01
            java.lang.String r6 = r2.A02
            int r8 = r2.A00
            java.util.List r7 = r2.A03
            boolean r9 = r2.A05
            boolean r10 = r2.A06
            boolean r0 = r2.A04
            r2 = 1
            r11 = r0 ^ 1
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r4 = new com.instagram.closefriends.audiencelists.model.AudienceListViewModel
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.0eM r0 = r3.A0F
            java.lang.Object r0 = r0.getValue()
            X.Jhh r0 = (X.C60224Jhh) r0
            r0.A00(r4, r2)
        L_0x0b8d:
            r0 = -1716346870(0xffffffff99b2a00a, float:-1.8469408E-23)
            goto L_0x0031
        L_0x0b92:
            X.LFo r6 = r3.A02
            if (r6 != 0) goto L_0x0ba0
            java.lang.String r6 = "logger"
        L_0x0b98:
            X.0qQ.A0F(r6)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0ba0:
            X.KkX r5 = r3.A00
            if (r5 != 0) goto L_0x0ba6
            X.KkX r5 = X.C62671KkX.LIST_SHEET
        L_0x0ba6:
            java.lang.String r4 = r2.A01
            java.lang.String r0 = r2.A02
            r6.A02(r5, r4, r0)
            r0 = 58548288(0x37d6040, float:7.4460507E-37)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.K8H.A01(r3, r2, r0)
            goto L_0x0b8d
        L_0x0bb8:
            r1 = -1677625868(0xffffffff9c0175f4, float:-4.283497E-22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.KGn r2 = (X.C61663KGn) r2
            X.L3P r4 = r2.A01
            java.lang.Object r3 = r0.A02
            X.Li3 r3 = (X.C64787Li3) r3
            java.lang.Object r5 = r0.A01
            X.Jpr r5 = (X.C60706Jpr) r5
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            X.2Rw r2 = r0.A0A
            boolean r0 = r2 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0c09
            X.2t9 r2 = (X.AnonymousClass2t9) r2
            if (r2 == 0) goto L_0x0c09
            X.K6m r4 = r4.A01
            X.1Xj r3 = r3.A00
            java.lang.String r0 = r3.getId()
            if (r0 != 0) goto L_0x0be5
            java.lang.String r0 = ""
        L_0x0be5:
            int r8 = r2.A02(r0)
            X.0eM r2 = r4.A0E
            java.lang.Object r0 = r2.getValue()
            X.2uK r0 = (X.C232722uK) r0
            X.1Xj r0 = r0.A0G()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x0c09
            X.3W1 r6 = X.G9t.A18(r3)
            java.lang.Object r2 = r2.getValue()
            X.2uK r2 = (X.C232722uK) r2
            r7 = 0
            r2.A0Q(r3, r4, r5, r6, r7, r8)
        L_0x0c09:
            r0 = -1363099319(0xffffffffaec0c149, float:-8.7654835E-11)
            goto L_0x0031
        L_0x0c0e:
            r1 = 1305130752(0x4dcab700, float:4.2512384E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.Jj6 r4 = (X.C60307Jj6) r4
            java.lang.Object r3 = r0.A02
            X.Jvd r3 = (X.C61039Jvd) r3
            java.lang.Object r2 = r0.A01
            X.JwF r2 = (X.C61077JwF) r2
            X.LTO r5 = r4.A00
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            boolean r0 = r3.A05
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A02
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r13 = 0
            if (r2 == 0) goto L_0x0c5b
            java.lang.Object r12 = r2.A00
            java.util.Map r12 = (java.util.Map) r12
        L_0x0c3a:
            boolean r0 = r3.A03
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A04
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            X.0sm r14 = X.0Yt.A0E()
            r5.A08(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r0 = 21
            X.MHD.A00(r3, r4, r2, r0)
            r0 = 811817687(0x30635ad7, float:8.271121E-10)
            goto L_0x0031
        L_0x0c5b:
            r12 = r13
            goto L_0x0c3a
        L_0x0c5d:
            java.lang.Object r5 = r0.A01
            X.Jpt r5 = (X.C60708Jpt) r5
            java.lang.Object r7 = r0.A02
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r4 = r0.A03
            X.MSR r4 = (X.MSR) r4
            X.MXT r0 = r5.A01
            r0.getClass()
            X.MXT r1 = r5.A01
            boolean r0 = r1.CWu()
            if (r0 == 0) goto L_0x0c84
            X.1Xj r1 = r1.BPf()
            X.1se r0 = X.1sd.A00(r7)
            boolean r0 = r0.A05(r1)
            if (r0 != 0) goto L_0x0c96
        L_0x0c84:
            X.MXT r0 = r5.A01
            X.4gL r1 = r0.Ahy()
            if (r1 == 0) goto L_0x0ca6
            X.4wN r0 = X.C278164wN.A00(r7)
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0ca6
        L_0x0c96:
            android.content.Context r6 = r2.getContext()
            X.MXT r10 = r5.A01
            java.lang.String r11 = r5.A0G
            X.2eb r9 = r5.A07
            X.JdE r8 = r5.A06
            r5.A03(r6, r7, r8, r9, r10, r11)
            return
        L_0x0ca6:
            X.MXT r3 = r5.A01
            r2 = 0
            r1 = 0
            com.instagram.igtv.model.IGTVViewerLoggingToken r0 = r5.A0F
            r4.D1S(r3, r0, r1, r2)
            return
        L_0x0cb0:
            r1 = -1667038399(0xffffffff9ca30341, float:-1.0787276E-21)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r4 = (com.instagram.ui.widget.mediapicker.MediaPickerItemView) r4
            java.lang.Object r7 = r0.A03
            X.Jkl r7 = (X.C60392Jkl) r7
            java.lang.Object r8 = r0.A01
            com.instagram.common.gallery.model.GalleryItem r8 = (com.instagram.common.gallery.model.GalleryItem) r8
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r5 = 1
            android.content.Context r11 = X.AnonymousClass7TE.A0S(r4)
            boolean r10 = r4.A0A
            com.instagram.common.gallery.model.GalleryItem r0 = r4.A04
            if (r0 == 0) goto L_0x0d41
            java.lang.Integer r1 = r0.A09
        L_0x0cd4:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r3 = 1
            boolean r12 = X.AnonymousClass7TF.A1W(r1, r0)
            boolean r9 = r4.A0C
            X.9I9 r0 = r4.A02
            if (r0 == 0) goto L_0x0ce6
            boolean r0 = r0.A02
            r2 = 1
            if (r0 == r5) goto L_0x0ce7
        L_0x0ce6:
            r2 = 0
        L_0x0ce7:
            X.5Ef r0 = r4.A03
            if (r0 == 0) goto L_0x0cf2
            boolean r0 = r0.isValid()
            r1 = 1
            if (r0 == r5) goto L_0x0cf3
        L_0x0cf2:
            r1 = 0
        L_0x0cf3:
            X.5Ef r0 = r4.A03
            if (r0 == 0) goto L_0x0d3f
            boolean r0 = r0.CeS()
        L_0x0cfb:
            if (r10 != 0) goto L_0x0d08
            if (r12 != 0) goto L_0x0d1a
            if (r9 != 0) goto L_0x0d03
            if (r2 != 0) goto L_0x0d08
        L_0x0d03:
            if (r1 != 0) goto L_0x0d1a
            X.C59848JaO.A01(r11, r0)
        L_0x0d08:
            X.9I9 r0 = r4.A02
            if (r0 == 0) goto L_0x0d18
            boolean r0 = r0.A02
            if (r0 != r5) goto L_0x0d18
        L_0x0d10:
            r4.setChecked(r3)
            r0 = 1503906403(0x59a3ca63, float:5.7628685E15)
            goto L_0x0e0d
        L_0x0d18:
            r3 = 0
            goto L_0x0d10
        L_0x0d1a:
            java.util.List r2 = r7.A02
            java.lang.String r1 = r8.A0A
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0d36
            int r0 = r2.size()
            if (r0 <= r5) goto L_0x0d08
            r2.remove(r1)
            X.MUO r0 = r7.A00
            r0.DQh(r8, r5)
        L_0x0d32:
            r7.notifyDataSetChanged()
            goto L_0x0d08
        L_0x0d36:
            r2.add(r1)
            X.MUO r0 = r7.A00
            r0.DQg(r8, r5)
            goto L_0x0d32
        L_0x0d3f:
            r0 = 0
            goto L_0x0cfb
        L_0x0d41:
            r1 = 0
            goto L_0x0cd4
        L_0x0d43:
            r1 = 1800300314(0x6b4e671a, float:2.495256E26)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Jp4 r2 = (X.C60657Jp4) r2
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.A03
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r1)
            X.JaS r1 = r2.A04
            com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView r1 = r1.A00
            boolean r7 = r1.A09
            java.lang.Object r1 = r0.A02
            X.LiF r1 = (X.C64795LiF) r1
            X.9I9 r1 = r1.A00
            boolean r5 = r1.A02
            X.8y3 r4 = r2.A02
            r2 = 1
            if (r4 == 0) goto L_0x0d6e
            boolean r1 = r4.isValid()
            r3 = 1
            if (r1 == r2) goto L_0x0d90
        L_0x0d6e:
            r3 = 0
            if (r4 != 0) goto L_0x0d90
            r1 = 0
        L_0x0d72:
            java.lang.Object r2 = r0.A01
            X.L3i r2 = (X.C63698L3i) r2
            if (r7 != 0) goto L_0x0d7a
            if (r5 != 0) goto L_0x0d7f
        L_0x0d7a:
            if (r3 != 0) goto L_0x0d84
            X.C59848JaO.A01(r8, r1)
        L_0x0d7f:
            r0 = -1594959527(0xffffffffa0eed959, float:-4.0462597E-19)
            goto L_0x0e0d
        L_0x0d84:
            X.JWw r0 = r2.A00
            X.0sP r1 = r0.A02
            X.LiF r0 = r2.A01
            com.instagram.common.gallery.model.GalleryItem r0 = r0.A01
            r1.invoke(r0)
            goto L_0x0d7f
        L_0x0d90:
            boolean r1 = r4.A04
            goto L_0x0d72
        L_0x0d93:
            java.lang.Object r3 = r0.A01
            X.KB5 r3 = (X.KB5) r3
            java.lang.Object r2 = r0.A02
            com.instagram.creation.base.MediaSession r2 = (com.instagram.creation.base.MediaSession) r2
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            java.lang.Integer r0 = r2.Bsu()
            X.KB5.A04(r1, r3, r0)
            return
        L_0x0da7:
            r1 = -1908146362(0xffffffff8e43ff46, float:-2.4158515E-30)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r5 = (com.instagram.ui.widget.mediapicker.MediaPickerItemView) r5
            java.lang.Object r10 = r0.A03
            X.KFj r10 = (X.C61633KFj) r10
            java.lang.Object r9 = r0.A02
            X.LhX r9 = (X.C64755LhX) r9
            r1 = 0
            X.0qQ.A0B(r5, r1)
            r7 = 1
            android.content.Context r11 = X.AnonymousClass7TE.A0S(r5)
            boolean r8 = r5.A0A
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A04
            if (r0 == 0) goto L_0x0e62
            java.lang.Integer r0 = r0.A09
        L_0x0dcb:
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            r4 = 1
            boolean r13 = X.AnonymousClass7TF.A1W(r0, r14)
            boolean r3 = r5.A0C
            X.9I9 r0 = r5.A02
            if (r0 == 0) goto L_0x0ddd
            boolean r0 = r0.A02
            r12 = 1
            if (r0 == r7) goto L_0x0dde
        L_0x0ddd:
            r12 = 0
        L_0x0dde:
            X.5Ef r0 = r5.A03
            if (r0 == 0) goto L_0x0de9
            boolean r0 = r0.isValid()
            r2 = 1
            if (r0 == r7) goto L_0x0dea
        L_0x0de9:
            r2 = 0
        L_0x0dea:
            X.5Ef r0 = r5.A03
            if (r0 == 0) goto L_0x0e60
            boolean r0 = r0.CeS()
        L_0x0df2:
            if (r8 != 0) goto L_0x0dff
            if (r13 != 0) goto L_0x0e13
            if (r3 != 0) goto L_0x0dfa
            if (r12 != 0) goto L_0x0dff
        L_0x0dfa:
            if (r2 != 0) goto L_0x0e13
            X.C59848JaO.A01(r11, r0)
        L_0x0dff:
            X.9I9 r0 = r5.A02
            if (r0 == 0) goto L_0x0e11
            boolean r0 = r0.A02
            if (r0 != r7) goto L_0x0e11
        L_0x0e07:
            r5.setChecked(r4)
            r0 = -709760667(0xffffffffd5b1e965, float:-2.44519975E13)
        L_0x0e0d:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0e11:
            r4 = 0
            goto L_0x0e07
        L_0x0e13:
            X.Kza r0 = r10.A01
            com.instagram.common.gallery.model.GalleryItem r8 = r9.A00
            X.K2U r2 = r0.A00
            X.0eM r0 = r2.A00
            java.lang.Object r3 = r0.getValue()
            android.content.Context r11 = r2.requireContext()
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r13 = X.DbW.A0S(r0, r7)
            com.instagram.common.gallery.Medium r12 = r8.A00
            if (r12 == 0) goto L_0x0dff
            boolean r0 = r12.A05()
            if (r0 == 0) goto L_0x0e4e
            android.content.ContentResolver r10 = X.JTP.A0B(r11)
            X.JYM r9 = new X.JYM
            r9.<init>(r10, r11, r12, r13, r14)
            r0 = 457(0x1c9, float:6.4E-43)
            X.5g0 r2 = new X.5g0
            r2.<init>(r9, r0)
            X.KGx r0 = new X.KGx
            r0.<init>(r1, r3, r13)
        L_0x0e48:
            r2.A00 = r0
            X.1ES.A03(r2)
            goto L_0x0dff
        L_0x0e4e:
            X.JZ5 r1 = new X.JZ5
            r1.<init>(r11, r12, r13, r7)
            r0 = 458(0x1ca, float:6.42E-43)
            X.5g0 r2 = new X.5g0
            r2.<init>(r1, r0)
            X.KH1 r0 = new X.KH1
            r0.<init>((java.lang.Object) r3, (int) r7)
            goto L_0x0e48
        L_0x0e60:
            r0 = 0
            goto L_0x0df2
        L_0x0e62:
            r0 = 0
            goto L_0x0dcb
        L_0x0e65:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x0e6a:
            X.LG9 r5 = r1.A0K
            if (r5 == 0) goto L_0x0e73
            X.Kk4 r0 = X.C62642Kk4.A02
            r5.A01(r0, r3)
        L_0x0e73:
            X.8Xk r5 = r1.A0I
            if (r5 == 0) goto L_0x0e7b
            r0 = 1
            r5.A04(r0)
        L_0x0e7b:
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.JbO r0 = X.JZM.A00(r0)
            java.lang.String r2 = r0.A02
            if (r2 != 0) goto L_0x0e8c
            r2 = r7
        L_0x0e8c:
            java.lang.String r1 = r1.A0Z
            r0 = 0
            X.LPP.A02(r5, r3, r2, r1, r0)
            r0 = 1686075412(0x647f7814, float:1.8850289E22)
            goto L_0x0f3a
        L_0x0e97:
            java.lang.String r1 = r6.A02
            java.lang.Object r0 = r6.A00
            X.9cM r0 = (X.C381809cM) r0
            int r0 = r0.A01
            r2.A01(r7, r1, r3, r0)
            X.0eM r0 = r5.A0E
            X.27r r2 = X.C51971G9r.A0g(r0)
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "SOUND_EFFECTS_SOUNDBOARD_ADD"
            r2.A1Q(r1, r0)
            r0 = 906335253(0x36059415, float:1.990474E-6)
            goto L_0x0f3a
        L_0x0eb4:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r2)
            r0 = -177596266(0xfffffffff56a1896, float:-2.9675198E32)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0ebf:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0ec4:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -929202623(0xffffffffc89d7e41, float:-322546.03)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0ecf:
            r1 = 559109518(0x2153558e, float:7.160281E-19)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A03
            X.K4X r7 = (X.K4X) r7
            java.lang.Object r6 = r0.A02
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r5 = r0.A01
            com.instagram.model.direct.DirectThreadKey r5 = (com.instagram.model.direct.DirectThreadKey) r5
            int r3 = X.K4X.A00(r7)
            if (r3 < 0) goto L_0x0f16
            java.util.List r1 = r7.A0C
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0f16
            java.lang.Object r0 = r1.get(r3)
            X.Lhg r0 = (X.C64764Lhg) r0
            android.graphics.Bitmap r2 = r0.A00
        L_0x0ef8:
            X.0eM r0 = r7.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C64176LSd.A02(r2, r6, r1, r5, r0)
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            if (r1 == 0) goto L_0x0f0f
            r0 = -1
            r1.setResult(r0)
        L_0x0f0f:
            X.DbX.A1I(r7)
            r0 = -640997141(0xffffffffd9cb28eb, float:-7.1480513E15)
            goto L_0x0f3a
        L_0x0f16:
            r2 = 0
            goto L_0x0ef8
        L_0x0f18:
            r1 = 1026195251(0x3d2a7f33, float:0.041625213)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.JW7 r6 = (X.JW7) r6
            com.instagram.common.session.UserSession r5 = r6.A0z
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328237845003379(0x81105700113c73, double:3.037462123027967E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            if (r1 == 0) goto L_0x0f3e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A0Y(r0)
        L_0x0f37:
            r0 = -1159207928(0xffffffffbae7e408, float:-0.001769186)
        L_0x0f3a:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0f3e:
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isSelected()
            if (r0 == 0) goto L_0x0f4c
            r0 = -737158982(0xffffffffd40fd8ba, float:-2.47126557E12)
            goto L_0x0f3a
        L_0x0f4c:
            X.27r r0 = X.27p.A01(r5)
            r0.A0a()
            X.JW8 r1 = r6.A14
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0K(r0)
            r3 = 0
            r2 = 1
            r1.A0L(r3, r2)
            X.JWM r1 = r1.A0F
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0f37
            java.util.List r0 = r1.A0S
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            if (r0 == 0) goto L_0x0f73
            r1.Ejh(r0, r2, r3)
            goto L_0x0f37
        L_0x0f73:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -154869452(0xfffffffff6c4e134, float:-1.9965974E33)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYA.onClick(android.view.View):void");
    }
}
