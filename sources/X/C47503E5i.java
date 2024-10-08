package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

/* renamed from: X.E5i  reason: case insensitive filesystem */
public final class C47503E5i extends AnonymousClass4DH implements G8C, C13676Tel {
    public static final String __redex_internal_original_name = "EmailAcquisitionFragment";
    public IgFormField A00;
    public C51950G8t A01;
    public EEK A02;
    public TextView A03;
    public ProgressButton A04;
    public List A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final EXD B6Y() {
        return null;
    }

    public final boolean Ca3() {
        return true;
    }

    public final void DaH(boolean z) {
    }

    public final String getModuleName() {
        return "cp_acquisition_email";
    }

    public final C46634DiE BzS() {
        return C46634DiE.A11;
    }

    public final void DUM() {
        CharSequence charSequence;
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            charSequence = igFormField.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        if (valueOf.length() > 0 && 0mp.A0C(valueOf)) {
            EEK eek = this.A02;
            if (eek != null) {
                eek.A01();
            }
            UserSession A0l = AnonymousClass7TE.A0l(this.A06);
            List list = this.A05;
            C49024Eo0.A00(A0l, new Ff9(this, valueOf), valueOf, Dbb.A0a(this), 0qv.A02.A05(requireContext()), list);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.Tel, X.E5i, X.4DH] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1577732365);
        C47503E5i.super.onCreate(bundle);
        getParentFragmentManager().A0v(new C50129FQm(this, 6), this, "conf_code_response_request_code");
        registerLifecycleListener(new C8776R9c(requireContext(), AnonymousClass7TE.A0l(this.A06), this));
        AnonymousClass0fD.A09(968488642, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1111052623);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_email_acquisition_fragment, viewGroup, false);
        this.A01 = C49047EoR.A00(this);
        IgFormField A0d = DbT.A0d(inflate, R.id.add_email_form);
        this.A00 = A0d;
        if (A0d != null) {
            A0d.setLabelText(getString(2131961575));
            A0d.setInputType(33);
            A0d.setRuleChecker(new C50498Fck(requireContext()));
        }
        TextView A0G = DbU.A0G(inflate, R.id.skip_button);
        this.A03 = A0G;
        if (A0G != null) {
            A0G.setText(2131968513);
            FP0.A00(A0G, 49, this);
        }
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.disclaimer_text);
        0qQ.A0B(A0R, 0);
        String A0m = DbU.A0m(this, 2131961570);
        SpannableStringBuilder A0E = DbY.A0E(this, A0m, 2131961569);
        AnonymousClass7AV.A05(A0E, new C46685DjE(A0m, this, 5), A0m);
        DbT.A1H(A0R);
        A0R.setText(A0E);
        ProgressButton A0O = Dba.A0O(inflate);
        this.A04 = A0O;
        if (A0O != null) {
            EEK eek = new EEK((TextView) null, DbT.A0X(this.A06), this, A0O);
            this.A02 = eek;
            registerLifecycleListener(eek);
        }
        IgFormField igFormField = this.A00;
        if ((igFormField == null || igFormField.getText().length() == 0) && (str = (String) 00k.A0J(C49196Er1.A00(requireActivity()))) != null) {
            IgFormField igFormField2 = this.A00;
            if (igFormField2 != null) {
                igFormField2.setText(str);
            }
            C49212ErH.A00(DbT.A0X(this.A06), "cp_acquisition_email", "android_account_manager");
        }
        C49938FFr.A01(DbT.A0X(this.A06), "cp_acquisition_email");
        AnonymousClass0fD.A09(-2135644155, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1311833517);
        super.onDestroyView();
        unregisterLifecycleListener(this.A02);
        this.A00 = null;
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(200314603, A022);
    }

    public final void Ds3(List list) {
        this.A05 = list;
    }
}
