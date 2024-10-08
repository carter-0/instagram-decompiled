package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Maw  reason: case insensitive filesystem */
public final class C66689Maw implements C74564PxD {
    public final /* synthetic */ C66633Ma2 A00;

    public final C67292MlR C63(AnonymousClass2Ep r5) {
        if (r5 == null) {
            return null;
        }
        int CAt = r5.CAt();
        C66633Ma2 ma2 = this.A00;
        if (!C66682Map.A00(ma2.A0p(), CAt)) {
            return null;
        }
        C2596742q r3 = (C2596742q) ma2.A2n.getValue();
        String C6C = r5.C6C();
        String C6k = r5.C6k();
        if (C6C == null && C6k == null) {
            return null;
        }
        return (C67292MlR) r3.A01.A00(new C299305uu(C6C, C6k));
    }

    public final boolean CK0(AnonymousClass2Ep r4) {
        0qQ.A0B(r4, 0);
        C66633Ma2 ma2 = this.A00;
        DirectThreadKey directThreadKey = ((C67095MiF) ma2.A1t.getValue()).A00;
        if (!ma2.A1J.isResumed() || directThreadKey == null || !directThreadKey.equals(r4.BJy()) || r4.CKx()) {
            return false;
        }
        return true;
    }

    public final boolean CL5(AnonymousClass2Ep r4) {
        List list;
        0qQ.A0B(r4, 0);
        C66633Ma2 ma2 = this.A00;
        String str = ((C67095MiF) ma2.A1t.getValue()).A01;
        if (str != null) {
            list = 1bJ.A00(ma2.A0p()).CFn(r4.BJy(), str);
        } else {
            list = null;
        }
        if (list == null || !AnonymousClass7TE.A1b(list)) {
            return false;
        }
        return true;
    }

    public C66689Maw(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final Reel Bkv(C69614Now now) {
        return C66650MaJ.A01(this.A00.A0p(), now);
    }

    public final AnonymousClass9IV C0v(String str) {
        if (str != null) {
            return (AnonymousClass9IV) this.A00.A1U.get(str);
        }
        return null;
    }

    public final C241473Pi CFu(String str) {
        if (str != null) {
            return (C241473Pi) this.A00.A1W.get(str);
        }
        return null;
    }

    public final boolean CJm() {
        C66633Ma2 ma2 = this.A00;
        if (!ma2.A0q().CT5() || AnonymousClass7TE.A1b(C66581MXm.A0U(ma2).A0E.A0O)) {
            return false;
        }
        return true;
    }

    public final void EB8() {
        C337257fy r1;
        C66633Ma2 ma2 = this.A00;
        AnonymousClass4DH r9 = ma2.A1J;
        if (r9.isResumed()) {
            UserSession A0p = ma2.A0p();
            int size = C66581MXm.A0U(ma2).A0E.A0O.size();
            int CBm = C66581MXm.A0V(ma2).C6W().CBm();
            boolean A02 = AnonymousClass38W.A00().A02(r9.requireContext(), ma2.A0p());
            0qQ.A0B(A0p, 0);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r9, A0p), "direct_inbox_manual_refresh");
            A0e.A7p("vc_multitask", Boolean.valueOf(A02));
            A0e.A8k("num_threads_unseen", Integer.valueOf(CBm));
            A0e.A8k("num_threads", Integer.valueOf(size));
            A0e.Cgf();
            2EM A0t = ma2.A0t();
            if (ma2.A0q().EsC()) {
                C2611948q A05 = C66633Ma2.A05(ma2);
                if (ma2.A0c != null) {
                    AnonymousClass0eM r2 = ma2.A1s;
                    ((C67197Mjt) r2.getValue()).A02(A0t, A05, "MANUAL_REFRESH");
                    ((C67197Mjt) r2.getValue()).A01();
                }
                if (2El.A07(ma2.A0p())) {
                    new C68960Nbm(1bO.A00(ma2.A0p()), "manual_refresh").A03();
                }
                ma2.A0q().AUu(A0t, A05, "manual_refresh");
                ma2.A16((Integer) null);
            }
            if (!0qQ.A0K(A0t, AnonymousClass2EX.A00) && (r1 = ma2.A0s) != null) {
                r1.EhX("");
            }
            C66581MXm.A0g(ma2).Dh3();
            Integer num = AnonymousClass05K.A01;
            int A04 = DbS.A04(0Tu.A05, ma2.A0p(), 36592318203429307L);
            C14293TtR.A01(ma2.A0p(), (C229132mt) ma2.A1e.getValue(), (C231272rL) ma2.A1c.getValue(), num, A04);
            ((AnonymousClass439) ma2.A1o.getValue()).A04(AnonymousClass05K.A02);
            C67028Mh1 mh1 = ma2.A0l;
            if (mh1 != null) {
                mh1.A01(true);
            }
            0xY A0N = AnonymousClass7TF.A0N(ma2.A0p());
            A0N.E5T("should_show_refresh_close_friends_filter_toast", false);
            A0N.apply();
        }
    }

    public final boolean isLoading() {
        return this.A00.A18();
    }
}
