package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.3NY  reason: invalid class name */
public final class AnonymousClass3NY extends AnonymousClass3NZ {
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public U0W A00;
    public boolean A01;
    public ColorFilter A02;
    public PorterDuffColorFilter A03;
    public boolean A04;
    public final Matrix A05;
    public final Rect A06;
    public final float[] A07;

    public final PorterDuffColorFilter A00(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A06;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.A02;
            if (colorFilter == null) {
                colorFilter = this.A03;
            }
            Matrix matrix = this.A05;
            canvas.getMatrix(matrix);
            float[] fArr = this.A07;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(C249703kE.FLAG_MOVED, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(C249703kE.FLAG_MOVED, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate((float) rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                U0W u0w = this.A00;
                Bitmap bitmap = u0w.A04;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == u0w.A04.getHeight())) {
                    u0w.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    u0w.A0A = true;
                }
                boolean z = this.A01;
                U0W u0w2 = this.A00;
                if (!z) {
                    u0w2.A00(min, min2);
                } else if (!(!u0w2.A0A && u0w2.A02 == u0w2.A03 && u0w2.A06 == u0w2.A07 && u0w2.A0B == u0w2.A09 && u0w2.A00 == u0w2.A08.A04)) {
                    u0w2.A00(min, min2);
                    U0W u0w3 = this.A00;
                    u0w3.A02 = u0w3.A03;
                    u0w3.A06 = u0w3.A07;
                    u0w3.A00 = u0w3.A08.A04;
                    u0w3.A0B = u0w3.A09;
                    u0w3.A0A = false;
                }
                U0W u0w4 = this.A00;
                if (u0w4.A08.A04 < 255 || colorFilter != null) {
                    if (u0w4.A05 == null) {
                        Paint paint2 = new Paint();
                        u0w4.A05 = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    u0w4.A05.setAlpha(u0w4.A08.A04);
                    u0w4.A05.setColorFilter(colorFilter);
                    paint = u0w4.A05;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(u0w4.A04, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.A00.A08.A04;
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A00.A01;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.A02;
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return new AnonymousClass9WR(drawable.getConstantState());
        }
        this.A00.A01 = getChangingConfigurations();
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A00.A08.A00;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A00.A08.A01;
    }

    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.UFE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.UFH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.UFE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.UFE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.UFE} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) {
        /*
            r22 = this;
            r9 = r22
            android.graphics.drawable.Drawable r1 = r9.A00
            r21 = r23
            r8 = r24
            r7 = r25
            r6 = r26
            if (r1 == 0) goto L_0x0014
            r0 = r21
            r1.inflate(r0, r8, r7, r6)
            return
        L_0x0014:
            X.U0W r5 = r9.A00
            X.W1h r0 = new X.W1h
            r0.<init>()
            r5.A08 = r0
            int[] r1 = X.C39627A2r.A05
            if (r26 != 0) goto L_0x03cb
            r0 = r21
            android.content.res.TypedArray r12 = r0.obtainAttributes(r7, r1)
        L_0x0027:
            X.U0W r3 = r9.A00
            X.W1h r11 = r3.A08
            java.lang.String r0 = "tintMode"
            r2 = 6
            r1 = -1
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 != 0) goto L_0x03c5
            r0 = -1
        L_0x0036:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1 = 3
            if (r0 == r1) goto L_0x03c1
            r1 = 5
            if (r0 == r1) goto L_0x0045
            r1 = 9
            if (r0 == r1) goto L_0x03bd
            switch(r0) {
                case 14: goto L_0x03b9;
                case 15: goto L_0x03b5;
                case 16: goto L_0x03b1;
                default: goto L_0x0045;
            }
        L_0x0045:
            r3.A07 = r2
            java.lang.String r0 = "tint"
            r4 = 1
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x006f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r12.getValue(r4, r2)
            int r1 = r2.type
            r0 = 2
            if (r1 == r0) goto L_0x0427
            r0 = 28
            if (r1 < r0) goto L_0x0394
            r0 = 31
            if (r1 > r0) goto L_0x0394
            int r0 = r2.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L_0x006b:
            if (r0 == 0) goto L_0x006f
            r3.A03 = r0
        L_0x006f:
            boolean r1 = r3.A09
            java.lang.String r0 = "autoMirrored"
            r19 = 5
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0081
            r0 = r19
            boolean r1 = r12.getBoolean(r0, r1)
        L_0x0081:
            r3.A09 = r1
            float r2 = r11.A03
            java.lang.String r0 = "viewportWidth"
            r1 = 7
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0092
            float r2 = r12.getFloat(r1, r2)
        L_0x0092:
            r11.A03 = r2
            float r3 = r11.A02
            java.lang.String r0 = "viewportHeight"
            r1 = 8
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x00a4
            float r3 = r12.getFloat(r1, r3)
        L_0x00a4:
            r11.A02 = r3
            float r0 = r11.A03
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0417
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0407
            r10 = 3
            float r0 = r11.A01
            float r0 = r12.getDimension(r10, r0)
            r11.A01 = r0
            r3 = 2
            float r0 = r11.A00
            float r1 = r12.getDimension(r3, r0)
            r11.A00 = r1
            float r0 = r11.A01
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f7
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e7
            float r2 = r11.getAlpha()
            java.lang.String r0 = "alpha"
            r1 = 4
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x00de
            float r2 = r12.getFloat(r1, r2)
        L_0x00de:
            r11.setAlpha(r2)
            r2 = 0
            java.lang.String r1 = r12.getString(r2)
            if (r1 == 0) goto L_0x00ef
            r11.A09 = r1
            X.0yf r0 = r11.A0E
            r0.put(r1, r11)
        L_0x00ef:
            r12.recycle()
            int r0 = r9.getChangingConfigurations()
            r5.A01 = r0
            r5.A0A = r4
            X.U0W r0 = r9.A00
            r20 = r0
            X.W1h r1 = r0.A08
            java.util.ArrayDeque r18 = new java.util.ArrayDeque
            r18.<init>()
            X.UFG r11 = r1.A0F
            r0 = r18
            r0.push(r11)
            int r13 = r8.getEventType()
            int r0 = r8.getDepth()
            int r17 = r0 + 1
            r16 = 1
        L_0x0118:
            if (r13 == r4) goto L_0x03d2
            int r11 = r8.getDepth()
            r0 = r17
            if (r11 >= r0) goto L_0x0124
            if (r13 == r10) goto L_0x03d2
        L_0x0124:
            java.lang.String r12 = "group"
            if (r13 != r3) goto L_0x0383
            java.lang.String r13 = r8.getName()
            java.lang.Object r11 = r18.peek()
            X.UFG r11 = (X.UFG) r11
            if (r11 == 0) goto L_0x0254
            java.lang.String r0 = "path"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x027c
            X.UFH r12 = new X.UFH
            r12.<init>()
            int[] r13 = X.C39627A2r.A04
            if (r26 != 0) goto L_0x0276
            r0 = r21
            android.content.res.TypedArray r13 = r0.obtainAttributes(r7, r13)
        L_0x014b:
            r0 = 0
            r12.A0B = r0
            java.lang.String r0 = "pathData"
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0236
            java.lang.String r0 = r13.getString(r2)
            if (r0 == 0) goto L_0x015e
            r12.A02 = r0
        L_0x015e:
            java.lang.String r0 = r13.getString(r3)
            if (r0 == 0) goto L_0x016a
            X.Vz3[] r0 = X.C18667VwP.A02(r0)
            r12.A03 = r0
        L_0x016a:
            java.lang.String r0 = "fillColor"
            X.VUH r0 = X.C18666VwO.A01(r6, r13, r0, r8, r4)
            r12.A09 = r0
            float r15 = r12.A00
            java.lang.String r0 = "fillAlpha"
            r14 = 12
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0182
            float r15 = r13.getFloat(r14, r15)
        L_0x0182:
            r12.A00 = r15
            java.lang.String r0 = "strokeLineCap"
            r15 = 8
            r14 = -1
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 != 0) goto L_0x0270
            r0 = -1
        L_0x0190:
            android.graphics.Paint$Cap r15 = r12.A07
            if (r0 == 0) goto L_0x026c
            if (r0 == r4) goto L_0x0268
            if (r0 != r3) goto L_0x019a
            android.graphics.Paint$Cap r15 = android.graphics.Paint.Cap.SQUARE
        L_0x019a:
            r12.A07 = r15
            java.lang.String r0 = "strokeLineJoin"
            r15 = 9
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 != 0) goto L_0x0262
            r0 = -1
        L_0x01a7:
            android.graphics.Paint$Join r14 = r12.A08
            if (r0 == 0) goto L_0x025e
            if (r0 == r4) goto L_0x025a
            if (r0 != r3) goto L_0x01b1
            android.graphics.Paint$Join r14 = android.graphics.Paint.Join.BEVEL
        L_0x01b1:
            r12.A08 = r14
            float r15 = r12.A02
            java.lang.String r0 = "strokeMiterLimit"
            r14 = 10
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x01c3
            float r15 = r13.getFloat(r14, r15)
        L_0x01c3:
            r12.A02 = r15
            java.lang.String r0 = "strokeColor"
            X.VUH r0 = X.C18666VwO.A01(r6, r13, r0, r8, r10)
            r12.A0A = r0
            float r15 = r12.A01
            java.lang.String r0 = "strokeAlpha"
            r14 = 11
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x01dd
            float r15 = r13.getFloat(r14, r15)
        L_0x01dd:
            r12.A01 = r15
            float r15 = r12.A03
            java.lang.String r0 = "strokeWidth"
            r14 = 4
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x01ee
            float r15 = r13.getFloat(r14, r15)
        L_0x01ee:
            r12.A03 = r15
            float r15 = r12.A04
            java.lang.String r0 = "trimPathEnd"
            r14 = 6
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x01ff
            float r15 = r13.getFloat(r14, r15)
        L_0x01ff:
            r12.A04 = r15
            float r15 = r12.A05
            java.lang.String r0 = "trimPathOffset"
            r14 = 7
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0210
            float r15 = r13.getFloat(r14, r15)
        L_0x0210:
            r12.A05 = r15
            float r14 = r12.A06
            java.lang.String r0 = "trimPathStart"
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0222
            r0 = r19
            float r14 = r13.getFloat(r0, r14)
        L_0x0222:
            r12.A06 = r14
            int r15 = r12.A01
            java.lang.String r0 = "fillType"
            r14 = 13
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0234
            int r15 = r13.getInt(r14, r15)
        L_0x0234:
            r12.A01 = r15
        L_0x0236:
            r13.recycle()
            java.util.ArrayList r0 = r11.A0C
            r0.add(r12)
            java.lang.String r11 = r12.A02
            if (r11 == 0) goto L_0x0247
            X.0yf r0 = r1.A0E
            r0.put(r11, r12)
        L_0x0247:
            r16 = 0
        L_0x0249:
            r0 = r20
            int r0 = r0.A01
            int r11 = r12.A00
        L_0x024f:
            r11 = r11 | r0
            r0 = r20
            r0.A01 = r11
        L_0x0254:
            int r13 = r8.next()
            goto L_0x0118
        L_0x025a:
            android.graphics.Paint$Join r14 = android.graphics.Paint.Join.ROUND
            goto L_0x01b1
        L_0x025e:
            android.graphics.Paint$Join r14 = android.graphics.Paint.Join.MITER
            goto L_0x01b1
        L_0x0262:
            int r0 = r13.getInt(r15, r14)
            goto L_0x01a7
        L_0x0268:
            android.graphics.Paint$Cap r15 = android.graphics.Paint.Cap.ROUND
            goto L_0x019a
        L_0x026c:
            android.graphics.Paint$Cap r15 = android.graphics.Paint.Cap.BUTT
            goto L_0x019a
        L_0x0270:
            int r0 = r13.getInt(r15, r14)
            goto L_0x0190
        L_0x0276:
            android.content.res.TypedArray r13 = r6.obtainStyledAttributes(r7, r13, r2, r2)
            goto L_0x014b
        L_0x027c:
            java.lang.String r0 = "clip-path"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x02d7
            X.UFE r12 = new X.UFE
            r12.<init>()
            java.lang.String r0 = "pathData"
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x02bd
            int[] r13 = X.C39627A2r.A02
            if (r26 != 0) goto L_0x02d2
            r0 = r21
            android.content.res.TypedArray r13 = r0.obtainAttributes(r7, r13)
        L_0x029b:
            java.lang.String r0 = r13.getString(r2)
            if (r0 == 0) goto L_0x02a3
            r12.A02 = r0
        L_0x02a3:
            java.lang.String r0 = r13.getString(r4)
            if (r0 == 0) goto L_0x02af
            X.Vz3[] r0 = X.C18667VwP.A02(r0)
            r12.A03 = r0
        L_0x02af:
            java.lang.String r0 = "fillType"
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 != 0) goto L_0x02cd
            r0 = 0
        L_0x02b8:
            r12.A01 = r0
            r13.recycle()
        L_0x02bd:
            java.util.ArrayList r0 = r11.A0C
            r0.add(r12)
            java.lang.String r11 = r12.A02
            if (r11 == 0) goto L_0x0249
            X.0yf r0 = r1.A0E
            r0.put(r11, r12)
            goto L_0x0249
        L_0x02cd:
            int r0 = r13.getInt(r3, r2)
            goto L_0x02b8
        L_0x02d2:
            android.content.res.TypedArray r13 = r6.obtainStyledAttributes(r7, r13, r2, r2)
            goto L_0x029b
        L_0x02d7:
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L_0x0254
            X.UFG r12 = new X.UFG
            r12.<init>()
            int[] r13 = X.C39627A2r.A03
            if (r26 != 0) goto L_0x037d
            r0 = r21
            android.content.res.TypedArray r13 = r0.obtainAttributes(r7, r13)
        L_0x02ec:
            r0 = 0
            r12.A09 = r0
            float r14 = r12.A02
            java.lang.String r0 = "rotation"
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x02ff
            r0 = r19
            float r14 = r13.getFloat(r0, r14)
        L_0x02ff:
            r12.A02 = r14
            float r0 = r12.A00
            float r0 = r13.getFloat(r4, r0)
            r12.A00 = r0
            float r0 = r12.A01
            float r0 = r13.getFloat(r3, r0)
            r12.A01 = r0
            float r14 = r12.A03
            java.lang.String r0 = "scaleX"
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x031f
            float r14 = r13.getFloat(r10, r14)
        L_0x031f:
            r12.A03 = r14
            float r15 = r12.A04
            java.lang.String r0 = "scaleY"
            r14 = 4
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0330
            float r15 = r13.getFloat(r14, r15)
        L_0x0330:
            r12.A04 = r15
            float r15 = r12.A05
            java.lang.String r0 = "translateX"
            r14 = 6
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0341
            float r15 = r13.getFloat(r14, r15)
        L_0x0341:
            r12.A05 = r15
            float r15 = r12.A06
            java.lang.String r0 = "translateY"
            r14 = 7
            boolean r0 = X.C18666VwO.A02(r0, r8)
            if (r0 == 0) goto L_0x0352
            float r15 = r13.getFloat(r14, r15)
        L_0x0352:
            r12.A06 = r15
            java.lang.String r0 = r13.getString(r2)
            if (r0 == 0) goto L_0x035c
            r12.A08 = r0
        L_0x035c:
            X.UFG.A00(r12)
            r13.recycle()
            java.util.ArrayList r0 = r11.A0C
            r0.add(r12)
            r0 = r18
            r0.push(r12)
            java.lang.String r11 = r12.A08
            if (r11 == 0) goto L_0x0375
            X.0yf r0 = r1.A0E
            r0.put(r11, r12)
        L_0x0375:
            r0 = r20
            int r0 = r0.A01
            int r11 = r12.A07
            goto L_0x024f
        L_0x037d:
            android.content.res.TypedArray r13 = r6.obtainStyledAttributes(r7, r13, r2, r2)
            goto L_0x02ec
        L_0x0383:
            if (r13 != r10) goto L_0x0254
            java.lang.String r0 = r8.getName()
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0254
            r18.pop()
            goto L_0x0254
        L_0x0394:
            android.content.res.Resources r1 = r12.getResources()
            r0 = 0
            int r0 = r12.getResourceId(r4, r0)
            android.content.res.XmlResourceParser r0 = r1.getXml(r0)     // Catch:{ Exception -> 0x03a7 }
            android.content.res.ColorStateList r0 = X.AnonymousClass51g.A01(r6, r1, r0)     // Catch:{ Exception -> 0x03a7 }
            goto L_0x006b
        L_0x03a7:
            r2 = move-exception
            java.lang.String r1 = "CSLCompat"
            java.lang.String r0 = "Failed to inflate ColorStateList."
            android.util.Log.e(r1, r0, r2)
            goto L_0x006f
        L_0x03b1:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x0045
        L_0x03b5:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x0045
        L_0x03b9:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0045
        L_0x03bd:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x0045
        L_0x03c1:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OVER
            goto L_0x0045
        L_0x03c5:
            int r0 = r12.getInt(r2, r1)
            goto L_0x0036
        L_0x03cb:
            r0 = 0
            android.content.res.TypedArray r12 = r6.obtainStyledAttributes(r7, r1, r0, r0)
            goto L_0x0027
        L_0x03d2:
            if (r16 != 0) goto L_0x03df
            android.content.res.ColorStateList r1 = r5.A03
            android.graphics.PorterDuff$Mode r0 = r5.A07
            android.graphics.PorterDuffColorFilter r0 = r9.A00(r1, r0)
            r9.A03 = r0
            return
        L_0x03df:
            java.lang.String r1 = "no path defined"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03e7:
            java.lang.String r1 = r12.getPositionDescription()
            java.lang.String r0 = "<vector> tag requires height > 0"
            java.lang.String r1 = X.002.A0R(r1, r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03f7:
            java.lang.String r1 = r12.getPositionDescription()
            java.lang.String r0 = "<vector> tag requires width > 0"
            java.lang.String r1 = X.002.A0R(r1, r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0407:
            java.lang.String r1 = r12.getPositionDescription()
            java.lang.String r0 = "<vector> tag requires viewportHeight > 0"
            java.lang.String r1 = X.002.A0R(r1, r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0417:
            java.lang.String r1 = r12.getPositionDescription()
            java.lang.String r0 = "<vector> tag requires viewportWidth > 0"
            java.lang.String r1 = X.002.A0R(r1, r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0427:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to resolve attribute at index "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NY.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final void invalidateSelf() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.A00.A09;
    }

    public final boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        U0W u0w = this.A00;
        if (u0w == null) {
            return false;
        }
        C18781W1h w1h = u0w.A08;
        Boolean bool = w1h.A08;
        if (bool == null) {
            bool = Boolean.valueOf(w1h.A0F.A01());
            w1h.A08 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A03;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.Drawable$ConstantState, X.U0W] */
    public final Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A04 && super.mutate() == this) {
            U0W u0w = this.A00;
            ? constantState = new Drawable.ConstantState();
            constantState.A03 = null;
            constantState.A07 = A08;
            if (u0w != null) {
                constantState.A01 = u0w.A01;
                C18781W1h w1h = new C18781W1h(u0w.A08);
                constantState.A08 = w1h;
                Paint paint = u0w.A08.A05;
                if (paint != null) {
                    w1h.A05 = new Paint(paint);
                }
                Paint paint2 = u0w.A08.A06;
                if (paint2 != null) {
                    constantState.A08.A06 = new Paint(paint2);
                }
                constantState.A03 = u0w.A03;
                constantState.A07 = u0w.A07;
                constantState.A09 = u0w.A09;
            }
            this.A00 = constantState;
            this.A04 = true;
            return this;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        U0W u0w = this.A00;
        ColorStateList colorStateList = u0w.A03;
        if (!(colorStateList == null || (mode = u0w.A07) == null)) {
            this.A03 = A00(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C18781W1h w1h = u0w.A08;
        Boolean bool = w1h.A08;
        if (bool == null) {
            bool = Boolean.valueOf(w1h.A0F.A01());
            w1h.A08 = bool;
        }
        if (bool.booleanValue()) {
            boolean A022 = u0w.A08.A0F.A02(iArr);
            u0w.A0A |= A022;
            if (A022) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        C18781W1h w1h = this.A00.A08;
        if (w1h.A04 != i) {
            w1h.A04 = i;
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A00.A09 = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A02 = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        U0W u0w = this.A00;
        if (u0w.A03 != colorStateList) {
            u0w.A03 = colorStateList;
            this.A03 = A00(colorStateList, u0w.A07);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        U0W u0w = this.A00;
        if (u0w.A07 != mode) {
            u0w.A07 = mode;
            this.A03 = A00(u0w.A03, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public AnonymousClass3NY(U0W u0w) {
        this.A01 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = u0w;
        this.A03 = A00(u0w.A03, u0w.A07);
    }

    public AnonymousClass3NY() {
        this.A01 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = new U0W();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }
}
