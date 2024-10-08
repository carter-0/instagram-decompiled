package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.6mJ  reason: invalid class name and case insensitive filesystem */
public final class C316846mJ implements C317556nS {
    public View A00;
    public IgFrameLayout A01;
    public IgProgressBar A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public UOB A06;
    public GradientSpinnerAvatarView A07;
    public String A08;
    public final Context A09;
    public final C71662eb A0A;

    public final void EcX(boolean z) {
        IgTextView igTextView = this.A03;
        if (z) {
            if (igTextView != null) {
                igTextView.setVisibility(4);
                IgProgressBar igProgressBar = this.A02;
                if (igProgressBar != null) {
                    igProgressBar.setVisibility(0);
                    return;
                }
                0qQ.A0F("loadingSpinner");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (igTextView != null) {
            igTextView.setVisibility(0);
            IgProgressBar igProgressBar2 = this.A02;
            if (igProgressBar2 != null) {
                igProgressBar2.setVisibility(4);
                return;
            }
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("buttonView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FJq(UserSession userSession) {
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            0qQ.A0F("buttonView");
            throw AnonymousClass00P.createAndThrow();
        }
        Context context = igTextView.getContext();
        0qQ.A0A(context);
        UOB uob = this.A06;
        if (uob != null) {
            igTextView.setText(C55098Hc7.A00(context, userSession, uob));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C316846mJ(Context context, C71662eb r2) {
        this.A09 = context;
        this.A0A = r2;
    }
}
