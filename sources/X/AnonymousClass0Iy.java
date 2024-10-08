package X;

import android.os.Process;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Iy  reason: invalid class name */
public final class AnonymousClass0Iy {
    public long A00 = Long.MIN_VALUE;
    public Map A01 = new HashMap();
    public final AnonymousClass0J2 A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Iy.A00(int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final synchronized void A00(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Iy.A00(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Iy.A00(int):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.0J2] */
    public AnonymousClass0Iy() {
        int myPid = Process.myPid();
        String A002 = AnonymousClass0J3.A00(myPid);
        A002 = A002 == null ? "" : A002;
        ? obj = new Object();
        obj.A00 = myPid;
        obj.A01 = A002;
        this.A02 = obj;
    }
}
