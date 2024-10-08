package X;

import com.instagram.registration.model.RegFlowExtras;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FVc  reason: case insensitive filesystem */
public final class C50245FVc implements C225882f4 {
    public final /* synthetic */ C49372Eua A00;
    public final /* synthetic */ C49913FEl A01;

    public final void DCn(Exception exc) {
    }

    public C50245FVc(C49372Eua eua, C49913FEl fEl) {
        this.A01 = fEl;
        this.A00 = eua;
    }

    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
        if (regFlowExtras != null) {
            C49913FEl fEl = this.A01;
            if (System.currentTimeMillis() - regFlowExtras.A00 > TimeUnit.HOURS.toMillis(24)) {
                fEl.A00.A04("reg_flow_extras_serialize_key");
            } else {
                this.A00.A00.A03 = regFlowExtras;
            }
        }
    }
}
