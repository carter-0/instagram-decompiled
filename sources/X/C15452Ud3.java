package X;

import android.content.Context;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ud3  reason: case insensitive filesystem */
public final class C15452Ud3 extends C331047Ph {
    public final HashMap A00 = new HashMap();
    public final C15491Udg A01;
    public final AnalyticsEventDebugInfo A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2s0, java.lang.Object, X.Udg] */
    public C15452Ud3(Context context, R8Z r8z, AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        0qQ.A0B(analyticsEventDebugInfo, 2);
        this.A02 = analyticsEventDebugInfo;
        ? obj = new Object();
        obj.A00 = context;
        obj.A01 = r8z;
        this.A01 = obj;
        A0B(obj);
        A00(this);
    }

    public static final void A00(C15452Ud3 ud3) {
        ud3.A06();
        List list = ud3.A02.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            0qQ.A07(obj);
            HashMap hashMap = ud3.A00;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = new Object();
                hashMap.put(obj, obj2);
            }
            ud3.A09(ud3.A01, list.get(i), obj2);
        }
        ud3.A07();
    }
}
