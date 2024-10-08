package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6mU  reason: invalid class name and case insensitive filesystem */
public final class C316956mU implements View.OnClickListener, Animator.AnimatorListener, C2365734g {
    public int A00 = 8;
    public View A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public TextView A05;
    public IgTextView A06;
    public CircularImageView A07;
    public C317216mu A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public final C71662eb A0D;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A00 == 8) {
            this.A0D.A03(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.A0D.A03(0);
    }

    public C316956mU(ViewStub viewStub) {
        C71662eb r0 = new C71662eb(viewStub);
        this.A0D = r0;
        r0.A02 = this;
    }

    public final void DKS(View view) {
        this.A07 = (CircularImageView) view.findViewById(R.id.suggested_highlight_end_card_cover_image);
        this.A05 = (TextView) view.findViewById(R.id.suggested_highlight_end_card_title);
        this.A0B = view.findViewById(R.id.suggested_highlight_end_card_publish_button);
        this.A0C = view.findViewById(R.id.suggested_highlight_end_card_remove_suggestion_button);
        this.A0A = view.findViewById(R.id.end_of_year_end_card_publish_button);
        this.A04 = (ViewGroup) view.findViewById(R.id.end_of_year_end_card_container);
        this.A09 = view.findViewById(R.id.birthday_highlight_end_card_share_button);
        this.A03 = view.findViewById(R.id.superlative_end_card_share_to_story_button);
        this.A02 = view.findViewById(R.id.superlative_end_card_share_full_story_button);
        this.A01 = view.findViewById(R.id.superlative_end_card_back_to_story_button);
        this.A06 = view.findViewById(R.id.superlative_end_card_subtitle);
        View view2 = this.A0B;
        if (view2 != null) {
            AnonymousClass0fU.A00(this, view2);
        }
        View view3 = this.A0C;
        if (view3 != null) {
            AnonymousClass0fU.A00(this, view3);
        }
        View view4 = this.A0A;
        if (view4 != null) {
            AnonymousClass0fU.A00(this, view4);
        }
        View view5 = this.A09;
        if (view5 != null) {
            AnonymousClass0fU.A00(this, view5);
        }
        View view6 = this.A03;
        if (view6 != null) {
            AnonymousClass0fU.A00(this, view6);
        }
        View view7 = this.A01;
        if (view7 != null) {
            AnonymousClass0fU.A00(this, view7);
        }
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-317438823);
        if (view == this.A0B) {
            C317216mu r0 = this.A08;
            r0.getClass();
            r0.Daw();
        } else if (view == this.A0C) {
            C317216mu r02 = this.A08;
            r02.getClass();
            r02.Dda();
        } else if (view == this.A0A) {
            C317216mu r03 = this.A08;
            r03.getClass();
            r03.DCA();
        } else if (view == this.A09) {
            C317216mu r04 = this.A08;
            r04.getClass();
            r04.DUL();
        } else if (view == this.A03) {
            C317216mu r05 = this.A08;
            r05.getClass();
            r05.DkE();
        } else if (view == this.A01) {
            C317216mu r06 = this.A08;
            r06.getClass();
            r06.Cxd();
        }
        AnonymousClass0fD.A0C(-85488644, A052);
    }
}
