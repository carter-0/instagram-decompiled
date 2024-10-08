package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Spannable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ukq  reason: case insensitive filesystem */
public final class C15926Ukq extends C15927Ukr {
    public int A00;
    public int A01 = 144;
    public final Integer A02 = AnonymousClass05K.A01;
    public final C360728f3 A03 = C360728f3.JUMP;
    public final List A04 = 0sr.A1P(new PointF[]{new PointF(0.0f, 271.93234f), new PointF(0.36f, -68.81766f), new PointF(0.52f, -22.84913f), new PointF(0.68f, -24.24998f), new PointF(0.8f, 0.15086931f), new PointF(0.92f, -4.8491306f), new PointF(1.0f, 0.0f)});
    public final List A05 = 0sr.A1P(new PointF[]{new PointF(0.0f, 0.0f), new PointF(0.25f, 12.0f), new PointF(0.6666667f, -48.305f), new PointF(1.0f, 271.93234f)});
    public final List A06 = AnonymousClass7TE.A1I(new LinearInterpolator());
    public final List A07 = 0sr.A1P(new Interpolator[]{new PathInterpolator(0.16666667f, 0.16666667f, 0.0f, 1.0f), new PathInterpolator(1.0f, 0.0f, 0.8333333f, 0.8333333f), new LinearInterpolator(), new PathInterpolator(0.16666667f, 0.16666667f, 0.8333333f, 1.0f), new PathInterpolator(0.16666667f, 0.0f, 0.8333333f, 0.8333333f)});
    public final List A08 = 0sr.A1P(new Interpolator[]{new PathInterpolator(0.16666667f, 0.16666667f, 0.0f, 1.0f), new PathInterpolator(0.6321822f, 0.0f, 0.8333333f, 0.8333333f), new PathInterpolator(0.16666667f, 0.16666667f, 0.5179956f, 7.044134f), new PathInterpolator(0.5739865f, 0.09556677f, 0.8333333f, 0.8333333f), new PathInterpolator(0.16666667f, 0.16666667f, 0.6882737f, 1.0f), new PathInterpolator(0.33893362f, 0.0f, 0.8333333f, 0.8333333f)});
    public final List A09 = 0sr.A1P(new PointF[]{new PointF(0.0f, 0.0f), new PointF(0.08f, 1.0f)});
    public final List A0A = 0sr.A1P(new PointF[]{new PointF(0.0f, 0.0f), new PointF(0.36f, -15.0f), new PointF(0.52f, -13.0f), new PointF(0.8f, 3.0f), new PointF(0.92f, -1.0f), new PointF(1.0f, 0.0f)});
    public final List A0B = new ArrayList();
    public final List A0C = AnonymousClass7TE.A1I(new LinearInterpolator());
    public final List A0D = 0sr.A1P(new Interpolator[]{new PathInterpolator(0.33333334f, 0.0f, 0.6666667f, 1.0f), new PathInterpolator(0.33333334f, 0.0f, 0.5207011f, 1.0f), new PathInterpolator(0.6054595f, 0.0f, 0.8333333f, 0.8333333f)});
    public final List A0E = 0sr.A1P(new PointF[]{new PointF(0.8f, 1.0f), new PointF(0.90000004f, 0.0f)});
    public final List A0F = new ArrayList();

    public static final VVY A03(C15926Ukq ukq, float f) {
        Float f2;
        Float f3;
        boolean z = false;
        if (AnonymousClass7TF.A1Q((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)))) {
            return new VVY((ukq.A0b.getTextSize() / 100.0f) * 271.93234f, 0.0f, 0.0f);
        }
        List list = ukq.A0D;
        int size = list.size();
        int i = 0;
        while (true) {
            f2 = null;
            if (i >= size) {
                f3 = null;
                break;
            }
            List list2 = ukq.A0F;
            int i2 = i + 1;
            if (f < C15927Ukr.A05(list2, i2)) {
                f3 = Float.valueOf(A00((PointF) list2.get(i), (PointF) list2.get(i2), (Interpolator) list.get(i), C229632nm.A01(C15927Ukr.A04(list2, f, i, i2)), AnonymousClass7TF.A1S(i, 1)));
                break;
            }
            i = i2;
        }
        List list3 = ukq.A0C;
        int size2 = list3.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            List list4 = ukq.A0E;
            int i4 = i3 + 1;
            if (f < C15927Ukr.A05(list4, i4)) {
                Interpolator interpolator = (Interpolator) list3.get(i3);
                float A012 = C229632nm.A01(C15927Ukr.A04(list4, f, i3, i4));
                PointF pointF = (PointF) list4.get(i3);
                PointF pointF2 = (PointF) list4.get(i4);
                if (i3 == 0) {
                    z = true;
                }
                f2 = Float.valueOf(A00(pointF, pointF2, interpolator, A012, z));
            } else {
                i3 = i4;
            }
        }
        return new VVY(C13989Tnp.A05(f3), 0.0f, C13989Tnp.A05(f2));
    }

    public static final float A00(PointF pointF, PointF pointF2, Interpolator interpolator, float f, boolean z) {
        float f2 = pointF.y;
        float interpolation = interpolator.getInterpolation(f) * AnonymousClass7TE.A00(pointF.y, pointF2.y);
        int i = 1;
        if (z) {
            i = -1;
        }
        return f2 + (interpolation * ((float) i));
    }

    public static final float A01(C15926Ukq ukq, int i, int i2, boolean z) {
        float f;
        float f2;
        if (z) {
            f = (float) (i - (ukq.A0W() - 500));
            f2 = 500.0f;
        } else {
            int i3 = i - (i2 * ukq.A01);
            if (i3 > 833) {
                i3 = 833;
            }
            f = (float) i3;
            f2 = 833.0f;
        }
        return C229632nm.A01(f / f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r10 == 4) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.VVY A02(X.C15926Ukq r13, float r14) {
        /*
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r9 = 0
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0013
            X.VVY r1 = new X.VVY
            r1.<init>(r5, r5, r6)
            return r1
        L_0x0013:
            java.util.List r4 = r13.A08
            int r3 = r4.size()
            r10 = 0
        L_0x001a:
            r12 = 0
            if (r10 >= r3) goto L_0x00e9
            java.util.List r2 = r13.A0B
            int r1 = r10 + 1
            float r0 = X.C15927Ukr.A05(r2, r1)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e6
            java.lang.Object r7 = r4.get(r10)
            android.view.animation.Interpolator r7 = (android.view.animation.Interpolator) r7
            float r0 = X.C15927Ukr.A04(r2, r14, r10, r1)
            float r4 = X.C229632nm.A02(r0, r5, r6)
            java.lang.Object r3 = r2.get(r10)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            java.lang.Object r2 = r2.get(r1)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            if (r10 == 0) goto L_0x004c
            r0 = 2
            if (r10 == r0) goto L_0x004c
            r1 = 4
            r0 = 0
            if (r10 != r1) goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            float r0 = A00(r3, r2, r7, r4, r0)
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
        L_0x0055:
            java.util.List r3 = r13.A07
            int r2 = r3.size()
            r7 = 0
        L_0x005c:
            if (r7 >= r2) goto L_0x00e4
            java.util.List r10 = r13.A0A
            int r1 = r7 + 1
            float r0 = X.C15927Ukr.A05(r10, r1)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e1
            java.lang.Object r4 = r3.get(r7)
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
            float r0 = X.C15927Ukr.A04(r10, r14, r7, r1)
            float r3 = X.C229632nm.A02(r0, r5, r6)
            java.lang.Object r2 = r10.get(r7)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            java.lang.Object r1 = r10.get(r1)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            if (r7 == 0) goto L_0x008a
            r0 = 3
            if (r7 == r0) goto L_0x008a
            r8 = 0
        L_0x008a:
            float r0 = A00(r2, r1, r4, r3, r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
        L_0x0092:
            java.util.List r7 = r13.A09
            int r2 = r7.size()
        L_0x0098:
            if (r9 >= r2) goto L_0x00c9
            int r1 = r9 + 1
            float r0 = X.C15927Ukr.A05(r7, r1)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00df
            java.util.List r0 = r13.A06
            java.lang.Object r4 = r0.get(r9)
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
            float r0 = X.C15927Ukr.A04(r7, r14, r9, r1)
            float r3 = X.C229632nm.A02(r0, r5, r6)
            java.lang.Object r2 = r7.get(r9)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            java.lang.Object r1 = r7.get(r1)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            r0 = 0
            float r0 = A00(r2, r1, r4, r3, r0)
            java.lang.Float r12 = java.lang.Float.valueOf(r0)
        L_0x00c9:
            float r0 = X.C13989Tnp.A05(r11)
            if (r8 == 0) goto L_0x00d3
            float r5 = r8.floatValue()
        L_0x00d3:
            if (r12 == 0) goto L_0x00d9
            float r6 = r12.floatValue()
        L_0x00d9:
            X.VVY r1 = new X.VVY
            r1.<init>(r0, r5, r6)
            return r1
        L_0x00df:
            r9 = r1
            goto L_0x0098
        L_0x00e1:
            r7 = r1
            goto L_0x005c
        L_0x00e4:
            r8 = r12
            goto L_0x0092
        L_0x00e6:
            r10 = r1
            goto L_0x001a
        L_0x00e9:
            r11 = r12
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15926Ukq.A02(X.Ukq, float):X.VVY");
    }

    public final float A0V() {
        return (this.A0b.getTextSize() / 100.0f) * 271.93234f;
    }

    public final C360728f3 A0X() {
        return this.A03;
    }

    public C15926Ukq(Context context, int i) {
        super(context, i);
    }

    public final void A0R() {
        super.A0R();
        Spannable spannable = this.A0F;
        if (spannable != null && spannable.length() != 0) {
            float textSize = this.A0b.getTextSize() / 100.0f;
            List list = this.A0B;
            list.clear();
            for (PointF pointF : this.A04) {
                list.add(new PointF(pointF.x, pointF.y * textSize));
            }
            List list2 = this.A0F;
            list2.clear();
            for (PointF pointF2 : this.A05) {
                list2.add(new PointF(pointF2.x, pointF2.y * textSize));
            }
            int i = this.A02 - 10;
            if (i < 1) {
                i = 1;
            }
            this.A01 = (104 / i) + 40;
        }
    }
}
