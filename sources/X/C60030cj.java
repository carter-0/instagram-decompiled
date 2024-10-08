package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;

/* renamed from: X.0cj  reason: invalid class name and case insensitive filesystem */
public final class C60030cj implements AnonymousClass0f6 {
    public static QuickPerformanceLogger A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0cj.Dsp():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void Dsp() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0cj.Dsp():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60030cj.Dsp():void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0f6, java.lang.Object] */
    static {
        ? obj = new Object();
        String[][] strArr = Systrace.A03;
        0ez.A01(obj);
    }

    public final void Dsr() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }
}
