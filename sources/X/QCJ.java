package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.instagram.android.R;

public abstract class QCJ extends Fragment {
    public Q6J A00;
    public final C9829Rhr A01;

    public static ContextThemeWrapper A00(QCJ qcj, Object obj) {
        0qQ.A0B(obj, 0);
        Q6J q6j = qcj.A00;
        if (q6j != null) {
            AnonymousClass2E0.A0A();
            return new ContextThemeWrapper(q6j, R.style.FBPayUIWidget);
        }
        0qQ.A0F("contextResourcesWrapper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        QCJ.super.onAttach(context);
        this.A00 = new Q6J(context, this.A01);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        0qQ.A07(DbV.A05(this));
        QCJ.super.onConfigurationChanged(configuration);
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        if (!(this instanceof C8127QhL) || !((C8127QhL) this).A0L) {
            C8608Qxp qxp = this.mParentFragment;
            0qQ.A0C(qxp, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C8608Qxp qxp2 = qxp;
            0s0 r0 = qxp2.A0S;
            AnonymousClass0YZ[] r4 = C8608Qxp.A0X;
            DbS.A1a(qxp2, "", r0, r4, 0);
            C8608Qxp qxp3 = this.mParentFragment;
            0qQ.A0C(qxp3, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C8608Qxp qxp4 = qxp3;
            DbS.A1a(qxp4, (Object) null, qxp4.A0E, r4, 1);
            C8608Qxp A0K = Pxi.A0K(this);
            DbS.A1a(A0K, (Object) null, A0K.A0G, r4, 2);
            DbS.A1a(A0K, (Object) null, A0K.A0F, r4, 16);
            STG.A00((View.OnClickListener) null, this);
            C8608Qxp qxp5 = this.mParentFragment;
            0qQ.A0C(qxp5, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C8608Qxp qxp6 = qxp5;
            DbS.A1a(qxp6, (Object) null, qxp6.A0K, r4, 4);
            DbS.A1a(qxp6, (Object) null, qxp6.A0I, r4, 15);
            C8608Qxp qxp7 = this.mParentFragment;
            0qQ.A0C(qxp7, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C8608Qxp qxp8 = qxp7;
            DbS.A1a(qxp8, (Object) null, qxp8.A0J, r4, 12);
            STG.A04(this, (String) null, (String) null);
            C8608Qxp qxp9 = this.mParentFragment;
            0qQ.A0C(qxp9, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C8608Qxp qxp10 = qxp9;
            DbS.A1a(qxp10, (Object) null, qxp10.A0Q, r4, 14);
            C8608Qxp qxp11 = this.mParentFragment;
            0qQ.A0C(qxp11, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C8608Qxp qxp12 = qxp11;
            DbS.A1a(qxp12, (Object) null, qxp12.A0M, r4, 5);
            DbS.A1a(qxp12, (Object) null, qxp12.A0L, r4, 17);
            C8608Qxp qxp13 = this.mParentFragment;
            0qQ.A0C(qxp13, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            C8608Qxp qxp14 = qxp13;
            DbS.A1a(qxp14, (Object) null, qxp14.A0N, r4, 13);
            C8608Qxp A0K2 = Pxi.A0K(this);
            AnonymousClass7TF.A1J(A0K2, A0K2.A0D, r4, 19, false);
        }
    }

    public QCJ() {
        C9829Rhr A09 = AnonymousClass2E0.A09();
        0qQ.A07(A09);
        this.A01 = A09;
    }

    public static ECPPaymentRequest A01(Fragment fragment) {
        Parcelable parcelable = fragment.requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        0qQ.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest");
        return (ECPPaymentRequest) parcelable;
    }

    public void onResume() {
        int A02 = AnonymousClass0fD.A02(745891103);
        QCJ.super.onResume();
        0qQ.A07(DbV.A05(this));
        AnonymousClass0fD.A09(-2117758440, A02);
    }
}
