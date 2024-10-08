package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.ui.NetzDgTermsTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class E5W extends AnonymousClass4DH implements G7H {
    public static final String __redex_internal_original_name = "AymhLoginLandingFragment";
    public C46822Dly A00;
    public AymhViewModel A01;
    public FBZ A02;
    public final AnonymousClass0eM A03 = C51797G2g.A00(this, 46);

    public final String getModuleName() {
        return "aymh";
    }

    public final void FI8(C61079JwH jwH) {
        AnonymousClass0eM r4 = this.A03;
        r4.getValue();
        02m r3 = 02m.A0p;
        r3.markerStart(2293785);
        r3.markerAnnotate(2293785, "login_flow", "prod");
        C49881FBf.A00.A01(DbT.A0X(r4), (EXD) null, (Boolean) null, (Boolean) null, (Integer) null, "aymh", jwH.A05());
        AymhViewModel aymhViewModel = this.A01;
        if (aymhViewModel == null) {
            0qQ.A0F("aymhViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else {
            aymhViewModel.A01(jwH, (AnonymousClass0aP) r4.getValue(), (C60937Jtv) null, (C239803Ii) null);
        }
    }

    public final void FI9(C61079JwH jwH) {
        C358248ab A0H;
        String string;
        Intent intent;
        Bundle extras;
        String string2;
        C49900FCd.A02(DbT.A0X(this.A03), C46634DiE.A0G, jwH.A05());
        List list = (List) jwH.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C60937Jtv) it.next()).A01 == AnonymousClass05K.A0Y) {
                    A0H = Dba.A0H(this);
                    FragmentActivity activity = getActivity();
                    if (activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null || (string2 = extras.getString("current_username")) == null || string2.length() == 0) {
                        string = getString(2131962862);
                    } else {
                        string = DbV.A0z(this, string2, 2131962863);
                    }
                    0qQ.A07(string);
                    A0H.A05 = string;
                    DbU.A1J(this, A0H, 2131962880);
                    A0H.A0c((DialogInterface.OnClickListener) null, DbU.A0m(this, 2131968772));
                }
            }
        }
        A0H = Dba.A0H(this);
        A0H.A09(2131971975);
        DbU.A1J(this, A0H, 2131971976);
        C50025FJk.A01(A0H, jwH, this, 38, 2131971974);
        A0H.A0C(C50025FJk.A00(jwH, this, 39));
        DbT.A1V(A0H);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            return;
        }
        if (DbS.A0m(bundle2) != null && bundle2.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG")) {
            C358248ab A002 = C49952FGh.A00(DbT.A03(this));
            A002.A09(2131965610);
            Dba.A1L(A002);
            bundle2.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        } else if (bundle2.getBoolean("should_show_youth_regulation_block", false)) {
            bundle2.remove("should_show_youth_regulation_block");
            Activity rootActivity = getRootActivity();
            if (rootActivity != null) {
                C49290EsZ.A00.A00(rootActivity);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1654388863);
        E5W.super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r3 = this.A03;
        0lg A0X = DbT.A0X(r3);
        0qQ.A0B(A0X, 2);
        this.A02 = new FBZ(requireActivity, A0X, false);
        registerLifecycleListener(new EEE(getActivity(), this, (AnonymousClass0aP) r3.getValue(), C46634DiE.A0G));
        AnonymousClass0fD.A09(-726101396, A022);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.G7H, X.E5W] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1941793941);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(layoutInflater2, viewGroup, R.layout.one_tap_login_landing_fragment, false);
        viewGroup2.removeAllViews();
        DbV.A0E(this).inflate(R.layout.aymh_multiple_users, viewGroup2);
        this.A00 = new C46822Dly(this);
        View findViewById = viewGroup2.findViewById(R.id.aymh_recycler_view);
        0qQ.A0C(findViewById, C273654mx.A00(4));
        RecyclerView recyclerView = (RecyclerView) findViewById;
        DbY.A16(this, recyclerView);
        C46822Dly dly = this.A00;
        if (dly == null) {
            str = "aymhAdapter";
        } else {
            recyclerView.setAdapter(dly);
            C50139FQw fQw = new C50139FQw(this, 23);
            this.A01 = DbW.A0F(this).A00(AymhViewModel.class);
            Set A07 = 0sc.A07(new EXE[]{EXE.ONE_TAP, EXE.SMART_LOCK, EXE.PROFILE, EXE.GOOGLE, EXE.FX_MANI_IG_LOGGED_IN});
            AymhViewModel aymhViewModel = this.A01;
            str = "aymhViewModel";
            if (aymhViewModel != null) {
                FragmentActivity requireActivity = requireActivity();
                AnonymousClass0eM r4 = this.A03;
                Object value = r4.getValue();
                AnonymousClass12T r11 = AnonymousClass12T.A00;
                AnonymousClass7TG.A1U(value, A07, r11);
                AnonymousClass7TE.A1Z(new C59703JUk((Object) requireActivity, (Object) aymhViewModel, (Object) A07, (Object) r11, value, (AnonymousClass4D7) null, 46), C318116oQ.A00(aymhViewModel));
                AymhViewModel aymhViewModel2 = this.A01;
                if (aymhViewModel2 != null) {
                    DbT.A0H(aymhViewModel2.A08).A06(this, fQw);
                    View findViewById2 = viewGroup2.findViewById(R.id.netz_dg_terms_text_view);
                    0qQ.A0C(findViewById2, "null cannot be cast to non-null type com.instagram.nux.ui.NetzDgTermsTextView");
                    ((NetzDgTermsTextView) findViewById2).A00(DbT.A0X(r4));
                    TextView A0B = DbW.A0B(viewGroup2, R.id.left_button);
                    DbU.A1G(A0B, this, 2131974846);
                    2eS.A01(A0B);
                    FP0.A00(A0B, 5, this);
                    TextView A0B2 = DbW.A0B(viewGroup2, R.id.right_button);
                    DbU.A1G(A0B2, this, 2131968712);
                    2eS.A01(A0B2);
                    FP0.A00(A0B2, 6, this);
                    FCK.A01(A0B, A0B2);
                    View findViewById3 = viewGroup2.findViewById(R.id.login_landing_logo);
                    0qQ.A0C(findViewById3, C273654mx.A00(86));
                    Dba.A0p(requireContext(), (ImageView) findViewById3);
                    C49938FFr.A01(DbT.A0X(r4), "aymh");
                    AnonymousClass0fD.A09(-955211950, A022);
                    return viewGroup2;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
