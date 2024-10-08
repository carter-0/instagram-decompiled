package X;

import android.util.Pair;
import com.facebook.memory.javamemtracker.JavaMemoryTrackerForMetrics;
import com.facebook.memory.surfacememtracking.SurfaceNativeMemTracker;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4kk  reason: invalid class name and case insensitive filesystem */
public final class C272464kk implements C272404ke {
    public final JavaMemoryTrackerForMetrics A00;
    public final SurfaceNativeMemTracker A01;
    public final Map A02 = new HashMap();

    public C272464kk(int i, int i2, boolean z, boolean z2) {
        JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics;
        if (z) {
            synchronized (JavaMemoryTrackerForMetrics.class) {
                javaMemoryTrackerForMetrics = JavaMemoryTrackerForMetrics.sInstance;
                if (javaMemoryTrackerForMetrics == null) {
                    javaMemoryTrackerForMetrics = new JavaMemoryTrackerForMetrics(i, 1, true, false);
                    JavaMemoryTrackerForMetrics.sInstance = javaMemoryTrackerForMetrics;
                }
            }
            this.A00 = javaMemoryTrackerForMetrics;
            synchronized (0Gh.class) {
                0Ms r3 = AnonymousClass0Mw.A00;
                StringBuilder sb = new StringBuilder(32);
                sb.append(i);
                sb.append(',');
                sb.append(1);
                sb.append(',');
                sb.append(1);
                sb.append(',');
                sb.append(0);
                sb.append(',');
                sb.append(0);
                sb.append(',');
                sb.append(1);
                sb.append(',');
                sb.append(0);
                sb.append(',');
                sb.append(0);
                r3.A02(AnonymousClass0LO.A6M, 0M7.A02, sb.toString());
            }
        }
        if (z2) {
            this.A01 = new SurfaceNativeMemTracker(i2);
            synchronized (0Gh.class) {
                AnonymousClass0Mw.A00.A02(AnonymousClass0LO.A7c, 0M7.A02, Integer.toString(i2));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, com.facebook.memory.common.MapStats] */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.memory.common.SurfaceVisitStats, java.lang.Object] */
    public final HashMap AIH(int i) {
        long j;
        HashMap hashMap = new HashMap();
        Map map = this.A02;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i2);
        Pair pair = (Pair) map.get(valueOf);
        if (pair != null) {
            ? obj = new Object();
            ? obj2 = new Object();
            long longValue = ((Number) pair.first).longValue();
            JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics = this.A00;
            long j2 = 0;
            if (javaMemoryTrackerForMetrics != null) {
                long[] jArr = new long[4];
                javaMemoryTrackerForMetrics.getAccumulatedSizeAndStopTrackingSurface(i2, obj2, jArr);
                int i3 = 0;
                loop0:
                while (true) {
                    String str = "total_gc_count";
                    while (true) {
                        hashMap.put(str, Long.valueOf(jArr[i3]));
                        i3++;
                        if (i3 >= 4) {
                            break loop0;
                        } else if (i3 != 0) {
                            if (i3 == 1) {
                                str = "total_blocking_gc_count";
                            } else if (i3 == 2) {
                                str = "total_time_in_gc";
                            } else if (i3 != 3) {
                                str = "unknown_gc_stat";
                            } else {
                                str = "total_time_in_blocking_gc";
                            }
                        }
                    }
                }
                j2 = obj2.A02;
                if (j2 != -1) {
                    hashMap.put("java_unfreed_allocations_kb", Long.valueOf(j2 / 1024));
                }
                if (longValue != -1) {
                    hashMap.put("java_unfreed_allocations_on_exit_kb", Long.valueOf(longValue / 1024));
                }
                long j3 = obj2.A00;
                if (j3 != -1) {
                    hashMap.put("maximum_java_unfreed_allocations_kb", Long.valueOf(j3 / 1024));
                }
                j = obj2.A01;
                if (j != -1) {
                    hashMap.put("total_java_allocations_kb", Long.valueOf(j / 1024));
                }
                javaMemoryTrackerForMetrics.getMapStats(obj);
                hashMap.put("java_allocation_map_max_size", Long.valueOf(obj.A02));
                hashMap.put("java_allocation_map_max_bucket_count", Long.valueOf(obj.A01));
                hashMap.put("java_allocation_map_max_load_factor", Long.valueOf((long) Math.round(obj.A00 * 1000000.0f)));
            } else {
                j = 0;
            }
            SurfaceNativeMemTracker surfaceNativeMemTracker = this.A01;
            if (surfaceNativeMemTracker != null) {
                long longValue2 = ((Number) pair.second).longValue();
                surfaceNativeMemTracker.getAccumulatedAndMaxSizeAndStopTrackingSurface(i2, obj2);
                hashMap.put("native_unfreed_allocations_on_exit_kb", Long.valueOf(longValue2 / 1024));
                long j4 = obj2.A02;
                hashMap.put("native_unfreed_allocations_kb", Long.valueOf(j4 / 1024));
                hashMap.put("maximum_native_unfreed_allocations_kb", Long.valueOf(obj2.A00 / 1024));
                long j5 = obj2.A01;
                hashMap.put("total_native_allocations_kb", Long.valueOf(j5 / 1024));
                surfaceNativeMemTracker.getMapStats(obj);
                hashMap.put("native_allocation_map_max_size", Long.valueOf(obj.A02));
                hashMap.put("native_allocation_map_max_bucket_count", Long.valueOf(obj.A01));
                hashMap.put("native_allocation_map_max_load_factor", Long.valueOf((long) Math.round(obj.A00 * 1000000.0f)));
                if (javaMemoryTrackerForMetrics != null) {
                    if (longValue != -1) {
                        hashMap.put("total_unfreed_allocations_on_exit_kb", Long.valueOf((longValue + longValue2) / 1024));
                    }
                    if (j2 != -1) {
                        hashMap.put("total_unfreed_allocations_kb", Long.valueOf((j2 + j4) / 1024));
                    }
                    if (j != -1) {
                        hashMap.put("total_allocations_kb", Long.valueOf((j + j5) / 1024));
                    }
                }
            }
            map.remove(valueOf);
        }
        return hashMap;
    }

    public final void ASl(int i, boolean z, boolean z2, boolean z3) {
        if (z && z2 && !z3) {
            this.A02.put(Integer.valueOf(i), (Object) null);
            JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics = this.A00;
            if (javaMemoryTrackerForMetrics != null) {
                synchronized (0Gh.class) {
                    0Gh.A01 = true;
                    0Gh.A02 = true;
                    0Gh.A00();
                }
                javaMemoryTrackerForMetrics.startTrackingAccumulationForSurface(i, false, 0);
            }
            SurfaceNativeMemTracker surfaceNativeMemTracker = this.A01;
            if (surfaceNativeMemTracker != null) {
                synchronized (0Gh.class) {
                    0Gh.A01 = true;
                    0Gh.A03 = true;
                    0Gh.A00();
                }
                surfaceNativeMemTracker.start(i);
            }
        }
    }

    public final void ATb(int i) {
        long j;
        Map map = this.A02;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics = this.A00;
            long j2 = 0;
            if (javaMemoryTrackerForMetrics != null) {
                j = javaMemoryTrackerForMetrics.stopTrackingAllocationsForSurface(i);
                synchronized (0Gh.class) {
                    0Gh.A02 = false;
                    0Gh.A00();
                }
            } else {
                j = 0;
            }
            SurfaceNativeMemTracker surfaceNativeMemTracker = this.A01;
            if (surfaceNativeMemTracker != null) {
                j2 = surfaceNativeMemTracker.stop(i);
                synchronized (0Gh.class) {
                    0Gh.A03 = false;
                    0Gh.A00();
                }
            }
            map.put(valueOf, new Pair(Long.valueOf(j), Long.valueOf(j2)));
        }
    }
}
