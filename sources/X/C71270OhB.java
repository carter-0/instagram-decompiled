package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.instagram.common.session.UserSession;

/* renamed from: X.OhB  reason: case insensitive filesystem */
public final class C71270OhB implements InputFilter {
    public final int A00;
    public final UserSession A01;
    public final String A02;

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        0qQ.A0B(spanned, 3);
        if (spanned.length() < this.A00) {
            return null;
        }
        OZ3.A00(this.A01, "customer_details_page_note_exceed_threshold", this.A02, 0Yt.A0E());
        return "";
    }

    public C71270OhB(UserSession userSession, String str, int i) {
        AnonymousClass7TG.A1Q(userSession, str);
        this.A00 = i;
        this.A01 = userSession;
        this.A02 = str;
    }
}
