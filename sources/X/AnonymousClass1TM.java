package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: X.1TM  reason: invalid class name */
public final class AnonymousClass1TM {
    public static AnonymousClass1TM A05;
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public final Object A02 = new Object();
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A04 = new 1TN(this);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1TM.A00(X.2hw):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(X.C226842hw r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1TM.A00(X.2hw):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TM.A00(X.2hw):void");
    }
}
