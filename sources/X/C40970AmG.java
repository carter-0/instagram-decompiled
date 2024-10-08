package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.AmG  reason: case insensitive filesystem */
public final class C40970AmG implements Runnable {
    public final /* synthetic */ AVQ A00;
    public final /* synthetic */ Map.Entry A01;

    public C40970AmG(AVQ avq, Map.Entry entry) {
        this.A00 = avq;
        this.A01 = entry;
    }

    public final void run() {
        int i;
        AVQ avq = this.A00;
        Map.Entry entry = this.A01;
        File file = (File) entry.getKey();
        File file2 = (File) entry.getValue();
        0qQ.A0B(file, 0);
        0qQ.A0B(file2, 1);
        int A0N = AnonymousClass7TE.A0N(file2, AnonymousClass7TE.A0K(file) + 961);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = avq.A00;
        lightweightQuickPerformanceLogger.markerStart(38469647, A0N, "master", file.getPath());
        lightweightQuickPerformanceLogger.markerAnnotate(38469647, A0N, "slave", file2.getPath());
        try {
            File[] listFiles = file.listFiles();
            File[] listFiles2 = file2.listFiles();
            if (listFiles == null || listFiles2 == null) {
                i = -1;
            } else {
                HashSet hashSet = new HashSet(r2);
                for (File name : listFiles) {
                    hashSet.add(name.getName());
                }
                i = 0;
                for (File file3 : listFiles2) {
                    if (!hashSet.contains(file3.getName())) {
                        avq.A01.A08.A00(file3);
                        i++;
                    }
                }
            }
            lightweightQuickPerformanceLogger.markerAnnotate(38469647, A0N, "removeCount", i);
        } finally {
            lightweightQuickPerformanceLogger.markerEnd(38469647, A0N, 3);
        }
    }
}
