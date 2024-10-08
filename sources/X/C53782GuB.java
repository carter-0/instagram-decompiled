package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GuB  reason: case insensitive filesystem */
public final class C53782GuB extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final C59570JOq A02;
    public final JPE A03;
    public final UserSession A04;

    public C53782GuB(JPE jpe, C267324bN r3, C52058GDe gDe, UserSession userSession, C59570JOq jOq) {
        DbW.A1N(jOq, 3, userSession);
        this.A00 = r3;
        this.A01 = gDe;
        this.A02 = jOq;
        this.A03 = jpe;
        this.A04 = userSession;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        int A0C;
        String str;
        String ctaSubtitle;
        AnonymousClass3Y5 r10 = r28;
        0qQ.A0B(r10, 0);
        C267324bN r0 = this.A00;
        C267324bN r26 = r0;
        1Xj r2 = r0.A02;
        if (r2 == null) {
            return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, (List) null, false);
        }
        Context A09 = C51967G9n.A09(r10);
        String dominantColor = r2.A0C.getDominantColor();
        if (dominantColor != null) {
            A0C = Color.parseColor(dominantColor);
        } else {
            A0C = 2Yu.A0C(A09);
        }
        C52058GDe gDe = this.A01;
        C58705IwE A012 = C58705IwE.A01(this, 34);
        JPE jpe = this.A03;
        AnonymousClass5HT BYk = r2.A0C.BYk();
        2WW r12 = null;
        if (BYk != null) {
            str = BYk.getCtaTitle();
        } else {
            str = null;
        }
        AnonymousClass5HT BYk2 = r2.A0C.BYk();
        if (!(BYk2 == null || (ctaSubtitle = BYk2.getCtaSubtitle()) == null)) {
            AnonymousClass3XV r02 = 2WX.A02;
            C243573Zh r03 = C243573Zh.CENTER;
            Integer num = AnonymousClass05K.A00;
            2WX A0z = G9t.A0z((2WX) null, num, r03);
            Integer num2 = AnonymousClass05K.A0C;
            2WX A0Y = C51971G9r.A0Y(C51971G9r.A0X(A0z, num2, 0.0f, 1), AnonymousClass05K.A0N, ctaSubtitle, 0);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(' ');
            A1A.append(C244013aV.A0E(r10, 2131960999));
            A1A.append(' ');
            String A0l = AnonymousClass7TF.A0l(ctaSubtitle, A1A);
            2V1 Aqq = r10.Aqq();
            int A0A = C51972G9s.A0A(Aqq.A0C, r10, R.attr.igds_color_secondary_text_on_media);
            long A042 = C244013aV.A04(r10);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(Aqq, (2V5) null, A0l, 0);
            C51973G9u.A16(r10, A0b, A0A, A042);
            A0b.A0R(0);
            G9w.A11(typeface, r10, A0b, A0D);
            A0b.A0W(num2);
            C51974G9v.A15(A0b, num, 0, true);
            C51974G9v.A0z(A0Y, A0b, false);
            r12 = A0b.A0A();
        }
        return I3N.A00(r12, r10, jpe, r26, gDe, this.A04, str, A012, 4.0f, A0C, false, false, false);
    }
}
