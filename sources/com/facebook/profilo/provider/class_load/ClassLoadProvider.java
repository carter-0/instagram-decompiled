package com.facebook.profilo.provider.class_load;

import X.0Ja;
import X.0Jb;
import X.0VN;
import X.AnonymousClass0fD;
import com.facebook.profilo.core.TraceEvents;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public final class ClassLoadProvider extends 0VN {
    public static final int A01 = 0;
    public 0Jb A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.profilo.provider.class_load.ClassLoadProvider.disable():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void disable() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.profilo.provider.class_load.ClassLoadProvider.disable():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.class_load.ClassLoadProvider.disable():void");
    }

    public final int getSupportedProviders() {
        return A01;
    }

    public final void enable() {
        int A03 = AnonymousClass0fD.A03(849025068);
        0Ja A002 = 0Ja.A00();
        if (A002 != null) {
            A002.A01(this.A00);
        }
        AnonymousClass0fD.A0A(-1867853427, A03);
    }

    public final int getTracingProviders() {
        boolean z;
        0Ja A002 = 0Ja.A00();
        int i = A01;
        if ((TraceEvents.sProviders & i) == 0 || A002 == null) {
            return 0;
        }
        synchronized (A002) {
            z = A002.A06;
        }
        if (z) {
            return i;
        }
        return 0;
    }
}
