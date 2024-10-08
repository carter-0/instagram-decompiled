package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6PT  reason: invalid class name */
public final class AnonymousClass6PT {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public IgButton A07;
    public IgLinearLayout A08;
    public CircularImageView A09;
    public IgImageView A0A;
    public String A0B = "";
    public final C252063oV A0C;

    public AnonymousClass6PT(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A0C = A012;
        A012.EeU(new AnonymousClass6PU(this));
    }

    public final View A00() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        0qQ.A0F("containerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgButton A01() {
        IgButton igButton = this.A07;
        if (igButton != null) {
            return igButton;
        }
        0qQ.A0F("ctaButtonView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        A01().setVisibility(4);
        ConstraintLayout constraintLayout = this.A06;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        } else {
            0qQ.A0F("ctaButtonLayout");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A03() {
        String str;
        A01().setVisibility(0);
        ConstraintLayout constraintLayout = this.A06;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            if (this.A0B.length() == 0) {
                View A002 = A00();
                ConstraintLayout constraintLayout2 = this.A05;
                if (constraintLayout2 != null) {
                    ConstraintLayout constraintLayout3 = this.A06;
                    if (constraintLayout3 != null) {
                        I5R.A01(A002, A01(), constraintLayout2, constraintLayout3);
                        return;
                    }
                } else {
                    str = "cardViewWithoutCta";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                return;
            }
        }
        str = "ctaButtonLayout";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
