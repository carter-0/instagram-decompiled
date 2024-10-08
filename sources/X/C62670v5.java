package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0v5  reason: invalid class name and case insensitive filesystem */
public final class C62670v5 implements AnonymousClass0iw, C61110lV {
    public static C62670v5 A09 = null;
    public static boolean A0A = false;
    public static final C61940qJ A0B = new Object();
    public static final Collection A0C = new ConcurrentLinkedQueue();
    public static final String __redex_internal_original_name = "ConnectionChangeReporter";
    public BroadcastReceiver A00;
    public boolean A01;
    public IntentFilter A02;
    public NetworkInfo A03;
    public boolean A04;
    public final Context A05;
    public final 0np A06;
    public final Handler A07;
    public volatile NetworkInfo A08;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0v5.<init>(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C62670v5(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0v5.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62670v5.<init>(android.content.Context):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0v5.A00(android.content.Context):android.net.NetworkInfo, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final android.net.NetworkInfo A00(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0v5.A00(android.content.Context):android.net.NetworkInfo, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62670v5.A00(android.content.Context):android.net.NetworkInfo");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0v5.A02(X.0v5):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A02(X.C62670v5 r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0v5.A02(X.0v5):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62670v5.A02(X.0v5):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0v5.onAppBackgrounded():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onAppBackgrounded() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0v5.onAppBackgrounded():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62670v5.onAppBackgrounded():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0v5.onAppForegrounded():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onAppForegrounded() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0v5.onAppForegrounded():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62670v5.onAppForegrounded():void");
    }

    public final NetworkInfo A03() {
        if (this.A01) {
            this.A08 = A00(this.A05);
        }
        return this.A08;
    }

    public static final void A01(Context context, C62670v5 r4) {
        NetworkInfo A002 = A00(context);
        r4.A08 = A002;
        if (A002 != null && A002.getState() == NetworkInfo.State.DISCONNECTED) {
            r4.A04 = true;
        }
        NetworkInfo networkInfo = r4.A03;
        if (networkInfo != null ? A002 != null && networkInfo.getType() == A002.getType() && networkInfo.getSubtype() == A002.getSubtype() : A002 == null) {
            if (!r4.A04) {
                return;
            }
        }
        r4.A03 = A002;
        Collection<AnonymousClass0qK> collection = A0C;
        if (!collection.isEmpty()) {
            for (AnonymousClass0qK onConnectionChanged : collection) {
                onConnectionChanged.onConnectionChanged(A002);
            }
        }
        r4.A04 = false;
    }

    public final String getModuleName() {
        return "device";
    }
}
