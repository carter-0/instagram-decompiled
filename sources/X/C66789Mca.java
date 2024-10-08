package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.Mca  reason: case insensitive filesystem */
public final class C66789Mca implements AnonymousClass6FF {
    public final int A00;
    public final Object A01;

    public C66789Mca(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public static 1aU A00(1aU r1, 0sP r2, int i) {
        return r1.A0N(new C66789Mca(i, r2));
    }

    public final /* synthetic */ boolean test(Object obj) {
        switch (this.A00) {
            case 13:
                return ((C69666Npo) this.A01).A00().isInstance(obj);
            case 16:
                Set<Object> set = (Set) obj;
                0qQ.A0A(set);
                List list = ((PF4) this.A01).A00;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                for (Object contains : set) {
                    if (list.contains(contains)) {
                        return true;
                    }
                }
                return false;
            case 19:
                Set set2 = (Set) obj;
                C2597743a r1 = ((C68644NRa) this.A01).A00;
                UserSession userSession = r1.A03;
                if (C70111NxR.A00(userSession).A00 == null || set2 == null || !set2.contains("presence_state_for_all_users") || SystemClock.elapsedRealtime() - r1.A00 < 182.A01(DbS.A0J(userSession, 0), userSession, 36594878004266961L)) {
                    return false;
                }
                return true;
            default:
                return C51971G9r.A1a(obj, (0sP) this.A01);
        }
    }

    public C66789Mca(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
