package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;

public final class SV5 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public SV5(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        0SM r1;
        switch (this.A00) {
            case 0:
                ((GeolocationPermissions.Callback) this.A02).invoke(this.A03, false, false);
                return;
            case 1:
                ((GeolocationPermissions.Callback) this.A02).invoke(this.A03, true, false);
                return;
            case 2:
                r1 = (QKL) this.A02;
                String str = this.A03;
                r1.A0D = C51967G9n.A0k();
                r1.A00 = r1.A0H((CardDetails) null, (C11216SFq) this.A01, AnonymousClass05K.A01, (Long) null, (Long) null, (Long) null, str);
                break;
            case 3:
                r1 = (QKE) this.A02;
                String str2 = this.A03;
                r1.A0G = C51967G9n.A0k();
                r1.A00 = r1.A0H((CardDetails) null, (C11216SFq) this.A01, AnonymousClass05K.A01, (Long) null, (Long) null, (Long) null, (Long) null, str2);
                break;
            case 4:
                T7B t7b = (T7B) this.A02;
                T7B.A01(t7b, "ctc_confirmation_dialog_call");
                Activity activity = (Activity) this.A01;
                boolean A07 = 1DL.A07(activity, "android.permission.CALL_PHONE");
                String str3 = this.A03;
                if (A07) {
                    T7B.A01(t7b, "ctc_call_initiated_directly");
                    Pxj.A12(activity, "android.intent.action.CALL", str3);
                    return;
                }
                T7B.A01(t7b, "ctc_permission_request");
                JTP.A11(activity, new T7H(activity, t7b, str3, 0), "android.permission.CALL_PHONE");
                return;
            default:
                QCL qcl = (QCL) this.A02;
                C11216SFq sFq = (C11216SFq) this.A01;
                String str4 = this.A03;
                FragmentActivity activity2 = qcl.getActivity();
                if (activity2 != null) {
                    activity2.setResult(0, QCL.A00((CardDetails) null, qcl, sFq, AnonymousClass05K.A01, (Long) null, (Long) null, (Long) null, (Long) null, str4));
                }
                DbX.A1I(qcl);
                return;
        }
        Dialog dialog = r1.A01;
        if (dialog != null) {
            dialog.cancel();
        }
    }
}
