package X;

import java.lang.ref.WeakReference;

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
/* renamed from: X.0jn  reason: invalid class name and case insensitive filesystem */
public final class C60870jn {
    public static final C60860jm A02 = new Object();
    public final AnonymousClass0jd A00;
    public final WeakReference A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0jn.<init>(android.content.Context, X.0lg):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public /* synthetic */ C60870jn(android.content.Context r1, X.0lg r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0jn.<init>(android.content.Context, X.0lg):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60870jn.<init>(android.content.Context, X.0lg):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0jn.A01():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A01() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0jn.A01():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60870jn.A01():void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0jm, java.lang.Object] */
    static {
    }

    public final 19i A00() {
        return this.A00.A01((0lg) this.A01.get());
    }
}
