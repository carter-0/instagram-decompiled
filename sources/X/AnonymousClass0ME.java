package X;

/* renamed from: X.0ME  reason: invalid class name */
public final class AnonymousClass0ME {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0ME.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0ME.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ME.toString():java.lang.String");
    }

    public AnonymousClass0ME(long j) {
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = j;
        boolean z = false;
        this.A03 = false;
        this.A04 = j == -758 ? true : z;
    }

    public AnonymousClass0ME(long j, long j2) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = 0;
        this.A03 = true;
        this.A04 = false;
    }
}
