package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;

public final class H0M extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorAICreatorNuxFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_x_pano_filled_24;
        DbX.A1A(new C56800ICx(this, 34), A0K, r4);
        r4.setTitle("");
    }

    public final String getModuleName() {
        return "creator_ai_creator_nux_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public H0M() {
        C58702IwB A012 = C58702IwB.A01(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58702IwB.A01(new C58683Ivs(this, 49), 0));
        this.A01 = DbS.A0I(C58702IwB.A01(A002, 1), A012, new C58689Ivy(14, A002, (Object) null), DbS.A0z(C54180H2a.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(604061299);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 28), 772341819);
        AnonymousClass0fD.A09(-299764100, A02);
        return A0H;
    }
}
