package X;

import java.util.concurrent.ArrayBlockingQueue;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0m5  reason: invalid class name and case insensitive filesystem */
public final class C61240m5 extends Thread {
    public static final C61240m5 A02;
    public final 0l2 A00;
    public final ArrayBlockingQueue A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0m5.run():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void run() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0m5.run():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61240m5.run():void");
    }

    static {
        C61240m5 r0 = new C61240m5();
        A02 = r0;
        r0.start();
    }
}
