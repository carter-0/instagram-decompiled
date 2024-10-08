package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1N1  reason: invalid class name */
public final class AnonymousClass1N1 implements AnonymousClass1N3 {
    public 1N8 A00;
    public final 1DI A01;
    public final 0lg A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1N1.<init>(X.0lg):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass1N1(X.0lg r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1N1.<init>(X.0lg):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N1.<init>(X.0lg):void");
    }

    public final synchronized void onCellIdentityChanged(1N8 r2) {
        this.A00 = r2;
    }

    public final synchronized void onCellSignalStrengthChanged(1EK r1) {
    }
}
