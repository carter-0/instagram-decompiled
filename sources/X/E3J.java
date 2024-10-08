package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class E3J extends AnonymousClass4DH implements AnonymousClass4DS, C13676Tel {
    public static final String __redex_internal_original_name = "ChangeEmailFragment";
    public EditText A00;
    public UserSession A01;
    public FBX A02;
    public String A03;
    public List A04;
    public boolean A05;
    public int A06;
    public View A07;
    public boolean A08;
    public final Handler A09 = AnonymousClass7TF.A0D();

    public final String getModuleName() {
        return AnonymousClass000.A00(1165);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        C59922Jbl.A02(DbV.A05(this), obj, 2131954970);
        this.A07 = C59904JbT.A00(new FPD((Object) this, 58), r4, obj);
        r4.setIsLoading(this.A05);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1024733903);
        E3J.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        17k.A07(bundle2, "Arguments in ChangeEmailFragment cannot be null.");
        this.A01 = DbX.A0U(this);
        this.A03 = bundle2.getString("send_source");
        this.A02 = new FBX(this.A01);
        if (TextUtils.isEmpty(bundle2.getString("email"))) {
            registerLifecycleListener(new C8776R9c(getContext(), this.A01, this));
        }
        AnonymousClass0fD.A09(1752801861, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1069353872);
        View inflate = layoutInflater.inflate(R.layout.fragment_change_email, viewGroup, false);
        EditText A0E = DbU.A0E(inflate, R.id.current_email);
        this.A00 = A0E;
        A0E.setText(requireArguments().getString("email"));
        AnonymousClass4Ed.A04(this.A00);
        if (TextUtils.isEmpty(this.A00.getText())) {
            ArrayList A012 = C49898FCb.A01(requireActivity(), this.A01);
            if (!A012.isEmpty()) {
                EditText editText = this.A00;
                editText.getClass();
                DbZ.A14(editText, A012.get(0));
            }
        }
        this.A02.A00.markerEnd(857808781, 2);
        AnonymousClass0fD.A09(815239980, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-529917209);
        super.onDestroyView();
        this.A00 = null;
        this.A07 = null;
        AnonymousClass0fD.A09(1491523526, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1703926235);
        E3J.super.onPause();
        C2594141p.A00(getActivity(), this.A06);
        Dbc.A0o(this);
        DbS.A1D(this);
        AnonymousClass0fD.A09(-533306762, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1224815508);
        super.onResume();
        this.A06 = requireActivity().getRequestedOrientation();
        C2594141p.A00(getActivity(), -1);
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Dbb.A0h(rootActivity);
        if (!this.A08) {
            EditText editText = this.A00;
            editText.getClass();
            editText.requestFocus();
            0nA.A0Q(this.A00);
            this.A08 = true;
        }
        AnonymousClass0fD.A09(-838147777, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(510164754);
        E3J.super.onStart();
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(-640597981, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(2026017545);
        E3J.super.onStop();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(620226136, A022);
    }

    public final void Ds3(List list) {
        this.A04 = list;
    }
}
