package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.QhQ  reason: case insensitive filesystem */
public final class C8132QhQ extends QCJ implements C13732Tg4 {
    public int A00;
    public ContextThemeWrapper A01;
    public TextView A02;
    public RecyclerView A03;
    public QEe A04;
    public QF3 A05;
    public C8004Qer A06;
    public QF4 A07;
    public C8011Qey A08;
    public ECPHandler A09;
    public ECPPaymentRequest A0A;
    public QDN A0B;
    public LoggingContext A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F = AnonymousClass7TF.A0D();
    public final View.OnClickListener A0G = C11496SbJ.A00(this, 19);
    public final View.OnClickListener A0H = C11496SbJ.A00(this, 21);
    public final AnonymousClass2Fj A0I = JTO.A0K();
    public final AnonymousClass2gO A0J = C11647Sdp.A00(this, 31);
    public final AnonymousClass2gO A0K = C11647Sdp.A00(this, 32);
    public final AnonymousClass2gO A0L = C11647Sdp.A00(this, 33);
    public final AnonymousClass2gO A0M = C11647Sdp.A00(this, 34);
    public final AnonymousClass2gO A0N = C11647Sdp.A00(this, 35);
    public final AnonymousClass2gO A0O = C11647Sdp.A00(this, 36);
    public final AnonymousClass2gO A0P = C11647Sdp.A00(this, 37);
    public final AnonymousClass2gO A0Q = C11647Sdp.A00(this, 38);
    public final AnonymousClass2gO A0R = C11647Sdp.A00(this, 39);
    public final AnonymousClass2gO A0S = C11647Sdp.A00(this, 40);
    public final AnonymousClass2gO A0T = C11647Sdp.A00(this, 41);
    public final AnonymousClass2gO A0U = C11647Sdp.A00(this, 42);
    public final C11510SbX A0V = new C11510SbX(this, 0);
    public final TDA A0W = new TDA(this);
    public final Integer[] A0X = {2131961266, 2131961265, 2131961213};
    public final 0sL A0Y = new C59344JFw(this, 48);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0643, code lost:
        r13 = "loggingContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r28, android.os.Bundle r29) {
        /*
            r27 = this;
            r1 = 0
            r8 = r28
            X.0qQ.A0B(r8, r1)
            r0 = r27
            r2 = r29
            super.onViewCreated(r8, r2)
            X.QDN r2 = r0.A0B
            if (r2 == 0) goto L_0x05e9
            X.QDH r4 = r2.A1Q
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = r0.A0A
            if (r3 == 0) goto L_0x05e6
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r4.A01
            boolean r2 = X.0qQ.A0K(r2, r3)
            if (r2 != 0) goto L_0x0024
            r4.A01 = r3
            X.QDH.A00(r4)
        L_0x0024:
            r2 = 2131435528(0x7f0b2008, float:1.84929E38)
            android.view.View r2 = r8.requireViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0.A03 = r2
            boolean r2 = r0.A08()
            java.lang.String r14 = "listContainer"
            r3 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0053
            r2 = 2131433074(0x7f0b1672, float:1.8487923E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r8, r2)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A03
            if (r5 == 0) goto L_0x05e2
            X.SQs r2 = new X.SQs
            r2.<init>(r0, r3)
            X.Suz r4 = new X.Suz
            r4.<init>(r6, r5)
            java.util.Set r2 = r2.A08
            r2.add(r4)
        L_0x0053:
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            if (r2 == 0) goto L_0x046a
            r4 = 2131433082(0x7f0b167a, float:1.848794E38)
            android.view.ViewGroup r6 = X.DbX.A0I(r8, r4)
            r6.removeAllViews()
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05e9
            java.util.List r4 = r4.A0l()
            java.util.Iterator r12 = r4.iterator()
        L_0x006f:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x015e
            java.lang.Object r4 = r12.next()
            X.5tb r4 = (X.C298525tb) r4
            int r5 = r4.ordinal()
            r4 = 21
            if (r5 == r4) goto L_0x00da
            r4 = 33
            if (r5 == r4) goto L_0x00a8
            r4 = 17
            if (r5 != r4) goto L_0x006f
            X.QDN r4 = r0.A0B
            java.lang.String r13 = "ecpViewModel"
            if (r4 == 0) goto L_0x0605
            X.QDH r4 = r4.A1Q
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x006f
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r0.A0A
            if (r4 == 0) goto L_0x05e6
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r4.A01
            if (r4 == 0) goto L_0x05ec
            java.lang.Boolean r4 = r4.A05
            boolean r4 = X.AnonymousClass7TF.A1Y(r4, r3)
            if (r4 == 0) goto L_0x05ec
            goto L_0x006f
        L_0x00a8:
            r4 = 6
            X.Sv0 r10 = new X.Sv0
            r10.<init>(r0, r4)
            r4 = 5
            X.Sv0 r9 = new X.Sv0
            r9.<init>(r0, r4)
            com.facebookpay.logging.LoggingContext r5 = r0.A0C
            if (r5 == 0) goto L_0x0643
            X.Qer r4 = new X.Qer
            r4.<init>(r5, r10, r9)
            r0.A06 = r4
            X.3kE r5 = r4.A09(r6)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.PUXTermsConditionViewBinder.PUXTermsConditionViewHolder"
            X.0qQ.A0C(r5, r4)
            X.QF3 r5 = (X.QF3) r5
            r0.A05 = r5
            if (r5 != 0) goto L_0x00d4
            java.lang.String r13 = "termsViewHolder"
            goto L_0x0605
        L_0x00d4:
            com.facebookpay.widget.disclaimer.DisclaimerLayout r4 = r5.A00
            r6.addView(r4)
            goto L_0x006f
        L_0x00da:
            android.view.ContextThemeWrapper r11 = r0.A01
            if (r11 != 0) goto L_0x00e6
            java.lang.String r9 = "viewContext"
        L_0x00e1:
            X.0qQ.A0F(r9)
            goto L_0x0608
        L_0x00e6:
            com.facebookpay.logging.LoggingContext r10 = r0.A0C
            if (r10 != 0) goto L_0x00ed
            java.lang.String r9 = "loggingContext"
            goto L_0x00e1
        L_0x00ed:
            boolean r20 = A0A(r0)
            r4 = 29
            X.TVy r9 = new X.TVy
            r9.<init>(r0, r4)
            r5 = 30
            X.TVy r4 = new X.TVy
            r4.<init>(r0, r5)
            X.Qey r15 = new X.Qey
            r19 = r4
            r16 = r11
            r17 = r10
            r18 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            android.view.View$OnClickListener r4 = r0.A0H
            X.0qQ.A0B(r4, r1)
            r15.A00 = r4
            r0.A08 = r15
            X.3kE r5 = r15.A09(r6)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.PayButtonViewBinder.PayButtonViewHolder"
            X.0qQ.A0C(r5, r4)
            X.QF4 r5 = (X.QF4) r5
            r0.A07 = r5
            boolean r5 = A0A(r0)
            java.lang.String r9 = "payButtonViewHolder"
            X.QF4 r4 = r0.A07
            if (r5 == 0) goto L_0x0157
            if (r4 == 0) goto L_0x00e1
            com.facebookpay.widget.paybutton.FBPayAnimationButton r5 = r4.A00
            r4 = 21
        L_0x0134:
            X.C11409SSh.A04(r5, r4, r1)
            X.QF4 r4 = r0.A07
            if (r4 == 0) goto L_0x00e1
            com.facebookpay.widget.paybutton.FBPayAnimationButton r4 = r4.A00
            r6.addView(r4)
            boolean r4 = X.C11431STx.A06()
            if (r4 == 0) goto L_0x006f
            X.QF4 r4 = r0.A07
            if (r4 == 0) goto L_0x00e1
            com.facebookpay.widget.paybutton.FBPayAnimationButton r4 = r4.A00
            android.view.ViewTreeObserver r5 = r4.getViewTreeObserver()
            X.SbX r4 = r0.A0V
            r5.addOnDrawListener(r4)
            goto L_0x006f
        L_0x0157:
            if (r4 == 0) goto L_0x00e1
            com.facebookpay.widget.paybutton.FBPayAnimationButton r5 = r4.A00
            r4 = 12
            goto L_0x0134
        L_0x015e:
            X.QDN r4 = r0.A0B
            java.lang.String r12 = "ecpViewModel"
            if (r4 == 0) goto L_0x05da
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = X.QDN.A02(r4)
            if (r4 == 0) goto L_0x01e0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r4.A01
            if (r4 == 0) goto L_0x01e0
            java.lang.Boolean r4 = r4.A06
            boolean r4 = X.AnonymousClass7TF.A1Y(r4, r3)
            if (r4 == 0) goto L_0x01e0
            r4 = 2131433074(0x7f0b1672, float:1.8487923E38)
            android.view.ViewGroup r5 = X.DbX.A0I(r8, r4)
            android.view.ContextThemeWrapper r9 = r0.A01
            java.lang.String r6 = "viewContext"
            if (r9 == 0) goto L_0x01e8
            com.facebookpay.logging.LoggingContext r4 = r0.A0C
            java.lang.String r11 = "loggingContext"
            if (r4 == 0) goto L_0x05c0
            X.Qeo r10 = new X.Qeo
            r10.<init>(r9, r4)
            r4 = 18
            X.SbJ r4 = X.C11496SbJ.A00(r0, r4)
            r10.A00 = r4
            X.3kE r9 = r10.A09(r5)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.CheckoutOptionalityViewBinder.CheckoutOptionalityViewHolder"
            X.0qQ.A0C(r9, r4)
            X.QFG r9 = (X.QFG) r9
            android.view.View r4 = r9.itemView
            r5.addView(r4)
            android.view.ContextThemeWrapper r5 = r0.A01
            if (r5 == 0) goto L_0x01e8
            r4 = 2131961163(0x7f13254b, float:1.9559015E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r5, r4)
            X.RH6 r5 = X.RH6.A0D
            com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem r4 = new com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem
            r4.<init>(r5, r6)
            X.SUj r4 = X.SUj.A09(r4)
            r10.A0B(r9, r4)
            X.Sto r4 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r10 = r0.A0C
            if (r10 == 0) goto L_0x05c0
            java.lang.String r9 = "pux_checkout"
            r6 = 0
            X.0Ae r5 = r4.A00
            java.lang.String r4 = "client_load_ecpcheckoutoptionality_display"
            X.0Aj r5 = X.C51969G9p.A0d(r5, r4)
            r4 = 61
            X.1Ln r5 = X.C51965G9l.A0U(r5, r4)
            r4 = 25
            X.TY3.A00(r5, r10, r6, r9, r4)
        L_0x01e0:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r0.A0A
            if (r4 != 0) goto L_0x01ed
            java.lang.String r11 = "ecpPaymentRequest"
            goto L_0x05c0
        L_0x01e8:
            X.0qQ.A0F(r6)
            goto L_0x0608
        L_0x01ed:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r4.A01
            if (r4 == 0) goto L_0x05a8
            boolean r4 = r4.A0L
            if (r4 != r3) goto L_0x05a8
        L_0x01f5:
            r4 = 2131433078(0x7f0b1676, float:1.8487932E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r8, r4)
            android.content.Context r8 = r0.requireContext()
            boolean r6 = A0A(r0)
            boolean r5 = A0A(r0)
            r4 = 19
            if (r5 == 0) goto L_0x020e
            r4 = 37
        L_0x020e:
            X.C11386SQz.A00(r8, r9, r4, r6)
            androidx.recyclerview.widget.RecyclerView r6 = r0.A03
            if (r6 == 0) goto L_0x05e2
            X.DbU.A15(r2, r6, r3, r1)
            r6.setItemAnimator(r7)
            boolean r11 = A0A(r0)
            com.instagram.common.session.UserSession r8 = X.C11431STx.A00()
            X.0Tu r9 = X.0Tu.A05
            r4 = 36313428797884376(0x8102df001307d8, double:3.028096821998663E-306)
            boolean r8 = X.182.A06(r9, r8, r4)
            java.lang.String r10 = "ecpPaymentRequest"
            if (r8 != 0) goto L_0x0241
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r8 = r0.A0A
            if (r8 == 0) goto L_0x05de
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r8 = r8.A01
            if (r8 == 0) goto L_0x0241
            java.lang.Boolean r8 = r8.A0A
            if (r8 == 0) goto L_0x0241
            X.AnonymousClass2E0.A0D()
        L_0x0241:
            com.instagram.common.session.UserSession r8 = X.C11431STx.A00()
            boolean r4 = X.182.A06(r9, r8, r4)
            if (r4 != 0) goto L_0x025a
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r0.A0A
            if (r4 == 0) goto L_0x05de
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r4.A01
            if (r4 == 0) goto L_0x025a
            java.lang.Boolean r4 = r4.A08
            if (r4 == 0) goto L_0x025a
            X.AnonymousClass2E0.A0D()
        L_0x025a:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r0.A0A
            if (r4 == 0) goto L_0x05de
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r4.A01
            if (r4 == 0) goto L_0x0272
            java.lang.Boolean r4 = r4.A05
            if (r4 == 0) goto L_0x0272
            com.instagram.common.session.UserSession r8 = X.C11431STx.A00()
            r4 = 36313428797622230(0x8102df000f07d6, double:3.028096821832881E-306)
            X.182.A06(r9, r8, r4)
        L_0x0272:
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05da
            boolean r5 = r4.A0v()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r0.A0A
            if (r5 == 0) goto L_0x05a0
            if (r4 == 0) goto L_0x05de
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r4 = r4.A04
            X.RFs r5 = r4.A03
        L_0x0284:
            if (r11 == 0) goto L_0x058f
            r6.setClipToPadding(r1)
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05da
            java.util.LinkedHashMap r4 = r4.A1X
            java.util.Collection r4 = r4.values()
            X.0qQ.A07(r4)
            java.util.List r4 = X.00k.A0a(r4)
            java.util.List r4 = X.00k.A0X(r4)
            java.lang.Object r4 = X.00k.A0L(r4)
            X.SUj r4 = (X.SUj) r4
            if (r4 == 0) goto L_0x058c
            java.lang.Object r4 = r4.A01
        L_0x02a8:
            boolean r4 = r4 instanceof com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem
            if (r4 == 0) goto L_0x02b7
            r5 = 0
            r4 = 2130969590(0x7f0403f6, float:1.7547866E38)
            java.lang.Integer r4 = X.SSH.A01(r6, r4)
            X.SSH.A02(r6, r5, r5, r5, r4)
        L_0x02b7:
            com.facebookpay.logging.LoggingContext r9 = r0.A0C
            java.lang.String r13 = "loggingContext"
            if (r9 == 0) goto L_0x0605
            X.RH6 r4 = X.RH6.A0b
            X.QeO r11 = new X.QeO
            r11.<init>(r4, r9, r1)
            X.RH6 r8 = X.RH6.A0X
            java.util.Map r18 = r0.A03(r2, r7, r8)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = r0.A0A
            if (r4 == 0) goto L_0x05de
            boolean r20 = X.C11432SUd.A0N(r4)
            r5 = 2
            X.MPO r4 = new X.MPO
            r4.<init>(r0, r5)
            X.Qez r15 = new X.Qez
            r19 = r4
            r16 = r8
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            com.facebookpay.logging.LoggingContext r9 = r0.A0C
            if (r9 == 0) goto L_0x0605
            X.RH6 r8 = X.RH6.A0V
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05da
            X.QDU r4 = r4.A1K
            java.util.Map r19 = r0.A03(r2, r4, r8)
            r5 = 49
            X.JFw r4 = new X.JFw
            r4.<init>(r0, r5)
            X.Qez r16 = new X.Qez
            r18 = r9
            r20 = r4
            r21 = r1
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            com.facebookpay.logging.LoggingContext r9 = r0.A0C
            if (r9 == 0) goto L_0x0605
            X.RH6 r8 = X.RH6.A0a
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05da
            X.QDS r4 = r4.A1U
            java.util.Map r20 = r0.A03(r2, r4, r8)
            r5 = 5
            X.MPO r4 = new X.MPO
            r4.<init>(r0, r5)
            X.Qez r17 = new X.Qez
            r18 = r8
            r19 = r9
            r21 = r4
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            com.facebookpay.logging.LoggingContext r8 = r0.A0C
            if (r8 == 0) goto L_0x0605
            X.RH6 r5 = X.RH6.A0W
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05da
            X.QDR r4 = r4.A1N
            java.util.Map r21 = r0.A03(r2, r4, r5)
            X.MPO r4 = new X.MPO
            r4.<init>(r0, r1)
            X.Qez r18 = new X.Qez
            r19 = r5
            r20 = r8
            r22 = r4
            r23 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            com.facebookpay.logging.LoggingContext r8 = r0.A0C
            if (r8 == 0) goto L_0x0605
            X.RH6 r5 = X.RH6.A0Z
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05da
            X.QDQ r4 = r4.A1T
            java.util.Map r22 = r0.A03(r2, r4, r5)
            r9 = 4
            X.MPO r4 = new X.MPO
            r4.<init>(r0, r9)
            X.Qez r19 = new X.Qez
            r20 = r5
            r21 = r8
            r23 = r4
            r24 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            com.facebookpay.logging.LoggingContext r8 = r0.A0C
            if (r8 == 0) goto L_0x0605
            X.RH6 r5 = X.RH6.A0Y
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x05da
            X.QDT r4 = r4.A1R
            java.util.Map r23 = r0.A03(r2, r4, r5)
            r9 = 3
            X.MPO r4 = new X.MPO
            r4.<init>(r0, r9)
            X.Qez r20 = new X.Qez
            r21 = r5
            r22 = r8
            r24 = r4
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25)
            com.facebookpay.logging.LoggingContext r8 = r0.A0C
            if (r8 == 0) goto L_0x0605
            X.RH6 r4 = X.RH6.A04
            java.util.Map r24 = r0.A03(r2, r7, r4)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r5 = r0.A0A
            if (r5 == 0) goto L_0x05de
            boolean r26 = X.C11432SUd.A0N(r5)
            X.MPO r5 = new X.MPO
            r5.<init>(r0, r3)
            X.Qez r21 = new X.Qez
            r22 = r4
            r23 = r8
            r25 = r5
            r21.<init>(r22, r23, r24, r25, r26)
            android.view.ContextThemeWrapper r5 = r0.A01
            java.lang.String r14 = "viewContext"
            if (r5 == 0) goto L_0x05e2
            com.facebookpay.logging.LoggingContext r4 = r0.A0C
            if (r4 == 0) goto L_0x0605
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r7 = r0.A0A
            if (r7 == 0) goto L_0x05de
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r7 = r7.A01
            if (r7 == 0) goto L_0x0589
            java.lang.Boolean r7 = r7.A05
            boolean r7 = X.AnonymousClass7TF.A1Y(r7, r3)
        L_0x03cd:
            X.Qeq r3 = new X.Qeq
            r3.<init>(r5, r4, r7)
            r4 = 22
            X.SbJ r4 = X.C11496SbJ.A00(r0, r4)
            r3.A00 = r4
            android.view.ContextThemeWrapper r7 = r0.A01
            if (r7 == 0) goto L_0x05e2
            com.facebookpay.logging.LoggingContext r5 = r0.A0C
            if (r5 == 0) goto L_0x0605
            X.Qep r4 = new X.Qep
            r4.<init>(r7, r5)
            android.view.View$OnClickListener r5 = r0.A0G
            X.0qQ.A0B(r5, r1)
            r4.A00 = r5
            android.view.ContextThemeWrapper r7 = r0.A01
            if (r7 == 0) goto L_0x05e2
            com.facebookpay.logging.LoggingContext r5 = r0.A0C
            if (r5 == 0) goto L_0x0605
            r8 = 17
            X.TY2 r8 = X.TY2.A00(r0, r8)
            X.Qes r10 = new X.Qes
            r10.<init>(r7, r2, r5, r8)
            r2 = 6
            X.Sv0 r8 = new X.Sv0
            r8.<init>(r0, r2)
            r2 = 18
            X.TY2 r2 = X.TY2.A00(r0, r2)
            X.Qen r9 = new X.Qen
            r9.<init>(r7, r5, r8, r2)
            com.facebookpay.logging.LoggingContext r7 = r0.A0C
            if (r7 == 0) goto L_0x0605
            X.RH6 r5 = X.RH6.A0M
            X.QeN r2 = new X.QeN
            r2.<init>(r5, r7, r1)
            X.0eP r11 = X.QEW.A05(r11)
            X.0eP r12 = X.QEW.A05(r15)
            X.0eP r13 = X.QEW.A05(r16)
            X.0eP r14 = X.QEW.A05(r17)
            X.0eP r15 = X.QEW.A05(r18)
            X.0eP r16 = X.QEW.A05(r19)
            X.0eP r17 = X.QEW.A05(r20)
            X.0eP r18 = X.QEW.A05(r3)
            X.0eP r19 = X.QEW.A05(r21)
            X.0eP r20 = X.QEW.A05(r4)
            X.0eP r21 = X.QEW.A05(r10)
            X.0eP r22 = X.QEW.A05(r9)
            X.0eP r23 = X.QEW.A05(r2)
            X.0eP[] r1 = new X.0eP[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.LinkedHashMap r2 = X.0Yt.A06(r1)
            X.QEh r1 = new X.QEh
            r1.<init>()
            r6.A0G = r1
            X.QEe r1 = new X.QEe
            r1.<init>(r2)
            r0.A04 = r1
            r6.setAdapter(r1)
        L_0x046a:
            X.QDN r1 = r0.A0B
            java.lang.String r11 = "ecpViewModel"
            if (r1 == 0) goto L_0x05c0
            X.2Fk r3 = r1.A0p
            X.07Z r2 = r0.getViewLifecycleOwner()
            r1 = 15
            X.TY2 r1 = X.TY2.A00(r0, r1)
            r4 = 27
            X.Dba.A16(r2, r3, r1, r4)
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2gB r3 = r1.A0q
            X.07Z r2 = r0.getViewLifecycleOwner()
            r1 = 16
            X.TY2 r1 = X.TY2.A00(r0, r1)
            X.Dba.A16(r2, r3, r1, r4)
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            java.util.List r1 = r1.A0l()
            java.util.Iterator r4 = r1.iterator()
        L_0x04a0:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x04d5
            java.lang.Object r1 = r4.next()
            X.5tb r1 = (X.C298525tb) r1
            int r2 = r1.ordinal()
            r1 = 21
            if (r2 == r1) goto L_0x04c8
            r1 = 33
            if (r2 != r1) goto L_0x04a0
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fj r3 = r1.A0z
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0U
        L_0x04c4:
            r3.A06(r2, r1)
            goto L_0x04a0
        L_0x04c8:
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fj r3 = r1.A0w
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0M
            goto L_0x04c4
        L_0x04d5:
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fj r3 = r1.A0t
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0R
            r3.A06(r2, r1)
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fj r3 = r1.A10
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0T
            r3.A06(r2, r1)
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fj r3 = r1.A0x
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0O
            r3.A06(r2, r1)
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fk r3 = r1.A00
            if (r3 != 0) goto L_0x050e
            X.2Fj r3 = X.JTO.A0K()
        L_0x050e:
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0K
            r3.A06(r2, r1)
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fk r3 = r1.A0n
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0Q
            r3.A06(r2, r1)
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.QDL r1 = r1.A1O
            X.2Fj r3 = r1.A07
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0P
            r3.A06(r2, r1)
            boolean r1 = r0.A08()
            if (r1 == 0) goto L_0x054c
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fj r3 = r1.A0y
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0S
            r3.A06(r2, r1)
        L_0x054c:
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.QDH r1 = r1.A1Q
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x0563
            X.2Fj r4 = r0.A0I
            X.07Z r3 = r0.getViewLifecycleOwner()
            X.2gO r2 = r0.A0L
            r1 = 20
            X.C11651Sdt.A01(r3, r4, r2, r1)
        L_0x0563:
            X.QDN r1 = r0.A0B
            if (r1 == 0) goto L_0x05c0
            X.2Fj r3 = r1.A0v
            X.07Z r2 = r0.getViewLifecycleOwner()
            X.2gO r1 = r0.A0J
            r3.A06(r2, r1)
            X.QDN r0 = r0.A0B
            if (r0 == 0) goto L_0x05c0
            X.QDH r0 = r0.A1Q
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0588
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = X.C11353SOm.A01()
            X.2gB r1 = r0.A04
            r0 = 0
            X.SUj.A0L(r1, r0)
        L_0x0588:
            return
        L_0x0589:
            r7 = 0
            goto L_0x03cd
        L_0x058c:
            r4 = r7
            goto L_0x02a8
        L_0x058f:
            boolean r4 = r0.A08()
            if (r4 != 0) goto L_0x02b7
            boolean r4 = r5.A07
            if (r4 == 0) goto L_0x02b7
            X.SSH r4 = X.C9961RkG.A00
            r4.A04(r6)
            goto L_0x02b7
        L_0x05a0:
            if (r4 == 0) goto L_0x05de
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r4 = r4.A04
            X.RFs r5 = r4.A04
            goto L_0x0284
        L_0x05a8:
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r4 = X.C11353SOm.A01()
            boolean r4 = r4.A05()
            if (r4 == 0) goto L_0x01f5
            r4 = 2131433074(0x7f0b1672, float:1.8487923E38)
            android.view.ViewGroup r6 = X.DbX.A0I(r8, r4)
            android.view.ContextThemeWrapper r4 = r0.A01
            if (r4 != 0) goto L_0x05c4
            java.lang.String r11 = "viewContext"
        L_0x05c0:
            X.0qQ.A0F(r11)
            goto L_0x0608
        L_0x05c4:
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r4)
            r4 = 2131239436(0x7f08220c, float:1.8095179E38)
            r5.setImageResource(r4)
            r4 = 2132017716(0x7f140234, float:1.9673718E38)
            X.C11409SSh.A05(r5, r4, r1)
            r6.addView(r5)
            goto L_0x01f5
        L_0x05da:
            X.0qQ.A0F(r12)
            goto L_0x0608
        L_0x05de:
            X.0qQ.A0F(r10)
            goto L_0x0608
        L_0x05e2:
            X.0qQ.A0F(r14)
            goto L_0x0608
        L_0x05e6:
            java.lang.String r13 = "ecpPaymentRequest"
            goto L_0x0605
        L_0x05e9:
            java.lang.String r13 = "ecpViewModel"
            goto L_0x0605
        L_0x05ec:
            X.QDN r9 = r0.A0B
            if (r9 == 0) goto L_0x0605
            java.util.Map r5 = r9.A1Y
            X.5tb r4 = X.C298525tb.ONE_TIME_CHECKOUT_OPTION
            X.SOw r5 = X.Pxh.A0T(r4, r5)
            if (r5 == 0) goto L_0x05fe
            r4 = 6
            X.C13351TVy.A01(r5, r9, r4)
        L_0x05fe:
            android.view.ContextThemeWrapper r5 = r0.A01
            if (r5 != 0) goto L_0x060d
            java.lang.String r13 = "viewContext"
        L_0x0605:
            X.0qQ.A0F(r13)
        L_0x0608:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x060d:
            com.facebookpay.logging.LoggingContext r4 = r0.A0C
            if (r4 == 0) goto L_0x0643
            X.Qeq r11 = new X.Qeq
            r11.<init>(r5, r4, r1)
            r4 = 20
            X.SbJ r4 = X.C11496SbJ.A00(r0, r4)
            r11.A00 = r4
            X.3kE r10 = r11.A09(r6)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.AnonCheckoutPuxLinkViewBinder.AnonCheckoutPuxLinkViewHolder"
            X.0qQ.A0C(r10, r4)
            android.view.View r4 = r10.itemView
            r6.addView(r4)
            X.QDN r4 = r0.A0B
            if (r4 == 0) goto L_0x0605
            X.QDH r4 = r4.A1Q
            X.2Fk r9 = r4.A06
            r4 = 42
            X.Iwy r5 = new X.Iwy
            r5.<init>(r4, r11, r0, r10)
            r4 = 27
            X.Dba.A16(r0, r9, r5, r4)
            goto L_0x006f
        L_0x0643:
            java.lang.String r13 = "loggingContext"
            goto L_0x0605
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8132QhQ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r22v0, types: [X.07Z] */
    /* JADX WARNING: type inference failed for: r22v1, types: [X.07Z] */
    /* JADX WARNING: type inference failed for: r23v2, types: [X.07Z] */
    /* JADX WARNING: type inference failed for: r22v3, types: [X.07Z] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0222, code lost:
        if (X.Pxi.A1T(r0) != true) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0293, code lost:
        X.0qQ.A0F("viewContext");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map A03(androidx.fragment.app.FragmentActivity r33, X.C13844TiK r34, X.RH6 r35) {
        /*
            r32 = this;
            r6 = r32
            r5 = r34
            if (r34 == 0) goto L_0x0060
            r0 = 0
            X.J6l r9 = new X.J6l
            r9.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r6)
            r0 = 2
            X.J6l r4 = new X.J6l
            r4.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r6)
            r0 = 1
            X.J6l r3 = new X.J6l
            r3.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r6)
        L_0x0018:
            com.facebookpay.logging.LoggingContext r8 = r6.A0C
            java.lang.String r19 = "loggingContext"
            if (r8 == 0) goto L_0x032b
            r7 = 1
            r14 = 1
            X.RH6 r0 = X.RH6.A0p
            X.QeQ r2 = new X.QeQ
            r2.<init>(r0, r8, r7)
            java.lang.String r18 = "Required value was null."
            if (r34 == 0) goto L_0x005e
            X.Qek r1 = new X.Qek
            if (r9 == 0) goto L_0x0326
            r0 = 0
            r1.<init>(r8, r9, r0, r7)
        L_0x0033:
            com.facebookpay.logging.LoggingContext r0 = r6.A0C
            if (r0 == 0) goto L_0x032b
            r9 = 32
            X.TVy r8 = new X.TVy
            r8.<init>(r6, r9)
            X.QeW r13 = new X.QeW
            r13.<init>(r0, r8)
            r10 = r35
            int r11 = r10.ordinal()
            r8 = 5
            r15 = 3
            java.lang.String r17 = "viewContext"
            r9 = 0
            switch(r11) {
                case 12: goto L_0x01c3;
                case 13: goto L_0x0064;
                case 14: goto L_0x00d2;
                case 15: goto L_0x02ad;
                case 16: goto L_0x02fa;
                case 17: goto L_0x0173;
                case 50: goto L_0x01a4;
                default: goto L_0x0052;
            }
        L_0x0052:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "{ECPBottomSheetContentFragment} ItemType is not found for identifier => "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r10, r0, r1)
            throw r0
        L_0x005e:
            r1 = 0
            goto L_0x0033
        L_0x0060:
            r9 = 0
            r4 = 0
            r3 = 0
            goto L_0x0018
        L_0x0064:
            android.view.ContextThemeWrapper r11 = r6.A01
            if (r11 == 0) goto L_0x0293
            X.Qej r7 = new X.Qej
            r7.<init>(r11, r0)
            if (r4 == 0) goto L_0x00cd
            if (r3 == 0) goto L_0x00c8
            r8 = 12
            X.TY2 r26 = X.TY2.A00(r6, r8)
            r10 = 6
            X.Qex r20 = new X.Qex
            r21 = r11
            r22 = r6
            r23 = r0
            r24 = r4
            r25 = r3
            r27 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            X.0hq r9 = r6.getChildFragmentManager()
            X.0qQ.A07(r9)
            r8 = 2131441294(0x7f0b368e, float:1.8504596E38)
            com.facebookpay.logging.LoggingContext r4 = r6.A0C
            if (r4 == 0) goto L_0x032b
            X.TY2 r3 = X.TY2.A00(r5, r10)
            X.Qeu r0 = new X.Qeu
            r0.<init>(r9, r4, r3, r8)
            X.0eP r2 = X.QEW.A05(r2)
            if (r1 == 0) goto L_0x00c3
            X.0eP r3 = X.QEW.A05(r1)
            X.0eP r4 = X.QEW.A05(r7)
            X.0eP r5 = X.QEW.A05(r20)
            X.0eP r6 = X.QEW.A05(r0)
            X.0eP r7 = X.QEW.A05(r13)
            X.0eP[] r0 = new X.0eP[]{r2, r3, r4, r5, r6, r7}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            return r0
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x00c8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x00cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x00d2:
            if (r3 == 0) goto L_0x016e
            if (r4 == 0) goto L_0x0169
            X.Qei r8 = new X.Qei
            r8.<init>(r0, r9)
            X.QeV r7 = new X.QeV
            r7.<init>(r0, r3)
            r9 = 11
            X.TY2 r26 = X.TY2.A00(r6, r9)
            r10 = 16
            X.JJQ r9 = new X.JJQ
            r9.<init>(r6, r10)
            android.view.ContextThemeWrapper r10 = r6.A01
            if (r10 == 0) goto L_0x0293
            X.Qew r20 = new X.Qew
            r21 = r10
            r22 = r6
            r23 = r0
            r24 = r4
            r25 = r3
            r27 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r9 = 10
            X.TY2 r27 = X.TY2.A00(r6, r9)
            r11 = 15
            X.JJQ r9 = new X.JJQ
            r9.<init>(r6, r11)
            X.Qev r21 = new X.Qev
            r22 = r10
            r23 = r6
            r24 = r0
            r25 = r4
            r26 = r3
            r28 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            X.0hq r10 = r6.getChildFragmentManager()
            X.0qQ.A07(r10)
            r9 = 2131430646(0x7f0b0cf6, float:1.8482999E38)
            com.facebookpay.logging.LoggingContext r4 = r6.A0C
            if (r4 == 0) goto L_0x032b
            r0 = 8
            X.TY2 r3 = X.TY2.A00(r5, r0)
            X.Qeu r0 = new X.Qeu
            r0.<init>(r10, r4, r3, r9)
            X.0eP r2 = X.QEW.A05(r2)
            if (r1 == 0) goto L_0x0164
            X.0eP r3 = X.QEW.A05(r1)
            X.0eP r4 = X.QEW.A05(r8)
            X.0eP r5 = X.QEW.A05(r7)
            X.0eP r6 = X.QEW.A05(r20)
            X.0eP r7 = X.QEW.A05(r21)
            X.0eP r8 = X.QEW.A05(r0)
            X.0eP r9 = X.QEW.A05(r13)
            X.0eP[] r0 = new X.0eP[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            return r0
        L_0x0164:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x016e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0173:
            X.0hq r8 = r6.getChildFragmentManager()
            X.0qQ.A07(r8)
            r4 = 2131437654(0x7f0b2856, float:1.8497213E38)
            com.facebookpay.logging.LoggingContext r1 = r6.A0C
            if (r1 == 0) goto L_0x032b
            r0 = 9
            X.TY2 r0 = X.TY2.A00(r5, r0)
            X.Qeu r3 = new X.Qeu
            r3.<init>(r8, r1, r0, r4)
            com.facebookpay.logging.LoggingContext r1 = r6.A0C
            if (r1 == 0) goto L_0x032b
            X.Qei r0 = new X.Qei
            r0.<init>(r1, r7)
            X.0eP r2 = X.QEW.A05(r2)
            X.0eP r1 = X.QEW.A05(r0)
            X.RH6 r0 = r3.A02
            java.util.LinkedHashMap r0 = X.DbY.A0q(r0, r3, r2, r1)
            return r0
        L_0x01a4:
            android.view.ContextThemeWrapper r4 = r6.A01
            if (r4 == 0) goto L_0x0293
            X.QeY r1 = new X.QeY
            r1.<init>(r4, r0)
            X.Qel r3 = new X.Qel
            r5 = r33
            r3.<init>(r4, r5, r0)
            X.0eP r2 = X.QEW.A05(r2)
            X.0eP r1 = X.QEW.A05(r1)
            X.RH6 r0 = r3.A02
            java.util.LinkedHashMap r0 = X.DbY.A0q(r0, r3, r2, r1)
            return r0
        L_0x01c3:
            r9 = 34
            X.TVy r11 = new X.TVy
            r11.<init>(r6, r9)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r9 = r6.A0A
            java.lang.String r16 = "ecpPaymentRequest"
            if (r9 == 0) goto L_0x02a5
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r9 = r9.A01
            if (r9 == 0) goto L_0x023a
            boolean r9 = X.Pxi.A1T(r9)
            if (r9 != r7) goto L_0x023a
        L_0x01da:
            X.Qem r10 = new X.Qem
            r10.<init>(r0, r11, r7)
            boolean r0 = A09(r6)
            if (r0 == 0) goto L_0x0238
            X.0hq r11 = r6.getChildFragmentManager()
            X.0qQ.A07(r11)
            r9 = 2131428662(0x7f0b0536, float:1.8478975E38)
            com.facebookpay.logging.LoggingContext r7 = r6.A0C
            if (r7 == 0) goto L_0x032b
            X.TY2 r0 = X.TY2.A00(r5, r8)
            X.Qeu r12 = new X.Qeu
            r12.<init>(r11, r7, r0, r9)
        L_0x01fc:
            com.facebookpay.logging.LoggingContext r11 = r6.A0C
            if (r11 == 0) goto L_0x032b
            if (r4 == 0) goto L_0x02a0
            if (r3 == 0) goto L_0x029b
            r0 = 47
            X.JFw r9 = new X.JFw
            r9.<init>(r6, r0)
            X.JK0 r8 = new X.JK0
            r8.<init>(r6, r15)
            android.view.ContextThemeWrapper r7 = r6.A01
            if (r7 == 0) goto L_0x0293
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r6.A0A
            if (r0 == 0) goto L_0x02a5
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0224
            boolean r0 = X.Pxi.A1T(r0)
            r30 = 1
            if (r0 == r14) goto L_0x0226
        L_0x0224:
            r30 = 0
        L_0x0226:
            boolean r31 = A09(r6)
            X.QDN r0 = r6.A0B
            if (r0 != 0) goto L_0x023c
            java.lang.String r0 = "ecpViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0238:
            r12 = 0
            goto L_0x01fc
        L_0x023a:
            r7 = 0
            goto L_0x01da
        L_0x023c:
            X.Qf0 r20 = new X.Qf0
            r21 = r7
            r22 = r6
            r23 = r0
            r24 = r11
            r25 = r12
            r26 = r4
            r27 = r3
            r28 = r9
            r29 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.0hq r8 = r6.getChildFragmentManager()
            X.0qQ.A07(r8)
            r7 = 2131437509(0x7f0b27c5, float:1.8496919E38)
            com.facebookpay.logging.LoggingContext r4 = r6.A0C
            if (r4 == 0) goto L_0x032b
            r0 = 7
            X.TY2 r3 = X.TY2.A00(r5, r0)
            X.Qeu r0 = new X.Qeu
            r0.<init>(r8, r4, r3, r7)
            X.0eP r2 = X.QEW.A05(r2)
            if (r1 == 0) goto L_0x028e
            X.0eP r3 = X.QEW.A05(r1)
            X.0eP r4 = X.QEW.A05(r10)
            X.0eP r5 = X.QEW.A05(r20)
            X.0eP r6 = X.QEW.A05(r0)
            X.0eP r7 = X.QEW.A05(r13)
            X.0eP[] r0 = new X.0eP[]{r2, r3, r4, r5, r6, r7}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            return r0
        L_0x028e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0293:
            X.0qQ.A0F(r17)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x029b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02a5:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02ad:
            X.RH6 r1 = X.RH6.A0e
            X.QeS r8 = new X.QeS
            r8.<init>(r1, r0, r7)
            if (r4 == 0) goto L_0x02f5
            X.Qef r5 = new X.Qef
            r5.<init>(r0, r4, r7)
            X.J6l r1 = new X.J6l
            r1.<init>((int) r15, (java.lang.Object) r10, (java.lang.Object) r6)
            com.facebookpay.logging.LoggingContext r0 = r6.A0C
            if (r0 == 0) goto L_0x032b
            X.Qek r4 = new X.Qek
            r4.<init>(r0, r1, r9, r7)
            com.facebookpay.logging.LoggingContext r3 = r6.A0C
            if (r3 == 0) goto L_0x032b
            X.RH6 r1 = X.RH6.A0u
            X.QeR r0 = new X.QeR
            r0.<init>(r1, r3, r7)
            X.0eP r1 = X.QEW.A05(r2)
            X.0eP r2 = X.QEW.A05(r4)
            X.0eP r3 = X.QEW.A05(r8)
            X.0eP r4 = X.QEW.A05(r5)
            X.0eP r5 = X.QEW.A05(r0)
            X.0eP r6 = X.QEW.A05(r13)
            X.0eP[] r0 = new X.0eP[]{r1, r2, r3, r4, r5, r6}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            return r0
        L_0x02f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02fa:
            X.RH6 r1 = X.RH6.A0g
            X.QeP r6 = new X.QeP
            r6.<init>(r1, r0, r7)
            X.RH6 r1 = X.RH6.A0d
            X.QeT r5 = new X.QeT
            r5.<init>(r1, r0, r7)
            X.RH6 r1 = X.RH6.A0i
            X.QeU r4 = new X.QeU
            r4.<init>(r1, r0, r7)
            X.0eP r3 = X.QEW.A05(r2)
            X.0eP r2 = X.QEW.A05(r6)
            X.0eP r1 = X.QEW.A05(r5)
            X.RH6 r0 = r4.A02
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r4, r3, r2, r1)
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            return r0
        L_0x0326:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x032b:
            X.0qQ.A0F(r19)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8132QhQ.A03(androidx.fragment.app.FragmentActivity, X.TiK, X.RH6):java.util.Map");
    }

    public static final void A07(C8132QhQ qhQ, Integer num) {
        String str;
        QDN qdn = qhQ.A0B;
        if (qdn == null) {
            str = "ecpViewModel";
        } else {
            AnonymousClass07Z viewLifecycleOwner = qhQ.getViewLifecycleOwner();
            LoggingContext loggingContext = qhQ.A0C;
            if (loggingContext == null) {
                str = "loggingContext";
            } else {
                qdn.A0p(viewLifecycleOwner, loggingContext, num);
                STG.A01(qhQ);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A08() {
        ECPPaymentRequest eCPPaymentRequest = this.A0A;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A0A);
        }
        return false;
    }

    public static final boolean A09(C8132QhQ qhQ) {
        ECPPaymentRequest eCPPaymentRequest = qhQ.A0A;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A07);
        }
        return false;
    }

    public static final boolean A0A(C8132QhQ qhQ) {
        ECPPaymentRequest eCPPaymentRequest = qhQ.A0A;
        if (eCPPaymentRequest == null) {
            0qQ.A0F("ecpPaymentRequest");
            throw AnonymousClass00P.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return DbX.A1a(checkoutConfiguration.A09);
        }
        return false;
    }

    public final void EUk(ECPHandler eCPHandler) {
        this.A09 = eCPHandler;
        QDN qdn = this.A0B;
        if (qdn != null) {
            qdn.A0r(eCPHandler);
        }
    }

    public static final 2Fk A02(SparseArray sparseArray, C298525tb r14, C8132QhQ qhQ, int i, boolean z) {
        String str;
        C10884Rzk rzk = AnonymousClass2E0.A01().A09;
        ECPPaymentRequest eCPPaymentRequest = qhQ.A0A;
        String str2 = "ecpPaymentRequest";
        if (eCPPaymentRequest != null) {
            String str3 = eCPPaymentRequest.A0A;
            String str4 = eCPPaymentRequest.A08;
            PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
            if (paymentReceiverInfo == null || ((str = paymentReceiverInfo.A00) == null && (str = paymentReceiverInfo.A02) == null)) {
                throw AnonymousClass7TE.A0y();
            }
            LoggingContext loggingContext = qhQ.A0C;
            if (loggingContext == null) {
                str2 = "loggingContext";
            } else {
                QDN qdn = qhQ.A0B;
                str2 = "ecpViewModel";
                if (qdn != null) {
                    OtcInput A022 = qdn.A1Q.A02(r14, z);
                    QDN qdn2 = qhQ.A0B;
                    if (qdn2 != null) {
                        return rzk.A00(sparseArray, loggingContext, A022, qdn2.A1Q.A02(r14, true), str3, str4, str, i, 1);
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C21267XRm xRm, C8132QhQ qhQ, Long l, String str, String str2) {
        Map map;
        String str3;
        C12411Sto A002 = C11353SOm.A00();
        LoggingContext loggingContext = qhQ.A0C;
        if (loggingContext == null) {
            str3 = "loggingContext";
        } else {
            QDN qdn = qhQ.A0B;
            if (qdn == null) {
                str3 = "ecpViewModel";
            } else {
                SEB A032 = qdn.A1Q.A03();
                LinkedHashMap A0n = Pxi.A0n(loggingContext);
                Pxj.A1K(l, "TARGET_NAME", str2, A0n);
                Pxi.A1I(xRm, A0n);
                Object obj = A0n.get("extra_data");
                if (!(obj instanceof Map) || (((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s2)) || (map = (Map) obj) == null)) {
                    map = AnonymousClass7TE.A1H();
                }
                SUU.A0A(A032, map);
                C12411Sto.A0A(A002, "extra_data", map, str, A0n);
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A05(C21267XRm xRm, C8132QhQ qhQ, Long l, String str, String str2, String str3, String str4, Throwable th) {
        C12411Sto A002 = C11353SOm.A00();
        LoggingContext loggingContext = qhQ.A0C;
        if (loggingContext == null) {
            Pxh.A11();
            throw AnonymousClass00P.createAndThrow();
        }
        if (th != null) {
            str4 = C11302SKm.A01(th);
        }
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        if (str3 != null) {
            A0n.put("TARGET_NAME", str3);
        }
        if (str2 != null) {
            A0n.put("VIEW_NAME", str2);
        }
        if (l != null) {
            A0n.put("component_data_id", Long.valueOf(l.longValue()));
        }
        A0n.put("CREDENTIAL_TYPE", xRm);
        if (str4 != null) {
            SUU.A0C(str4, "error_message", A0n);
        }
        ImmutableMap copyOf = ImmutableMap.copyOf(A0n);
        0qQ.A07(copyOf);
        A002.Cgl(str, copyOf);
    }

    public static final void A06(C8132QhQ qhQ) {
        String str;
        C12411Sto A0g = C51965G9l.A0g();
        LoggingContext loggingContext = qhQ.A0C;
        if (loggingContext != null) {
            QDN qdn = qhQ.A0B;
            str = "ecpViewModel";
            if (qdn != null) {
                boolean z = !qdn.A1Q.A09();
                QDN qdn2 = qhQ.A0B;
                if (qdn2 != null) {
                    C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_click_ecpotc_atomic"), 398), loggingContext, new C58771IxI(loggingContext, C66584MXp.A0f(qdn2), "choose_another_way", 2, z));
                    C12411Sto A0g2 = C51965G9l.A0g();
                    LoggingContext loggingContext2 = qhQ.A0C;
                    if (loggingContext2 != null) {
                        QDN qdn3 = qhQ.A0B;
                        if (qdn3 != null) {
                            A0g2.A0Z(loggingContext2, "nux_checkout", C66584MXp.A0f(qdn3));
                            Bundle A0J2 = Pxe.A0J(qhQ.requireArguments());
                            Fragment fragment = qhQ.mParentFragment;
                            if (fragment != null) {
                                C11336SNr.A00(A0J2, fragment, "content_nux_fragment", true, false);
                                return;
                            }
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "loggingContext";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean D0T(LoggingContext loggingContext, Integer num) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04cc, code lost:
        if (X.0qQ.A0K(r12, true) != false) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0507, code lost:
        if (X.C11431STx.A05() != false) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0510, code lost:
        if (r13 != false) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0574, code lost:
        if (X.SUj.A0Q(X.Pxh.A0S(r48).A06(X.SJ1.A00(r26, r49, r52))) == false) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05de, code lost:
        if (X.SUj.A0Q(((X.Stb) r39.getValue()).A01(X.SJ1.A00(r3, r41, r52))) == false) goto L_0x05e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x068c A[LOOP:0: B:232:0x0686->B:234:0x068c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0756 A[LOOP:1: B:272:0x0750->B:274:0x0756, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0791  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0b9e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r56) {
        /*
            r55 = this;
            r0 = -73802451(0xfffffffffb99dd2d, float:-1.5978148E36)
            int r22 = X.AnonymousClass0fD.A02(r0)
            r8 = r55
            r0 = r56
            X.C8132QhQ.super.onCreate(r0)
            android.os.Bundle r0 = r8.requireArguments()
            java.lang.String r12 = "logging_context"
            android.os.Parcelable r0 = r0.getParcelable(r12)
            java.lang.String r14 = "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext"
            X.0qQ.A0C(r0, r14)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r8.A0C = r0
            java.lang.String r3 = "loggingContext"
            if (r0 == 0) goto L_0x0c99
            r7 = 0
            X.QDN r2 = X.C11086S9g.A01(r8, r7, r0)
            r8.A0B = r2
            java.lang.String r5 = "ecpViewModel"
            if (r2 == 0) goto L_0x0c91
            X.Q6J r1 = r8.A00
            if (r1 == 0) goto L_0x0c87
            r21 = 0
            X.S0Y r0 = new X.S0Y
            r0.<init>(r1)
            r2.A03 = r0
            X.QDN r1 = r8.A0B
            if (r1 == 0) goto L_0x0c91
            com.facebookpay.logging.LoggingContext r4 = r8.A0C
            if (r4 == 0) goto L_0x0c99
            X.Sto r0 = X.C51965G9l.A0g()
            java.util.LinkedHashMap r3 = X.C66584MXp.A0f(r1)
            java.lang.String r19 = "pux_checkout"
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "client_load_ecpcheckout_display"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 54
            X.1Ln r2 = X.C51965G9l.A0U(r1, r0)
            r1 = 22
            r0 = r19
            X.TY3.A00(r2, r4, r3, r0, r1)
            com.facebookpay.expresscheckout.handler.ECPHandler r1 = r8.A09
            if (r1 == 0) goto L_0x0071
            X.QDN r0 = r8.A0B
            if (r0 == 0) goto L_0x0c91
            r0.A0r(r1)
        L_0x0071:
            X.QDN r6 = r8.A0B
            if (r6 == 0) goto L_0x0c91
            android.os.Bundle r4 = r8.requireArguments()
            X.2Fj r0 = r6.A11
            r54 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r10 = X.Pxh.A0U(r54)
            if (r10 == 0) goto L_0x0bf8
            com.facebookpay.logging.LoggingContext r9 = r6.A1P
            X.QDH r0 = r6.A1Q
            r53 = r0
            X.SGq r1 = new X.SGq
            r1.<init>(r9, r0)
            r6.A06 = r1
            java.lang.String r0 = "ECP_NUX_FLOW"
            r4.getBoolean(r0)
            java.lang.String r1 = "ECP_FORCE_DATA_REFRESH"
            r0 = r21
            boolean r0 = r4.getBoolean(r1, r0)
            r6.A0Z = r0
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r10.A0A
            java.lang.String r0 = "ECP_SESSION_ID"
            r2.putString(r0, r1)
            java.lang.String r0 = r10.A08
            r52 = r0
            java.lang.String r13 = "ECP_PRODUCT_ID"
            r2.putString(r13, r0)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r10.A05
            r18 = 0
            if (r0 == 0) goto L_0x072d
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x00bf
            java.lang.String r1 = r0.A02
        L_0x00bf:
            java.lang.String r0 = "ECP_CLIENT_RECEIVER_ID"
            r2.putString(r0, r1)
            r2.putParcelable(r12, r9)
            java.lang.String r3 = "ECP_LAUNCH_PARAMS"
            r2.putParcelable(r3, r10)
            java.lang.String r1 = "ECP_PRESELECTED_FBPAY_DATA"
            android.os.Parcelable r0 = r4.getParcelable(r1)
            r2.putParcelable(r1, r0)
            X.QD3 r5 = r6.A1V
            java.lang.String r4 = r2.getString(r13)
            if (r4 == 0) goto L_0x0bf3
            android.os.Parcelable r11 = r2.getParcelable(r3)
            java.lang.String r24 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest"
            r0 = r24
            X.0qQ.A0C(r11, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r11 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r11
            r5.A00 = r11
            android.os.Parcelable r0 = r2.getParcelable(r12)
            X.0qQ.A0C(r0, r14)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r5.A01 = r0
            X.QDH r0 = r5.A04
            r51 = r0
            X.5tb r16 = X.C298525tb.TERMS
            r20 = 1
            r11 = r16
            X.SJ1 r4 = X.SJ1.A00(r11, r0, r4)
            X.2gB r0 = r5.A02
            r50 = r0
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.S4L r0 = r0.A0G
            X.SIz r11 = r0.A00
            X.SUj r0 = X.SUj.A08(r7)
            X.2gB r0 = r11.A01(r0, r4)
            java.lang.Object r11 = r0.A02()
            r0 = r50
            r0.A0B(r11)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.S4L r0 = r0.A0G
            X.SIz r11 = r0.A00
            X.SUj r0 = X.SUj.A08(r7)
            X.2gB r4 = r11.A01(r0, r4)
            X.2gO r5 = r5.A03
            r0 = r50
            r0.A0E(r4, r5)
            X.QDU r5 = r6.A1K
            android.os.Parcelable r4 = r2.getParcelable(r3)
            r0 = r24
            X.0qQ.A0C(r4, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
            r5.A02 = r4
            java.lang.String r0 = r2.getString(r13)
            if (r0 == 0) goto L_0x0bee
            r5.A06 = r0
            android.os.Parcelable r4 = r2.getParcelable(r1)
            boolean r0 = r4 instanceof com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            if (r0 == 0) goto L_0x0165
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r4 = (com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData) r4
            if (r4 == 0) goto L_0x0165
            java.lang.String r0 = r4.A01
            r5.A04 = r0
            java.lang.String r0 = r4.A02
            r5.A05 = r0
        L_0x0165:
            java.lang.String r11 = r5.A06
            if (r11 == 0) goto L_0x0728
            X.QDH r0 = r5.A0K
            r49 = r0
            X.5tb r26 = X.C298525tb.CONTACT_INFORMATION
            r4 = r26
            X.SJ1 r0 = X.SJ1.A00(r4, r0, r11)
            r5.A01 = r0
            X.2gB r11 = r5.A0A
            X.0eM r0 = r5.A0L
            r48 = r0
            X.Std r4 = X.Pxh.A0S(r48)
            X.SJ1 r0 = r5.A01
            java.lang.String r23 = "productComponent"
            r30 = r23
            if (r0 == 0) goto L_0x0268
            X.2gB r4 = r4.A06(r0)
            X.2gO r0 = r5.A0I
            r29 = r0
            r11.A0E(r4, r0)
            X.2Fj r0 = r5.A0H
            r28 = r0
            X.2gO r0 = r5.A0J
            r27 = r0
            r4 = r0
            r0 = r28
            r11.A0E(r0, r4)
            X.Std r4 = X.Pxh.A0S(r48)
            X.SJ1 r0 = r5.A01
            if (r0 == 0) goto L_0x0268
            X.2gB r0 = r4.A06(r0)
            X.SUj r14 = X.Pxe.A0W(r0)
            if (r14 == 0) goto L_0x0200
            java.lang.Object r0 = r14.A01
            X.S60 r0 = (X.S60) r0
            if (r0 == 0) goto L_0x0722
            X.S5a r4 = r0.A01
            java.lang.String r4 = r4.A01
            r25 = r4
            X.S6I r4 = r0.A00
            java.util.List r4 = r4.A03
            java.lang.Object r15 = X.00k.A0J(r4)
            X.S6Z r15 = (X.S6Z) r15
            X.S6J r0 = r0.A02
            java.util.List r0 = r0.A03
            java.lang.Object r11 = X.00k.A0J(r0)
            X.S6V r11 = (X.S6V) r11
        L_0x01d5:
            X.S5z r17 = new X.S5z
            r4 = r17
            r0 = r25
            r4.<init>(r15, r11, r0)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.RuU r4 = new X.RuU
            r0 = r17
            r4.<init>(r11, r0, r7)
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x0728
            boolean r0 = r5.A0H(r0)
            if (r0 != 0) goto L_0x071c
            X.SUj r4 = X.SUj.A09(r4)
            X.0qQ.A0A(r4)
        L_0x01f8:
            r0 = r28
            r0.A0B(r4)
            X.QDU.A07(r5, r14)
        L_0x0200:
            X.2gB r11 = r5.A0B
            X.Std r4 = X.Pxh.A0S(r48)
            X.SJ1 r0 = r5.A01
            if (r0 == 0) goto L_0x0268
            X.2gB r4 = r4.A06(r0)
            r0 = r29
            r11.A0E(r4, r0)
            r4 = r27
            r0 = r28
            r11.A0E(r0, r4)
            X.QDT r11 = r6.A1R
            android.os.Parcelable r4 = r2.getParcelable(r3)
            r0 = r24
            X.0qQ.A0C(r4, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
            r11.A02 = r4
            java.lang.String r23 = "ecpPaymentRequest"
            if (r4 == 0) goto L_0x0268
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r4 = r4.A01
            if (r4 == 0) goto L_0x0719
            boolean r0 = r4.A0J
        L_0x0233:
            r11.A06 = r0
            if (r4 == 0) goto L_0x0716
            boolean r0 = X.Pxi.A1T(r4)
        L_0x023b:
            r0 = r0 ^ 1
            r11.A07 = r0
            android.os.Parcelable r0 = r2.getParcelable(r12)
            if (r0 == 0) goto L_0x0be9
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r11.A03 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r11.A02
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = r0.A08
            r11.A05 = r0
            android.os.Parcelable r4 = r2.getParcelable(r1)
            boolean r0 = r4 instanceof com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            if (r0 == 0) goto L_0x0713
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r4 = (com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData) r4
            if (r4 == 0) goto L_0x0713
            java.lang.String r0 = r4.A00
        L_0x025f:
            r11.A04 = r0
            java.lang.String r14 = r11.A05
            if (r14 != 0) goto L_0x0270
            java.lang.String r23 = "productId"
        L_0x0268:
            X.0qQ.A0F(r23)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0270:
            X.QDH r0 = r11.A0G
            r47 = r0
            X.5tb r17 = X.C298525tb.PAYMENT_METHOD
            r4 = r17
            X.SJ1 r0 = X.SJ1.A00(r4, r0, r14)
            r11.A01 = r0
            X.2gB r4 = r11.A08
            r46 = r4
            X.Stc r15 = r11.A0H
            X.2gB r14 = r15.A05(r0)
            X.2gO r4 = r11.A0F
            r0 = r46
            r0.A0E(r14, r4)
            X.SJ1 r0 = r11.A01
            r23 = r30
            if (r0 == 0) goto L_0x0268
            X.2gB r0 = r15.A05(r0)
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x02a2
            X.QDT.A09(r11, r0)
        L_0x02a2:
            X.2gB r0 = r11.A09
            r45 = r0
            X.SJ1 r0 = r11.A01
            if (r0 == 0) goto L_0x0268
            X.2gB r14 = r15.A05(r0)
            r0 = r45
            r0.A0E(r14, r4)
            X.QDQ r0 = r6.A1T
            r44 = r0
            android.os.Parcelable r4 = r2.getParcelable(r3)
            boolean r0 = r4 instanceof com.facebookpay.expresscheckout.models.ECPPaymentRequest
            if (r0 == 0) goto L_0x0710
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
        L_0x02c1:
            r0 = r44
            r0.A01 = r4
            X.2gB r0 = r0.A05
            r43 = r0
            r0 = r44
            X.2Fj r0 = r0.A06
            r42 = r0
            r0 = r44
            X.2gO r14 = r0.A07
            r4 = r43
            r0 = r42
            r4.A0E(r0, r14)
            X.QDS r4 = r6.A1U
            android.os.Parcelable r3 = r2.getParcelable(r3)
            boolean r0 = r3 instanceof com.facebookpay.expresscheckout.models.ECPPaymentRequest
            if (r0 == 0) goto L_0x070d
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
        L_0x02e6:
            r4.A01 = r3
            java.lang.String r0 = r2.getString(r13)
            if (r0 == 0) goto L_0x0be4
            r4.A04 = r0
            android.os.Parcelable r1 = r2.getParcelable(r1)
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            if (r0 == 0) goto L_0x070a
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r1 = (com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData) r1
            if (r1 == 0) goto L_0x070a
            java.lang.String r0 = r1.A03
        L_0x02fe:
            r4.A03 = r0
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x0728
            X.QDH r0 = r4.A0C
            r41 = r0
            X.5tb r3 = X.C298525tb.SHIPPING_ADDRESS
            X.SJ1 r0 = X.SJ1.A00(r3, r0, r1)
            r4.A00 = r0
            X.2gB r0 = r4.A06
            r40 = r0
            X.0eM r0 = r4.A0E
            r39 = r0
            java.lang.Object r1 = r39.getValue()
            X.Stb r1 = (X.Stb) r1
            X.SJ1 r0 = r4.A00
            if (r0 == 0) goto L_0x0268
            X.2gB r1 = r1.A01(r0)
            X.2gO r13 = r4.A0B
            r0 = r40
            r0.A0E(r1, r13)
            java.lang.Object r1 = r39.getValue()
            X.Stb r1 = (X.Stb) r1
            X.SJ1 r0 = r4.A00
            if (r0 == 0) goto L_0x0268
            X.2gB r0 = r1.A01(r0)
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0344
            X.QDS.A08(r4, r0)
        L_0x0344:
            X.2gB r0 = r4.A07
            r38 = r0
            java.lang.Object r1 = r39.getValue()
            X.Stb r1 = (X.Stb) r1
            X.SJ1 r0 = r4.A00
            if (r0 == 0) goto L_0x0268
            X.2gB r1 = r1.A01(r0)
            r0 = r38
            r0.A0E(r1, r13)
            X.QCz r0 = r6.A1L
            r37 = r0
            android.os.Parcelable r1 = r2.getParcelable(r12)
            if (r1 == 0) goto L_0x0bdf
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            r0.A00 = r1
            X.QDL r0 = r6.A1O
            r36 = r0
            android.os.Parcelable r1 = r2.getParcelable(r12)
            if (r1 == 0) goto L_0x0bda
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            r0.A03 = r1
            X.QDR r2 = r6.A1N
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r12 = r10.A01
            if (r12 == 0) goto L_0x0381
            java.lang.Integer r0 = r12.A0D
            r18 = r0
        L_0x0381:
            r0 = r18
            r2.A01 = r0
            java.lang.Integer r23 = X.AnonymousClass05K.A01
            r1 = r0
            r0 = r23
            if (r1 != r0) goto L_0x0395
            X.2gB r13 = r2.A03
            X.2Fj r1 = r2.A06
            X.2gO r0 = r2.A0A
            r13.A0E(r1, r0)
        L_0x0395:
            X.SP9 r1 = r6.A1M
            X.2gB r0 = r1.A09
            r35 = r0
            X.2gO r13 = r6.A1J
            r0.A09(r13)
            boolean r0 = X.C11431STx.A06()
            if (r0 == 0) goto L_0x03ad
            X.2Fj r13 = r1.A0A
            X.2gO r0 = r6.A19
            r13.A09(r0)
        L_0x03ad:
            java.lang.Object r0 = r54.A02()
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x0bd5
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0706
            java.util.Set<X.REn> r13 = r0.A0H
        L_0x03bd:
            java.lang.Object r0 = r54.A02()
            if (r0 == 0) goto L_0x0bd0
            java.lang.Object r0 = r54.A02()
            if (r0 == 0) goto L_0x0bcb
            java.lang.Object r0 = r54.A02()
            if (r0 == 0) goto L_0x0bc6
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = r0.A07
            r25 = r0
            java.lang.Object r0 = r54.A02()
            if (r0 == 0) goto L_0x0bc1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            r14 = 0
            if (r0 == 0) goto L_0x0702
            java.lang.String r0 = r0.A02
            r24 = r0
        L_0x03e6:
            java.lang.Object r0 = r54.A02()
            if (r0 == 0) goto L_0x0bbc
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x03f4
            java.util.ArrayList<java.lang.String> r14 = r0.A05
        L_0x03f4:
            r27 = r1
            r28 = r36
            r29 = r9
            r30 = r53
            r31 = r25
            r32 = r24
            r33 = r14
            r34 = r13
            r27.A03(r28, r29, r30, r31, r32, r33, r34)
            r0 = r20
            java.lang.String r32 = X.STa.A00(r10, r6, r0)
            if (r12 == 0) goto L_0x06ff
            X.RGk r0 = r12.A03
        L_0x0411:
            X.RH6 r29 = X.RH6.A0b
            com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem r27 = new com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem
            r28 = r7
            r30 = r0
            r31 = r7
            r33 = r21
            r27.<init>(r28, r29, r30, r31, r32, r33)
            X.SUj r0 = X.SUj.A09(r27)
            r6.A0H = r0
            java.lang.String r13 = r6.A0W
            X.RH6 r12 = X.RH6.A0k
            com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem r0 = new com.facebookpay.common.recyclerview.adapteritems.PuxReceiverHeaderItem
            r0.<init>(r12, r13, r7)
            X.SUj r0 = X.SUj.A08(r0)
            r6.A0P = r0
            java.lang.Object r0 = r54.A02()
            if (r0 == 0) goto L_0x0bb7
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.logging.LoggingPolicy r12 = r0.A06
            X.2Fj r0 = new X.2Fj
            r0.<init>(r12)
            r6.A00 = r0
            java.util.Map r0 = r6.A1Y
            X.5tb r13 = X.C298525tb.PAYMENT_RECEIVER
            X.SOw r14 = X.Pxh.A0T(r13, r0)
            if (r14 == 0) goto L_0x0454
            r12 = 5
            X.C13351TVy.A01(r14, r6, r12)
        L_0x0454:
            java.lang.Object r12 = r54.A02()
            if (r12 == 0) goto L_0x0bb2
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r12 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r12
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r12 = r12.A05
            if (r12 == 0) goto L_0x06fc
            java.lang.String r12 = r12.A02
        L_0x0462:
            r6.A0V = r12
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r12 = X.Pxh.A0U(r54)
            if (r12 == 0) goto L_0x06f8
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r12 = r12.A05
            if (r12 == 0) goto L_0x06f8
            java.lang.String r12 = r12.A03
            r24 = r12
        L_0x0472:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r12 = X.QDN.A02(r6)
            if (r12 == 0) goto L_0x0484
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r12 = r12.A04
            com.facebookpay.expresscheckout.models.ItemDetails r12 = r12.A09
            java.lang.Integer r12 = r12.A01
            r14 = r23
            if (r12 != r14) goto L_0x0484
            java.lang.String r24 = "Meta"
        L_0x0484:
            r12 = r24
            r6.A0W = r12
            java.lang.Object r12 = r54.A02()
            if (r12 == 0) goto L_0x0bad
            java.lang.Object r12 = r54.A02()
            if (r12 == 0) goto L_0x0ba8
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r12 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r12
            java.lang.String r12 = r12.A07
            if (r12 == 0) goto L_0x04af
            java.lang.Object r12 = r54.A02()
            if (r12 == 0) goto L_0x0ba3
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r12 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r12
            java.lang.String r12 = r12.A07
            X.SUj r14 = X.SUj.A09(r12)
            X.2Fj r12 = new X.2Fj
            r12.<init>(r14)
            r6.A01 = r12
        L_0x04af:
            X.QDN.A0M(r6)
            java.lang.String r12 = r6.A0W
            boolean r25 = X.AnonymousClass7TF.A1V(r12)
            java.lang.Boolean r12 = r6.A0T
            r24 = 1
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r20)
            if (r12 != 0) goto L_0x06e6
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r25)
            r6.A0T = r12
            boolean r12 = X.0qQ.A0K(r12, r14)
            if (r12 == 0) goto L_0x04df
        L_0x04ce:
            if (r25 == 0) goto L_0x06d4
            X.SOw r13 = X.Pxh.A0T(r13, r0)
            if (r13 == 0) goto L_0x04df
            r12 = 13
            X.TY1 r12 = X.TY1.A00(r6, r12)
            r13.A03(r12)
        L_0x04df:
            r6.A0m()
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r12 = r10.A03
            if (r12 == 0) goto L_0x06d0
            com.facebookpay.common.models.CurrencyAmount r12 = r12.A00
            if (r12 == 0) goto L_0x06d0
            java.lang.String r33 = "REGULAR"
        L_0x04ec:
            r14 = r52
            r13 = r17
            r12 = r47
            X.SJ1 r12 = X.SJ1.A00(r13, r12, r14)
            X.2gB r12 = r15.A05(r12)
            boolean r12 = X.SUj.A0Q(r12)
            r27 = 1
            if (r12 != 0) goto L_0x0509
            boolean r12 = X.C11431STx.A05()
            r13 = 1
            if (r12 == 0) goto L_0x050a
        L_0x0509:
            r13 = 0
        L_0x050a:
            boolean r12 = r6.A0Z
            if (r12 != 0) goto L_0x0512
            r25 = 0
            if (r13 == 0) goto L_0x0514
        L_0x0512:
            r25 = 1
        L_0x0514:
            java.lang.String r12 = r6.A0V
            r29 = r10
            r30 = r7
            r31 = r12
            r32 = r7
            X.SJK r24 = X.C11432SUd.A04(r28, r29, r30, r31, r32, r33)
            r11.A03 = r9
            r14 = r20
            r13 = r47
            r12 = r17
            com.facebookpay.otc.models.OtcInput r14 = r13.A02(r12, r14)
            r12 = 57343(0xdfff, float:8.0355E-41)
            r13 = r24
            X.SJK r14 = X.SJK.A00(r13, r14, r7, r12)
            if (r25 == 0) goto L_0x06cb
            java.lang.String r13 = "PERSISTENT_UP_TO_DATE"
            X.Stc.A01(r14, r9, r15, r13)
        L_0x053e:
            X.SUj r11 = r11.A0G()
            r6.A0N = r11
            r11 = r17
            boolean r11 = X.QDN.A0j(r6, r11)
            if (r11 == 0) goto L_0x0551
            X.RH6 r11 = X.RH6.A0Y
            X.QDN.A0D(r11, r6)
        L_0x0551:
            X.QDN.A0L(r6)
            boolean r11 = r6.A0Z
            if (r11 != 0) goto L_0x0576
            boolean r11 = X.C11431STx.A05()
            if (r11 != 0) goto L_0x06c7
            r14 = r26
            r13 = r49
            r11 = r52
            X.SJ1 r13 = X.SJ1.A00(r14, r13, r11)
            X.Std r11 = X.Pxh.A0S(r48)
            X.2gB r11 = r11.A06(r13)
            boolean r11 = X.SUj.A0Q(r11)
            if (r11 != 0) goto L_0x06c7
        L_0x0576:
            r24 = 1
        L_0x0578:
            java.lang.String r13 = r6.A0V
            java.lang.String r11 = r10.A09
            r32 = r11
            java.lang.String r33 = "REGULAR"
            r31 = r13
            X.SJK r15 = X.C11432SUd.A04(r28, r29, r30, r31, r32, r33)
            r5.A03 = r9
            r14 = r49
            r13 = r26
            r11 = r20
            com.facebookpay.otc.models.OtcInput r11 = r14.A02(r13, r11)
            X.SJK r15 = X.SJK.A00(r15, r11, r7, r12)
            r11 = r26
            X.RED r11 = r14.A01(r11)
            X.RED r14 = X.RED.OTC_AND_NON_OTC
            boolean r13 = X.AnonymousClass7TF.A1W(r11, r14)
            X.Std r11 = X.Pxh.A0S(r48)
            if (r24 == 0) goto L_0x06c2
            r11.A08(r15, r9, r13)
        L_0x05ab:
            X.SUj r5 = r5.A0G()
            r6.A0I = r5
            r5 = r26
            boolean r5 = X.QDN.A0j(r6, r5)
            if (r5 == 0) goto L_0x05be
            X.RH6 r5 = X.RH6.A0V
            X.QDN.A0D(r5, r6)
        L_0x05be:
            boolean r5 = r6.A0Z
            if (r5 != 0) goto L_0x05e0
            boolean r5 = X.C11431STx.A05()
            if (r5 != 0) goto L_0x06be
            r11 = r52
            r5 = r41
            X.SJ1 r11 = X.SJ1.A00(r3, r5, r11)
            java.lang.Object r5 = r39.getValue()
            X.Stb r5 = (X.Stb) r5
            X.2gB r5 = r5.A01(r11)
            boolean r5 = X.SUj.A0Q(r5)
            if (r5 != 0) goto L_0x06be
        L_0x05e0:
            java.lang.String r5 = r6.A0V
            r31 = r5
            X.SJK r5 = X.C11432SUd.A04(r28, r29, r30, r31, r32, r33)
            r4.A02 = r9
            r4 = r41
            X.RED r13 = r4.A01(r3)
            r11 = r20
            com.facebookpay.otc.models.OtcInput r4 = r4.A02(r3, r11)
            X.SJK r11 = X.SJK.A00(r5, r4, r7, r12)
            java.lang.Object r5 = r39.getValue()
            X.Stb r5 = (X.Stb) r5
            if (r27 == 0) goto L_0x0692
            boolean r4 = X.AnonymousClass7TF.A1W(r13, r14)
            r5.A02(r11, r9, r4)
        L_0x0609:
            X.SUj r5 = X.Pxe.A0W(r40)
            java.lang.Object r4 = r5.A01
            X.RuU r4 = (X.C10575RuU) r4
            if (r4 == 0) goto L_0x0690
            java.lang.Object r4 = r4.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r4 = (com.facebookpay.shippingaddress.model.ShippingAddress) r4
        L_0x0617:
            com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem r4 = X.QDS.A00(r4)
            X.SUj r4 = X.SUj.A06(r5, r4)
            r6.A0Q = r4
            boolean r4 = X.QDN.A0j(r6, r3)
            if (r4 == 0) goto L_0x062c
            X.RH6 r4 = X.RH6.A0a
            X.QDN.A0D(r4, r6)
        L_0x062c:
            X.SUj r4 = r44.A01()
            r6.A0O = r4
            java.util.List r5 = r6.A0l()
            X.5tb r25 = X.C298525tb.PICKUP_CONTACT_INFO
            r4 = r25
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0645
            X.RH6 r4 = X.RH6.A0Z
            X.QDN.A0D(r4, r6)
        L_0x0645:
            java.lang.String r4 = r6.A0V
            r31 = r4
            X.SJK r14 = X.C11432SUd.A04(r28, r29, r30, r31, r32, r33)
            X.SOm r4 = X.AnonymousClass2E0.A01()
            X.S4L r13 = r4.A0G
            r11 = r51
            r5 = r16
            r4 = r20
            com.facebookpay.otc.models.OtcInput r4 = r11.A02(r5, r4)
            X.SJK r4 = X.SJK.A00(r14, r4, r7, r12)
            r13.A00(r4)
            X.SUj r5 = X.Pxe.A0W(r50)
            X.Sca r4 = X.C11575Sca.A00
            X.SUj r4 = X.SUj.A03(r4, r5)
            r6.A0R = r4
            r4 = r36
            X.2Fj r15 = r4.A0A
            X.SUj r12 = X.Pxe.A0W(r15)
            java.lang.Object r4 = r12.A01
            com.facebookpay.incentives.model.IncentiveList r4 = (com.facebookpay.incentives.model.IncentiveList) r4
            java.util.List r4 = r4.A00
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0686:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0730
            X.Pxj.A1S(r11, r4)
            goto L_0x0686
        L_0x0690:
            r4 = 0
            goto L_0x0617
        L_0x0692:
            java.lang.String r14 = r11.A0C
            com.facebookpay.otc.models.OtcInput r4 = r11.A04
            X.SJ1 r13 = new X.SJ1
            r13.<init>(r4, r14)
            X.SIz r14 = r5.A00
            X.2gB r4 = r14.A03(r13)
            if (r4 != 0) goto L_0x06b9
            boolean r4 = X.C11431STx.A05()
            if (r4 != 0) goto L_0x06b4
            X.SUj r4 = X.SUj.A08(r7)
            X.2gB r4 = r14.A01(r4, r13)
            X.SUj.A0L(r4, r7)
        L_0x06b4:
            r4 = r21
            r5.A02(r11, r9, r4)
        L_0x06b9:
            r5.A01(r13)
            goto L_0x0609
        L_0x06be:
            r27 = 0
            goto L_0x05e0
        L_0x06c2:
            r11.A07(r15, r9, r13)
            goto L_0x05ab
        L_0x06c7:
            r24 = 0
            goto L_0x0578
        L_0x06cb:
            r15.A06(r14, r9)
            goto L_0x053e
        L_0x06d0:
            java.lang.String r33 = "PRE_FETCH"
            goto L_0x04ec
        L_0x06d4:
            X.SOw r14 = X.Pxh.A0T(r13, r0)
            if (r14 == 0) goto L_0x04df
            r13 = 30
            X.TVw r12 = new X.TVw
            r12.<init>(r13, r7, r6)
            r14.A01(r12)
            goto L_0x04df
        L_0x06e6:
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x06f0
            if (r25 != 0) goto L_0x06f0
            r24 = 0
        L_0x06f0:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r24)
            r6.A0T = r12
            goto L_0x04ce
        L_0x06f8:
            r24 = r7
            goto L_0x0472
        L_0x06fc:
            r12 = r7
            goto L_0x0462
        L_0x06ff:
            r0 = r7
            goto L_0x0411
        L_0x0702:
            r24 = r7
            goto L_0x03e6
        L_0x0706:
            X.0sl r13 = X.0sl.A00
            goto L_0x03bd
        L_0x070a:
            r0 = r7
            goto L_0x02fe
        L_0x070d:
            r3 = r7
            goto L_0x02e6
        L_0x0710:
            r4 = 0
            goto L_0x02c1
        L_0x0713:
            r0 = r7
            goto L_0x025f
        L_0x0716:
            r0 = 0
            goto L_0x023b
        L_0x0719:
            r0 = 0
            goto L_0x0233
        L_0x071c:
            X.SUj r4 = X.SUj.A0A(r4, r7)
            goto L_0x01f8
        L_0x0722:
            r25 = r7
            r15 = r7
            r11 = r7
            goto L_0x01d5
        L_0x0728:
            java.lang.String r23 = "productID"
            goto L_0x0268
        L_0x072d:
            r1 = r7
            goto L_0x00bf
        L_0x0730:
            r4 = r36
            X.2Fj r5 = r4.A09
            com.facebookpay.common.recyclerview.adapteritems.IncentiveItem r4 = X.QDL.A00(r5, r4, r11)
            X.SUj r4 = X.SUj.A06(r12, r4)
            r6.A0K = r4
            X.SUj r13 = X.Pxe.A0W(r15)
            java.lang.Object r4 = r13.A01
            com.facebookpay.incentives.model.IncentiveList r4 = (com.facebookpay.incentives.model.IncentiveList) r4
            java.util.List r4 = r4.A00
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0750:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x075a
            X.Pxj.A1S(r12, r4)
            goto L_0x0750
        L_0x075a:
            java.util.List r4 = X.SRl.A01(r5)
            int r11 = r4.size()
            X.RH6 r5 = X.RH6.A0J
            com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem r4 = new com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem
            r4.<init>(r5, r12, r11)
            X.SUj r4 = X.SUj.A06(r13, r4)
            r6.A0L = r4
            X.5tb r11 = X.C298525tb.INCENTIVES
            X.SUj r4 = r6.A0C
            X.QDN.A0N(r6, r11, r4)
            java.util.List r4 = r6.A0l()
            X.QDN.A0R(r6, r4)
            r4 = r21
            r6.A0Z = r4
            boolean r4 = X.QDN.A0b(r6)
            if (r4 == 0) goto L_0x07ae
            java.lang.String r4 = r10.A07
            if (r4 == 0) goto L_0x07ae
            java.lang.Object r10 = r54.A02()
            if (r10 == 0) goto L_0x0b9e
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r10 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r10
            java.lang.String r5 = r6.A0V
            java.lang.Object r4 = r54.A02()
            if (r4 == 0) goto L_0x0b99
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
            java.lang.String r4 = r4.A09
            r29 = r10
            r31 = r5
            r32 = r4
            X.SJK r5 = X.C11432SUd.A04(r28, r29, r30, r31, r32, r33)
            r4 = r36
            r4.A0A(r5, r9)
        L_0x07ae:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            X.5tb r4 = X.C298525tb.PRICE_TABLE
            X.SOw r12 = X.Pxh.A0T(r4, r0)
            if (r12 == 0) goto L_0x07c4
            r5 = 46
            X.Pln r4 = new X.Pln
            r4.<init>(r6, r5)
            r12.A02(r4)
        L_0x07c4:
            boolean r4 = X.C11431STx.A06()
            if (r4 == 0) goto L_0x07d1
            X.2Fj r5 = r6.A0y
            X.2gO r4 = r6.A1I
            r5.A09(r4)
        L_0x07d1:
            java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>"
            r4 = r35
            X.0qQ.A0C(r4, r5)
            r10.add(r4)
            java.lang.Object r4 = r54.A02()
            if (r4 == 0) goto L_0x0b94
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r4
            java.lang.String r13 = r4.A08
            java.lang.String r12 = r6.A0V
            r24 = 0
            if (r12 == 0) goto L_0x0b78
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r4 = X.C11353SOm.A01()
            X.RxU r4 = r4.A02(r13, r12)
            if (r4 == 0) goto L_0x0b78
            X.QXO r14 = r4.A00
            if (r14 == 0) goto L_0x0b78
            X.5tb r13 = X.C298525tb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r12 = 4
            java.lang.String r4 = "event_handling_components"
            com.google.common.collect.ImmutableList r12 = r14.getRequiredCompactedEnumListField(r12, r4, r13)
        L_0x0803:
            X.2Fj r4 = r6.A01
            X.0qQ.A0C(r4, r5)
            r10.add(r4)
            X.QDN.A00(r6, r12, r10)
            boolean r4 = X.QDN.A0j(r6, r3)
            if (r4 == 0) goto L_0x0847
            X.SOw r14 = X.Pxh.A0T(r3, r0)
            if (r14 == 0) goto L_0x0824
            r13 = 47
            X.Pln r4 = new X.Pln
            r4.<init>(r6, r13)
            r14.A02(r4)
        L_0x0824:
            X.2gB r13 = r6.A0q
            X.2gO r14 = r6.A1H
            r4 = r40
            r13.A0E(r4, r14)
            X.0qQ.A0C(r4, r5)
            r10.add(r4)
            X.2gO r14 = r6.A1G
            r4 = r38
            r13.A0E(r4, r14)
            if (r12 == 0) goto L_0x0842
            boolean r3 = r12.contains(r3)
            if (r3 == 0) goto L_0x0847
        L_0x0842:
            r3 = r40
            r1.A02(r3)
        L_0x0847:
            java.util.List r3 = r6.A0l()
            X.5tb r13 = X.C298525tb.FULFILLMENT_OPTIONS
            boolean r3 = r3.contains(r13)
            if (r3 == 0) goto L_0x0b39
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = X.Pxh.A0U(r54)
            if (r3 == 0) goto L_0x0b39
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r3 = r3.A01
            if (r3 == 0) goto L_0x0b39
            java.lang.Integer r3 = r3.A0D
            if (r3 == 0) goto L_0x0b39
            X.SOw r14 = X.Pxh.A0T(r13, r0)
            if (r14 == 0) goto L_0x0871
            r4 = 48
            X.Pln r3 = new X.Pln
            r3.<init>(r6, r4)
            r14.A02(r3)
        L_0x0871:
            X.2gB r4 = r6.A0q
            X.2gB r3 = r2.A03
            X.2gO r14 = r6.A16
            r4.A0E(r3, r14)
            X.2Fj r14 = r2.A05
            java.lang.String r2 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>"
            X.0qQ.A0C(r14, r2)
            X.2gO r2 = r6.A15
            r4.A0E(r14, r2)
            if (r12 == 0) goto L_0x088f
            boolean r2 = r12.contains(r13)
            if (r2 == 0) goto L_0x0892
        L_0x088f:
            r1.A02(r3)
        L_0x0892:
            java.lang.Object r2 = r54.A02()
            if (r2 == 0) goto L_0x0b8f
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r2
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r2 = r2.A01
            if (r2 == 0) goto L_0x08ae
            java.lang.Integer r3 = r2.A0D
            r2 = r23
            if (r3 != r2) goto L_0x08ae
            X.2gO r3 = r6.A1D
            r2 = r42
            r4.A0E(r2, r3)
            r1.A02(r2)
        L_0x08ae:
            r2 = r25
            boolean r2 = X.QDN.A0j(r6, r2)
            if (r2 == 0) goto L_0x08c7
            X.2gB r4 = r6.A0q
            X.2gO r3 = r6.A1C
            r2 = r43
            r4.A0E(r2, r3)
            r2 = r42
            X.0qQ.A0C(r2, r5)
            r10.add(r2)
        L_0x08c7:
            r2 = r17
            boolean r2 = X.QDN.A0j(r6, r2)
            if (r2 == 0) goto L_0x08fe
            r2 = r17
            X.SOw r3 = X.Pxh.A0T(r2, r0)
            if (r3 == 0) goto L_0x08dc
            r2 = r21
            X.C13351TVy.A01(r3, r6, r2)
        L_0x08dc:
            X.2gB r4 = r6.A0q
            X.2gO r3 = r6.A1E
            r2 = r46
            r4.A0E(r2, r3)
            X.2gO r3 = r6.A1B
            r2 = r45
            r4.A0E(r2, r3)
            r2 = r46
            X.0qQ.A0C(r2, r5)
            r10.add(r2)
            if (r12 == 0) goto L_0x0b32
            r2 = r17
            boolean r2 = r12.contains(r2)
            if (r2 != 0) goto L_0x0b32
        L_0x08fe:
            r2 = r16
            boolean r2 = X.QDN.A0j(r6, r2)
            if (r2 == 0) goto L_0x092c
            X.Sto r2 = X.C51965G9l.A0g()
            java.util.LinkedHashMap r13 = X.SUU.A08(r53)
            X.0Ae r3 = r2.A00
            java.lang.String r2 = "client_load_terms_init"
            X.0Aj r3 = X.C51969G9p.A0d(r3, r2)
            r2 = 105(0x69, float:1.47E-43)
            X.1Ln r4 = X.C51965G9l.A0U(r3, r2)
            r3 = 49
            r2 = r19
            X.TY3.A00(r4, r9, r13, r2, r3)
            X.2gB r4 = r6.A0q
            X.2gO r3 = r6.A1F
            r2 = r50
            r4.A0E(r2, r3)
        L_0x092c:
            java.util.List r3 = r6.A0l()
            X.5tb r2 = X.C298525tb.ITEM_LIST
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x0943
            X.SOw r2 = X.Pxh.A0T(r2, r0)
            if (r2 == 0) goto L_0x0943
            r3 = r20
            X.C13351TVy.A01(r2, r6, r3)
        L_0x0943:
            boolean r2 = X.QDN.A0j(r6, r11)
            if (r2 == 0) goto L_0x0975
            X.2gB r4 = r6.A0q
            X.2gO r2 = r6.A18
            r4.A0E(r15, r2)
            r2 = r36
            X.2Fj r3 = r2.A08
            X.2gO r2 = r6.A17
            r4.A0E(r3, r2)
            if (r12 == 0) goto L_0x0961
            boolean r2 = r12.contains(r11)
            if (r2 == 0) goto L_0x096f
        L_0x0961:
            r2 = r36
            X.2Fj r2 = r2.A0C
            r1.A02(r2)
            r2 = r36
            X.2Fj r2 = r2.A0D
            r1.A02(r2)
        L_0x096f:
            X.0qQ.A0C(r15, r5)
            r10.add(r15)
        L_0x0975:
            java.util.List r1 = r6.A0l()
            X.5tb r2 = X.C298525tb.ORDER_SUMMARY
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x098b
            X.SOw r2 = X.Pxh.A0T(r2, r0)
            if (r2 == 0) goto L_0x098b
            r1 = 2
            X.C13351TVy.A01(r2, r6, r1)
        L_0x098b:
            java.util.List r2 = r6.A0l()
            X.5tb r1 = X.C298525tb.ONE_TIME_CHECKOUT_OPTION
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x09b0
            X.SUj r1 = X.QDN.A07(r6)
            java.lang.Object r2 = r1.A01
            r1 = r21
            boolean r1 = X.AnonymousClass7TF.A1Y(r2, r1)
            if (r1 != 0) goto L_0x09b0
            X.2gB r2 = r6.A0q
            r1 = r53
            X.2Fk r3 = r1.A06
            X.2gO r1 = r6.A13
            r2.A0E(r3, r1)
        L_0x09b0:
            java.util.List r2 = r6.A0l()
            X.5tb r1 = X.C298525tb.ANON_CHECKOUT_BACK_BUTTON
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x09cd
            boolean r1 = X.QDN.A0Y(r6)
            if (r1 == 0) goto L_0x09cd
            X.2gB r2 = r6.A0q
            r1 = r53
            X.2Fk r3 = r1.A05
            X.2gO r1 = r6.A12
            r2.A0E(r3, r1)
        L_0x09cd:
            java.util.List r2 = r6.A0l()
            X.5tb r1 = X.C298525tb.APM
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0a3e
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = X.Pxh.A0U(r54)
            if (r1 == 0) goto L_0x0b2f
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r1 = r1.A03
            if (r1 == 0) goto L_0x0b2f
            com.facebookpay.common.models.CurrencyAmount r1 = r1.A00
        L_0x09e5:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = X.Pxh.A0U(r54)
            if (r2 == 0) goto L_0x0b2c
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r2 = r2.A01
            if (r2 == 0) goto L_0x0b2c
            com.facebookpay.expresscheckout.models.APMConfiguration r11 = r2.A01
        L_0x09f1:
            r2 = r53
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x0a3e
            if (r1 == 0) goto L_0x0a3e
            if (r11 == 0) goto L_0x0a3e
            r12 = 2131961386(0x7f13262a, float:1.9559467E38)
            java.lang.String r9 = r9.A02
            java.util.concurrent.atomic.AtomicLong r4 = X.C9960RkF.A00
            long r2 = r4.getAndIncrement()
            java.lang.String r27 = java.lang.String.valueOf(r2)
            long r2 = r4.getAndIncrement()
            java.lang.String r28 = java.lang.String.valueOf(r2)
            com.facebookpay.otc.models.OtcOptionState r2 = r53.A04()
            if (r2 == 0) goto L_0x0b8a
            java.lang.String r4 = r2.A01
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r1.A00
            com.facebookpay.bloks.nativeprops.APMBloksNativeProps r1 = new com.facebookpay.bloks.nativeprops.APMBloksNativeProps
            r25 = r1
            r26 = r9
            r29 = r4
            r30 = r3
            r31 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            X.RH6 r3 = X.RH6.A0B
            com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem r2 = new com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem
            r2.<init>(r1, r3, r11, r4)
            X.SUj r1 = X.SUj.A08(r2)
            r6.A08 = r1
        L_0x0a3e:
            java.util.List r1 = r6.A0l()
            X.5tb r3 = X.C298525tb.EMAIL_OPTIN
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0ac0
            boolean r1 = X.QDN.A0Z(r6)
            if (r1 == 0) goto L_0x0ac0
            X.SOw r1 = X.Pxh.A0T(r3, r0)
            if (r1 == 0) goto L_0x0a5a
            r0 = 3
            X.C13351TVy.A01(r1, r6, r0)
        L_0x0a5a:
            X.2gB r2 = r6.A0q
            java.lang.Object r1 = r54.A02()
            if (r1 == 0) goto L_0x0b85
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.Object r0 = r54.A02()
            if (r0 == 0) goto L_0x0b80
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0b29
            java.lang.String r0 = r0.A02
        L_0x0a72:
            r28 = r7
            r29 = r1
            r30 = r7
            r31 = r0
            r32 = r7
            X.SJK r4 = X.C11432SUd.A04(r28, r29, r30, r31, r32, r33)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.RpC r1 = r0.A02
            r0 = r37
            X.QDH r9 = r0.A01
            r0 = r20
            com.facebookpay.otc.models.OtcInput r3 = r9.A02(r3, r0)
            r0 = 57343(0xdfff, float:8.0355E-41)
            X.SJK r4 = X.SJK.A00(r4, r3, r7, r0)
            java.lang.String r0 = "EMAIL_OPTIN"
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r0)
            r0 = r21
            X.0qQ.A0B(r3, r0)
            r4.A01 = r3
            X.5A3 r9 = X.AnonymousClass2E0.A06()
            X.Sc3 r3 = new X.Sc3
            r0 = r20
            r3.<init>(r0, r4, r1)
            X.ScR r0 = X.C11566ScR.A00
            X.QCn r1 = X.SSC.A02(r9, r0, r3)
            X.TX5 r0 = X.TX5.A00
            X.2gB r1 = X.AnonymousClass72Y.A01(r1, r0)
            X.2gO r0 = r6.A14
            r2.A0E(r1, r0)
        L_0x0ac0:
            java.util.List r0 = r6.A0l()
            X.5tb r3 = X.C298525tb.PAY_BUTTON
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0c33
            X.2gB r2 = r6.A0q
            X.QDJ r1 = r6.A1S
            java.lang.Object r9 = r54.A02()
            if (r9 == 0) goto L_0x0b7b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r9 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r9
            java.lang.String r4 = r6.A0V
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r54)
            if (r0 == 0) goto L_0x0ae4
            java.lang.String r0 = r0.A09
            r24 = r0
        L_0x0ae4:
            r28 = r7
            r29 = r9
            r30 = r7
            r31 = r4
            r32 = r24
            X.SJK r9 = X.C11432SUd.A04(r28, r29, r30, r31, r32, r33)
            X.TX7 r4 = X.TX7.A00
            r0 = r35
            X.2gB r4 = X.AnonymousClass72Y.A01(r0, r4)
            X.QDH r11 = r1.A0A
            r0 = r20
            com.facebookpay.otc.models.OtcInput r3 = r11.A02(r3, r0)
            r0 = 57343(0xdfff, float:8.0355E-41)
            X.SJK r9 = X.SJK.A00(r9, r3, r7, r0)
            java.util.List r11 = r1.A0B
            r11.clear()
            java.util.Iterator r12 = r10.iterator()
        L_0x0b12:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0bfc
            java.lang.Object r10 = r12.next()
            X.2Fk r10 = (X.2Fk) r10
            X.2gB r3 = r1.A05
            X.2gO r0 = r1.A08
            r3.A0E(r10, r0)
            r11.add(r10)
            goto L_0x0b12
        L_0x0b29:
            r0 = r7
            goto L_0x0a72
        L_0x0b2c:
            r11 = r7
            goto L_0x09f1
        L_0x0b2f:
            r1 = r7
            goto L_0x09e5
        L_0x0b32:
            r2 = r46
            r1.A02(r2)
            goto L_0x08fe
        L_0x0b39:
            java.util.List r3 = r6.A0l()
            X.5tb r13 = X.C298525tb.SHIPPING_OPTIONS
            boolean r3 = r3.contains(r13)
            if (r3 == 0) goto L_0x08ae
            X.SOw r14 = X.Pxh.A0T(r13, r0)
            if (r14 == 0) goto L_0x0b55
            r4 = 49
            X.Pln r3 = new X.Pln
            r3.<init>(r6, r4)
            r14.A02(r3)
        L_0x0b55:
            X.2gB r4 = r6.A0q
            X.2gB r3 = r2.A03
            X.2gO r14 = r6.A16
            r4.A0E(r3, r14)
            X.2Fj r14 = r2.A05
            java.lang.String r2 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>"
            X.0qQ.A0C(r14, r2)
            X.2gO r2 = r6.A15
            r4.A0E(r14, r2)
            if (r12 == 0) goto L_0x0b73
            boolean r2 = r12.contains(r13)
            if (r2 == 0) goto L_0x08ae
        L_0x0b73:
            r1.A02(r3)
            goto L_0x08ae
        L_0x0b78:
            r12 = r7
            goto L_0x0803
        L_0x0b7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0b80:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0b85:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0b8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0b8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0b94:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0b99:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0b9e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0ba3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0ba8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bad:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bb2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bb7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bbc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bc1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bc6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bcb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bd0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bd5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0bda:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0bdf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0be4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0be9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0bee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0bf3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0bf8:
            X.QDN.A0I(r6)
            goto L_0x0c69
        L_0x0bfc:
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.SIP r3 = r0.A0E
            java.lang.String r0 = "PERSISTENT_UP_TO_5_MINS"
            X.S1I r0 = X.C9619Rdx.A00(r0)
            X.2gB r9 = X.SIP.A00(r0, r9, r3)
            X.2gB r3 = r1.A05
            X.2gO r0 = r1.A07
            r3.A0E(r9, r0)
            X.0qQ.A0C(r9, r5)
            r11.add(r9)
            X.2gO r0 = r1.A09
            r3.A0E(r4, r0)
            X.QDJ.A01(r1)
            X.2gO r0 = r6.A1A
            r2.A0E(r3, r0)
            X.2Fj r4 = r6.A01
            X.TX8 r3 = X.TX8.A00
            r1 = 6
            X.LZv r0 = new X.LZv
            r0.<init>(r3, r1)
            r2.A0E(r4, r0)
        L_0x0c33:
            java.util.List r0 = r6.A0l()
            X.QDN.A0R(r6, r0)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r2 = X.C11353SOm.A01()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r54)
            if (r0 == 0) goto L_0x0c80
            java.lang.String r1 = r0.A08
        L_0x0c46:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.Pxh.A0U(r54)
            if (r0 == 0) goto L_0x0c52
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0c52
            java.lang.String r7 = r0.A02
        L_0x0c52:
            X.OV4 r0 = r2.A06
            if (r1 == 0) goto L_0x0c82
            X.RyJ r0 = r0.A00(r1, r7)
            com.facebookpay.expresscheckout.models.CheckoutResponse r0 = X.C11432SUd.A08(r0)
            if (r0 == 0) goto L_0x0c63
            X.QDN.A0I(r6)
        L_0x0c63:
            r0 = r21
            r6.A0b = r0
            r6.A0a = r0
        L_0x0c69:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.QCJ.A01(r8)
            r8.A0A = r0
            X.0sL r1 = r8.A0Y
            java.lang.String r0 = "selectionContentRequestKey"
            X.06F.A00(r8, r0, r1)
            r1 = -6698281(0xffffffffff99cad7, float:NaN)
            r0 = r22
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x0c80:
            r1 = r7
            goto L_0x0c46
        L_0x0c82:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0c87:
            java.lang.String r0 = "contextResourcesWrapper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c91:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c99:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8132QhQ.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable indeterminateDrawable;
        int A022 = AnonymousClass0fD.A02(-682622000);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A01 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_bottom_sheet_content_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.full_screen_loading_overlay);
        if (findViewById != null) {
            AnonymousClass2E0.A0A();
            ContextThemeWrapper contextThemeWrapper = this.A01;
            if (contextThemeWrapper != null) {
                findViewById.setBackgroundColor(2eL.A06(contextThemeWrapper.getColor(R.color.igds_elevated_background), 153));
            }
            0qQ.A0F("viewContext");
            throw AnonymousClass00P.createAndThrow();
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress_ring_view);
        if (!(progressBar == null || (indeterminateDrawable = progressBar.getIndeterminateDrawable()) == null)) {
            AnonymousClass2E0.A0A();
            ContextThemeWrapper contextThemeWrapper2 = this.A01;
            if (contextThemeWrapper2 != null) {
                indeterminateDrawable.setColorFilter(contextThemeWrapper2.getColor(R.color.igds_primary_text), PorterDuff.Mode.SRC_IN);
            }
            0qQ.A0F("viewContext");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.loading_screen_text_fb);
        this.A02 = A0d;
        if (A0d != null) {
            A0d.setText(JTO.A0A(this.A0X, this.A00));
        }
        AnonymousClass0fD.A09(1631864635, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(897636820);
        C8132QhQ.super.onDestroy();
        QDN qdn = this.A0B;
        if (qdn == null) {
            str = "ecpViewModel";
        } else {
            QDT qdt = qdn.A1R;
            SJ1 sj1 = qdt.A01;
            if (sj1 != null) {
                AnonymousClass2gB r1 = qdt.A08;
                Stc stc = qdt.A0H;
                str = "productComponent";
                r1.A0D(stc.A05(sj1));
                AnonymousClass2gB r12 = qdt.A09;
                SJ1 sj12 = qdt.A01;
                if (sj12 != null) {
                    r12.A0D(stc.A05(sj12));
                }
            }
            QDS qds = qdn.A1U;
            if (qds.A00 != null) {
                AnonymousClass2gB r2 = qds.A06;
                AnonymousClass0eM r6 = qds.A0E;
                Stb stb = (Stb) r6.getValue();
                SJ1 sj13 = qds.A00;
                if (sj13 != null) {
                    r2.A0D(stb.A01(sj13));
                    AnonymousClass2gB r22 = qds.A07;
                    Stb stb2 = (Stb) r6.getValue();
                    SJ1 sj14 = qds.A00;
                    if (sj14 != null) {
                        r22.A0D(stb2.A01(sj14));
                    }
                }
                0qQ.A0F("productComponent");
                throw AnonymousClass00P.createAndThrow();
            }
            QDU qdu = qdn.A1K;
            if (qdu.A01 != null) {
                AnonymousClass2gB r23 = qdu.A0A;
                AnonymousClass0eM r3 = qdu.A0L;
                C12404Std A0S2 = Pxh.A0S(r3);
                SJ1 sj15 = qdu.A01;
                str = "productComponent";
                if (sj15 != null) {
                    r23.A0D(A0S2.A06(sj15));
                    AnonymousClass2gB r24 = qdu.A0B;
                    C12404Std A0S3 = Pxh.A0S(r3);
                    SJ1 sj16 = qdu.A01;
                    if (sj16 != null) {
                        r24.A0D(A0S3.A06(sj16));
                    }
                }
            }
            AnonymousClass0fD.A09(-2106695977, A022);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(342252604);
        C8132QhQ.super.onDestroyView();
        this.A02 = null;
        this.A0F.removeCallbacks(this.A0W);
        AnonymousClass0fD.A09(66305698, A022);
    }

    public final void onResume() {
        String str;
        C8924RFs rFs;
        int A022 = AnonymousClass0fD.A02(-534717005);
        super.onResume();
        QDN qdn = this.A0B;
        if (qdn == null) {
            str = "ecpViewModel";
        } else {
            boolean A0v = qdn.A0v();
            ContextThemeWrapper contextThemeWrapper = this.A01;
            if (contextThemeWrapper == null) {
                str = "viewContext";
            } else {
                str = "ecpPaymentRequest";
                ECPPaymentRequest eCPPaymentRequest = this.A0A;
                if (A0v) {
                    if (eCPPaymentRequest != null) {
                        rFs = eCPPaymentRequest.A04.A03;
                    }
                } else if (eCPPaymentRequest != null) {
                    rFs = eCPPaymentRequest.A04.A04;
                }
                boolean A0A2 = A0A(this);
                ECPPaymentRequest eCPPaymentRequest2 = this.A0A;
                if (eCPPaymentRequest2 != null) {
                    C9656Rea.A00(contextThemeWrapper, this, rFs, (String) null, (String) null, new C13351TVy(this, 36), new GA1(4, this, A0v), A0A2, C11432SUd.A0N(eCPPaymentRequest2));
                    AnonymousClass0fD.A09(-126992053, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
