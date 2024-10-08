package X;

import com.facebook.profilo.core.TraceEvents;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0gA  reason: invalid class name and case insensitive filesystem */
public final class C60320gA extends 0VN implements AnonymousClass0SS, AnonymousClass0N2 {
    public static final int A00 = 0;
    public static final C60320gA A01 = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0gA.CtZ(X.0SG):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void CtZ(X.0SG r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0gA.CtZ(X.0SG):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60320gA.CtZ(X.0SG):void");
    }

    public final Integer C9K() {
        if ((A00 & TraceEvents.sProviders) != 0) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A0C;
    }

    public final int getSupportedProviders() {
        return A00;
    }

    public final int getTracingProviders() {
        return A00 & TraceEvents.sProviders;
    }

    public final void D7t(0SG r11) {
        A02().writeStandardEntry(7, 22, 0, 0, 0, 0, 0);
    }

    public final void disable() {
        AnonymousClass0fD.A0A(1367702729, AnonymousClass0fD.A03(490300291));
    }

    public final void enable() {
        AnonymousClass0fD.A0A(-121883827, AnonymousClass0fD.A03(-369493429));
    }
}
