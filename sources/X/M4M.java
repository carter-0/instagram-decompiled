package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Map;

public final class M4M implements Runnable {
    public final /* synthetic */ C61417K6o A00;

    public M4M(C61417K6o k6o) {
        this.A00 = k6o;
    }

    public final void run() {
        C61417K6o k6o = this.A00;
        String str = ((C60280Jib) k6o.A09.getValue()).A0D.A00;
        FragmentActivity activity = k6o.getActivity();
        if (activity != null) {
            Map map = LO0.A03;
            LO0 lo0 = (LO0) map.get(activity);
            if (lo0 == null) {
                lo0 = new LO0(activity);
                map.put(activity, lo0);
            }
            ((LC8) k6o.A08.getValue()).A00(lo0, DbU.A0m(k6o, 2131964032), DbU.A0m(k6o, 2131964091), new MJL(lo0, k6o, activity, DbU.A0m(k6o, 2131964050), str, DbU.A0m(k6o, 2131964116), 2));
        }
    }
}
