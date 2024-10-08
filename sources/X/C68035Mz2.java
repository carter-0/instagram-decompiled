package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Mz2  reason: case insensitive filesystem */
public final class C68035Mz2 extends C249703kE {
    public ImmutableList A00 = ImmutableList.of();
    public C252063oV A01;
    public GradientSpinnerAvatarView A02;
    public Long A03 = C51971G9r.A0m();
    public final ViewGroup A04;
    public final FrameLayout A05;
    public final TextView A06;
    public final IgTextView A07;

    public C68035Mz2(View view) {
        super(view);
        this.A04 = DbU.A0C(view, R.id.row_inbox_container);
        this.A07 = DbT.A0a(view, R.id.row_inbox_username);
        this.A02 = (GradientSpinnerAvatarView) view.requireViewById(R.id.avatar_container);
        this.A01 = DbU.A0Z(view, R.id.group_photo_faceswarm_stub);
        TextView A0G = DbU.A0G(view, R.id.row_inbox_digest);
        this.A06 = A0G;
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.inbox_option_view);
        this.A05 = frameLayout;
        A0G.setMaxLines(2);
        frameLayout.setVisibility(8);
    }
}
