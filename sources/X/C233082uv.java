package X;

import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2uv  reason: invalid class name and case insensitive filesystem */
public final class C233082uv {
    public long A00;
    public 1P0 A01;
    public C233062ut A02;
    public boolean A03 = true;
    public final UserSession A04;
    public final C230282pK A05;
    public final Integer A06;
    public final ContextualFeedFragment A07;

    public C233082uv(UserSession userSession, C233062ut r4, C230282pK r5, ContextualFeedFragment contextualFeedFragment, Integer num) {
        0qQ.A0B(num, 3);
        0qQ.A0B(r5, 4);
        this.A02 = r4;
        this.A04 = userSession;
        this.A06 = num;
        this.A05 = r5;
        this.A07 = contextualFeedFragment;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3mI, X.GV9] */
    public final ArrayList A00(C54077Gz1 gz1) {
        int i;
        ContextualFeedFragment contextualFeedFragment = this.A07;
        if (contextualFeedFragment != null) {
            HDB hdb = contextualFeedFragment.A0N;
            if (hdb == null) {
                0qQ.A0F("adapter");
                throw AnonymousClass00P.createAndThrow();
            }
            i = hdb.BQW().size();
        } else {
            i = 0;
        }
        List<C55923Hpk> list = gz1.A0B;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C55923Hpk A002 : list) {
            ? r1 = new C250933mI();
            r1.A0L = A002.A00();
            if (this.A06.intValue() != 0) {
                C233462vl r6 = new C233462vl((C67241sS) null, (C233492vo) null, (String) null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
                r6.A0B(i);
                r1.A00 = r6;
                i++;
            } else {
                r1.A00 = C233462vl.A0D;
            }
            arrayList.add(r1.A01());
        }
        return arrayList;
    }
}
