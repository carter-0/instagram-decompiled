package androidx.paging;

import X.136;
import X.C262204Co;

public final class SingleRunner {
    public final Holder A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.MD3} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r0 != r2) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r12, X.0sP r13) {
        /*
            r11 = this;
            r9 = 0
            r3 = 15
            boolean r0 = X.C66144MDw.A02(r3, r12)
            r6 = r11
            if (r0 == 0) goto L_0x0026
            r4 = r12
            X.MDw r4 = (X.C66144MDw) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r0) goto L_0x0051
            java.lang.Object r2 = r4.A01
            goto L_0x002c
        L_0x0026:
            X.MDw r4 = new X.MDw
            r4.<init>(r11, r12, r3)
            goto L_0x0018
        L_0x002c:
            X.0eS.A00(r3)     // Catch:{ MD3 -> 0x0030 }
            goto L_0x004e
        L_0x0030:
            r1 = move-exception
            goto L_0x004a
        L_0x0032:
            X.0eS.A00(r3)
            r8 = 0
            X.JUE r5 = new X.JUE     // Catch:{ MD3 -> 0x0048 }
            r7 = r13
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ MD3 -> 0x0048 }
            r4.A01 = r11     // Catch:{ MD3 -> 0x0048 }
            r4.A00 = r0     // Catch:{ MD3 -> 0x0048 }
            java.lang.Object r0 = X.19E.A00(r4, r5)     // Catch:{ MD3 -> 0x0048 }
            if (r0 != r2) goto L_0x004e
            return r2
        L_0x0048:
            r1 = move-exception
            r2 = r11
        L_0x004a:
            androidx.paging.SingleRunner r0 = r1.A00
            if (r0 != r2) goto L_0x0055
        L_0x004e:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0051:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
        L_0x0055:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.A00(X.4D7, X.0sP):java.lang.Object");
    }

    public final class Holder {
        public int A00;
        public C262204Co A01;
        public final SingleRunner A02;
        public final 136 A03 = new 136();

        /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
        /* JADX WARNING: type inference failed for: r6v4 */
        /* JADX WARNING: type inference failed for: r6v5 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004d A[Catch:{ all -> 0x0055 }] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A00(X.AnonymousClass4D7 r8, X.C262204Co r9) {
            /*
                r7 = this;
                r3 = 5
                boolean r0 = X.MED.A04(r3, r8)
                if (r0 == 0) goto L_0x002f
                r6 = r8
                X.MED r6 = (X.MED) r6
                int r2 = r6.A00
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x002f
                int r2 = r2 - r1
                r6.A00 = r2
            L_0x0015:
                java.lang.Object r5 = r6.A04
                X.1Hj r4 = X.1Hj.A02
                int r1 = r6.A00
                r0 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003a
                if (r1 != r0) goto L_0x0035
                java.lang.Object r2 = r6.A03
                X.136 r2 = (X.136) r2
                java.lang.Object r9 = r6.A02
                java.lang.Object r1 = r6.A01
                androidx.paging.SingleRunner$Holder r1 = (androidx.paging.SingleRunner.Holder) r1
                X.0eS.A00(r5)
                goto L_0x0049
            L_0x002f:
                X.MED r6 = new X.MED
                r6.<init>(r7, r8, r3)
                goto L_0x0015
            L_0x0035:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                throw r0
            L_0x003a:
                X.0eS.A00(r5)
                X.136 r2 = r7.A03
                X.MED.A00(r7, r9, r2, r6, r0)
                java.lang.Object r0 = X.136.A00(r6, r2)
                if (r0 == r4) goto L_0x005a
                r1 = r7
            L_0x0049:
                X.4Co r0 = r1.A01     // Catch:{ all -> 0x0055 }
                if (r9 != r0) goto L_0x004f
                r1.A01 = r3     // Catch:{ all -> 0x0055 }
            L_0x004f:
                X.0gF r4 = X.C60340gF.A00     // Catch:{ all -> 0x0055 }
                r2.A05(r3)
                return r4
            L_0x0055:
                r0 = move-exception
                r2.A05(r3)
                throw r0
            L_0x005a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.A00(X.4D7, X.4Co):java.lang.Object");
        }

        /* JADX WARNING: type inference failed for: r8v1, types: [X.MDl, X.4D7] */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r8v5 */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007a A[Catch:{ all -> 0x00a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[Catch:{ all -> 0x00a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A01(X.AnonymousClass4D7 r11, X.C262204Co r12, int r13) {
            /*
                r10 = this;
                r3 = 0
                boolean r0 = X.C66133MDl.A01(r3, r11)
                if (r0 == 0) goto L_0x0033
                r8 = r11
                X.MDl r8 = (X.C66133MDl) r8
                int r2 = r8.A01
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x0033
                int r2 = r2 - r1
                r8.A01 = r2
            L_0x0015:
                java.lang.Object r1 = r8.A05
                X.1Hj r7 = X.1Hj.A02
                int r0 = r8.A01
                r9 = 2
                r6 = 0
                r5 = 1
                if (r0 == 0) goto L_0x0050
                if (r0 == r5) goto L_0x003e
                if (r0 != r9) goto L_0x0039
                int r13 = r8.A00
                java.lang.Object r4 = r8.A04
                X.136 r4 = (X.136) r4
                java.lang.Object r12 = r8.A03
                X.4Co r12 = (X.C262204Co) r12
                java.lang.Object r3 = r8.A02
                androidx.paging.SingleRunner$Holder r3 = (androidx.paging.SingleRunner.Holder) r3
                goto L_0x0097
            L_0x0033:
                X.MDl r8 = new X.MDl
                r8.<init>(r10, r11, r3)
                goto L_0x0015
            L_0x0039:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                throw r0
            L_0x003e:
                int r13 = r8.A00
                java.lang.Object r4 = r8.A04
                X.136 r4 = (X.136) r4
                java.lang.Object r12 = r8.A03
                X.4Co r12 = (X.C262204Co) r12
                java.lang.Object r3 = r8.A02
                androidx.paging.SingleRunner$Holder r3 = (androidx.paging.SingleRunner.Holder) r3
                X.0eS.A00(r1)
                goto L_0x0066
            L_0x0050:
                X.0eS.A00(r1)
                X.136 r4 = r10.A03
                r8.A02 = r10
                r8.A03 = r12
                r8.A04 = r4
                r8.A00 = r13
                r8.A01 = r5
                java.lang.Object r0 = X.136.A00(r8, r4)
                if (r0 == r7) goto L_0x00ab
                r3 = r10
            L_0x0066:
                X.4Co r2 = r3.A01     // Catch:{ all -> 0x00a6 }
                if (r2 == 0) goto L_0x0078
                boolean r0 = r2.isActive()     // Catch:{ all -> 0x00a6 }
                if (r0 == 0) goto L_0x0078
                int r0 = r3.A00     // Catch:{ all -> 0x00a6 }
                if (r0 < r13) goto L_0x0078
                if (r0 == r13) goto L_0x0078
                r5 = 0
                goto L_0x009e
            L_0x0078:
                if (r2 == 0) goto L_0x0084
                androidx.paging.SingleRunner r1 = r3.A02     // Catch:{ all -> 0x00a6 }
                X.MD3 r0 = new X.MD3     // Catch:{ all -> 0x00a6 }
                r0.<init>(r1)     // Catch:{ all -> 0x00a6 }
                r2.AG7(r0)     // Catch:{ all -> 0x00a6 }
            L_0x0084:
                if (r2 == 0) goto L_0x009a
                r8.A02 = r3     // Catch:{ all -> 0x00a6 }
                r8.A03 = r12     // Catch:{ all -> 0x00a6 }
                r8.A04 = r4     // Catch:{ all -> 0x00a6 }
                r8.A00 = r13     // Catch:{ all -> 0x00a6 }
                r8.A01 = r9     // Catch:{ all -> 0x00a6 }
                java.lang.Object r0 = r2.CfH(r8)     // Catch:{ all -> 0x00a6 }
                if (r0 != r7) goto L_0x009a
                return r7
            L_0x0097:
                X.0eS.A00(r1)     // Catch:{ all -> 0x00a6 }
            L_0x009a:
                r3.A01 = r12     // Catch:{ all -> 0x00a6 }
                r3.A00 = r13     // Catch:{ all -> 0x00a6 }
            L_0x009e:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00a6 }
                r4.A05(r6)
                return r7
            L_0x00a6:
                r0 = move-exception
                r4.A05(r6)
                throw r0
            L_0x00ab:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.A01(X.4D7, X.4Co, int):java.lang.Object");
        }

        public Holder(SingleRunner singleRunner) {
            this.A02 = singleRunner;
        }
    }

    public SingleRunner(boolean z) {
        this.A00 = new Holder(this);
    }

    public SingleRunner() {
        this(true);
    }
}
