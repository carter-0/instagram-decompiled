package X;

/* renamed from: X.1El  reason: invalid class name and case insensitive filesystem */
public abstract class C64101El extends 1Em {
    public final C262094Cc _context;
    public transient AnonymousClass4D7 intercepted;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1El.getContext():X.4Cc, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public X.C262094Cc getContext() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1El.getContext():X.4Cc, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64101El.getContext():X.4Cc");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1El.releaseIntercepted():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public void releaseIntercepted() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1El.releaseIntercepted():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64101El.releaseIntercepted():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64101El(X.AnonymousClass4D7 r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            X.4Cc r0 = r2.getContext()
        L_0x0006:
            r1.<init>(r2, r0)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64101El.<init>(X.4D7):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.1El] */
    public final AnonymousClass4D7 intercepted() {
        1Ez r0 = this.intercepted;
        if (r0 == null) {
            C262104Cd r1 = (C262104Cd) getContext().get(C262104Cd.A00);
            if (r1 != null) {
                r0 = new 1Ez(this, (AnonymousClass4CZ) r1);
            } else {
                r0 = this;
            }
            this.intercepted = r0;
        }
        return r0;
    }

    public C64101El(AnonymousClass4D7 r1, C262094Cc r2) {
        super(r1);
        this._context = r2;
    }
}
