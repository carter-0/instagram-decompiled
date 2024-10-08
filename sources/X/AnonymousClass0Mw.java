package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0Mw  reason: invalid class name */
public final class AnonymousClass0Mw {
    public static 0Ms A00;
    public static Executor A01 = Executors.newSingleThreadExecutor();
    public static List A02 = new ArrayList();
    public static final 0Ms A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Mw.A00(X.0Ms):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized void A00(X.0Ms r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Mw.A00(X.0Ms):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Mw.A00(X.0Ms):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Mw.A01(X.0Mv):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized void A01(X.AnonymousClass0Mv r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Mw.A01(X.0Mv):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Mw.A01(X.0Mv):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0Ms] */
    static {
        ? obj = new Object();
        A03 = obj;
        A00 = obj;
    }
}
