package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.58U  reason: invalid class name */
public final class AnonymousClass58U extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Map A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58U(UserSession userSession, Map map) {
        super(332, 3, false, false);
        this.A00 = userSession;
        this.A01 = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.1zE.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            X.3PY r0 = X.AnonymousClass3PX.A02
            r1 = r16
            com.instagram.common.session.UserSession r0 = r1.A00
            X.3PX r0 = X.AnonymousClass3PY.A00(r0)
            java.util.Map r6 = r1.A01
            r6.size()
            X.3oZ r5 = r0.A00
            java.lang.String r3 = "UserReelMediasRoom"
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00b0 }
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ Exception -> 0x00b0 }
            r4.<init>()     // Catch:{ Exception -> 0x00b0 }
            java.util.Set r0 = r6.entrySet()     // Catch:{ Exception -> 0x00b0 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Exception -> 0x00b0 }
        L_0x0024:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x00b0 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r9.next()     // Catch:{ Exception -> 0x00b0 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x00b0 }
            java.lang.Object r11 = r0.getKey()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00b0 }
            java.lang.Object r8 = r0.getValue()     // Catch:{ Exception -> 0x00b0 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ Exception -> 0x00b0 }
            r0 = 0
            X.0qQ.A0B(r8, r0)     // Catch:{ Exception -> 0x00b0 }
            java.util.List r7 = X.C252113oa.A00(r8)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r2 = ","
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r12 = X.00k.A0P(r2, r0, r0, r7, r1)     // Catch:{ Exception -> 0x00b0 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b0 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x00b0 }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00b0 }
            r8.<init>()     // Catch:{ Exception -> 0x00b0 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x00b0 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x00b0 }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ Exception -> 0x00b0 }
            X.17W r7 = r0.A0A(r1)     // Catch:{ Exception -> 0x00b0 }
            r7.A0c()     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "medias"
            X.16P.A03(r7, r0)     // Catch:{ all -> 0x009b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x009b }
        L_0x006e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x009b }
            X.1Xj r1 = (X.1Xj) r1     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x006e
            X.1Xv r0 = X.1Xj.A0h     // Catch:{ all -> 0x009b }
            X.1Xv.A07(r7, r1)     // Catch:{ all -> 0x009b }
            goto L_0x006e
        L_0x0082:
            r7.A0Y()     // Catch:{ all -> 0x009b }
            r7.A0Z()     // Catch:{ all -> 0x009b }
            r7.close()     // Catch:{ Exception -> 0x00b0 }
            byte[] r13 = r8.toByteArray()     // Catch:{ Exception -> 0x00b0 }
            X.0qQ.A07(r13)     // Catch:{ Exception -> 0x00b0 }
            X.46V r10 = new X.46V     // Catch:{ Exception -> 0x00b0 }
            r10.<init>(r11, r12, r13, r14)     // Catch:{ Exception -> 0x00b0 }
            r4.add(r10)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0024
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.1zE.A00(r7, r1)     // Catch:{ Exception -> 0x00b0 }
            throw r0     // Catch:{ Exception -> 0x00b0 }
        L_0x00a2:
            com.instagram.reels.persistence.room.UserReelMediaDatabase r1 = r5.A06     // Catch:{ Exception -> 0x00b0 }
            X.5eD r0 = new X.5eD     // Catch:{ Exception -> 0x00b0 }
            r0.<init>(r5, r4, r6)     // Catch:{ Exception -> 0x00b0 }
            r1.runInTransaction((java.lang.Runnable) r0)     // Catch:{ Exception -> 0x00b0 }
            r6.size()     // Catch:{ Exception -> 0x00b0 }
            return
        L_0x00b0:
            r2 = move-exception
            java.lang.String r0 = "Failed to store user reel blob"
            X.0KC.A0F(r3, r0, r2)
            java.lang.String r1 = "Failed to store user reel blob: "
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0wb.A03(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.run():void");
    }
}
