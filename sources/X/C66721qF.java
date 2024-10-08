package X;

import java.util.List;

/* renamed from: X.1qF  reason: invalid class name and case insensitive filesystem */
public final class C66721qF extends AnonymousClass1qG {
    public final AnonymousClass0E1 A00 = new AnonymousClass0E1();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1qF.A00(X.1qH):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(X.C66731qH r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1qF.A00(X.1qH):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66721qF.A00(X.1qH):void");
    }

    public final void onEventReceivedWithParamsCollectionMap(0Df r6, C68051z2 r7) {
        List list;
        AnonymousClass0E1 r4 = this.A00;
        synchronized (r4) {
            list = r4.A02;
            r4.A00++;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass1z4.A00((C66731qH) list.get(i), r7, r6);
            }
        } finally {
            r4.A00();
        }
    }

    public final void onEventsWritten(int i) {
        List list;
        AnonymousClass0E1 r4 = this.A00;
        synchronized (r4) {
            list = r4.A02;
            r4.A00++;
        }
        try {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C66731qH) list.get(i2)).onEventsWritten(i);
            }
        } finally {
            r4.A00();
        }
    }
}
