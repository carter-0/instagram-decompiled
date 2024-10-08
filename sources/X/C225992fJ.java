package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: X.2fJ  reason: invalid class name and case insensitive filesystem */
public final class C225992fJ extends 0px {
    public final 1NH A00;

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        UserSession userSession = this.A02;
        JSONArray jSONArray = new JSONArray(((C45253CtG) obj).A00);
        1NY r2 = new 1NY(userSession);
        r2.A04();
        r2.A0A("discover/add_interested_signals/");
        r2.A9m("media_ids", jSONArray.toString());
        r2.A0R(1XP.class, 1XY.class);
        return r2.A0M();
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<Object> list;
        1NH r6 = this.A00;
        String str = this.A02.A06;
        AnonymousClass47G r0 = (AnonymousClass47G) r6.A02(002.A0R("pending_explore_positive_signals_", str), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (Object put : list) {
                hashMap.put(UUID.randomUUID().toString(), put);
            }
            A0E(hashMap);
            A08();
        }
        r6.A04(002.A0R("pending_explore_positive_signals_", str));
    }

    public final void A0J() {
        this.A00.A04(002.A0R("pending_explore_positive_signals_", this.A02.A06));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.47G, java.lang.Object] */
    public final void A0K() {
        ? obj = new Object();
        obj.A00 = A05();
        this.A00.A06(002.A0R("pending_explore_positive_signals_", this.A02.A06), obj);
    }

    public C225992fJ(1NH r1, UserSession userSession) {
        super(userSession);
        this.A00 = r1;
    }
}
