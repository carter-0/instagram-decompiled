package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.activity.CalActivity;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class E59 extends AnonymousClass4DH implements AnonymousClass4DR, G8C, G69, C51931G7z {
    public static final String __redex_internal_original_name = "CreateUsernameFragment";
    public Handler A00;
    public ImageView A01;
    public AnonymousClass0aP A02;
    public ConnectContent A03 = null;
    public C49692F2c A04;
    public RegFlowExtras A05;
    public NotificationBar A06;
    public EEK A07;
    public C49601EzK A08;
    public InlineErrorMessageView A09;
    public ProgressButton A0A;
    public SearchEditText A0B;
    public Date A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public F37 A0G;
    public EE2 A0H;
    public final TextWatcher A0I = new C48054ESy(this, 17);
    public final Runnable A0J = new C51284Frd(this);

    /* JADX WARNING: type inference failed for: r0v15, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    public static synchronized void A03(E59 e59) {
        synchronized (e59) {
            if (e59.A0D && e59.A0F && e59.getActivity() != null) {
                ConnectContent connectContent = e59.A03;
                if (A05(connectContent)) {
                    if (connectContent != null) {
                        String obj = FxcalAccountType.INSTAGRAM.toString();
                        String str = e59.A05.A0Z;
                        ? obj2 = new Object();
                        obj2.A01 = obj;
                        obj2.A02 = str;
                        obj2.A00 = null;
                        obj2.A03 = obj;
                        connectContent.A02 = obj2;
                    }
                    UserSession A002 = A00(e59);
                    A002.getClass();
                    EVV evv = EVV.IG_SAC_SIGN_UP;
                    String obj3 = evv.toString();
                    boolean A1Z = AnonymousClass7TG.A1Z(A002, obj3);
                    FG9.A00(A002, "linking_flow_initiated", obj3);
                    e59.A05.A0t = A1Z;
                    FragmentActivity requireActivity = e59.requireActivity();
                    ConnectContent connectContent2 = e59.A03;
                    connectContent2.getClass();
                    UserSession A003 = A00(e59);
                    A003.getClass();
                    DbW.A1N(connectContent2, 2, A003);
                    Intent intent = new Intent(requireActivity, CalActivity.class);
                    C49778F6l.A01(intent, connectContent2, AnonymousClass05K.A01, "", 20180130);
                    intent.putExtra("argument_entry_point", evv);
                    DbW.A0s(intent, A003);
                    Bundle A0a = AnonymousClass7TE.A0a();
                    ConnectContent connectContent3 = e59.A03;
                    connectContent3.getClass();
                    A0a.putParcelable("extra_cal_nux_content", connectContent3);
                    Dbc.A0H(requireActivity, intent, A0a, 20180130);
                } else {
                    e59.A05.A0t = false;
                    A02(e59);
                }
            }
        }
    }

    public final void DaH(boolean z) {
    }

    public final String getModuleName() {
        return "sac_create_username";
    }

    public static void A01(E59 e59) {
        String A0I2 = 0nA.A0I(e59.A0B);
        if (!TextUtils.isEmpty(A0I2) && e59.A0B.isFocused()) {
            Set set = e59.A08.A02;
            if (set == null || !set.contains(A0I2)) {
                Handler handler = e59.A00;
                Runnable runnable = e59.A0J;
                handler.removeCallbacks(runnable);
                e59.A00.postDelayed(runnable, 1000);
                e59.A0G.A00();
                AnonymousClass7TH.A0R(e59.A08.A00);
                e59.A06.A02();
                e59.A09.A03();
                e59.A0A.setEnabled(true);
                return;
            }
            e59.A06.A02();
            e59.A09.A03();
            e59.A0G.A01();
        }
    }

    private void A04(boolean z) {
        long length = (long) this.A0B.length();
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A02), "username_check_success");
        DbZ.A1G(A0e, A012, A002);
        FH8.A0E(A0e, "flow", "account_linking");
        A0e.A7p("is_username_available", Boolean.valueOf(z));
        DbY.A1I(A0e, "release_channel", FH8.A01(), A002);
        DbS.A1H(A0e, C48156EZy.A0E.A00.A01);
        A0e.A9F("username_length", Long.valueOf(length));
        DbZ.A1E(A0e);
        FH8.A0C(A0e, this.A02);
    }

    public static boolean A05(ConnectContent connectContent) {
        if (connectContent == null || connectContent.A09 == null || connectContent.A05 == null || connectContent.A06 == null || connectContent.A03 == null) {
            return false;
        }
        return true;
    }

    public final void APF() {
        this.A0B.setEnabled(false);
    }

    public final void ARL() {
        this.A0B.setEnabled(true);
    }

    public final EXD B6Y() {
        return EXD.SAC;
    }

    public final C46634DiE BzS() {
        return C48156EZy.A0E.A00;
    }

    public final boolean Ca3() {
        return !Dba.A1V(this.A0B);
    }

    public final void DUM() {
        String A0I2 = 0nA.A0I(this.A0B);
        AnonymousClass0aP r1 = this.A02;
        Context requireContext = requireContext();
        0qQ.A0B(r1, 0);
        1OC A002 = C318486p2.A00(requireContext, r1, A0I2);
        C47696EDf.A01(A002, this, 25);
        if (!this.A0E) {
            if (A00(this) == null || A05(this.A03)) {
                this.A0D = true;
            } else {
                UserSession A003 = A00(this);
                A003.getClass();
                String obj = EVV.IG_SAC_SIGN_UP.toString();
                1NY A0N = DbU.A0N(A003);
                A0N.A0A("fb/nux_fb_content/");
                A0N.A9m("access_token", "");
                A0N.A0G("linking_entry_point", obj);
                1OC A0K = Dbb.A0K(A0N, ConnectContent.class, C49779F6m.class);
                A0K.A00 = new C47681ECq(this);
                Dbb.A15(this, A0K);
            }
        }
        Dbb.A15(this, A002);
        C49881FBf fBf = C49881FBf.A00;
        AnonymousClass0aP r4 = this.A02;
        String str = C48156EZy.A0E.A00.A01;
        EXD exd = EXD.SAC;
        Integer A022 = this.A05.A02();
        0qQ.A0B(r4, 0);
        fBf.A01(r4, exd, false, (Boolean) null, A022, str, (String) null);
    }

    public final void Dwd() {
        this.A0A.setShowProgressBar(false);
        this.A0G.A01();
        A04(true);
    }

    public final void Dwe(String str, Integer num) {
        this.A0A.setShowProgressBar(false);
        this.A0G.A00();
        EuV(str, num);
        int length = this.A0B.length();
        C49886FBm A062 = 1Q0.A1W.A02(this.A02).A06(EXD.SAC, C48156EZy.A0E.A00);
        synchronized (C49886FBm.A00(A062)) {
        }
        A062.A03("username_length", length);
        A062.A02();
    }

    public final void Dwf() {
        this.A0A.setShowProgressBar(true);
        this.A0G.A00();
    }

    public final void Dwh(String str, List list) {
        this.A0A.setEnabled(false);
        this.A0A.setShowProgressBar(false);
        this.A0G.A00();
        EuV(str, AnonymousClass05K.A01);
        if (list != null && !list.isEmpty()) {
            C49601EzK ezK = this.A08;
            AnonymousClass0aP r3 = this.A02;
            View view = ezK.A00;
            view.getClass();
            view.setVisibility(0);
            Set set = ezK.A02;
            set.getClass();
            set.addAll(list);
            RecyclerView recyclerView = ezK.A01;
            recyclerView.getClass();
            C46864Dmg.A00(recyclerView, ezK, 10);
            ezK.A01.setAdapter(new C46825Dm1(1, r3, ezK, list));
        }
        F37 f37 = this.A0G;
        FP2 fp2 = new FP2((Object) this, 48);
        ImageView imageView = f37.A01;
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.instagram_x_pano_outline_16);
        C49948FGd.A01(imageView, 2Yu.A09(f37.A00));
        AnonymousClass0fU.A00(fp2, imageView);
        imageView.setFocusable(true);
        DbT.A1A(imageView.getResources(), imageView, 2131976357);
        A04(false);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public static UserSession A00(E59 e59) {
        Bundle A0a = AnonymousClass7TE.A0a();
        DbS.A1A(A0a, e59.A05.A0G);
        return 09i.A0A.A07(A0a);
    }

    public static void A02(E59 e59) {
        if (e59.getActivity() != null) {
            RegFlowExtras regFlowExtras = e59.A05;
            regFlowExtras.A0g = DbW.A1a(e59.A0C);
            regFlowExtras.A0n = false;
            regFlowExtras.A12 = true;
            C309516Yo A0M = DbS.A0M(e59.requireActivity(), e59.A02);
            RegFlowExtras regFlowExtras2 = e59.A05;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            DbX.A18(A0a, new E58(), A0M);
        }
    }

    public final void EuV(String str, Integer num) {
        if (!isVisible()) {
            return;
        }
        if (num == AnonymousClass05K.A01) {
            this.A09.A04(str);
            this.A06.A02();
            return;
        }
        C49958FGq.A08(this.A06, str);
    }

    public final boolean onBackPressed() {
        Bundle A062 = DbU.A06(requireActivity());
        if (A062 != null && A062.containsKey("caa_registration_redirection_to_native")) {
            DbT.A1K(this);
        }
        C49920FEv.A00.A01(this.A02, EXD.SAC, C48156EZy.A0E.A00.A01);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1260901371);
        E59.super.onCreate(bundle);
        this.A00 = AnonymousClass7TF.A0D();
        Bundle bundle2 = this.mArguments;
        0JA.A03(bundle2, "Fragment arguments cannot be null in SAC flow!");
        this.A02 = 09i.A0A.A02(bundle2);
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A03(EXD.SAC);
        regFlowExtras.A04 = bundle2.getString("last_accessed_user_id", (String) null);
        regFlowExtras.A0T = bundle2.getString("intent", (String) null);
        regFlowExtras.A0U = bundle2.getString("surface", (String) null);
        this.A05 = regFlowExtras;
        List BNu = AnonymousClass0BO.A00(this.A02).BNu();
        if (!AnonymousClass4KJ.A00(BNu)) {
            this.A05.A0J = DbS.A0q(BNu.get(0));
            this.A05.A0M = DbX.A0u(BNu, 0);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                this.A05.A0H = bundle3.getString("cached_ig_access_token", (String) null);
                this.A05.A0G = this.mArguments.getString("last_logged_in_ig_access_token", (String) null);
            }
        }
        this.A0H = new EE2(this);
        AnonymousClass0fD.A09(-953058053, A022);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, X.G8C, androidx.fragment.app.Fragment, java.lang.Object, X.G7z, X.E59, X.4DH] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1098876783);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.reg_secondary_account_create_username, Dba.A04(A0C2), true);
        this.A0B = (SearchEditText) A0C2.requireViewById(R.id.username);
        this.A01 = DbU.A0F(A0C2, R.id.username_valid_icon);
        this.A09 = (InlineErrorMessageView) A0C2.requireViewById(R.id.username_inline_error);
        this.A0B.addTextChangedListener(this.A0I);
        FPM.A00(this.A0B, 21, this);
        this.A0B.setAllowTextSelection(true);
        this.A06 = (NotificationBar) A0C2.requireViewById(R.id.notification_bar);
        ProgressButton A0O = Dba.A0O(A0C2);
        this.A0A = A0O;
        EEK eek = new EEK(this.A0B, this.A02, this, A0O);
        this.A07 = eek;
        registerLifecycleListener(eek);
        ViewGroup A0C3 = DbU.A0C(A0C2, R.id.username_input_container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        C49165EqW.A00(A0C3);
        SearchEditText searchEditText = this.A0B;
        this.A04 = new C49692F2c(requireContext(), AnonymousClass07i.A00(this), this.A02, this, searchEditText);
        this.A0G = new F37(requireContext(), this.A01);
        this.A08 = new C49601EzK(A0C2, this.A0B);
        AnonymousClass0fD.A09(-1704024731, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2010359433);
        super.onDestroyView();
        unregisterLifecycleListener(this.A07);
        this.A0B.removeTextChangedListener(this.A0I);
        this.A0B = null;
        this.A01 = null;
        this.A0A = null;
        this.A07 = null;
        this.A09 = null;
        this.A06 = null;
        C49601EzK ezK = this.A08;
        ezK.A00 = null;
        ezK.A01 = null;
        ezK.A02 = null;
        EE2 ee2 = this.A0H;
        if (!(getActivity() == null || ee2 == null)) {
            requireActivity().unregisterOnActivityResultListener(ee2);
        }
        AnonymousClass0fD.A09(-1769567139, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(874648580);
        E59.super.onPause();
        0nA.A0N(this.A0B);
        this.A06.A03();
        this.A00.removeCallbacksAndMessages((Object) null);
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            A0G2.setSoftInputMode(0);
        }
        AnonymousClass0fD.A09(-1683002387, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-228974402);
        super.onResume();
        this.A0B.requestFocus();
        0nA.A0Q(this.A0B);
        A01(this);
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            A0G2.setSoftInputMode(16);
        }
        RegFlowExtras regFlowExtras = this.A05;
        regFlowExtras.A0y = false;
        regFlowExtras.A0t = false;
        this.A0D = false;
        this.A0F = false;
        AnonymousClass0fD.A09(1413951269, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C49938FFr.A00.A02(this.A02, EXD.SAC, C48156EZy.A0E.A00.A01);
        if (A00(this) != null) {
            1OC A062 = C318486p2.A06(A00(this));
            EDV.A00(A062, this, view, 34);
            schedule(A062);
        }
        EE2 ee2 = this.A0H;
        if (getActivity() != null && ee2 != null) {
            requireActivity().registerOnActivityResultListener(ee2);
        }
    }
}
