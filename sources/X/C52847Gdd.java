package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.Gdd  reason: case insensitive filesystem */
public final class C52847Gdd extends View {
    public C262204Co A00;
    public float A01 = 6.0f;
    public float A02 = 5.0f;
    public HLP A03 = HLP.GRAY;
    public HMK A04 = HMK.A06;
    public C262224Cq A05;
    public final Path A06 = C51965G9l.A0C();
    public final RectF A07 = AnonymousClass7TE.A0Y();
    public final PointF[] A08;
    public final C56554I1i[][] A09;
    public final Paint A0A;
    public final Paint A0B;
    public final List A0C = AnonymousClass7TE.A1C();
    public final List A0D;
    public final float[] A0E;
    public final int[] A0F;

    public C52847Gdd(Context context) {
        super(context, (AttributeSet) null);
        Paint A0V = AnonymousClass7TE.A0V(1);
        Paint.Style style = Paint.Style.FILL;
        A0V.setStyle(style);
        A0V.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.A0A = A0V;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        A0V2.setStyle(style);
        A0V2.setColor(-7829368);
        this.A0B = A0V2;
        C56554I1i[][] i1iArr = new C56554I1i[4][];
        for (int i = 0; i < 4; i++) {
            C56554I1i[] i1iArr2 = new C56554I1i[25];
            int i2 = 0;
            do {
                i1iArr2[i2] = new C56554I1i(HLO.CIRCLE, 6.0f, false);
                i2++;
            } while (i2 < 25);
            i1iArr[i] = i1iArr2;
        }
        this.A09 = i1iArr;
        this.A08 = new PointF[]{new PointF(0.2f, 1.0f), new PointF(0.4f, 0.75f), new PointF(0.6f, 0.5f), new PointF(0.8f, 0.25f), new PointF(1.0f, 0.0f)};
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        this.A05 = 19E.A02(AnonymousClass199.A02(AnonymousClass12y.A00, new AnonymousClass19G((C262204Co) null)));
        2HY A0C2 = C229632nm.A0C(0, 25);
        ArrayList A0p = AnonymousClass7TF.A0p(A0C2);
        0sh it = A0C2.iterator();
        while (it.hasNext()) {
            it.A00();
            A0p.add(HLO.CIRCLE);
        }
        ArrayList A0U = 00k.A0U(A0p);
        HLO hlo = HLO.STAR;
        A0U.set(2, hlo);
        A0U.set(9, hlo);
        A0U.set(14, hlo);
        A0U.set(16, hlo);
        ArrayList A0U2 = 00k.A0U(A0p);
        A0U2.set(5, hlo);
        A0U2.set(7, hlo);
        A0U2.set(12, hlo);
        A0U2.set(18, hlo);
        A0U2.set(23, hlo);
        ArrayList A0U3 = 00k.A0U(A0p);
        A0U3.set(0, hlo);
        A0U3.set(1, hlo);
        A0U3.set(3, hlo);
        A0U3.set(4, hlo);
        A0U3.set(6, hlo);
        A0U3.set(10, hlo);
        A0U3.set(11, hlo);
        A0U3.set(12, hlo);
        A0U3.set(13, hlo);
        A0U3.set(15, hlo);
        A0U3.set(16, hlo);
        A0U3.set(17, hlo);
        A0U3.set(19, hlo);
        A0U3.set(20, hlo);
        A0U3.set(22, hlo);
        this.A0D = 0sr.A1P(new List[]{A0p, A0U, A0U2, A0U3});
        this.A0F = new int[]{Color.parseColor("#FF74D7"), Color.parseColor("#015CF3"), Color.parseColor("#1D5FF0"), Color.parseColor("#08F2E0")};
        this.A0E = new float[]{0.0f, 0.24f, 0.73f, 1.0f};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r4 > r15) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.graphics.PointF r12, X.C52847Gdd r13, int r14, int r15, boolean r16) {
        /*
            r6 = 0
            r1 = 3
            X.2HY r0 = new X.2HY
            r0.<init>(r6, r1)
            java.util.Iterator r11 = r0.iterator()
        L_0x000b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0079
            r0 = r11
            X.0sh r0 = (X.0sh) r0
            int r5 = r0.A00()
            r0 = 25
            X.2HY r0 = X.C229632nm.A0C(r6, r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0022:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x000b
            r0 = r10
            X.0sh r0 = (X.0sh) r0
            int r4 = r0.A00()
            X.I1i[][] r9 = r13.A09
            r0 = r9[r5]
            r8 = r0[r4]
            if (r14 > r4) goto L_0x003a
            r2 = 1
            if (r4 <= r15) goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            boolean r0 = r8.A02
            if (r2 != r0) goto L_0x0069
            float r3 = r8.A00
        L_0x0041:
            if (r2 == 0) goto L_0x0061
            java.util.List r0 = r13.A0D
            java.lang.Object r0 = r0.get(r5)
            java.lang.Object r7 = X.C51966G9m.A19(r0, r4)
            X.HLO r7 = (X.HLO) r7
        L_0x004f:
            r1 = r9[r5]
            if (r16 != 0) goto L_0x0055
            boolean r2 = r8.A02
        L_0x0055:
            r0 = 1
            X.0qQ.A0B(r7, r0)
            X.I1i r0 = new X.I1i
            r0.<init>(r7, r3, r2)
            r1[r4] = r0
            goto L_0x0022
        L_0x0061:
            if (r16 == 0) goto L_0x0066
            X.HLO r7 = X.HLO.CIRCLE
            goto L_0x004f
        L_0x0066:
            X.HLO r7 = r8.A01
            goto L_0x004f
        L_0x0069:
            float r3 = r13.A01
            float r1 = (float) r5
            float r0 = r13.A02
            float r1 = r1 * r0
            if (r2 == 0) goto L_0x0076
            float r0 = r12.x
        L_0x0073:
            float r1 = r1 * r0
            float r3 = r3 + r1
            goto L_0x0041
        L_0x0076:
            float r0 = r12.y
            goto L_0x0073
        L_0x0079:
            r13.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52847Gdd.A01(android.graphics.PointF, X.Gdd, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r0.isActive() != r2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        X.C51970G9q.A1S(r13.A00);
        r0 = A00(r13.A04);
        r4 = X.C51970G9q.A0B(r0);
        r3 = X.C51969G9p.A0A(r0);
        r1 = r13.A08;
        X.0qQ.A0B(r1, 0);
        r0 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r0 != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        throw new java.util.NoSuchElementException("Array is empty.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r6 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        A01(r1[r0 - 1], r13, r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r6 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r13.A03 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r13.A04 = r15;
        r13.A03 = r14;
        r0 = A00(r15);
        r9 = X.C51970G9q.A0B(r0);
        r10 = X.C51969G9p.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r18 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r13.A00 = X.C51966G9m.A1L(new com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1(r7, (X.AnonymousClass4D7) null, r9, r10, r16), r13.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        r1 = r13.A08;
        X.0qQ.A0B(r1, 0);
        r0 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r0 != 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        throw new java.util.NoSuchElementException("Array is empty.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        A01(r1[r0 - 1], r13, r9, r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r13.A03 == r14) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r13.A03 != r14) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r0 = r13.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.HLP r14, X.HMK r15, long r16, boolean r18) {
        /*
            r13 = this;
            r5 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r5, r15, r14)
            r7 = r13
            X.HMK r0 = r13.A04
            r1 = 1
            if (r0 != r15) goto L_0x0011
            r1 = 0
            X.HLP r0 = r13.A03
            r6 = 1
            if (r0 != r14) goto L_0x0014
        L_0x0011:
            r6 = 0
            if (r1 != 0) goto L_0x0019
        L_0x0014:
            X.HLP r0 = r13.A03
            if (r0 != r14) goto L_0x0019
            return
        L_0x0019:
            X.4Co r0 = r13.A00
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.isActive()
            if (r0 != r2) goto L_0x0046
        L_0x0023:
            X.4Co r0 = r13.A00
            X.C51970G9q.A1S(r0)
            X.HMK r0 = r13.A04
            X.0eP r0 = A00(r0)
            int r4 = X.C51970G9q.A0B(r0)
            int r3 = X.C51969G9p.A0A(r0)
            android.graphics.PointF[] r1 = r13.A08
            X.0qQ.A0B(r1, r5)
            int r0 = r1.length
            if (r0 != 0) goto L_0x0049
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0046:
            if (r6 == 0) goto L_0x0055
            goto L_0x0023
        L_0x0049:
            int r0 = r0 + -1
            r0 = r1[r0]
            A01(r0, r13, r4, r3, r2)
            if (r6 == 0) goto L_0x0055
            r13.A03 = r14
            return
        L_0x0055:
            r13.A04 = r15
            r13.A03 = r14
            X.0eP r0 = A00(r15)
            int r9 = X.C51970G9q.A0B(r0)
            int r10 = X.C51969G9p.A0A(r0)
            if (r18 == 0) goto L_0x0078
            X.4Cq r0 = r13.A05
            r8 = 0
            com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1 r6 = new com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            X.1Er r0 = X.C51966G9m.A1L(r6, r0)
            r13.A00 = r0
            return
        L_0x0078:
            android.graphics.PointF[] r1 = r13.A08
            X.0qQ.A0B(r1, r5)
            int r0 = r1.length
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0088:
            int r0 = r0 + -1
            r0 = r1[r0]
            A01(r0, r13, r9, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52847Gdd.A02(X.HLP, X.HMK, long, boolean):void");
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        super.onDraw(canvas2);
        int i = 0;
        for (Object next : this.A0C) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            List list = (List) next;
            if (this.A03 == HLP.GRAY) {
                paint = this.A0B;
            } else {
                paint = this.A0A;
            }
            C56554I1i[] i1iArr = this.A09[i];
            int length = i1iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                C56554I1i i1i = i1iArr[i3];
                int i5 = i4 + 1;
                PointF pointF = (PointF) list.get(i4);
                float f = i1i.A00;
                float f2 = pointF.x - f;
                float f3 = pointF.y - f;
                if (i1i.A01 == HLO.CIRCLE) {
                    canvas2.drawCircle(f2 + f, f3 + f, f, paint);
                } else {
                    RectF rectF = this.A07;
                    float f4 = 2.0f * f;
                    rectF.set(f2, f3, f2 + f4, f4 + f3);
                    float width = rectF.width() / 8.0f;
                    float width2 = rectF.width() / 6.0f;
                    Path path = this.A06;
                    path.reset();
                    float f5 = rectF.left;
                    float f6 = width / 2.0f;
                    float centerY = rectF.centerY() - f6;
                    Path path2 = path;
                    path2.arcTo(f5, centerY, f5 + width, centerY + width, 180.0f, 45.0f, false);
                    float f7 = 2.0f * width2;
                    path.lineTo(rectF.left + f7, rectF.top + f7);
                    float centerX = rectF.centerX() - f6;
                    path.lineTo(centerX, rectF.top + f6);
                    float f8 = rectF.top;
                    float f9 = centerX + width;
                    float f10 = f8 + width;
                    float f11 = centerX;
                    float f12 = f8;
                    path2.arcTo(f11, f12, f9, f10, 225.0f, 45.0f, false);
                    path2.arcTo(f11, f12, f9, f10, 270.0f, 45.0f, false);
                    path.lineTo(rectF.centerX() + width2, rectF.top + f7);
                    float f13 = width / 1.8f;
                    float centerY2 = rectF.centerY() - f13;
                    path.lineTo(rectF.right - f6, centerY2);
                    float f14 = rectF.right - width;
                    float f15 = f14 + width;
                    float f16 = centerY2 + width;
                    float f17 = f14;
                    float f18 = centerY2;
                    path2.arcTo(f17, f18, f15, f16, 315.0f, 45.0f, false);
                    path2.arcTo(f17, f18, f15, f16, 0.0f, 45.0f, false);
                    path.lineTo(rectF.centerX() + width2, rectF.bottom - f7);
                    path.lineTo(rectF.centerX() + f6, rectF.bottom - f6);
                    float centerX2 = rectF.centerX() - f6;
                    float f19 = rectF.bottom - width;
                    float f20 = centerX2 + width;
                    float f21 = f19 + width;
                    path.arcTo(centerX2, f19, f20, f21, 45.0f, 45.0f, false);
                    path.arcTo(centerX2, f19, f20, f21, 90.0f, 45.0f, false);
                    path.lineTo(rectF.centerX() - width2, rectF.bottom - f7);
                    path.lineTo(rectF.left + f6, rectF.centerY() + f6);
                    float f22 = rectF.left;
                    float centerY3 = rectF.centerY() - f13;
                    path2.arcTo(f22, centerY3, f22 + width, centerY3 + width, 135.0f, 45.0f, false);
                    canvas2.drawPath(path, paint);
                }
                i3++;
                i4 = i5;
            }
            i = i2;
        }
    }

    public static final 0eP A00(HMK hmk) {
        int i = 6;
        int i2 = 24;
        switch (hmk.ordinal()) {
            case 0:
                i = 12;
                break;
            case 1:
                i = 0;
                break;
            case 2:
                i = 0;
                break;
            case 3:
                i = -1;
                i2 = -1;
                break;
            case 4:
                i = 0;
                i2 = 6;
                break;
            case 5:
                break;
            case 6:
                i = 13;
                i2 = 18;
                break;
            case 7:
                i = 19;
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        i2 = 12;
        return AnonymousClass7TF.A0x(Integer.valueOf(i), i2);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-167162208);
        super.onAttachedToWindow();
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        this.A05 = 19E.A02(AnonymousClass199.A02(AnonymousClass12y.A00, new AnonymousClass19G((C262204Co) null)));
        AnonymousClass0fD.A0D(1528476605, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(932230716);
        super.onDetachedFromWindow();
        19E.A05((CancellationException) null, this.A05);
        C262204Co r0 = this.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A00 = null;
        A02(HLP.GRADIENT, HMK.A06, 300, false);
        AnonymousClass0fD.A0D(1460868931, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-844558817);
        super.onSizeChanged(i, i2, i3, i4);
        this.A01 = (float) AnonymousClass1GB.A01(AnonymousClass7TE.A02(this) / 150.0f);
        this.A02 = (float) AnonymousClass1GB.A01(AnonymousClass7TE.A02(this) / 200.0f);
        float height = ((float) (getHeight() * 3)) / 4.0f;
        this.A0A.setShader(new LinearGradient(height, AnonymousClass7TE.A03(this) - height, AnonymousClass7TE.A02(this) - height, height, this.A0F, this.A0E, Shader.TileMode.CLAMP));
        float A032 = AnonymousClass7TE.A03(this) / 2.5f;
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        List list = this.A0C;
        list.clear();
        float A022 = AnonymousClass7TE.A02(this) / 25.0f;
        0sh it = new 2HY(1, 4).iterator();
        while (it.hasNext()) {
            int A002 = it.A00();
            0sh it2 = new 2HY(0, 7).iterator();
            while (it2.hasNext()) {
                fArr[it2.A00()] = A032 - (((float) (A002 - 1)) * A022);
            }
            float f = ((float) A002) * A022;
            RectF rectF = new RectF(f, f, AnonymousClass7TE.A02(this) - f, AnonymousClass7TE.A03(this) - f);
            Path A0C2 = C51965G9l.A0C();
            A0C2.addRoundRect(rectF, fArr, Path.Direction.CW);
            boolean A1P = AnonymousClass7TF.A1P(A002 % 2);
            PointF[] pointFArr = new PointF[25];
            PathMeasure pathMeasure = new PathMeasure(A0C2, false);
            PathMeasure pathMeasure2 = new PathMeasure(A0C2, false);
            RectF A0Y = AnonymousClass7TE.A0Y();
            A0C2.computeBounds(A0Y, false);
            float length = pathMeasure2.getLength() / 25.0f;
            float centerX = A0Y.centerX();
            if (!A1P) {
                centerX += length / 2.0f;
            }
            PointF pointF = new PointF(centerX, A0Y.top);
            float[] fArr2 = {0.0f, 0.0f};
            float f2 = 0.0f;
            while (pointF.x > fArr2[0]) {
                pathMeasure2.getPosTan(f2, fArr2, (float[]) null);
                f2 += 1.0f;
            }
            float length2 = pathMeasure.getLength();
            float f3 = length2 / 25.0f;
            float[] fArr3 = {0.0f, 0.0f};
            int i5 = 0;
            do {
                pathMeasure.getPosTan(f2, fArr3, (float[]) null);
                pointFArr[i5] = new PointF(fArr3[0], fArr3[1]);
                i5++;
                f2 = (f2 + f3) % length2;
            } while (i5 < 25);
            list.add(03t.A0I(pointFArr));
        }
        AnonymousClass0fD.A0D(-1165878723, A062);
    }
}
