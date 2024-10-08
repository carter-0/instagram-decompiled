package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.501  reason: invalid class name */
public final class AnonymousClass501 implements C275074pY {
    public final 0fA A00;
    public final long A01;

    public AnonymousClass501(0fA r4, 0lg r5) {
        this.A01 = 182.A01(0Tu.A05, r5, 36594585947342611L);
        this.A00 = r4;
    }

    public final void CoK(C274844pB r1) {
    }

    public final String getName() {
        return "StallReporter";
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Throwable, X.0NN, java.lang.Exception] */
    public final void CoE(C274844pB r26) {
        List list;
        List list2;
        StackTraceElement[] stackTraceElementArr;
        long j;
        StackTraceElement stackTraceElement;
        C274844pB r12 = r26;
        if (r12.A06(this.A01) && (list = r12.A0A) != null && list.size() != 0 && C274794p6.A02.A01.get() && (list2 = r12.A0A) != null && !list2.isEmpty()) {
            String A0t = 002.A0t("Main thread stalled for ", " ms. (cpu time was ", " ms)", r12.A01(), r12.A00());
            ListIterator listIterator = list2.listIterator();
            String str = null;
            int size = list2.size();
            if (size > 1) {
                str = AnonymousClass0HM.A00().toString();
            }
            int i = 0;
            long j2 = 0;
            long j3 = 0;
            while (listIterator.hasNext()) {
                C10803RyP ryP = (C10803RyP) listIterator.next();
                i++;
                if (!(ryP == null || (stackTraceElementArr = ryP.A07) == null)) {
                    if (stackTraceElementArr.length == 0 || (stackTraceElement = stackTraceElementArr[0]) == null || !stackTraceElement.isNativeMethod() || !"nativePollOnce".equals(stackTraceElement.getMethodName())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(A0t);
                        sb.append(" Record # ");
                        sb.append(i);
                        sb.append(" stalled for ");
                        sb.append(ryP.A02 - r12.A02);
                        sb.append(" ms.");
                        S3X s3x = ryP.A03;
                        0f9 AEg = this.A00.AEg(true, "MainThreadStall", 817894971);
                        AEg.ABO("record_count", size);
                        AEg.ABO("record_index", i);
                        if (str != null) {
                            AEg.ABQ("record_join_id", str);
                        }
                        AEg.ABP(TraceFieldType.Duration, r12.A01());
                        long j4 = r12.A06;
                        if (j4 > 0) {
                            j = r12.A02 - j4;
                        } else {
                            j = -1;
                        }
                        AEg.ABP("delay", j);
                        AEg.ABP("cpu_time", r12.A00());
                        if (s3x != null) {
                            long j5 = s3x.A08;
                            if (j5 != -1) {
                                AEg.ABP("total_memory", j5);
                                AEg.ABP("max_memory", s3x.A07);
                                AEg.ABP("free_memory", s3x.A03);
                                if (i == 1) {
                                    j2 = s3x.A03;
                                }
                                if (j2 > 0) {
                                    AEg.ABP("memory_usage_in_between", s3x.A03 - j2);
                                }
                            }
                            if (s3x.A05 > 0) {
                                AEg.ABP("gc_time", s3x.A06);
                                AEg.ABP("gc_time_blocking", s3x.A02);
                                j3 += s3x.A02;
                                AEg.ABP("gc_time_blocking_total", j3);
                            }
                        }
                        ? exc = new Exception(sb.toString());
                        exc.A00 = false;
                        exc.setStackTrace(stackTraceElementArr);
                        AEg.ERJ(exc);
                        AEg.report();
                    }
                }
            }
        }
    }
}
