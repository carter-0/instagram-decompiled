package com.facebook.memorytimeline.maps;

import X.0TA;
import X.0dV;
import X.AnonymousClass0TK;
import X.AnonymousClass0TL;
import X.AnonymousClass7TF;
import X.C7201Pyt;
import java.util.Map;

public class ProcMapsMemoryTimelineMetricsSource implements AnonymousClass0TL {
    public final C7201Pyt[] mMapEntryCategories = {C7201Pyt.A07};

    public static native void nativeParseMaps(String[] strArr, long[] jArr);

    public /* synthetic */ boolean shouldCollectMetrics(int i, 0TA r3) {
        return AnonymousClass0TK.A00(r3, this, i);
    }

    public /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    public boolean shouldCollectMetrics(int i) {
        return AnonymousClass7TF.A1P(i & 32);
    }

    public /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    static {
        0dV.A0C("mapsreader");
    }

    public ProcMapsMemoryTimelineMetricsSource(boolean z) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        r0 = r1.startsWith(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0140, code lost:
        if (r0 == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (r0 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0146, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014c, code lost:
        r6[r2] = r6[r2] + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r9 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection getDataPoints() {
        /*
            r15 = this;
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r13 = 1024(0x400, double:5.06E-321)
            r4 = 0
            X.Pyt[] r8 = r15.mMapEntryCategories
            int r7 = r8.length
            long[] r6 = new long[r7]
            java.lang.String r1 = "/proc/self/maps"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException | NumberFormatException -> 0x0165 }
            r0.<init>(r1)     // Catch:{ IOException | NumberFormatException -> 0x0165 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException | NumberFormatException -> 0x0165 }
            r3.<init>(r0)     // Catch:{ IOException | NumberFormatException -> 0x0165 }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x015b }
        L_0x001c:
            if (r1 == 0) goto L_0x0157
            r0 = 45
            int r10 = r1.indexOf(r0)     // Catch:{ all -> 0x015b }
            r2 = -1
            if (r10 == r2) goto L_0x0151
            r0 = 32
            int r9 = r10 + 1
            int r0 = r1.indexOf(r0, r9)     // Catch:{ all -> 0x015b }
            if (r0 == r2) goto L_0x0151
            r2 = 0
            java.lang.String r10 = r1.substring(r4, r10)     // Catch:{ all -> 0x015b }
            java.lang.String r9 = r1.substring(r9, r0)     // Catch:{ all -> 0x015b }
            r0 = 16
            long r11 = java.lang.Long.parseLong(r9, r0)     // Catch:{ all -> 0x015b }
            long r9 = java.lang.Long.parseLong(r10, r0)     // Catch:{ all -> 0x015b }
            long r11 = r11 - r9
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0151
            java.lang.String r0 = "   "
            int r0 = r1.lastIndexOf(r0)     // Catch:{ all -> 0x015b }
            if (r0 < 0) goto L_0x0070
            int r0 = r0 + 3
            java.lang.String r0 = r1.substring(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = r0.trim()     // Catch:{ all -> 0x015b }
        L_0x005d:
            java.lang.String r0 = " (deleted)"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0073
            int r0 = r1.length()     // Catch:{ all -> 0x015b }
            int r0 = r0 + -10
            java.lang.String r1 = r1.substring(r4, r0)     // Catch:{ all -> 0x015b }
            goto L_0x0073
        L_0x0070:
            java.lang.String r1 = ""
            goto L_0x005d
        L_0x0073:
            if (r2 >= r7) goto L_0x0151
            r0 = r8[r2]     // Catch:{ all -> 0x015b }
            X.QPx r0 = (X.QPx) r0     // Catch:{ all -> 0x015b }
            int r0 = r0.A00     // Catch:{ all -> 0x015b }
            switch(r0) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0132;
                case 2: goto L_0x0142;
                case 3: goto L_0x0123;
                case 4: goto L_0x010c;
                case 5: goto L_0x0109;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00db;
                case 8: goto L_0x00ac;
                case 9: goto L_0x009c;
                case 10: goto L_0x008c;
                default: goto L_0x007e;
            }     // Catch:{ all -> 0x015b }
        L_0x007e:
            int r0 = r1.length()     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "[anon:"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x008c:
            java.lang.String r0 = "[stack:"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "[stack]"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x009c:
            java.lang.String r0 = "/dev/ashmem/dalvik"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "[anon:dalvik"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x00ac:
            java.lang.String r0 = "/"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = ".art"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = ".oat"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = ".odex"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = ".vdex"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = ".dex"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x00db:
            java.lang.String r0 = "/"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = ".apk"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = ".jar"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x00fa:
            java.lang.String r0 = "/"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = ".so"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x0109:
            java.lang.String r0 = "/dev/ashmem/gralloc"
            goto L_0x0134
        L_0x010c:
            java.lang.String r0 = "[anon:libc_malloc]"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "[heap]"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "/dev/ashmem/libc malloc"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x0123:
            java.lang.String r0 = "/dmabuf"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "anon_inode:dmabuf"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0140
        L_0x0132:
            java.lang.String r0 = "/dev/ashmem"
        L_0x0134:
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0143
        L_0x0139:
            java.lang.String r0 = "/dev/kgsl-3d0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0143
        L_0x0140:
            if (r0 == 0) goto L_0x0146
        L_0x0142:
            r0 = 1
        L_0x0143:
            if (r0 == 0) goto L_0x0148
            goto L_0x014c
        L_0x0146:
            r0 = 0
            goto L_0x0143
        L_0x0148:
            int r2 = r2 + 1
            goto L_0x0073
        L_0x014c:
            r0 = r6[r2]     // Catch:{ all -> 0x015b }
            long r0 = r0 + r11
            r6[r2] = r0     // Catch:{ all -> 0x015b }
        L_0x0151:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x015b }
            goto L_0x001c
        L_0x0157:
            r3.close()     // Catch:{ IOException | NumberFormatException -> 0x0165 }
            goto L_0x0166
        L_0x015b:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0160 }
            goto L_0x0164
        L_0x0160:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException | NumberFormatException -> 0x0165 }
        L_0x0164:
            throw r1     // Catch:{ IOException | NumberFormatException -> 0x0165 }
        L_0x0165:
            r6 = 0
        L_0x0166:
            if (r6 != 0) goto L_0x0169
        L_0x0168:
            return r5
        L_0x0169:
            X.Pyt[] r1 = r15.mMapEntryCategories
            int r0 = r1.length
            if (r4 >= r0) goto L_0x0168
            r0 = r1[r4]
            X.0TJ r3 = r0.A00
            r1 = r6[r4]
            long r1 = r1 / r13
            X.0TD r0 = new X.0TD
            r0.<init>(r3, r1)
            r5.add(r0)
            int r4 = r4 + 1
            goto L_0x0169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.memorytimeline.maps.ProcMapsMemoryTimelineMetricsSource.getDataPoints():java.util.Collection");
    }
}
