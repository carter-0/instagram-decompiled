package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class GK6 extends C251343mx {
    public final JTF A00;
    public final GK5 A01;
    public final 2WX A02;
    public final UserSession A03;

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        GH5 gh5;
        Integer num;
        AnonymousClass3Y5 r6 = r17;
        0qQ.A0B(r6, 0);
        2WX r2 = this.A02;
        AnonymousClass9JS A0d = C51965G9l.A0d(AnonymousClass05K.A1F, J6F.A00(this, 18), 4);
        if (r2 == 2WX.A02) {
            r2 = null;
        }
        2WX A0Y = C51971G9r.A0Y(C51965G9l.A0X(r2, A0d), AnonymousClass05K.A04, J6R.A00(this, r6, 43), 4);
        J6F A002 = J6F.A00(this, 19);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Z = C51971G9r.A0Z(A0Y, num2, A002, (String) null);
        GK5 gk5 = this.A01;
        String str = gk5.A07;
        if (str != null) {
            A0Z = C51971G9r.A0Y(A0Z, AnonymousClass05K.A0N, str, 0);
        }
        2Wb A0Q = C51972G9s.A0Q(r6);
        long A06 = C244013aV.A06(A0Q);
        int i = gk5.A01;
        if (i != 0) {
            2WX A0x = G9t.A0x(C51974G9v.A0M((2WX) null, num2, 0, A06), AnonymousClass05K.A0C, 0.0f);
            Drawable A0K = C51968G9o.A0K(A0Q, i);
            C51973G9u.A0x(A0K, A0Q, R.color.canvas_bottom_sheet_description_text_color);
            gh5 = new GH5(A0K, (ImageView.ScaleType) null, A0x, false);
        } else {
            gh5 = null;
        }
        2V1 Aqq = A0Q.Aqq();
        Context context = Aqq.A0C;
        Resources A0A = AnonymousClass7TF.A0A(context);
        C266444Yx r1 = gk5.A03;
        0qQ.A0B(r1, 1);
        2WW A022 = C52199GIq.A02(A0Q, (2WX) null, r1.A00(A0A).toString(), false);
        if (gk5.A09) {
            num = Integer.valueOf((int) (((double) AnonymousClass7TF.A0E(context).widthPixels) * 0.4d));
        } else {
            num = null;
        }
        return C51967G9n.A0Q(C243563Zg.A0G(C51973G9u.A0J(gh5, A022, Aqq), A0Q, C52199GIq.A01(A0Q, num, false, false, false, false)), A0Q, r6, A0Z);
    }

    public GK6(2WX r1, UserSession userSession, JTF jtf, GK5 gk5) {
        C51974G9v.A1L(gk5, jtf, userSession);
        this.A01 = gk5;
        this.A00 = jtf;
        this.A02 = r1;
        this.A03 = userSession;
    }
}
