package com.instagram.debug.image;

import X.AnonymousClass578;
import X.AnonymousClass7TE;
import X.C270234gP;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.debug.image.ImageDebugConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

public class DebugOverlayDrawerImpl implements C270234gP {
    public static final int ERROR_BACKGROUND_COLOR = -1057030144;
    public static final int NORMAL_BACKGROUND_COLOR = -1073741824;
    public final Paint mBackgroundPaint = new Paint();
    public final ImageDebugConfiguration mConfig;
    public final Paint mFramePaint;
    public final Paint mTextPaint;

    public static int fixScanNum(int i, int i2) {
        return i == -1 ? i2 : i;
    }

    private void drawConciseOverlay(Canvas canvas, ArrayList arrayList, boolean z, AnonymousClass578 r19) {
        int i;
        Canvas canvas2 = canvas;
        int width = canvas2.getWidth();
        int height = canvas2.getHeight();
        if (height < width) {
            width = height;
        }
        int max = Math.max(width / 32, 32);
        if (this.mConfig.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.COLOR) {
            this.mFramePaint.setColor(getLoadSourceColor(r19));
            canvas2.drawRect(0.0f, (float) (height - max), (float) max, (float) height, this.mFramePaint);
            i = max;
        } else {
            i = 0;
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            float f = (float) max;
            float f2 = f / 4.0f;
            this.mTextPaint.setTextSize(f);
            StringBuilder sb = new StringBuilder((String) arrayList2.get(0));
            for (int i2 = 1; i2 < arrayList2.size(); i2++) {
                sb.append(", ");
                sb.append((String) arrayList2.get(i2));
            }
            String obj = sb.toString();
            float measureText = this.mTextPaint.measureText(obj);
            Paint paint = this.mBackgroundPaint;
            int i3 = NORMAL_BACKGROUND_COLOR;
            if (z) {
                i3 = ERROR_BACKGROUND_COLOR;
            }
            paint.setColor(i3);
            float f3 = (float) i;
            float f4 = (float) height;
            canvas2.drawRect(f3, (float) (height - max), measureText + f3 + (f2 * 2.0f), f4, this.mBackgroundPaint);
            canvas2.drawText(obj, f3 + f2, f4 - (((this.mTextPaint.descent() - this.mTextPaint.ascent()) - f) / 2.0f), this.mTextPaint);
        }
    }

    private void drawVerboseOverlay(Canvas canvas, ArrayList arrayList, boolean z, AnonymousClass578 r19) {
        Canvas canvas2 = canvas;
        int width = canvas2.getWidth();
        int height = canvas2.getHeight();
        if (this.mConfig.mShowLoadSource == ImageDebugConfiguration.LoadSourceDisplayMode.COLOR) {
            Paint paint = this.mFramePaint;
            int i = width;
            if (height < width) {
                i = height;
            }
            paint.setStrokeWidth((float) (i / 40));
            this.mFramePaint.setColor(getLoadSourceColor(r19));
            canvas2.drawRect(0.0f, 0.0f, (float) width, (float) height, this.mFramePaint);
        }
        if (!arrayList.isEmpty()) {
            int i2 = width;
            if (height < width) {
                i2 = height;
            }
            float f = (float) (i2 / 8);
            float f2 = f / 4.0f;
            this.mTextPaint.setTextSize(f);
            float size = ((float) arrayList.size()) * f;
            float f3 = 0.0f;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f3 = Math.max(this.mTextPaint.measureText(AnonymousClass7TE.A18(it)), f3);
            }
            float f4 = (float) width;
            if (f3 > f4) {
                float f5 = f4 / f3;
                f *= f5;
                f2 *= f5;
                f3 *= f5;
                size *= f5;
                this.mTextPaint.setTextSize(f);
            }
            Paint paint2 = this.mBackgroundPaint;
            int i3 = NORMAL_BACKGROUND_COLOR;
            if (z) {
                i3 = ERROR_BACKGROUND_COLOR;
            }
            paint2.setColor(i3);
            float f6 = (float) height;
            float f7 = (f6 - size) / 2.0f;
            canvas2.drawRect(((f4 - f3) / 2.0f) - f2, f7, ((f4 + f3) / 2.0f) + f2, ((f6 + size) / 2.0f) + f2, this.mBackgroundPaint);
            float f8 = f7 + f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                canvas2.drawText(AnonymousClass7TE.A18(it2), (float) (width / 2), f8, this.mTextPaint);
                f8 += f;
            }
        }
    }

    public static int getLoadSourceColor(AnonymousClass578 r1) {
        int i;
        boolean z;
        if (r1 != null) {
            String str = r1.A07;
            switch (str.hashCode()) {
                case -1077756671:
                    z = str.equals("memory");
                    i = -16711936;
                    break;
                case 3083677:
                    z = str.equals("disk");
                    i = -256;
                    break;
                case 1843485230:
                    z = str.equals("network");
                    i = -65536;
                    break;
            }
            if (!z) {
                return -7829368;
            }
            return i;
        }
        return -7829368;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01a9, code lost:
        if (r7.getHeight() <= (r23 * 2)) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ac, code lost:
        if (r25 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01b2, code lost:
        if (r3.mConfig.mShowOffscreenPixelsPerc == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01b4, code lost:
        if (r10 == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01b6, code lost:
        r6 = "offscreen_pixels_percent:";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01b8, code lost:
        r2.add(X.002.A0c(r6, "%", getOffscreenPixelsPerc(java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r8), r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01cf, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01dc, code lost:
        if (r25 != null) goto L_0x019a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawOverlay(android.graphics.Canvas r21, int r22, int r23, X.AnonymousClass578 r24, android.graphics.Bitmap r25) {
        /*
            r20 = this;
            r3 = r20
            com.instagram.debug.image.ImageDebugConfiguration r5 = r3.mConfig
            boolean r0 = r5.mIsImageOverlayEnabled
            if (r0 == 0) goto L_0x0112
            com.instagram.debug.image.ImageDebugConfiguration$OverlayDisplayMode r1 = r5.mOverlayDisplayMode
            com.instagram.debug.image.ImageDebugConfiguration$OverlayDisplayMode r0 = com.instagram.debug.image.ImageDebugConfiguration.OverlayDisplayMode.VERBOSE
            boolean r10 = X.AnonymousClass7TF.A1W(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            boolean r1 = r5.mShowRes
            java.lang.String r13 = "("
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x014a
            boolean r0 = r5.mShowViewRes
            if (r0 != 0) goto L_0x014a
            boolean r0 = r5.mShowOffscreenPixelsPerc
            if (r0 != 0) goto L_0x014a
            r5 = 0
        L_0x0025:
            com.instagram.debug.image.ImageDebugConfiguration r8 = r3.mConfig
            boolean r0 = r8.mShowScans
            r7 = -1
            r6 = r24
            if (r0 == 0) goto L_0x0056
            if (r24 == 0) goto L_0x0143
            r0 = r6
        L_0x0031:
            int r9 = r0.A02
            if (r9 != r7) goto L_0x0037
            r9 = 9
        L_0x0037:
            int r1 = r0.A01
            if (r1 != r7) goto L_0x003c
            r1 = r9
        L_0x003c:
            int r0 = r0.A00
            if (r0 != r7) goto L_0x0041
            r0 = r1
        L_0x0041:
            if (r10 == 0) goto L_0x0140
            java.lang.String r14 = "scans:"
        L_0x0045:
            java.lang.String r15 = "/"
            r16 = r15
            r18 = r1
            r19 = r9
            r17 = r0
            java.lang.String r0 = X.002.A0p(r14, r15, r16, r17, r18, r19)
            r2.add(r0)
        L_0x0056:
            boolean r0 = r8.mShowHdrInfo
            if (r0 == 0) goto L_0x006a
            if (r24 == 0) goto L_0x0139
            r0 = r6
        L_0x005d:
            if (r10 == 0) goto L_0x012d
            java.lang.String r1 = "has_gainmap:"
            boolean r0 = r0.A08
            java.lang.String r0 = X.002.A1D(r1, r0)
        L_0x0067:
            r2.add(r0)
        L_0x006a:
            boolean r0 = r8.mShowFileSize
            if (r0 == 0) goto L_0x008d
            if (r24 == 0) goto L_0x0129
            long r0 = r6.A03
        L_0x0072:
            if (r10 == 0) goto L_0x0126
            java.lang.String r9 = "file_size:"
        L_0x0076:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%,dB"
            java.lang.String r0 = java.lang.String.format(r8, r0, r1)
            java.lang.String r0 = X.002.A0R(r9, r0)
            r2.add(r0)
        L_0x008d:
            com.instagram.debug.image.ImageDebugConfiguration r0 = r3.mConfig
            boolean r0 = r0.mShowFileExtension
            if (r0 == 0) goto L_0x00ce
            if (r24 == 0) goto L_0x0124
            com.instagram.common.typedurl.ImageUrl r0 = r6.A04
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x0124
            android.net.Uri r8 = X.0cp.A03(r0)
            java.lang.String r1 = r8.getPath()
            if (r1 == 0) goto L_0x0122
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 == r7) goto L_0x0122
            java.lang.String r7 = r1.substring(r0)
        L_0x00b5:
            java.lang.String r0 = "stp"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = ")"
            java.lang.String r7 = X.002.A0u(r7, r13, r1, r0)
        L_0x00c3:
            if (r10 == 0) goto L_0x0120
            java.lang.String r0 = "file_ext:"
        L_0x00c7:
            java.lang.String r0 = X.002.A0R(r0, r7)
            r2.add(r0)
        L_0x00ce:
            com.instagram.debug.image.ImageDebugConfiguration r7 = r3.mConfig
            boolean r0 = r7.mShowCacheKey
            if (r0 == 0) goto L_0x00e3
            if (r10 == 0) goto L_0x011e
            java.lang.String r1 = "cache_key:"
        L_0x00d8:
            if (r24 == 0) goto L_0x011b
            java.lang.String r0 = r6.A05
        L_0x00dc:
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.add(r0)
        L_0x00e3:
            boolean r0 = r7.mShowColorFidelity
            if (r0 == 0) goto L_0x00f6
            if (r10 == 0) goto L_0x0119
            java.lang.String r1 = "color_fidelity:"
        L_0x00eb:
            if (r24 == 0) goto L_0x0116
            java.lang.String r0 = r6.A06
        L_0x00ef:
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.add(r0)
        L_0x00f6:
            com.instagram.debug.image.ImageDebugConfiguration$LoadSourceDisplayMode r1 = r7.mShowLoadSource
            com.instagram.debug.image.ImageDebugConfiguration$LoadSourceDisplayMode r0 = com.instagram.debug.image.ImageDebugConfiguration.LoadSourceDisplayMode.NAME
            if (r1 != r0) goto L_0x010b
            if (r10 == 0) goto L_0x0100
            java.lang.String r4 = "load_source:"
        L_0x0100:
            if (r24 == 0) goto L_0x0113
            java.lang.String r0 = r6.A07
        L_0x0104:
            java.lang.String r0 = X.002.A0R(r4, r0)
            r2.add(r0)
        L_0x010b:
            r0 = r21
            if (r10 == 0) goto L_0x01e2
            r3.drawVerboseOverlay(r0, r2, r5, r6)
        L_0x0112:
            return
        L_0x0113:
            java.lang.String r0 = "Unknown"
            goto L_0x0104
        L_0x0116:
            java.lang.String r0 = "no color fidelity"
            goto L_0x00ef
        L_0x0119:
            r1 = r4
            goto L_0x00eb
        L_0x011b:
            java.lang.String r0 = "no cache key"
            goto L_0x00dc
        L_0x011e:
            r1 = r4
            goto L_0x00d8
        L_0x0120:
            r0 = r4
            goto L_0x00c7
        L_0x0122:
            r7 = r4
            goto L_0x00b5
        L_0x0124:
            r7 = r4
            goto L_0x00c3
        L_0x0126:
            r9 = r4
            goto L_0x0076
        L_0x0129:
            r0 = -1
            goto L_0x0072
        L_0x012d:
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "HDR"
            goto L_0x0067
        L_0x0135:
            java.lang.String r0 = "SDR"
            goto L_0x0067
        L_0x0139:
            X.578 r0 = new X.578
            r0.<init>()
            goto L_0x005d
        L_0x0140:
            r14 = r4
            goto L_0x0045
        L_0x0143:
            X.578 r0 = new X.578
            r0.<init>()
            goto L_0x0031
        L_0x014a:
            java.lang.String r12 = "x"
            r7 = r25
            if (r25 == 0) goto L_0x0165
            if (r1 == 0) goto L_0x0165
            if (r10 == 0) goto L_0x01df
            java.lang.String r5 = "resolution:"
        L_0x0156:
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            java.lang.String r0 = X.002.A02(r1, r0, r5, r12)
            r2.add(r0)
        L_0x0165:
            com.instagram.debug.image.ImageDebugConfiguration r0 = r3.mConfig
            boolean r0 = r0.mShowViewRes
            r1 = r22
            r8 = r23
            if (r0 == 0) goto L_0x01dc
            if (r22 == 0) goto L_0x01dc
            if (r23 == 0) goto L_0x01dc
            java.lang.String r11 = "view:"
            if (r25 == 0) goto L_0x01d1
            int r0 = r7.getWidth()
            int r5 = r0 * 100
            int r5 = r5 / r22
            int r0 = r7.getHeight()
            int r0 = r0 * 100
            int r0 = r0 / r23
            int r17 = java.lang.Math.min(r5, r0)
            if (r10 != 0) goto L_0x018e
            r11 = r4
        L_0x018e:
            java.lang.String r14 = "%)"
            r15 = r1
            r16 = r8
            java.lang.String r0 = X.002.A0z(r11, r12, r13, r14, r15, r16, r17)
            r2.add(r0)
        L_0x019a:
            int r5 = r7.getWidth()
            int r0 = r22 * 2
            if (r5 <= r0) goto L_0x01ab
            int r6 = r7.getHeight()
            int r0 = r23 * 2
            r5 = 1
            if (r6 > r0) goto L_0x01ae
        L_0x01ab:
            r5 = 0
            if (r25 == 0) goto L_0x0025
        L_0x01ae:
            com.instagram.debug.image.ImageDebugConfiguration r0 = r3.mConfig
            boolean r0 = r0.mShowOffscreenPixelsPerc
            if (r0 == 0) goto L_0x0025
            if (r10 == 0) goto L_0x01cf
            java.lang.String r6 = "offscreen_pixels_percent:"
        L_0x01b8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            int r1 = getOffscreenPixelsPerc(r1, r0, r7)
            java.lang.String r0 = "%"
            java.lang.String r0 = X.002.A0c(r6, r0, r1)
            r2.add(r0)
            goto L_0x0025
        L_0x01cf:
            r6 = r4
            goto L_0x01b8
        L_0x01d1:
            if (r10 != 0) goto L_0x01d4
            r11 = r4
        L_0x01d4:
            java.lang.String r0 = X.002.A02(r1, r8, r11, r12)
            r2.add(r0)
            goto L_0x01ab
        L_0x01dc:
            if (r25 == 0) goto L_0x01ab
            goto L_0x019a
        L_0x01df:
            r5 = r4
            goto L_0x0156
        L_0x01e2:
            r3.drawConciseOverlay(r0, r2, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.image.DebugOverlayDrawerImpl.drawOverlay(android.graphics.Canvas, int, int, X.578, android.graphics.Bitmap):void");
    }

    public DebugOverlayDrawerImpl(ImageDebugConfiguration imageDebugConfiguration) {
        Paint.Style style;
        this.mConfig = imageDebugConfiguration;
        Paint paint = new Paint();
        this.mTextPaint = paint;
        Paint paint2 = new Paint();
        this.mFramePaint = paint2;
        paint.setColor(-1);
        if (imageDebugConfiguration.mOverlayDisplayMode == ImageDebugConfiguration.OverlayDisplayMode.CONCISE) {
            paint.setTextAlign(Paint.Align.LEFT);
            style = Paint.Style.FILL;
        } else {
            paint.setTextAlign(Paint.Align.CENTER);
            style = Paint.Style.STROKE;
        }
        paint2.setStyle(style);
    }

    public static int getOffscreenPixelsPerc(Integer num, Integer num2, Bitmap bitmap) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        float min = Math.min(((float) bitmap.getWidth()) / ((float) intValue), ((float) bitmap.getHeight()) / ((float) intValue2));
        int i = (int) (((float) (intValue * intValue2)) * min * min);
        int width = bitmap.getWidth() * bitmap.getHeight();
        return ((width - i) * 100) / width;
    }

    public void drawOverlay(Canvas canvas, ImageView imageView, AnonymousClass578 r11, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (this.mConfig.mIsImageOverlayEnabled) {
            if (bitmap == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BitmapDrawable) {
                    bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            drawOverlay(canvas, imageView.getWidth(), imageView.getHeight(), r11, bitmap2);
        }
    }
}
