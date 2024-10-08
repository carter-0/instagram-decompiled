package com.facebook.pando;

import X.0qQ;
import java.util.Map;

public final class Summary {
    public final long additiveThreadHopTimeMs;
    public final long cacheAge;
    public final long cacheEndTime;
    public final long cacheStartTime;
    public final String connectionErrorMessage;
    public final String connectionFieldName;
    public final boolean connectionHasError;
    public final long connectionUpdateEndIndex;
    public final long connectionUpdateStartIndex;
    public final String fbRequestId;
    public final boolean isFinal;
    public final long networkAttempts;
    public final long networkChunksCount;
    public final long networkEndTime;
    public final long networkResponseStartTime;
    public final long networkResponsesCount;
    public final long networkStartTime;
    public final long parseEndTime;
    public final long parseStartTime;
    public final long parsedBytes;
    public final long parserElapsedMs;
    public final long requestStartTime;
    public final long serverDuration;
    public final String source;
    public final Map trackedResponseHeaders;

    public Summary(String str, boolean z, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Map map, long j14, long j15, long j16, String str3, long j17, long j18, boolean z2, String str4) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        String str5 = str3;
        0qQ.A0B(str5, 21);
        String str6 = str4;
        0qQ.A0B(str6, 25);
        this.source = str;
        this.isFinal = z;
        this.fbRequestId = str2;
        this.requestStartTime = j;
        this.networkStartTime = j2;
        this.networkEndTime = j3;
        this.networkResponseStartTime = j4;
        this.parseStartTime = j5;
        this.parseEndTime = j6;
        this.parserElapsedMs = j7;
        this.parsedBytes = j8;
        this.serverDuration = j9;
        this.networkChunksCount = j10;
        this.additiveThreadHopTimeMs = j11;
        this.networkResponsesCount = j12;
        this.networkAttempts = j13;
        this.trackedResponseHeaders = map;
        this.cacheAge = j14;
        this.cacheStartTime = j15;
        this.cacheEndTime = j16;
        this.connectionFieldName = str5;
        this.connectionUpdateStartIndex = j17;
        this.connectionUpdateEndIndex = j18;
        this.connectionHasError = z2;
        this.connectionErrorMessage = str6;
    }

    public boolean isFinal() {
        return this.isFinal;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Summary(java.lang.String r4, boolean r5, java.lang.String r6, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, java.util.Map r33, long r34, long r36, long r38, java.lang.String r40, long r41, long r43, boolean r45, java.lang.String r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r3 = this;
            r0 = r47
            r1 = r47 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0009
            r6 = r2
        L_0x0009:
            r1 = r47 & 8
            if (r1 == 0) goto L_0x000f
            r7 = 0
        L_0x000f:
            r1 = r47 & 16
            if (r1 == 0) goto L_0x0015
            r9 = 0
        L_0x0015:
            r1 = r47 & 32
            if (r1 == 0) goto L_0x001b
            r11 = 0
        L_0x001b:
            r1 = r47 & 64
            if (r1 == 0) goto L_0x0021
            r13 = 0
        L_0x0021:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0027
            r15 = 0
        L_0x0027:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002d
            r17 = 0
        L_0x002d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0033
            r19 = 0
        L_0x0033:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0039
            r21 = 0
        L_0x0039:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x003f
            r23 = 0
        L_0x003f:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0045
            r25 = 0
        L_0x0045:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x004b
            r27 = 0
        L_0x004b:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0051
            r29 = 0
        L_0x0051:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x005a
            r31 = 0
        L_0x005a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x0062
            r33 = 0
        L_0x0062:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x006a
            r34 = 0
        L_0x006a:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x0072
            r36 = 0
        L_0x0072:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x007a
            r38 = 0
        L_0x007a:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x0082
            r40 = r2
        L_0x0082:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x008a
            r41 = 0
        L_0x008a:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x0092
            r43 = 0
        L_0x0092:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r47
            if (r1 == 0) goto L_0x009a
            r45 = 0
        L_0x009a:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r47 & r1
            if (r0 == 0) goto L_0x00a2
            r46 = r2
        L_0x00a2:
            r3.<init>(r4, r5, r6, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r36, r38, r40, r41, r43, r45, r46)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pando.Summary.<init>(java.lang.String, boolean, java.lang.String, long, long, long, long, long, long, long, long, long, long, long, long, long, java.util.Map, long, long, long, java.lang.String, long, long, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
