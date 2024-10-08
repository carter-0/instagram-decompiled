package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hos  reason: case insensitive filesystem */
public final class C55871Hos {
    public final H34 A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 05G A03 = C51970G9q.A10(false);
    public final 05G A04 = C51970G9q.A10(true);
    public final Context A05;
    public final AnonymousClass07i A06;
    public final C56468Hz0 A07;

    public C55871Hos(Context context, AnonymousClass07i r11, AnonymousClass0iw r12, UserSession userSession, C56468Hz0 hz0, String str) {
        AnonymousClass7TG.A1S(r11, hz0);
        this.A05 = context;
        this.A02 = userSession;
        this.A01 = r12;
        this.A06 = r11;
        this.A07 = hz0;
        IMH imh = new IMH(this, str);
        this.A00 = new H34(context, r11, imh, r12, userSession, 3);
    }
}
