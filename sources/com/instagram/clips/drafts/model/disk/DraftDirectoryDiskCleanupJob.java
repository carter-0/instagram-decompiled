package com.instagram.clips.drafts.model.disk;

import X.0qQ;
import X.2NP;
import X.2Nn;

public final class DraftDirectoryDiskCleanupJob {
    public final 2NP A00;
    public final 2Nn A01;

    public DraftDirectoryDiskCleanupJob(2NP r2, 2Nn r3) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b A[LOOP:0: B:10:0x0035->B:12:0x003b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 26
            boolean r0 = X.AnonymousClass9JU.A00(r3, r6)
            if (r0 == 0) goto L_0x0055
            r4 = r6
            X.9JU r4 = (X.AnonymousClass9JU) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 != r1) goto L_0x0062
            X.0eS.A00(r3)
        L_0x0024:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x0035:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r1.next()
            X.5Hr r0 = (X.AnonymousClass5Hr) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L_0x0035
        L_0x0047:
            X.0eS.A00(r3)
            X.2NP r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r3 = r0.A0M(r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0055:
            r0 = 42
            X.9JU r4 = new X.9JU
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x005d:
            java.util.Set r2 = X.00k.A0k(r2)
            return r2
        L_0x0062:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob.A00(com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r4 = 14
            boolean r0 = X.C376709Ja.A00(r4, r9)
            if (r0 == 0) goto L_0x007a
            r3 = r9
            X.9Ja r3 = (X.C376709Ja) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r3.A03
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r4) goto L_0x0080
            java.lang.Object r8 = r3.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r6 = r3.A01
            com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r6 = (com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob) r6
            X.0eS.A00(r5)
        L_0x002c:
            java.util.Set r5 = (java.util.Set) r5
            r0 = 0
            X.0qQ.A0B(r8, r0)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            java.util.List r0 = r1.A09(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r2.next()
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.55Q r0 = r1.A1O
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x005d
        L_0x0059:
            java.lang.String r0 = r1.A3w
            if (r0 == 0) goto L_0x0045
        L_0x005d:
            r3.add(r0)
            goto L_0x0045
        L_0x0061:
            X.0eS.A00(r5)
            X.2Nn r0 = r7.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00b1
            r3.A01 = r7
            r3.A02 = r8
            r3.A00 = r4
            java.lang.Object r5 = A00(r7, r3)
            if (r5 == r1) goto L_0x00b3
            r6 = r7
            goto L_0x002c
        L_0x007a:
            X.9Ja r3 = new X.9Ja
            r3.<init>(r7, r9, r4)
            goto L_0x0016
        L_0x0080:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0088:
            java.util.Set r1 = X.00k.A0k(r3)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b4
            java.util.LinkedHashSet r5 = X.094.A00(r1, r5)
        L_0x0098:
            X.2Nn r3 = r6.A01
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r8)
            java.util.HashSet r2 = r0.A06()
            X.0qQ.A0B(r5, r4)
            X.0nO r1 = X.0nY.A00()
            X.42X r0 = new X.42X
            r0.<init>(r3, r5, r2)
            r1.ATE(r0)
        L_0x00b1:
            X.0gF r1 = X.C60340gF.A00
        L_0x00b3:
            return r1
        L_0x00b4:
            X.094.A00(r1, r5)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob.A01(com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }
}
