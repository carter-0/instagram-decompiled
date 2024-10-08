package X;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1rU  reason: invalid class name and case insensitive filesystem */
public final class C66991rU implements C20870X1w {
    public 1rN A00;
    public Executor A01;
    public ThreadPoolExecutor A02;
    public final Context A03;
    public final 1rR A04;
    public final Object A05 = new Object();
    public final C66981rT A06;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1rU.Cg2(X.1rN):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void Cg2(X.1rN r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1rU.Cg2(X.1rN):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66991rU.Cg2(X.1rN):void");
    }

    public static void A00(C66991rU r3) {
        synchronized (r3.A05) {
            r3.A00 = null;
            ThreadPoolExecutor threadPoolExecutor = r3.A02;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            r3.A01 = null;
            r3.A02 = null;
        }
    }

    public C66991rU(Context context, 1rR r3, C66981rT r4) {
        this.A03 = context.getApplicationContext();
        this.A04 = r3;
        this.A06 = r4;
    }
}
