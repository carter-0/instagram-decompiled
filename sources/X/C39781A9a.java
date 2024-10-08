package X;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.A9a  reason: case insensitive filesystem */
public final class C39781A9a {
    public final ViewGroup A00;

    public final void A00(View.OnClickListener onClickListener, CharSequence charSequence, Integer num, Integer num2) {
        if (charSequence != null && charSequence.length() != 0) {
            TextView A0R = AnonymousClass7TG.A0R(this.A00, R.id.thread_disabled_title);
            A0R.setText(charSequence);
            if (onClickListener != null) {
                AnonymousClass0fU.A00(onClickListener, A0R);
            } else {
                A0R.setMovementMethod(LinkMovementMethod.getInstance());
            }
            A0R.setVisibility(0);
            if (num != null) {
                A0R.setHighlightColor(num.intValue());
            }
            if (num2 != null) {
                A0R.setTextColor(num2.intValue());
            }
        }
    }

    public final void A01(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            TextView A0R = AnonymousClass7TG.A0R(this.A00, R.id.thread_disabled_bottom_description);
            A0R.setText(charSequence);
            A0R.setMovementMethod(LinkMovementMethod.getInstance());
            A0R.setVisibility(0);
        }
    }

    public final void A02(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            TextView A0R = AnonymousClass7TG.A0R(this.A00, R.id.thread_disabled_top_description);
            A0R.setText(charSequence);
            A0R.setMovementMethod(LinkMovementMethod.getInstance());
            A0R.setVisibility(0);
        }
    }

    public C39781A9a(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
