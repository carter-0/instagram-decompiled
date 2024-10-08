package X;

/* renamed from: X.1EI  reason: invalid class name */
public final class AnonymousClass1EI {
    public static AnonymousClass1EH A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1EI.A00():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized void A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1EI.A00():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EI.A00():void");
    }

    public static synchronized void A01(AnonymousClass1EH r2) {
        synchronized (AnonymousClass1EI.class) {
            if (A00 == null) {
                A00 = r2;
            }
        }
    }
}
