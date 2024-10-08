package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gtn  reason: case insensitive filesystem */
public final class C53758Gtn extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JTC A02;
    public final UserSession A03;

    public final C251263mp A0X(AnonymousClass3Y5 r18) {
        AnonymousClass3Y5 r16 = r18;
        boolean A1Z = C51966G9m.A1Z(r16);
        2WX A0R = C51973G9u.A0R(C51965G9l.A0X((2WX) null, C51965G9l.A0b(AnonymousClass05K.A01, 1.0f, 1)), C51966G9m.A0k(A1Z ? 1 : 0, C51970G9q.A0E()), A1Z, Double.doubleToRawLongBits(30.0d));
        Drawable A0D = C244013aV.A0D(r16, R.drawable.clips_viewer_comment_bar_background);
        Integer num = AnonymousClass05K.A00;
        2WX A0V = C51972G9s.A0V(C51971G9r.A0Y(A0R, num, A0D, 4), J6J.A00(this, 3));
        2Wb A0Q = C51972G9s.A0Q(r16);
        String A0E = C244013aV.A0E(A0Q, 2131956369);
        int A022 = C244013aV.A02(A0Q, R.color.baseline_neutral_80);
        long A0G = C51972G9s.A0G(12.0f);
        long A0D2 = C51970G9q.A0D();
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, A1Z, A0D2), AnonymousClass05K.A0F, A1Z, Double.doubleToRawLongBits(3.0d));
        Typeface typeface = Typeface.DEFAULT;
        long A0D3 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(A0Q.A00, (2V5) null, A0E, A1Z);
        C51973G9u.A17(A0Q, A0b, A022, A0G);
        A0b.A0R(A1Z);
        G9w.A12(typeface, A0Q, A0b, A0D3);
        A0b.A0W(num);
        C51974G9v.A14(A0b, num, 1.0f, A1Z, true);
        G9t.A1M(A0Q, A002, A0b);
        return C243563Zg.A0B(A0Q, r16, A0V);
    }

    public C53758Gtn(C267324bN r1, C52058GDe gDe, UserSession userSession, JTC jtc) {
        AnonymousClass7TG.A1Q(gDe, jtc);
        this.A00 = r1;
        this.A01 = gDe;
        this.A02 = jtc;
        this.A03 = userSession;
    }
}
