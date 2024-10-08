package X;

/* renamed from: X.1F4  reason: invalid class name */
public final class AnonymousClass1F4 extends 1BD {
    public final 1B5 A00;
    public final AnonymousClass1F7 A01 = AnonymousClass1F7.A00();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1F4.A01(android.util.Pair):java.io.File, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.io.File A01(android.util.Pair r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1F4.A01(android.util.Pair):java.io.File, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1F4.A01(android.util.Pair):java.io.File");
    }

    public AnonymousClass1F4(1B5 r2) {
        super(r2.A05);
        this.A00 = r2;
    }
}
