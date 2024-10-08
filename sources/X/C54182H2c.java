package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.audience.AudienceUseCase;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;

/* renamed from: X.H2c  reason: case insensitive filesystem */
public final class C54182H2c extends AnonymousClass8ZF {
    public final AudienceUseCase A00;
    public final H2N A01;
    public final H2P A02;

    public /* synthetic */ C54182H2c(UserSession userSession, AudienceRepository audienceRepository, CreatorAiSettingsRepository creatorAiSettingsRepository, String str) {
        02z A10 = DbS.A10(new JZA(7, 2, false, false));
        05G A012 = 106.A01(0Yt.A0E());
        05G A013 = 106.A01(0sl.A00);
        02z A102 = DbS.A10(HNK.NOBODY);
        AudienceRepository audienceRepository2 = audienceRepository;
        String str2 = str;
        AudienceUseCase audienceUseCase = new AudienceUseCase(audienceRepository2, creatorAiSettingsRepository, str2, A102, A10, A012, A013);
        H2P h2p = new H2P(userSession, audienceRepository2, str2, A012, A013);
        H2N h2n = new H2N(audienceRepository2, A10, A102);
        this.A00 = audienceUseCase;
        this.A02 = h2p;
        this.A01 = h2n;
        audienceUseCase.A04(this, true);
        h2p.A04(this, true);
        h2n.A04(this, true);
        addCloseable(audienceRepository2);
    }

    public final void A00(HNK hnk) {
        0qQ.A0B(hnk, 0);
        AudienceUseCase audienceUseCase = this.A00;
        audienceUseCase.A06.Epw(hnk);
        audienceUseCase.A09.Epw(hnk);
        if (audienceUseCase.A00) {
            audienceUseCase.A05.Epw(C54617HLa.LOADING);
        }
        AnonymousClass7TE.A1Z(new C58104ImQ(audienceUseCase, (AnonymousClass4D7) null, 11), audienceUseCase.A03());
    }
}
