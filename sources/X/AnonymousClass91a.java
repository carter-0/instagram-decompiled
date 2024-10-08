package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.91a  reason: invalid class name */
public final class AnonymousClass91a {
    public Integer A00;
    public final ImageView A01;
    public final ConstrainedEditText A02;
    public final UserSession A03;
    public final C358388ap A04;

    public AnonymousClass91a(View view, View view2, UserSession userSession, C358388ap r6, Integer num, int i, int i2) {
        0qQ.A0B(num, 5);
        this.A00 = num;
        this.A04 = r6;
        this.A03 = userSession;
        View findViewById = view.findViewById(i);
        0qQ.A07(findViewById);
        this.A02 = (ConstrainedEditText) findViewById;
        View findViewById2 = view2.findViewById(i2);
        0qQ.A07(findViewById2);
        ImageView imageView = (ImageView) findViewById2;
        this.A01 = imageView;
        AnonymousClass3NG r1 = new AnonymousClass3NG(imageView);
        r1.A04 = new C3724891b(this);
        r1.A00();
    }

    public final void A00(Integer num) {
        ImageView imageView;
        Context context;
        int i;
        0qQ.A0B(num, 0);
        if (num != this.A00) {
            this.A00 = num;
            ConstrainedEditText constrainedEditText = this.A02;
            int intValue = num.intValue();
            int i2 = 3;
            if (intValue != 0) {
                i2 = 1;
                if (intValue != 1) {
                    if (intValue == 2) {
                        i2 = 5;
                    } else {
                        throw new IllegalStateException(002.A0R("Unknown alignment: ", AnonymousClass9UV.A00(num)));
                    }
                }
            }
            constrainedEditText.setGravity(i2);
            27p.A01(this.A03).A1s(AnonymousClass9UV.A00(this.A00));
            int intValue2 = num.intValue();
            if (intValue2 == 0) {
                imageView = this.A01;
                imageView.setImageResource(R.drawable.instagram_align_left_outline_44);
                context = imageView.getContext();
                i = 2131975083;
            } else if (intValue2 != 1) {
                if (intValue2 == 2) {
                    imageView = this.A01;
                    imageView.setImageResource(R.drawable.instagram_align_right_outline_44);
                    context = imageView.getContext();
                    i = 2131975084;
                }
                this.A04.Dqz(num);
            } else {
                imageView = this.A01;
                imageView.setImageResource(R.drawable.instagram_align_center_outline_44);
                context = imageView.getContext();
                i = 2131975082;
            }
            imageView.setContentDescription(context.getString(i));
            this.A04.Dqz(num);
        }
    }
}
