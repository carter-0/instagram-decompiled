package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.regex.Pattern;

public final class E4W extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AccountLinkingIGPCPasswordCreationScreen";
    public UserSession A00;
    public ProgressButton A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public EditText A05;
    public final TextWatcher A06 = new FKk(this, 0);
    public volatile boolean A07;

    public final void configureActionBar(2da r3) {
        String string;
        r3.Etr(true);
        r3.Eu4(true);
        if (this.A02) {
            string = "";
        } else {
            string = requireActivity().getString(2131952063);
        }
        r3.setTitle(string);
    }

    public final String getModuleName() {
        return "account_linking_igpc_password_creation";
    }

    public static void A00(E4W e4w) {
        C48150EZs eZs;
        boolean z = e4w.A02;
        UserSession userSession = e4w.A00;
        if (z) {
            eZs = C48150EZs.A02;
        } else {
            eZs = C48150EZs.A03;
        }
        String obj = eZs.toString();
        AnonymousClass7TG.A1N(userSession, obj);
        FG9.A00(userSession, "create_password_screen_save_button_click", obj);
        C47697EDg.A01(e4w, FHA.A0F(e4w.A00, 0nA.A0I(e4w.A05)), 0);
    }

    public static void A01(E4W e4w) {
        boolean z = true;
        e4w.A05.setEnabled(!e4w.A07);
        e4w.A01.setShowProgressBar(e4w.A07);
        String A0I = 0nA.A0I(e4w.A05);
        Pattern pattern = 0mp.A01;
        int A052 = DbX.A05(A0I);
        ProgressButton progressButton = e4w.A01;
        if (A052 < 6) {
            z = false;
        }
        progressButton.setEnabled(z);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        if (this.A02) {
            return false;
        }
        UserSession userSession = this.A00;
        String obj = C48150EZs.A03.toString();
        AnonymousClass7TG.A1N(userSession, obj);
        FG9.A00(userSession, "create_password_screen_back_button_click", obj);
        DbT.A1I(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(94403162);
        E4W.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("is_parent_account");
        this.A02 = requireArguments.getBoolean("is_interstitial");
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-194358046, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C48150EZs eZs;
        int A022 = AnonymousClass0fD.A02(-790842623);
        View inflate = layoutInflater.inflate(R.layout.account_linking_setup_igpc_password_creation_fragment, viewGroup, false);
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.igpc_password_creation_headline);
        UserSession userSession = this.A00;
        0eE r7 = AnonymousClass0t1.A01;
        A0U.setCircularImageUrl(r7.A01(userSession).Bh3());
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.create_button);
        this.A01 = progressButton;
        if (this.A02) {
            progressButton.setText((CharSequence) getString(2131952069));
            A0U.setHeadline((CharSequence) DbV.A0z(this, DbU.A0n(this.A00, r7), 2131952066));
            A0U.setBody((CharSequence) DbV.A0z(this, DbU.A0n(this.A00, r7), 2131952065));
        } else {
            A0U.setHeadline((CharSequence) DbV.A0z(this, DbU.A0n(this.A00, r7), 2131952068));
        }
        FP6.A00(this.A01, 2, this);
        EditText A0E = DbU.A0E(inflate, R.id.password_edittext);
        this.A05 = A0E;
        A0E.setTypeface(Typeface.DEFAULT);
        Dba.A10(this.A05);
        this.A05.setImeOptions(6);
        this.A05.setInputType(524416);
        FQe.A00(this.A05, this, 0);
        if (DbV.A0G(this) != null) {
            this.A04 = DbV.A0G(this).getAttributes().softInputMode;
            Dbb.A10(this);
        }
        boolean z = this.A02;
        UserSession userSession2 = this.A00;
        if (z) {
            eZs = C48150EZs.A02;
        } else {
            eZs = C48150EZs.A03;
        }
        String obj = eZs.toString();
        0qQ.A0B(userSession2, 0);
        0qQ.A0B(obj, 1);
        FG9.A00(userSession2, "create_password_screen_shown", obj);
        AnonymousClass0fD.A09(-1943599193, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(677025228);
        super.onDestroyView();
        if (DbV.A0G(this) != null) {
            DbV.A0G(this).setSoftInputMode(this.A04);
        }
        this.A05 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(1107148209, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(985305727);
        E4W.super.onPause();
        this.A05.removeTextChangedListener(this.A06);
        if (DbV.A0G(this) != null) {
            DbV.A0G(this).setSoftInputMode(this.A04);
        }
        AnonymousClass0fD.A09(-1644344458, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-667830237);
        super.onResume();
        this.A05.addTextChangedListener(this.A06);
        if (DbV.A0G(this) != null) {
            Dbb.A10(this);
        }
        AnonymousClass0fD.A09(-964958910, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A01(this);
    }
}
