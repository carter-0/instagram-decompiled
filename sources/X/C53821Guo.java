package X;

import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Guo  reason: case insensitive filesystem */
public final class C53821Guo extends C251343mx {
    public final C59601JPv A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 1Xj A03;
    public final AnonymousClass3W9 A04;
    public final JOH A05;
    public final GNC A06;

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        ICR icr;
        0qQ.A0B(r15, 0);
        C59601JPv jPv = this.A00;
        AnonymousClass0iw r9 = this.A01;
        UserSession userSession = this.A02;
        1Xj r12 = this.A03;
        AnonymousClass3W9 r11 = this.A04;
        JOH joh = this.A05;
        C51973G9u.A1E(r9, userSession, r12);
        if (r11 != AnonymousClass3W9.Loading) {
            icr = new ICR(3, r9, userSession, r11, r12, joh);
        } else {
            icr = null;
        }
        jPv.Eeb(icr);
        AnonymousClass3XV r1 = 2WX.A02;
        2WX A0Z = C51973G9u.A0Z(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A15, 0, C244013aV.A05(r15)), J6N.A00(this, 21));
        String A0E = C244013aV.A0E(r15, this.A06.A00);
        2V1 r10 = r15.A05;
        int A0A = C51972G9s.A0A(r10.A0C, r15, R.attr.igds_color_secondary_text_on_media);
        long A08 = C244013aV.A08(r15);
        Integer num = AnonymousClass05K.A0N;
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, A0E, 0);
        C51973G9u.A16(r15, A0b, A0A, A08);
        A0b.A0R(0);
        G9w.A11(typeface, r15, A0b, A0D);
        C51974G9v.A16(A0b, num, num2);
        A0b.A0E();
        C51973G9u.A19(A0Z, A0b, false);
        return A0b.A0A();
    }

    public C53821Guo(AnonymousClass0iw r1, UserSession userSession, 1Xj r3, AnonymousClass3W9 r4, JOH joh, C59601JPv jPv, GNC gnc) {
        C51974G9v.A1P(gnc, jPv, r1, userSession);
        this.A06 = gnc;
        this.A00 = jPv;
        this.A01 = r1;
        this.A02 = userSession;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = joh;
    }
}
