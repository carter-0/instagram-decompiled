package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Guu  reason: case insensitive filesystem */
public final class C53827Guu extends C251343mx {
    public final C300835xz A00;
    public final Activity A01;
    public final C335907dj A02;
    public final C333777a7 A03;
    public final C52971GgO A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final boolean A07;

    public C53827Guu(Activity activity, C335907dj r3, C333777a7 r4, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r7, C300835xz r8, boolean z) {
        0qQ.A0B(ggO, 4);
        AnonymousClass7TG.A1S(r8, userSession);
        this.A01 = activity;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = ggO;
        this.A00 = r8;
        this.A05 = userSession;
        this.A06 = r7;
        this.A07 = z;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r38) {
        boolean z;
        long doubleToRawLongBits;
        long doubleToRawLongBits2;
        long floatToRawIntBits;
        String A0F;
        boolean z2;
        AnonymousClass3Y5 r7 = r38;
        0qQ.A0B(r7, 0);
        Float valueOf = Float.valueOf(1.0f);
        2V5 A002 = C247343gB.A00(r7, valueOf);
        2V5 A003 = C247343gB.A00(r7, valueOf);
        Object A004 = AnonymousClass3Zw.A00(r7, new C58188Ins(46, A003, A002), new Object[0]);
        C243773a4.A00(r7, new C58188Ins(45, A004, this), C51970G9q.A1b());
        C335907dj r0 = this.A02;
        C335907dj r31 = r0;
        int A0A = AnonymousClass7TG.A0A(r0.A0G);
        int i = 56;
        boolean z3 = this.A07;
        int i2 = 20;
        int i3 = 0;
        if (z3) {
            i = 50;
            i2 = 14;
            i3 = 6;
        }
        2V1 r14 = r7.A05;
        Context A0B = C51965G9l.A0B(r14);
        UserSession userSession = this.A05;
        boolean A012 = C52180GHw.A01(A0B, userSession);
        boolean A005 = new C317746nl(userSession).A00();
        C333777a7 r4 = this.A03;
        if (r4 == null || (z2 && (!(z2 = r4.A0d) || !A005))) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass3XV r02 = 2WX.A02;
        if (A012) {
            doubleToRawLongBits = ((long) Float.floatToRawIntBits(64.0f)) | 9221683186994511872L;
        } else {
            doubleToRawLongBits = Double.doubleToRawLongBits(64.0d);
        }
        Integer num = AnonymousClass05K.A01;
        2WX A006 = AnonymousClass9JR.A00((2WX) null, num, 0, doubleToRawLongBits);
        long A072 = C51965G9l.A07(i);
        Integer num2 = AnonymousClass05K.A00;
        2WX A007 = AnonymousClass9JR.A00(A006, num2, 0, A072);
        Integer num3 = AnonymousClass05K.A0C;
        2WX A0X = C51971G9r.A0X(A007, num3, 0.0f, 1);
        2Wb A0S = AnonymousClass7TG.A0S(r14);
        if (z) {
            2WX A008 = AnonymousClass9JR.A00((2WX) null, num2, 0, A072);
            if (A012) {
                doubleToRawLongBits2 = ((long) Float.floatToRawIntBits(64.0f)) | 9221683186994511872L;
            } else {
                doubleToRawLongBits2 = Double.doubleToRawLongBits(64.0d);
            }
            2WX A0S2 = C51973G9u.A0S(A008, C51965G9l.A0c(num, 0, doubleToRawLongBits2), num3, 0.0f, 1);
            C52971GgO ggO = this.A04;
            C300835xz r10 = this.A00;
            2V1 r03 = A0S.A00;
            2WX A009 = A0S2.A00(HX6.A00(AnonymousClass7TF.A0A(r03.A0C), r31, r4, ggO, userSession, r10, z3));
            2Wb A0S3 = AnonymousClass7TG.A0S(r03);
            Integer num4 = AnonymousClass05K.A1F;
            2WX A0A2 = C51974G9v.A0A(A002, (2WX) null, new AnonymousClass9JS(A002, num4));
            long A0G = C51970G9q.A0G();
            long A0K = C51970G9q.A0K();
            long A073 = C51965G9l.A07(i2);
            Integer num5 = AnonymousClass05K.A0u;
            2WX A0S4 = C51973G9u.A0S(C51971G9r.A0W(A003, AnonymousClass9JR.A00(C51974G9v.A0G(A0A2, C51965G9l.A0c(num5, 0, A0K), 0, A0G), num4, 0, A073), num2), C51965G9l.A0d(AnonymousClass05K.A06, Boolean.valueOf(r31.A0S), 4), num3, 0.0f, 1);
            Integer num6 = AnonymousClass05K.A08;
            2WX A0U = C51973G9u.A0U(C51971G9r.A0Y(A0S4, num6, "row_comment_like_button", 4), A0S3, 2131964931);
            2V1 r142 = A0S3.A00;
            Context context = r142.A0C;
            int A022 = A0S3.Bnf().A02(2Yu.A09(context));
            int A08 = C51968G9o.A08(context, A0S3, R.attr.igds_color_icon_badge);
            A0S3.A00(new C244603bS(C244013aV.A0D(A0S3, R.drawable.ufi_heart_icon), ImageView.ScaleType.FIT_CENTER, (2V5) null, A0U, A022, A08));
            if (A0A > 0) {
                if (A012) {
                    0qQ.A07(context);
                    floatToRawIntBits = C52180GHw.A00(context);
                    A0F = C14066TpE.A00(context.getResources(), Integer.valueOf(A0A), (Integer) null, false);
                } else {
                    floatToRawIntBits = ((long) Float.floatToRawIntBits(12.0f)) | 9221683186994511872L;
                    A0F = C244013aV.A0F(A0S3, Integer.valueOf(A0A), 2131956371);
                }
                0qQ.A0A(A0F);
                2WX A0Y = C51971G9r.A0Y(C51973G9u.A0X(C51974G9v.A0J((2WX) null, C51965G9l.A0b(num, 0.0f, 1), num2), num5, (double) i3, 0), num6, "row_comment_textview_like_count", 4);
                int A074 = C51968G9o.A07(context, A0S3);
                Typeface create = Typeface.create("sans-serif-medium", 0);
                0qQ.A07(create);
                Integer num7 = num;
                Typeface A032 = 0oh.A03(context, create, num7);
                Integer num8 = num2;
                if (A012) {
                    num8 = num7;
                }
                long A0D = C51969G9p.A0D();
                C244103ae A0b = C51971G9r.A0b(r142, (2V5) null, A0F, R.style.igds_emphasized_body_2);
                C51973G9u.A17(A0S3, A0b, A074, floatToRawIntBits);
                A0b.A0R(0);
                G9w.A12(A032, A0S3, A0b, A0D);
                A0b.A0W(num2);
                C51974G9v.A13(A0b, num8, 1.0f);
                A0b.A0D();
                G9t.A1M(A0S3, A0Y, A0b);
            }
            C51967G9n.A1F(A0S3, A0S, A009);
        }
        return C243563Zg.A0B(A0S, r7, A0X);
    }
}
