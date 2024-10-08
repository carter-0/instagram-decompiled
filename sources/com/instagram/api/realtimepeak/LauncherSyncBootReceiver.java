package com.instagram.api.realtimepeak;

import android.content.BroadcastReceiver;

public final class LauncherSyncBootReceiver extends BroadcastReceiver {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0026: MOVE  (r1v1 com.instagram.common.session.UserSession) = (r1v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            r0 = -237503784(0xfffffffff1d7fad8, float:-2.1389609E30)
            int r4 = X.AnonymousClass0fD.A01(r0)
            X.AnonymousClass0fQ.A01(r5, r6, r7)
            X.AnonymousClass7TG.A1N(r6, r7)
            java.lang.String r0 = r7.getAction()
            boolean r0 = X.C49787F6v.A01(r0)
            if (r0 != 0) goto L_0x001e
            r0 = -458661443(0xffffffffe4a961bd, float:-2.499634E22)
        L_0x001a:
            X.AnonymousClass0fD.A0E(r0, r4, r7)
            return
        L_0x001e:
            X.0wW r1 = X.DbS.A0S(r5)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0040
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0040
            X.1Av r0 = X.1Au.A00(r1)
            r2 = 0
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "mobile_config_last_sync_time_peak"
            r1.E5c(r0, r2)
            r1.apply()
            r0 = 469249524(0x1bf82df4, float:4.1057855E-22)
            goto L_0x001a
        L_0x0040:
            r0 = -8011186(0xffffffffff85c24e, float:NaN)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.realtimepeak.LauncherSyncBootReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
