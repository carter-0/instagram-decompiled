package X;

import com.instagram.android.R;
import com.instagram.api.schemas.OnImpressionStyle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GOi  reason: case insensitive filesystem */
public final class C52339GOi extends C251343mx {
    public final JPE A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final C257873y6 A03;
    public final UserSession A04;
    public final JR6 A05;
    public final boolean A06;
    public final boolean A07;

    public C52339GOi(C257873y6 r2, JPE jpe, C267324bN r4, C52058GDe gDe, UserSession userSession, JR6 jr6, boolean z, boolean z2) {
        DbW.A1N(userSession, 1, jr6);
        this.A04 = userSession;
        this.A01 = r4;
        this.A02 = gDe;
        this.A03 = r2;
        this.A05 = jr6;
        this.A00 = jpe;
        this.A07 = z;
        this.A06 = z2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r22) {
        int ordinal;
        C251263mp gNv;
        AnonymousClass3Y5 r5 = r22;
        0qQ.A0B(r5, 0);
        if (!this.A06 && this.A01.A01 == C295365o2.AD) {
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, (List) null, false);
        }
        C257873y6 r15 = this.A03;
        OnImpressionStyle C23 = r15.C23();
        if (C23 == null) {
            ordinal = -1;
        } else {
            ordinal = C23.ordinal();
        }
        if (ordinal != 7 && ordinal != 3) {
            return null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        C243573Zh r02 = C243573Zh.CENTER;
        Integer num = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y((2WX) null, num, r02, 3);
        long A032 = C244013aV.A03(r5);
        2WX A0R = C51973G9u.A0R(A0Y, C51967G9n.A0U(0, A032), 0, C244013aV.A03(r5));
        UserSession userSession = this.A04;
        if (182.A06(0Tu.A05, userSession, 36326240684226196L)) {
            A0R = A0R.A00(G9t.A0x((2WX) null, AnonymousClass05K.A0C, 0.0f));
        }
        boolean z = this.A07;
        if (z) {
            A0R = A0R.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0A, 0, C244013aV.A0C(r5, R.dimen.barcelona_countdown_sticker_digit_background_height)));
        }
        2Wb A0Q = C51972G9s.A0Q(r5);
        C267324bN r9 = this.A01;
        C52058GDe gDe = this.A02;
        A0Q.A00(new C52340GOj(r15, r9, gDe, userSession, this.A05, z));
        JPE jpe = this.A00;
        if (jpe == null) {
            gNv = new AnonymousClass3XA();
        } else {
            gNv = new C52328GNv(C51971G9r.A0Y(C51974G9v.A0D((2WX) null, C51965G9l.A0b(num, 100.0f, 0), 100.0f, 0), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), jpe, r9, gDe);
        }
        return C51967G9n.A0Q(gNv, A0Q, r5, A0R);
    }
}
