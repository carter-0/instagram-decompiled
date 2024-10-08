package X;

/* renamed from: X.1a9  reason: invalid class name and case insensitive filesystem */
public final class C65041a9 implements C65051aA, AnonymousClass1aB {
    public C65121ah A00;
    public volatile boolean A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1a9.A00(X.1ah):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A00(X.C65121ah r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1a9.A00(X.1ah):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65041a9.A00(X.1ah):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1a9.A7i(X.1aA):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean A7i(X.C65051aA r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1a9.A7i(X.1aA):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65041a9.A7i(X.1aA):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1a9.AOQ(X.1aA):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean AOQ(X.C65051aA r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1a9.AOQ(X.1aA):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65041a9.AOQ(X.1aA):boolean");
    }

    public final void dispose() {
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    this.A01 = true;
                    C65121ah r1 = this.A00;
                    this.A00 = null;
                    A00(r1);
                }
            }
        }
    }

    public final boolean ED6(C65051aA r2) {
        if (!AOQ(r2)) {
            return false;
        }
        r2.dispose();
        return true;
    }
}
