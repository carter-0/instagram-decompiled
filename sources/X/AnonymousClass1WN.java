package X;

import android.app.Application;

/* renamed from: X.1WN  reason: invalid class name */
public final class AnonymousClass1WN {
    public static AnonymousClass1WN A01;
    public static final AnonymousClass1WO A02 = new Object();
    public final Application A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1WN.A00(X.0wW):X.T7S, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final synchronized X.T7S A00(X.AnonymousClass0wW r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1WN.A00(X.0wW):X.T7S, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WN.A00(X.0wW):X.T7S");
    }

    public AnonymousClass1WN(Application application) {
        this.A00 = application;
    }

    public AnonymousClass1WN() {
    }
}
