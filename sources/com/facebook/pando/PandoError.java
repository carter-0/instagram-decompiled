package com.facebook.pando;

import X.0qQ;
import X.AnonymousClass7TG;

public final class PandoError {
    public final String apiErrorDebugInfo;
    public final String apiErrorDescription;
    public final boolean apiErrorIsSilent;
    public final boolean apiErrorIsTransient;
    public final boolean apiErrorRequiresReauth;
    public final String apiErrorSummary;
    public final String message;
    public final String tigonErrorAnalyticsDetail;
    public final String tigonErrorAnalyticsDomain;
    public final short tigonErrorCode;
    public final String tigonErrorCodeDescription;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PandoError(java.lang.String r13, java.lang.String r14, java.lang.String r15, short r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r1 = r24
            r9 = r21
            r8 = r20
            r7 = r19
            r6 = r18
            r5 = r17
            r4 = r16
            r3 = r15
            r2 = r14
            r0 = r24 & 2
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0017
            r2 = r11
        L_0x0017:
            r0 = r24 & 4
            if (r0 == 0) goto L_0x001c
            r3 = r11
        L_0x001c:
            r0 = r24 & 8
            r10 = 0
            if (r0 == 0) goto L_0x0022
            r4 = 0
        L_0x0022:
            r0 = r24 & 16
            if (r0 == 0) goto L_0x0027
            r5 = r11
        L_0x0027:
            r0 = r24 & 32
            if (r0 == 0) goto L_0x002c
            r6 = r11
        L_0x002c:
            r0 = r24 & 64
            if (r0 == 0) goto L_0x0031
            r7 = r11
        L_0x0031:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0036
            r8 = 0
        L_0x0036:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003b
            r9 = 0
        L_0x003b:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0041
            r10 = r22
        L_0x0041:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0047
            r11 = r23
        L_0x0047:
            r0 = r12
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pando.PandoError.<init>(java.lang.String, java.lang.String, java.lang.String, short, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public PandoError(String str, String str2, String str3, short s, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7) {
        AnonymousClass7TG.A1U(str, str2, str3);
        AnonymousClass7TG.A1S(str4, str5);
        0qQ.A0B(str6, 7);
        0qQ.A0B(str7, 11);
        this.message = str;
        this.tigonErrorCodeDescription = str2;
        this.tigonErrorAnalyticsDomain = str3;
        this.tigonErrorCode = s;
        this.tigonErrorAnalyticsDetail = str4;
        this.apiErrorSummary = str5;
        this.apiErrorDescription = str6;
        this.apiErrorIsTransient = z;
        this.apiErrorIsSilent = z2;
        this.apiErrorRequiresReauth = z3;
        this.apiErrorDebugInfo = str7;
    }
}
