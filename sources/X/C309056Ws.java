package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6Ws  reason: invalid class name and case insensitive filesystem */
public final class C309056Ws extends C308916We {
    public final Context A00;
    public final C255773uh A01;
    public final C316276lO A02;
    public final C317126ml A03;
    public final User A04;
    public final AnonymousClass6a7 A05;
    public final AnonymousClass3BQ A06;

    public static final SpannableStringBuilder A00(C309056Ws r3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = r3.A04;
        if (!(!r3.A09() || user == null || r3.A02.A05 == null)) {
            String C9e = user.A03.C9e();
            if (C9e != null) {
                spannableStringBuilder.append(C9e);
                if (user.isVerified() && r3.A06.A00()) {
                    C244273av.A07(r3.A00, spannableStringBuilder, false);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return spannableStringBuilder;
    }

    public C309056Ws(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, AnonymousClass3BQ r6, C316276lO r7, C317126ml r8, AnonymousClass6a7 r9) {
        super(r3, userSession, r5);
        this.A00 = context;
        this.A02 = r7;
        this.A01 = r5;
        this.A03 = r8;
        this.A06 = r6;
        this.A05 = r9;
        this.A04 = r5.A0i;
    }
}
