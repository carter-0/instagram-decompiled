package X;

import android.os.Handler;
import java.lang.reflect.Field;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* renamed from: X.19U  reason: invalid class name */
public abstract class AnonymousClass19U {
    public static Handler A00;
    public static Object A01;
    public static Field A02;
    public static Field A03;
    public static final AnonymousClass0S9 A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.19U.A00():java.lang.Boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static /* synthetic */ java.lang.Boolean A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.19U.A00():java.lang.Boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19U.A00():java.lang.Boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0h8, java.lang.Object, X.0S9] */
    static {
        AnonymousClass19X r1 = new AnonymousClass19X();
        ? obj = new Object();
        obj.A00 = r1;
        A04 = obj;
    }
}
