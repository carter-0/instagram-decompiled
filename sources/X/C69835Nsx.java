package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;

/* renamed from: X.Nsx  reason: case insensitive filesystem */
public abstract class C69835Nsx {
    public static final SpannableStringBuilder A00(Context context, CharSequence charSequence, Integer num, Integer num2, boolean z) {
        int A03;
        boolean z2;
        SpannableStringBuilder A0C = DbS.A0C(charSequence);
        Drawable drawable = context.getDrawable(R.drawable.instagram_gen_ai_pano_filled_24);
        if (num != null) {
            A03 = num.intValue();
        } else {
            A03 = (int) 0nA.A03(context, 12.0f);
        }
        if (drawable != null) {
            int i = 0;
            drawable.setBounds(0, 0, A03, A03);
            if (num2 != null) {
                AnonymousClass7TE.A1R(drawable, num2.intValue());
            }
            C2606346l r2 = new C2606346l(drawable);
            if (0mk.A02(context) ? z : !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                A0C.insert(0, "  ");
            } else {
                A0C.append("  ");
                i = A0C.length() - 1;
            }
            A0C.setSpan(r2, i, i + 1, 33);
            return A0C;
        }
        throw AnonymousClass7TE.A0y();
    }
}
