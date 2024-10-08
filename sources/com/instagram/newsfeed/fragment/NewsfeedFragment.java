package com.instagram.newsfeed.fragment;

import X.002;
import X.0Aj;
import X.0Tu;
import X.0hq;
import X.0nA;
import X.0qQ;
import X.0s1;
import X.0sn;
import X.0xY;
import X.0xa;
import X.182;
import X.1Xc;
import X.2Yu;
import X.2Zg;
import X.2bA;
import X.2bC;
import X.2bu;
import X.2dP;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass0kN;
import X.AnonymousClass0oH;
import X.AnonymousClass0wW;
import X.AnonymousClass2S0;
import X.AnonymousClass3JR;
import X.AnonymousClass3Jb;
import X.AnonymousClass4DH;
import X.AnonymousClass7AK;
import X.AnonymousClass7AV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.C227252iu;
import X.C227272iw;
import X.C227642jf;
import X.C239473Gp;
import X.C273644mv;
import X.C331137Ps;
import X.C331147Pt;
import X.C331157Pu;
import X.C46352Dcv;
import X.C46353Dcx;
import X.C46354Dcy;
import X.C46356DdJ;
import X.C46449DfC;
import X.C46512DgF;
import X.C46516DgJ;
import X.C46726DkF;
import X.C49014Enq;
import X.C49646F0d;
import X.C51377Ft9;
import X.C51792G2b;
import X.C51909G7d;
import X.C70992Zi;
import X.C71162bE;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbZ;
import X.ERZ;
import X.FNM;
import X.FP0;
import X.FPF;
import X.GO6;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.model.PillsFilterCategory;
import java.util.List;

public final class NewsfeedFragment extends AnonymousClass4DH implements 2bC, C227252iu, C227272iw, C51909G7d, C273644mv, C70992Zi {
    public static boolean A0D = true;
    public int A00;
    public View A01;
    public ViewGroup A02;
    public C331157Pu A03;
    public ERZ A04;
    public C46352Dcv A05;
    public boolean A06 = true;
    public 2Zg A07;
    public final AnonymousClass0eM A08 = C51792G2b.A00(this, 43);
    public final AnonymousClass0eM A09 = C51792G2b.A00(this, 44);
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final String A0B = "newsfeed_you";
    public final boolean A0C = true;

    public static final C331147Pt A00(NewsfeedFragment newsfeedFragment, C46356DdJ ddJ, boolean z) {
        C331137Ps r2 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
        r2.A06 = newsfeedFragment.getText(2131968324);
        r2.A05 = new FPF(65, (Object) ddJ, (Object) newsfeedFragment);
        r2.A0A = z;
        return r2.A00();
    }

    public final GO6 Av1() {
        return null;
    }

    public final /* synthetic */ void CJK(MotionEvent motionEvent, Long l, boolean z) {
    }

    public final boolean Ccw(MotionEvent motionEvent) {
        return true;
    }

    public final void DGX() {
    }

    public final void DGc() {
    }

    public final /* synthetic */ void DU7() {
    }

    public final void DpP() {
    }

    public final void FHS(MotionEvent motionEvent) {
    }

    public final void configureActionBar(2da r9) {
        Context context;
        C46352Dcv dcv;
        C46356DdJ A012;
        C46352Dcv dcv2;
        List A013;
        String str;
        0qQ.A0B(r9, 0);
        r9.Etr(true);
        r9.Eom(2131968673);
        AnonymousClass0eM r5 = this.A0A;
        if (2bA.A02(AnonymousClass7TF.A0L(r5, 0))) {
            r9.Eu4(true);
        }
        if (!182.A06(0Tu.A05, AnonymousClass7TF.A0L(r5, 0), 36321980076533628L) && (context = getContext()) != null && (dcv = this.A05) != null && (A012 = C46353Dcx.A01(dcv)) != null && !A012.A01.isEmpty() && (dcv2 = this.A05) != null) {
            0qQ.A0C(dcv2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            if (dcv2.isAdded()) {
                C46352Dcv dcv3 = this.A05;
                0qQ.A0C(dcv3, "null cannot be cast to non-null type com.instagram.newsfeed.fragment.NewsfeedViewSwitcherChildFragment");
                if (DbV.A0Z(dcv3).A02) {
                    A013 = A012.A03();
                } else {
                    A013 = A012.A01();
                }
                int size = A013.size();
                if (size > 0) {
                    str = 002.A0I(" (", ')', size);
                } else {
                    str = "";
                }
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A05 = 2131962420;
                A0K.A04 = R.id.action_bar_button_action;
                A0K.A0G = new FPF(64, (Object) A012, (Object) this);
                A0K.A0K = DbW.A0h(context, str, 2131968322);
                this.A01 = r9.AA3(new AnonymousClass3Jb(A0K));
                if (this.A06) {
                    this.A06 = false;
                    C46516DgJ A002 = C46512DgF.A00(AnonymousClass7TE.A0l(r5));
                    0sn A014 = A012.A01();
                    List A022 = A012.A02();
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A002.A00, A002.A01), "instagram_af_filter_events_v2");
                    A0e.AAJ(TraceFieldType.AdhocEventName, "entrypoint_impression");
                    if (A014 == null) {
                        A014 = 0sn.A00;
                    }
                    A0e.AAe("current_filters", A014);
                    List list = 0sn.A00;
                    A0e.AAe("clicked_filters", list);
                    if (A022 == null) {
                        A022 = list;
                    }
                    A0e.AAe("filters", A022);
                    A0e.Cgf();
                }
            }
        }
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        NewsfeedFragment.super.onAttach(context);
        getChildFragmentManager().A09 = new C46726DkF(this);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String A0O;
        C46352Dcv dcv;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0hq childFragmentManager = getChildFragmentManager();
        int i = this.A00;
        if (Integer.valueOf(i).equals(0)) {
            A0O = "newsfeed_you";
        } else {
            A0O = 002.A0O(AnonymousClass000.A00(3627), i);
        }
        C46352Dcv A0R = childFragmentManager.A0R(A0O);
        if (A0R instanceof C46352Dcv) {
            dcv = A0R;
        } else {
            dcv = null;
        }
        this.A05 = dcv;
        if (dcv == null) {
            C46352Dcv A002 = C49014Enq.A00(AnonymousClass7TE.A0l(this.A0A), (PillsFilterCategory) null, (String) null);
            0s1 A0C2 = DbW.A0C(this);
            A0C2.A0D(A002, "newsfeed_you", R.id.newsfeed_you);
            A0C2.A00();
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.newsfeed.fragment.NewsfeedViewSwitcherChildFragment");
            this.A05 = A002;
        }
        ((2bu) this.A08.getValue()).Dh3();
        if (A02()) {
            ViewGroup viewGroup = (ViewGroup) view;
            View inflate = getLayoutInflater().inflate(R.layout.notification_upsell, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            Context context = viewGroup2.getContext();
            TextView A0B2 = DbW.A0B(viewGroup2, R.id.upsell_body);
            String string = context.getString(2131975598);
            String str = "";
            if (string == null) {
                string = str;
            }
            String string2 = context.getString(2131975597);
            if (string2 != null) {
                str = string2;
            }
            SpannableStringBuilder A0B3 = DbZ.A0B(string, str);
            0qQ.A07(A0B3);
            AnonymousClass7AV.A03(A0B3, new AnonymousClass7AK(DbV.A0n(context, 2Yu.A0D(context))), str);
            A0B2.setText(A0B3);
            FP0.A00(viewGroup2, 2, this);
            View A0b = AnonymousClass7TE.A0b(viewGroup2, R.id.upsell_close);
            float A082 = (float) 0nA.A08(requireContext());
            AnonymousClass0fU.A00(new FNM(viewGroup2, this, A082), A0b);
            viewGroup.addView(viewGroup2);
            this.A02 = viewGroup2;
            if (A0D) {
                A0D = false;
                view.postDelayed(new C51377Ft9(viewGroup2, A082), 500);
            } else {
                viewGroup2.setVisibility(0);
            }
            C49646F0d f0d = (C49646F0d) this.A09.getValue();
            0xY AR4 = f0d.A02.AR4();
            AR4.E5c(AnonymousClass7TF.A0b(), AnonymousClass7TE.A0R(f0d.A06.invoke()));
            AR4.apply();
        }
    }

    public static final void A01(NewsfeedFragment newsfeedFragment) {
        try {
            if (Build.VERSION.SDK_INT >= 29 && AnonymousClass2S0.A01.A00 != null) {
                if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(newsfeedFragment.A0A), 36322778940516766L)) {
                    AnonymousClass2S0.A01.A06();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ double BaQ() {
        return 0.0d;
    }

    public final /* synthetic */ boolean BuP() {
        return false;
    }

    public final boolean COC() {
        return false;
    }

    public final void EKl() {
    }

    public final /* synthetic */ boolean Erl() {
        return false;
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean isContainerFragment() {
        return this.A0C;
    }

    private final boolean A02() {
        if (!AnonymousClass0oH.A01(requireContext())) {
            C49646F0d f0d = (C49646F0d) this.A09.getValue();
            long A0R = AnonymousClass7TE.A0R(f0d.A06.invoke());
            0xa r3 = f0d.A03;
            String AK4 = f0d.A01.AK4();
            String str = f0d.A04;
            if (str.length() != 0) {
                AK4 = 002.A0g(str, "::", AK4);
            }
            if (A0R > DbW.A06(r3, AK4) && ((long) f0d.A00) > AnonymousClass7TE.A0R(f0d.A05.getValue())) {
                if (!182.A06(0Tu.A05, DbT.A0X(this.A0A), 36325128287564411L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void DV0(C71162bE r3) {
        int A032 = AnonymousClass0fD.A03(1418492578);
        C46352Dcv dcv = this.A05;
        if (dcv != null) {
            dcv.A06();
        }
        AnonymousClass0fD.A0A(-287252225, A032);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(580703857);
        NewsfeedFragment.super.onCreate(bundle);
        C46354Dcy.A01(AnonymousClass7TE.A0l(this.A0A)).A01.clear();
        AnonymousClass0fD.A09(-1658165339, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1914878993);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed, viewGroup, false);
        AnonymousClass0fD.A09(757907429, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1937880476);
        C46353Dcx.A00(AnonymousClass7TE.A0l(this.A0A)).A04 = true;
        super.onDestroy();
        AnonymousClass0fD.A09(130449583, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(537972727);
        ERZ erz = this.A04;
        if (erz != null) {
            erz.A00 = null;
        }
        this.A05 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1107701618, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(820400121);
        NewsfeedFragment.super.onPause();
        2Zg r0 = this.A07;
        if (r0 != null) {
            r0.C3W().A01(this);
        }
        AnonymousClass0fD.A09(-1471763425, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(851026723);
        super.onResume();
        AnonymousClass0eM r2 = this.A0A;
        if (C46354Dcy.A02(AnonymousClass7TE.A0l(r2)).A00) {
            C46352Dcv dcv = this.A05;
            if (dcv != null) {
                dcv.A07(false);
                C46354Dcy.A02(AnonymousClass7TE.A0l(r2)).A00 = false;
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-1552138731, A022);
                throw A0y;
            }
        }
        2Zg r0 = this.A07;
        if (r0 != null) {
            r0.C3W().A00(this);
        }
        1Xc A012 = 1Xc.A01();
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        C239473Gp A002 = 1Xc.A00(A0l, A012, "newstab");
        if (A002 != null) {
            A012.A00.ATE(new C46449DfC(A0l, A002, A012));
        }
        boolean A023 = A02();
        ViewGroup viewGroup = this.A02;
        if (!A023) {
            AnonymousClass7TH.A0R(viewGroup);
        } else if (viewGroup != null) {
            2dP layoutParams = viewGroup.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            2dP r1 = layoutParams;
            r1.A02 = 80;
            viewGroup.setLayoutParams(r1);
            viewGroup.bringToFront();
        }
        AnonymousClass0fD.A09(31141505, A022);
    }

    public final /* synthetic */ boolean Ccu(boolean z) {
        return false;
    }

    public final void Ene(2Zg r1) {
        this.A07 = r1;
    }
}
