package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.LAy  reason: case insensitive filesystem */
public final class C63895LAy {
    public C255773uh A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;

    public C63895LAy(View view, ReelDashboardFragment reelDashboardFragment) {
        this.A02 = view;
        this.A01 = view.requireViewById(R.id.flag_info_button_container);
        this.A08 = DbU.A0G(view, R.id.flag_info_title);
        this.A06 = DbU.A0G(view, R.id.flag_info_reason);
        TextView A0G = DbU.A0G(view, R.id.flag_info_see_all_countries_button);
        this.A07 = A0G;
        this.A04 = DbU.A0G(view, R.id.flag_info_delete_label);
        TextView A0G2 = DbU.A0G(view, R.id.flag_info_delete_button);
        this.A03 = A0G2;
        TextView A0G3 = DbU.A0G(view, R.id.flag_info_learn_more_button);
        this.A05 = A0G3;
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0G);
        A0m.A0C = true;
        A0m.A07 = true;
        C61686KHu.A00(A0m, reelDashboardFragment, this, 10);
        AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(A0G2);
        A0m2.A0C = true;
        A0m2.A07 = true;
        C61686KHu.A00(A0m2, reelDashboardFragment, this, 11);
        AnonymousClass3NG A0m3 = AnonymousClass7TE.A0m(A0G3);
        A0m3.A0C = true;
        A0m3.A07 = true;
        C61686KHu.A00(A0m3, reelDashboardFragment, this, 12);
    }
}
