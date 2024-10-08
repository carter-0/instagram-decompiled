package X;

import android.widget.CompoundButton;

public final class FQO implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public FQO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(CompoundButton compoundButton, Object obj, int i) {
        compoundButton.setOnCheckedChangeListener(new FQO(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.CharSequence[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ae, code lost:
        X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x047c, code lost:
        X.AnonymousClass0fN.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x047f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0520, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0527, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x057b, code lost:
        r2.ATL(r0, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x057e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x06b3, code lost:
        r0.ATL(r3, r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x06b6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cf, code lost:
        r0.schedule(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        if (X.DbX.A1Z(X.2HM.A00(r3.A0g).A0H) != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cb, code lost:
        r5 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d6, code lost:
        if (r6 == ((X.C61080JwI) r5.getValue()).A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d8, code lost:
        r1 = r6.intValue();
        r4 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01df, code lost:
        if (r1 == 0) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e1, code lost:
        if (r1 == 1) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e3, code lost:
        X.AnonymousClass3WP.A04(r4, false);
        X.AnonymousClass3WP.A03(r4, false);
        r3 = "never";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01eb, code lost:
        X.FCT.A01((X.AnonymousClass0iw) null, r4, "closed_captions_only_bottom_sheet", "video_subtitles_consumption_radio_selection", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0202, code lost:
        if (r5.AIY(r5.getValue(), new X.C61080JwI(23, r6)) == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0204, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0205, code lost:
        X.AnonymousClass3WP.A04(r4, false);
        X.AnonymousClass3WP.A03(r4, true);
        r3 = "only_translated";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x020e, code lost:
        X.AnonymousClass3WP.A04(r4, true);
        r3 = X.C273654mx.A00(232);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r21, boolean r22) {
        /*
            r20 = this;
            r7 = r20
            int r0 = r7.A00
            r4 = r21
            r5 = r22
            switch(r0) {
                case 0: goto L_0x05ad;
                case 1: goto L_0x059c;
                case 2: goto L_0x0582;
                case 3: goto L_0x04df;
                case 4: goto L_0x01bb;
                case 5: goto L_0x01aa;
                case 6: goto L_0x0199;
                case 7: goto L_0x0515;
                case 8: goto L_0x0480;
                case 9: goto L_0x03f8;
                case 10: goto L_0x0104;
                case 11: goto L_0x00e4;
                case 12: goto L_0x00d6;
                case 13: goto L_0x000b;
                case 14: goto L_0x000b;
                case 15: goto L_0x000b;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03c0;
                case 18: goto L_0x03b9;
                case 19: goto L_0x03b2;
                case 20: goto L_0x039c;
                case 21: goto L_0x003b;
                case 22: goto L_0x0099;
                case 23: goto L_0x000c;
                case 24: goto L_0x0369;
                case 25: goto L_0x026d;
                case 26: goto L_0x0261;
                case 27: goto L_0x0257;
                case 28: goto L_0x0660;
                case 29: goto L_0x05e0;
                case 30: goto L_0x0218;
                case 31: goto L_0x0065;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            java.lang.Object r3 = r7.A01
            X.FF7 r3 = (X.FF7) r3
            r0 = 0
            r4.setEnabled(r0)
            com.instagram.common.session.UserSession r0 = r3.A04
            X.1NY r2 = X.DbU.A0M(r0)
            java.lang.String r0 = "friendships/update_spam_follow_setting/"
            r2.A0A(r0)
            r2.A04()
            java.lang.String r0 = "enable_spam_follower_filter"
            r2.A0H(r0, r5)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r2 = X.DbU.A0S(r2, r1, r0)
            r1 = 7
            X.NMG r0 = new X.NMG
            r0.<init>(r1, r4, r3, r5)
            r2.A00 = r0
            X.4D6 r0 = r3.A05
            goto L_0x00cf
        L_0x003b:
            java.lang.Object r3 = r7.A01
            X.ESA r3 = (X.ESA) r3
            com.instagram.common.session.UserSession r1 = r3.A00
            r0 = 0
            if (r22 == 0) goto L_0x005f
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "fundraiser/enable_charity_profile_fundraiser/"
        L_0x0049:
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            r2.A0E = r0
            java.lang.Class<X.Dum> r1 = X.C47319Dum.class
            java.lang.Class<X.F4V> r0 = X.F4V.class
            X.1OC r2 = X.DbU.A0S(r2, r1, r0)
            r0 = 30
            X.C47696EDf.A01(r2, r7, r0)
            X.4D6 r0 = r3.A01
            goto L_0x00cf
        L_0x005f:
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "fundraiser/disable_charity_profile_fundraiser/"
            goto L_0x0049
        L_0x0065:
            java.lang.Object r7 = r7.A01
            X.ESG r7 = (X.ESG) r7
            r6 = r22 ^ 1
            X.1vn r0 = r7.A00
            if (r0 == 0) goto L_0x000b
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            X.0K0 r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "is_seo_indexing_opted_out"
            X.0Df r1 = X.C41845B3m.A03(r3, r2, r1)
            X.C41848B3p.A1L(r1, r5)
            com.facebook.pando.PandoGraphQLRequest r8 = X.C50172FSe.A00(r5, r4)
            r1 = 28
            X.DFg r4 = new X.DFg
            r4.<init>(r7, r1)
            r1 = 2
            X.FRh r3 = new X.FRh
            r3.<init>(r1, r7, r6)
            goto L_0x06b3
        L_0x0099:
            java.lang.Object r3 = r7.A01
            X.EyG r3 = (X.EyG) r3
            com.instagram.common.session.UserSession r2 = r3.A01
            com.instagram.user.model.User r0 = X.DbT.A0j(r2)
            boolean r0 = r0.A27()
            r1 = r22 ^ 1
            if (r0 == r1) goto L_0x000b
            X.1NY r2 = X.DbU.A0N(r2)
            java.lang.String r0 = "users/set_feed_post_reshare_disabled/"
            r2.A0A(r0)
            if (r1 == 0) goto L_0x00d3
            java.lang.String r1 = "1"
        L_0x00b8:
            java.lang.String r0 = "disabled"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r2 = X.DbY.A0N(r2, r1, r0)
            r1 = 4
            X.EDQ r0 = new X.EDQ
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r7, (boolean) r5)
            r2.A00 = r0
            X.4D6 r0 = r3.A02
        L_0x00cf:
            r0.schedule(r2)
            return
        L_0x00d3:
            java.lang.String r1 = "0"
            goto L_0x00b8
        L_0x00d6:
            java.lang.Object r1 = r7.A01
            X.ELc r1 = (X.C47882ELc) r1
            boolean r0 = r1.A09
            if (r0 == r5) goto L_0x000b
            r1.A09 = r5
            X.C47882ELc.A00(r1)
            return
        L_0x00e4:
            java.lang.Object r0 = r7.A01
            X.DtT r0 = (X.C47242DtT) r0
            X.Eu0 r0 = r0.A01
            X.E7G r0 = r0.A00
            r0.A01 = r5
            X.F2D r2 = r0.A00
            if (r2 == 0) goto L_0x000b
            r1 = 1
            if (r22 != 0) goto L_0x0100
            java.util.Set r0 = r0.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0100
            r1 = 0
        L_0x0100:
            r2.A00(r1)
            return
        L_0x0104:
            java.lang.Object r6 = r7.A01
            X.E5H r6 = (X.E5H) r6
            if (r21 == 0) goto L_0x000b
            boolean r0 = r4.isPressed()
            if (r0 == 0) goto L_0x000b
            X.EEP r3 = r6.A0A
            if (r22 == 0) goto L_0x05b4
            int r0 = r3.A00
            if (r0 > 0) goto L_0x014b
            java.util.Map r7 = r3.A0r
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x05b4
            int r1 = r7.size()
            r0 = 1
            if (r1 != r0) goto L_0x0178
            java.util.Iterator r0 = X.AnonymousClass7TF.A0u(r7)
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r0)
            java.lang.Object r1 = r0.getValue()
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            boolean r0 = r3.A0x
            boolean r0 = r1.A0b(r0)
            if (r0 != 0) goto L_0x05b4
            com.instagram.common.session.UserSession r0 = r3.A0g
            X.2HN r0 = X.2HM.A00(r0)
            X.2HR r0 = r0.A0H
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 == 0) goto L_0x05b4
        L_0x014b:
            X.G9Y r0 = r3.A0m
            android.content.Context r0 = r0.requireContext()
            X.8ab r2 = X.DbS.A0Y(r0)
            r0 = 2131958713(0x7f131bb9, float:1.9554046E38)
            r2.A09(r0)
            int r1 = r3.A00
            r0 = 2131958712(0x7f131bb8, float:1.9554044E38)
            if (r1 <= 0) goto L_0x0165
            r0 = 2131958711(0x7f131bb7, float:1.9554042E38)
        L_0x0165:
            r2.A08(r0)
            r2.A06()
            android.app.Dialog r0 = r2.A02()
            r3.A02 = r0
            X.AnonymousClass0fN.A00(r0)
            r4.toggle()
            return
        L_0x0178:
            com.instagram.common.session.UserSession r0 = r3.A0g
            X.2HN r0 = X.2HM.A00(r0)
            X.2HR r0 = r0.A0H
            boolean r2 = X.DbX.A1Z(r0)
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r7)
        L_0x0188:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05b4
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r1)
            boolean r0 = r0.A0a(r2)
            if (r0 != 0) goto L_0x0188
            goto L_0x014b
        L_0x0199:
            if (r22 == 0) goto L_0x000b
            java.lang.Object r0 = r7.A01
            X.E2R r0 = (X.E2R) r0
            X.0eM r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.DkX r3 = (X.C46744DkX) r3
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            goto L_0x01cb
        L_0x01aa:
            if (r22 == 0) goto L_0x000b
            java.lang.Object r0 = r7.A01
            X.E2R r0 = (X.E2R) r0
            X.0eM r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.DkX r3 = (X.C46744DkX) r3
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x01cb
        L_0x01bb:
            if (r22 == 0) goto L_0x000b
            java.lang.Object r0 = r7.A01
            X.E2R r0 = (X.E2R) r0
            X.0eM r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.DkX r3 = (X.C46744DkX) r3
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x01cb:
            r2 = 0
            X.05G r5 = r3.A01
            java.lang.Object r0 = r5.getValue()
            X.JwI r0 = (X.C61080JwI) r0
            java.lang.Object r0 = r0.A00
            if (r6 == r0) goto L_0x000b
            int r1 = r6.intValue()
            r0 = 1
            com.instagram.common.session.UserSession r4 = r3.A00
            if (r1 == r2) goto L_0x020e
            if (r1 == r0) goto L_0x0205
            X.AnonymousClass3WP.A04(r4, r2)
            X.AnonymousClass3WP.A03(r4, r2)
            java.lang.String r3 = "never"
        L_0x01eb:
            r2 = 0
            java.lang.String r1 = "closed_captions_only_bottom_sheet"
            java.lang.String r0 = "video_subtitles_consumption_radio_selection"
            X.FCT.A01(r2, r4, r1, r0, r3)
        L_0x01f3:
            java.lang.Object r2 = r5.getValue()
            r1 = 23
            X.JwI r0 = new X.JwI
            r0.<init>((int) r1, (java.lang.Integer) r6)
            boolean r0 = r5.AIY(r2, r0)
            if (r0 == 0) goto L_0x01f3
            return
        L_0x0205:
            X.AnonymousClass3WP.A04(r4, r2)
            X.AnonymousClass3WP.A03(r4, r0)
            java.lang.String r3 = "only_translated"
            goto L_0x01eb
        L_0x020e:
            X.AnonymousClass3WP.A04(r4, r0)
            r0 = 232(0xe8, float:3.25E-43)
            java.lang.String r3 = X.C273654mx.A00(r0)
            goto L_0x01eb
        L_0x0218:
            java.lang.Object r6 = r7.A01
            X.ESG r6 = (X.ESG) r6
            r4 = r22 ^ 1
            X.0eM r0 = r6.A09
            X.0lg r0 = X.DbT.A0X(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            X.1NY r2 = X.DbZ.A0L(r0)
            r2.A02()
            java.lang.String r0 = "api/v1/accounts/set_embeds_opt_out/"
            r2.A0A(r0)
            java.lang.Class<X.DuX> r1 = X.C47304DuX.class
            java.lang.Class<X.F4J> r0 = X.F4J.class
            r2.A0Q(r1, r0)
            if (r3 == 0) goto L_0x0242
            java.lang.String r0 = "is_embeds_disabled"
            r2.A0H(r0, r4)
        L_0x0242:
            X.1OC r2 = r2.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>>"
            X.0qQ.A0C(r2, r0)
            r1 = 3
            X.EBp r0 = new X.EBp
            r0.<init>(r1, r6, r4)
            r2.A00 = r0
            r6.schedule(r2)
            return
        L_0x0257:
            java.lang.Object r0 = r7.A01
            X.ESZ r0 = (X.ESZ) r0
            r0.A02 = r5
            X.ESZ.A00(r4, r0)
            return
        L_0x0261:
            java.lang.Object r1 = r7.A01
            X.F3U r1 = (X.F3U) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A01(r0)
            return
        L_0x026d:
            java.lang.Object r9 = r7.A01
            X.ESY r9 = (X.ESY) r9
            if (r22 == 0) goto L_0x0363
            r6 = 0
            r4.setChecked(r6)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            android.content.Context r10 = r9.A00
            r0 = 2131962407(0x7f132a27, float:1.9561538E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "15_minutes"
            X.DbU.A1W(r1, r0, r3)
            r0 = 2131968820(0x7f134334, float:1.9574545E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "1_hour"
            X.DbU.A1W(r1, r0, r3)
            r0 = 2131975807(0x7f135e7f, float:1.9588717E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "2_hour"
            X.DbU.A1W(r1, r0, r3)
            r0 = 2131962672(0x7f132b30, float:1.9562076E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "4_hour"
            X.DbU.A1W(r1, r0, r3)
            r0 = 2131961557(0x7f1326d5, float:1.9559814E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "8_hour"
            X.DbU.A1W(r1, r0, r3)
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r1 = r10.getString(r0)
            java.lang.String r0 = "cancel"
            X.DbU.A1W(r1, r0, r3)
            int r2 = r3.size()
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r2]
            r1 = 0
        L_0x02cc:
            if (r1 >= r2) goto L_0x02db
            java.lang.Object r0 = r3.get(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x02cc
        L_0x02db:
            r0 = 34
            X.FJl r7 = new X.FJl
            r7.<init>((int) r0, (java.lang.Object) r9, (java.lang.Object) r3, (java.lang.Object) r4)
            r0 = 4
            X.FHX r3 = new X.FHX
            r3.<init>(r0, r4, r9)
            android.content.Context r2 = r4.getContext()
            java.lang.String r1 = X.2Yu.A0K(r2)
            r0 = 2131974079(0x7f1357bf, float:1.9585212E38)
            r4 = 1
            java.lang.String r5 = X.DbW.A0h(r2, r1, r0)
            X.FF8 r2 = new X.FF8
            r2.<init>(r10)
            com.instagram.common.session.UserSession r0 = r9.A03
            androidx.fragment.app.Fragment r9 = r9.A02
            r2.A01 = r0
            if (r9 != 0) goto L_0x0312
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "Passed in Fragment is null"
            X.0wb.A03(r1, r0)
        L_0x0312:
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            if (r0 == 0) goto L_0x031e
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x0325
        L_0x031e:
            java.lang.String r1 = "IgDialogBuilder"
            java.lang.String r0 = "Activity is null or finishing"
            X.0wb.A03(r1, r0)
        L_0x0325:
            X.4DJ r9 = (X.AnonymousClass4DJ) r9
            X.GM8 r0 = new X.GM8
            r0.<init>(r2, r4)
            r9.registerLifecycleListener(r0)
            r2.A04(r7, r8)
            android.widget.TextView r0 = r2.A0A
            r0.getClass()
            r0.setAutoLinkMask(r6)
            r0.setText(r5)
            r0.setVisibility(r6)
            android.view.View r0 = r2.A05
            r0.getClass()
            r0.setVisibility(r6)
            android.widget.CheckBox r1 = r2.A08
            r1.getClass()
            r0 = 8
            r1.setVisibility(r0)
            X.Dig r0 = r2.A0D
            r0.setCancelable(r4)
            r0.setCanceledOnTouchOutside(r4)
            r0.setOnCancelListener(r3)
            X.Dig r0 = r2.A00()
            goto L_0x047c
        L_0x0363:
            java.lang.String r0 = "cancel"
            X.ESY.A00(r4, r9, r0)
            return
        L_0x0369:
            java.lang.Object r3 = r7.A01
            X.ERf r3 = (X.C48018ERf) r3
            X.0eM r0 = r3.A00
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "messaging_browser_destination_settings_changed"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x038d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "should_open_in_external_browser"
            r2.A7p(r0, r1)
            r2.Cgf()
        L_0x038d:
            X.0eM r0 = r3.A02
            java.lang.Object r3 = r0.getValue()
            X.1Av r3 = (X.1Av) r3
            X.0s0 r2 = r3.A15
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 476(0x1dc, float:6.67E-43)
            goto L_0x03ae
        L_0x039c:
            java.lang.Object r0 = r7.A01
            X.ERe r0 = (X.C48017ERe) r0
            X.0eM r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            X.1Av r3 = (X.1Av) r3
            X.0s0 r2 = r3.A7r
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 510(0x1fe, float:7.15E-43)
        L_0x03ae:
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r5)
            return
        L_0x03b2:
            java.lang.Object r0 = r7.A01
            X.E3V r0 = (X.E3V) r0
            r0.A0H = r5
            return
        L_0x03b9:
            java.lang.Object r0 = r7.A01
            X.E4P r0 = (X.E4P) r0
            r0.A08 = r5
            return
        L_0x03c0:
            java.lang.Object r3 = r7.A01
            X.ES6 r3 = (X.ES6) r3
            r3.requireContext()
            X.0eM r0 = r3.A01
            X.0lg r0 = X.DbT.A0X(r0)
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "two_factor/update_trusted_notification_setting/"
            r2.A0A(r0)
            java.lang.String r0 = "enable"
            r2.A0H(r0, r5)
            java.lang.Class<X.DvV> r1 = X.DvV.class
            java.lang.Class<X.F8U> r0 = X.F8U.class
            X.1OC r2 = X.DbT.A0S(r2, r1, r0)
            X.0hq r1 = r3.getParentFragmentManager()
            r0 = 7
            X.C48001EQk.A00(r1, r3, r2, r0)
            return
        L_0x03ec:
            java.lang.Object r0 = r7.A01
            X.E1v r0 = (X.C47427E1v) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A06
            r0 = r22 ^ 1
            r1.setEnabled(r0)
            return
        L_0x03f8:
            java.lang.Object r9 = r7.A01
            X.ES5 r9 = (X.ES5) r9
            X.0eM r0 = r9.A00
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            r7 = 0
            X.FGL r6 = new X.FGL
            r8 = r6
            r10 = r9
            r12 = r7
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            X.0lg r0 = X.DbT.A0X(r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            if (r22 == 0) goto L_0x0439
            java.lang.String r0 = "attempt_turn_on_contacts_permission"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.FH8.A04(r1)
            java.lang.String r0 = "contacts_import_settings"
            X.DbS.A1K(r1, r0)
            r12 = 0
            X.DbW.A10(r1)
            r1.Cgf()
            r0 = 1917(0x77d, float:2.686E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r8 = r7
            r9 = r7
            r11 = r7
            r13 = r12
            r6.A04(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0439:
            java.lang.String r0 = "attempt_turn_off_contacts_permission"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "contacts_import_settings"
            X.DbS.A1K(r1, r0)
            r1.Cgf()
            r4 = 1
            r0 = 40
            X.EDg r3 = X.C47697EDg.A00(r6, r0)
            androidx.fragment.app.Fragment r0 = r6.A00
            X.8ab r2 = X.DbW.A0U(r0)
            r0 = 2131960835(0x7f132403, float:1.955835E38)
            r2.A09(r0)
            r0 = 2131960834(0x7f132402, float:1.9558348E38)
            r2.A08(r0)
            r1 = 2131960833(0x7f132401, float:1.9558346E38)
            r0 = 9
            X.C50025FJk.A01(r2, r3, r6, r0, r1)
            r2.A0r(r4)
            r0 = 27
            X.FJi r0 = X.C50023FJi.A00(r6, r0)
            r2.A0C(r0)
            r0 = 0
            X.C49968FHb.A00(r2, r6, r0)
            android.app.Dialog r0 = r2.A02()
        L_0x047c:
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x0480:
            java.lang.Object r0 = r7.A01
            X.ES2 r0 = (X.ES2) r0
            X.0eM r4 = r0.A06
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            if (r22 == 0) goto L_0x04dc
            java.lang.String r3 = "on"
        L_0x048e:
            java.lang.String r2 = "video_translate_and_dub_audio"
            r0 = 198(0xc6, float:2.77E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            X.FCT.A01(r0, r6, r2, r1, r3)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0xY r1 = X.AnonymousClass7TF.A0N(r1)
            r0 = 2678(0xa76, float:3.753E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r5)
            r1.apply()
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "can_consume_dubbing_translations"
            X.0Df r3 = X.C41845B3m.A03(r2, r1, r0)
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            X.DbW.A18(r3, r2, r0)
            com.facebook.pando.PandoGraphQLRequest r3 = X.C50170FSc.A00(r2, r1)
            X.1vn r2 = X.Dba.A0G(r4)
            X.0qQ.A0A(r3)
            X.FSP r1 = X.FSP.A00
            X.FRq r0 = X.C50158FRq.A00
            goto L_0x057b
        L_0x04dc:
            java.lang.String r3 = "off"
            goto L_0x048e
        L_0x04df:
            java.lang.String r1 = "entrypoint"
            java.lang.String r6 = "video_subtitles_consumption_toggled"
            r4 = 0
            java.lang.Object r0 = r7.A01
            X.ES1 r0 = (X.ES1) r0
            java.lang.String r3 = r0.A00
            if (r22 == 0) goto L_0x0502
            if (r3 == 0) goto L_0x0520
            X.0eM r2 = r0.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "on"
            X.FCT.A01(r4, r1, r3, r6, r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            r0 = 1
        L_0x04fe:
            X.AnonymousClass3WP.A04(r1, r0)
            return
        L_0x0502:
            if (r3 == 0) goto L_0x0520
            X.0eM r2 = r0.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "off"
            X.FCT.A01(r4, r1, r3, r6, r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            r0 = 0
            goto L_0x04fe
        L_0x0515:
            java.lang.Object r0 = r7.A01
            X.ES2 r0 = (X.ES2) r0
            java.lang.String r6 = r0.A00
            r3 = 0
            if (r6 != 0) goto L_0x0528
            java.lang.String r1 = "entrypoint"
        L_0x0520:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0528:
            X.0eM r4 = r0.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            if (r22 == 0) goto L_0x057f
            java.lang.String r1 = "on"
        L_0x0532:
            r0 = 4196(0x1064, float:5.88E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FCT.A01(r3, r2, r6, r0, r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0xY r1 = X.AnonymousClass7TF.A0N(r1)
            r0 = 4509(0x119d, float:6.318E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r5)
            r1.apply()
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "can_consume_text_translations"
            X.0Df r3 = X.C41845B3m.A03(r2, r1, r0)
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            X.DbW.A18(r3, r2, r0)
            com.facebook.pando.PandoGraphQLRequest r3 = X.C50170FSc.A00(r2, r1)
            X.1vn r2 = X.Dba.A0G(r4)
            X.0qQ.A0A(r3)
            X.FSO r1 = X.FSO.A00
            X.FRp r0 = X.C50157FRp.A00
        L_0x057b:
            r2.ATL(r0, r1, r3)
            return
        L_0x057f:
            java.lang.String r1 = "off"
            goto L_0x0532
        L_0x0582:
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A1i
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 121(0x79, float:1.7E-43)
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r5)
            java.lang.Object r0 = r7.A01
            android.content.Context r1 = X.DbT.A07(r0)
            r0 = 2131971284(0x7f134cd4, float:1.9579543E38)
            X.C59689JTv.A06(r1, r0)
            return
        L_0x059c:
            java.lang.Object r0 = r7.A01
            X.E0t r0 = (X.C47401E0t) r0
            X.0eM r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.DdZ r1 = (X.DdZ) r1
            r0 = 0
            r1.A04(r5, r0, r0, r0)
            return
        L_0x05ad:
            java.lang.Object r0 = r7.A01
            X.E58 r0 = (X.E58) r0
            r0.A04 = r5
            return
        L_0x05b4:
            r3.A0U = r5
            r3.A0Q()
            r3.A0P()
            X.FRO r1 = r3.A08
            r1.A02()
            if (r22 != 0) goto L_0x05d9
            boolean r0 = r3.A0v
            if (r0 == 0) goto L_0x05d9
            X.F0D r0 = r1.A01
            java.util.List r0 = r0.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05d9
            androidx.recyclerview.widget.RecyclerView r1 = r3.A05
            if (r1 == 0) goto L_0x05d9
            r0 = 0
            r1.A0o(r0)
        L_0x05d9:
            X.E5H.A08(r6)
            X.E5H.A07(r6)
            return
        L_0x05e0:
            java.lang.Object r0 = r7.A01
            X.ERu r0 = (X.C48031ERu) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.DkU r0 = (X.C46741DkU) r0
            r3 = r22 ^ 1
            X.Dfk r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1vn r0 = X.1vm.A01(r0)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "isDisabled"
            r6.A02(r1, r4)
            X.1vR r9 = X.C41845B3m.A05()
            java.util.Map r11 = r6.getParamsCopy()
            java.util.Map r12 = r5.getParamsCopy()
            java.lang.Class<com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsTypingIndicatorMutationResponseImpl> r13 = com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsTypingIndicatorMutationResponseImpl.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGDirectPrivacySettingsTypingIndicatorMutation"
            r14 = 1
            r15 = 0
            r16 = 0
            java.lang.String r18 = "xig_set_typing_indicator_disabled"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0eM r7 = r2.A01
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r7)
            X.02m r1 = (X.02m) r1
            r6 = 834877734(0x31c33926, float:5.681744E-9)
            r1.markerStart(r6)
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r7)
            X.02m r5 = (X.02m) r5
            java.lang.String r4 = "trigger_source"
            java.lang.String r1 = "typing_indicator_account_level_toggle"
            r5.markerAnnotate(r6, r4, r1)
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r7)
            X.02m r4 = (X.02m) r4
            r1 = 680(0x2a8, float:9.53E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.markerAnnotate(r6, r1, r3)
            r1 = 2
            X.IHz r4 = new X.IHz
            r4.<init>(r1, r2, r3)
            r1 = 13
            X.FS6 r3 = new X.FS6
            r3.<init>((java.lang.Object) r2, (int) r1)
            goto L_0x06b3
        L_0x0660:
            java.lang.Object r0 = r7.A01
            X.ERt r0 = (X.C48030ERt) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.DkT r0 = (X.C46740DkT) r0
            r5 = r22 ^ 1
            X.Dfk r2 = r0.A00
            X.4Cq r1 = r2.A01
            r15 = 0
            r0 = 47
            X.Dba.A1S(r2, r1, r0, r5)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1vn r0 = X.1vm.A01(r0)
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.lang.String r1 = "isDisabled"
            r4.A02(r1, r2)
            X.1vR r9 = X.C41845B3m.A05()
            java.util.Map r11 = r4.getParamsCopy()
            java.util.Map r12 = r3.getParamsCopy()
            java.lang.Class<com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsReadReceiptMutationResponseImpl> r13 = com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsReadReceiptMutationResponseImpl.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGDirectPrivacySettingsReadReceiptMutation"
            r14 = 1
            r16 = 0
            java.lang.String r18 = "xig_set_read_receipt_disabled"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.FSZ r4 = X.FSZ.A00
            X.FS4 r3 = X.FS4.A00
        L_0x06b3:
            r0.ATL(r3, r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQO.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
