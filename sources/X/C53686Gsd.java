package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Gsd  reason: case insensitive filesystem */
public final class C53686Gsd extends C251343mx {
    public final C54214H3j A00;
    public final UserSession A01;
    public final C60314JjH A02;

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        1Xj r7;
        AnonymousClass3Y5 r3 = r17;
        0qQ.A0B(r3, 0);
        HN2 hn2 = this.A00.A00;
        String A0E = C244013aV.A0E(r3, hn2.A00);
        C60314JjH jjH = this.A02;
        Integer num = hn2.A02;
        0qQ.A0B(num, 0);
        C234072ww r9 = jjH.A02;
        1Xl r0 = jjH.A06.A00;
        if (r0 != null) {
            r7 = r0.BPf();
        } else {
            r7 = null;
        }
        String A002 = AnonymousClass000.A00(98);
        if (r7 != null) {
            String A0T = 002.A0T(A002, C333837aE.A00(num), '_');
            User A2A = r7.A2A(r9.A03);
            if (A2A == null) {
                0f9 AEf = 0wj.A01.AEf("COMMENTS_LOGGER: Media Author Id is null.", 817896325);
                AEf.ABQ("Media Id", r7.getId());
                AEf.report();
            } else {
                0Aj A0e = AnonymousClass7TE.A0e(r9.A02, "ig_comments_context_menu_impresssion");
                String A2n = r7.A2n();
                if (A2n != null) {
                    G9t.A1J(A0e, A2n);
                    G9t.A1K(A0e, A2A.getId());
                    C51965G9l.A1M(A0e, A0T);
                    A0e.Cgf();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        2Wb A0Q = C51972G9s.A0Q(r3);
        Context A0O = C51966G9m.A0O(A0Q);
        AnonymousClass3XV r02 = 2WX.A02;
        long A0F = C51969G9p.A0F();
        long A0E2 = C51969G9p.A0E();
        2WX A0Z = C51973G9u.A0Z(C51974G9v.A0E(C51972G9s.A0R((2WX) null, 0, A0F), C51967G9n.A0V(A0E2), 0, C51969G9p.A0B()), new J6W(45, A0O, A0Q, this));
        2Wb A0L = C51973G9u.A0L(A0Q);
        long A08 = C244013aV.A08(A0L);
        Typeface A0N = AnonymousClass7TG.A0N(C243803a8.A00(A0L));
        int A07 = C51968G9o.A07(A0O, A0L);
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(A0L.A00, (2V5) null, A0E, 0);
        C51973G9u.A17(A0L, A0b, A07, A08);
        A0b.A0R(0);
        G9w.A12(A0N, A0L, A0b, A0D);
        A0b.A0W(num2);
        C51974G9v.A18(A0b, num2, false);
        A0b.A0E();
        C51974G9v.A0y(A0L, A0b, false);
        C51971G9r.A1C(new C249263jP(ImageView.ScaleType.CENTER, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A04, 0, C244013aV.A05(A0L)), (Integer) null, R.drawable.instagram_chevron_down_pano_filled_12, A0L.Bnf().A01(R.attr.glyphColorSecondary)), A0L, A0Q, A0Z);
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0Q.A01, false);
    }

    public C53686Gsd(C54214H3j h3j, UserSession userSession, C60314JjH jjH) {
        AnonymousClass7TG.A1U(h3j, jjH, userSession);
        this.A00 = h3j;
        this.A02 = jjH;
        this.A01 = userSession;
    }
}
