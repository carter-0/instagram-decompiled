package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Hcw  reason: case insensitive filesystem */
public abstract class C55148Hcw {
    public static final String A00(Context context, Integer num) {
        int intValue;
        0qQ.A0B(context, 0);
        if (num == null || (intValue = num.intValue()) == 0) {
            return AnonymousClass7TF.A0d(context.getResources(), 2131973759);
        }
        String quantityString = context.getResources().getQuantityString(R.plurals.shopping_cart_count_content_description, intValue, new Object[]{num});
        0qQ.A0A(quantityString);
        return quantityString;
    }
}
