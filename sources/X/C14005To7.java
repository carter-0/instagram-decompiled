package X;

import android.os.Bundle;

/* renamed from: X.To7  reason: case insensitive filesystem */
public final class C14005To7 {
    public 0jB A00 = new 0jB();

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000a: MOVE  (r1v1 X.0jB) = (r1v0 X.0jB)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A00(android.os.Bundle r3) {
        /*
            r2 = this;
            java.lang.String r0 = "extra_flow_analytics_ig_extras"
            java.io.Serializable r1 = r3.getSerializable(r0)
            boolean r0 = r1 instanceof X.0jB
            if (r0 == 0) goto L_0x0013
            X.0jB r1 = (X.0jB) r1
            if (r1 == 0) goto L_0x0013
            X.0jB r0 = r2.A00
            r0.A06(r1)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14005To7.A00(android.os.Bundle):void");
    }

    public final void A01(Bundle bundle) {
        bundle.putSerializable("extra_flow_analytics_ig_extras", this.A00);
    }

    public final void A02(0jB r2) {
        if (r2 != null && r2 != this.A00) {
            this.A00 = r2;
        }
    }
}
