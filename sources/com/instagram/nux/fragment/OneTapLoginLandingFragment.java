package com.instagram.nux.fragment;

import X.09i;
import X.0Aj;
import X.0cp;
import X.0qQ;
import X.0qv;
import X.1OC;
import X.1P0;
import X.1wn;
import X.1xC;
import X.2eS;
import X.AnonymousClass000;
import X.AnonymousClass0aP;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass2XD;
import X.AnonymousClass4DH;
import X.AnonymousClass6ST;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C296675qS;
import X.C319606qt;
import X.C319646qx;
import X.C358248ab;
import X.C46634DiE;
import X.C47361Dvv;
import X.C47573E8l;
import X.C47906EMa;
import X.C49708F2t;
import X.C49881FBf;
import X.C49900FCd;
import X.C49938FFr;
import X.C49958FGq;
import X.C50022FJh;
import X.C50249FVg;
import X.C50515Fdb;
import X.C51961G9h;
import X.C60937Jtv;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.Dbj;
import X.EDL;
import X.EEE;
import X.EXD;
import X.F2Z;
import X.F3M;
import X.F3P;
import X.FBZ;
import X.FCK;
import X.FH8;
import X.FHA;
import X.FPD;
import X.FPG;
import X.FXZ;
import X.G8H;
import X.QP8;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.ui.NetzDgTermsTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneTapLoginLandingFragment extends AnonymousClass4DH implements AnonymousClass0iw, G8H {
    public AnonymousClass0aP A00;
    public FBZ A01;
    public C47573E8l A02;
    public F3P A03;
    public boolean A04 = false;
    public C50515Fdb A05;
    public F3M A06;
    public final 1wn A07 = FXZ.A00(this, 43);
    public ViewGroup mRootView;

    public final void Cta(String str, String str2) {
        Iterator it = C319606qt.A01(this.A00).A06(this.A00).iterator();
        while (it.hasNext()) {
            C319646qx r9 = (C319646qx) it.next();
            if (r9.A07.equals(str)) {
                1OC A042 = FHA.A04(requireContext(), this.A00, r9.A05, r9.A06, str2);
                A042.A00 = new C47906EMa(this, this, this.A00, this, this, r9, C46634DiE.ONE_TAP, r9.A07, r9.A06);
                schedule(A042);
                return;
            }
        }
    }

    public final /* synthetic */ void DPh(F2Z f2z) {
        f2z.A00(false);
    }

    public final void DmU(C49708F2t f2t) {
    }

    public final /* synthetic */ void Dme() {
    }

    public final String getModuleName() {
        return "one_tap";
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.6qx] */
    public static ArrayList A00(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        ImageUrl imageUrl;
        String str;
        ArrayList A062 = C319606qt.A01(oneTapLoginLandingFragment.A00).A06(oneTapLoginLandingFragment.A00);
        FBZ fbz = oneTapLoginLandingFragment.A01;
        if (fbz != null && !fbz.A01(oneTapLoginLandingFragment.mArguments).isEmpty()) {
            Iterator it = oneTapLoginLandingFragment.A01.A01(oneTapLoginLandingFragment.mArguments).iterator();
            while (it.hasNext()) {
                C60937Jtv jtv = (C60937Jtv) it.next();
                Iterator it2 = A062.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((C319646qx) it2.next()).A06.equals(jtv.A04)) {
                            break;
                        }
                    } else {
                        String str2 = jtv.A03;
                        if (str2 != null && (imageUrl = jtv.A00) != null) {
                            QP8 qp8 = (QP8) jtv.A02;
                            if (qp8.A03 != null && (str = qp8.A01) != null) {
                                String str3 = qp8.A04;
                                ? obj = new Object();
                                obj.A01 = -1;
                                obj.A00 = -1;
                                obj.A04 = "APP_LEVEL_SPI_NO";
                                obj.A06 = str3;
                                obj.A07 = str2;
                                obj.A02 = imageUrl;
                                obj.A05 = str;
                                obj.A08 = true;
                                obj.A09 = true;
                                A062.add(obj);
                            }
                        }
                    }
                }
            }
        }
        if (A062.size() > 1) {
            return A062;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!A062.isEmpty()) {
            A1C.add(AnonymousClass7TE.A12(A062));
        }
        return A1C;
    }

    public static void A01(OneTapLoginLandingFragment oneTapLoginLandingFragment, List list) {
        oneTapLoginLandingFragment.mRootView.removeAllViews();
        if (list.size() == 1) {
            C319646qx r2 = (C319646qx) list.get(0);
            DbV.A0D(oneTapLoginLandingFragment.mRootView).inflate(R.layout.one_tap_login_landing_single_user, oneTapLoginLandingFragment.mRootView);
            IgImageView A0b = DbT.A0b(oneTapLoginLandingFragment.mRootView, R.id.avatar_image_view);
            ImageUrl imageUrl = r2.A02;
            if (imageUrl != null) {
                A0b.setUrl(imageUrl, oneTapLoginLandingFragment);
            } else {
                DbU.A13(oneTapLoginLandingFragment.getContext(), A0b, R.drawable.profile_anonymous_user);
            }
            ViewGroup A0C = DbU.A0C(oneTapLoginLandingFragment.mRootView, R.id.avatar_login_button_container);
            DbV.A0D(A0C).inflate(R.layout.ig_one_tap_log_in_button, A0C);
            FPG.A01(A0b, oneTapLoginLandingFragment, r2, 9);
            TextView A0G = DbU.A0G(oneTapLoginLandingFragment.mRootView, R.id.one_tap_log_in_button);
            FPG.A01(A0G, oneTapLoginLandingFragment, r2, 10);
            View requireViewById = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.remove_text_link);
            FPG.A01(requireViewById, oneTapLoginLandingFragment, r2, 11);
            FCK.A01((TextView) requireViewById);
            View requireViewById2 = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.login_landing_logo);
            DbS.A0D(requireViewById2).bottomMargin = DbV.A05(oneTapLoginLandingFragment).getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            requireViewById2.requestLayout();
            DbS.A0D(A0b).bottomMargin = 0;
            A0b.requestLayout();
            TextView A0G2 = DbU.A0G(oneTapLoginLandingFragment.mRootView, R.id.username);
            A0G2.setText(r2.A07);
            A0G2.setVisibility(0);
            FPG.A01(oneTapLoginLandingFragment.mRootView.requireViewById(R.id.avatar_login_button_container), oneTapLoginLandingFragment, r2, 12);
            View requireViewById3 = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.remove_text_container);
            DbS.A0D(requireViewById3).topMargin = DbV.A05(oneTapLoginLandingFragment).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            requireViewById3.requestLayout();
            A0G.setText(2131965537);
        } else {
            DbV.A0D(oneTapLoginLandingFragment.mRootView).inflate(R.layout.one_tap_login_landing_multiple_users, oneTapLoginLandingFragment.mRootView);
            C47573E8l e8l = new C47573E8l(oneTapLoginLandingFragment, oneTapLoginLandingFragment);
            oneTapLoginLandingFragment.A02 = e8l;
            e8l.A0C(list);
            ((AbsListView) oneTapLoginLandingFragment.mRootView.requireViewById(16908298)).setAdapter(oneTapLoginLandingFragment.A02);
        }
        ((NetzDgTermsTextView) oneTapLoginLandingFragment.mRootView.requireViewById(R.id.netz_dg_terms_text_view)).A00(oneTapLoginLandingFragment.A00);
        TextView A0G3 = DbU.A0G(oneTapLoginLandingFragment.mRootView, R.id.left_button);
        DbU.A1G(A0G3, oneTapLoginLandingFragment, 2131974846);
        2eS.A01(A0G3);
        FPD.A00(A0G3, 0, oneTapLoginLandingFragment);
        TextView A0G4 = DbU.A0G(oneTapLoginLandingFragment.mRootView, R.id.right_button);
        DbU.A1G(A0G4, oneTapLoginLandingFragment, 2131968712);
        2eS.A01(A0G4);
        FPD.A00(A0G4, 1, oneTapLoginLandingFragment);
        FCK.A01(A0G3, A0G4);
        Dba.A0p(oneTapLoginLandingFragment.getContext(), DbS.A0G(oneTapLoginLandingFragment.mRootView, R.id.login_landing_logo));
    }

    public final void A02(C319646qx r23) {
        1OC A032;
        1P0 eMa;
        String str;
        C49881FBf fBf = C49881FBf.A00;
        AnonymousClass0aP r15 = this.A00;
        C46634DiE diE = C46634DiE.ONE_TAP;
        C319646qx r12 = r23;
        String str2 = r12.A06;
        0qQ.A0B(r15, 0);
        fBf.A01(r15, (EXD) null, false, (Boolean) null, (Integer) null, "sso", str2);
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, this.A00), "one_tap_login_account_clicked");
        DbY.A1D(A0e, A012, A002);
        DbZ.A1J(A0e, "sso");
        DbS.A1K(A0e, "one_tap");
        DbW.A13(A0e, A012);
        DbW.A12(A0e, A002);
        A0e.A9F(AnonymousClass000.A00(3678), DbS.A0j(C319606qt.A01(this.A00).A06(this.A00).size()));
        FH8.A05(A0e);
        A0e.AAJ("instagram_id", r12.A06);
        FH8.A0C(A0e, this.A00);
        if (r12.A09) {
            Context requireContext = requireContext();
            AnonymousClass0aP r14 = this.A00;
            String str3 = r12.A06;
            FxcalAccountType fxcalAccountType = FxcalAccountType.INSTAGRAM;
            String str4 = r12.A05;
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str = bundle.getString("current_user_id");
            } else {
                str = null;
            }
            A032 = FHA.A0A(r14, FHA.A0G(fxcalAccountType, str4, str), (Boolean) null, str3, 0qv.A00(requireContext), DbT.A0s(requireContext), "account_switcher", (String) null);
            String str5 = r12.A07;
            AnonymousClass6ST A0Y = DbW.A0Y(this);
            DbU.A1L(this, A0Y, 2131965555);
            eMa = new EDL(this, A0Y, str5, 10);
        } else {
            A032 = FHA.A03(getContext(), this.A00, r12.A05, r12.A06, r12.A02());
            eMa = new C47906EMa(this, this, this.A00, this, this, r12, diE, r12.A07, r12.A06);
        }
        A032.A00 = eMa;
        schedule(A032);
    }

    public final void A03(C319646qx r6) {
        C358248ab A0V;
        String str;
        String string;
        C49900FCd.A02(this.A00, C46634DiE.ONE_TAP, r6.A06);
        if (r6.A09) {
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str = bundle.getString("current_username");
            } else {
                str = null;
            }
            A0V = Dba.A0H(this);
            if (!C296675qS.A03(str)) {
                string = DbV.A0z(this, str, 2131962863);
            } else {
                string = getString(2131962862);
            }
            A0V.A05 = string;
            DbU.A1J(this, A0V, 2131962880);
            A0V.A0c((DialogInterface.OnClickListener) null, getString(2131968772));
        } else {
            String str2 = r6.A06;
            A0V = DbW.A0V(this);
            A0V.A09(2131971975);
            DbU.A1J(this, A0V, 2131971976);
            A0V.A0I(new C50022FJh(str2, (Object) this, 12), 2131971974);
            A0V.A0C(new C50022FJh(str2, (Object) this, 11));
        }
        DbT.A1V(A0V);
    }

    public final void DOw() {
    }

    public final void DTb() {
    }

    public final void DjB() {
    }

    public final void DjC() {
    }

    public final void DjD() {
    }

    public final void Dmd(AnonymousClass0aP r2, C47361Dvv dvv) {
        this.A05.Dmd(r2, dvv);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, com.instagram.nux.fragment.OneTapLoginLandingFragment, androidx.fragment.app.Fragment, X.4DH] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-958745445);
        OneTapLoginLandingFragment.super.onCreate(bundle);
        AnonymousClass0aP A023 = 09i.A0A.A02(this.mArguments);
        this.A00 = A023;
        registerLifecycleListener(new EEE(getActivity(), this, A023, C46634DiE.ONE_TAP));
        F3M f3m = new F3M(this, this.A00);
        this.A06 = f3m;
        f3m.A00();
        this.A05 = new C50515Fdb(getActivity());
        Context requireContext = requireContext();
        F3P f3p = F3P.A04;
        if (f3p == null) {
            AnonymousClass2XD.A00(requireContext);
            f3p = new F3P();
            F3P.A04 = f3p;
        }
        this.A03 = f3p;
        f3p.A00(getContext(), this, this.A00, DbW.A0Q(getContext(), this), (C51961G9h) null);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0aP r2 = this.A00;
        0qQ.A0B(r2, 2);
        this.A01 = new FBZ(requireActivity, r2, false);
        AnonymousClass0fD.A09(-2130233287, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        int i;
        String A0m;
        String queryParameter;
        int A022 = AnonymousClass0fD.A02(821342675);
        this.mRootView = (ViewGroup) DbT.A0C(layoutInflater, viewGroup, R.layout.one_tap_login_landing_fragment);
        ArrayList A002 = A00(this);
        if (!A002.isEmpty()) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && (A0m = DbS.A0m(bundle2)) != null && (queryParameter = 0cp.A03(A0m).getQueryParameter(Dbj.A03())) != null) {
                Iterator it = A002.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C319646qx) it.next()).A07.equals(queryParameter)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                AnonymousClass0aP r1 = this.A00;
                AnonymousClass7TG.A1N(r1, "sso");
                C49938FFr.A01(r1, "sso");
                A01(this, A002);
                viewGroup2 = this.mRootView;
                i = -673345754;
                AnonymousClass0fD.A09(i, A022);
                return viewGroup2;
            }
        }
        C49958FGq.A04(this.mArguments, this.mFragmentManager);
        viewGroup2 = null;
        i = -367497839;
        AnonymousClass0fD.A09(i, A022);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1615538625);
        super.onDestroyView();
        1xC.A01.A03(this.A07, C50249FVg.class);
        AnonymousClass0fD.A09(329104545, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-961620385);
        this.A04 = true;
        OneTapLoginLandingFragment.super.onPause();
        AnonymousClass0fD.A09(805243369, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1426368350);
        this.A04 = false;
        super.onResume();
        AnonymousClass0fD.A09(1550725863, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        1xC.A01.A02(this.A07, C50249FVg.class);
    }
}
