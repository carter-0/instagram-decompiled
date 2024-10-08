package X;

import android.graphics.Typeface;
import com.instagram.android.R;
import java.util.Arrays;

public final class GHS extends C251343mx {
    public final JQU A00;
    public final GER A01;

    public GHS(JQU jqu, GER ger) {
        0qQ.A0B(ger, 1);
        this.A01 = ger;
        this.A00 = jqu;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        boolean A1Z = C51966G9m.A1Z(r14);
        2WX A0Q = C51973G9u.A0Q((2WX) null, C51965G9l.A0c(AnonymousClass05K.A04, A1Z ? 1 : 0, C51970G9q.A0D()), A1Z, Double.doubleToRawLongBits(3.0d));
        2V1 r3 = r14.A05;
        0qQ.A0B(r3, A1Z);
        2Ts r4 = new 2Ts();
        AnonymousClass2V4 r6 = r3.A0D;
        C244143ai r2 = C244143ai.ALL;
        int A0H = 2Yu.A0H(r3.A0C, R.attr.igds_color_secondary_text_on_media);
        if (r6 != null) {
            r4.A00(r2, r6.A02(A0H));
            r4.A01(r2, r6.A03(R.dimen.account_recs_header_image_margin));
            Arrays.fill(r4.A00, A1Z, 4, (float) r6.A03(R.dimen.abc_action_bar_elevation_material));
            2WX A0V = C51972G9s.A0V(C51971G9r.A0Z(G9t.A0z(A0Q, AnonymousClass05K.A01, r4), AnonymousClass05K.A0Y, J6F.A00(this, 45), (String) null), J6F.A00(this, 46));
            2Wb A0S = AnonymousClass7TG.A0S(r3);
            String A0E = C244013aV.A0E(A0S, 2131974596);
            2V1 r1 = A0S.A00;
            int A0C = C51971G9r.A0C(r1, A0S);
            long A04 = C244013aV.A04(A0S);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            Integer num = AnonymousClass05K.A00;
            C244103ae A0b = C51971G9r.A0b(r1, (2V5) null, A0E, A1Z);
            C51973G9u.A17(A0S, A0b, A0C, A04);
            A0b.A0R(1);
            G9w.A12(typeface, A0S, A0b, A0D);
            C51974G9v.A17(A0b, num, A1Z);
            A0b.A0E();
            A0b.A0b(true);
            G9t.A1N(A0b, A1Z);
            C51967G9n.A1G(A0S, A0b);
            return C243563Zg.A0B(A0S, r14, A0V);
        }
        throw AnonymousClass7TE.A0z("This builder has already been disposed / built!");
    }
}
