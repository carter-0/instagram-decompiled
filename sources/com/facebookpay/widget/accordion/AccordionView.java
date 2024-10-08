package com.facebookpay.widget.accordion;

import X.0qQ;
import X.0sL;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C10255RpF;
import X.C10781Ry2;
import X.C249703kE;
import X.C257513xW;
import X.C8007Qeu;
import X.C8013Qf0;
import X.Pxe;
import X.QEW;
import X.QFA;
import X.RH6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.collect.HashMultimap;
import com.instagram.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class AccordionView extends FrameLayout {
    public FrameLayout A00;
    public LinearLayout A01;
    public ConstraintLayout A02;
    public C249703kE A03;
    public RH6 A04;
    public C10781Ry2 A05;
    public C10255RpF A06;
    public Map A07;
    public 0sL A08;
    public boolean A09;
    public final int A0A;
    public final C257513xW A0B;
    public final Map A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0C = AnonymousClass7TE.A1H();
        this.A0B = new HashMultimap();
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        View.inflate(context, R.layout.fbpay_ui_accordion_view, this);
        setImportantForAccessibility(2);
        this.A00 = (FrameLayout) findViewById(R.id.accordion_summary_container);
        this.A01 = Pxe.A0M(this, R.id.accordion_expanded_container);
        this.A02 = (ConstraintLayout) findViewById(R.id.accordion_view_container);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.facebookpay.widget.accordion.AccordionView r5, boolean r6) {
        /*
            r4 = 0
            java.lang.String r3 = "summaryContainer"
            java.lang.String r2 = "expandedContainer"
            r1 = 8
            if (r6 == 0) goto L_0x001d
            android.widget.FrameLayout r0 = r5.A00
            if (r0 == 0) goto L_0x0028
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A01
            if (r0 != 0) goto L_0x002c
        L_0x0015:
            X.0qQ.A0F(r2)
        L_0x0018:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001d:
            android.widget.LinearLayout r0 = r5.A01
            if (r0 == 0) goto L_0x0015
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r5.A00
            if (r0 != 0) goto L_0x002c
        L_0x0028:
            X.0qQ.A0F(r3)
            goto L_0x0018
        L_0x002c:
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.A00(com.facebookpay.widget.accordion.AccordionView, boolean):void");
    }

    public final void setBackground(C10781Ry2 ry2) {
        this.A05 = ry2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.getChildCount() <= 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (X.0qQ.A0K(java.lang.Boolean.valueOf(r7), r1) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r2 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0102, code lost:
        if (r0 == false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setExpansionState(boolean r13) {
        /*
            r12 = this;
            androidx.constraintlayout.widget.ConstraintLayout r6 = r12.A02
            if (r6 != 0) goto L_0x000e
            java.lang.String r11 = "accordionContainer"
        L_0x0006:
            X.0qQ.A0F(r11)
        L_0x0009:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            java.lang.String r4 = "expandedContainer"
            r3 = 1
            if (r13 == 0) goto L_0x001e
            android.widget.LinearLayout r0 = r12.A01
            if (r0 == 0) goto L_0x003b
            int r0 = r0.getChildCount()
            r7 = 1
            if (r0 > 0) goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            X.RpF r0 = r12.A06
            java.lang.String r11 = "accordionState"
            if (r0 == 0) goto L_0x0006
            java.lang.Boolean r1 = r0.A00
            if (r1 == 0) goto L_0x0034
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            boolean r1 = X.0qQ.A0K(r0, r1)
            r0 = 1
            if (r1 == 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r7 == 0) goto L_0x003f
            android.widget.LinearLayout r2 = r12.A01
            if (r2 != 0) goto L_0x0047
        L_0x003b:
            X.0qQ.A0F(r4)
            goto L_0x0009
        L_0x003f:
            android.widget.FrameLayout r2 = r12.A00
            if (r2 != 0) goto L_0x0047
            java.lang.String r4 = "summaryContainer"
            goto L_0x003b
        L_0x0047:
            if (r0 == 0) goto L_0x010f
            if (r7 == 0) goto L_0x004c
            r3 = 0
        L_0x004c:
            A00(r12, r3)
            if (r0 == 0) goto L_0x005d
            android.view.ViewTreeObserver r1 = r12.getViewTreeObserver()
            X.IDz r0 = new X.IDz
            r0.<init>(r6, r2, r12, r7)
            r1.addOnGlobalLayoutListener(r0)
        L_0x005d:
            X.Ry2 r2 = r12.A05
            if (r2 == 0) goto L_0x0108
            X.RDx r0 = r2.A02
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0108
            X.Qf9 r5 = new X.Qf9
            r5.<init>(r2, r7)
        L_0x006f:
            boolean r4 = r5 instanceof X.C8020Qf9
            if (r4 == 0) goto L_0x00f6
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x00f6
            r1 = 26
        L_0x0079:
            boolean r0 = r12.A09
            X.C11409SSh.A04(r6, r1, r0)
            android.content.Context r10 = X.AnonymousClass7TE.A0S(r12)
            if (r4 == 0) goto L_0x00ea
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x00f3
            X.Ry2 r1 = r5.A00
            if (r1 == 0) goto L_0x00f3
            java.lang.Integer r0 = r1.A03
            int r9 = r1.A00
            int r8 = r1.A01
            if (r0 == 0) goto L_0x00b7
            int r3 = r0.intValue()
            if (r9 == r3) goto L_0x00f3
            r2 = 0
            X.2HY r0 = X.C229632nm.A0C(r2, r9)
            boolean r1 = r0.A01(r3)
            r0 = r3
            if (r1 == 0) goto L_0x00a8
            int r0 = r8 - r3
        L_0x00a8:
            int r8 = r0 + -1
            X.2HY r0 = X.C229632nm.A0C(r2, r9)
            boolean r0 = r0.A01(r3)
            if (r0 == 0) goto L_0x00b7
            int r9 = r9 - r3
            int r9 = r9 + -1
        L_0x00b7:
            if (r8 == 0) goto L_0x00f3
            if (r9 != 0) goto L_0x00e2
            X.REP r2 = X.REP.ALL_BORDERED_TOP_ROUNDED
        L_0x00bd:
            if (r4 == 0) goto L_0x00df
            boolean r1 = r5.A01
            r0 = 60
            if (r1 == 0) goto L_0x00c7
            r0 = 61
        L_0x00c7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C11386SQz.A02(r10, r6, r2, r0, r1)
            X.RpF r1 = r12.A06
            if (r1 == 0) goto L_0x0006
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.A00 = r0
            return
        L_0x00df:
            r0 = 60
            goto L_0x00c7
        L_0x00e2:
            if (r9 != r8) goto L_0x00e7
            X.REP r2 = X.REP.NO_TOP_BORDER_BOTTOM_ROUNDED
            goto L_0x00bd
        L_0x00e7:
            X.REP r2 = X.REP.NO_TOP_BORDER_NONE_ROUNDED
            goto L_0x00bd
        L_0x00ea:
            X.Ry2 r0 = r5.A00
            if (r0 == 0) goto L_0x00f3
            int r9 = r0.A00
            int r8 = r0.A01
            goto L_0x00b7
        L_0x00f3:
            X.REP r2 = X.REP.ALL_BORDERED_ALL_ROUNDED
            goto L_0x00bd
        L_0x00f6:
            X.Ry2 r1 = r5.A00
            if (r1 == 0) goto L_0x0104
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0104
            boolean r0 = r1.A05
            r1 = 27
            if (r0 != 0) goto L_0x0079
        L_0x0104:
            r1 = 25
            goto L_0x0079
        L_0x0108:
            X.Qf8 r5 = new X.Qf8
            r5.<init>(r2, r7)
            goto L_0x006f
        L_0x010f:
            r3 = r7
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.setExpansionState(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        if (X.AnonymousClass7TF.A1Y(r1.A0I(), false) != false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r50 = this;
            r0 = -1800267921(0xffffffff94b2176f, float:-1.798265E-26)
            int r25 = X.AnonymousClass0fD.A06(r0)
            r49 = r50
            super.onAttachedToWindow()
            r0 = r49
            X.3xW r0 = r0.A0B
            java.util.Collection r0 = r0.ASn()
            X.0qQ.A07(r0)
            java.util.Iterator r24 = r0.iterator()
        L_0x001b:
            boolean r0 = r24.hasNext()
            if (r0 == 0) goto L_0x0298
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r24)
            r0 = r49
            java.util.Map r1 = r0.A07
            if (r1 != 0) goto L_0x0036
            java.lang.String r0 = "viewBinders"
        L_0x002e:
            X.0qQ.A0F(r0)
        L_0x0031:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0036:
            java.lang.Object r0 = r4.getKey()
            java.lang.Object r1 = r1.get(r0)
            X.QEW r1 = (X.QEW) r1
            boolean r0 = r1 instanceof X.C8007Qeu
            if (r0 == 0) goto L_0x006b
            r3 = r1
            X.Qeu r3 = (X.C8007Qeu) r3
            if (r3 == 0) goto L_0x006b
            r0 = r49
            java.util.Map r2 = r0.A0C
            java.lang.Object r0 = r4.getValue()
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<kotlin.Any>"
            X.0qQ.A0C(r2, r0)
            X.SUj r2 = (X.SUj) r2
            java.lang.Object r0 = r4.getValue()
            X.0qQ.A07(r0)
            X.3kE r0 = (X.C249703kE) r0
            X.QFA r0 = (X.QFA) r0
            r3.A0C(r0, r2)
        L_0x006b:
            r0 = r49
            X.RpF r0 = r0.A06
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "accordionState"
            goto L_0x002e
        L_0x0074:
            java.lang.Boolean r0 = r0.A00
            r7 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1 instanceof X.C8013Qf0
            if (r0 == 0) goto L_0x001b
            X.Qf0 r1 = (X.C8013Qf0) r1
            if (r1 == 0) goto L_0x001b
            java.lang.Object r4 = r4.getValue()
            X.0qQ.A07(r4)
            X.3kE r4 = (X.C249703kE) r4
            r3 = 0
            X.0qQ.A0B(r4, r3)
            java.util.Map r0 = r1.A04
            java.lang.Object r2 = r0.get(r4)
            X.QFA r2 = (X.QFA) r2
            if (r2 == 0) goto L_0x001b
            X.Qeu r0 = r1.A03
            r23 = r0
            if (r0 == 0) goto L_0x0252
            X.QDN r0 = r1.A02
            X.QDT r1 = r0.A1R
            com.facebookpay.shippingaddress.model.ShippingAddress r13 = X.QDN.A04(r0)
            r22 = 0
            if (r13 == 0) goto L_0x010f
            java.lang.String r5 = r13.A06
            if (r5 == 0) goto L_0x010f
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r1.A0F()
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = r0.A06
        L_0x00ba:
            boolean r0 = r5.equals(r0)
            if (r0 != r7) goto L_0x010f
            r6 = 1
            java.lang.Boolean r0 = r1.A0I()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            r14 = 1
            if (r0 == 0) goto L_0x00cd
        L_0x00cc:
            r14 = 0
        L_0x00cd:
            X.2Fj r0 = r1.A0B
            java.lang.Object r0 = X.SUj.A0C(r0)
            X.QSO r0 = (X.QSO) r0
            com.facebookpay.form.model.AddressFormFieldsConfig r21 = X.C11393SRk.A00(r0)
            android.util.SparseArray r5 = r1.A00
            r0 = 2
            java.lang.String r20 = X.Pxj.A0p(r5, r0)
            r0 = 5
            java.lang.String r19 = X.Pxj.A0p(r5, r0)
            r0 = 6
            java.lang.String r12 = X.Pxj.A0p(r5, r0)
            r0 = 7
            java.lang.String r11 = X.Pxj.A0p(r5, r0)
            r0 = 8
            java.lang.String r10 = X.Pxj.A0p(r5, r0)
            r0 = 9
            java.lang.String r9 = X.Pxj.A0p(r5, r0)
            r0 = 21
            java.lang.String r5 = X.Pxj.A0p(r5, r0)
            com.facebookpay.logging.LoggingContext r8 = r1.A03
            if (r8 != 0) goto L_0x011f
            java.lang.String r1 = "loggingContext"
        L_0x0107:
            X.0qQ.A0F(r1)
            goto L_0x0031
        L_0x010c:
            r0 = r22
            goto L_0x00ba
        L_0x010f:
            com.instagram.common.session.UserSession r8 = X.C11431STx.A00()
            X.0Tu r0 = X.0Tu.A05
            r5 = 36321902767646548(0x810a9400082754, double:3.033455794598198E-306)
            boolean r6 = X.DbY.A1Z(r0, r8, r5)
            goto L_0x00cc
        L_0x011f:
            r18 = 0
            com.facebookpay.form.fragment.model.FeatureConfiguration r17 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r0 = r17
            r0.<init>(r3, r7, r3)
            if (r13 == 0) goto L_0x0132
            X.StS r0 = X.C11091S9q.A00(r13)
            java.lang.String r22 = X.SRD.A01(r0)
        L_0x0132:
            r16 = 10
            if (r5 == 0) goto L_0x028f
            r0 = r18
            com.facebook.common.locale.Country r13 = com.facebook.common.locale.Country.A00(r0, r5)
        L_0x013c:
            r15 = 28
            X.QfH r5 = new X.QfH
            r0 = r21
            r5.<init>(r0, r15)
            r5.A0a = r6
            r5.A0V = r7
            r5.A0W = r14
            r0 = r20
            r5.A0G = r0
            r0 = r19
            r5.A0N = r0
            r5.A0I = r12
            r5.A0J = r11
            r5.A0M = r10
            r5.A0L = r9
            r5.A0B = r13
            r5.A0X = r3
            r5.A0U = r7
            r5.A0Z = r7
            r5.A0S = r7
            r5.A0D = r8
            r8 = 7
            r41 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r41)
            java.lang.String r0 = "new_full_name_form_field"
            X.0eP r9 = X.C11082S9c.A01(r6, r0)
            java.lang.Integer r6 = X.Pxe.A0l()
            java.lang.String r0 = "new_address1_form_field"
            X.0eP r10 = X.C11082S9c.A01(r6, r0)
            r0 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_address2_form_field"
            X.0eP r11 = X.C11082S9c.A01(r6, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "new_city_form_field"
            X.0eP r12 = X.C11082S9c.A01(r6, r0)
            java.lang.Integer r6 = X.Pxe.A0n()
            java.lang.String r0 = "new_state_form_field"
            X.0eP r13 = X.C11082S9c.A01(r6, r0)
            r0 = 9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_zip_code_form_field"
            X.0eP r14 = X.C11082S9c.A01(r6, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            java.lang.String r0 = "new_country_picker"
            X.0eP r15 = X.C11082S9c.A01(r6, r0)
            X.0eP[] r0 = new X.0eP[]{r9, r10, r11, r12, r13, r14, r15}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r5.A0Q = r0
            r0 = r18
            r5.A0E = r0
            r5.A0T = r7
            r0 = r22
            r5.A0H = r0
            com.facebookpay.form.cell.address.AddressCellParams r8 = new com.facebookpay.form.cell.address.AddressCellParams
            r8.<init>((X.C8027QfH) r5)
            r5 = 2131961168(0x7f132550, float:1.9559025E38)
            r0 = 16
            X.QfI r6 = new X.QfI
            r6.<init>(r0)
            r6.A03 = r5
            X.SR9 r5 = new X.SR9
            r5.<init>()
            java.lang.String r0 = "https://www.meta.com/help/meta-pay/saved-payment-info"
            r5.A03(r0)
            r5.A05 = r7
            r0 = 2131961398(0x7f132636, float:1.9559492E38)
            r5.A01 = r0
            java.lang.String r0 = "[[learn_more_token]]"
            X.SR9.A00(r6, r5, r0)
            r6.A04 = r3
            com.facebookpay.form.cell.label.LabelCellParams r27 = r6.A00()
            com.facebookpay.form.cell.CellParams[] r0 = new com.facebookpay.form.cell.CellParams[]{r8}
            java.util.ArrayList r38 = X.0sr.A1L(r0)
            java.lang.Integer r36 = X.AnonymousClass05K.A00
            com.facebookpay.form.fragment.model.FormParams r5 = new com.facebookpay.form.fragment.model.FormParams
            r26 = r5
            r28 = r17
            r29 = r18
            r30 = r18
            r31 = r18
            r32 = r18
            r33 = r18
            r34 = r18
            r35 = r18
            r37 = r18
            r39 = r18
            r40 = r18
            r42 = r3
            r43 = r3
            r44 = r3
            r45 = r3
            r46 = r3
            r47 = r3
            r48 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r1.A02
            java.lang.String r1 = "ecpPaymentRequest"
            if (r0 == 0) goto L_0x0107
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0293
            java.lang.String r3 = r0.A00
            if (r3 != 0) goto L_0x0242
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x0293
        L_0x0242:
            X.RH6 r1 = X.RH6.A05
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r5, r3)
            X.SUj r1 = X.SUj.A09(r0)
            r0 = r23
            r0.A0C(r2, r1)
        L_0x0252:
            boolean r0 = r4 instanceof X.C8018Qf5
            if (r0 == 0) goto L_0x001b
            X.Qf5 r4 = (X.C8018Qf5) r4
            if (r4 == 0) goto L_0x001b
            X.QFA r0 = r4.A01
            if (r0 == 0) goto L_0x001b
            androidx.fragment.app.FragmentContainerView r2 = r0.A00
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x001b
            r0 = 26
            X.TVy r3 = new X.TVy
            r3.<init>(r2, r0)
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r1 = X.AnonymousClass12y.A00
            r6 = 500(0x1f4, double:2.47E-321)
            X.07Z r0 = X.C71362ch.A00(r2)
            r4 = 0
            if (r0 == 0) goto L_0x001b
            X.07V r0 = r0.getLifecycle()
            X.0xx r0 = X.C71772f0.A00(r0)
            r5 = 6
            X.MGA r2 = new X.MGA
            r2.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r4, (int) r5, (long) r6)
            X.1Eo.A05(r1, r2, r0)
            goto L_0x001b
        L_0x028f:
            r13 = r18
            goto L_0x013c
        L_0x0293:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0298:
            r1 = -401434757(0xffffffffe812977b, float:-2.7690393E24)
            r0 = r25
            X.AnonymousClass0fD.A0D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        C8013Qf0 qf0;
        C8007Qeu qeu;
        C8007Qeu qeu2;
        int A062 = AnonymousClass0fD.A06(-27158710);
        super.onDetachedFromWindow();
        Collection ASn = this.A0B.ASn();
        0qQ.A07(ASn);
        Iterator it = ASn.iterator();
        while (it.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(it);
            Map map = this.A07;
            if (map == null) {
                0qQ.A0F("viewBinders");
                throw AnonymousClass00P.createAndThrow();
            }
            QEW qew = (QEW) map.get(A1J.getKey());
            if ((qew instanceof C8007Qeu) && (qeu2 = (C8007Qeu) qew) != null) {
                Object value = A1J.getValue();
                0qQ.A07(value);
                qeu2.A0B((QFA) ((C249703kE) value));
            }
            if ((qew instanceof C8013Qf0) && (qf0 = (C8013Qf0) qew) != null) {
                Object value2 = A1J.getValue();
                0qQ.A07(value2);
                QFA qfa = (QFA) qf0.A04.get(value2);
                if (!(qfa == null || (qeu = qf0.A03) == null)) {
                    qeu.A0B(qfa);
                }
            }
        }
        AnonymousClass0fD.A0D(-674520643, A062);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
