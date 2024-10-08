package X;

import com.facebook.common.classmarkers.ClassMarkerLoader;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executors;

/* renamed from: X.9Ct  reason: invalid class name and case insensitive filesystem */
public final class C375229Ct extends 14r {
    public static final C375259Cw A05 = new C375259Cw(Executors.newSingleThreadExecutor());
    public long A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final C374989Bq A04;

    public final void A04() {
    }

    public final int Ah6() {
        return 7;
    }

    public final C374849Ba A02(int i, int i2) {
        String str;
        if (this.A02 == null || (str = this.A01) == null) {
            return null;
        }
        C374849Ba r5 = new C374849Ba();
        Map map = r5.A02;
        map.put("classpreload_list", str);
        map.put("classpreload_status", this.A02);
        r5.A01.put("classpreload_duration", Long.valueOf(this.A00));
        this.A02 = null;
        this.A00 = 0;
        this.A01 = null;
        return r5;
    }

    public final boolean A05() {
        boolean z;
        C374989Bq r5 = this.A04;
        if (r5 != null) {
            C375259Cw r4 = A05;
            if (!AnonymousClass0GE.A00 && !this.A03) {
                this.A03 = true;
                if (AnonymousClass0GE.A00) {
                    return true;
                }
                HashSet hashSet = r4.A00;
                synchronized (hashSet) {
                    z = false;
                    if (!hashSet.add(r5.getClass())) {
                        z = true;
                    }
                }
                ClassMarkerLoader.loadIsClassPreloadRunMarker();
                if (z) {
                    return true;
                }
                r4.A01.execute(new C378049Oh(r4, r5, this));
                return true;
            }
        }
        return false;
    }

    public C375229Ct(C374989Bq r2) {
        this.A04 = r2;
    }
}
