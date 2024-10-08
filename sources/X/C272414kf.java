package X;

import android.os.Debug;
import com.facebook.memorytimeline.MemoryTimeline;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.4kf  reason: invalid class name and case insensitive filesystem */
public enum C272414kf implements 0TN {
    ;
    
    public final 0TJ A00;
    public final HashMap A01;
    public final HashSet A02;

    public final void DD0(0TG r1) {
    }

    public final boolean FNJ() {
        return true;
    }

    /* access modifiers changed from: public */
    static {
        A04 = new C272424kg(0TJ.A0V);
        A05 = new C272434kh(0TJ.A0o);
        A03 = new C272444ki(0TJ.A08);
    }

    public final long A00() {
        long freeMemory;
        if (this instanceof C272434kh) {
            freeMemory = Debug.getNativeHeapAllocatedSize();
        } else if (this instanceof C272424kg) {
            Runtime runtime = Runtime.getRuntime();
            freeMemory = runtime.totalMemory() - runtime.freeMemory();
        } else {
            long[] jArr = new long[1];
            0JE.A01(AnonymousClass000.A00(2063), AnonymousClass2P9.A01, jArr);
            return jArr[0] * AnonymousClass2P9.A00;
        }
        return freeMemory / 1024;
    }

    public final void DUC(MemoryTimeline memoryTimeline, 0TM r8) {
        0TD r0;
        for (0TD r4 : r8.A00) {
            if (this.A00.equals(r4.A02)) {
                HashMap hashMap = this.A01;
                synchronized (hashMap) {
                    Iterator it = this.A02.iterator();
                    while (it.hasNext()) {
                        C272754lL r1 = (C272754lL) hashMap.get((Integer) it.next());
                        if (r1 != null && ((r0 = r1.A02) == null || 0TD.A00(r0, r4) == r4)) {
                            r1.A02 = r4;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: public */
    C272414kf(int i) {
        this.A01 = new HashMap();
        this.A02 = new HashSet();
        this.A00 = r2;
    }
}
