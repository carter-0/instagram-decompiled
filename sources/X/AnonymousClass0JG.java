package X;

import android.util.LongSparseArray;

/* renamed from: X.0JG  reason: invalid class name */
public final class AnonymousClass0JG implements AnonymousClass0XI {
    public final AnonymousClass0XA A00;
    public final 0aX A01 = new LongSparseArray();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0JG.E5O(X.0X0, X.0XH, long):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void E5O(X.0X0 r1, X.0XH r2, long r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0JG.E5O(X.0X0, X.0XH, long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JG.E5O(X.0X0, X.0XH, long):void");
    }

    public final 0XH AXR(0X0 r4, long j) {
        AnonymousClass0XA r2 = this.A00;
        r2.FHT(r4, 0);
        try {
            return (0XH) this.A01.get(j);
        } finally {
            r2.FHU(r4, 0);
        }
    }

    public final 0XH ED7(0X0 r6, long j) {
        0XH r0;
        AnonymousClass0XA r4 = this.A00;
        r4.FHT(r6, 1);
        try {
            0aX r2 = this.A01;
            int indexOfKey = r2.indexOfKey(j);
            if (indexOfKey < 0) {
                r0 = null;
            } else {
                r0 = (0XH) r2.valueAt(indexOfKey);
                r2.removeAt(indexOfKey);
            }
            return r0;
        } finally {
            r4.FHU(r6, 1);
        }
    }

    public AnonymousClass0JG(AnonymousClass0XA r2) {
        this.A00 = r2;
    }
}
