package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class EAQ extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final F1t A02;

    public EAQ(AnonymousClass0iw r2, UserSession userSession, F1t f1t) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = f1t;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        0qQ.A0B(r3, 0);
        if (obj instanceof ER7) {
            r3.A7U(1);
        } else if ((obj instanceof ER5) || (obj instanceof ER6) || (obj instanceof ER4) || (obj instanceof ER8)) {
            r3.A7U(0);
        }
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C49723F3m f3m;
        int i2;
        C47009Dp1 dp1;
        ClickableSpan[] clickableSpanArr;
        ImageView.ScaleType scaleType;
        int A04 = DbX.A04(view, 897968847);
        if (obj instanceof C49723F3m) {
            f3m = (C49723F3m) obj;
        } else {
            f3m = null;
        }
        if (f3m != null) {
            view.setVisibility(0);
            C46342Dck dck = C46342Dck.A00;
            Context context = view.getContext();
            SpannableStringBuilder A03 = dck.A03(AnonymousClass7TF.A0A(context), f3m);
            Object tag = view.getTag();
            if (!(tag instanceof C47009Dp1) || (dp1 = (C47009Dp1) tag) == null) {
                i2 = 1803851563;
                AnonymousClass0fD.A0A(i2, A04);
            }
            Drawable A002 = f3m.A00(context);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = dp1.A04;
            if (A002 != null) {
                gradientSpinnerAvatarView.setAvatarViewDrawable(A002);
                if ((f3m instanceof ER8) || (f3m instanceof ER7)) {
                    scaleType = ImageView.ScaleType.CENTER;
                } else {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                gradientSpinnerAvatarView.setScaleType(scaleType);
                gradientSpinnerAvatarView.setVisibility(0);
                dp1.A00.setVisibility(0);
            } else {
                gradientSpinnerAvatarView.setVisibility(8);
                dp1.A00.setVisibility(8);
            }
            IgTextView igTextView = dp1.A02;
            igTextView.setText(A03);
            CharSequence A022 = f3m.A02(AnonymousClass7TF.A0A(context));
            IgTextView igTextView2 = dp1.A03;
            if (A022 != null) {
                igTextView2.setText(A022);
                igTextView2.setVisibility(0);
            } else {
                igTextView2.setVisibility(8);
            }
            CharSequence A012 = f3m.A01(AnonymousClass7TF.A0A(context));
            IgTextView igTextView3 = dp1.A01;
            if (A012 != null) {
                igTextView3.setText(A012);
                igTextView3.setVisibility(0);
            } else {
                igTextView3.setVisibility(8);
            }
            if (A03 == null || (clickableSpanArr = (ClickableSpan[]) A03.getSpans(0, A03.length(), ClickableSpan.class)) == null || clickableSpanArr.length == 0) {
                FP7.A00(dp1.itemView, 3, f3m, this);
            } else {
                igTextView.setMovementMethod(AnonymousClass6LK.A00);
                dp1.itemView.setClickable(false);
            }
            FBW.A00.A00(this.A00, this.A01, f3m);
        } else {
            view.setVisibility(8);
        }
        i2 = 597273689;
        AnonymousClass0fD.A0A(i2, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A09;
        int i2;
        int A03 = AnonymousClass0fD.A03(-318573707);
        0qQ.A0B(viewGroup, 1);
        LayoutInflater A0D = DbV.A0D(viewGroup);
        if (i == 1) {
            A09 = DbU.A09(A0D, viewGroup, R.layout.feedback_from_facebook_comments_list_row, false);
            A09.setTag(new C47009Dp1(A09));
            i2 = 985157916;
        } else {
            A09 = DbU.A09(A0D, viewGroup, R.layout.feedback_from_facebook_likes_list_row, false);
            A09.setTag(new C47009Dp1(A09));
            i2 = 1808361676;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return A09;
    }
}
