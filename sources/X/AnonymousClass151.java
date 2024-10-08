package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.151  reason: invalid class name */
public final class AnonymousClass151 extends Handler {
    public 14y A00;
    public final 150 A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.151.handleMessage(android.os.Message):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void handleMessage(android.os.Message r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.151.handleMessage(android.os.Message):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass151.handleMessage(android.os.Message):void");
    }

    public AnonymousClass151(Looper looper, 150 r2, 14y r3) {
        super(looper);
        this.A00 = r3;
        this.A01 = r2;
    }
}
