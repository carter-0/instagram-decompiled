package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E4A extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "XarDisclosureFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new C20699WxV(this, 8));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131976923);
        r3.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
        r3.Etr(true);
    }

    public final String getModuleName() {
        return "xar_disclosure_screen";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.disclosure_text_view_1);
        DbT.A1H(A0R);
        Context requireContext = requireContext();
        ER2 er2 = new ER2(this);
        String A0d = AnonymousClass7TF.A0d(requireContext.getResources(), 2131964884);
        SpannableStringBuilder A0B = Dbb.A0B(requireContext.getResources(), A0d, 2131976920);
        AnonymousClass7AV.A05(A0B, er2, A0d);
        A0R.setText(A0B);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.disclosure_text_view_2);
        DbT.A1H(A0R2);
        Context requireContext2 = requireContext();
        ER3 er3 = new ER3(this);
        String A0d2 = AnonymousClass7TF.A0d(requireContext2.getResources(), 2131976922);
        SpannableStringBuilder A0B2 = Dbb.A0B(requireContext2.getResources(), A0d2, 2131976921);
        AnonymousClass7AV.A05(A0B2, er3, A0d2);
        A0R2.setText(A0B2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        AnonymousClass37D A0i = DbX.A0i(this);
        if ((A0i != null && ((AnonymousClass37F) A0i).A0g) || getParentFragmentManager().A0M() <= 0) {
            return false;
        }
        DbT.A1I(this);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1906600042);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_xar_disclosure, false);
        AnonymousClass0fD.A09(-2130950466, A02);
        return A0D;
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-259739334);
        super.onResume();
        Dbc.A0Q(this);
        AnonymousClass0fD.A09(-165188275, A02);
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(1084157578);
        E4A.super.onStart();
        DbZ.A1R((0wc) this.A00.getValue(), AnonymousClass000.A00(3313));
        AnonymousClass0fD.A09(-1110605107, A02);
    }
}
