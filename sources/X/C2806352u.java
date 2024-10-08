package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.52u  reason: invalid class name and case insensitive filesystem */
public abstract class C2806352u {
    public static final void A00(Context context, CardView cardView, IgImageView igImageView, FollowStatus followStatus) {
        int i;
        FollowStatus followStatus2 = FollowStatus.A06;
        if (followStatus == followStatus2) {
            i = R.drawable.instagram_user_follow_pano_outline_24;
        } else {
            FollowStatus followStatus3 = FollowStatus.A07;
            i = R.drawable.instagram_user_following_pano_outline_24;
            if (followStatus == followStatus3) {
                i = R.drawable.instagram_user_requested_pano_filled_24;
            }
        }
        igImageView.setImageResource(i);
        0qQ.A0A(context);
        int i2 = R.attr.igds_color_secondary_icon;
        if (followStatus == followStatus2) {
            i2 = R.attr.igds_color_primary_icon;
        }
        igImageView.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, i2))));
        int i3 = R.color.callout_background;
        if (followStatus == followStatus2) {
            i3 = R.color.igds_elevated_background;
        }
        cardView.setCardBackgroundColor(context.getColor(i3));
    }

    public static final void A01(View view, View view2, float f, float f2) {
        C71492dQ r1;
        View findViewById = view.findViewById(R.id.facepile_constraint);
        0qQ.A07(findViewById);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((layoutParams instanceof C71492dQ) && (r1 = (C71492dQ) layoutParams) != null) {
            C270354gb r3 = new C270354gb();
            int i = r1.A0I;
            r3.A0I(constraintLayout);
            C320086rk r0 = C270354gb.A02(r3, R.id.hyper2).A03;
            r0.A0F = R.id.center;
            r0.A0G = i;
            r0.A00 = f;
            C320086rk r02 = C270354gb.A02(r3, R.id.hyper3).A03;
            r02.A0F = R.id.center;
            r02.A0G = i;
            r02.A00 = f2;
            r3.A0G(constraintLayout);
            view2.bringToFront();
        }
    }
}
