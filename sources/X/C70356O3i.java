package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.O3i  reason: case insensitive filesystem */
public abstract class C70356O3i {
    public static final C2606346l A00(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.right_caret);
        0qQ.A0A(drawable);
        Drawable mutate = drawable.mutate();
        0qQ.A07(mutate);
        DbX.A11(context, mutate, R.color.design_dark_default_color_on_background);
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        return new C2606346l(mutate);
    }
}
