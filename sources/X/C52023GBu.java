package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.GBu  reason: case insensitive filesystem */
public final class C52023GBu implements C313476gV {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final Map A03 = new ConcurrentHashMap();
    public Set preparedMedias = DbS.A0y();

    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void A00() {
        Map map = this.A03;
        ArrayList A0v = DbS.A0v(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            ((C57467IbB) C51971G9r.A0p(A0u)).A01();
            A0v.add(C60340gF.A00);
        }
        map.clear();
        this.preparedMedias.clear();
    }

    public final void Dxv(1Xj r5) {
        Map map = this.A03;
        if (map.containsKey(r5) && r5 != null) {
            this.preparedMedias.add(r5);
        }
        if (this.preparedMedias.size() == map.size()) {
            ArrayList A0v = DbS.A0v(map.size());
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                C57467IbB.A00((C57467IbB) C51971G9r.A0p(A0u));
                A0v.add(C60340gF.A00);
            }
        }
    }

    public final void onCompletion() {
        Map map = this.A03;
        LinkedHashMap A0o = C51975G9x.A0o(map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            C14044Tol tol = ((C57467IbB) A1J.getValue()).A01;
            if (tol != null) {
                tol.A0A("paused_for_replay");
            }
            C57467IbB.A00((C57467IbB) A1J.getValue());
            A0o.put(key, C60340gF.A00);
        }
    }

    public C52023GBu(Context context, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
    }

    public final void A01(Map map) {
        ArrayList A0v = DbS.A0v(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            C54507HGt hGt = (C54507HGt) C51971G9r.A0p(A0u);
            C57467IbB ibB = new C57467IbB(this.A00, this.A01, this.A02, this);
            this.A03.put(hGt.A00, ibB);
            ibB.A02(hGt, false);
            A0v.add(C60340gF.A00);
        }
    }
}
