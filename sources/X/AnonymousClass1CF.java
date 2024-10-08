package X;

/* renamed from: X.1CF  reason: invalid class name */
public final class AnonymousClass1CF {
    public int A00;
    public int A01;
    public final 1CE A02;
    public final int A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1CF.A00(X.1QU):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final synchronized void A00(X.1QU r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1CF.A00(X.1QU):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CF.A00(X.1QU):void");
    }

    public final synchronized boolean A01() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A01 + this.A00 < this.A03) {
                z = true;
            }
        }
        return z;
    }

    public AnonymousClass1CF(1CE r1, int i) {
        this.A02 = r1;
        this.A03 = i;
    }
}
