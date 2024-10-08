package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.McX  reason: case insensitive filesystem */
public abstract class C66786McX {
    public static final String A00(Context context, UserSession userSession, 2EM r3) {
        C51973G9u.A1E(context, userSession, r3);
        return A01(context, userSession, r3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36317934217598616L) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if (r0 != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        if (r0 == false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r3, com.instagram.common.session.UserSession r4, X.2EM r5, boolean r6) {
        /*
            boolean r0 = X.2El.A07(r4)
            if (r0 == 0) goto L_0x0046
            if (r6 != 0) goto L_0x0046
            X.2Dm r0 = X.2L2.A00(r4)
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r2 = r0.A0C
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.A0G
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0029
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            X.2EJ r0 = r2.A00     // Catch:{ all -> 0x0024 }
            X.2PM r0 = r0.A01(r5)     // Catch:{ all -> 0x0024 }
            goto L_0x0037
        L_0x0024:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x0029:
            java.lang.Object r1 = r2.A0D
            monitor-enter(r1)
            X.2EJ r0 = r2.A00     // Catch:{ all -> 0x0034 }
            X.2PM r0 = r0.A01(r5)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            goto L_0x003a
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0037:
            r1.unlock()
        L_0x003a:
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0046
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0065
        L_0x0046:
            X.2EY r0 = X.AnonymousClass2EY.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x011e
            X.5y7 r0 = X.C300885y7.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x011e
            X.2EU r0 = X.AnonymousClass2EU.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0066
            r0 = 2131964268(0x7f13316c, float:1.9565313E38)
        L_0x0061:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r3, r0)
        L_0x0065:
            return r1
        L_0x0066:
            X.2EL r0 = X.AnonymousClass2EL.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0072
            r0 = 2131964247(0x7f133157, float:1.956527E38)
            goto L_0x0061
        L_0x0072:
            X.2EX r0 = X.AnonymousClass2EX.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x007e
            r0 = 2131964269(0x7f13316d, float:1.9565315E38)
            goto L_0x0061
        L_0x007e:
            X.43A r0 = X.AnonymousClass43A.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x00b0
            r0 = 0
            X.0qQ.A0B(r4, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r4)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x00a2
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317934217598616(0x8106f800041698, double:3.0309460675678176E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r1 = 2131964312(0x7f133198, float:1.9565402E38)
            if (r0 == 0) goto L_0x00ab
        L_0x00a8:
            r1 = 2131964245(0x7f133155, float:1.9565266E38)
        L_0x00ab:
            java.lang.String r1 = X.C51967G9n.A0p(r3, r1)
            return r1
        L_0x00b0:
            X.MkU r0 = X.C67234MkU.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x00bc
            r0 = 2131964309(0x7f133195, float:1.9565396E38)
            goto L_0x0061
        L_0x00bc:
            X.2Ea r0 = X.C69932Ea.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x00c8
            r0 = 2131964306(0x7f133192, float:1.956539E38)
            goto L_0x0061
        L_0x00c8:
            X.43I r0 = X.AnonymousClass43I.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x00d4
            r0 = 2131959785(0x7f131fe9, float:1.955622E38)
            goto L_0x0061
        L_0x00d4:
            X.4iZ r0 = X.AnonymousClass4iZ.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x00e7
            r0 = 1
            boolean r0 = X.C272094k5.A0B(r4, r0)
            r1 = 2131964268(0x7f13316c, float:1.9565313E38)
        L_0x00e4:
            if (r0 != 0) goto L_0x00ab
            goto L_0x00a8
        L_0x00e7:
            X.MkL r0 = X.C67225MkL.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x00f4
            r0 = 2131959968(0x7f1320a0, float:1.9556591E38)
            goto L_0x0061
        L_0x00f4:
            X.43H r0 = X.AnonymousClass43H.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0101
            r0 = 2131959966(0x7f13209e, float:1.9556587E38)
            goto L_0x0061
        L_0x0101:
            X.4hs r0 = X.C271084hs.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x010e
            r0 = 2131959967(0x7f13209f, float:1.955659E38)
            goto L_0x0061
        L_0x010e:
            X.5y8 r0 = X.C300895y8.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0123
            boolean r0 = X.2El.A0E(r4)
            r1 = 2131959785(0x7f131fe9, float:1.955622E38)
            goto L_0x00e4
        L_0x011e:
            r0 = 2131964245(0x7f133155, float:1.9565266E38)
            goto L_0x0061
        L_0x0123:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unrecognized inbox mode: "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r5, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66786McX.A01(android.content.Context, com.instagram.common.session.UserSession, X.2EM, boolean):java.lang.String");
    }
}
