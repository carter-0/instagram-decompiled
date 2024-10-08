package com.facebook.videolite.instagram;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C11420SSw;
import X.C13816Thj;
import X.C60340gF;
import X.C71548Omj;
import X.C71549Omk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1", f = "MemFbUploader.kt", i = {0}, l = {72}, m = "invokeSuspend", n = {"mediaId"}, s = {"J$0"})
public final class MemFbUploader$startAsyncUploadJob$job$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C11420SSw A03;
    public final /* synthetic */ C13816Thj A04;
    public final /* synthetic */ C71548Omj A05;
    public final /* synthetic */ C71549Omk A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemFbUploader$startAsyncUploadJob$job$1(C11420SSw sSw, C13816Thj thj, C71548Omj omj, C71549Omk omk, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A04 = thj;
        this.A06 = omk;
        this.A03 = sSw;
        this.A05 = omj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        ? memFbUploader$startAsyncUploadJob$job$1 = new MemFbUploader$startAsyncUploadJob$job$1(this.A03, this.A04, this.A05, this.A06, r8);
        memFbUploader$startAsyncUploadJob$job$1.A02 = obj;
        return memFbUploader$startAsyncUploadJob$job$1;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r20
            X.1Hj r3 = X.1Hj.A02
            r13 = r19
            int r0 = r13.A00
            r2 = 1
            if (r0 == 0) goto L_0x000e
            long r14 = r13.A01
            goto L_0x006a
        L_0x000e:
            X.0eS.A00(r1)
            X.Thj r0 = r13.A04
            if (r0 == 0) goto L_0x0018
            r0.onStart()
        L_0x0018:
            X.OdG r6 = X.C71122OdG.A00
            X.Omk r1 = r13.A06
            com.instagram.common.session.UserSession r8 = r1.A00
            X.3Q2 r4 = r1.A01
            java.lang.String r5 = r4.A3p
            r7 = 0
            r1 = 1109(0x455, float:1.554E-42)
            X.C71122OdG.A03(r8, r7, r5, r7, r1)
            java.lang.String r1 = r4.A3p
            r6.A04(r8, r1)
            X.SSw r1 = r13.A03
            java.io.File r1 = r1.A01
            if (r1 == 0) goto L_0x00ff
            java.lang.String r11 = r1.getCanonicalPath()
        L_0x0037:
            if (r11 != 0) goto L_0x0050
            if (r0 == 0) goto L_0x004d
            java.lang.String r8 = "File path is null"
            r11 = 0
            r10 = 0
            java.util.Map r9 = java.util.Collections.emptyMap()
            X.RKf r6 = new X.RKf
            r13 = r10
            r6.<init>(r7, r8, r9, r10, r11, r13)
        L_0x004a:
            r0.DEX(r6)
        L_0x004d:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0050:
            long r14 = X.AnonymousClass0HN.A00()
            java.lang.String r1 = r4.A2N     // Catch:{ all -> 0x0070 }
            if (r1 != 0) goto L_0x0076
            java.lang.Integer r9 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0070 }
            java.lang.String r12 = r4.A3p     // Catch:{ all -> 0x0070 }
            java.lang.Integer r10 = r4.A2G     // Catch:{ all -> 0x0070 }
            r13.A01 = r14     // Catch:{ all -> 0x0070 }
            r13.A00 = r2     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = X.C71122OdG.A00(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0070 }
            if (r1 != r3) goto L_0x006d
            goto L_0x0102
        L_0x006a:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0070 }
        L_0x006d:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0070 }
            goto L_0x0076
        L_0x0070:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x0076:
            X.Omk r2 = r13.A06
            X.Omj r3 = r13.A05
            X.Thj r0 = r13.A04
            boolean r4 = r1 instanceof X.0eQ
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x00b3
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            X.3Q2 r4 = r2.A01
            r4.A2N = r5
            java.lang.String r8 = java.lang.String.valueOf(r14)
            X.0sm r15 = X.0Yt.A0E()
            java.lang.String r9 = "response"
            r16 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = 0
            r17 = -1
            X.SJe r6 = new X.SJe
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.A00 = r6
            com.instagram.common.session.UserSession r5 = r2.A00
            java.lang.String r4 = r4.A3p
            r3 = 1110(0x456, float:1.555E-42)
            X.C71122OdG.A03(r5, r10, r4, r10, r3)
            if (r0 == 0) goto L_0x00b3
            r0.D5G(r6)
        L_0x00b3:
            java.lang.Throwable r4 = X.0eR.A00(r1)
            if (r4 == 0) goto L_0x004d
            java.lang.String r3 = r4.getMessage()
            java.lang.String r8 = "unknown"
            if (r3 != 0) goto L_0x00c2
            r3 = r8
        L_0x00c2:
            boolean r1 = r4 instanceof X.C66121MCs
            r5 = -1
            if (r1 == 0) goto L_0x00fd
            X.MCs r4 = (X.C66121MCs) r4
            com.facebook.msys.mcf.MsysError r1 = r4.A00
            if (r1 == 0) goto L_0x00d1
            int r5 = r1.getCode()
        L_0x00d1:
            if (r1 == 0) goto L_0x00da
            java.lang.String r1 = r1.getFailureReason()
            if (r1 == 0) goto L_0x00da
            r8 = r1
        L_0x00da:
            X.OdG r1 = X.C71122OdG.A00
            com.instagram.common.session.UserSession r4 = r2.A00
            X.3Q2 r1 = r2.A01
            java.lang.String r3 = r1.A3p
            java.lang.Integer r2 = X.JTO.A0w(r5)
            r7 = 0
            r1 = 1111(0x457, float:1.557E-42)
            X.C71122OdG.A03(r4, r2, r3, r7, r1)
            if (r0 == 0) goto L_0x004d
            r11 = 0
            r10 = 0
            java.util.Map r9 = java.util.Collections.emptyMap()
            X.RKf r6 = new X.RKf
            r13 = r10
            r6.<init>(r7, r8, r9, r10, r11, r13)
            goto L_0x004a
        L_0x00fd:
            r8 = r3
            goto L_0x00da
        L_0x00ff:
            r11 = 0
            goto L_0x0037
        L_0x0102:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemFbUploader$startAsyncUploadJob$job$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
