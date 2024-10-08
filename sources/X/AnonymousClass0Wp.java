package X;

/* renamed from: X.0Wp  reason: invalid class name */
public final class AnonymousClass0Wp {
    public final 0Xu A00;
    public volatile AnonymousClass0Wo A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0Wp.A02(X.110, long):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A02(X.110 r1, long r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0Wp.A02(X.110, long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Wp.A02(X.110, long):void");
    }

    public static boolean A00(0XQ r3, 110 r4) {
        if (r4 == null) {
            return false;
        }
        if (r4.A0O) {
            return true;
        }
        if (r3.A04(r4.A0F, r4.getMarkerId(), r4.A01)) {
            return true;
        }
        return false;
    }

    public final 110 A01(0X0 r2, long j) {
        return this.A00.AXS(r2, j);
    }

    public final boolean A03(0X0 r2, 0XQ r3, long j) {
        return A00(r3, this.A00.AXS(r2, j));
    }

    public AnonymousClass0Wp(0Xu r1) {
        this.A00 = r1;
    }
}
