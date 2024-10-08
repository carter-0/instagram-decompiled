package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6IM  reason: invalid class name */
public final class AnonymousClass6IM implements C268004cb, AnonymousClass6IL {
    public final /* synthetic */ AnonymousClass6IJ A00;
    public final /* synthetic */ AnonymousClass6IK A01;

    public final boolean CWf() {
        return this.A01.CWf();
    }

    public final C289145d6 Cfi(Map map, 0sP r3, int i, int i2) {
        return this.A01.Cfi(map, r3, i, i2);
    }

    public AnonymousClass6IM(AnonymousClass6IJ r2) {
        this.A00 = r2;
        this.A01 = r2.A08;
    }

    public final float AwL() {
        return this.A01.A00;
    }

    public final float B77() {
        return this.A01.A01;
    }

    public final int EJS(float f) {
        return C289055cw.A01(this.A01, f);
    }

    public final List Eyi(Object obj, 0sL r9) {
        AnonymousClass6IJ r6 = this.A00;
        AnonymousClass5R6 r0 = (AnonymousClass5R6) r6.A0C.get(obj);
        if (r0 != null) {
            return r0.A0U.A0J.A0K();
        }
        C285045Pl r2 = r6.A06;
        int i = r2.A00;
        int i2 = r6.A01;
        if (i >= i2) {
            if (i == i2) {
                r2.A09(obj);
            } else {
                r2.A02[i2] = obj;
            }
            r6.A01++;
            HashMap hashMap = r6.A0B;
            if (!hashMap.containsKey(obj)) {
                r6.A0D.put(obj, r6.A04(obj, r9));
                AnonymousClass5R6 r22 = r6.A09;
                if (r22.A0U.A06 == AnonymousClass05K.A0C) {
                    r22.A0X(true);
                } else {
                    r22.A0Z(true, true, true);
                }
            }
            AnonymousClass5R6 r02 = (AnonymousClass5R6) hashMap.get(obj);
            if (r02 == null) {
                return 0sn.A00;
            }
            List A0K = r02.A0U.A0J.A0K();
            int size = A0K.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AnonymousClass5SJ) A0K.get(i3)).A0S.A09 = true;
            }
            return A0K;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
    }

    public final float Ezu(long j) {
        return C291905i4.A00(this.A01, j);
    }

    public final float Ezv(float f) {
        return f / this.A01.A00;
    }

    public final float Ezw(int i) {
        return ((float) i) / this.A01.A00;
    }

    public final long Ezx(long j) {
        return C289055cw.A03(this.A01, j);
    }

    public final float F05(long j) {
        return C289055cw.A00(this.A01, j);
    }

    public final float F06(float f) {
        return f * this.A01.A00;
    }

    public final long FH8(long j) {
        return C289055cw.A04(this.A01, j);
    }

    public final long FH9(float f) {
        return C291905i4.A01(this.A01, f);
    }

    public final long FHA(float f) {
        AnonymousClass6IK r1 = this.A01;
        return r1.FH9(r1.Ezv(f));
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return this.A01.A02;
    }
}
