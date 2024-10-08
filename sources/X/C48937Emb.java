package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Emb  reason: case insensitive filesystem */
public abstract class C48937Emb {
    public static final void A00(AnonymousClass0iw r13, UserSession userSession, C51875G5m g5m, C50901Fkg fkg, Reel reel, List list, boolean z) {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        int i4;
        0qQ.A0B(userSession, 0);
        C50901Fkg fkg2 = fkg;
        Reel reel2 = reel;
        DbZ.A0t(1, r13, fkg2, reel2);
        FrameLayout frameLayout = fkg2.A01;
        Context context = frameLayout.getContext();
        C255773uh A0A = reel2.A0A(userSession, 0);
        0qQ.A07(A0A);
        0qQ.A0A(context);
        int A09 = 0nA.A09(context);
        if (z) {
            View view = fkg2.A00;
            view.setPadding(0, 0, 0, 0);
            view.getLayoutParams().width = A09 / 2;
        }
        CircularImageView circularImageView = fkg2.A05;
        User user = A0A.A0i;
        if (user != null) {
            DbU.A1S(r13, circularImageView, user);
            TextView textView = fkg2.A04;
            textView.setText(user.getFullName());
            IgProgressImageView igProgressImageView = fkg2.A06;
            igProgressImageView.setAdjustViewBounds(true);
            ImageUrl A08 = A0A.A08(context);
            if (A08 != null) {
                igProgressImageView.setUrl(A08, r13);
                if (z) {
                    i3 = A09 / 2;
                } else {
                    FrameLayout frameLayout2 = fkg2.A02;
                    if (frameLayout2 != null) {
                        i = frameLayout2.getPaddingLeft();
                    } else {
                        i = 0;
                    }
                    int i5 = A09 - i;
                    if (frameLayout2 != null) {
                        i2 = frameLayout2.getPaddingRight();
                    } else {
                        i2 = 0;
                    }
                    i3 = i5 - i2;
                }
                int A082 = (int) (((float) i3) / (((float) A09) / ((float) 0nA.A08(context))));
                1Xj r0 = A0A.A0b;
                r0.getClass();
                String A2u = r0.A2u();
                String A2t = r0.A2t();
                String A00 = AnonymousClass000.A00(1);
                if (!(A2u == null || A2t == null)) {
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    0qQ.A0C(layoutParams2, A00);
                    layoutParams2.height = A082;
                    layoutParams2.width = i3;
                    frameLayout.setLayoutParams(layoutParams2);
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(A2u), Color.parseColor(A2t)});
                    gradientDrawable.setCornerRadius(0.0f);
                    frameLayout.setBackground(gradientDrawable);
                }
                boolean CcK = A0A.CcK();
                TextView textView2 = fkg2.A03;
                if (CcK) {
                    textView2.setVisibility(0);
                    DbU.A1A(context.getResources(), textView2, 2131957526);
                    ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                    0qQ.A0C(layoutParams3, A00);
                    layoutParams = (FrameLayout.LayoutParams) layoutParams3;
                    i4 = 48;
                } else {
                    textView2.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                    0qQ.A0C(layoutParams4, A00);
                    layoutParams = (FrameLayout.LayoutParams) layoutParams4;
                    i4 = 16;
                }
                layoutParams.gravity = i4;
                AnonymousClass0fU.A00(new FO6(9, list, g5m, reel2, fkg2), frameLayout);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
