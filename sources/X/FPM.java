package X;

import android.view.View;

public final class FPM implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public FPM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnFocusChangeListener(new FPM(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0381, code lost:
        r4 = X.Dbb.A00(r10);
        r2 = X.DbS.A00();
        r6 = X.AnonymousClass7TE.A0e(X.AnonymousClass0kN.A02(r10), "register_password_focused");
        X.DbY.A1D(r6, r4, r2);
        X.DbZ.A1F(r6, r2);
        X.FH8.A07(r6, r4);
        X.FH8.A0D(r6, r10, "module", r7);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03a2, code lost:
        if (r9 == null) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03a4, code lost:
        r1 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03a6, code lost:
        X.DbS.A1G(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03a9, code lost:
        if (r8 == null) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03ab, code lost:
        r0 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03ad, code lost:
        X.DbS.A1H(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03b0, code lost:
        r6.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03b4, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0112, code lost:
        r6.A8D(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016e, code lost:
        X.DbY.A1I(r6, r0, r5, r3);
        X.DbS.A1H(r6, "login");
        X.FH8.A07(r6, r1);
        r1 = r7.A06;
        X.0qQ.A0B(r1, 0);
        r0 = X.DbZ.A0m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ef, code lost:
        X.DbZ.A0s(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x022e, code lost:
        X.DbS.A1L(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ea, code lost:
        if (r4.A0i == X.2FW.A1g) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x035d, code lost:
        X.AnonymousClass7TH.A0R(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0360, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r12, boolean r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x036b;
                case 1: goto L_0x0361;
                case 2: goto L_0x0355;
                case 3: goto L_0x03e1;
                case 4: goto L_0x027b;
                case 5: goto L_0x03d7;
                case 6: goto L_0x03c9;
                case 7: goto L_0x03b6;
                case 8: goto L_0x0233;
                case 9: goto L_0x01f3;
                case 10: goto L_0x01c9;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0196;
                case 13: goto L_0x0185;
                case 14: goto L_0x0149;
                case 15: goto L_0x0122;
                case 16: goto L_0x00d3;
                case 17: goto L_0x00c1;
                case 18: goto L_0x009f;
                case 19: goto L_0x0080;
                case 20: goto L_0x006c;
                case 21: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            com.instagram.ui.widget.typeahead.TypeaheadHeader r0 = (com.instagram.ui.widget.typeahead.TypeaheadHeader) r0
            X.G5J r3 = r0.A03
            if (r3 == 0) goto L_0x002c
            X.Der r3 = (X.C46430Der) r3
            if (r13 == 0) goto L_0x002c
            X.C46430Der.A03(r3)
            X.02m r2 = X.02m.A0p
            r1 = 224332946(0xd5f0c92, float:6.873231E-31)
            java.lang.String r0 = "search_text_focused"
            com.facebook.quicklog.EventBuilder r2 = r2.markEventBuilder(r1, r0)
            java.lang.String r1 = X.C46430Der.A05(r3)
            java.lang.String r0 = "list_title"
            com.facebook.quicklog.EventBuilder r0 = r2.annotate(r0, r1)
            r0.report()
        L_0x002c:
            return
        L_0x002d:
            if (r13 == 0) goto L_0x002c
            java.lang.Object r7 = r11.A01
            X.E59 r7 = (X.E59) r7
            double r1 = X.DbS.A01()
            double r3 = X.DbS.A00()
            X.0aP r0 = r7.A02
            X.0wc r5 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "register_username_focused"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r0)
            X.DbY.A1D(r6, r1, r3)
            java.lang.String r5 = "waterfall_log_in"
            java.lang.String r0 = "containermodule"
            X.Dbc.A0c(r6, r0, r5, r3)
            java.lang.String r0 = "account_linking"
            X.DbS.A1G(r6, r0)
            X.EZy r0 = X.C48156EZy.A0E
            X.DiE r0 = r0.A00
            java.lang.String r0 = r0.A01
            X.DbS.A1H(r6, r0)
            X.0aP r0 = r7.A02
            X.FH8.A0B(r6, r0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r0 = "current_time"
            goto L_0x0112
        L_0x006c:
            java.lang.Object r0 = r11.A01
            X.E33 r0 = (X.E33) r0
            X.Dj0 r1 = r0.A04
            if (r1 == 0) goto L_0x002c
            if (r13 != 0) goto L_0x002c
            r0 = 1
            r1.removeMessages(r0)
            X.G6D r0 = r1.A00
            r0.E2e()
            return
        L_0x0080:
            if (r13 != 0) goto L_0x002c
            java.lang.Object r2 = r11.A01
            X.E3a r2 = (X.C47454E3a) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A08
            java.lang.String r0 = r0.getSearchString()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002c
            r0 = 2131969516(0x7f1345ec, float:1.9575957E38)
            java.lang.String r1 = r2.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.EuV(r1, r0)
            return
        L_0x009f:
            if (r13 != 0) goto L_0x002c
            java.lang.Object r2 = r11.A01
            X.E3Z r2 = (X.E3Z) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A08
            r0.getClass()
            java.lang.String r0 = r0.getSearchString()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002c
            r0 = 2131969516(0x7f1345ec, float:1.9575957E38)
            java.lang.String r1 = r2.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.EuV(r1, r0)
            return
        L_0x00c1:
            java.lang.Object r0 = r11.A01
            X.E3V r0 = (X.E3V) r0
            if (r13 == 0) goto L_0x044d
            X.0aP r10 = r0.A01
            X.EXD r9 = r0.A0F
            X.EZy r0 = X.C48156EZy.A0A
            X.DiE r8 = r0.A00
            java.lang.String r7 = "one_page_registration"
            goto L_0x0381
        L_0x00d3:
            java.lang.Object r4 = r11.A01
            X.E3V r4 = (X.E3V) r4
            if (r13 == 0) goto L_0x011a
            X.0aP r0 = r4.A01
            X.0wc r3 = X.AnonymousClass0kN.A02(r0)
            double r1 = X.DbS.A01()
            X.EXD r0 = r4.A0F
            if (r0 == 0) goto L_0x0117
            java.lang.String r5 = r0.A00
        L_0x00e9:
            java.lang.String r0 = "register_full_name_focused"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r3, r0)
            double r3 = X.DbS.A00()
            X.DbY.A1D(r6, r1, r3)
            X.DbS.A1G(r6, r5)
            X.EZy r0 = X.C48156EZy.A0A
            X.DiE r0 = r0.A00
            java.lang.String r0 = r0.A01
            X.DbS.A1H(r6, r0)
            X.DbZ.A1E(r6)
            X.DbW.A13(r6, r1)
            double r0 = X.DbS.A00()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "start_time"
        L_0x0112:
            r6.A8D(r0, r1)
            goto L_0x03b0
        L_0x0117:
            java.lang.String r5 = ""
            goto L_0x00e9
        L_0x011a:
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r4.A0A
            if (r0 == 0) goto L_0x002c
            r0.A03()
            return
        L_0x0122:
            if (r13 == 0) goto L_0x002c
            double r1 = X.DbS.A01()
            double r3 = X.DbS.A00()
            java.lang.Object r7 = r11.A01
            X.E54 r7 = (X.E54) r7
            java.lang.String r0 = X.E54.A0X
            X.0aP r0 = r7.A06
            X.0wc r5 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "log_in_password_focus"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r0)
            X.DbY.A1D(r6, r1, r3)
            X.DbW.A11(r6)
            java.lang.String r5 = "waterfall_log_in"
            java.lang.String r0 = "containermodule"
            goto L_0x016e
        L_0x0149:
            if (r13 == 0) goto L_0x002c
            double r1 = X.DbS.A01()
            double r3 = X.DbS.A00()
            java.lang.Object r7 = r11.A01
            X.E54 r7 = (X.E54) r7
            java.lang.String r0 = X.E54.A0X
            X.0aP r0 = r7.A06
            X.0wc r5 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "log_in_username_focus"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r0)
            X.Dbc.A0Y(r6, r1, r3)
            java.lang.String r5 = X.1Q0.A01()
            java.lang.String r0 = "waterfall_id"
        L_0x016e:
            X.DbY.A1I(r6, r0, r5, r3)
            java.lang.String r0 = "login"
            X.DbS.A1H(r6, r0)
            X.FH8.A07(r6, r1)
            X.0aP r1 = r7.A06
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = X.DbZ.A0m(r1)
            goto L_0x022e
        L_0x0185:
            java.lang.Object r1 = r11.A01
            X.E6T r1 = (X.E6T) r1
            android.view.View r0 = r1.A02
            if (r0 == 0) goto L_0x002c
            if (r13 == 0) goto L_0x0451
            X.0nA.A0Q(r0)
            X.E6T.A02(r1)
            return
        L_0x0196:
            if (r13 == 0) goto L_0x002c
            java.lang.Object r0 = r11.A01
            X.E7Q r0 = (X.E7Q) r0
            android.widget.LinearLayout r0 = r0.A01
            goto L_0x035d
        L_0x01a0:
            if (r13 != 0) goto L_0x002c
            java.lang.Object r4 = r11.A01
            X.F2l r4 = (X.C49700F2l) r4
            android.widget.EditText r0 = r4.A06
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r0)
            android.widget.EditText r2 = r4.A05
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r2)
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x002c
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x002c
            r0 = 1
            r4.A01 = r0
            android.graphics.drawable.Drawable r1 = r4.A04
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
            r0 = 2131969203(0x7f1344b3, float:1.9575322E38)
            goto L_0x01ef
        L_0x01c9:
            if (r13 != 0) goto L_0x002c
            java.lang.Object r3 = r11.A01
            X.F2l r3 = (X.C49700F2l) r3
            android.widget.EditText r2 = r3.A06
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r2)
            java.lang.String r0 = r0.trim()
            r2.setText(r0)
            int r1 = r0.length()
            r0 = 6
            if (r1 >= r0) goto L_0x0455
            r0 = 1
            r3.A02 = r0
            android.graphics.drawable.Drawable r1 = r3.A04
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
            r0 = 2131969198(0x7f1344ae, float:1.9575312E38)
        L_0x01ef:
            X.DbZ.A0s(r0)
            return
        L_0x01f3:
            if (r13 == 0) goto L_0x002c
            java.lang.Object r7 = r11.A01
            X.E4d r7 = (X.C47478E4d) r7
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = X.1Q0.A00()
            X.0aP r0 = r7.A05
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "password_reset_field_pwd_conf_focus"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x002c
            X.DbW.A14(r6, r4)
            X.DbY.A1E(r6, r4, r2)
            double r0 = (double) r2
            X.DbW.A12(r6, r0)
            java.lang.String r0 = "password_reset"
            X.DbZ.A1J(r6, r0)
            X.DbS.A1K(r6, r0)
            X.DbY.A1A(r6)
            X.0aP r0 = r7.A05
            java.lang.String r0 = X.DbZ.A0m(r0)
        L_0x022e:
            X.DbS.A1L(r6, r0)
            goto L_0x03b0
        L_0x0233:
            if (r13 == 0) goto L_0x002c
            java.lang.Object r7 = r11.A01
            X.E4d r7 = (X.C47478E4d) r7
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = X.1Q0.A00()
            X.0aP r0 = r7.A05
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "password_reset_field_pwd_focus"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0271
            X.DbW.A14(r2, r5)
            X.DbY.A1E(r2, r5, r3)
            double r0 = (double) r3
            X.DbW.A12(r2, r0)
            java.lang.String r0 = "password_reset"
            X.DbZ.A1J(r2, r0)
            X.DbS.A1K(r2, r0)
            X.DbY.A1A(r2)
            X.0aP r0 = r7.A05
            java.lang.String r0 = X.DbZ.A0m(r0)
            X.DbV.A1H(r2, r0)
        L_0x0271:
            android.widget.EditText r1 = r7.A02
            int r0 = r1.length()
            r1.setSelection(r0)
            return
        L_0x027b:
            java.lang.Object r4 = r11.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r4 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r4
            boolean r0 = r12.hasFocus()
            if (r0 == 0) goto L_0x0288
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0E(r4)
        L_0x0288:
            boolean r0 = r12.hasFocus()
            if (r0 == 0) goto L_0x002c
            com.instagram.common.session.UserSession r3 = r4.A0G
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329908586168696(0x8111dc00004178, double:3.038518706468448E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x002c
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.FZ0 r0 = r4.A0W
            if (r0 == 0) goto L_0x02bf
            r0.A05()
            X.FZ0 r0 = r4.A0W
            r0.A04()
            X.FZ0 r0 = r4.A0W
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "DirectShareSheetConstants.session_id"
            r5.putString(r0, r1)
            X.FZ0 r0 = r4.A0W
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "DirectShareSheetConstants.sub_session_id"
            r5.putString(r0, r1)
        L_0x02bf:
            java.lang.Boolean r0 = com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A05(r4)
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "DirectShareSheetConstants.meta_ai_agent_target_enabled"
            r5.putBoolean(r0, r1)
            boolean r1 = r4.A1N
            java.lang.String r0 = "DirectShareSheetConstants.msys_recipients_only"
            r5.putBoolean(r0, r1)
            boolean r1 = r4.A1C
            java.lang.String r0 = "DirectShareSheetConstants.include_msys_threads"
            r5.putBoolean(r0, r1)
            boolean r1 = r4.A1E
            java.lang.String r0 = "DirectShareSheetConstants.is_forwarding"
            r5.putBoolean(r0, r1)
            boolean r0 = r4.A1E
            if (r0 == 0) goto L_0x02ec
            X.2FW r2 = r4.A0i
            X.2FW r0 = X.2FW.A1g
            r1 = 1
            if (r2 != r0) goto L_0x02ed
        L_0x02ec:
            r1 = 0
        L_0x02ed:
            java.lang.String r0 = "DirectShareSheetConstants.is_forwarding_restricted_content_type"
            r5.putBoolean(r0, r1)
            int r1 = r4.A02
            java.lang.String r0 = "DirectShareSheetConstants.forwarding_messages_limit"
            r5.putInt(r0, r1)
            int r1 = r4.A01
            java.lang.String r0 = "DirectShareSheetConstants.forwarding_messages_count"
            r5.putInt(r0, r1)
            int r1 = r4.A05
            java.lang.String r0 = "DirectShareSheetConstants.message_request_count"
            r5.putInt(r0, r1)
            int r1 = r4.A06
            java.lang.String r0 = "DirectShareSheetConstants.message_request_limit"
            r5.putInt(r0, r1)
            X.EIn r0 = r4.A0J
            java.util.List r0 = r0.A0F()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "DirectShareSheetConstants.selected_share_targets"
            r5.putParcelableArrayList(r0, r1)
            X.EIn r0 = r4.A0J
            java.util.List r0 = r0.A0J
            int r3 = r0.size()
            X.EIn r0 = r4.A0J
            java.util.List r2 = r0.A0J
            r1 = 0
            r0 = 75
            int r0 = java.lang.Math.min(r3, r0)
            java.util.List r0 = r2.subList(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "DirectShareSheetConstants.initial_share_targets"
            r5.putParcelableArrayList(r0, r1)
            com.instagram.common.session.UserSession r3 = r4.A0G
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2271(0x8df, float:3.182E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.Dba.A0K(r1, r5, r3, r2, r0)
            r0 = 2003(0x7d3, float:2.807E-42)
            r1.A0D(r4, r0)
            return
        L_0x0355:
            if (r13 == 0) goto L_0x002c
            java.lang.Object r0 = r11.A01
            X.E7U r0 = (X.E7U) r0
            com.instagram.common.ui.base.IgLinearLayout r0 = r0.A01
        L_0x035d:
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x0361:
            if (r13 == 0) goto L_0x002c
            java.lang.Object r0 = r11.A01
            X.G9e r0 = (X.C51958G9e) r0
            r0.DBn()
            return
        L_0x036b:
            if (r13 == 0) goto L_0x002c
            java.lang.Object r0 = r11.A01
            X.E58 r0 = (X.E58) r0
            X.0wW r10 = r0.getSession()
            X.EXD r9 = r0.B6Y()
            X.DiE r8 = r0.BzS()
            java.lang.String r7 = r0.getModuleName()
        L_0x0381:
            double r4 = X.Dbb.A00(r10)
            double r2 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r10)
            java.lang.String r0 = "register_password_focused"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbY.A1D(r6, r4, r2)
            X.DbZ.A1F(r6, r2)
            X.FH8.A07(r6, r4)
            java.lang.String r0 = "module"
            X.FH8.A0D(r6, r10, r0, r7)
            r0 = 0
            if (r9 == 0) goto L_0x03b4
            java.lang.String r1 = r9.A00
        L_0x03a6:
            X.DbS.A1G(r6, r1)
            if (r8 == 0) goto L_0x03ad
            java.lang.String r0 = r8.A01
        L_0x03ad:
            X.DbS.A1H(r6, r0)
        L_0x03b0:
            r6.Cgf()
            return
        L_0x03b4:
            r1 = r0
            goto L_0x03a6
        L_0x03b6:
            r3 = 2
            java.lang.Object r0 = r11.A01
            X.FbW r0 = (X.C50423FbW) r0
            android.os.Handler r2 = r0.A02
            if (r13 != 0) goto L_0x03c5
            r0 = 50
            r2.sendEmptyMessageDelayed(r3, r0)
            return
        L_0x03c5:
            r2.removeMessages(r3)
            return
        L_0x03c9:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.FbV r0 = (X.C50422FbV) r0
            X.FPM r0 = r0.A01
            r0.onFocusChange(r12, r13)
            return
        L_0x03d7:
            java.lang.Object r0 = r11.A01
            X.FEq r0 = (X.C49916FEq) r0
            X.G99 r0 = r0.A05
            r0.onFocusChange(r12, r13)
            return
        L_0x03e1:
            r0 = 997(0x3e5, float:1.397E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r12, r0)
            android.widget.EditText r12 = (android.widget.EditText) r12
            java.lang.Object r2 = r11.A01
            X.AZV r2 = (X.AZV) r2
            java.lang.String r1 = "model"
            X.9m3 r0 = r2.A00
            if (r13 != 0) goto L_0x0436
            if (r0 == 0) goto L_0x0445
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r0.A00
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0404
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0406
        L_0x0404:
            java.lang.String r1 = "@"
        L_0x0406:
            r12.setText(r1)
            X.AZV.A04(r2, r13)
            X.0eM r0 = r2.A0E
            java.lang.Object r0 = r0.getValue()
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r12.setSelection(r0)
            r0 = r13 ^ 1
            X.AZV.A05(r2, r0)
            X.0eM r2 = r2.A0B
            android.view.View r0 = X.AnonymousClass7TE.A0c(r2)
            android.view.View r1 = r0.findFocus()
            boolean r0 = r1 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x043d
            X.0nA.A0Q(r1)
            return
        L_0x0436:
            if (r0 == 0) goto L_0x0445
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r0.A00
            java.lang.String r1 = r0.A03
            goto L_0x0406
        L_0x043d:
            android.view.View r0 = X.AnonymousClass7TE.A0c(r2)
            X.0nA.A0N(r0)
            return
        L_0x0445:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x044d:
            X.E3V.A02(r0)
            return
        L_0x0451:
            r12.requestFocus()
            return
        L_0x0455:
            r0 = 0
            r3.A02 = r0
            android.graphics.drawable.Drawable r1 = r3.A03
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPM.onFocusChange(android.view.View, boolean):void");
    }
}
