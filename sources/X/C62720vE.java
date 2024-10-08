package X;

import android.os.SystemClock;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0vE  reason: invalid class name and case insensitive filesystem */
public final class C62720vE extends 0ng {
    public final 0ng A00;
    public final /* synthetic */ C62710vD A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0vE.<init>(X.0ng, X.0vD):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C62720vE(X.0ng r1, X.C62710vD r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0vE.<init>(X.0ng, X.0vD):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62720vE.<init>(X.0ng, X.0vD):void");
    }

    public final void run() {
        C62710vD r3 = this.A01;
        r3.A01.set(SystemClock.elapsedRealtime());
        SystemClock.currentThreadTimeMillis();
        this.A00.run();
        SystemClock.currentThreadTimeMillis();
        SystemClock.elapsedRealtime();
        synchronized (r3) {
            r3.A00 = false;
        }
        C62710vD.A00(r3);
    }

    public final String toString() {
        return this.A00.toString();
    }
}
