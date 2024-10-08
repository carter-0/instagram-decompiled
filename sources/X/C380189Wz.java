package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;

/* renamed from: X.9Wz  reason: invalid class name and case insensitive filesystem */
public final class C380189Wz extends Drawable implements C369888vU {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Canvas A03;
    public String A04;
    public String A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final Paint A0L;
    public final PorterDuffXfermode A0M = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    public final PorterDuffXfermode A0N = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    public final RectF A0O = AnonymousClass7TE.A0Y();
    public final String A0P;
    public final String A0Q;
    public final boolean A0R;

    public final void EZP(String str) {
        0qQ.A0B(str, 0);
        this.A05 = str;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        canvas2.save();
        canvas2.translate((float) this.A00, (float) this.A01);
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        Canvas canvas3 = this.A03;
        if (canvas3 != null) {
            float f = (float) this.A0D;
            float f2 = this.A06;
            float f3 = this.A08;
            int i = this.A0H;
            int i2 = (int) ((((f - f2) - (f3 * 2.0f)) - ((float) (i * 4))) / 2.0f);
            int i3 = this.A0C;
            int i4 = (i3 - this.A0F) / 2;
            String str = this.A04;
            String str2 = str;
            if (str == null || (!this.A0R && str.charAt(0) != '1')) {
                str = null;
            }
            Canvas canvas4 = canvas3;
            A00(canvas4, str, i2, i4, 0);
            if (!this.A0R) {
                Paint paint = this.A0L;
                paint.setTextAlign(Paint.Align.LEFT);
                paint.setTextSize(this.A09);
                canvas3.drawText(this.A0Q, ((float) i2) + this.A0A, (float) ((i3 / 2) + (this.A0J / 2)), paint);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(this.A0B);
            }
            float f4 = (float) i;
            int i5 = (int) (f4 + f3);
            int i6 = i2 + i5;
            A00(canvas3, str2, i6, i4, 1);
            int i7 = i6 + ((int) (f4 + f2));
            int i8 = i4;
            String str3 = this.A0P;
            A00(canvas4, str3, i7, i8, 0);
            A00(canvas4, str3, i7 + i5, i8, 1);
            Paint paint2 = this.A0L;
            paint2.setXfermode(this.A0M);
            float f5 = f3 / 2.0f;
            canvas3.drawRect(0.0f, ((float) (i3 / 2)) - f5, f, ((float) (i3 / 2)) + f5, paint2);
        }
        this.A0L.setXfermode((Xfermode) null);
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        canvas2.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        Bitmap bitmap;
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00 = rect.left;
        this.A01 = rect.top;
        Bitmap bitmap2 = this.A02;
        if (bitmap2 == null || bitmap2.getWidth() != rect.width() || (bitmap = this.A02) == null || bitmap.getHeight() != rect.height()) {
            Bitmap A0B2 = AnonymousClass7TF.A0B(rect.width(), rect.height());
            this.A03 = new Canvas(A0B2);
            this.A02 = A0B2;
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C380189Wz(android.content.Context r11, android.content.res.Resources r12, long r13) {
        /*
            r10 = this;
            r2 = 1056964608(0x3f000000, float:0.5)
            r0 = 3
            X.0qQ.A0B(r12, r0)
            r10.<init>()
            r4 = 1
            android.graphics.Paint r3 = X.AnonymousClass7TE.A0V(r4)
            r10.A0L = r3
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            r10.A0M = r0
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            r10.A0N = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r10.A0O = r0
            boolean r9 = android.text.format.DateFormat.is24HourFormat(r11)
            r10.A0R = r9
            int r0 = X.AnonymousClass8XF.A01(r11)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r1 = (int) r0
            r10.A0D = r1
            java.lang.String r0 = ""
            r10.A05 = r0
            float r5 = (float) r1
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            android.graphics.RectF r0 = X.0nA.A01
            r0 = 1127612416(0x43360000, float:182.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r5 = r5 / r0
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r3.setTextAlign(r0)
            android.graphics.Typeface r0 = X.AnonymousClass7TG.A0O(r11)
            r3.setTypeface(r0)
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r0 = 1116209152(0x42880000, float:68.0)
            float r2 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r2 = r2 * r5
            r10.A0B = r2
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r8 = 12
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r0 = r0 * r5
            r10.A09 = r0
            r0 = 2131100789(0x7f060475, float:1.781397E38)
            int r0 = r12.getColor(r0)
            r10.A0G = r0
            r0 = 2131100790(0x7f060476, float:1.7813971E38)
            int r0 = r12.getColor(r0)
            r10.A0E = r0
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r0 = r0 * r5
            r10.A07 = r0
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r0 = r0 * r5
            r10.A08 = r0
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r7 = 10
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r0 = r0 * r5
            r10.A06 = r0
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r0 = r0 * r5
            r10.A0A = r0
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r6.setTimeInMillis(r13)
            if (r9 == 0) goto L_0x013c
            r0 = 11
            int r1 = r6.get(r0)
        L_0x00c8:
            if (r1 >= r7) goto L_0x0137
            r0 = 48
            java.lang.String r0 = X.002.A00(r0, r1)
        L_0x00d0:
            r10.A04 = r0
            int r1 = r6.get(r8)
            if (r1 >= r7) goto L_0x0132
            r0 = 48
            java.lang.String r0 = X.002.A00(r0, r1)
        L_0x00de:
            r10.A0P = r0
            r0 = 9
            int r0 = r6.get(r0)
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = "AM"
        L_0x00ea:
            r10.A0Q = r0
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r0 = 1109917696(0x42280000, float:42.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r0 = r0 * r5
            int r0 = (int) r0
            r10.A0H = r0
            android.util.DisplayMetrics r1 = r12.getDisplayMetrics()
            r0 = 1115947008(0x42840000, float:66.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            float r0 = r0 * r5
            int r0 = (int) r0
            r10.A0F = r0
            r10.A0C = r0
            r3.setTextSize(r2)
            android.graphics.Rect r2 = X.AnonymousClass7TE.A0W()
            java.lang.String r0 = "4"
            r1 = 0
            r3.getTextBounds(r0, r1, r4, r2)
            int r0 = r2.height()
            r10.A0J = r0
            int r0 = r2.width()
            r10.A0K = r0
            java.lang.String r0 = "1"
            r3.getTextBounds(r0, r1, r4, r2)
            int r0 = r2.width()
            r10.A0I = r0
            return
        L_0x012f:
            java.lang.String r0 = "PM"
            goto L_0x00ea
        L_0x0132:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x00de
        L_0x0137:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x00d0
        L_0x013c:
            int r1 = r6.get(r7)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r0 = "12"
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380189Wz.<init>(android.content.Context, android.content.res.Resources, long):void");
    }

    private final void A00(Canvas canvas, String str, int i, int i2, int i3) {
        RectF rectF = this.A0O;
        float f = (float) i;
        float f2 = (float) i2;
        int i4 = this.A0H;
        float f3 = (float) (i4 + i);
        int i5 = this.A0F;
        rectF.set(f, f2, f3, (float) (i5 + i2));
        Paint paint = this.A0L;
        paint.setColor(this.A0E);
        float f4 = this.A07;
        Canvas canvas2 = canvas;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        paint.setColor(this.A0G);
        paint.setXfermode(this.A0N);
        canvas2.drawRect(f, f2, f3, (float) (i2 + (i5 / 2)), paint);
        paint.setXfermode((Xfermode) null);
        paint.setColor(-1);
        String str2 = str;
        if (str != null) {
            int i6 = i3;
            int i7 = i + (i4 / 2);
            if (str2.charAt(i6) == '1') {
                i7 = (i7 + (this.A0K / 2)) - (this.A0I / 2);
            }
            canvas2.drawText(str2, i6, i3 + 1, (float) i7, (float) ((this.A0C / 2) + (this.A0J / 2)), paint);
        }
    }

    public final String getId() {
        return this.A05;
    }

    public final int getIntrinsicHeight() {
        return this.A0C;
    }

    public final int getIntrinsicWidth() {
        return this.A0D;
    }
}
