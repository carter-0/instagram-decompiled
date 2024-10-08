package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

/* renamed from: X.E5g  reason: case insensitive filesystem */
public final class C47501E5g extends AnonymousClass4DH implements G8C {
    public static final String __redex_internal_original_name = "PhoneAcquisitionFragment";
    public IgFormField A00;
    public C51950G8t A01;
    public EEK A02;
    public TextView A03;
    public ProgressButton A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C41562AwU(this, 15));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final EXD B6Y() {
        return null;
    }

    public final void DaH(boolean z) {
    }

    public final String getModuleName() {
        return "cp_acquisition_phone";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = C49047EoR.A00(this);
        TextView A0G = DbU.A0G(view, R.id.skip_button);
        A0G.setText(2131968513);
        FPD.A00(A0G, 7, this);
        this.A03 = A0G;
        DbU.A0G(view, R.id.disclaimer_text_line_01).setText(2131969378);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.disclaimer_text_line_02);
        String A0m = DbU.A0m(this, 2131969380);
        SpannableStringBuilder A0E = DbY.A0E(this, A0m, 2131969379);
        AnonymousClass7AV.A05(A0E, new C46685DjE(A0m, this, 7), A0m);
        DbT.A1H(A0R);
        A0R.setText(A0E);
    }

    public final C46634DiE BzS() {
        return C46634DiE.A12;
    }

    public final boolean Ca3() {
        CharSequence charSequence;
        CharSequence charSequence2;
        try {
            AnonymousClass0eM r4 = this.A05;
            PhoneNumberUtil phoneNumberUtil = (PhoneNumberUtil) AnonymousClass7TE.A14(r4);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            IgFormField igFormField = this.A00;
            if (igFormField != null) {
                charSequence = igFormField.getComboFieldText();
            } else {
                charSequence = null;
            }
            A1A.append(charSequence);
            IgFormField igFormField2 = this.A00;
            if (igFormField2 != null) {
                charSequence2 = igFormField2.getText();
            } else {
                charSequence2 = null;
            }
            return ((PhoneNumberUtil) AnonymousClass7TE.A14(r4)).A0N(phoneNumberUtil.A0F(AnonymousClass7TF.A0i(charSequence2, A1A), (String) null));
        } catch (C231962sh unused) {
            return false;
        }
    }

    public final void DUM() {
        CharSequence charSequence;
        C49881FBf fBf = C49881FBf.A00;
        AnonymousClass0eM r3 = this.A06;
        CharSequence charSequence2 = null;
        fBf.A00(DbT.A0X(r3), (C49922FEx) null, "cp_acquisition_phone");
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            charSequence = igFormField.getComboFieldText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        IgFormField igFormField2 = this.A00;
        if (igFormField2 != null) {
            charSequence2 = igFormField2.getText();
        }
        String valueOf2 = String.valueOf(charSequence2);
        if (valueOf.length() > 0 && valueOf2.length() > 0) {
            EEK eek = this.A02;
            if (eek != null) {
                eek.A01();
            }
            C49024Eo0.A00(AnonymousClass7TE.A0l(r3), new C50595FfA(this, valueOf2), 002.A0R(valueOf, valueOf2), Dbb.A0a(this), 0qv.A02.A05(requireContext()), (List) null);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EditText editText;
        int A022 = AnonymousClass0fD.A02(1917958967);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_phone_acquisition_fragment, viewGroup, false);
        IgFormField A0d = DbT.A0d(inflate, R.id.add_phone_form);
        A0d.setLabelText(getString(2131969396));
        A0d.setInComboMode(new FPD((Object) this, 6));
        A0d.setInputType(3);
        A0d.setComboFieldText(C3270479e.A00(requireActivity()).A02());
        this.A00 = A0d;
        ProgressButton A0O = Dba.A0O(inflate);
        this.A04 = A0O;
        if (A0O != null) {
            0lg A0X = DbT.A0X(this.A06);
            IgFormField igFormField = this.A00;
            if (igFormField != null) {
                editText = igFormField.getMEditText();
            } else {
                editText = null;
            }
            EEK eek = new EEK(editText, A0X, this, A0O);
            this.A02 = eek;
            registerLifecycleListener(eek);
        }
        AnonymousClass0fD.A09(-12915600, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(569632939);
        this.A03 = null;
        this.A00 = null;
        this.A04 = null;
        unregisterLifecycleListener(this.A02);
        super.onDestroyView();
        AnonymousClass0fD.A09(179304677, A022);
    }
}
