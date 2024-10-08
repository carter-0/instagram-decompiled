package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E4M extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacMultipleTotpSetupManuallyFragment";
    public Bundle A00;
    public TextView A01;
    public TextView A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975667);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final boolean onBackPressed() {
        return false;
    }

    public static final void A00(E4M e4m) {
        String str;
        FCE.A00(AnonymousClass7TE.A0l(e4m.A04), AnonymousClass05K.A01);
        Object A0e = DbZ.A0e(e4m.requireContext());
        if (A0e != null) {
            ClipboardManager clipboardManager = (ClipboardManager) A0e;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            TextView textView = e4m.A01;
            if (textView == null) {
                str = "igKeyLineOne";
            } else {
                A1A.append(textView.getText());
                A1A.append(' ');
                TextView textView2 = e4m.A02;
                if (textView2 == null) {
                    str = "igKeyLineTwo";
                } else {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Confirm_Key", AnonymousClass7TF.A0i(textView2.getText(), A1A)));
                    DbZ.A0w(e4m.requireContext(), e4m, 2131956742);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1118027832);
        E4M.super.onCreate(bundle);
        this.A00 = requireArguments();
        AnonymousClass0fD.A09(-295294627, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1638601209);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_multiple_totp_setup_manually_fragment, viewGroup, false);
        this.A01 = DbU.A0G(inflate, R.id.ig_key_line_one);
        this.A02 = DbU.A0G(inflate, R.id.ig_key_line_two);
        TextView A0G = DbU.A0G(inflate, R.id.copy_key);
        ESx eSx = new ESx(this, requireContext().getColor(R.color.igds_gradient_cyan));
        SpannableStringBuilder A0C = DbS.A0C(getString(2131975677));
        Dba.A0x(A0C, eSx);
        A0G.setText(A0C);
        FP3.A00(A0G, 51, this);
        ((C3021461u) inflate.requireViewById(R.id.next_bottom_button)).setPrimaryActionOnClickListener(new FP3((Object) this, 52));
        AnonymousClass0fD.A09(-8217363, A022);
        return inflate;
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(391302318);
        E4M.super.onStart();
        String str = "twoFacResponseBundle";
        if (this.A03) {
            Bundle bundle = this.A00;
            if (bundle != null) {
                String A0w = DbT.A0w(bundle, "instagram_key", "");
                TextView textView = this.A01;
                if (textView == null) {
                    str = "igKeyLineOne";
                } else {
                    TextView textView2 = this.A02;
                    if (textView2 == null) {
                        str = "igKeyLineTwo";
                    } else {
                        FGN.A03(textView, textView2, A0w);
                        AnonymousClass0fD.A09(318413976, A022);
                        return;
                    }
                }
            }
        } else {
            0lg A0X = DbT.A0X(this.A04);
            Context requireContext = requireContext();
            C47699EDi eDi = new C47699EDi(this, 39);
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                1NY A0L = DbZ.A0L(A0X);
                A0L.A0A(Dbq.A05(65, 38, 14));
                Dbb.A0j(requireContext, A0L);
                A0L.A9m(Dbq.A05(311, 15, 103), "false");
                A0L.A9m(Dbq.A05(384, 17, 9), bundle2.getString(Dbb.A0V()));
                1OC A0S = DbU.A0S(A0L, C47315Dui.class, F4I.class);
                A0S.A00 = eDi;
                1ES.A03(A0S);
                AnonymousClass0fD.A09(318413976, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
