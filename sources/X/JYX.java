package X;

import android.app.Activity;
import java.util.List;
import java.util.Map;

public final class JYX implements 1DN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1DN A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ Map A04;

    public JYX(Activity activity, 1DN r2, Runnable runnable, List list, Map map) {
        this.A01 = r2;
        this.A04 = map;
        this.A03 = list;
        this.A00 = activity;
        this.A02 = runnable;
    }

    public final void DWm(Map map) {
        1DN r3 = this.A01;
        if (r3 != null) {
            Map map2 = this.A04;
            map2.putAll(map);
            List list = this.A03;
            list.addAll(map2.keySet());
            r3.DWm(1DL.A02(this.A00, DbU.A1b(list, 0)));
        }
        Runnable runnable = this.A02;
        if (runnable != null) {
            runnable.run();
        }
    }
}
