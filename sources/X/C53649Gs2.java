package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.Gs2  reason: case insensitive filesystem */
public final class C53649Gs2 extends C251343mx {
    public final FragmentActivity A00;
    public final C62320sa A01;

    public final C251263mp A0X(AnonymousClass3Y5 r25) {
        AnonymousClass3Y5 r7 = r25;
        0qQ.A0B(r7, 0);
        C61082JwK jwK = (C61082JwK) this.A01.invoke();
        if (jwK == null) {
            return null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X((2WX) null, num, 1.0f, 1);
        Integer num2 = AnonymousClass05K.A0C;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 1.0f, 1);
        String A0E = C244013aV.A0E(r7, 2131957194);
        int A08 = C51969G9p.A08(r7, 2Yu.A07(C243803a8.A00(r7)));
        long A082 = C244013aV.A08(r7);
        Context A002 = C243803a8.A00(r7);
        Integer num3 = AnonymousClass05K.A00;
        Typeface create = Typeface.create("sans-serif-regular", 0);
        0qQ.A07(create);
        Typeface A03 = 0oh.A03(A002, create, num3);
        long A0D = C51969G9p.A0D();
        2V1 r8 = r7.A05;
        C244103ae A0b = C51971G9r.A0b(r8, (2V5) null, A0E, 0);
        C51973G9u.A16(r7, A0b, A08, A082);
        A0b.A0R(0);
        G9w.A11(A03, r7, A0b, A0D);
        C51970G9q.A1K(A0b, num2, num3);
        C51970G9q.A1I(A0b, 1.33f, false);
        A0b.A0E();
        C51973G9u.A19(A0X2, A0b, false);
        2WW A0A = A0b.A0A();
        long A0C = C244013aV.A0C(r7, R.dimen.account_group_management_clickable_width);
        long A06 = C244013aV.A06(r7);
        Integer num4 = AnonymousClass05K.A0E;
        2Tp A0B = C243563Zg.A0B(G9t.A0v(A0A, r8), r7, C51974G9v.A0H((2WX) null, C51965G9l.A0c(num4, 0, A0C), 0, A06));
        2Tp A0L = C243563Zg.A0L(r7, G9t.A10(G9t.A0y(C51973G9u.A0W((2WX) null, r7, num, R.dimen.ads_disclosure_footer_top_divider_height, 0), num2, 0), num3, C51965G9l.A0Y(C51972G9s.A0A(C243803a8.A00(r7), r7, R.attr.igds_color_elevated_separator))));
        Context A0B2 = C51965G9l.A0B(r8);
        String A0E2 = C244013aV.A0E(r7, 2131957193);
        C54491HFx hFx = new C54491HFx(jwK, this, AnonymousClass7TF.A03(A0B2, R.attr.igds_color_primary_button));
        SpannableStringBuilder A0C2 = DbS.A0C(A0E2);
        AnonymousClass7AV.A05(A0C2, hFx, A0E2);
        2WX A0O = C51974G9v.A0O((2WX) null, num, num2, 1.0f, 1);
        int A0A2 = C51972G9s.A0A(A0B2, r7, R.attr.igds_color_primary_button);
        long A083 = C244013aV.A08(r7);
        Typeface create2 = Typeface.create("sans-serif-medium", 0);
        0qQ.A07(create2);
        Typeface A032 = 0oh.A03(A0B2, create2, num);
        C244103ae A0b2 = C51971G9r.A0b(r8, (2V5) null, A0C2, 0);
        C51973G9u.A16(r7, A0b2, A0A2, A083);
        A0b2.A0R(0);
        G9w.A11(A032, r7, A0b2, A0D);
        A0b2.A0W(num3);
        C51974G9v.A14(A0b2, num3, 1.33f, false, true);
        2WW A0c = C51971G9r.A0c((AnonymousClass2VW) null, A0O, A0b2);
        long A0C3 = C244013aV.A0C(r7, R.dimen.account_group_management_clickable_width);
        2Tp A0B3 = C243563Zg.A0B(G9t.A0v(A0c, r8), r7, C51974G9v.A0F((2WX) null, C51965G9l.A0c(num4, 0, A0C3), 0, C244013aV.A06(r7)));
        2WX A0y = G9t.A0y((2WX) null, num3, 0);
        2Wb A0J = C51973G9u.A0J(A0L, A0B, r8);
        A0J.A00(A0B3);
        A0J.A00(A0L);
        return C243563Zg.A01(A0J, r7, A0y);
    }

    public C53649Gs2(FragmentActivity fragmentActivity, C62320sa r2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }
}
