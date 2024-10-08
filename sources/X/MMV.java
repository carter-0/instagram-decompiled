package X;

public final class MMV extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMV(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static MMV A00(Object obj, Object obj2, int i) {
        return new MMV(i, obj, obj2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0374, code lost:
        X.C51965G9l.A1W(r14.A01, r2);
        r1 = X.LTH.A00(new X.LTH((com.instagram.common.session.UserSession) r14.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x038a, code lost:
        if (X.DbT.A1Y(r1) == false) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x038c, code lost:
        r0 = "edit_ai_details_screen_field_regeneration_icon_clicked";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x038e, code lost:
        r1.A0l(r0);
        X.JTU.A17(r1, "field_to_regenerate", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0426, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x042b, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x021c, code lost:
        X.C63000Kpq.A00(r4.requireActivity(), r4, X.AnonymousClass7TE.A0l(r4.A02), "AI_SETTINGS", ((X.C61014JvE) r1).A0B);
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x032a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x042c;
                case 3: goto L_0x0420;
                case 4: goto L_0x0415;
                case 5: goto L_0x03d9;
                case 16: goto L_0x0398;
                case 19: goto L_0x0372;
                case 20: goto L_0x036f;
                case 21: goto L_0x0363;
                case 26: goto L_0x02a9;
                case 28: goto L_0x028e;
                case 29: goto L_0x029d;
                case 31: goto L_0x028e;
                case 32: goto L_0x029d;
                case 33: goto L_0x0231;
                case 39: goto L_0x0216;
                case 40: goto L_0x0134;
                case 41: goto L_0x0111;
                case 42: goto L_0x00e5;
                case 44: goto L_0x00c7;
                case 45: goto L_0x00a8;
                case 48: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.invoke()
            if (r0 != 0) goto L_0x0017
        L_0x0011:
            java.lang.Object r0 = r14.A02
            X.2YQ r0 = X.JTU.A08(r0)
        L_0x0017:
            return r0
        L_0x0018:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r0.invoke()
            if (r0 != 0) goto L_0x0017
        L_0x0024:
            java.lang.Object r0 = r14.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0441
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0441
            X.2YQ r0 = r1.getDefaultViewModelCreationExtras()
            return r0
        L_0x0037:
            java.lang.Object r7 = r14.A02
            X.K5j r7 = (X.C61389K5j) r7
            X.0eM r0 = r7.A01
            X.LTH r6 = X.JTO.A0T(r0)
            java.lang.Object r0 = r14.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.Jv2 r0 = (X.C61005Jv2) r0
            int r1 = r0.A00
            r0 = 2131237920(0x7f081c20, float:1.8092104E38)
            boolean r5 = X.AnonymousClass7TF.A1S(r1, r0)
            X.0eM r4 = r7.A04
            java.lang.String r3 = X.C60316JjJ.A02(r4)
            java.lang.String r2 = X.C60316JjJ.A01(r4)
            X.1Ln r1 = X.LTH.A00(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0071
            if (r5 == 0) goto L_0x00a5
            java.lang.String r0 = "edit_ai_details_avatar_generate_clicked"
        L_0x006a:
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r3)
            X.JTT.A1G(r1, r0, r2)
        L_0x0071:
            X.0eM r1 = r7.A02
            X.7I6 r0 = X.JTO.A0U(r1)
            r2 = 673058094(0x281e0d2e, float:8.77362E-15)
            X.02m r0 = r0.A06
            r0.markerStart(r2)
            X.7I6 r0 = X.JTO.A0U(r1)
            java.lang.String r1 = "avatar_gen_request_sent"
            X.02m r0 = r0.A06
            r0.markerPoint(r2, r1)
            X.JjJ r2 = X.JTO.A0R(r4)
            X.0Ud r0 = r2.A0P
            java.lang.Object r0 = r0.getValue()
            X.Jv2 r0 = (X.C61005Jv2) r0
            java.lang.String r1 = r0.A02
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0429
            X.KX0 r0 = r2.A00
            r0.A07(r1)
            goto L_0x0429
        L_0x00a5:
            java.lang.String r0 = "edit_ai_details_avatar_regenerate_clicked"
            goto L_0x006a
        L_0x00a8:
            java.lang.Object r0 = r14.A01
            X.5Oz r0 = (X.C284945Oz) r0
            r3 = 0
            X.C51967G9n.A16(r0, r3)
            java.lang.Object r2 = r14.A02
            X.1Av r2 = (X.1Av) r2
            r0 = 3964(0xf7c, float:5.555E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0xa r0 = r2.A01
            int r0 = r0.getInt(r1, r3)
            int r0 = r0 + 1
            r2.A0z(r1, r0)
            goto L_0x0429
        L_0x00c7:
            java.lang.String r2 = "name"
            java.lang.Object r0 = r14.A01
            X.C51965G9l.A1W(r0, r2)
            java.lang.Object r1 = r14.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.LTH r0 = new X.LTH
            r0.<init>(r1)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0429
            java.lang.String r0 = "settings_main_screen_field_regeneration_icon_clicked"
            goto L_0x038e
        L_0x00e5:
            java.lang.Object r4 = r14.A02
            X.K64 r4 = (X.K64) r4
            X.0eM r0 = r4.A01
            X.LTH r0 = X.JTO.A0T(r0)
            java.lang.String r2 = X.C60315JjI.A01(r4)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "settings_main_screen_audience_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r2)
            r1.A0j(r0)
            r1.Cgf()
        L_0x0109:
            java.lang.Object r0 = r14.A01
            java.lang.Object r1 = X.C51966G9m.A18(r0)
            goto L_0x021c
        L_0x0111:
            java.lang.Object r1 = r14.A02
            X.K64 r1 = (X.K64) r1
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            java.lang.Object r0 = r14.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JvE r0 = (X.C61014JvE) r0
            X.JwB r0 = r0.A02
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r0.A03
        L_0x012d:
            X.C49845F9k.A00(r1, r2, r0)
            goto L_0x0429
        L_0x0132:
            r0 = 0
            goto L_0x012d
        L_0x0134:
            java.lang.Object r5 = r14.A02
            X.K64 r5 = (X.K64) r5
            java.lang.Object r1 = r14.A01
            X.4gU r1 = (X.C270284gU) r1
            java.lang.Object r0 = r1.getValue()
            X.JvE r0 = (X.C61014JvE) r0
            boolean r8 = r0.A0J
            java.lang.Object r0 = r1.getValue()
            X.JvE r0 = (X.C61014JvE) r0
            boolean r7 = r0.A0G
            r0 = 47
            X.MMr r4 = new X.MMr
            r4.<init>(r5, r0)
            X.0eM r0 = r5.A01
            X.LTH r1 = X.JTO.A0T(r0)
            X.0eM r6 = r5.A03
            X.JjI r0 = X.JTO.A0S(r6)
            com.instagram.aistudio.editor.AiSettingsRepository r0 = r0.A00
            boolean r13 = r0.A0D()
            X.JjI r0 = X.JTO.A0S(r6)
            com.instagram.aistudio.editor.AiSettingsRepository r9 = r0.A00
            X.Jvz r2 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r9)
            r0 = 0
            if (r2 == 0) goto L_0x0203
            java.lang.String r3 = r2.A09
        L_0x0174:
            X.05G r2 = r9.A0G
            X.Jvz r2 = X.JTP.A0M(r2)
            if (r2 == 0) goto L_0x017e
            java.lang.String r0 = r2.A09
        L_0x017e:
            boolean r2 = X.C51966G9m.A1a(r3, r0)
            X.JjI r0 = X.JTO.A0S(r6)
            com.instagram.aistudio.editor.AiSettingsRepository r0 = r0.A00
            boolean r12 = r0.A0D()
            X.JjI r0 = X.JTO.A0S(r6)
            com.instagram.aistudio.editor.AiSettingsRepository r0 = r0.A00
            X.Jvz r0 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r0)
            if (r0 == 0) goto L_0x019c
            java.lang.String r10 = r0.A08
            if (r10 != 0) goto L_0x019e
        L_0x019c:
            java.lang.String r10 = ""
        L_0x019e:
            java.lang.String r11 = X.C60315JjI.A01(r5)
            r0 = 3
            X.1Ln r3 = X.LTH.A01(r1, r10, r0)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = "settings_main_screen_save_clicked"
            r3.A0l(r0)
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "is_description_changed"
            X.0eP r9 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "is_tagline_changed"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "is_name_changed"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "selected_audience"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r10, r9, r2, r1)
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r3.A0x(r0)
            java.lang.Long r0 = X.DbZ.A0d(r11)
            r3.A0j(r0)
            r3.Cgf()
        L_0x01e7:
            if (r8 == 0) goto L_0x0206
            if (r7 == 0) goto L_0x0206
            X.0eM r0 = r5.A02
            X.7Pr r0 = X.DbX.A0f(r0)
            X.7Pu r2 = r0.A00()
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.K7N r0 = new X.K7N
            r0.<init>()
            r2.A02(r1, r0)
            goto L_0x0429
        L_0x0203:
            r3 = r0
            goto L_0x0174
        L_0x0206:
            X.JjI r2 = X.JTO.A0S(r6)
            r1 = 46
            X.MMr r0 = new X.MMr
            r0.<init>(r4, r1)
            r2.A0F(r0)
            goto L_0x0429
        L_0x0216:
            java.lang.Object r4 = r14.A02
            X.K64 r4 = (X.K64) r4
            java.lang.Object r1 = r14.A01
        L_0x021c:
            X.JvE r1 = (X.C61014JvE) r1
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0eM r0 = r4.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.util.List r1 = r1.A0B
            java.lang.String r0 = "AI_SETTINGS"
            X.C63000Kpq.A00(r3, r4, r2, r0, r1)
            goto L_0x0429
        L_0x0231:
            java.lang.Object r2 = r14.A02
            X.K5i r2 = (X.K5i) r2
            X.0eM r0 = r2.A01
            X.LTH r6 = X.JTO.A0T(r0)
            java.lang.Object r0 = r14.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.Jv2 r0 = (X.C61005Jv2) r0
            int r1 = r0.A00
            r0 = 2131238318(0x7f081dae, float:1.8092911E38)
            boolean r5 = X.AnonymousClass7TF.A1S(r1, r0)
            X.0eM r4 = r2.A03
            X.JjI r0 = X.JTO.A0S(r4)
            X.0Ud r0 = r0.A0I
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            X.1Ln r1 = X.LTH.A00(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0270
            if (r5 == 0) goto L_0x028b
            java.lang.String r0 = "settings_main_screen_edit_profile_picture_screen_generate_clicked"
        L_0x0269:
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r3)
            X.JTT.A1G(r1, r0, r2)
        L_0x0270:
            X.JjI r2 = X.JTO.A0S(r4)
            X.0Ud r0 = r2.A0G
            java.lang.Object r0 = r0.getValue()
            X.Jv2 r0 = (X.C61005Jv2) r0
            java.lang.String r1 = r0.A02
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0429
            com.instagram.aistudio.editor.AiSettingsRepository r0 = r2.A00
            r0.A09(r1)
            goto L_0x0429
        L_0x028b:
            java.lang.String r0 = "settings_main_screen_edit_profile_picture_screen_regenerate_clicked"
            goto L_0x0269
        L_0x028e:
            java.lang.Object r0 = r14.A01
            X.DbS.A1U(r0)
            java.lang.Object r1 = r14.A02
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            X.C51967G9n.A16(r1, r0)
            goto L_0x0429
        L_0x029d:
            java.lang.Object r0 = r14.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r14.A02
            X.DbS.A1U(r0)
            goto L_0x0429
        L_0x02a9:
            java.lang.Object r8 = r14.A02
            X.K5r r8 = (X.C61397K5r) r8
            java.lang.Object r7 = r14.A01
            X.2da r7 = (X.2da) r7
            X.0eM r6 = r8.A05
            X.JjI r0 = X.JTO.A0S(r6)
            X.0Ud r0 = r0.A0E
            java.lang.Object r9 = r0.getValue()
            X.JuP r9 = (X.C60967JuP) r9
            r5 = 0
            if (r9 == 0) goto L_0x02e5
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x02e5
            X.0xx r1 = X.DbW.A0E(r8)
            r0 = 4
            X.MHA.A03(r8, r1, r0)
        L_0x02ce:
            X.0eM r0 = r8.A02
            X.LTH r3 = X.JTO.A0T(r0)
            X.0eM r0 = r8.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            java.lang.String r1 = X.C60315JjI.A02(r6)
            java.lang.String r0 = "basic_settings"
            r3.A0M(r2, r1, r0)
            goto L_0x0429
        L_0x02e5:
            X.JjI r2 = X.JTO.A0S(r6)
            X.0Ud r0 = r2.A0E
            java.lang.Object r1 = r0.getValue()
            if (r1 == 0) goto L_0x035e
            X.JuP r1 = (X.C60967JuP) r1
            int r10 = r1.A00
            r0 = -1
            com.instagram.aistudio.editor.AiSettingsRepository r4 = r2.A00
            if (r10 != r0) goto L_0x032c
            X.N49 r1 = r1.A01
            X.0qQ.A0B(r1, r5)
            X.0Ud r0 = r4.A0X
            java.lang.Object r2 = r0.getValue()
            if (r2 == 0) goto L_0x0354
            X.Jvz r2 = (X.C61061Jvz) r2
            java.util.List r0 = r2.A0F
            if (r0 != 0) goto L_0x030f
            X.0sn r0 = X.0sn.A00
        L_0x030f:
            java.util.ArrayList r0 = X.00k.A0T(r1, r0)
        L_0x0313:
            X.05G r1 = r4.A08
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r2, (com.instagram.common.typedurl.ImageUrl) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, r0, (java.util.List) null, (java.util.List) null, 7864319, false, false)
            r1.Epw(r0)
            com.instagram.aistudio.editor.AiSettingsRepository.A07(r4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, 255)
        L_0x031f:
            X.DbT.A1I(r8)
            if (r9 == 0) goto L_0x032a
            boolean r0 = r9.A04
        L_0x0326:
            r7.ARb(r5, r0)
            goto L_0x02ce
        L_0x032a:
            r0 = 0
            goto L_0x0326
        L_0x032c:
            X.N49 r3 = r1.A01
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.0Ud r0 = r4.A0X
            java.lang.Object r2 = r0.getValue()
            if (r2 == 0) goto L_0x0359
            X.Jvz r2 = (X.C61061Jvz) r2
            java.util.List r1 = r2.A0F
            if (r1 != 0) goto L_0x0342
            X.0sn r1 = X.0sn.A00
        L_0x0342:
            java.lang.Object r0 = X.00k.A0O(r1, r10)
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x031f
            java.util.ArrayList r0 = X.00k.A0U(r1)
            r0.set(r10, r3)
            goto L_0x0313
        L_0x0354:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0359:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x035e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0363:
            java.lang.Object r1 = r14.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r14.A02
            X.Gmq r0 = (X.C53366Gmq) r0
            java.util.List r0 = r0.A08
            goto L_0x0426
        L_0x036f:
            java.lang.String r2 = "tagline"
            goto L_0x0374
        L_0x0372:
            java.lang.String r2 = "name"
        L_0x0374:
            java.lang.Object r0 = r14.A01
            X.C51965G9l.A1W(r0, r2)
            java.lang.Object r1 = r14.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.LTH r0 = new X.LTH
            r0.<init>(r1)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0429
            java.lang.String r0 = "edit_ai_details_screen_field_regeneration_icon_clicked"
        L_0x038e:
            r1.A0l(r0)
            java.lang.String r0 = "field_to_regenerate"
            X.JTU.A17(r1, r0, r2)
            goto L_0x0429
        L_0x0398:
            java.lang.Object r5 = r14.A02
            X.K59 r5 = (X.K59) r5
            java.lang.Object r0 = r14.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JvB r0 = (X.C61011JvB) r0
            java.util.List r4 = r0.A09
            X.0eM r0 = r5.A00
            X.LTH r1 = X.JTO.A0T(r0)
            X.0eM r0 = r5.A02
            java.lang.String r3 = X.C60316JjJ.A02(r0)
            java.lang.String r2 = X.C60316JjJ.A01(r0)
            X.1Ln r1 = X.LTH.A00(r1)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x03c9
            java.lang.String r0 = "ai_configuration_screen_audience_row_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r3)
            X.JTT.A1G(r1, r0, r2)
        L_0x03c9:
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r0 = r5.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "AI_CREATION"
            X.C63000Kpq.A00(r2, r5, r1, r0, r4)
            goto L_0x0429
        L_0x03d9:
            java.lang.Object r3 = r14.A02
            X.K4l r3 = (X.C61367K4l) r3
            java.lang.Object r0 = r14.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.String r7 = r3.A00
            if (r7 != 0) goto L_0x03f3
            java.lang.String r0 = "botId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03f3:
            java.lang.String r5 = r0.A02
            if (r5 == 0) goto L_0x0411
            java.lang.Object r4 = r0.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            if (r4 == 0) goto L_0x0411
            X.0eM r0 = r3.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r1 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r1.<init>(r0)
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r6 = 0
            r8 = r6
            r1.A05(r2, r3, r4, r5, r6, r7, r8)
        L_0x0411:
            X.DbX.A1I(r3)
            goto L_0x0429
        L_0x0415:
            java.lang.Object r1 = r14.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r14.A02
            X.JvA r0 = (X.C61010JvA) r0
            java.lang.String r0 = r0.A04
            goto L_0x0426
        L_0x0420:
            java.lang.Object r1 = r14.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r14.A01
        L_0x0426:
            r1.invoke(r0)
        L_0x0429:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x042c:
            java.lang.Object r2 = r14.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r14.A01
            X.JR4 r1 = (X.JR4) r1
            if (r1 != 0) goto L_0x043b
            X.LcX r1 = new X.LcX
            r1.<init>()
        L_0x043b:
            X.GJT r0 = new X.GJT
            r0.<init>(r1, r2)
            return r0
        L_0x0441:
            X.2YP r0 = X.AnonymousClass2YP.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMV.invoke():java.lang.Object");
    }
}
