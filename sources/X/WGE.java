package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;

public final class WGE implements X5r {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C17652Vbi A01;
    public final /* synthetic */ W3O A02;

    public WGE(Bundle bundle, C17652Vbi vbi, W3O w3o) {
        this.A02 = w3o;
        this.A01 = vbi;
        this.A00 = bundle;
    }

    public final /* bridge */ /* synthetic */ void Dos(Bundle bundle, Object obj) {
        W3O w3o = this.A02;
        S0I s0i = w3o.A0U;
        C17652Vbi vbi = this.A01;
        s0i.A00(vbi.A07);
        Bundle bundle2 = this.A00;
        C13989Tnp.A15(bundle2, w3o);
        bundle2.putString("family_device_id", (String) null);
        for (X9S Cxr : w3o.A0Q.A01) {
            Cxr.Cxr(bundle2);
        }
        W3O.A02(vbi, w3o);
    }

    public final void onFailure(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString(TraceFieldType.FailureReason, "upload_batch_fail");
        W3O w3o = this.A02;
        bundle.putString("family_device_id", (String) null);
        bundle.putString("failure_message", th.getMessage());
        C17652Vbi vbi = this.A01;
        bundle.putInt("num_of_retries", vbi.A00 ^ true ? 1 : 0);
        C17790Vg2 vg2 = w3o.A0Q;
        W3O.A01(bundle, w3o);
        for (X9S Cxq : vg2.A01) {
            Cxq.Cxq(bundle);
        }
        if (!vbi.A00) {
            vbi.A00 = true;
            W3O.A03(vbi, w3o);
            return;
        }
        w3o.A05++;
        w3o.A0S.A01("batch_upload_failed", String.valueOf(true));
        W3O.A02(vbi, w3o);
    }
}
