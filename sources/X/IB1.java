package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.List;

public final class IB1 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public IB1(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        Integer num;
        String str;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(830789054);
                C69184Nga nga = (C69184Nga) this.A01;
                C67758MuD A07 = C69184Nga.A07(nga);
                FragmentActivity requireActivity = nga.requireActivity();
                boolean z = this.A02;
                NUQ nuq = A07.A07;
                if (z) {
                    nuq.A0B("RESET_PIN_CLICK");
                    nuq.A08();
                } else {
                    nuq.A0B("CREATE_PIN_CLICK");
                }
                A07.A08.A01(requireActivity, AnonymousClass7TE.A0a(), C69358Njy.CREATE_PIN, C69271NiX.FULLSCREEN_MODAL, AnonymousClass05K.A0u, AnonymousClass05K.A00, (Integer) null);
                i = 964033587;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-259247236);
                boolean z2 = this.A02;
                C72336P2b p2b = (C72336P2b) this.A01;
                if (!z2) {
                    C358248ab A0Y = DbS.A0Y(p2b.A00);
                    A0Y.A09(2131958710);
                    A0Y.A08(2131958708);
                    A0Y.A06();
                    AnonymousClass7TH.A0a(A0Y, true);
                } else {
                    UserSession userSession = p2b.A03;
                    if (182.A06(0Tu.A05, userSession, 36328852024278659L)) {
                        AnonymousClass6ST A0h = DbV.A0h(p2b.A00);
                        02m r9 = 02m.A0p;
                        r9.markerStart(478229610);
                        0sP ixD = new C58766IxD(11, p2b, A0h, r9, false);
                        List<C68303N9q> A0a = 00k.A0a(p2b.A04.A0T);
                        ArrayList A0r = AnonymousClass7TG.A0r(A0a);
                        for (C68303N9q n9q : A0a) {
                            A0r.add(n9q.A00.getId());
                        }
                        1NY A0a2 = AnonymousClass7TG.A0a(userSession);
                        A0a2.A0A("direct_v2/optional_e2ee_eligibility_check/");
                        A0a2.A0Q(C54061Gyk.class, C56296Hw9.class);
                        1OC A0T = DbT.A0T(A0a2, C66579MXk.A00(39), DirectThreadApi.A0K(A0r));
                        A0T.A00 = new C54081Gz5(r9, userSession, p2b, A0h, ixD);
                        1ES.A03(A0T);
                    } else {
                        OPN.A00(p2b.A01, p2b.A02, userSession, p2b.A04, false);
                    }
                }
                i = -1292336828;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-1978789086);
                C53004Ggv A0j = C51968G9o.A0j((C54136H0f) this.A01);
                boolean z3 = !this.A02;
                if (z3) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                02m r3 = A0j.A02;
                if (1 - num.intValue() != 0) {
                    str = "thread_list_unselect_all_click";
                } else {
                    str = "thread_list_select_all_click";
                }
                r3.markerPoint(834879336, str);
                05G r4 = A0j.A03.A07;
                List<C53398GnV> list = (List) ((C61084JwM) r4.getValue()).A02;
                ArrayList A0r2 = AnonymousClass7TG.A0r(list);
                for (C53398GnV gnV : list) {
                    C254743sy r7 = (C254743sy) gnV.A02;
                    String str2 = gnV.A04;
                    String str3 = gnV.A03;
                    C69597Nof nof = (C69597Nof) gnV.A01;
                    C51974G9v.A1K(r7, str2, nof);
                    A0r2.add(new C53398GnV(nof, r7, str2, str3, z3));
                }
                C61084JwM jwM = (C61084JwM) r4.getValue();
                r4.Epw(C61084JwM.A03((Integer) jwM.A01, (Integer) jwM.A00, A0r2));
                i = -556306345;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(1112052195);
                C54166H1l h1l = (C54166H1l) this.A01;
                AnonymousClass0eM r5 = h1l.A04;
                I4R.A00(AnonymousClass0kN.A02(DbT.A0X(r5)), DbW.A0l(h1l.A05), "who_to_limit_sheet", this.A02);
                H0F h0f = new H0F();
                C331127Pr A0f = DbX.A0f(r5);
                A0f.A0d = h1l.getString(2131965054);
                C57385IZq.A00(A0f, h1l, 9);
                DbY.A13(h1l, h0f, A0f);
                i = 408523408;
                break;
            default:
                A05 = AnonymousClass0fD.A05(470932077);
                C54166H1l h1l2 = (C54166H1l) this.A01;
                AnonymousClass0eM r6 = h1l2.A04;
                I4R.A00(AnonymousClass0kN.A02(DbT.A0X(r6)), DbW.A0l(h1l2.A05), "set_duration_sheet", this.A02);
                K4R k4r = new K4R();
                k4r.A02 = h1l2;
                C331127Pr A0f2 = DbX.A0f(r6);
                A0f2.A0d = h1l2.getString(2131965043);
                C331137Ps r62 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
                r62.A06 = h1l2.getString(2131960992);
                r62.A0A = true;
                r62.A05 = ID1.A00(h1l2, 49);
                A0f2.A07(r62.A00());
                C57385IZq.A00(A0f2, h1l2, 10);
                DbY.A13(h1l2, k4r, A0f2);
                i = 943776552;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
