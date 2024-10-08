package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* renamed from: X.Jby  reason: case insensitive filesystem */
public final /* synthetic */ class C59934Jby implements Runnable {
    public final /* synthetic */ JYW A00;
    public final /* synthetic */ Map A01;

    public /* synthetic */ C59934Jby(JYW jyw, Map map) {
        this.A00 = jyw;
        this.A01 = map;
    }

    public final void run() {
        JYW jyw = this.A00;
        Map map = this.A01;
        FragmentActivity activity = jyw.getActivity();
        if (activity != null) {
            0s1 A0D = DbW.A0D(activity);
            A0D.A03(jyw);
            A0D.A01();
        }
        1DN r0 = jyw.A00;
        if (r0 != null) {
            r0.DWm(map);
        }
        1DM r02 = jyw.A01;
        if (r02 != null) {
            r02.DWm(map);
        }
    }
}
