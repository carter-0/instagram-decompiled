package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.12X  reason: invalid class name */
public final class AnonymousClass12X extends 12Y {
    public static final AnonymousClass12X A00 = new AnonymousClass12X();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.12X.close():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void close() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.12X.close():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12X.close():void");
    }

    public final String toString() {
        return "Dispatchers.Default";
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4CZ, X.12X] */
    public final AnonymousClass4CZ A0M(int i) {
        C634812u.A00(i);
        if (i >= C634512h.A01) {
            return this;
        }
        return AnonymousClass12X.super.A0M(i);
    }
}
