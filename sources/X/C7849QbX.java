package X;

import java.util.Map;

/* renamed from: X.QbX  reason: case insensitive filesystem */
public final class C7849QbX extends 2SM {
    public final C39766A8g A00;

    public final void A00(PzN pzN) {
        RLX qPo;
        Map map = pzN.A03;
        Object obj = map.get("breadcrumb");
        if (obj == null) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null && 0qQ.A0K(pzN.A02, "RenderOnMainThreadStarted")) {
            boolean z = false;
            Object obj2 = map.get("has_main_thread_layout_state");
            if (obj2 != null) {
                z = obj2;
            }
            boolean A1a = AnonymousClass7TE.A1a(z);
            C39766A8g a8g = this.A00;
            if (A1a) {
                qPo = new QPp(DbU.A0r("root", map), DbU.A0r("current_size_constraint", map), AnonymousClass7TE.A0M(map.get("current_root_id")), AnonymousClass7TE.A0M(map.get("root_id")), DbU.A0r("size_constraint", map), str);
            } else {
                qPo = new QPo(DbU.A0r("root", map), str);
            }
            a8g.A00(qPo, str);
        }
    }

    public C7849QbX(C39766A8g a8g) {
        super(new String[]{"RenderOnMainThreadStarted"});
        this.A00 = a8g;
    }
}
