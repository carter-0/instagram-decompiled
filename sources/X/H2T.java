package X;

import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.repository.common.FeedPagedData;

public final class H2T extends C247303g7 {
    public static final C53287GlZ A05;
    public static final C53287GlZ A06;
    public static final C53287GlZ A07;
    public final FactsRepository A00;
    public final FeedPagedData A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;

    public H2T(FactsRepository factsRepository, C53287GlZ glZ) {
        0qQ.A0B(glZ, 2);
        this.A00 = factsRepository;
        02z A012 = 106.A01(I1F.A00);
        this.A02 = A012;
        this.A03 = 10b.A03(A012);
        FeedPagedData feedPagedData = factsRepository.A00;
        this.A01 = feedPagedData;
        this.A04 = 10b.A02(glZ, A03(), new C58029IkM(1, glZ, this, feedPagedData.A01), AnonymousClass10A.A01);
    }

    static {
        C54617HLa hLa = C54617HLa.LOADING;
        AnonymousClass62M r4 = AnonymousClass62M.A01;
        A07 = new C53287GlZ(hLa, 2131956994, 2131956925, r4, 0, 2131957029);
        A06 = new C53287GlZ(hLa, (Integer) null, 2131956925, r4, 0, 2131957028);
        A05 = new C53287GlZ(hLa, 2131957010, 2131956925, r4, 0, 2131957033);
    }
}
