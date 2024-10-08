package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.7AI  reason: invalid class name */
public final class AnonymousClass7AI implements AnonymousClass7XM {
    public final AnonymousClass7IS A00;
    public final AnonymousClass0eK A01;
    public final AnonymousClass0eK A02;
    public final UserSession A03;

    public AnonymousClass7AI(UserSession userSession, AnonymousClass0eK r3, AnonymousClass0eK r4) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r4, 3);
        this.A03 = userSession;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = new AnonymousClass7IS(userSession);
    }

    public final Spannable CnI(Context context, CharSequence charSequence, String str, int i, boolean z) {
        Boolean bool;
        0qQ.A0B(charSequence, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (str != null) {
            if (((C333517Zg) this.A01.get()).CXH(str)) {
                bool = Boolean.valueOf(182.A06(0Tu.A05, this.A03, 36321679429412492L));
            } else {
                bool = true;
            }
            0qQ.A0A(bool);
            if (bool.booleanValue()) {
                int i2 = 2131959745;
                if (z) {
                    i2 = 2131959755;
                }
                String string = context.getString(i2);
                0qQ.A07(string);
                AnonymousClass7AV.A06(spannableStringBuilder, new AnonymousClass7AJ(this, str, z), string, i);
            }
        }
        return spannableStringBuilder;
    }
}
