package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: X.07t  reason: invalid class name */
public final class AnonymousClass07t {
    public static AnonymousClass07t A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final Handler A03;
    public final HashMap A04 = new HashMap();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.07t.A01(android.content.BroadcastReceiver, android.content.IntentFilter):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A01(android.content.BroadcastReceiver r1, android.content.IntentFilter r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.07t.A01(android.content.BroadcastReceiver, android.content.IntentFilter):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07t.A01(android.content.BroadcastReceiver, android.content.IntentFilter):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.07t.A02(android.content.Intent):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A02(android.content.Intent r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.07t.A02(android.content.Intent):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07t.A02(android.content.Intent):void");
    }

    public static AnonymousClass07t A00(Context context) {
        AnonymousClass07t r1;
        synchronized (A06) {
            r1 = A05;
            if (r1 == null) {
                r1 = new AnonymousClass07t(context.getApplicationContext());
                A05 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass07t(Context context) {
        this.A00 = context;
        this.A03 = new AnonymousClass07q(context.getMainLooper(), this);
    }
}
