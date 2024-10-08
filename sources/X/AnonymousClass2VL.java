package X;

import android.os.Looper;

/* renamed from: X.2VL  reason: invalid class name */
public final class AnonymousClass2VL {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2VL.A00():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2VL.A00():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2VL.A00():void");
    }

    public static final boolean A01() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
