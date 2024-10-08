package X;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* renamed from: X.1hw  reason: invalid class name */
public final class AnonymousClass1hw implements AnonymousClass1cS {
    public static final 0Ka A02 = new 1hx();
    public final AnonymousClass0eK A00;
    public final AnonymousClass0eK A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1hw.DTO(X.1OS, X.Prc, X.Prc):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* bridge */ /* synthetic */ void DTO(X.1OS r1, X.C74248Prc r2, X.C74248Prc r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1hw.DTO(X.1OS, X.Prc, X.Prc):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1hw.DTO(X.1OS, X.Prc, X.Prc):void");
    }

    static {
    }

    public AnonymousClass1hw(AnonymousClass0eK r1, AnonymousClass0eK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void DTJ(1OS r1, C74248Prc prc) {
    }

    public final /* bridge */ /* synthetic */ void DTN(1OS r1, C74248Prc prc) {
    }
}
