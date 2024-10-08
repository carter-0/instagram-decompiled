package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.LQf  reason: case insensitive filesystem */
public final class C64143LQf {
    public View A00;
    public final Context A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C66527MVf A04;
    public final MUQ A05 = new M02(this, 3);
    public final boolean A06;
    public final C65214LpK A07;

    public static final void A00(C64143LQf lQf, UpcomingEvent upcomingEvent) {
        if (upcomingEvent == null || !C18810W3l.A0B(upcomingEvent)) {
            lQf.A04.DvF();
            return;
        }
        C20698WxU wxU = new C20698WxU((Object) lQf, 37);
        C358248ab A0Y = DbS.A0Y(lQf.A01);
        A0Y.A09(2131965359);
        A0Y.A08(2131965358);
        A0Y.A0E(LV2.A00(wxU, 46));
        A0Y.A0G((DialogInterface.OnClickListener) null, 2131968513);
        DbT.A1V(A0Y);
    }

    public static final void A01(C64143LQf lQf, UpcomingEvent upcomingEvent, boolean z) {
        boolean z2 = lQf.A06;
        if (z2) {
            C59847JaN.A00(lQf.A03).A04("UPCOMING_EVENT_TAPPED");
        }
        if (z && !z2) {
            GAX gax = new GAX(2131953884, 2131961770);
            C65214LpK lpK = lQf.A07;
            if (lpK != null) {
                lpK.A03.EvB(gax, (C62320sa) null);
            }
        } else if (upcomingEvent == null) {
            1OC A012 = C45709D2i.A01(lQf.A03);
            AnonymousClass4DH r3 = lQf.A02;
            A012.A00 = new C54443HDx(r3.getParentFragmentManager(), lQf, 4);
            r3.schedule(A012);
        } else if (C18810W3l.A0B(upcomingEvent)) {
            1pS A002 = C2601144i.A00();
            AnonymousClass4DH r2 = lQf.A02;
            A002.A03(r2, lQf.A03, r2.getModuleName());
        } else if (z2) {
            C59888JbD.A01(lQf.A03, new KPW(lQf.A05, upcomingEvent, false));
        } else {
            lQf.A04.DVS(lQf.A05, upcomingEvent);
        }
    }

    public C64143LQf(AnonymousClass4DH r3, UserSession userSession, C65214LpK lpK, C66527MVf mVf, boolean z) {
        this.A02 = r3;
        this.A03 = userSession;
        this.A06 = z;
        this.A04 = mVf;
        this.A07 = lpK;
        this.A01 = r3.requireContext();
    }
}
