package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;

public final class R8K extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SaveAutofillLearnMoreFragment";
    public AnonymousClass0wW A00;
    public boolean A01;
    public boolean A02;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        int i = 2131953394;
        if (this.A02) {
            i = 2131951985;
        }
        DbW.A1B(r3, i);
    }

    public final String getModuleName() {
        return "save_autofill_learn_more";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A02) {
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.what_is_autofill_description);
            int i = 2131976952;
            if (this.A01) {
                i = 2131976951;
            }
            String string = getString(i);
            0qQ.A0A(string);
            A0R.setText(002.A0T(getString(2131976848), string, ' '));
            StringBuilder A1A = AnonymousClass7TE.A1A();
            String A0m = DbU.A0m(this, 2131961000);
            A1A.append(A0m);
            A1A.append(getString(2131975214));
            A1A.append("\n");
            A1A.append(A0m);
            Pxg.A1P(getString(2131975213), "\n", A0m, A1A);
            Pxg.A1P(getString(2131975212), "\n", A0m, A1A);
            A1A.append(getString(2131963528));
            AnonymousClass7TG.A0R(view, R.id.autofill_activity_list).setText(A1A);
            ESx eSx = new ESx(this, Dbb.A04(this), 0);
            TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.control_autofill_preferences);
            String A0m2 = DbU.A0m(this, 2131952516);
            String string2 = getString(2131956712, new Object[]{A0m2});
            0qQ.A07(string2);
            AnonymousClass7AV.A07(eSx, A0R2, A0m2, string2);
            TextView A0R3 = AnonymousClass7TG.A0R(view, R.id.who_can_see_autofill_info_title);
            TextView A0R4 = AnonymousClass7TG.A0R(view, R.id.who_can_see_autofill_info_description);
            int i2 = 2131976885;
            int i3 = 2131976884;
            if (this.A01) {
                i2 = 2131976883;
                i3 = 2131976882;
            }
            DbU.A1G(A0R3, this, i2);
            DbU.A1G(A0R4, this, i3);
            TextView A0R5 = AnonymousClass7TG.A0R(view, R.id.how_is_my_contact_info_stored_description);
            AnonymousClass0wW r0 = this.A00;
            0Tu r8 = 0Tu.A05;
            boolean A1Y = DbY.A1Y(r8, r0, 36310430911365197L);
            int i4 = 2131963495;
            if (A1Y) {
                i4 = 2131963496;
            }
            String string3 = getString(i4);
            0qQ.A0A(string3);
            A0R5.setText(string3);
            if (this.A01) {
                ViewStub A0X = JTR.A0X(view, R.id.saved_payment_info_relevant_ads_title);
                ViewStub A0X2 = JTR.A0X(view, R.id.saved_payment_info_relevant_ads_description);
                boolean A1Y2 = DbY.A1Y(r8, this.A00, 36310430911365197L);
                int i5 = R.id.payment_info_section;
                if (A1Y2) {
                    i5 = R.id.payment_info_section_metapay;
                }
                ViewStub viewStub = (ViewStub) view.requireViewById(i5);
                0qQ.A0A(viewStub);
                A0X.inflate();
                A0X2.inflate();
                viewStub.inflate();
                ESx eSx2 = new ESx(this, Dbb.A04(this), 1);
                TextView A0R6 = AnonymousClass7TG.A0R(view, R.id.payment_method_description);
                String A0m3 = DbU.A0m(this, 2131964884);
                int i6 = 2131963498;
                if (DbY.A1Y(r8, this.A00, 36310430911365197L)) {
                    i6 = 2131963499;
                }
                String string4 = getString(i6);
                0qQ.A0A(string4);
                StringBuilder A0n = AnonymousClass7TF.A0n(string4);
                A0n.append(' ');
                A0n.append(A0m3);
                AnonymousClass7AV.A07(eSx2, A0R6, A0m3, C51967G9n.A0r(A0n, ' '));
            }
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1370929042);
        R8K.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = 09i.A0A.A04(requireArguments);
        this.A01 = requireArguments.getBoolean("is_payment_enabled", false);
        this.A02 = requireArguments.getBoolean("is_reconsent_enabled", false);
        AnonymousClass0fD.A09(-1014506691, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(658627141);
        0qQ.A0B(layoutInflater, 0);
        boolean z = this.A02;
        int i = R.layout.fragment_save_autofill_learn_more;
        if (z) {
            i = R.layout.fragment_about_autofill;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass0fD.A09(-1243178124, A022);
        return inflate;
    }
}
