package X;

import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.ELs  reason: case insensitive filesystem */
public final class C47898ELs extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;

    public C47898ELs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass5Gv A00(AnonymousClass5Gt r1, Object obj, int i) {
        r1.A04 = new C47898ELs(obj, i);
        return r1.A00();
    }

    public final boolean Ds8(AnonymousClass5Gv r4) {
        switch (this.A00) {
            case 7:
                0qQ.A0B(r4, 0);
                0xY AR4 = ((AnonymousClass4kA) this.A01).A00.AR4();
                AR4.E5Z(C66579MXk.A00(1171), 3);
                AR4.apply();
                return true;
            case 10:
                0qQ.A0B(r4, 0);
                ((EditProfileFieldsController) this.A01).A07().getMEditText().callOnClick();
                return true;
            case 11:
                0qQ.A0B(r4, 0);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A01;
                DbW.A0x(AnonymousClass7TE.A0a(), new E3F(), C46447Df9.A01(editProfileFieldsController.A06(), editProfileFieldsController.A0A));
                return true;
            case 14:
                0qQ.A0B(r4, 0);
                ((C317116mk) this.A01).CuP();
                return true;
            default:
                return super.Ds8(r4);
        }
    }

    public final void DsE(AnonymousClass5Gv r6) {
        if (8 - this.A00 != 0) {
            super.DsE(r6);
            return;
        }
        C62880wX r4 = C61170le.A00;
        0xm A002 = AnonymousClass0xl.A00(r4);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0d = DbS.A0d(A002);
        A0d.E5c("long_press_account_switcher_row_to_create_shortcut_tooltip_last_impression_time", currentTimeMillis);
        A0d.apply();
        0xa A0g = DbT.A0g(r4);
        AnonymousClass7TG.A1L(A0g.AR4(), A0g, "long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00aa, code lost:
        r3.E5T(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0107, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0137, code lost:
        r3.E5Z(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x013a, code lost:
        r3.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x013d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsH(X.AnonymousClass5Gv r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x011f;
                case 1: goto L_0x0112;
                case 2: goto L_0x010a;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00af;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x009b;
                case 10: goto L_0x0089;
                case 11: goto L_0x0077;
                case 12: goto L_0x0063;
                case 13: goto L_0x0054;
                case 14: goto L_0x0005;
                case 15: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.DsH(r7)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r5 = r6.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.4kA r4 = X.AnonymousClass4k9.A00(r5)
            r3 = 1
            X.0s0 r2 = r4.A0J
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 28
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            X.6gx r2 = X.C313746gw.A00(r5)
            X.1Ln r1 = X.DbT.A0J(r2)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0008
            X.DbW.A17(r1, r2)
            java.lang.String r0 = "bc_live_tool_tip_rendered"
            r1.A0l(r0)
            java.lang.String r0 = "impression"
            r1.A0k(r0)
            r0 = 859(0x35b, float:1.204E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.A0p(r0)
            java.lang.String r0 = "thread_view"
            r1.A0q(r0)
            java.lang.String r0 = "broadcast"
            r1.A0o(r0)
            r0 = 0
            r1.A0s(r0)
            r1.A0i(r0)
            X.Dba.A1C(r1, r2)
            return
        L_0x0054:
            java.lang.Object r4 = r6.A01
            X.1Av r4 = (X.1Av) r4
            r3 = 1
            X.0s0 r2 = r4.A50
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 263(0x107, float:3.69E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            return
        L_0x0063:
            java.lang.Object r0 = r6.A01
            X.4mT r0 = (X.C273374mT) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.1Av r0 = X.1Au.A00(r0)
            r1 = 0
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "should_show_bio_accessory_buttons_tooltip"
            goto L_0x00aa
        L_0x0077:
            java.lang.Object r0 = r6.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            com.instagram.common.session.UserSession r0 = r0.A0A
            X.1Av r0 = X.1Au.A00(r0)
            r1 = 0
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "should_show_multiple_links_tooltip"
            goto L_0x00aa
        L_0x0089:
            java.lang.Object r0 = r6.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            com.instagram.common.session.UserSession r0 = r0.A0A
            X.1Av r0 = X.1Au.A00(r0)
            r1 = 0
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "should_show_bio_linking_tooltip"
            goto L_0x00aa
        L_0x009b:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r0 = X.1Au.A00(r0)
            r1 = 1
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "has_seen_feed_opal_indicator_tooltip"
        L_0x00aa:
            r3.E5T(r0, r1)
            goto L_0x013a
        L_0x00af:
            java.lang.Object r0 = r6.A01
            X.FvA r0 = (X.C51502FvA) r0
            X.4kA r0 = r0.A03
            X.0xa r0 = r0.A00
            X.0xY r3 = r0.AR4()
            java.lang.String r2 = "product_picker_first_shown_tooltip_impressions"
            int r0 = X.DbT.A00(r0, r2)
            goto L_0x0107
        L_0x00c2:
            java.lang.Object r0 = r6.A01
            X.1Av r0 = (X.1Av) r0
            X.0xY r3 = X.AnonymousClass7TE.A0p(r0)
            r0 = 1531(0x5fb, float:2.145E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 1
            r3.E5T(r1, r0)
            goto L_0x013a
        L_0x00d5:
            java.lang.Object r0 = r6.A01
            X.1Av r0 = (X.1Av) r0
            X.0xa r1 = r0.A01
            r0 = 578(0x242, float:8.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0xY r3 = X.AnonymousClass7TG.A0g(r1, r0)
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 577(0x241, float:8.09E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.E5c(r0, r1)
            goto L_0x013a
        L_0x00f3:
            java.lang.Object r0 = r6.A01
            X.1Av r0 = (X.1Av) r0
            X.0xa r1 = r0.A01
            r0 = 704(0x2c0, float:9.87E-43)
            java.lang.String r2 = X.C66579MXk.A00(r0)
            int r0 = X.DbT.A00(r1, r2)
            X.0xY r3 = r1.AR4()
        L_0x0107:
            int r0 = r0 + 1
            goto L_0x0137
        L_0x010a:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.C319716r5.A01(r0)
            return
        L_0x0112:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r1 = X.1Au.A00(r0)
            r0 = 0
            r1.A1K(r0)
            return
        L_0x011f:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            r0 = 1598(0x63e, float:2.239E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            int r0 = X.DbT.A00(r1, r2)
            int r0 = r0 + 1
            X.0xY r3 = r1.AR4()
        L_0x0137:
            r3.E5Z(r2, r0)
        L_0x013a:
            r3.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47898ELs.DsH(X.5Gv):void");
    }
}
