package X;

import android.app.Activity;

/* renamed from: X.2Y8  reason: invalid class name */
public abstract class AnonymousClass2Y8 {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2Y8.A01(android.app.Activity):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final boolean A01(android.app.Activity r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2Y8.A01(android.app.Activity):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Y8.A01(android.app.Activity):boolean");
    }

    public static final void A00(Activity activity) {
        int i = 1;
        if (A01(activity)) {
            i = 13;
        }
        0nY.A00().ATE(new AnonymousClass2YI(activity, i));
    }
}
