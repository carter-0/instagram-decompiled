package com.instagram.urlhandlers.opal;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.modal.ModalActivity;

public final class OpalUrlHandlerActivity extends ModalActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.modal.ModalActivity, com.instagram.urlhandlers.opal.OpalUrlHandlerActivity, android.content.Context, java.lang.Object, android.app.Activity] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x006d: MOVE  (r4v2 androidx.fragment.app.FragmentActivity) = (r4v1 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -143739147(0xfffffffff76eb6f5, float:-4.8417088E33)
            int r1 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r12)
            android.os.Bundle r4 = X.DbX.A0A(r11)
            if (r4 == 0) goto L_0x007e
            java.lang.String r3 = "original_url"
            java.lang.String r0 = r4.getString(r3)
            if (r0 == 0) goto L_0x007e
            X.0wW r5 = X.DbS.A0S(r11)
            boolean r0 = r5 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0098
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = r4.getString(r3)
            if (r2 == 0) goto L_0x007e
            int r0 = r2.length()
            if (r0 == 0) goto L_0x007e
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x0088
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.String r2 = r3.getHost()
            java.lang.String r0 = "opal_profile"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "entry_type"
            java.lang.String r2 = r3.getQueryParameter(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.String r0 = "pull"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0065
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            java.lang.String r0 = "fab"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0065
            r6 = 0
        L_0x0065:
            X.2ZQ r4 = X.C71172bH.A00()
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0081
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            if (r4 == 0) goto L_0x0081
            X.FBp r3 = X.DbU.A0d()
            java.lang.String r7 = r5.A06
            java.lang.String r8 = "qp_megaphone"
            r9 = 0
            r10 = r9
            r3.A04(r4, r5, r6, r7, r8, r9, r10)
        L_0x007e:
            r11.finish()
        L_0x0081:
            r0 = -1796113389(0xffffffff94f17c13, float:-2.438372E-26)
            X.AnonymousClass0fD.A07(r0, r1)
            return
        L_0x0088:
            java.lang.String r0 = r4.getString(r3)
            if (r0 == 0) goto L_0x0081
            android.net.Uri r0 = X.0cp.A03(r0)
            if (r0 == 0) goto L_0x0081
            X.DbZ.A0v(r11, r0)
            goto L_0x0081
        L_0x0098:
            X.FFQ.A01(r11, r4, r5)
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.opal.OpalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
