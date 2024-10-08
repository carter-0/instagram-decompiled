package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.GtI  reason: case insensitive filesystem */
public final class C53727GtI extends C251343mx {
    public final C335907dj A00;
    public final C52971GgO A01;
    public final AnonymousClass4DU A02;
    public final User A03;

    public final C251263mp A0X(AnonymousClass3Y5 r29) {
        AnonymousClass3Y5 r13 = r29;
        0qQ.A0B(r13, 0);
        Object[] objArr = {this.A00};
        AnonymousClass3XV r0 = 2WX.A02;
        long A06 = C244013aV.A06(r13);
        long A062 = C244013aV.A06(r13);
        long A063 = C244013aV.A06(r13);
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A15, 0, A062);
        Integer num = AnonymousClass05K.A1F;
        2WX A10 = G9t.A10(C51974G9v.A0E(A002, C51965G9l.A0c(num, 0, A06), 0, A063), num, new J6I(this, 5));
        2Wb A0Q = C51972G9s.A0Q(r13);
        long A0C = C244013aV.A0C(A0Q, R.dimen.add_account_icon_circle_radius);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0I = C51974G9v.A0I((2WX) null, C51965G9l.A0c(num2, 0, A0C), A0Q, R.dimen.add_account_icon_circle_radius);
        String A0E = C244013aV.A0E(A0Q, 2131970052);
        Integer num3 = AnonymousClass05K.A0N;
        2WX A003 = AnonymousClass9JR.A00(C51971G9r.A0Y(A0I, num3, A0E, 0), AnonymousClass05K.A09, 0, C244013aV.A0C(A0Q, R.dimen.abc_edit_text_inset_top_material));
        Integer num4 = AnonymousClass05K.A0C;
        2WX A0X = C51971G9r.A0X(A003, num4, 0.0f, 1);
        ImageUrl Bh3 = this.A03.Bh3();
        AnonymousClass4DU r14 = this.A02;
        2V1 r7 = A0Q.A00;
        Context context = r7.A0C;
        AnonymousClass4DU r19 = r14;
        A0Q.A00(new C244443bC(A0X, r19, Bh3, (AnonymousClass3NK) null, A0Q.Bnf().A02(2Yu.A04(context)), 0, -16777216, false, true, false));
        int A07 = C51968G9o.A07(context, A0Q);
        long A04 = C244013aV.A04(A0Q);
        Typeface A032 = 0oh.A03(context, Typeface.DEFAULT, num2);
        2WX A0J = C51974G9v.A0J((2WX) null, C51965G9l.A0b(num4, 0.0f, 1), num2);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r7, (2V5) null, (SpannableStringBuilder) AnonymousClass3Zw.A00(r13, new C58188Ins(47, r13, this), objArr), 0);
        C51973G9u.A17(A0Q, A0b, A07, A04);
        A0b.A0R(0);
        G9w.A12(A032, A0Q, A0b, A0D);
        A0b.A0W(num3);
        C51974G9v.A15(A0b, num2, 0, true);
        C51973G9u.A19(A0J, A0b, false);
        C51967G9n.A1G(A0Q, A0b);
        return C243563Zg.A0B(A0Q, r13, A10);
    }

    public C53727GtI(C335907dj r1, C52971GgO ggO, AnonymousClass4DU r3, User user) {
        C51972G9s.A1D(ggO, r3);
        this.A03 = user;
        this.A00 = r1;
        this.A01 = ggO;
        this.A02 = r3;
    }
}
