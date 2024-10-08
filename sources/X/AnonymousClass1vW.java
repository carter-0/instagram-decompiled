package X;

import com.facebook.realtime.common.appstate.AppStateGetter;
import com.facebook.realtime.common.appstate.AppStateSyncer;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1vW  reason: invalid class name */
public final class AnonymousClass1vW implements C61110lV, AnonymousClass0qK {
    public static AnonymousClass0eM A02 = AnonymousClass0eN.A01(C67651va.A00);
    public final AppStateSyncer A00;
    public final AppStateGetter A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1vW.<init>(X.14i):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass1vW(X.14i r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1vW.<init>(X.14i):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1vW.<init>(X.14i):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1vW.onConnectionChanged(android.net.NetworkInfo):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onConnectionChanged(android.net.NetworkInfo r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1vW.onConnectionChanged(android.net.NetworkInfo):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1vW.onConnectionChanged(android.net.NetworkInfo):void");
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(1983405135);
        this.A00.notifyForegroundStateChange(C239243Fq.Background);
        AnonymousClass0fD.A0A(-1972414089, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-1535516313);
        this.A00.notifyForegroundStateChange(C239243Fq.Foreground);
        AnonymousClass0fD.A0A(129865501, A03);
    }
}
