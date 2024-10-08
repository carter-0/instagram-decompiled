package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import java.util.List;

/* renamed from: X.8cd  reason: invalid class name and case insensitive filesystem */
public final class C359338cd extends C361478gI {
    public String A00 = "";
    public boolean A01 = true;
    public boolean A02 = true;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final UserSession A06;
    public final InspirationHubRepository A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C359338cd(Application application, UserSession userSession, InspirationHubRepository inspirationHubRepository) {
        super(application);
        0qQ.A0B(inspirationHubRepository, 2);
        this.A07 = inspirationHubRepository;
        this.A06 = userSession;
        C359378cj r0 = new C359378cj(new AnonymousClass0qC(new C359368ci(this, 11M.A00(AnonymousClass05K.A00, inspirationHubRepository.A07, 0))));
        19B r3 = 19B.A00;
        this.A05 = C226292g8.A00(r3, r0);
        this.A04 = C226292g8.A00(r3, new C62130rc(new C359388ck(new AnonymousClass0qC(inspirationHubRepository.A06))));
        this.A03 = C226292g8.A00(r3, new C62130rc(new C359408cm(new C359398cl(this, inspirationHubRepository.A05))));
    }

    public final void A0E(B1M b1m, List list) {
        if (this.A02) {
            List list2 = list;
            if (list != null && !list.isEmpty()) {
                this.A02 = false;
                C318136oS A002 = C318116oQ.A00(this);
                AnonymousClass9KF r3 = new AnonymousClass9KF(this, list2, b1m, (AnonymousClass4D7) null, 20);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
            }
        }
    }
}
