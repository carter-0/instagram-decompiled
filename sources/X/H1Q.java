package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class H1Q extends AnonymousClass4DH implements MXF {
    public static final String __redex_internal_original_name = "MediaKitBasePickerFragment";
    public C14227TsA A00;
    public C14074TpO A01;
    public C56513Hzk A02 = new C56513Hzk(false, true, false);
    public final C229122ms A03 = new C57414IaK(this, 3);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new MMD(this, 2));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new MMD(this, 3));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new MMD(this, 1));

    public final void A03(HAW haw) {
        C60326JjV jjV = (C60326JjV) this.A05.getValue();
        HG6 hg6 = A02().A02;
        String id = haw.A02.getId();
        0qQ.A0B(id, 0);
        boolean z = !hg6.A02.containsKey(id);
        if (z) {
            C62533KhP khP = jjV.A02;
            if (C60326JjV.A00(khP, jjV) > 1 && jjV.A02().size() >= C60326JjV.A00(khP, jjV)) {
                LE6 le6 = new LE6((Integer) null, (C62320sa) null, 2131966643);
                le6.A02 = AnonymousClass7TF.A1b(jjV.A02().size());
                jjV.A03(new C65444LtS(le6));
                return;
            } else if (C60326JjV.A00(khP, jjV) <= 1) {
                C60326JjV.A01(jjV, C59020J3f.A00);
            }
        }
        C60326JjV.A01(jjV, new C58736Iwj(19, haw, z));
    }

    public final C14074TpO A01() {
        C14074TpO tpO = this.A01;
        if (tpO != null) {
            return tpO;
        }
        0qQ.A0F("grid");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C52996Ggn A02() {
        AnonymousClass0eM r0;
        if (this instanceof HC1) {
            r0 = ((HC1) this).A01;
        } else {
            r0 = ((HC2) this).A00;
        }
        return (C52996Ggn) r0.getValue();
    }

    public final void A04(boolean z) {
        if (this instanceof HC1) {
            HC1 hc1 = (HC1) this;
            if (!hc1.A03.isLoading()) {
                C47912EMg eMg = (C47912EMg) hc1.A01.getValue();
                if (z) {
                    eMg.A00.A02.clear();
                    C49643F0a f0a = eMg.A00;
                    f0a.A00 = null;
                    f0a.A04.Epw(new C56513Hzk(false, true, false));
                    f0a.A03.Epw(0sn.A00);
                }
                AnonymousClass7TE.A1Z(new C51645Fy4(eMg, (AnonymousClass4D7) null, 5), C318116oQ.A00(eMg));
                return;
            }
            return;
        }
        ((KUV) ((HC2) this).A00.getValue()).A01.A00.A07();
    }

    public final LDW BO3() {
        return (LDW) this.A07.getValue();
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass2tC A0S;
        boolean z;
        C232232tF hBx;
        int A022 = AnonymousClass0fD.A02(-18814892);
        H1Q.super.onCreate(bundle);
        Context requireContext = requireContext();
        C229122ms r3 = this.A03;
        HAH hah = A02().A00;
        UserSession session = getSession();
        String A002 = AnonymousClass000.A00(2);
        0qQ.A0C(session, A002);
        UserSession userSession = session;
        if (this instanceof HC1) {
            HC1 hc1 = (HC1) this;
            A0S = DbV.A0S(hc1);
            X41 x41 = hc1.A00;
            UserSession A0l = AnonymousClass7TE.A0l(hc1.A06);
            AnonymousClass0eM r5 = hc1.A01;
            z = false;
            hBx = new C54405HBw(new C14327Tu5(hc1, A0l, ((C52996Ggn) r5.getValue()).A00, x41, false, false), hc1, ((C52996Ggn) r5.getValue()).A02);
        } else {
            HC2 hc2 = (HC2) this;
            int i = DbV.A05(hc2).getDisplayMetrics().widthPixels;
            AnonymousClass0eM r4 = hc2.A00;
            r4.getValue();
            int i2 = i / 3;
            A0S = DbV.A0S(hc2);
            A0S.A01(new H77(hc2));
            A0S.A01(new H78(C58459IsG.A00));
            z = false;
            hBx = new C54406HBx(new C355608Qq(hc2.requireActivity(), AnonymousClass7TE.A0l(hc2.A06), AnonymousClass05K.A00, i2, i2, false), ((C52996Ggn) r4.getValue()).A00, hc2, ((C52996Ggn) r4.getValue()).A02);
        }
        A0S.A01(hBx);
        this.A00 = new C14227TsA(requireContext, this, A0S, userSession, hah, (AnonymousClass2tR) null, (C14369Tuy) null, (GAC) null, (2bv) null, r3, true, z);
        C52996Ggn A023 = A02();
        C14227TsA tsA = this.A00;
        if (tsA != null) {
            A023.A02.A00 = tsA;
            UserSession session2 = getSession();
            0qQ.A0C(session2, A002);
            C14385TvE tvE = new C14385TvE(session2);
            C14227TsA tsA2 = this.A00;
            if (tsA2 != null) {
                tvE.A06 = tsA2;
                tvE.A01(IRH.A00);
                HAH hah2 = A02().A00;
                0qQ.A0B(hah2, 0);
                tvE.A08 = hah2;
                tvE.A00(C51969G9p.A0k());
                tvE.A02(A02().A03);
                tvE.A0I = true;
                tvE.A04 = this;
                tvE.A0N = false;
                this.A01 = new C14074TpO(tvE);
                AnonymousClass0fD.A09(-37304534, A022);
                return;
            }
        }
        0qQ.A0F("gridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1595398967);
        0qQ.A0B(layoutInflater, 0);
        A01();
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
        AnonymousClass0fD.A09(-433053498, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-894371486);
        super.onDestroyView();
        A01().A01();
        AnonymousClass0fD.A09(1282796144, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(614910745);
        H1Q.super.onPause();
        A01().A0D.AGS();
        AnonymousClass0fD.A09(282601115, A022);
    }
}
