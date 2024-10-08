package X;

import com.instagram.debug.network.DebugNetworkShapingRequestCallbackWrapper;

/* renamed from: X.1CO  reason: invalid class name */
public final class AnonymousClass1CO {
    public static C635813i A02;
    public static AnonymousClass1CO A03;
    public static DebugNetworkShapingRequestCallbackWrapper A04;
    public final AnonymousClass1Cy A00;
    public final AnonymousClass0vF A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1CO.A00():X.1CO, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static synchronized X.AnonymousClass1CO A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1CO.A00():X.1CO, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CO.A00():X.1CO");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1CO.A02(X.1Qd, X.1QS, X.1QU):X.1T9, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.AnonymousClass1T9 A02(X.1Qd r1, X.1QS r2, X.1QU r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1CO.A02(X.1Qd, X.1QS, X.1QU):X.1T9, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CO.A02(X.1Qd, X.1QS, X.1QU):X.1T9");
    }

    public static synchronized void A01() {
        synchronized (AnonymousClass1CO.class) {
            if (A03 == null) {
                C635813i r0 = A02;
                r0.getClass();
                AnonymousClass1Cy r1 = (AnonymousClass1Cy) r0.get();
                r1.getClass();
                A03 = new AnonymousClass1CO(r1);
            }
        }
    }

    public AnonymousClass1CO(AnonymousClass1Cy r3) {
        this.A00 = r3;
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "AsyncHttpService";
        this.A01 = new AnonymousClass0vF(A002);
    }
}
