package X;

import android.view.View;
import com.meta.compose.material.bottomsheet.AnchoredDraggableState;

public final class IG9 implements AnonymousClass5WO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IG9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDF, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object DYV(X.AnonymousClass4D7 r6, long r7, long r9) {
        /*
            r5 = this;
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0052
            r3 = 2
            boolean r0 = r6 instanceof X.MDF
            if (r0 == 0) goto L_0x0047
            r4 = r6
            X.MDF r4 = (X.MDF) r4
            int r0 = r4.A03
            if (r0 != r3) goto L_0x0047
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x004d
            long r9 = r4.A01
            X.0eS.A00(r1)
        L_0x002b:
            X.GQ9 r2 = new X.GQ9
            r2.<init>(r9)
            return r2
        L_0x0031:
            X.0eS.A00(r1)
            java.lang.Object r1 = r5.A02
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r1
            float r0 = X.C51972G9s.A00(r9)
            r4.A01 = r9
            r4.A00 = r3
            java.lang.Object r0 = r1.A07(r4, r0)
            if (r0 != r2) goto L_0x002b
            return r2
        L_0x0047:
            X.MDF r4 = new X.MDF
            r4.<init>(r5, r6, r3)
            goto L_0x001b
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0052:
            X.GQ9 r2 = X.GQ9.A04()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IG9.DYV(X.4D7, long, long):java.lang.Object");
    }

    public final /* synthetic */ long DYX(long j, long j2, int i) {
        if (this.A00 == 0 || i != 1) {
            return 0;
        }
        AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.A02;
        Object obj = this.A01;
        float A04 = anchoredDraggableState.A04(C289295dM.A02(j2));
        AnonymousClass5PZ r1 = anchoredDraggableState.A03;
        float A002 = C51976G9y.A00(r1);
        r1.EWt(A04);
        float f = A04 - A002;
        if (obj != AnonymousClass6Gj.Vertical) {
            f = 0.0f;
        }
        return C289325dP.A00(0.0f, f);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDF, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object DYa(X.AnonymousClass4D7 r8, long r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0079
            r3 = 3
            boolean r0 = r8 instanceof X.MDF
            if (r0 == 0) goto L_0x006e
            r4 = r8
            X.MDF r4 = (X.MDF) r4
            int r0 = r4.A03
            if (r0 != r3) goto L_0x006e
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r5) goto L_0x0074
            long r9 = r4.A01
            X.0eS.A00(r1)
        L_0x002b:
            X.GQ9 r3 = new X.GQ9
            r3.<init>(r9)
            return r3
        L_0x0031:
            X.0eS.A00(r1)
            float r2 = X.C51972G9s.A00(r9)
            java.lang.Object r1 = r7.A02
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r1
            float r6 = r1.A03()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            X.Htm r0 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A01(r1)
            java.util.Map r0 = r0.A00
            java.util.Collection r0 = r0.values()
            java.lang.Float r0 = X.00k.A08(r0)
            if (r0 == 0) goto L_0x0068
            float r0 = r0.floatValue()
        L_0x0059:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            r4.A01 = r9
            r4.A00 = r5
            java.lang.Object r0 = r1.A07(r4, r2)
            if (r0 != r3) goto L_0x002b
            return r3
        L_0x0068:
            r0 = -4194304(0xffffffffffc00000, float:NaN)
            goto L_0x0059
        L_0x006b:
            r9 = 0
            goto L_0x002b
        L_0x006e:
            X.MDF r4 = new X.MDF
            r4.<init>(r7, r8, r3)
            goto L_0x001b
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0079:
            X.GQ9 r3 = X.GQ9.A04()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IG9.DYa(X.4D7, long):java.lang.Object");
    }

    public final long DYf(long j, int i) {
        C335417cv r1;
        if (this.A00 != 0) {
            Object obj = this.A01;
            float A022 = C289295dM.A02(j);
            if (A022 >= 0.0f || i != 1) {
                return 0;
            }
            AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.A02;
            float A04 = anchoredDraggableState.A04(A022);
            AnonymousClass5PZ r12 = anchoredDraggableState.A03;
            float A002 = C51976G9y.A00(r12);
            r12.EWt(A04);
            float f = A04 - A002;
            if (obj != AnonymousClass6Gj.Vertical) {
                f = 0.0f;
            }
            return C289325dP.A00(0.0f, f);
        }
        View view = (View) this.A01;
        if (view == null) {
            return 0;
        }
        GT9 gt9 = (GT9) this.A02;
        04k A003 = C586203k.A00(view);
        if (A003 == null || !A003.A00.A0I(8)) {
            return 0;
        }
        Object value = gt9.A04().A0V.getValue();
        if (!(value instanceof C335417cv) || (r1 = (C335417cv) value) == null || r1.A0D) {
            return 0;
        }
        DbS.A1D(gt9);
        return 0;
    }
}
