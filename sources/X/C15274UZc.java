package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UZc  reason: case insensitive filesystem */
public final class C15274UZc extends AnonymousClass4DH implements AnonymousClass4DS, X6O, X3L, B1D, CallerContextable {
    public static final String __redex_internal_original_name = "PromoteMessagingAppsFragment";
    public View A00;
    public View A01;
    public View A02;
    public XIGIGBoostCallToAction A03;
    public XIGIGBoostDestination A04;
    public C16678UzE A05;
    public WGU A06;
    public C376009Ge A07;
    public C18784W1k A08;
    public C18654Vw9 A09;
    public PromoteData A0A;
    public PromoteState A0B;
    public U5O A0C;
    public U5O A0D;
    public IgRadioGroup A0E;
    public boolean A0F;
    public WT8 A0G;
    public C18654Vw9 A0H;
    public final String A0I = "PromoteMessagingApps";
    public final AnonymousClass0eM A0J = C227642jf.A02(this);
    public final 1wn A0K = new C19221WQb(this, 14);

    public final void DFD() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r7) {
        /*
            r6 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            r0 = 2131970380(0x7f13494c, float:1.957771E38)
            r7.Eom(r0)
            X.3JR r2 = X.DbV.A0K()
            r1 = 59
            X.WBB r0 = new X.WBB
            r0.<init>(r6, r1)
            X.DbX.A1A(r0, r2, r7)
            boolean r0 = r6.A04()
            java.lang.String r5 = "Required value was null."
            if (r0 != 0) goto L_0x0068
            com.instagram.business.promote.model.PromoteData r0 = r6.A0A
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A2m
            if (r0 == 0) goto L_0x0068
            X.Vw9 r0 = r6.A09
            if (r0 == 0) goto L_0x002f
            r0.A01()
        L_0x002f:
            X.Vw9 r2 = r6.A09
            if (r2 == 0) goto L_0x00a4
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970410(0x7f13496a, float:1.957777E38)
            java.lang.String r0 = r1.getString(r0)
            X.C18165Vmf.A01(r6, r2, r0)
            X.Vw9 r1 = r6.A09
            if (r1 == 0) goto L_0x004c
            boolean r0 = r6.A05()
            r1.A04(r0)
        L_0x004c:
            com.instagram.business.promote.model.PromoteData r0 = r6.A0A
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A2m
            if (r0 == 0) goto L_0x0067
            android.view.View r1 = r6.mView
            if (r1 == 0) goto L_0x0067
            r0 = 2131427584(0x7f0b0100, float:1.8476788E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 61
            X.WBB.A01(r1, r0, r6)
            r1.setVisibility(r3)
        L_0x0067:
            return
        L_0x0068:
            X.Vw9 r0 = r6.A0H
            if (r0 == 0) goto L_0x006f
            r0.A01()
        L_0x006f:
            X.0eM r0 = r6.A0J
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36326489792198436(0x810ec000003724, double:3.0363566473952775E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            X.Vw9 r2 = r6.A0H
            if (r0 == 0) goto L_0x009a
            if (r2 == 0) goto L_0x00b4
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970410(0x7f13496a, float:1.957777E38)
        L_0x008f:
            java.lang.String r0 = r1.getString(r0)
            X.C18165Vmf.A01(r6, r2, r0)
            A02(r6)
            goto L_0x004c
        L_0x009a:
            if (r2 == 0) goto L_0x00ba
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970439(0x7f134987, float:1.957783E38)
            goto L_0x008f
        L_0x00a4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x00aa:
            java.lang.String r0 = "promoteData"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x00ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15274UZc.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "promote_messaging_apps";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f3, code lost:
        if (r0 == null) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0168, code lost:
        if (A03() != false) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r9 = 0
            r7 = r25
            X.0qQ.A0B(r7, r9)
            r8 = r24
            r0 = r26
            super.onViewCreated(r7, r0)
            com.instagram.business.promote.model.PromoteData r0 = X.XAI.A00(r8)
            r8.A0A = r0
            com.instagram.business.promote.model.PromoteState r0 = X.XA9.A00(r8)
            r8.A0B = r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0536
            X.UzE r0 = X.C16678UzE.MESSAGING_APPS_EDIT
        L_0x001f:
            r8.A05 = r0
            X.0eM r6 = r8.A0J
            X.WGU r0 = X.JTU.A0D(r6)
            r8.A06 = r0
            r0 = 2131428375(0x7f0b0417, float:1.8478393E38)
            android.view.View r0 = r7.requireViewById(r0)
            r8.A00 = r0
            r0 = 2131436256(0x7f0b22e0, float:1.8494377E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r0
            r8.A0E = r0
            r0 = 2131444014(0x7f0b412e, float:1.8510112E38)
            android.view.View r0 = r7.requireViewById(r0)
            r8.A02 = r0
            r0 = 2131443994(0x7f0b411a, float:1.8510072E38)
            android.view.View r0 = r7.requireViewById(r0)
            r8.A01 = r0
            android.content.Context r1 = r8.requireContext()
            X.U5O r0 = new X.U5O
            r0.<init>(r1)
            r8.A0C = r0
            android.content.Context r1 = r8.requireContext()
            X.U5O r0 = new X.U5O
            r0.<init>(r1)
            r8.A0D = r0
            com.instagram.business.promote.model.PromoteData r1 = r8.A0A
            java.lang.String r22 = "promoteData"
            if (r1 == 0) goto L_0x00c0
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r1.A0e
            r8.A03 = r0
            boolean r0 = r1.A2u
            java.lang.String r23 = "headerViewContainer"
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r1.A2o
            if (r0 != 0) goto L_0x00c8
            X.0lg r2 = X.AnonymousClass7TF.A0L(r6, r9)
            X.0Tu r3 = X.0Tu.A06
            r0 = 36331184191456196(0x811305000043c4, double:3.0393254043887135E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x0099
            X.0lg r2 = X.AnonymousClass7TF.A0L(r6, r9)
            r0 = 36331184191521733(0x811305000143c5, double:3.0393254044301594E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x00c8
        L_0x0099:
            android.view.View r1 = r8.A00
            if (r1 == 0) goto L_0x038a
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131970379(0x7f13494b, float:1.9577707E38)
        L_0x00a7:
            r1.setText(r0)
            android.view.View r1 = r8.A00
            if (r1 == 0) goto L_0x038a
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r1, r0)
            r5 = 8
            r0.setVisibility(r5)
            com.instagram.business.promote.model.PromoteState r0 = r8.A0B
            if (r0 != 0) goto L_0x00d7
            java.lang.String r22 = "promoteState"
        L_0x00c0:
            X.0qQ.A0F(r22)
        L_0x00c3:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c8:
            android.view.View r1 = r8.A00
            if (r1 == 0) goto L_0x038a
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131970378(0x7f13494a, float:1.9577705E38)
            goto L_0x00a7
        L_0x00d7:
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 == 0) goto L_0x00c0
            java.util.List r1 = r0.A1p
            com.instagram.api.schemas.XIGIGBoostDestination r21 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            r0 = r21
            boolean r0 = r1.contains(r0)
            java.lang.String r20 = "messagingAppsRadioGroup"
            r4 = 1
            java.lang.String r19 = "messengerRadioButton"
            java.lang.String r23 = "multiDestinationRadioButton"
            if (r0 == 0) goto L_0x052a
            X.9F0 r1 = X.C375769Ez.A00
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 == 0) goto L_0x00c0
            boolean r0 = X.AnonymousClass9F0.A04(r0)
            if (r0 == 0) goto L_0x052a
            android.content.Context r0 = r8.requireContext()
            X.U5O r12 = new X.U5O
            r12.<init>(r0)
            boolean r2 = r8.A0F
            r0 = 2131976852(0x7f136294, float:1.9590836E38)
            if (r2 == 0) goto L_0x010d
            r0 = 2131970456(0x7f134998, float:1.9577864E38)
        L_0x010d:
            r12.setPrimaryText((int) r0)
            X.9Ge r0 = r8.A07
            if (r0 == 0) goto L_0x0136
            X.9Gd r3 = r0.A00
            if (r3 == 0) goto L_0x0136
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Class<X.UZc> r0 = X.C15274UZc.class
            X.9JK r0 = X.AnonymousClass9F0.A00(r0)
            java.lang.String r2 = r3.A00(r0, r2)
            if (r2 == 0) goto L_0x0136
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.formatNumber(r2, r0)
            if (r0 != 0) goto L_0x0138
        L_0x0136:
            java.lang.String r0 = ""
        L_0x0138:
            r12.setSecondaryText((java.lang.String) r0)
            r12.A04(r4)
            android.content.Context r2 = r8.requireContext()
            r0 = 2131970468(0x7f1349a4, float:1.9577888E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r2, r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            r2 = 60
            X.WBB r0 = new X.WBB
            r0.<init>(r8, r2)
            r12.setActionLabel(r10, r3, r0)
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 == 0) goto L_0x00c0
            com.instagram.api.schemas.XIGIGBoostDestination r2 = r0.A0j
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            if (r2 == r0) goto L_0x016a
            boolean r2 = r8.A03()
            r11 = 1
            r0 = r21
            if (r2 == 0) goto L_0x016c
        L_0x016a:
            r11 = 0
            r0 = 0
        L_0x016c:
            r8.A04 = r0
            boolean r3 = r8.A0F
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            if (r3 == 0) goto L_0x0524
            android.text.SpannableStringBuilder r0 = r1.A07(r2, r0)
        L_0x017e:
            r12.setSecondaryWarningText(r0)
            r12.A05(r11)
            com.instagram.business.promote.model.PromoteData r13 = r8.A0A
            if (r13 == 0) goto L_0x00c0
            boolean r0 = r13.A2u
            if (r0 != 0) goto L_0x0190
            boolean r0 = r13.A2o
            if (r0 == 0) goto L_0x0216
        L_0x0190:
            boolean r0 = r8.A0F
            androidx.fragment.app.FragmentActivity r10 = r8.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            if (r0 == 0) goto L_0x0518
            r0 = 2
            X.0qQ.A0B(r3, r0)
            r0 = 2131970394(0x7f13495a, float:1.9577738E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r10, r0)
            r1 = 2131970382(0x7f13494e, float:1.9577714E38)
            r0 = r18
            java.lang.String r17 = X.DbY.A0c(r10, r0, r1)
            r0 = 2131970387(0x7f134953, float:1.9577724E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r10, r0)
            boolean r0 = r13.A2X
            if (r0 == 0) goto L_0x050f
            r1 = 2131970384(0x7f134950, float:1.9577718E38)
            r0 = r16
            java.lang.String r15 = X.DbW.A0h(r10, r0, r1)
        L_0x01c4:
            X.0qQ.A0A(r15)
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>()
            boolean r0 = r13.A2u
            java.lang.String r2 = "\n"
            if (r0 == 0) goto L_0x01e1
            r14.append(r2)
            r0 = r17
            r14.append(r0)
            java.lang.String r0 = "https://faq.whatsapp.com/465883178708358/?helpref=hc_fnav"
            r1 = r18
            X.AnonymousClass9F0.A02(r14, r10, r3, r1, r0)
        L_0x01e1:
            boolean r0 = r13.A2o
            if (r0 == 0) goto L_0x01fa
            r14.append(r2)
            r14.append(r15)
            boolean r0 = r13.A2X
            if (r0 == 0) goto L_0x01fa
            r0 = 3255(0xcb7, float:4.561E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = r16
            X.AnonymousClass9F0.A02(r14, r10, r3, r0, r1)
        L_0x01fa:
            r12.setSecondaryWarningText(r14)
            r12.A05(r4)
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r12, r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r0)
            r12.A04(r9)
        L_0x0210:
            r12.A00()
            A02(r8)
        L_0x0216:
            X.Weo r0 = new X.Weo
            r0.<init>(r9, r12, r7, r8)
            r12.A9W(r0)
            r1 = 61
            X.WBH r0 = new X.WBH
            r0.<init>((int) r1, (java.lang.Object) r12, (java.lang.Object) r8)
            X.AnonymousClass0fU.A00(r0, r12)
            X.U5O r1 = r8.A0C
            if (r1 == 0) goto L_0x0453
            r0 = 62
            X.WBH.A01(r1, r0, r12, r8)
            X.U5O r1 = r8.A0D
            if (r1 == 0) goto L_0x038a
            r0 = 63
            X.WBH.A01(r1, r0, r12, r8)
            r12.setChecked(r11)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r8.A0E
            if (r0 == 0) goto L_0x046c
            r0.addView(r12)
        L_0x0244:
            X.U5O r1 = r8.A0C
            if (r1 == 0) goto L_0x0453
            r0 = 2131970362(0x7f13493a, float:1.9577673E38)
            r1.setPrimaryText((int) r0)
            X.U5O r2 = r8.A0C
            if (r2 == 0) goto L_0x0453
            boolean r0 = r8.A0F
            if (r0 == 0) goto L_0x03fd
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r6)
            java.lang.String r0 = r0.getUsername()
        L_0x0260:
            r2.setSecondaryText((java.lang.String) r0)
            X.U5O r0 = r8.A0C
            if (r0 == 0) goto L_0x0453
            r0.A04(r4)
            X.U5O r2 = r8.A0C
            if (r2 == 0) goto L_0x0453
            r1 = 3
            X.Wen r0 = new X.Wen
            r0.<init>(r1, r7, r8)
            r2.A9W(r0)
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 == 0) goto L_0x00c0
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A0j
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            X.U5O r0 = r8.A0C
            if (r0 == 0) goto L_0x0453
            r0.setChecked(r1)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = r8.A0E
            if (r1 == 0) goto L_0x046c
            X.U5O r0 = r8.A0C
            if (r0 == 0) goto L_0x0453
            r1.addView(r0)
            com.instagram.business.promote.model.PromoteData r1 = r8.A0A
            if (r1 == 0) goto L_0x00c0
            boolean r0 = r1.A2u
            if (r0 != 0) goto L_0x0384
            boolean r0 = r1.A2o
            if (r0 != 0) goto L_0x0384
            X.0lg r0 = X.AnonymousClass7TF.A0L(r6, r9)
            X.0Tu r11 = X.0Tu.A05
            r2 = 36331184191456196(0x811305000043c4, double:3.0393254043887135E-306)
            boolean r0 = X.182.A06(r11, r0, r2)
            if (r0 != 0) goto L_0x02c1
            X.0lg r10 = X.AnonymousClass7TF.A0L(r6, r9)
            r0 = 36331184191521733(0x811305000143c5, double:3.0393254044301594E-306)
            boolean r0 = X.182.A06(r11, r10, r0)
            if (r0 == 0) goto L_0x0384
        L_0x02c1:
            X.0lg r0 = X.AnonymousClass7TF.A0L(r6, r9)
            X.0Tu r1 = X.0Tu.A06
            boolean r0 = X.182.A06(r1, r0, r2)
            X.U5O r10 = r8.A0D
            if (r0 == 0) goto L_0x03f6
            if (r10 == 0) goto L_0x038a
            r0 = 2131970363(0x7f13493b, float:1.9577675E38)
        L_0x02d4:
            r10.setPrimaryText((int) r0)
            android.content.Context r10 = r8.requireContext()
            r0 = 2131970366(0x7f13493e, float:1.9577681E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r10, r0)
            android.content.Context r10 = r8.requireContext()
            r0 = 2131970365(0x7f13493d, float:1.957768E38)
            java.lang.String r0 = X.DbY.A0c(r10, r12, r0)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r0)
            androidx.fragment.app.FragmentActivity r10 = r8.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            int r0 = X.2Yu.A06(r0)
            int r10 = r10.getColor(r0)
            X.UsR r0 = new X.UsR
            r0.<init>((X.C15274UZc) r8, (int) r10)
            X.AnonymousClass7AV.A05(r11, r0, r12)
            X.U5O r0 = r8.A0D
            if (r0 == 0) goto L_0x038a
            r0.setSecondaryText((java.lang.CharSequence) r11)
            X.U5O r12 = r8.A0D
            if (r12 == 0) goto L_0x038a
            X.9F0 r11 = X.C375769Ez.A00
            androidx.fragment.app.FragmentActivity r10 = r8.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            android.text.SpannableStringBuilder r0 = r11.A07(r10, r0)
            r12.setSecondaryWarningText(r0)
            X.U5O r0 = r8.A0D
            if (r0 == 0) goto L_0x038a
            r0.A04(r4)
            X.U5O r11 = r8.A0D
            if (r11 == 0) goto L_0x038a
            r10 = 4
            X.Wen r0 = new X.Wen
            r0.<init>(r10, r7, r8)
            r11.A9W(r0)
            X.1Av r13 = X.DbX.A0h(r6)
            X.0s0 r12 = r13.A2U
            X.0YZ[] r11 = X.1Av.A8a
            r10 = 114(0x72, float:1.6E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r13, r12, r11, r10)
            if (r0 != 0) goto L_0x036e
            X.0lg r0 = X.AnonymousClass7TF.A0L(r6, r9)
            boolean r1 = X.182.A06(r1, r0, r2)
            r0 = 2131970368(0x7f134940, float:1.9577685E38)
            if (r1 == 0) goto L_0x035a
            r0 = 2131970367(0x7f13493f, float:1.9577683E38)
        L_0x035a:
            X.6jx r2 = new X.6jx
            r2.<init>((int) r0)
            X.U5O r1 = r8.A0D
            if (r1 == 0) goto L_0x038a
            X.Wmo r0 = new X.Wmo
            r0.<init>(r8, r2)
            r1.post(r0)
            X.AnonymousClass7TF.A1J(r13, r12, r11, r10, r4)
        L_0x036e:
            X.U5O r1 = r8.A0D
            if (r1 == 0) goto L_0x038a
            boolean r0 = r8.A03()
            r1.setChecked(r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = r8.A0E
            if (r1 == 0) goto L_0x046c
            X.U5O r0 = r8.A0D
            if (r0 == 0) goto L_0x038a
            r1.addView(r0)
        L_0x0384:
            com.instagram.business.promote.model.PromoteState r0 = r8.A0B
            if (r0 != 0) goto L_0x038f
            java.lang.String r23 = "promoteState"
        L_0x038a:
            X.0qQ.A0F(r23)
            goto L_0x00c3
        L_0x038f:
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 == 0) goto L_0x00c0
            java.util.List r1 = r0.A1p
            r0 = r21
            boolean r0 = r1.contains(r0)
            java.lang.String r23 = "whatsAppLinkRowContainer"
            if (r0 == 0) goto L_0x03f1
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 == 0) goto L_0x00c0
            boolean r0 = X.AnonymousClass9F0.A04(r0)
            if (r0 != 0) goto L_0x03f1
            android.view.View r1 = r8.A02
            if (r1 == 0) goto L_0x038a
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r2 = X.DbU.A0G(r1, r0)
            boolean r1 = r8.A0F
            r0 = 2131970454(0x7f134996, float:1.957786E38)
            if (r1 == 0) goto L_0x03be
            r0 = 2131970456(0x7f134998, float:1.9577864E38)
        L_0x03be:
            r2.setText(r0)
            android.view.View r1 = r8.A02
            if (r1 == 0) goto L_0x038a
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r2 = X.DbU.A0G(r1, r0)
            boolean r1 = r8.A0F
            r0 = 2131970452(0x7f134994, float:1.9577855E38)
            if (r1 == 0) goto L_0x03d6
            r0 = 2131970453(0x7f134995, float:1.9577858E38)
        L_0x03d6:
            r2.setText(r0)
            android.view.View r1 = r8.A02
            if (r1 == 0) goto L_0x038a
            r0 = 62
            X.WBB.A01(r1, r0, r8)
            X.WGU r2 = r8.A06
            if (r2 != 0) goto L_0x03e9
            java.lang.String r23 = "promoteLogger"
            goto L_0x038a
        L_0x03e9:
            X.UzE r1 = r8.A05
            if (r1 != 0) goto L_0x040f
            java.lang.String r22 = "currentStep"
            goto L_0x00c0
        L_0x03f1:
            android.view.View r0 = r8.A02
            if (r0 != 0) goto L_0x0419
            goto L_0x038a
        L_0x03f6:
            if (r10 == 0) goto L_0x038a
            r0 = 2131970364(0x7f13493c, float:1.9577677E38)
            goto L_0x02d4
        L_0x03fd:
            r1 = 64
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r6)
            java.lang.String r0 = r0.getUsername()
            java.lang.String r0 = X.002.A0D(r0, r1)
            goto L_0x0260
        L_0x040f:
            java.lang.String r0 = "whatsapp_linking_row"
            r2.A0H(r1, r0)
            android.view.View r0 = r8.A02
            if (r0 == 0) goto L_0x038a
            r5 = 0
        L_0x0419:
            r0.setVisibility(r5)
            android.view.View r1 = r8.A01
            java.lang.String r19 = "welcomeMessageRowContainer"
            if (r1 == 0) goto L_0x0453
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131970756(0x7f134ac4, float:1.9578472E38)
            r1.setText(r0)
            android.view.View r1 = r8.A01
            if (r1 == 0) goto L_0x0453
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131970755(0x7f134ac3, float:1.957847E38)
            r1.setText(r0)
            android.view.View r1 = r8.A01
            if (r1 == 0) goto L_0x0453
            r0 = 2131438691(0x7f0b2c63, float:1.8499316E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r1, r0)
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 != 0) goto L_0x0458
            r19 = r22
        L_0x0453:
            X.0qQ.A0F(r19)
            goto L_0x00c3
        L_0x0458:
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r1 = r0.A0a
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r0 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.DEFAULT_WELCOME_MESSAGE_OPTED_IN
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r2.setChecked(r0)
            X.C18921WCy.A00(r2, r8, r4)
            X.WT8 r3 = r8.A0G
            if (r3 != 0) goto L_0x0471
            java.lang.String r20 = "userFlowLogger"
        L_0x046c:
            X.0qQ.A0F(r20)
            goto L_0x00c3
        L_0x0471:
            long r1 = r3.A00
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0480
            X.1QP r3 = r3.A01
            java.lang.String r0 = "messaging_selection_screen_rendered"
            r3.flowMarkPoint(r1, r0)
        L_0x0480:
            X.WGU r1 = r8.A06
            java.lang.String r20 = "promoteLogger"
            if (r1 == 0) goto L_0x046c
            X.UzE r0 = r8.A05
            java.lang.String r23 = "currentStep"
            if (r0 == 0) goto L_0x038a
            X.C13988Tno.A1J(r1, r0)
            X.UzE r1 = r8.A05
            if (r1 == 0) goto L_0x038a
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r7, r1)
            r8.A0H = r0
            X.UzE r1 = r8.A05
            if (r1 == 0) goto L_0x038a
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r7, r1)
            r8.A09 = r0
            com.instagram.business.promote.model.PromoteData r1 = r8.A0A
            if (r1 == 0) goto L_0x00c0
            boolean r0 = r1.A2C
            if (r0 == 0) goto L_0x04f2
            X.WGU r2 = r8.A06
            if (r2 == 0) goto L_0x046c
            com.instagram.model.mediatype.ProductType r6 = r1.A17
            java.lang.String r1 = r1.A1S
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r0 = "media_igid"
            r5.put(r0, r1)
            X.0wc r1 = r2.A05
            r0 = 302(0x12e, float:4.23E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            r2 = 0
            if (r6 == 0) goto L_0x04de
            int r1 = r6.ordinal()
            if (r1 == r4) goto L_0x050c
            r0 = 9
            if (r1 == r0) goto L_0x0509
            r0 = 13
            if (r1 != r0) goto L_0x04de
            X.KkS r2 = X.C62666KkS.BIO_IG_REELS
        L_0x04de:
            java.lang.String r0 = "entry_point"
            r3.A8M(r2, r0)
            java.lang.String r0 = "extra_data"
            r3.A9H(r0, r5)
            java.lang.String r1 = "seller_boost_bio_cta_selection_impression"
            java.lang.String r0 = "event"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x04f2:
            com.instagram.business.promote.model.PromoteData r0 = r8.A0A
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.A2m
            if (r0 == 0) goto L_0x0508
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.0qQ.A0C(r1, r0)
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            r1.A0a()
        L_0x0508:
            return
        L_0x0509:
            X.KkS r2 = X.C62666KkS.BIO_IG_STORY
            goto L_0x04de
        L_0x050c:
            X.KkS r2 = X.C62666KkS.BIO_IG_POST
            goto L_0x04de
        L_0x050f:
            r0 = 2131970386(0x7f134952, float:1.9577722E38)
            java.lang.String r15 = r10.getString(r0)
            goto L_0x01c4
        L_0x0518:
            android.text.SpannableStringBuilder r0 = r1.A05(r10, r13, r3)
            r12.setWarningText(r0)
            r12.A06(r4)
            goto L_0x0210
        L_0x0524:
            android.text.SpannableStringBuilder r0 = r1.A08(r2, r0)
            goto L_0x017e
        L_0x052a:
            boolean r0 = r8.A03()
            if (r0 != 0) goto L_0x0244
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            r8.A04 = r0
            goto L_0x0244
        L_0x0536:
            X.UzE r0 = X.C16678UzE.MESSAGING_APPS_SELECTION
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15274UZc.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(View view, C15274UZc uZc) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        XIGIGBoostCallToAction xIGIGBoostCallToAction2;
        PromoteData promoteData = uZc.A0A;
        String str = "promoteData";
        if (promoteData != null) {
            if (!promoteData.A2p) {
                ViewGroup A0I2 = DbX.A0I(view, R.id.message_option_group);
                A0I2.removeAllViews();
                XIGIGBoostDestination xIGIGBoostDestination = uZc.A04;
                if (xIGIGBoostDestination == XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE) {
                    xIGIGBoostCallToAction = XIGIGBoostCallToAction.WHATSAPP_MESSAGE;
                } else {
                    xIGIGBoostCallToAction = XIGIGBoostCallToAction.INSTAGRAM_MESSAGE;
                }
                List A1P = 0sr.A1P(new XIGIGBoostCallToAction[]{xIGIGBoostCallToAction, XIGIGBoostCallToAction.CONTACT_US, XIGIGBoostCallToAction.LEARN_MORE, XIGIGBoostCallToAction.BOOK_TRAVEL, XIGIGBoostCallToAction.CHECK_AVAILABILITY, XIGIGBoostCallToAction.ORDER_NOW});
                PromoteData promoteData2 = uZc.A0A;
                if (promoteData2 != null) {
                    List<XIGIGBoostCallToAction> list = A1P;
                    if (promoteData2.A2C) {
                        list = A1P;
                        if (uZc.A04 == XIGIGBoostDestination.DIRECT_MESSAGE) {
                            ArrayList A0U = 00k.A0U(A1P);
                            A0U.add(0, XIGIGBoostCallToAction.VIEW_PRODUCT);
                            list = A0U;
                        }
                    }
                    for (XIGIGBoostCallToAction xIGIGBoostCallToAction3 : list) {
                        U5O u5o = new U5O(uZc.requireContext());
                        u5o.setTag(xIGIGBoostCallToAction3);
                        u5o.setPrimaryText((CharSequence) AnonymousClass7TE.A16(uZc.requireContext(), C18677Vwa.A00(xIGIGBoostCallToAction3)));
                        u5o.A9W(new C19746Wen(2, xIGIGBoostCallToAction3, uZc));
                        A0I2.addView(u5o);
                        XIGIGBoostCallToAction xIGIGBoostCallToAction4 = uZc.A03;
                        if (xIGIGBoostCallToAction4 == xIGIGBoostCallToAction3 || ((xIGIGBoostCallToAction3 == (xIGIGBoostCallToAction2 = XIGIGBoostCallToAction.INSTAGRAM_MESSAGE) && (xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.WHATSAPP_MESSAGE || xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.CHAT_ON_WHATSAPP)) || (xIGIGBoostCallToAction3 == XIGIGBoostCallToAction.WHATSAPP_MESSAGE && (xIGIGBoostCallToAction4 == xIGIGBoostCallToAction2 || xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.VIEW_PRODUCT)))) {
                            u5o.setChecked(true);
                        }
                    }
                    if (uZc.A0F) {
                        DbT.A18(uZc.requireContext(), AnonymousClass7TE.A0d(view, R.id.promote_messaging_cta_options_title), 2131970354);
                    }
                    WGU wgu = uZc.A06;
                    if (wgu == null) {
                        str = "promoteLogger";
                    } else {
                        C16678UzE uzE = uZc.A05;
                        if (uzE == null) {
                            str = "currentStep";
                        } else {
                            wgu.A0H(uzE, "custom_cta_for_more_messages");
                            return;
                        }
                    }
                }
            } else {
                AnonymousClass7TF.A0G(view, R.id.call_to_action_row_divider).setVisibility(8);
                Dbb.A0t(view, R.id.promote_messaging_cta_options_title, 8);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.api.schemas.XIGIGBoostDestination r4, X.C15274UZc r5) {
        /*
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            if (r4 == r0) goto L_0x0008
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r4 != r0) goto L_0x003f
        L_0x0008:
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r5.A03
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.INSTAGRAM_MESSAGE
            if (r1 != r0) goto L_0x003f
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.WHATSAPP_MESSAGE
        L_0x0010:
            r5.A03 = r0
        L_0x0012:
            com.instagram.business.promote.model.PromoteData r3 = r5.A0A
            java.lang.String r2 = "promoteData"
            if (r3 == 0) goto L_0x004c
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r5.A03
            r3.A0e = r0
            boolean r0 = r3.A2o
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.A2u
            if (r0 == 0) goto L_0x002a
        L_0x0024:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r4 != r0) goto L_0x002a
            com.instagram.api.schemas.XIGIGBoostDestination r4 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
        L_0x002a:
            com.instagram.business.promote.model.PromoteState r1 = r5.A0B
            java.lang.String r0 = "promoteState"
            if (r1 == 0) goto L_0x0050
            r1.A05(r4, r3)
            com.instagram.business.promote.model.PromoteState r1 = r5.A0B
            if (r1 == 0) goto L_0x0050
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            if (r0 == 0) goto L_0x004c
            r1.A04(r4, r0)
            return
        L_0x003f:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            if (r4 != r0) goto L_0x0012
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r5.A03
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.WHATSAPP_MESSAGE
            if (r1 != r0) goto L_0x0012
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.INSTAGRAM_MESSAGE
            goto L_0x0010
        L_0x004c:
            X.0qQ.A0F(r2)
            goto L_0x0053
        L_0x0050:
            X.0qQ.A0F(r0)
        L_0x0053:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15274UZc.A01(com.instagram.api.schemas.XIGIGBoostDestination, X.UZc):void");
    }

    public static final void A02(C15274UZc uZc) {
        C18654Vw9 vw9 = uZc.A0H;
        if (vw9 != null) {
            vw9.A04(uZc.A05());
        }
    }

    private final boolean A03() {
        boolean z;
        boolean z2;
        PromoteData promoteData = this.A0A;
        if (promoteData != null) {
            List list = promoteData.A20;
            if (list != null) {
                z = list.contains(XIGIGBoostDestination.DIRECT_MESSAGE);
            } else {
                z = false;
            }
            PromoteData promoteData2 = this.A0A;
            if (promoteData2 != null) {
                List list2 = promoteData2.A20;
                if (list2 != null) {
                    z2 = list2.contains(XIGIGBoostDestination.WHATSAPP_MESSAGE);
                } else {
                    z2 = false;
                }
                if (!z || !z2) {
                    return false;
                }
                return true;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A04() {
        String str;
        if (this.A0B == null) {
            str = "promoteState";
        } else {
            PromoteData promoteData = this.A0A;
            str = "promoteData";
            if (promoteData != null) {
                if (!PromoteState.A02(promoteData)) {
                    PromoteData promoteData2 = this.A0A;
                    if (promoteData2 != null) {
                        if (promoteData2.A0v == PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE) {
                            return true;
                        }
                        return false;
                    }
                }
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A05() {
        PromoteData promoteData = this.A0A;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        if (promoteData.A2p || this.A03 != null) {
            XIGIGBoostDestination xIGIGBoostDestination = this.A04;
            if (xIGIGBoostDestination == XIGIGBoostDestination.DIRECT_MESSAGE) {
                return true;
            }
            if (xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE && !promoteData.A2u && !promoteData.A2o) {
                return true;
            }
            if (xIGIGBoostDestination != XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE || promoteData.A2u || promoteData.A2o) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r4), r4, 36326489792198436L) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CtD() {
        /*
            r9 = this;
            X.0eM r3 = r9.A0J
            X.1Av r5 = X.DbX.A0h(r3)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r9.A04
            if (r0 == 0) goto L_0x00a7
            A01(r0, r9)
            boolean r0 = r9.A04()
            if (r0 != 0) goto L_0x00a3
            com.instagram.business.promote.model.PromoteData r0 = r9.A0A
            if (r0 != 0) goto L_0x0021
            java.lang.String r8 = "promoteData"
        L_0x0019:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0021:
            boolean r0 = r0.A2m
            if (r0 != 0) goto L_0x0038
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36326489792198436(0x810ec000003724, double:3.0363566473952775E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00a3
        L_0x0038:
            X.0xa r7 = r5.A01
            java.lang.String r6 = "whatsapp_linking_in_goal_screen_has_not_engaged_count"
            r4 = 0
            int r1 = r7.getInt(r6, r4)
            r0 = 2
            if (r1 > r0) goto L_0x006f
            com.instagram.business.promote.model.PromoteData r1 = r9.A0A
            java.lang.String r8 = "promoteData"
            if (r1 == 0) goto L_0x0019
            boolean r0 = r1.A2H
            if (r0 != 0) goto L_0x006f
            boolean r0 = r1.A2G
            if (r0 != 0) goto L_0x006f
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36326489792198436(0x810ec000003724, double:3.0363566473952775E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x006f
            com.instagram.business.promote.model.PromoteData r1 = r9.A0A
            if (r1 == 0) goto L_0x0019
            r0 = 1
            r1.A2G = r0
            X.JTS.A1S(r7, r6, r4)
        L_0x006f:
            X.WGU r2 = r9.A06
            if (r2 != 0) goto L_0x0076
            java.lang.String r8 = "promoteLogger"
            goto L_0x0019
        L_0x0076:
            X.UzE r1 = r9.A05
            java.lang.String r8 = "currentStep"
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "next_button_for_message_setup"
            r2.A0F(r1, r0)
            X.W1k r2 = r9.A08
            if (r2 != 0) goto L_0x0088
            java.lang.String r8 = "promoteDataFetcher"
            goto L_0x0019
        L_0x0088:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.UzE r0 = r9.A05
            if (r0 == 0) goto L_0x0019
            r2.A04(r0, r1)
            X.Vl8 r0 = X.C13990Tnq.A0N()
            X.UaU r1 = r0.A03(r4)
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            X.Dbc.A0S(r1, r0, r3)
            return
        L_0x00a3:
            X.DbT.A1J(r9)
            return
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15274UZc.CtD():void");
    }

    public final void CyU() {
        C18784W1k w1k = this.A08;
        if (w1k == null) {
            0qQ.A0F("promoteDataFetcher");
            throw AnonymousClass00P.createAndThrow();
        } else {
            w1k.A05(this);
        }
    }

    public final void DFM(C15249UXj uXj) {
        A01(XIGIGBoostDestination.WHATSAPP_MESSAGE, this);
        if (isAdded()) {
            DbT.A1J(this);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0J);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1846763276);
        C15274UZc.super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0J;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        FragmentActivity activity = getActivity();
        this.A08 = new C18784W1k(activity, activity, A0l);
        0lg A0X = DbT.A0X(r5);
        0qQ.A0B(A0X, 0);
        WT8 wt8 = (WT8) A0X.A01(WT8.class, new C20606Wvn(A0X, 18));
        this.A0G = wt8;
        if (wt8 == null) {
            0qQ.A0F("userFlowLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        if (wt8.A00 != 0) {
            wt8.A00();
        }
        1QP r3 = wt8.A01;
        long flowStartForMarker = r3.flowStartForMarker(208414543, "messaging_app_selection", true);
        wt8.A00 = flowStartForMarker;
        r3.flowMarkPoint(flowStartForMarker, "navigation_start");
        this.A07 = AnonymousClass9F0.A01(AnonymousClass9F0.A00(C15274UZc.class), AnonymousClass7TE.A0l(r5));
        this.A0F = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(r5, 0), 36320923514577876L);
        DbX.A0R(r5).A01(this.A0K, C376029Gg.class);
        AnonymousClass0fD.A09(-1997732962, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(675416619);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_messaging_apps_view, viewGroup, false);
        AnonymousClass0fD.A09(251598763, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1976010304);
        super.onDestroy();
        DbX.A0R(this.A0J).A02(this.A0K, C376029Gg.class);
        AnonymousClass0fD.A09(-1518278046, A022);
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-746238579);
        super.onDestroyView();
        PromoteState promoteState = this.A0B;
        if (promoteState == null) {
            str = "promoteState";
        } else {
            boolean z = promoteState.A07;
            str = "userFlowLogger";
            WT8 wt8 = this.A0G;
            if (!z) {
                if (wt8 != null) {
                    wt8.A00();
                }
            } else if (wt8 != null) {
                long j = wt8.A00;
                if (j != 0) {
                    1QP r2 = wt8.A01;
                    r2.flowMarkPoint(j, "messaging_app_selected");
                    r2.flowEndSuccess(wt8.A00);
                }
            }
            WGU wgu = this.A06;
            if (wgu == null) {
                str = "promoteLogger";
            } else {
                PromoteData promoteData = this.A0A;
                if (promoteData == null) {
                    str = "promoteData";
                } else {
                    C16678UzE uzE = this.A05;
                    if (uzE == null) {
                        str = "currentStep";
                    } else {
                        0Aj A0H2 = C13990Tnq.A0H(wgu, wgu.A05, "promoted_posts_finish_step");
                        C51965G9l.A1I(A0H2, wgu.A02);
                        DbS.A1H(A0H2, uzE.toString());
                        A0H2.AAJ("bfa_platform", "native_android");
                        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0j;
                        if (xIGIGBoostDestination != null) {
                            0bb r22 = new 0bb();
                            r22.A06("messaging_app", xIGIGBoostDestination.toString());
                            A0H2.AAK(r22, "selected_values");
                        }
                        0bb r0 = new 0bb();
                        C13990Tnq.A18(r0, wgu);
                        C13988Tno.A18(A0H2, r0);
                        AnonymousClass0fD.A09(-77682908, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
