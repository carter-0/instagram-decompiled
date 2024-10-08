package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.instagram.feed.ui.text.IgLikeTextView;

/* renamed from: X.3uu  reason: invalid class name and case insensitive filesystem */
public abstract class C255903uu {
    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, C247663gi r3) {
        Object obj;
        0sP r0;
        0qQ.A0B(r3, 1);
        0qQ.A0B(context, 2);
        if (r3.A04) {
            r0 = r3.A00.A01;
        } else if (r3.A09) {
            r0 = r3.A00.A09;
        } else if (r3.A0A) {
            r0 = r3.A00.A0B;
        } else if (r3.A07) {
            r0 = r3.A00.A04;
        } else {
            obj = "";
            spannableStringBuilder.append((CharSequence) obj);
        }
        obj = r0.invoke(context);
        spannableStringBuilder.append((CharSequence) obj);
    }

    public static final void A01(AnonymousClass41O r5, C247663gi r6, Integer num) {
        View.OnClickListener r0;
        0qQ.A0B(r5, 0);
        View view = r5.A00;
        IgLikeTextView igLikeTextView = r5.A02;
        if (r6.A05) {
            Context context = igLikeTextView.getContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            0qQ.A0A(context);
            A00(context, spannableStringBuilder, r6);
            if (spannableStringBuilder.length() != 0) {
                view.setVisibility(0);
                igLikeTextView.setText(spannableStringBuilder);
                if (num != null) {
                    igLikeTextView.setTextColor(num.intValue());
                }
                igLikeTextView.setMovementMethod(LinkMovementMethod.getInstance());
                igLikeTextView.setLongClickable(false);
                igLikeTextView.setVisibility(0);
                igLikeTextView.setAlpha(1.0f);
                if (r6.A09) {
                    r0 = new C298205t3(igLikeTextView, r6);
                } else if (r6.A04) {
                    r0 = new AnonymousClass9PI(igLikeTextView, r6);
                } else if (r6.A0A || r6.A07) {
                    r0 = new AnonymousClass58P(igLikeTextView, r6);
                } else {
                    return;
                }
                AnonymousClass0fU.A00(r0, igLikeTextView);
                return;
            }
        }
        view.setVisibility(8);
    }
}
