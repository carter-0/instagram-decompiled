package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

public final class EKJ extends ELQ {
    public final /* synthetic */ E6e A00;

    public final void D9T(AnonymousClass3UM r8, String str, int i) {
        0qQ.A0B(r8, 0);
        super.D9T(r8, str, i);
        E6e e6e = this.A00;
        E9M e9m = e6e.A01;
        if (e9m == null) {
            0qQ.A0F("oneCategoryAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList arrayList = e9m.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AnonymousClass3UL A002 = ((AnonymousClass3UI) next).A00();
            if (A002 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (A002.equals(r8)) {
                A1C.add(next);
            }
        }
        arrayList.removeAll(A1C);
        E9M.A00(e9m);
        DbX.A0R(e6e.A09).A00(new C319666qz(r8));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EKJ(UserSession userSession, E6e e6e) {
        super(e6e, e6e, userSession);
        this.A00 = e6e;
    }
}
