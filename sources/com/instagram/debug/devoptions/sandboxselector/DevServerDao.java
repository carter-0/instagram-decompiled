package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import java.util.List;

public abstract class DevServerDao {
    public abstract Object deleteAll(AnonymousClass4D7 r1);

    public abstract AnonymousClass0r6 getAll(long j);

    public abstract Object insertAll(List list, AnonymousClass4D7 r2);

    public abstract Object replaceAll(List list, AnonymousClass4D7 r2);

    public static /* synthetic */ AnonymousClass0r6 getAll$default(DevServerDao devServerDao, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return devServerDao.getAll(j);
        }
        throw AnonymousClass7TE.A1B("Super calls with default arguments not supported in this target, function: getAll");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object replaceAll$suspendImpl(com.instagram.debug.devoptions.sandboxselector.DevServerDao r6, java.util.List r7, X.AnonymousClass4D7 r8) {
        /*
            boolean r0 = r8 instanceof com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1
            if (r0 == 0) goto L_0x004f
            r5 = r8
            com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1 r5 = (com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004f
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L_0x0026
            if (r2 == r0) goto L_0x0036
            if (r2 != r1) goto L_0x0055
            X.0eS.A00(r4)
        L_0x0023:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0026:
            X.0eS.A00(r4)
            r5.L$0 = r6
            r5.L$1 = r7
            r5.label = r0
            java.lang.Object r0 = r6.deleteAll(r5)
            if (r0 != r3) goto L_0x0041
            return r3
        L_0x0036:
            java.lang.Object r7 = r5.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r5.L$0
            com.instagram.debug.devoptions.sandboxselector.DevServerDao r6 = (com.instagram.debug.devoptions.sandboxselector.DevServerDao) r6
            X.0eS.A00(r4)
        L_0x0041:
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r1
            java.lang.Object r0 = r6.insertAll(r7, r5)
            if (r0 != r3) goto L_0x0023
            return r3
        L_0x004f:
            com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1 r5 = new com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0055:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.DevServerDao.replaceAll$suspendImpl(com.instagram.debug.devoptions.sandboxselector.DevServerDao, java.util.List, X.4D7):java.lang.Object");
    }
}
