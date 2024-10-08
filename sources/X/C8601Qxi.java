package X;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;

/* renamed from: X.Qxi  reason: case insensitive filesystem */
public final class C8601Qxi extends V4O {
    public final int A00;
    public final Object A01;

    public C8601Qxi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A02(View view, int i) {
        Dialog dialog;
        switch (this.A00) {
            case 2:
                if (i == 5) {
                    QCL qcl = (QCL) this.A01;
                    FragmentActivity activity = qcl.getActivity();
                    if (activity != null) {
                        activity.setResult(0, QCL.A00((CardDetails) null, qcl, (C11216SFq) null, AnonymousClass05K.A0C, (Long) null, (Long) null, (Long) null, (Long) null, (String) null));
                    }
                    DbX.A1I(qcl);
                    return;
                }
                return;
            case 3:
                if (i == 5) {
                    dialog = (Dialog) this.A01;
                    break;
                } else {
                    return;
                }
            default:
                if (i != 5 || (dialog = ((0SM) this.A01).A01) == null) {
                    return;
                }
        }
        dialog.cancel();
    }

    public final void A01(View view, float f) {
    }
}
