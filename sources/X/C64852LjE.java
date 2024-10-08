package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.LjE  reason: case insensitive filesystem */
public final class C64852LjE implements AnonymousClass3NL {
    public final /* synthetic */ C322946wf A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Reel A02;

    public final void DP5(View view) {
    }

    public C64852LjE(C322946wf r1, UserSession userSession, Reel reel) {
        this.A00 = r1;
        this.A02 = reel;
        this.A01 = userSession;
    }

    public final boolean Dqe(View view) {
        Reel A0M;
        C322946wf r3 = this.A00;
        Reel reel = this.A02;
        if (reel == null) {
            A0M = null;
        } else {
            A0M = 1OP.A05(this.A01).A0M(reel.getId());
        }
        r3.DTT(A0M);
        return true;
    }
}
