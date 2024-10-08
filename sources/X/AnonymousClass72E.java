package X;

import java.util.Iterator;

/* renamed from: X.72E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass72E extends 03J implements C62320sa {
    public AnonymousClass72E(Object obj) {
        super(0, obj, AnonymousClass72C.class, "logTrayItemImpressions", "logTrayItemImpressions()V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass72C r4 = (AnonymousClass72C) this.receiver;
        AnonymousClass6W2 r1 = r4.A02;
        if (!(r1.A00 == null || r1.A01 == null)) {
            Iterator it = r4.A03.iterator();
            while (it.hasNext()) {
                it.next();
                0wc r2 = r4.A00;
                if (r2.A00(r2.A00, "igd_an_tray_impression").isSampled()) {
                    throw new NullPointerException("getUser");
                }
            }
        }
        return C60340gF.A00;
    }
}
