package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;

/* renamed from: X.3N6  reason: invalid class name */
public final class AnonymousClass3N6 extends C249703kE {
    public AnonymousClass6VJ A00;
    public String A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final LinearLayout A05;
    public final TextView A06;
    public final View A07;
    public final RecyclerReelAvatarView A08;

    public final View A00() {
        RecyclerReelAvatarView recyclerReelAvatarView = this.A08;
        if (recyclerReelAvatarView != null) {
            return ((AnonymousClass3N9) recyclerReelAvatarView.getHolder().A03.getValue()).A0K;
        }
        View view = this.A07;
        view.getClass();
        return view;
    }

    public AnonymousClass3N6(View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.outer_container);
        this.A05 = linearLayout;
        2eS.A04(linearLayout, AnonymousClass05K.A01);
        this.A07 = view.findViewById(R.id.avatar_container);
        this.A08 = view.findViewById(R.id.avatar_view);
        this.A03 = view.findViewById(R.id.badge_background);
        this.A04 = (ImageView) view.findViewById(R.id.badge_icon);
        this.A06 = (TextView) view.findViewById(R.id.badge_label);
        this.A02 = view.findViewById(R.id.avatar_image_view);
    }
}
