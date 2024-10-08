package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6lH  reason: invalid class name and case insensitive filesystem */
public final class C316206lH {
    public final C252063oV A00;
    public final boolean A01;

    public C316206lH(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A00 = 2b1.A01(viewStub, false, false);
        Context context = viewStub.getContext();
        0qQ.A07(context);
        this.A01 = C316216lI.A0B(context);
    }

    public final void A01(UserSession userSession, C255773uh r9, C250973mM r10, boolean z) {
        0qQ.A0B(userSession, 3);
        if (z) {
            int i = 0;
            if (r10 == null || !r10.A0H.A1P) {
                C252063oV r4 = this.A00;
                TextView textView = (TextView) r4.getView();
                Context context = textView.getContext();
                0qQ.A07(context);
                textView.setText(AnonymousClass4EQ.A07(context, userSession, r9));
                Context context2 = r4.getView().getContext();
                View view = r4.getView();
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).setDuration((long) context2.getResources().getInteger(R.integer.config_activityLongDur));
                if (r4.getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams = r4.getView().getLayoutParams();
                    0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (!this.A01 && r9 != null && r10 != null && C309506Yn.A05(context2, userSession, r9, r10) && C309506Yn.A0B(userSession, r9, r10)) {
                        0Tu r2 = 0Tu.A05;
                        i = (int) 0nA.A04(context2, ((int) 182.A01(r2, userSession, 36603575312978879L)) + ((int) 182.A01(r2, userSession, 36595384810342535L)));
                    }
                    marginLayoutParams.bottomMargin = i;
                }
                r4.getView().startAnimation(AnimationUtils.loadAnimation(context2, R.anim.enter_from_bottom));
            }
        }
    }

    public final void A00() {
        C252063oV r4 = this.A00;
        if (r4.CVM() && r4.getView().getVisibility() == 0) {
            TextView textView = (TextView) r4.getView();
            Context context = textView.getContext();
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.leave_through_bottom);
            loadAnimation.setAnimationListener(new LZB(textView, context));
            r4.getView().startAnimation(loadAnimation);
        }
    }
}
