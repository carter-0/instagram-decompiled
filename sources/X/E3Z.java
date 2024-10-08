package X;

import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

public final class E3Z extends AnonymousClass4DH implements C61110lV, AnonymousClass4DR, G8C, G69, C51931G7z, G67 {
    public static final String __redex_internal_original_name = "UsernameChangeFragment";
    public AnonymousClass0aP A00;
    public C49706F2r A01;
    public F37 A02;
    public C49692F2c A03;
    public RegFlowExtras A04;
    public NotificationBar A05;
    public InlineErrorMessageView A06;
    public ProgressButton A07;
    public SearchEditText A08;
    public String A09;
    public String A0A;
    public ImageView A0B;
    public FXD A0C;
    public C49691F2b A0D;
    public EEK A0E;
    public final Handler A0F = new Handler();
    public final Runnable A0G = new C51237Fqs(this);
    public final TextWatcher A0H = new C48054ESy(this, 12);
    public final View.OnFocusChangeListener A0I = new FPM(this, 18);
    public final 1wn A0J = FXZ.A00(this, 45);

    public final void DaH(boolean z) {
    }

    public final void Et4(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass0aP r4 = this.A00;
            C49028Eo4.A00(activity, this.A0F, this, r4, this, this.A04, this.A0E, C48156EZy.A05.A00, str, str2, this.A0A);
        }
    }

    public final void APF() {
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        searchEditText.setEnabled(false);
    }

    public final void ARL() {
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        searchEditText.setEnabled(true);
    }

    public final EXD B6Y() {
        return this.A04.A01();
    }

    public final C46634DiE BzS() {
        return C48156EZy.A05.A00;
    }

    public final boolean Ca3() {
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        RectF rectF = 0nA.A01;
        return !TextUtils.isEmpty(DbV.A0y(searchEditText));
    }

    public final void DUM() {
        String str;
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        RectF rectF = 0nA.A01;
        String A0y = DbV.A0y(searchEditText);
        if (!TextUtils.isEmpty(this.A09)) {
            if (A0y.equals(this.A0A)) {
                AnonymousClass0aP r4 = this.A00;
                C46634DiE diE = C48156EZy.A05.A00;
                String str2 = this.A09;
                RegFlowExtras regFlowExtras = this.A04;
                if (regFlowExtras.A01() != null) {
                    str = regFlowExtras.A01().A00;
                } else {
                    str = "";
                }
                C49229ErY.A00(r4, diE, str2, str);
            } else {
                C49886FBm A062 = 1Q0.A24.A02(this.A00).A06(this.A04.A01(), C48156EZy.A05.A00);
                A062.A04("prototype", this.A09);
                A062.A02();
            }
        }
        Handler handler = this.A0F;
        handler.removeCallbacks(this.A0G);
        G8D activity = getActivity();
        if (activity instanceof G8D) {
            FRU A0C2 = Dba.A0C(activity);
            0lg r5 = this.A00;
            RegFlowExtras regFlowExtras2 = this.A04;
            EXD A012 = regFlowExtras2.A01();
            String str3 = A0C2.A09;
            BusinessInfo businessInfo = A0C2.A02;
            String A042 = AnonymousClass703.A04(getActivity());
            CallerContext callerContext = FRR.A00;
            if (A012 != EXD.A04) {
                handler.post(new C51554Fw0(handler, this, r5, businessInfo, this, regFlowExtras2, A012, A0y, str3, A042));
                return;
            }
            return;
        }
        C50144FRb.A02(handler, this, this, this.A00, this, this, this.A04, this.A0E, C48156EZy.A05.A00, A0y, this.A0A, false);
    }

    public final void Dwd() {
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setShowProgressBar(false);
        this.A02.A01();
    }

    public final void Dwe(String str, Integer num) {
        this.A02.A00();
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setShowProgressBar(false);
        EuV(str, num);
    }

    public final void Dwf() {
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setShowProgressBar(true);
        this.A02.A00();
    }

    public final void Dwh(String str, List list) {
        ProgressButton progressButton = this.A07;
        progressButton.getClass();
        progressButton.setEnabled(false);
        this.A07.setShowProgressBar(false);
        this.A02.A00();
        EuV(str, AnonymousClass05K.A01);
        C49706F2r f2r = this.A01;
        f2r.getClass();
        f2r.A00(getRootActivity(), list);
    }

    public final String getModuleName() {
        return "username_sign_up";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void EuV(String str, Integer num) {
        if (!isVisible()) {
            return;
        }
        if (num == AnonymousClass05K.A01) {
            InlineErrorMessageView inlineErrorMessageView = this.A06;
            inlineErrorMessageView.getClass();
            inlineErrorMessageView.A04(str);
            NotificationBar notificationBar = this.A05;
            notificationBar.getClass();
            notificationBar.A02();
            return;
        }
        C49958FGq.A08(this.A05, str);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-319100878);
        RegFlowExtras regFlowExtras = this.A04;
        if (regFlowExtras.A01() != EXD.A04) {
            C49913FEl.A01(this, C48156EZy.A05, regFlowExtras).A03(this.A00, this.A04);
        }
        AnonymousClass0fD.A0A(-1968384778, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-106624485, AnonymousClass0fD.A03(-731589380));
    }

    public final boolean onBackPressed() {
        if (!DbT.A1a(DbV.A0d(), "has_user_confirmed_dialog")) {
            AnonymousClass0aP r5 = this.A00;
            C46634DiE diE = C48156EZy.A05.A00;
            C49038EoI.A00(this, r5, new C50629Ffk(this, 2), this.A04.A01(), diE, (Integer) null);
            return true;
        }
        if (this.A04.A01() == EXD.A04) {
            C49843F9i.A00 = null;
        } else {
            C49843F9i.A00();
            SearchEditText searchEditText = this.A08;
            searchEditText.getClass();
            0nA.A0I(searchEditText);
        }
        C49920FEv.A00.A01(this.A00, this.A04.A01(), C48156EZy.A05.A00.A01);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1428651264(0x55277d00, float:1.1509707E13)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.E3Z.super.onCreate(r6)
            X.0aP r0 = X.Dba.A0D(r5)
            r5.A00 = r0
            android.os.Parcelable r1 = X.Dba.A03(r5)
            r1.getClass()
            com.instagram.registration.model.RegFlowExtras r1 = (com.instagram.registration.model.RegFlowExtras) r1
            r5.A04 = r1
            X.EXD r0 = X.EXD.A04
            r1.A03(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            com.instagram.registration.model.RegFlowExtras r1 = r5.A04
            if (r0 == 0) goto L_0x00be
            X.EXD r0 = X.EXD.A03
        L_0x002e:
            r1.A03(r0)
        L_0x0031:
            android.content.Context r1 = r5.getContext()
            X.0aP r0 = r5.A00
            X.C48934EmY.A00(r1, r0)
            com.instagram.registration.model.RegFlowExtras r0 = r5.A04
            java.util.List r1 = X.Dbb.A0g(r0)
            r4 = 0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a8
            java.lang.Object r0 = r1.get(r4)
            X.Ewr r0 = (X.C49512Ewr) r0
            java.lang.String r0 = r0.A01
            r5.A0A = r0
            java.lang.Object r0 = r1.get(r4)
            X.Ewr r0 = (X.C49512Ewr) r0
            java.lang.String r0 = r0.A00
            r5.A09 = r0
        L_0x005b:
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.FVq> r1 = X.C50259FVq.class
            X.1wn r0 = r5.A0J
            r2.A02(r0, r1)
            X.0Tu r0 = X.0Tu.A05
            java.lang.String r1 = X.Dba.A0Z(r0)
            java.lang.String r0 = "UsernameChangeFragment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.Boolean r0 = X.C49035EoF.A00()
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 == 0) goto L_0x008a
            X.1pg r2 = X.C49130Ept.A00()
            android.content.Context r1 = r5.requireContext()
            X.0aP r0 = r5.A00
            r2.A00(r1, r0, r4)
        L_0x008a:
            java.lang.Boolean r0 = X.C49036EoG.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a1
            X.1pg r2 = X.C49130Ept.A00()
            android.content.Context r1 = r5.requireContext()
            X.0aP r0 = r5.A00
            r2.A01(r1, r0, r4)
        L_0x00a1:
            r0 = -2054734336(0xffffffff85873e00, float:-1.2718114E-35)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00a8:
            r2 = 0
            r5.A09 = r2
            com.instagram.registration.model.RegFlowExtras r0 = r5.A04
            java.util.List r1 = r0.A0e
            if (r1 == 0) goto L_0x00bb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00bb
            java.lang.String r2 = X.AnonymousClass7TE.A19(r1, r4)
        L_0x00bb:
            r5.A0A = r2
            goto L_0x005b
        L_0x00be:
            java.lang.String r0 = r1.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0031
            com.instagram.registration.model.RegFlowExtras r1 = r5.A04
            X.EXD r0 = X.EXD.PHONE
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3Z.onCreate(android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: X.G7z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r0 = 1986699127(0x766a9f77, float:1.1896795E33)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r4 = r21
            r1 = r22
            android.view.View r7 = X.DbT.A0C(r4, r1, r0)
            android.view.ViewGroup r1 = X.Dba.A04(r7)
            r0 = 2131628954(0x7f0e139a, float:1.8885215E38)
            r3 = 1
            r4.inflate(r0, r1, r3)
            r0 = 2131432828(0x7f0b157c, float:1.8487424E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r0)
            r0 = 2131955004(0x7f130d3c, float:1.9546523E38)
            r1.setText(r0)
            r0 = 2131432824(0x7f0b1578, float:1.8487416E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r0)
            r0 = 2131955003(0x7f130d3b, float:1.9546521E38)
            r1.setText(r0)
            X.1xC r5 = X.1xC.A01
            java.lang.Class<X.FVs> r4 = X.C50261FVs.class
            X.FXD r1 = new X.FXD
            r0 = r20
            r1.<init>(r0)
            r0.A0C = r1
            r5.A02(r1, r4)
            com.instagram.registration.ui.NotificationBar r1 = X.Dba.A0M(r7)
            r0.A05 = r1
            r1 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.view.View r4 = r7.requireViewById(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = (com.instagram.ui.widget.searchedittext.SearchEditText) r4
            r0.A08 = r4
            android.view.View$OnFocusChangeListener r1 = r0.A0I
            r4.setOnFocusChangeListener(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A08
            r1.setAllowTextSelection(r3)
            r1 = 2131443623(0x7f0b3fa7, float:1.850932E38)
            android.widget.ImageView r1 = X.DbU.A0F(r7, r1)
            r0.A0B = r1
            r1 = 2131443607(0x7f0b3f97, float:1.8509287E38)
            android.view.View r1 = r7.findViewById(r1)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r1 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r1
            r0.A06 = r1
            r1 = 2131443608(0x7f0b3f98, float:1.8509289E38)
            android.view.ViewGroup r4 = X.DbU.A0C(r7, r1)
            android.animation.TimeInterpolator r1 = com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A09
            X.C49165EqW.A00(r4)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            android.text.TextWatcher r1 = r0.A0H
            r4.addTextChangedListener(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = r0.A08
            android.content.Context r1 = r0.requireContext()
            X.ERR r5 = new X.ERR
            r5.<init>(r1, r0)
            r4 = 30
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r1.<init>(r4)
            android.text.InputFilter[] r1 = new android.text.InputFilter[]{r5, r1}
            r6.setFilters(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r11 = r0.A08
            android.widget.ImageView r8 = r0.A0B
            X.0aP r9 = r0.A00
            com.instagram.registration.model.RegFlowExtras r10 = r0.A04
            X.EXD r12 = r10.A01()
            X.EZy r1 = X.C48156EZy.A05
            X.DiE r13 = r1.A00
            X.F2r r6 = new X.F2r
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.A01 = r6
            r1 = 2131436967(0x7f0b25a7, float:1.849582E38)
            android.view.View r6 = r7.findViewById(r1)
            com.instagram.ui.widget.progressbutton.ProgressButton r6 = (com.instagram.ui.widget.progressbutton.ProgressButton) r6
            r0.A07 = r6
            X.0aP r5 = r0.A00
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.EEK r1 = new X.EEK
            r1.<init>(r4, r5, r0, r6)
            r0.A0E = r1
            r0.registerLifecycleListener(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.0aP r1 = r0.A00
            android.content.Context r15 = r0.getContext()
            X.0gy r16 = X.AnonymousClass07i.A00(r0)
            X.F2c r14 = new X.F2c
            r17 = r1
            r18 = r0
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r0.A03 = r14
            android.content.Context r5 = r0.requireContext()
            android.widget.ImageView r4 = r0.A0B
            X.F37 r1 = new X.F37
            r1.<init>(r5, r4)
            r0.A02 = r1
            X.0aP r6 = r0.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.F2b r1 = new X.F2b
            r1.<init>(r4, r6, r0, r5)
            r0.A0D = r1
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A08
            if (r1 == 0) goto L_0x0156
            boolean r1 = X.0nA.A0z(r1)
            if (r1 == 0) goto L_0x0156
            java.lang.String r1 = r0.A0A
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0156
            X.0aP r5 = r0.A00
            com.instagram.registration.model.RegFlowExtras r1 = r0.A04
            X.EXD r4 = r1.A01()
            java.lang.String r1 = r0.A0A
            X.C49226ErV.A00(r5, r4, r13, r1)
            X.0aP r5 = r0.A00
            java.lang.String r4 = r13.A01
            com.instagram.registration.model.RegFlowExtras r1 = r0.A04
            X.EXD r1 = r1.A01()
            X.Dba.A0j(r3, r5, r4)
            X.1Ln r1 = X.C49221ErQ.A00(r5, r1, r4)
            r1.Cgf()
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            java.lang.String r1 = r0.A0A
            r4.setText(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            java.lang.String r1 = r0.A0A
            int r1 = r1.length()
            r4.setSelection(r1)
            X.F37 r1 = r0.A02
            r1.A01()
            android.os.Handler r4 = r0.A0F
            java.lang.Runnable r1 = r0.A0G
            r4.removeCallbacks(r1)
        L_0x0156:
            X.F2b r1 = r0.A0D
            r1.A04 = r3
            X.FFr r4 = X.C49938FFr.A00
            X.0aP r3 = r0.A00
            java.lang.String r1 = r13.A01
            com.instagram.registration.model.RegFlowExtras r0 = r0.A04
            X.EXD r0 = r0.A01()
            r4.A02(r3, r0, r1)
            r0 = 381217659(0x16b8eb7b, float:2.9875412E-25)
            X.AnonymousClass0fD.A09(r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3Z.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-564902981);
        super.onDestroy();
        1xC.A01.A03(this.A0J, C50259FVq.class);
        AnonymousClass0fD.A09(1742374169, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1953684067);
        super.onDestroyView();
        unregisterLifecycleListener(this.A0E);
        14i.A06(this);
        this.A08.getClass();
        this.A08.removeTextChangedListener(this.A0H);
        this.A08.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        this.A08.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.A05 = null;
        this.A08 = null;
        this.A01 = null;
        this.A0E = null;
        this.A06 = null;
        this.A0B = null;
        this.A07 = null;
        FXD fxd = this.A0C;
        if (fxd != null) {
            1xC.A01.A03(fxd, C50261FVs.class);
            this.A0C = null;
        }
        AnonymousClass0fD.A09(187746683, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1603478791);
        E3Z.super.onPause();
        0nA.A0N(this.A08);
        NotificationBar notificationBar = this.A05;
        notificationBar.getClass();
        notificationBar.A03();
        this.A0F.removeCallbacksAndMessages((Object) null);
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setSoftInputMode(0);
        AnonymousClass0fD.A09(187606949, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-182810235);
        super.onResume();
        SearchEditText searchEditText = this.A08;
        searchEditText.getClass();
        C49958FGq.A06(searchEditText);
        Dbb.A0h(requireActivity());
        AnonymousClass0fD.A09(-875892200, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(267637886);
        E3Z.super.onStart();
        AnonymousClass0fD.A09(-255878730, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1205676214);
        E3Z.super.onStop();
        AnonymousClass0fD.A09(661873799, A022);
    }
}
