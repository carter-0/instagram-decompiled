package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.Vn4  reason: case insensitive filesystem */
public abstract class C18190Vn4 {
    public static final 0eP A00(Spannable spannable, Object obj, char c, int i) {
        Object ukf;
        String name;
        0qQ.A0B(spannable, 0);
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (spannable.charAt(i2) == c) {
                boolean z = obj instanceof User;
                String A00 = C273654mx.A00(524);
                if (z) {
                    ukf = new AnonymousClass91O((User) obj, 0);
                } else if (obj instanceof Hashtag) {
                    ukf = new C15915Ukf((Hashtag) obj, 0);
                } else {
                    throw new UnsupportedOperationException(A00);
                }
                if (z) {
                    name = ((User) obj).getUsername();
                } else if (obj instanceof Hashtag) {
                    name = ((Hashtag) obj).getName();
                    if (name == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw new UnsupportedOperationException(A00);
                }
                int A05 = DbX.A05(name) + i2 + 1;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                0sC A002 = 0pe.A00(spannableStringBuilder.getSpans(i2, i, AnonymousClass91P.class));
                while (A002.hasNext()) {
                    spannableStringBuilder.removeSpan(A002.next());
                }
                spannableStringBuilder.replace(i2 + 1, i, 002.A0C(name, ' '));
                spannableStringBuilder.setSpan(ukf, i2, A05, 33);
                A01(spannableStringBuilder);
                return AnonymousClass7TF.A0x(spannableStringBuilder, A05);
            }
        }
        return null;
    }

    public static final void A01(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (obj instanceof AnonymousClass91P) {
                spannable.setSpan(new StyleSpan(1), spannable.getSpanStart(obj), spannable.getSpanEnd(obj), 17);
            } else if (obj instanceof StyleSpan) {
                spannable.removeSpan(obj);
            }
        }
    }
}
