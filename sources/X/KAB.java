package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class KAB extends 1P0 {
    public final /* synthetic */ C270194gL A00;
    public final /* synthetic */ C270194gL A01;
    public final /* synthetic */ C313616gj A02;
    public final /* synthetic */ LOI A03;

    public KAB(C270194gL r1, C270194gL r2, C313616gj r3, LOI loi) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = loi;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C305836Jt r0;
        int A032 = AnonymousClass0fD.A03(106153332);
        C270194gL r4 = (C270194gL) obj;
        int A033 = AnonymousClass0fD.A03(1016796295);
        0qQ.A0B(r4, 0);
        C313616gj r2 = this.A02;
        if (C313616gj.A04(r2)) {
            String str = r4.A0X;
            str.getClass();
            String str2 = this.A00.A0X;
            str2.getClass();
            if (str.equals(str2)) {
                UserSession userSession = r2.A0N;
                1OP.A05(userSession).A0G(r4);
                AnonymousClass4DH r7 = r2.A0K;
                AnonymousClass7TE.A1Z(new MGD(this.A01, r2, (AnonymousClass4D7) null, 22), DbV.A0J(r7));
                LOI loi = this.A03;
                C278114wI r1 = r4.A06;
                if (r1 == null) {
                    r1 = C278114wI.UNKNOWN;
                }
                if ((r1 == C278114wI.UNKNOWN && r1.A00()) || r1 == C278114wI.HARD_STOPPED) {
                    loi.A06 = true;
                }
                loi.A02 = r1;
                LOI.A00(loi);
                if (r2.A01 != null) {
                    C278094wG r10 = r4.A03;
                    if (r10 != null) {
                        C62010KVj A002 = C63492Kxw.A00(userSession);
                        String str3 = r4.A0e;
                        str3.getClass();
                        String str4 = r4.A0X;
                        str4.getClass();
                        A002.A01(AnonymousClass05K.A0Y, str3, str4, "INSTAGRAM_USERPAY_BADGES");
                        if (r10.A01 != null) {
                            int A0A = AnonymousClass7TG.A0A(r10.A04);
                            A002.A00(A0A);
                            if (A0A >= DbS.A04(0Tu.A06, userSession, 36593684002702807L)) {
                                182.A06(0Tu.A05, userSession, 36312209025926134L);
                            }
                            C305836Jt r12 = r2.A01;
                            if (r12 != null && DbX.A1a(r10.A03)) {
                                r2.A08 = new LEK(r7.requireContext(), r12.A0V, r7, userSession, C313666go.VIEWER, (0sP) null);
                            }
                        }
                        C2816658x r122 = r10.A02;
                        if (r122 != null) {
                            FragmentActivity requireActivity = r7.requireActivity();
                            C64102LMw lMw = C64102LMw.A05;
                            if (lMw == null) {
                                lMw = new C64102LMw(userSession, requireActivity);
                                C64102LMw.A05 = lMw;
                            }
                            r2.A0M.A02(((T7R) lMw.A04.getValue()).A00(lMw.A00, new C61046Jvk(lMw.A03, 0)), new M1R(0, r122, r4, r2, A002));
                            r2.A07 = lMw;
                        }
                    }
                    Boolean bool = r4.A0D;
                    if (!(bool == null || !bool.booleanValue() || r4.A03().A02 == 17M.A06 || (r0 = r2.A01) == null)) {
                        Context requireContext = r7.requireContext();
                        ViewGroup viewGroup = r0.A0V;
                        C313666go r15 = C313666go.VIEWER;
                        LAW law = new LAW(requireContext, viewGroup, r2.A0L, userSession, r15, new L5R(r4, r2), JTP.A0q(r4));
                        r2.A05 = law;
                        law.A02.setVisibility(0);
                        C273004lm A003 = C272994ll.A00(law.A04);
                        String moduleName = law.A03.getModuleName();
                        String str5 = law.A06;
                        0qQ.A0B(moduleName, 0);
                        0Aj A0e = AnonymousClass7TE.A0e(A003.A00, "ig_fan_club_subs_in_live_subscribe_cta_impression");
                        DbS.A1O(A0e, moduleName);
                        DbY.A1G(A0e, str5);
                        A0e.Cgf();
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-2108319767, A033);
        AnonymousClass0fD.A0A(-540921282, A032);
    }
}
