package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GvQ  reason: case insensitive filesystem */
public final class C53859GvQ extends C251343mx {
    public final int A00;
    public final 2WX A01;
    public final UserSession A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final 0sL A07;
    public final 0sL A08;
    public final boolean A09;
    public final List A0A;

    public C53859GvQ(2WX r2, UserSession userSession, Integer num, String str, String str2, String str3, List list, 0sL r9, 0sL r10, int i, boolean z) {
        C51974G9v.A0d(3, r2, r9, r10, str2);
        0qQ.A0B(userSession, 10);
        this.A04 = str;
        this.A0A = list;
        this.A01 = r2;
        this.A07 = r9;
        this.A08 = r10;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = num;
        this.A00 = i;
        this.A02 = userSession;
        this.A09 = z;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        int A082;
        int i;
        ShapeDrawable shapeDrawable;
        Paint paint;
        int i2;
        AnonymousClass3Y5 r25 = r27;
        AnonymousClass3Y5 r0 = r25;
        0qQ.A0B(r0, 0);
        2Wa A002 = C243643Zq.A00(r0, C58516ItB.A00);
        AnonymousClass4F7.A00(r25, new 2Vk(C51973G9u.A0a(2Vi.A04, "end_scene_multiple_choice_cta_button"), C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION));
        2WX r23 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0));
        long A0A2 = C244013aV.A0A(r25);
        2WX A003 = AnonymousClass9JR.A00(A0X, AnonymousClass05K.A04, 0, C244013aV.A03(r25));
        Integer num2 = AnonymousClass05K.A15;
        2WX A004 = AnonymousClass9JR.A00(A003, num2, 0, A0A2);
        C59041J4a j4a = C59041J4a.A00;
        Integer num3 = AnonymousClass05K.A1F;
        2WX A0z = G9t.A0z(G9t.A10(A004, num3, j4a), num, C243573Zh.STRETCH);
        2Wb A0Q = C51972G9s.A0Q(r25);
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Object obj = A002.A03;
            boolean A0K = 0qQ.A0K(obj, A18);
            int i3 = R.drawable.sponsored_viewer_end_scene_multiple_choice_option_background;
            if (A0K) {
                i3 = R.drawable.sponsored_viewer_end_scene_multiple_choice_cta_background;
            }
            Drawable A0D = C244013aV.A0D(A0Q, i3);
            2V1 Aqq = A0Q.Aqq();
            2WX A0S = C51973G9u.A0S(C51971G9r.A0Y(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0F, 0, C244013aV.A0A(A0Q)), num2, C244013aV.A0D(A0Q, 2Yu.A0H(Aqq.A0C, 16843534)), 4), C51965G9l.A0d(num, A0D, 4), num, 100.0f, 0);
            boolean A0K2 = 0qQ.A0K(obj, A18);
            Integer num4 = AnonymousClass05K.A06;
            2WX A0Y = C51971G9r.A0Y(C51973G9u.A0Y(A0S, num4, A0K2), num3, new C73949PmT(this, A002, A18, 40), 4);
            2Wb A0S2 = AnonymousClass7TG.A0S(Aqq);
            2WX A0V = C51973G9u.A0V((2WX) null, A0S2, num4, 0);
            boolean A0K3 = 0qQ.A0K(obj, A18);
            2V1 r15 = A0S2.A00;
            Context context = r15.A0C;
            int i4 = R.attr.igds_color_primary_text_on_media;
            if (A0K3) {
                i4 = R.attr.igds_color_text_on_white;
            }
            int A083 = C51968G9o.A08(context, A0S2, i4);
            long A0C = C244013aV.A0C(A0S2, R.dimen.account_group_management_row_text_size);
            Integer num5 = this.A03;
            if (num5 != null) {
                i2 = num5.intValue();
            } else {
                i2 = Integer.MAX_VALUE;
            }
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, A18, 0);
            C51973G9u.A17(A0S2, A0b, A083, A0C);
            A0b.A0R(1);
            G9w.A12(typeface, A0S2, A0b, A0D2);
            C51974G9v.A17(A0b, num, false);
            A0b.A0M(i2);
            C51973G9u.A19(A0V, A0b, false);
            C51967G9n.A1G(A0S2, A0b);
            C51967G9n.A1D(A0S2, A0Q, A0Y);
        }
        2V1 Aqq2 = A0Q.Aqq();
        Context context2 = Aqq2.A0C;
        Drawable A0D3 = C244013aV.A0D(A0Q, 2Yu.A0H(context2, 16843868));
        String str = this.A04;
        if (str != null) {
            A082 = Color.parseColor(str);
            i = R.attr.igds_color_primary_text_on_media;
        } else {
            A082 = C51968G9o.A08(context2, A0Q, R.attr.igds_color_primary_button_on_media);
            i = R.attr.igds_color_text_on_white;
        }
        Drawable A0D4 = C244013aV.A0D(A0Q, R.drawable.sponsored_viewer_end_scene_multiple_choice_cta_background);
        if (A0D4 instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) A0D4;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(A082);
            }
        } else if (!(!(A0D4 instanceof ShapeDrawable) || (shapeDrawable = (ShapeDrawable) A0D4) == null || (paint = shapeDrawable.getPaint()) == null)) {
            paint.setColor(A082);
        }
        2WX A0V2 = C51971G9r.A0V(Aqq2, (2WX) null, C243533Zd.LOCAL, "end_scene_multiple_choice_cta_button");
        float f = 0.0f;
        if (((CharSequence) A002.A03).length() > 0) {
            f = 1.0f;
        }
        2WX A012 = C52112GFg.A01(A0V2, f);
        2Wb A0S3 = AnonymousClass7TG.A0S(Aqq2);
        2WX r14 = this.A01;
        2WX r12 = r14;
        AnonymousClass9JR A0k = C51966G9m.A0k(0, C244013aV.A0A(A0S3));
        if (r14 == r23) {
            r14 = null;
        }
        2WX A0Y2 = C51971G9r.A0Y(C51973G9u.A0S(C51965G9l.A0X(r14, A0k), C51965G9l.A0c(AnonymousClass05K.A1I, 0, C51965G9l.A07(this.A00)), num, 100.0f, 0), num3, new J6T(7, (Object) A002, (Object) this), 4);
        2V1 r20 = A0S3.A00;
        2Wb A0S4 = AnonymousClass7TG.A0S(r20);
        AnonymousClass9JS A0d = C51965G9l.A0d(num2, A0D3, 4);
        if (r12 == r23) {
            r12 = null;
        }
        2WX A0Y3 = C51971G9r.A0Y(C51973G9u.A0S(C51965G9l.A0X(r12, A0d), C51965G9l.A0d(num, A0D4, 4), num, 100.0f, 0), num3, new J6T(8, (Object) A002, (Object) this), 4);
        2Wb A0w = G9t.A0w(A0S4);
        2WX A005 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A06, 0, C244013aV.A06(A0w));
        String str2 = this.A05;
        2V1 r122 = A0w.A00;
        int A084 = C51968G9o.A08(r122.A0C, A0w, i);
        long A0C2 = C244013aV.A0C(A0w, R.dimen.account_group_management_row_text_size);
        Typeface typeface2 = Typeface.DEFAULT;
        long A0D5 = C51969G9p.A0D();
        C244103ae A0b2 = C51971G9r.A0b(r122, (2V5) null, str2, 0);
        C51973G9u.A17(A0w, A0b2, A084, A0C2);
        A0b2.A0R(1);
        G9w.A12(typeface2, A0w, A0b2, A0D5);
        A0b2.A0B();
        C51974G9v.A1A(A0b2, num, false, true);
        C244123ag.A00(A0b2, A005);
        C51967G9n.A1G(A0w, A0b2);
        C51971G9r.A1C(C243563Zg.A0F(A0w, A0S4, A0Y3), A0S4, A0S3, A0Y2);
        String str3 = this.A06;
        if (str3 != null) {
            UserSession userSession = this.A02;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36320743126213424L)) {
                2WX A006 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, 0, C244013aV.A05(A0S3));
                int A0C3 = C51971G9r.A0C(r20, A0S3);
                long A085 = C244013aV.A08(A0S3);
                C244103ae A0b3 = C51971G9r.A0b(r20, (2V5) null, str3, 0);
                C51973G9u.A17(A0S3, A0b3, A0C3, A085);
                A0b3.A0R(0);
                G9w.A12(typeface2, A0S3, A0b3, A0D5);
                A0b3.A0B();
                C51974G9v.A12(A0b3, num);
                A0b3.A0E();
                C51973G9u.A19(A006, A0b3, false);
                C51967G9n.A1G(A0S3, A0b3);
            }
        }
        C51967G9n.A1F(A0S3, A0Q, A012);
        return C243563Zg.A04(A0Q, r25, A0z);
    }
}
