package androidx.compose.runtime.snapshots;

import X.0sL;
import X.AnonymousClass4D7;
import X.AnonymousClass5P8;
import X.AnonymousClass7TE;
import X.C267894cP;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
public final class SnapshotIdSet$iterator$1 extends C267894cP implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ AnonymousClass5P8 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(AnonymousClass5P8 r2, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A05 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.A05, r4);
        snapshotIdSet$iterator$1.A04 = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r12 >= 64) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r10 < 64) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.1Hj r6 = X.1Hj.A02
            r7 = r17
            int r0 = r7.A02
            r5 = 0
            r15 = 1
            r10 = 2
            r4 = 64
            r13 = 0
            r11 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r11) goto L_0x0070
            if (r0 == r10) goto L_0x00ad
            int r10 = r7.A00
            java.lang.Object r3 = r7.A04
            X.4qd r3 = (X.C275614qd) r3
            X.0eS.A00(r18)
        L_0x001e:
            int r10 = r10 + 1
            if (r10 >= r4) goto L_0x00c6
        L_0x0022:
            X.5P8 r11 = r7.A05
            long r0 = r11.A02
            long r8 = r15 << r10
            long r0 = r0 & r8
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
            int r2 = r10 + 64
            int r0 = r11.A00
            int r2 = r2 + r0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            r7.A04 = r3
            r7.A03 = r5
            r7.A00 = r10
            r0 = 3
            r7.A02 = r0
            X.1Hj r0 = r3.A02(r1, r7)
            if (r0 != r6) goto L_0x001e
            return r6
        L_0x0047:
            X.0eS.A00(r18)
            java.lang.Object r3 = r7.A04
            X.4qd r3 = (X.C275614qd) r3
            X.5P8 r0 = r7.A05
            int[] r9 = r0.A03
            if (r9 == 0) goto L_0x0082
            int r8 = r9.length
            r2 = 0
        L_0x0056:
            if (r2 >= r8) goto L_0x0082
            r1 = r9[r2]
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A04 = r3
            r7.A03 = r9
            r7.A00 = r2
            r7.A01 = r8
            r7.A02 = r11
            X.1Hj r0 = r3.A02(r0, r7)
            if (r0 != r6) goto L_0x007f
            return r6
        L_0x0070:
            int r8 = r7.A01
            int r2 = r7.A00
            java.lang.Object r9 = r7.A03
            int[] r9 = (int[]) r9
            java.lang.Object r3 = r7.A04
            X.4qd r3 = (X.C275614qd) r3
            X.0eS.A00(r18)
        L_0x007f:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0082:
            X.5P8 r0 = r7.A05
            long r0 = r0.A01
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00bb
            r12 = 0
        L_0x008b:
            X.5P8 r11 = r7.A05
            long r1 = r11.A01
            long r8 = r15 << r12
            long r1 = r1 & r8
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            int r1 = r11.A00
            int r1 = r1 + r12
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A04 = r3
            r7.A03 = r5
            r7.A00 = r12
            r7.A02 = r10
            X.1Hj r0 = r3.A02(r0, r7)
            if (r0 != r6) goto L_0x00b6
            return r6
        L_0x00ad:
            int r12 = r7.A00
            java.lang.Object r3 = r7.A04
            X.4qd r3 = (X.C275614qd) r3
            X.0eS.A00(r18)
        L_0x00b6:
            int r12 = r12 + 1
            if (r12 >= r4) goto L_0x00bb
            goto L_0x008b
        L_0x00bb:
            X.5P8 r0 = r7.A05
            long r1 = r0.A02
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00c6
            r10 = 0
            goto L_0x0022
        L_0x00c6:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnapshotIdSet$iterator$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
