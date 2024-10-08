package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Kop  reason: case insensitive filesystem */
public abstract class C62937Kop {
    public void A00(List list) {
        K8R k8r = (K8R) this;
        C277014uI r6 = k8r.A01;
        C307896Rx r4 = k8r.A00;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("accounts", list);
        0tS A0h = DbT.A0h();
        A1E.put(AnonymousClass000.A00(2709), 00k.A0a(A0h.A09()));
        A1E.put("fetch_account_center_list", 00k.A0a((Iterable) A0h.A04.CDM(A0h, 0tS.A4G[184])));
        AnonymousClass7TE.A1Z(new C59819JZr(r4, A1E, r6, (AnonymousClass4D7) null, 13), AnonymousClass1HX.A00());
    }
}
