package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.RyR  reason: case insensitive filesystem */
public final class C10805RyR {
    public long A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final AnonymousClass4MQ A02;
    public final C383889gQ A03;
    public final Object A04 = Pxe.A0p();
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final Map A06;
    public final Executor A07;

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0151 A[Catch:{ Exception -> 0x00d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10805RyR(X.C10964S2w r22, X.C10209RoQ r23, X.AnonymousClass4MQ r24, java.lang.String r25, java.util.concurrent.Executor r26, long r27, boolean r29, boolean r30) {
        /*
            r21 = this;
            r14 = r21
            r14.<init>()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            r14.A06 = r5
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A05 = r0
            java.lang.Object r0 = X.Pxe.A0p()
            r14.A04 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r14.A01 = r0
            r6 = r24
            r14.A02 = r6
            r7 = r26
            r14.A07 = r7
            X.8rM r4 = new X.8rM
            r4.<init>()
            r0 = 10
            r4.A01(r0)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0 = r27
            if (r30 == 0) goto L_0x00d0
            r8.getClass()
            long r2 = r4.A02
            r12 = 1
            r10 = -1
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            boolean r10 = X.AnonymousClass7TF.A1Q(r9)
            java.lang.String r9 = "refresh was already set to %s ns"
            X.17k.A06(r2, r9, r10)
            r9 = 0
            int r2 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x004e
            r12 = 0
        L_0x004e:
            java.lang.String r2 = "duration must be positive: %s %s"
            if (r12 == 0) goto L_0x01b4
            long r2 = r8.toNanos(r0)
            r4.A02 = r2
        L_0x0058:
            X.4MQ r2 = r4.A04
            boolean r2 = X.DbW.A1a(r2)
            X.17k.A0F(r2)
            r4.A04 = r6
            X.T0C r3 = new X.T0C
            r8 = r23
            r3.<init>(r8)
            X.8rb r2 = r4.A05
            boolean r2 = X.DbW.A1a(r2)
            X.17k.A0F(r2)
            r4.A05 = r3
            X.Qys r13 = new X.Qys
            r16 = r8
            r17 = r6
            r18 = r7
            r19 = r0
            r15 = r22
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.9gQ r0 = new X.9gQ
            r0.<init>(r4, r13)
            r14.A03 = r0
            if (r29 == 0) goto L_0x0179
            long r12 = r6.A00()
            android.content.Context r1 = r8.A00
            java.lang.String r0 = "act_dns_cache"
            r9 = 0
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r9)
            X.0qQ.A07(r0)
            java.util.Map r1 = r0.getAll()
            if (r1 == 0) goto L_0x0176
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0176
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r1)
        L_0x00b1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r2, r0)
            X.0qQ.A0C(r1, r0)
            r4.put(r2, r1)
            goto L_0x00b1
        L_0x00d0:
            r4.A02(r0, r8)
            goto L_0x0058
        L_0x00d4:
            java.util.Iterator r11 = X.AnonymousClass7TF.A0s(r4)
        L_0x00d8:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0176
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r11)
            java.lang.String r8 = X.DbT.A13(r0)
            java.lang.String r4 = X.DbS.A0s(r0)
            r2 = r12
            r0 = 1
            X.0qQ.A0B(r8, r0)
            if (r4 == 0) goto L_0x00d8
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00d8
            r0 = 59
            int r1 = X.00l.A04(r4, r0, r9)     // Catch:{ Exception -> 0x00d8 }
            r0 = -1
            if (r1 == r0) goto L_0x00d8
            java.lang.String r0 = X.C51967G9n.A0q(r4, r9, r1)     // Catch:{ Exception -> 0x00d8 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00d8 }
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x010d
            r2 = r6
        L_0x010d:
            int r0 = r1 + 1
            java.lang.String r1 = X.C66580MXl.A0z(r4, r0)     // Catch:{ Exception -> 0x00d8 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x00d8 }
            r7 = 0
            if (r0 != 0) goto L_0x0122
            X.0sn r10 = X.0sn.A00     // Catch:{ Exception -> 0x00d8 }
        L_0x011c:
            X.Rre r0 = new X.Rre     // Catch:{ Exception -> 0x00d8 }
            r0.<init>(r10, r2)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x0171
        L_0x0122:
            java.lang.String r0 = ";"
            java.util.List r4 = X.DbW.A0o(r1, r0)     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r4.isEmpty()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x014c
            java.util.ListIterator r1 = X.C51968G9o.A18(r4)     // Catch:{ Exception -> 0x00d8 }
        L_0x0132:
            boolean r0 = r1.hasPrevious()     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x014c
            int r0 = X.DbX.A06(r1)     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x0132
            java.util.List r0 = X.DbX.A0y(r4, r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x0142:
            java.lang.String[] r6 = X.DbU.A1b(r0, r9)     // Catch:{ Exception -> 0x00d8 }
            int r4 = r6.length     // Catch:{ Exception -> 0x00d8 }
            java.util.ArrayList r10 = X.DbS.A0v(r4)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x014f
        L_0x014c:
            X.0sn r0 = X.0sn.A00     // Catch:{ Exception -> 0x00d8 }
            goto L_0x0142
        L_0x014f:
            if (r7 >= r4) goto L_0x011c
            r1 = r6[r7]     // Catch:{ Exception -> 0x00d8 }
            r0 = 3
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0166 }
            X.0qQ.A07(r0)     // Catch:{ IllegalArgumentException -> 0x0166 }
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r8, r0)     // Catch:{ UnknownHostException -> 0x016e }
            X.0qQ.A0A(r0)     // Catch:{ UnknownHostException -> 0x016e }
            r10.add(r0)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x016e
        L_0x0166:
            java.lang.String r1 = "Failed to decodeSingleAddress an InetAddress"
            java.net.UnknownHostException r0 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x016e }
            r0.<init>(r1)     // Catch:{ UnknownHostException -> 0x016e }
            throw r0     // Catch:{ UnknownHostException -> 0x016e }
        L_0x016e:
            int r7 = r7 + 1
            goto L_0x014f
        L_0x0171:
            r5.put(r8, r0)
            goto L_0x00d8
        L_0x0176:
            r5.size()
        L_0x0179:
            java.lang.String r0 = ","
            r1 = r25
            java.util.List r0 = X.DbV.A18(r1, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0185:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b3
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0185
            java.util.Map r0 = r14.A06
            java.lang.Object r1 = r0.remove(r2)
            X.Rre r1 = (X.C10402Rre) r1
            if (r1 == 0) goto L_0x01a8
            X.9gQ r0 = r14.A03
            java.util.List r1 = r1.A01
            X.8rQ r0 = r0.A00
            r0.put(r2, r1)
        L_0x01a8:
            java.util.concurrent.Executor r1 = r14.A07
            X.TFp r0 = new X.TFp
            r0.<init>(r14, r2)
            r1.execute(r0)
            goto L_0x0185
        L_0x01b3:
            return
        L_0x01b4:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r8}
            java.lang.String r0 = com.google.common.base.Strings.A00(r2, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10805RyR.<init>(X.S2w, X.RoQ, X.4MQ, java.lang.String, java.util.concurrent.Executor, long, boolean, boolean):void");
    }
}
