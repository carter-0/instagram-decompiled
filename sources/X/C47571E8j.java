package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.E8j  reason: case insensitive filesystem */
public final class C47571E8j extends C331047Ph {
    public String A00;
    public boolean A01;
    public final C15541UeU A02;
    public final C68506NLd A03;
    public final C229122ms A04 = new PRL(this, 7);
    public final C231762sK A05;
    public final List A06 = AnonymousClass7TE.A1C();

    public C47571E8j(Context context, AnonymousClass0iw r20, UserSession userSession, XC1 xc1, C74585PxY pxY) {
        XAH xah = XAH.A01;
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(xah, 5);
        Context context2 = context;
        AnonymousClass0iw r6 = r20;
        UserSession userSession2 = userSession;
        C68506NLd nLd = new C68506NLd(context2, r6, userSession2, pxY, xah, num, (String) null, false, false, false, false, false, false);
        this.A03 = nLd;
        C15541UeU ueU = new C15541UeU(context2, r6, userSession2, xc1, xah);
        this.A02 = ueU;
        C231762sK r2 = new C231762sK(context2);
        this.A05 = r2;
        A0B(nLd, ueU, r2);
    }
}
