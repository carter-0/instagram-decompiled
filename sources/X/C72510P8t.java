package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.P8t  reason: case insensitive filesystem */
public final class C72510P8t implements AnonymousClass7Y0 {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass7VL A02;
    public final AnonymousClass7SN A03;

    public C72510P8t(Activity activity, UserSession userSession, AnonymousClass7VL r3, AnonymousClass7SN r4) {
        C51972G9s.A1D(r3, r4);
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CIw(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            r12 = this;
            int r0 = X.JTR.A0F(r13)
            java.lang.String r1 = "app_id"
            java.lang.String r5 = "bloks_screen_query"
            r2 = 0
            r3 = r18
            switch(r0) {
                case -866705532: goto L_0x000f;
                case -773349167: goto L_0x00da;
                case 792097649: goto L_0x00a2;
                case 1989848773: goto L_0x0175;
                default: goto L_0x000e;
            }
        L_0x000e:
            return
        L_0x000f:
            java.lang.String r0 = "xma_gen_ai_search_plugin_response_sources"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000e
            X.7SN r0 = r12.A03
            r0.CLU()
            X.AnonymousClass9B9.A00()
            com.instagram.common.session.UserSession r5 = r12.A01
            android.app.Activity r4 = r12.A00
            X.7I3 r0 = new X.7I3
            r0.<init>(r5)
            X.0wc r0 = r0.A01
            X.1Ln r8 = X.1Ln.A05(r0)
            boolean r0 = X.DbT.A1Y(r8)
            r6 = r17
            r7 = r16
            if (r0 == 0) goto L_0x0065
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.lang.String r1 = "content_type"
            java.lang.String r0 = "ai_bot_search_plugin"
            r2.put(r1, r0)
            java.lang.String r1 = "surface"
            java.lang.String r0 = "thread"
            r2.put(r1, r0)
            java.lang.String r1 = "selected_item"
            java.lang.String r0 = "ai_bot_search_plugin_view_sources"
            r2.put(r1, r0)
            if (r16 == 0) goto L_0x0058
            java.lang.String r0 = "agent_id"
            r2.put(r0, r7)
        L_0x0058:
            if (r17 == 0) goto L_0x005f
            java.lang.String r0 = "bot_response_id"
            r2.put(r0, r6)
        L_0x005f:
            r8.A0w(r2)
            r8.Cgf()
        L_0x0065:
            X.NgJ r2 = new X.NgJ
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "AiAgentSearchSourcesFragment.arg_sources_url"
            r1.putString(r0, r14)
            java.lang.String r0 = "AiAgentSearchSourcesFragment.is_v2_design"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "AiAgentSearchSourcesFragment.arg_agent_id"
            r1.putString(r0, r7)
            java.lang.String r0 = "AiAgentSearchSourcesFragment.arg_bot_response_id"
            r1.putString(r0, r6)
            r2.setArguments(r1)
            android.net.Uri r1 = android.net.Uri.parse(r14)
            java.lang.String r0 = "header"
            java.lang.String r0 = r1.getQueryParameter(r0)
            X.7Pr r1 = X.DbS.A0W(r5)
            if (r0 != 0) goto L_0x009c
            r0 = 2131952578(0x7f1303c2, float:1.9541603E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
        L_0x009c:
            r1.A0d = r0
            X.DbU.A0y(r4, r2, r1)
            return
        L_0x00a2:
            java.lang.String r0 = "xma_igbc_misinfo_treatment"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000e
            android.net.Uri r4 = X.DbT.A09(r14)
            java.lang.String r0 = "instagram://run_bloks_action/"
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L_0x00e6
            com.instagram.common.session.UserSession r8 = r12.A01
            android.app.Activity r6 = r12.A00
            X.DbS.A1X(r6)
            androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
            r0 = 2
            X.0qQ.A0B(r6, r0)
            android.net.Uri r5 = X.DbT.A09(r14)
            java.lang.String r0 = "params"
            java.lang.String r1 = r5.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0116
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x010e }
            X.0c9 r0 = r0.A01(r8, r1)     // Catch:{ IOException -> 0x010e }
            java.util.HashMap r11 = X.F5I.A00(r0)     // Catch:{ IOException -> 0x010e }
            goto L_0x0117
        L_0x00da:
            java.lang.String r0 = "xma_web_url"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000e
            android.net.Uri r4 = X.DbT.A09(r14)
        L_0x00e6:
            java.lang.String r0 = r4.getHost()
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0104
            java.util.List r0 = r4.getQueryParameters(r1)
            if (r0 == 0) goto L_0x0104
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0104
            android.app.Activity r1 = r12.A00
            com.instagram.common.session.UserSession r0 = r12.A01
            X.C48720Ej5.A00(r1, r4, r0)
            goto L_0x012d
        L_0x0104:
            android.app.Activity r0 = r12.A00
            android.content.Context r0 = X.DbT.A05(r0)
            X.FH7.A03(r0, r14)
            goto L_0x012d
        L_0x010e:
            r4 = move-exception
            java.lang.String r1 = "direct_thread"
            java.lang.String r0 = "IOException while parseParams()"
            X.0KC.A0F(r1, r0, r4)
        L_0x0116:
            r11 = 0
        L_0x0117:
            r0 = 526(0x20e, float:7.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = r5.getQueryParameter(r0)
            if (r9 == 0) goto L_0x012d
            X.Orw r7 = new X.Orw
            r7.<init>()
            java.lang.String r10 = "direct_thread"
            X.FHB.A0D(r6, r7, r8, r9, r10, r11)
        L_0x012d:
            if (r15 == 0) goto L_0x000e
            com.instagram.common.session.UserSession r1 = r12.A01
            java.lang.String r0 = "direct_thread"
            X.0wc r1 = X.DbW.A0J(r1, r0)
            if (r18 == 0) goto L_0x0172
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
        L_0x013b:
            r4 = 0
            java.lang.String r0 = "mwb_cm_inform_treatment_event"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x000e
            X.Nm7 r1 = X.C69463Nm7.VIEW_INFO_CLICK
            java.lang.String r0 = "event_name"
            r3.A8M(r1, r0)
            java.lang.String r0 = "message_id"
            r3.AAJ(r0, r15)
            java.lang.String r0 = "attachment_id"
            java.lang.Boolean r1 = X.JTP.A0g(r3, r0, r2, r4)
            java.lang.String r0 = "is_forward"
            r3.A7p(r0, r1)
            int r2 = r5.intValue()
            r0 = 2
            r1 = 6
            if (r2 == r0) goto L_0x0169
            r1 = 8
        L_0x0169:
            java.lang.String r0 = "message_type"
            X.AnonymousClass7TE.A1W(r3, r0, r1)
            r3.Cgf()
            return
        L_0x0172:
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x013b
        L_0x0175:
            java.lang.String r0 = "xma_gen_ai_search_plugin_response_search_engine_attribution"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x000e
            X.7VL r1 = r12.A02
            java.lang.String r0 = "agent_search"
            r1.A00(r14, r0, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72510P8t.CIw(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
