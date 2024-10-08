package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.2pB  reason: invalid class name */
public final class AnonymousClass2pB {
    public final C250603lj A00;
    public final 2el A01;
    public final C229932oe A02 = new C229932oe();
    public final Set A03 = new 04u(0);
    public final /* synthetic */ C230192p8 A04;

    public AnonymousClass2pB(2el r3, C230192p8 r4) {
        this.A04 = r4;
        this.A01 = r3;
        this.A00 = new AnonymousClass2pC(this, r4);
    }

    public final void A00(WWP wwp, C242803Vz r15, int i) {
        C229932oe r2 = this.A02;
        WWP wwp2 = wwp;
        String id = wwp.getId();
        AnonymousClass30Y A002 = r2.A00(id);
        0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.common.viewpoint.core.ViewpointData<com.instagram.feed.feeditem.FeedSurveyItem?, com.instagram.feed.ui.state.PositionState?>");
        AnonymousClass30Y r4 = AnonymousClass30Y.A07;
        C242803Vz r6 = r15;
        if (A002 == r4) {
            C250603lj r0 = this.A00;
            ArrayList arrayList = new ArrayList();
            arrayList.add(r0);
            r2.A01(new AnonymousClass30Y(r4, wwp2, r6, id, arrayList), id);
            A002 = r2.A00(id);
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.common.viewpoint.core.ViewpointData<com.instagram.feed.feeditem.FeedSurveyItem?, com.instagram.feed.ui.state.PositionState?>");
        }
        String A0G = 002.A0G(id, ':', i);
        r2.A01(new AnonymousClass30Y(A002, wwp, r15, A0G, (List) null), A0G);
    }
}
