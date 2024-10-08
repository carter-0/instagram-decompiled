package X;

/* renamed from: X.2JR  reason: invalid class name */
public final class AnonymousClass2JR implements AnonymousClass2JP, AnonymousClass2JS {
    public static final Object A02 = new Object();
    public volatile AnonymousClass2JP A00;
    public volatile Object A01 = A02;

    public AnonymousClass2JR(AnonymousClass2JP r2) {
        this.A00 = r2;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2JR.FP1():java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.Object FP1() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2JR.FP1():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JR.FP1():java.lang.Object");
    }
}
