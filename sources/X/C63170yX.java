package X;

import com.facebook.profilo.provider.atrace.Atrace;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0yX  reason: invalid class name and case insensitive filesystem */
public final class C63170yX extends 0VN {
    public static final int A00 = 0;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0yX.disable():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void disable() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0yX.disable():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63170yX.disable():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0yX.enable():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void enable() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0yX.enable():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63170yX.enable():void");
    }

    public final int getSupportedProviders() {
        return A00;
    }

    public final int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
