package X;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* renamed from: X.1Mi  reason: invalid class name */
public final class AnonymousClass1Mi extends 0Yg implements C62320sa {
    public static final AnonymousClass1Mi A00 = new AnonymousClass1Mi();

    static {
    }

    public AnonymousClass1Mi() {
        super(0);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Mi.invoke():java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Mi.invoke():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Mi.invoke():java.lang.Object");
    }
}
