package com.instagram.urlhandlers.permissionsremovedaccounts;

import X.AnonymousClass7TF;
import android.os.Bundle;
import android.os.Handler;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class PermissionsRemovedAccountsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final Handler A00 = AnonymousClass7TF.A0D();

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.permissionsremovedaccounts.PermissionsRemovedAccountsUrlHandlerActivity, android.app.Activity] */
    public final void finish() {
        PermissionsRemovedAccountsUrlHandlerActivity.super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.2ZQ] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0015: MOVE  (r3v1 com.instagram.common.session.UserSession) = (r3v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onPostCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onPostCreate(r12)
            X.0hq r1 = r11.getSupportFragmentManager()
            r0 = 21
            X.C50128FQl.A00(r1, r11, r0)
            X.0wW r3 = X.DbS.A0S(r11)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            r2 = 0
            if (r0 == 0) goto L_0x0061
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            if (r3 == 0) goto L_0x0061
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "surface"
            java.lang.String r7 = r1.getStringExtra(r0)
            if (r7 != 0) goto L_0x0027
            java.lang.String r7 = "notification"
        L_0x0027:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "entry_point"
            java.lang.String r6 = r1.getStringExtra(r0)
            if (r6 != 0) goto L_0x0035
            java.lang.String r6 = "deeplink"
        L_0x0035:
            java.lang.String r9 = X.AnonymousClass7TG.A0j()
            java.lang.String r8 = "removed_accounts"
            r10 = 13
            X.QP5 r5 = new X.QP5
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r4 = com.instagram.urlhandler.UserSessionUrlHandlerActivity.A00(r11, r5, r3)
            boolean r0 = X.C324536zU.A01(r3)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "not_in_gating"
            X.3GP r0 = X.FFO.A01(r11, r0)
            android.os.Handler r3 = r11.A00
            X.Frx r2 = new X.Frx
            r2.<init>(r0)
        L_0x0059:
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x005e:
            r11.finish()
        L_0x0061:
            return
        L_0x0062:
            boolean r0 = X.C324536zU.A00(r3)
            if (r0 == 0) goto L_0x007d
            X.FEu r1 = X.C49919FEu.A00
            java.lang.String r0 = "feature_blocked_invalid_session"
            r1.A02(r5, r3, r4, r0)
            java.lang.String r0 = "ig_permissions_removed_accounts_surface"
            X.3GP r0 = X.FFO.A00(r11, r3, r0, r2)
            android.os.Handler r3 = r11.A00
            X.Frw r2 = new X.Frw
            r2.<init>(r0)
            goto L_0x0059
        L_0x007d:
            X.2ZQ r1 = X.C71172bH.A00()
            boolean r0 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0088
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
        L_0x0088:
            X.FEu r0 = X.C49919FEu.A00
            r0.A01(r5, r3, r4)
            r0 = r2
            if (r2 != 0) goto L_0x0091
            r0 = r11
        L_0x0091:
            X.C48951Emp.A00(r0, r5, r3)
            if (r2 == 0) goto L_0x0061
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.permissionsremovedaccounts.PermissionsRemovedAccountsUrlHandlerActivity.onPostCreate(android.os.Bundle):void");
    }
}
