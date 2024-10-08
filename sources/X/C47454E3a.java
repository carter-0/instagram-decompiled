package X;

import android.os.Handler;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* renamed from: X.E3a  reason: case insensitive filesystem */
public final class C47454E3a extends AnonymousClass4DH implements C61110lV, AnonymousClass4DR, G8C, G69, C51931G7z, G67, CallerContextable {
    public static final String __redex_internal_original_name = "UsernameSignUpFragment";
    public AnonymousClass0aP A00;
    public C49706F2r A01;
    public F37 A02;
    public C49692F2c A03;
    public RegFlowExtras A04;
    public NotificationBar A05;
    public InlineErrorMessageView A06;
    public ProgressButton A07;
    public SearchEditText A08;
    public ImageView A09;
    public FXE A0A;
    public FXF A0B;
    public FXG A0C;
    public C49691F2b A0D;
    public EEK A0E;
    public final Handler A0F = new Handler();
    public final Runnable A0G = new C51238Fqt(this);
    public final TextWatcher A0H = new C48054ESy(this, 13);
    public final View.OnFocusChangeListener A0I = new FPM(this, 19);
    public final 1wn A0J = FXZ.A00(this, 46);

    public final void DaH(boolean z) {
    }

    public final void Et4(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass0aP r4 = this.A00;
            C49028Eo4.A00(activity, this.A0F, this, r4, this, this.A04, this.A0E, C48156EZy.A0H.A00, str, str2, A00());
        }
    }

    private String A00() {
        List A0g = Dbb.A0g(this.A04);
        if (!A0g.isEmpty()) {
            return ((C49512Ewr) A0g.get(0)).A01;
        }
        List list = this.A04.A0e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return AnonymousClass7TE.A19(list, 0);
    }

    public final void APF() {
        this.A08.setEnabled(false);
    }

    public final void ARL() {
        this.A08.setEnabled(true);
    }

    public final EXD B6Y() {
        return this.A04.A01();
    }

    public final C46634DiE BzS() {
        return C48156EZy.A0H.A00;
    }

    public final boolean Ca3() {
        return !Dba.A1V(this.A08);
    }

    public final void DUM() {
        String A0I2 = 0nA.A0I(this.A08);
        Handler handler = this.A0F;
        handler.removeCallbacks(this.A0G);
        G8D activity = getActivity();
        if (activity instanceof G8D) {
            FRU A0C2 = Dba.A0C(activity);
            0lg r5 = this.A00;
            RegFlowExtras regFlowExtras = this.A04;
            EXD A012 = regFlowExtras.A01();
            String str = A0C2.A09;
            BusinessInfo businessInfo = A0C2.A02;
            String A042 = AnonymousClass703.A04(getActivity());
            CallerContext callerContext = FRR.A00;
            if (A012 != EXD.A04) {
                handler.post(new C51554Fw0(handler, this, r5, businessInfo, this, regFlowExtras, A012, A0I2, str, A042));
                return;
            }
            return;
        }
        C50144FRb.A02(handler, this, this, this.A00, this, this, this.A04, this.A0E, C48156EZy.A0H.A00, A0I2, A00(), false);
    }

    public final void Dwd() {
        this.A07.setShowProgressBar(false);
        this.A02.A01();
    }

    public final void Dwe(String str, Integer num) {
        this.A07.setShowProgressBar(false);
        this.A02.A00();
        EuV(str, num);
    }

    public final void Dwf() {
        this.A07.setShowProgressBar(true);
    }

    public final void Dwh(String str, List list) {
        this.A07.setEnabled(false);
        this.A07.setShowProgressBar(false);
        this.A02.A00();
        EuV(str, AnonymousClass05K.A01);
        this.A01.A00(getRootActivity(), list);
    }

    public final void EuV(String str, Integer num) {
        if (num == AnonymousClass05K.A01) {
            this.A06.A04(str);
            this.A05.A02();
            return;
        }
        C49958FGq.A08(this.A05, str);
    }

    public final String getModuleName() {
        return "username_sign_up";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-894030057);
        RegFlowExtras regFlowExtras = this.A04;
        if (regFlowExtras.A01() != EXD.A04) {
            C49913FEl.A01(this, C48156EZy.A0H, regFlowExtras).A03(this.A00, this.A04);
        }
        AnonymousClass0fD.A0A(1564278586, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(189312541, AnonymousClass0fD.A03(-1925054154));
    }

    public final boolean onBackPressed() {
        if (!DbT.A1a(DbV.A0d(), "has_user_confirmed_dialog")) {
            AnonymousClass0aP r5 = this.A00;
            C46634DiE diE = C48156EZy.A0H.A00;
            C49038EoI.A00(this, r5, new C50629Ffk(this, 3), this.A04.A01(), diE, (Integer) null);
            return true;
        }
        if (this.A04.A01() == EXD.A04) {
            C49843F9i.A00 = null;
        } else {
            C49843F9i.A00();
            0nA.A0I(this.A08);
        }
        C49920FEv.A00.A01(this.A00, this.A04.A01(), C48156EZy.A0H.A00.A01);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -2144896352(0xffffffff80277aa0, float:-3.625574E-39)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C47454E3a.super.onCreate(r14)
            X.0aP r0 = X.Dba.A0D(r13)
            r13.A00 = r0
            android.os.Parcelable r1 = X.Dba.A03(r13)
            r1.getClass()
            com.instagram.registration.model.RegFlowExtras r1 = (com.instagram.registration.model.RegFlowExtras) r1
            r13.A04 = r1
            X.EXD r0 = X.EXD.A04
            r1.A03(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            com.instagram.registration.model.RegFlowExtras r1 = r13.A04
            if (r0 == 0) goto L_0x00a2
            X.EXD r0 = X.EXD.A03
        L_0x002e:
            r1.A03(r0)
        L_0x0031:
            android.content.Context r1 = r13.getContext()
            X.0aP r0 = r13.A00
            X.C48934EmY.A00(r1, r0)
            r13.B6Y()
            X.1WU r4 = X.AnonymousClass35B.A00()
            android.content.Context r5 = r13.getContext()
            X.0aP r6 = r13.A00
            r8 = 0
            com.instagram.registration.model.RegFlowExtras r0 = r13.A04
            X.EXD r7 = r0.A01()
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r4.A02(r5, r6, r7, r8, r9, r10, r11, r12)
            X.1xC r2 = X.1xC.A01
            java.lang.Class<X.FVq> r1 = X.C50259FVq.class
            X.1wn r0 = r13.A0J
            r2.A02(r0, r1)
            X.0Tu r0 = X.0Tu.A05
            java.lang.String r1 = X.Dba.A0Z(r0)
            java.lang.String r0 = "UsernameSignUpFragment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.Boolean r0 = X.C49035EoF.A00()
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 == 0) goto L_0x0084
            X.1pg r2 = X.C49130Ept.A00()
            android.content.Context r1 = r13.requireContext()
            X.0aP r0 = r13.A00
            r2.A00(r1, r0, r4)
        L_0x0084:
            java.lang.Boolean r0 = X.C49036EoG.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009b
            X.1pg r2 = X.C49130Ept.A00()
            android.content.Context r1 = r13.requireContext()
            X.0aP r0 = r13.A00
            r2.A01(r1, r0, r4)
        L_0x009b:
            r0 = 283832225(0x10eaefa1, float:9.266593E-29)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00a2:
            java.lang.String r0 = r1.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0031
            com.instagram.registration.model.RegFlowExtras r1 = r13.A04
            X.EXD r0 = X.EXD.PHONE
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47454E3a.onCreate(android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: X.G7z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r0 = -1392272738(0xffffffffad039a9e, float:-7.48082E-12)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r3 = r21
            r1 = r22
            android.view.View r13 = X.DbT.A0C(r3, r1, r0)
            android.view.ViewGroup r1 = X.Dba.A04(r13)
            r0 = 2131628953(0x7f0e1399, float:1.8885213E38)
            r5 = 1
            r3.inflate(r0, r1, r5)
            r0 = 2131432828(0x7f0b157c, float:1.8487424E38)
            android.widget.TextView r1 = X.DbU.A0G(r13, r0)
            r0 = 2131956898(0x7f1314a2, float:1.9550365E38)
            r1.setText(r0)
            r0 = 2131432824(0x7f0b1578, float:1.8487416E38)
            android.widget.TextView r4 = X.DbU.A0G(r13, r0)
            r0 = r20
            java.lang.String r3 = r0.A00()
            r1 = 2131956899(0x7f1314a3, float:1.9550367E38)
            if (r3 != 0) goto L_0x003f
            r1 = 2131956900(0x7f1314a4, float:1.9550369E38)
        L_0x003f:
            r4.setText(r1)
            com.instagram.registration.ui.NotificationBar r1 = X.Dba.A0M(r13)
            r0.A05 = r1
            r1 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.view.View r1 = r13.requireViewById(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            r0.A08 = r1
            r1 = 2131443623(0x7f0b3fa7, float:1.850932E38)
            android.view.View r14 = r13.findViewById(r1)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0.A09 = r14
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.0aP r15 = r0.A00
            com.instagram.registration.model.RegFlowExtras r3 = r0.A04
            X.EXD r18 = r3.A01()
            X.EZy r1 = X.C48156EZy.A0H
            X.DiE r1 = r1.A00
            X.F2r r12 = new X.F2r
            r17 = r4
            r19 = r1
            r16 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.A01 = r12
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            android.view.View$OnFocusChangeListener r3 = r0.A0I
            r4.setOnFocusChangeListener(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r0.A08
            r3.setAllowTextSelection(r5)
            r3 = 2131443607(0x7f0b3f97, float:1.8509287E38)
            android.view.View r3 = r13.findViewById(r3)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r3 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r3
            r0.A06 = r3
            r3 = 2131443608(0x7f0b3f98, float:1.8509289E38)
            android.view.ViewGroup r4 = X.DbS.A0E(r13, r3)
            android.animation.TimeInterpolator r3 = com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A09
            X.C49165EqW.A00(r4)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            android.text.TextWatcher r3 = r0.A0H
            r4.addTextChangedListener(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r7 = r0.A08
            r11 = 0
            android.content.Context r3 = r0.getContext()
            X.ERU r6 = new X.ERU
            r6.<init>(r3, r0)
            r4 = 30
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            r3.<init>(r4)
            android.text.InputFilter[] r3 = new android.text.InputFilter[]{r6, r3}
            r7.setFilters(r3)
            r3 = 2131436967(0x7f0b25a7, float:1.849582E38)
            android.view.View r7 = r13.findViewById(r3)
            com.instagram.ui.widget.progressbutton.ProgressButton r7 = (com.instagram.ui.widget.progressbutton.ProgressButton) r7
            r0.A07 = r7
            X.0aP r6 = r0.A00
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.EEK r3 = new X.EEK
            r3.<init>(r4, r6, r0, r7)
            r0.A0E = r3
            r0.registerLifecycleListener(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.0aP r3 = r0.A00
            android.content.Context r15 = r0.getContext()
            X.0gy r16 = X.AnonymousClass07i.A00(r0)
            X.F2c r14 = new X.F2c
            r17 = r3
            r18 = r0
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r0.A03 = r14
            android.content.Context r6 = r0.requireContext()
            android.widget.ImageView r4 = r0.A09
            X.F37 r3 = new X.F37
            r3.<init>(r6, r4)
            r0.A02 = r3
            X.0aP r7 = r0.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.F2b r3 = new X.F2b
            r3.<init>(r4, r7, r0, r6)
            r0.A0D = r3
            java.lang.String r7 = r0.A00()
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r0.A08
            boolean r3 = X.0nA.A0z(r3)
            if (r3 == 0) goto L_0x0153
            if (r7 == 0) goto L_0x0153
            X.0aP r4 = r0.A00
            com.instagram.registration.model.RegFlowExtras r3 = r0.A04
            X.EXD r3 = r3.A01()
            X.C49226ErV.A00(r4, r3, r1, r7)
            X.0aP r6 = r0.A00
            java.lang.String r4 = r1.A01
            com.instagram.registration.model.RegFlowExtras r3 = r0.A04
            X.EXD r3 = r3.A01()
            X.0qQ.A0B(r6, r11)
            X.0qQ.A0B(r4, r5)
            X.1Ln r3 = X.C49221ErQ.A00(r6, r3, r4)
            r3.Cgf()
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r0.A08
            r3.setText(r7)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            int r3 = r7.length()
            r4.setSelection(r3)
            X.F37 r3 = r0.A02
            r3.A01()
            android.os.Handler r4 = r0.A0F
            java.lang.Runnable r3 = r0.A0G
            r4.removeCallbacks(r3)
        L_0x0153:
            X.F2b r3 = r0.A0D
            r3.A04 = r5
            com.instagram.registration.model.RegFlowExtras r5 = r0.A04
            X.EXD r4 = r5.A01()
            X.EXD r3 = X.EXD.PHONE
            if (r4 != r3) goto L_0x01cf
            X.1xC r5 = X.1xC.A01
            java.lang.Class<X.FVu> r4 = X.C50263FVu.class
            X.FXG r3 = new X.FXG
            r3.<init>(r0)
            r0.A0C = r3
        L_0x016c:
            r5.A02(r3, r4)
        L_0x016f:
            X.1xC r5 = X.1xC.A01
            java.lang.Class<X.FVs> r4 = X.C50261FVs.class
            X.FXE r3 = new X.FXE
            r3.<init>(r0)
            r0.A0A = r3
            r5.A02(r3, r4)
            r3 = 2131438228(0x7f0b2a94, float:1.8498377E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r13, r3)
            com.instagram.registration.model.RegFlowExtras r3 = r0.A04
            java.lang.String r4 = r3.A0X
            java.lang.String r3 = "kr"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x01b4
            android.content.Context r4 = r0.getContext()
            X.0aP r6 = r0.A00
            com.instagram.registration.model.RegFlowExtras r3 = r0.A04
            java.lang.String r8 = r3.A0X
            X.EXD r7 = r3.A01()
            r9 = 0
            r10 = r9
            r12 = r11
            X.C49958FGq.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = 2131430667(0x7f0b0d0b, float:1.8483041E38)
            android.widget.TextView r5 = X.DbU.A0G(r13, r3)
            android.content.Context r4 = r0.requireContext()
            X.0aP r3 = r0.A00
            X.C49958FGq.A02(r4, r5, r3)
        L_0x01b4:
            X.14i r3 = X.14i.A08
            r3.A0A(r0)
            X.FFr r4 = X.C49938FFr.A00
            X.0aP r3 = r0.A00
            java.lang.String r1 = r1.A01
            com.instagram.registration.model.RegFlowExtras r0 = r0.A04
            X.EXD r0 = r0.A01()
            r4.A02(r3, r0, r1)
            r0 = -2001029771(0xffffffff88bab575, float:-1.1237128E-33)
            X.AnonymousClass0fD.A09(r0, r2)
            return r13
        L_0x01cf:
            X.EXD r4 = r5.A01()
            X.EXD r3 = X.EXD.A03
            if (r4 != r3) goto L_0x016f
            X.1xC r5 = X.1xC.A01
            java.lang.Class<X.FVo> r4 = X.C50257FVo.class
            X.FXF r3 = new X.FXF
            r3.<init>(r0)
            r0.A0B = r3
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47454E3a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1824451168);
        super.onDestroy();
        1xC.A01.A03(this.A0J, C50259FVq.class);
        AnonymousClass0fD.A09(1798676529, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1031220482);
        super.onDestroyView();
        unregisterLifecycleListener(this.A0E);
        14i.A06(this);
        this.A08.removeTextChangedListener(this.A0H);
        this.A08.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        this.A08.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.A05 = null;
        this.A08 = null;
        this.A01 = null;
        this.A0E = null;
        this.A06 = null;
        this.A09 = null;
        this.A07 = null;
        FXG fxg = this.A0C;
        if (fxg != null) {
            1xC.A01.A03(fxg, C50263FVu.class);
            this.A0C = null;
        }
        FXF fxf = this.A0B;
        if (fxf != null) {
            1xC.A01.A03(fxf, C50257FVo.class);
            this.A0B = null;
        }
        FXE fxe = this.A0A;
        if (fxe != null) {
            1xC.A01.A03(fxe, C50261FVs.class);
            this.A0A = null;
        }
        AnonymousClass0fD.A09(533743747, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2134887420);
        C47454E3a.super.onPause();
        0nA.A0N(this.A08);
        this.A05.A03();
        this.A0F.removeCallbacksAndMessages((Object) null);
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setSoftInputMode(0);
        AnonymousClass0fD.A09(-1629268665, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(717935462);
        super.onResume();
        C49958FGq.A06(this.A08);
        Dbb.A0h(requireActivity());
        AnonymousClass0fD.A09(1617406560, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-2039613888);
        C47454E3a.super.onStart();
        AnonymousClass0fD.A09(-1824514499, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-742948969);
        C47454E3a.super.onStop();
        AnonymousClass0fD.A09(1507949634, A022);
    }
}
