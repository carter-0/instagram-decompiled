package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class GCO extends C52050GCw implements AnonymousClass32U {
    public final GD6 A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public static final void A00(GCO gco) {
        int A06;
        C267324bN A0E;
        1Xj r2;
        C52012GBj gBj = gco.A02;
        if (gBj != null && (A06 = gBj.A06()) >= 0) {
            C52009GBg gBg = gco.A00.A0A;
            if (A06 < gBg.A0A() && (A0E = gBg.A0E(A06)) != null) {
                Context context = gco.A01;
                FragmentActivity fragmentActivity = gco.A02;
                UserSession userSession = gco.A04;
                AnonymousClass0iw r7 = gco.A03;
                0qQ.A0B(context, 0);
                DbZ.A0t(1, fragmentActivity, userSession, r7);
                if (C51966G9m.A1W(userSession, C51968G9o.A15(A0E.A08(userSession))) && GPm.A00(userSession, A0E.A02) && (r2 = A0E.A02) != null) {
                    0xa A032 = 1Al.A01(userSession).A03(1An.A0l);
                    if (!A032.contains(r2.getId())) {
                        0xY AR4 = A032.AR4();
                        AR4.E5T(r2.getId(), true);
                        AR4.apply();
                        1Xj r9 = A0E.A02;
                        if (r9 != null) {
                            fragmentActivity.runOnUiThread(new C57975IjU(fragmentActivity, context, r7, userSession, r9));
                        }
                    }
                }
            }
        }
    }

    public GCO(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, GD6 gd6) {
        C51972G9s.A1D(userSession, r3);
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = r3;
        this.A00 = gd6;
    }

    public final void DW8(int i, int i2) {
        A00(this);
    }
}
