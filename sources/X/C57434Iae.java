package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.Iae  reason: case insensitive filesystem */
public final class C57434Iae implements JRM {
    public final Fragment A00;
    public final 0hq A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final String A05;
    public final AnonymousClass311 A06;
    public final AnonymousClass2xS A07;
    public final C249763kK A08;
    public final String A09;

    public C57434Iae(Fragment fragment, 0hq r3, AnonymousClass0iw r4, UserSession userSession, AnonymousClass311 r6, AnonymousClass4DU r7, AnonymousClass2xS r8, C249763kK r9, String str, String str2) {
        AnonymousClass7TF.A1G(r4, 5, r9);
        this.A06 = r6;
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = r7;
        this.A02 = r4;
        this.A00 = fragment;
        this.A09 = str2;
        this.A07 = r8;
        this.A08 = r9;
        this.A01 = r3;
    }

    public final void D44(1Xj r8) {
        1Xj r3 = r8;
        0qQ.A0B(r8, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            AnonymousClass4DU r4 = this.A04;
            UserSession userSession = this.A03;
            LTZ.A0C(fragment, userSession, r3, r4, fragment.getString(2131975422), r8.A3m(userSession));
        }
    }

    public final void D7C(1Xj r1) {
    }

    public final void DDk(1Xj r1) {
    }

    public final void DHc(1Xj r1) {
    }

    public final void DMo() {
    }

    public final void DS3(1Xj r1) {
    }

    public final void DiJ(1Xj r1) {
    }

    public final void Duh(1Xj r1, AnonymousClass3W1 r2, Integer num, boolean z) {
    }

    public final void Dui(1Xj r1) {
    }

    public final void Duj(1Xj r1) {
    }

    public final void Dum() {
    }

    public final void Dun(1Xj r1) {
    }

    public final void Duo(List list, String str) {
    }

    public final void Dup(1Xj r1) {
    }

    public final void Duq(1Xj r1) {
    }

    public final void Dur(1Xj r14) {
        UserSession userSession = this.A03;
        UpcomingEvent A27 = r14.A27(userSession);
        if (A27 != null) {
            AnonymousClass4DU r5 = this.A04;
            C310306am r3 = new C310306am(r5, userSession, r5.getModuleName());
            String id = r14.getId();
            String A002 = AnonymousClass000.A00(4156);
            String A003 = AnonymousClass000.A00(799);
            r3.A04(A27, id, A002, A003);
            C63468KxX.A00().A01(this.A00.requireContext(), userSession, r5, (XCE) null, A27, r14.A1e(userSession).getId(), r5.getModuleName(), A003, false, false);
        }
    }

    public final void Dus(1Xj r16, AnonymousClass3W1 r17) {
        String str;
        if (!(!AnonymousClass06S.A01(this.A01))) {
            1Xj r5 = r16;
            CreativeConfigIntf A0r = C51966G9m.A0r(r5);
            if (A0r != null) {
                List<EffectPreviewIntf> B02 = A0r.B02();
                if (B02 != null) {
                    AnonymousClass3W1 r12 = r17;
                    if (B02.size() > 1) {
                        Fragment fragment = this.A00;
                        Context requireContext = fragment.requireContext();
                        UserSession userSession = this.A03;
                        C46498Dg1 dg1 = new C46498Dg1(requireContext, userSession);
                        dg1.A01(2131961553);
                        for (EffectPreviewIntf effectPreviewIntf : B02) {
                            dg1.A0C(effectPreviewIntf.getName(), new ICB(8, r12, effectPreviewIntf, r5, this));
                        }
                        C49945FFy.A00(fragment, dg1);
                        AnonymousClass4DU r6 = this.A04;
                        C54689HOu hOu = C54689HOu.A0E;
                        C249763kK r1 = this.A08;
                        if (r1 instanceof AnonymousClass93U) {
                            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.util.session.ChainingAndViewerSessionIdProvider");
                            str = ((AnonymousClass93U) r1).CFD();
                        } else {
                            str = "";
                        }
                        C52086GEg.A0R(hOu, userSession, r5, r6, str, r5.getId(), r12.getPosition());
                    } else if (!B02.isEmpty()) {
                        FragmentActivity requireActivity = this.A00.requireActivity();
                        UserSession userSession2 = this.A03;
                        C54984HaH.A00(requireActivity, this.A02, userSession2, (EffectPreviewIntf) B02.get(0), r5, this.A04, r12);
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void Dut(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void Duu(1Xj r12, AnonymousClass3W1 r13, boolean z, boolean z2) {
        1Xj r5 = r12;
        0qQ.A0B(r12, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() == null) {
            return;
        }
        if (r12.A0z() == 1) {
            LTZ.A0B(fragment, this.A03, r12, this.A04, this.A05);
            return;
        }
        LTZ.A09(fragment, this.A03, r5, this.A04, (C262944Gp) null, (String) null, z, false);
    }

    public final void Duw(1Xj r12, AnonymousClass3W1 r13) {
        AnonymousClass4DU r5 = this.A04;
        UserSession userSession = this.A03;
        String str = this.A05;
        W3r.A0C(userSession, r12, r5, str, false);
        C249713kF.A00.A0t(this.A00.requireActivity(), userSession, r12, r5, r13, (C262944Gp) null, str, this.A09, (String) null);
    }

    public final void Dux(1Xj r1) {
    }

    public final void Duy(1Xj r1) {
    }

    public final void D3w(1Xj r2, AnonymousClass3W1 r3) {
        this.A06.C41().D3w(r2, r3);
    }

    public final void DVb(1Xj r2, AnonymousClass3W1 r3) {
        this.A06.C41().DVb(r2, r3);
    }
}
