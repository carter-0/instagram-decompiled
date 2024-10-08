package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.common.session.UserSession;

public final class GHQ extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JTC A02;
    public final UserSession A03;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        1Xj r1;
        CommentPrompt A002;
        AnonymousClass3Y5 r15 = r23;
        0qQ.A0B(r15, 0);
        C267324bN r0 = this.A00;
        if (!(r0 == null || (r1 = r0.A02) == null)) {
            UserSession userSession = this.A03;
            if (AnonymousClass4LK.A04(userSession, r1) && (A002 = AnonymousClass4LK.A00(r1)) != null) {
                AnonymousClass3XV r02 = 2WX.A02;
                2WX A0Z = C51973G9u.A0Z((2WX) null, J6J.A00(this, 1));
                J6J A003 = J6J.A00(this, 2);
                Integer num = AnonymousClass05K.A00;
                2WX A0Z2 = C51971G9r.A0Z(A0Z, num, A003, (String) null);
                2V1 r10 = r15.A05;
                Context context = r10.A0C;
                String A022 = AnonymousClass4LK.A02(AnonymousClass7TF.A0A(context), A002, userSession, true);
                int A0A = C51972G9s.A0A(context, r15, R.attr.igds_color_secondary_text_on_media);
                long A04 = C244013aV.A04(r15);
                Integer num2 = AnonymousClass05K.A0N;
                long A032 = GHW.A03(userSession);
                int A023 = GHW.A02(userSession, C51969G9p.A08(r15, R.color.black));
                long A042 = GHW.A04(userSession);
                Integer A05 = GHW.A05(userSession, C51969G9p.A08(r15, R.color.black));
                Typeface typeface = Typeface.DEFAULT;
                long A0D = C51969G9p.A0D();
                C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, A022, 0);
                C51973G9u.A16(r15, A0b, A0A, A04);
                A0b.A0R(0);
                A0b.A0S(typeface);
                A0b.A0O(A023);
                C51974G9v.A0x(r15, A0b, C51969G9p.A07(r15, A032), A0D);
                C51974G9v.A11(A0b, r15.Bnf(), A05, A042);
                C51974G9v.A16(A0b, num2, num);
                A0b.A0M(1);
                C51974G9v.A0z(A0Z2, A0b, false);
                2WW A0A2 = A0b.A0A();
                return C243563Zg.A0G(G9t.A0v(A0A2, r10), r15, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A15, 0, C51970G9q.A0H()));
            }
        }
        return null;
    }

    public GHQ(C267324bN r1, C52058GDe gDe, UserSession userSession, JTC jtc) {
        C51972G9s.A1D(gDe, jtc);
        this.A00 = r1;
        this.A03 = userSession;
        this.A01 = gDe;
        this.A02 = jtc;
    }
}
