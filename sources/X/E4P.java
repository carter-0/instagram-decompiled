package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.autofill.AutofillManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class E4P extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AymhPasswordInputFragment";
    public CheckBox A00;
    public EditText A01;
    public ImageUrl A02;
    public IgTextView A03;
    public F23 A04;
    public ProgressButton A05;
    public String A06;
    public String A07;
    public boolean A08;
    public int A09;
    public AymhViewModel A0A;
    public Integer A0B;
    public final AnonymousClass0eM A0C = C51797G2g.A00(this, 47);
    public final Runnable A0D = new C51232Fqn(this);

    public final String getModuleName() {
        return "aymh_password_input";
    }

    public static final void A00(E4P e4p) {
        e4p.A09++;
        String str = e4p.A07;
        String A032 = Dbj.A03();
        if (str != null) {
            EditText editText = e4p.A01;
            if (editText == null) {
                A032 = "password";
            } else {
                C15050ULg uLg = new C15050ULg(str, AnonymousClass7TF.A0f(editText), 5);
                ImageUrl imageUrl = e4p.A02;
                String str2 = e4p.A07;
                if (str2 != null) {
                    C60937Jtv jtv = new C60937Jtv(imageUrl, AnonymousClass05K.A1I, uLg, str2, e4p.A06);
                    AymhViewModel aymhViewModel = e4p.A0A;
                    if (aymhViewModel == null) {
                        A032 = "aymhViewModel";
                    } else {
                        AnonymousClass0aP r4 = (AnonymousClass0aP) e4p.A0C.getValue();
                        boolean z = e4p.A08;
                        Integer num = e4p.A0B;
                        int i = e4p.A09;
                        0qQ.A0B(r4, 1);
                        DbT.A0H(aymhViewModel.A0A).A0B(new VT2(2131973893, true));
                        AnonymousClass7TE.A1Z(new AymhViewModel$login$2(r4, jtv, aymhViewModel, num, (AnonymousClass4D7) null, i, z), C318116oQ.A00(aymhViewModel));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(A032);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean onBackPressed() {
        AutofillManager autofillManager;
        Context context = getContext();
        if (!(context == null || (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) == null)) {
            autofillManager.cancel();
        }
        C49920FEv.A00(DbT.A0X(this.A0C), (EXD) null, (Boolean) null, (Integer) null, "aymh_password_input");
        return false;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, X.E4P, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String str;
        boolean z2;
        int A022 = AnonymousClass0fD.A02(1487807942);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.aymh_password_input_fragment, viewGroup, false);
        Integer num = null;
        this.A06 = requireArguments().getString("USER_ID", (String) null);
        String string = requireArguments().getString("USERNAME", (String) null);
        if (string != null) {
            this.A07 = string;
            this.A02 = (ImageUrl) requireArguments().getParcelable("PROFILE_PIC_URL");
            String str2 = this.A06;
            if (str2 != null) {
                z = C319606qt.A00().A0K(str2);
            } else {
                z = false;
            }
            this.A08 = z;
            String string2 = requireArguments().getString("ORIGINATING_ACCOUNT_SOURCE", (String) null);
            if (string2 != null) {
                if (string2.equals("PROFILE")) {
                    num = AnonymousClass05K.A00;
                } else if (string2.equals("ONE_TAP")) {
                    num = AnonymousClass05K.A01;
                } else if (string2.equals("FACEBOOK")) {
                    num = AnonymousClass05K.A0C;
                } else if (string2.equals("FX_MANI_FACEBOOK")) {
                    num = AnonymousClass05K.A0N;
                } else if (string2.equals("FX_MANI_IG_LOGGED_IN")) {
                    num = AnonymousClass05K.A0Y;
                } else if (string2.equals("GOOGLE")) {
                    num = AnonymousClass05K.A0j;
                } else if (string2.equals("SMART_LOCK_AUTO_SIGNIN")) {
                    num = AnonymousClass05K.A0u;
                } else if (string2.equals("SMART_LOCK_RESOLVED")) {
                    num = AnonymousClass05K.A15;
                } else if (string2.equals("ONE_TAP_BACKUP")) {
                    num = AnonymousClass05K.A1F;
                } else if (string2.equals("STANDARD_LOGIN")) {
                    num = AnonymousClass05K.A1I;
                } else {
                    throw AnonymousClass7TE.A0w(string2);
                }
            }
            this.A0B = num;
            0qQ.A0A(inflate);
            TextView A0G = DbU.A0G(inflate, R.id.username);
            String str3 = this.A07;
            if (str3 == null) {
                str = Dbj.A03();
            } else {
                A0G.setText(str3);
                IgImageView A0b = DbX.A0b(inflate, R.id.avatar_image_view);
                ImageUrl imageUrl = this.A02;
                if (imageUrl != null) {
                    A0b.setUrl(imageUrl, this);
                } else {
                    DbU.A13(requireContext(), A0b, R.drawable.profile_anonymous_user);
                }
                AnonymousClass0eM r6 = this.A0C;
                this.A04 = new F23(this, (AnonymousClass0aP) r6.getValue());
                IgTextView A0a = DbT.A0a(inflate, R.id.login_forgot_button);
                Dbb.A0l(A0a.getResources(), A0a, 2131976228);
                this.A03 = A0a;
                Context requireContext = requireContext();
                IgTextView igTextView = this.A03;
                str = "forgotButton";
                if (igTextView != null) {
                    FCK.A00(igTextView, requireContext);
                    IgTextView igTextView2 = this.A03;
                    if (igTextView2 != null) {
                        FP0.A00(igTextView2, 7, this);
                        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.login_button);
                        AnonymousClass0fU.A00(new FPG(7, (Object) progressButton, (Object) this), progressButton);
                        progressButton.setEnabled(false);
                        this.A05 = progressButton;
                        EditText A0E = DbU.A0E(inflate, R.id.password);
                        A0E.setTypeface(Typeface.DEFAULT);
                        Dba.A10(A0E);
                        A0E.setImeOptions(6);
                        FKk.A00(A0E, this, 13);
                        A0E.setInputType(524416);
                        FQe.A00(A0E, this, 10);
                        this.A01 = A0E;
                        this.A00 = (CheckBox) inflate.requireViewById(R.id.save_password_checkbox);
                        String str4 = this.A06;
                        if (str4 != null) {
                            z2 = C319606qt.A00().A0K(str4);
                        } else {
                            z2 = false;
                        }
                        str = "savePasswordCheckBox";
                        if (!z2) {
                            this.A08 = true;
                            CheckBox checkBox = this.A00;
                            if (checkBox != null) {
                                checkBox.setChecked(true);
                                CheckBox checkBox2 = this.A00;
                                if (checkBox2 != null) {
                                    FQO.A00(checkBox2, this, 18);
                                }
                            }
                        } else {
                            CheckBox checkBox3 = this.A00;
                            if (checkBox3 != null) {
                                checkBox3.setVisibility(8);
                            }
                        }
                        this.A0A = DbW.A0F(this).A00(AymhViewModel.class);
                        C49938FFr.A01(DbT.A0X(r6), "aymh_password_input");
                        if (requireArguments().getBoolean("IS_FROM_NDX", false)) {
                            C50139FQw fQw = new C50139FQw(this, 24);
                            AymhViewModel aymhViewModel = this.A0A;
                            if (aymhViewModel == null) {
                                0qQ.A0F("aymhViewModel");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            DbT.A0H(aymhViewModel.A09).A06(this, fQw);
                        }
                        AnonymousClass0fD.A09(-759695539, A022);
                        return inflate;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-918915031, A022);
        throw A0y;
    }

    public final void onResume() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-1788136075);
        super.onResume();
        EditText editText = this.A01;
        if (editText == null) {
            0qQ.A0F("password");
            throw AnonymousClass00P.createAndThrow();
        }
        editText.postDelayed(this.A0D, 200);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setFlags(8192, 8192);
        }
        AnonymousClass0fD.A09(2068392418, A022);
    }

    public final void onStop() {
        Window window;
        int A022 = AnonymousClass0fD.A02(1658294903);
        E4P.super.onStop();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.clearFlags(8192);
        }
        AnonymousClass0fD.A09(-402301346, A022);
    }

    public final void configureActionBar(2da r1) {
        Dbb.A1I(r1);
    }
}
