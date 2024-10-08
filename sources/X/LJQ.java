package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class LJQ {
    public static final Drawable A00(Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.autocomplete_dropdown_header_text_size);
        drawable.setColorFilter(AnonymousClass7TF.A03(context, R.attr.textColorSecondary), PorterDuff.Mode.SRC_IN);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        return drawable;
    }

    public static final void A01(C63785L6r l6r, String str, String str2, String str3, boolean z, boolean z2) {
        Drawable drawable;
        AnonymousClass7TG.A1N(l6r, str);
        if (AnonymousClass7TF.A1Q(str.length())) {
            TextView textView = l6r.A00;
            DbS.A1C(textView);
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        SpannableStringBuilder append = C51965G9l.A0E().append(str);
        0qQ.A0A(append);
        if (str2 != null) {
            append.append(" ").append("•").append(" ").append(str2);
        }
        if (str3 != null) {
            append.append(" ").append("•").append(" ").append(str3);
        }
        TextView textView2 = l6r.A00;
        textView2.setText(append);
        if (z2) {
            textView2.setTextAppearance(R.style.PrivacyTextStyle);
        }
        if (z) {
            drawable = JTO.A0D(l6r.A01);
        } else {
            drawable = null;
        }
        textView2.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
