package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.Set;

public final class UZZ extends AnonymousClass4DH implements AnonymousClass4DS, CallerContextable {
    public static final String __redex_internal_original_name = "PromoteProfileVisitSettingFragment";
    public InstagramProfileCallToActionDestinations A00 = InstagramProfileCallToActionDestinations.WHATSAPP_MESSAGE;
    public WGU A01;
    public C376009Ge A02;
    public PromoteData A03;
    public PromoteState A04;
    public U5O A05;
    public U5O A06;
    public String A07 = "";
    public boolean A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C13992Tns.A0s(r2, this.A07);
    }

    public final String getModuleName() {
        return "promote_profile_visit_setting";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e5, code lost:
        if (X.W3E.A00(r4, r0) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        if (X.W3E.A08(r1, true) != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        r8 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r5 = 0
            X.0qQ.A0B(r13, r5)
            super.onViewCreated(r13, r14)
            com.instagram.business.promote.model.PromoteState r0 = X.XA9.A00(r12)
            r12.A04 = r0
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            java.lang.String r11 = "promoteData"
            if (r0 == 0) goto L_0x02f5
            r6 = 1
            boolean r0 = X.W3E.A08(r0, r6)
            r12.A09 = r0
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            java.util.List r0 = r0.A1q
            java.lang.Object r0 = r0.get(r5)
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r0 = (com.instagram.api.schemas.InstagramProfileCallToActionDestinations) r0
            X.0qQ.A0A(r0)
            int r1 = X.DbU.A02(r0, r5)
            if (r1 == r6) goto L_0x016c
            r0 = 6
            if (r1 != r0) goto L_0x016c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0034:
            boolean r3 = r12.A09
            r1 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r2 = X.DbU.A0G(r13, r1)
            if (r3 == 0) goto L_0x015c
            r1 = 2131970430(0x7f13497e, float:1.957781E38)
        L_0x0042:
            r2.setText(r1)
            boolean r1 = r12.A09
            if (r1 == 0) goto L_0x012e
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            X.DbX.A1B(r13, r0)
        L_0x004f:
            r0 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r13, r0)
            X.61u r3 = (X.C3021461u) r3
            r0 = 2131970424(0x7f134978, float:1.9577799E38)
            java.lang.String r2 = r12.getString(r0)
            r1 = 52
            X.WBB r0 = new X.WBB
            r0.<init>(r12, r1)
            r3.setPrimaryAction(r2, r0)
            r0 = 2131440857(0x7f0b34d9, float:1.850371E38)
            android.view.ViewGroup r7 = X.DbX.A0I(r13, r0)
            r7.removeAllViews()
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            java.util.List r0 = r0.A1q
            X.0qQ.A06(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0080:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r4 = r10.next()
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r4 = (com.instagram.api.schemas.InstagramProfileCallToActionDestinations) r4
            X.0qQ.A0A(r4)
            int r1 = X.DbU.A02(r4, r5)
            if (r1 == r6) goto L_0x012a
            r0 = 6
            if (r1 != r0) goto L_0x0080
            java.lang.Integer r9 = X.AnonymousClass05K.A01
        L_0x009a:
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131628531(0x7f0e11f3, float:1.8884357E38)
            r8 = 0
            android.view.View r3 = r1.inflate(r0, r7, r5)
            r0 = 2131442937(0x7f0b3cf9, float:1.8507928E38)
            android.widget.TextView r1 = X.DbU.A0G(r3, r0)
            r0 = 2131970423(0x7f134977, float:1.9577797E38)
            r1.setText(r0)
            boolean r2 = r12.A09
            r0 = 2131442935(0x7f0b3cf7, float:1.8507924E38)
            android.widget.TextView r1 = X.DbU.A0G(r3, r0)
            if (r2 == 0) goto L_0x011c
            r0 = 2131970429(0x7f13497d, float:1.9577809E38)
        L_0x00c5:
            r1.setText(r0)
            r0 = 2131442936(0x7f0b3cf8, float:1.8507926E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r3, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            java.util.Set r0 = r0.A24
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00e7
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            boolean r0 = X.W3E.A00(r4, r0)
            if (r0 != 0) goto L_0x0106
        L_0x00e7:
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            java.util.Set r0 = r0.A24
            X.0qQ.A06(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0107
            com.instagram.business.promote.model.PromoteData r1 = r12.A03
            if (r1 == 0) goto L_0x02f5
            com.instagram.business.promote.model.PromoteState r0 = r12.A04
            if (r0 == 0) goto L_0x02f3
            boolean r0 = X.W3E.A08(r1, r6)
            if (r0 == 0) goto L_0x0107
        L_0x0106:
            r8 = 1
        L_0x0107:
            r2.setChecked(r8)
            boolean r0 = r2.isChecked()
            r12.A08 = r0
            X.WYO r0 = new X.WYO
            r0.<init>(r6, r4, r12)
            r2.A07 = r0
            r7.addView(r3)
            goto L_0x0080
        L_0x011c:
            int r0 = r9.intValue()
            if (r0 == 0) goto L_0x0126
            r0 = 2131970421(0x7f134975, float:1.9577793E38)
            goto L_0x00c5
        L_0x0126:
            r0 = 2131970422(0x7f134976, float:1.9577795E38)
            goto L_0x00c5
        L_0x012a:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x009a
        L_0x012e:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0158
            r1 = 2131970425(0x7f134979, float:1.95778E38)
        L_0x0137:
            java.lang.String r0 = r12.A07
            java.lang.String r4 = X.C13991Tnr.A0d(r12, r0, r1)
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            android.widget.TextView r3 = X.DbU.A0G(r13, r0)
            java.lang.String r2 = r12.A07
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r4)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r6)
            X.AnonymousClass7AV.A02(r1, r0, r2)
            r3.setText(r1)
            goto L_0x004f
        L_0x0158:
            r1 = 2131970426(0x7f13497a, float:1.9577803E38)
            goto L_0x0137
        L_0x015c:
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x0167
            r1 = 2131970427(0x7f13497b, float:1.9577805E38)
            goto L_0x0042
        L_0x0167:
            r1 = 2131970428(0x7f13497c, float:1.9577807E38)
            goto L_0x0042
        L_0x016c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0034
        L_0x0170:
            X.WGU r0 = r12.A01
            if (r0 == 0) goto L_0x02f0
            X.UzE r2 = X.C16678UzE.PROFILE_VISIT_SETTING
            X.C13988Tno.A1J(r0, r2)
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x02e6
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            java.util.Set r0 = r0.A24
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r4 = com.instagram.api.schemas.InstagramProfileCallToActionDestinations.DIRECT_MESSAGE
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x02ec
            r0 = r4
        L_0x018c:
            r12.A00 = r0
            r0 = 2131438880(0x7f0b2d20, float:1.84997E38)
            android.view.View r0 = r13.requireViewById(r0)
            r9 = 0
            r0.setVisibility(r5)
            android.content.Context r1 = r12.requireContext()
            X.U5O r0 = new X.U5O
            r0.<init>(r1)
            r12.A05 = r0
            android.content.Context r1 = r12.requireContext()
            X.U5O r0 = new X.U5O
            r0.<init>(r1)
            r12.A06 = r0
            X.U5O r0 = r12.A05
            if (r0 == 0) goto L_0x02e6
            r0 = 2131438878(0x7f0b2d1e, float:1.8499695E38)
            android.view.ViewGroup r7 = X.DbX.A0I(r13, r0)
            r0 = 2131438879(0x7f0b2d1f, float:1.8499697E38)
            X.DbT.A1F(r13, r0, r5)
            X.U5O r1 = r12.A05
            if (r1 == 0) goto L_0x01ca
            r0 = 2131970362(0x7f13493a, float:1.9577673E38)
            r1.setPrimaryText((int) r0)
        L_0x01ca:
            X.U5O r5 = r12.A05
            if (r5 == 0) goto L_0x01e3
            r3 = 64
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r12.A0A
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            java.lang.String r0 = r0.getUsername()
            java.lang.String r0 = X.002.A0D(r0, r3)
            r5.setSecondaryText((java.lang.String) r0)
        L_0x01e3:
            X.U5O r0 = r12.A05
            if (r0 == 0) goto L_0x01ea
            r0.A04(r6)
        L_0x01ea:
            X.U5O r3 = r12.A05
            if (r3 == 0) goto L_0x01f7
            r1 = 2
            X.Wem r0 = new X.Wem
            r0.<init>(r12, r1)
            r3.A9W(r0)
        L_0x01f7:
            com.instagram.business.promote.model.PromoteState r0 = r12.A04
            if (r0 == 0) goto L_0x02f3
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            java.util.List r1 = r0.A1p
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            boolean r0 = r1.contains(r0)
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x02c1
            X.9F0 r8 = X.C375769Ez.A00
            com.instagram.business.promote.model.PromoteData r0 = r12.A03
            if (r0 == 0) goto L_0x02f5
            boolean r0 = X.AnonymousClass9F0.A04(r0)
            if (r0 == 0) goto L_0x02c1
            X.U5O r1 = r12.A06
            if (r1 == 0) goto L_0x0221
            r0 = 2131976852(0x7f136294, float:1.9590836E38)
            r1.setPrimaryText((int) r0)
        L_0x0221:
            X.U5O r5 = r12.A06
            if (r5 == 0) goto L_0x0251
            X.9Ge r0 = r12.A02
            if (r0 == 0) goto L_0x024d
            X.9Gd r10 = r0.A00
            if (r10 == 0) goto L_0x024d
            X.0eM r0 = r12.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Class<X.UZZ> r0 = X.UZZ.class
            X.9JK r0 = X.AnonymousClass9F0.A00(r0)
            java.lang.String r1 = r10.A00(r0, r1)
            if (r1 == 0) goto L_0x024d
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.formatNumber(r1, r0)
            if (r0 != 0) goto L_0x024e
        L_0x024d:
            r0 = r3
        L_0x024e:
            r5.setSecondaryText((java.lang.String) r0)
        L_0x0251:
            X.U5O r0 = r12.A06
            if (r0 == 0) goto L_0x0258
            r0.A04(r6)
        L_0x0258:
            X.U5O r5 = r12.A06
            if (r5 == 0) goto L_0x026d
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            X.0eM r0 = r12.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            android.text.SpannableStringBuilder r0 = r8.A08(r1, r0)
            r5.setSecondaryWarningText(r0)
        L_0x026d:
            X.U5O r5 = r12.A06
            if (r5 == 0) goto L_0x027b
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r1 = r12.A00
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r0 = com.instagram.api.schemas.InstagramProfileCallToActionDestinations.WHATSAPP_MESSAGE
            if (r1 != r0) goto L_0x0278
            r9 = 1
        L_0x0278:
            r5.A05(r9)
        L_0x027b:
            X.U5O r9 = r12.A06
            com.instagram.business.promote.model.PromoteData r5 = r12.A03
            if (r5 == 0) goto L_0x02f5
            if (r9 == 0) goto L_0x02a2
            boolean r0 = r5.A2u
            if (r0 != 0) goto L_0x028b
            boolean r0 = r5.A2o
            if (r0 == 0) goto L_0x02a2
        L_0x028b:
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            X.0eM r0 = r12.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            android.text.SpannableStringBuilder r0 = r8.A05(r1, r5, r0)
            r9.setWarningText(r0)
            r9.A06(r6)
            r9.A00()
        L_0x02a2:
            X.U5O r5 = r12.A06
            if (r5 == 0) goto L_0x02af
            r1 = 3
            X.Wem r0 = new X.Wem
            r0.<init>(r12, r1)
            r5.A9W(r0)
        L_0x02af:
            X.U5O r1 = r12.A06
            if (r1 == 0) goto L_0x02b8
            r0 = 53
            X.WBB.A01(r1, r0, r12)
        L_0x02b8:
            X.U5O r1 = r12.A05
            if (r1 == 0) goto L_0x02c1
            r0 = 54
            X.WBB.A01(r1, r0, r12)
        L_0x02c1:
            X.U5O r0 = r12.A05
            r7.addView(r0)
            X.U5O r0 = r12.A06
            r7.addView(r0)
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r1 = r12.A00
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r0 = com.instagram.api.schemas.InstagramProfileCallToActionDestinations.WHATSAPP_MESSAGE
            if (r1 != r0) goto L_0x02e7
            X.U5O r0 = r12.A06
        L_0x02d3:
            if (r0 == 0) goto L_0x02d8
            r0.setChecked(r6)
        L_0x02d8:
            boolean r0 = r12.A08
            A00(r12, r0)
            X.WGU r1 = r12.A01
            if (r1 == 0) goto L_0x02f0
            java.lang.String r0 = "secondary_cta_message_app_selector"
            r1.A0K(r2, r0, r3, r3)
        L_0x02e6:
            return
        L_0x02e7:
            if (r1 != r4) goto L_0x02d8
            X.U5O r0 = r12.A05
            goto L_0x02d3
        L_0x02ec:
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r0 = com.instagram.api.schemas.InstagramProfileCallToActionDestinations.WHATSAPP_MESSAGE
            goto L_0x018c
        L_0x02f0:
            java.lang.String r11 = "promoteLogger"
            goto L_0x02f5
        L_0x02f3:
            java.lang.String r11 = "promoteState"
        L_0x02f5:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZZ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(UZZ uzz, boolean z) {
        U5O u5o = uzz.A05;
        if (u5o != null && uzz.A06 != null) {
            if (z) {
                u5o.setAlpha(1.0f);
                U5O u5o2 = uzz.A06;
                if (u5o2 != null) {
                    u5o2.setAlpha(1.0f);
                }
                U5O u5o3 = uzz.A05;
                if (u5o3 != null) {
                    u5o3.A01();
                }
                U5O u5o4 = uzz.A06;
                if (u5o4 != null) {
                    u5o4.A01();
                    return;
                }
                return;
            }
            u5o.setAlpha(0.5f);
            U5O u5o5 = uzz.A06;
            if (u5o5 != null) {
                u5o5.setAlpha(0.5f);
            }
            U5O u5o6 = uzz.A05;
            if (u5o6 != null) {
                u5o6.A00();
            }
            U5O u5o7 = uzz.A06;
            if (u5o7 != null) {
                u5o7.A00();
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(895115839);
        UZZ.super.onCreate(bundle);
        this.A03 = XAI.A00(this);
        AnonymousClass0eM r2 = this.A0A;
        this.A01 = JTU.A0D(r2);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("profile_visit_primary_text")) == null) {
            str = DbU.A0m(this, 2131970413);
        }
        this.A07 = str;
        this.A02 = AnonymousClass9F0.A01(AnonymousClass9F0.A00(UZZ.class), AnonymousClass7TE.A0l(r2));
        AnonymousClass0fD.A09(-1962557312, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1826161608);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_profile_visit_setting_view, viewGroup, false);
        AnonymousClass0fD.A09(1871052396, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(1789062174);
        super.onDestroyView();
        WGU wgu = this.A01;
        if (wgu == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                wgu.A0B(C16678UzE.PROFILE_VISIT_SETTING, promoteData);
                this.A05 = null;
                this.A06 = null;
                AnonymousClass0fD.A09(1299343847, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        C16678UzE uzE;
        String str;
        int A022 = AnonymousClass0fD.A02(486109342);
        PromoteData promoteData = this.A03;
        String str2 = "promoteData";
        if (promoteData != null) {
            if (this.A04 == null) {
                str2 = "promoteState";
            } else {
                if (W3E.A08(promoteData, true)) {
                    PromoteData promoteData2 = this.A03;
                    if (promoteData2 != null) {
                        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = this.A00;
                        boolean z = this.A08;
                        WGU wgu = this.A01;
                        if (wgu == null) {
                            str2 = "promoteLogger";
                        } else {
                            0qQ.A0B(instagramProfileCallToActionDestinations, 1);
                            promoteData2.A24.clear();
                            Set set = promoteData2.A24;
                            if (z) {
                                set.add(instagramProfileCallToActionDestinations);
                                if (instagramProfileCallToActionDestinations == InstagramProfileCallToActionDestinations.WHATSAPP_MESSAGE) {
                                    uzE = C16678UzE.PROFILE_VISIT_SETTING;
                                    str = "whatsapp_message_secondary_cta_radio_button";
                                } else if (instagramProfileCallToActionDestinations == InstagramProfileCallToActionDestinations.DIRECT_MESSAGE) {
                                    uzE = C16678UzE.PROFILE_VISIT_SETTING;
                                    str = "direct_message_secondary_cta_radio_button";
                                }
                            } else {
                                set.remove(instagramProfileCallToActionDestinations);
                                uzE = C16678UzE.PROFILE_VISIT_SETTING;
                                str = "no_secondary_cta_radio_button";
                            }
                            wgu.A0F(uzE, str);
                        }
                    }
                }
                UZZ.super.onStop();
                AnonymousClass0fD.A09(1825578411, A022);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
