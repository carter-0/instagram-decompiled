package X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.proxygen.LigerSamplePolicy;

public final class M2T implements Runnable {
    public final /* synthetic */ C65164LoT A00;

    public M2T(C65164LoT loT) {
        this.A00 = loT;
    }

    public final void run() {
        C65164LoT loT = this.A00;
        FilterChain filterChain = loT.A02;
        AnonymousClass80G r1 = loT.A05;
        JWJ jwj = loT.A0F;
        if (jwj.A00 != null && filterChain != null && r1 != null && !loT.A0R) {
            C344207rU r0 = jwj.A00;
            if (r0 != null) {
                r0.A06();
            }
            C364988mL r02 = loT.A03;
            if (r02 == null) {
                Surface A04 = r1.A04();
                if (A04 != null) {
                    loT.A0Q = true;
                    r02 = jwj.A00(new C64421Lbc(A04, filterChain, loT));
                    loT.A03 = r02;
                } else {
                    return;
                }
            }
            if (r02 != null) {
                Handler handler = jwj.A02;
                Runnable runnable = loT.A0J;
                handler.removeCallbacks(runnable);
                loT.A0R = true;
                r02.A04();
                handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                loT.A0E.A00(loT);
            }
        }
    }
}
