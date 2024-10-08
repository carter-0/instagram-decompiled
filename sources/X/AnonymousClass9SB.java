package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.9SB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9SB implements 0sP {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1DN A01;
    public final /* synthetic */ C361388g9 A02;
    public final /* synthetic */ Map A03;

    public /* synthetic */ AnonymousClass9SB(Activity activity, 1DN r2, C361388g9 r3, Map map) {
        this.A00 = activity;
        this.A01 = r2;
        this.A03 = map;
        this.A02 = r3;
    }

    public final Object invoke(Object obj) {
        Activity activity = this.A00;
        1DN r5 = this.A01;
        Map map = this.A03;
        C361388g9 r3 = this.A02;
        List list = (List) obj;
        WeakReference weakReference = 1DL.A00;
        if (r3 != null) {
            r3.A00(new C377089Km(new C39710A6b(activity, r5, list, map), 11));
        } else {
            1DL.A03(activity, r5, new JYW(), (Runnable) null, list, map);
        }
        return C60340gF.A00;
    }
}
