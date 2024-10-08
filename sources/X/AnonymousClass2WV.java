package X;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2WV  reason: invalid class name */
public final class AnonymousClass2WV implements C251273mq {
    public final AnonymousClass2WT A00;
    public final 2Sd A01;
    public final Integer A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2WV.<init>(X.2Sd, X.2WT):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2WV(X.2Sd r1, X.AnonymousClass2WT r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2WV.<init>(X.2Sd, X.2WT):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WV.<init>(X.2Sd, X.2WT):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2WV.ALg(android.content.Context):java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* bridge */ /* synthetic */ java.lang.Object ALg(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2WV.ALg(android.content.Context):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WV.ALg(android.content.Context):java.lang.Object");
    }

    public final /* synthetic */ 2Ue D6k(int i) {
        return C246243eG.A00(this, i);
    }

    public final boolean AFh() {
        return true;
    }

    public final Object Bdd() {
        return this.A00.getClass();
    }

    public final 2Sd Bdg() {
        return this.A01;
    }

    public final Integer Bln() {
        return this.A02;
    }

    public final int E2z() {
        return 30;
    }
}
