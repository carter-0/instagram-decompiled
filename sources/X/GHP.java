package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class GHP extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final JTC A02;
    public final UserSession A03;
    public final boolean A04;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        1Xj r2;
        C272034jz A002;
        String str;
        AnonymousClass3Y5 r11 = r23;
        0qQ.A0B(r11, 0);
        C267324bN r0 = this.A00;
        if (!(r0 == null || (r2 = r0.A02) == null)) {
            UserSession userSession = this.A03;
            if (AnonymousClass3YY.A04(userSession, r2) && (A002 = AnonymousClass3YY.A00(r2)) != null) {
                0qQ.A0B(userSession, 1);
                float f = 0.0f;
                for (int i : C297825sP.A03(userSession, A002, true)) {
                    f += (float) i;
                }
                int i2 = (int) f;
                Integer A003 = C52319GNl.A00(userSession).A00(A002);
                AnonymousClass3XV r02 = 2WX.A02;
                2WX A0Z = C51973G9u.A0Z((2WX) null, J6J.A00(this, 0));
                boolean A1V = AnonymousClass7TF.A1V(A003);
                2V1 r8 = r11.A05;
                Context context = r8.A0C;
                Resources A0A = AnonymousClass7TF.A0A(context);
                int i3 = R.plurals.voter_count_on_surfaces;
                if (A1V) {
                    i3 = R.plurals.voter_count_on_surfaces_voted_viewer;
                }
                String A022 = AnonymousClass3YY.A02(A0A, i3, i2);
                int A0A2 = C51972G9s.A0A(context, r11, R.attr.igds_color_secondary_text_on_media);
                long A042 = C244013aV.A04(r11);
                Integer num = AnonymousClass05K.A0N;
                long A032 = GHW.A03(userSession);
                int A023 = GHW.A02(userSession, C51969G9p.A08(r11, R.color.black));
                long A043 = GHW.A04(userSession);
                Integer A05 = GHW.A05(userSession, C51969G9p.A08(r11, R.color.black));
                Typeface typeface = Typeface.DEFAULT;
                long A0D = C51969G9p.A0D();
                Integer num2 = AnonymousClass05K.A00;
                C244103ae A0b = C51971G9r.A0b(r8, (2V5) null, A022, 0);
                C51973G9u.A16(r11, A0b, A0A2, A042);
                A0b.A0R(0);
                A0b.A0S(typeface);
                A0b.A0O(A023);
                C51974G9v.A0x(r11, A0b, C51969G9p.A07(r11, A032), A0D);
                C51974G9v.A11(A0b, r11.Bnf(), A05, A043);
                C51974G9v.A16(A0b, num, num2);
                A0b.A0M(1);
                C51974G9v.A0z(A0Z, A0b, false);
                2WW A0A3 = A0b.A0A();
                2WX A004 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A15, 0, C51970G9q.A0J());
                if (this.A04) {
                    str = "trans_key_comment_poll_vote_counts";
                } else {
                    str = null;
                }
                return C243563Zg.A0G(G9t.A0v(A0A3, r8), r11, C51971G9r.A0V(r8, A004, C243533Zd.GLOBAL, str));
            }
        }
        return null;
    }

    public GHP(C267324bN r1, C52058GDe gDe, UserSession userSession, JTC jtc, boolean z) {
        C51972G9s.A1D(gDe, jtc);
        this.A00 = r1;
        this.A03 = userSession;
        this.A01 = gDe;
        this.A02 = jtc;
        this.A04 = z;
    }
}
