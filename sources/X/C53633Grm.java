package X;

import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Grm  reason: case insensitive filesystem */
public final class C53633Grm extends C251343mx {
    public final UserSession A00;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        AnonymousClass3Y5 r8 = r23;
        0qQ.A0B(r8, 0);
        2V1 r5 = r8.A05;
        int A0A = C51972G9s.A0A(r5.A0C, r8, R.attr.igds_color_gradient_lavender);
        AnonymousClass3XV r0 = 2WX.A02;
        long A0D = C51970G9q.A0D();
        2WX A0Q = C51973G9u.A0Q((2WX) null, C51965G9l.A0c(AnonymousClass05K.A04, 0, A0D), 0, C51969G9p.A0B());
        2Wb A0S = AnonymousClass7TG.A0S(r5);
        String A0E = C244013aV.A0E(A0S, 2131956657);
        int A02 = C244013aV.A02(A0S, R.color.canvas_bottom_sheet_description_text_color);
        Integer num = AnonymousClass05K.A01;
        long A0G = C51972G9s.A0G(11.0f);
        2V1 r02 = A0S.A00;
        Typeface A01 = 0oh.A01(r02.A0C);
        Integer num2 = AnonymousClass05K.A00;
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r02, (2V5) null, A0E, 0);
        C51973G9u.A17(A0S, A0b, A02, A0G);
        A0b.A0R(0);
        G9w.A12(A01, A0S, A0b, A0D2);
        C51974G9v.A16(A0b, num2, num);
        A0b.A0E();
        A0b.A0b(false);
        A0b.A0Y(false);
        A0b.A0Z(false);
        A0b.A05((AnonymousClass2VW) null);
        C51967G9n.A1G(A0S, A0b);
        return new C52332GOa(C243563Zg.A0G(A0S, r8, A0Q), (Integer) null, 14.0f, 4.0f, A0A, false, true, false, false);
    }

    public C53633Grm(UserSession userSession) {
        this.A00 = userSession;
    }
}
