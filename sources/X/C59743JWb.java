package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.JWb  reason: case insensitive filesystem */
public final class C59743JWb {
    public C331157Pu A00;
    public TriangleSpinner A01;
    public final Fragment A02;
    public final UserSession A03;
    public final JWc A04 = new JWc();

    public final void A00(List list) {
        JWc jWc = this.A04;
        Map map = jWc.A02;
        map.clear();
        AnonymousClass2Fj r3 = jWc.A01;
        r3.A0B(00k.A0a(map.values()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C357268Xf r1 = (C357268Xf) it.next();
            map.put(r1, new JX4(r1));
            r3.A0B(00k.A0a(map.values()));
        }
    }

    public C59743JWb(Fragment fragment, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = fragment;
    }
}
