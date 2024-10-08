package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class H08 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "WallMediaPickerBaseFragment";
    public C14227TsA A00;
    public C14074TpO A01;
    public C56514Hzl A02 = new C56514Hzl(false, true, false);
    public final C229122ms A03 = new C57414IaK(this, 5);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C58704IwD.A01(this, 30));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C58704IwD.A01(this, 31));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void A03(HAX hax) {
        C53014Gh5 gh5 = (C53014Gh5) this.A05.getValue();
        HG7 hg7 = A02().A03;
        String id = hax.A02.getId();
        0qQ.A0B(id, 0);
        boolean z = !hg7.A02.containsKey(id);
        if (z) {
            C59060J4t j4t = C59060J4t.A00;
            0V2 r1 = gh5.A02;
            Object A0I = 00k.A0I(r1.Bm6());
            j4t.invoke(A0I);
            r1.FIA(A0I);
        }
        C58736Iwj iwj = new C58736Iwj(29, hax, z);
        0V2 r12 = gh5.A02;
        Object A0I2 = 00k.A0I(r12.Bm6());
        iwj.invoke(A0I2);
        r12.FIA(A0I2);
    }

    public final C14074TpO A01() {
        C14074TpO tpO = this.A01;
        if (tpO != null) {
            return tpO;
        }
        0qQ.A0F("grid");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C52997Ggo A02() {
        AnonymousClass0eM r0;
        if (this instanceof HHB) {
            r0 = ((HHB) this).A01;
        } else {
            r0 = ((HHC) this).A00;
        }
        return (C52997Ggo) r0.getValue();
    }

    public final void A04(boolean z) {
        if (this instanceof HHB) {
            HHB hhb = (HHB) this;
            if (!hhb.A03.isLoading()) {
                HHE hhe = (HHE) hhb.A01.getValue();
                if (z) {
                    hhe.A00.A02.clear();
                    C55855Hoc hoc = hhe.A00;
                    hoc.A00 = null;
                    hoc.A04.Epw(new C56514Hzl(false, true, false));
                    hoc.A03.Epw(0sn.A00);
                }
                C58106ImS.A03(hhe, C318116oQ.A00(hhe), 18);
                return;
            }
            return;
        }
        ((HHD) ((HHC) this).A00.getValue()).A00.A00.A07();
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass2tC A0S;
        boolean z;
        C232232tF hha;
        int A022 = AnonymousClass0fD.A02(-1434595744);
        H08.super.onCreate(bundle);
        Context requireContext = requireContext();
        C229122ms r1 = this.A03;
        HAH hah = A02().A00;
        UserSession session = getSession();
        String A002 = AnonymousClass000.A00(2);
        0qQ.A0C(session, A002);
        UserSession userSession = session;
        if (this instanceof HHB) {
            HHB hhb = (HHB) this;
            A0S = DbV.A0S(hhb);
            X41 x41 = hhb.A00;
            UserSession A0l = AnonymousClass7TE.A0l(hhb.A06);
            AnonymousClass0eM r6 = hhb.A01;
            z = false;
            hha = new HH9(new C14327Tu5(hhb, A0l, ((C52997Ggo) r6.getValue()).A00, x41, false, false), ((C52997Ggo) r6.getValue()).A03, hhb);
        } else {
            HHC hhc = (HHC) this;
            int i = DbV.A05(hhc).getDisplayMetrics().widthPixels;
            AnonymousClass0eM r3 = hhc.A00;
            r3.getValue();
            int i2 = i / 3;
            A0S = DbV.A0S(hhc);
            A0S.A01(new H77(hhc));
            z = false;
            hha = new HHA(new C355608Qq(hhc.requireActivity(), AnonymousClass7TE.A0l(hhc.A06), AnonymousClass05K.A00, i2, i2, false), ((C52997Ggo) r3.getValue()).A00, ((C52997Ggo) r3.getValue()).A03, hhc);
        }
        A0S.A01(hha);
        this.A00 = new C14227TsA(requireContext, this, A0S, userSession, hah, (AnonymousClass2tR) null, (C14369Tuy) null, (GAC) null, (2bv) null, r1, true, z);
        C52997Ggo A023 = A02();
        C14227TsA tsA = this.A00;
        if (tsA != null) {
            A023.A03.A00 = tsA;
            UserSession session2 = getSession();
            0qQ.A0C(session2, A002);
            C14385TvE tvE = new C14385TvE(session2);
            C14227TsA tsA2 = this.A00;
            if (tsA2 != null) {
                tvE.A06 = tsA2;
                tvE.A01(IRI.A00);
                HAH hah2 = A02().A00;
                0qQ.A0B(hah2, 0);
                tvE.A08 = hah2;
                tvE.A00(C51969G9p.A0k());
                tvE.A02(A02().A01);
                tvE.A0I = true;
                tvE.A04 = this;
                tvE.A0N = false;
                this.A01 = new C14074TpO(tvE);
                AnonymousClass0fD.A09(87737106, A022);
                return;
            }
        }
        0qQ.A0F("gridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1983281411);
        0qQ.A0B(layoutInflater, 0);
        A01();
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
        AnonymousClass0fD.A09(-1860785330, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1967299919);
        super.onDestroyView();
        A01().A01();
        AnonymousClass0fD.A09(671714843, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-566186842);
        H08.super.onPause();
        A01().A0D.AGS();
        AnonymousClass0fD.A09(-2088814111, A022);
    }
}
