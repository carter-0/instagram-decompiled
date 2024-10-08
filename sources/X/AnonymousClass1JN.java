package X;

/* renamed from: X.1JN  reason: invalid class name */
public final class AnonymousClass1JN {
    public int A00;
    public long A01;
    public final int A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1JN.A00(int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1JN.A00(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JN.A00(int):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new AnonymousClass1JN(this.A02, this.A00, this.A01);
    }

    public AnonymousClass1JN(int i, int i2, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = j;
    }
}
