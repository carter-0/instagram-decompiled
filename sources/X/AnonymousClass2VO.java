package X;

/* renamed from: X.2VO  reason: invalid class name */
public final class AnonymousClass2VO {
    public static final AnonymousClass2VO A01 = new Object();
    public volatile boolean A00;

    public final synchronized void A00() {
        this.A00 = true;
        notifyAll();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2VO.A01():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final synchronized void A01() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2VO.A01():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2VO.A01():void");
    }
}
