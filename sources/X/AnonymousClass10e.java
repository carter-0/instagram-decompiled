package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.10e  reason: invalid class name */
public final class AnonymousClass10e {
    public final AnonymousClass0JR A00;
    public final 0Y0 A01;
    public final Map A02 = new HashMap();
    public volatile long A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.10e.A00():java.util.ArrayList, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final synchronized java.util.ArrayList A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.10e.A00():java.util.ArrayList, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10e.A00():java.util.ArrayList");
    }

    public AnonymousClass10e(AnonymousClass0JR r2, 0Y0 r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
