package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.3Ax  reason: invalid class name and case insensitive filesystem */
public final class C238193Ax implements C61110lV {
    public final WeakReference A00;

    public C238193Ax(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    public final void onAppBackgrounded() {
        Integer num;
        String str;
        int A03 = AnonymousClass0fD.A03(-1012124305);
        WeakReference weakReference = this.A00;
        Map map = (Map) weakReference.get();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                0Ak r7 = (0Ak) entry.getKey();
                if (System.currentTimeMillis() - ((Number) entry.getValue()).longValue() < 7000) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                if (num.intValue() != 0) {
                    str = "app_background";
                } else {
                    str = "surface_exit";
                }
                r7.A0R("spinner_outcome", str);
                r7.Cgf();
            }
        }
        Map map2 = (Map) weakReference.get();
        if (map2 != null) {
            map2.clear();
        }
        if (weakReference.get() == null) {
            14i.A06(this);
        }
        AnonymousClass0fD.A0A(-777221000, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-652677703, AnonymousClass0fD.A03(99639608));
    }
}
