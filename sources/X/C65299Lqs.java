package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.Lqs  reason: case insensitive filesystem */
public final class C65299Lqs implements MV9 {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final Lr0 A03;
    public final L4U A04;
    public final MTF A05;

    public C65299Lqs(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, Lr0 lr0, L4U l4u, MTF mtf) {
        0qQ.A0B(context, 1);
        C51974G9v.A0d(2, userSession, ingestSessionShim, l4u, lr0);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = mtf;
        this.A02 = ingestSessionShim;
        this.A04 = l4u;
        this.A03 = lr0;
    }

    public final int BPM(TextView textView) {
        0qQ.A0B(textView, 0);
        return this.A03.BPH(textView);
    }

    public final void D8z() {
    }

    public final void Dj4() {
        LRm AXA = this.A05.AXA();
        C61002Juy juy = C61002Juy.A09;
        Context context = this.A00;
        UserSession userSession = this.A01;
        UserStoryTarget userStoryTarget = UserStoryTarget.A05;
        AXA.A06(new C65294Lqn(context, userSession, this.A02, userStoryTarget, this.A04.A00, "ig_story_composer", false), juy);
        this.A03.Djv(userStoryTarget);
    }

    public final void DuW() {
        this.A05.AXA().A07(C61002Juy.A09);
        this.A03.Dua(UserStoryTarget.A05);
    }
}
