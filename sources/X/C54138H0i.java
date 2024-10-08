package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.List;

/* renamed from: X.H0i  reason: case insensitive filesystem */
public final class C54138H0i extends AnonymousClass4DH implements AnonymousClass4DS, JO8 {
    public static final String __redex_internal_original_name = "ReelDebugFragment";
    public String A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, C273654mx.A00(1422));
    }

    public final String getModuleName() {
        return "media_debug";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        Double d11;
        Double d12;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Reel A0M = ReelStore.A03(AnonymousClass7TE.A0l(this.A01)).A0M(requireArguments().getString("reel_id", ""));
        if (A0M != null) {
            AnonymousClass3HV r0 = A0M.A0M;
            Double d13 = null;
            if (r0 != null) {
                d = r0.A04;
            } else {
                d = null;
            }
            C55629Hko hko = new C55629Hko("emeimps", String.valueOf(d));
            AnonymousClass3HV r02 = A0M.A0M;
            if (r02 != null) {
                d2 = r02.A05;
            } else {
                d2 = null;
            }
            C55629Hko hko2 = new C55629Hko("ereply", String.valueOf(d2));
            AnonymousClass3HV r03 = A0M.A0M;
            if (r03 != null) {
                d3 = r03.A06;
            } else {
                d3 = null;
            }
            C55629Hko hko3 = new C55629Hko("fp", String.valueOf(d3));
            AnonymousClass3HV r04 = A0M.A0M;
            if (r04 != null) {
                d4 = r04.A0K;
            } else {
                d4 = null;
            }
            C55629Hko hko4 = new C55629Hko("pcontact", String.valueOf(d4));
            AnonymousClass3HV r05 = A0M.A0M;
            if (r05 != null) {
                d5 = r05.A0L;
            } else {
                d5 = null;
            }
            C55629Hko hko5 = new C55629Hko("pevpvd", String.valueOf(d5));
            AnonymousClass3HV r06 = A0M.A0M;
            if (r06 != null) {
                d6 = r06.A0M;
            } else {
                d6 = null;
            }
            C55629Hko hko6 = new C55629Hko("plike", String.valueOf(d6));
            AnonymousClass3HV r07 = A0M.A0M;
            if (r07 != null) {
                d7 = r07.A0N;
            } else {
                d7 = null;
            }
            C55629Hko hko7 = new C55629Hko("pnext", String.valueOf(d7));
            AnonymousClass3HV r08 = A0M.A0M;
            if (r08 != null) {
                d8 = r08.A0O;
            } else {
                d8 = null;
            }
            C55629Hko hko8 = new C55629Hko("preciprocal", String.valueOf(d8));
            AnonymousClass3HV r09 = A0M.A0M;
            if (r09 != null) {
                d9 = r09.A0Q;
            } else {
                d9 = null;
            }
            C55629Hko hko9 = new C55629Hko("preshare", String.valueOf(d9));
            AnonymousClass3HV r010 = A0M.A0M;
            if (r010 != null) {
                d10 = r010.A0S;
            } else {
                d10 = null;
            }
            C55629Hko hko10 = new C55629Hko("pskip", String.valueOf(d10));
            AnonymousClass3HV r011 = A0M.A0M;
            if (r011 != null) {
                d11 = r011.A0T;
            } else {
                d11 = null;
            }
            C55629Hko hko11 = new C55629Hko("ptap", String.valueOf(d11));
            AnonymousClass3HV r012 = A0M.A0M;
            if (r012 != null) {
                d12 = r012.A0V;
            } else {
                d12 = null;
            }
            C55629Hko hko12 = new C55629Hko("vm", String.valueOf(d12));
            AnonymousClass3HV r013 = A0M.A0M;
            if (r013 != null) {
                d13 = r013.A0W;
            }
            C55629Hko hko13 = hko3;
            C55629Hko hko14 = hko4;
            C55629Hko hko15 = hko5;
            C55629Hko hko16 = hko2;
            List<C55629Hko> A1P = 0sr.A1P(new C55629Hko[]{hko, hko16, hko13, hko14, hko15, hko6, hko7, hko8, hko9, hko10, hko11, hko12, new C55629Hko("vm_interaction", String.valueOf(d13))});
            StringBuilder A1A = AnonymousClass7TE.A1A();
            for (C55629Hko hko17 : A1P) {
                A1A.append(hko17.A00);
                A1A.append(": ");
                A1A.append(hko17.A01);
                A1A.append(10);
                A1A.append(10);
            }
            this.A00 = A1A.toString();
            AbsListView absListView = (AbsListView) view2.findViewById(R.id.debug_ad_view);
            C54221H3q h3q = new C54221H3q(this, A1P);
            if (absListView != null) {
                absListView.setAdapter(h3q);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void DjJ() {
        0nC.A00(requireContext(), this.A00);
        C59689JTv.A09(getContext(), getString(2131956743));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2127163578);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_sponsored_debug, false);
        AnonymousClass0fD.A09(841938383, A02);
        return A0D;
    }
}
