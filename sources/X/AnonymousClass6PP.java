package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6PP  reason: invalid class name */
public final class AnonymousClass6PP {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public IgButton A07;
    public IgEditText A08;
    public CircularImageView A09;
    public final C252063oV A0A;

    public AnonymousClass6PP(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A0A = A012;
        A012.EeU(new AnonymousClass6PQ(this));
    }

    public final View A00() {
        View view = this.A00;
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

    public final IgEditText A02() {
        IgEditText igEditText = this.A08;
        if (igEditText != null) {
            return igEditText;
        }
        0qQ.A0F("answerCard");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03() {
        String str;
        A01().setVisibility(4);
        ConstraintLayout constraintLayout = this.A06;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
            ConstraintLayout constraintLayout2 = this.A05;
            if (constraintLayout2 != null) {
                constraintLayout2.setBackground(A00().getContext().getDrawable(R.drawable.reel_ctwa_story_messaging_card_rounded_corner_background));
                TextView textView = this.A02;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                str = "disclaimerTextView";
            } else {
                str = "cardViewWithoutCta";
            }
        } else {
            str = "ctaButtonLayout";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
