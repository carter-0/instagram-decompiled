package com.facebook.smartcapture.diagnostic;

import X.0qQ;
import X.AnonymousClass1GB;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.JTO;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DiagnosticView extends View {
    public static final Companion Companion = new Object();
    public static final int TEXT_HORIZONTAL_PADDING = 5;
    public final float density = getResources().getDisplayMetrics().density;
    public DiagnosticInfo diagnosticInfo;
    public float scale;
    public float verticalOffset;

    public final class Companion {
        private final int convertToUnsigned(int i) {
            return i < 0 ? i + 256 : i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: byte} */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int[] createPixelColorArray(byte[] r9) {
            /*
                r8 = this;
                int r0 = r9.length
                int r7 = r0 / 4
                int[] r6 = new int[r7]
                r5 = 0
            L_0x0006:
                if (r5 >= r7) goto L_0x002b
                int r4 = r5 * 4
                r3 = 255(0xff, float:3.57E-43)
                byte r2 = r9[r4]
                if (r2 >= 0) goto L_0x0012
                int r2 = r2 + 256
            L_0x0012:
                int r0 = r4 + 1
                byte r1 = r9[r0]
                if (r1 >= 0) goto L_0x001a
                int r1 = r1 + 256
            L_0x001a:
                int r0 = r4 + 2
                byte r0 = r9[r0]
                if (r0 >= 0) goto L_0x0022
                int r0 = r0 + 256
            L_0x0022:
                int r0 = android.graphics.Color.argb(r3, r2, r1, r0)
                r6[r5] = r0
                int r5 = r5 + 1
                goto L_0x0006
            L_0x002b:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.diagnostic.DiagnosticView.Companion.createPixelColorArray(byte[]):int[]");
        }

        private final int colorFloatToInt(float f) {
            return AnonymousClass1GB.A01(f * 255.0f);
        }

        /* access modifiers changed from: private */
        public final void setPaintColor(Paint paint, Color color) {
            paint.setARGB(AnonymousClass1GB.A01(color.alpha * 255.0f), AnonymousClass1GB.A01(color.red * 255.0f), AnonymousClass1GB.A01(color.green * 255.0f), AnonymousClass1GB.A01(color.blue * 255.0f));
        }

        /* access modifiers changed from: private */
        public final Rect getTextBackgroundSize(float f, float f2, String str, TextPaint textPaint) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            return new Rect((int) (f - 5.0f), (int) (fontMetrics.top + f2), (int) (f + textPaint.measureText(str) + 5.0f), (int) (f2 + fontMetrics.bottom));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        DiagnosticInfo diagnosticInfo2 = this.diagnosticInfo;
        if (diagnosticInfo2 != null) {
            this.scale = ((float) getWidth()) / ((float) diagnosticInfo2.previewWidth);
            this.verticalOffset = (AnonymousClass7TE.A03(this) - ((((float) getWidth()) * ((float) diagnosticInfo2.previewHeight)) / ((float) diagnosticInfo2.previewWidth))) / 2.0f;
            drawImages(canvas, diagnosticInfo2);
            drawPolygons(canvas, diagnosticInfo2);
            drawPoints(canvas, diagnosticInfo2);
            drawSegments(canvas, diagnosticInfo2);
            drawTexts(canvas, diagnosticInfo2);
        }
    }

    public final void setDiagnosticInfo(DiagnosticInfo diagnosticInfo2) {
        0qQ.A0B(diagnosticInfo2, 0);
        this.diagnosticInfo = diagnosticInfo2;
        postInvalidate();
    }

    private final void drawImages(Canvas canvas, DiagnosticInfo diagnosticInfo2) {
        for (ImageAnnotation imageAnnotation : diagnosticInfo2.imageAnnotations) {
            if (!(imageAnnotation.width == 0 || imageAnnotation.height == 0)) {
                int[] access$createPixelColorArray = Companion.createPixelColorArray(imageAnnotation.image);
                int i = imageAnnotation.width;
                Bitmap createBitmap = Bitmap.createBitmap(access$createPixelColorArray, 0, i, i, imageAnnotation.height, Bitmap.Config.ARGB_8888);
                0qQ.A07(createBitmap);
                Point point = imageAnnotation.displayOrigin;
                float f = this.scale;
                int i2 = (int) (((float) point.x) * f);
                int i3 = (int) ((((float) point.y) * f) + this.verticalOffset);
                canvas.drawBitmap(createBitmap, (Rect) null, new Rect(i2, i3, (int) (((float) i2) + (((float) imageAnnotation.displayWidth) * f)), (int) (((float) i3) + (((float) imageAnnotation.displayHeight) * f))), (Paint) null);
                createBitmap.recycle();
            }
        }
    }

    private final void drawPoints(Canvas canvas, DiagnosticInfo diagnosticInfo2) {
        Paint paint = new Paint();
        for (PointAnnotation pointAnnotation : diagnosticInfo2.pointAnnotations) {
            Companion.setPaintColor(paint, pointAnnotation.color);
            Point point = pointAnnotation.point;
            float f = this.scale;
            canvas.drawCircle(((float) point.x) * f, (((float) point.y) * f) + this.verticalOffset, ((float) pointAnnotation.radius) * this.density * f, paint);
        }
    }

    private final void drawPolygons(Canvas canvas, DiagnosticInfo diagnosticInfo2) {
        Paint paint = new Paint();
        for (PolygonAnnotation polygonAnnotation : diagnosticInfo2.polygonAnnotations) {
            Path createPath = createPath(polygonAnnotation.points);
            paint.setStyle(Paint.Style.FILL);
            Companion companion = Companion;
            companion.setPaintColor(paint, polygonAnnotation.fillColor);
            canvas.drawPath(createPath, paint);
            JTO.A1N(paint);
            companion.setPaintColor(paint, polygonAnnotation.borderColor);
            paint.setStrokeWidth(((float) polygonAnnotation.borderWidth) * this.density);
            canvas.drawPath(createPath, paint);
        }
    }

    private final void drawSegments(Canvas canvas, DiagnosticInfo diagnosticInfo2) {
        Paint paint = new Paint();
        for (SegmentAnnotation segmentAnnotation : diagnosticInfo2.segmentAnnotations) {
            Companion.setPaintColor(paint, segmentAnnotation.color);
            paint.setStrokeWidth(((float) segmentAnnotation.lineWidth) * this.density * this.scale);
            Point point = segmentAnnotation.firstPoint;
            float f = this.scale;
            float f2 = this.verticalOffset;
            Point point2 = segmentAnnotation.secondPoint;
            canvas.drawLine(((float) point.x) * f, (((float) point.y) * f) + f2, ((float) point2.x) * f, f2 + (((float) point2.y) * f), paint);
        }
    }

    private final void drawTexts(Canvas canvas, DiagnosticInfo diagnosticInfo2) {
        Paint paint = new Paint();
        TextPaint textPaint = new TextPaint();
        for (TextAnnotation textAnnotation : diagnosticInfo2.textAnnotations) {
            textPaint.setTextSize(((((float) textAnnotation.fontSize) * this.density) * 2.0f) / 3.0f);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            Point point = textAnnotation.topLeftPosition;
            float f = this.scale;
            float f2 = ((float) point.x) * f;
            float f3 = (((float) point.y) - (fontMetrics.top * f)) + this.verticalOffset;
            Companion companion = Companion;
            companion.setPaintColor(paint, textAnnotation.backgroundColor);
            canvas.drawRect(companion.getTextBackgroundSize(f2, f3, textAnnotation.text, textPaint), paint);
            companion.setPaintColor(textPaint, textAnnotation.textColor);
            canvas.drawText(textAnnotation.text, f2, f3, textPaint);
        }
    }

    private final Path createPath(Point[] pointArr) {
        Path A0C = C51965G9l.A0C();
        int length = pointArr.length;
        for (int i = 0; i < length; i++) {
            Point point = pointArr[i];
            float f = this.scale;
            float f2 = ((float) point.x) * f;
            float f3 = (((float) point.y) * f) + this.verticalOffset;
            if (i == 0) {
                A0C.moveTo(f2, f3);
            } else {
                A0C.lineTo(f2, f3);
            }
        }
        A0C.close();
        return A0C;
    }
}
