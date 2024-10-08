package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;
import com.instagram.android.R;
import java.util.LinkedHashMap;

/* renamed from: X.QhN  reason: case insensitive filesystem */
public final class C8129QhN extends QCJ implements C13732Tg4 {
    public ContextThemeWrapper A00;
    public View A01;
    public Button A02;
    public QEe A03;
    public QD4 A04;
    public ECPHandler A05;
    public LoggingContext A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b4, code lost:
        if (r1 != false) goto L_0x01b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r6 = 0
            r7 = r25
            X.0qQ.A0B(r7, r6)
            r3 = r24
            r0 = r26
            super.onViewCreated(r7, r0)
            android.os.Bundle r0 = r3.requireArguments()
            java.lang.String r10 = "logging_context"
            android.os.Parcelable r0 = r0.getParcelable(r10)
            if (r0 == 0) goto L_0x0296
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r3.A06 = r0
            androidx.fragment.app.FragmentActivity r5 = r3.getActivity()
            if (r5 == 0) goto L_0x00af
            X.STG.A02(r3)
            r0 = 2131433078(0x7f0b1676, float:1.8487932E38)
            android.view.View r0 = r7.requireViewById(r0)
            r3.A01 = r0
            android.content.Context r4 = r3.requireContext()
            android.view.View r1 = r3.A01
            r2 = 0
            if (r1 != 0) goto L_0x0042
            java.lang.String r0 = "footerDivider"
        L_0x003a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0042:
            r0 = 19
            X.C11386SQz.A00(r4, r1, r0, r6)
            r0 = 2131430578(0x7f0b0cb2, float:1.848286E38)
            android.view.View r1 = r7.requireViewById(r0)
            android.widget.Button r1 = (android.widget.Button) r1
            r3.A02 = r1
            if (r1 != 0) goto L_0x0057
            java.lang.String r0 = "confirmButton"
            goto L_0x003a
        L_0x0057:
            r0 = 24
            X.C11496SbJ.A01(r1, r0, r3)
            r0 = 2131435528(0x7f0b2008, float:1.84929E38)
            android.view.View r7 = r7.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 1
            X.DbU.A15(r5, r7, r0, r6)
            r7.setItemAnimator(r2)
            com.facebookpay.logging.LoggingContext r8 = r3.A06
            java.lang.String r0 = "loggingContext"
            if (r8 == 0) goto L_0x003a
            r0 = 4
            X.J6l r4 = new X.J6l
            r4.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r3)
            r1 = 43
            X.TVw r0 = new X.TVw
            r0.<init>(r1, r7, r3)
            X.Qeg r2 = new X.Qeg
            r2.<init>(r8, r0, r4)
            X.RH6 r0 = X.RH6.A0F
            X.QeM r5 = new X.QeM
            r5.<init>(r0, r8, r6)
            r1 = 46
            X.JGF r0 = new X.JGF
            r0.<init>(r1, r7, r3)
            X.QeX r4 = new X.QeX
            r4.<init>(r8, r0)
            X.0eP r2 = X.QEW.A05(r2)
            X.0eP r1 = X.QEW.A05(r5)
            X.RH6 r0 = r4.A02
            java.util.LinkedHashMap r1 = X.DbY.A0q(r0, r4, r2, r1)
            X.QEe r0 = new X.QEe
            r0.<init>(r1)
            r3.A03 = r0
            r7.setAdapter(r0)
        L_0x00af:
            com.facebookpay.logging.LoggingContext r0 = r3.A06
            if (r0 != 0) goto L_0x00bd
            java.lang.String r16 = "loggingContext"
        L_0x00b5:
            X.0qQ.A0F(r16)
        L_0x00b8:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00bd:
            r2 = 0
            X.QDN r0 = X.C11086S9g.A01(r3, r2, r0)
            X.QDH r1 = r0.A1Q
            X.Sdw r0 = new X.Sdw
            r0.<init>(r1)
            X.2YN r1 = X.JTO.A0L(r0, r3)
            java.lang.Class<X.QD4> r0 = X.QD4.class
            X.2YL r4 = r1.A00(r0)
            X.QD4 r4 = (X.QD4) r4
            r3.A04 = r4
            java.lang.String r16 = "confirmationViewModel"
            if (r4 == 0) goto L_0x00b5
            android.os.Bundle r9 = r3.requireArguments()
            java.lang.String r0 = "ECP_CONFIRMATION_FRAGMENT_PARAMS"
            android.os.Parcelable r1 = r9.getParcelable(r0)
            boolean r0 = r1 instanceof com.facebookpay.confirmation.model.ECPConfirmationParams
            if (r0 == 0) goto L_0x017f
            if (r1 == 0) goto L_0x017f
            X.SUj r2 = X.SUj.A09(r1)
        L_0x00ef:
            r4.A00 = r2
            X.2Fj r1 = r4.A04
            java.lang.String r15 = "confirmationParams"
            X.ScE r0 = X.C11553ScE.A00
            X.SUj r0 = X.SUj.A04(r0, r2)
            r1.A0B(r0)
            X.2Fj r2 = r4.A05
            X.SUj r1 = r4.A00
            if (r1 == 0) goto L_0x028c
            X.ScF r0 = X.C11554ScF.A00
            X.SUj r0 = X.SUj.A04(r0, r1)
            r2.A0B(r0)
            X.2Fj r12 = r4.A06
            X.SUj r11 = r4.A00
            if (r11 == 0) goto L_0x028c
            java.lang.Object r14 = r11.A01
            if (r14 == 0) goto L_0x018b
            com.facebookpay.confirmation.model.ECPConfirmationParams r14 = (com.facebookpay.confirmation.model.ECPConfirmationParams) r14
            X.0qQ.A0A(r14)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.lang.String r13 = r14.A03
            java.lang.String r7 = r14.A02
            java.lang.String r5 = r14.A05
            java.lang.String r2 = r14.A04
            java.lang.String r1 = r14.A06
            X.RH6 r18 = X.RH6.A0E
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem r0 = new com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem
            r20 = r7
            r21 = r5
            r22 = r2
            r23 = r1
            r19 = r13
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.SUj.A0O(r0, r8)
            com.facebookpay.confirmation.model.ECPConfirmationUpsellSection r5 = r14.A00
            if (r5 == 0) goto L_0x018c
            java.lang.String r2 = r5.A00
            X.RH6 r1 = X.RH6.A0F
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem r0 = new com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem
            r0.<init>(r1, r2)
            X.SUj.A0O(r0, r8)
            java.util.List r0 = r5.A01
            java.util.Iterator r13 = r0.iterator()
        L_0x0156:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x018c
            java.lang.Object r0 = r13.next()
            com.facebookpay.confirmation.model.ECPConfirmationUpsellAction r0 = (com.facebookpay.confirmation.model.ECPConfirmationUpsellAction) r0
            java.lang.String r7 = r0.A01
            java.lang.String r5 = r0.A03
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A00
            X.RH6 r18 = X.RH6.A0G
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem r0 = new com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem
            r20 = r5
            r21 = r2
            r22 = r1
            r19 = r7
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            X.SUj.A0O(r0, r8)
            goto L_0x0156
        L_0x017f:
            java.lang.String r0 = "No confirmation params provided!"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            X.SUj r2 = X.SUj.A0A(r2, r0)
            goto L_0x00ef
        L_0x018b:
            r8 = 0
        L_0x018c:
            X.SUj.A0I(r12, r11, r8)
            android.os.Parcelable r5 = r9.getParcelable(r10)
            if (r5 == 0) goto L_0x0291
            com.facebookpay.logging.LoggingContext r5 = (com.facebookpay.logging.LoggingContext) r5
            X.SUj r1 = r4.A00
            if (r1 == 0) goto L_0x028c
            boolean r0 = X.SUj.A0V(r1)
            if (r0 == 0) goto L_0x025b
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.Object r0 = X.SUj.A0D(r1)
            com.facebookpay.confirmation.model.ECPConfirmationParams r0 = (com.facebookpay.confirmation.model.ECPConfirmationParams) r0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x01b6
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x01b7
        L_0x01b6:
            r0 = 1
        L_0x01b7:
            r9 = r0 ^ 1
            X.QDH r8 = r4.A07
            java.util.LinkedHashMap r7 = X.SUU.A08(r8)
            X.0qQ.A0B(r5, r6)
            com.facebook.quicklog.QuickPerformanceLogger r6 = r2.A01
            r4 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONFIRMATION_SCREEN_DISPLAY"
            r6.markerPoint(r4, r0)
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_load_ecpconfirmation_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 65
            X.1Ln r2 = X.C51965G9l.A0U(r1, r0)
            r1 = 2
            X.GN2 r0 = new X.GN2
            r0.<init>(r1, r5, r7, r9)
            X.C12411Sto.A03(r2, r5, r0)
            r6.markerEnd(r4, r1)
            X.Sto r0 = X.C51965G9l.A0g()
            java.util.LinkedHashMap r6 = X.SUU.A08(r8)
            java.lang.String r4 = "confirmation_display"
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_process_ecppaymentperceived_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 107(0x6b, float:1.5E-43)
            X.1Ln r2 = X.C51965G9l.A0U(r1, r0)
            r1 = 1
            X.PmT r0 = new X.PmT
            r0.<init>(r5, r6, r4, r1)
            X.C12411Sto.A03(r2, r5, r0)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.S1J r2 = r0.A05
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "SHOW_CONFIRMATION"
            r2.A00(r1, r0)
        L_0x0214:
            X.QD4 r0 = r3.A04
            if (r0 == 0) goto L_0x00b5
            X.2Fk r1 = r0.A01
            r0 = 21
            X.TY2 r0 = X.TY2.A00(r3, r0)
            r2 = 29
            X.Dba.A16(r3, r1, r0, r2)
            X.QD4 r0 = r3.A04
            if (r0 == 0) goto L_0x00b5
            X.2Fk r1 = r0.A03
            r0 = 22
            X.TY2 r0 = X.TY2.A00(r3, r0)
            X.Dba.A16(r3, r1, r0, r2)
            r0 = 3
            X.SVF r1 = new X.SVF
            r1.<init>(r3, r0)
            androidx.fragment.app.Fragment r0 = r3.mParentFragment
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment"
            X.0qQ.A0C(r0, r2)
            X.Qxp r0 = (X.C8608Qxp) r0
            r0.A00 = r1
            r0 = 4
            X.SVF r1 = new X.SVF
            r1.<init>(r3, r0)
            androidx.fragment.app.Fragment r0 = r3.mParentFragment
            X.0qQ.A0C(r0, r2)
            X.0SM r0 = (X.0SM) r0
            android.app.Dialog r0 = r0.A01
            if (r0 == 0) goto L_0x025a
            r0.setOnDismissListener(r1)
        L_0x025a:
            return
        L_0x025b:
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x0214
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.Throwable r1 = r1.A02
            X.QDH r0 = r4.A07
            java.util.LinkedHashMap r4 = X.SUU.A08(r0)
            X.Pxj.A1Q(r1, r4)
            X.0qQ.A0B(r5, r6)
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_load_ecpconfirmation_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 63
            X.1Ln r2 = X.C51965G9l.A0U(r1, r0)
            r1 = 42
            X.TYA r0 = new X.TYA
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            X.C12411Sto.A03(r2, r5, r0)
            goto L_0x0214
        L_0x028c:
            X.0qQ.A0F(r15)
            goto L_0x00b8
        L_0x0291:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0296:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8129QhN.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void EUk(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
    }

    public static final void A02(LoggingContext loggingContext, C8129QhN qhN, String str, String str2) {
        C12411Sto A0g = C51965G9l.A0g();
        QD4 qd4 = qhN.A04;
        if (qd4 == null) {
            0qQ.A0F("confirmationViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        LinkedHashMap A08 = SUU.A08(qd4.A07);
        if (str2 != null) {
            A08.put("upsell_action_type", str2);
        }
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_click_ecpconfirmation_atomic"), 396), loggingContext, A08, str, 10);
    }

    public final /* synthetic */ boolean D0T(LoggingContext loggingContext, Integer num) {
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1397617637);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_confirmation_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1225890251, A022);
        return inflate;
    }
}
