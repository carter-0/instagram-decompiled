package com.instagram.direct.share.choosertarget;

import androidx.sharetarget.ChooserTargetServiceCompat;

public final class DirectChooserTargetService extends ChooserTargetServiceCompat {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000d: MOVE  (r6v1 com.instagram.common.session.UserSession) = (r6v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final java.util.List onGetChooserTargets(android.content.ComponentName r15, android.content.IntentFilter r16) {
        /*
            r14 = this;
            r0 = 0
            r12 = r15
            X.0qQ.A0B(r15, r0)
            X.0wW r6 = X.DbS.A0S(r14)
            boolean r0 = r6 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x008b
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            if (r6 == 0) goto L_0x008b
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.2Dm r0 = X.1bJ.A00(r6)
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r1 = r0.A0C
            X.43A r0 = X.AnonymousClass43A.A00
            java.util.List r4 = r1.A0F(r0)
            r3 = 0
            int r1 = r4.size()
            r0 = 8
            int r2 = java.lang.Math.min(r1, r0)
        L_0x002e:
            if (r3 >= r2) goto L_0x008d
            java.lang.Object r7 = r4.get(r3)
            X.2Ep r7 = (X.AnonymousClass2Ep) r7
            java.lang.String r0 = r7.C6C()
            if (r0 == 0) goto L_0x007b
            java.lang.String r9 = r7.C6f()
            java.util.List r0 = r7.BRZ()
            com.instagram.common.typedurl.ImageUrl r8 = X.DcW.A00(r6, r0)
            X.1NK r1 = X.1NK.A00()
            if (r8 == 0) goto L_0x0086
            java.lang.String r0 = "DirectChooserTargetService"
            android.graphics.Bitmap r0 = r1.A0I(r8, r0)
            if (r0 == 0) goto L_0x007e
            android.graphics.Bitmap r0 = X.1MF.A05(r0)
            if (r0 == 0) goto L_0x007e
            android.graphics.drawable.Icon r10 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L_0x0060:
            X.0qQ.A07(r10)
            android.os.Bundle r13 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r7.C6C()
            java.lang.String r0 = "com.instagram.share.choosertarget.DirectChooserTargetService.THREAD_ID"
            r13.putString(r0, r1)
            r11 = 1063675494(0x3f666666, float:0.9)
            android.service.chooser.ChooserTarget r8 = new android.service.chooser.ChooserTarget
            r8.<init>(r9, r10, r11, r12, r13)
            r5.add(r8)
        L_0x007b:
            int r3 = r3 + 1
            goto L_0x002e
        L_0x007e:
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            android.graphics.drawable.Icon r10 = android.graphics.drawable.Icon.createWithResource(r14, r0)
            goto L_0x0060
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x008b:
            X.0sn r5 = X.0sn.A00
        L_0x008d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.choosertarget.DirectChooserTargetService.onGetChooserTargets(android.content.ComponentName, android.content.IntentFilter):java.util.List");
    }
}
