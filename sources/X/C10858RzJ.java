package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.RzJ  reason: case insensitive filesystem */
public final class C10858RzJ {
    public final AT4 A00;
    public final C12152So0 A01;
    public final C258973zw A02;
    public final C12151Snz A03;
    public final AnonymousClass406 A04;
    public final C258983zx A05;
    public final C258933zs A06;
    public final C2604745u A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(TUC.A00);
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = C13350TVx.A01(this, 3);
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final 0xa A0J;
    public final 1Cn A0K;

    /* JADX WARNING: type inference failed for: r0v19, types: [X.Snz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v23, types: [X.406, java.lang.Object] */
    public C10858RzJ(UserSession userSession, Context context) {
        C2604745u r4 = (C2604745u) C2604645t.A00(userSession).A02.getValue();
        this.A07 = r4;
        1Cn r3 = new 1Cn(context);
        this.A0K = r3;
        this.A08 = AnonymousClass0eN.A01(new TTN(userSession, 47));
        this.A06 = new C258933zs((C258913zq) this.A0F.getValue(), ((C258733zY) this.A08.getValue()).CCP());
        this.A0E = C13350TVx.A01(userSession, 2);
        this.A00 = new AT4(r4);
        this.A01 = new C12152So0(r3);
        this.A02 = new C258973zw((AnonymousClass0JP) AnonymousClass7TE.A14(this.A0A));
        this.A03 = new Object();
        0xa A042 = 1Al.A01(userSession).A04(1An.A24, C258983zx.class);
        this.A0J = A042;
        this.A05 = new C258983zx((AnonymousClass0JP) AnonymousClass7TE.A14(this.A0A), A042);
        this.A04 = new Object();
        this.A0I = C13350TVx.A01(this, 4);
        this.A0B = AnonymousClass0eN.A01(new TTN(userSession, 49));
        this.A0G = AnonymousClass0eN.A01(new TTP(13, userSession, this));
        this.A0H = AnonymousClass0eN.A01(new TTP(14, userSession, this));
        this.A0D = C13350TVx.A01(this, 1);
        this.A09 = AnonymousClass0eN.A01(new TTN(this, 48));
        this.A0C = C13350TVx.A01(this, 0);
    }
}
