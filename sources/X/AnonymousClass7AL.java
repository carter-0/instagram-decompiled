package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.7AL  reason: invalid class name */
public final class AnonymousClass7AL {
    public final Context A00;

    public AnonymousClass7AL(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final Spannable A00(Spannable spannable, UserSession userSession, String str, String str2, boolean z) {
        0qQ.A0B(spannable, 0);
        0qQ.A0B(userSession, 1);
        if (!z) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        Context context = this.A00;
        String string = context.getString(2131959775);
        0qQ.A07(string);
        String string2 = context.getString(2131964456, new Object[]{"", string});
        0qQ.A07(string2);
        if (!(str == null || str2 == null)) {
            C69841Nt5.A00(userSession).A00(str, str2);
        }
        SpannableStringBuilder append = spannableStringBuilder.append(string2);
        0qQ.A07(append);
        return append;
    }
}
