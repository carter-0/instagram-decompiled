package X;

import com.instagram.igds.components.textcell.IgdsListCell;

public final class FdS implements C358618bC {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ba, code lost:
        X.E3R.A01(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x035e, code lost:
        X.AnonymousClass0fN.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0391, code lost:
        r5 = "logger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03cb, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03d2, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        r2.A00(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onToggle(boolean r15) {
        /*
            r14 = this;
            r7 = r15
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x021d;
                case 1: goto L_0x02e1;
                case 2: goto L_0x0214;
                case 3: goto L_0x01c7;
                case 4: goto L_0x01bf;
                case 5: goto L_0x01a4;
                case 6: goto L_0x018d;
                case 7: goto L_0x0184;
                case 8: goto L_0x0174;
                case 9: goto L_0x0297;
                case 10: goto L_0x032b;
                case 11: goto L_0x0231;
                case 12: goto L_0x039e;
                case 13: goto L_0x011a;
                case 14: goto L_0x0112;
                case 15: goto L_0x0006;
                case 16: goto L_0x0006;
                case 17: goto L_0x00bb;
                case 18: goto L_0x0084;
                case 19: goto L_0x0057;
                case 20: goto L_0x0034;
                case 21: goto L_0x0015;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r14.A01
            X.0sP r2 = (X.0sP) r2
            r1 = 1
            X.EOT r0 = new X.EOT
            r0.<init>(r15, r1)
            r2.invoke(r0)
        L_0x0013:
            r7 = 0
            return r7
        L_0x0015:
            java.lang.Object r4 = r14.A01
            X.E2v r4 = (X.C47449E2v) r4
            r4.A05 = r15
            X.0eM r0 = r4.A09
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = "igwb"
            java.lang.String r1 = "hide_comments_did_tapped"
            r0 = 0
            X.FCT.A01(r4, r3, r2, r1, r0)
            X.F2M r2 = r4.A01
            if (r2 == 0) goto L_0x0391
            java.util.HashMap r1 = X.C47449E2v.A00(r4)
            java.lang.String r0 = "hide_more_comments"
            goto L_0x0052
        L_0x0034:
            java.lang.Object r4 = r14.A01
            X.E2v r4 = (X.C47449E2v) r4
            r4.A04 = r15
            X.0eM r0 = r4.A09
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = "igwb"
            java.lang.String r1 = "hide_messages_did_tapped"
            r0 = 0
            X.FCT.A01(r4, r3, r2, r1, r0)
            X.F2M r2 = r4.A01
            if (r2 == 0) goto L_0x0391
            java.util.HashMap r1 = X.C47449E2v.A00(r4)
            java.lang.String r0 = "hide_message_requests"
        L_0x0052:
            r2.A00(r0, r1)
            goto L_0x0361
        L_0x0057:
            java.lang.Object r1 = r14.A01
            X.E22 r1 = (X.E22) r1
            if (r15 == 0) goto L_0x0081
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
        L_0x005f:
            X.E22.A01(r1, r0)
            android.content.Context r4 = r1.requireContext()
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r3 = r1.A00
            if (r3 == 0) goto L_0x0394
            X.4A4 r2 = new X.4A4
            r2.<init>(r0)
            r1 = 46
            X.EDf r0 = new X.EDf
            r0.<init>(r4, r1)
            r2.A00(r0, r3, r15)
            goto L_0x0361
        L_0x0081:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            goto L_0x005f
        L_0x0084:
            java.lang.Object r1 = r14.A01
            X.E22 r1 = (X.E22) r1
            if (r15 == 0) goto L_0x00b8
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x008c:
            X.E22.A01(r1, r0)
            android.content.Context r10 = r1.requireContext()
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r12 = r1.A00
            if (r12 == 0) goto L_0x0399
            java.lang.String r4 = r1.A02
            r5 = 0
            java.lang.String r3 = r12.getId()
            r6 = r5
            X.1OC r0 = X.C49177Eqi.A00(r2, r3, r4, r5, r6, r7)
            r9 = 2
            X.KAc r8 = new X.KAc
            r11 = r5
            r13 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A00 = r8
            X.1ES.A03(r0)
            goto L_0x0361
        L_0x00b8:
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            goto L_0x008c
        L_0x00bb:
            java.lang.Object r3 = r14.A01
            X.E5n r3 = (X.C47505E5n) r3
            X.0eM r0 = r3.A0N
            X.0lg r1 = X.DbT.A0X(r0)
            java.lang.String r6 = r3.A0A
            java.lang.String r5 = r3.A09
            int r4 = r3.A02
            r0 = 0
            X.DbZ.A0t(r0, r1, r6, r5)
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r1)
            java.lang.String r0 = "direct_settings_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = "media_type"
            r2.AAJ(r0, r6)
            java.lang.String r0 = r3.A0J
            X.DbS.A1O(r2, r0)
            java.lang.String r0 = "media_id"
            java.lang.Long r1 = X.DbV.A0p(r2, r0, r5, r4)
            r0 = 3011(0xbc3, float:4.22E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A9F(r0, r1)
            if (r15 == 0) goto L_0x010f
            java.lang.String r1 = "on"
        L_0x00fc:
            java.lang.String r0 = "setting_state"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "anytime_mention_story_sharing"
            java.lang.String r0 = "setting_type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x010b:
            r3.A0C = r15
            goto L_0x0361
        L_0x010f:
            java.lang.String r1 = "off"
            goto L_0x00fc
        L_0x0112:
            java.lang.Object r0 = r14.A01
            X.E1R r0 = (X.E1R) r0
            r0.A00 = r15
            goto L_0x0361
        L_0x011a:
            if (r15 == 0) goto L_0x0361
            java.lang.Object r4 = r14.A01
            X.ESP r4 = (X.ESP) r4
            X.0eM r3 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            X.FCE.A00(r1, r0)
            android.os.Bundle r1 = r4.A00
            java.lang.String r5 = "twoFacResponseBundle"
            if (r1 == 0) goto L_0x03cb
            java.lang.String r0 = "is_phone_confirmed"
            boolean r1 = r1.getBoolean(r0)
            X.1WZ r0 = X.FFR.A01()
            if (r1 == 0) goto L_0x015e
            X.F3Y r6 = r0.A00()
            android.os.Bundle r7 = r4.requireArguments()
            android.os.Bundle r0 = r4.A00
            if (r0 == 0) goto L_0x03cb
            java.lang.String r10 = X.Dbb.A0Z(r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            r11 = 1
            r9 = r8
            X.E2r r1 = r6.A01(r7, r8, r9, r10, r11)
        L_0x0155:
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.Dbc.A0S(r1, r0, r3)
            goto L_0x0361
        L_0x015e:
            r0.A00()
            android.os.Bundle r2 = r4.A00
            if (r2 == 0) goto L_0x03cb
            r1 = 0
            java.lang.String r0 = "ARG_IS_ENABLING_WHATSAPP"
            r2.putBoolean(r0, r1)
            X.E3L r1 = new X.E3L
            r1.<init>()
            r1.setArguments(r2)
            goto L_0x0155
        L_0x0174:
            java.lang.Object r0 = r14.A01
            X.E4V r0 = (X.E4V) r0
            X.DkL r1 = X.E4V.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r1.A01 = r0
            goto L_0x0361
        L_0x0184:
            java.lang.Object r0 = r14.A01
            X.G9e r0 = (X.C51958G9e) r0
            r0.Da4(r15)
            goto L_0x0361
        L_0x018d:
            java.lang.Object r4 = r14.A01
            X.E3R r4 = (X.E3R) r4
            r4.A05 = r15
            X.0eM r0 = r4.A0E
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = "igwb"
            java.lang.String r1 = "hide_comments_did_tapped"
            r0 = 0
            X.FCT.A01(r4, r3, r2, r1, r0)
            java.lang.String r0 = "hide_more_comments_setting"
            goto L_0x01ba
        L_0x01a4:
            java.lang.Object r4 = r14.A01
            X.E3R r4 = (X.E3R) r4
            r4.A04 = r15
            X.0eM r0 = r4.A0E
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = "igwb"
            java.lang.String r1 = "hide_messages_did_tapped"
            r0 = 0
            X.FCT.A01(r4, r3, r2, r1, r0)
            java.lang.String r0 = "hide_message_requests_setting"
        L_0x01ba:
            X.E3R.A01(r4, r0)
            goto L_0x0361
        L_0x01bf:
            java.lang.Object r0 = r14.A01
            X.E4z r0 = (X.C47494E4z) r0
            r0.A03 = r15
            goto L_0x0361
        L_0x01c7:
            java.lang.Object r4 = r14.A01
            X.E45 r4 = (X.E45) r4
            X.0eM r0 = r4.A01
            X.0lg r0 = X.DbY.A0R(r0)
            X.1NY r6 = X.DbU.A0M(r0)
            java.lang.String r5 = "api/"
            java.lang.String r3 = "v1/"
            java.lang.String r2 = "creators/"
            java.lang.String r1 = "collaboration/"
            java.lang.String r0 = "update_settings/"
            r6.A04()
            r6.A02()
            java.lang.String r0 = X.002.A11(r5, r3, r2, r1, r0)
            X.0qQ.A07(r0)
            r6.A0E = r0
            java.lang.Class<X.CCt> r1 = X.C43775CCt.class
            java.lang.Class<X.CyG> r0 = X.C45542CyG.class
            r6.A0Q(r1, r0)
            java.lang.String r0 = "is_open_to_collab"
            r6.A0H(r0, r15)
            X.1OC r2 = r6.A0M()
            r0 = 8
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            r1 = 1
            X.EBp r0 = new X.EBp
            r0.<init>(r1, r4, r15)
            r2.A00 = r0
            r4.schedule(r2)
            goto L_0x0361
        L_0x0214:
            java.lang.Object r0 = r14.A01
            com.instagram.business.fragment.CategorySearchFragment r0 = (com.instagram.business.fragment.CategorySearchFragment) r0
            com.instagram.business.fragment.CategorySearchFragment.A0B(r0, r15)
            goto L_0x0361
        L_0x021d:
            java.lang.Object r0 = r14.A01
            X.DlT r0 = (X.C46794DlT) r0
            X.05G r2 = r0.A09
            com.instagram.common.session.UserSession r0 = r0.A05
            java.lang.String r1 = r0.A06
            X.Dwz r0 = new X.Dwz
            r0.<init>(r15, r1)
            r2.Epw(r0)
            goto L_0x0361
        L_0x0231:
            java.lang.Object r3 = r14.A01
            X.ESO r3 = (X.ESO) r3
            if (r15 == 0) goto L_0x0269
            X.DbT.A15()
            java.lang.String r2 = "OPT_OUT"
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "AUTO_CONF_SCREEN_TYPE"
            r1.putString(r0, r2)
            X.E14 r2 = new X.E14
            r2.<init>()
            r2.setArguments(r1)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.7Pr r1 = X.DbS.A0W(r0)
            r0 = 2131953330(0x7f1306b2, float:1.9543128E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0d = r0
            X.7Pu r1 = r1.A00()
            android.app.Activity r0 = r3.getRootActivity()
            r1.A02(r0, r2)
            goto L_0x0013
        L_0x0269:
            boolean r0 = r3.A02
            r1 = 2131953332(0x7f1306b4, float:1.9543132E38)
            if (r0 == 0) goto L_0x0273
            r1 = 2131953331(0x7f1306b3, float:1.954313E38)
        L_0x0273:
            X.8ab r2 = X.DbW.A0U(r3)
            r0 = 2131953332(0x7f1306b4, float:1.9543132E38)
            r2.A09(r0)
            X.DbU.A1J(r3, r2, r1)
            r1 = 2131953333(0x7f1306b5, float:1.9543134E38)
            r0 = 12
            X.C50020FJf.A01(r2, r3, r0, r1)
            r0 = 11
            X.FJf r0 = X.C50020FJf.A00(r3, r0)
            r2.A0C(r0)
            android.app.Dialog r0 = r2.A02()
            goto L_0x035e
        L_0x0297:
            java.lang.Object r3 = r14.A01
            X.E3B r3 = (X.E3B) r3
            if (r15 != 0) goto L_0x02c1
            android.content.Context r0 = r3.A04()
            X.8ab r2 = X.DbS.A0Y(r0)
            r0 = 2131960764(0x7f1323bc, float:1.9558206E38)
            r2.A09(r0)
            r0 = 2131960762(0x7f1323ba, float:1.9558202E38)
            r2.A08(r0)
            r1 = 2131960763(0x7f1323bb, float:1.9558204E38)
            r0 = 41
            X.C50023FJi.A02(r2, r3, r0, r1)
            r0 = 2131960761(0x7f1323b9, float:1.95582E38)
            X.DbY.A1M(r2, r0)
            goto L_0x0013
        L_0x02c1:
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.A07()
            r0 = 1
            r1.setChecked(r0)
            android.view.View r1 = r3.A03
            if (r1 == 0) goto L_0x03c9
            r0 = 0
            r1.setVisibility(r0)
            android.widget.EditText r0 = r3.A05()
            r0.requestFocus()
            android.widget.EditText r0 = r3.A05()
            X.0nA.A0Q(r0)
            goto L_0x0013
        L_0x02e1:
            if (r15 != 0) goto L_0x0361
            java.lang.Object r4 = r14.A01
            X.E2a r4 = (X.C47430E2a) r4
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0361
            X.8ab r3 = X.DbW.A0U(r4)
            r0 = 2131967998(0x7f133ffe, float:1.9572878E38)
            r3.A09(r0)
            r0 = 2131967999(0x7f133fff, float:1.957288E38)
            r3.A08(r0)
            r2 = 2131975563(0x7f135d8b, float:1.9588222E38)
            r0 = 15
            X.FJi r1 = X.C50023FJi.A00(r4, r0)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r3.A0O(r1, r0, r2)
            r0 = 16
            X.FJi r0 = X.C50023FJi.A00(r4, r0)
            X.DbX.A16(r0, r3)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A00
            if (r0 == 0) goto L_0x0013
            java.lang.String r2 = "profile_native_calling"
            r5 = 0
            java.lang.String r3 = r4.A02
            java.lang.String r4 = "disable_calling_dialog"
            X.Xtl r1 = new X.Xtl
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.ClC(r1)
            goto L_0x0013
        L_0x032b:
            java.lang.Object r2 = r14.A01
            X.ESN r2 = (X.ESN) r2
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0013
            if (r15 == 0) goto L_0x0378
            boolean r0 = r2.A07
            X.8ab r3 = X.Dba.A0I(r2)
            if (r0 == 0) goto L_0x0363
            r0 = 2131975790(0x7f135e6e, float:1.9588682E38)
            r3.A09(r0)
            r0 = 2131975788(0x7f135e6c, float:1.9588678E38)
            r3.A08(r0)
            r1 = 2131975789(0x7f135e6d, float:1.958868E38)
            r0 = 4
            X.C50020FJf.A01(r3, r2, r0, r1)
            r0 = 3
        L_0x0351:
            X.FJf r0 = X.C50020FJf.A00(r2, r0)
            r3.A0C(r0)
            android.app.Dialog r0 = r3.A02()
            r2.A00 = r0
        L_0x035e:
            X.AnonymousClass0fN.A00(r0)
        L_0x0361:
            r7 = 1
            return r7
        L_0x0363:
            r0 = 2131969395(0x7f134573, float:1.9575712E38)
            r3.A09(r0)
            r0 = 2131969393(0x7f134571, float:1.9575708E38)
            r3.A08(r0)
            r1 = 2131969394(0x7f134572, float:1.957571E38)
            r0 = 0
            X.C50020FJf.A01(r3, r2, r0, r1)
            r0 = 5
            goto L_0x0351
        L_0x0378:
            X.8ab r3 = X.Dba.A0I(r2)
            r0 = 2131960778(0x7f1323ca, float:1.9558234E38)
            r3.A09(r0)
            r0 = 2131960776(0x7f1323c8, float:1.955823E38)
            r3.A08(r0)
            r1 = 2131960777(0x7f1323c9, float:1.9558232E38)
            r0 = 2
            X.C50020FJf.A01(r3, r2, r0, r1)
            r0 = 1
            goto L_0x0351
        L_0x0391:
            java.lang.String r5 = "logger"
            goto L_0x03cb
        L_0x0394:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0399:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x039e:
            java.lang.Object r0 = r14.A01
            X.EQk r0 = (X.C48001EQk) r0
            java.lang.Object r3 = r0.A01
            X.E5C r3 = (X.E5C) r3
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1NY r1 = X.DbZ.A0L(r0)
            java.lang.String r0 = "accounts/set_phone_number_confirmed_badge/"
            X.Dba.A1H(r1, r0)
            java.lang.String r0 = "phone_number_confirmed_badge_enabled"
            r1.A0H(r0, r15)
            X.1OC r2 = X.DbW.A0K(r1)
            X.0hq r1 = r3.getParentFragmentManager()
            X.EQS r0 = new X.EQS
            r0.<init>(r1, r3, r15)
            r2.A00 = r0
            r3.schedule(r2)
            return r7
        L_0x03c9:
            java.lang.String r5 = "messageSection"
        L_0x03cb:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FdS.onToggle(boolean):boolean");
    }

    public FdS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(IgdsListCell igdsListCell, Object obj, int i) {
        igdsListCell.A0E(new FdS(obj, i));
    }
}
