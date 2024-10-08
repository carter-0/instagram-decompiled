package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.GsT  reason: case insensitive filesystem */
public final class C53676GsT extends C251343mx {
    public final C59617JQl A00;
    public final GET A01;

    public C53676GsT(C59617JQl jQl, GET get) {
        AnonymousClass7TG.A1O(get, jQl);
        this.A01 = get;
        this.A00 = jQl;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        boolean A1Z = C51966G9m.A1Z(r12);
        2WX A0X = C51965G9l.A0X((2WX) null, G9t.A14());
        Drawable drawable = C243803a8.A00(r12).getDrawable(R.drawable.opal_badge_background);
        Integer num = AnonymousClass05K.A00;
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Y(C51972G9s.A0V(C51971G9r.A0Y(A0X, num, drawable, 4), J6F.A00(this, 42)), AnonymousClass05K.A0D, Integer.valueOf(R.id.clips_opal_indicator_component), 4), AnonymousClass05K.A0Y, J6R.A00(this, r12, 49), (String) null);
        2Wb A0Q = C51972G9s.A0Q(r12);
        2WX A0V = C51973G9u.A0V((2WX) null, A0Q, num, A1Z ? 1 : 0);
        long A06 = C244013aV.A06(A0Q);
        Integer num2 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(A0V, num2, A1Z, A06);
        Drawable A0K = C51968G9o.A0K(A0Q, R.drawable.instagram_key_pano_outline_24);
        2V1 r3 = A0Q.A00;
        Context context = r3.A0C;
        C51972G9s.A0w(A0K, A0Q, 2Yu.A0E(context));
        C51974G9v.A0h(A0K, r3, A0Q, A002);
        2WX A0R = C51972G9s.A0R(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, A1Z, C244013aV.A0B(A0Q)), num2, A1Z, C244013aV.A0B(A0Q)), A1Z, C244013aV.A09(A0Q));
        Drawable A0K2 = C51968G9o.A0K(A0Q, R.drawable.instagram_chevron_down_pano_filled_12);
        C51972G9s.A0w(A0K2, A0Q, 2Yu.A0E(context));
        C51974G9v.A0h(A0K2, r3, A0Q, A0R);
        return C243563Zg.A0G(A0Q, r12, A0Z);
    }
}
