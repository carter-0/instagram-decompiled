package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.JYw  reason: case insensitive filesystem */
public final class C59803JYw extends 0ng {
    public final /* synthetic */ AnonymousClass9TO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59803JYw(AnonymousClass9TO r4) {
        super(645279623, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass2NR r7 = this.A00.A01;
        ArrayList A002 = r7.A00();
        C251983oI r5 = r7.A01;
        r5.assertNotSuspendingTransaction();
        1Vg r4 = r7.A03;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, 50);
        try {
            r5.beginTransaction();
            acquire.ATQ();
            r5.setTransactionSuccessful();
            r5.endTransaction();
            r4.release(acquire);
            Iterator it = 00k.A0e(A002, 00k.A0V(r7.A00())).iterator();
            while (it.hasNext()) {
                0mb.A08(AnonymousClass7TE.A18(it));
            }
        } catch (Throwable th) {
            r4.release(acquire);
            throw th;
        }
    }
}
