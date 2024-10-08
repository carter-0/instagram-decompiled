package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E6u  reason: case insensitive filesystem */
public final class C47533E6u extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "InsightsWelcomeFragment";

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131964353);
        0hq r0 = this.mFragmentManager;
        boolean z = false;
        if (r0 != null && r0.A0M() > 0) {
            z = true;
        }
        r4.Eu4(z);
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A06 = DbV.A06(requireContext(), R.color.igds_secondary_text);
        r4.ErJ(f3v.A00());
    }

    public final String getModuleName() {
        return "get_insights_welcome";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1998957105);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.get_insights_welcome_fragment, viewGroup, false);
        ImageView A0J = DbX.A0J(inflate, R.id.image);
        A0J.setVisibility(0);
        A0J.setImageResource(R.drawable.insights);
        DbX.A12(requireContext(), A0J, 2Yu.A0B(requireContext()));
        Dba.A06(inflate).setText(2131963057);
        Dba.A05(inflate).setText(2131956535);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.login_button);
        TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.explanation_message);
        String A0m = DbU.A0m(this, 2131962089);
        String A0z = DbV.A0z(this, A0m, 2131956534);
        0qQ.A07(A0z);
        SpannableStringBuilder A0C = DbS.A0C(A0z);
        AnonymousClass7AV.A05(A0C, new C48036ESb(requireContext(), getSession(), "https://www.facebook.com/policies/ads/#data_use_restrictions", requireContext().getColor(R.color.igds_link)), A0m);
        DbX.A1G(A0R2, A0C);
        A0R.setText(2131956703);
        FP5.A01(A0R, 8, this);
        AnonymousClass0fD.A09(-1787103082, A02);
        return inflate;
    }
}
