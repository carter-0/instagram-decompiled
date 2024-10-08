package X;

import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;

public final class QAG extends 00I {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ QCL A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QAG(FragmentActivity fragmentActivity, QCL qcl) {
        super(true);
        this.A00 = fragmentActivity;
        this.A01 = qcl;
    }

    public final void A01() {
        FragmentActivity fragmentActivity = this.A00;
        fragmentActivity.setResult(0, QCL.A00((CardDetails) null, this.A01, (C11216SFq) null, AnonymousClass05K.A0C, (Long) null, (Long) null, (Long) null, (Long) null, (String) null));
        fragmentActivity.finish();
    }
}
