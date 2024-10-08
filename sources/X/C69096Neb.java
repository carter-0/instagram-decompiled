package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Neb  reason: case insensitive filesystem */
public final class C69096Neb extends C71135OdY {
    public N9B A00;
    public final Activity A01;
    public final UserSession A02;
    public final 1Av A03;
    public final OKY A04;
    public final C71111Ocu A05;
    public final PM3 A06;
    public final AnonymousClass0eM A07 = C73922Pm2.A01(this, 32);
    public final AnonymousClass0eM A08 = C73922Pm2.A01(this, 33);

    public final void A0K(C74272Ps0 ps0) {
        C71111Ocu ocu;
        C74268Prw prw;
        C74268Prw prw2;
        C71111Ocu ocu2;
        Point point;
        Display display;
        C71111Ocu ocu3;
        C74272Ps0 pNb;
        if (ps0 instanceof PO4) {
            1Av r8 = this.A03;
            0s0 r7 = r8.A8P;
            AnonymousClass0YZ[] r6 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(r8, r7, r6, 239)) {
                int ordinal = ((C69280Nig) this.A08.getValue()).ordinal();
                if (ordinal == 1) {
                    this.A04.A00(C72801PKp.A00);
                    ocu3 = this.A05;
                    pNb = new C72865PNb(AnonymousClass7TH.A06(this.A06.A02), AnonymousClass05K.A03, AnonymousClass05K.A00, true);
                } else if (ordinal == 2) {
                    this.A04.A00(C72801PKp.A00);
                    ocu3 = this.A05;
                    Integer num = AnonymousClass05K.A04;
                    PM3 pm3 = this.A06;
                    C358248ab A0X = DbS.A0X(this.A01);
                    A0X.A09(2131972734);
                    A0X.A08(2131972733);
                    DbU.A16(pm3.A00.getContext(), A0X, R.drawable.ig_illustrations_illo_screen_share_refresh);
                    A0X.A0I(new C71182Oey(pm3, 6), 2131972732);
                    A0X.A03();
                    A0X.A0r(true);
                    A0X.A0s(true);
                    pNb = new PNW(A0X.A02(), num);
                }
                ocu3.A05(pNb);
                AnonymousClass7TF.A1J(r8, r7, r6, 239, true);
                return;
            }
            ocu = this.A05;
            prw = PPU.A00;
        } else if (ps0 instanceof PNY) {
            PNY pny = (PNY) ps0;
            if (pny.A00 == 322436845) {
                int i = pny.A01;
                Intent intent = pny.A02;
                if (intent == null || i != -1) {
                    ocu2 = this.A05;
                    intent = null;
                    point = new Point();
                } else {
                    ocu2 = this.A05;
                    if (Build.VERSION.SDK_INT >= 30) {
                        try {
                            display = this.A01.getDisplay();
                        } catch (UnsupportedOperationException e) {
                            0KC.A0F("RtcScreenSharePresenter", "Error getting display from context", e);
                            new ON9(0wj.A01).A02("RtcScreenSharePresenter: Error getting display", e);
                            display = null;
                        }
                    } else {
                        Object systemService = this.A01.getSystemService("window");
                        0qQ.A0C(systemService, AnonymousClass000.A00(14));
                        display = ((WindowManager) systemService).getDefaultDisplay();
                    }
                    point = new Point();
                    if (display != null) {
                        display.getRealSize(point);
                    }
                }
                ocu2.A03(new PPR(intent, point));
                return;
            }
            return;
        } else {
            if ((ps0 instanceof C72887PNx) || (ps0 instanceof C72851PMn)) {
                ocu = this.A05;
                prw2 = PPS.A00;
            } else if ((ps0 instanceof C72886PNw) || (ps0 instanceof C72850PMm)) {
                ocu = this.A05;
                prw2 = PPT.A00;
            } else {
                return;
            }
            prw = prw2;
        }
        ocu.A03(prw);
    }

    public final void A0M() {
        Integer num;
        AnonymousClass0eM r3 = this.A08;
        Object value = r3.getValue();
        C69280Nig nig = C69280Nig.BOTTOM_SHEET;
        if (value == nig) {
            this.A05.A05(C72882PNs.A00);
        }
        this.A05.A03(PPU.A00);
        if (r3.getValue() == nig) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A0N;
        }
        this.A04.A00(new C72796PKk(num));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69096Neb(Activity activity, View view, UserSession userSession, OKY oky, C71111Ocu ocu) {
        super(DbS.A0z(N9B.class));
        1Av A002 = 1Au.A00(userSession);
        C51972G9s.A1D(ocu, oky);
        0qQ.A0B(A002, 6);
        this.A01 = activity;
        this.A05 = ocu;
        this.A04 = oky;
        this.A02 = userSession;
        this.A03 = A002;
        this.A06 = new PM3(view, this);
    }
}
