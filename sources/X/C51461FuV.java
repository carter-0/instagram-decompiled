package X;

import android.content.Context;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.FuV  reason: case insensitive filesystem */
public final class C51461FuV implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C46398DeL A01;
    public final /* synthetic */ InstagramMainActivity A02;

    public C51461FuV(Context context, C46398DeL deL, InstagramMainActivity instagramMainActivity) {
        this.A02 = instagramMainActivity;
        this.A00 = context;
        this.A01 = deL;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000b: MOVE  (r1v4 X.2jU) = (r1v0 X.2jU)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void run() {
        /*
            r5 = this;
            com.instagram.mainactivity.InstagramMainActivity r2 = r5.A02
            androidx.fragment.app.Fragment r1 = com.instagram.mainactivity.InstagramMainActivity.A01(r2)
            boolean r0 = r1 instanceof X.C227532jU
            r4 = 0
            if (r0 == 0) goto L_0x0027
            X.2jU r1 = (X.C227532jU) r1
            if (r1 == 0) goto L_0x0027
            androidx.fragment.app.Fragment r1 = r1.A02()
        L_0x0013:
            boolean r0 = r1 instanceof X.AnonymousClass4DH
            if (r0 == 0) goto L_0x0018
            r4 = r1
        L_0x0018:
            android.content.Context r3 = r5.A00
            com.instagram.common.session.UserSession r2 = r2.A05
            r2.getClass()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.DeL r0 = r5.A01
            X.C46399DeM.A02(r3, r4, r0, r2, r1)
            return
        L_0x0027:
            r1 = r4
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51461FuV.run():void");
    }
}
