package X;

import com.instagram.user.model.User;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
@Deprecated
/* renamed from: X.1d9  reason: invalid class name */
public final class AnonymousClass1d9 extends 1bp {
    public static final 1OW A01 = new 1dA();
    public User A00;

    public final String A02() {
        return "send_book_now_link_share_message";
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1d9.A05():java.lang.Object, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* bridge */ /* synthetic */ java.lang.Object A05() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1d9.A05():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1d9.A05():java.lang.Object");
    }

    static {
    }

    public final 2FW Aqm() {
        return 2FW.A0Q;
    }

    public AnonymousClass1d9() {
    }
}
