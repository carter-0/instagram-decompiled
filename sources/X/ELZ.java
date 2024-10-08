package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

public final class ELZ extends E55 {
    public static final String __redex_internal_original_name = "StepperPolicyReviewFragment";
    public F3L A00;
    public EEA A01;

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(434443901);
        super.onCreate(bundle);
        this.A00 = C49917FEr.A00().A00.A05;
        AnonymousClass0fD.A09(2025206310, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-737885762);
        View inflate = layoutInflater.inflate(R.layout.gdpr_stepper_policy_review_layout, viewGroup, false);
        getContext();
        View requireViewById = inflate.requireViewById(R.id.policy_review);
        0qQ.A0B(requireViewById, 1);
        requireViewById.setTag(new C49548Exj(DbX.A0I(requireViewById, R.id.paragraphs_container), AnonymousClass7TG.A0R(requireViewById, R.id.content_title), AnonymousClass7TG.A0R(requireViewById, R.id.terms_of_use_link)));
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.agree_button);
        TextView A0G = DbU.A0G(inflate, R.id.see_other_options_text);
        F3L f3l = this.A00;
        if (f3l != null) {
            Context requireContext = requireContext();
            AnonymousClass0wW r14 = this.A00;
            C49548Exj exj = (C49548Exj) DbT.A0o(requireViewById);
            0qQ.A0B(exj, 2);
            TextView textView = exj.A01;
            FFM.A03(textView, requireContext);
            textView.setText(f3l.A01);
            ViewGroup viewGroup2 = exj.A00;
            List list = f3l.A03;
            0qQ.A07(list);
            C48936Ema.A00(requireContext, viewGroup2, list);
            AnonymousClass0fU.A00(new FO6(8, requireContext, this, r14, this), exj.A02);
            if (C49917FEr.A00().A03 == AnonymousClass05K.A01) {
                View requireViewById2 = requireViewById.requireViewById(R.id.terms_of_use_link);
                TextView A0G2 = DbU.A0G(requireViewById, R.id.terms_of_use_link_row);
                requireViewById2.setVisibility(8);
                A0G2.setVisibility(0);
                Context requireContext2 = requireContext();
                C48053ESw eSw = new C48053ESw(DbV.A0n(requireContext2, R.color.badge_color), (Object) requireContext2, (Object) this, 13);
                C48053ESw eSw2 = new C48053ESw(DbV.A0n(requireContext2, R.color.badge_color), (Object) requireContext2, (Object) this, 14);
                String string = getString(2131962817);
                String string2 = getString(2131957399);
                SpannableStringBuilder A0C = Dbb.A0C(this, string, string2, 2131975073);
                AnonymousClass7AV.A05(A0C, eSw, string);
                AnonymousClass7AV.A05(A0C, eSw2, string2);
                DbX.A1G(A0G2, A0C);
            }
            EEA eea = new EEA(this, progressButton, C49917FEr.A00().A08);
            this.A01 = eea;
            registerLifecycleListener(eea);
            DbT.A1H(A0G);
            Context requireContext3 = requireContext();
            C48050ESt eSt = new C48050ESt(requireContext3, A0G, this, DbV.A0n(requireContext3, R.color.blue_8));
            String A16 = AnonymousClass7TE.A16(requireContext3, 2131969104);
            SpannableStringBuilder A0C2 = DbS.A0C(DbY.A0c(requireContext3, A16, 2131973008));
            AnonymousClass7AV.A05(A0C2, eSt, A16);
            A0G.setText(A0C2);
        }
        C49943FFw A002 = C49943FFw.A00();
        AnonymousClass0wW r2 = this.A00;
        Integer num = AnonymousClass05K.A01;
        0qQ.A0B(r2, 0);
        0qQ.A0B(num, 1);
        C49943FFw.A01(this, r2, A002, num, (Integer) null);
        AnonymousClass0fD.A09(277949432, A02);
        return inflate;
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(-330656224);
        super.onDestroy();
        unregisterLifecycleListener(this.A01);
        AnonymousClass0fD.A09(1448240605, A02);
    }
}
