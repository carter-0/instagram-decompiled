package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Guw  reason: case insensitive filesystem */
public final class C53829Guw extends C251343mx {
    public final UserSession A00;
    public final C60314JjH A01;
    public final User A02;
    public final Long A03;
    public final String A04;
    public final float A05;
    public final String A06;
    public final String A07;

    public C53829Guw(UserSession userSession, C60314JjH jjH, User user, Long l, String str, String str2, String str3, float f) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = l;
        this.A02 = user;
        this.A07 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A05 = f;
        this.A01 = jjH;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r30) {
        AnonymousClass3Y5 r10 = r30;
        0qQ.A0B(r10, 0);
        User user = this.A02;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) AnonymousClass3Zw.A00(r10, new C73664Phd(30, this, r10), new Object[]{user, this.A07, this.A00});
        String str = (String) AnonymousClass3Zw.A00(r10, new C73664Phd(29, this, r10), new Object[]{this.A03});
        2V1 r4 = r10.A05;
        int A08 = C51969G9p.A08(r10, 2Yu.A08(r4.A0C));
        SpannableStringBuilder A0E = C51965G9l.A0E();
        if (str != null) {
            SpannableStringBuilder append = A0E.append(" ");
            0qQ.A07(append);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(A08);
            int length = append.length();
            append.append(str);
            append.setSpan(foregroundColorSpan, length, append.length(), 17);
        }
        if (0qQ.A0K(user.getId(), this.A06)) {
            SpannableStringBuilder append2 = A0E.append(" ");
            0qQ.A07(append2);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(A08);
            int length2 = append2.length();
            append2.append(C244013aV.A0E(r10, 2131953734));
            append2.setSpan(foregroundColorSpan2, length2, append2.length(), 17);
        }
        C244343b2 r27 = C244343b2.WRAP;
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A07, 0, C51970G9q.A0I());
        2Wb A0S = AnonymousClass7TG.A0S(r4);
        long A082 = C244013aV.A08(A0S);
        Integer num = AnonymousClass05K.A0N;
        long A0J = C51970G9q.A0J();
        Integer num2 = AnonymousClass05K.A1I;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num2, 0, A0J);
        if (spannableStringBuilder != null) {
            A003 = C51971G9r.A0Y(A003, num, spannableStringBuilder, 0);
        }
        2WX A012 = C52112GFg.A01(A003, this.A05);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num3 = AnonymousClass05K.A00;
        2V1 r12 = A0S.A00;
        C244103ae A0b = C51971G9r.A0b(r12, (2V5) null, spannableStringBuilder, 0);
        C51973G9u.A17(A0S, A0b, -16777216, A082);
        A0b.A0R(0);
        G9w.A12(typeface, A0S, A0b, A0D);
        C51974G9v.A16(A0b, num, num3);
        A0b.A0E();
        A0b.A0b(true);
        A0b.A0Y(false);
        A0b.A0Z(false);
        G9t.A1M(A0S, A012, A0b);
        long A083 = C244013aV.A08(A0S);
        2WX A0T = C51973G9u.A0T((2WX) null, C51965G9l.A0c(num2, 0, A0J), num, A0E, 0);
        C244103ae A0b2 = C51971G9r.A0b(r12, (2V5) null, A0E, 0);
        C51973G9u.A17(A0S, A0b2, -16777216, A083);
        A0b2.A0R(0);
        G9w.A12(typeface, A0S, A0b2, A0D);
        C51974G9v.A19(A0b2, num3, false);
        A0b2.A0E();
        A0b2.A0b(true);
        A0b2.A0Y(false);
        A0b2.A0Z(false);
        G9t.A1M(A0S, A0T, A0b2);
        return C243563Zg.A0H(A0S, r10, A002, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, r27, false);
    }
}
