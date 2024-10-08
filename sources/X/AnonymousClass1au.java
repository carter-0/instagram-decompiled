package X;

import android.content.Context;

/* renamed from: X.1au  reason: invalid class name */
public final class AnonymousClass1au {
    public static AnonymousClass1au A01;
    public final Context A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1au.A01(android.net.Uri):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A01(android.net.Uri r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1au.A01(android.net.Uri):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1au.A01(android.net.Uri):void");
    }

    public static synchronized AnonymousClass1au A00(Context context) {
        AnonymousClass1au r1;
        synchronized (AnonymousClass1au.class) {
            r1 = A01;
            if (r1 == null) {
                r1 = new AnonymousClass1au(context.getApplicationContext());
                A01 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass1au(Context context) {
        this.A00 = context;
    }
}
