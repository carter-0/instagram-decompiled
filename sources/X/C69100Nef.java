package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nef  reason: case insensitive filesystem */
public final class C69100Nef extends C71135OdY {
    public Bitmap A00;
    public OA6 A01;
    public String A02;
    public final Activity A03;
    public final Context A04;
    public final UserSession A05;
    public final OKY A06;
    public final C71111Ocu A07;
    public final OK7 A08;
    public final PMQ A09;
    public final AnonymousClass0eM A0A = C73922Pm2.A01(this, 16);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69100Nef(Activity activity, Context context, UserSession userSession, OKY oky, C71111Ocu ocu, PMQ pmq) {
        super(DbS.A0z(N9A.class));
        OK7 ok7 = new OK7(oky);
        DbW.A1O(ocu, 4, oky);
        this.A03 = activity;
        this.A04 = context;
        this.A05 = userSession;
        this.A07 = ocu;
        this.A09 = pmq;
        this.A06 = oky;
        this.A08 = ok7;
        PMQ pmq2 = this.A09;
        pmq2.A02 = new C72900POk(this);
        pmq2.A01 = new C72898POi(this);
    }

    public static final void A00(Bitmap bitmap, C69100Nef nef) {
        Bitmap bitmap2 = bitmap;
        nef.A0J(new N9U(bitmap, AnonymousClass05K.A0C, false, false));
        nef.A01 = new OA6(nef);
        boolean z = !182.A06(0Tu.A05, nef.A05, 36310327830315026L);
        1ES.A05(new C290815g0(new MB2(nef.A04, bitmap2, (Bitmap) null, new P00(bitmap2, nef, z), false, z), 473), 1601186431, 1, true, false);
    }
}
