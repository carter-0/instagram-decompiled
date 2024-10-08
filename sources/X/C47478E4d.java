package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgButton;
import java.util.HashMap;

/* renamed from: X.E4d  reason: case insensitive filesystem */
public final class C47478E4d extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PasswordResetFragment";
    public View A00;
    public EditText A01;
    public EditText A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public AnonymousClass0aP A05;
    public ImageUrl A06;
    public C49700F2l A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public IgButton A0C;
    public C49922FEx A0D;
    public C50515Fdb A0E;
    public final View.OnClickListener A0F = new FP3((Object) this, 10);
    public final 1P0 A0G = new C47699EDi(this, 9);

    public final String getModuleName() {
        return "password_reset";
    }

    public static void A00(View view, C47478E4d e4d) {
        TextView A0G2;
        String str;
        if (view != null) {
            DbT.A0b(view, R.id.user_profile_picture).setUrl(e4d.A06, e4d);
            if (e4d.A0A) {
                A0G2 = AnonymousClass7TE.A0d(view, R.id.passwordless_reset_title);
                if (A0G2 != null) {
                    str = DbV.A0z(e4d, e4d.A09, 2131962865);
                }
                e4d.A0B = false;
                Dbb.A17(e4d, false);
            }
            A0G2 = DbU.A0G(view, R.id.username_textview);
            str = e4d.A09;
            A0G2.setText(str);
            e4d.A0B = false;
            Dbb.A17(e4d, false);
        }
    }

    public static void A01(FragmentActivity fragmentActivity, C47478E4d e4d) {
        String A0f;
        EditText editText;
        String A0f2;
        C47478E4d e4d2 = e4d;
        AnonymousClass0aP r9 = e4d2.A05;
        String str = e4d2.A08;
        EditText editText2 = e4d2.A02;
        if (editText2 == null) {
            A0f = null;
        } else {
            A0f = AnonymousClass7TF.A0f(editText2);
        }
        if (e4d2.A0A) {
            editText = e4d2.A02;
        } else {
            editText = e4d2.A01;
        }
        if (editText == null) {
            A0f2 = null;
        } else {
            A0f2 = AnonymousClass7TF.A0f(editText);
        }
        String string = e4d2.requireArguments().getString("argument_reset_token");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String A002 = 0qv.A00(fragmentActivity2);
        String A0s = DbT.A0s(fragmentActivity2);
        1NY A0N = DbU.A0N(r9);
        A0N.A0A("accounts/change_password/");
        A0N.A9m("enc_new_password1", Dba.A0b(r9, A0f));
        A0N.A9m("enc_new_password2", Dba.A0b(r9, A0f2));
        DbS.A1P(A0N, str);
        Dbb.A1L(A0N, "token", string, A002, A0s);
        1OC A0K = Dbb.A0K(A0N, EM4.class, FCB.class);
        AnonymousClass0aP r13 = e4d2.A05;
        C46634DiE diE = C46634DiE.A1C;
        Integer num = AnonymousClass05K.A00;
        C50515Fdb fdb = e4d2.A0E;
        Uri A012 = C46413Dea.A01(e4d2);
        Bundle bundle = e4d2.mArguments;
        if (bundle != null) {
            bundle.getString("flow_id");
        }
        A0K.A00 = new EMI(fragmentActivity2, A012, e4d2, r13, fdb, e4d2, diE, num);
        e4d2.schedule(A0K);
    }

    public static void A02(C47478E4d e4d) {
        Context context;
        int i;
        String str;
        C49700F2l f2l = e4d.A07;
        String A0f = AnonymousClass7TF.A0f(f2l.A06);
        String A0f2 = AnonymousClass7TF.A0f(f2l.A05);
        if (A0f.length() < 6 || !A0f2.equals(A0f)) {
            C49700F2l f2l2 = e4d.A07;
            EditText editText = f2l2.A06;
            String A0f3 = AnonymousClass7TF.A0f(editText);
            String A0f4 = AnonymousClass7TF.A0f(f2l2.A05);
            if (A0f3.length() < 6 || A0f4.length() < 6) {
                context = editText.getContext();
                i = 2131969198;
            } else if (!A0f3.equals(A0f4)) {
                context = editText.getContext();
                i = 2131969203;
            } else {
                str = null;
                C59689JTv.A0G(str);
                return;
            }
            str = context.getString(i);
            C59689JTv.A0G(str);
            return;
        }
        C49220ErP.A00(e4d.A05, "password_reset");
        FragmentActivity activity = e4d.getActivity();
        if (activity != null) {
            if (DbY.A1Y(0Tu.A05, e4d.A05, 36311487471485472L)) {
                0nY.A00().ATE(new EI2(activity, e4d));
            } else {
                A01(activity, e4d);
            }
        }
    }

    public static boolean A03(C47478E4d e4d) {
        Bundle bundle = e4d.mArguments;
        if (bundle == null || !bundle.getString("flow_id", "").equals("fxcal")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        if (this.A0A) {
            if (getContext() != null) {
                r4.ENd(getContext().getDrawable(2Yu.A0C(getContext())));
            }
            Dbc.A0k(r4);
        } else {
            ? obj = new Object();
            C59922Jbl.A02(DbV.A05(this), obj, 2131954977);
            ActionButton A002 = C59904JbT.A00(this.A0F, r4, obj);
            this.A00 = A002;
            A002.setEnabled(this.A07.A00());
        }
        r4.setIsLoading(this.A0B);
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A05, "password_reset");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(908624642);
        C47478E4d.super.onCreate(bundle);
        this.A05 = Dba.A0D(this);
        this.A0D = C49922FEx.A00(requireArguments());
        AnonymousClass0aP r1 = this.A05;
        AnonymousClass7TG.A1N(r1, "password_reset");
        C49938FFr.A01(r1, "password_reset");
        this.A08 = requireArguments().getString("argument_user_id");
        this.A09 = requireArguments().getString("argument_user_name");
        this.A06 = (ImageUrl) requireArguments().getParcelable("argument_profile_pic_url");
        0aS r4 = 0aS.A00;
        if (this.A09 != null) {
            this.A0B = false;
        } else {
            1NY A0O = DbU.A0O(this.A05);
            A0O.A0K("users/%s/filtered_info/", new Object[]{Uri.encode(this.A08)});
            A0O.A0O(r4, C47353Dvn.class, F7O.class, false);
            1OC A0M = A0O.A0M();
            A0M.A00 = this.A0G;
            schedule(A0M);
        }
        this.A0E = new C50515Fdb(getActivity());
        if (A03(this)) {
            AnonymousClass0aP r42 = this.A05;
            String str = this.A08;
            0qQ.A0B(r42, 0);
            C48921EmL.A00(r42, "passwordless_flow_viewed_password_reset_surface", str, (HashMap) null);
        }
        AnonymousClass0fD.A09(-1533949028, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EditText editText;
        EditText editText2;
        int A022 = AnonymousClass0fD.A02(985780102);
        boolean A032 = A03(this);
        this.A0A = A032;
        int i = R.layout.fragment_password_reset;
        if (A032) {
            i = R.layout.fragment_passwordless_reset;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A02 = DbU.A0E(inflate, R.id.new_password);
        IgButton igButton = null;
        if (this.A0A) {
            editText = null;
        } else {
            editText = (EditText) inflate.findViewById(R.id.confirm_new_password);
        }
        this.A01 = editText;
        if (this.A0A) {
            igButton = (IgButton) inflate.findViewById(R.id.save_password_button);
        }
        this.A0C = igButton;
        if (this.A0A && igButton != null) {
            AnonymousClass0fU.A00(this.A0F, igButton);
        }
        EditText editText3 = this.A02;
        Typeface typeface = Typeface.DEFAULT;
        editText3.setTypeface(typeface);
        Dba.A10(this.A02);
        EditText editText4 = this.A01;
        if (!this.A0A && editText4 != null) {
            editText4.setTypeface(typeface);
            Dba.A10(editText4);
        }
        Resources A052 = DbV.A05(this);
        EditText editText5 = this.A02;
        if (this.A0A) {
            editText2 = editText5;
        } else {
            editText2 = this.A01;
        }
        C49700F2l f2l = new C49700F2l(A052, editText5, editText2);
        this.A07 = f2l;
        f2l.A00 = new C49347EuB(this);
        if (this.A09 != null) {
            A00(inflate, this);
        }
        this.A04 = (TextInputLayout) inflate.findViewById(R.id.new_password_input_layout);
        if (!this.A0A) {
            this.A03 = (TextInputLayout) inflate.findViewById(R.id.confirm_password_input_layout);
        }
        TextInputLayout textInputLayout = this.A04;
        if (textInputLayout != null) {
            textInputLayout.setEndIconVisible(false);
        }
        TextInputLayout textInputLayout2 = this.A03;
        if (textInputLayout2 != null) {
            textInputLayout2.setEndIconVisible(false);
        }
        FPM.A00(this.A02, 8, this);
        EditText editText6 = this.A01;
        if (!this.A0A && editText6 != null) {
            FPM.A00(editText6, 9, this);
        }
        EditText editText7 = this.A01;
        if (!this.A0A && editText7 != null) {
            FQe.A00(editText7, this, 5);
        }
        AnonymousClass0fD.A09(-1616507862, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1085259463);
        super.onDestroy();
        AnonymousClass0fD.A09(-1232551366, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1011213320);
        super.onDestroyView();
        C49700F2l f2l = this.A07;
        f2l.A00 = null;
        f2l.A06.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        f2l.A05.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.A07 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A0C = null;
        this.A03 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-72044962, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1668860928);
        C47478E4d.super.onPause();
        if (requireActivity().getCurrentFocus() != null) {
            0nA.A0N(requireActivity().getCurrentFocus());
        }
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(1821339296, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1691875454);
        super.onResume();
        requireActivity().A0d();
        requireActivity().A0Z();
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(433037402, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        02m.A0p.markerEnd(725091390, 2);
    }
}
