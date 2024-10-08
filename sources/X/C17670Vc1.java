package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Vc1  reason: case insensitive filesystem */
public final class C17670Vc1 {
    public int A00 = -1;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final RecyclerView A05;
    public final IgImageView A06;
    public final IgdsBanner A07;
    public final GradientSpinner A08;

    public C17670Vc1(View view) {
        this.A01 = view;
        this.A06 = DbT.A0b(view, R.id.ar_effect_icon);
        this.A04 = DbU.A0G(view, R.id.ar_effect_title);
        this.A02 = DbU.A0G(view, R.id.ar_profile_text);
        this.A03 = DbU.A0G(view, R.id.subtitle_text);
        this.A05 = DbT.A0I(view, R.id.options_recycler_view);
        this.A08 = (GradientSpinner) view.requireViewById(R.id.effect_icon_reel_ring);
        this.A07 = (IgdsBanner) view.requireViewById(R.id.age_restricted_note_banner);
    }
}
