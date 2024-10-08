package X;

import android.graphics.Typeface;
import com.instagram.user.model.User;

/* renamed from: X.GtA  reason: case insensitive filesystem */
public final class C53719GtA extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JTB A02;

    public C53719GtA(C267324bN r2, C52058GDe gDe, JTB jtb) {
        0qQ.A0B(jtb, 3);
        this.A00 = r2;
        this.A01 = gDe;
        this.A02 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        String C9e;
        0qQ.A0B(r14, 0);
        User user = this.A00.A0K;
        if (user == null || (C9e = user.A03.C9e()) == null) {
            return null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0Z = C51971G9r.A0Z(C51973G9u.A0Z(AnonymousClass9JR.A00(C51972G9s.A0U(C51972G9s.A0S((2WX) null, 0, C51970G9q.A0H()), AnonymousClass05K.A01, 0), AnonymousClass05K.A1I, 0, C51970G9q.A0I()), J6R.A00(this, user, 37)), AnonymousClass05K.A0Y, J6F.A00(this, 9), (String) null);
        long A04 = C244013aV.A04(r14);
        Typeface create = Typeface.create("sans-serif", 0);
        int A042 = C51975G9x.A04(r14);
        long A0D = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r14.A05, (2V5) null, C9e, 0);
        C51973G9u.A16(r14, A0b, A042, A04);
        A0b.A0R(0);
        G9w.A11(create, r14, A0b, A0D);
        C51974G9v.A19(A0b, num, false);
        A0b.A0M(1);
        A0b.A0b(false);
        G9t.A1N(A0b, false);
        return C51967G9n.A0R(A0Z, A0b);
    }
}
