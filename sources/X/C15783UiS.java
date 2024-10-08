package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.reels.dashboard.ui.quickreaction.ReactionCountBarView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.UiS  reason: case insensitive filesystem */
public final class C15783UiS extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final ReelDashboardFragment A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        WSX wsx = (WSX) r5;
        UD9 ud9 = (UD9) r6;
        ud9.A01.setUrl(C317486nL.A04.A04(wsx.A04), this.A01);
        int i = wsx.A00;
        ud9.A00.setText(C253673rC.A02(this.A00.getResources(), Integer.valueOf(i)));
        ReactionCountBarView reactionCountBarView = ud9.A02;
        reactionCountBarView.setVisibility(0);
        reactionCountBarView.setFillPercentage(((float) i) / ((float) wsx.A02));
        WBD.A00(ud9.itemView, 6, wsx, this);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new UD9(DbT.A0C(layoutInflater, viewGroup, R.layout.reel_reaction_item));
    }

    public final Class modelClass() {
        return WSX.class;
    }

    public C15783UiS(Context context, AnonymousClass0iw r2, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = reelDashboardFragment;
    }
}
