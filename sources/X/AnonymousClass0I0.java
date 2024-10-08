package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.0I0  reason: invalid class name */
public abstract class AnonymousClass0I0 implements AnonymousClass0Rt {
    public Handler A00;
    public final Context A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0I0.Ael():android.os.Handler, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.os.Handler Ael() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0I0.Ael():android.os.Handler, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0I0.Ael():android.os.Handler");
    }

    public boolean CSZ() {
        return false;
    }

    public AnonymousClass0I0(Context context) {
        this.A01 = context.getApplicationContext();
    }
}
