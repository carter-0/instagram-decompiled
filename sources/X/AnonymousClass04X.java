package X;

import android.view.View;

/* renamed from: X.04X  reason: invalid class name */
public final class AnonymousClass04X implements View.OnApplyWindowInsetsListener {
    public 04k A00;
    public final 04T A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.04X.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r1, android.view.WindowInsets r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.04X.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04X.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }

    public AnonymousClass04X(View view, 04T r4) {
        04k r0;
        this.A01 = r4;
        04k A002 = C586203k.A00(view);
        if (A002 != null) {
            r0 = new AnonymousClass04f(A002).A00.A00();
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
