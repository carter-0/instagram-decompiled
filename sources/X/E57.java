package X;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

public final class E57 extends AnonymousClass4DH implements AnonymousClass4DR, G8C {
    public static final String __redex_internal_original_name = "OneClickPasswordResetFragment";
    public EditText A00;
    public UserSession A01;
    public NotificationBar A02;
    public EEK A03;
    public String A04;
    public String A05;
    public Uri A06;
    public View A07;
    public ProgressButton A08;

    public final EXD B6Y() {
        return null;
    }

    public final void DaH(boolean z) {
    }

    public final String getModuleName() {
        return "one_click_password_reset";
    }

    public static void A00(E57 e57) {
        C46413Dea.A05(e57.getActivity(), e57.A06, e57, e57.A01);
    }

    public final void APF() {
        this.A08.setEnabled(false);
        this.A07.setEnabled(false);
    }

    public final void ARL() {
        this.A08.setEnabled(true);
        this.A07.setEnabled(true);
    }

    public final C46634DiE BzS() {
        return C46634DiE.A16;
    }

    public final boolean Ca3() {
        if (0nA.A0I(this.A00).length() >= 6) {
            return true;
        }
        return false;
    }

    public final void DUM() {
        this.A02.A02();
        C49220ErP.A00(this.A01, "one_click_pwd_reset");
        UserSession userSession = this.A01;
        String A0f = AnonymousClass7TF.A0f(this.A00);
        String str = this.A04;
        String str2 = this.A05;
        String A0i = DbZ.A0i(this);
        String A0X = Dba.A0X(this);
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("accounts/change_password/");
        A0N.A9m("enc_new_password", Dba.A0b(userSession, A0f));
        DbS.A1P(A0N, userSession.A06);
        A0N.A9m("access_pw_reset_token", str);
        Dbb.A1L(A0N, "source", str2, A0i, A0X);
        1OC A0N2 = DbY.A0N(A0N, 1XP.class, 1XY.class);
        A0N2.A00 = new EDV(20, this, this);
        schedule(A0N2);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1842430290);
        E57.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        this.A04 = DbU.A0l(requireArguments, "argument_token");
        this.A05 = DbU.A0l(requireArguments, "argument_source");
        this.A06 = (Uri) requireArguments.getParcelable("argument_redirect_uri");
        UserSession userSession = this.A01;
        AnonymousClass7TG.A1N(userSession, "one_click_pwd_reset");
        C49938FFr.A01(userSession, "one_click_pwd_reset");
        AnonymousClass0fD.A09(1462431658, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1357909530);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_one_click_password_reset);
        DbU.A0G(A0C, R.id.field_title).setText(2131961721);
        this.A02 = Dba.A0M(A0C);
        EditText A0E = DbU.A0E(A0C, R.id.new_password);
        this.A00 = A0E;
        A0E.setTypeface(Typeface.DEFAULT);
        Dba.A10(this.A00);
        User A0j = DbT.A0j(this.A01);
        DbU.A1S(this, DbT.A0b(A0C, R.id.user_profile_picture), A0j);
        DbX.A1F(DbU.A0G(A0C, R.id.field_detail), this, A0j.getUsername(), 2131972263);
        ProgressButton progressButton = (ProgressButton) A0C.findViewById(R.id.next_button);
        this.A08 = progressButton;
        EEK eek = new EEK(this.A00, this.A01, this, progressButton, 2131972262);
        this.A03 = eek;
        registerLifecycleListener(eek);
        View requireViewById = A0C.requireViewById(R.id.skip_text);
        this.A07 = requireViewById;
        FP3.A00(requireViewById, 9, this);
        AnonymousClass0fD.A09(-1330606596, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-688851188);
        super.onDestroy();
        AnonymousClass0fD.A09(-526760338, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(785916726);
        super.onDestroyView();
        this.A00 = null;
        this.A08 = null;
        this.A07 = null;
        this.A02 = null;
        unregisterLifecycleListener(this.A03);
        AnonymousClass0fD.A09(611071929, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1250535983);
        E57.super.onPause();
        if (requireActivity().getCurrentFocus() != null) {
            0nA.A0N(requireActivity().getCurrentFocus());
        }
        AnonymousClass0fD.A09(1021350735, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1246472770);
        super.onResume();
        requireActivity().A0d();
        AnonymousClass0fD.A09(2099254657, A022);
    }
}
