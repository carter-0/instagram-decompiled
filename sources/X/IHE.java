package X;

import android.os.Bundle;
import com.instagram.api.schemas.Challenge;
import com.instagram.creator.achievements.modules.models.Badge;

public final class IHE implements 06c {
    public final /* synthetic */ C55621Hkg A00;

    public IHE(C55621Hkg hkg) {
        this.A00 = hkg;
    }

    public final void DGi(String str, Bundle bundle) {
        C55621Hkg hkg;
        C318136oS A002;
        0sL imO;
        Badge.ChallengeBadge challengeBadge;
        0qQ.A0B(bundle, 1);
        if (bundle.getBoolean(AnonymousClass000.A00(2516))) {
            C55621Hkg hkg2 = this.A00;
            if (hkg2 != null) {
                Challenge challenge = (Challenge) bundle.getParcelable(AnonymousClass000.A00(2124));
                if (challenge != null) {
                    challengeBadge = C56282Hvq.A01(challenge, false);
                } else {
                    challengeBadge = null;
                }
                C53038GhU ghU = hkg2.A00;
                A002 = C318116oQ.A00(ghU);
                imO = new C59673JTe(challengeBadge, ghU, (AnonymousClass4D7) null, 9, hkg2.A01);
            } else {
                return;
            }
        } else if (bundle.getBoolean(AnonymousClass000.A00(2418)) && (hkg = this.A00) != null) {
            C53038GhU ghU2 = hkg.A00;
            A002 = C318116oQ.A00(ghU2);
            imO = new C58102ImO(ghU2, (AnonymousClass4D7) null, 10);
        } else {
            return;
        }
        AnonymousClass7TE.A1Z(imO, A002);
    }
}
