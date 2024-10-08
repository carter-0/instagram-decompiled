package com.facebook.catalyst.views.art;

import X.C11414SSm;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

public abstract class ARTVirtualNode extends ReactShadowNodeImpl {
    public static final float[] A03 = new float[9];
    public static final float[] A04 = new float[9];
    public float A00 = 1.0f;
    public Matrix A01 = new Matrix();
    public final float A02 = C11414SSm.A00().density;

    public final void A0E(Canvas canvas, Paint paint, float f) {
        ARTShapeShadowNode aRTShapeShadowNode;
        ARTTextShadowNode aRTTextShadowNode;
        ReadableArray array;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (this instanceof ARTShapeShadowNode) {
            ARTShapeShadowNode aRTShapeShadowNode2 = (ARTShapeShadowNode) this;
            if (aRTShapeShadowNode2 instanceof ARTTextShadowNode) {
                ARTTextShadowNode aRTTextShadowNode2 = (ARTTextShadowNode) aRTShapeShadowNode2;
                ReadableMap readableMap = aRTTextShadowNode2.A01;
                if (readableMap != null) {
                    float f2 = f * aRTTextShadowNode2.A00;
                    if (f2 > 0.01f && readableMap.hasKey("lines") && (array = aRTTextShadowNode2.A01.getArray("lines")) != null && array.size() != 0) {
                        canvas.save();
                        Matrix matrix = aRTTextShadowNode2.A01;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        int size = array.size();
                        String[] strArr = new String[size];
                        for (int i = 0; i < size; i++) {
                            strArr[i] = array.getString(i);
                        }
                        String join = TextUtils.join("\n", strArr);
                        if (aRTTextShadowNode2.A0G(paint, f2)) {
                            ARTTextShadowNode.A00(paint, aRTTextShadowNode2);
                            Path path = aRTTextShadowNode2.A00;
                            if (path == null) {
                                canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                            } else {
                                canvas2.drawTextOnPath(join, path, 0.0f, 0.0f, paint2);
                            }
                        }
                        boolean A0F = aRTTextShadowNode2.A0F(paint, f2);
                        aRTTextShadowNode = aRTTextShadowNode2;
                        if (A0F) {
                            ARTTextShadowNode.A00(paint, aRTTextShadowNode2);
                            Path path2 = aRTTextShadowNode2.A00;
                            if (path2 == null) {
                                canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                                aRTTextShadowNode = aRTTextShadowNode2;
                            } else {
                                canvas2.drawTextOnPath(join, path2, 0.0f, 0.0f, paint2);
                                aRTTextShadowNode = aRTTextShadowNode2;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                float f3 = f * aRTShapeShadowNode2.A00;
                aRTShapeShadowNode = aRTShapeShadowNode2;
                if (f3 > 0.01f) {
                    canvas.save();
                    Matrix matrix2 = aRTShapeShadowNode2.A01;
                    if (matrix2 != null) {
                        canvas.concat(matrix2);
                    }
                    if (aRTShapeShadowNode2.A00 != null) {
                        if (aRTShapeShadowNode2.A0F(paint, f3)) {
                            canvas.drawPath(aRTShapeShadowNode2.A00, paint);
                        }
                        boolean A0G = aRTShapeShadowNode2.A0G(paint, f3);
                        aRTTextShadowNode = aRTShapeShadowNode2;
                        if (A0G) {
                            canvas.drawPath(aRTShapeShadowNode2.A00, paint);
                            aRTTextShadowNode = aRTShapeShadowNode2;
                        }
                    } else {
                        throw new RuntimeException("Shapes should have a valid path (d) prop");
                    }
                }
                aRTShapeShadowNode.Cm6();
                return;
            }
            canvas.restore();
            aRTShapeShadowNode = aRTTextShadowNode;
            aRTShapeShadowNode.Cm6();
            return;
        }
        ARTGroupShadowNode aRTGroupShadowNode = (ARTGroupShadowNode) this;
        float f4 = f * aRTGroupShadowNode.A00;
        if (f4 > 0.01f) {
            canvas.save();
            Matrix matrix3 = aRTGroupShadowNode.A01;
            if (matrix3 != null) {
                canvas.concat(matrix3);
            }
            RectF rectF = aRTGroupShadowNode.A00;
            if (rectF != null) {
                float f5 = rectF.left;
                float f6 = aRTGroupShadowNode.A02;
                canvas.clipRect(f5 * f6, rectF.top * f6, rectF.right * f6, rectF.bottom * f6);
            }
            for (int i2 = 0; i2 < aRTGroupShadowNode.AnH(); i2++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) aRTGroupShadowNode.A06(i2);
                aRTVirtualNode.A0E(canvas, paint, f4);
                aRTVirtualNode.Cm6();
            }
            canvas.restore();
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.A00 = f;
        A07();
    }

    @ReactProp(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        int size;
        if (readableArray != null) {
            float[] fArr = A03;
            if (readableArray.size() > 9) {
                size = 9;
            } else {
                size = readableArray.size();
            }
            for (int i = 0; i < size; i++) {
                fArr[i] = (float) readableArray.getDouble(i);
            }
            int size2 = readableArray.size();
            if (size2 == 6) {
                float[] fArr2 = A04;
                fArr2[0] = fArr[0];
                fArr2[1] = fArr[2];
                float f = fArr[4];
                float f2 = this.A02;
                fArr2[2] = f * f2;
                fArr2[3] = fArr[1];
                fArr2[4] = fArr[3];
                fArr2[5] = fArr[5] * f2;
                fArr2[6] = 0.0f;
                fArr2[7] = 0.0f;
                fArr2[8] = 1.0f;
                Matrix matrix = this.A01;
                if (matrix == null) {
                    matrix = new Matrix();
                    this.A01 = matrix;
                }
                matrix.setValues(fArr2);
            } else if (size2 != -1) {
                throw new RuntimeException("Transform matrices must be of size 6");
            }
        } else {
            this.A01 = null;
        }
        A07();
    }
}
