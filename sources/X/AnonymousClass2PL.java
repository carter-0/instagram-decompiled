package X;

import java.util.Map;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2PL  reason: invalid class name */
public final class AnonymousClass2PL {
    public static AnonymousClass2PL A06;
    public long A00;
    public AnonymousClass2PQ A01;
    public AnonymousClass2PQ A02;
    public AnonymousClass2PQ A03;
    public Map A04;
    public final 2PN A05;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2PL.<init>(X.2PN):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2PL(X.2PN r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2PL.<init>(X.2PN):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PL.<init>(X.2PN):void");
    }

    public static synchronized void A00(AnonymousClass2PQ r2, AnonymousClass2PL r3, int i, long j) {
        synchronized (r3) {
            r2.A01 += j;
            r2.A00 += i;
            AnonymousClass2PQ r22 = r3.A01;
            r22.A01 += j;
            r22.A00 += i;
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2PL.A01(android.graphics.Bitmap):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A01(android.graphics.Bitmap r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2PL.A01(android.graphics.Bitmap):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PL.A01(android.graphics.Bitmap):void");
    }
}
