package X;

import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6f  reason: case insensitive filesystem */
public final class C54288H6f extends C228042kh {
    public final long A00;
    public final ChallengeName A01;
    public final ChallengeState A02;
    public final UserSession A03;
    public final String A04;

    public C54288H6f(ChallengeName challengeName, ChallengeState challengeState, UserSession userSession, String str, long j) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = j;
        this.A01 = challengeName;
        this.A02 = challengeState;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A03;
        long j = this.A00;
        return new C53034GhQ(this.A01, this.A02, userSession, new C56005HrB(userSession), this.A04, j);
    }
}
