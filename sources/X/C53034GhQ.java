package X;

import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import java.util.Map;

/* renamed from: X.GhQ  reason: case insensitive filesystem */
public final class C53034GhQ extends 2YL {
    public final long A00;
    public final ChallengeState A01;
    public final UserSession A02;
    public final C56005HrB A03;
    public final String A04;
    public final 0V2 A05;
    public final 0V2 A06;
    public final C61770pa A07;
    public final C61770pa A08;
    public final ChallengeName A09;

    public C53034GhQ(ChallengeName challengeName, ChallengeState challengeState, UserSession userSession, C56005HrB hrB, String str, long j) {
        AnonymousClass7TG.A0w(1, userSession, challengeName, challengeState);
        this.A02 = userSession;
        this.A00 = j;
        this.A09 = challengeName;
        this.A01 = challengeState;
        this.A04 = str;
        this.A03 = hrB;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 1, 0);
        this.A06 = A012;
        this.A08 = new 0V1((C262204Co) null, A012);
        05D A013 = 10D.A01(num, 0, 0);
        this.A05 = A013;
        this.A07 = new 0V1((C262204Co) null, A013);
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A03(num, 19B.A00, new C58104ImQ(this, (AnonymousClass4D7) null, 2), A002);
    }

    public static final void A01(C53034GhQ ghQ, String str) {
        I6J i6j = I6J.A00;
        UserSession userSession = ghQ.A02;
        String str2 = ghQ.A04;
        List A1I = AnonymousClass7TE.A1I(Long.valueOf(ghQ.A00));
        String obj = ghQ.A09.toString();
        i6j.A03(userSession, (ProductType) null, "challenge_details", "challenges_fetch", str2, (String) null, str, (List) null, A1I, AnonymousClass7TE.A1I(obj), AnonymousClass7TF.A0w(obj, AnonymousClass7TF.A0w(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, ghQ.A01.toString()).toString()), (Map) null);
    }

    public static final void A00(ChallengeButtonInfo challengeButtonInfo, C53034GhQ ghQ) {
        0sL imQ;
        int i;
        int ordinal = challengeButtonInfo.Aig().ordinal();
        C318136oS A002 = C318116oQ.A00(ghQ);
        switch (ordinal) {
            case 1:
                i = 18;
                break;
            case 2:
                i = 14;
                break;
            case 3:
                i = 15;
                break;
            case 4:
                imQ = new C58104ImQ(challengeButtonInfo, ghQ, (AnonymousClass4D7) null, 3);
                break;
            case 5:
                i = 13;
                break;
            case 7:
                imQ = new C58104ImQ(ghQ, (AnonymousClass4D7) null, 4);
                break;
            default:
                i = 16;
                break;
        }
        imQ = new C58102ImO(ghQ, (AnonymousClass4D7) null, i);
        AnonymousClass7TE.A1Z(imQ, A002);
    }
}
