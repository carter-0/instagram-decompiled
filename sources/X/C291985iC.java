package X;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.Deprecated;

/* renamed from: X.5iC  reason: invalid class name and case insensitive filesystem */
public final class C291985iC extends Canvas {
    public Canvas A00;

    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean clipPath(Path path) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void concat(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.concat(matrix);
        }
    }

    public final void disableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C11428STn.A02(canvas);
        }
    }

    public final void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawARGB(i, i2, i3, i4);
        }
    }

    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawArc(rectF, f, f2, z, paint);
        }
    }

    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawBitmap(bitmap, matrix, paint);
        }
    }

    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
        }
    }

    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawCircle(f, f2, f3, paint);
        }
    }

    public final void drawColor(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawColor(i);
        }
    }

    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        }
        Paint paint2 = paint;
        C11428STn.A06(canvas, paint2, rectF, rectF2, fArr, fArr2);
    }

    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        }
        Font font2 = font;
        Paint paint2 = paint;
        AE6.A02(canvas, paint2, font2, fArr, iArr, i, i2, i3);
    }

    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawLine(f, f2, f3, f4, paint);
        }
    }

    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawLines(fArr, paint);
        }
    }

    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawOval(rectF, paint);
        }
    }

    public final void drawPaint(Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPaint(paint);
        }
    }

    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AE6.A00(canvas, ninePatch, paint, rect);
        }
    }

    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public final void drawPicture(Picture picture) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPicture(picture);
        }
    }

    public final void drawPoint(float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPoints(fArr, paint);
        }
    }

    @Deprecated(message = "Deprecated in Java")
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPosText(str, fArr, paint);
        }
    }

    public final void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawRGB(i, i2, i3);
        }
    }

    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawRect(rect, paint);
        }
    }

    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C11428STn.A08(canvas, renderNode);
        }
    }

    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawRoundRect(rectF, f, f2, paint);
        }
    }

    public final void drawText(String str, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawText(str, f, f2, paint);
        }
    }

    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawTextOnPath(str, path, f, f2, paint);
        }
    }

    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
        }
    }

    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
        }
    }

    public final void enableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C11428STn.A03(canvas);
        }
    }

    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public final int getDensity() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getDensity();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getHeight() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getHeight();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.getMatrix(matrix);
        }
    }

    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getSaveCount() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getWidth() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getWidth();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isOpaque() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean quickReject(Path path) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return C18665VwN.A01(canvas, path);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void restore() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.restore();
        }
    }

    public final void restoreToCount(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.restoreToCount(i);
        }
    }

    public final void rotate(float f) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.rotate(f);
        }
    }

    public final int save() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.save();
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void scale(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.scale(f, f2);
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.setBitmap(bitmap);
        }
    }

    public final void setDensity(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.setDensity(i);
        }
    }

    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.setDrawFilter(drawFilter);
        }
    }

    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.setMatrix(matrix);
        }
    }

    public final void skew(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.skew(f, f2);
        }
    }

    public final void translate(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.translate(f, f2);
        }
    }

    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(f, f2, f3, f4);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        }
    }

    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawBitmap(bitmap, f, f2, paint);
        }
    }

    public final void drawColor(long j) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C11428STn.A04(canvas, j);
        }
    }

    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        }
        Paint paint2 = paint;
        C11428STn.A05(canvas, paint2, rectF, rectF2, f, f2, f3, f4);
    }

    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawLines(fArr, i, i2, paint);
        }
    }

    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawOval(f, f2, f3, f4, paint);
        }
    }

    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AE6.A01(canvas, ninePatch, paint, rectF);
        }
    }

    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPicture(picture, rect);
        }
    }

    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPoints(fArr, i, i2, paint);
        }
    }

    @Deprecated(message = "Deprecated in Java")
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPosText(cArr, i, i2, fArr, paint);
        }
    }

    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawRect(f, f2, f3, f4, paint);
        }
    }

    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        }
    }

    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
        }
    }

    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
        }
    }

    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
        }
    }

    public final boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return C18665VwN.A00(canvas, f, f2, f3, f4);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i2);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(i, i2, i3, i4);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(i, i2, i3, i4);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        }
    }

    public final void drawColor(int i, BlendMode blendMode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C11428STn.A00(blendMode, canvas, i);
        }
    }

    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawPicture(picture, rectF);
        }
    }

    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawRect(rectF, paint);
        }
    }

    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawText(str, i, i2, f, f2, paint);
        }
    }

    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4, edgeType);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint, i);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        }
        Paint paint2 = paint;
        C11428STn.A07(canvas, paint2, measuredText, f, f2, i, i2, i3, i4, z);
    }

    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4, op);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
        }
    }

    public final void drawColor(long j, BlendMode blendMode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C11428STn.A01(blendMode, canvas, j);
        }
    }

    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawText(cArr, i, i2, f, f2, paint);
        }
    }

    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawColor(i, mode);
        }
    }

    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Deprecated in Java")
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
        }
    }

    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            0qQ.A0F("nativeCanvas");
            throw AnonymousClass00P.createAndThrow();
        } else {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        }
    }

    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return C18665VwN.A02(canvas, rectF);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        0qQ.A0F("nativeCanvas");
        throw AnonymousClass00P.createAndThrow();
    }
}
