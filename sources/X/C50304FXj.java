package X;

import com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity;

/* renamed from: X.FXj  reason: case insensitive filesystem */
public final class C50304FXj implements C61110lV {
    public final /* synthetic */ DirectPushNotificationActivity A00;

    public C50304FXj(DirectPushNotificationActivity directPushNotificationActivity) {
        this.A00 = directPushNotificationActivity;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0011: MOVE  (r1v1 com.instagram.common.session.UserSession) = (r1v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onAppBackgrounded() {
        /*
            r3 = this;
            r0 = 188755714(0xb402f02, float:3.701322E-32)
            int r2 = X.AnonymousClass0fD.A03(r0)
            com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity r0 = r3.A00
            X.0wW r1 = r0.getSession()
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0023
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0023
            X.2Dm r0 = X.1bJ.A00(r1)
            r0.EK3()
            r0 = -258320904(0xfffffffff09a55f8, float:-3.8211697E29)
        L_0x001f:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0023:
            r0 = -1125736759(0xffffffffbce69ec9, float:-0.028151887)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50304FXj.onAppBackgrounded():void");
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(704467947, AnonymousClass0fD.A03(-1335985677));
    }
}
