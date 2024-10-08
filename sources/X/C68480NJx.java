package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NJx  reason: case insensitive filesystem */
public final class C68480NJx extends AnonymousClass4DH implements C268594df {
    public static final String __redex_internal_original_name = "DirectPersistentMenuFragment";
    public AnonymousClass9IV A00;
    public OKK A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "direct_persistent_menu_details";

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List<AnonymousClass9JG> list;
        List<C274694ou> list2;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        DbU.A1G(AnonymousClass7TG.A0R(view2, R.id.persistent_menu_header), this, 2131966737);
        if (this.A02 != null) {
            DbX.A1F(AnonymousClass7TG.A0R(view2, R.id.instant_reply_hint), this, this.A02, 2131959587);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        0qQ.A07(layoutInflater);
        C70697OGs oGs = new C70697OGs(layoutInflater, view2, this.A00);
        oGs.A00 = new O72(this);
        AnonymousClass0eM r8 = oGs.A04;
        View A0c = AnonymousClass7TE.A0c(r8);
        AnonymousClass0eM r6 = oGs.A05;
        0nA.A0k(A0c, AnonymousClass7TE.A0c(r6).getPaddingLeft(), 10, AnonymousClass7TE.A0c(r6).getPaddingRight(), 18);
        C66583MXo.A0C(r6).addView(AnonymousClass7TE.A0c(r8));
        View A0c2 = AnonymousClass7TE.A0c(r6);
        Context context = oGs.A02.getContext();
        DbU.A11(context, A0c2, 2Yu.A0H(context, R.attr.bottomSheetBackground));
        ViewGroup A0C = C66583MXo.A0C(r8);
        0qQ.A0C(A0C, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) A0C).setOrientation(1);
        AnonymousClass9IV r0 = oGs.A03;
        if (!(r0 == null || (list2 = (List) r0.A00) == null)) {
            for (C274694ou r10 : list2) {
                ViewGroup A0C2 = C66583MXo.A0C(r8);
                View inflate = oGs.A01.inflate(R.layout.direct_instant_reply_pill, C66583MXo.A0C(r8), false);
                0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                C71405Ok4.A01(inflate, 49, r10, oGs);
                AnonymousClass7TE.A0d(inflate, R.id.instant_reply_text_view).setText(r10.A05);
                A0C2.addView(inflate);
            }
        }
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        LayoutInflater layoutInflater2 = getLayoutInflater();
        0qQ.A07(layoutInflater2);
        C70717OHm oHm = new C70717OHm(requireActivity, layoutInflater2, view2, this.A00, A0l);
        oHm.A00 = new O73(this);
        AnonymousClass0eM r82 = oHm.A06;
        View A0c3 = AnonymousClass7TE.A0c(r82);
        AnonymousClass0eM r3 = oHm.A07;
        A0c3.setPadding(AnonymousClass7TE.A0c(r3).getPaddingLeft(), 0, AnonymousClass7TE.A0c(r3).getPaddingRight(), 0);
        C66583MXo.A0C(r3).addView(AnonymousClass7TE.A0c(r82));
        ViewGroup A0C3 = C66583MXo.A0C(r82);
        0qQ.A0C(A0C3, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) A0C3).setOrientation(1);
        AnonymousClass9IV r02 = oHm.A04;
        if (!(r02 == null || (list = (List) r02.A01) == null)) {
            for (AnonymousClass9JG r7 : list) {
                ViewGroup A0C4 = C66583MXo.A0C(r82);
                View inflate2 = oHm.A02.inflate(R.layout.direct_persistent_menu_url_button, C66583MXo.A0C(r82), false);
                0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                TextView A0d = AnonymousClass7TE.A0d(inflate2, R.id.url_title_text_view);
                TextView A0d2 = AnonymousClass7TE.A0d(inflate2, R.id.url_text_view);
                A0d.setText(r7.A00);
                if (A0d2 != null) {
                    A0d2.setText(r7.A02);
                }
                C71405Ok4.A01(inflate2, 50, r7, oHm);
                A0C4.addView(inflate2);
            }
        }
        Dbb.A0t(view2, R.id.persistent_menu_items_scroll_view, 0);
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1811468842);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_thread_persistent_menu, viewGroup, false);
        AnonymousClass0fD.A09(1093476802, A022);
        return inflate;
    }
}
