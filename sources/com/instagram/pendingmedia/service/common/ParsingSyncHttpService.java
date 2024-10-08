package com.instagram.pendingmedia.service.common;

import X.1XR;
import X.1ut;
import X.2ZL;
import X.AnonymousClass1C7;
import X.AnonymousClass1QX;
import X.C63790L6w;
import X.C64842Lj4;
import X.DbY;
import com.instagram.common.session.UserSession;
import java.io.IOException;

public final class ParsingSyncHttpService {
    public static final ParsingSyncHttpService A00 = new Object();

    public static final C63790L6w A00(C64842Lj4 lj4, AnonymousClass1QX r5) {
        2ZL r2;
        try {
            r2 = AnonymousClass1C7.A00().A01(r5);
            try {
                return new C63790L6w(r2, lj4.A00(r2), (IOException) null);
            } catch (IOException e) {
                e = e;
                return new C63790L6w(r2, (1XR) null, e);
            }
        } catch (IOException e2) {
            e = e2;
            r2 = null;
            return new C63790L6w(r2, (1XR) null, e);
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a A[Catch:{ IOException -> 0x00b6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[Catch:{ IOException -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e A[Catch:{ IOException -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass1QX r11, com.instagram.common.session.UserSession r12, X.1ut r13, X.AnonymousClass4D7 r14) {
        /*
            r10 = this;
            r3 = 10
            boolean r0 = X.C66147MDz.A02(r3, r14)
            if (r0 == 0) goto L_0x0032
            r7 = r14
            X.MDz r7 = (X.C66147MDz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r7.A04
            X.1Hj r1 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 2
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L_0x004a
            if (r0 == r6) goto L_0x003d
            if (r0 != r8) goto L_0x0038
            java.lang.Object r4 = r7.A03
            X.2ZL r4 = (X.2ZL) r4
            java.lang.Object r13 = r7.A02
            X.1ut r13 = (X.1ut) r13
            java.lang.Object r12 = r7.A01
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            goto L_0x008b
        L_0x0032:
            X.MDz r7 = new X.MDz
            r7.<init>(r10, r14, r3)
            goto L_0x0016
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003d:
            java.lang.Object r5 = r7.A03
            com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse r5 = (com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse) r5
            java.lang.Object r13 = r7.A02
            X.1ut r13 = (X.1ut) r13
            java.lang.Object r12 = r7.A01
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            goto L_0x007b
        L_0x004a:
            X.0eS.A00(r2)
            r0 = 0
            X.0qQ.A0B(r11, r0)     // Catch:{ IOException -> 0x00b3 }
            X.1QS r9 = r11.A02     // Catch:{ IOException -> 0x00b3 }
            java.net.URI r0 = r9.A09     // Catch:{ IOException -> 0x00b3 }
            com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse r5 = new com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse     // Catch:{ IOException -> 0x00b3 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00b3 }
            X.1CO r4 = X.AnonymousClass1CO.A00()     // Catch:{ IOException -> 0x00b3 }
            X.1QU r2 = r11.A03     // Catch:{ IOException -> 0x00b3 }
            X.LeY r0 = r5.A02     // Catch:{ IOException -> 0x00b3 }
            X.1T9 r2 = r4.A02(r0, r9, r2)     // Catch:{ IOException -> 0x00b3 }
            X.0qQ.A07(r2)     // Catch:{ IOException -> 0x00b3 }
            X.Leo r0 = new X.Leo     // Catch:{ IOException -> 0x00b3 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00b3 }
            r11.A01(r0)     // Catch:{ IOException -> 0x00b3 }
            X.C66147MDz.A00(r12, r13, r5, r7, r6)     // Catch:{ IOException -> 0x00b3 }
            java.lang.Object r2 = r5.A00(r7)     // Catch:{ IOException -> 0x00b3 }
            if (r2 != r1) goto L_0x007e
            return r1
        L_0x007b:
            X.0eS.A00(r2)     // Catch:{ IOException -> 0x00b3 }
        L_0x007e:
            r4 = r2
            X.2ZL r4 = (X.2ZL) r4     // Catch:{ IOException -> 0x00b3 }
            X.C66147MDz.A00(r12, r13, r4, r7, r8)     // Catch:{ IOException -> 0x00b6 }
            java.lang.Object r2 = r5.A01(r7)     // Catch:{ IOException -> 0x00b6 }
            if (r2 != r1) goto L_0x008e
            return r1
        L_0x008b:
            X.0eS.A00(r2)     // Catch:{ IOException -> 0x00b1 }
        L_0x008e:
            X.KlZ r2 = (X.C62735KlZ) r2     // Catch:{ IOException -> 0x00b1 }
            boolean r0 = r2 instanceof X.C61503KAi     // Catch:{ IOException -> 0x00b1 }
            if (r0 == 0) goto L_0x009e
            X.K1X r0 = r13.E1q(r4, r12)     // Catch:{ IOException -> 0x00b1 }
            X.L6w r1 = new X.L6w     // Catch:{ IOException -> 0x00b1 }
            r1.<init>(r4, r0, r3)     // Catch:{ IOException -> 0x00b1 }
            return r1
        L_0x009e:
            boolean r0 = r2 instanceof X.C61502KAh     // Catch:{ IOException -> 0x00b1 }
            if (r0 == 0) goto L_0x00ac
            X.KAh r2 = (X.C61502KAh) r2     // Catch:{ IOException -> 0x00b1 }
            java.io.IOException r0 = r2.A00     // Catch:{ IOException -> 0x00b1 }
            X.L6w r1 = new X.L6w     // Catch:{ IOException -> 0x00b1 }
            r1.<init>(r4, r3, r0)     // Catch:{ IOException -> 0x00b1 }
            return r1
        L_0x00ac:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ IOException -> 0x00b1 }
            throw r0     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            goto L_0x00b7
        L_0x00b3:
            r0 = move-exception
            r4 = r3
            goto L_0x00b7
        L_0x00b6:
            r0 = move-exception
        L_0x00b7:
            X.L6w r1 = new X.L6w
            r1.<init>(r4, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A02(X.1QX, com.instagram.common.session.UserSession, X.1ut, X.4D7):java.lang.Object");
    }

    public static final C63790L6w A01(AnonymousClass1QX r4, UserSession userSession, 1ut r6) {
        2ZL r2;
        DbY.A1S(userSession, r6);
        try {
            r2 = AnonymousClass1C7.A00().A01(r4);
            try {
                return new C63790L6w(r2, r6.E1q(r2, userSession), (IOException) null);
            } catch (IOException e) {
                e = e;
                return new C63790L6w(r2, (1XR) null, e);
            }
        } catch (IOException e2) {
            e = e2;
            r2 = null;
            return new C63790L6w(r2, (1XR) null, e);
        }
    }
}
