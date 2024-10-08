package X;

import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.provider.perfevents.PerfEventsSession;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.0yr  reason: invalid class name and case insensitive filesystem */
public final class C63210yr extends 0VN {
    public static final int A02 = 0;
    public PerfEventsSession A00;
    public boolean A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0yr.enable():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void enable() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0yr.enable():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63210yr.enable():void");
    }

    public final int getSupportedProviders() {
        return A02;
    }

    public final int getTracingProviders() {
        TraceContext traceContext;
        if (!this.A01 || (traceContext = this.A00) == null) {
            return 0;
        }
        return traceContext.A02 & A02;
    }

    public final void disable() {
        int A03 = AnonymousClass0fD.A03(2042172352);
        this.A01 = false;
        PerfEventsSession perfEventsSession = this.A00;
        if (perfEventsSession != null) {
            perfEventsSession.stop();
            synchronized (perfEventsSession) {
                long j = perfEventsSession.mNativeHandle;
                if (j != 0) {
                    PerfEventsSession.nativeDetach(j);
                    perfEventsSession.mNativeHandle = 0;
                }
            }
        }
        this.A00 = null;
        AnonymousClass0fD.A0A(524046475, A03);
    }
}
