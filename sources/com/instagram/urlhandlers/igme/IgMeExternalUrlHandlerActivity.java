package com.instagram.urlhandlers.igme;

import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class IgMeExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.igme.IgMeExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00bd: MOVE  (r1v10 com.instagram.common.session.UserSession) = (r4v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ea  */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -1981916006(0xffffffff89de5c9a, float:-5.3531638E-33)
            int r3 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r13)
            android.content.Intent r1 = r12.getIntent()
            r0 = 13
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Bundle r5 = r1.getBundleExtra(r0)
            if (r5 == 0) goto L_0x01ef
            r0 = 5106(0x13f2, float:7.155E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getString(r0)
            if (r2 == 0) goto L_0x01ef
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01ef
            X.08y r0 = X.09i.A0A
            X.0wW r4 = r0.A04(r5)
            r12.A00 = r4
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r10 = 1
            android.net.Uri r7 = X.0cp.A03(r2)
            X.0qQ.A07(r7)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.List r9 = r7.getPathSegments()
            X.0qQ.A0A(r9)
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r11 = r9.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "w"
            boolean r0 = r0.equalsIgnoreCase(r11)
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = "should_land_on_web"
            r2.putBoolean(r0, r10)
            java.lang.String r0 = "uri"
            r2.putParcelable(r0, r7)
        L_0x006c:
            r5.putAll(r2)
            r6 = 0
            java.lang.String r0 = "uri"
            android.os.Parcelable r2 = r5.getParcelable(r0)
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x00ea
            java.lang.String r0 = r2.toString()
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "should_land_on_web"
            boolean r0 = r5.getBoolean(r0)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r1 = "com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME"
            java.lang.String r0 = r5.getString(r1)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r5 = r5.getString(r1)
            if (r5 != 0) goto L_0x0098
            java.lang.String r5 = "url_handler"
        L_0x0098:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36318621412497732(0x81079800061944, double:3.0313806523891304E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r1 = r2.toString()
            X.2EG r0 = X.2EG.A1S
            X.FHB.A04(r12, r4, r0, r1, r5)
        L_0x00ae:
            r12.finish()
        L_0x00b1:
            r0 = -805085952(0xffffffffd0035d00, float:-8.8156406E9)
        L_0x00b4:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x00b8:
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession     // Catch:{ IllegalStateException -> 0x00e6 }
            if (r0 == 0) goto L_0x00e2
            r1 = r4
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ IllegalStateException -> 0x00e6 }
            if (r1 == 0) goto L_0x00e2
            com.instagram.inappbrowser.launcher.ExternalBrowserLauncher r0 = new com.instagram.inappbrowser.launcher.ExternalBrowserLauncher     // Catch:{ IllegalStateException -> 0x00e6 }
            r0.<init>(r12, r1)     // Catch:{ IllegalStateException -> 0x00e6 }
            X.Rwo r0 = r0.A01(r2)     // Catch:{ IllegalStateException -> 0x00e6 }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IllegalStateException -> 0x00e6 }
            r1.<init>(r0, r2)     // Catch:{ IllegalStateException -> 0x00e6 }
            r0 = 6
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IllegalStateException -> 0x00e6 }
            android.content.Intent r0 = r1.addCategory(r0)     // Catch:{ IllegalStateException -> 0x00e6 }
            boolean r0 = X.0kR.A0D(r12, r0)     // Catch:{ IllegalStateException -> 0x00e6 }
            if (r0 != 0) goto L_0x00ae
        L_0x00e2:
            X.FHB.A02(r12, r2, r4, r5)     // Catch:{ IllegalStateException -> 0x00e6 }
            goto L_0x00ae
        L_0x00e6:
            X.FHB.A02(r12, r2, r4, r5)
            goto L_0x00ae
        L_0x00ea:
            java.lang.String r0 = "destination"
            java.lang.String r7 = r5.getString(r0)
            java.lang.String r0 = "parameter"
            java.lang.String r8 = r5.getString(r0)
            java.lang.String r0 = "p"
            boolean r2 = r0.equalsIgnoreCase(r7)
            r0 = 4702(0x125e, float:6.589E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            if (r2 == 0) goto L_0x012d
            if (r8 == 0) goto L_0x012a
            int r0 = r8.length()
            if (r0 == 0) goto L_0x012a
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "https://instagram.com/p/%s"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            android.net.Uri r0 = X.0cp.A03(r0)
            X.0qQ.A07(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL"
            r5.putString(r0, r1)
            X.FHB.A08(r5, r12, r4)
            goto L_0x00b1
        L_0x012a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0151
        L_0x012d:
            java.lang.String r0 = "u"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0147
            if (r8 == 0) goto L_0x0142
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            r5.putString(r0, r8)
        L_0x0142:
            X.FHB.A0A(r5, r12, r4)
            goto L_0x00b1
        L_0x0147:
            java.lang.String r0 = "e"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x016f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0151:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0162;
                case 1: goto L_0x016c;
                case 2: goto L_0x0158;
                case 3: goto L_0x0158;
                case 4: goto L_0x0169;
                default: goto L_0x0158;
            }
        L_0x0158:
            java.lang.String r0 = "search"
        L_0x015a:
            r5.putString(r1, r0)
            X.FHB.A03(r12, r5)
            goto L_0x00b1
        L_0x0162:
            r0 = 3543(0xdd7, float:4.965E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x015a
        L_0x0169:
            java.lang.String r0 = "news"
            goto L_0x015a
        L_0x016c:
            java.lang.String r0 = "explore"
            goto L_0x015a
        L_0x016f:
            java.lang.String r0 = "n"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x017a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0151
        L_0x017a:
            java.lang.String r0 = "com.instagram.android.fragment.ARGUMENTS_KEY_SHORT_CODE"
            r5.putString(r0, r7)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.E2A r2 = new X.E2A
            r2.<init>()
            java.lang.String r1 = r4.getToken()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r5.putString(r0, r1)
            r2.setArguments(r5)
            X.6Yo r0 = new X.6Yo
            r0.<init>(r12, r4)
            r0.A0D(r2)
            r0.A0D = r6
            r0.A04()
            goto L_0x00b1
        L_0x01a2:
            int r0 = r9.size()
            java.lang.String r8 = "parameter"
            java.lang.String r6 = "destination"
            if (r0 <= r10) goto L_0x01e1
            java.lang.Object r0 = r9.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "p"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01e1
            r2.putString(r6, r1)
            int r1 = r9.size()
            r0 = 2
            if (r1 <= r0) goto L_0x01cd
            java.lang.Object r0 = r9.get(r0)
        L_0x01c8:
            java.lang.String r0 = (java.lang.String) r0
            r2.putString(r8, r0)
        L_0x01cd:
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "short_url"
            r2.putString(r0, r1)
            java.lang.String r1 = r7.getEncodedQuery()
            java.lang.String r0 = "encoded_query"
            r2.putString(r0, r1)
            goto L_0x006c
        L_0x01e1:
            r2.putString(r6, r11)
            int r0 = r9.size()
            if (r0 <= r10) goto L_0x01cd
            java.lang.Object r0 = r9.get(r10)
            goto L_0x01c8
        L_0x01ef:
            r12.finish()
            r0 = 1672531567(0x63b0ce6f, float:6.523004E21)
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igme.IgMeExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
