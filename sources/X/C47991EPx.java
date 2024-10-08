package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.EPx  reason: case insensitive filesystem */
public final class C47991EPx extends AnonymousClass3PS {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278744xS A01;
    public final /* synthetic */ List A02;

    public final void A01(Map map) {
        0qQ.A0B(map, 0);
        List list = this.A02;
        list.addAll(map.values());
        C278744xS r4 = this.A01;
        UserSession userSession = r4.A02;
        if (182.A06(0Tu.A05, userSession, 36315344352316560L)) {
            List<Reel> A0a = 00k.A0a(map.values());
            HashMap A1E = AnonymousClass7TE.A1E();
            for (Reel reel : A0a) {
                if (reel.A1A(userSession)) {
                    Set A0Q = reel.A0Q();
                    0qQ.A07(A0Q);
                    if (!A0Q.isEmpty()) {
                        A1E.put(reel.getId(), A0Q);
                    }
                }
            }
            AnonymousClass3PX.A02.A01(userSession, A1E);
        }
        C278744xS.A01(this.A00, r4, list);
    }

    public C47991EPx(AnonymousClass540 r1, C278744xS r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }
}
