package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3eK  reason: invalid class name and case insensitive filesystem */
public final class C246283eK extends Drawable implements Drawable.Callback, TextContent, AnonymousClass2Uh {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public Path A08;
    public Handler A09;
    public Layout A0A;
    public AnonymousClass5FD A0B;
    public C57889Ii6 A0C;
    public CharSequence A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public ClickableSpan[] A0I;
    public ImageSpan[] A0J;
    public float A0K;
    public Paint A0L;
    public boolean A0M;

    public static AnonymousClass5FD A01(C246283eK r10) {
        C246283eK r5 = r10;
        Layout layout = r10.A0A;
        if (layout == null) {
            return null;
        }
        AnonymousClass5FD r3 = r10.A0B;
        if (r3 != null) {
            return r3;
        }
        CharSequence charSequence = r10.A0D;
        float textSize = layout.getPaint().getTextSize();
        AnonymousClass5FD r32 = new AnonymousClass5FD(layout.getPaint().getTypeface(), r5, charSequence, textSize, (((float) layout.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null)) * layout.getSpacingMultiplier()) + layout.getSpacingAdd(), r10.A0A.getPaint().getColor(), layout.getLineCount());
        r5.A0B = r32;
        return r32;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private int A00(int i, int i2) {
        float width;
        float lineMax;
        int lineForVertical = this.A0A.getLineForVertical(i2);
        Layout.Alignment alignment = this.A0A.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = this.A0A;
        if (alignment == alignment2) {
            width = layout.getLineLeft(lineForVertical);
            lineMax = this.A0A.getLineRight(lineForVertical);
        } else {
            int paragraphDirection = layout.getParagraphDirection(lineForVertical);
            Layout.Alignment paragraphAlignment = this.A0A.getParagraphAlignment(lineForVertical);
            boolean z = true;
            if (paragraphDirection != -1 ? !(paragraphDirection == 1 && paragraphAlignment == Layout.Alignment.ALIGN_OPPOSITE) : paragraphAlignment != Layout.Alignment.ALIGN_NORMAL) {
                z = false;
                width = (float) this.A0A.getParagraphLeft(lineForVertical);
            } else {
                width = ((float) this.A0A.getWidth()) - this.A0A.getLineMax(lineForVertical);
            }
            Layout layout2 = this.A0A;
            if (z) {
                lineMax = (float) layout2.getParagraphRight(lineForVertical);
            } else {
                lineMax = layout2.getLineMax(lineForVertical);
            }
        }
        float f = (float) i;
        if (f >= width && f <= lineMax) {
            try {
                return this.A0A.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private void A02() {
        Handler handler = this.A09;
        if (handler != null) {
            handler.removeCallbacks(this.A0C);
            this.A0C = null;
        }
        this.A0F = false;
    }

    private void A03(int i, int i2) {
        if (Color.alpha(this.A02) == 0) {
            return;
        }
        if (this.A05 != i || this.A04 != i2) {
            this.A05 = i;
            this.A04 = i2;
            Paint paint = this.A0L;
            if (paint == null) {
                paint = new Paint();
                this.A0L = paint;
            }
            paint.setColor(this.A02);
            this.A0G = true;
            invalidateSelf();
        }
    }

    private void A04(Canvas canvas) {
        if (this.A01 > 0.0f) {
            TextPaint paint = this.A0A.getPaint();
            int color = paint.getColor();
            Paint.Style style = paint.getStyle();
            float strokeWidth = paint.getStrokeWidth();
            Paint.Join strokeJoin = paint.getStrokeJoin();
            paint.setStrokeJoin(Paint.Join.ROUND);
            int i = this.A03;
            if (i == 0) {
                i = F40.A00(paint);
            }
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A01);
            this.A0A.draw(canvas);
            paint.setStrokeWidth(strokeWidth);
            paint.setStyle(style);
            paint.setColor(color);
            paint.setStrokeJoin(strokeJoin);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r11.length <= 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(android.content.res.ColorStateList r7, android.text.Layout r8, java.lang.CharSequence r9, java.lang.String r10, android.text.style.ClickableSpan[] r11, android.text.style.ImageSpan[] r12, float r13, float r14, float r15, int r16, int r17, int r18, boolean r19) {
        /*
            r6 = this;
            r6.A0A = r8
            r6.A0K = r13
            r6.A00 = r14
            r0 = r19
            r6.A0M = r0
            r6.A0D = r9
            r6.A0I = r11
            android.os.Handler r0 = r6.A09
            if (r0 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0025
            int r2 = r11.length
            r1 = 0
        L_0x0016:
            if (r1 >= r2) goto L_0x0025
            r0 = r11[r1]
            boolean r0 = r0 instanceof X.C263364Lg
            if (r0 == 0) goto L_0x0088
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r6.A09 = r0
        L_0x0025:
            r5 = 1
            r4 = 0
            if (r11 == 0) goto L_0x002d
            int r1 = r11.length
            r0 = 1
            if (r1 > 0) goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            r6.A0H = r0
            r0 = r17
            r6.A02 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0043
            r6.A01 = r15
            r0 = r18
            r6.A03 = r0
            r6.invalidateSelf()
        L_0x0043:
            r1 = r16
            if (r16 == 0) goto L_0x0064
            r0 = 0
            r6.A07 = r0
            r6.A06 = r1
        L_0x004c:
            r6.A03(r4, r4)
            if (r12 == 0) goto L_0x008b
            int r2 = r12.length
            r1 = 0
        L_0x0053:
            if (r1 >= r2) goto L_0x008b
            r0 = r12[r1]
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r0.setCallback(r6)
            r0.setVisible(r5, r4)
            int r1 = r1 + 1
            goto L_0x0053
        L_0x0064:
            if (r7 != 0) goto L_0x0068
            android.content.res.ColorStateList r7 = X.C244093ad.A01
        L_0x0068:
            r6.A07 = r7
            int r0 = r7.getDefaultColor()
            r6.A06 = r0
            android.text.Layout r0 = r6.A0A
            if (r0 == 0) goto L_0x004c
            android.text.TextPaint r3 = r0.getPaint()
            android.content.res.ColorStateList r2 = r6.A07
            int[] r1 = r6.getState()
            int r0 = r6.A06
            int r0 = r2.getColorForState(r1, r0)
            r3.setColor(r0)
            goto L_0x004c
        L_0x0088:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x008b:
            r6.A0J = r12
            r6.A0E = r10
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246283eK.A06(android.content.res.ColorStateList, android.text.Layout, java.lang.CharSequence, java.lang.String, android.text.style.ClickableSpan[], android.text.style.ImageSpan[], float, float, float, int, int, int, boolean):void");
    }

    public final void draw(Canvas canvas) {
        if (this.A0A != null) {
            int save = canvas.save();
            Rect bounds = getBounds();
            if (this.A0M) {
                canvas.clipRect(bounds);
            }
            canvas.translate(((float) bounds.left) + this.A0K, ((float) bounds.top) + this.A00);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    A04(canvas);
                }
                Layout layout = this.A0A;
                Path path = null;
                if (!(this.A05 == this.A04 || Color.alpha(this.A02) == 0)) {
                    if (this.A0G) {
                        Path path2 = this.A08;
                        if (path2 == null) {
                            path2 = new Path();
                            this.A08 = path2;
                        }
                        this.A0A.getSelectionPath(this.A05, this.A04, path2);
                        this.A0G = false;
                    }
                    path = this.A08;
                }
                layout.draw(canvas, path, this.A0L, 0);
                canvas.restoreToCount(save);
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(" [");
                sb.append(this.A0E);
                sb.append("] ");
                CharSequence charSequence = this.A0D;
                if (charSequence instanceof SpannableStringBuilder) {
                    Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                    sb.append("spans: ");
                    for (Object obj : spans) {
                        sb.append(obj.getClass().getSimpleName());
                        sb.append(", ");
                    }
                }
                sb.append("ellipsizedWidth: ");
                sb.append(this.A0A.getEllipsizedWidth());
                sb.append(", lineCount: ");
                sb.append(this.A0A.getLineCount());
                RuntimeException runtimeException = new RuntimeException(002.A0R("Debug info for IOOB: ", sb.toString()), e);
                runtimeException.setStackTrace(new StackTraceElement[0]);
                throw runtimeException;
            }
        }
    }

    public final boolean isStateful() {
        if (this.A07 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r2 = r0.getPaint().getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r4) {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.A07
            if (r0 == 0) goto L_0x0026
            android.text.Layout r0 = r3.A0A
            if (r0 == 0) goto L_0x0026
            android.text.TextPaint r0 = r0.getPaint()
            int r2 = r0.getColor()
            android.content.res.ColorStateList r1 = r3.A07
            int r0 = r3.A06
            int r1 = r1.getColorForState(r4, r0)
            if (r1 == r2) goto L_0x0026
            android.text.Layout r0 = r3.A0A
            android.text.TextPaint r0 = r0.getPaint()
            r0.setColor(r1)
            r3.invalidateSelf()
        L_0x0026:
            boolean r0 = super.onStateChange(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246283eK.onStateChange(int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5 == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r5 = r7.getActionMasked()
            r4 = 0
            r0 = 1
            if (r5 == r0) goto L_0x000b
            r3 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x0026
            android.graphics.Rect r2 = r6.getBounds()
            float r0 = r7.getX()
            int r1 = (int) r0
            float r0 = r7.getY()
            int r0 = (int) r0
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L_0x0026
            if (r3 != 0) goto L_0x0029
        L_0x0026:
            r0 = 3
            if (r5 != r0) goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246283eK.A05(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.4Lg} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r8.A0C.A00 != r2) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DsZ(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.A05(r10)
            if (r0 != 0) goto L_0x0014
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x0022
            android.os.Handler r0 = r8.A09
            if (r0 == 0) goto L_0x0022
            int r0 = r10.getAction()
            if (r0 == 0) goto L_0x0022
        L_0x0014:
            int r6 = r10.getActionMasked()
            r5 = 0
            r0 = 3
            if (r6 != r0) goto L_0x0024
            r8.A03(r5, r5)
            r8.A02()
        L_0x0022:
            r0 = 0
            return r0
        L_0x0024:
            r0 = 2
            if (r6 != r0) goto L_0x0076
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x0076
            X.Ii6 r0 = r8.A0C
            if (r0 == 0) goto L_0x0076
            android.graphics.Rect r3 = r8.getBounds()
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r0 = r3.contains(r1, r0)
            if (r0 == 0) goto L_0x0073
            float r0 = r10.getX()
            int r2 = (int) r0
            int r0 = r3.left
            int r2 = r2 - r0
            float r0 = r10.getY()
            int r1 = (int) r0
            int r0 = r3.top
            int r1 = r1 - r0
            int r3 = r8.A00(r2, r1)
            r2 = 0
            if (r3 < 0) goto L_0x006d
            java.lang.CharSequence r1 = r8.A0D
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r1 = r1.getSpans(r3, r3, r0)
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            if (r1 == 0) goto L_0x006d
            int r0 = r1.length
            if (r0 <= 0) goto L_0x006d
            r2 = r1[r5]
        L_0x006d:
            X.Ii6 r0 = r8.A0C
            X.4Lg r0 = r0.A00
            if (r0 == r2) goto L_0x0076
        L_0x0073:
            r8.A02()
        L_0x0076:
            boolean r0 = r8.A0F
            r3 = 1
            r7 = r0 ^ 1
            if (r6 != r3) goto L_0x0080
            r8.A02()
        L_0x0080:
            android.graphics.Rect r4 = r8.getBounds()
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r0 = r4.contains(r1, r0)
            if (r0 == 0) goto L_0x0022
            float r0 = r10.getX()
            int r2 = (int) r0
            int r0 = r4.left
            int r2 = r2 - r0
            float r0 = r10.getY()
            int r1 = (int) r0
            int r0 = r4.top
            int r1 = r1 - r0
            int r2 = r8.A00(r2, r1)
            if (r2 < 0) goto L_0x00f5
            java.lang.CharSequence r1 = r8.A0D
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r1 = r1.getSpans(r2, r2, r0)
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            if (r1 == 0) goto L_0x00f5
            int r0 = r1.length
            if (r0 <= 0) goto L_0x00f5
            r4 = r1[r5]
            if (r4 == 0) goto L_0x00f5
            if (r6 != r3) goto L_0x00cb
            r8.A03(r5, r5)
            if (r7 == 0) goto L_0x00c9
            r4.onClick(r9)
        L_0x00c9:
            r0 = 1
            return r0
        L_0x00cb:
            if (r6 != 0) goto L_0x00c9
            boolean r0 = r4 instanceof X.C263364Lg
            if (r0 == 0) goto L_0x00e5
            r0 = r4
            X.4Lg r0 = (X.C263364Lg) r0
            X.Ii6 r3 = new X.Ii6
            r3.<init>(r9, r0, r8)
            r8.A0C = r3
            android.os.Handler r2 = r8.A09
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
        L_0x00e5:
            java.lang.CharSequence r0 = r8.A0D
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r1 = r0.getSpanStart(r4)
            int r0 = r0.getSpanEnd(r4)
            r8.A03(r1, r0)
            goto L_0x00c9
        L_0x00f5:
            r8.A03(r5, r5)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246283eK.DsZ(android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean EsM(MotionEvent motionEvent) {
        if (A05(motionEvent)) {
            return true;
        }
        if (!this.A0H || this.A09 == null || motionEvent.getAction() == 0) {
            return false;
        }
        return true;
    }

    public final List getItems() {
        AnonymousClass5FD A012 = A01(this);
        if (A012 == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(A012);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
