package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.4H1  reason: invalid class name */
public abstract class AnonymousClass4H1 {
    public static final void A00(Context context, C376449Ia r4, C262864Gh r5, AnonymousClass3V9 r6) {
        int i;
        0qQ.A0B(context, 0);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r4, 3);
        if (!r4.A04) {
            r6.A0A();
            return;
        }
        C262954Gq.A00((View.OnClickListener) ((0sP) ((AnonymousClass9IE) r4.A01).A00).invoke(r6), r5, (C262744Fv) r4.A02, (C262904Gl) null, r6);
        if (r4.A03) {
            i = 2Yu.A0H(context, R.attr.feedLikeActiveColor);
        } else {
            i = R.color.igds_icon_on_color;
        }
        int color = context.getColor(i);
        AnonymousClass3V9.A07(r6);
        C247753gr r0 = r6.A06;
        if (r0 != null) {
            r0.A02.setColorFilter(color);
        }
    }
}
