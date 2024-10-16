package com.facebook.catalyst.views.art;

import X.002;
import X.0I1;
import X.AnonymousClass7TE;
import X.C16768V5b;
import X.JTO;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTShapeShadowNode extends ARTVirtualNode {
    public Path A00;
    public float A01 = 1.0f;
    public int A02 = 1;
    public int A03 = 1;
    public float[] A04;
    public float[] A05;
    public float[] A06;

    public final boolean A0F(Paint paint, float f) {
        float f2;
        float[] fArr;
        float[] fArr2 = this.A04;
        int i = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        Paint paint2 = paint;
        paint2.reset();
        paint2.setFlags(1);
        AnonymousClass7TE.A1Q(paint2);
        float[] fArr3 = this.A04;
        int i2 = (int) fArr3[0];
        if (i2 != 0) {
            if (i2 != 1) {
                0I1.A04("ReactNative", 002.A0c("ART: Color type ", " not supported!", i2));
            } else {
                int length = fArr3.length;
                if (length < 5) {
                    0I1.A04("ReactNative", 002.A0O("[ARTShapeShadowNode setupFillPaint] expects 5 elements, received ", length));
                    return false;
                }
                float f3 = fArr3[1];
                float f4 = this.A02;
                float f5 = f3 * f4;
                float f6 = fArr3[2] * f4;
                float f7 = fArr3[3] * f4;
                float f8 = fArr3[4] * f4;
                int i3 = (length - 5) / 5;
                int[] iArr = null;
                if (i3 > 0) {
                    iArr = new int[i3];
                    fArr = new float[i3];
                    do {
                        float[] fArr4 = this.A04;
                        fArr[i] = fArr4[(i3 * 4) + 5 + i];
                        int i4 = (i * 4) + 5;
                        iArr[i] = Color.argb((int) (fArr4[i4 + 3] * 255.0f), (int) (fArr4[i4] * 255.0f), (int) (fArr4[i4 + 1] * 255.0f), (int) (fArr4[i4 + 2] * 255.0f));
                        i++;
                    } while (i < i3);
                } else {
                    fArr = null;
                }
                paint2.setShader(new LinearGradient(f5, f6, f7, f8, iArr, fArr, Shader.TileMode.CLAMP));
            }
            return true;
        }
        if (fArr3.length > 4) {
            f2 = fArr3[4] * f * 255.0f;
        } else {
            f2 = f * 255.0f;
        }
        paint2.setARGB((int) f2, (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f), (int) (fArr3[3] * 255.0f));
        return true;
    }

    public final boolean A0G(Paint paint, float f) {
        float[] fArr;
        Paint.Cap cap;
        Paint.Join join;
        float f2;
        int length;
        int i = 0;
        if (this.A01 == 0.0f || (fArr = this.A05) == null || fArr.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        JTO.A1N(paint);
        int i2 = this.A02;
        if (i2 == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i2 == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i2 == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            throw new RuntimeException(002.A0c("strokeCap ", " unrecognized", i2));
        }
        paint.setStrokeCap(cap);
        int i3 = this.A03;
        if (i3 == 0) {
            join = Paint.Join.MITER;
        } else if (i3 == 1) {
            join = Paint.Join.ROUND;
        } else if (i3 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            throw new RuntimeException(002.A0c("strokeJoin ", " unrecognized", i3));
        }
        paint.setStrokeJoin(join);
        float f3 = this.A01;
        float f4 = this.A02;
        paint.setStrokeWidth(f3 * f4);
        float[] fArr2 = this.A05;
        if (fArr2.length > 3) {
            f2 = fArr2[3] * f * 255.0f;
        } else {
            f2 = f * 255.0f;
        }
        paint.setARGB((int) f2, (int) (fArr2[0] * 255.0f), (int) (fArr2[1] * 255.0f), (int) (fArr2[2] * 255.0f));
        float[] fArr3 = this.A06;
        if (fArr3 != null && (length = fArr3.length) > 0) {
            float[] fArr4 = new float[length];
            do {
                fArr4[i] = fArr3[i] * f4;
                i++;
            } while (i < length);
            paint.setPathEffect(new DashPathEffect(fArr4, 0.0f));
        }
        return true;
    }

    @ReactProp(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.A02 = i;
        A07();
    }

    @ReactProp(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.A03 = i;
        A07();
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f) {
        this.A01 = f;
        A07();
    }

    @ReactProp(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.A04 = C16768V5b.A00(readableArray);
        A07();
    }

    @ReactProp(name = "d")
    public void setShapePath(ReadableArray readableArray) {
        Path.Direction direction;
        float[] A002 = C16768V5b.A00(readableArray);
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i = 0;
        while (true) {
            if (i < A002.length) {
                int i2 = i + 1;
                int i3 = (int) A002[i];
                if (i3 != 0) {
                    boolean z = true;
                    if (i3 == 1) {
                        path.close();
                        i = i2;
                    } else if (i3 == 2) {
                        int i4 = i2 + 1;
                        float f = A002[i2];
                        float f2 = this.A02;
                        i = i4 + 1;
                        path.lineTo(f * f2, A002[i4] * f2);
                    } else if (i3 == 3) {
                        int i5 = i2 + 1;
                        float f3 = A002[i2];
                        float f4 = this.A02;
                        int i6 = i5 + 1;
                        int i7 = i6 + 1;
                        int i8 = i7 + 1;
                        int i9 = i8 + 1;
                        i = i9 + 1;
                        path.cubicTo(f3 * f4, f4 * A002[i5], f4 * A002[i6], f4 * A002[i7], f4 * A002[i8], A002[i9] * f4);
                    } else if (i3 == 4) {
                        int i10 = i2 + 1;
                        float f5 = A002[i2];
                        float f6 = this.A02;
                        float f7 = f5 * f6;
                        int i11 = i10 + 1;
                        float f8 = A002[i10] * f6;
                        int i12 = i11 + 1;
                        float f9 = A002[i11] * f6;
                        int i13 = i12 + 1;
                        float degrees = (float) Math.toDegrees((double) A002[i12]);
                        int i14 = i13 + 1;
                        float degrees2 = (float) Math.toDegrees((double) A002[i13]);
                        i = i14 + 1;
                        if (A002[i14] == 1.0f) {
                            z = false;
                        }
                        float f10 = degrees2 - degrees;
                        if (Math.abs(f10) >= 360.0f) {
                            if (z) {
                                direction = Path.Direction.CCW;
                            } else {
                                direction = Path.Direction.CW;
                            }
                            path.addCircle(f7, f8, f9, direction);
                        } else {
                            float f11 = f10 % 360.0f;
                            if (f11 < 0.0f) {
                                f11 += 360.0f;
                            }
                            if (z && f11 < 360.0f) {
                                f11 = (360.0f - f11) * -1.0f;
                            }
                            path.arcTo(new RectF(f7 - f9, f8 - f9, f7 + f9, f8 + f9), degrees, f11);
                        }
                    } else {
                        throw new RuntimeException(002.A0O("Unrecognized drawing instruction ", i3));
                    }
                } else {
                    int i15 = i2 + 1;
                    float f12 = A002[i2];
                    float f13 = this.A02;
                    i = i15 + 1;
                    path.moveTo(f12 * f13, A002[i15] * f13);
                }
            } else {
                this.A00 = path;
                A07();
                return;
            }
        }
    }

    @ReactProp(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.A05 = C16768V5b.A00(readableArray);
        A07();
    }

    @ReactProp(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.A06 = C16768V5b.A00(readableArray);
        A07();
    }
}
