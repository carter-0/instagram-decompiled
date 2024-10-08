package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import java.text.NumberFormat;

public abstract class F8A {
    public static final void A00(Context context, View view, int i, int i2) {
        TextView A0R = AnonymousClass7TG.A0R(view, i);
        int A0H = 2Yu.A0H(context, R.attr.glyphColorPrimary);
        StateListDrawable A08 = AnonymousClass3JT.A08(context, i2, A0H, i2, A0H);
        A08.setBounds(0, 0, A08.getIntrinsicWidth(), A08.getIntrinsicHeight());
        A0R.setCompoundDrawables(A08, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static final void A01(Resources resources, TextView textView, int i, int i2) {
        textView.setText(NumberFormat.getInstance(AnonymousClass1Q2.A02()).format((long) i));
        textView.setContentDescription(DbV.A0v(resources, Integer.valueOf(i), i2, i));
        0nA.A0c(textView, 0);
        0nA.A0X(textView, 0);
        textView.setVisibility(0);
    }
}
