package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* renamed from: X.1MT  reason: invalid class name */
public final class AnonymousClass1MT implements C61110lV {
    public static AnonymousClass1MT A06;
    public boolean A00;
    public boolean A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final 0ng A03 = new AnonymousClass1MW(this);
    public final 0xm A04;
    public final Semaphore A05;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1MT.onAppBackgrounded():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: null in method: X.1MT.onAppBackgrounded():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MT.onAppBackgrounded():void");
    }

    public AnonymousClass1MT(0xm r3) {
        this.A04 = r3;
        this.A05 = new Semaphore(1);
        14i.A03(15Y.A03, this);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(346195037, AnonymousClass0fD.A03(-1108619083));
    }
}
