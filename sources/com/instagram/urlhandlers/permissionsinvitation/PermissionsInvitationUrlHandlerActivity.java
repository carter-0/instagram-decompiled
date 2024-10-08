package com.instagram.urlhandlers.permissionsinvitation;

import X.AnonymousClass7TF;
import android.os.Bundle;
import android.os.Handler;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class PermissionsInvitationUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final Handler A00 = AnonymousClass7TF.A0D();

    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0018: MOVE  (r0v3 com.instagram.common.session.UserSession) = (r0v2 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onPostCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r3 = r22
            r0 = r23
            super.onPostCreate(r0)
            X.0hq r1 = r3.getSupportFragmentManager()
            r0 = 19
            X.C50128FQl.A00(r1, r3, r0)
            X.0wW r0 = X.DbS.A0S(r3)
            boolean r1 = r0 instanceof com.instagram.common.session.UserSession
            if (r1 == 0) goto L_0x008c
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            if (r0 == 0) goto L_0x008c
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r1 = "surface"
            java.lang.String r7 = r2.getStringExtra(r1)
            if (r7 != 0) goto L_0x002a
            java.lang.String r7 = "notification"
        L_0x002a:
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r1 = "entry_point"
            java.lang.String r6 = r2.getStringExtra(r1)
            if (r6 != 0) goto L_0x0038
            java.lang.String r6 = "deeplink"
        L_0x0038:
            java.lang.String r9 = X.AnonymousClass7TG.A0j()
            java.lang.String r8 = "account_delegate_invite"
            r10 = 13
            X.QP5 r5 = new X.QP5
            r5.<init>(r6, r7, r8, r9, r10)
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r1 = "component"
            java.lang.String r6 = r2.getStringExtra(r1)
            java.lang.String r2 = "activity_feed"
            r13 = 0
            java.lang.String r1 = "push_notification"
            r21 = 1
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.util.List r2 = X.0sr.A1P(r1)
            java.lang.String r1 = r5.A00
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0071
            java.lang.String r9 = "tap"
            java.lang.String r10 = "deeplink"
            r12 = 0
            r7 = r5
            r8 = r0
            r11 = r6
            X.C49919FEu.A00(r7, r8, r9, r10, r11, r12)
        L_0x0071:
            boolean r1 = X.C324536zU.A01(r0)
            if (r1 != 0) goto L_0x008d
            java.lang.String r2 = "not_in_gating"
        L_0x0079:
            X.3GP r0 = X.FFO.A01(r3, r2)
            android.os.Handler r4 = r3.A00
            X.Frt r2 = new X.Frt
            r2.<init>(r0)
        L_0x0084:
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r2, r0)
            r3.finish()
        L_0x008c:
            return
        L_0x008d:
            boolean r1 = X.C324536zU.A00(r0)
            if (r1 == 0) goto L_0x00a9
            X.FEu r2 = X.C49919FEu.A00
            java.lang.String r1 = "feature_blocked_invalid_session"
            r2.A02(r5, r0, r6, r1)
            java.lang.String r2 = "ig_permissions_invitation"
            r1 = 0
            X.3GP r0 = X.FFO.A00(r3, r0, r2, r1)
            android.os.Handler r4 = r3.A00
            X.Frs r2 = new X.Frs
            r2.<init>(r0)
            goto L_0x0084
        L_0x00a9:
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r7 = "id"
            java.lang.String r4 = r1.getStringExtra(r7)
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r1 = "code"
            java.lang.String r19 = r2.getStringExtra(r1)
            if (r4 == 0) goto L_0x0115
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0115
            if (r19 == 0) goto L_0x0115
            int r1 = r19.length()
            if (r1 == 0) goto L_0x0115
            r14 = 0
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            X.1vR r8 = X.DbU.A0J(r2, r7, r4)
            java.util.Map r10 = r2.getParamsCopy()
            java.util.Map r11 = r1.getParamsCopy()
            java.lang.Class<X.BxC> r12 = X.C43374BxC.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGPermissionsInviteValidityQuery"
            java.lang.String r17 = "xig_encrypted_shared_account_access_info"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 0
            X.1Ef r7 = r7.setFreshCacheAgeMs(r1)
            X.1Ef r2 = r7.setMaxToleratedCacheAgeMs(r1)
            X.ECC r1 = new X.ECC
            r17 = r3
            r18 = r4
            r20 = r6
            r14 = r1
            r15 = r5
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.1vn r0 = X.1vm.A01(r0)
            r0.A06(r2, r1)
            return
        L_0x0115:
            X.FEu r1 = X.C49919FEu.A00
            java.lang.String r2 = "missing_required_parameters"
            r1.A02(r5, r0, r6, r2)
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity.onPostCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity, android.app.Activity] */
    public final void finish() {
        PermissionsInvitationUrlHandlerActivity.super.finish();
        overridePendingTransition(0, 0);
    }
}
