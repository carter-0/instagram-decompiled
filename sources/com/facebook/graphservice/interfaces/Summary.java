package com.facebook.graphservice.interfaces;

import X.C66725MbW;
import X.C66726MbX;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;

public class Summary {
    public final long additiveParseTimeMs;
    public final long additiveThreadHopTimeMs;
    public final int apiErrorCode;
    public final int attempts;
    public final long cacheSyncEnd;
    public final long cacheSyncStart;
    public final long cachedResponseAge;
    public final int code;
    public final String consistencySource;
    public final String debugInfo;
    public final String description;
    public final String fbRequestId;
    public final long fetchCachedResponseEnd;
    public final long fetchCachedResponseStart;
    public final boolean freshResponse;
    public final boolean isFinal;
    public final boolean isNetworkComplete;
    public final boolean isSilent;
    public final boolean isTransient;
    public final long networkChunksCount;
    public final long networkEnd;
    public final long networkStart;
    public final long parseStart;
    public final int parsedDataSize;
    public final String prefetchPredictionID;
    public final GraphQLQuery query;
    public final boolean rejectedFromAdaptiveFetch;
    public final long requestEnd;
    public final long requestStart;
    public final boolean requiresReauth;
    public final List retryTimes;
    public final long rtt;
    public final long serverFlushTime;
    public final long serverStartTime;
    public final String source;
    public final String summary;
    public final long upstreamLatency;

    public String toString() {
        C66726MbX A00 = C66725MbW.A00(this);
        A00.A01(this.source, "source");
        A00.A04("isFinal", this.isFinal);
        A00.A04("isNetworkComplete", this.isNetworkComplete);
        A00.A02("attempts", this.attempts);
        A00.A01(this.retryTimes, "retryTimes");
        A00.A01(this.fbRequestId, "fbRequestId");
        A00.A03("requestStart", this.requestStart);
        A00.A03("networkStart", this.networkStart);
        A00.A03("networkEnd", this.networkEnd);
        A00.A03("parseStart", this.parseStart);
        A00.A03("requestEnd", this.requestEnd);
        A00.A02("parsedDataSize", this.parsedDataSize);
        A00.A03("additiveParseTimeMs", this.additiveParseTimeMs);
        A00.A03("networkChunksCount", this.networkChunksCount);
        A00.A03("additiveThreadHopTimeMs", this.additiveThreadHopTimeMs);
        A00.A03("fetchCachedResponseStart", this.fetchCachedResponseStart);
        A00.A03("fetchCachedResponseEnd", this.fetchCachedResponseEnd);
        A00.A03("cachedResponseAge", this.cachedResponseAge);
        A00.A04("freshResponse", this.freshResponse);
        A00.A01(this.consistencySource, "consistencySource");
        A00.A03("serverStartTime", this.serverStartTime);
        A00.A03("serverFlushTime", this.serverFlushTime);
        A00.A04("rejectedFromAdaptiveFetch", this.rejectedFromAdaptiveFetch);
        A00.A01(this.prefetchPredictionID, "prefetchPredictionID");
        A00.A03(TraceFieldType.RTT, this.rtt);
        A00.A03("upstreamLatency", this.upstreamLatency);
        return A00.toString();
    }

    public Summary(String str, boolean z, boolean z2, String str2, int i, List list, long j, long j2, long j3, long j4, long j5, int i2, long j6, long j7, long j8, long j9, long j10, long j11, boolean z3, int i3, int i4, String str3, String str4, String str5, boolean z4, boolean z5, boolean z6, String str6, long j12, long j13, long j14, long j15, boolean z7, String str7, long j16, long j17, GraphQLQuery graphQLQuery) {
        this.source = str;
        this.isFinal = z;
        this.isNetworkComplete = z2;
        this.fbRequestId = str2;
        this.attempts = i;
        this.retryTimes = list;
        this.requestStart = j;
        this.networkStart = j2;
        this.networkEnd = j3;
        this.parseStart = j4;
        this.requestEnd = j5;
        this.parsedDataSize = i2;
        this.additiveParseTimeMs = j6;
        this.networkChunksCount = j7;
        this.additiveThreadHopTimeMs = j8;
        this.fetchCachedResponseStart = j9;
        this.fetchCachedResponseEnd = j10;
        this.cachedResponseAge = j11;
        this.freshResponse = z3;
        this.code = i3;
        this.apiErrorCode = i4;
        this.summary = str3;
        this.description = str4;
        this.debugInfo = str5;
        this.isSilent = z4;
        this.isTransient = z5;
        this.requiresReauth = z6;
        this.consistencySource = str6;
        this.serverStartTime = j12;
        this.serverFlushTime = j13;
        this.cacheSyncStart = j14;
        this.cacheSyncEnd = j15;
        this.rejectedFromAdaptiveFetch = z7;
        this.prefetchPredictionID = str7;
        this.rtt = j16;
        this.upstreamLatency = j17;
        this.query = graphQLQuery;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Summary(java.lang.String r56, boolean r57, boolean r58, java.lang.String r59, int r60, java.util.List r61, long r62, long r64, long r66, long r68, long r70, int r72, long r73, long r75, long r77, long r79, long r81, long r83, boolean r85, int r86, int r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, boolean r91, boolean r92, boolean r93, java.lang.String r94, long r95, long r97, long r99, long r101, boolean r103, java.lang.String r104, long r105, long r107) {
        /*
            r55 = this;
            r54 = 0
            r39 = r94
            r37 = r92
            r28 = r83
            r26 = r81
            r24 = r79
            r22 = r77
            r20 = r75
            r18 = r73
            r38 = r93
            r9 = r64
            r40 = r95
            r11 = r66
            r42 = r97
            r13 = r68
            r44 = r99
            r15 = r70
            r7 = r62
            r36 = r91
            r46 = r101
            r17 = r72
            r48 = r103
            r49 = r104
            r50 = r105
            r52 = r107
            r6 = r61
            r35 = r90
            r5 = r60
            r34 = r89
            r4 = r59
            r33 = r88
            r3 = r58
            r32 = r87
            r2 = r57
            r31 = r86
            r1 = r56
            r30 = r85
            r0 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r15, r17, r18, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r44, r46, r48, r49, r50, r52, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphservice.interfaces.Summary.<init>(java.lang.String, boolean, boolean, java.lang.String, int, java.util.List, long, long, long, long, long, int, long, long, long, long, long, long, boolean, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, long, long, long, long, boolean, java.lang.String, long, long):void");
    }
}
