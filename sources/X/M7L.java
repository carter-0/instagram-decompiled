package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class M7L implements Runnable {
    public final /* synthetic */ C65229LpZ A00;
    public final /* synthetic */ LO1 A01;

    public M7L(C65229LpZ lpZ, LO1 lo1) {
        this.A00 = lpZ;
        this.A01 = lo1;
    }

    public final void run() {
        C65229LpZ lpZ = this.A00;
        IgdsSwitch igdsSwitch = lpZ.A0B;
        if (igdsSwitch != null) {
            LO1 lo1 = this.A01;
            FragmentActivity activity = lpZ.A0I.getActivity();
            if (activity != null) {
                lo1.A00(activity, igdsSwitch, lpZ.A0J);
            }
        }
    }
}
