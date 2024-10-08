package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class KEX extends C228042kh {
    public final Context A00;
    public final AnonymousClass07V A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;
    public final C62541KhX A04;
    public final C61770pa A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A03;
        return new KUV(userSession, this.A04, new C65789Lzh(this.A00, this.A01, this.A02, userSession), this.A05, this.A06);
    }

    public KEX(Context context, AnonymousClass07V r2, AnonymousClass07i r3, UserSession userSession, C62541KhX khX, C61770pa r6, boolean z) {
        AnonymousClass7TG.A1U(userSession, khX, r6);
        this.A03 = userSession;
        this.A04 = khX;
        this.A05 = r6;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = z;
    }
}
