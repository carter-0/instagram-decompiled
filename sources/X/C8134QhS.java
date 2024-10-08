package X;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.QhS  reason: case insensitive filesystem */
public final class C8134QhS extends C8608Qxp implements C13875Tiw {
    public ECPHandler A00;
    public ECPPaymentRequest A01;
    public Q6J A02;
    public boolean A03;
    public final AnonymousClass2gB A04 = Pxh.A0M();
    public final AnonymousClass0eM A05 = C13351TVy.A00(this, 39);
    public final AnonymousClass0eM A06 = C13351TVy.A00(this, 41);
    public final AnonymousClass0eM A07 = C13351TVy.A00(this, 42);
    public final AnonymousClass0eM A08 = C13351TVy.A00(this, 47);
    public final C62320sa A09 = new C13351TVy(this, 40);
    public final C62320sa A0A = new C13351TVy(this, 46);
    public final C9829Rhr A0B;

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C8134QhS.super.onAttach(context);
    }

    public final void onAttachFragment(Fragment fragment) {
        QAL qal;
        BottomSheetBehavior A062;
        0qQ.A0B(fragment, 0);
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            if (fragment instanceof C13732Tg4) {
                ((C13732Tg4) fragment).EUk(eCPHandler);
            }
            ((QDN) this.A05.getValue()).A0r(eCPHandler);
        }
        A02();
        Dialog dialog = this.A01;
        if ((dialog instanceof QAL) && (qal = (QAL) dialog) != null && (A062 = qal.A06()) != null) {
            A062.A0b(!A03(this));
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        0qQ.A07(DbV.A05(this));
        C8134QhS.super.onConfigurationChanged(configuration);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest != null && C11432SUd.A0N(eCPPaymentRequest)) {
            A0H();
            ConstraintLayout constraintLayout = this.A04;
            if (constraintLayout != null) {
                C11496SbJ.A01(constraintLayout, 23, this);
            } else {
                0qQ.A0F("transparentViewContainer");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        Dialog dialog = this.A01;
        if (dialog instanceof QAL) {
            BottomSheetBehavior A062 = ((QAL) dialog).A06();
            A062.A0b(false);
            A062.A0a(new C8600Qxh(this, A062));
        }
    }

    public static final ECPPaymentRequest A01(C8134QhS qhS) {
        ECPPaymentRequest eCPPaymentRequest = qhS.A01;
        if (eCPPaymentRequest == null) {
            Parcelable parcelable = qhS.requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
            if (parcelable instanceof ECPPaymentRequest) {
                eCPPaymentRequest = (ECPPaymentRequest) parcelable;
            } else {
                eCPPaymentRequest = null;
            }
            qhS.A01 = eCPPaymentRequest;
        }
        return eCPPaymentRequest;
    }

    private final void A02() {
        Dialog dialog = this.A01;
        if (dialog instanceof QAL) {
            ConstraintLayout constraintLayout = this.A05;
            if (constraintLayout != null) {
                constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C64292LYs(0, dialog, this));
            } else {
                0qQ.A0F("viewContainer");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final Dialog A0F(Bundle bundle) {
        return A0G(new C13351TVy(this, 44));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r1v3 X.Tg4) = (r1v0 X.Tg4)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A0J(com.facebookpay.expresscheckout.handler.ECPHandler r4) {
        /*
            r3 = this;
            r3.A00 = r4
            X.0hq r0 = r3.getChildFragmentManager()
            java.lang.String r2 = "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG"
            androidx.fragment.app.Fragment r1 = r0.A0R(r2)
            boolean r0 = r1 instanceof X.C13732Tg4
            if (r0 == 0) goto L_0x0019
            X.Tg4 r1 = (X.C13732Tg4) r1
            if (r1 == 0) goto L_0x0019
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r3.A00
            r1.EUk(r0)
        L_0x0019:
            X.0hq r0 = r3.getChildFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.A0R(r2)
            if (r0 == 0) goto L_0x0030
            X.0eM r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r3.A00
            r1.A0r(r0)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8134QhS.A0J(com.facebookpay.expresscheckout.handler.ECPHandler):void");
    }

    public C8134QhS() {
        C9829Rhr A092 = AnonymousClass2E0.A09();
        0qQ.A07(A092);
        this.A0B = A092;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r1v3 X.QCJ) = (r1v2 X.QCJ)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final boolean A03(X.C8134QhS r1) {
        /*
            X.0hq r1 = r1.getChildFragmentManager()
            java.lang.String r0 = "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG"
            androidx.fragment.app.Fragment r1 = r1.A0R(r0)
            boolean r0 = r1 instanceof X.QCJ
            if (r0 == 0) goto L_0x0018
            X.QCJ r1 = (X.QCJ) r1
            if (r1 == 0) goto L_0x0018
            boolean r0 = r1 instanceof X.C8129QhN
            if (r0 == 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8134QhS.A03(X.QhS):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r1v3 X.Tg4) = (r1v1 X.Tg4)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A0K(java.lang.Integer r4) {
        /*
            r3 = this;
            X.0hq r1 = r3.getChildFragmentManager()
            java.lang.String r0 = "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG"
            androidx.fragment.app.Fragment r1 = r1.A0R(r0)
            boolean r0 = r1 instanceof X.C13732Tg4
            if (r0 == 0) goto L_0x0043
            X.Tg4 r1 = (X.C13732Tg4) r1
            if (r1 == 0) goto L_0x0043
            X.0eM r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            boolean r0 = r1.D0T(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0022:
            boolean r0 = X.DbX.A1a(r0)
            if (r0 != 0) goto L_0x003f
            X.0eM r0 = r3.A05
            java.lang.Object r2 = r0.getValue()
            X.QDN r2 = (X.QDN) r2
            X.07Z r1 = r3.getViewLifecycleOwner()
            X.0eM r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r2.A0p(r1, r0, r4)
        L_0x003f:
            r3.A07()
            return
        L_0x0043:
            r0 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8134QhS.A0K(java.lang.Integer):void");
    }

    public final boolean D68() {
        A02();
        return super.D68();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(947327772);
        C8134QhS.super.onCreate(bundle);
        A01(this);
        this.A02 = new Q6J(requireContext(), this.A0B);
        AnonymousClass2gB r4 = this.A04;
        Pxi.A1A(((QDN) this.A05.getValue()).A0o, r4, TY2.A00(this, 19), 28);
        Pxi.A1A(((QDM) this.A07.getValue()).A07, r4, TY2.A00(this, 20), 28);
        AnonymousClass2E0.A0D();
        Context context = getContext();
        if (context != null) {
            Class cls = AutofillManager.class;
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(cls);
            if (autofillManager.isEnabled() && autofillManager.isAutofillSupported()) {
                C51965G9l.A0g().A01.markerStart(223872246);
                ((AutofillManager) context.getSystemService(cls)).registerCallback((AutofillManager.AutofillCallback) C9968RkN.A00.getValue());
                C12411Sto A0g = C51965G9l.A0g();
                LoggingContext loggingContext = (LoggingContext) this.A06.getValue();
                String str = null;
                ComponentName autofillServiceComponentName = ((AutofillManager) context.getSystemService(cls)).getAutofillServiceComponentName();
                if (autofillServiceComponentName != null) {
                    str = autofillServiceComponentName.flattenToShortString();
                }
                0qQ.A0B(loggingContext, 0);
                A0g.A01.markerEnd(223872246, 2);
                TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_enable_platformautofill_success"), 36), loggingContext, (Object) null, str, 14);
            }
        }
        AnonymousClass0fD.A09(-951073789, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(971937823);
        AnonymousClass2gB r1 = this.A04;
        r1.A0D(((QDN) this.A05.getValue()).A0o);
        r1.A0D(((QDM) this.A07.getValue()).A07);
        Context context = getContext();
        if (context != null) {
            ((AutofillManager) context.getSystemService(AutofillManager.class)).unregisterCallback((AutofillManager.AutofillCallback) C9968RkN.A00.getValue());
        }
        C8134QhS.super.onDestroy();
        AnonymousClass0fD.A09(-1232211660, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1530022880);
        C8134QhS.super.onPause();
        requireActivity().setRequestedOrientation(10);
        AnonymousClass0fD.A09(-1995717248, A022);
    }

    public final void onResume() {
        int i;
        CheckoutConfiguration checkoutConfiguration;
        int A022 = AnonymousClass0fD.A02(824119500);
        C8134QhS.super.onResume();
        0qQ.A07(DbV.A05(this));
        FragmentActivity requireActivity = requireActivity();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
            i = 1;
        } else {
            i = checkoutConfiguration.A00;
        }
        requireActivity.setRequestedOrientation(i);
        AnonymousClass0fD.A09(1942760132, A022);
    }
}
