package X;

import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;

/* renamed from: X.Qbc  reason: case insensitive filesystem */
public final class C7854Qbc extends LargeLogUploadProxy {
    public final C58840Ae A00;
    public final C66498MUb A01;
    public final boolean A02 = true;
    public final Context A03;

    public C7854Qbc(Context context, C58840Ae r3, C66498MUb mUb) {
        this.A03 = context;
        this.A01 = mUb;
        this.A00 = r3;
    }

    public final void setStructuredLogger(McfReference mcfReference) {
    }

    public final void uploadConsoleLog(String str, String str2) {
        A00(str, str2, 0, AnonymousClass7TF.A1U(0, str, str2) ? 1 : 0, "ringbuffer.txt", "text/plain");
    }

    public final void uploadOnDemand(byte[] bArr) {
    }

    public final void uploadRtcEventLog(String str, String str2) {
        A00(str, str2, AnonymousClass7TG.A1Z(str, str2) ? 1 : 0, 2, "rtc-event-log.log", "application/octet-stream");
    }

    public final void uploadSdpLog(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        A00(str, str2, 2, 3, "sdp.txt", "text/plain");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:7|8|9|(1:11)|12|(2:14|16)(1:15)|17|(6:19|20|(1:22)(1:23)|24|25|(1:(2:54|33)(2:27|(4:53|29|31|32)(1:30))))(0)|41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.1zE.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ea */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(java.lang.String r12, java.lang.String r13, int r14, int r15, java.lang.String r16, java.lang.String r17) {
        /*
            r11 = this;
            android.content.Context r0 = r11.A03
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r0)
            java.lang.String r0 = "/RsysLogs/"
            r1.append(r0)
            r1.append(r13)
            r0 = 47
            r1.append(r0)
            r0 = r16
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.io.File r8 = X.AnonymousClass7TE.A0t(r0)
            boolean r3 = r8.exists()
            X.0Ae r6 = r11.A00
            java.lang.String r5 = "rtc_large_log_upload"
            X.0wc r6 = (X.0wc) r6
            X.0kJ r4 = r6.A00
            X.0Aj r2 = r6.A00(r4, r5)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "log_type"
            X.AnonymousClass7TE.A1W(r2, r0, r14)
            r1 = 3
            if (r3 == 0) goto L_0x0045
            r1 = 7
        L_0x0045:
            java.lang.String r0 = "status"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            r1 = 1
            java.lang.String r0 = "requestor"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            java.lang.String r0 = "shared_call_id"
            r2.AAJ(r0, r12)
            java.lang.String r0 = "local_call_id"
            r2.AAJ(r0, r13)
            r2.Cgf()
        L_0x0060:
            if (r3 == 0) goto L_0x0129
            r3 = 1
            X.SSw r2 = new X.SSw     // Catch:{ RKf -> 0x00f5 }
            r0 = r17
            r2.<init>(r8, r0)     // Catch:{ RKf -> 0x00f5 }
            r7 = 0
            java.lang.String r1 = "x-rp-rtc-logtype"
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ RKf -> 0x00f5 }
            X.0eP[] r0 = X.DbW.A1b(r1, r0)     // Catch:{ RKf -> 0x00f5 }
            java.util.LinkedHashMap r10 = X.0Yt.A07(r0)     // Catch:{ RKf -> 0x00f5 }
            boolean r9 = r11.A02     // Catch:{ RKf -> 0x00f5 }
            if (r9 == 0) goto L_0x0086
            java.lang.String r1 = "ig_rp_rtc_log_ondemand"
            java.lang.String r0 = "true"
            r10.put(r1, r0)     // Catch:{ RKf -> 0x00f5 }
        L_0x0086:
            X.SOh r1 = new X.SOh     // Catch:{ RKf -> 0x00f5 }
            r1.<init>()     // Catch:{ RKf -> 0x00f5 }
            r1.A07 = r10     // Catch:{ RKf -> 0x00f5 }
            if (r9 == 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            X.KjI r0 = X.C62637KjI.A1A     // Catch:{ RKf -> 0x00f5 }
            X.0qQ.A0B(r0, r7)     // Catch:{ RKf -> 0x00f5 }
            goto L_0x00a3
        L_0x0096:
            r0 = 1423(0x58f, float:1.994E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RKf -> 0x00f5 }
            r1.A06 = r0     // Catch:{ RKf -> 0x00f5 }
            X.KjI r0 = X.C62637KjI.A0d     // Catch:{ RKf -> 0x00f5 }
            X.0qQ.A0B(r0, r7)     // Catch:{ RKf -> 0x00f5 }
        L_0x00a3:
            r1.A01 = r0     // Catch:{ RKf -> 0x00f5 }
            X.SFy r7 = new X.SFy     // Catch:{ RKf -> 0x00f5 }
            r7.<init>(r1)     // Catch:{ RKf -> 0x00f5 }
            r10 = 0
            if (r14 != 0) goto L_0x00ea
            java.nio.charset.Charset r9 = X.AnonymousClass15Q.A05     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            r0.<init>(r8)     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            r8.<init>(r0, r9)     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            boolean r0 = r8 instanceof java.io.BufferedReader     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            if (r0 == 0) goto L_0x00c2
            java.io.BufferedReader r8 = (java.io.BufferedReader) r8     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            goto L_0x00c8
        L_0x00c2:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            r0.<init>(r8, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            r8 = r0
        L_0x00c8:
            java.lang.String r0 = r8.readLine()     // Catch:{ all -> 0x00e3 }
        L_0x00cc:
            if (r0 == 0) goto L_0x00df
            com.facebook.rsys.filelogging.gen.LogFileStats r0 = com.facebook.rsys.filelogging.gen.LogFile.CProxy.createLogFileStats(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00d5
            goto L_0x00da
        L_0x00d5:
            java.lang.String r0 = r8.readLine()     // Catch:{ all -> 0x00e3 }
            goto L_0x00cc
        L_0x00da:
            r8.close()     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            r10 = r0
            goto L_0x00ea
        L_0x00df:
            r8.close()     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            goto L_0x00ea
        L_0x00e3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            X.1zE.A00(r8, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x00ea }
        L_0x00ea:
            X.MUb r0 = r11.A01     // Catch:{ RKf -> 0x00f5 }
            X.SmX r9 = new X.SmX     // Catch:{ RKf -> 0x00f5 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ RKf -> 0x00f5 }
            r0.Ewf(r7, r2, r9)     // Catch:{ RKf -> 0x00f5 }
            return
        L_0x00f5:
            X.0Aj r2 = r6.A00(r4, r5)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0129
            java.lang.String r1 = "log_type"
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 == r0) goto L_0x0124
            X.AnonymousClass7TE.A1W(r2, r1, r14)
        L_0x0108:
            r1 = 5
            java.lang.String r0 = "status"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            java.lang.String r0 = "requestor"
            X.AnonymousClass7TE.A1W(r2, r0, r3)
            java.lang.String r0 = "shared_call_id"
            r2.AAJ(r0, r12)
            java.lang.String r0 = "local_call_id"
            r2.AAJ(r0, r13)
            r2.Cgf()
            return
        L_0x0124:
            r0 = 0
            r2.AAJ(r1, r0)
            goto L_0x0108
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7854Qbc.A00(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void");
    }
}
