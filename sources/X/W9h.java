package X;

import android.view.View;

public final class W9h implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public W9h(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x03d2, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03ef, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03f6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a7, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0345;
                case 1: goto L_0x03d6;
                case 2: goto L_0x0220;
                case 3: goto L_0x0313;
                case 4: goto L_0x02fc;
                case 5: goto L_0x02c2;
                case 6: goto L_0x0298;
                case 7: goto L_0x01d8;
                case 8: goto L_0x00b2;
                case 9: goto L_0x027d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -292625739(0xffffffffee8ee2b5, float:-2.2110472E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.UZ4 r3 = (X.UZ4) r3
            X.0eM r10 = r3.A06
            r10.getValue()
            X.0eM r1 = r3.A05
            java.lang.Object r9 = r1.getValue()
            X.Hs7 r9 = (X.C56058Hs7) r9
            java.lang.String r8 = r3.A00
            X.0eM r7 = r3.A02
            boolean r1 = X.AnonymousClass7TF.A1Z(r7)
            boolean r6 = X.AnonymousClass7TG.A1Z(r9, r8)
            if (r1 == 0) goto L_0x00ae
            X.HMr r1 = X.C54660HMr.COMMENT_SUGGESTED_HIDDEN_WORDS_V2
        L_0x002f:
            java.lang.String r5 = r1.A00
            java.lang.String r4 = "upsell_bottom_sheet"
            r1 = 736(0x2e0, float:1.031E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r9.A02(r4, r8, r5, r1)
            r10.getValue()
            X.0eM r4 = r3.A04
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r1 = r2.A02
            java.util.List r13 = X.AnonymousClass7TE.A1I(r1)
            boolean r1 = X.AnonymousClass7TF.A1Z(r7)
            r2 = 0
            X.0qQ.A0B(r8, r2)
            if (r1 == 0) goto L_0x00ab
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
        L_0x0057:
            X.I0a r7 = X.C56529I0a.A00
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r11 = 0
            r12 = r11
            r7.A00(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass1pc.A00()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            X.0eM r1 = r3.A03
            int r1 = X.DbX.A07(r1)
            X.0qQ.A0B(r7, r2)
            X.6ap r4 = new X.6ap
            r4.<init>()
            r4.A06()
            r4.A02 = r1
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131820977(0x7f1101b1, float:1.9274684E38)
            java.lang.String r1 = X.DbY.A0d(r2, r6, r1)
            r4.A0D = r1
            r1 = 2131974691(0x7f135a23, float:1.9586453E38)
            X.DbW.A0q(r5, r4, r1)
            r2 = 12
            X.FdJ r1 = new X.FdJ
            r1.<init>((android.app.Activity) r5, (com.instagram.common.session.UserSession) r7, (int) r2)
            r4.A0A(r1)
            r1 = 1
            r4.A0L = r1
            X.DbY.A1N(r4)
            X.UZ4.A00(r3)
            r1 = 1533357232(0x5b652cb0, float:6.4506904E16)
        L_0x00a7:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x00ab:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            goto L_0x0057
        L_0x00ae:
            X.HMr r1 = X.C54660HMr.COMMENT_SUGGESTED_HIDDEN_WORDS
            goto L_0x002f
        L_0x00b2:
            r0 = -529221523(0xffffffffe074b86d, float:-7.0535857E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.UbQ r4 = (X.C15372UbQ) r4
            X.0eM r9 = r4.A0E
            r9.getValue()
            X.0eM r1 = r4.A0D
            java.lang.Object r7 = r1.getValue()
            X.Hs7 r7 = (X.C56058Hs7) r7
            java.lang.String r6 = r4.A07
            boolean r1 = r4.A03
            boolean r8 = X.AnonymousClass7TG.A1Z(r7, r6)
            if (r1 == 0) goto L_0x01d4
            java.lang.String r5 = "block_comments_from_save"
        L_0x00d6:
            java.lang.String r3 = "comment_block_comments_from"
            java.lang.String r1 = "upsell_bottom_sheet"
            r7.A02(r1, r6, r3, r5)
            r9.getValue()
            X.0eM r5 = r4.A0A
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r5)
            X.0eM r1 = r4.A0C
            java.lang.Object r6 = r1.getValue()
            r3 = 0
            X.0qQ.A0B(r10, r3)
            r7 = 1
            X.0qQ.A0B(r6, r8)
            X.HMF r1 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_HRT_BLOCK_COMMENTS_FROM
            if (r6 != r1) goto L_0x01d0
            java.lang.Integer r13 = X.AnonymousClass05K.A0j
        L_0x00fa:
            X.I0a r11 = X.C56529I0a.A00
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            r15 = 0
            r12 = r10
            r16 = r15
            r17 = r15
            r11.A00(r12, r13, r14, r15, r16, r17)
            boolean r1 = r4.A03
            if (r1 == 0) goto L_0x0198
            java.lang.Object r9 = r9.getValue()
            X.U8Q r9 = (X.U8Q) r9
            r4.requireContext()
            X.0lg r8 = X.DbT.A0X(r5)
            java.lang.String r2 = r2.A02
            X.0eM r1 = r4.A0B
            r1.getValue()
            X.0qQ.A0B(r8, r7)
            r1 = 2
            X.VQ2 r5 = r9.A00
            X.Wvr r7 = new X.Wvr
            r7.<init>(r9, r1)
            r1 = 3
            X.Wvr r6 = new X.Wvr
            r6.<init>(r9, r1)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String[] r1 = new java.lang.String[]{r2}
            java.util.ArrayList r1 = X.0sr.A1L(r1)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r1)
            java.lang.String r1 = "block"
            r9.put(r1, r2)
            X.4D6 r5 = r5.A00
            X.1NY r8 = X.AnonymousClass7TG.A0a(r8)
            java.lang.String r1 = "accounts/set_blocked_commenters/"
            r8.A0A(r1)
            java.lang.String r2 = r9.toString()
            java.lang.String r1 = "commenter_block_status"
            r8.A9m(r1, r2)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r8.A0O(r15, r2, r1, r3)
            java.lang.String r2 = "container_module"
            java.lang.String r1 = "block_commenters_upsell"
            X.1OC r2 = X.DbT.A0T(r8, r2, r1)
            r1 = 27
            X.C15619Ufl.A00(r2, r6, r7, r1)
            r5.schedule(r2)
        L_0x0172:
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            X.37D r2 = r2.A01(r1)
            X.0eM r1 = r4.A09
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x0192
            X.7Pu r1 = X.C48943Emh.A00(r2)
            if (r1 == 0) goto L_0x018d
            r1.A0T()
        L_0x018d:
            r1 = -1952710617(0xffffffff8b9c0027, float:-6.0089243E-32)
            goto L_0x00a7
        L_0x0192:
            if (r2 == 0) goto L_0x018d
            r2.A0B()
            goto L_0x018d
        L_0x0198:
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x0172
            java.lang.Object r6 = r9.getValue()
            android.content.Context r9 = r4.requireContext()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r5 = r2.A02
            X.0eM r1 = r4.A0B
            java.lang.Object r1 = r1.getValue()
            X.AnonymousClass7TF.A1C(r10, r8, r1)
            X.Wvr r2 = new X.Wvr
            r2.<init>(r6, r7)
            com.instagram.user.model.User r11 = X.DbV.A0j(r10, r5)
            if (r11 == 0) goto L_0x0172
            r1 = 7
            X.Fnh r12 = new X.Fnh
            r12.<init>(r2, r1)
            java.lang.String r13 = "Upsell"
            java.lang.String r14 = "comment_deletion_block_upsell"
            r16 = 2
            r17 = r3
            X.C49193Eqy.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0172
        L_0x01d0:
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
            goto L_0x00fa
        L_0x01d4:
            java.lang.String r5 = "block_account_save"
            goto L_0x00d6
        L_0x01d8:
            r0 = -908852843(0xffffffffc9d40195, float:-1736754.6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.Umf r5 = (X.C15998Umf) r5
            X.UnS r1 = X.C13990Tnq.A0R(r5)
            X.VsA r7 = r1.A0L
            java.lang.String r6 = "lead_gen_gated_content_confirmation_bottom_sheet"
            java.lang.String r1 = r2.A02
            X.XB6 r4 = r7.A00
            java.lang.String r3 = r7.A01
            android.os.Bundle r2 = X.C18461VsA.A00(r7, r1)
            java.lang.String r1 = "bottom_sheet_secondary_cta_click"
            X.XB6.A00(r2, r4, r3, r6, r1)
            X.UnS r1 = X.C13990Tnq.A0R(r5)
            boolean r3 = r1.A0g
            com.instagram.common.session.UserSession r2 = r1.A0H
            r1 = 0
            boolean r1 = X.C18215Vnf.A01(r2, r3, r1)
            if (r1 == 0) goto L_0x0214
            X.UnS r2 = X.C13990Tnq.A0R(r5)
            java.lang.String r1 = X.C15998Umf.A02(r5)
            r2.A05(r1)
        L_0x0214:
            X.DbZ.A17(r5)
            r1 = 1
            r5.A0A(r1)
            r1 = 855662807(0x330060d7, float:2.9890398E-8)
            goto L_0x00a7
        L_0x0220:
            r0 = -1282553800(0xffffffffb38dc838, float:-6.602244E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.ViU r5 = (X.C17939ViU) r5
            X.WGU r4 = r5.A03
            X.UzE r3 = X.C16678UzE.EDIT_AUDIENCE
            java.lang.String r1 = "edit_audience_link"
            r4.A0F(r3, r1)
            com.instagram.common.session.UserSession r9 = r5.A07
            X.0Tu r1 = X.0Tu.A05
            r3 = 36320975054250994(0x8109bc000123f2, double:3.032869104911248E-306)
            boolean r1 = X.182.A06(r1, r9, r3)
            if (r1 == 0) goto L_0x025c
            androidx.fragment.app.FragmentActivity r6 = r5.A02
            com.instagram.business.promote.model.PromoteData r1 = r5.A05
            java.lang.String r10 = r1.A1S
            java.lang.String r11 = r2.A02
            com.instagram.api.schemas.XIGIGBoostDestination r7 = r1.A0i
            boolean r12 = r1.A2V
            X.WNt r8 = new X.WNt
            r8.<init>(r5)
            X.C305936Kd.A02(r6, r7, r8, r9, r10, r11, r12)
        L_0x0257:
            r1 = 1089636844(0x40f289ec, float:7.579336)
            goto L_0x00a7
        L_0x025c:
            X.C13990Tnq.A0h()
            X.UZi r4 = new X.UZi
            r4.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r2 = r2.A02
            java.lang.String r1 = "audience_id"
            r3.putString(r1, r2)
            r4.setArguments(r3)
            androidx.fragment.app.FragmentActivity r2 = r5.A02
            com.instagram.business.promote.model.PromoteData r1 = r5.A05
            com.instagram.common.session.UserSession r1 = r1.A0y
            X.DbY.A14(r4, r2, r1)
            goto L_0x0257
        L_0x027d:
            r0 = 1428160830(0x5520013e, float:1.09954497E13)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1 = 0
            android.graphics.RectF r0 = X.0nA.A01
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r1, r1, r1)
            java.lang.String r0 = r2.A02
            r3.setText(r0)
            r0 = 267995053(0xff947ad, float:2.4580904E-29)
            goto L_0x03d2
        L_0x0298:
            r0 = 848386790(0x32915ae6, float:1.6921557E-8)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A01
            X.UYh r6 = (X.C15267UYh) r6
            X.UnS r0 = X.C13990Tnq.A0R(r6)
            X.VsA r1 = r0.A0L
            java.lang.String r4 = "lead_gen_gated_content_confirmation_bottom_sheet"
            java.lang.String r0 = r2.A02
            X.XB6 r3 = r1.A00
            java.lang.String r2 = r1.A01
            android.os.Bundle r1 = X.C18461VsA.A00(r1, r0)
            java.lang.String r0 = "bottom_sheet_primary_cta_click"
            X.XB6.A00(r1, r3, r2, r4, r0)
            X.DbZ.A17(r6)
            r0 = 8128238(0x7c06ee, float:1.1390087E-38)
            goto L_0x03d2
        L_0x02c2:
            r0 = -1344047597(0xffffffffafe37613, float:-4.1374956E-10)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r0 = 0
            r1 = r19
            r1.setOnClickListener(r0)
            java.lang.Object r7 = r2.A01
            X.Ume r7 = (X.C15997Ume) r7
            X.U8P r0 = r7.A07()
            X.UnQ r0 = (X.C16037UnQ) r0
            X.Vgk r0 = r0.A06
            X.XB6 r6 = r0.A00
            java.lang.String r4 = r0.A01
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "form_id"
            android.os.Bundle r3 = X.DbY.A0B(r0, r1)
            java.lang.String r1 = "lead_gen_full_page_context_card"
            java.lang.String r0 = "full_page_context_card_expand_description"
            X.XB6.A00(r3, r6, r4, r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = r7.A01
            if (r1 == 0) goto L_0x02f7
            java.lang.String r0 = r2.A02
            r1.setText(r0)
        L_0x02f7:
            r0 = -1977809456(0xffffffff8a1d05d0, float:-7.560368E-33)
            goto L_0x03d2
        L_0x02fc:
            r0 = 1065139745(0x3f7cbe21, float:0.98727614)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.9Xx r0 = (X.AnonymousClass9Xx) r0
            X.WDA r1 = r0.A02
            java.lang.String r0 = r2.A02
            X.WDA.A02(r1, r0)
            r0 = -2058857761(0xffffffff854852df, float:-9.419176E-36)
            goto L_0x03d2
        L_0x0313:
            r0 = -277658075(0xffffffffef734625, float:-7.5289657E28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r2.A01
            X.WUZ r7 = (X.WUZ) r7
            java.lang.String r1 = r2.A02
            r6 = 0
            X.5Hn r0 = new X.5Hn
            r0.<init>(r1, r6)
            X.WaI r4 = new X.WaI
            r4.<init>(r0)
            r7.A01 = r4
            X.Vbm r0 = r7.A00
            if (r0 == 0) goto L_0x0340
            com.instagram.common.ui.base.IgSimpleImageView r3 = r0.A02
            if (r3 == 0) goto L_0x0340
            android.content.Context r2 = r7.A03
            r1 = 1
            X.UpZ r0 = new X.UpZ
            r0.<init>(r2, r4, r1, r6)
            r3.setImageDrawable(r0)
        L_0x0340:
            r0 = 1349965936(0x5076d870, float:1.65655183E10)
            goto L_0x03d2
        L_0x0345:
            r0 = -1489960820(0xffffffffa731008c, float:-2.456398E-15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A01
            X.UbU r6 = (X.C15376UbU) r6
            X.C15376UbU.A02(r6)
            X.0eM r0 = r6.A05
            java.lang.Object r1 = r0.getValue()
            X.VzB r1 = (X.C18732VzB) r1
            X.0eM r0 = r6.A07
            java.lang.String r8 = X.DbS.A0t(r0)
            if (r8 == 0) goto L_0x0470
            java.lang.String r2 = r2.A02
            r4 = 0
            r3 = 1
            X.0qQ.A0B(r2, r3)
            X.30s r9 = r1.A00
            java.util.Map r7 = r1.A02
            java.lang.String r0 = "ig_cg_bottomsheet_primary_cta_click"
            r9.A00(r0, r7)
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x040a
            X.C18732VzB.A01(r1, r4)
        L_0x037e:
            X.0eM r1 = r6.A0E
            java.lang.Object r0 = r1.getValue()
            X.U93 r0 = (X.U93) r0
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0406
            java.lang.Object r0 = r1.getValue()
            X.U93 r0 = (X.U93) r0
            X.05G r8 = r0.A05
            java.lang.String r0 = r0.A02
            java.lang.Integer r7 = X.W15.A02(r0, r3)
            X.4Yx r2 = X.W15.A01(r0, r3)
            X.4Yx r1 = X.W15.A00(r0, r3)
            r0 = 7
            X.JwM r3 = new X.JwM
            r3.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r1, (java.lang.Object) r2)
            r2 = 0
            X.VrL r1 = new X.VrL
            r1.<init>(r2)
            X.UNu r0 = new X.UNu
            r0.<init>(r3, r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r8.Epw(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r6.A00
            java.lang.String r1 = "button"
            if (r0 == 0) goto L_0x03ef
            r0.setDividerVisible(r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r6.A00
            if (r0 == 0) goto L_0x03ef
            r0.setPrimaryAction(r2, r2)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r6.A00
            if (r0 == 0) goto L_0x03ef
            r0.setSecondaryAction(r2, r2)
        L_0x03cf:
            r0 = -560421657(0xffffffffde98a4e7, float:-5.4995851E18)
        L_0x03d2:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x03d6:
            r0 = -5112636(0xffffffffffb1fcc4, float:NaN)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.Vge r0 = (X.C17825Vge) r0
            X.VM1 r0 = r0.A01
            if (r0 == 0) goto L_0x0402
            java.lang.String r3 = r2.A02
            X.UYH r2 = r0.A00
            X.X5p r0 = r2.A04
            if (r0 != 0) goto L_0x03f7
            java.lang.String r1 = "arCommerceDataStoreProvider"
        L_0x03ef:
            X.0qQ.A0F(r1)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x03f7:
            X.X2H r1 = r0.E4n()
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            r1.CIa(r0, r3)
        L_0x0402:
            r0 = -2110778123(0xffffffff823014f5, float:-1.2936452E-37)
            goto L_0x03d2
        L_0x0406:
            X.C15376UbU.A01(r6, r6, r4)
            goto L_0x03cf
        L_0x040a:
            java.lang.String r0 = "3pd_trial_open_setting_screen"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x042c
            java.lang.String r0 = "3pd_trial_control"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0421
            java.lang.String r0 = "ig_3pd_trial_control_megaphone"
        L_0x041c:
            X.C18732VzB.A00(r1, r0)
            goto L_0x037e
        L_0x0421:
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x037e
            java.lang.String r0 = "ig_3pd_trial_30_day_megaphone"
            goto L_0x041c
        L_0x042c:
            java.lang.String r0 = "3pd_trial_inline_opt_out"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0439
            X.C18732VzB.A01(r1, r3)
            goto L_0x037e
        L_0x0439:
            java.lang.String r0 = "fewer_ads_test_group_cta"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0444
            java.lang.String r0 = "ig_fewer_ads_megaphone"
            goto L_0x041c
        L_0x0444:
            java.lang.String r0 = "fewer_ads_control_group_cta"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x044f
            java.lang.String r0 = "ig_fewer_ads_megaphone_control"
            goto L_0x041c
        L_0x044f:
            java.lang.String r0 = "activity_feed_notification_3PD_inline_opt_in"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x037e
            X.C18732VzB.A01(r1, r4)
            X.4DH r0 = r1.A01
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            r0 = 2131952202(0x7f13024a, float:1.954084E38)
            java.lang.String r0 = r1.getString(r0)
            X.C59689JTv.A09(r2, r0)
            goto L_0x037e
        L_0x0470:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1200144167(0x4788bf27, float:70014.305)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W9h.onClick(android.view.View):void");
    }
}
