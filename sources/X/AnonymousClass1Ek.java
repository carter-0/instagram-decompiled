package X;

/* renamed from: X.1Ek  reason: invalid class name */
public abstract class AnonymousClass1Ek extends C64101El implements AnonymousClass0s6 {
    public final int arity;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Ek.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Ek.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Ek.toString():java.lang.String");
    }

    public int getArity() {
        return this.arity;
    }

    public AnonymousClass1Ek(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.arity = i;
    }
}
