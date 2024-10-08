package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gt9  reason: case insensitive filesystem */
public final class C53718Gt9 extends C251343mx {
    public final GEG A00;
    public final C267324bN A01;
    public final UserSession A02;

    public final C251263mp A0X(AnonymousClass3Y5 r24) {
        long A09;
        AnonymousClass3Y5 r22 = r24;
        0qQ.A0B(r22, 0);
        C267324bN r4 = this.A01;
        SpannableStringBuilder A0C = DbS.A0C(r4.A06().A0i);
        if (this.A00.A05) {
            A0C.append(C244013aV.A0E(r22, 2131961000));
            A0C.append(r4.A06().A0Z);
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(AnonymousClass05K.A01, 1.0f, 1));
        1Xj r02 = r4.A02;
        if (r02 == null || r02.A1T() == null) {
            A09 = C244013aV.A09(r22);
        } else {
            A09 = C244013aV.A07(r22);
        }
        2WX A0N = C51973G9u.A0N(C244063aa.SPONSORED_LABEL, C51971G9r.A0Y(C51974G9v.A0E(A0X, C51967G9n.A0V(A09), 0, C244013aV.A05(r22)), AnonymousClass05K.A1F, C59086J5t.A00, 4));
        2Wb A0Q = C51972G9s.A0Q(r22);
        int A022 = C244013aV.A02(A0Q, R.color.fundraiser_sticker_donate_button_background_color);
        long A04 = C244013aV.A04(A0Q);
        UserSession userSession = this.A02;
        long A03 = GHW.A03(userSession);
        int A023 = GHW.A02(userSession, C244013aV.A02(A0Q, R.color.black));
        long A042 = GHW.A04(userSession);
        Integer A05 = GHW.A05(userSession, C244013aV.A02(A0Q, R.color.black));
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(A0Q.A00, (2V5) null, A0C, 0);
        C51973G9u.A17(A0Q, A0b, A022, A04);
        A0b.A0K((float) 2Wd.A00(G9t.A15(typeface, A0Q, A0b, 0, A023), A03));
        A0b.A0I((float) C51968G9o.A09(A0Q, A0D));
        A0b.A0J((float) C51968G9o.A09(A0Q, A0D));
        C51974G9v.A11(A0b, A0Q.Bnf(), A05, A042);
        A0b.A0W(num);
        C51974G9v.A14(A0b, num, 1.0f, false, true);
        A0b.A05((AnonymousClass2VW) null);
        C51967G9n.A1G(A0Q, A0b);
        return C243563Zg.A0B(A0Q, r22, A0N);
    }

    public C53718Gt9(GEG geg, C267324bN r2, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = geg;
    }
}
