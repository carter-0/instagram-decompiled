package X;

import android.graphics.Rect;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

/* renamed from: X.8lv  reason: invalid class name and case insensitive filesystem */
public abstract class C364738lv {
    public static final TransformMatrixConfig A00(int i, int i2, int i3, int i4, boolean z) {
        Integer num = AnonymousClass05K.A00;
        boolean z2 = !z;
        return new TransformMatrixConfig(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "videos", i, i2, 0, i3, i4, false, false, false, z2, false, z2);
    }

    public static final TransformMatrixConfig A01(TransformMatrixConfig transformMatrixConfig, AD8 ad8, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        float f;
        Float f2;
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        TransformMatrixConfig transformMatrixConfig2 = transformMatrixConfig;
        if (transformMatrixConfig == null) {
            return null;
        }
        AD8 ad82 = ad8;
        if (ad8 == null || (num4 = ad82.A03) == null) {
            i = transformMatrixConfig2.A05;
        } else {
            i = num4.intValue();
        }
        if (ad8 == null || (num3 = ad82.A02) == null) {
            i2 = transformMatrixConfig2.A03;
        } else {
            i2 = num3.intValue();
        }
        int i5 = transformMatrixConfig2.A04;
        if (ad8 == null || (num2 = ad82.A05) == null) {
            i3 = transformMatrixConfig2.A07;
        } else {
            i3 = num2.intValue();
        }
        if (ad8 == null || (num = ad82.A04) == null) {
            i4 = transformMatrixConfig2.A06;
        } else {
            i4 = num.intValue();
        }
        if (ad8 == null || (bool = ad82.A00) == null) {
            z4 = transformMatrixConfig2.A08.A04;
        } else {
            z4 = bool.booleanValue();
        }
        Integer num5 = AnonymousClass05K.A00;
        boolean z5 = !z2;
        TransformMatrixConfig transformMatrixConfig3 = new TransformMatrixConfig(new TransformMatrixParams(num5, num5, 1.0f, 0.0f, 0.0f, 0.0f, z4), transformMatrixConfig2.A09, i, i2, i5, i3, i4, transformMatrixConfig2.A0A, z, z2, z5, z3, z5);
        transformMatrixConfig3.A08.A00(transformMatrixConfig2.A08);
        if (ad82 == null || (f2 = ad82.A01) == null) {
            f = transformMatrixConfig2.A08.A01;
        } else {
            f = f2.floatValue();
        }
        transformMatrixConfig3.A08.A01 = f;
        transformMatrixConfig3.A03();
        return transformMatrixConfig3;
    }

    public static final TransformMatrixConfig A02(C352218Cl r19, float f, int i, int i2) {
        int i3;
        int i4;
        C352218Cl r2 = r19;
        int i5 = i;
        int i6 = i2;
        if (r2.A15) {
            i3 = i5;
            i4 = i6;
        } else {
            i3 = r2.A09;
            i4 = r2.A06;
        }
        int i7 = r2.A07;
        boolean z = r2.A13;
        Rect A00 = r2.A00();
        int A01 = C364748lw.A01(i3, A00);
        int A002 = C364748lw.A00(i4, A00);
        Integer num = AnonymousClass05K.A00;
        TransformMatrixConfig transformMatrixConfig = new TransformMatrixConfig(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "photo", A01, A002, i7, i5, i6, z, false, true, false, true, false);
        transformMatrixConfig.A08.A01 = f;
        return transformMatrixConfig;
    }
}
