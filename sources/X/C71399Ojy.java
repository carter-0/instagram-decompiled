package X;

import android.view.View;

/* renamed from: X.Ojy  reason: case insensitive filesystem */
public final class C71399Ojy implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71399Ojy(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass0fU.A00(new C71399Ojy(i, obj, obj2, obj3), view);
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.content.Context] */
    /* JADX WARNING: type inference failed for: r2v203, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0a18, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0a1f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0b67, code lost:
        if (r7.length() == 0) goto L_0x0b69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015b, code lost:
        X.AnonymousClass0fD.A0C(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x015e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0e10, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0e13, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0360, code lost:
        if (r2 == 0) goto L_0x0362;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r28) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r0.A00
            r8 = r28
            switch(r1) {
                case 0: goto L_0x0bec;
                case 1: goto L_0x011e;
                case 2: goto L_0x0a97;
                case 3: goto L_0x0a28;
                case 4: goto L_0x09f0;
                case 5: goto L_0x098f;
                case 6: goto L_0x0d74;
                case 7: goto L_0x00f9;
                case 8: goto L_0x0933;
                case 9: goto L_0x06c1;
                case 10: goto L_0x06a6;
                case 11: goto L_0x008d;
                case 12: goto L_0x0d61;
                case 13: goto L_0x0666;
                case 14: goto L_0x0601;
                case 15: goto L_0x05b9;
                case 16: goto L_0x058f;
                case 17: goto L_0x0056;
                case 18: goto L_0x0516;
                case 19: goto L_0x04f9;
                case 20: goto L_0x04cc;
                case 21: goto L_0x04a7;
                case 22: goto L_0x0481;
                case 23: goto L_0x0448;
                case 24: goto L_0x0378;
                case 25: goto L_0x0334;
                case 26: goto L_0x0308;
                case 27: goto L_0x02aa;
                case 28: goto L_0x0272;
                case 29: goto L_0x0251;
                case 30: goto L_0x0214;
                case 31: goto L_0x01b6;
                case 32: goto L_0x0199;
                case 33: goto L_0x017e;
                case 34: goto L_0x0163;
                case 35: goto L_0x0035;
                case 36: goto L_0x0d2b;
                case 37: goto L_0x0cf0;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 1249861783(0x4a7f6097, float:4184101.8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.Object r4 = r0.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r3 = r4.A06
            java.lang.String r2 = "target_user_id"
            r5.putString(r2, r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "recs_from_friends_sender"
            X.6W8 r0 = X.DbW.A0W(r2, r5, r4, r3, r0)
            r0.A0C(r2)
            r0 = -1636527171(0xffffffff9e7493bd, float:-1.2947804E-20)
        L_0x0031:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0035:
            r1 = 780000653(0x2e7ddd8d, float:5.7722317E-11)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.O8B r2 = (X.O8B) r2
            java.lang.Object r1 = r0.A03
            X.OTa r1 = (X.C70953OTa) r1
            X.NgO r0 = r2.A00
            X.OVO r5 = r0.A00
            if (r5 != 0) goto L_0x004e
            java.lang.String r6 = "delegate"
            goto L_0x0a18
        L_0x004e:
            com.instagram.model.direct.DirectThreadKey r3 = r0.A01
            if (r3 != 0) goto L_0x0c0b
            java.lang.String r6 = "threadKey"
            goto L_0x0a18
        L_0x0056:
            r1 = 1722549506(0x66ac0502, float:4.061697E23)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.Mfv r4 = (X.C66962Mfv) r4
            boolean r1 = r4.A03
            if (r1 == 0) goto L_0x0074
            com.instagram.common.session.UserSession r1 = r4.A00
            X.0xa r2 = X.AnonymousClass7TE.A0q(r1)
            java.lang.String r1 = "direct_inbox_vm_play_button_nux_click_count"
            X.0xY r1 = X.AnonymousClass7TG.A0g(r2, r1)
            r1.apply()
        L_0x0074:
            java.lang.Object r3 = r0.A01
            X.Pw7 r3 = (X.C74512Pw7) r3
            com.instagram.model.direct.DirectThreadKey r2 = r4.A01
            X.0qQ.A0A(r8)
            android.graphics.RectF r1 = X.0nA.A0F(r8)
            java.lang.Object r0 = r0.A02
            X.PvA r0 = (X.C74455PvA) r0
            r3.Dzf(r1, r0, r2)
            r0 = -1300491948(0xffffffffb27c1154, float:-1.46722705E-8)
            goto L_0x015b
        L_0x008d:
            r1 = 838058004(0x31f3c014, float:7.0940676E-9)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            X.Mje r8 = (X.C67182Mje) r8
            X.MjM r2 = r8.A02
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.Ma2 r10 = r2.A00
            com.instagram.common.session.UserSession r4 = r10.A0p()
            java.lang.String r3 = r1.getId()
            X.4DH r9 = r10.A1J
            java.lang.String r2 = r9.getModuleName()
            java.lang.String r1 = "direct_recommended_user_suggestion"
            X.Dfc r6 = X.C46548Dgp.A01(r4, r3, r1, r2)
            com.instagram.common.session.UserSession r5 = r10.A0p()
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.1a0 r1 = X.C46447Df9.A03()
            X.1a1 r3 = r1.A01
            com.instagram.common.session.UserSession r2 = r10.A0p()
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r6.A04()
            android.os.Bundle r3 = r3.A01(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            java.lang.String r1 = "profile"
            X.6W8 r1 = X.DbS.A0b(r2, r3, r5, r4, r1)
            X.DbT.A1L(r9, r1)
            X.2om r2 = r8.A01()
            if (r2 == 0) goto L_0x00f5
            java.lang.Object r1 = r0.A01
            X.MmA r1 = (X.C67334MmA) r1
            X.4DH r0 = r8.A00
            java.lang.String r0 = r0.getModuleName()
            X.6KM r1 = X.C67182Mje.A00(r1, r0)
            X.6KN r0 = new X.6KN
            r0.<init>(r1)
            r2.A0B(r0)
        L_0x00f5:
            r0 = -1937339041(0xffffffff8c868d5f, float:-2.0731054E-31)
            goto L_0x015b
        L_0x00f9:
            r1 = -817271846(0xffffffffcf496bda, float:-3.37928858E9)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            X.OMj r1 = (X.C70814OMj) r1
            java.lang.String r3 = r1.A01
            if (r3 == 0) goto L_0x011a
            java.lang.Object r2 = r0.A01
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            boolean r1 = r2.A0H
            r1 = r1 ^ 1
            r2.setChecked(r1)
            java.lang.Object r0 = r0.A02
            X.OJU r0 = (X.OJU) r0
            r0.A00(r3, r1)
        L_0x011a:
            r0 = -623993172(0xffffffffdace9eac, float:-2.90791534E16)
            goto L_0x015b
        L_0x011e:
            r1 = 2023446868(0x789b5954, float:2.5206806E34)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.UaB r6 = (X.C15304UaB) r6
            X.VwK r5 = r6.A01
            if (r5 != 0) goto L_0x0131
            java.lang.String r6 = "adsManagerLogger"
            goto L_0x0a18
        L_0x0131:
            X.UzE r1 = X.C16678UzE.PROMOTION_INFORMATION
            java.lang.String r4 = r1.toString()
            java.lang.String r3 = r6.A04
            if (r3 != 0) goto L_0x013f
            java.lang.String r6 = "mediaId"
            goto L_0x0a18
        L_0x013f:
            r2 = 0
            java.lang.String r1 = "primary_action_button"
            r5.A0A(r4, r1, r3, r2)
            java.lang.Object r1 = r0.A02
            com.instagram.business.promote.model.PromoteButtonAction r1 = (com.instagram.business.promote.model.PromoteButtonAction) r1
            com.instagram.business.promote.model.PromoteButtonActionType r1 = r1.A00
            if (r1 == 0) goto L_0x015f
            java.lang.Object r0 = r0.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            X.C15304UaB.A00(r6, r1, r0)
            r0 = 1932696080(0x73329a10, float:1.4150293E31)
        L_0x015b:
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x015f:
            java.lang.String r6 = "type"
            goto L_0x0a18
        L_0x0163:
            r1 = -1467534997(0xffffffffa887316b, float:-1.5009442E-14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.PxY r3 = (X.C74585PxY) r3
            java.lang.Object r2 = r0.A03
            X.Ma1 r2 = (X.C66632Ma1) r2
            java.lang.Object r0 = r0.A02
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.DDm(r0, r2)
            r0 = -1396657872(0xffffffffacc0b130, float:-5.47664E-12)
            goto L_0x0031
        L_0x017e:
            r1 = -1847285335(0xffffffff91e4a9a9, float:-3.6076618E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.Tqa r3 = (X.C14140Tqa) r3
            java.lang.Object r2 = r0.A02
            X.Mn4 r2 = (X.C67387Mn4) r2
            java.lang.Object r0 = r0.A03
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.DMv(r2, r0)
            r0 = 124386955(0x769fe8b, float:1.7603775E-34)
            goto L_0x0031
        L_0x0199:
            r1 = 95401513(0x5afb629, float:1.6523836E-35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.6a4 r3 = (X.C309916a4) r3
            java.lang.Object r2 = r0.A03
            X.3uh r2 = (X.C255773uh) r2
            java.lang.Object r0 = r0.A02
            X.OH7 r0 = (X.OH7) r0
            android.content.Context r0 = r0.A00
            r3.CtG(r0, r2)
            r0 = 383427514(0x16daa3ba, float:3.5323126E-25)
            goto L_0x0031
        L_0x01b6:
            r1 = -1563141170(0xffffffffa2d45bce, float:-5.7559917E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.MvE r5 = (X.C67810MvE) r5
            com.instagram.common.session.UserSession r8 = r5.A03
            java.lang.Object r2 = r0.A02
            java.lang.String r4 = X.DbS.A0q(r2)
            X.0iw r7 = r5.A02
            java.lang.String r3 = r7.getModuleName()
            java.lang.String r2 = "direct_thread_recs_from_friends_message"
            X.Dfc r6 = X.C46548Dgp.A01(r8, r4, r2, r3)
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            X.6Yo r4 = X.DbU.A0Q(r2, r8)
            X.1a0 r2 = X.C46447Df9.A03()
            X.1a1 r3 = r2.A01
            com.instagram.profile.intf.UserDetailLaunchConfig r2 = r6.A04()
            androidx.fragment.app.Fragment r2 = r3.A02(r8, r2)
            r13 = 0
            r4.A0B(r13, r2)
            r4.A04()
            X.ONF r8 = r5.A04
            java.lang.Long r9 = r5.A05
            java.lang.String r12 = r7.getModuleName()
            java.lang.Object r0 = r0.A01
            X.3kE r0 = (X.C249703kE) r0
            int r0 = r0.getBindingAdapterPosition()
            long r2 = (long) r0
            int r0 = r5.getItemCount()
            long r14 = (long) r0
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.String r11 = "go_to_profile"
            r8.A00(r9, r10, r11, r12, r13, r14)
            r0 = 1417425681(0x547c3311, float:4.33275404E12)
            goto L_0x0031
        L_0x0214:
            r1 = -1111433864(0xffffffffbdc0dd78, float:-0.09417242)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.OEK r5 = (X.OEK) r5
            X.PtX r2 = r5.A01
            r2.AGI()
            java.lang.Object r4 = r0.A01
            X.WSc r4 = (X.C19269WSc) r4
            com.instagram.model.reels.Reel r3 = r4.A01
            r2 = 1
            r4.A03 = r2
            java.lang.Object r6 = r0.A02
            X.MzJ r6 = (X.C68052MzJ) r6
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r6.A00
            r12 = 0
            r0.setVisibility(r12)
            X.2pG r5 = r5.A02
            java.lang.String r9 = X.JTP.A0r(r3)
            java.lang.String r0 = r3.getId()
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            r7 = 0
            r8 = r7
            r10 = r7
            r13 = r12
            r5.Dca(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 983097951(0x3a98e25f, float:0.0011664144)
            goto L_0x0031
        L_0x0251:
            r1 = 1001826915(0x3bb6aa63, float:0.005574511)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.NOc r2 = (X.C68580NOc) r2
            X.6n2 r4 = r2.A03
            java.lang.Object r3 = r0.A02
            com.instagram.reels.prompt.model.PromptStickerModel r3 = (com.instagram.reels.prompt.model.PromptStickerModel) r3
            java.lang.Object r0 = r0.A01
            X.N5v r0 = (X.C68206N5v) r0
            X.BHW r2 = r0.A02
            int r0 = r0.A00
            r4.Dac(r2, r3, r0)
            r0 = 1298983088(0x4d6ce8b0, float:2.48417024E8)
            goto L_0x0031
        L_0x0272:
            r1 = 1780032783(0x6a19250f, float:4.6285164E25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.NOc r6 = (X.C68580NOc) r6
            com.instagram.common.session.UserSession r5 = r6.A02
            X.0Tu r4 = X.0Tu.A05
            r2 = 36327365965527424(0x810f8c00003980, double:3.0369107429365964E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            X.6n2 r4 = r6.A03
            java.lang.Object r3 = r0.A02
            com.instagram.reels.prompt.model.PromptStickerModel r3 = (com.instagram.reels.prompt.model.PromptStickerModel) r3
            java.lang.Object r0 = r0.A01
            X.N5v r0 = (X.C68206N5v) r0
            if (r2 == 0) goto L_0x02a2
            X.BHW r2 = r0.A02
            int r0 = r0.A00
            r4.Dad(r2, r3, r0)
        L_0x029d:
            r0 = 900373207(0x35aa9ad7, float:1.2711051E-6)
            goto L_0x0031
        L_0x02a2:
            X.BHW r2 = r0.A02
            int r0 = r0.A00
            r4.Dac(r2, r3, r0)
            goto L_0x029d
        L_0x02aa:
            r1 = -1095674956(0xffffffffbeb153b4, float:-0.34634173)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3kE r2 = (X.C249703kE) r2
            int r3 = r2.getBindingAdapterPosition()
            r2 = -1
            if (r3 == r2) goto L_0x02ff
            java.lang.Object r4 = r0.A03
            X.MvF r4 = (X.C67811MvF) r4
            X.3UH r2 = r4.A01
            java.util.List r2 = r2.A0P
            if (r2 == 0) goto L_0x02c9
            r2.remove(r3)
        L_0x02c9:
            int r2 = r4.getItemCount()
            if (r2 != 0) goto L_0x0304
            X.1Ng r3 = r4.A02
            X.3DS r2 = new X.3DS
            r2.<init>()
            r3.A00(r2)
        L_0x02d9:
            X.2ok r5 = r4.A03
            X.3UH r2 = r4.A01
            X.1UQ r6 = r2.B5J()
            int r12 = r2.A01
            java.lang.Object r7 = r0.A02
            X.3UL r7 = (X.AnonymousClass3UL) r7
            int r13 = r2.A01(r7)
            X.3UH r0 = r4.A01
            java.lang.String r8 = r0.A0C
            java.lang.String r9 = "profile"
            java.lang.String r10 = r0.getId()
            java.lang.String r11 = r0.A0I
            r5.DpH(r6, r7, r8, r9, r10, r11, r12, r13)
            X.3UH r0 = r4.A01
            r5.Ckj(r0)
        L_0x02ff:
            r0 = -899449228(0xffffffffca637e74, float:-3727261.0)
            goto L_0x0031
        L_0x0304:
            r4.notifyItemRemoved(r3)
            goto L_0x02d9
        L_0x0308:
            r1 = -1168568224(0xffffffffba591060, float:-8.280333E-4)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.PtO r3 = (X.C74348PtO) r3
            java.lang.Object r2 = r0.A01
            X.NIa r2 = (X.NIa) r2
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = r2.A03
            if (r2 == 0) goto L_0x0330
            boolean r2 = r2.isChecked()
            r3.D25(r2)
            java.lang.Object r0 = r0.A02
            X.37D r0 = (X.AnonymousClass37D) r0
            if (r0 == 0) goto L_0x032b
            r0.A0B()
        L_0x032b:
            r0 = -967082993(0xffffffffc65b7c0f, float:-14047.015)
            goto L_0x0031
        L_0x0330:
            java.lang.String r6 = "switch"
            goto L_0x0a18
        L_0x0334:
            r1 = -1329054062(0xffffffffb0c83e92, float:-1.4569699E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.OuB r3 = (X.C71979OuB) r3
            boolean r2 = r3.A0E
            if (r2 == 0) goto L_0x0348
            r0 = 1553179105(0x5c93a1e1, float:3.32438475E17)
            goto L_0x0031
        L_0x0348:
            java.lang.Object r6 = r0.A02
            X.Mtw r6 = (X.C67743Mtw) r6
            if (r6 == 0) goto L_0x0373
            X.0qQ.A0A(r8)
            java.lang.String r5 = r3.A06
            java.lang.Object r4 = r0.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x0362
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x0363
        L_0x0362:
            r0 = 1
        L_0x0363:
            r3 = r0 ^ 1
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.05G r2 = r6.A07
            X.N8e r0 = new X.N8e
            r0.<init>(r8, r4, r5, r3)
            r2.Epw(r0)
        L_0x0373:
            r0 = 1249855070(0x4a7f465e, float:4182423.5)
            goto L_0x0031
        L_0x0378:
            r1 = 1752825138(0x6879fd32, float:4.7221595E24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.OMw r2 = (X.C70824OMw) r2
            com.instagram.common.session.UserSession r12 = r2.A07
            android.app.Activity r11 = r2.A06
            java.lang.Object r5 = r0.A02
            X.2Er r5 = (X.2Er) r5
            X.3sy r2 = r5.BJz()
            boolean r2 = X.C69874Ntc.A00(r11, r12, r2)
            if (r2 == 0) goto L_0x03ac
            java.lang.Object r2 = r0.A01
            X.914 r2 = (X.AnonymousClass914) r2
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x03b1
            java.lang.String r14 = r5.C6C()
            java.lang.String r15 = r2.A03
            java.lang.String r0 = r2.A02
            X.NjA r13 = X.C69309NjA.BANNER
            r16 = r0
            X.C70137Nxr.A00(r11, r12, r13, r14, r15, r16)
        L_0x03ac:
            r0 = 1305734224(0x4dd3ec50, float:4.44434944E8)
            goto L_0x0031
        L_0x03b1:
            X.3sy r3 = r5.BJz()
            java.lang.String r9 = r2.A03
            java.lang.String r2 = r2.A04
            java.lang.String r7 = r12.A06
            int r6 = r5.C6a()
            java.lang.String r0 = r5.AsX()
            r4 = 29
            if (r6 != r4) goto L_0x0423
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0423
            java.lang.String r8 = "creator"
        L_0x03cf:
            int r10 = r5.AdN()
            java.lang.String r7 = "channel_daily_prompt_persistent_banner"
            r5 = 0
            r4 = 1
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "collection_id"
            r6.putString(r0, r9)
            X.3t3 r0 = X.C66647MaG.A08(r3)
            if (r0 == 0) goto L_0x0421
            java.lang.String r9 = X.C300965yF.A07(r0)
        L_0x03ea:
            java.lang.String r0 = "thread_id"
            r6.putString(r0, r9)
            java.lang.String r0 = "card_gallery_collection_title"
            r6.putString(r0, r2)
            java.lang.String r0 = "direct_channel_audience_type"
            r6.putInt(r0, r10)
            java.lang.String r2 = X.C66647MaG.A0C(r3)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_V2_ID"
            r6.putString(r0, r2)
            java.lang.String r0 = "channel_user_type"
            r6.putString(r0, r8)
            java.lang.String r0 = "card_gallery_entry_point"
            r6.putString(r0, r7)
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            X.C67002Mga.A01(r6, r3, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "direct_daily_prompts_add_response"
            X.6W8 r0 = X.Dba.A0K(r11, r6, r12, r2, r0)
            r0.A00 = r4
            r0.A0H = r5
            r0.A0C(r11)
            goto L_0x03ac
        L_0x0421:
            r9 = 0
            goto L_0x03ea
        L_0x0423:
            boolean r0 = X.C329997La.A07(r5, r7)
            if (r0 == 0) goto L_0x0430
            r0 = 2170(0x87a, float:3.041E-42)
            java.lang.String r8 = X.C273654mx.A00(r0)
            goto L_0x03cf
        L_0x0430:
            int r0 = r5.C6a()
            if (r0 != r4) goto L_0x0445
            java.util.List r0 = r5.BJl()
            if (r0 == 0) goto L_0x0445
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0445
            java.lang.String r8 = "moderator"
            goto L_0x03cf
        L_0x0445:
            java.lang.String r8 = "viewer"
            goto L_0x03cf
        L_0x0448:
            r1 = 1261862036(0x4b367c94, float:1.1959444E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r4)
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0465
            r4.requestFocus()
            r0 = 1310178116(0x4e17bb44, float:6.3640806E8)
            goto L_0x0031
        L_0x0465:
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r3)
            if (r3 == 0) goto L_0x047c
            java.lang.Object r2 = r0.A01
            X.C51965G9l.A1W(r2, r3)
            java.lang.Object r0 = r0.A02
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            r0 = 766868684(0x2db57ccc, float:2.0632739E-11)
            goto L_0x0031
        L_0x047c:
            r0 = 392346759(0x1762bc87, float:7.3262493E-25)
            goto L_0x0031
        L_0x0481:
            r1 = 1917307957(0x7247cc35, float:3.9574008E30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            java.lang.Object r2 = r0.A01
            X.Mcr r2 = (X.C66805Mcr) r2
            java.lang.Object r0 = r2.A03
            java.lang.Object r0 = X.DbT.A0r(r0)
            X.Mco r0 = (X.C66802Mco) r0
            com.instagram.direct.messagethread.voice.VoiceMessageControlsView.A02(r3, r0)
            int r2 = r2.A02
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r2, r0)
            r0 = 1113840312(0x4263dab8, float:56.963593)
            goto L_0x0031
        L_0x04a7:
            r1 = 949815(0xe7e37, float:1.330974E-39)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r2 = r0.A02
            X.DbZ.A14(r3, r2)
            java.lang.Object r2 = r0.A01
            X.0sP r2 = (X.0sP) r2
            if (r2 == 0) goto L_0x04c7
            java.lang.CharSequence r0 = r3.getText()
            X.0qQ.A07(r0)
            r2.invoke(r0)
        L_0x04c7:
            r0 = -1957188133(0xffffffff8b57addb, float:-4.1538288E-32)
            goto L_0x0031
        L_0x04cc:
            r1 = 1193123044(0x471d9ce4, float:40348.89)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.PAx r2 = (X.C72566PAx) r2
            X.P8I r6 = r2.A03
            if (r6 == 0) goto L_0x04f4
            java.lang.Object r2 = r0.A01
            X.9JN r2 = (X.AnonymousClass9JN) r2
            java.lang.String r5 = r2.A06
            if (r5 == 0) goto L_0x0e17
            java.lang.Object r4 = r0.A02
            X.NYM r4 = (X.NYM) r4
            X.7Fr r2 = r4.A02
            X.9J6 r0 = r2.A08
            java.lang.String r3 = r0.A00
            com.instagram.model.direct.messageid.DirectMessageIdentifier r2 = r2.A0L
            java.lang.String r0 = r4.A07
            r6.A00(r2, r5, r3, r0)
        L_0x04f4:
            r0 = -1059759745(0xffffffffc0d5597f, float:-6.667175)
            goto L_0x0031
        L_0x04f9:
            r1 = -1523338836(0xffffffffa533b1ac, float:-1.5585973E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.PAv r2 = (X.C72564PAv) r2
            X.P8O r3 = r2.A00
            java.lang.Object r2 = r0.A02
            X.7Fr r2 = (X.C328667Fr) r2
            java.lang.Object r0 = r0.A01
            X.MzW r0 = (X.C68065MzW) r0
            r3.A01(r2, r0)
            r0 = -1865645133(0xffffffff90cc83b3, float:-8.066673E-29)
            goto L_0x0031
        L_0x0516:
            r1 = -914163514(0xffffffffc982f8c6, float:-1072920.8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.NQ0 r3 = (X.NQ0) r3
            java.lang.Object r2 = r0.A02
            X.Ou3 r2 = (X.C71978Ou3) r2
            java.lang.Object r0 = r0.A01
            X.3kE r0 = (X.C249703kE) r0
            int r8 = r0.getAbsoluteAdapterPosition()
            com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response r0 = r2.A02
            X.Nkp r0 = r0.A0E()
            if (r0 == 0) goto L_0x053b
            java.lang.String r7 = r0.name()
            if (r7 != 0) goto L_0x053d
        L_0x053b:
            java.lang.String r7 = ""
        L_0x053d:
            java.lang.String r6 = r2.A03
            int r4 = r2.A00
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            com.instagram.model.direct.DirectThreadKey r0 = r3.A02
            com.facebook.base.activity.parcel.OpaqueParcelable r2 = X.0B0.A00(r0)
            java.lang.String r0 = "magic_media_remix_template_direct_thread_key"
            r5.putParcelable(r0, r2)
            java.lang.String r0 = "magic_media_remix_template_position"
            r5.putInt(r0, r8)
            java.lang.String r0 = "magic_media_remix_template_layout_name"
            r5.putString(r0, r7)
            java.lang.String r0 = "magic_media_remix_template_rule_id"
            r5.putString(r0, r6)
            java.lang.String r0 = "magic_media_remix_template_component_count"
            r5.putInt(r0, r4)
            X.0sa r0 = r3.A03
            java.lang.Object r0 = r0.invoke()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "magic_media_remix_template_bitmap_paths"
            r5.putStringArrayList(r0, r2)
            com.instagram.common.session.UserSession r4 = r3.A01
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            java.lang.String r0 = "MAGIC_MEDIA_REMIX_TEMPLATE"
            X.6W8 r2 = X.DbS.A0b(r3, r5, r4, r2, r0)
            r0 = 0
            r2.A0H = r0
            r2.A07()
            r2.A0A(r3, r0)
            r0 = -518543349(0xffffffffe117a80b, float:-1.7484795E20)
            goto L_0x0031
        L_0x058f:
            r1 = -740593577(0xffffffffd3db7057, float:-1.88496518E12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.Pw7 r5 = (X.C74512Pw7) r5
            java.lang.Object r2 = r0.A03
            X.McM r2 = (X.C66776McM) r2
            X.Noh r2 = r2.A04
            X.MbL r2 = (X.C66714MbL) r2
            com.instagram.model.direct.DirectThreadKey r4 = r2.A00
            com.instagram.model.reels.Reel r3 = r2.A01
            java.lang.Object r0 = r0.A01
            X.Mha r0 = (X.C67059Mha) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r0.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView"
            X.0qQ.A0C(r2, r0)
            r5.Dc8(r4, r3, r2)
            r0 = -978981678(0xffffffffc5a5ecd2, float:-5309.6025)
            goto L_0x0031
        L_0x05b9:
            r1 = -1894579890(0xffffffff8f13014e, float:-7.247911E-30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A01
            X.NWf r7 = (X.C68770NWf) r7
            r3 = 0
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r2 = r7.A05
            if (r2 != 0) goto L_0x05ec
            java.lang.Object r6 = r0.A03
            X.NJf r6 = (X.C68467NJf) r6
            X.0eM r2 = r6.A0j
            X.0lg r5 = X.AnonymousClass7TF.A0L(r2, r3)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36320305039286491(0x810920000020db, double:3.0324453847497625E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 != 0) goto L_0x05ec
            X.Pvt r0 = r6.A0P
            if (r0 == 0) goto L_0x05e7
            r0.FMn()
        L_0x05e7:
            r0 = 1299182627(0x4d6ff423, float:2.51609648E8)
            goto L_0x0031
        L_0x05ec:
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            X.0nA.A0N(r2)
            java.lang.Object r0 = r0.A03
            X.NJf r0 = (X.C68467NJf) r0
            X.Pvt r2 = r0.A0P
            if (r2 == 0) goto L_0x05e7
            java.lang.String r0 = r7.A08
            r2.Cqj(r0)
            goto L_0x05e7
        L_0x0601:
            r1 = 105676715(0x64c7fab, float:3.846193E-35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            X.0nA.A0N(r2)
            java.lang.Object r4 = r0.A03
            X.NJf r4 = (X.C68467NJf) r4
            X.0eM r2 = r4.A0j
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.Object r0 = r0.A01
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = (com.instagram.contentnotes.data.metadata.ContentNoteMetadata) r0
            java.lang.String r10 = r0.A08
            java.lang.String r11 = r0.A07
            java.lang.String r12 = r0.A04
            X.GPK r5 = X.GPK.REPLY_SHEET
            java.lang.String r13 = r0.A06
            java.lang.String r14 = r0.A0A
            java.lang.Integer r8 = r0.A03
            java.lang.String r15 = r0.A05
            java.lang.Integer r9 = r0.A02
            com.instagram.common.typedurl.ImageUrl r6 = r0.A00
            r7 = 0
            r0 = 0
            X.N2M r4 = new X.N2M
            r16 = r7
            r17 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6 = 257(0x101, float:3.6E-43)
            X.0qQ.A0B(r3, r0)
            boolean r0 = X.C71106Ock.A02(r2)
            android.os.Bundle r5 = X.C71071Oaq.A00(r3, r4, r0)
            boolean r0 = X.C249223jK.A06(r3)
            if (r0 == 0) goto L_0x0663
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
        L_0x0655:
            java.lang.String r0 = "notes_creation"
            X.6W8 r0 = X.DbV.A0Y(r2, r5, r3, r4, r0)
            r0.A0A(r2, r6)
            r0 = 165271(0x28597, float:2.31594E-40)
            goto L_0x0031
        L_0x0663:
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            goto L_0x0655
        L_0x0666:
            r1 = 2016051102(0x782a7f9e, float:1.3832482E34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A03
            X.Mz6 r7 = (X.C68039Mz6) r7
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.OSj r4 = r7.A08
            java.lang.Object r2 = r0.A02
            X.Ou9 r2 = (X.Ou9) r2
            java.lang.String r3 = r2.A0C
            java.lang.String r2 = "media_id"
            java.util.Map r3 = X.AnonymousClass7TF.A0w(r2, r3)
            java.lang.String r2 = "igd_campaign_item_click"
            X.C70936OSj.A00(r4, r2, r3)
            com.instagram.common.session.UserSession r6 = r7.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            java.lang.Object r4 = r0.A01
            android.os.Bundle r4 = (android.os.Bundle) r4
            X.4DH r3 = r7.A01
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r0 = 2257(0x8d1, float:3.163E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A03(r2, r4, r6, r5, r0)
            X.DbU.A1K(r3, r0)
            r0 = -1285024023(0xffffffffb36816e9, float:-5.4037546E-8)
            goto L_0x0031
        L_0x06a6:
            r1 = -1040143817(0xffffffffc200aa37, float:-32.166225)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.NIk r3 = (X.C68447NIk) r3
            java.lang.Object r2 = r0.A01
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r2
            java.lang.Object r0 = r0.A02
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C68447NIk.A00(r0, r3, r2)
            r0 = 1394187182(0x53199bae, float:6.5974187E11)
            goto L_0x0031
        L_0x06c1:
            r1 = -263202540(0xfffffffff04fd914, float:-2.5730331E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.NPv r6 = (X.C68625NPv) r6
            X.NKI r5 = r6.A01
            if (r5 == 0) goto L_0x07d7
            java.lang.Object r2 = r0.A02
            X.Ou8 r2 = (X.Ou8) r2
            java.lang.String r4 = r2.A07
            r7 = 0
            X.3sy r3 = r5.A08
            java.lang.String r16 = "typedLogger"
            java.lang.String r15 = "entryPoint"
            java.lang.String r14 = "currentTheme"
            if (r3 == 0) goto L_0x0747
            X.0wc r10 = r5.A02
            if (r10 == 0) goto L_0x0e2f
            java.lang.String r8 = r5.A0B
            if (r8 == 0) goto L_0x0e2b
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r2 = r5.A07
            if (r2 == 0) goto L_0x0e27
            java.lang.String r11 = r2.A09
            X.2t9 r2 = r5.A03
            if (r2 == 0) goto L_0x0930
            int r13 = r2.A02(r4)
        L_0x06f7:
            java.lang.Integer r9 = r5.A09
            java.lang.Integer r12 = X.NKI.A02(r5, r4)
            if (r12 != 0) goto L_0x0709
            java.lang.String r2 = "3259963564026002"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0914
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
        L_0x0709:
            r2 = 6
            X.0qQ.A0B(r9, r2)
            java.lang.String r2 = "direct_theme_picker_click"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r10, r2)
            boolean r2 = r10.isSampled()
            if (r2 == 0) goto L_0x0747
            java.lang.String r2 = "target_theme_id"
            r10.AAJ(r2, r4)
            java.lang.String r2 = "set_theme_id"
            r10.AAJ(r2, r11)
            X.NmM r2 = X.OX5.A00(r8)
            X.DbS.A1F(r2, r10)
            java.lang.Long r8 = X.DbS.A0j(r13)
            java.lang.String r2 = "selection_index"
            r10.A9F(r2, r8)
            boolean r2 = X.C66647MaG.A0E(r3)
            X.C66581MXm.A1H(r10, r2)
            java.lang.String r2 = X.C66647MaG.A0A(r3)
            X.C66580MXl.A1J(r10, r2)
            X.C67003Mgb.A02(r10, r3)
            X.OX5.A01(r10, r12, r9)
        L_0x0747:
            boolean r2 = r5.A0E
            if (r2 == 0) goto L_0x076b
            X.0eM r2 = r5.A0Q
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r8 = r5.A0A
            X.0qQ.A0B(r9, r7)
            java.lang.String r2 = "theme"
            java.util.Map r23 = X.AnonymousClass7TF.A0w(r2, r4)
            java.lang.String r19 = "branded_chat_theme_picker"
            java.lang.String r20 = "click"
            r18 = r9
            r21 = r2
            r22 = r8
            r17 = r5
            X.C48823Ekl.A00(r17, r18, r19, r20, r21, r22, r23)
        L_0x076b:
            java.lang.String r2 = "ai_theme_creation_dummy_theme_id"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x07fc
            if (r3 == 0) goto L_0x07d7
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r2 = 15
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putParcelable(r2, r3)
            int r3 = r5.A00
            r2 = 32
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putInt(r2, r3)
            boolean r3 = r5.A0D
            java.lang.String r2 = "is_ai_theme_set"
            r8.putBoolean(r2, r3)
            java.lang.Integer r2 = r5.A09
            java.lang.String r3 = X.C69839Nt3.A00(r2)
            java.lang.String r2 = "theme_type"
            r8.putString(r2, r3)
            java.lang.String r3 = r5.A0B
            if (r3 == 0) goto L_0x0e2b
            r2 = 219(0xdb, float:3.07E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putString(r2, r3)
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r2 = r5.A07
            if (r2 == 0) goto L_0x0e27
            java.lang.String r3 = r2.A09
            java.lang.String r2 = "old_theme_id"
            r8.putString(r2, r3)
            X.0eM r2 = r5.A0Q
            X.0lg r7 = X.DbT.A0X(r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            r2 = 536(0x218, float:7.51E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.6W8 r3 = X.AnonymousClass6W8.A03(r3, r8, r7, r4, r2)
            r3.A07()
            r2 = 100
            r3.A0D(r5, r2)
        L_0x07d7:
            boolean r3 = r6.A02
            java.lang.Object r2 = r0.A01
            X.Myo r2 = (X.C68022Myo) r2
            if (r3 == 0) goto L_0x07f5
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r2.A04
            if (r2 == 0) goto L_0x07f0
            java.lang.Object r0 = r0.A02
            X.Ou8 r0 = (X.Ou8) r0
            boolean r0 = r0.A09
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
        L_0x07f0:
            r0 = 1275292852(0x4c036cb4, float:3.4452176E7)
            goto L_0x0031
        L_0x07f5:
            com.instagram.igds.components.button.IgdsRadioButton r2 = r2.A05
            r0 = 1
            r2.setChecked(r0)
            goto L_0x07f0
        L_0x07fc:
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r2 = r5.A07
            if (r2 == 0) goto L_0x0e27
            java.lang.String r2 = r2.A09
            boolean r2 = r4.equals(r2)
            java.lang.String r8 = "themesMap"
            if (r2 == 0) goto L_0x08ba
            java.util.Map r2 = r5.A0C
            if (r2 == 0) goto L_0x0e33
            boolean r2 = r2.containsKey(r4)
            if (r2 != 0) goto L_0x08ba
            if (r3 == 0) goto L_0x07d7
            X.0wc r8 = r5.A02
            if (r8 == 0) goto L_0x0e2f
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r2 = r5.A07
            if (r2 == 0) goto L_0x0e27
            java.lang.String r9 = r2.A09
            java.lang.String r4 = r5.A0B
            if (r4 == 0) goto L_0x0e2b
            java.lang.String r2 = "direct_custom_theme_menu"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r8, r2)
            boolean r2 = r8.isSampled()
            if (r2 == 0) goto L_0x0865
            java.lang.String r2 = "set_theme_id"
            r8.AAJ(r2, r9)
            java.lang.String r2 = X.C66647MaG.A0C(r3)
            X.C66580MXl.A1J(r8, r2)
            X.C67003Mgb.A02(r8, r3)
            X.NmM r2 = X.OX5.A00(r4)
            X.DbS.A1F(r2, r8)
            X.HOb r4 = X.C54670HOb.THEME_PICKER
            java.lang.String r2 = "minor_entry_point"
            r8.A8M(r4, r2)
            boolean r2 = X.C66647MaG.A0E(r3)
            X.C66581MXm.A1H(r8, r2)
            X.Nli r3 = X.C69438Nli.AI_GENERATED_THEME
            java.lang.String r2 = "theme_type"
            r8.A8M(r3, r2)
            X.Nm2 r3 = X.C69458Nm2.AI_GENERATED_THEME
            java.lang.String r2 = "set_theme_type"
            r8.A8M(r3, r2)
            r8.Cgf()
        L_0x0865:
            X.37D r2 = X.DbX.A0i(r5)
            X.7Pu r10 = X.C48943Emh.A00(r2)
            if (r10 == 0) goto L_0x07d7
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            X.0eM r9 = r5.A0Q
            X.0lg r2 = X.DbT.A0X(r9)
            X.Dg1 r8 = new X.Dg1
            r8.<init>(r3, r2)
            r4 = 2131972171(0x7f13504b, float:1.9581342E38)
            r3 = 42
            X.Ok4 r2 = new X.Ok4
            r2.<init>(r3, r10, r5)
            r8.A02(r2, r4)
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r2 = 48
            X.Ok0 r2 = X.C71401Ok0.A00(r5, r2)
            r8.A02(r2, r3)
            r3 = 2131954722(0x7f130c22, float:1.9545951E38)
            r2 = 49
            X.Ok0 r2 = X.C71401Ok0.A00(r10, r2)
            r8.A04(r2, r3)
            X.FFy r4 = new X.FFy
            r4.<init>(r8, r10)
            X.0lg r2 = X.DbT.A0X(r9)
            X.7Pr r3 = X.DbX.A0e(r2, r7)
            r2 = 1
            r3.A1G = r2
            r3.A0x = r7
            r4.A06(r3)
            goto L_0x07d7
        L_0x08ba:
            java.util.Map r2 = r5.A0C
            if (r2 == 0) goto L_0x0e33
            java.lang.Object r9 = r2.get(r4)
            if (r9 == 0) goto L_0x0e22
            com.instagram.direct.model.DirectThreadThemeInfo r9 = (com.instagram.direct.model.DirectThreadThemeInfo) r9
            java.lang.String r3 = r9.A0o
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r2 = r5.A07
            if (r2 == 0) goto L_0x0e27
            java.lang.String r2 = r2.A09
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x08d9
            X.DbZ.A15(r5)
            goto L_0x07d7
        L_0x08d9:
            boolean r2 = r5.A0F
            if (r2 != 0) goto L_0x08e3
            r2 = 1
            X.NKI.A06(r5, r9, r2)
            goto L_0x07d7
        L_0x08e3:
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r3 = r9.A0o
            X.0qQ.A0B(r3, r7)
            java.lang.String r2 = "theme_id"
            r8.A04(r2, r3)
            com.facebook.pando.PandoGraphQLRequest r8 = X.C71583OnK.A00(r8, r4)
            X.0eM r2 = r5.A0Q
            X.1vn r7 = X.Dba.A0G(r2)
            X.0qQ.A0A(r8)
            r2 = 10
            X.OnG r4 = new X.OnG
            r4.<init>(r2, r5, r9)
            r3 = 6
            X.Omr r2 = new X.Omr
            r2.<init>(r3, r5, r9)
            r7.ATL(r2, r4, r8)
            goto L_0x07d7
        L_0x0914:
            java.lang.String r2 = "ai_theme_creation_dummy_theme_id"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x092c
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r2 = r5.A07
            if (r2 == 0) goto L_0x0e27
            java.lang.String r2 = r2.A09
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x092c
            java.lang.Integer r12 = X.AnonymousClass05K.A0Y
            goto L_0x0709
        L_0x092c:
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            goto L_0x0709
        L_0x0930:
            r13 = -1
            goto L_0x06f7
        L_0x0933:
            r1 = 1903744553(0x7178d629, float:1.232179E30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.NK2 r2 = (X.NK2) r2
            X.0eM r2 = r2.A0V
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Object r4 = r0.A02
            X.P49 r4 = (X.P49) r4
            X.NjK r5 = X.C69319NjK.DIRECT_COMPOSER_STICKER_BUTTON
            X.0sn r9 = X.0sn.A00
            java.lang.String r7 = ""
            java.lang.String r8 = "stickers"
            r6 = 0
            r10 = 1
            boolean r11 = X.DbW.A1S(r10, r3, r4)
            r2 = 23
            X.0qQ.A0B(r9, r2)
            r12 = r10
            r13 = r10
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r24 = r11
            r25 = r11
            r26 = r11
            X.NJc r4 = X.OPG.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r3 = r0.A01
            X.37D r3 = (X.AnonymousClass37D) r3
            X.PQt r2 = new X.PQt
            r2.<init>(r10, r4, r3)
            r0 = r3
            X.37F r0 = (X.AnonymousClass37F) r0
            r0.A0H = r2
            r3.A0B()
            r0 = 205754260(0xc438f94, float:1.506546E-31)
            goto L_0x0031
        L_0x098f:
            r1 = -385976065(0xffffffffe8fe78ff, float:-9.6137045E24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            com.instagram.direct.appwidget.DirectWidgetConfig r5 = (com.instagram.direct.appwidget.DirectWidgetConfig) r5
            X.QAL r3 = r5.A02
            java.lang.String r6 = "bottomSheet"
            if (r3 == 0) goto L_0x0a18
            r2 = 2131624493(0x7f0e022d, float:1.8876167E38)
            r3.setContentView(r2)
            X.QAL r3 = r5.A02
            if (r3 == 0) goto L_0x0a18
            r2 = 2131431178(0x7f0b0f0a, float:1.8484078E38)
            android.view.View r4 = r3.findViewById(r2)
            if (r4 == 0) goto L_0x09bd
            r3 = 11
            X.Ok4 r2 = new X.Ok4
            r2.<init>(r3, r4, r5)
            X.AnonymousClass0fU.A00(r2, r4)
        L_0x09bd:
            X.QAL r3 = r5.A02
            if (r3 == 0) goto L_0x0a18
            r2 = 2131439268(0x7f0b2ea4, float:1.8500486E38)
            android.view.View r4 = r3.findViewById(r2)
            if (r4 == 0) goto L_0x09d2
            java.lang.Object r3 = r0.A01
            java.lang.Object r2 = r0.A02
            r0 = 4
            A00(r4, r2, r5, r3, r0)
        L_0x09d2:
            X.QAL r2 = r5.A02
            if (r2 == 0) goto L_0x0a18
            r0 = 2131432509(0x7f0b143d, float:1.8486777E38)
            android.view.View r2 = r2.findViewById(r0)
            if (r2 == 0) goto L_0x09e4
            r0 = 42
            X.C71403Ok2.A01(r2, r0, r5)
        L_0x09e4:
            X.QAL r0 = r5.A02
            if (r0 == 0) goto L_0x0a18
            X.AnonymousClass0fN.A00(r0)
            r0 = -1226935942(0xffffffffb6de717a, float:-6.629326E-6)
            goto L_0x0031
        L_0x09f0:
            r1 = 220668408(0xd2721f8, float:5.1501737E-31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            com.instagram.direct.appwidget.DirectWidgetConfig r4 = (com.instagram.direct.appwidget.DirectWidgetConfig) r4
            java.util.HashMap r2 = r4.A05
            r2.clear()
            com.instagram.direct.appwidget.DirectWidgetConfig.A01(r4)
            java.lang.Object r3 = r0.A01
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2 = 2131951778(0x7f1300a2, float:1.953998E38)
            r3.setText(r2)
            java.lang.Object r0 = r0.A02
            X.C51969G9p.A1M(r0)
            X.QAL r0 = r4.A02
            if (r0 != 0) goto L_0x0a20
            java.lang.String r6 = "bottomSheet"
        L_0x0a18:
            X.0qQ.A0F(r6)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0a20:
            r0.dismiss()
            r0 = -2016675019(0xffffffff87cbfb35, float:-3.0691691E-34)
            goto L_0x0031
        L_0x0a28:
            r1 = 1614210617(0x6036e639, float:5.2717136E19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r10 = r0.A03
            com.instagram.direct.appwidget.DirectWidgetConfig r10 = (com.instagram.direct.appwidget.DirectWidgetConfig) r10
            X.QAL r8 = new X.QAL
            r8.<init>(r10)
            r2 = 2131624832(0x7f0e0380, float:1.8876855E38)
            r8.setContentView(r2)
            r2 = 2131427447(0x7f0b0077, float:1.847651E38)
            android.view.View r9 = r8.findViewById(r2)
            android.widget.AbsListView r9 = (android.widget.AbsListView) r9
            java.lang.Object r2 = r0.A02
            X.0lg r2 = (X.0lg) r2
            X.0BQ r2 = X.AnonymousClass0BO.A00(r2)
            java.util.List r7 = r2.BO0()
            if (r9 == 0) goto L_0x0a81
            r6 = 2131624831(0x7f0e037f, float:1.8876853E38)
            r5 = 2131427446(0x7f0b0076, float:1.8476508E38)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x0a63:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0a6d
            X.C66582MXn.A1O(r4, r3)
            goto L_0x0a63
        L_0x0a6d:
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r2.<init>(r10, r6, r5, r4)
            r9.setAdapter(r2)
            java.lang.Object r2 = r0.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.Okx r0 = new X.Okx
            r0.<init>(r2, r8, r10, r7)
            r9.setOnItemClickListener(r0)
        L_0x0a81:
            r0 = 2131432509(0x7f0b143d, float:1.8486777E38)
            android.view.View r2 = r8.findViewById(r0)
            if (r2 == 0) goto L_0x0a8f
            r0 = 41
            X.C71403Ok2.A01(r2, r0, r8)
        L_0x0a8f:
            X.AnonymousClass0fN.A00(r8)
            r0 = 1832914833(0x6d400f91, float:3.7149963E27)
            goto L_0x0031
        L_0x0a97:
            r1 = 2136437327(0x7f57724f, float:2.8637754E38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.7Fr r4 = (X.C328667Fr) r4
            X.9J6 r6 = r4.A08
            java.lang.String r2 = r6.A01
            java.lang.Object r7 = r0.A03
            X.Mv2 r7 = (X.C67798Mv2) r7
            java.lang.String r3 = "gen_ai_account_fragment"
            com.instagram.common.session.UserSession r9 = r7.A04
            android.os.Bundle r15 = X.FGU.A00(r9, r2, r3)
            java.lang.Object r11 = r0.A01
            X.3kE r11 = (X.C249703kE) r11
            android.content.Context r13 = X.DbS.A07(r11)
            r14 = 0
            r5 = 0
            r17 = r2
            r18 = r5
            r16 = r9
            X.34S r0 = X.FGU.A01(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r0.A00
            r13 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r13)
            if (r0 == 0) goto L_0x0ad4
            r0 = 1083924405(0x409b5fb5, float:4.855433)
            goto L_0x0031
        L_0x0ad4:
            X.0bY r0 = r7.A01
            android.net.Uri r3 = X.0cp.A01(r0, r2)
            if (r3 != 0) goto L_0x0ae1
            r0 = 303285282(0x1213c422, float:4.6626774E-28)
            goto L_0x0031
        L_0x0ae1:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0, r3)
            java.lang.String r0 = "com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY"
            android.content.Intent r2 = r2.putExtra(r0, r13)
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r3 = r2.setFlags(r0)
            X.0qQ.A07(r3)
            android.content.Context r0 = X.DbS.A07(r11)
            int r0 = X.0oI.A00(r0, r3)
            if (r0 != 0) goto L_0x0b28
            android.content.Context r0 = X.DbS.A07(r11)
            java.lang.String r0 = r0.getPackageName()
            r3.setPackage(r0)
            r0 = 227(0xe3, float:3.18E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r13)
            X.4DH r2 = r7.A02
            boolean r0 = X.0kR.A0G(r3, r2)
            if (r0 != 0) goto L_0x0b28
            boolean r0 = r2.mDetached
            if (r0 != 0) goto L_0x0b28
            android.content.Context r0 = X.DbS.A07(r11)
            X.0kR.A0C(r0, r3)
        L_0x0b28:
            java.lang.String r8 = r4.A0V
            if (r8 == 0) goto L_0x0be2
            X.0Tu r0 = X.0Tu.A05
            r2 = 36327288656247108(0x810f7a00023944, double:3.036861852236425E-306)
            boolean r0 = X.182.A06(r0, r9, r2)
            if (r0 == 0) goto L_0x0be2
            X.7I3 r10 = new X.7I3
            r10.<init>(r9)
            int r11 = r11.getBindingAdapterPosition()
            X.4DH r3 = r7.A02
            android.os.Bundle r2 = r3.mArguments
            if (r2 == 0) goto L_0x0be9
            java.lang.String r0 = "external_link_thread_viewer_session_id"
            java.lang.String r9 = r2.getString(r0)
        L_0x0b4e:
            android.os.Bundle r2 = r3.mArguments
            if (r2 == 0) goto L_0x0b58
            java.lang.String r0 = "external_link_thread_session_entry_point"
            java.lang.String r14 = r2.getString(r0)
        L_0x0b58:
            X.0wc r0 = r10.A01
            X.1Ln r3 = X.1Ln.A05(r0)
            java.lang.String r7 = r6.A01
            if (r7 == 0) goto L_0x0b69
            int r2 = r7.length()
            r0 = 0
            if (r2 != 0) goto L_0x0b6a
        L_0x0b69:
            r0 = 1
        L_0x0b6a:
            r2 = 0
            if (r0 != 0) goto L_0x0be7
            X.0bY r0 = r10.A00
            android.net.Uri r12 = X.0cp.A01(r0, r7)
        L_0x0b73:
            X.N1G r10 = new X.N1G
            r10.<init>()
            java.lang.Long r7 = X.DbS.A0j(r11)
            java.lang.String r0 = "index"
            r10.A05(r0, r7)
            if (r12 == 0) goto L_0x0b87
            java.util.Set r2 = r12.getQueryParameterNames()
        L_0x0b87:
            java.lang.String r11 = "igid"
            if (r2 == 0) goto L_0x0ba5
            boolean r0 = r2.contains(r11)
            if (r0 != r13) goto L_0x0ba5
            X.NmQ r2 = X.C69482NmQ.USER
            java.lang.String r0 = "type"
            r10.A01(r2, r0)
            java.lang.String r2 = r12.getQueryParameter(r11)
            if (r2 != 0) goto L_0x0ba0
            java.lang.String r2 = ""
        L_0x0ba0:
            java.lang.String r0 = "id"
            r10.A06(r0, r2)
        L_0x0ba5:
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x0be2
            java.lang.String r2 = "profile"
            java.lang.String r0 = "tap_surface"
            r3.A0R(r0, r2)
            java.lang.String r0 = "content"
            r3.A0N(r10, r0)
            java.lang.String r0 = "bot_response_id"
            r3.A0R(r0, r8)
            java.lang.String r0 = "thread_session_id"
            r3.A0R(r0, r9)
            java.lang.String r0 = "index_id"
            r3.A0Q(r0, r7)
            java.lang.String r0 = r6.A00
            java.lang.Long r2 = X.C51971G9r.A0n(r5, r0)
            java.lang.String r0 = "sender_id"
            r3.A0Q(r0, r2)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r4.A0L
            java.lang.String r2 = r0.A01
            java.lang.String r0 = "message_id"
            r3.A0R(r0, r2)
            java.lang.String r0 = "entrypoint"
            r3.A0R(r0, r14)
            r3.Cgf()
        L_0x0be2:
            r0 = -2027096485(0xffffffff872cf65b, float:-1.3012239E-34)
            goto L_0x0031
        L_0x0be7:
            r12 = r2
            goto L_0x0b73
        L_0x0be9:
            r9 = r14
            goto L_0x0b4e
        L_0x0bec:
            r1 = 556733134(0x212f12ce, float:5.9317194E-19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.4tV r4 = (X.C276544tV) r4
            java.lang.Object r2 = r0.A03
            X.OHh r2 = (X.C70712OHh) r2
            X.4uI r3 = r2.A00
            X.6Tm r2 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r0.A01
            X.6Rm r0 = (X.C307786Rm) r0
            X.C307886Rw.A03(r0, r4, r2, r3)
            r0 = 237447491(0xe272943, float:2.0604206E-30)
            goto L_0x0031
        L_0x0c0b:
            java.lang.String r1 = r1.A02
            X.0qQ.A07(r1)
            java.lang.String r0 = "NONE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cc7
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x0c1a:
            r12 = 1
            r8 = 3
            X.0qQ.A0B(r6, r12)
            com.instagram.common.session.UserSession r13 = r5.A04
            X.0iw r7 = r5.A03
            r11 = 0
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = X.C70149Ny3.A00(r6)
            java.lang.String r0 = "option"
            r2.put(r0, r1)
            java.lang.String r0 = "reminder_option_tap"
            X.OQ6.A01(r7, r13, r3, r0, r2)
            int r7 = r6.intValue()
            if (r7 != r8) goto L_0x0ca5
            X.7Pu r8 = r5.A00
            if (r8 == 0) goto L_0x0ca0
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            java.util.Date r10 = r2.getTime()
            r1 = 12
            r0 = 5
            r2.add(r1, r0)
            java.util.Date r9 = r2.getTime()
            r1 = 7
            r0 = 6
            r2.add(r1, r0)
            java.util.Date r7 = r2.getTime()
            android.content.Context r2 = r5.A02
            android.app.Activity r0 = r5.A01
            X.OLy r1 = new X.OLy
            r1.<init>(r0, r2, r13)
            r0 = 2131959565(0x7f131f0d, float:1.9555774E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            r1.A07 = r0
            X.0qQ.A0A(r9)
            X.0qQ.A0B(r9, r11)
            r1.A09 = r9
            X.0qQ.A0A(r10)
            X.0qQ.A0B(r10, r11)
            r1.A0A = r10
            X.0qQ.A0A(r7)
            X.0qQ.A0B(r7, r11)
            r1.A08 = r7
            r1.A0D = r12
            r1.A0C = r12
            X.P03 r0 = new X.P03
            r0.<init>(r5, r8, r3, r6)
            r1.A01 = r0
            X.OFr r2 = r1.A00()
            boolean r0 = r2.A04
            r8.A0Q(r0)
            X.7Pr r1 = r2.A03
            X.UbI r0 = r2.A02
            r8.A0F(r0, r1)
        L_0x0ca0:
            r0 = -1393468514(0xffffffffacf15b9e, float:-6.8598035E-12)
            goto L_0x0e10
        L_0x0ca5:
            X.7Pu r0 = r5.A00
            if (r0 == 0) goto L_0x0cac
            r0.A07()
        L_0x0cac:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r1 = 12
            switch(r7) {
                case 0: goto L_0x0cc5;
                case 1: goto L_0x0cc2;
                default: goto L_0x0cb5;
            }
        L_0x0cb5:
            r0 = 360(0x168, float:5.04E-43)
        L_0x0cb7:
            r2.add(r1, r0)
            long r0 = r2.getTimeInMillis()
            X.OVO.A00(r5, r3, r6, r0)
            goto L_0x0ca0
        L_0x0cc2:
            r0 = 60
            goto L_0x0cb7
        L_0x0cc5:
            r0 = 0
            goto L_0x0cb7
        L_0x0cc7:
            java.lang.String r0 = "HOUR_ONE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cd3
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x0c1a
        L_0x0cd3:
            java.lang.String r0 = "HOUR_SIX"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0cdf
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            goto L_0x0c1a
        L_0x0cdf:
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ceb
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            goto L_0x0c1a
        L_0x0ceb:
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r1)
            throw r2
        L_0x0cf0:
            java.lang.Object r4 = r0.A01
            X.NKf r4 = (X.C68487NKf) r4
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r0.A03
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r0 = 2131436560(0x7f0b2410, float:1.8494994E38)
            android.widget.EditText r0 = X.DbU.A0E(r1, r0)
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.OBq r0 = X.C70089Nx5.A00(r0)
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "msys_linked_thread_igid"
            r1.E5g(r0, r2)
            r1.apply()
            X.C68487NKf.A01(r3, r4)
            android.content.Context r1 = r8.getContext()
            r0 = 2131965086(0x7f13349e, float:1.9566972E38)
            X.C59689JTv.A07(r1, r0)
            return
        L_0x0d2b:
            java.lang.Object r7 = r0.A01
            X.NKf r7 = (X.C68487NKf) r7
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r9 = r0.A03
            r0 = 2131431478(0x7f0b1036, float:1.8484686E38)
            android.widget.EditText r0 = X.DbU.A0E(r1, r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r1 = r0.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r1.toLowerCase(r0)
            X.1a8 r2 = r7.A02
            X.1aU r1 = r7.A00
            r11 = 2
            X.Ouq r0 = new X.Ouq
            r0.<init>(r10, r11)
            X.1aU r0 = r1.A0L(r0)
            X.PSX r6 = new X.PSX
            r6.<init>(r7, r8, r9, r10, r11)
            r2.A02(r0, r6)
            return
        L_0x0d61:
            java.lang.Object r2 = r0.A01
            X.Moi r2 = (X.C67488Moi) r2
            java.lang.Object r1 = r0.A02
            X.7Pu r1 = (X.C331157Pu) r1
            java.lang.Object r0 = r0.A03
            X.Mle r0 = (X.C67304Mle) r0
            r2.A02(r0)
            r1.A07()
            return
        L_0x0d74:
            r1 = -1401834044(0xffffffffac71b5c4, float:-3.434906E-12)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            X.NOn r1 = (X.C68591NOn) r1
            X.O6J r8 = r1.A02
            java.lang.Object r3 = r0.A02
            X.N63 r3 = (X.N63) r3
            java.lang.String r11 = r3.A06
            java.lang.Object r5 = r0.A01
            X.MyL r5 = (X.C67993MyL) r5
            int r1 = r5.getAbsoluteAdapterPosition()
            int r7 = r3.A01
            boolean r6 = r3.A00
            r2 = 0
            X.0qQ.A0B(r11, r2)
            X.NKl r9 = r8.A00
            X.0eM r0 = r9.A03
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r8 = r9.requireActivity()
            r0 = 584(0x248, float:8.18E-43)
            java.lang.String r12 = X.C273654mx.A00(r0)
            r13 = 0
            X.OP8.A00(r8, r9, r10, r11, r12, r13)
            X.0eM r0 = r9.A02
            java.lang.Object r9 = r0.getValue()
            X.OEy r9 = (X.C70651OEy) r9
            r0 = 2
            boolean r10 = X.AnonymousClass7TF.A1S(r7, r0)
            X.0wc r7 = r9.A00
            java.lang.String r0 = "igd_channels_client_actions"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r7, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x0e08
            java.lang.String r8 = r9.A02
            java.lang.String r0 = "user_igid"
            r7.AAJ(r0, r8)
            java.lang.String r0 = "channel_invitation_clicked"
            X.DbS.A1I(r7, r0)
            java.lang.String r0 = "activity_feed"
            X.DbS.A1M(r7, r0)
            java.lang.String r8 = "channel_invite_item"
            java.lang.String r0 = "source"
            X.Dba.A1B(r7, r0, r8)
            java.lang.String r0 = r9.A01
            X.C66584MXp.A0u(r7, r0)
            java.lang.String r0 = "ig_thread_id"
            java.lang.Long r1 = X.DbV.A0p(r7, r0, r11, r1)
            java.lang.String r0 = "suggestion_position"
            r7.A9F(r0, r1)
            if (r10 == 0) goto L_0x0e14
            java.lang.String r1 = "subscriber_broadcast"
        L_0x0df4:
            java.lang.String r0 = "channel_type"
            r7.AAJ(r0, r1)
            r0 = r6 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "read"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            X.C66583MXo.A18(r7, r0)
        L_0x0e08:
            r3.A00 = r2
            X.C68591NOn.A00(r5, r3)
            r0 = 953275626(0x38d1d4ea, float:1.0005555E-4)
        L_0x0e10:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0e14:
            java.lang.String r1 = "broadcast"
            goto L_0x0df4
        L_0x0e17:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -465236920(0xffffffffe4450c48, float:-1.4539574E22)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0e22:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0e27:
            X.0qQ.A0F(r14)
            goto L_0x0e36
        L_0x0e2b:
            X.0qQ.A0F(r15)
            goto L_0x0e36
        L_0x0e2f:
            X.0qQ.A0F(r16)
            goto L_0x0e36
        L_0x0e33:
            X.0qQ.A0F(r8)
        L_0x0e36:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71399Ojy.onClick(android.view.View):void");
    }
}
