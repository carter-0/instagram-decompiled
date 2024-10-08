package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0Ou  reason: invalid class name */
public final class AnonymousClass0Ou extends HandlerThread {
    public final /* synthetic */ 07w A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Ou.<init>(X.07w):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass0Ou(X.07w r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Ou.<init>(X.07w):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ou.<init>(X.07w):void");
    }

    public final void onLooperPrepared() {
        Looper looper = getLooper();
        if (looper != null) {
            this.A00.A0V = new Handler(looper);
        }
    }
}
