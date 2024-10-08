package X;

import android.util.LruCache;
import com.facebook.memorytimeline.MemoryTimeline;
import java.util.HashMap;

/* renamed from: X.4kj  reason: invalid class name and case insensitive filesystem */
public final class C272454kj implements C272404ke {
    public final int A00;
    public final LruCache A01 = new LruCache(30);
    public final LruCache A02 = new LruCache(30);
    public final MemoryTimeline A03;

    public final HashMap AIH(int i) {
        0TD r3;
        0TM A002 = 2PW.A00(0TA.A00, this.A03, this.A00);
        HashMap hashMap = new HashMap();
        LruCache lruCache = this.A01;
        Integer valueOf = Integer.valueOf(i);
        0TM r32 = (0TM) lruCache.remove(valueOf);
        0TM r0 = (0TM) this.A02.remove(valueOf);
        if (!(r32 == null || r0 == null)) {
            HashMap hashMap2 = new HashMap();
            for (0TD r1 : r0.A00) {
                hashMap2.put(r1.A02, r1);
            }
            HashMap hashMap3 = new HashMap();
            for (0TD r12 : A002.A00) {
                hashMap3.put(r12.A02, r12);
            }
            for (0TD r4 : r32.A00) {
                0TJ r11 = r4.A02;
                if (!(r11 == 0TJ.A0V || r11 == 0TJ.A08 || r11 == 0TJ.A0o || (r3 = (0TD) hashMap2.get(r11)) == null)) {
                    String A0u = 002.A0u("_", r11.A01(), "_", 0TI.A00(r11.A01));
                    long j = r4.A00;
                    long j2 = r3.A00;
                    hashMap.put(002.A0R("start", A0u), Long.valueOf(j));
                    hashMap.put(002.A0R("end", A0u), Long.valueOf(j2));
                    hashMap.put(002.A0R("accum", A0u), Long.valueOf(j2 - j));
                    0TD r02 = (0TD) hashMap3.get(r11);
                    if (r02 != null) {
                        hashMap.put(002.A0R("after", A0u), Long.valueOf(r02.A00 - j2));
                    }
                }
            }
        }
        return hashMap;
    }

    public final void ASl(int i, boolean z, boolean z2, boolean z3) {
        this.A01.put(Integer.valueOf(i), 2PW.A00(0TA.A01, this.A03, this.A00));
    }

    public final void ATb(int i) {
        this.A02.put(Integer.valueOf(i), 2PW.A00(0TA.A02, this.A03, this.A00));
    }

    public C272454kj(MemoryTimeline memoryTimeline, int i) {
        this.A03 = memoryTimeline;
        this.A00 = i;
    }
}
