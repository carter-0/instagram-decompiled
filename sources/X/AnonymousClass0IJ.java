package X;

import java.util.ArrayList;

/* renamed from: X.0IJ  reason: invalid class name */
public final class AnonymousClass0IJ {
    public static final AnonymousClass0IJ A00 = new Object();
    public static final ArrayList A01 = new ArrayList();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0IJ.A00(X.0IE):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A00(X.0IE r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0IJ.A00(X.0IE):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IJ.A00(X.0IE):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0IJ.A01(X.0II):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A01(X.AnonymousClass0II r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0IJ.A01(X.0II):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IJ.A01(X.0II):void");
    }

    public static final boolean A02() {
        boolean z;
        synchronized (A00) {
            z = !A01.isEmpty();
        }
        return z;
    }
}
