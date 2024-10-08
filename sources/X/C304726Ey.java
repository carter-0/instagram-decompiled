package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.6Ey  reason: invalid class name and case insensitive filesystem */
public final class C304726Ey implements C304736Ez {
    public final /* synthetic */ C304716Ex A00;
    public final /* synthetic */ LazyListState A01;

    public C304726Ey(C304716Ex r1, LazyListState lazyListState) {
        this.A01 = lazyListState;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        if (java.lang.Math.abs(r10) <= java.lang.Math.abs(r11)) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float AF8(float r20) {
        /*
            r19 = this;
            r1 = r19
            androidx.compose.foundation.lazy.LazyListState r6 = r1.A01
            X.6Gl r0 = r6.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            java.util.List r5 = r0.A0D
            X.6Ex r12 = r1.A00
            int r4 = r5.size()
            r11 = -8388608(0xffffffffff800000, float:-Infinity)
            r10 = 2139095040(0x7f800000, float:Infinity)
            r3 = 0
        L_0x0017:
            if (r3 >= r4) goto L_0x0086
            java.lang.Object r8 = r5.get(r3)
            X.6JM r8 = (X.AnonymousClass6JM) r8
            X.6Gl r0 = r6.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            X.6Gj r9 = r0.A0A
            X.6Gj r7 = X.AnonymousClass6Gj.Vertical
            X.5d6 r0 = r0.A0G
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            long r1 = X.C289155d7.A00(r1, r0)
            if (r9 != r7) goto L_0x0081
            int r13 = X.C289005cr.A00(r1)
        L_0x003d:
            X.6Gl r0 = r6.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            int r0 = r0.A08
            int r15 = -r0
            X.6Gl r0 = r6.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            int r7 = r0.A04
            X.6JK r8 = (X.AnonymousClass6JK) r8
            int r14 = r8.A09
            int r2 = r8.A02
            int r1 = r8.A07
            X.6Gl r0 = r6.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            int r0 = r0.A06
            r16 = r7
            r17 = r1
            r18 = r0
            int r0 = r12.E3C(r13, r14, r15, r16, r17, r18)
            float r0 = (float) r0
            float r2 = (float) r2
            float r2 = r2 - r0
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0075
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            r11 = r2
        L_0x0075:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            r10 = r2
        L_0x007e:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0081:
            r0 = 32
            long r1 = r1 >> r0
            int r13 = (int) r1
            goto L_0x003d
        L_0x0086:
            X.5Oz r0 = r6.A0I
            java.lang.Object r0 = r0.getValue()
            X.6Gk r0 = (X.C305076Gk) r0
            X.4cd r2 = r0.A0C
            float r1 = java.lang.Math.abs(r20)
            r0 = 1137180672(0x43c80000, float:400.0)
            float r0 = r2.F06(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c9
            r3 = 0
        L_0x009f:
            r1 = 0
            r0 = 0
            if (r3 != r1) goto L_0x00a4
            r0 = 1
        L_0x00a4:
            r2 = 0
            if (r0 == 0) goto L_0x00c1
            float r1 = java.lang.Math.abs(r10)
            float r0 = java.lang.Math.abs(r11)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00b4
        L_0x00b3:
            r11 = r10
        L_0x00b4:
            r0 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00c0
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
        L_0x00c0:
            return r2
        L_0x00c1:
            r0 = 1
            if (r3 == r0) goto L_0x00b3
            r0 = 2
            if (r3 == r0) goto L_0x00b4
            r11 = 0
        L_0x00c8:
            return r11
        L_0x00c9:
            r0 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d0
            r3 = 1
            goto L_0x009f
        L_0x00d0:
            r3 = 2
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304726Ey.AF8(float):float");
    }

    public final float AEt(float f, float f2) {
        float abs = Math.abs(f2);
        List<AnonymousClass6JM> list = ((C305076Gk) this.A01.A02()).A0D;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            for (AnonymousClass6JM r0 : list) {
                i += ((AnonymousClass6JK) r0).A09;
            }
            i /= size;
        }
        float f3 = abs - ((float) i);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return f3 * Math.signum(f2);
    }
}
