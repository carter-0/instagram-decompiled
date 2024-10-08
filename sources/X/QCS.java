package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebookpay.form.view.FormLayout;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.instagram.android.R;

public final class QCS extends Fragment implements C13610Tdc, C13616Tdi {
    public Dialog A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public FormLayout A05;
    public QD8 A06;
    public FormParams A07;
    public QDC A08;
    public C10261RpL A09;
    public C11380SQs A0A;
    public final View.OnClickListener A0B = C11496SbJ.A00(this, 50);
    public final View.OnClickListener A0C = C11496SbJ.A00(this, 49);
    public final C13611Tdd A0D = new C12466Suy(this);

    public final C11005S4z C7o() {
        boolean z = true;
        FormParams formParams = this.A08.A01;
        String str = formParams.A0A;
        if (str == null) {
            str = getString(formParams.A06);
        }
        if (this.A08.A05.A02() == null || !AnonymousClass7TE.A1a(this.A08.A05.A02())) {
            z = false;
        }
        boolean z2 = this.A08.A01.A0B;
        return new C11005S4z((Drawable) null, this.A0C, getString(2131962201), str, 0, 1, z, z2, true);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 0 && intent != null) {
            if (this.A09 == null) {
                this.A09 = new C10261RpL();
            }
            AnonymousClass2E0.A0I();
            throw Pxi.A0p("An operation is not implemented: ", "add ig implementation");
        }
    }

    public final boolean onBackPressed() {
        FormLogEvents formLogEvents;
        QDC qdc = this.A08;
        FormParams formParams = qdc.A01;
        if (formParams.A00 == null || (formLogEvents = formParams.A02) == null) {
            return false;
        }
        Pxj.A1I(qdc, formLogEvents.A00);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            r26 = this;
            r6 = r26
            android.os.Bundle r0 = r6.mArguments
            r0.getClass()
            r7 = 0
            X.SQs r0 = new X.SQs
            r0.<init>(r6, r7)
            r6.A0A = r0
            X.Tdd r1 = r6.A0D
            X.0qQ.A0B(r1, r7)
            java.util.Set r0 = r0.A08
            r0.add(r1)
            android.os.Bundle r1 = r6.mArguments
            java.lang.String r0 = "form_params"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            r0.getClass()
            com.fbpay.hub.form.params.FormParams r0 = (com.fbpay.hub.form.params.FormParams) r0
            r6.A07 = r0
            X.2YN r1 = X.SRV.A00(r6)
            java.lang.Class<X.QDC> r0 = X.QDC.class
            X.2YL r0 = r1.A00(r0)
            X.QDC r0 = (X.QDC) r0
            r6.A08 = r0
            X.2YN r1 = new X.2YN
            r1.<init>(r6)
            java.lang.Class<X.QD8> r0 = X.QD8.class
            X.2YL r1 = r1.A00(r0)
            X.QD8 r1 = (X.QD8) r1
            r6.A06 = r1
            X.QDC r8 = r6.A08
            com.fbpay.hub.form.params.FormParams r0 = r6.A07
            r8.A01 = r0
            r8.A00 = r1
            com.google.common.collect.ImmutableList r0 = r0.A07
            X.0qQ.A0B(r0, r7)
            r11 = 0
            r1.A03(r11, r0)
            com.fbpay.hub.form.params.FormParams r0 = r8.A01
            com.fbpay.hub.form.params.FormDialogParams r0 = r0.A01
            if (r0 == 0) goto L_0x0090
            java.lang.String r5 = r0.A05
            int r4 = r0.A03
            java.lang.String r14 = r0.A04
            int r3 = r0.A00
            int r2 = r0.A02
            int r1 = r0.A01
            r0 = 33
            X.SVE r12 = X.SVE.A00(r8, r0)
            r0 = 32
            X.SVE r10 = X.SVE.A00(r8, r0)
            r22 = 1
            X.SOk r9 = new X.SOk
            r13 = r11
            r15 = r11
            r16 = r11
            r21 = r7
            r23 = r2
            r24 = r4
            r25 = r22
            r20 = r7
            r19 = r1
            r18 = r3
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11 = r9
        L_0x0090:
            r8.A02 = r11
            X.QD8 r0 = r8.A00
            X.2gB r1 = r0.A03
            X.2gB r2 = r8.A05
            r2.A0D(r1)
            r0 = 53
            X.C11652Sdu.A03(r1, r2, r8, r0)
            X.2gB r1 = r8.A04
            r2.A0D(r1)
            r0 = 54
            X.C11652Sdu.A03(r1, r2, r8, r0)
            com.facebook.quicklog.QuickPerformanceLogger r1 = X.SRV.A01()
            r0 = 110173292(0x6911c6c, float:5.45847E-35)
            r2 = 2
            r1.markerEnd(r0, r2)
            com.facebook.quicklog.QuickPerformanceLogger r1 = X.SRV.A01()
            r0 = 110175975(0x69126e7, float:5.46001E-35)
            r1.markerEnd(r0, r2)
            com.fbpay.hub.form.params.FormParams r1 = r8.A01
            com.facebookpay.logging.FBPayLoggerData r0 = r1.A00
            if (r0 == 0) goto L_0x00ce
            com.fbpay.hub.form.params.FormLogEvents r0 = r1.A02
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.A03
            X.Pxj.A1I(r8, r0)
        L_0x00ce:
            X.RpL r0 = r6.A09
            if (r0 != 0) goto L_0x00d9
            X.RpL r0 = new X.RpL
            r0.<init>()
            r6.A09 = r0
        L_0x00d9:
            r0 = 2131433104(0x7f0b1690, float:1.8487984E38)
            r2 = r27
            android.view.View r3 = r2.requireViewById(r0)
            com.facebookpay.form.view.FormLayout r3 = (com.facebookpay.form.view.FormLayout) r3
            r6.A05 = r3
            X.QD8 r0 = r6.A06
            X.0qQ.A0B(r0, r7)
            r3.A01 = r0
            X.2Fj r1 = r0.A04
            X.Sdp r0 = r3.A04
            r1.A09(r0)
            X.QDC r0 = r6.A08
            com.fbpay.hub.form.params.FormParams r0 = r0.A01
            int r0 = r0.A05
            if (r0 == 0) goto L_0x011a
            r0 = 2131439805(0x7f0b30bd, float:1.8501576E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r6.A04 = r0
            r0.setVisibility(r7)
            android.widget.TextView r1 = r6.A04
            android.view.View$OnClickListener r0 = r6.A0B
            X.AnonymousClass0fU.A00(r0, r1)
            android.widget.TextView r1 = r6.A04
            X.QDC r0 = r6.A08
            com.fbpay.hub.form.params.FormParams r0 = r0.A01
            int r0 = r0.A05
            r1.setText(r0)
        L_0x011a:
            r0 = 2131430745(0x7f0b0d59, float:1.84832E38)
            android.view.View r0 = r2.requireViewById(r0)
            r6.A02 = r0
            r0 = 2131438585(0x7f0b2bf9, float:1.8499101E38)
            android.view.View r0 = r2.requireViewById(r0)
            r6.A03 = r0
            r0 = 2131430668(0x7f0b0d0c, float:1.8483043E38)
            android.view.View r0 = r2.requireViewById(r0)
            r6.A01 = r0
            X.QD8 r0 = r6.A06
            X.2gB r1 = r0.A02
            r0 = 45
            X.C11652Sdu.A02(r6, r1, r0)
            X.QDC r0 = r6.A08
            X.2gB r1 = r0.A05
            r0 = 46
            X.C11652Sdu.A02(r6, r1, r0)
            X.QDC r0 = r6.A08
            X.2gB r1 = r0.A03
            r0 = 47
            X.C11652Sdu.A02(r6, r1, r0)
            X.QDC r0 = r6.A08
            X.2Fj r1 = r0.A07
            r0 = 48
            X.C11652Sdu.A02(r6, r1, r0)
            X.QDC r0 = r6.A08
            X.2gB r1 = r0.A04
            r0 = 49
            X.C11652Sdu.A02(r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCS.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-494316168);
        Context context = getContext();
        AnonymousClass2E0.A0E();
        View A0C2 = DbT.A0C(layoutInflater.cloneInContext(new ContextThemeWrapper(context, R.style.Ig4aFbPay)), viewGroup, R.layout.fragment_base_form);
        AnonymousClass0fD.A09(-567236217, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-140598966);
        QCS.super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        AnonymousClass0fD.A09(-951795388, A022);
    }
}
