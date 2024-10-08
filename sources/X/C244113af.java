package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.3af  reason: invalid class name and case insensitive filesystem */
public abstract class C244113af {
    public C251253mo A00;
    public final 2V1 A01;
    public final AnonymousClass2V4 A02;

    public static void A00(BitSet bitSet, String[] strArr, int i) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException(002.A0R(AnonymousClass000.A00(1036), Arrays.toString(arrayList.toArray())));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.floatValue() > 0.0f) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            boolean r0 = X.2Sa.isZeroAlphaLoggingEnabled
            if (r0 == 0) goto L_0x0041
            X.3mo r0 = r4.A00
            X.2TC r0 = r0.A00
            if (r0 == 0) goto L_0x0041
            X.2TG r3 = r0.A06
            if (r3 == 0) goto L_0x0041
            float r0 = r3.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0021
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            X.2Sg r0 = r3.A0I
            if (r0 != 0) goto L_0x0033
            X.2Sg r0 = r3.A0M
            if (r0 != 0) goto L_0x0033
            X.2Sg r0 = r3.A0X
            if (r0 != 0) goto L_0x0033
            X.2Sg r0 = r3.A0L
            if (r0 != 0) goto L_0x0033
            r2 = 0
        L_0x0033:
            if (r1 == 0) goto L_0x0041
            if (r2 == 0) goto L_0x0041
            X.2SO r1 = X.2SO.A06
            X.Ik9 r0 = new X.Ik9
            r0.<init>(r4)
            X.RVZ.A00(r1, r0)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244113af.A02():void");
    }

    public final void A03() {
        this.A00.A0Z().A0D(100.0f);
    }

    public final void A04(Drawable drawable) {
        this.A00.A0Z().A0M(drawable);
    }

    public final void A05(AnonymousClass2VW r2) {
        this.A00.A01 = r2;
    }

    public final void A06(C243533Zd r4) {
        C243593Zj A012 = 2TC.A01(this.A00.A0Z());
        A012.A02 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        A012.A0E = r4;
    }

    public final void A07(C244143ai r2, int i) {
        this.A00.A0Z().A0U(r2, i);
    }

    public final void A08(C244413b9 r2) {
        this.A00.A0Z().A0W(r2);
    }

    public final void A09(String str) {
        C251253mo r3 = this.A00;
        2TC A0Z = r3.A0Z();
        String str2 = r3.A01;
        C243593Zj A012 = 2TC.A01(A0Z);
        A012.A02 |= 512;
        A012.A0F = str;
        A012.A0G = str2;
        C243593Zj r0 = r3.A0Z().A05;
        if (r0 == null || r0.A0E == null) {
            A06(2Vi.A04);
        }
    }

    public C244113af(C251263mp r3, 2V1 r4, int i) {
        r4.getClass();
        this.A02 = r4.A0D;
        C251253mo r1 = (C251253mo) r3;
        this.A00 = r1;
        this.A01 = r4;
        if (r4.A01 != null) {
            r1.A01 = r4.A08();
        }
        if (i != 0) {
            C251253mo r12 = this.A00;
            r12.A0Z().A00 = i;
            try {
                r4.A00 = i;
                r12.A0n(r4);
                r4.A00 = 0;
            } catch (Exception e) {
                2Vb.A01(r3, r4, e);
            }
        }
        Context context = r4.A0C;
        this.A00.A02 = C251263mp.A02(context);
    }
}
