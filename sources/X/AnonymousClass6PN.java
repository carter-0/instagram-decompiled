package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6PN  reason: invalid class name */
public final class AnonymousClass6PN {
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
    public Long A0B;
    public String A0C = "";
    public boolean A0D = true;
    public boolean A0E;
    public final C252063oV A0F;

    public AnonymousClass6PN(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A0F = A012;
        A012.EeU(new AnonymousClass6PO(this));
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

    public final void A02(boolean z) {
        String str;
        A01().setVisibility(0);
        ConstraintLayout constraintLayout = this.A06;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            if (z) {
                ConstraintLayout constraintLayout2 = this.A05;
                if (constraintLayout2 != null) {
                    constraintLayout2.setBackground(A00().getContext().getDrawable(R.drawable.reel_lead_gen_card_rounded_top_corner_background));
                    return;
                }
            } else if (this.A0C.length() == 0) {
                View A002 = A00();
                ConstraintLayout constraintLayout3 = this.A05;
                if (constraintLayout3 != null) {
                    ConstraintLayout constraintLayout4 = this.A06;
                    if (constraintLayout4 != null) {
                        I5R.A01(A002, A01(), constraintLayout3, constraintLayout4);
                        return;
                    }
                }
            } else {
                return;
            }
            str = "cardViewWithoutCta";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "ctaButtonLayout";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
