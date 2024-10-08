package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gt7  reason: case insensitive filesystem */
public final class C53716Gt7 extends C251343mx {
    public final 1Xj A00;
    public final C59590JPk A01;
    public final UserSession A02;

    public final C251263mp A0X(AnonymousClass3Y5 r38) {
        boolean z;
        2V1 r10;
        Context context;
        Resources resources;
        Spanned A07;
        AnonymousClass3Y5 r36 = r38;
        0qQ.A0B(r36, 0);
        C65231bS B8b = this.A00.A0C.B8b();
        if (B8b == null) {
            return null;
        }
        AnonymousClass3XV r18 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, new C244253at(AnonymousClass05K.A0Y, J6E.A00(this, 44), (String) null));
        Integer num = AnonymousClass05K.A00;
        2WX A002 = AnonymousClass9JR.A00(C51971G9r.A0X(A0X, num, 95.0f, 0), AnonymousClass05K.A0A, 0, C244013aV.A0B(r36));
        Integer num2 = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U(A002, num2, 0);
        J6E A003 = J6E.A00(this, 45);
        Integer num3 = AnonymousClass05K.A1F;
        2WX A0Y = C51971G9r.A0Y(A0U, num3, A003, 4);
        C243573Zh r28 = C243573Zh.CENTER;
        2WX A0Y2 = C51971G9r.A0Y(A0Y, num, r28, 3);
        2Wb A0Q = C51972G9s.A0Q(r36);
        2Wb r0 = A0Q;
        r0.A00(I3N.A02(r0, (2WX) null, R.color.black_70_transparent));
        2WX A004 = AnonymousClass9JR.A00(C51971G9r.A0X(C51971G9r.A0Y((2WX) null, num, r28, 3), num2, 1.0f, 1), AnonymousClass05K.A06, 0, C244013aV.A06(A0Q));
        C243583Zi r23 = C243583Zi.SPACE_BETWEEN;
        2Wb A0w = G9t.A0w(A0Q);
        2WX A0Y3 = C51971G9r.A0Y((2WX) null, num, r28, 3);
        Drawable A0K = C51968G9o.A0K(A0w, R.drawable.instagram_donations_filled_12);
        Context context2 = A0w.Aqq().A0C;
        DbX.A11(context2, A0K, 2Yu.A05(context2));
        2V1 r11 = A0w.A00;
        C51974G9v.A0h(A0K, r11, A0w, A0Y3);
        2WX A0S = C51973G9u.A0S(C51972G9s.A0R((2WX) null, 0, C244013aV.A06(A0w)), C51965G9l.A0c(num3, 0, C244013aV.A06(A0w)), num2, 1.0f, 1);
        C243573Zh r32 = C243573Zh.FLEX_START;
        2Wb A0S2 = AnonymousClass7TG.A0S(r11);
        Boolean BvT = B8b.BvT();
        if (BvT != null) {
            z = BvT.booleanValue();
            if (!z) {
                r10 = A0S2.A00;
                context = r10.A0C;
                resources = context.getResources();
                A07 = DbU.A07(resources, B8b.getFundraiserTitle(), 2131962331);
            }
            r10 = A0S2.A00;
            context = r10.A0C;
            resources = context.getResources();
            A07 = DbU.A07(resources, B8b.getFundraiserTitle(), 2131962380);
        } else {
            z = true;
            r10 = A0S2.A00;
            context = r10.A0C;
            resources = context.getResources();
            A07 = DbU.A07(resources, B8b.getFundraiserTitle(), 2131962380);
        }
        0qQ.A0A(A07);
        Integer num4 = AnonymousClass05K.A0N;
        2WX A0Y4 = C51971G9r.A0Y((2WX) null, num4, A07, 0);
        int A05 = C51968G9o.A05(context, A0S2);
        long A04 = C244013aV.A04(A0S2);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, A07, 0);
        C51973G9u.A17(A0S2, A0b, A05, A04);
        A0b.A0R(0);
        G9w.A12(typeface, A0S2, A0b, A0D);
        A0b.A0W(num);
        C51974G9v.A14(A0b, num, 1.0f, false, true);
        A0b.A0D();
        G9t.A1M(A0S2, A0Y4, A0b);
        String formattedFundraiserProgressInfoText = B8b.getFormattedFundraiserProgressInfoText();
        if (formattedFundraiserProgressInfoText != null) {
            r18 = C51971G9r.A0Y((2WX) null, num4, formattedFundraiserProgressInfoText, 0);
        }
        String formattedFundraiserProgressInfoText2 = B8b.getFormattedFundraiserProgressInfoText();
        int A052 = C51968G9o.A05(context, A0S2);
        long A08 = C244013aV.A08(A0S2);
        C244103ae A0b2 = C51971G9r.A0b(r10, (2V5) null, formattedFundraiserProgressInfoText2, 0);
        C51973G9u.A17(A0S2, A0b2, A052, A08);
        A0b2.A0R(0);
        G9w.A12(typeface, A0S2, A0b2, A0D);
        A0b2.A0W(num);
        C51974G9v.A14(A0b2, num, 1.0f, false, true);
        A0b2.A0D();
        G9t.A1M(A0S2, r18, A0b2);
        if (z) {
            Spanned A072 = DbU.A07(resources, B8b.getFundraiserOwnerUsername(), 2131962330);
            0qQ.A07(A072);
            2WX A0Y5 = C51971G9r.A0Y((2WX) null, num4, A072, 0);
            int A053 = C51968G9o.A05(context, A0S2);
            long A082 = C244013aV.A08(A0S2);
            C244103ae A0b3 = C51971G9r.A0b(r10, (2V5) null, A072, 0);
            C51973G9u.A17(A0S2, A0b3, A053, A082);
            A0b3.A0R(0);
            G9w.A12(typeface, A0S2, A0b3, A0D);
            A0b3.A0W(num);
            C51974G9v.A14(A0b3, num, 1.0f, false, true);
            A0b3.A0D();
            G9t.A1M(A0S2, A0Y5, A0b3);
        }
        A0w.A00(C243563Zg.A06(A0S2, A0w, A0S, r32, (C243573Zh) null, (C243583Zi) null, false));
        2Wb r02 = A0Q;
        C51971G9r.A1G(I3N.A01(A0w, C51971G9r.A0Y((2WX) null, num, r28, 3)), A0w, r02, A004, r23);
        return C243563Zg.A0G(r02, r36, A0Y2);
    }

    public C53716Gt7(UserSession userSession, 1Xj r2, C59590JPk jPk) {
        AnonymousClass7TG.A1Q(jPk, userSession);
        this.A00 = r2;
        this.A01 = jPk;
        this.A02 = userSession;
    }
}
