package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.ArrayList;

/* renamed from: X.7Ky  reason: invalid class name and case insensitive filesystem */
public final class C329977Ky {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final AnonymousClass7I8 A08;
    public final DirectThreadThemeInfo A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;

    public final Drawable A04() {
        C328047Df r2 = new C328047Df((C242553Us) null, 127);
        A01(r2, C328637Fo.NONE, this, 0.0f, 0.0f);
        new Object();
        return (Drawable) AnonymousClass762.A00(r2, true).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r4 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r4 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        r0 = r6.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C242553Us A05(android.content.Context r7, X.C328637Fo r8, boolean r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            r0 = 4
            X.0qQ.A0B(r8, r0)
            X.3Us r5 = new X.3Us
            r5.<init>()
            boolean r4 = X.0mk.A02(r7)
            r1 = 0
            if (r9 != 0) goto L_0x0058
            X.7Fo r0 = X.C328637Fo.GROUP_WITH_ABOVE
            if (r8 == r0) goto L_0x0048
            X.7Fo r0 = X.C328637Fo.GROUP_WITH_BOTH
            if (r8 == r0) goto L_0x0048
            float r3 = r6.A02
            r2 = r3
        L_0x001b:
            if (r10 != 0) goto L_0x0046
            X.7Fo r0 = X.C328637Fo.GROUP_WITH_BELOW
            if (r8 == r0) goto L_0x002c
            X.7Fo r0 = X.C328637Fo.GROUP_WITH_BOTH
            if (r8 == r0) goto L_0x002c
            float r1 = r6.A02
            r0 = r1
        L_0x0028:
            r5.A07(r3, r2, r1, r0)
            return r5
        L_0x002c:
            if (r11 == 0) goto L_0x003a
            if (r4 == 0) goto L_0x0037
            float r1 = r6.A01
        L_0x0032:
            if (r4 == 0) goto L_0x0040
        L_0x0034:
            float r0 = r6.A02
            goto L_0x0028
        L_0x0037:
            float r1 = r6.A02
            goto L_0x0032
        L_0x003a:
            if (r4 == 0) goto L_0x0043
            float r1 = r6.A02
        L_0x003e:
            if (r4 == 0) goto L_0x0034
        L_0x0040:
            float r0 = r6.A01
            goto L_0x0028
        L_0x0043:
            float r1 = r6.A01
            goto L_0x003e
        L_0x0046:
            r0 = 0
            goto L_0x0028
        L_0x0048:
            if (r11 == 0) goto L_0x0051
            if (r4 == 0) goto L_0x0053
        L_0x004c:
            float r3 = r6.A01
            float r2 = r6.A02
            goto L_0x001b
        L_0x0051:
            if (r4 == 0) goto L_0x004c
        L_0x0053:
            float r3 = r6.A02
            float r2 = r6.A01
            goto L_0x001b
        L_0x0058:
            r3 = 0
            r2 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329977Ky.A05(android.content.Context, X.7Fo, boolean, boolean, boolean):X.3Us");
    }

    public static final C242553Us A00(C328637Fo r3, C329977Ky r4, float f, float f2) {
        C242553Us r2 = new C242553Us();
        int ordinal = r3.ordinal();
        if (ordinal == 3) {
            r2.A07(f, f2, f, f2);
            return r2;
        } else if (ordinal == 1) {
            float f3 = r4.A02;
            r2.A07(f, f2, f3, f3);
            return r2;
        } else if (ordinal == 2) {
            float f4 = r4.A02;
            r2.A07(f4, f4, f, f2);
            return r2;
        } else if (ordinal == 0) {
            float f5 = r4.A02;
            r2.A07(f5, f5, f5, f5);
            return r2;
        } else {
            throw new RuntimeException();
        }
    }

    public static final boolean A02(Context context, C331277Qg r5, AnonymousClass5FV r6) {
        if (r6 == AnonymousClass5FV.GiftWrap) {
            int rgb = Color.rgb(151, 42, 92);
            Resources resources = context.getResources();
            0qQ.A07(resources);
            r5.A03(rgb, Color.rgb(232, 86, 86), (float) C18092VlM.A01(resources, 3.0f));
        } else if (r6 == AnonymousClass5FV.Fire) {
            r5.A01.getPaint().setAlpha(0);
            r5.A00.getPaint().setAlpha(0);
        } else if (r6 == null || !r6.A01) {
            return false;
        }
        return true;
    }

    public final int A03(boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2;
        if (z) {
            i = this.A0E;
            i2 = this.A0F;
        } else {
            i = this.A03;
            i2 = this.A04;
        }
        if (i2 != 0) {
            i = i2;
        }
        if (z2 || z3) {
            i = 0nH.A02(0.5f, i, this.A0G);
        }
        if (i != this.A03 || !z4 || !C61670oa.A07()) {
            return i;
        }
        return this.A07;
    }

    public C329977Ky(Context context, AnonymousClass7I8 r10, DirectThreadThemeInfo directThreadThemeInfo, int[] iArr, float f, float f2, float f3, int i, int i2, int i3, boolean z) {
        this.A09 = directThreadThemeInfo;
        this.A08 = r10;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        int i4 = i;
        this.A04 = i4;
        int i5 = i2;
        this.A05 = i5;
        this.A0B = iArr;
        this.A0G = i3;
        this.A0A = z;
        int A0F2 = 2Yu.A0F(context, R.attr.messageFromOthersGrayBackground);
        this.A03 = A0F2;
        this.A07 = 2Yu.A0F(context, R.attr.igds_color_generic_xma_background_color);
        this.A06 = 0nH.A07(i5, 0.4f);
        this.A0F = 0nH.A07(i4, 0.4f);
        this.A0E = 0nH.A07(A0F2, 0.4f);
        ArrayList arrayList = new ArrayList(r7);
        for (int A022 : iArr) {
            arrayList.add(Integer.valueOf(0nH.A02(0.5f, A022, this.A0G)));
        }
        this.A0C = 00k.A0x(arrayList);
        ArrayList arrayList2 = new ArrayList(r2);
        for (int A072 : this.A0B) {
            arrayList2.add(Integer.valueOf(0nH.A07(A072, 0.4f)));
        }
        this.A0D = 00k.A0x(arrayList2);
    }

    public static final void A01(C308496Um r2, C328637Fo r3, C329977Ky r4, float f, float f2) {
        int ordinal = r3.ordinal();
        if (ordinal == 3) {
            r2.A00(f, f2, f, f2);
        } else if (ordinal == 1) {
            float f3 = r4.A02;
            r2.A00(f, f2, f3, f3);
        } else if (ordinal == 2) {
            float f4 = r4.A02;
            r2.A00(f4, f4, f, f2);
        } else if (ordinal == 0) {
            float f5 = r4.A02;
            r2.A00(f5, f5, f5, f5);
        } else {
            throw new RuntimeException();
        }
    }
}
