package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.instagram.direct.appwidget.DirectWidgetProvider;

/* renamed from: X.PPu  reason: case insensitive filesystem */
public final class C72936PPu implements 0Jp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AppWidgetManager A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ DirectWidgetProvider A03;

    public C72936PPu(AppWidgetManager appWidgetManager, Context context, DirectWidgetProvider directWidgetProvider, int i) {
        this.A02 = context;
        this.A00 = i;
        this.A03 = directWidgetProvider;
        this.A01 = appWidgetManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0162, code lost:
        if (r0 != 3) goto L_0x0164;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATC(com.instagram.common.session.UserSession r20, X.0Jv r21) {
        /*
            r19 = this;
            r5 = 0
            r10 = r20
            r3 = r21
            boolean r8 = X.AnonymousClass7TF.A1U(r5, r10, r3)
            r4 = r19
            android.content.Context r13 = r4.A02
            java.lang.Class<com.instagram.direct.appwidget.DirectWidgetService> r0 = com.instagram.direct.appwidget.DirectWidgetService.class
            android.content.Intent r14 = X.C66580MXl.A0A(r13, r0)
            int r2 = r4.A00
            java.lang.String r7 = "appWidgetId"
            r14.putExtra(r7, r2)
            java.lang.String r6 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "content"
            r1 = 0
            android.net.Uri r0 = android.net.Uri.fromParts(r0, r6, r1)
            r14.setData(r0)
            java.lang.Class<com.instagram.direct.appwidget.DirectWidgetProvider> r0 = com.instagram.direct.appwidget.DirectWidgetProvider.class
            android.content.Intent r11 = X.C66580MXl.A0A(r13, r0)
            java.lang.String r0 = "direct_v2"
            r11.setAction(r0)
            r11.putExtra(r7, r2)
            android.content.SharedPreferences r7 = X.C66581MXm.A07(r13, r2)
            android.content.SharedPreferences$Editor r9 = r7.edit()
            java.lang.String r0 = "com.instagram.direct.appwidget.USER_ID"
            java.lang.String r6 = X.002.A0O(r0, r2)
            java.lang.String r0 = r10.A06
            r9.putString(r6, r0)
            java.lang.String r0 = "com.instagram.direct.appwidget.USER"
            java.lang.String r6 = X.002.A0O(r0, r2)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r10)
            java.lang.String r0 = r0.getUsername()
            r9.putString(r6, r0)
            r9.apply()
            com.google.gson.Gson r12 = new com.google.gson.Gson
            r12.<init>()
            X.R2n r0 = new X.R2n
            r0.<init>()
            java.lang.reflect.Type r9 = r0.type
            X.0qQ.A07(r9)
            java.lang.String r0 = "current_custom_chat_list"
            java.lang.String r6 = X.002.A0O(r0, r2)
            java.lang.String r0 = ""
            java.lang.String r0 = r7.getString(r6, r0)
            java.lang.Object r9 = r12.A09(r0, r9)
            java.util.AbstractMap r9 = (java.util.AbstractMap) r9
            if (r9 != 0) goto L_0x0084
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
        L_0x0084:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0093
            X.2Dm r6 = X.1bJ.A00(r10)
            java.lang.String r0 = "DirectWidgetProvider"
            r6.CnE(r0)
        L_0x0093:
            X.2Dm r0 = X.1bJ.A00(r10)
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r6 = r0.A0C
            X.43A r0 = X.AnonymousClass43A.A00
            java.util.List r12 = r6.A0F(r0)
            boolean r0 = r9.isEmpty()
            java.lang.String r6 = "com.instagram.direct.appwidget.IS_EMPTY_CHAT"
            if (r0 == 0) goto L_0x00db
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x00db
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r10)
            java.lang.Class<X.2Kc> r3 = X.2Kc.class
            com.instagram.direct.appwidget.DirectWidgetProvider r1 = r4.A03
            X.OtE r0 = new X.OtE
            r0.<init>(r13, r1, r2)
            r5.A01(r0, r3)
            android.content.SharedPreferences$Editor r0 = r7.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r6, r8)
            r0.apply()
            android.appwidget.AppWidgetManager r3 = android.appwidget.AppWidgetManager.getInstance(r13)
            X.0qQ.A07(r3)
            r1 = 2131951751(0x7f130087, float:1.9539925E38)
            r0 = 2131951750(0x7f130086, float:1.9539923E38)
            com.instagram.direct.appwidget.DirectWidgetProvider.A01(r3, r13, r2, r1, r0)
            return
        L_0x00db:
            android.content.SharedPreferences$Editor r0 = r7.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r6, r5)
            r0.apply()
            r6 = 134217728(0x8000000, float:3.85186E-34)
            int r7 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r7 < r5) goto L_0x00f0
            r6 = 167772160(0xa000000, float:6.162976E-33)
        L_0x00f0:
            X.0Sy r0 = X.C66582MXn.A0K(r13, r11)
            r0.A08()
            android.app.PendingIntent r12 = r0.A02(r13, r2, r6)
            java.lang.String r15 = r10.A05
            r6 = 3
            if (r7 < r5) goto L_0x0154
            r0 = 1124204544(0x43020000, float:130.0)
            r7 = 1120665600(0x42cc0000, float:102.0)
            android.util.SizeF r5 = new android.util.SizeF
            r5.<init>(r0, r7)
            r16 = 2131624838(0x7f0e0386, float:1.8876867E38)
            r17 = 2131951720(0x7f130068, float:1.9539862E38)
            r18 = r2
            android.widget.RemoteViews r0 = com.instagram.direct.appwidget.DirectWidgetProvider.A00(r12, r13, r14, r15, r16, r17, r18)
            X.0eP r6 = X.AnonymousClass7TE.A1L(r5, r0)
            r0 = 1128988672(0x434b0000, float:203.0)
            android.util.SizeF r5 = new android.util.SizeF
            r5.<init>(r0, r7)
            r16 = 2131624836(0x7f0e0384, float:1.8876863E38)
            r17 = 2131951718(0x7f130066, float:1.9539858E38)
            android.widget.RemoteViews r0 = com.instagram.direct.appwidget.DirectWidgetProvider.A00(r12, r13, r14, r15, r16, r17, r18)
            X.0eP r8 = X.AnonymousClass7TE.A1L(r5, r0)
            r0 = 1133117440(0x438a0000, float:276.0)
            android.util.SizeF r5 = new android.util.SizeF
            r5.<init>(r0, r7)
            r16 = 2131624835(0x7f0e0383, float:1.887686E38)
            android.widget.RemoteViews r0 = com.instagram.direct.appwidget.DirectWidgetProvider.A00(r12, r13, r14, r15, r16, r17, r18)
            java.util.LinkedHashMap r5 = X.DbY.A0q(r5, r0, r6, r8)
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            r0.<init>(r5)
        L_0x0145:
            android.appwidget.AppWidgetManager r4 = r4.A01
            r4.updateAppWidget(r2, r0)
            r0 = 2131438581(0x7f0b2bf5, float:1.8499093E38)
            r4.notifyAppWidgetViewDataChanged(r2, r0)
            r3.AId(r1)
            return
        L_0x0154:
            r5 = 2
            if (r15 == 0) goto L_0x0164
            int r0 = r9.size()
            if (r0 == r8) goto L_0x0171
            if (r0 == r5) goto L_0x0171
            r16 = 2131624836(0x7f0e0384, float:1.8876863E38)
            if (r0 == r6) goto L_0x0167
        L_0x0164:
            r16 = 2131624835(0x7f0e0383, float:1.887686E38)
        L_0x0167:
            r17 = 2131951718(0x7f130066, float:1.9539858E38)
        L_0x016a:
            r18 = r2
            android.widget.RemoteViews r0 = com.instagram.direct.appwidget.DirectWidgetProvider.A00(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0145
        L_0x0171:
            r16 = 2131624838(0x7f0e0386, float:1.8876867E38)
            r17 = 2131951720(0x7f130068, float:1.9539862E38)
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72936PPu.ATC(com.instagram.common.session.UserSession, X.0Jv):void");
    }
}
