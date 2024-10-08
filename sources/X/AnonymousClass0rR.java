package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0rR  reason: invalid class name */
public final class AnonymousClass0rR extends AnonymousClass076 {
    public final 0rK A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0rR.A05(android.view.ViewGroup):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A05(android.view.ViewGroup r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0rR.A05(android.view.ViewGroup):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0rR.A05(android.view.ViewGroup):void");
    }

    public final void A04(ViewGroup viewGroup) {
        0hm r1 = this.A00.A00;
        View view = r1.A07.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        r1.A02(this);
        0hq.A0I(2);
    }

    public AnonymousClass0rR(0rK r1) {
        this.A00 = r1;
    }
}
