package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.instagram.android.R;

public abstract class OXG {
    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder, String str, int i) {
        String A0R = 002.A0R(str, " ");
        spannableStringBuilder.append(A0R);
        int length = spannableStringBuilder.length() - (DbX.A05(A0R) + 1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.igds_emphasized_body_2), length, length2, 33);
        spannableStringBuilder.setSpan(C66580MXl.A0E(i), length, length2, 33);
    }

    public static final String A00(String str, String str2) {
        String A12 = DbV.A12(str);
        String A122 = DbV.A12(str2);
        boolean A0Y = 00l.A0Y(A12, '.');
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (A0Y) {
            A1A.append(A12);
            A1A.append(' ');
        } else {
            A1A.append(A12);
            A1A.append(". ");
        }
        return AnonymousClass7TF.A0l(A122, A1A);
    }

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_lock_filled_12);
        if (drawable != null) {
            int A05 = AnonymousClass7TG.A05(context);
            drawable.setBounds(0, 0, A05, A05);
            AnonymousClass7TE.A1R(drawable.mutate(), i);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(new C2606346l(drawable), 0, 1, 33);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
