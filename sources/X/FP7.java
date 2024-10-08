package X;

import android.view.View;

public final class FP7 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FP7(C48153EZv eZv, ESM esm, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = eZv;
            this.A02 = esm;
        } else {
            this.A02 = esm;
            this.A01 = eZv;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new FP7(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x080e, code lost:
        X.0qQ.A0F("authorizeListener");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0817, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0832, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0835, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A00
            r6 = r22
            switch(r0) {
                case 0: goto L_0x0818;
                case 1: goto L_0x0761;
                case 2: goto L_0x072f;
                case 3: goto L_0x0708;
                case 4: goto L_0x0688;
                case 5: goto L_0x0660;
                case 6: goto L_0x0628;
                case 7: goto L_0x0611;
                case 8: goto L_0x05fa;
                case 9: goto L_0x05e0;
                case 10: goto L_0x05d4;
                case 11: goto L_0x058c;
                case 12: goto L_0x0557;
                case 13: goto L_0x0520;
                case 14: goto L_0x04d1;
                case 15: goto L_0x04ac;
                case 16: goto L_0x0470;
                case 17: goto L_0x040f;
                case 18: goto L_0x03f8;
                case 19: goto L_0x03e1;
                case 20: goto L_0x03ca;
                case 21: goto L_0x03b3;
                case 22: goto L_0x039c;
                case 23: goto L_0x0383;
                case 24: goto L_0x0318;
                case 25: goto L_0x030a;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x02b9;
                case 29: goto L_0x0268;
                case 30: goto L_0x022a;
                case 31: goto L_0x01fe;
                case 32: goto L_0x01dc;
                case 33: goto L_0x0196;
                case 34: goto L_0x017f;
                case 35: goto L_0x0168;
                case 36: goto L_0x014f;
                case 37: goto L_0x0136;
                case 38: goto L_0x0110;
                case 39: goto L_0x00eb;
                case 40: goto L_0x00c6;
                case 41: goto L_0x0098;
                case 42: goto L_0x0080;
                case 43: goto L_0x005b;
                case 44: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            r0 = -1462838145(0xffffffffa8cedc7f, float:-2.296622E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r3.A01
            X.H03 r8 = (X.H03) r8
            java.lang.Object r7 = r3.A02
            android.content.Context r7 = (android.content.Context) r7
            X.37D r1 = X.DbX.A0i(r8)
            X.7Pu r6 = X.C48943Emh.A00(r1)
            if (r6 == 0) goto L_0x0056
            java.lang.String r5 = r8.A02
            r4 = 0
            r3 = 1
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "show_text_translations_error_rows"
            r2.putBoolean(r1, r4)
            java.lang.String r1 = "show_voice_translations_error_rows"
            r2.putBoolean(r1, r3)
            java.lang.String r1 = "translation_error_media_id"
            r2.putString(r1, r5)
            java.lang.String r1 = "has_closed_caption_translations"
            r2.putBoolean(r1, r4)
            X.E21 r3 = new X.E21
            r3.<init>()
            r3.setArguments(r2)
            X.0eM r1 = r8.A06
            X.7Pr r2 = X.DbX.A0f(r1)
            r1 = 2131972217(0x7f135079, float:1.9581435E38)
            X.DbZ.A0z(r7, r2, r1)
            r6.A0F(r3, r2)
        L_0x0056:
            r1 = -880052528(0xffffffffcb8b76d0, float:-1.827984E7)
            goto L_0x0832
        L_0x005b:
            r0 = 503048238(0x1dfbe82e, float:6.6679215E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r4 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r4
            java.lang.Object r3 = r3.A02
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r3 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) r3
            com.instagram.ar.features.effectspage.models.EffectsPageModel r1 = r4.A03
            if (r1 == 0) goto L_0x007b
            java.lang.String r1 = r1.A0D
            if (r1 == 0) goto L_0x007b
            com.instagram.common.session.UserSession r2 = r4.A07
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.C49894FBx.A00(r1, r3, r2)
        L_0x007b:
            r1 = -47311102(0xfffffffffd2e1702, float:-1.4462821E37)
            goto L_0x0832
        L_0x0080:
            r0 = 1805210217(0x6b995269, float:3.7070964E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r6)
            java.lang.Object r1 = r3.A01
            X.DbS.A1V(r1)
            r1 = -1602921691(0xffffffffa0755b25, float:-2.0782464E-19)
            goto L_0x0832
        L_0x0098:
            r0 = 1079511420(0x4058097c, float:3.3755789)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.E6Y r7 = (X.E6Y) r7
            com.instagram.common.session.UserSession r1 = r7.A00
            X.7Pu r6 = X.DbW.A0T(r1)
            com.instagram.common.session.UserSession r5 = r7.A00
            java.lang.Object r4 = r3.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.EUI r2 = new X.EUI
            r2.<init>(r3)
            java.lang.String r1 = "support_detail_ticket"
            X.E22 r2 = X.C49960FGs.A00(r5, r4, r2, r1)
            android.content.Context r1 = r7.requireContext()
            r6.A03(r1, r2)
            r1 = 900958734(0x35b38a0e, float:1.3376718E-6)
            goto L_0x0832
        L_0x00c6:
            r0 = -291988816(0xffffffffee989ab0, float:-2.3614364E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E6Y r6 = (X.E6Y) r6
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            com.instagram.common.session.UserSession r5 = r6.A00
            java.lang.Object r7 = r3.A02
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.String r8 = "support_inbox_detail_fragment"
            boolean r11 = X.DbW.A1X(r5)
            r10 = 0
            r9 = r8
            X.C49960FGs.A04(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 1850986761(0x6e53d109, float:1.6388511E28)
            goto L_0x0832
        L_0x00eb:
            r0 = -175097977(0xfffffffff5903787, float:-3.656333E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6Y r5 = (X.E6Y) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            com.instagram.common.session.UserSession r6 = r5.A00
            java.lang.Object r8 = r3.A02
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            r1 = 2
            X.0qQ.A0B(r6, r1)
            r7 = 0
            r9 = r7
            r10 = r7
            r11 = r7
            X.F8Z.A01(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1983546878(0xffffffff89c57a02, float:-4.754076E-33)
            goto L_0x0832
        L_0x0110:
            r0 = 1169891048(0x45bb1ee8, float:5987.8633)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EbH r1 = (X.C48236EbH) r1
            java.lang.String r4 = r1.A01
            if (r4 == 0) goto L_0x0131
            java.lang.Object r1 = r3.A01
            X.E6Y r1 = (X.E6Y) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            com.instagram.common.session.UserSession r2 = r1.A00
            r1 = 1
            X.0qQ.A0B(r2, r1)
            r1 = 0
            X.C49960FGs.A07(r3, r2, r4, r1)
        L_0x0131:
            r1 = -1144761102(0xffffffffbbc454f2, float:-0.0059915716)
            goto L_0x0832
        L_0x0136:
            r0 = -1231259025(0xffffffffb69c7a6f, float:-4.6634154E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G7T r2 = (X.G7T) r2
            java.lang.Object r1 = r3.A02
            java.lang.String r1 = X.DbS.A0q(r1)
            r2.DwX(r1)
            r1 = -68853950(0xfffffffffbe55f42, float:-2.381936E36)
            goto L_0x0832
        L_0x014f:
            r0 = 2097980723(0x7d0ca533, float:1.1684355E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G7T r2 = (X.G7T) r2
            java.lang.Object r1 = r3.A02
            java.lang.String r1 = X.DbS.A0q(r1)
            r2.DwX(r1)
            r1 = -381362392(0xffffffffe944df28, float:-1.4875205E25)
            goto L_0x0832
        L_0x0168:
            r0 = 1890438891(0x70adceeb, float:4.3032844E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A02
            X.E3A r2 = (X.E3A) r2
            java.lang.Object r1 = r3.A01
            android.content.Context r1 = (android.content.Context) r1
            X.E3A.A02(r1, r2)
            r1 = -1539547266(0xffffffffa43c5f7e, float:-4.0846887E-17)
            goto L_0x0832
        L_0x017f:
            r0 = 1814902226(0x6c2d35d2, float:8.375933E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A02
            X.E3A r2 = (X.E3A) r2
            java.lang.Object r1 = r3.A01
            android.content.Context r1 = (android.content.Context) r1
            X.E3A.A01(r1, r2)
            r1 = -1404164555(0xffffffffac4e2635, float:-2.929557E-12)
            goto L_0x0832
        L_0x0196:
            r0 = -1249578750(0xffffffffb584f102, float:-9.904909E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r6 = r1.getId()
            if (r6 == 0) goto L_0x01d7
            java.lang.Object r1 = r3.A02
            X.E6D r1 = (X.E6D) r1
            X.0eM r1 = r1.A04
            java.lang.Object r1 = r1.getValue()
            X.Eya r1 = (X.C49565Eya) r1
            com.instagram.common.session.UserSession r5 = r1.A01
            X.7Pr r3 = X.DbS.A0W(r5)
            androidx.fragment.app.Fragment r4 = r1.A00
            android.content.Context r2 = r4.requireContext()
            r1 = 2131976689(0x7f1361f1, float:1.9590506E38)
            X.DbZ.A0z(r2, r3, r1)
            r1 = 1
            r3.A11 = r1
            X.7Pu r3 = r3.A00()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.E0c r1 = X.C49190Eqv.A00(r5, r6)
            r3.A02(r2, r1)
        L_0x01d7:
            r1 = -410646089(0xffffffffe78609b7, float:-1.2659526E24)
            goto L_0x0832
        L_0x01dc:
            r0 = -1194716683(0xffffffffb8ca11f5, float:-9.635455E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A02
            X.Der r2 = (X.C46430Der) r2
            java.lang.Object r1 = r3.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.C46430Der.A0B(r1, r2)
            java.lang.String r3 = r1.getId()
            X.0wc r2 = r2.A03
            java.lang.String r1 = "remove_follower_dialog_confirmed"
            X.DbZ.A1S(r2, r1, r3)
            r1 = 2121215007(0x7e6f2c1f, float:7.9478645E37)
            goto L_0x0832
        L_0x01fe:
            r0 = 189039921(0xb448531, float:3.784843E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.Der r1 = (X.C46430Der) r1
            X.FnJ r6 = new X.FnJ
            r6.<init>(r1)
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            com.instagram.common.session.UserSession r5 = X.C46430Der.A03(r1)
            java.lang.Object r7 = r3.A01
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.String r9 = r1.getModuleName()
            java.lang.String r8 = "more_button_action_sheet"
            r10 = 0
            r11 = 0
            X.C49960FGs.A04(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1951630245(0xffffffff8bac7c5b, float:-6.64391E-32)
            goto L_0x0832
        L_0x022a:
            r0 = -1737196407(0xffffffff98747c89, float:-3.1599135E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A02
            X.Der r6 = (X.C46430Der) r6
            java.lang.Object r5 = r3.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r4 = r5.getId()
            com.instagram.common.session.UserSession r2 = X.C46430Der.A03(r6)
            r1 = 1
            X.0qQ.A0B(r2, r1)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r1 = "friendships/follower_not_spam/set/"
            r3.A0A(r1)
            java.lang.String r1 = "target_user_id"
            r3.A9m(r1, r4)
            java.lang.Class<X.6rp> r2 = X.C320136rp.class
            java.lang.Class<X.6rq> r1 = X.C320146rq.class
            X.1OC r2 = X.DbU.A0S(r3, r2, r1)
            r1 = 47
            X.EDV.A00(r2, r5, r6, r1)
            r6.schedule(r2)
            r1 = 819767666(0x30dca972, float:1.6055266E-9)
            goto L_0x0832
        L_0x0268:
            java.lang.Object r1 = r3.A01
            X.EGE r1 = (X.EGE) r1
            java.lang.Object r0 = r3.A02
            X.FYL r0 = (X.FYL) r0
            X.F0x r3 = r1.A02
            X.Dut r0 = r0.A01
            com.instagram.common.session.UserSession r2 = r3.A04
            com.instagram.user.model.User r17 = X.F8C.A00(r2, r0)
            X.0iw r0 = r3.A03
            java.lang.String r9 = r0.getModuleName()
            java.lang.String r10 = r3.A06
            int r16 = r17.BIW()
            com.instagram.user.model.FollowStatus r1 = r17.B6o()
            r5 = 0
            X.EZZ r0 = r3.A02
            java.lang.String r11 = r1.name()
            java.lang.String r13 = "BLOCKED_ACCOUNTS"
            java.lang.String r14 = r0.name()
            java.lang.String r15 = X.AnonymousClass7TF.A0b()
            X.FFp r4 = new X.FFp
            r6 = r5
            r7 = r5
            r8 = r5
            r12 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            android.content.Context r10 = r3.A00
            androidx.fragment.app.Fragment r11 = r3.A01
            X.G8B r0 = r3.A05
            r13 = r2
            r14 = r5
            r15 = r5
            r16 = r5
            r18 = r4
            r19 = r5
            r20 = r0
            X.C48887Eln.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x02b9:
            java.lang.Object r1 = r3.A01
            X.EGE r1 = (X.EGE) r1
            java.lang.Object r0 = r3.A02
            X.FYL r0 = (X.FYL) r0
            X.F0x r7 = r1.A02
            X.Dut r6 = r0.A01
            int r1 = r6.A00
            androidx.fragment.app.Fragment r0 = r7.A01
            if (r1 != 0) goto L_0x02eb
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = r7.A04
            X.6Yo r4 = X.DbS.A0M(r0, r5)
            X.1a1 r3 = X.C46447Df9.A02()
            java.lang.String r2 = r6.A04
            java.lang.String r1 = r7.A08
            X.0iw r0 = r7.A03
            java.lang.String r0 = r0.getModuleName()
            X.Dfc r0 = X.C46548Dgp.A01(r5, r2, r1, r0)
            X.C46474Dfc.A02(r4, r5, r3, r0)
            return
        L_0x02eb:
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r7.A04
            java.lang.String r1 = r7.A07
            X.0iw r0 = r7.A03
            X.1pE r1 = X.1pE.A01(r3, r0, r2, r1)
            com.instagram.common.typedurl.ImageUrl r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            com.instagram.user.model.User r0 = X.F8C.A00(r2, r6)
            java.util.List r0 = X.DbW.A0n(r0)
            r1.A0B(r0)
            r1.A06()
            return
        L_0x030a:
            java.lang.Object r0 = r3.A01
            X.F14 r0 = (X.F14) r0
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.71G r0 = r0.A0B
            r0.DRX(r1)
            return
        L_0x0318:
            r0 = 644027986(0x26631652, float:7.8786695E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.Der r6 = (X.C46430Der) r6
            java.lang.Object r1 = r3.A02
            X.EyX r1 = (X.EyX) r1
            com.instagram.user.model.User r9 = r1.A00
            r10 = 0
            android.content.Context r7 = r6.getContext()
            if (r7 == 0) goto L_0x037e
            android.content.res.Resources r8 = r7.getResources()
            r5 = 2131820915(0x7f110173, float:1.9274558E38)
            int r4 = r6.A00
            r2 = 1
            java.util.Locale r1 = X.AnonymousClass1Q2.A02()
            java.text.NumberFormat r3 = java.text.NumberFormat.getNumberInstance(r1)
            r3.setGroupingUsed(r2)
            r3.setMaximumFractionDigits(r10)
            long r1 = (long) r4
            java.lang.String r1 = r3.format(r1)
            X.0qQ.A07(r1)
            java.lang.String r5 = X.DbY.A0e(r8, r1, r5, r4)
            r1 = 2131972022(0x7f134fb6, float:1.958104E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r7, r1)
            java.lang.String r3 = r9.getId()
            X.0wc r2 = r6.A03
            java.lang.String r1 = "remove_follower_dialog_impression"
            X.DbZ.A1S(r2, r1, r3)
            X.8ab r4 = X.DbX.A0g(r7, r4, r5)
            r3 = 2131972017(0x7f134fb1, float:1.958103E38)
            r1 = 48
            X.FJg r2 = X.C50021FJg.A00(r6, r1)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r4.A0S(r2, r1, r3, r3)
            r4.A03()
            X.DbT.A1V(r4)
        L_0x037e:
            r1 = -1739932190(0xffffffff984abde2, float:-2.6203754E-24)
            goto L_0x0832
        L_0x0383:
            r0 = 330721059(0x13b66723, float:4.604496E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G82 r2 = (X.G82) r2
            java.lang.Object r1 = r3.A02
            X.F06 r1 = (X.F06) r1
            com.instagram.user.model.User r1 = r1.A01
            r2.CtI(r1)
            r1 = 1828330473(0x6cfa1be9, float:2.418906E27)
            goto L_0x0832
        L_0x039c:
            r0 = 167935689(0xa027ec9, float:6.283118E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G6Z r2 = (X.G6Z) r2
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.DdL(r1)
            r1 = -334749428(0xffffffffec0c210c, float:-6.776227E26)
            goto L_0x0832
        L_0x03b3:
            r0 = -1704380469(0xffffffff9a6937cb, float:-4.822834E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G6Z r2 = (X.G6Z) r2
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.DdL(r1)
            r1 = 2055791053(0x7a88e1cd, float:3.5536608E35)
            goto L_0x0832
        L_0x03ca:
            r0 = 1271273691(0x4bc618db, float:2.5964982E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G6Z r2 = (X.G6Z) r2
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.DdL(r1)
            r1 = 950511387(0x38a7a71b, float:7.994306E-5)
            goto L_0x0832
        L_0x03e1:
            r0 = 1306632971(0x4de1a30b, float:4.73194848E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G9g r2 = (X.C51960G9g) r2
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.onUserRowClick(r1)
            r1 = -579100781(0xffffffffdd7b9f93, float:-1.13321077E18)
            goto L_0x0832
        L_0x03f8:
            r0 = -315986664(0xffffffffed2a6d18, float:-3.296521E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G9g r2 = (X.C51960G9g) r2
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.onUserRowClick(r1)
            r1 = -1266618262(0xffffffffb480f06a, float:-2.4016782E-7)
            goto L_0x0832
        L_0x040f:
            r0 = 80748598(0x4d02036, float:4.8930146E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A02
            X.Dex r6 = (X.C46435Dex) r6
            java.lang.Object r1 = r3.A01
            com.instagram.api.schemas.GraphGuardianContent r1 = (com.instagram.api.schemas.GraphGuardianContent) r1
            java.lang.String r4 = r1.Aip()
            if (r4 != 0) goto L_0x044a
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.0iw r1 = r6.A0S
            java.lang.String r2 = r1.getModuleName()
            java.lang.String r1 = "analytics_module"
            r5.putString(r1, r2)
            java.lang.String r2 = "location"
            java.lang.String r1 = "IG_PROFILE"
            r5.putString(r2, r1)
            com.instagram.common.session.UserSession r4 = r6.A0T
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.app.Activity r2 = r6.A0N
            java.lang.String r1 = "account_status"
            X.DbU.A0w(r2, r5, r4, r3, r1)
        L_0x0445:
            r1 = 1348617469(0x506244fd, float:1.51846881E10)
            goto L_0x0832
        L_0x044a:
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            android.content.Context r2 = r6.A0O
            com.instagram.common.session.UserSession r1 = r6.A0T
            java.lang.String r20 = X.SQU.A01(r2, r4)
            r5 = 0
            r7 = 1
            r8 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r4 = new com.instagram.simplewebview.SimpleWebViewConfig
            r6 = r5
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r7
            r13 = r8
            r14 = r8
            r15 = r7
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r5
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20)
            r3.A02(r2, r1, r4)
            goto L_0x0445
        L_0x0470:
            r0 = -2047741011(0xffffffff85f1f3ad, float:-2.2753043E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.EEF r4 = (X.EEF) r4
            java.lang.Object r1 = r3.A02
            X.F2L r1 = (X.F2L) r1
            boolean r14 = r1.A00()
            java.lang.Integer r2 = r1.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            boolean r15 = X.AnonymousClass7TF.A1W(r2, r1)
            X.EX9 r12 = X.EX9.INLINE_UPSELL
            com.instagram.common.session.UserSession r8 = r4.A04
            X.0iw r7 = r4.A03
            androidx.fragment.app.Fragment r6 = r4.A02
            if (r6 != 0) goto L_0x0497
            androidx.fragment.app.Fragment r6 = r4.A01
        L_0x0497:
            r9 = 0
            X.FGL r5 = new X.FGL
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            r13 = 1
            r10 = r5
            r11 = r9
            r10.A05(r11, r12, r13, r14, r15)
            r4.A01()
            r1 = -900584602(0xffffffffca522b66, float:-3443417.5)
            goto L_0x0832
        L_0x04ac:
            r0 = 1761052131(0x68f785e3, float:9.3511544E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EEF r1 = (X.EEF) r1
            java.lang.Object r6 = r3.A01
            android.app.Activity r6 = (android.app.Activity) r6
            com.instagram.common.session.UserSession r5 = r1.A04
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.EWD r3 = X.EWD.DISCOVER_PEOPLE
            r2 = 0
            r1 = 0
            android.os.Bundle r2 = X.C343547qO.A00(r2, r3, r1)
            java.lang.String r1 = "nametag"
            X.Dbb.A0i(r6, r2, r5, r4, r1)
            r1 = 2005517353(0x7789c429, float:5.588463E33)
            goto L_0x0832
        L_0x04d1:
            r0 = 521782950(0x1f19c6a6, float:3.2563328E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.EEF r5 = (X.EEF) r5
            X.EX9 r9 = X.EX9.REVISED_INLINE_UPSELL
            java.lang.Object r1 = r3.A02
            int r1 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r12 = 0
            com.instagram.common.session.UserSession r1 = r5.A04
            X.0iw r15 = r5.A03
            androidx.fragment.app.Fragment r14 = r5.A02
            if (r14 != 0) goto L_0x04f3
            androidx.fragment.app.Fragment r14 = r5.A01
        L_0x04f3:
            r7 = 0
            X.FGL r6 = new X.FGL
            r13 = r6
            r16 = r1
            r17 = r7
            r18 = r7
            r13.<init>(r14, r15, r16, r17, r18)
            X.6cm r3 = new X.6cm
            r3.<init>(r15, r1)
            java.lang.String r2 = r5.A07
            java.lang.String r10 = r9.toString()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r3.A02(r1, r4, r2, r10)
            r8 = r7
            r11 = r7
            r13 = r12
            r6.A04(r7, r8, r9, r10, r11, r12, r13)
            r5.A01()
            r1 = 1685096341(0x64708795, float:1.7747953E22)
            goto L_0x0832
        L_0x0520:
            r0 = -544455692(0xffffffffdf8c43f4, float:-2.021438E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6a r5 = (X.E6a) r5
            java.lang.Object r4 = r3.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r3 = "featured_user_message_button"
            r1 = 1
            X.0qQ.A0B(r4, r1)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r1 = r5.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.1pE r2 = X.1pE.A01(r2, r5, r1, r3)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r1.<init>((com.instagram.user.model.User) r4)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
            r2.A0B(r1)
            r2.A06()
            r1 = 805323960(0x300044b8, float:4.6663784E-10)
            goto L_0x0832
        L_0x0557:
            r0 = 1010886304(0x3c40e6a0, float:0.011773735)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E6a r6 = (X.E6a) r6
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.0eM r5 = r6.A07
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r3 = r1.getId()
            java.lang.String r2 = r6.A05
            java.lang.String r1 = "featured_user_view_profile_button"
            X.Dfc r4 = X.C46548Dgp.A01(r4, r3, r1, r2)
            X.6Yo r3 = X.DbZ.A0P(r6, r5)
            X.1a1 r2 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.C46474Dfc.A03(r3, r1, r2, r4)
            r1 = 750505766(0x2cbbcf26, float:5.3378578E-12)
            goto L_0x0832
        L_0x058c:
            r0 = 707533296(0x2a2c19f0, float:1.5285668E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.Der r3 = (X.C46430Der) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r1 = X.C46430Der.A03(r3)
            X.6Yo r2 = X.DbU.A0Q(r2, r1)
            com.instagram.common.session.UserSession r4 = X.C46430Der.A03(r3)
            java.lang.String r5 = r3.getModuleName()
            r6 = 1
            r7 = 0
            X.0qQ.A0B(r4, r7)
            r8 = r7
            r9 = r7
            r10 = r7
            androidx.fragment.app.Fragment r1 = X.C46354Dcy.A00(r4, r5, r6, r7, r8, r9, r10)
            r2.A0D(r1)
            r2.A04()
            X.0wc r2 = r3.A03
            java.lang.String r1 = "follow_request_entrypoint_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = r3.getModuleName()
            X.DbS.A1O(r2, r1)
            r2.Cgf()
            r1 = -2030853569(0xffffffff86f3a23f, float:-9.164484E-35)
            goto L_0x0832
        L_0x05d4:
            java.lang.Object r1 = r3.A01
            X.G6T r1 = (X.G6T) r1
            java.lang.Object r0 = r3.A02
            X.DfA r0 = (X.C46448DfA) r0
            r1.CtJ(r0)
            return
        L_0x05e0:
            r0 = 2001903339(0x77529eeb, float:4.2718968E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.EyP r2 = (X.EyP) r2
            java.lang.Integer r1 = r2.A01
            r1.getClass()
            android.view.View$OnClickListener r1 = r2.A00
            r1.onClick(r6)
            r1 = 2109241243(0x7db8779b, float:3.0649872E37)
            goto L_0x0832
        L_0x05fa:
            r0 = -243604851(0xfffffffff17ae28d, float:-1.2423222E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G7n r2 = (X.C51919G7n) r2
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r2.DdP(r1)
            r1 = -1541269711(0xffffffffa4221731, float:-3.5147794E-17)
            goto L_0x0832
        L_0x0611:
            r0 = 923115034(0x37059e1a, float:7.964229E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.G7m r2 = (X.C51918G7m) r2
            java.lang.Object r1 = r3.A02
            com.instagram.model.fbusertag.FBUserTag r1 = (com.instagram.model.fbusertag.FBUserTag) r1
            r2.DDz(r1)
            r1 = 1480954084(0x584590e4, float:8.6890436E14)
            goto L_0x0832
        L_0x0628:
            r0 = -2065270482(0xffffffff84e6792e, float:-5.4184026E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ex1 r1 = (X.C49522Ex1) r1
            java.lang.String r1 = r1.A01
            X.SFz r4 = new X.SFz
            r4.<init>((java.lang.String) r1)
            android.content.res.Resources r2 = r6.getResources()
            r1 = 2131970977(0x7f134ba1, float:1.957892E38)
            java.lang.String r1 = r2.getString(r1)
            r4.A02 = r1
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r5.<init>(r4)
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r6)
            java.lang.Object r1 = r3.A02
            X.E9g r1 = (X.C47594E9g) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            r4.A02(r2, r1, r5)
            r1 = -1924358700(0xffffffff8d4c9dd4, float:-6.305233E-31)
            goto L_0x0832
        L_0x0660:
            r0 = 1981298151(0x761835e7, float:7.717992E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment r1 = (com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment) r1
            java.lang.Object r4 = r3.A02
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x0683
            X.0eM r1 = r1.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.F2h r1 = new X.F2h
            r1.<init>(r3, r2, r4)
            r1.A00()
        L_0x0683:
            r1 = -199084094(0xfffffffff42237c2, float:-5.1408874E31)
            goto L_0x0832
        L_0x0688:
            r0 = 1661793611(0x630cf54b, float:2.6002194E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.EAR r5 = (X.EAR) r5
            com.instagram.common.session.UserSession r2 = r5.A01
            java.lang.Object r4 = r3.A01
            X.Drj r4 = (X.C47168Drj) r4
            X.EZR r8 = X.EZR.FEED
            X.0iw r1 = r5.A00
            java.lang.String r7 = "IG_PRODUCER_PLAYS_AND_LIKES_ROW"
            r3 = 0
            X.AnonymousClass7TF.A1D(r2, r3, r1)
            X.0wc r2 = X.AnonymousClass0kN.A01(r1, r2)
            r1 = 579(0x243, float:8.11E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r6.isSampled()
            if (r1 == 0) goto L_0x06e1
            java.lang.String r1 = "feedback_surface"
            r6.AAJ(r1, r7)
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x0705
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            if (r1 == 0) goto L_0x0705
            long r1 = r1.longValue()
        L_0x06ca:
            java.lang.String r2 = X.DbZ.A0k(r8, r6, r1)
            java.lang.String r1 = "nav_chain"
            r6.AAJ(r1, r2)
            int r1 = r4.A00
            java.lang.Long r2 = X.DbS.A0j(r1)
            java.lang.String r1 = "th_reaction_count"
            r6.A9F(r1, r2)
            r6.Cgf()
        L_0x06e1:
            X.EvP r1 = r5.A02
            if (r1 == 0) goto L_0x0700
            java.lang.String r5 = r4.A02
            java.lang.String r4 = "likes_list_unified_feedback"
            X.0qQ.A0B(r5, r3)
            X.E6i r2 = r1.A00
            X.1Xj r1 = r2.A05
            if (r1 == 0) goto L_0x0700
            X.0eM r1 = r2.A0T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            r1 = 0
            X.C49965FGy.A04(r2, r3, r5, r4, r1)
        L_0x0700:
            r1 = -142030824(0xfffffffff788c818, float:-5.5485215E33)
            goto L_0x0832
        L_0x0705:
            r1 = 0
            goto L_0x06ca
        L_0x0708:
            r0 = 881915044(0x3490f4a4, float:2.700009E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FBW r5 = X.FBW.A00
            java.lang.Object r4 = r3.A01
            X.F3m r4 = (X.C49723F3m) r4
            java.lang.Object r3 = r3.A02
            X.EAQ r3 = (X.EAQ) r3
            com.instagram.common.session.UserSession r2 = r3.A01
            X.0iw r1 = r3.A00
            r5.A01(r1, r2, r4)
            X.F1t r1 = r3.A02
            if (r1 == 0) goto L_0x072a
            X.0qQ.A0A(r6)
            r1.A00(r4)
        L_0x072a:
            r1 = -1281454267(0xffffffffb39e8f45, float:-7.383509E-8)
            goto L_0x0832
        L_0x072f:
            r0 = 1633821539(0x61622363, float:2.6071963E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.EZv r5 = (X.C48153EZv) r5
            java.lang.Object r4 = r3.A02
            X.ESM r4 = (X.ESM) r4
            X.0eM r2 = r4.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = X.DbX.A0l(r1, r2)
            boolean r1 = r1.A2K()
            if (r1 == 0) goto L_0x075e
            X.EXN r2 = X.EXN.A0Y
        L_0x0752:
            X.G7M r1 = r4.A02
            if (r1 == 0) goto L_0x080e
            r5.A04(r4, r3, r1, r2)
            r1 = -622864118(0xffffffffdadfd90a, float:-3.15037784E16)
            goto L_0x0832
        L_0x075e:
            X.EXN r2 = X.EXN.OPTION_LINKED_ACCOUNTS
            goto L_0x0752
        L_0x0761:
            r0 = 1929096670(0x72fbadde, float:9.970039E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.ESM r5 = (X.ESM) r5
            X.0eE r9 = X.AnonymousClass0t1.A01
            X.0eM r8 = r5.A06
            com.instagram.user.model.User r1 = X.DbX.A0l(r9, r8)
            boolean r1 = r1.A2K()
            if (r1 == 0) goto L_0x0805
            X.EXN r4 = X.EXN.A0Y
        L_0x077c:
            java.lang.Object r7 = r3.A01
            X.EZv r7 = (X.C48153EZv) r7
            X.EZv r12 = X.C48153EZv.A05
            r11 = 0
            if (r7 != r12) goto L_0x0793
            X.0lg r10 = X.DbT.A0X(r8)
            java.lang.String r3 = r4.A01()
            r2 = 1
            java.lang.String r1 = "facebook_cross_posting_settings_clicked"
            X.C9831Rht.A00(r10, r1, r3, r11, r2)
        L_0x0793:
            r2 = 0
            if (r7 != r12) goto L_0x07a8
            com.instagram.common.session.UserSession r1 = X.DbW.A0S(r8, r2)
            boolean r1 = r7.A07(r1)
            if (r1 == 0) goto L_0x07a8
            X.ESM.A07(r5, r2)
        L_0x07a3:
            r1 = -240321515(0xfffffffff1acfc15, float:-1.7131574E30)
            goto L_0x0832
        L_0x07a8:
            com.instagram.common.session.UserSession r1 = X.DbW.A0S(r8, r2)
            boolean r1 = r7.A07(r1)
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x07f9
            X.0qQ.A0A(r6)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x07a3
            X.8ab r4 = X.DbS.A0Y(r1)
            r1 = 2131975948(0x7f135f0c, float:1.9589003E38)
            java.lang.String r3 = X.DbU.A0m(r5, r1)
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x07f6
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L_0x0809
            com.instagram.user.model.User r1 = X.DbX.A0l(r9, r8)
            java.lang.String r1 = r7.A01(r2, r1)
        L_0x07dc:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = X.0mp.A06(r3, r1)
            r4.A05 = r1
            r4.A05()
            r2 = 2131975947(0x7f135f0b, float:1.9589E38)
            r1 = 53
            X.FJk r1 = X.C50025FJk.A00(r5, r6, r1)
            X.Dba.A0t(r1, r4, r2)
            goto L_0x07a3
        L_0x07f6:
            java.lang.String r1 = ""
            goto L_0x07dc
        L_0x07f9:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r8)
            X.G7M r1 = r5.A02
            if (r1 == 0) goto L_0x080e
            r7.A04(r5, r2, r1, r4)
            goto L_0x07a3
        L_0x0805:
            X.EXN r4 = X.EXN.OPTION_LINKED_ACCOUNTS
            goto L_0x077c
        L_0x0809:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x080e:
            java.lang.String r0 = "authorizeListener"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0818:
            r0 = -1367028110(0xffffffffae84ce72, float:-6.039337E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.Dlo r1 = (X.C46812Dlo) r1
            X.G6N r2 = r1.A00
            java.lang.Object r1 = r3.A01
            X.JwK r1 = (X.C61082JwK) r1
            X.0qQ.A0A(r1)
            r2.DMw(r1)
            r1 = 687916272(0x2900c4f0, float:2.8592525E-14)
        L_0x0832:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP7.onClick(android.view.View):void");
    }

    public FP7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
