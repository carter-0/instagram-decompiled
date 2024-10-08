package com.instagram.creator.agent.settings.deeplink;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class CreatorAISettingsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.creator.agent.settings.deeplink.CreatorAISettingsUrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r5 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r1 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r0 = r1.getQueryParameter("destination");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r0 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r7 = X.DbV.A12(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r3 = X.AnonymousClass7TF.A0Q(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r7 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r9 = r7.hashCode();
        r6 = X.C66579MXk.A00(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        switch(r9) {
            case -1342261615: goto L_0x00d7;
            case -1236063016: goto L_0x00fb;
            case -1030574761: goto L_0x00ca;
            case 819322293: goto L_0x009f;
            case 2120227558: goto L_0x007f;
            default: goto L_0x005a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r2 = X.AnonymousClass7TG.A0P("creator_ai_creator_igid", r3.getId(), X.AnonymousClass7TE.A1L("creator_ai_entry_point_extra", r5));
        r2.putBoolean("creator_ai_should_open_audience_management", X.0qQ.A0K(r7, "auto_replies"));
        r1 = "creator_ai_settings";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        X.AnonymousClass6W8.A03(r10, r2, r13, com.instagram.modal.ModalActivity.class, r1).A0A(r10, 107);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r7.equals("add_avoided_topic") == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        r2 = X.DbY.A0C(r6, X.HLC.CLOSE_ACTIVITY, X.AnonymousClass7TE.A1L("creator_ai_creator_fbid", r3.A03.getFbidV2()), X.AnonymousClass7TE.A1L("creator_ai_entry_point_extra", r5));
        r0 = 639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r7.equals("add_keyword_response") == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        r2 = X.Q21.A00(X.AnonymousClass7TH.A0h(r6, X.HLC.CLOSE_ACTIVITY, X.AnonymousClass7TE.A1L("creator_ai_creator_igid", r3.getId()), X.AnonymousClass7TE.A1L("creator_ai_creator_fbid", r3.A03.getFbidV2()), X.AnonymousClass7TE.A1L("creator_ai_entry_point_extra", r5)));
        r0 = 2212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        if (r7.equals(X.AnonymousClass000.A00(5158)) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
        if (r7.equals("fact_list") == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e1, code lost:
        if (r7.equals("fact_list") == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        r1 = "SINGULAR_FACT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
        r2 = X.AnonymousClass7TG.A0P("creator_ai_creator_fbid", r3.A03.getFbidV2(), X.AnonymousClass7TE.A1L("creator_ai_initial_information_tab", r1));
        r0 = 2215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f8, code lost:
        r1 = "QUESTION_AND_ANSWER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        if (r7.equals(X.AnonymousClass000.A00(2580)) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
        r2 = X.Q21.A00(X.AnonymousClass7TH.A0h("creator_ai_add_fact_content_type", "AFFILIATE_LINKS", X.AnonymousClass7TE.A1L("creator_ai_creator_fbid", r3.A03.getFbidV2()), X.AnonymousClass7TE.A1L("creator_ai_entry_point_extra", r5), X.AnonymousClass7TE.A1L(r6, X.HLC.CLOSE_ACTIVITY)));
        r0 = 640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
        r1 = X.C273654mx.A00(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(android.os.Bundle r11, android.os.Bundle r12, com.instagram.common.session.UserSession r13) {
        /*
            r10 = this;
            X.AnonymousClass7TG.A1O(r13, r12)
            boolean r0 = X.C71041OaE.A02(r13)
            if (r0 != 0) goto L_0x0014
            java.lang.String r1 = "CreatorAISettingsUrlHandlerActivity"
            java.lang.String r0 = "User is not eligible to see the AI Settings"
            X.0KC.A0E(r1, r0)
        L_0x0010:
            r10.finish()
            return
        L_0x0014:
            java.lang.String r0 = X.DbS.A0m(r12)
            r7 = 0
            if (r0 == 0) goto L_0x012f
            android.net.Uri r1 = X.0cp.A03(r0)
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "entry_point"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x002f
            java.lang.String r5 = X.DbV.A12(r0)
            if (r5 != 0) goto L_0x0033
        L_0x002f:
            java.lang.String r5 = "your_tools_creator_ai"
            if (r1 == 0) goto L_0x003f
        L_0x0033:
            java.lang.String r0 = "destination"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r7 = X.DbV.A12(r0)
        L_0x003f:
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r13)
            java.lang.String r4 = "creator_ai_creator_igid"
            java.lang.String r1 = "creator_ai_entry_point_extra"
            if (r7 == 0) goto L_0x005a
            int r9 = r7.hashCode()
            java.lang.String r8 = "fact_list"
            r0 = 20
            java.lang.String r6 = X.C66579MXk.A00(r0)
            java.lang.String r2 = "creator_ai_creator_fbid"
            switch(r9) {
                case -1342261615: goto L_0x00d7;
                case -1236063016: goto L_0x00fb;
                case -1030574761: goto L_0x00ca;
                case 819322293: goto L_0x009f;
                case 2120227558: goto L_0x007f;
                default: goto L_0x005a;
            }
        L_0x005a:
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r0 = r3.getId()
            android.os.Bundle r2 = X.AnonymousClass7TG.A0P(r4, r0, r1)
            java.lang.String r0 = "auto_replies"
            boolean r1 = X.0qQ.A0K(r7, r0)
            java.lang.String r0 = "creator_ai_should_open_audience_management"
            r2.putBoolean(r0, r1)
            java.lang.String r1 = "creator_ai_settings"
        L_0x0073:
            java.lang.Class<com.instagram.modal.ModalActivity> r0 = com.instagram.modal.ModalActivity.class
            X.6W8 r1 = X.AnonymousClass6W8.A03(r10, r2, r13, r0, r1)
            r0 = 107(0x6b, float:1.5E-43)
            r1.A0A(r10, r0)
            goto L_0x0010
        L_0x007f:
            java.lang.String r0 = "add_avoided_topic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x005a
            X.4Cl r0 = r3.A03
            java.lang.String r0 = r0.getFbidV2()
            X.0eP r2 = X.AnonymousClass7TE.A1L(r2, r0)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r5)
            X.HLC r0 = X.HLC.CLOSE_ACTIVITY
            android.os.Bundle r2 = X.DbY.A0C(r6, r0, r2, r1)
            r0 = 639(0x27f, float:8.95E-43)
            goto L_0x0129
        L_0x009f:
            java.lang.String r0 = "add_keyword_response"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r3.getId()
            X.0eP r4 = X.AnonymousClass7TE.A1L(r4, r0)
            X.4Cl r0 = r3.A03
            java.lang.String r0 = r0.getFbidV2()
            X.0eP r2 = X.AnonymousClass7TE.A1L(r2, r0)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r5)
            X.HLC r0 = X.HLC.CLOSE_ACTIVITY
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r6, r0, r4, r2, r1)
            android.os.Bundle r2 = X.Q21.A00(r0)
            r0 = 2212(0x8a4, float:3.1E-42)
            goto L_0x0129
        L_0x00ca:
            r0 = 5158(0x1426, float:7.228E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00dd
            goto L_0x005a
        L_0x00d7:
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x005a
        L_0x00dd:
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = "SINGULAR_FACT"
        L_0x00e5:
            java.lang.String r0 = "creator_ai_initial_information_tab"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            X.4Cl r0 = r3.A03
            java.lang.String r0 = r0.getFbidV2()
            android.os.Bundle r2 = X.AnonymousClass7TG.A0P(r2, r0, r1)
            r0 = 2215(0x8a7, float:3.104E-42)
            goto L_0x0129
        L_0x00f8:
            java.lang.String r1 = "QUESTION_AND_ANSWER"
            goto L_0x00e5
        L_0x00fb:
            r0 = 2580(0xa14, float:3.615E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x005a
            X.4Cl r0 = r3.A03
            java.lang.String r0 = r0.getFbidV2()
            X.0eP r4 = X.AnonymousClass7TE.A1L(r2, r0)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r5)
            X.HLC r0 = X.HLC.CLOSE_ACTIVITY
            X.0eP r2 = X.AnonymousClass7TE.A1L(r6, r0)
            java.lang.String r1 = "creator_ai_add_fact_content_type"
            java.lang.String r0 = "AFFILIATE_LINKS"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r1, r0, r4, r3, r2)
            android.os.Bundle r2 = X.Q21.A00(r0)
            r0 = 640(0x280, float:8.97E-43)
        L_0x0129:
            java.lang.String r1 = X.C273654mx.A00(r0)
            goto L_0x0073
        L_0x012f:
            r1 = r7
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.deeplink.CreatorAISettingsUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }
}
