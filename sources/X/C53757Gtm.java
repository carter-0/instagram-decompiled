package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Gtm  reason: case insensitive filesystem */
public final class C53757Gtm extends C251343mx {
    public final C52058GDe A00;
    public final JTB A01;
    public final C59600JPu A02;
    public final GES A03;

    public C53757Gtm(C52058GDe gDe, JTB jtb, C59600JPu jPu, GES ges) {
        C51974G9v.A1P(jtb, ges, gDe, jPu);
        this.A01 = jtb;
        this.A03 = ges;
        this.A00 = gDe;
        this.A02 = jPu;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        boolean A1Z = C51966G9m.A1Z(r10);
        2WX A0X = C51965G9l.A0X((2WX) null, G9t.A14());
        Drawable drawable = C243803a8.A00(r10).getDrawable(R.drawable.clips_close_friends_badge_background);
        Integer num = AnonymousClass05K.A00;
        2WX A002 = C51971G9r.A0Z(C51971G9r.A0Y(C51972G9s.A0V(C51971G9r.A0Y(A0X, num, drawable, 4), J6F.A00(this, 29)), AnonymousClass05K.A0D, Integer.valueOf(R.id.clips_close_friends_indicator_component), 4), AnonymousClass05K.A0Y, J6R.A00(this, r10, 48), (String) null).A00(C51972G9s.A0S((2WX) null, A1Z ? 1 : 0, C51970G9q.A0H()));
        2Wb A0Q = C51972G9s.A0Q(r10);
        Drawable A0K = C51968G9o.A0K(A0Q, R.drawable.instagram_star_pano_filled_12);
        2V1 r3 = A0Q.A00;
        Context context = r3.A0C;
        C51972G9s.A0w(A0K, A0Q, 2Yu.A0E(context));
        C247393gG A0a = C51971G9r.A0a(A0K, r3);
        A0a.A0C();
        A0Q.A00(A0a.A0A());
        2WX A0R = C51972G9s.A0R(C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, num, A1Z, C244013aV.A0B(A0Q)), A1Z, C244013aV.A0B(A0Q)), A1Z, C244013aV.A09(A0Q));
        Drawable A0K2 = C51968G9o.A0K(A0Q, R.drawable.instagram_chevron_down_pano_filled_12);
        C51972G9s.A0w(A0K2, A0Q, 2Yu.A0E(context));
        C51974G9v.A0h(A0K2, r3, A0Q, A0R);
        return C243563Zg.A0G(A0Q, r10, A002);
    }
}
