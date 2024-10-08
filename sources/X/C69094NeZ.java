package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NeZ  reason: case insensitive filesystem */
public final class C69094NeZ extends C71135OdY {
    public N9F A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final UserSession A04;
    public final OKY A05;
    public final C71111Ocu A06;
    public final PMG A07;
    public final AnonymousClass0eM A08 = C73919Plz.A01(this, 22);
    public final AnonymousClass0eM A09 = C73919Plz.A01(this, 23);
    public final AnonymousClass0eM A0A = C73919Plz.A01(this, 24);
    public final AnonymousClass0eM A0B = C73919Plz.A01(this, 25);
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A00(0eO.A02, new C73919Plz(this, 26));
    public final AnonymousClass0eM A0D = C73919Plz.A01(this, 27);
    public final AnonymousClass0eM A0E = C73919Plz.A01(this, 28);
    public final AnonymousClass0eM A0F = C73919Plz.A01(this, 29);
    public final AnonymousClass0eM A0G = C73919Plz.A01(this, 30);
    public final C62320sa A0H;
    public final C62320sa A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69094NeZ(Activity activity, Context context, UserSession userSession, OKY oky, C71111Ocu ocu, PMG pmg, C62320sa r10, C62320sa r11) {
        super(DbS.A0z(N9F.class));
        0qQ.A0B(ocu, 4);
        C51973G9u.A0s(5, oky, r10, r11);
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = context;
        this.A06 = ocu;
        this.A05 = oky;
        this.A07 = pmg;
        this.A0H = r10;
        this.A0I = r11;
        this.A07.A02 = new OMI(this);
    }
}
