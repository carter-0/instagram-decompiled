package X;

import java.util.Map;

/* renamed from: X.2V9  reason: invalid class name */
public final class AnonymousClass2V9 {
    public Map A00;
    public Map A01;

    public final synchronized void A00() {
        Map map = this.A00;
        if (map != null) {
            map.clear();
        }
        Map map2 = this.A01;
        if (map2 != null) {
            map2.clear();
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2V9.A01(X.2Vh):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A01(X.2Vh r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2V9.A01(X.2Vh):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2V9.A01(X.2Vh):void");
    }
}
