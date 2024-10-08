package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H0O extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FreeformFeedbackFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;
    public final String A03 = "creator_ai_in_thread_feedback_freeform";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131956936);
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public H0O() {
        0eO r2 = 0eO.A02;
        this.A00 = C51804G2n.A01(this, C66579MXk.A00(115), r2, 2);
        C58706IwF A012 = C58706IwF.A01(this, 27);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, C58706IwF.A01(C58706IwF.A01(this, 24), 25));
        this.A02 = DbS.A0I(C58706IwF.A01(A002, 26), A012, new C58689Ivy(44, A002, (Object) null), DbS.A0z(C60149JgU.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1602566342);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59110J6s(this, 0), -1979962830), false, false);
        AnonymousClass0fD.A09(-1167246554, A022);
        return A012;
    }
}
