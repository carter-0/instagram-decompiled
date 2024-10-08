package com.instagram.arlink.ui;

import X.1MF;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass6M0;
import X.AnonymousClass7TE;
import X.C14120TqF;
import X.C51967G9n;
import X.C60008JdH;
import X.C64334La9;
import X.C66387MPt;
import X.JTO;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.instagram.android.R;

public class GridPatternView extends View {
    public static final float[][] A0O = {new float[]{-45.0f, 0.0f, 45.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 45.0f}, new float[]{45.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, -45.0f, 0.0f, 45.0f}};
    public int A00;
    public int A01;
    public C66387MPt A02;
    public Integer A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public Bitmap A0F;
    public Bitmap A0G;
    public Bitmap A0H;
    public Bitmap A0I;
    public Integer A0J = AnonymousClass05K.A00;
    public String A0K;
    public final Matrix A0L = AnonymousClass7TE.A0U();
    public final Paint A0M = JTO.A0C();
    public final TextPaint A0N = new TextPaint();

    private void A00() {
        Bitmap emojiBitmap;
        int intValue = this.A0J.intValue();
        if (intValue == 1) {
            emojiBitmap = getEmojiBitmap();
        } else if (intValue == 2) {
            Resources resources = getResources();
            int i = this.A0B;
            int i2 = this.A0A;
            boolean z = 1MF.A02;
            Rect A0W = AnonymousClass7TE.A0W();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, i, options);
            A0W.right = options.outWidth;
            A0W.bottom = options.outHeight;
            int min = Math.min(Math.max(A0W.width() / i2, A0W.height() / i2), Math.max(A0W.width() / i2, A0W.height() / i2));
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = Math.max(min, 1);
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options2);
            decodeResource.getClass();
            emojiBitmap = 1MF.A0B(decodeResource, i2, i2, true);
        } else if (intValue == 3) {
            emojiBitmap = getSelfieWithStickerBitmap();
        } else {
            return;
        }
        if (emojiBitmap != null && !emojiBitmap.isRecycled()) {
            A02(emojiBitmap, this.A0G, 4);
            int i3 = this.A0C;
            if (i3 % 4 > 0) {
                A02(emojiBitmap, this.A0H, i3 % 4);
            }
        }
    }

    private void A01() {
        TextPaint textPaint = this.A0N;
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        Paint paint = this.A0M;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        this.A04 = AnonymousClass7TE.A01(getResources(), R.dimen.album_preview_add_item_margin);
    }

    private void A02(Bitmap bitmap, Bitmap bitmap2, int i) {
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bitmap2.eraseColor(0);
            Canvas A0B2 = JTO.A0B(bitmap2);
            float width = (((float) (this.A0D - bitmap.getWidth())) / 2.0f) + ((float) this.A07);
            float height = (((float) (this.A0D - bitmap.getHeight())) / 2.0f) + ((float) this.A07);
            float A022 = JTO.A02(bitmap) / 2.0f;
            float A012 = JTO.A01(bitmap) / 2.0f;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = 0;
                do {
                    if (i2 % 2 == i3 % 2) {
                        A0B2.save();
                        int i4 = this.A0D;
                        A0B2.translate(((float) (i3 * i4)) + width, ((float) (i4 * i2)) + height);
                        Matrix matrix = this.A0L;
                        matrix.reset();
                        matrix.setRotate(A0O[i2][i3], A022, A012);
                        A0B2.drawBitmap(bitmap, matrix, this.A0M);
                        A0B2.restore();
                    }
                    i3++;
                } while (i3 < 4);
            }
        }
    }

    private Bitmap getEmojiBitmap() {
        this.A0K.getClass();
        Bitmap bitmap = this.A0F;
        int i = this.A0D;
        Bitmap A082 = 1MF.A08(bitmap, i, i);
        this.A0F = A082;
        Canvas A0B2 = JTO.A0B(A082);
        TextPaint textPaint = this.A0N;
        textPaint.setTextSize(this.A04);
        float measureText = textPaint.measureText(this.A0K);
        if (measureText > 0.0f) {
            textPaint.setTextSize((((float) this.A0D) * this.A04) / measureText);
        }
        StaticLayout staticLayout = new StaticLayout(this.A0K, textPaint, this.A01, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        A0B2.save();
        A0B2.translate((float) (-AnonymousClass6M0.A00(staticLayout)), 0.0f);
        staticLayout.draw(A0B2);
        A0B2.restore();
        C14120TqF tqF = new C14120TqF(this.A0F);
        new C60008JdH(tqF, new C64334La9(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{tqF.A02});
        return this.A0F;
    }

    private Bitmap getSelfieWithStickerBitmap() {
        int i;
        Bitmap bitmap = this.A0I;
        if (bitmap != null && (bitmap.getWidth() > (i = this.A0A) || this.A0I.getHeight() > (i = this.A0A))) {
            this.A0I = 1MF.A0B(this.A0I, i, i, true);
        }
        return this.A0I;
    }

    public Integer getDominantColor() {
        return this.A03;
    }

    public void setEmoji(String str) {
        this.A0K = str;
        this.A03 = null;
        this.A0J = AnonymousClass05K.A01;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public void setSelfieWithSticker(Bitmap bitmap) {
        if (this.A0D > 0) {
            int i = this.A0A;
            bitmap = 1MF.A0B(bitmap, i, i, true);
        }
        this.A0I = bitmap;
        this.A0J = AnonymousClass05K.A0N;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public void setSticker(int i) {
        this.A0B = i;
        this.A0J = AnonymousClass05K.A0C;
        if (this.A01 > 0 && this.A00 > 0) {
            A00();
            invalidate();
        }
    }

    public GridPatternView(Context context) {
        super(context);
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0.isRecycled() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            super.onDraw(r9)
            int r3 = r8.A0E
            int r2 = r8.A01
            int r1 = r8.A00
            int r0 = r8.A06
            int r1 = r1 - r0
            r0 = 0
            r9.clipRect(r0, r3, r2, r1)
            android.graphics.Bitmap r0 = r8.A0G
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x0079
            android.graphics.Bitmap r0 = r8.A0H
            r7 = 1
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isRecycled()
            r6 = 1
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            r4 = 0
        L_0x0028:
            int r0 = r8.A09
            if (r4 >= r0) goto L_0x0079
            r3 = 0
        L_0x002d:
            int r0 = r8.A08
            if (r3 >= r0) goto L_0x0076
            r9.save()
            android.graphics.Bitmap r0 = r8.A0G
            int r0 = r0.getWidth()
            int r0 = r0 * r3
            float r5 = (float) r0
            float r0 = r8.A05
            float r5 = r5 - r0
            int r0 = r3 * 2
            int r1 = r0 + 1
            int r0 = r8.A07
            int r1 = r1 * r0
            float r0 = (float) r1
            float r5 = r5 - r0
            android.graphics.Bitmap r0 = r8.A0G
            int r2 = r0.getHeight()
            int r2 = r2 * r4
            int r0 = r8.A0E
            int r2 = r2 + r0
            int r1 = r4 * 2
            int r0 = r8.A07
            int r1 = r1 * r0
            int r2 = r2 - r1
            float r0 = (float) r2
            r9.translate(r5, r0)
            int r0 = r8.A09
            int r0 = r0 - r7
            if (r4 != r0) goto L_0x0073
            if (r6 == 0) goto L_0x0073
            android.graphics.Bitmap r2 = r8.A0H
            r2.getClass()
        L_0x0068:
            r1 = 0
            r0 = 0
            r9.drawBitmap(r2, r0, r0, r1)
            r9.restore()
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0073:
            android.graphics.Bitmap r2 = r8.A0G
            goto L_0x0068
        L_0x0076:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.ui.GridPatternView.onDraw(android.graphics.Canvas):void");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        int A062 = AnonymousClass0fD.A06(1477078933);
        super.onSizeChanged(i, i2, i3, i4);
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            View view = (View) parent;
            View findViewById = view.findViewById(R.id.top_bar);
            if (findViewById != null) {
                this.A0E = findViewById.getMeasuredHeight();
            }
            View findViewById2 = view.findViewById(R.id.bottom_bar);
            if (findViewById2 != null) {
                this.A06 = findViewById2.getMeasuredHeight();
            }
            if (this.A0E > 0 && this.A06 > 0) {
                break;
            }
        }
        this.A01 = i;
        this.A00 = i2;
        int i5 = (i2 - this.A0E) - this.A06;
        float f = (float) i;
        int ceil = (int) Math.ceil((double) (((float) i5) / (0.2f * f)));
        this.A0C = ceil;
        double sqrt = Math.sqrt(2.0d);
        int i6 = (int) (((double) i5) / ((((double) ceil) + sqrt) - 1.0d));
        this.A0D = i6;
        int i7 = (int) ((((double) i6) * (sqrt - 1.0d)) / 2.0d);
        this.A07 = i7;
        float f2 = (float) i6;
        this.A0A = (int) (0.75f * f2);
        this.A05 = Math.max(C51967G9n.A00(((float) Math.ceil((double) (f / f2))) * f2, f), 0.0f);
        int ceil2 = (int) Math.ceil((double) ((i6 * 4) + (i7 * 2)));
        this.A09 = (int) Math.ceil((double) (((float) ceil) / 4.0f));
        this.A08 = (int) Math.ceil((double) (f / (f2 * 4.0f)));
        this.A0G = 1MF.A08(this.A0G, ceil2, ceil2);
        int i8 = this.A0C % 4;
        if (i8 > 0) {
            bitmap = 1MF.A08(this.A0H, ceil2, (i8 * this.A0D) + (this.A07 * 2));
        } else {
            Bitmap bitmap2 = this.A0H;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.A0H.recycle();
            }
            bitmap = null;
        }
        this.A0H = bitmap;
        A00();
        AnonymousClass0fD.A0D(939819688, A062);
    }

    public void setColorUpdateCallback(C66387MPt mPt) {
        this.A02 = mPt;
    }

    public GridPatternView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public GridPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
