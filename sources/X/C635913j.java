package X;

/* renamed from: X.13j  reason: invalid class name and case insensitive filesystem */
public final class C635913j implements C635813i {
    public static final C635813i A02 = new C636013k();
    public Object A00;
    public volatile C635813i A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.13j.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.13j.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C635913j.toString():java.lang.String");
    }

    public final Object get() {
        C635813i r0 = this.A01;
        C635813i r1 = A02;
        if (r0 != r1) {
            synchronized (this) {
                if (this.A01 != r1) {
                    Object obj = this.A01.get();
                    this.A00 = obj;
                    this.A01 = r1;
                    return obj;
                }
            }
        }
        return this.A00;
    }

    public C635913j(C635813i r1) {
        this.A01 = r1;
    }
}
