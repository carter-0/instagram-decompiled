package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LpX  reason: case insensitive filesystem */
public final class C65227LpX implements MVS {
    public KHY A00;
    public final AnonymousClass4DH A01;
    public final C66576MXh A02;
    public final C66535MVp A03;
    public final C61847KOm A04;
    public final C62674Kka A05 = C62674Kka.A0A;
    public final AnonymousClass80P A06 = AnonymousClass80P.CONTENT_SCHEDULING;
    public final UserSession A07;
    public final boolean A08;

    public C65227LpX(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C66535MVp mVp, C61847KOm kOm, boolean z) {
        0qQ.A0B(r2, 1);
        C51974G9v.A0d(2, userSession, mXh, kOm, mVp);
        this.A01 = r2;
        this.A07 = userSession;
        this.A08 = z;
        this.A02 = mXh;
        this.A04 = kOm;
        this.A03 = mVp;
    }

    public static final void A02(C65227LpX lpX, Date date) {
        NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures = null;
        C61847KOm kOm = lpX.A04;
        if (date == null) {
            kOm.A09(C61847KOm.A00(kOm.A06(), kOm, C51967G9n.A0k()));
        } else {
            kOm.A09(C61847KOm.A00(kOm.A06(), kOm, Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(date.getTime()))));
            nonSupportedContentSchedulingFeatures = lpX.A02.CBv();
        }
        lpX.A03.CkE(nonSupportedContentSchedulingFeatures);
    }

    public static final void A00(C61041Jvf jvf, C65227LpX lpX) {
        KHY khy = lpX.A00;
        if (khy != null) {
            khy.setChecked(jvf.A04);
            KHY khy2 = lpX.A00;
            if (khy2 != null) {
                khy2.setEnabled(jvf.A05);
                KHY khy3 = lpX.A00;
                if (khy3 != null) {
                    khy3.setTitle(jvf.A03);
                    KHY khy4 = lpX.A00;
                    if (khy4 != null) {
                        khy4.setSubtitle(jvf.A02);
                        boolean z = jvf.A06;
                        KHY khy5 = lpX.A00;
                        if (z) {
                            if (khy5 != null) {
                                khy5.A06();
                                return;
                            }
                        } else if (khy5 != null) {
                            khy5.A04();
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F("contentSchedulingSwitchCell");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C65227LpX lpX) {
        UserSession userSession = lpX.A07;
        new LD5(lpX.A01.requireActivity(), userSession).A00((Date) ((C61041Jvf) lpX.A04.A0A.getValue()).A01, C66296MMf.A00(lpX, 12), JTO.A1C(lpX, 56), false);
        lpX.A03.CkF();
    }

    public final void ADm() {
        A00((C61041Jvf) this.A04.A0A.getValue(), this);
    }

    public final View ANH() {
        Integer num;
        this.A03.CkG();
        Context requireContext = this.A01.requireContext();
        if (this.A08) {
            num = Integer.valueOf(R.drawable.instagram_clock_pano_outline_24);
        } else {
            num = null;
        }
        KHY A012 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), (CharSequence) null, num, 2131956666);
        this.A00 = A012;
        KHY.A02(A012, this, 9);
        LYD.A02(A012, 17, this);
        KHY khy = this.A00;
        if (khy != null) {
            return khy;
        }
        0qQ.A0F("contentSchedulingSwitchCell");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A05;
    }

    public final AnonymousClass80P BHl() {
        return this.A06;
    }

    public final void CsQ() {
        05G r0;
        C61041Jvf jvf;
        C61847KOm kOm = this.A04;
        UserSession userSession = kOm.A05;
        if (182.A06(0Tu.A05, userSession, 36323848387505732L)) {
            1Av A002 = 1Au.A00(userSession);
            0s0 r02 = A002.A0b;
            AnonymousClass0YZ[] r5 = 1Av.A8a;
            int A032 = DbY.A03(A002, r02, r5, 516);
            if (A032 < 3) {
                1Av A003 = 1Au.A00(userSession);
                int i = A032 + 1;
                A003.A0b.Epx(A003, Integer.valueOf(i), r5[516]);
                r0 = kOm.A09;
                C61041Jvf jvf2 = (C61041Jvf) r0.getValue();
                jvf = new C61041Jvf(jvf2.A01, jvf2.A03, jvf2.A02, 0, jvf2.A05, jvf2.A04, true);
            } else {
                r0 = kOm.A09;
                C61041Jvf jvf3 = (C61041Jvf) r0.getValue();
                jvf = new C61041Jvf(jvf3.A01, jvf3.A03, jvf3.A02, 0, jvf3.A05, jvf3.A04, false);
            }
            r0.Epw(jvf);
        }
        AnonymousClass4DH r52 = this.A01;
        r52.requireActivity().getOnBackPressedDispatcher().A06(new QAH((Object) this, 3), r52.getViewLifecycleOwner());
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r52.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 21), AnonymousClass07a.A00(viewLifecycleOwner));
    }
}
