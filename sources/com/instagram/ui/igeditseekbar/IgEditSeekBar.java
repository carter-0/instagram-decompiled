package com.instagram.ui.igeditseekbar;

import X.0qQ;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C14724U4o;
import X.C51966G9m;
import X.C61360ml;
import X.C71382cm;
import X.JTO;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import java.util.List;

public final class IgEditSeekBar extends C14724U4o {
    public int A00;
    public int A01;
    public int A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public Drawable A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Drawable A0G;
    public final boolean A0H;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgEditSeekBar(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e3, code lost:
        if (r13.A01 <= r2) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            r1 = 0
            r7 = r14
            X.0qQ.A0B(r14, r1)
            int r0 = r13.A00
            int r0 = r0 / 2
            int r3 = r13.A07
            int r0 = r0 + r3
            float r8 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / 2
            float r9 = (float) r0
            int r0 = r13.A00
            int r2 = r0 / 2
            int r2 = r2 + r3
            int r0 = r13.getLengthPx()
            int r2 = r2 + r0
            float r10 = (float) r2
            int r0 = r13.getHeight()
            int r0 = r0 / 2
            float r11 = (float) r0
            android.graphics.Paint r12 = r13.A0F
            r7.drawLine(r8, r9, r10, r11, r12)
            int r0 = r13.getRootCenterX()
            float r8 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / 2
            float r9 = (float) r0
            int r0 = r13.getKnobCenterX()
            float r10 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / 2
            float r11 = (float) r0
            android.graphics.Paint r12 = r13.A0E
            r7.drawLine(r8, r9, r10, r11, r12)
            android.graphics.drawable.Drawable r6 = r13.A0G
            if (r6 == 0) goto L_0x0066
            int r2 = r13.A0B
            int r5 = r13.getRootCenterX()
            int r0 = r13.getHeight()
            int r4 = r0 / 2
            int r3 = r2 / 2
            int r2 = r5 - r3
            int r0 = r4 - r3
            int r5 = r5 + r3
            int r4 = r4 + r3
            r6.setBounds(r2, r0, r5, r4)
            r6.draw(r14)
        L_0x0066:
            android.graphics.drawable.Drawable r5 = r13.A06
            int r2 = r13.A00
            int r4 = r13.getKnobCenterX()
            int r0 = r13.getHeight()
            int r3 = r0 / 2
            X.0qQ.A0B(r5, r1)
            int r2 = r2 / 2
            int r1 = r4 - r2
            int r0 = r3 - r2
            int r4 = r4 + r2
            int r3 = r3 + r2
            r5.setBounds(r1, r0, r4, r3)
            android.graphics.drawable.Drawable r0 = r13.A06
            r0.draw(r14)
            boolean r0 = r13.A04
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x00dc
            int r1 = r13.getCurrentPositionAsValue()
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x012f
            java.util.List r0 = r13.A03
            if (r0 == 0) goto L_0x012f
            java.lang.String r5 = X.AnonymousClass7TE.A19(r0, r1)
        L_0x009d:
            if (r1 != 0) goto L_0x00a3
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x00dc
        L_0x00a3:
            int r0 = r13.getKnobCenterX()
            float r4 = (float) r0
            int r0 = r13.getWidth()
            float r1 = (float) r0
            android.graphics.Paint r3 = r13.A09
            float r0 = r3.measureText(r5)
            float r0 = r0 / r6
            float r1 = r1 - r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ba
            r4 = r1
        L_0x00ba:
            float r1 = r3.measureText(r5)
            float r1 = r1 / r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c4
            r4 = r1
        L_0x00c4:
            int r0 = r13.getHeight()
            int r2 = r0 / 2
            android.content.Context r0 = r13.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165288(0x7f070068, float:1.7944789E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 - r0
            float r0 = (float) r2
            r14.drawText(r5, r4, r0, r3)
        L_0x00dc:
            int r2 = r13.A02
            if (r2 < 0) goto L_0x00e5
            int r0 = r13.A01
            r1 = 1
            if (r0 > r2) goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            java.util.List r2 = r13.A03
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0126
            if (r2 == 0) goto L_0x0126
            if (r1 == 0) goto L_0x0125
            int r1 = r13.A01
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0125
        L_0x00f8:
            int r0 = r13.A02
            float r0 = (float) r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 - r2
            int r0 = r13.A02(r0)
            float r8 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / 2
            float r9 = (float) r0
            int r0 = r13.A0A
            float r1 = (float) r0
            float r1 = r1 / r6
            float r9 = r9 - r1
            int r0 = r13.A01
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = r13.A02(r0)
            float r10 = (float) r0
            int r0 = r13.getHeight()
            int r0 = r0 / 2
            float r11 = (float) r0
            float r11 = r11 + r1
            android.graphics.Paint r12 = r13.A0D
            r7.drawRect(r8, r9, r10, r11, r12)
        L_0x0125:
            return
        L_0x0126:
            if (r1 == 0) goto L_0x0125
            int r1 = r13.A01
            int r0 = r13.A02
            if (r1 > r0) goto L_0x0125
            goto L_0x00f8
        L_0x012f:
            java.lang.String r5 = java.lang.String.valueOf(r1)
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.igeditseekbar.IgEditSeekBar.onDraw(android.graphics.Canvas):void");
    }

    public final void setOverrideVisualValueList(List list) {
        0qQ.A0B(list, 0);
        this.A02 = C51966G9m.A06(list);
        this.A03 = list;
    }

    private final int A02(float f) {
        return (this.A00 / 2) + this.A07 + ((int) (((float) getLengthPx()) * Math.min(1.0f, Math.max(0.0f, f / ((float) (this.A02 + getFatZeroExtraSegmentSize()))))));
    }

    private final int getFatZeroExtraSegmentSize() {
        float f = this.A01;
        if (f == 0.0f || f == 1.0f) {
            return getFatZeroRadiusSegmentSize();
        }
        return getFatZeroRadiusSegmentSize() * 2;
    }

    private final int getFatZeroRadiusSegmentSize() {
        return JTO.A04((float) this.A02, 100.0f);
    }

    private final int getKnobCenterX() {
        return (this.A00 / 2) + this.A07 + ((int) (this.A00 * ((float) getLengthPx())));
    }

    private final int getLeftBound() {
        return (this.A00 / 2) + this.A07;
    }

    private final int getRootCenterX() {
        return (this.A00 / 2) + this.A07 + (((int) (this.A01 * ((float) getLengthPx()))) * (this.A0H ? 1 : 0));
    }

    private final int getSeekerBarSegmentSize() {
        return this.A02 + getFatZeroExtraSegmentSize();
    }

    public CharSequence getAccessibilityClassName() {
        String name = IgEditSeekBar.class.getName();
        0qQ.A07(name);
        return name;
    }

    public int getCurrentPositionAsValue() {
        int A052 = AnonymousClass7TE.A05(this.A00 - this.A01, (float) (this.A02 + getFatZeroExtraSegmentSize()));
        int abs = Math.abs(A052);
        int fatZeroRadiusSegmentSize = getFatZeroRadiusSegmentSize();
        if (abs <= fatZeroRadiusSegmentSize) {
            return 0;
        }
        if (A052 <= 0) {
            fatZeroRadiusSegmentSize = -fatZeroRadiusSegmentSize;
        }
        return A052 - fatZeroRadiusSegmentSize;
    }

    public final int getKnobWidthInPx() {
        return this.A00;
    }

    public final void setActiveColor(int i) {
        this.A0E.setColor(i);
        Drawable mutate = this.A06.mutate();
        this.A06 = mutate;
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void setDisplayCurrentValueText(boolean z) {
        this.A04 = z;
    }

    public final void setInactiveColor(int i) {
        this.A0F.setColor(i);
    }

    public final void setKnobWidthInPx(int i) {
        this.A00 = i;
    }

    public final void setSeekBarHeight(float f) {
        this.A0E.setStrokeWidth(f);
        this.A0F.setStrokeWidth(f);
    }

    public final void setShouldOverrideVisualValue(boolean z) {
        this.A04 = z;
        this.A05 = z;
    }

    private final int getCenterY() {
        return getHeight() / 2;
    }

    public final float A03(int i) {
        int fatZeroRadiusSegmentSize = getFatZeroRadiusSegmentSize();
        int i2 = fatZeroRadiusSegmentSize;
        if (i <= 0) {
            fatZeroRadiusSegmentSize = -fatZeroRadiusSegmentSize;
        }
        int i3 = i + fatZeroRadiusSegmentSize;
        if (Math.abs(i3) <= i2) {
            return this.A01;
        }
        return (((float) i3) / ((float) (this.A02 + getFatZeroExtraSegmentSize()))) + this.A01;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C13988Tno.A0x(this.A06, this);
    }

    public int getLengthPx() {
        int width = getWidth();
        int i = this.A00 / 2;
        int i2 = this.A07;
        return ((width - i) - i2) - (i + i2);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-975113420);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(806346548, A062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgEditSeekBar(Context context, AttributeSet attributeSet) {
        super(2Yu.A0I(context, R.attr.seekBarStyle), attributeSet);
        Drawable drawable;
        0qQ.A0B(context, 1);
        this.A04 = true;
        this.A0H = true;
        this.A0C = context;
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.A0F = paint;
        Context context2 = getContext();
        paint.setColor(2Yu.A0F(context2, R.attr.seekBarInactiveColor));
        C13988Tno.A0u(resources, paint, R.dimen.afi_indicator_arrow_margin_top);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.A0E = paint2;
        paint2.setColor(2Yu.A0F(context2, R.attr.seekBarActiveColor));
        C13988Tno.A0u(resources, paint2, R.dimen.afi_indicator_arrow_margin_top);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.A09 = paint3;
        paint3.setColor(2Yu.A0F(context2, R.attr.seekBarTextColor));
        C13988Tno.A0t(resources, paint3, R.dimen.auth_title_text_size);
        paint3.setAlpha(2Yu.A0F(context2, R.attr.seekBarTextAlpha));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.A0D = paint4;
        paint4.setColor(2Yu.A0F(context2, R.attr.seekBarRectangleRangeColor));
        paint4.setAlpha(2Yu.A0F(context2, R.attr.seekBarRectangleRangeAlpha));
        this.A0A = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0B = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A08 = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C71382cm.A15);
        0qQ.A07(obtainStyledAttributes);
        this.A00 = resources.getDimensionPixelSize(obtainStyledAttributes.getResourceId(1, 2Yu.A0H(context2, R.attr.seekBarKnobSize)));
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(2, AnonymousClass7TG.A07(context2));
        this.A06 = C61360ml.A00(context2, obtainStyledAttributes.getResourceId(0, 2Yu.A0H(context2, R.attr.seekBarKnob)));
        obtainStyledAttributes.recycle();
        int A0H2 = 2Yu.A0H(context2, R.attr.seekBarRoot);
        if (A0H2 != 0) {
            drawable = context2.getDrawable(A0H2);
        } else {
            drawable = null;
        }
        this.A0G = drawable;
    }
}
