package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;

/* renamed from: X.Ggl  reason: case insensitive filesystem */
public final class C52994Ggl extends 2YL {
    public String A00;
    public final UserSession A01;
    public final BioSummaryRepository A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public C52994Ggl(UserSession userSession, BioSummaryRepository bioSummaryRepository) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = bioSummaryRepository;
        02z A10 = DbS.A10(new C53383GnF());
        this.A03 = A10;
        this.A04 = 10b.A03(A10);
    }
}
