package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.07q  reason: invalid class name */
public final class AnonymousClass07q extends Handler {
    public final /* synthetic */ AnonymousClass07t A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.07q.handleMessage(android.os.Message):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void handleMessage(android.os.Message r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.07q.handleMessage(android.os.Message):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07q.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass07q(Looper looper, AnonymousClass07t r2) {
        super(looper);
        this.A00 = r2;
    }
}
