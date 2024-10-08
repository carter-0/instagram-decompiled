package com.instagram.creation.capture.quickcapture.cameratoolmenu;

import X.0mi;
import X.0nA;
import X.0qQ;
import X.11Z;
import X.2cs;
import X.AnonymousClass0eM;
import X.AnonymousClass8EZ;
import X.C252203oj;
import X.C338897ii;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CameraToolMenuItem extends View {
    public float A00;
    public float A01;
    public float A02;
    public Bitmap A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public C338897ii A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public double A0C;
    public float A0D;
    public int A0E;
    public boolean A0F;
    public boolean A0G;
    public final float A0H;
    public final float A0I;
    public final float A0J;
    public final float A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final RectF A0P;
    public final 2cs A0Q;
    public final Runnable A0R;
    public final int A0S;
    public final Paint A0T;
    public final Paint A0U;
    public final Path A0V;
    public final RectF A0W;
    public final C252203oj A0X;
    public final AnonymousClass0eM A0Y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraToolMenuItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Float) null);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        if (r9.A0A != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x020d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r29) {
        /*
            r28 = this;
            r12 = 0
            r8 = r29
            X.0qQ.A0B(r8, r12)
            r9 = r28
            super.onDraw(r8)
            boolean r0 = r9.isSelected()
            r1 = 0
            if (r0 != 0) goto L_0x0256
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x0032
            float r0 = r9.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0250
            float r0 = r9.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0250
            float r2 = r9.A0I
        L_0x0024:
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x0249
            float r2 = r9.A0I
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            android.graphics.Paint r0 = r9.A0T
            r8.drawCircle(r2, r2, r2, r0)
        L_0x0032:
            android.graphics.drawable.Drawable r0 = r9.A05
            if (r0 != 0) goto L_0x0038
            android.graphics.drawable.Drawable r0 = r9.A04
        L_0x0038:
            r9.A01(r8, r0)
        L_0x003b:
            java.lang.CharSequence r0 = r9.A08
            if (r0 == 0) goto L_0x020c
            float r2 = r9.A02
            r0 = 1056964608(0x3f000000, float:0.5)
            r6 = 1065353216(0x3f800000, float:1.0)
            r26 = 1
            float r7 = X.0mi.A02(r2, r1, r0, r1, r6)
            float r3 = r9.getBackgroundWidth()
            float r4 = r9.A0I
            float r0 = r9.A01
            float r0 = r0 + r4
            float r3 = r3 - r0
            float r2 = r9.getLabelPaddingLeft()
            float r0 = r9.getLabelPaddingRight()
            float r2 = r2 + r0
            float r3 = r3 / r2
            float r0 = r9.getLabelPaddingLeft()
            float r3 = r3 * r0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0245
            boolean r0 = r9.A03()
            if (r0 != 0) goto L_0x0242
            float r5 = r4 + r3
        L_0x0072:
            float r0 = r9.getLabelPaddingLeft()
            float r3 = r3 / r0
            float r3 = X.0mi.A00(r3, r1, r6)
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x0080
            r3 = 0
        L_0x0080:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0085
            r7 = r3
        L_0x0085:
            float r3 = r9.A00
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            r7 = r3
        L_0x008c:
            X.0rh r10 = new X.0rh
            r10.<init>()
            r10.A00 = r5
            float r0 = r9.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x023f
        L_0x009d:
            float r3 = r9.getLabelPaddingLeft()
            r10.A00 = r3
            boolean r0 = r9.A03()
            if (r0 != 0) goto L_0x00ac
            float r3 = r3 + r4
            r10.A00 = r3
        L_0x00ac:
            boolean r0 = r9.isSelected()
            if (r0 == 0) goto L_0x023f
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x023f
        L_0x00b6:
            android.graphics.Paint r0 = r9.A0M
            r27 = r0
            r4 = 1084227584(0x40a00000, float:5.0)
            r0 = 1117388800(0x429a0000, float:77.0)
            float r0 = r0 * r2
            int r0 = (int) r0
            int r3 = android.graphics.Color.argb(r0, r12, r12, r12)
            r0 = r27
            r0.setShadowLayer(r4, r1, r1, r3)
            r16 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r16
            int r3 = (int) r2
            r0.setAlpha(r3)
            X.0rh r7 = new X.0rh
            r7.<init>()
            int r0 = r9.getHeight()
            float r6 = (float) r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r5
            float r4 = r27.ascent()
            float r0 = r27.descent()
            float r4 = r4 + r0
            float r4 = r4 / r5
            float r6 = r6 - r4
            r7.A00 = r6
            boolean r0 = r9.isSelected()
            if (r0 != 0) goto L_0x01fd
            X.7ii r4 = r9.A07
            if (r4 == 0) goto L_0x01fd
            android.content.res.Resources r11 = r9.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            float r15 = r11.getDimension(r0)
            r25 = 2131165293(0x7f07006d, float:1.79448E38)
            r0 = r25
            float r24 = r11.getDimension(r0)
            android.graphics.Paint r6 = r9.A0N
            android.content.Context r13 = r9.getContext()
            int r0 = r4.A00
            int r0 = r13.getColor(r0)
            r6.setColor(r0)
            android.graphics.Paint r5 = r9.A0O
            r5.setAlpha(r3)
            int r0 = r6.getAlpha()
            float r14 = (float) r0
            float r16 = r16 - r1
            float r14 = r14 - r1
            r3 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x012d
            float r2 = r2 - r1
            float r3 = r2 / r16
        L_0x012d:
            float r3 = r3 * r14
            float r3 = r3 + r1
            int r0 = (int) r3
            r6.setAlpha(r0)
            int r0 = r4.A01
            java.lang.String r1 = r11.getString(r0)
            X.0qQ.A07(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r23 = r1.toUpperCase(r0)
            X.0qQ.A07(r23)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            int r1 = r23.length()
            r0 = r23
            r5.getTextBounds(r0, r12, r1, r2)
            int r0 = r2.height()
            float r0 = (float) r0
            r22 = r0
            r0 = r23
            float r21 = r5.measureText(r0)
            float r4 = r7.A00
            r20 = 1073741824(0x40000000, float:2.0)
            float r19 = r22 / r20
            float r3 = r4 - r19
            float r3 = r3 - r15
            float r3 = r3 - r24
            float r2 = r10.A00
            float r4 = r4 - r15
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x0238
            com.instagram.common.session.UserSession r15 = X.0ob.A00(r0)
            X.0Tu r14 = X.0Tu.A05
            r0 = 36320330809876791(0x810926000c2137, double:3.032461682174838E-306)
            boolean r1 = X.182.A06(r14, r15, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0238
            if (r1 == 0) goto L_0x0238
            r0 = 6
            int r18 = X.C61380mr.A01(r13, r0)
            r0 = 3
            int r15 = X.C61380mr.A01(r13, r0)
            java.lang.String r17 = X.0oe.A00(r23)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            int r1 = r17.length()
            r0 = r17
            r5.getTextBounds(r0, r12, r1, r13)
            android.graphics.Paint$FontMetrics r0 = r5.getFontMetrics()
            float r12 = r0.descent
            android.graphics.Paint$FontMetrics r0 = r5.getFontMetrics()
            float r0 = r0.ascent
            float r12 = r12 - r0
            r0 = r17
            float r14 = r5.measureText(r0)
            float r16 = r12 / r20
            float r4 = r4 - r16
            float r13 = r4 - r12
            float r1 = (float) r15
            float r13 = r13 - r1
            float r14 = r14 + r2
            int r0 = r18 * 2
            float r0 = (float) r0
            float r14 = r14 + r0
            float r15 = r4 + r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r2, r13, r14, r15)
            r8.drawRoundRect(r0, r12, r12, r6)
            r0 = r18
            float r0 = (float) r0
            float r2 = r2 + r0
            android.graphics.Paint$FontMetrics r0 = r5.getFontMetrics()
            float r0 = r0.descent
            float r4 = r4 - r0
            r0 = r17
            r8.drawText(r0, r2, r4, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r26)
            float r16 = r16 + r1
        L_0x01ea:
            java.lang.Float r1 = java.lang.Float.valueOf(r16)
            boolean r0 = r0.booleanValue()
            float r1 = r1.floatValue()
            if (r0 == 0) goto L_0x020d
            float r0 = r7.A00
            float r0 = r0 + r1
        L_0x01fb:
            r7.A00 = r0
        L_0x01fd:
            java.lang.CharSequence r0 = r9.A08
            java.lang.String r3 = java.lang.String.valueOf(r0)
            float r2 = r10.A00
            float r1 = r7.A00
            r0 = r27
            r8.drawText(r3, r2, r1, r0)
        L_0x020c:
            return
        L_0x020d:
            float r12 = r10.A00
            float r4 = r3 - r22
            float r4 = r4 - r24
            float r2 = r12 + r21
            float r0 = r24 * r20
            float r2 = r2 + r0
            float r0 = r3 + r24
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r12, r4, r2, r0)
            r0 = r25
            float r0 = r11.getDimension(r0)
            r8.drawRoundRect(r1, r0, r0, r6)
            float r1 = r10.A00
            float r1 = r1 + r24
            r0 = r23
            r8.drawText(r0, r1, r3, r5)
            float r0 = r7.A00
            float r19 = r19 + r24
            float r0 = r0 + r19
            goto L_0x01fb
        L_0x0238:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r16 = 0
            goto L_0x01ea
        L_0x023f:
            r2 = r7
            goto L_0x00b6
        L_0x0242:
            r5 = r3
            goto L_0x0072
        L_0x0245:
            r3 = 0
            r5 = 0
            goto L_0x0080
        L_0x0249:
            r0 = 38
            r9.A00(r8, r1, r2, r0)
            goto L_0x0032
        L_0x0250:
            float r2 = r9.getMaxSize()
            goto L_0x0024
        L_0x0256:
            float r13 = r9.getSelectedIconPercentage()
            r11 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x02a6
            r5 = 153(0x99, float:2.14E-43)
            X.2cs r0 = r9.A0Q
            double r2 = r0.A01
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0279
            float r3 = r9.getBackgroundSpringValue()
            r2 = 1056964608(0x3f000000, float:0.5)
            r0 = 1125711872(0x43190000, float:153.0)
            float r0 = X.0mi.A02(r3, r1, r2, r1, r0)
            int r5 = (int) r0
        L_0x0279:
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x027e
            r5 = 0
        L_0x027e:
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x03d3
            int r0 = r9.getWidth()
            float r4 = (float) r0
            float r0 = r9.getBackgroundWidth()
            float r4 = r4 - r0
            int r0 = r9.getWidth()
            float r3 = (float) r0
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x029d
            float r2 = r9.A0J
            float r0 = r9.A0I
            float r2 = r2 - r0
            float r3 = r3 - r2
        L_0x029d:
            r8.save()
            r9.A00(r8, r4, r3, r5)
            r8.restore()
        L_0x02a6:
            X.2cs r0 = r9.A0Q
            double r2 = r0.A01
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            android.content.res.Resources r4 = r9.getResources()
            r10 = 2131165253(0x7f070045, float:1.7944718E38)
            float r5 = r4.getDimension(r10)
            float r5 = r5 * r13
            r3 = 1132396544(0x437f0000, float:255.0)
            float r11 = r11 - r1
            float r3 = r3 - r1
            r2 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02cc
            float r13 = r13 - r1
            float r2 = r13 / r11
        L_0x02cc:
            float r2 = r2 * r3
            float r2 = r2 + r1
            int r3 = (int) r2
            android.graphics.Paint r7 = r9.A0U
            r7.setStrokeWidth(r5)
            r7.setAlpha(r3)
            float r2 = r9.A0I
            r11 = 1073741824(0x40000000, float:2.0)
            float r6 = r2 / r11
            r5 = r6
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x02f3
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r6 = r0 - r6
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x02f3
            float r0 = r9.A0J
            float r0 = r0 - r2
            float r6 = r6 - r0
        L_0x02f3:
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x03c4
            android.graphics.Paint r0 = r9.A0T
            r8.drawCircle(r5, r5, r5, r0)
        L_0x02fc:
            android.graphics.drawable.Drawable r0 = r9.A06
            if (r0 != 0) goto L_0x0361
            android.graphics.drawable.Drawable r5 = r9.A05
            if (r5 != 0) goto L_0x0308
            android.graphics.drawable.Drawable r5 = r9.A04
            if (r5 == 0) goto L_0x0364
        L_0x0308:
            boolean r0 = r9.A0G
            android.content.Context r2 = r9.getContext()
            if (r0 == 0) goto L_0x03bc
            r0 = 2131100628(0x7f0603d4, float:1.7813643E38)
            int r2 = r2.getColor(r0)
            int r10 = r5.getIntrinsicWidth()
            int r7 = r5.getIntrinsicHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r10, r7, r0)
            X.0qQ.A07(r6)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r6)
            r5.setBounds(r12, r12, r10, r7)
            r5.draw(r13)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            int[] r0 = new int[]{r2, r2, r2, r2, r2}
            android.graphics.LinearGradient r0 = X.C267014am.A02(r0, r10, r7)
            r5.setShader(r0)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r2)
            r5.setXfermode(r0)
            float r2 = (float) r10
            float r0 = (float) r7
            r15 = r1
            r16 = r2
            r17 = r0
            r18 = r5
            r14 = r1
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x035a:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r4, r6)
            r9.A06 = r0
        L_0x0361:
            r0.setAlpha(r3)
        L_0x0364:
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x03b9
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x03b9
            android.graphics.drawable.Drawable r0 = r9.A05
            if (r0 != 0) goto L_0x0372
            android.graphics.drawable.Drawable r0 = r9.A04
        L_0x0372:
            r9.A01(r8, r0)
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x003b
            android.graphics.Bitmap r0 = r9.A03
            if (r0 != 0) goto L_0x0386
            r0 = 2131239018(0x7f08206a, float:1.8094331E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r4, r0)
            r9.A03 = r0
        L_0x0386:
            float r2 = r9.A0J
            float r7 = r9.A0H
            float r6 = r2 - r7
            float r5 = r9.A0K
            float r5 = r5 + r6
            android.graphics.Paint r4 = r9.A0L
            r4.setAlpha(r3)
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x03a1
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r0 = r0 - r2
            float r6 = r6 + r0
        L_0x03a1:
            r8.drawCircle(r6, r5, r7, r4)
            android.graphics.RectF r3 = r9.A0P
            float r2 = r6 - r7
            float r0 = r5 - r7
            float r6 = r6 + r7
            float r5 = r5 + r7
            r3.set(r2, r0, r6, r5)
            android.graphics.Bitmap r2 = r9.A03
            if (r2 == 0) goto L_0x003b
            r0 = 0
            r8.drawBitmap(r2, r0, r3, r4)
            goto L_0x003b
        L_0x03b9:
            android.graphics.drawable.Drawable r0 = r9.A06
            goto L_0x0372
        L_0x03bc:
            X.0qQ.A07(r2)
            android.graphics.Bitmap r6 = X.C267014am.A01(r2, r5)
            goto L_0x035a
        L_0x03c4:
            float r0 = r9.A0K
            float r2 = r5 + r0
            float r0 = r4.getDimension(r10)
            float r0 = r0 / r11
            float r5 = r5 - r0
            r8.drawCircle(r6, r2, r5, r7)
            goto L_0x02fc
        L_0x03d3:
            float r3 = r9.getBackgroundWidth()
            r4 = 0
            goto L_0x029d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem.onDraw(android.graphics.Canvas):void");
    }

    public final void setCameraToolResources(AnonymousClass8EZ r4) {
        Drawable mutate;
        0qQ.A0B(r4, 0);
        Context context = getContext();
        Drawable drawable = context.getDrawable(r4.A01);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            this.A04 = mutate;
            if (r4.A03) {
                mutate.setTint(context.getColor(R.color.canvas_bottom_sheet_description_text_color));
            }
            int i = r4.A02;
            if (i != 0) {
                String string = context.getResources().getString(i);
                this.A08 = string;
                this.A01 = this.A0M.measureText(String.valueOf(string));
            }
            int i2 = r4.A00;
            if (i2 != 0) {
                setContentDescription(context.getResources().getString(i2));
            }
        }
    }

    public final void setCircularBackground(int i) {
        this.A0G = true;
        this.A06 = null;
        this.A0F = true;
        this.A0T.setColor(i);
        invalidate();
    }

    public final void setDrawableWithLabel(String str) {
        0qQ.A0B(str, 0);
        Resources resources = getResources();
        float dimension = resources.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        int i = (int) dimension;
        Bitmap createBitmap = Bitmap.createBitmap(i * 2, i, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Context context = getContext();
        paint.setColor(context.getColor(R.color.fds_transparent));
        canvas.drawRect(0.0f, 0.0f, dimension * 2.0f, dimension, paint);
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.canvas_bottom_sheet_description_text_color));
        paint2.setTextSize(dimension);
        paint2.setTextScaleX(1.0f);
        canvas.drawText(str, 0.1f * dimension, dimension * 0.8f, paint2);
        this.A05 = new BitmapDrawable(resources, createBitmap);
        this.A06 = null;
        invalidate();
    }

    public void setSelected(boolean z) {
        A04(z, false);
    }

    private final void A00(Canvas canvas, float f, float f2, int i) {
        Path path = this.A0V;
        path.reset();
        Paint paint = this.A0T;
        paint.setAlpha(i);
        RectF rectF = this.A0W;
        float f3 = this.A0K;
        float f4 = this.A0I;
        rectF.set(f, f3, f2, f4 + f3);
        path.setFillType(Path.FillType.INVERSE_WINDING);
        float f5 = f4 / 2.0f;
        path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawRoundRect(rectF, f5, f5, paint);
        canvas.drawPath(path, paint);
    }

    private final void A01(Canvas canvas, Drawable drawable) {
        int i;
        int i2;
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable != null) {
            float f = this.A0I;
            float intrinsicWidth2 = (f - ((float) drawable.getIntrinsicWidth())) / 2.0f;
            float intrinsicHeight2 = (f - ((float) drawable.getIntrinsicHeight())) / 2.0f;
            if (A03()) {
                intrinsicWidth2 += ((float) getWidth()) - f;
                if (this.A09) {
                    intrinsicWidth2 -= (this.A0J - f) / 2.0f;
                }
            }
            float f2 = 0.0f;
            if (0.0f < intrinsicWidth2) {
                f2 = intrinsicWidth2;
            }
            if (this.A0G) {
                float f3 = 0.0f;
                if (0.0f < intrinsicHeight2) {
                    f3 = intrinsicHeight2;
                }
                int i3 = (int) f2;
                int i4 = this.A0E;
                i = i3 + i4;
                int i5 = (int) f3;
                i2 = i4 + i5;
                intrinsicWidth = (((int) Math.min((float) drawable.getIntrinsicWidth(), f)) + i3) - this.A0E;
                intrinsicHeight = (((int) Math.min((float) drawable.getIntrinsicHeight(), f)) + i5) - this.A0E;
            } else {
                i = (int) f2;
                int i6 = (int) this.A0K;
                int i7 = (int) intrinsicHeight2;
                i2 = i6 + i7;
                intrinsicWidth = drawable.getIntrinsicWidth() + i;
                intrinsicHeight = drawable.getIntrinsicHeight() + i6 + i7;
            }
            drawable.setBounds(i, i2, intrinsicWidth, intrinsicHeight);
            canvas.save();
            float f4 = f / 2.0f;
            if (A03()) {
                f4 = ((float) getWidth()) - f4;
            }
            canvas.rotate(this.A0D, f4, (f + this.A0K) / 2.0f);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final boolean A03() {
        if (this.A0C > 0.5d) {
            return true;
        }
        return false;
    }

    private final float getBackgroundSpringValue() {
        float f = (float) this.A0Q.A09.A00;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    private final int getFlexModeBackgroundColor() {
        return ((Number) this.A0Y.getValue()).intValue();
    }

    private final float getIconRadius() {
        return this.A0I / 2.0f;
    }

    private final float getMaxSize() {
        float f = this.A0I;
        if (this.A08 != null) {
            return f + getLabelPaddingLeft() + this.A01 + getLabelPaddingRight();
        }
        return f;
    }

    public final Drawable getDrawable() {
        Drawable drawable = this.A05;
        if (drawable == null) {
            return this.A04;
        }
        return drawable;
    }

    public final CharSequence getLabelText() {
        return this.A08;
    }

    public final C338897ii getMerchandiseBadge() {
        return this.A07;
    }

    public final void setIconPaddingForUtilityToolBarItem(int i) {
        this.A0E = i;
        invalidate();
    }

    public final void setIconRotation(float f) {
        this.A0D = f;
        invalidate();
    }

    public final void setIsFlexModeBackgroundEnabled(boolean z) {
        int i;
        this.A0F = z;
        Paint paint = this.A0T;
        if (z) {
            i = getFlexModeBackgroundColor();
        } else {
            i = this.A0S;
        }
        paint.setColor(i);
        invalidate();
    }

    public final void setLabelDisplayPercentage(float f) {
        this.A00 = f;
        A02(this);
    }

    public final void setMerchandiseBadge(C338897ii r1) {
        this.A07 = r1;
        invalidate();
    }

    public final void setPlacement(double d) {
        this.A0C = d;
        invalidate();
    }

    public static final void A02(CameraToolMenuItem cameraToolMenuItem) {
        int backgroundWidth = (int) cameraToolMenuItem.getBackgroundWidth();
        if (cameraToolMenuItem.A09 && cameraToolMenuItem.getSelectedIconPercentage() > 0.0f) {
            double d = (double) backgroundWidth;
            double ceil = Math.ceil((double) cameraToolMenuItem.A0J);
            if (d < ceil) {
                d = ceil;
            }
            backgroundWidth = (int) d;
        }
        if (cameraToolMenuItem.A02 > 0.0f || cameraToolMenuItem.A00 > 0.0f) {
            backgroundWidth = (int) cameraToolMenuItem.getMaxSize();
        }
        if (cameraToolMenuItem.getWidth() != backgroundWidth) {
            0nA.A0f(cameraToolMenuItem, backgroundWidth);
        }
        cameraToolMenuItem.invalidate();
    }

    private final float getBackgroundWidth() {
        float backgroundSpringValue = getBackgroundSpringValue();
        float f = this.A0I;
        float f2 = 1.0f - 0.0f;
        float maxSize = getMaxSize() - f;
        float f3 = 0.0f;
        if (f2 != 0.0f) {
            f3 = (backgroundSpringValue - 0.0f) / f2;
        }
        return (f3 * maxSize) + f;
    }

    private final float getLabelPaddingLeft() {
        boolean A032 = A03();
        Resources resources = getResources();
        int i = R.dimen.abc_edit_text_inset_top_material;
        if (A032) {
            i = R.dimen.abc_select_dialog_padding_start_material;
        }
        return resources.getDimension(i);
    }

    private final float getLabelPaddingRight() {
        boolean A032 = A03();
        Resources resources = getResources();
        int i = R.dimen.abc_select_dialog_padding_start_material;
        if (A032) {
            i = R.dimen.abc_edit_text_inset_top_material;
        }
        return resources.getDimension(i);
    }

    private final float getSelectedIconPercentage() {
        return 0mi.A02(getBackgroundSpringValue(), 0.3f, 0.0f, 0.0f, 1.0f);
    }

    public final void A04(boolean z, boolean z2) {
        2cs r5;
        if (z != isSelected()) {
            super.setSelected(z);
            double d = 0.0d;
            if (z) {
                if (z2) {
                    11Z.A01(this.A0R);
                    boolean z3 = this.A0A;
                    r5 = this.A0Q;
                    if (z3) {
                        d = 1.0d;
                    } else {
                        r5.A08(0.3d, true);
                    }
                }
                invalidate();
            }
            r5 = this.A0Q;
            r5.A06(d);
            invalidate();
        }
    }

    public final void setBubbleBoiEnabled(boolean z) {
        this.A09 = z;
    }

    public final void setExpandingBackgroundEnabled(boolean z) {
        this.A0A = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CameraToolMenuItem(android.content.Context r18, android.util.AttributeSet r19, int r20, java.lang.Float r21) {
        /*
            r17 = this;
            r10 = 1
            r11 = r18
            X.0qQ.A0B(r11, r10)
            r16 = r19
            r1 = r20
            r12 = r17
            r0 = r16
            r12.<init>(r11, r0, r1)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r9 = r11.getColor(r0)
            r12.A0S = r9
            r1 = 4
            X.9LC r0 = new X.9LC
            r0.<init>(r11, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r12.A0Y = r0
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>(r10)
            r12.A0T = r8
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r10)
            r12.A0U = r7
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r10)
            r12.A0L = r6
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r10)
            r12.A0M = r5
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r10)
            r12.A0O = r4
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r10)
            r12.A0N = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r12.A0V = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.A0W = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r12.A0P = r0
            if (r21 == 0) goto L_0x019f
            float r13 = r21.floatValue()
        L_0x006b:
            r12.A0I = r13
            android.content.res.Resources r3 = r12.getResources()
            r2 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r0 = r3.getDimension(r2)
            r12.A0H = r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r0
            double r14 = (double) r13
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r14, r0)
            double r14 = r14 / r0
            double r0 = java.lang.Math.sqrt(r14)
            float r14 = (float) r0
            float r13 = r13 + r14
            float r0 = r3.getDimension(r2)
            float r13 = r13 + r0
            r12.A0J = r13
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            float r0 = r3.getDimension(r0)
            r12.A0K = r0
            r12.A0A = r10
            X.8EX r14 = new X.8EX
            r14.<init>(r12)
            r12.A0X = r14
            r13 = 0
            r12.setWillNotDraw(r13)
            r8.setColor(r9)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r7.setStyle(r0)
            android.content.Context r2 = r12.getContext()
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r2.getColor(r0)
            r7.setColor(r0)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r2.getColor(r0)
            r6.setColor(r0)
            r6 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r2.getColor(r6)
            r5.setColor(r0)
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            float r0 = r3.getDimension(r0)
            r5.setTextSize(r0)
            java.lang.String r1 = "sans-serif-medium"
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r1, r13)
            boolean r0 = X.0oh.A08()
            if (r0 == 0) goto L_0x0198
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x00fc
            r7 = -2144172598(0xffffffff803285ca, float:-4.639769E-39)
            r0 = 963(0x3c3, float:1.35E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0fS.A01(r0, r7)
        L_0x00fc:
            android.graphics.Typeface r0 = X.0oh.A01(r11)
            r5.setTypeface(r0)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x010f
            r0 = -1045868704(0xffffffffc1a94f60, float:-21.163757)
            X.0fS.A00(r0)
        L_0x010f:
            int r0 = r2.getColor(r6)
            r4.setColor(r0)
            r0 = 2131165206(0x7f070016, float:1.7944623E38)
            float r0 = r3.getDimension(r0)
            r4.setTextSize(r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r10)
            boolean r0 = X.0oh.A08()
            if (r0 == 0) goto L_0x0192
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x013e
            r1 = -2144172598(0xffffffff803285ca, float:-4.639769E-39)
            r0 = 963(0x3c3, float:1.35E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0fS.A01(r0, r1)
        L_0x013e:
            android.graphics.Typeface r0 = X.0oh.A00(r11)
            r4.setTypeface(r0)
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x0151
            r0 = -1045868704(0xffffffffc1a94f60, float:-21.163757)
            X.0fS.A00(r0)
        L_0x0151:
            r0 = 2131165633(0x7f0701c1, float:1.7945489E38)
            float r0 = r3.getDimension(r0)
            r4.setLetterSpacing(r0)
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
            X.2cs r0 = X.AnonymousClass8EF.A00(r14, r2, r0)
            r12.A0Q = r0
            if (r19 == 0) goto L_0x018a
            int[] r1 = X.C71382cm.A0D
            r0 = r16
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r0, r1)
            X.0qQ.A07(r4)
            r0 = 2
            int r3 = r4.getResourceId(r0, r13)
            int r2 = r4.getResourceId(r10, r13)
            int r1 = r4.getResourceId(r13, r13)
            X.8EZ r0 = new X.8EZ
            r0.<init>(r3, r2, r1, r13)
            r12.setCameraToolResources(r0)
            r4.recycle()
        L_0x018a:
            X.8EY r0 = new X.8EY
            r0.<init>(r12)
            r12.A0R = r0
            return
        L_0x0192:
            if (r1 == 0) goto L_0x0151
            r4.setTypeface(r1)
            goto L_0x0151
        L_0x0198:
            if (r7 == 0) goto L_0x010f
            r5.setTypeface(r7)
            goto L_0x010f
        L_0x019f:
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            float r13 = r1.getDimension(r0)
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.Float):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraToolMenuItem(Context context, AttributeSet attributeSet, int i, Float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraToolMenuItem(Context context) {
        this(context, (AttributeSet) null, 0, (Float) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraToolMenuItem(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Float) null);
        0qQ.A0B(context, 1);
    }
}
