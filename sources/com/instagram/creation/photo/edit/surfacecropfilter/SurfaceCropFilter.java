package com.instagram.creation.photo.edit.surfacecropfilter;

import X.002;
import X.0qQ;
import X.AHG;
import X.C306756Nj;
import X.C366728pZ;
import X.C376419Hx;
import X.C376429Hy;
import X.C64138LPn;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.common.math.matrix.Matrix3;
import com.facebook.common.math.matrix.Matrix4;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.filterkit.filtergroup.model.intf.FilterModelProvider;

public class SurfaceCropFilter implements FilterModelProvider {
    public static final double A01;
    public static final double A02;
    public static final C306756Nj[] A03;
    public static final C376429Hy[] A04;
    public static final Parcelable.Creator CREATOR = new C376419Hx(87);
    public SurfaceCropFilterModel A00;

    public SurfaceCropFilter(boolean z) {
        SurfaceCropFilterModel surfaceCropFilterModel = new SurfaceCropFilterModel();
        this.A00 = surfaceCropFilterModel;
        surfaceCropFilterModel.A0D = z;
        surfaceCropFilterModel.A0C = false;
    }

    public static PointF A01(Matrix4 matrix4, float f, float f2) {
        C376429Hy A002 = matrix4.A00(new C376429Hy(0, f, f2, 0.0f, 1.0f));
        float f3 = A002.A01;
        float f4 = A002.A00;
        return new PointF(f3 / f4, A002.A02 / f4);
    }

    private synchronized void A03() {
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        transformSteps.A03 = true;
        transformSteps.A00 = true;
        transformSteps.A01 = true;
        transformSteps.A02 = true;
        transformSteps.A04 = true;
        A06();
    }

    private synchronized void A04() {
        A03();
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        if (surfaceCropFilterModel.A06.A06 > surfaceCropFilterModel.A02) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = surfaceCropFilterModel.A0I;
            A0Q(fitTransformParams);
            A0N(fitTransformParams, false);
        }
    }

    private synchronized void A05() {
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        transformSteps.A03 = false;
        transformSteps.A00 = false;
        transformSteps.A01 = true;
        transformSteps.A02 = true;
        transformSteps.A04 = false;
        A06();
    }

    private synchronized void A06() {
        float f;
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        if (transformSteps.A03) {
            A0A(true);
        }
        if (transformSteps.A00) {
            SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
            Matrix4 matrix4 = surfaceCropFilterModel.A07;
            SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
            float A002 = A00(matrix4, fullTransform.A01, fullTransform.A02);
            SurfaceCropFilterModel.FullTransform fullTransform2 = surfaceCropFilterModel.A06;
            fullTransform2.A06 = (fullTransform2.A06 * A002) / fullTransform2.A00;
            fullTransform2.A00 = A002;
        }
        if (transformSteps.A01) {
            SurfaceCropFilterModel surfaceCropFilterModel2 = this.A00;
            Matrix4 matrix42 = surfaceCropFilterModel2.A07;
            SurfaceCropFilterModel.FullTransform fullTransform3 = surfaceCropFilterModel2.A06;
            PointF A012 = A01(matrix42, fullTransform3.A01, fullTransform3.A02);
            SurfaceCropFilterModel surfaceCropFilterModel3 = this.A00;
            Matrix4 matrix43 = surfaceCropFilterModel3.A0M;
            Matrix.setIdentityM(matrix43.A01, 0);
            if (surfaceCropFilterModel3.A0C) {
                f = 1.0f;
                float f2 = surfaceCropFilterModel3.A06.A06;
                matrix43.A02(f2, f2 * f);
            } else {
                f = surfaceCropFilterModel3.A01;
                if (f < 1.0f) {
                    float f3 = surfaceCropFilterModel3.A06.A06;
                    matrix43.A02(f3 / f, f3);
                }
                float f22 = surfaceCropFilterModel3.A06.A06;
                matrix43.A02(f22, f22 * f);
            }
            float f4 = -A012.x;
            float f5 = -A012.y;
            Matrix4 matrix44 = new Matrix4();
            matrix44.A03(f4, f5, 0.0f);
            matrix43.A05(matrix44.A01);
        }
        if (transformSteps.A02) {
            SurfaceCropFilterModel surfaceCropFilterModel4 = this.A00;
            if (surfaceCropFilterModel4.A0C) {
                A0A(false);
            }
            Matrix4 matrix45 = surfaceCropFilterModel4.A0N;
            matrix45.A04(surfaceCropFilterModel4.A0M);
            matrix45.A05(surfaceCropFilterModel4.A07.A01);
            if (!surfaceCropFilterModel4.A0D) {
                float f6 = 1.0f;
                if (surfaceCropFilterModel4.A0E) {
                    f6 = -1.0f;
                }
                Matrix4 matrix46 = new Matrix4();
                matrix46.A02(f6, -1.0f);
                matrix45.A05(matrix46.A01);
            }
            C366728pZ.A00(surfaceCropFilterModel4, matrix45.A01);
        }
        transformSteps.A03 = false;
        transformSteps.A00 = false;
        transformSteps.A01 = false;
        transformSteps.A02 = false;
        transformSteps.A04 = false;
    }

    private synchronized void A07() {
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        transformSteps.A03 = true;
        transformSteps.A00 = true;
        transformSteps.A01 = false;
        transformSteps.A02 = false;
        transformSteps.A04 = false;
        A06();
    }

    public static synchronized void A08(SurfaceCropFilter surfaceCropFilter) {
        synchronized (surfaceCropFilter) {
            SurfaceCropFilterModel.TransformSteps transformSteps = surfaceCropFilter.A00.A0K;
            transformSteps.A03 = false;
            transformSteps.A00 = false;
            transformSteps.A01 = true;
            transformSteps.A02 = true;
            transformSteps.A04 = true;
            surfaceCropFilter.A06();
        }
    }

    public static synchronized void A09(SurfaceCropFilter surfaceCropFilter, float f, float f2) {
        synchronized (surfaceCropFilter) {
            SurfaceCropFilterModel surfaceCropFilterModel = surfaceCropFilter.A00;
            SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
            fullTransform.A01 = f;
            fullTransform.A02 = f2;
            fullTransform.A00 = surfaceCropFilter.A00(surfaceCropFilterModel.A07, f, f2);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.6Nj, java.lang.Object] */
    public static C306756Nj[] A0B(Matrix4 matrix4) {
        double d;
        double d2;
        C306756Nj[] r9 = new C306756Nj[4];
        int i = 0;
        do {
            C376429Hy A002 = matrix4.A00(A04[i]);
            float f = A002.A01;
            float f2 = A002.A00;
            r9[i] = new C306756Nj((double) (f / f2), (double) (A002.A02 / f2));
            i++;
        } while (i < 4);
        ? obj = new Object();
        int i2 = 0;
        do {
            double d3 = obj.A00;
            C306756Nj r8 = r9[i2];
            d = d3 + r8.A00;
            obj.A00 = d;
            d2 = obj.A01 + r8.A01;
            obj.A01 = d2;
            i2++;
        } while (i2 < 4);
        obj.A00 = d / 4.0d;
        obj.A01 = d2 / 4.0d;
        int i3 = 0;
        while (true) {
            C306756Nj r1 = r9[i3];
            i3++;
            if (AHG.A01(r1, r9[i3 % 4], obj)) {
                if (i3 >= 4) {
                    break;
                }
            } else {
                int i4 = 0;
                do {
                    C306756Nj r7 = r9[i4];
                    C306756Nj r6 = r9[3 - i4];
                    double d4 = r7.A00;
                    double d5 = r7.A01;
                    r7.A00 = r6.A00;
                    r7.A01 = r6.A01;
                    r6.A00 = d4;
                    r6.A01 = d5;
                    i4++;
                } while (i4 < 2);
                break;
            }
        }
        return r9;
    }

    public final synchronized Point A0C(boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        int i3 = surfaceCropFilterModel.A05;
        int i4 = surfaceCropFilterModel.A04;
        if (i3 > i4) {
            float f3 = (float) i3;
            f = surfaceCropFilterModel.A06.A06;
            i = (int) ((f3 / f) + 0.5f);
            f2 = surfaceCropFilterModel.A01;
            i2 = (int) ((f3 / (f * f2)) + 0.5f);
        } else {
            float f4 = (float) i4;
            f = surfaceCropFilterModel.A06.A06;
            i2 = (int) ((f4 / f) + 0.5f);
            f2 = surfaceCropFilterModel.A01;
            i = (int) (((f2 * f4) / f) + 0.5f);
        }
        if (!z || surfaceCropFilterModel.A0A || C64138LPn.A01(((float) i) / ((float) i2), surfaceCropFilterModel.A03)) {
        } else {
            throw new IllegalStateException(002.A0R("Aspect ratio error: ", StringFormatUtil.formatStrLocaleSafe("size:%d x %d  input:%d x %d  scale:%f cropAspectRatio:%f", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2)})));
        }
        return new Point(i, i2);
    }

    public final synchronized PointF A0D(float f, float f2) {
        PointF A022;
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        Matrix4 matrix4 = surfaceCropFilterModel.A07;
        SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
        PointF A012 = A01(matrix4, fullTransform.A01, fullTransform.A02);
        float f3 = A012.x;
        float f4 = this.A00.A06.A06;
        float f5 = f3 + (((-f) * 2.0f) / f4);
        A012.x = f5;
        float f6 = A012.y + ((f2 * 2.0f) / f4);
        A012.y = f6;
        A022 = A02(this, f5, f6);
        A09(this, A022.x, A022.y);
        A08(this);
        return A022;
    }

    public final synchronized void A0E() {
        SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A00.A0I;
        if (A0Q(fitTransformParams)) {
            A0M(fitTransformParams);
        }
    }

    public final synchronized void A0F(float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (fullTransform.A03 != f) {
            fullTransform.A03 = f;
            A04();
        }
    }

    public final synchronized void A0G(float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (fullTransform.A04 != f) {
            fullTransform.A04 = f;
            A04();
        }
    }

    public final synchronized void A0H(float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (fullTransform.A05 != f) {
            fullTransform.A05 = f;
            A04();
        }
    }

    public final synchronized void A0I(int i) {
        this.A00.A06.A07 = i;
        A03();
    }

    public final synchronized void A0J(PointF pointF, float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (f != fullTransform.A06) {
            fullTransform.A06 = f;
        }
        A09(this, pointF.x, pointF.y);
        A08(this);
        A0E();
    }

    public final synchronized void A0K(Rect rect, int i, int i2, int i3, boolean z) {
        PointF pointF;
        float f;
        synchronized (this) {
            SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
            surfaceCropFilterModel.A0F = false;
            float f2 = (float) i;
            float f3 = (float) i2;
            surfaceCropFilterModel.A00 = f2 / f3;
            A07();
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            0qQ.A0B(rect, 3);
            float width = (float) rect.width();
            float height = (float) rect.height();
            if (!(f2 == 0.0f || f3 == 0.0f || width == 0.0f || height == 0.0f)) {
                if (f2 > f3) {
                    if (width > height) {
                        f6 = f2 / width;
                    } else {
                        f6 = f2 / height;
                    }
                    f4 = (((float) (rect.left + rect.right)) - f2) / f2;
                    f5 = (((float) (rect.top + rect.bottom)) - f3) / f2;
                } else {
                    if (height > width) {
                        f = f3 / height;
                    } else {
                        f = f3 / width;
                    }
                    f4 = (((float) (rect.left + rect.right)) - f2) / f3;
                    f5 = (((float) (rect.top + rect.bottom)) - f3) / f3;
                }
            }
            surfaceCropFilterModel.A06.A06 = 1.0f;
            if (!z || i3 % 180 == 0) {
                pointF = A02(this, f4, -f5);
            } else {
                pointF = A02(this, -f5, f4);
            }
            A09(this, pointF.x, pointF.y);
            A05();
            surfaceCropFilterModel.A06.A06 = f6;
            A08(this);
            int i4 = i2;
            if (i > i2) {
                i4 = i;
            }
            float f7 = ((float) i4) / 320.0f;
            surfaceCropFilterModel.A02 = f7;
            surfaceCropFilterModel.A02 = Math.max(surfaceCropFilterModel.A06.A06 * 3.8f, f7);
            if (i3 != 0 && !surfaceCropFilterModel.A0D) {
                if (!surfaceCropFilterModel.A0E) {
                    i3 = -i3;
                }
                surfaceCropFilterModel.A03 = i3;
            }
            if (surfaceCropFilterModel.A03 % 180 == 0) {
                surfaceCropFilterModel.A05 = i;
                surfaceCropFilterModel.A04 = i2;
                surfaceCropFilterModel.A01 = ((float) rect.width()) / ((float) rect.height());
            } else {
                surfaceCropFilterModel.A05 = i2;
                surfaceCropFilterModel.A04 = i;
                surfaceCropFilterModel.A01 = ((float) rect.height()) / ((float) rect.width());
            }
            if (surfaceCropFilterModel.A0G) {
                surfaceCropFilterModel.A0G = false;
                SurfaceCropFilterModel surfaceCropFilterModel2 = this.A00;
                surfaceCropFilterModel2.A06 = surfaceCropFilterModel2.A0J;
            }
            SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
            transformSteps.A03 = true;
            transformSteps.A00 = false;
            transformSteps.A01 = true;
            transformSteps.A02 = true;
            transformSteps.A04 = true;
            A06();
        }
    }

    public final synchronized void A0L(SurfaceCropFilterModel.FitTransformParams fitTransformParams) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        fitTransformParams.A02 = fullTransform.A06;
        fitTransformParams.A00 = fullTransform.A01;
        fitTransformParams.A01 = fullTransform.A02;
    }

    public final synchronized void A0M(SurfaceCropFilterModel.FitTransformParams fitTransformParams) {
        A0N(fitTransformParams, true);
    }

    public final synchronized void A0N(SurfaceCropFilterModel.FitTransformParams fitTransformParams, boolean z) {
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        surfaceCropFilterModel.A06.A06 = fitTransformParams.A02;
        A09(this, fitTransformParams.A00, fitTransformParams.A01);
        SurfaceCropFilterModel.TransformSteps transformSteps = surfaceCropFilterModel.A0K;
        transformSteps.A03 = false;
        transformSteps.A00 = false;
        transformSteps.A01 = true;
        transformSteps.A02 = true;
        transformSteps.A04 = z;
        A06();
    }

    public final synchronized void A0O(SurfaceCropFilterModel.FullTransform fullTransform) {
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        SurfaceCropFilterModel.FullTransform fullTransform2 = surfaceCropFilterModel.A06;
        fullTransform2.A03 = fullTransform.A03;
        fullTransform2.A04 = fullTransform.A04;
        fullTransform2.A05 = fullTransform.A05;
        fullTransform2.A07 = fullTransform.A07;
        A07();
        SurfaceCropFilterModel.FullTransform fullTransform3 = surfaceCropFilterModel.A06;
        fullTransform3.A06 = fullTransform.A06;
        fullTransform3.A00 = fullTransform.A00;
        fullTransform3.A01 = fullTransform.A01;
        fullTransform3.A02 = fullTransform.A02;
        A08(this);
    }

    public final synchronized void A0P(boolean z) {
        this.A00.A0E = z;
        A03();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SurfaceCropFilter";
    }

    static {
        C306756Nj[] r6 = new C306756Nj[4];
        A03 = r6;
        C376429Hy[] r5 = new C376429Hy[4];
        A04 = r5;
        int i = 0;
        r6[0] = new C306756Nj(-1.0d, 1.0d);
        r6[1] = new C306756Nj(-1.0d, -1.0d);
        r6[2] = new C306756Nj(1.0d, -1.0d);
        r6[3] = new C306756Nj(1.0d, 1.0d);
        double d = r6[2].A00 - r6[1].A00;
        A01 = d;
        A02 = d * 1.001d;
        do {
            C306756Nj r3 = r6[i];
            r5[i] = new C376429Hy(0, (float) r3.A00, (float) r3.A01, 0.0f, 1.0f);
            i++;
        } while (i < 4);
    }

    private float A00(Matrix4 matrix4, float f, float f2) {
        float f3;
        Matrix4 matrix42 = matrix4;
        PointF A012 = A01(matrix42, f, f2);
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        float f4 = surfaceCropFilterModel.A01;
        if (f4 > 1.0f) {
            A012.x /= f4;
        } else if (f4 < 1.0f) {
            A012.y *= f4;
        }
        PointF[] pointFArr = new PointF[4];
        int i = 0;
        int i2 = 0;
        do {
            C376429Hy r0 = A04[i2];
            PointF A013 = A01(matrix42, r0.A01, r0.A02);
            float f5 = surfaceCropFilterModel.A01;
            if (f5 > 1.0f) {
                A013.x /= f5;
            } else if (f5 < 1.0f) {
                A013.y *= f5;
            }
            pointFArr[i2] = A013;
            i2++;
        } while (i2 < 4);
        float f6 = Float.MAX_VALUE;
        do {
            PointF pointF = pointFArr[i];
            float f7 = pointF.x;
            float f8 = pointF.y;
            i++;
            PointF pointF2 = pointFArr[i % 4];
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            float f11 = A012.x;
            float f12 = A012.y;
            if (Math.abs(f7 - f9) < 1.0E-7f) {
                f3 = Math.abs(f11 - f7);
            } else {
                float f13 = (f10 - f8) / (f9 - f7);
                f3 = Float.MAX_VALUE;
                if (Math.abs(f13 - 1.0f) > 1.0E-7f) {
                    f3 = Math.min(Float.MAX_VALUE, Math.abs((((f8 - (f13 * f7)) - (f12 - f11)) / (1.0f - f13)) - f11));
                }
                float f14 = 1.0f + f13;
                if (Math.abs(f14) > 1.0E-7f) {
                    f3 = Math.min(f3, Math.abs(((((f13 * f7) - f8) + (f12 + f11)) / f14) - f11));
                }
            }
            f6 = Math.min(f6, f3);
        } while (i < 4);
        return 1.0f / f6;
    }

    public static PointF A02(SurfaceCropFilter surfaceCropFilter, float f, float f2) {
        Matrix3 matrix3 = new Matrix3();
        float[] fArr = surfaceCropFilter.A00.A07.A01;
        float[] fArr2 = matrix3.A01;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[3];
        fArr2[3] = fArr[4];
        fArr2[4] = fArr[5];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[12];
        fArr2[7] = fArr[13];
        float f3 = fArr[15];
        fArr2[8] = f3;
        float f4 = fArr2[0];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[5];
        float f8 = (f5 * f3) - (f6 * f7);
        float f9 = fArr2[3];
        float f10 = fArr2[2];
        float f11 = fArr2[1];
        float f12 = (f4 * f8) + (f9 * ((f6 * f10) - (f3 * f11))) + (fArr2[6] * ((f11 * f7) - (f5 * f10)));
        int i = 0;
        float f13 = fArr2[2];
        float f14 = fArr2[1];
        float f15 = fArr2[6];
        float f16 = fArr2[0];
        float f17 = fArr2[2];
        float f18 = fArr2[3];
        float f19 = fArr2[4];
        float[] fArr3 = {f8, (f6 * f13) - (fArr2[1] * f3), (f14 * f7) - (f5 * f13), (f15 * f7) - (fArr2[3] * f3), (f3 * f16) - (f15 * f17), (f17 * f18) - (f7 * f16), (f18 * f6) - (f15 * f19), (fArr2[6] * f14) - (f6 * f16), (f16 * f19) - (f18 * f14)};
        do {
            fArr2[i] = fArr3[i] / f12;
            i++;
        } while (i < 9);
        float f20 = (fArr2[0] * f) + (fArr2[3] * f2) + (fArr2[6] * 1.0f);
        float f21 = (fArr2[1] * f) + (fArr2[4] * f2) + (fArr2[7] * 1.0f);
        float f22 = (fArr2[2] * f) + (fArr2[5] * f2) + (fArr2[8] * 1.0f);
        return new PointF(f20 / f22, f21 / f22);
    }

    private void A0A(boolean z) {
        Matrix4 matrix4;
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        Matrix.setIdentityM(surfaceCropFilterModel.A07.A01, 0);
        float[] fArr = new float[16];
        Matrix.frustumM(fArr, 0, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 4.0f);
        surfaceCropFilterModel.A07.A05(fArr);
        Matrix4 matrix42 = new Matrix4();
        matrix42.A03(0.0f, 0.0f, -2.0f);
        surfaceCropFilterModel.A07.A05(matrix42.A01);
        float f = -surfaceCropFilterModel.A06.A05;
        Matrix4 matrix43 = new Matrix4();
        matrix43.A01(f);
        surfaceCropFilterModel.A07.A05(matrix43.A01);
        float f2 = surfaceCropFilterModel.A06.A04;
        float[] fArr2 = new Matrix4().A01;
        Matrix.rotateM(fArr2, 0, f2, 0.0f, 1.0f, 0.0f);
        surfaceCropFilterModel.A07.A05(fArr2);
        float f3 = surfaceCropFilterModel.A06.A03;
        float[] fArr3 = new Matrix4().A01;
        Matrix.rotateM(fArr3, 0, f3, 1.0f, 0.0f, 0.0f);
        surfaceCropFilterModel.A07.A05(fArr3);
        Matrix4 matrix44 = new Matrix4();
        matrix44.A01((float) (surfaceCropFilterModel.A06.A07 + surfaceCropFilterModel.A03));
        surfaceCropFilterModel.A07.A05(matrix44.A01);
        float f4 = surfaceCropFilterModel.A00;
        if (f4 < 1.0f) {
            matrix4 = new Matrix4();
            matrix4.A02(f4, 1.0f);
        } else {
            matrix4 = new Matrix4();
            matrix4.A02(1.0f, 1.0f / f4);
        }
        Matrix4 matrix45 = new Matrix4(surfaceCropFilterModel.A07);
        surfaceCropFilterModel.A07.A05(matrix4.A01);
        float f5 = Float.MAX_VALUE;
        int i = 0;
        do {
            C376429Hy A002 = surfaceCropFilterModel.A07.A00(A04[i]);
            float f6 = A002.A01;
            float f7 = A002.A00;
            f5 = Math.min(f5, Math.min(1.0f / Math.abs(f6 / f7), 1.0f / Math.abs(A002.A02 / f7)));
            i++;
        } while (i < 4);
        Matrix4 matrix46 = new Matrix4();
        matrix46.A02(f5, f5);
        if (z) {
            matrix45 = surfaceCropFilterModel.A07;
        }
        matrix46.A05(matrix45.A01);
        surfaceCropFilterModel.A07 = matrix46;
    }

    /* JADX WARNING: type inference failed for: r6v12, types: [X.6Nj, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011c, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0Q(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel.FitTransformParams r27) {
        /*
            r26 = this;
            r24 = r26
            monitor-enter(r24)
            r0 = r24
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r0.A00     // Catch:{ all -> 0x023d }
            r25 = r0
            com.facebook.common.math.matrix.Matrix4 r14 = r0.A0N     // Catch:{ all -> 0x023d }
            X.6Nj[] r12 = A0B(r14)     // Catch:{ all -> 0x023d }
            X.6Nj[] r19 = A03     // Catch:{ all -> 0x023d }
            r11 = 4
            r5 = 0
            r4 = 0
        L_0x0014:
            r3 = r19[r4]     // Catch:{ all -> 0x023d }
            r2 = 0
        L_0x0017:
            r1 = r12[r2]     // Catch:{ all -> 0x023d }
            int r2 = r2 + 1
            int r0 = r2 % r11
            r0 = r12[r0]     // Catch:{ all -> 0x023d }
            boolean r0 = X.AHG.A01(r1, r0, r3)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x002c
            if (r2 < r11) goto L_0x0017
            int r4 = r4 + 1
            if (r4 < r11) goto L_0x0014
            r5 = 1
        L_0x002c:
            r0 = r25
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x023d }
            float r0 = r0.A06     // Catch:{ all -> 0x023d }
            r23 = r0
            if (r5 == 0) goto L_0x0043
            r0 = r25
            float r0 = r0.A02     // Catch:{ all -> 0x023d }
            r22 = r0
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ee
            r0 = 0
            goto L_0x023b
        L_0x0043:
            r10 = 0
            r8 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r4 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r13 = 0
            r2 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
        L_0x0059:
            r15 = r12[r13]     // Catch:{ all -> 0x023d }
            double r0 = r15.A00     // Catch:{ all -> 0x023d }
            double r6 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x023d }
            double r8 = java.lang.Math.max(r8, r0)     // Catch:{ all -> 0x023d }
            double r0 = r15.A01     // Catch:{ all -> 0x023d }
            double r4 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x023d }
            double r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x023d }
            int r13 = r13 + 1
            if (r13 < r11) goto L_0x0059
            double r8 = r8 - r6
            double r2 = r2 - r4
            double r2 = java.lang.Math.min(r8, r2)     // Catch:{ all -> 0x023d }
            r17 = 0
            X.6Nj[] r4 = X.AHG.A03(r12, r2)     // Catch:{ all -> 0x023d }
            int r0 = r4.length     // Catch:{ all -> 0x023d }
            if (r0 <= 0) goto L_0x0084
            r17 = r2
        L_0x0084:
            double r15 = r2 - r17
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            double r0 = r2 + r17
            double r0 = r0 / r7
            X.6Nj[] r6 = X.AHG.A03(r12, r0)     // Catch:{ all -> 0x023d }
            int r5 = r6.length     // Catch:{ all -> 0x023d }
            if (r5 <= 0) goto L_0x009f
            r17 = r0
            r4 = r6
            goto L_0x0084
        L_0x009f:
            r2 = r0
            goto L_0x0084
        L_0x00a1:
            X.6Nj r6 = new X.6Nj     // Catch:{ all -> 0x023d }
            r6.<init>()     // Catch:{ all -> 0x023d }
        L_0x00a6:
            int r0 = r4.length     // Catch:{ all -> 0x023d }
            if (r10 >= r0) goto L_0x00bc
            double r2 = r6.A00     // Catch:{ all -> 0x023d }
            r5 = r4[r10]     // Catch:{ all -> 0x023d }
            double r0 = r5.A00     // Catch:{ all -> 0x023d }
            double r2 = r2 + r0
            r6.A00 = r2     // Catch:{ all -> 0x023d }
            double r2 = r6.A01     // Catch:{ all -> 0x023d }
            double r0 = r5.A01     // Catch:{ all -> 0x023d }
            double r2 = r2 + r0
            r6.A01 = r2     // Catch:{ all -> 0x023d }
            int r10 = r10 + 1
            goto L_0x00a6
        L_0x00bc:
            double r4 = r6.A00     // Catch:{ all -> 0x023d }
            double r0 = (double) r0     // Catch:{ all -> 0x023d }
            double r4 = r4 / r0
            r6.A00 = r4     // Catch:{ all -> 0x023d }
            double r2 = r6.A01     // Catch:{ all -> 0x023d }
            double r2 = r2 / r0
            double r17 = r17 / r7
            double r6 = r4 - r17
            double r0 = r2 - r17
            double r4 = r4 + r17
            double r2 = r2 + r17
            double r4 = r4 - r6
            double r2 = r2 - r0
            double r1 = java.lang.Math.max(r4, r2)     // Catch:{ all -> 0x023d }
            double r3 = A02     // Catch:{ all -> 0x023d }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fe
            double r3 = r3 / r1
            float r2 = (float) r3     // Catch:{ all -> 0x023d }
            r0 = r24
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r0.A00     // Catch:{ all -> 0x023d }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x023d }
            float r1 = r0.A06     // Catch:{ all -> 0x023d }
            float r1 = r1 * r2
        L_0x00e6:
            r0 = r25
            float r0 = r0.A02     // Catch:{ all -> 0x023d }
            float r22 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x023d }
        L_0x00ee:
            r0 = r25
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r1 = r0.A06     // Catch:{ all -> 0x023d }
            r0 = r22
            r1.A06 = r0     // Catch:{ all -> 0x023d }
            r24.A05()     // Catch:{ all -> 0x023d }
            X.6Nj[] r6 = A0B(r14)     // Catch:{ all -> 0x023d }
            goto L_0x0107
        L_0x00fe:
            r0 = r24
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r0.A00     // Catch:{ all -> 0x023d }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x023d }
            float r1 = r0.A06     // Catch:{ all -> 0x023d }
            goto L_0x00e6
        L_0x0107:
            r5 = 0
            r4 = 0
        L_0x0109:
            r3 = r19[r4]     // Catch:{ all -> 0x023d }
            r2 = 0
        L_0x010c:
            r1 = r6[r2]     // Catch:{ all -> 0x023d }
            int r2 = r2 + 1
            int r0 = r2 % r11
            r0 = r6[r0]     // Catch:{ all -> 0x023d }
            boolean r0 = X.AHG.A01(r1, r0, r3)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0121
            if (r2 < r11) goto L_0x010c
            int r4 = r4 + 1
            if (r4 < r11) goto L_0x0109
            r5 = 1
        L_0x0121:
            r0 = r25
            android.graphics.PointF r15 = r0.A0H     // Catch:{ all -> 0x023d }
            r3 = 0
            r15.set(r3, r3)     // Catch:{ all -> 0x023d }
            if (r5 != 0) goto L_0x01f9
            double r0 = A01     // Catch:{ all -> 0x023d }
            X.6Nj[] r14 = X.AHG.A03(r6, r0)     // Catch:{ all -> 0x023d }
            int r13 = r14.length     // Catch:{ all -> 0x023d }
            if (r13 == 0) goto L_0x01f4
            r4 = 0
            X.6Nj r21 = new X.6Nj     // Catch:{ all -> 0x023d }
            r0 = r21
            r0.<init>(r4, r4)     // Catch:{ all -> 0x023d }
            r20 = r0
            r10 = 0
            r0 = 1
            if (r13 != r0) goto L_0x0145
            goto L_0x01da
        L_0x0145:
            r3 = 0
        L_0x0146:
            r2 = r14[r3]     // Catch:{ all -> 0x023d }
            int r3 = r3 + 1
            int r0 = r3 % r13
            r1 = r14[r0]     // Catch:{ all -> 0x023d }
            r0 = r21
            boolean r0 = X.AHG.A01(r2, r1, r0)     // Catch:{ all -> 0x023d }
            if (r0 != 0) goto L_0x015e
            X.6Nj r20 = new X.6Nj     // Catch:{ all -> 0x023d }
            r0 = r20
            r0.<init>(r4, r4)     // Catch:{ all -> 0x023d }
            goto L_0x0161
        L_0x015e:
            if (r3 >= r13) goto L_0x01e7
            goto L_0x0146
        L_0x0161:
            r18 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0166:
            r9 = r14[r10]     // Catch:{ all -> 0x023d }
            int r10 = r10 + 1
            int r0 = r10 % r13
            r8 = r14[r0]     // Catch:{ all -> 0x023d }
            r0 = r21
            X.6Nj r11 = X.C306756Nj.A00(r0, r9)     // Catch:{ all -> 0x023d }
            X.6Nj r2 = X.C306756Nj.A00(r8, r9)     // Catch:{ all -> 0x023d }
            double r6 = r2.A00     // Catch:{ all -> 0x023d }
            double r0 = r11.A00     // Catch:{ all -> 0x023d }
            double r6 = r6 * r0
            double r2 = r2.A01     // Catch:{ all -> 0x023d }
            double r0 = r11.A01     // Catch:{ all -> 0x023d }
            double r2 = r2 * r0
            double r6 = r6 + r2
            X.6Nj r11 = X.C306756Nj.A00(r8, r9)     // Catch:{ all -> 0x023d }
            X.6Nj r12 = X.C306756Nj.A00(r8, r9)     // Catch:{ all -> 0x023d }
            double r2 = r12.A00     // Catch:{ all -> 0x023d }
            double r0 = r11.A00     // Catch:{ all -> 0x023d }
            double r2 = r2 * r0
            double r0 = r12.A01     // Catch:{ all -> 0x023d }
            double r11 = r11.A01     // Catch:{ all -> 0x023d }
            double r0 = r0 * r11
            double r2 = r2 + r0
            double r6 = r6 / r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c0
            double r2 = r9.A00     // Catch:{ all -> 0x023d }
            double r0 = r9.A01     // Catch:{ all -> 0x023d }
        L_0x019f:
            X.6Nj r8 = new X.6Nj     // Catch:{ all -> 0x023d }
            r8.<init>(r2, r0)     // Catch:{ all -> 0x023d }
            double r6 = r8.A00     // Catch:{ all -> 0x023d }
            r0 = r21
            double r0 = r0.A00     // Catch:{ all -> 0x023d }
            double r6 = r6 - r0
            double r6 = r6 * r6
            double r2 = r8.A01     // Catch:{ all -> 0x023d }
            r0 = r21
            double r0 = r0.A01     // Catch:{ all -> 0x023d }
            double r2 = r2 - r0
            double r2 = r2 * r2
            double r6 = r6 + r2
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bd
            r20 = r8
            r18 = r6
        L_0x01bd:
            if (r10 >= r13) goto L_0x01e7
            goto L_0x0166
        L_0x01c0:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cb
            double r2 = r8.A00     // Catch:{ all -> 0x023d }
            double r0 = r8.A01     // Catch:{ all -> 0x023d }
            goto L_0x019f
        L_0x01cb:
            double r2 = r9.A00     // Catch:{ all -> 0x023d }
            double r0 = r8.A00     // Catch:{ all -> 0x023d }
            double r0 = r0 - r2
            double r0 = r0 * r6
            double r2 = r2 + r0
            double r0 = r9.A01     // Catch:{ all -> 0x023d }
            double r8 = r8.A01     // Catch:{ all -> 0x023d }
            double r8 = r8 - r0
            double r8 = r8 * r6
            double r0 = r0 + r8
            goto L_0x019f
        L_0x01da:
            r0 = r14[r10]     // Catch:{ all -> 0x023d }
            double r3 = r0.A00     // Catch:{ all -> 0x023d }
            double r1 = r0.A01     // Catch:{ all -> 0x023d }
            X.6Nj r20 = new X.6Nj     // Catch:{ all -> 0x023d }
            r0 = r20
            r0.<init>(r3, r1)     // Catch:{ all -> 0x023d }
        L_0x01e7:
            r0 = r20
            double r1 = r0.A00     // Catch:{ all -> 0x023d }
            float r0 = (float) r1     // Catch:{ all -> 0x023d }
            r15.x = r0     // Catch:{ all -> 0x023d }
            r0 = r20
            double r0 = r0.A01     // Catch:{ all -> 0x023d }
            float r2 = (float) r0     // Catch:{ all -> 0x023d }
            goto L_0x01f7
        L_0x01f4:
            r2 = 0
            r15.x = r3     // Catch:{ all -> 0x023d }
        L_0x01f7:
            r15.y = r2     // Catch:{ all -> 0x023d }
        L_0x01f9:
            r0 = r24
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r0.A00     // Catch:{ all -> 0x023d }
            com.facebook.common.math.matrix.Matrix4 r2 = r0.A07     // Catch:{ all -> 0x023d }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x023d }
            float r1 = r0.A01     // Catch:{ all -> 0x023d }
            float r0 = r0.A02     // Catch:{ all -> 0x023d }
            android.graphics.PointF r4 = A01(r2, r1, r0)     // Catch:{ all -> 0x023d }
            float r3 = r4.x     // Catch:{ all -> 0x023d }
            float r1 = r15.x     // Catch:{ all -> 0x023d }
            r0 = r25
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x023d }
            float r2 = r0.A06     // Catch:{ all -> 0x023d }
            float r1 = r1 / r2
            float r3 = r3 + r1
            float r1 = r4.y     // Catch:{ all -> 0x023d }
            float r0 = r15.y     // Catch:{ all -> 0x023d }
            float r0 = r0 / r2
            float r1 = r1 + r0
            r0 = r24
            android.graphics.PointF r2 = A02(r0, r3, r1)     // Catch:{ all -> 0x023d }
            r0 = r25
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r1 = r0.A06     // Catch:{ all -> 0x023d }
            r0 = r23
            r1.A06 = r0     // Catch:{ all -> 0x023d }
            r24.A05()     // Catch:{ all -> 0x023d }
            r1 = r27
            r0 = r22
            r1.A02 = r0     // Catch:{ all -> 0x023d }
            float r0 = r2.x     // Catch:{ all -> 0x023d }
            r1.A00 = r0     // Catch:{ all -> 0x023d }
            float r0 = r2.y     // Catch:{ all -> 0x023d }
            r1.A01 = r0     // Catch:{ all -> 0x023d }
            r0 = 1
        L_0x023b:
            monitor-exit(r24)
            return r0
        L_0x023d:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter.A0Q(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams):boolean");
    }

    public final /* bridge */ /* synthetic */ FilterModel B5t() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
