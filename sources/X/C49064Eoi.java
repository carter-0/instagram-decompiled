package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Eoi  reason: case insensitive filesystem */
public abstract class C49064Eoi {
    public static final void A00(C49663F0u f0u, String str) {
        f0u.A05.setVisibility(0);
        f0u.A07.setVisibility(8);
        f0u.A04.setVisibility(8);
        TextView textView = f0u.A03;
        textView.setTypeface(Typeface.defaultFromStyle(1));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        if (str.length() == 0) {
            f0u.A02.setVisibility(8);
        } else {
            TextView textView2 = f0u.A02;
            textView2.setText(str);
            textView2.setEllipsize(truncateAt);
            textView2.setMaxLines(1);
        }
        f0u.A01.setVisibility(8);
        IgSimpleImageView igSimpleImageView = f0u.A06;
        igSimpleImageView.setImageResource(R.drawable.instagram_chevron_right_pano_outline_16);
        igSimpleImageView.setOnClickListener((View.OnClickListener) null);
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(igSimpleImageView);
        A0G.setMargins(0, 0, 0, 0);
        igSimpleImageView.setLayoutParams(A0G);
        Drawable drawable = igSimpleImageView.getDrawable();
        Context context = igSimpleImageView.getContext();
        DbU.A10(context, drawable, 2Yu.A09(context));
        View view = f0u.A00;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }
}
