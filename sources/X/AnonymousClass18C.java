package X;

import android.os.Handler;
import android.os.IBinder;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.18C  reason: invalid class name */
public final class AnonymousClass18C extends 0D3 implements IBinder.DeathRecipient {
    public boolean A00;
    public final Handler A01;
    public final 0Lp A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.18C.<init>(X.0Rt):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass18C(X.AnonymousClass0Rt r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.18C.<init>(X.0Rt):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18C.<init>(X.0Rt):void");
    }

    public final void binderDied() {
        this.A00 = true;
    }

    public final String getName() {
        return "ActivityThreadProtector";
    }

    public final void CMP() {
    }
}
