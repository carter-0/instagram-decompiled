package X;

import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;

/* renamed from: X.J9j  reason: case insensitive filesystem */
public final class C59179J9j extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ ChallengeButtonInfo A02;
    public final /* synthetic */ ChallengeButtonInfo A03;
    public final /* synthetic */ ChallengeName A04;
    public final /* synthetic */ ChallengeState A05;
    public final /* synthetic */ 0sJ A06;
    public final /* synthetic */ 0sJ A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59179J9j(ChallengeButtonInfo challengeButtonInfo, ChallengeButtonInfo challengeButtonInfo2, ChallengeName challengeName, ChallengeState challengeState, 0sJ r6, 0sJ r7, int i, long j) {
        super(2);
        this.A01 = j;
        this.A04 = challengeName;
        this.A05 = challengeState;
        this.A02 = challengeButtonInfo;
        this.A06 = r6;
        this.A03 = challengeButtonInfo2;
        this.A07 = r7;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        long j = this.A01;
        ChallengeName challengeName = this.A04;
        ChallengeState challengeState = this.A05;
        I4w.A02(A0R, this.A02, this.A03, challengeName, challengeState, this.A06, this.A07, C51966G9m.A01(this.A00), j);
        return C60340gF.A00;
    }
}
