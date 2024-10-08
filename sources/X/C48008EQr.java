package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.EQr  reason: case insensitive filesystem */
public final class C48008EQr extends C47469E3t {
    public static final String __redex_internal_original_name = "DataDownloadPasswordFragment";
    public int A00;
    public int A01;
    public EditText A02;
    public TextView A03;
    public UserSession A04;
    public InlineErrorMessageView A05;
    public String A06;

    public final String getModuleName() {
        return "data_download_password";
    }

    public static void A00(C48008EQr eQr) {
        eQr.A05.A03();
        if (!0nA.A0z(eQr.A02)) {
            FBX fbx = new FBX(eQr.A04);
            fbx.A02(AnonymousClass000.A00(1907), "create_job");
            String A0f = AnonymousClass7TF.A0f(eQr.A02);
            UserSession userSession = eQr.A04;
            String str = eQr.A06;
            1NY A0N = DbU.A0N(userSession);
            A0N.A0A("dyi/request_download_data/");
            A0N.A9m("email", str);
            A0N.A9m("enc_password", Dba.A0b(userSession, A0f));
            1OC A0N2 = DbY.A0N(A0N, DvM.class, F7f.class);
            EDV.A00(A0N2, eQr, fbx, 36);
            1ES.A03(A0N2);
            return;
        }
        eQr.A05.A04(eQr.getString(2131969198));
    }

    public final void configureActionBar(2da r4) {
        int i;
        super.configureActionBar(r4);
        boolean z = false;
        r4.ARJ(false);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131968361);
        A0K.A0G = FP4.A00(this, 1);
        this.A03 = (TextView) r4.AA3(new AnonymousClass3Jb(A0K));
        EditText editText = this.A02;
        if (editText != null && !0nA.A0z(editText)) {
            z = true;
        }
        this.A03.setEnabled(z);
        TextView textView = this.A03;
        if (z) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        textView.setTextColor(i);
        DbX.A1A(FP4.A00(this, 2), DbX.A0M(), r4);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-565067494);
        super.onCreate(bundle);
        this.A06 = requireArguments().getString("email");
        this.A04 = DbX.A0U(this);
        this.A00 = getContext().getColor(R.color.blue_5_30_transparent);
        this.A01 = DbU.A01(getContext());
        AnonymousClass0fD.A09(702741799, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1406989078);
        View inflate = layoutInflater.inflate(R.layout.data_download_password_fragment, viewGroup, false);
        DbX.A1E(inflate, DbV.A0z(this, DbX.A0q(this.A04), 2131957392), R.id.header_text);
        DbU.A0D(inflate, R.id.inline_error_stub).inflate();
        this.A05 = (InlineErrorMessageView) inflate.findViewById(R.id.inline_error);
        TextView A0G = DbU.A0G(inflate, R.id.help_text);
        Dbb.A0l(DbV.A05(this), A0G, 2131962642);
        FP4.A01(A0G, 0, this);
        EditText A0E = DbU.A0E(inflate, R.id.text_field);
        this.A02 = A0E;
        A0E.setHint(2131969195);
        this.A02.setInputType(128);
        Dba.A10(this.A02);
        this.A02.setImeOptions(6);
        FQe.A00(this.A02, this, 16);
        FKk.A00(this.A02, this, 24);
        AnonymousClass0fD.A09(832607786, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1306254141);
        super.onResume();
        this.A02.requestFocus();
        0nA.A0Q(this.A02);
        AnonymousClass0fD.A09(1862796429, A022);
    }
}
