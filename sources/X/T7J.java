package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.Map;
import java.util.Set;

public final class T7J implements 1DN {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public T7J(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A03 = obj3;
    }

    public final void DWm(Map map) {
        switch (this.A00) {
            case 0:
                Activity activity = (Activity) this.A01;
                if (C2604245p.A03(activity)) {
                    Q8v.A00((Q8v) this.A02, this.A04);
                    return;
                }
                W38.A01(activity);
                ((Fragment) this.A03).onActivityResult(101, 0, (Intent) null);
                return;
            case 1:
                String str = this.A04;
                ((FGJ) this.A01).A04((Activity) this.A03, (0lg) this.A02, str, map);
                return;
            case 2:
                Activity activity2 = (Activity) this.A01;
                if (C2604245p.A03(activity2)) {
                    Q8v.A00((Q8v) this.A02, this.A04);
                    return;
                }
                R8R r8r = (R8R) this.A03;
                Set set = R8R.A07;
                AnonymousClass0wW r3 = r8r.A03;
                if (r3 == null || DbY.A1Y(0Tu.A05, r3, 2342160750157501940L)) {
                    W38.A01(activity2);
                }
                r8r.onActivityResult(101, 0, (Intent) null);
                return;
            default:
                return;
        }
    }
}
