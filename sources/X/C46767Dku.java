package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;

/* renamed from: X.Dku  reason: case insensitive filesystem */
public final class C46767Dku extends 2YL {
    public final CreatorAIFanNuxRepository A00;
    public final String A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final C333357Yq A04;

    public final void A00() {
        long j;
        String str = this.A01;
        C333357Yq r1 = this.A04;
        String A0R = 002.A0R(AnonymousClass000.A00(3494), str);
        0xa r5 = r1.A01;
        int i = (r5.getLong(A0R, 0) > 0 ? 1 : (r5.getLong(A0R, 0) == 0 ? 0 : -1));
        0xY AR4 = r5.AR4();
        if (i == 0) {
            j = AwakeTimeSinceBootClock.INSTANCE.now();
        } else {
            j = -1;
        }
        AR4.E5c(A0R, j);
        AR4.apply();
        CreatorAIFanNuxRepository creatorAIFanNuxRepository = this.A00;
        if (creatorAIFanNuxRepository.A00 != 1) {
            creatorAIFanNuxRepository.A00 = 2;
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, false, "did_accept");
            0Df.A00(A032, "BETA_02_24", "terms_type");
            C41848B3p.A1L(A032, A042);
            PandoGraphQLRequest A002 = C50171FSd.A00(A042, A043);
            AnonymousClass7TE.A1Z(new C58104ImQ(A002, creatorAIFanNuxRepository, (AnonymousClass4D7) null, 7), creatorAIFanNuxRepository.A01);
        }
    }

    public C46767Dku(CreatorAIFanNuxRepository creatorAIFanNuxRepository, C333357Yq r3, String str) {
        AnonymousClass7TG.A1P(creatorAIFanNuxRepository, str);
        this.A00 = creatorAIFanNuxRepository;
        this.A04 = r3;
        this.A01 = str;
        02z A10 = DbS.A10(new JV5());
        this.A02 = A10;
        this.A03 = A10;
    }
}
