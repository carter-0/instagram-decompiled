package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.banner.FBPayBanner;
import com.facebookpay.widget.button.FBPayButton;
import com.instagram.android.R;
import java.util.LinkedHashMap;

/* renamed from: X.QhP  reason: case insensitive filesystem */
public final class C8131QhP extends QCJ implements C13732Tg4 {
    public ContextThemeWrapper A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public ConstraintLayout A0D;
    public NestedScrollView A0E;
    public C8014Qf1 A0F;
    public C8012Qez A0G;
    public ECPHandler A0H;
    public ECPPaymentRequest A0I;
    public C8924RFs A0J;
    public QDM A0K;
    public C8056Qg8 A0L;
    public FormLayout A0M;
    public QD8 A0N;
    public LoggingContext A0O;
    public FBPayBanner A0P;
    public FBPayButton A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public LayoutInflater A0U;
    public final AnonymousClass2Fj A0V = JTO.A0K();
    public final AnonymousClass2gO A0W = C11647Sdp.A00(this, 44);
    public final AnonymousClass2gO A0X = C11647Sdp.A00(this, 45);
    public final AnonymousClass2gO A0Y = C11647Sdp.A00(this, 46);
    public final AnonymousClass2gO A0Z = C11647Sdp.A00(this, 47);
    public final AnonymousClass2gO A0a = C11652Sdu.A00(this, 0);
    public final C11510SbX A0b = new C11510SbX(this, 1);
    public final 0sL A0c = new MPO(this, 6);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r5 = 0
            r8 = r25
            X.0qQ.A0B(r8, r5)
            r0 = r24
            r1 = r26
            super.onViewCreated(r8, r1)
            android.view.View r2 = r0.requireView()
            r1 = 2131441821(0x7f0b389d, float:1.8505664E38)
            X.JTR.A1C(r2, r1)
            android.view.View r2 = r0.requireView()
            r1 = 2131441817(0x7f0b3899, float:1.8505656E38)
            X.JTR.A1C(r2, r1)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r0.A0I
            java.lang.String r11 = "ecpPaymentRequest"
            r15 = r11
            if (r1 == 0) goto L_0x011b
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r1.A01
            if (r1 == 0) goto L_0x003e
            java.lang.Boolean r1 = r1.A05
            if (r1 == 0) goto L_0x003e
            com.instagram.common.session.UserSession r4 = X.C11431STx.A00()
            X.0Tu r3 = X.0Tu.A05
            r1 = 36313428797622230(0x8102df000f07d6, double:3.028096821832881E-306)
            X.182.A06(r3, r4, r1)
        L_0x003e:
            r1 = 2131436830(0x7f0b251e, float:1.8495541E38)
            android.view.View r1 = r8.requireViewById(r1)
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r0.A0E = r1
            r1 = 2131428584(0x7f0b04e8, float:1.8478817E38)
            android.view.View r1 = r8.requireViewById(r1)
            com.facebookpay.widget.banner.FBPayBanner r1 = (com.facebookpay.widget.banner.FBPayBanner) r1
            r0.A0P = r1
            r1 = 2131437371(0x7f0b273b, float:1.8496639E38)
            android.view.View r1 = r8.requireViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.A07 = r1
            r1 = 2131437195(0x7f0b268b, float:1.8496282E38)
            android.view.View r1 = r8.requireViewById(r1)
            com.facebookpay.form.view.FormLayout r1 = (com.facebookpay.form.view.FormLayout) r1
            r0.A0M = r1
            r1 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.view.View r1 = r8.requireViewById(r1)
            com.facebookpay.widget.button.FBPayButton r1 = (com.facebookpay.widget.button.FBPayButton) r1
            r0.A0Q = r1
            r1 = 2131435632(0x7f0b2070, float:1.8493112E38)
            android.view.View r1 = r8.requireViewById(r1)
            r0.A03 = r1
            r1 = 2131438594(0x7f0b2c02, float:1.849912E38)
            android.view.View r1 = r8.requireViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.A0B = r1
            r1 = 2131430689(0x7f0b0d21, float:1.8483086E38)
            android.view.View r1 = r8.requireViewById(r1)
            r0.A01 = r1
            r1 = 2131437212(0x7f0b269c, float:1.8496316E38)
            android.view.View r1 = r8.requireViewById(r1)
            r0.A04 = r1
            r1 = 2131433078(0x7f0b1676, float:1.8487932E38)
            android.view.View r1 = r8.requireViewById(r1)
            r0.A02 = r1
            r1 = 2131437377(0x7f0b2741, float:1.849665E38)
            android.view.View r1 = r8.requireViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.A08 = r1
            r1 = 2131438273(0x7f0b2ac1, float:1.8498468E38)
            android.view.View r1 = r8.requireViewById(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r0.A0D = r1
            r1 = 2131428058(0x7f0b02da, float:1.847775E38)
            android.view.View r1 = r8.requireViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.A05 = r1
            r1 = 2131437510(0x7f0b27c6, float:1.849692E38)
            android.view.View r1 = r8.requireViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.A0A = r1
            r1 = 2131437511(0x7f0b27c7, float:1.8496923E38)
            android.widget.TextView r1 = X.DbU.A0G(r8, r1)
            r0.A0C = r1
            r1 = 2131433074(0x7f0b1672, float:1.8487923E38)
            android.view.View r1 = r8.requireViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.A09 = r1
            r1 = 2131428039(0x7f0b02c7, float:1.8477711E38)
            android.view.View r1 = r8.requireViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.A06 = r1
            X.QDM r1 = r0.A09()
            boolean r2 = r1.A0B()
            r1 = 1
            if (r2 == 0) goto L_0x0655
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r0.A0I
            if (r2 == 0) goto L_0x011b
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r2 = r2.A01
            if (r2 == 0) goto L_0x010a
            java.lang.Boolean r2 = r2.A05
            boolean r2 = X.AnonymousClass7TF.A1Y(r2, r1)
            if (r2 != 0) goto L_0x0655
        L_0x010a:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r0.A0I
            if (r2 == 0) goto L_0x011b
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r2 = r2.A04
            X.RFs r2 = r2.A05
        L_0x0112:
            r0.A0J = r2
            androidx.core.widget.NestedScrollView r2 = r0.A0E
            if (r2 != 0) goto L_0x0123
            java.lang.String r11 = "nestedScrollView"
        L_0x011b:
            X.0qQ.A0F(r11)
        L_0x011e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0123:
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            X.LZ5 r2 = new X.LZ5
            r2.<init>(r0, r5)
            r3.addOnScrollChangedListener(r2)
            android.content.Context r4 = r0.requireContext()
            android.view.View r3 = r0.A02
            if (r3 != 0) goto L_0x013a
            java.lang.String r11 = "footerDivider"
            goto L_0x011b
        L_0x013a:
            r2 = 37
            X.C11386SQz.A00(r4, r3, r2, r1)
            android.widget.LinearLayout r6 = r0.A0A
            if (r6 != 0) goto L_0x0147
            java.lang.String r11 = "paymentMethodSelectionContainer"
            goto L_0x011b
        L_0x0147:
            X.SPB r4 = X.AnonymousClass2E0.A0A()
            r3 = 36
            r7 = -1
            android.content.Context r2 = r0.requireContext()
            android.graphics.drawable.Drawable r2 = r4.A05(r2, r3, r7)
            r6.setBackground(r2)
            android.widget.ProgressBar r2 = r0.A0B
            if (r2 != 0) goto L_0x0161
            java.lang.String r11 = "progressIcon"
            goto L_0x011b
        L_0x0161:
            android.graphics.drawable.Drawable r4 = r2.getIndeterminateDrawable()
            if (r4 == 0) goto L_0x017a
            X.AnonymousClass2E0.A0A()
            android.content.Context r3 = r0.requireContext()
            r2 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r3 = r3.getColor(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r3, r2)
        L_0x017a:
            android.view.View r4 = r0.A03
            if (r4 != 0) goto L_0x0181
            java.lang.String r11 = "loadingOverlay"
            goto L_0x011b
        L_0x0181:
            r2 = 2
            X.C11409SSh.A01(r4, r2)
            r3 = 1058642330(0x3f19999a, float:0.6)
            r4.setAlpha(r3)
            X.SbP r3 = X.C11502SbP.A00
            r4.setOnTouchListener(r3)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r3 = 2131440895(0x7f0b34ff, float:1.8503786E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440893(0x7f0b34fd, float:1.8503782E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440894(0x7f0b34fe, float:1.8503784E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440897(0x7f0b3501, float:1.850379E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440896(0x7f0b3500, float:1.8503788E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440901(0x7f0b3505, float:1.8503798E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440899(0x7f0b3503, float:1.8503794E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440900(0x7f0b3504, float:1.8503796E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440898(0x7f0b3502, float:1.8503792E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440904(0x7f0b3508, float:1.8503805E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440903(0x7f0b3507, float:1.8503803E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            r3 = 2131440902(0x7f0b3506, float:1.85038E38)
            X.AnonymousClass7TF.A1M(r4, r3)
            java.util.Iterator r10 = r4.iterator()
        L_0x01e0:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0215
            int r3 = X.AnonymousClass7TG.A0F(r10)
            android.view.View r9 = X.AnonymousClass7TF.A0F(r8, r3)
            com.facebook.shimmer.ShimmerFrameLayout r9 = (com.facebook.shimmer.ShimmerFrameLayout) r9
            r3 = 0
            X.C54770HSc.A00(r9, r3)
            X.AnonymousClass2E0.A0A()
            r0.requireContext()
            android.content.Context r4 = r0.requireContext()
            r3 = 2131237260(0x7f08198c, float:1.8090765E38)
            android.graphics.drawable.Drawable r6 = r4.getDrawable(r3)
            if (r6 == 0) goto L_0x065f
            X.AnonymousClass2E0.A0A()
            android.content.Context r4 = r0.requireContext()
            r3 = 2131100377(0x7f0602d9, float:1.7813134E38)
            X.Pxi.A0u(r4, r6, r9, r3)
            goto L_0x01e0
        L_0x0215:
            java.lang.String r6 = "shimmerContainer"
            r4 = 8
            java.lang.String r14 = "contentContainer"
            android.view.View r3 = r0.A01
            if (r3 == 0) goto L_0x0650
            r3.setVisibility(r4)
            android.view.View r3 = r0.A04
            if (r3 != 0) goto L_0x022c
            X.0qQ.A0F(r6)
            goto L_0x011e
        L_0x022c:
            r3.setVisibility(r5)
            r3 = 2131437210(0x7f0b269a, float:1.8496312E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r8, r3)
            X.2dQ r4 = X.Pxj.A0N(r3)
            r3 = 2131437195(0x7f0b268b, float:1.8496282E38)
            r4.A0t = r3
            r3 = 2131433074(0x7f0b1672, float:1.8487923E38)
            r4.A0G = r3
            com.facebookpay.form.view.FormLayout r4 = r0.A0M
            java.lang.String r11 = "formLayout"
            if (r4 == 0) goto L_0x011b
            r3 = 24
            X.C11409SSh.A04(r4, r3, r5)
            com.facebookpay.form.view.FormLayout r4 = r0.A0M
            if (r4 == 0) goto L_0x011b
            r3 = 2131165196(0x7f07000c, float:1.7944602E38)
            r4.setRowSpacing(r3)
            r0.A03()
            com.facebookpay.widget.button.FBPayButton r4 = r0.A0Q
            java.lang.String r11 = "continueButton"
            r23 = r11
            if (r4 == 0) goto L_0x011b
            X.AnonymousClass2E0.A0A()
            r3 = 2132017726(0x7f14023e, float:1.9673739E38)
            X.C11409SSh.A05(r4, r3, r5)
            com.facebookpay.widget.button.FBPayButton r4 = r0.A0Q
            if (r4 == 0) goto L_0x011b
            X.RFr r3 = X.C8923RFr.A09
            r4.setButtonStyle(r3)
            boolean r3 = X.C11431STx.A06()
            if (r3 == 0) goto L_0x0289
            com.facebookpay.widget.button.FBPayButton r3 = r0.A0Q
            if (r3 == 0) goto L_0x011b
            android.view.ViewTreeObserver r4 = r3.getViewTreeObserver()
            X.SbX r3 = r0.A0b
            r4.addOnDrawListener(r3)
        L_0x0289:
            X.QDM r3 = r0.A09()
            boolean r3 = r3.A0D()
            if (r3 == 0) goto L_0x0354
            android.view.View r10 = r0.A01
            r11 = r14
            if (r10 == 0) goto L_0x011b
            int r9 = r10.getPaddingLeft()
            android.view.View r3 = r0.A01
            if (r3 == 0) goto L_0x011b
            int r8 = r3.getPaddingTop()
            android.view.View r3 = r0.A01
            if (r3 == 0) goto L_0x011b
            int r6 = r3.getPaddingRight()
            android.view.View r3 = r0.A01
            if (r3 == 0) goto L_0x011b
            r4 = 2130969577(0x7f0403e9, float:1.754784E38)
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r3)
            int r3 = X.SSH.A00(r3, r4)
            r10.setPadding(r9, r8, r6, r3)
            X.Rzm r16 = X.C9967RkM.A00
            com.facebookpay.logging.LoggingContext r17 = r0.A0A()
            r18 = 2130969584(0x7f0403f0, float:1.7547854E38)
            r19 = 2130969582(0x7f0403ee, float:1.754785E38)
            X.QDM r3 = r0.A09()
            java.util.List r4 = r3.A07()
            X.5tb r3 = X.C298525tb.SHIPPING_ADDRESS
            boolean r20 = r4.contains(r3)
            X.QDM r3 = r0.A09()
            java.util.List r4 = r3.A07()
            X.5tb r3 = X.C298525tb.CONTACT_INFORMATION
            boolean r21 = r4.contains(r3)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A0I
            if (r3 != 0) goto L_0x02ed
            r11 = r15
            goto L_0x011b
        L_0x02ed:
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r3 = r3.A04
            com.facebookpay.expresscheckout.models.ItemDetails r3 = r3.A09
            java.lang.Integer r4 = r3.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            boolean r22 = X.AnonymousClass7TF.A1W(r4, r3)
            com.facebookpay.form.cell.label.LabelCellParams r8 = r16.A00(r17, r18, r19, r20, r21, r22)
            X.SRc r9 = r8.A01()
            r8.A00 = r9
            android.view.ContextThemeWrapper r6 = r0.A00
            if (r6 != 0) goto L_0x030c
            java.lang.String r11 = "wrapperContext"
            goto L_0x011b
        L_0x030c:
            X.AnonymousClass2E0.A0E()
            r4 = 2132017769(0x7f140269, float:1.9673826E38)
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            r3.<init>(r6, r4)
            X.TdT r8 = r8.A00(r3)
            r8.setViewModel(r9)
            android.widget.LinearLayout r6 = r0.A09
            if (r6 != 0) goto L_0x0326
            java.lang.String r11 = "footerContainer"
            goto L_0x011b
        L_0x0326:
            android.view.View r8 = (android.view.View) r8
            r4 = -2
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r7, r4)
            r6.addView(r8, r3)
            r7 = 2130969583(0x7f0403ef, float:1.7547852E38)
            X.0qQ.A0B(r8, r5)
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r8)
            int r3 = X.SSH.A00(r4, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            X.0qQ.A07(r4)
            int r3 = X.SSH.A00(r4, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r3 = 0
            X.SSH.A03(r8, r6, r4, r3, r3)
            r0.A0T = r1
        L_0x0354:
            X.QDM r3 = r0.A09()
            X.QDL r3 = r3.A0Q
            X.2Fj r4 = r3.A08
            r7 = 33
            X.TY2 r3 = X.TY2.A00(r0, r7)
            r6 = 9
            X.C51969G9p.A15(r0, r4, r3, r6)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A0I
            if (r3 != 0) goto L_0x0371
            r7 = r15
        L_0x036c:
            X.0qQ.A0F(r7)
            goto L_0x011e
        L_0x0371:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x03e6
            java.lang.Boolean r3 = r3.A06
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r1)
            if (r3 == 0) goto L_0x03e6
            android.view.ContextThemeWrapper r4 = r0.A00
            java.lang.String r11 = "wrapperContext"
            if (r4 == 0) goto L_0x011b
            com.facebookpay.logging.LoggingContext r3 = r0.A0A()
            X.Qeo r9 = new X.Qeo
            r9.<init>(r4, r3)
            X.SbJ r3 = X.C11496SbJ.A00(r0, r7)
            r9.A00 = r3
            android.widget.LinearLayout r3 = r0.A09
            java.lang.String r7 = "footerContainer"
            if (r3 == 0) goto L_0x036c
            X.3kE r8 = r9.A09(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.CheckoutOptionalityViewBinder.CheckoutOptionalityViewHolder"
            X.0qQ.A0C(r8, r3)
            X.QFG r8 = (X.QFG) r8
            android.widget.LinearLayout r4 = r0.A09
            if (r4 == 0) goto L_0x036c
            android.view.View r3 = r8.itemView
            r4.addView(r3)
            android.view.ContextThemeWrapper r4 = r0.A00
            if (r4 == 0) goto L_0x011b
            r3 = 2131961163(0x7f13254b, float:1.9559015E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r4, r3)
            X.RH6 r4 = X.RH6.A0D
            com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem r3 = new com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem
            r3.<init>(r4, r7)
            X.SUj r3 = X.SUj.A09(r3)
            r9.A0B(r8, r3)
            X.Sto r3 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r9 = r0.A0A()
            java.lang.String r8 = "nux_checkout"
            r7 = 0
            X.0Ae r4 = r3.A00
            java.lang.String r3 = "client_load_ecpcheckoutoptionality_display"
            X.0Aj r4 = X.C51969G9p.A0d(r4, r3)
            r3 = 61
            X.1Ln r4 = X.C51965G9l.A0U(r4, r3)
            r3 = 25
            X.TY3.A00(r4, r9, r7, r8, r3)
        L_0x03e6:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A0I
            if (r3 == 0) goto L_0x04e1
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x0601
            boolean r3 = r3.A0L
            if (r3 != r1) goto L_0x0601
        L_0x03f2:
            A06(r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A0I
            if (r3 == 0) goto L_0x0646
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x044c
            java.lang.Boolean r3 = r3.A05
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r1)
            if (r3 == 0) goto L_0x044c
            X.QDM r3 = r0.A09()
            boolean r3 = r3.A0B()
            if (r3 == 0) goto L_0x044c
            android.view.ContextThemeWrapper r4 = r0.A00
            if (r4 == 0) goto L_0x0648
            com.facebookpay.logging.LoggingContext r3 = r0.A0A()
            X.Qep r8 = new X.Qep
            r8.<init>(r4, r3)
            r3 = 34
            X.SbJ r3 = X.C11496SbJ.A00(r0, r3)
            r8.A00 = r3
            android.widget.FrameLayout r3 = r0.A06
            java.lang.String r5 = "anonCheckoutBackButton"
            if (r3 == 0) goto L_0x064b
            X.3kE r7 = r8.A09(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.InlineBackButtonViewBinder.InlineBackButtonViewHolder"
            X.0qQ.A0C(r7, r3)
            android.widget.FrameLayout r4 = r0.A06
            if (r4 == 0) goto L_0x064b
            android.view.View r3 = r7.itemView
            r4.addView(r3)
            X.QDH r3 = X.QDM.A02(r0)
            X.2Fk r5 = r3.A05
            r4 = 5
            X.J6l r3 = new X.J6l
            r3.<init>((int) r4, (java.lang.Object) r8, (java.lang.Object) r7)
            X.C51969G9p.A15(r0, r5, r3, r6)
        L_0x044c:
            X.QDM r3 = r0.A09()
            boolean r3 = r3.A0C()
            if (r3 == 0) goto L_0x04bd
            X.QDM r8 = r0.A09()
            java.lang.String r7 = "otc_toggle"
            java.util.Map r4 = r8.A0T
            X.5tb r3 = X.C298525tb.ONE_TIME_CHECKOUT_OPTION
            java.lang.Object r5 = r4.get(r3)
            if (r5 == 0) goto L_0x066e
            X.SOw r5 = (X.C11360SOw) r5
            r4 = 31
            X.Phj r3 = new X.Phj
            r3.<init>(r7, r8, r4)
            r5.A02(r3)
            android.view.ContextThemeWrapper r8 = r0.A00
            if (r8 == 0) goto L_0x0648
            com.facebookpay.logging.LoggingContext r9 = r0.A0A()
            r3 = 7
            X.Sv0 r10 = new X.Sv0
            r10.<init>(r0, r3)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A0I
            if (r3 == 0) goto L_0x0646
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x05fe
            java.lang.Boolean r3 = r3.A05
            boolean r12 = X.AnonymousClass7TF.A1Y(r3, r1)
        L_0x048f:
            r3 = 32
            X.TY2 r11 = X.TY2.A00(r0, r3)
            X.Qet r7 = new X.Qet
            r7.<init>(r8, r9, r10, r11, r12)
            r4 = 44
            X.TVw r3 = new X.TVw
            r3.<init>(r4, r7, r0)
            X.0t0 r5 = X.AnonymousClass0eN.A01(r3)
            X.QDH r4 = X.QDM.A02(r0)
            X.2Fj r3 = r4.A00
            X.TY2 r2 = X.TY2.A00(r4, r2)
            X.2gB r4 = X.AnonymousClass72Y.A01(r3, r2)
            r3 = 43
            X.Iwy r2 = new X.Iwy
            r2.<init>(r3, r7, r0, r5)
            X.C51969G9p.A15(r0, r4, r2, r6)
        L_0x04bd:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A0I
            r7 = 0
            if (r3 == 0) goto L_0x04e1
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r2 = r3.A01
            if (r2 == 0) goto L_0x05fb
            com.facebookpay.expresscheckout.models.APMConfiguration r10 = r2.A01
        L_0x04c8:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r2 = r3.A03
            if (r2 == 0) goto L_0x05f8
            com.facebookpay.common.models.CurrencyAmount r5 = r2.A00
        L_0x04ce:
            X.QDH r2 = X.QDM.A02(r0)
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x0580
            if (r10 == 0) goto L_0x0580
            if (r5 == 0) goto L_0x0580
            android.view.ContextThemeWrapper r8 = r0.A00
            if (r8 != 0) goto L_0x04e6
            java.lang.String r15 = "wrapperContext"
        L_0x04e1:
            X.0qQ.A0F(r15)
            goto L_0x011e
        L_0x04e6:
            com.facebookpay.logging.LoggingContext r4 = r0.A0A()
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            java.lang.String r13 = "Required value was null."
            if (r3 == 0) goto L_0x0669
            r2 = 31
            X.TY2 r2 = X.TY2.A00(r0, r2)
            X.Qes r9 = new X.Qes
            r9.<init>(r8, r3, r4, r2)
            android.view.ViewGroup r8 = r0.A05
            java.lang.String r15 = "apmContainer"
            if (r8 == 0) goto L_0x04e1
            X.SOm r4 = X.AnonymousClass2E0.A01()
            android.view.ContextThemeWrapper r3 = r9.A00
            X.RH6 r2 = r9.A02
            android.view.View r3 = r4.A02(r3, r8, r2)
            r2 = 5
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r3, r2)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.QEx r8 = new X.QEx
            r8.<init>(r3)
            r12 = 2131961385(0x7f132629, float:1.9559465E38)
            com.facebookpay.logging.LoggingContext r2 = r0.A0A()
            java.lang.String r11 = r2.A02
            java.util.concurrent.atomic.AtomicLong r4 = X.C9960RkF.A00
            long r2 = r4.getAndIncrement()
            java.lang.String r18 = java.lang.String.valueOf(r2)
            long r2 = r4.getAndIncrement()
            java.lang.String r19 = java.lang.String.valueOf(r2)
            X.QDH r2 = X.QDM.A02(r0)
            com.facebookpay.otc.models.OtcOptionState r2 = r2.A04()
            if (r2 == 0) goto L_0x0664
            java.lang.String r4 = r2.A01
            java.lang.String r3 = r5.A01
            java.lang.String r2 = r5.A00
            com.facebookpay.bloks.nativeprops.APMBloksNativeProps r5 = new com.facebookpay.bloks.nativeprops.APMBloksNativeProps
            r20 = r4
            r21 = r3
            r22 = r2
            r17 = r11
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            X.RH6 r3 = X.RH6.A0B
            com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem r2 = new com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem
            r2.<init>(r5, r3, r10, r4)
            X.SUj r2 = X.SUj.A09(r2)
            r9.A0B(r8, r2)
            android.view.ViewGroup r3 = r0.A05
            if (r3 == 0) goto L_0x04e1
            android.view.View r2 = r8.itemView
            r3.addView(r2)
            X.2Fj r5 = r0.A0V
            X.07Z r4 = r0.getViewLifecycleOwner()
            X.2gO r3 = r0.A0Y
            r2 = 20
            X.C11651Sdt.A01(r4, r5, r3, r2)
        L_0x0580:
            X.QDM r2 = r0.A09()
            X.2Fj r4 = r2.A0E
            X.07Z r3 = r0.getViewLifecycleOwner()
            X.2gO r2 = r0.A0Z
            r4.A06(r3, r2)
            X.QDM r2 = r0.A09()
            X.2Fj r4 = r2.A0F
            X.07Z r3 = r0.getViewLifecycleOwner()
            X.2gO r2 = r0.A0X
            r4.A06(r3, r2)
            X.QDM r2 = r0.A09()
            X.2gB r4 = r2.A0C
            X.07Z r3 = r0.getViewLifecycleOwner()
            X.TXQ r2 = X.TXQ.A00
            X.C51969G9p.A15(r3, r4, r2, r6)
            X.QDM r2 = r0.A09()
            X.2Fj r4 = r2.A0D
            X.07Z r3 = r0.getViewLifecycleOwner()
            X.2gO r2 = r0.A0a
            r4.A06(r3, r2)
            boolean r2 = X.C11431STx.A06()
            if (r2 == 0) goto L_0x05d1
            X.QDM r2 = r0.A09()
            X.2Fk r4 = r2.A08
            X.07Z r3 = r0.getViewLifecycleOwner()
            X.2gO r2 = r0.A0W
            r4.A06(r3, r2)
        L_0x05d1:
            X.QDM r2 = r0.A09()
            X.2gB r3 = r2.A0A
            r2 = 48
            X.Sdp r2 = X.C11647Sdp.A00(r0, r2)
            X.SUj.A0F(r0, r3, r2)
            X.QDM r2 = r0.A09()
            X.2gB r3 = r2.A09
            r2 = 34
            X.TY2 r2 = X.TY2.A00(r0, r2)
            X.C51969G9p.A15(r0, r3, r2, r6)
            com.facebookpay.widget.button.FBPayButton r3 = r0.A0Q
            if (r3 != 0) goto L_0x062d
            X.0qQ.A0F(r23)
            goto L_0x011e
        L_0x05f8:
            r5 = r7
            goto L_0x04ce
        L_0x05fb:
            r10 = r7
            goto L_0x04c8
        L_0x05fe:
            r12 = 0
            goto L_0x048f
        L_0x0601:
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = X.C11353SOm.A01()
            boolean r3 = r3.A05()
            if (r3 == 0) goto L_0x03f2
            android.content.Context r3 = r0.requireContext()
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r3)
            r3 = 2131239436(0x7f08220c, float:1.8095179E38)
            r4.setImageResource(r3)
            r3 = 2132017716(0x7f140234, float:1.9673718E38)
            X.C11409SSh.A05(r4, r3, r5)
            android.widget.LinearLayout r3 = r0.A09
            if (r3 != 0) goto L_0x0628
            java.lang.String r15 = "footerContainer"
            goto L_0x04e1
        L_0x0628:
            r3.addView(r4)
            goto L_0x03f2
        L_0x062d:
            r2 = 35
            X.C11496SbJ.A01(r3, r2, r0)
            android.view.View r3 = r0.A01
            if (r3 == 0) goto L_0x0650
            X.SQs r2 = new X.SQs
            r2.<init>(r0, r1)
            X.Suz r1 = new X.Suz
            r1.<init>(r7, r3)
            java.util.Set r0 = r2.A08
            r0.add(r1)
            return
        L_0x0646:
            r5 = r15
            goto L_0x064b
        L_0x0648:
            java.lang.String r5 = "wrapperContext"
        L_0x064b:
            X.0qQ.A0F(r5)
            goto L_0x011e
        L_0x0650:
            X.0qQ.A0F(r14)
            goto L_0x011e
        L_0x0655:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r0.A0I
            if (r2 == 0) goto L_0x011b
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r2 = r2.A04
            X.RFs r2 = r2.A02
            goto L_0x0112
        L_0x065f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0664:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0669:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x066e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8131QhP.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, java.lang.Object, X.QhP] */
    private final void A03() {
        String str;
        ConstraintLayout constraintLayout = this.A0D;
        if (constraintLayout == null) {
            str = "productDetailsContainer";
        } else {
            constraintLayout.setVisibility(8);
            FrameLayout frameLayout = this.A07;
            str = "orderSummaryContainer";
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                C11360SOw A0T2 = Pxh.A0T(C298525tb.ORDER_SUMMARY, A09().A0T);
                if (A0T2 != null) {
                    A0T2.A02(new C13346TVt(this, 5));
                }
                LoggingContext A0A2 = A0A();
                RH6 rh6 = RH6.A0Q;
                QEW qew = new QEW(RH6.A0p, A0A(), true);
                QEW qew2 = new QEW(RH6.A0g, A0A(), true);
                QEW qew3 = new QEW(RH6.A0d, A0A(), true);
                QEW qew4 = new QEW(RH6.A0i, A0A(), true);
                ContextThemeWrapper contextThemeWrapper = this.A00;
                if (contextThemeWrapper == null) {
                    str = "wrapperContext";
                } else {
                    C7986QeZ qeZ = new C7986QeZ(contextThemeWrapper, A0A());
                    qeZ.A00 = C11499SbM.A00(qeZ, this, 39);
                    LinkedHashMap A0v = Pxh.A0v(QEW.A05(qew), QEW.A05(qew2), QEW.A05(qew3), QEW.A05(qeZ), QEW.A05(qew4));
                    ECPPaymentRequest eCPPaymentRequest = this.A0I;
                    if (eCPPaymentRequest == null) {
                        str = "ecpPaymentRequest";
                    } else {
                        C8012Qez qez = new C8012Qez(rh6, A0A2, A0v, new MPO(this, 7), C11432SUd.A0N(eCPPaymentRequest));
                        this.A0G = qez;
                        FrameLayout frameLayout2 = this.A07;
                        if (frameLayout2 != null) {
                            C8014Qf1 A0B2 = qez.A0B(frameLayout2);
                            0qQ.A0C(A0B2, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.AccordionViewBinder.AccordionViewHolder");
                            this.A0F = A0B2;
                            FrameLayout frameLayout3 = this.A07;
                            if (frameLayout3 != null) {
                                frameLayout3.addView(A0B2.itemView);
                                C51969G9p.A15(this, A09().A0B, TY2.A00(this, 35), 9);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(Bundle bundle, C8131QhP qhP) {
        bundle.putBoolean("ECP_NUX_FLOW", true);
        bundle.putBoolean("IS_ECP_NUX_FORM_SCREEN", false);
        Fragment fragment = qhP.mParentFragment;
        if (fragment != null) {
            C11336SNr.A00(bundle, fragment, "content_bottom_sheet_fragment", true, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A05(C8131QhP qhP) {
        ContextThemeWrapper contextThemeWrapper = qhP.A00;
        IBinder iBinder = null;
        if (contextThemeWrapper == null) {
            0qQ.A0F("wrapperContext");
            throw AnonymousClass00P.createAndThrow();
        }
        Object systemService = contextThemeWrapper.getSystemService("input_method");
        0qQ.A0C(systemService, AnonymousClass000.A00(11));
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = qhP.mView;
        if (view != null) {
            iBinder = view.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        View view2 = qhP.mView;
        if (view2 != null) {
            view2.clearFocus();
        }
    }

    public final QDM A09() {
        QDM qdm = this.A0K;
        if (qdm != null) {
            return qdm;
        }
        0qQ.A0F("nuxViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final LoggingContext A0A() {
        LoggingContext loggingContext = this.A0O;
        if (loggingContext != null) {
            return loggingContext;
        }
        Pxh.A11();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EUk(ECPHandler eCPHandler) {
        this.A0H = eCPHandler;
        if (this.A0K != null) {
            A09().A0A(this.A0H);
            A03();
        }
    }

    public static final C11351SOk A02(C8131QhP qhP) {
        SPB A0A2 = AnonymousClass2E0.A0A();
        C8131QhP qhP2 = qhP;
        ContextThemeWrapper contextThemeWrapper = qhP2.A00;
        if (contextThemeWrapper != null) {
            Drawable A042 = A0A2.A04(contextThemeWrapper);
            ContextThemeWrapper contextThemeWrapper2 = qhP2.A00;
            if (contextThemeWrapper2 != null) {
                String A16 = AnonymousClass7TE.A16(contextThemeWrapper2, 2131961290);
                ContextThemeWrapper contextThemeWrapper3 = qhP2.A00;
                if (contextThemeWrapper3 != null) {
                    String A162 = AnonymousClass7TE.A16(contextThemeWrapper3, 2131961289);
                    ContextThemeWrapper contextThemeWrapper4 = qhP2.A00;
                    if (contextThemeWrapper4 != null) {
                        C8911RFe rFe = C8911RFe.A05;
                        String A163 = AnonymousClass7TE.A16(contextThemeWrapper4, 2131961292);
                        return SA0.A01(A042, rFe.A01, (C8937RGf) null, new C12501SvX(qhP2, 3), new C12502SvY(qhP2), A16, A162, A163, (String) null, (String) null, (String) null, true);
                    }
                }
            }
        }
        0qQ.A0F("wrapperContext");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(C8131QhP qhP) {
        C7798QXj qXj = (C7798QXj) qhP.A09().A0F.A02();
        C21267XRm xRm = null;
        if (qXj != null) {
            xRm = C11432SUd.A0D(qXj);
        }
        if (AnonymousClass7TF.A1W(xRm, C21267XRm.A06) || !QDM.A02(qhP).A02 || !qhP.A09().A0C()) {
            FrameLayout frameLayout = qhP.A08;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
        } else {
            FrameLayout frameLayout2 = qhP.A08;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
                return;
            }
        }
        0qQ.A0F("otcOptionContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A07(C8131QhP qhP) {
        C11298SKh.A02(qhP.A09(), "otc_back_button");
        C51965G9l.A0g().A0Z(qhP.A0A(), "pux_checkout", SUU.A08(QDM.A02(qhP)));
        Pxe.A0J(qhP.requireArguments()).putBoolean("IS_ECP_NUX_FORM_SCREEN", false);
        C13894TjH tjH = qhP.mParentFragment;
        0qQ.A0C(tjH, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
        tjH.Cmg();
    }

    public static final void A08(C8131QhP qhP, Integer num) {
        STG.A01(qhP);
        qhP.A09().A09(qhP.getViewLifecycleOwner(), qhP.A0A(), num);
    }

    public final boolean D0T(LoggingContext loggingContext, Integer num) {
        boolean A1Z = AnonymousClass7TG.A1Z(num, loggingContext);
        A09().A09(getViewLifecycleOwner(), loggingContext, num);
        return A1Z;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C8131QhP.super.onActivityResult(i, i2, intent);
        if (i != 10101) {
            return;
        }
        if (i2 != -1 || intent == null) {
            C12411Sto A0g = C51965G9l.A0g();
            TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_click_cardscanner_exit"), 390), A0A(), SUU.A08(QDM.A02(this)), "card_scanner", 7);
            return;
        }
        requireContext();
        AnonymousClass2E0.A0I();
        throw Pxi.A0p("An operation is not implemented: ", "add ig implementation");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = 901249095(0x35b7f847, float:1.3706821E-6)
            int r14 = X.AnonymousClass0fD.A02(r0)
            r11 = r24
            r0 = r25
            X.C8131QhP.super.onCreate(r0)
            android.os.Bundle r0 = r11.requireArguments()
            java.lang.String r4 = "logging_context"
            android.os.Parcelable r1 = r0.getParcelable(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            r10 = 0
            X.0qQ.A0B(r1, r10)
            r11.A0O = r1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.QCJ.A01(r11)
            r11.A0I = r0
            com.facebookpay.logging.LoggingContext r1 = r11.A0A()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r11.A0I
            java.lang.String r3 = "ecpPaymentRequest"
            if (r0 == 0) goto L_0x031b
            X.QDM r0 = X.C11086S9g.A00(r11, r0, r1)
            X.0qQ.A0B(r0, r10)
            r11.A0K = r0
            X.QDH r2 = X.QDM.A02(r11)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r11.A0I
            if (r1 == 0) goto L_0x031b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r2.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0054
            r2.A01 = r1
            X.QDH.A00(r2)
        L_0x0054:
            X.QDM r9 = r11.A09()
            android.os.Bundle r3 = r11.requireArguments()
            X.2Fj r0 = r9.A0H
            r23 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r23)
            r2 = 0
            if (r0 == 0) goto L_0x02dc
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x02dc
            java.util.Set<X.REi> r1 = r0.A0I
            X.REi r0 = X.C8891REi.REQUEST_PAYER_NAME
            boolean r0 = r1.contains(r0)
        L_0x0073:
            r9.A04 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r23)
            if (r0 == 0) goto L_0x02d9
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x02d9
            java.util.Set<X.REi> r1 = r0.A0I
            X.REi r0 = X.C8891REi.REQUEST_PAYER_EMAIL
            boolean r0 = r1.contains(r0)
        L_0x0087:
            r9.A03 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r23)
            if (r0 == 0) goto L_0x02d6
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x02d6
            java.util.Set<X.REi> r1 = r0.A0I
            X.REi r0 = X.C8891REi.REQUEST_PAYER_PHONE
            boolean r0 = r1.contains(r0)
        L_0x009b:
            r9.A05 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r23)
            if (r0 == 0) goto L_0x00af
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x00af
            java.util.Set<X.REn> r1 = r0.A0H
            X.REn r0 = X.REn.UX_SHIPPING_ADDRESS
            boolean r2 = r1.contains(r0)
        L_0x00af:
            r9.A02 = r2
            com.facebookpay.logging.LoggingContext r8 = r9.A0R
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r23)
            if (r0 == 0) goto L_0x02d3
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x02d3
            com.facebookpay.expresscheckout.models.KnownData r5 = r0.A01
        L_0x00bf:
            r13 = 1
            r7 = 0
            if (r5 == 0) goto L_0x02d0
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r5.A00
        L_0x00c5:
            java.lang.String r6 = "nux_checkout"
            if (r0 == 0) goto L_0x00d9
            X.Sto r2 = X.C51965G9l.A0g()
            X.RIb r1 = X.RIb.SHIPPING_ADDRESS
            X.QDH r0 = r9.A0S
            java.util.LinkedHashMap r0 = X.SUU.A08(r0)
            r2.A0C(r1, r8, r0)
        L_0x00d9:
            if (r5 == 0) goto L_0x00f2
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x00f2
        L_0x00e3:
            X.Sto r2 = X.C51965G9l.A0g()
            X.RIb r1 = X.RIb.CONTACT_INFO
            X.QDH r0 = r9.A0S
            java.util.LinkedHashMap r0 = X.SUU.A08(r0)
            r2.A0C(r1, r8, r0)
        L_0x00f2:
            X.QDL r5 = r9.A0Q
            android.os.Parcelable r0 = r3.getParcelable(r4)
            if (r0 == 0) goto L_0x0316
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r5.A03 = r0
            java.lang.Object r0 = r23.A02()
            java.lang.String r16 = "Required value was null."
            if (r0 == 0) goto L_0x0311
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            r4 = 0
            if (r0 == 0) goto L_0x02cc
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x030c
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x02cc
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00
            if (r0 == 0) goto L_0x02cc
            java.lang.String r22 = "REGULAR"
        L_0x0123:
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.Stc r1 = r0.A0D
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x0307
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = X.Pxh.A0U(r23)
            if (r2 == 0) goto L_0x02c9
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r2 = r2.A05
            if (r2 == 0) goto L_0x02c9
            java.lang.String r12 = r2.A02
        L_0x013d:
            X.QDH r3 = r9.A0S
            X.5tb r2 = X.C298525tb.PAYMENT_METHOD
            com.facebookpay.otc.models.OtcInput r19 = r3.A02(r2, r13)
            r17 = r7
            r18 = r0
            r20 = r12
            r21 = r7
            X.SJK r0 = X.C11432SUd.A04(r17, r18, r19, r20, r21, r22)
            X.2gB r1 = r1.A06(r0, r8)
            X.2gB r12 = r9.A0A
            X.2gO r0 = r9.A0N
            r12.A0E(r1, r0)
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0168
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x0168
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x019b
        L_0x0168:
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.Std r1 = r0.A01
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x0302
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r15 = X.Pxh.A0U(r23)
            if (r15 == 0) goto L_0x02c5
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r15 = r15.A05
            if (r15 == 0) goto L_0x02c5
            java.lang.String r15 = r15.A02
            r20 = r15
        L_0x0184:
            X.5tb r15 = X.C298525tb.CONTACT_INFORMATION
            com.facebookpay.otc.models.OtcInput r19 = r3.A02(r15, r13)
            java.lang.String r22 = "REGULAR"
            r18 = r0
            X.SJK r0 = X.C11432SUd.A04(r17, r18, r19, r20, r21, r22)
            X.2gB r1 = r1.A07(r0, r8, r10)
            X.2gO r0 = r9.A0K
            r12.A0E(r1, r0)
        L_0x019b:
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x02fd
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = r0.A08
            X.SJ1 r10 = X.SJ1.A00(r2, r3, r0)
            X.2gB r2 = r9.A0C
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.Stc r0 = r0.A0D
            X.2gB r0 = r0.A05(r10)
            X.2gO r1 = r9.A0M
            r2.A0E(r0, r1)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x01cb
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.Stb r0 = r0.A0F
            X.2gB r0 = r0.A01(r10)
            r2.A0E(r0, r1)
        L_0x01cb:
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x01d7
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x01d7
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x01e4
        L_0x01d7:
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.Std r0 = r0.A01
            X.2gB r0 = r0.A06(r10)
            r2.A0E(r0, r1)
        L_0x01e4:
            X.2gB r2 = r9.A0B
            X.2Fj r1 = r5.A0A
            X.2gO r0 = r9.A0L
            r2.A0E(r1, r0)
            X.SP9 r2 = r9.A0P
            X.2gB r1 = r2.A09
            X.2gO r0 = r9.A0O
            r1.A09(r0)
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x02f8
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x02c1
            java.util.Set<X.REn> r12 = r0.A0H
        L_0x0204:
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x02f3
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x02ee
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x02e9
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r10 = r0.A07
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x02e4
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x02be
            java.lang.String r1 = r0.A02
        L_0x0228:
            java.lang.Object r0 = r23.A02()
            if (r0 == 0) goto L_0x02df
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x0236
            java.util.ArrayList<java.lang.String> r4 = r0.A05
        L_0x0236:
            r20 = r1
            r21 = r4
            r22 = r12
            r15 = r2
            r16 = r5
            r17 = r8
            r18 = r3
            r19 = r10
            r15.A03(r16, r17, r18, r19, r20, r21, r22)
            X.2Fj r0 = r5.A0D
            r2.A02(r0)
            X.2Fj r0 = r5.A0C
            r2.A02(r0)
            X.2gB r1 = r9.A09
            int r0 = X.QDM.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.SUj.A0M(r1, r0, r7)
            boolean r0 = X.QDM.A05(r9)
            if (r0 == 0) goto L_0x0272
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r23)
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0272
            X.QDM.A03(r9)
        L_0x0272:
            X.QDM r1 = r11.A09()
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r11.A0H
            r1.A0A(r0)
            X.2YN r1 = new X.2YN
            r1.<init>(r11)
            java.lang.Class<X.QD8> r0 = X.QD8.class
            X.2YL r0 = r1.A00(r0)
            X.QD8 r0 = (X.QD8) r0
            r11.A0N = r0
            X.QDM r0 = r11.A09()
            com.facebookpay.logging.LoggingContext r3 = r11.A0A()
            X.Sto r1 = X.C51965G9l.A0g()
            X.QDH r0 = r0.A0S
            java.util.LinkedHashMap r2 = X.SUU.A08(r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_ecpcheckout_display"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 54
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 22
            X.TY3.A00(r1, r3, r2, r6, r0)
            X.0sL r1 = r11.A0c
            java.lang.String r0 = "nuxFormContentRequestKey"
            X.06F.A00(r11, r0, r1)
            r0 = -1491369619(0xffffffffa71b816d, float:-2.1580733E-15)
            X.AnonymousClass0fD.A09(r0, r14)
            return
        L_0x02be:
            r1 = r7
            goto L_0x0228
        L_0x02c1:
            X.0sl r12 = X.0sl.A00
            goto L_0x0204
        L_0x02c5:
            r20 = r7
            goto L_0x0184
        L_0x02c9:
            r12 = r7
            goto L_0x013d
        L_0x02cc:
            java.lang.String r22 = "PRE_FETCH"
            goto L_0x0123
        L_0x02d0:
            r0 = r7
            goto L_0x00c5
        L_0x02d3:
            r5 = 0
            goto L_0x00bf
        L_0x02d6:
            r0 = 0
            goto L_0x009b
        L_0x02d9:
            r0 = 0
            goto L_0x0087
        L_0x02dc:
            r0 = 0
            goto L_0x0073
        L_0x02df:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x02e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x02e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x02ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x02f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x02f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x02fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0302:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0307:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x030c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0311:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0316:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x031b:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8131QhP.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(370196320);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A00 = A002;
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A002);
        this.A0U = cloneInContext;
        if (cloneInContext == null) {
            0qQ.A0F("themeInflater");
            throw AnonymousClass00P.createAndThrow();
        }
        View inflate = cloneInContext.inflate(R.layout.ecp_nux_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1083732930, A022);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (X.AnonymousClass7TF.A1Y(r0.A05, true) != false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r13 = this;
            r0 = -155166310(0xfffffffff6c0599a, float:-1.9506608E33)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r5 = r13
            super.onResume()
            X.QDM r0 = r13.A09()
            boolean r0 = r0.A0B()
            r3 = 1
            java.lang.String r2 = "ecpPaymentRequest"
            if (r0 == 0) goto L_0x0060
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r13.A0I
            if (r0 == 0) goto L_0x002f
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0028
            java.lang.Boolean r0 = r0.A05
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 != 0) goto L_0x0060
        L_0x0028:
            android.view.ContextThemeWrapper r4 = r13.A00
            if (r4 != 0) goto L_0x0037
            java.lang.String r2 = "wrapperContext"
        L_0x002f:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0037:
            X.RFs r6 = r13.A0J
            if (r6 != 0) goto L_0x003f
            java.lang.String r2 = "navBarStyle"
            goto L_0x002f
        L_0x003f:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r13.A0I
            if (r0 == 0) goto L_0x002f
            boolean r12 = X.C11432SUd.A0N(r0)
            r0 = 4
            X.TVt r9 = new X.TVt
            r9.<init>(r13, r0)
            r0 = 5
            X.GA1 r10 = new X.GA1
            r10.<init>(r0, r13, r3)
            r7 = 0
            r11 = 1
            r8 = r7
            X.C9656Rea.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -802912521(0xffffffffd02486f7, float:-1.10412339E10)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x0060:
            r3 = 0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8131QhP.onResume():void");
    }
}
