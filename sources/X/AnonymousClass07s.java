package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.07s  reason: invalid class name */
public final class AnonymousClass07s {
    public boolean A00;
    public final BroadcastReceiver A01;
    public final IntentFilter A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.07s.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.07s.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07s.toString():java.lang.String");
    }

    public AnonymousClass07s(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.A02 = intentFilter;
        this.A01 = broadcastReceiver;
    }
}
