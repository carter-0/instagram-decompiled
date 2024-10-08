package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3vs  reason: invalid class name and case insensitive filesystem */
public final class C256503vs implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C255653uU A01;
    public final /* synthetic */ C256483vq A02;
    public final /* synthetic */ 1wH A03;
    public final /* synthetic */ String A04;

    public C256503vs(C255653uU r1, C256483vq r2, 1wH r3, String str, long j) {
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = str;
        this.A02 = r2;
        this.A00 = j;
    }

    public final void run() {
        String str;
        int hashCode;
        1wH r4 = this.A03;
        C255653uU r1 = this.A01;
        String str2 = this.A04;
        C256483vq r2 = this.A02;
        long j = this.A00;
        if (1wH.A01(r4) && (str = r1.A0G) != null && (hashCode = str.hashCode()) != -1) {
            Map map = r4.A04;
            Integer valueOf = Integer.valueOf(hashCode);
            if (map.containsKey(valueOf)) {
                Object obj = map.get(valueOf);
                0qQ.A0A(obj);
                if (!((Set) obj).contains(r2)) {
                    r4.A01.markerPoint(C256313vZ.A00(r4.A03), hashCode, r2.name(), str2, j, TimeUnit.NANOSECONDS);
                    Set set = (Set) map.get(valueOf);
                    if (set != null) {
                        set.add(r2);
                    }
                }
            }
        }
    }
}
