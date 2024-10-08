package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

public final class E4Y extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacTotpKeyNamingFragment";
    public boolean A00;
    public Bundle A01;
    public IgFormField A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        int i = 2131975667;
        if (this.A00) {
            i = 2131975764;
        }
        DbW.A1B(r4, i);
        if (!this.A00) {
            return;
        }
        if (A00().length() == 0) {
            r4.AA6(2131972502);
        } else {
            r4.AA9(new FP3((Object) this, 56), 2131972502);
        }
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final boolean onBackPressed() {
        return false;
    }

    private final CharSequence A00() {
        IgFormField igFormField = this.A02;
        if (igFormField != null) {
            return 00l.A0B(igFormField.getText());
        }
        0qQ.A0F("nicknameView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(E4Y e4y) {
        C47699EDi eDi = new C47699EDi(e4y, 41);
        if (e4y.A00().length() == 0) {
            C49952FGh.A06(e4y.requireContext(), e4y.getString(2131975723), e4y.getString(2131961740));
            return;
        }
        0lg A0X = DbT.A0X(e4y.A03);
        Context requireContext = e4y.requireContext();
        String obj = e4y.A00().toString();
        Bundle bundle = e4y.A01;
        if (bundle == null) {
            0qQ.A0F("twoFacArguments");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0w = DbT.A0w(bundle, "rename_totp_seed_id", "");
        0qQ.A0B(A0X, 0);
        String A0V = Dbb.A0V();
        0qQ.A0B(obj, 3);
        1NY A0a = AnonymousClass7TG.A0a(A0X);
        A0a.A0A(Dbq.A05(699, 38, 79));
        Dbb.A0j(requireContext, A0a);
        A0a.A9m(A0V, obj);
        A0a.A9m(Dbb.A0W(), A0w);
        1OC A0S = DbU.A0S(A0a, C47315Dui.class, F4I.class);
        A0S.A00 = eDi;
        1ES.A03(A0S);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public static final void A01(E4Y e4y) {
        if (e4y.A00().length() > 0) {
            Bundle bundle = e4y.A01;
            if (bundle == null) {
                0qQ.A0F("twoFacArguments");
                throw AnonymousClass00P.createAndThrow();
            }
            bundle.putString(Dbb.A0V(), e4y.A00().toString());
            FFR.A03();
            Bundle requireArguments = e4y.requireArguments();
            E4M e4m = new E4M();
            Dbc.A0S(e4m, DbU.A0I(requireArguments, e4m, e4y), e4y.A03);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1695397125);
        E4Y.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments;
        this.A00 = requireArguments.getBoolean("is_renaming", false);
        Bundle bundle2 = this.A01;
        if (bundle2 == null) {
            0qQ.A0F("twoFacArguments");
            throw AnonymousClass00P.createAndThrow();
        }
        bundle2.remove("is_renaming");
        AnonymousClass0fD.A09(-1511941796, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-423605700);
        0qQ.A0B(layoutInflater, 0);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.two_fac_key_naming_fragment, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.next_button);
        requireViewById.setEnabled(false);
        if (!(!this.A00)) {
            i = 8;
        }
        requireViewById.setVisibility(i);
        FP3.A00(requireViewById, 57, this);
        IgFormField A0d = DbT.A0d(inflate, R.id.name_field);
        this.A02 = A0d;
        String str = "nicknameView";
        if (A0d != null) {
            FQe.A00(A0d.getMEditText(), this, 9);
            IgFormField igFormField = this.A02;
            if (igFormField != null) {
                Bundle bundle2 = this.A01;
                if (bundle2 == null) {
                    str = "twoFacArguments";
                } else {
                    igFormField.setText(DbT.A0w(bundle2, Dbb.A0V(), ""));
                    IgFormField igFormField2 = this.A02;
                    if (igFormField2 != null) {
                        igFormField2.A0G(new FKj(4, this, requireViewById));
                        DbU.A0G(inflate, R.id.instagram_naming_key_paragraph).setText(2131975735);
                        AnonymousClass0fD.A09(1920152174, A022);
                        return inflate;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-49258522);
        E4Y.super.onPause();
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(0);
        }
        IgFormField igFormField = this.A02;
        if (igFormField == null) {
            0qQ.A0F("nicknameView");
            throw AnonymousClass00P.createAndThrow();
        }
        0nA.A0N(igFormField);
        AnonymousClass0fD.A09(-777192597, A022);
    }
}
