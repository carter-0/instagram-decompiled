package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.E5h  reason: case insensitive filesystem */
public final class C47502E5h extends AnonymousClass4DH implements G8C, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ContactPointConfirmationFragment";
    public long A00;
    public EEK A01;
    public boolean A02;
    public TextView A03;
    public IgFormField A04;
    public IgdsHeadline A05;
    public ProgressButton A06;
    public String A07 = "email";
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

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
        return "cp_acquisition_confirmation";
    }

    public final C46634DiE BzS() {
        return C46634DiE.A10;
    }

    public final void DUM() {
        String str;
        String str2;
        IgFormField igFormField = this.A04;
        if (igFormField == null || (str = DbU.A0o(igFormField)) == null) {
            str = "";
        }
        Bundle bundle = this.mArguments;
        if (bundle == null || (str2 = bundle.getString("nux_contact_point")) == null) {
            str2 = "";
        }
        if (str.length() > 0 && str2.length() > 0) {
            EEK eek = this.A01;
            if (eek != null) {
                eek.A01();
            }
            UserSession A0l = AnonymousClass7TE.A0l(this.A08);
            String A0a = Dbb.A0a(this);
            String A052 = 0qv.A02.A05(requireContext());
            C49370EuY euY = new C49370EuY(this);
            0qQ.A0B(A0l, 0);
            1vn A012 = 1vm.A01(A0l);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, str2, "contact_point");
            0Df.A00(A032, A0a, Dbj.A01());
            0Df.A00(A032, A052, "guid");
            0Df.A00(A032, str, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
            FS6.A00(new FSC(euY, 12), new PandoGraphQLRequest(C41847B3o.A04(A032, A042, "data"), "NUXConfirmContactPointMutation", A042.getParamsCopy(), A043.getParamsCopy(), C43416Bxs.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_async_confirm_confirmation_code", AnonymousClass7TE.A1C()), A012, euY, 9);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public static final void A00(C47502E5h e5h, int i) {
        String A16 = AnonymousClass7TE.A16(e5h.requireContext(), i);
        1xC r1 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        A0a.A0D = A16;
        A0a.A06();
        DbY.A1K(r1, A0a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Integer num;
        String str2;
        int A022 = AnonymousClass0fD.A02(863447639);
        0qQ.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.nux_contact_point_confirmation_fragment, viewGroup, false);
        IgFormField A0d = DbT.A0d(inflate, R.id.add_conf_code_form);
        this.A04 = A0d;
        if (A0d != null) {
            A0d.setLabelText(requireContext().getString(2131956480));
            A0d.setInputType(2);
            A0d.setMaxLength(6);
        }
        TextView A0G = DbU.A0G(inflate, R.id.skip_button);
        this.A03 = A0G;
        if (A0G != null) {
            A0G.setText(2131956587);
            FP0.A00(A0G, 44, this);
        }
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.confirm_cp_header);
        this.A05 = A0U;
        if (A0U != null) {
            Context requireContext = requireContext();
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                str2 = bundle2.getString("nux_contact_point");
            } else {
                str2 = null;
            }
            A0U.setBody((CharSequence) DbW.A0h(requireContext, str2, 2131956588));
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("nux_contact_point_is_phone", false);
        }
        this.A02 = z;
        if (z) {
            str = "phone";
        } else {
            str = "email";
        }
        this.A07 = str;
        ProgressButton A0O = Dba.A0O(inflate);
        this.A06 = A0O;
        if (A0O != null) {
            0lg A0X = DbT.A0X(this.A08);
            if (this.A02) {
                num = AnonymousClass05K.A0Y;
            } else {
                num = AnonymousClass05K.A00;
            }
            EEK eek = new EEK((TextView) null, A0X, this, A0O);
            eek.A03 = num;
            this.A01 = eek;
            registerLifecycleListener(eek);
        }
        this.A00 = System.currentTimeMillis();
        C49938FFr.A00(DbT.A0X(this.A08), (C49922FEx) null, (EXD) null, (Integer) null, "contact_point_confirmation", this.A07);
        AnonymousClass0fD.A09(1649443840, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-459807646);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-562300514, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1263115178);
        super.onResume();
        IgFormField igFormField = this.A04;
        if (igFormField != null) {
            igFormField.requestFocus();
            0nA.A0Q(igFormField);
        }
        AnonymousClass0fD.A09(1491301923, A022);
    }

    public final void configureActionBar(2da r1) {
        Dbb.A1I(r1);
    }
}
