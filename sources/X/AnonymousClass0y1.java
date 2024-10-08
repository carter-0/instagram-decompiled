package X;

/* renamed from: X.0y1  reason: invalid class name */
public final class AnonymousClass0y1 {
    public static 0eP A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0y1.A00():X.0eP, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final synchronized X.0eP A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0y1.A00():X.0eP, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0y1.A00():X.0eP");
    }

    public static final synchronized boolean A01() {
        boolean booleanValue;
        synchronized (AnonymousClass0y1.class) {
            booleanValue = ((Boolean) A00().A00).booleanValue();
        }
        return booleanValue;
    }
}
