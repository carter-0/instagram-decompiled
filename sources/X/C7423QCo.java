package X;

import java.util.Map;

/* renamed from: X.QCo  reason: case insensitive filesystem */
public final class C7423QCo extends AnonymousClass2Fj {
    public C319836rJ A00;
    public String A01;

    public final void A0B(Object obj) {
        C319836rJ r2 = this.A00;
        if (r2 != null) {
            Map map = r2.A03;
            String str = this.A01;
            map.put(str, obj);
            05G r0 = (05G) r2.A01.get(str);
            if (r0 != null) {
                r0.Epw(obj);
            }
        }
        C7423QCo.super.A0B(obj);
    }
}
