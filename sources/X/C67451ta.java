package X;

import com.facebook.realtime.common.appstate.AppStateGetter;
import com.facebook.realtime.common.appstate.AppStateSyncer;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1ta  reason: invalid class name and case insensitive filesystem */
public final class C67451ta implements C61110lV {
    public static AnonymousClass0eM A02 = AnonymousClass0eN.A01(C67461tb.A00);
    public final AppStateGetter A00;
    public final AppStateSyncer A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1ta.<init>(X.14i):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C67451ta(X.14i r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1ta.<init>(X.14i):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67451ta.<init>(X.14i):void");
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1164979185);
        this.A01.notifyForegroundStateChange(C239243Fq.Background);
        AnonymousClass0fD.A0A(1436445369, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1715122237);
        this.A01.notifyForegroundStateChange(C239243Fq.Foreground);
        AnonymousClass0fD.A0A(-1470158385, A03);
    }
}
