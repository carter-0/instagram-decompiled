package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9jR  reason: invalid class name and case insensitive filesystem */
public final class C385729jR extends C228042kh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ C3497681r A02;
    public final /* synthetic */ C353778Ja A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C357638Yz A05;

    public C385729jR(Context context, 28D r2, C3497681r r3, C353778Ja r4, UserSession userSession, C357638Yz r6) {
        this.A04 = userSession;
        this.A03 = r4;
        this.A00 = context;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A04;
        C353778Ja r4 = this.A03;
        C311756dC A002 = C311746dB.A00(this.A00, userSession);
        C357638Yz r6 = this.A05;
        C39648A3o a3o = new C39648A3o(userSession);
        return new AnonymousClass9YG(this.A01, this.A02, A002, r4, userSession, r6, a3o);
    }
}
