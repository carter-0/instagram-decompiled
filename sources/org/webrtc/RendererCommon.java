package org.webrtc;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.JTO;
import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;

public class RendererCommon {
    public static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    public interface GlDrawer {
        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i, int i2, int i3);
    }

    public class VideoLayoutMeasure {
        public float visibleFractionMatchOrientation;
        public float visibleFractionMismatchOrientation;

        public void setVisibleFraction(float f, float f2) {
            this.visibleFractionMatchOrientation = f;
            this.visibleFractionMismatchOrientation = f2;
        }

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public Point measure(int i, int i2, int i3, int i4) {
            float f;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
            if (i3 == 0 || i4 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f2 = ((float) i3) / ((float) i4);
            float f3 = ((float) defaultSize) / ((float) defaultSize2);
            boolean z = true;
            boolean A1R = AnonymousClass7TF.A1R((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)));
            if (f3 <= 1.0f) {
                z = false;
            }
            if (A1R == z) {
                f = this.visibleFractionMatchOrientation;
            } else {
                f = this.visibleFractionMismatchOrientation;
            }
            Point displaySize = RendererCommon.getDisplaySize(f, f2, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static Point getDisplaySize(float f, float f2, int i, int i2) {
        if (f == 0.0f || f2 == 0.0f) {
            return new Point(i, i2);
        }
        return new Point(Math.min(i, AnonymousClass7TE.A05(((float) i2) / f, f2)), Math.min(i2, JTO.A04(((float) i) / f, f2)));
    }

    /* renamed from: org.webrtc.RendererCommon$1  reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
        static {
            /*
                org.webrtc.RendererCommon$ScalingType[] r0 = org.webrtc.RendererCommon.ScalingType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                $SwitchMap$org$webrtc$RendererCommon$ScalingType = r1
                org.webrtc.RendererCommon$ScalingType r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x000e }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                org.webrtc.RendererCommon$ScalingType r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x0013 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                org.webrtc.RendererCommon$ScalingType r0 = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED     // Catch:{ NoSuchFieldError -> 0x0018 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.RendererCommon.AnonymousClass1.<clinit>():void");
        }
    }

    public static void adjustOrigin(float[] fArr) {
        float f = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f;
        float f2 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f2;
        fArr[12] = f + 0.5f;
        fArr[13] = f2 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    public static float[] getLayoutMatrix(boolean z, float f, float f2) {
        float f3;
        float f4;
        if (f2 > f) {
            f4 = f / f2;
            f3 = 1.0f;
        } else {
            f3 = f2 / f;
            f4 = 1.0f;
        }
        if (z) {
            f3 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f3, f4, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int ordinal = scalingType.ordinal();
        if (ordinal == 0) {
            return 1.0f;
        }
        if (ordinal == 1) {
            return 0.0f;
        }
        if (ordinal == 2) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(ScalingType scalingType, float f, int i, int i2) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f, i, i2);
    }
}
