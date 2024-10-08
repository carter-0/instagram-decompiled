package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3Lw  reason: invalid class name and case insensitive filesystem */
public final class C240693Lw {
    public static final C240693Lw A00 = new Object();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.3Lx, java.lang.Object] */
    public final void A00(View view) {
        WeakReference weakReference = new WeakReference(view);
        2el A002 = AnonymousClass2hM.A00(view);
        if (A002 != null) {
            ? obj = new Object();
            obj.A01 = false;
            obj.A00 = "unknown";
            String valueOf = String.valueOf(hashCode());
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r1 = new C2354830a((Object) null, obj, valueOf);
            r1.A00(new C240713Ly(weakReference));
            A002.A05(view, r1.A01());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0016: MOVE  (r1v2 X.0iw) = (r1v1 X.0iw)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A01(android.view.View r4) {
        /*
            r3 = this;
            X.2hO r0 = X.C226592hN.A00(r4)
            X.2el r0 = X.AnonymousClass2hM.A01(r0)
            if (r0 == 0) goto L_0x000d
            r0.A04(r4)
        L_0x000d:
            r2 = 0
            androidx.fragment.app.Fragment r1 = X.0hq.A01(r4)     // Catch:{ IllegalStateException -> 0x001e }
            boolean r0 = r1 instanceof X.AnonymousClass0iw     // Catch:{ IllegalStateException -> 0x001e }
            if (r0 == 0) goto L_0x002d
            X.0iw r1 = (X.AnonymousClass0iw) r1     // Catch:{ IllegalStateException -> 0x001e }
            if (r1 == 0) goto L_0x002d
            java.lang.String r2 = r1.getModuleName()     // Catch:{ IllegalStateException -> 0x001e }
        L_0x001e:
            if (r2 == 0) goto L_0x002d
            X.1Jk r1 = X.1Jk.A08
            int r0 = r4.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A0I(r0, r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240693Lw.A01(android.view.View):void");
    }
}
