package X;

/* renamed from: X.0bu  reason: invalid class name and case insensitive filesystem */
public final class C59910bu {
    public static C59920by A00;
    public static final 0Rz A01;
    public static final C59920by A02;
    public static final C59920by A03 = new AnonymousClass0SB();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0bu.A00(android.content.Context):android.content.SharedPreferences, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static android.content.SharedPreferences A00(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0bu.A00(android.content.Context):android.content.SharedPreferences, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59910bu.A00(android.content.Context):android.content.SharedPreferences");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0bu.A01(android.content.Context):android.content.SharedPreferences, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static android.content.SharedPreferences A01(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0bu.A01(android.content.Context):android.content.SharedPreferences, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59910bu.A01(android.content.Context):android.content.SharedPreferences");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0bu.A04(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized void A04(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0bu.A04(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59910bu.A04(android.content.Context):void");
    }

    static {
        AnonymousClass0SA r1 = new AnonymousClass0SA();
        A02 = r1;
        A01 = new 0Rz(r1);
    }

    public static synchronized 0Rz A02() {
        0Rz r0;
        synchronized (C59910bu.class) {
            r0 = A01;
        }
        return r0;
    }

    public static synchronized C59920by A03() {
        C59920by r0;
        synchronized (C59910bu.class) {
            r0 = A00;
            if (r0 == null) {
                throw new IllegalStateException();
            }
        }
        return r0;
    }
}
