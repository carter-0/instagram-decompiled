package androidx.compose.foundation.gestures.snapping;

import X.0qQ;
import X.AnonymousClass4D7;
import X.AnonymousClass5PV;
import X.AnonymousClass5b9;
import X.AnonymousClass6F1;
import X.AnonymousClass6H1;
import X.AnonymousClass6HR;
import X.C304736Ez;
import X.C45167CrU;
import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Please use the snapFlingBehavior function", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.gestures.snapping.snapFlingBehavior", imports = {}))
public final class SnapFlingBehavior implements AnonymousClass6F1 {
    public AnonymousClass5PV A00 = ScrollableKt.A02;
    public final AnonymousClass5b9 A01;
    public final AnonymousClass6HR A02;
    public final C304736Ez A03;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6H1 r6, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7, X.AnonymousClass4D7 r8, X.0sP r9, float r10) {
        /*
            r3 = 2
            boolean r0 = X.AnonymousClass9JX.A00(r3, r8)
            if (r0 == 0) goto L_0x0047
            r4 = r8
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r1) goto L_0x004d
            java.lang.Object r9 = r4.A01
            X.0sP r9 = (X.0sP) r9
            X.0eS.A00(r0)
        L_0x0027:
            r2 = 0
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r9.invoke(r1)
            return r0
        L_0x0031:
            X.0eS.A00(r0)
            X.5PV r0 = r7.A00
            r8 = 0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r5 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r0 = X.1Eo.A00(r4, r0, r5)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x0047:
            X.9JX r4 = new X.9JX
            r4.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x004d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A00(X.6H1, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.4D7, X.0sP, float):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass6H1 r8, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r9, X.AnonymousClass4D7 r10, X.0sP r11, float r12, float r13) {
        /*
            r3 = 5
            boolean r0 = X.MEC.A03(r3, r10)
            if (r0 == 0) goto L_0x006e
            r7 = r10
            X.MEC r7 = (X.MEC) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r7.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 != r1) goto L_0x0076
            X.0eS.A00(r3)
        L_0x0023:
            X.Hjv r3 = (X.C55575Hjv) r3
            X.5b5 r2 = r3.A00
            return r2
        L_0x0028:
            X.0eS.A00(r3)
            float r4 = java.lang.Math.abs(r12)
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            float r0 = java.lang.Math.abs(r13)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            r7.A00 = r1
            X.6HR r1 = r9.A02
            float r0 = X.C54734HQp.A00(r1, r3, r13)
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0066
            X.IEm r3 = new X.IEm
            r3.<init>(r1)
        L_0x0051:
            X.JNQ r3 = (X.JNQ) r3
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r12)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r13)
            r4 = r8
            r8 = r11
            java.lang.Object r3 = r3.ACE(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L_0x0023
            return r2
        L_0x0066:
            X.5b9 r0 = r9.A01
            X.IEn r3 = new X.IEn
            r3.<init>(r0)
            goto L_0x0051
        L_0x006e:
            r0 = 42
            X.MEC r7 = new X.MEC
            r7.<init>(r9, r10, r3, r0)
            goto L_0x0015
        L_0x0076:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x007e:
            X.5b5 r2 = X.GQU.A00(r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A01(X.6H1, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.4D7, X.0sP, float, float):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E2X(X.AnonymousClass6H1 r6, X.AnonymousClass4D7 r7, X.0sP r8, float r9) {
        /*
            r5 = this;
            r3 = 0
            boolean r0 = X.AnonymousClass9JU.A00(r3, r7)
            if (r0 == 0) goto L_0x0050
            r4 = r7
            X.9JU r4 = (X.AnonymousClass9JU) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 != r0) goto L_0x0058
            X.0eS.A00(r3)
        L_0x0023:
            X.Hjv r3 = (X.C55575Hjv) r3
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            X.5b5 r2 = r3.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r2.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
        L_0x003e:
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            return r2
        L_0x0044:
            X.0eS.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = A00(r6, r5, r4, r8, r9)
            if (r3 != r2) goto L_0x0023
            return r2
        L_0x0050:
            r0 = 42
            X.9JU r4 = new X.9JU
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0015
        L_0x0058:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.E2X(X.6H1, X.4D7, X.0sP, float):java.lang.Object");
    }

    public final /* synthetic */ Object E2W(AnonymousClass6H1 r2, AnonymousClass4D7 r3, float f) {
        return E2X(r2, r3, C45167CrU.A00, f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!0qQ.A0K(snapFlingBehavior.A01, this.A01) || !0qQ.A0K(snapFlingBehavior.A02, this.A02) || !0qQ.A0K(snapFlingBehavior.A03, this.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public SnapFlingBehavior(AnonymousClass5b9 r2, AnonymousClass6HR r3, C304736Ez r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
