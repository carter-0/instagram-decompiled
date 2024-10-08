package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class S1R {
    public final UserSession A00;
    public final Map A01;

    public S1R(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        Map A0w = Pxf.A0w();
        0qQ.A07(A0w);
        this.A01 = A0w;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.RVG, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0169, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.RVG A00(X.C9141RQs r13, X.C10392RrT r14, java.lang.Integer r15, java.net.URI r16, java.util.Map r17) {
        /*
            r12 = this;
            com.instagram.common.session.UserSession r3 = r12.A00
            X.1QP r0 = X.AnonymousClass1QO.A00(r3)
            int[] r0 = r0.getOngoingFlows()
            java.lang.String r1 = X.1QR.A00(r0)
            r2 = r17
            if (r1 == 0) goto L_0x001d
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x001d
            java.lang.String r0 = "X-IG-SALT-IDS"
            r2.put(r0, r1)
        L_0x001d:
            int r1 = r15.intValue()
            r11 = 0
            X.1HV r0 = new X.1HV
            r0.<init>(r3)
            X.1Pq r6 = new X.1Pq
            if (r1 == r11) goto L_0x0059
            r6.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A01(r0)
            r6.A05 = r11
            java.lang.String r0 = X.DbT.A10(r16)
            r6.A02 = r0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r2)
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008e
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.String r1 = X.DbT.A13(r0)
            java.lang.String r0 = X.DbS.A0s(r0)
            X.Pxf.A1M(r1, r0, r3)
            goto L_0x0043
        L_0x0059:
            r6.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r6.A01(r0)
            java.lang.String r0 = X.DbT.A10(r16)
            r6.A02 = r0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r2)
        L_0x006f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0085
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.String r1 = X.DbT.A13(r0)
            java.lang.String r0 = X.DbS.A0s(r0)
            X.Pxf.A1M(r1, r0, r3)
            goto L_0x006f
        L_0x0085:
            java.util.List r0 = r6.A06
            r0.clear()
            r0.addAll(r3)
            goto L_0x00fd
        L_0x008e:
            java.util.List r0 = r6.A06
            r0.clear()
            r0.addAll(r3)
            if (r14 == 0) goto L_0x00fd
            X.SSw r7 = r14.A01
            java.io.File r9 = r7.A01
            if (r9 == 0) goto L_0x012d
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x012d
            r2 = 0
            long r4 = r14.A00
            int r10 = (int) r4
            long r0 = r7.A00
            long r0 = r0 - r4
            int r8 = (int) r0
            if (r8 >= 0) goto L_0x00f1
            java.lang.String r1 = X.DbT.A10(r16)
            java.lang.String r0 = "phase=transfer"
            boolean r0 = X.00l.A0d(r1, r0, r11)
            if (r0 == 0) goto L_0x00f1
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "content_length "
            r11.append(r0)
            long r0 = r7.A00
            r11.append(r0)
            java.lang.String r0 = " content_offset "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = " mime "
            r11.append(r0)
            java.lang.String r0 = r7.A04
            r11.append(r0)
            java.lang.String r0 = " filekey "
            r11.append(r0)
            java.lang.String r0 = r7.A03
            r11.append(r0)
            java.lang.String r0 = " body_offset "
            java.lang.String r1 = X.Pxg.A0u(r0, r11, r4)
            java.lang.String r0 = "content_length_will_drop"
            X.0wb.A03(r0, r1)
        L_0x00f1:
            X.T6Y r1 = new X.T6Y
            r1.<init>(r13)
            X.T6c r0 = new X.T6c
            r0.<init>(r1, r9, r10, r8)
            r6.A00 = r0
        L_0x00fd:
            X.1QS r5 = r6.A00()
            X.1QT r1 = new X.1QT
            r1.<init>()
            X.1CE r0 = X.1CE.A07
            r1.A04 = r0
            X.1QU r4 = r1.A00()
            X.RVG r3 = new X.RVG
            r3.<init>()
            X.1CO r2 = X.AnonymousClass1CO.A00()
            java.lang.ref.WeakReference r1 = X.C51965G9l.A0v(r12)
            X.T6K r0 = new X.T6K
            r0.<init>(r3, r13, r1)
            X.1T9 r1 = r2.A02(r0, r5, r4)
            X.0qQ.A07(r1)
            java.util.Map r0 = r12.A01
            r0.put(r3, r1)
            return r3
        L_0x012d:
            java.io.InputStream r1 = r7.A02     // Catch:{ Exception -> 0x0173 }
            if (r1 == 0) goto L_0x016e
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ Exception -> 0x0173 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0173 }
            r3.<init>(r1, r0)     // Catch:{ Exception -> 0x0173 }
            boolean r0 = r3 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x0173 }
            if (r0 == 0) goto L_0x013f
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch:{ Exception -> 0x0173 }
            goto L_0x0147
        L_0x013f:
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0173 }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0173 }
            r3 = r0
        L_0x0147:
            java.lang.String r2 = X.1r9.A00(r3)     // Catch:{ all -> 0x0167 }
            if (r3 == 0) goto L_0x0150
            r3.close()     // Catch:{ Exception -> 0x0173 }
        L_0x0150:
            java.lang.String r1 = r7.A04     // Catch:{ Exception -> 0x0173 }
            X.T6Z r0 = new X.T6Z     // Catch:{ Exception -> 0x0173 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0173 }
            r6.A00 = r0
            byte[] r0 = r0.A00
            int r0 = r0.length
            long r0 = (long) r0
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "X-Entity-Length"
            r6.A03(r0, r1)
            goto L_0x00fd
        L_0x0167:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ Exception -> 0x0173 }
            goto L_0x0172
        L_0x016e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0173 }
        L_0x0172:
            throw r0     // Catch:{ Exception -> 0x0173 }
        L_0x0173:
            r2 = move-exception
            java.lang.String r1 = "IgHttpRequestFactory"
            java.lang.String r0 = "body conversion error"
            X.0KC.A0G(r1, r0, r2)
            java.lang.String r0 = "ml_body_error"
            X.0wb.A07(r0, r2)
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S1R.A00(X.RQs, X.RrT, java.lang.Integer, java.net.URI, java.util.Map):X.RVG");
    }
}
