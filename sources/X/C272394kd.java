package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4kd  reason: invalid class name and case insensitive filesystem */
public final class C272394kd implements C272404ke {
    public final Set A00;

    public final HashMap AIH(int i) {
        C272754lL r8;
        long j;
        long A002;
        long j2;
        long j3;
        HashMap hashMap = new HashMap();
        long j4 = 0;
        long j5 = 0;
        for (C272414kf r4 : this.A00) {
            HashMap hashMap2 = r4.A01;
            synchronized (hashMap2) {
                r8 = (C272754lL) hashMap2.remove(Integer.valueOf(i));
            }
            if (r8 != null) {
                0TJ r1 = r8.A00.A02;
                String A01 = r1.A01();
                if (r1 == 0TJ.A08) {
                    0TD r2 = r8.A00;
                    0TD r12 = r8.A01;
                    if (r12 != null && 0TD.A00(r12, r2) == r12) {
                        r2 = r12;
                    }
                    0TD r13 = r8.A02;
                    if (r13 != null && 0TD.A00(r13, r2) == r13) {
                        r2 = r13;
                    }
                    if (r2.A00 <= 4194304) {
                        A002 = 0;
                    }
                } else {
                    0TD r0 = r8.A01;
                    if (r0 != null) {
                        j = r0.A00;
                    } else {
                        j = -1;
                    }
                    long j6 = r8.A00.A00;
                    j4 += j - j6;
                    A002 = r4.A00() - j6;
                    j5 += A002;
                }
                String A0g = 002.A0g("worst_", A01, "_kb");
                0TD r22 = r8.A00;
                0TD r14 = r8.A01;
                if (r14 != null && 0TD.A00(r14, r22) == r14) {
                    r22 = r14;
                }
                0TD r15 = r8.A02;
                if (r15 != null && 0TD.A00(r15, r22) == r15) {
                    r22 = r15;
                }
                hashMap.put(A0g, Long.valueOf(r22.A00));
                String A0g2 = 002.A0g("start_", A01, "_kb");
                long j7 = r8.A00.A00;
                hashMap.put(A0g2, Long.valueOf(j7));
                String A0g3 = 002.A0g("end_", A01, "_kb");
                0TD r02 = r8.A01;
                if (r02 != null) {
                    j2 = r02.A00;
                } else {
                    j2 = -1;
                }
                hashMap.put(A0g3, Long.valueOf(j2));
                String A0g4 = 002.A0g("accum_", A01, "_kb");
                0TD r03 = r8.A01;
                if (r03 != null) {
                    j3 = r03.A00;
                } else {
                    j3 = -1;
                }
                hashMap.put(A0g4, Long.valueOf(j3 - j7));
                hashMap.put(002.A0g("accum_", A01, "_after_exit_kb"), Long.valueOf(A002));
            }
        }
        hashMap.put("total_surface_accum_kb", Long.valueOf(j4));
        hashMap.put("total_surface_accum_after_exit_kb", Long.valueOf(j5));
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4lL, java.lang.Object] */
    public final void ASl(int i, boolean z, boolean z2, boolean z3) {
        for (C272414kf r4 : this.A00) {
            0TD r1 = new 0TD(r4.A00, r4.A00());
            ? obj = new Object();
            obj.A00 = r1;
            HashMap hashMap = r4.A01;
            synchronized (hashMap) {
                Integer valueOf = Integer.valueOf(i);
                hashMap.put(valueOf, obj);
                r4.A02.add(valueOf);
            }
        }
    }

    public final void ATb(int i) {
        C272754lL r4;
        for (C272414kf r5 : this.A00) {
            HashMap hashMap = r5.A01;
            synchronized (hashMap) {
                Integer valueOf = Integer.valueOf(i);
                r4 = (C272754lL) hashMap.get(valueOf);
                r5.A02.remove(valueOf);
            }
            if (r4 != null) {
                r4.A01 = new 0TD(r5.A00, r5.A00());
            }
        }
    }

    public C272394kd(MemoryTimeline memoryTimeline, boolean z) {
        HashSet hashSet = new HashSet();
        this.A00 = hashSet;
        C272414kf r0 = C272414kf.A04;
        hashSet.add(r0);
        memoryTimeline.AAL(r0);
        C272414kf r02 = C272414kf.A05;
        hashSet.add(r02);
        memoryTimeline.AAL(r02);
        if (!z) {
            C272414kf r03 = C272414kf.A03;
            hashSet.add(r03);
            memoryTimeline.AAL(r03);
        }
    }
}
