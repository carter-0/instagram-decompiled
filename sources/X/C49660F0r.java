package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.F0r  reason: case insensitive filesystem */
public final class C49660F0r {
    public Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final IgdsButton A08;

    public C49660F0r(Context context, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, CircularImageView circularImageView, IgdsButton igdsButton) {
        AnonymousClass7TG.A1U(context, circularImageView, textView);
        AnonymousClass7TG.A1R(textView2, imageView);
        AnonymousClass7TF.A1F(textView3, 6, igdsButton);
        this.A07 = circularImageView;
        this.A06 = textView;
        this.A05 = textView2;
        this.A03 = imageView;
        this.A04 = textView3;
        this.A02 = view;
        this.A08 = igdsButton;
        Drawable drawable = context.getDrawable(R.drawable.instagram_payments_icons_radio);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            0qQ.A07(mutate);
            this.A00 = mutate;
            DbX.A11(context, mutate, R.color.badge_color);
            Drawable drawable2 = context.getDrawable(R.drawable.unchecked);
            if (drawable2 != null) {
                Drawable mutate2 = drawable2.mutate();
                this.A01 = mutate2;
                DbX.A11(context, mutate2, R.color.baseline_neutral_80);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
