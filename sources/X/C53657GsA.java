package X;

import android.graphics.Typeface;
import com.instagram.common.session.UserSession;

/* renamed from: X.GsA  reason: case insensitive filesystem */
public final class C53657GsA extends C251343mx {
    public final UserSession A00;
    public final C62320sa A01;

    public C53657GsA(UserSession userSession, C62320sa r3) {
        0qQ.A0B(userSession, 2);
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r19) {
        String str;
        AnonymousClass3Y5 r17 = r19;
        0qQ.A0B(r17, 0);
        C250973mM r13 = (C250973mM) this.A01.invoke();
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A002 = AnonymousClass9JR.A00(C51974G9v.A0D((2WX) null, C51965G9l.A0b(num, 100.0f, 0), 100.0f, 0), AnonymousClass05K.A15, 0, Double.doubleToRawLongBits(300.0d));
        2Wb A0Q = C51972G9s.A0Q(r17);
        String id = r13.A0H.getId();
        0qQ.A07(id);
        long A0G = C51972G9s.A0G(14.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        2V1 r7 = A0Q.A00;
        C244103ae A0b = C51971G9r.A0b(r7, (2V5) null, id, 0);
        C51973G9u.A17(A0Q, A0b, -1, A0G);
        A0b.A0R(0);
        G9w.A12(typeface, A0Q, A0b, A0D);
        C51974G9v.A19(A0b, num, false);
        A0b.A0E();
        C51974G9v.A0y(A0Q, A0b, false);
        C255773uh A08 = r13.A08(this.A00);
        int ordinal = A08.A0e.ordinal();
        if (ordinal != 0) {
            str = null;
            if (ordinal == 1 || ordinal == 9) {
                1Xj r14 = A08.A0b;
                r14.getClass();
                if (r14.A1T() != null) {
                    str = r14.A1T().A0d;
                }
            }
        } else {
            C270184gK r02 = A08.A0d;
            r02.getClass();
            str = r02.A00.A2Z;
        }
        C244103ae A0b2 = C51971G9r.A0b(r7, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b2, -1, A0G);
        A0b2.A0R(0);
        G9w.A12(typeface, A0Q, A0b2, A0D);
        A0b2.A0W(num);
        C51974G9v.A1A(A0b2, num, false, true);
        C51967G9n.A1G(A0Q, A0b2);
        return C243563Zg.A01(A0Q, r17, A002);
    }
}
