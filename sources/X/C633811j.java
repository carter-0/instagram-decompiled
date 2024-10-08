package X;

import android.app.Activity;

/* renamed from: X.11j  reason: invalid class name and case insensitive filesystem */
public abstract class C633811j {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.11j.A00(android.app.Activity):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A00(android.app.Activity r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.11j.A00(android.app.Activity):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C633811j.A00(android.app.Activity):void");
    }

    public static final void A01(Activity activity, 07T r2) {
        if (activity instanceof AnonymousClass07Z) {
            0h9 lifecycle = ((AnonymousClass07Z) activity).getLifecycle();
            if (lifecycle instanceof 0h9) {
                lifecycle.A0B(r2);
            }
        }
    }
}
