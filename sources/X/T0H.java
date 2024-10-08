package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.util.concurrent.TimeUnit;

public final class T0H implements 2IR {
    public final /* synthetic */ C242143Su A00;

    public T0H(C242143Su r1) {
        this.A00 = r1;
    }

    public final void onFailure(Throwable th) {
        this.A00.A01 = null;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SG0 sg0 = (SG0) obj;
        C242143Su r1 = this.A00;
        synchronized (r1) {
            r1.A01 = null;
        }
        if (sg0 == null) {
            return;
        }
        if (!(sg0.A02 == null && sg0.A0N == null && sg0.A03 == null && sg0.A0I == null) && r1.A03) {
            r1.A06.add(sg0);
            r1.A07.A09().schedule(new C12931TDu(r1), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
        }
    }
}
