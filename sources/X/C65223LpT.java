package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.LpT  reason: case insensitive filesystem */
public final class C65223LpT implements MVS {
    public KHV A00;
    public final C62674Kka A01 = C62674Kka.A02;
    public final AnonymousClass80P A02 = AnonymousClass80P.ADD_FUNDRAISER;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C66576MXh A05;
    public final KOJ A06;
    public final AnonymousClass0iw A07;

    public final /* synthetic */ void ADm() {
    }

    public static C65223LpT A00(KHV khv) {
        C65223LpT lpT = khv.A09.A00;
        27p.A01(lpT.A04).A1B(lpT.A01, lpT.A02);
        return lpT;
    }

    public final View ANH() {
        DV3 dv3;
        Context requireContext = this.A03.requireContext();
        L12 l12 = new L12(this);
        UserSession userSession = this.A04;
        AnonymousClass0iw r5 = this.A07;
        String str = (String) AnonymousClass7TE.A14(this.A06.A02);
        0qQ.A0B(str, 4);
        KHV khv = new KHV(requireContext, r5, userSession, l12, str);
        DbY.A0z(khv);
        khv.setOrientation(1);
        this.A00 = khv;
        khv.A02 = true;
        User A0j = DbT.A0j(userSession);
        DV3 Bya = A0j.A03.Bya();
        if (Bya == null || !Bya.BAV()) {
            dv3 = null;
        } else {
            dv3 = A0j.A03.Bya();
        }
        khv.setExistingFundraiserInfo(dv3);
        KHV khv2 = this.A00;
        if (khv2 != null) {
            return khv2;
        }
        0qQ.A0F("fundraiserTagRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A01;
    }

    public final AnonymousClass80P BHl() {
        return this.A02;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A03;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 32), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65223LpT(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, C66576MXh mXh, KOJ koj) {
        C51974G9v.A1P(r2, userSession, mXh, koj);
        0qQ.A0B(r3, 5);
        this.A03 = r2;
        this.A04 = userSession;
        this.A05 = mXh;
        this.A06 = koj;
        this.A07 = r3;
    }
}
