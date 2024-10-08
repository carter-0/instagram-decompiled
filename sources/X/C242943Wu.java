package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Wu  reason: invalid class name and case insensitive filesystem */
public final class C242943Wu {
    public final UserSession A00;
    public final C2360732i A01;
    public final C242813Wa A02;
    public final C249763kK A03;

    public C242943Wu(UserSession userSession, C2360732i r3, C242813Wa r4, C249763kK r5) {
        0qQ.A0B(r3, 3);
        0qQ.A0B(r4, 4);
        this.A00 = userSession;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass9IZ A00(Context context, 1Xj r12, AnonymousClass4DU r13, C242943Wu r14, AnonymousClass3W1 r15) {
        String str;
        CharSequence A002;
        CharSequence charSequence;
        1Xj r10 = r12;
        0qQ.A0B(r12, 0);
        AnonymousClass3W1 r9 = r15;
        0qQ.A0B(r15, 1);
        AnonymousClass4DU r7 = r13;
        0qQ.A0B(r13, 3);
        boolean z = r15.A2a;
        C242943Wu r8 = r14;
        UserSession userSession = r14.A00;
        if (!AnonymousClass3WY.A00(userSession, r12, r13, z)) {
            return null;
        }
        C245923dh B2s = r12.A0C.B2s();
        if (B2s != null) {
            str = B2s.B2q();
        } else {
            str = null;
        }
        String A2g = r12.A2g();
        if (str == null || 00l.A0W(str) || A2g == null || 00l.A0W(A2g)) {
            String A2h = r12.A2h();
            if (A2h == null) {
                A002 = "";
            } else {
                Spanned fromHtml = Html.fromHtml(A2h, 63);
                0qQ.A07(fromHtml);
                C253003q3 r1 = new C253003q3(new SpannableStringBuilder(fromHtml), userSession);
                r1.A0L = true;
                r1.A01 = 2Yu.A0F(context, R.attr.textColorBoldLink);
                r1.A03(new C57255IUq(r12));
                r1.A0Q = true;
                A002 = r1.A00();
                0qQ.A0A(A002);
            }
            charSequence = A002;
        } else {
            charSequence = C55014Hal.A00(str, A2g);
        }
        return new AnonymousClass9IZ(new AnonymousClass9IV(27, (Object) new AnonymousClass9MR(39, r7, r8, r9, r10), (Object) new AnonymousClass9MF(12, r12, r14, r15)), charSequence, r15.A28);
    }
}
