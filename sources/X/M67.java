package X;

import android.os.Handler;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.List;

public final /* synthetic */ class M67 implements Runnable {
    public final /* synthetic */ LE9 A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ M67(LE9 le9, List list) {
        this.A00 = le9;
        this.A01 = list;
    }

    public final void run() {
        LE9 le9 = this.A00;
        List list = this.A01;
        C344207rU r0 = le9.A00;
        C63839L8u l8u = le9.A01;
        if (r0 != null && l8u != null) {
            Handler handler = le9.A04;
            Runnable runnable = le9.A06;
            handler.removeCallbacks(runnable);
            r0.A06();
            l8u.A02.A0C(new M8X(l8u, new C64922LkN(le9), list));
            handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
