package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.GsY  reason: case insensitive filesystem */
public final class C53681GsY extends C251343mx {
    public final AnonymousClass3QO A00;
    public final String A01;
    public final boolean A02;

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        String A0F;
        AnonymousClass3Y5 r3 = r20;
        0qQ.A0B(r3, 0);
        int ordinal = this.A00.ordinal();
        if (ordinal != 1) {
            if (ordinal == 11) {
                C51967G9n.A0v();
                boolean z = this.A02;
                String str = this.A01;
                Context A09 = C51967G9n.A09(r3);
                0qQ.A0B(str, 1);
                if (z) {
                    A0F = A09.getString(2131968852);
                } else {
                    A0F = DbW.A0h(A09, str, 2131968851);
                }
                0qQ.A07(A0F);
            } else {
                throw AnonymousClass7TE.A0w("Unsupported MediaAudience in AudienceDisclaimerComponent");
            }
        } else if (this.A02) {
            A0F = C244013aV.A0E(r3, 2131955318);
        } else {
            A0F = C244013aV.A0F(r3, this.A01, 2131955319);
        }
        2Wb A0S = AnonymousClass7TG.A0S(r3.A05);
        2V1 r9 = A0S.A00;
        int A07 = C51968G9o.A07(r9.A0C, A0S);
        long A08 = C244013aV.A08(A0S);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0G = C51974G9v.A0G((2WX) null, C51967G9n.A0S(0, C51970G9q.A0F()), 0, C244013aV.A0A(A0S));
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r9, (2V5) null, A0F, 0);
        C51973G9u.A17(A0S, A0b, A07, A08);
        A0b.A0R(0);
        G9w.A12(typeface, A0S, A0b, A0D);
        A0b.A0B();
        C51974G9v.A1A(A0b, num, false, true);
        C244123ag.A00(A0b, A0G);
        C51967G9n.A1G(A0S, A0b);
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0S.A01, false);
    }

    public C53681GsY(AnonymousClass3QO r1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }
}
