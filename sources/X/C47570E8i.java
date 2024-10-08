package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.E8i  reason: case insensitive filesystem */
public final class C47570E8i extends C331047Ph {
    public DwJ A00;
    public final EAJ A01;
    public final C47614EAa A02;
    public final C47602E9o A03;

    public C47570E8i(Context context, AnonymousClass0iw r5, UserSession userSession, E6Y e6y, E6Y e6y2) {
        C47602E9o e9o = new C47602E9o(context);
        this.A03 = e9o;
        C47614EAa eAa = new C47614EAa(context, r5, userSession, e6y);
        this.A02 = eAa;
        EAJ eaj = new EAJ(context, e6y2);
        this.A01 = eaj;
        A0B(e9o, eAa, eaj);
    }
}
