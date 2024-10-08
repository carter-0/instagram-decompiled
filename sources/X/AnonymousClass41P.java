package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.41P  reason: invalid class name */
public final class AnonymousClass41P {
    public final int A00;
    public final Activity A01;
    public final Context A02;
    public final UserSession A03;
    public final 0Pl A04;
    public final boolean A05;

    public AnonymousClass41P(Activity activity, Context context, UserSession userSession, 0Pl r6, boolean z) {
        0qQ.A0B(context, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(userSession, 4);
        this.A01 = activity;
        this.A02 = context;
        this.A04 = r6;
        this.A03 = userSession;
        this.A05 = z;
        this.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_bottom_material);
    }

    public final void A01(AnonymousClass9IP r5, C254033rp r6) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r5, 1);
        if (this.A05) {
            2eQ.A04(r6.A00, 4);
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) r5.A01;
        int length = spannableStringBuilder.length();
        C252063oV r2 = r6.A01;
        if (length > 0) {
            ((TextView) r2.getView()).setText(spannableStringBuilder);
            ((TextView) r2.getView()).setMovementMethod(LinkMovementMethod.getInstance());
            boolean z = r5.A02;
            View view = r2.getView();
            if (z) {
                0nA.A0X(view, this.A00);
            } else {
                0nA.A0X(view, 0);
            }
            r2.getView().setVisibility(0);
        } else if (r2.CVM()) {
            r2.getView().setVisibility(8);
        }
    }

    public static final View A00(Context context, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        View A012 = 2Su.A01(from, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_label_below_comments, false, true);
        A012.setTag(new C254033rp(A012));
        return A012;
    }
}
