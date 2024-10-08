package X;

import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;
import java.util.concurrent.CancellationException;

/* renamed from: X.Kcq  reason: case insensitive filesystem */
public final class C62256Kcq extends LGN {
    public C262204Co A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final View A02;
    public final C14649Tzv A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62256Kcq(View view, AnonymousClass4DH r8, UserSession userSession) {
        super(view, r8, userSession, C313666go.VIEWER);
        0qQ.A0B(userSession, 2);
        C66304MMn A012 = C66304MMn.A01(userSession, r8, 36);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66307MMq(new C66307MMq(r8, 29), 30));
        this.A0D = DbS.A0I(new C66307MMq(A002, 31), A012, C66304MMn.A01(A002, (Object) null, 35), DbS.A0z(C60244Ji1.class));
        this.A02 = AnonymousClass7TF.A0G(view, R.id.iglive_reactions_composer);
        this.A08 = C66307MMq.A01(view, 24);
        this.A07 = C66307MMq.A01(this, 23);
        this.A09 = C66307MMq.A01(this, 25);
        this.A0C = C66307MMq.A02(this, 28);
        this.A06 = C66307MMq.A01(this, 22);
        this.A0B = C66307MMq.A01(this, 27);
        this.A0A = C66307MMq.A01(this, 26);
        this.A05 = C66307MMq.A01(this, 21);
        this.A04 = C66307MMq.A01(this, 20);
        this.A03 = new C14649Tzv(3);
    }

    public final void A03() {
        super.A03();
        Handler handler = this.A01;
        handler.removeCallbacksAndMessages((Object) null);
        AnonymousClass0eM r1 = this.A07;
        AnonymousClass7TE.A0c(r1).setOnClickListener((View.OnClickListener) null);
        C51969G9p.A1M(r1.getValue());
        View A0c = AnonymousClass7TE.A0c(this.A09);
        A0c.setScaleX(0.0f);
        A0c.setScaleY(0.0f);
        A0c.setAlpha(0.6f);
        A0c.setRotation(-10.0f);
        MAM.A00(handler, AnonymousClass7TE.A0c(this.A06), 0, false);
        MAM.A00(handler, AnonymousClass7TE.A0c(this.A0B), 0, false);
        MAM.A00(handler, AnonymousClass7TE.A0c(this.A0A), 0, false);
        MAM.A00(handler, AnonymousClass7TE.A0c(this.A05), 0, false);
        MAM.A00(handler, AnonymousClass7TE.A0c(this.A04), 0, false);
        this.A02.setAlpha(1.0f);
        C262204Co r0 = this.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A00 = null;
    }

    public final void A04(Fragment fragment) {
        IgLiveViewerLikesViewModel igLiveViewerLikesViewModel;
        AnonymousClass0r6 r2;
        super.A04(fragment);
        if (this.A00 == null) {
            C60244Ji1 A012 = A01();
            C262204Co r0 = null;
            if (!(!(A012 instanceof IgLiveViewerLikesViewModel) || (igLiveViewerLikesViewModel = (IgLiveViewerLikesViewModel) A012) == null || (r2 = igLiveViewerLikesViewModel.A09) == null)) {
                r0 = JTS.A0t(fragment, MHB.A01(this, (AnonymousClass4D7) null, 2), r2);
            }
            this.A00 = r0;
        }
        LY5.A01(AnonymousClass7TE.A0c(this.A07), 51, this);
    }
}
