package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class E2M extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacAddEmailFragment";
    public IgFormField A00;
    public ProgressButton A01;
    public String A02;
    public boolean A03;
    public final C47699EDi A04 = new C47699EDi(this, 19);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975622);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(448852595);
        E2M.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("email", "");
        this.A03 = DbT.A1X(requireArguments, "KEY_SHOULD_SHOW_SKIP_BUTTON");
        AnonymousClass0fD.A09(-1131049785, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1618294384);
        0qQ.A0B(layoutInflater, 0);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.two_fac_add_email_fragment, viewGroup, false);
        IgFormField A0d = DbT.A0d(inflate, R.id.two_fac_add_email_form_field);
        this.A00 = A0d;
        if (A0d == null) {
            str = "emailFormField";
        } else {
            boolean z = true;
            A0d.setRuleChecker(new C50498Fck(requireContext(), true));
            String str2 = this.A02;
            str = "email";
            if (str2 != null) {
                if (str2.length() > 0) {
                    A0d.setText(str2);
                }
                A0d.A0G(new FKk(this, 12));
                ProgressButton A0O = Dba.A0O(inflate);
                String str3 = this.A02;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        z = false;
                    }
                    A0O.setEnabled(z);
                    AnonymousClass0fU.A00(new FPF(52, (Object) A0O, (Object) this), A0O);
                    this.A01 = A0O;
                    TextView A0G = DbU.A0G(inflate, R.id.two_fac_add_email_explanation);
                    0qQ.A0A(A0G);
                    AnonymousClass7AV.A07(new ESx(this, requireContext().getColor(2Yu.A0D(A0G.getContext()))), A0G, DbU.A0m(this, 2131975702), getString(2131975625));
                    View requireViewById = inflate.requireViewById(R.id.footer);
                    0qQ.A0A(requireViewById);
                    if (!this.A03) {
                        i = 8;
                    }
                    requireViewById.setVisibility(i);
                    FP3.A00(requireViewById, 25, this);
                    AnonymousClass0fD.A09(-88838753, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
