package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6p  reason: case insensitive filesystem */
public final class C54298H6p extends C228042kh {
    public final Context A00;
    public final AnonymousClass07V A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;
    public final HMX A04;
    public final C55747Hmi A05;
    public final C61770pa A06;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A03;
        HMX hmx = this.A04;
        C61770pa r11 = this.A06;
        Context context = this.A00;
        AnonymousClass07i r3 = this.A02;
        AnonymousClass07V r2 = this.A01;
        C55747Hmi hmi = this.A05;
        return new HHD(userSession, hmx, new C65790Lzi(context, r2, r3, userSession, hmi), hmi, r11);
    }

    public C54298H6p(Context context, AnonymousClass07V r2, AnonymousClass07i r3, UserSession userSession, HMX hmx, C55747Hmi hmi, C61770pa r7) {
        AnonymousClass7TG.A1U(userSession, hmx, r7);
        this.A03 = userSession;
        this.A04 = hmx;
        this.A06 = r7;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = hmi;
    }
}
