package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Qi1  reason: case insensitive filesystem */
public final class C8158Qi1 extends AnonymousClass4iD {
    public S6M A00;
    public List A01;

    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    public final void A0A() {
        super.fillInStackTrace();
    }

    public final String getMessage() {
        String A09 = A09();
        List list = this.A01;
        if (list == null) {
            return A09;
        }
        StringBuilder A16 = Pxe.A16(A09);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pxf.A1O(A16, it.next());
            if (it.hasNext()) {
                Pxe.A1Y(A16);
            }
        }
        return C51967G9n.A0r(A16, '.');
    }
}
