package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import java.util.List;

public final class U1B extends Drawable {
    public int A00 = 255;
    public int A01 = 0;
    public Path A02;
    public Path A03;
    public Path A04;
    public Path A05;
    public PointF A06;
    public PointF A07;
    public PointF A08;
    public PointF A09;
    public RectF A0A;
    public C18764Vzz A0B;
    public C18764Vzz A0C;
    public C18764Vzz A0D;
    public C18659VwF A0E = new C18659VwF();
    public Integer A0F;
    public List A0G = null;
    public boolean A0H = false;
    public Path A0I;
    public Path A0J;
    public RectF A0K;
    public RectF A0L;
    public RectF A0M;
    public C18651Vw5 A0N = new C18651Vw5();
    public final Context A0O;
    public final Paint A0P = JTP.A0D();
    public final Path A0Q = new Path();

    public final RectF A09() {
        float A072 = A07(0.0f, 8);
        boolean z = true;
        float A073 = A07(A072, 1);
        float A074 = A07(A072, 3);
        float A075 = A07(A072, 0);
        float A076 = A07(A072, 2);
        if (this.A0D != null) {
            if (getLayoutDirection() != 1) {
                z = false;
            }
            float[] fArr = this.A0D.A03;
            float f = fArr[4];
            float f2 = fArr[5];
            if (I18nUtil.A00.A00(this.A0O)) {
                if (!Float.isNaN(f)) {
                    A075 = f;
                }
                if (!Float.isNaN(f2)) {
                    A076 = f2;
                }
                float f3 = A075;
                if (z) {
                    f3 = A076;
                    A076 = A075;
                }
                A075 = f3;
            } else {
                float f4 = f2;
                if (!z) {
                    f4 = f;
                    f = f2;
                }
                if (!Float.isNaN(f4)) {
                    A075 = f4;
                }
                if (!Float.isNaN(f)) {
                    A076 = f;
                }
            }
        }
        return new RectF(A075, A073, A076, A074);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private Shader A01() {
        List<C17178VLi> list = this.A0G;
        ComposeShader composeShader = null;
        if (list != null) {
            for (C17178VLi vLi : list) {
                Rect bounds = getBounds();
                0qQ.A0B(bounds, 0);
                C17614Vb6 vb6 = vLi.A00;
                if (vb6 != null) {
                    if (vb6.A04.intValue() == 0) {
                        LinearGradient linearGradient = new LinearGradient(vb6.A02 * ((float) bounds.width()), vb6.A03 * ((float) bounds.height()), vb6.A00 * ((float) bounds.width()), vb6.A01 * ((float) bounds.height()), vb6.A06, vb6.A05, Shader.TileMode.CLAMP);
                        if (composeShader == null) {
                            composeShader = linearGradient;
                        } else {
                            composeShader = new ComposeShader(linearGradient, composeShader, PorterDuff.Mode.SRC_OVER);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
        }
        return composeShader;
    }

    private void A02(int i) {
        DashPathEffect dashPathEffect;
        Integer num = this.A0F;
        if (num != null) {
            dashPathEffect = A00(num, (float) i);
        } else {
            dashPathEffect = null;
        }
        this.A0P.setPathEffect(dashPathEffect);
    }

    private void A03(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        if (i != 0) {
            if (this.A0I == null) {
                this.A0I = new Path();
            }
            Paint paint = this.A0P;
            paint.setColor(i);
            this.A0I.reset();
            this.A0I.moveTo(f, f2);
            this.A0I.lineTo(f3, f4);
            this.A0I.lineTo(f5, f6);
            this.A0I.lineTo(f7, f8);
            this.A0I.lineTo(f, f2);
            canvas.drawPath(this.A0I, paint);
        }
    }

    public static void A04(PointF pointF, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            float f = (float) d21;
            PointF pointF2 = pointF;
            pointF2.x = f;
            pointF2.y = (float) d22;
        }
    }

    public static void A05(U1B u1b) {
        float f;
        float f2;
        U1B u1b2 = u1b;
        if (u1b2.A0H) {
            u1b2.A0H = false;
            if (u1b2.A04 == null) {
                u1b2.A04 = new Path();
            }
            if (u1b2.A02 == null) {
                u1b2.A02 = new Path();
            }
            if (u1b2.A05 == null) {
                u1b2.A05 = new Path();
            }
            if (u1b2.A0J == null) {
                u1b2.A0J = new Path();
            }
            if (u1b2.A03 == null) {
                u1b2.A03 = new Path();
            }
            if (u1b2.A0K == null) {
                u1b2.A0K = new RectF();
            }
            if (u1b2.A0A == null) {
                u1b2.A0A = new RectF();
            }
            if (u1b2.A0L == null) {
                u1b2.A0L = new RectF();
            }
            if (u1b2.A0M == null) {
                u1b2.A0M = new RectF();
            }
            u1b2.A04.reset();
            u1b2.A02.reset();
            u1b2.A05.reset();
            u1b2.A0J.reset();
            u1b2.A03.reset();
            C13988Tno.A0v(u1b2.A0K, u1b2);
            C13988Tno.A0v(u1b2.A0A, u1b2);
            C13988Tno.A0v(u1b2.A0L, u1b2);
            C13988Tno.A0v(u1b2.A0M, u1b2);
            RectF A092 = u1b2.A09();
            int A082 = u1b2.A08(0);
            int A083 = u1b2.A08(1);
            int A084 = u1b2.A08(2);
            int A085 = u1b2.A08(3);
            int A086 = u1b2.A08(8);
            int A087 = u1b2.A08(9);
            int A088 = u1b2.A08(11);
            int A089 = u1b2.A08(10);
            if (u1b2.A06(9)) {
                A083 = A087;
                A085 = A087;
            }
            if (!u1b2.A06(10)) {
                A089 = A085;
            }
            if (!u1b2.A06(11)) {
                A088 = A083;
            }
            if (Color.alpha(A082) == 0 || Color.alpha(A088) == 0 || Color.alpha(A084) == 0 || Color.alpha(A089) == 0 || Color.alpha(A086) == 0) {
                f = 0.0f;
            } else {
                RectF rectF = u1b2.A0K;
                rectF.top += A092.top;
                rectF.bottom -= A092.bottom;
                rectF.left += A092.left;
                rectF.right -= A092.right;
                f = 0.8f;
            }
            RectF rectF2 = u1b2.A0M;
            rectF2.top += A092.top * 0.5f;
            rectF2.bottom -= A092.bottom * 0.5f;
            rectF2.left += A092.left * 0.5f;
            rectF2.right -= A092.right * 0.5f;
            C18651Vw5 A002 = u1b2.A0E.A00(u1b2.A0O, W2U.A00(u1b2.A0A.width()), W2U.A00(u1b2.A0A.height()), u1b2.getLayoutDirection());
            u1b2.A0N = A002;
            W08 w08 = A002.A02;
            float A012 = W2U.A01(w08.A00);
            float A013 = W2U.A01(w08.A01);
            W08 w082 = u1b2.A0N.A03;
            float A014 = W2U.A01(w082.A00);
            float A015 = W2U.A01(w082.A01);
            W08 w083 = u1b2.A0N.A00;
            float A016 = W2U.A01(w083.A00);
            float A017 = W2U.A01(w083.A01);
            W08 w084 = u1b2.A0N.A01;
            float A018 = W2U.A01(w084.A00);
            float A019 = W2U.A01(w084.A01);
            float f3 = A092.left;
            float max = Math.max(A012 - f3, 0.0f);
            float f4 = A092.top;
            float max2 = Math.max(A013 - f4, 0.0f);
            float f5 = A092.right;
            float max3 = Math.max(A014 - f5, 0.0f);
            float max4 = Math.max(A015 - f4, 0.0f);
            float max5 = Math.max(A018 - f5, 0.0f);
            float f6 = A092.bottom;
            float max6 = Math.max(A019 - f6, 0.0f);
            float max7 = Math.max(A016 - f3, 0.0f);
            float max8 = Math.max(A017 - f6, 0.0f);
            Path path = u1b2.A04;
            RectF rectF3 = u1b2.A0K;
            float[] fArr = new float[8];
            C13989Tnp.A1V(fArr, max, max2);
            fArr[2] = max3;
            fArr[3] = max4;
            fArr[4] = max5;
            fArr[5] = max6;
            fArr[6] = max7;
            fArr[7] = max8;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF3, fArr, direction);
            Path path2 = u1b2.A02;
            RectF rectF4 = u1b2.A0K;
            float[] fArr2 = new float[8];
            C13989Tnp.A1V(fArr2, max, max2);
            fArr2[2] = max3;
            fArr2[3] = max4;
            fArr2[4] = max5;
            fArr2[5] = max6;
            fArr2[6] = max7;
            fArr2[7] = max8;
            path2.addRoundRect(rectF4.left - f, rectF4.top - f, rectF4.right + f, rectF4.bottom + f, fArr2, direction);
            Path path3 = u1b2.A05;
            RectF rectF5 = u1b2.A0A;
            float[] fArr3 = new float[8];
            C13989Tnp.A1V(fArr3, A012, A013);
            fArr3[2] = A014;
            fArr3[3] = A015;
            fArr3[4] = A018;
            fArr3[5] = A019;
            fArr3[6] = A016;
            fArr3[7] = A017;
            path3.addRoundRect(rectF5, fArr3, direction);
            C18764Vzz vzz = u1b2.A0D;
            if (vzz != null) {
                f2 = vzz.A00(8) / 2.0f;
            } else {
                f2 = 0.0f;
            }
            u1b2.A0J.addRoundRect(u1b2.A0L, new float[]{A012 + f2, A013 + f2, A014 + f2, A015 + f2, A018 + f2, A019 + f2, A016 + f2, A017 + f2}, direction);
            Path path4 = u1b2.A03;
            RectF rectF6 = u1b2.A0M;
            float f7 = A092.left * 0.5f;
            float f8 = A092.top * 0.5f;
            float f9 = A092.right * 0.5f;
            float f10 = A092.bottom * 0.5f;
            path4.addRoundRect(rectF6, new float[]{A012 - f7, A013 - f8, A014 - f9, A015 - f8, A018 - f9, A019 - f10, A016 - f7, A017 - f10}, direction);
            PointF pointF = u1b2.A08;
            if (pointF == null) {
                pointF = new PointF();
                u1b2.A08 = pointF;
            }
            RectF rectF7 = u1b2.A0K;
            float f11 = rectF7.left;
            pointF.x = f11;
            float f12 = rectF7.top;
            pointF.y = f12;
            double d = (double) f11;
            double d2 = (double) f12;
            RectF rectF8 = u1b2.A0A;
            A04(pointF, d, d2, (double) (f11 + (max * 2.0f)), (double) (f12 + (max2 * 2.0f)), (double) rectF8.left, (double) rectF8.top, d, d2);
            PointF pointF2 = u1b2.A06;
            if (pointF2 == null) {
                pointF2 = new PointF();
                u1b2.A06 = pointF2;
            }
            RectF rectF9 = u1b2.A0K;
            float f13 = rectF9.left;
            pointF2.x = f13;
            float f14 = rectF9.bottom;
            pointF2.y = f14;
            double d3 = (double) f13;
            double d4 = (double) f14;
            RectF rectF10 = u1b2.A0A;
            A04(pointF2, d3, (double) (f14 - (max8 * 2.0f)), (double) (f13 + (max7 * 2.0f)), d4, (double) rectF10.left, (double) rectF10.bottom, d3, d4);
            PointF pointF3 = u1b2.A09;
            if (pointF3 == null) {
                pointF3 = new PointF();
                u1b2.A09 = pointF3;
            }
            RectF rectF11 = u1b2.A0K;
            float f15 = rectF11.right;
            pointF3.x = f15;
            float f16 = rectF11.top;
            pointF3.y = f16;
            double d5 = (double) f16;
            double d6 = (double) f15;
            double d7 = (double) (f16 + (max4 * 2.0f));
            RectF rectF12 = u1b2.A0A;
            A04(pointF3, (double) (f15 - (max3 * 2.0f)), d5, d6, d7, (double) rectF12.right, (double) rectF12.top, d6, d5);
            PointF pointF4 = u1b2.A07;
            if (pointF4 == null) {
                pointF4 = new PointF();
                u1b2.A07 = pointF4;
            }
            RectF rectF13 = u1b2.A0K;
            float f17 = rectF13.right;
            pointF4.x = f17;
            float f18 = rectF13.bottom;
            pointF4.y = f18;
            double d8 = (double) (f18 - (2.0f * max6));
            double d9 = (double) f17;
            double d10 = (double) f18;
            RectF rectF14 = u1b2.A0A;
            A04(pointF4, (double) (f17 - (max5 * 2.0f)), d8, d9, d10, (double) rectF14.right, (double) rectF14.bottom, d9, d10);
        }
    }

    private boolean A06(int i) {
        float f;
        C18764Vzz vzz = this.A0C;
        float f2 = Float.NaN;
        if (vzz != null) {
            f = vzz.A00(i);
        } else {
            f = Float.NaN;
        }
        C18764Vzz vzz2 = this.A0B;
        if (vzz2 != null) {
            f2 = vzz2.A00(i);
        }
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return false;
        }
        return true;
    }

    public final float A07(float f, int i) {
        C18764Vzz vzz = this.A0D;
        if (vzz != null) {
            float f2 = vzz.A03[i];
            if (Float.isNaN(f2) || Float.valueOf(f2) == null) {
                return f;
            }
            return f2;
        }
        return f;
    }

    public final int A08(int i) {
        float f;
        float f2;
        C18764Vzz vzz = this.A0C;
        if (vzz != null) {
            f = vzz.A00(i);
        } else {
            f = 0.0f;
        }
        C18764Vzz vzz2 = this.A0B;
        if (vzz2 != null) {
            f2 = vzz2.A00(i);
        } else {
            f2 = 255.0f;
        }
        return ((((int) f2) << 24) & -16777216) | (((int) f) & 16777215);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x034d, code lost:
        if (java.lang.Float.isNaN(r2) != false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (java.lang.Float.isNaN(r1) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r34) {
        /*
            r33 = this;
            r7 = r33
            java.lang.Integer r2 = r7.A0F
            if (r2 == 0) goto L_0x01ea
            X.Vzz r0 = r7.A0D
            if (r0 == 0) goto L_0x0016
            r1 = 8
            float[] r0 = r0.A03
            r1 = r0[r1]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            android.graphics.DashPathEffect r0 = A00(r2, r1)
        L_0x001b:
            android.graphics.Paint r1 = r7.A0P
            r1.setPathEffect(r0)
            X.VwF r0 = r7.A0E
            boolean r0 = r0.A02()
            r6 = r34
            if (r0 != 0) goto L_0x029a
            X.AnonymousClass7TE.A1Q(r1)
            int r2 = r7.A01
            int r0 = r7.A00
            int r2 = X.C13990Tnq.A05(r0, r2, r2)
            int r0 = android.graphics.Color.alpha(r2)
            if (r0 == 0) goto L_0x0045
            r1.setColor(r2)
            android.graphics.Rect r0 = r7.getBounds()
            r6.drawRect(r0, r1)
        L_0x0045:
            java.util.List r0 = r7.A0G
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0061
            android.graphics.Shader r0 = r7.A01()
            r1.setShader(r0)
            android.graphics.Rect r0 = r7.getBounds()
            r6.drawRect(r0, r1)
            r0 = 0
            r1.setShader(r0)
        L_0x0061:
            android.graphics.RectF r5 = r7.A09()
            float r0 = r5.left
            int r18 = java.lang.Math.round(r0)
            float r0 = r5.top
            int r17 = java.lang.Math.round(r0)
            float r0 = r5.right
            int r16 = java.lang.Math.round(r0)
            float r0 = r5.bottom
            int r15 = java.lang.Math.round(r0)
            if (r18 > 0) goto L_0x0085
            if (r16 > 0) goto L_0x0085
            if (r17 > 0) goto L_0x0085
            if (r15 <= 0) goto L_0x01c9
        L_0x0085:
            android.graphics.Rect r4 = r7.getBounds()
            r0 = 0
            int r31 = r7.A08(r0)
            r8 = 1
            int r11 = r7.A08(r8)
            r0 = 2
            int r13 = r7.A08(r0)
            r0 = 3
            int r10 = r7.A08(r0)
            r0 = 9
            int r9 = r7.A08(r0)
            r3 = 11
            int r30 = r7.A08(r3)
            r2 = 10
            int r32 = r7.A08(r2)
            boolean r0 = r7.A06(r0)
            if (r0 == 0) goto L_0x00b7
            r11 = r9
            r10 = r9
        L_0x00b7:
            boolean r0 = r7.A06(r2)
            if (r0 != 0) goto L_0x00bf
            r32 = r10
        L_0x00bf:
            boolean r0 = r7.A06(r3)
            if (r0 != 0) goto L_0x00c7
            r30 = r11
        L_0x00c7:
            int r0 = r7.getLayoutDirection()
            boolean r12 = X.AnonymousClass7TF.A1S(r0, r8)
            r11 = 4
            int r10 = r7.A08(r11)
            r9 = 5
            int r3 = r7.A08(r9)
            com.facebook.react.modules.i18nmanager.I18nUtil r2 = com.facebook.react.modules.i18nmanager.I18nUtil.A00
            android.content.Context r0 = r7.A0O
            boolean r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r7.A06(r11)
            if (r0 == 0) goto L_0x00eb
            r31 = r10
        L_0x00eb:
            boolean r0 = r7.A06(r9)
            if (r0 == 0) goto L_0x00f2
            r13 = r3
        L_0x00f2:
            r29 = r13
            if (r12 != 0) goto L_0x00fa
            r29 = r31
            r31 = r13
        L_0x00fa:
            int r10 = r4.left
            int r2 = r4.top
            r11 = r29
            r14 = r30
            r13 = r31
            r12 = r32
            r3 = -1
            r9 = -1
            if (r18 <= 0) goto L_0x010b
            r9 = r11
        L_0x010b:
            r0 = -1
            if (r17 <= 0) goto L_0x010f
            r0 = r14
        L_0x010f:
            r9 = r9 & r0
            r0 = -1
            if (r16 <= 0) goto L_0x0114
            r0 = r13
        L_0x0114:
            r9 = r9 & r0
            if (r15 <= 0) goto L_0x0118
            r3 = r12
        L_0x0118:
            r3 = r3 & r9
            if (r18 > 0) goto L_0x011c
            r11 = 0
        L_0x011c:
            if (r17 > 0) goto L_0x011f
            r14 = 0
        L_0x011f:
            r11 = r11 | r14
            if (r16 > 0) goto L_0x0123
            r13 = 0
        L_0x0123:
            r11 = r11 | r13
            if (r15 > 0) goto L_0x0127
            r12 = 0
        L_0x0127:
            r11 = r11 | r12
            if (r3 != r11) goto L_0x01ed
            if (r3 == 0) goto L_0x01ed
            int r0 = android.graphics.Color.alpha(r3)
            if (r0 == 0) goto L_0x01c9
            int r8 = r4.right
            int r9 = r4.bottom
            r1.setColor(r3)
            X.JTO.A1N(r1)
            if (r18 <= 0) goto L_0x015f
            android.graphics.Path r4 = r7.A0Q
            r4.reset()
            float r0 = r5.left
            int r3 = java.lang.Math.round(r0)
            r7.A02(r3)
            float r0 = (float) r3
            r1.setStrokeWidth(r0)
            int r0 = r3 / 2
            int r0 = r0 + r10
            float r3 = (float) r0
            float r0 = (float) r2
            r4.moveTo(r3, r0)
            float r0 = (float) r9
            r4.lineTo(r3, r0)
            r6.drawPath(r4, r1)
        L_0x015f:
            if (r17 <= 0) goto L_0x0182
            android.graphics.Path r11 = r7.A0Q
            r11.reset()
            float r0 = r5.top
            int r3 = java.lang.Math.round(r0)
            r7.A02(r3)
            float r0 = (float) r3
            r1.setStrokeWidth(r0)
            float r4 = (float) r10
            int r0 = r3 / 2
            int r0 = r0 + r2
            float r3 = (float) r0
            r11.moveTo(r4, r3)
            float r0 = (float) r8
            r11.lineTo(r0, r3)
            r6.drawPath(r11, r1)
        L_0x0182:
            if (r16 <= 0) goto L_0x01a6
            android.graphics.Path r4 = r7.A0Q
            r4.reset()
            float r0 = r5.right
            int r3 = java.lang.Math.round(r0)
            r7.A02(r3)
            float r0 = (float) r3
            r1.setStrokeWidth(r0)
            int r0 = r3 / 2
            int r0 = r8 - r0
            float r3 = (float) r0
            float r0 = (float) r2
            r4.moveTo(r3, r0)
            float r0 = (float) r9
            r4.lineTo(r3, r0)
            r6.drawPath(r4, r1)
        L_0x01a6:
            if (r15 <= 0) goto L_0x01c9
            android.graphics.Path r4 = r7.A0Q
            r4.reset()
            float r0 = r5.bottom
            int r2 = java.lang.Math.round(r0)
            r7.A02(r2)
            float r0 = (float) r2
            r1.setStrokeWidth(r0)
            float r3 = (float) r10
            int r0 = r2 / 2
            int r9 = r9 - r0
            float r2 = (float) r9
            r4.moveTo(r3, r2)
            float r0 = (float) r8
            r4.lineTo(r0, r2)
            r6.drawPath(r4, r1)
        L_0x01c9:
            return
        L_0x01ca:
            r14 = r3
            if (r12 != 0) goto L_0x01cf
            r14 = r10
            r10 = r3
        L_0x01cf:
            boolean r3 = r7.A06(r11)
            boolean r2 = r7.A06(r9)
            r0 = r2
            if (r12 != 0) goto L_0x01dc
            r0 = r3
            r3 = r2
        L_0x01dc:
            if (r0 == 0) goto L_0x01e0
            r31 = r14
        L_0x01e0:
            r29 = r31
            r31 = r13
            if (r3 == 0) goto L_0x00fa
            r31 = r10
            goto L_0x00fa
        L_0x01ea:
            r0 = 0
            goto L_0x001b
        L_0x01ed:
            r0 = 0
            r1.setAntiAlias(r0)
            int r14 = r4.width()
            int r13 = r4.height()
            if (r18 <= 0) goto L_0x0220
            float r11 = (float) r10
            float r9 = (float) r2
            int r0 = r10 + r18
            float r5 = (float) r0
            int r0 = r2 + r17
            float r4 = (float) r0
            int r12 = r2 + r13
            int r0 = r12 - r15
            float r3 = (float) r0
            float r0 = (float) r12
            r19 = r7
            r20 = r6
            r21 = r11
            r22 = r9
            r23 = r5
            r24 = r4
            r25 = r5
            r26 = r3
            r27 = r11
            r28 = r0
            r19.A03(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0220:
            if (r17 <= 0) goto L_0x0247
            float r11 = (float) r10
            float r9 = (float) r2
            int r0 = r10 + r18
            float r5 = (float) r0
            int r0 = r2 + r17
            float r4 = (float) r0
            int r12 = r10 + r14
            int r0 = r12 - r16
            float r3 = (float) r0
            float r0 = (float) r12
            r20 = r7
            r21 = r6
            r22 = r11
            r23 = r9
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r4
            r28 = r0
            r29 = r9
            r20.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0247:
            if (r16 <= 0) goto L_0x026f
            int r3 = r10 + r14
            float r11 = (float) r3
            float r9 = (float) r2
            int r0 = r2 + r13
            float r5 = (float) r0
            int r3 = r3 - r16
            float r4 = (float) r3
            int r0 = r0 - r15
            float r3 = (float) r0
            int r0 = r2 + r17
            float r0 = (float) r0
            r21 = r7
            r22 = r6
            r23 = r11
            r24 = r9
            r25 = r11
            r26 = r5
            r27 = r4
            r28 = r3
            r29 = r4
            r30 = r0
            r21.A03(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x026f:
            if (r15 <= 0) goto L_0x0296
            float r9 = (float) r10
            int r2 = r2 + r13
            float r5 = (float) r2
            int r0 = r10 + r14
            float r4 = (float) r0
            int r0 = r0 - r16
            float r3 = (float) r0
            int r2 = r2 - r15
            float r2 = (float) r2
            int r10 = r10 + r18
            float r0 = (float) r10
            r22 = r7
            r23 = r6
            r24 = r9
            r25 = r5
            r26 = r4
            r27 = r5
            r28 = r3
            r29 = r2
            r30 = r0
            r31 = r2
            r22.A03(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x0296:
            r1.setAntiAlias(r8)
            return
        L_0x029a:
            A05(r7)
            r6.save()
            android.graphics.Path r2 = r7.A05
            r2.getClass()
            android.graphics.Region$Op r0 = android.graphics.Region.Op.INTERSECT
            r6.clipPath(r2, r0)
            int r2 = r7.A01
            int r0 = r7.getOpacity()
            int r2 = X.2eL.A06(r2, r0)
            int r0 = android.graphics.Color.alpha(r2)
            if (r0 == 0) goto L_0x02c5
            X.C13988Tno.A0p(r2, r1)
            android.graphics.Path r0 = r7.A02
            r0.getClass()
            r6.drawPath(r0, r1)
        L_0x02c5:
            java.util.List r0 = r7.A0G
            if (r0 == 0) goto L_0x02e5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02e5
            android.graphics.Shader r0 = r7.A01()
            r1.setShader(r0)
            X.AnonymousClass7TE.A1Q(r1)
            android.graphics.Path r0 = r7.A02
            r0.getClass()
            r6.drawPath(r0, r1)
            r0 = 0
            r1.setShader(r0)
        L_0x02e5:
            android.graphics.RectF r10 = r7.A09()
            r4 = 0
            int r15 = r7.A08(r4)
            r5 = 1
            int r11 = r7.A08(r5)
            r0 = 2
            int r3 = r7.A08(r0)
            r0 = 3
            int r13 = r7.A08(r0)
            r0 = 9
            int r12 = r7.A08(r0)
            r9 = 11
            int r8 = r7.A08(r9)
            r2 = 10
            int r14 = r7.A08(r2)
            boolean r0 = r7.A06(r0)
            if (r0 == 0) goto L_0x0317
            r11 = r12
            r13 = r12
        L_0x0317:
            boolean r0 = r7.A06(r2)
            if (r0 != 0) goto L_0x031e
            r14 = r13
        L_0x031e:
            boolean r0 = r7.A06(r9)
            if (r0 == 0) goto L_0x0325
            r11 = r8
        L_0x0325:
            float r9 = r10.top
            r17 = 0
            int r0 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x033f
            float r0 = r10.bottom
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x033f
            float r0 = r10.left
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x033f
            float r0 = r10.right
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x038f
        L_0x033f:
            X.Vzz r0 = r7.A0D
            if (r0 == 0) goto L_0x034f
            r2 = 8
            float[] r0 = r0.A03
            r2 = r0[r2]
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto L_0x0350
        L_0x034f:
            r2 = 0
        L_0x0350:
            r0 = 8
            int r8 = r7.A08(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0393
            float r0 = r10.bottom
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0393
            float r0 = r10.left
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0393
            float r0 = r10.right
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0393
            if (r15 != r8) goto L_0x0393
            if (r11 != r8) goto L_0x0393
            if (r3 != r8) goto L_0x0393
            if (r14 != r8) goto L_0x0393
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x038f
            int r0 = r7.A00
            int r0 = X.C13990Tnq.A05(r0, r8, r8)
            r1.setColor(r0)
            X.JTO.A1N(r1)
            r1.setStrokeWidth(r2)
            android.graphics.Path r0 = r7.A03
            r0.getClass()
            r6.drawPath(r0, r1)
        L_0x038f:
            r6.restore()
            return
        L_0x0393:
            X.AnonymousClass7TE.A1Q(r1)
            android.graphics.Path r1 = r7.A04
            r1.getClass()
            android.graphics.Region$Op r0 = android.graphics.Region.Op.DIFFERENCE
            r6.clipPath(r1, r0)
            int r0 = r7.getLayoutDirection()
            if (r0 != r5) goto L_0x03a7
            r4 = 1
        L_0x03a7:
            r9 = 4
            int r8 = r7.A08(r9)
            r5 = 5
            int r2 = r7.A08(r5)
            com.facebook.react.modules.i18nmanager.I18nUtil r1 = com.facebook.react.modules.i18nmanager.I18nUtil.A00
            android.content.Context r0 = r7.A0O
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x04a5
            boolean r0 = r7.A06(r9)
            if (r0 == 0) goto L_0x03c2
            r15 = r8
        L_0x03c2:
            boolean r0 = r7.A06(r5)
            if (r0 == 0) goto L_0x03c9
            r3 = r2
        L_0x03c9:
            r28 = r3
            if (r4 != 0) goto L_0x03d0
            r28 = r15
            r15 = r3
        L_0x03d0:
            android.graphics.RectF r0 = r7.A0A
            r0.getClass()
            float r9 = r0.left
            float r8 = r0.right
            float r5 = r0.top
            float r4 = r0.bottom
            android.graphics.PointF r12 = r7.A08
            r12.getClass()
            android.graphics.PointF r3 = r7.A09
            r3.getClass()
            android.graphics.PointF r2 = r7.A06
            r2.getClass()
            android.graphics.PointF r1 = r7.A07
            r1.getClass()
            float r0 = r10.left
            r16 = 1061997773(0x3f4ccccd, float:0.8)
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x041d
            float r21 = r5 - r16
            float r0 = r12.x
            r22 = r0
            float r13 = r12.y
            float r13 = r13 - r16
            float r0 = r2.x
            r24 = r0
            float r0 = r2.y
            float r0 = r0 + r16
            float r27 = r4 + r16
            r18 = r7
            r19 = r6
            r20 = r9
            r23 = r13
            r25 = r0
            r26 = r9
            r18.A03(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x041d:
            float r0 = r10.top
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0448
            float r20 = r9 - r16
            float r0 = r12.x
            float r0 = r0 - r16
            float r12 = r12.y
            r23 = r12
            float r12 = r3.x
            float r12 = r12 + r16
            float r13 = r3.y
            float r26 = r8 + r16
            r18 = r7
            r19 = r6
            r21 = r5
            r22 = r0
            r24 = r12
            r25 = r13
            r27 = r5
            r28 = r11
            r18.A03(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0448:
            float r0 = r10.right
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0475
            float r5 = r5 - r16
            float r11 = r3.x
            float r12 = r3.y
            float r12 = r12 - r16
            float r3 = r1.x
            float r0 = r1.y
            float r0 = r0 + r16
            float r27 = r4 + r16
            r18 = r7
            r19 = r6
            r20 = r8
            r21 = r5
            r22 = r11
            r23 = r12
            r24 = r3
            r25 = r0
            r26 = r8
            r28 = r15
            r18.A03(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0475:
            float r0 = r10.bottom
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x038f
            float r9 = r9 - r16
            float r5 = r2.x
            float r5 = r5 - r16
            float r3 = r2.y
            float r2 = r1.x
            float r2 = r2 + r16
            float r0 = r1.y
            float r8 = r8 + r16
            r15 = r7
            r16 = r6
            r17 = r9
            r18 = r4
            r19 = r5
            r20 = r3
            r21 = r2
            r22 = r0
            r23 = r8
            r24 = r4
            r25 = r14
            r15.A03(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x038f
        L_0x04a5:
            r12 = r2
            if (r4 != 0) goto L_0x04aa
            r12 = r8
            r8 = r2
        L_0x04aa:
            boolean r2 = r7.A06(r9)
            boolean r1 = r7.A06(r5)
            r0 = r1
            if (r4 != 0) goto L_0x04b7
            r0 = r2
            r2 = r1
        L_0x04b7:
            if (r0 == 0) goto L_0x04ba
            r15 = r12
        L_0x04ba:
            r28 = r15
            r15 = r3
            if (r2 == 0) goto L_0x03d0
            r15 = r8
            goto L_0x03d0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1B.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        return this.A00;
    }

    public final int getOpacity() {
        return (Color.alpha(this.A01) * this.A00) >> 8;
    }

    public final void getOutline(Outline outline) {
        if (this.A0E.A02()) {
            A05(this);
            Path path = this.A0J;
            path.getClass();
            outline.setConvexPath(path);
            return;
        }
        outline.setRect(getBounds());
    }

    public final void setAlpha(int i) {
        if (i != this.A00) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    public U1B(Context context) {
        this.A0O = context;
    }

    public static DashPathEffect A00(Integer num, float f) {
        float[] fArr;
        int intValue = num.intValue();
        if (intValue == 1) {
            fArr = new float[4];
            f *= 3.0f;
        } else if (intValue != 2) {
            return null;
        } else {
            fArr = new float[4];
        }
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        return new DashPathEffect(fArr, 0.0f);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0H = true;
    }
}
