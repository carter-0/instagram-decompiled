package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gsa  reason: case insensitive filesystem */
public final class C53683Gsa extends C251343mx {
    public final C54214H3j A00;
    public final C52971GgO A01;
    public final UserSession A02;

    public final C251263mp A0X(AnonymousClass3Y5 r18) {
        long A06;
        AnonymousClass3Y5 r1 = r18;
        0qQ.A0B(r1, 0);
        String A0E = C244013aV.A0E(r1, this.A00.A00.A00);
        2Wb A0Q = C51972G9s.A0Q(r1);
        Context A0O = C51966G9m.A0O(A0Q);
        if (182.A06(0Tu.A05, this.A02, 36323032344242945L)) {
            A06 = C51969G9p.A0D();
        } else {
            A06 = C244013aV.A06(A0Q);
        }
        AnonymousClass3XV r0 = 2WX.A02;
        long A062 = C244013aV.A06(A0Q);
        Integer num = AnonymousClass05K.A04;
        2WX A0Z = C51973G9u.A0Z(C51973G9u.A0Q((2WX) null, C51965G9l.A0c(num, 0, A062), 0, A06), new C59101J6j(33, (Object) this, (Object) A0O));
        2Wb A0L = C51973G9u.A0L(A0Q);
        long A0I = C51970G9q.A0I();
        int A07 = C51968G9o.A07(A0O, A0L);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(A0L.A00, (2V5) null, A0E, 0);
        C51973G9u.A17(A0L, A0b, A07, A0I);
        A0b.A0R(1);
        G9w.A12(typeface, A0L, A0b, A0D);
        A0b.A0W(num2);
        C51974G9v.A18(A0b, num2, false);
        A0b.A0E();
        C51974G9v.A0y(A0L, A0b, false);
        C51971G9r.A1C(new C249263jP(ImageView.ScaleType.CENTER, AnonymousClass9JR.A00((2WX) null, num, 0, C244013aV.A05(A0L)), (Integer) null, R.drawable.instagram_chevron_down_pano_filled_12, A0L.Bnf().A01(R.attr.glyphColorSecondary)), A0L, A0Q, A0Z);
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0Q.A01, false);
    }

    public C53683Gsa(C54214H3j h3j, C52971GgO ggO, UserSession userSession) {
        AnonymousClass7TG.A1U(h3j, ggO, userSession);
        this.A00 = h3j;
        this.A01 = ggO;
        this.A02 = userSession;
    }
}
