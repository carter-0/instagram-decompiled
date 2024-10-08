package X;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.12U  reason: invalid class name */
public class AnonymousClass12U implements AnonymousClass12V {
    public final C61480nO A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass4CZ A03;
    public final AnonymousClass4CZ A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.12U.<init>():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass12U() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.12U.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12U.<init>():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.12U.<init>(X.0nO, X.4CZ, X.4CZ):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass12U(X.C61480nO r1, X.AnonymousClass4CZ r2, X.AnonymousClass4CZ r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.12U.<init>(X.0nO, X.4CZ, X.4CZ):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12U.<init>(X.0nO, X.4CZ, X.4CZ):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass12U(C61480nO r3) {
        this(r3, AnonymousClass12y.A00, new 135());
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
    }

    public final 0nV AOJ(int i, int i2) {
        AnonymousClass4CZ r0;
        0vy r1 = this.A00;
        if (r1 instanceof 0vy) {
            r0 = r1.A02(i2);
        } else {
            r0 = (AnonymousClass4CZ) this.A01.getValue();
        }
        return new 0nV(r0, i, i2);
    }

    public final 0nV CO6(int i, int i2) {
        AnonymousClass4CZ r0;
        0vy r1 = this.A00;
        if (r1 instanceof 0vy) {
            r0 = r1.A00;
        } else {
            r0 = (AnonymousClass4CZ) this.A02.getValue();
        }
        return new 0nV(r0, i, i2);
    }
}
