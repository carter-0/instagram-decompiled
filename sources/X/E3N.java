package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.newsfeed.model.PillsFilterCategory;

public final class E3N extends AnonymousClass4DH implements C227272iw, C51909G7d {
    public static final String __redex_internal_original_name = "CommentInsightsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = C51804G2n.A01(this, "summary_id", 0eO.A02, 32);
    public final String A02 = "ig_comment_insights_hub";
    public final boolean A03 = true;

    public final void DGX() {
    }

    public final void DGc() {
    }

    public final void DpP() {
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Etr(true);
        r4.Eom(2131956370);
        if (2bA.A02(AnonymousClass7TF.A0L(this.A00, 0))) {
            r4.Eu4(true);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C46352Dcv A002 = C49014Enq.A00(AnonymousClass7TE.A0l(this.A00), (PillsFilterCategory) null, DbS.A0t(this.A01));
        0s1 A0C = DbW.A0C(this);
        A0C.A0A(A002, R.id.newsfeed_you);
        A0C.A00();
    }

    public final boolean COC() {
        return false;
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final boolean isContainerFragment() {
        return this.A03;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1027162464);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed, viewGroup, false);
        AnonymousClass0fD.A09(335950339, A022);
        return inflate;
    }
}
