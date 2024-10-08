package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GHq  reason: case insensitive filesystem */
public final class C52174GHq extends AnonymousClass2wM {
    public final UserSession A00;

    public C52174GHq(UserSession userSession, C228812mN r10, C233402vf r11, AnonymousClass2vH r12, C249863kU r13, 1PJ r14) {
        super(userSession, r10, r11, r12, r13, r14, false);
        this.A00 = userSession;
    }

    public final void A07(List list, List list2, int i) {
        if (182.A06(0Tu.A05, this.A00, 36318556987857130L)) {
            super.A07(list, list2, i);
            return;
        }
        if (this.A02.booleanValue()) {
            list2.add("target_position_no_longer_valid");
        }
        this.A02 = true;
    }

    public final boolean A08() {
        UserSession userSession = this.A00;
        if (!C228342lQ.A03(userSession) || !182.A06(0Tu.A05, userSession, 36312879042463085L)) {
            return false;
        }
        return true;
    }

    public final boolean A09() {
        UserSession userSession = this.A00;
        if (!C228342lQ.A05(userSession) || !182.A06(0Tu.A05, userSession, 36312879042463085L)) {
            return false;
        }
        return true;
    }

    public final boolean A0A() {
        return 182.A06(0Tu.A05, this.A00, 36330746104922874L);
    }

    public final /* bridge */ /* synthetic */ boolean A0C(Object obj, boolean z, boolean z2) {
        return C233832wY.A03(this.A00, z);
    }

    public final /* bridge */ /* synthetic */ C233462vl A0D(Object obj) {
        C376489Ie r2 = (C376489Ie) obj;
        0qQ.A0B(r2, 0);
        return (C233462vl) r2.A04;
    }

    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        return AnonymousClass7TE.A1I(C51972G9s.A0Y(obj).A05());
    }

    public final /* bridge */ /* synthetic */ boolean A0B(Object obj) {
        C267324bN A0Y = C51972G9s.A0Y(obj);
        if (A0Y.A0F()) {
            for (AnonymousClass3OA r2 : C57031ILx.A02(A0Y)) {
                if (1sd.A00(this.A00).A05(r2.A0K)) {
                    return true;
                }
            }
        }
        1Xj A05 = A0Y.A05();
        if (A05 != null) {
            return 1sd.A00(this.A00).A05(A05);
        }
        return false;
    }
}
