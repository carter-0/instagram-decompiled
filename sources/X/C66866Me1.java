package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.instagram.android.R;

/* renamed from: X.Me1  reason: case insensitive filesystem */
public abstract class C66866Me1 {
    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, C376629Is r5, int i) {
        AnonymousClass7TG.A1N(context, spannableStringBuilder);
        try {
            context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material);
        } catch (Resources.NotFoundException unused) {
        }
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.RoleIndicatorStyle), i, DbX.A05(r5.A03) + i, 33);
    }
}
