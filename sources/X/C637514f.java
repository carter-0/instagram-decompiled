package X;

import android.content.Context;
import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.14f  reason: invalid class name and case insensitive filesystem */
public final class C637514f extends 122 {
    public final Context A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.14f.<init>(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C637514f(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.14f.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C637514f.<init>(android.content.Context):void");
    }

    public final String A06() {
        return "DebugHeadInitializer";
    }

    public final void A07() {
        if (DebugHeadConfigurations.isDebugHeadEnabled) {
            AnonymousClass1HI.A02.Eyo(new C387029lY(this));
        }
    }
}
