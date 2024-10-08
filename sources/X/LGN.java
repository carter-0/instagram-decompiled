package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import java.util.concurrent.CancellationException;

public class LGN {
    public C262204Co A00;
    public final View A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = C66307MMq.A02(this, 14);
    public final AnonymousClass0eM A04 = C66307MMq.A02(this, 15);
    public final AnonymousClass0eM A05 = C66307MMq.A02(this, 16);
    public final AnonymousClass0eM A06;

    public LGN(View view, AnonymousClass4DH r8, UserSession userSession, C313666go r10) {
        0qQ.A0B(userSession, 2);
        this.A02 = userSession;
        this.A01 = view;
        C20704Wxb wxb = new C20704Wxb(44, this, r10, r8);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66307MMq(new C66307MMq(r8, 17), 18));
        this.A06 = DbS.A0I(new C66307MMq(A002, 19), wxb, C66304MMn.A01(A002, (Object) null, 34), DbS.A0z(C60244Ji1.class));
        if (r10 != C313666go.VIEWER) {
            A04(r8);
        }
    }

    public final C60244Ji1 A01() {
        AnonymousClass0eM r0;
        if (this instanceof C62256Kcq) {
            r0 = ((C62256Kcq) this).A0D;
        } else if (this instanceof C62257Kcr) {
            r0 = ((C62257Kcr) this).A07;
        } else {
            r0 = this.A06;
        }
        return (C60244Ji1) r0.getValue();
    }

    public final void A02() {
        C60244Ji1 A012 = A01();
        IgLiveLikesRepository igLiveLikesRepository = A012.A04;
        AnonymousClass1EO r0 = igLiveLikesRepository.A00;
        if (r0 != null) {
            r0.cancel();
        }
        igLiveLikesRepository.A00 = null;
        C262204Co r02 = A012.A00;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        A012.A00 = null;
    }

    public void A03() {
        C60244Ji1 A012 = A01();
        IgLiveLikesRepository igLiveLikesRepository = A012.A04;
        AnonymousClass1EO r0 = igLiveLikesRepository.A00;
        if (r0 != null) {
            r0.cancel();
        }
        igLiveLikesRepository.A00 = null;
        C262204Co r02 = A012.A00;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        A012.A00 = null;
        C262204Co r03 = this.A00;
        if (r03 != null) {
            r03.AG7((CancellationException) null);
        }
        this.A00 = null;
    }

    public void A04(Fragment fragment) {
        A01().A05();
        if (this.A00 == null) {
            this.A00 = JTS.A0t(fragment, MHB.A01(this, (AnonymousClass4D7) null, 1), A01().A09);
        }
    }
}
