package X;

import java.io.IOException;

/* renamed from: X.1Q1  reason: invalid class name */
public final class AnonymousClass1Q1 implements AnonymousClass1Px {
    public static final 1Fn A04 = null;
    public int A00;
    public 1Fn A01;
    public AnonymousClass1Px A02;
    public byte[] A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Q1.A00():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private void A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Q1.A00():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q1.A00():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Q1.E15():java.io.InputStream, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.io.InputStream E15() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Q1.E15():java.io.InputStream, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q1.E15():java.io.InputStream");
    }

    public final 1Fn Aqb() {
        return A04;
    }

    public final 1Fn Aql() {
        return this.A01;
    }

    public final long getContentLength() {
        try {
            A00();
        } catch (IOException unused) {
        }
        return (long) this.A00;
    }
}
