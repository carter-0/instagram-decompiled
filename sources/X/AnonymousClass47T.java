package X;

import android.util.LruCache;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.47T  reason: invalid class name */
public final class AnonymousClass47T extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1wo A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass47T(1wo r4, String str, String str2, int i, long j, boolean z) {
        super(8, 5, false, false);
        this.A02 = r4;
        this.A00 = i;
        this.A03 = str;
        this.A05 = z;
        this.A04 = str2;
        this.A01 = j;
    }

    public final void run() {
        Integer valueOf;
        boolean z;
        boolean z2;
        1wo r2 = this.A02;
        int i = this.A00;
        String str = this.A03;
        boolean z3 = this.A05;
        String str2 = this.A04;
        long j = this.A01;
        LruCache lruCache = 1wo.A03;
        if (!AnonymousClass20W.A02() && !r2.A01) {
            return;
        }
        if (z3) {
            String str3 = r2.A00;
            if (!02m.A0p.isMarkerOn(i)) {
                LruCache lruCache2 = 1wo.A03;
                synchronized (lruCache2) {
                    valueOf = Integer.valueOf(i);
                    if (lruCache2.get(valueOf) != null) {
                        z = true;
                        z2 = true;
                        if (!((Boolean) lruCache2.get(valueOf)).booleanValue()) {
                        }
                    } else {
                        z = false;
                    }
                    z2 = false;
                }
                Set set = 1wo.A04;
                synchronized (set) {
                    set.remove(valueOf);
                }
                02m r13 = 02m.A0p;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int i2 = i;
                r13.markerStart(25624577, i2, j, timeUnit);
                if (str2 == null) {
                    str2 = "UNKNOWN";
                }
                02m.A0p.markerAnnotate(25624577, i, "SOURCE_MODULE", str2);
                02m.A0p.markerAnnotate(25624577, i, CredentialProviderBaseController.TYPE_TAG, str);
                02m.A0p.markerAnnotate(25624577, i2, "BANDWIDTH_KBPS", 1Bh.A00().A01());
                02m.A0p.markerAnnotate(25624577, i, "SAMPLE_TYPE", str3);
                if (z) {
                    02m.A0p.markerAnnotate(25624577, i, "PREFETCH", "ONGOING");
                }
                if (z2) {
                    02m.A0p.markerAnnotate(25624577, i, "SOURCE", "PREFETCH");
                    02m.A0p.markerEnd(25624577, i, 467, j, timeUnit);
                    return;
                }
                return;
            }
            return;
        }
        LruCache lruCache3 = 1wo.A03;
        synchronized (lruCache3) {
            lruCache3.put(Integer.valueOf(i), false);
        }
    }
}
