package com.instagram.creation.photo.edit.tint;

import X.0qQ;
import X.2Yu;
import X.2cp;
import X.2cs;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C273654mx;
import X.C61340me;
import X.C62580KiD;
import X.C64940Lkf;
import X.C65165LoU;
import X.C65888M3d;
import X.C71392co;
import X.JTO;
import X.JTT;
import X.K0E;
import X.LSj;
import X.MSC;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgTintColorPicker extends FrameLayout implements View.OnTouchListener {
    public int A00;
    public int A01;
    public TextView A02;
    public int A03;
    public Paint A04;
    public MSC A05;
    public boolean A06;
    public boolean A07;
    public final 2cs A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final LayerDrawable A0E;
    public final 2cp A0F;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgTintColorPicker(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        this.A04.setColor(-65536);
        int width = getWidth();
        int i = this.A0A;
        this.A01 = width / ((i * 2) + 1);
        for (int i2 = 0; i2 < i; i2++) {
            float[] fArr = LSj.A00;
            C62580KiD kiD = C62580KiD.values()[i2];
            0qQ.A07(kiD);
            this.A04.setColor(LSj.A00(getContext(), kiD, this.A06));
            if (this.A00 == i2) {
                LayerDrawable layerDrawable = this.A0E;
                int i3 = this.A0B;
                int i4 = this.A01;
                int i5 = i4 + (i4 / 2) + (i4 * i2 * 2);
                int height = getHeight() / 2;
                int i6 = i3 / 2;
                layerDrawable.setBounds(i5 - i6, height - i6, i5 + i6, height + i6);
                layerDrawable.draw(canvas);
            } else {
                int i7 = this.A01;
                float f = (float) (i7 + (i7 / 2) + (i7 * i2 * 2));
                canvas.drawCircle(f, (float) (getHeight() / 2), (float) (this.A01 / 2), this.A04);
                if (i2 == 0) {
                    this.A04.setColor(this.A09);
                    float f2 = f + (((float) this.A01) / 3.0f);
                    float height2 = (float) (getHeight() / 2);
                    float f3 = ((float) this.A01) / 3.0f;
                    canvas2.drawLine(f2, height2 - f3, f - f3, ((float) (getHeight() / 2)) + (((float) this.A01) / 3.0f), this.A04);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MSC msc;
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = this.A01;
        int width = getWidth() - this.A01;
        int height = view.getHeight();
        int i2 = i / 2;
        float f = (float) i2;
        if (x > f && x < ((float) (i2 + width)) && y > ((float) (height / 4))) {
            int i3 = (int) ((x - f) / ((((float) width) * 1.0f) / ((float) this.A0A)));
            if (motionEvent.getActionMasked() == A1U) {
                if (!(i3 != this.A03 || i3 == 0 || (msc = this.A05) == null)) {
                    C64940Lkf lkf = ((C65165LoU) msc).A00;
                    2cs r0 = lkf.A0D;
                    if (r0 != null) {
                        r0.A04();
                        IgEditSeekBar igEditSeekBar = lkf.A0H;
                        if (igEditSeekBar != null) {
                            igEditSeekBar.bringToFront();
                            View view2 = lkf.A0A;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                View view3 = lkf.A0A;
                                if (view3 != null) {
                                    view3.bringToFront();
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                this.A03 = i3;
            }
            if (motionEvent.getActionMasked() == 0 && this.A07 && i3 != this.A00) {
                TextView textView = this.A02;
                if (textView != null) {
                    textView.setVisibility(0);
                    TextView textView2 = this.A02;
                    if (textView2 != null) {
                        textView2.setPadding(0, (getHeight() / 2) + (this.A01 / 2), 0, 0);
                        postDelayed(new C65888M3d(this), 2500);
                        this.A07 = false;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            setCurrentColor(i3);
        }
        return A1U;
    }

    public final void setNux(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A02 = textView;
    }

    public final void setTintColorPaint(Paint paint) {
        0qQ.A0B(paint, 0);
        this.A04 = paint;
    }

    private final int getCurrentTintAsValue() {
        return this.A00;
    }

    private final int getLeftBound() {
        return this.A01;
    }

    public final boolean getAdjustingShadows() {
        return this.A06;
    }

    public final Paint getTintColorPaint() {
        return this.A04;
    }

    public final void setAdjustingShadows(boolean z) {
        if (this.A06 != z) {
            int i = this.A00;
            float[] fArr = LSj.A00;
            C62580KiD kiD = C62580KiD.values()[i];
            0qQ.A07(kiD);
            int A002 = LSj.A00(getContext(), kiD, z);
            AnonymousClass7TE.A1R(this.A0D, A002);
            AnonymousClass7TE.A1R(this.A0C, A002);
            this.A06 = z;
            invalidate();
        }
    }

    public final void setCurrentColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            float[] fArr = LSj.A00;
            C62580KiD kiD = C62580KiD.values()[i];
            0qQ.A07(kiD);
            int A002 = LSj.A00(getContext(), kiD, this.A06);
            AnonymousClass7TE.A1R(this.A0D, A002);
            AnonymousClass7TE.A1R(this.A0C, A002);
            MSC msc = this.A05;
            if (msc != null) {
                msc.Drn(i);
            }
            invalidate();
        }
    }

    public final void setOnTintColorChangeListener(MSC msc) {
        this.A05 = msc;
        if (msc != null) {
            msc.Drn(this.A00);
        }
    }

    private final int getCenterY() {
        return getHeight() / 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgTintColorPicker(Context context, AttributeSet attributeSet) {
        super(2Yu.A0I(context, R.attr.tintPickerStyle), attributeSet);
        0qQ.A0B(context, 1);
        Resources resources = context.getResources();
        Paint A0C2 = JTO.A0C();
        this.A04 = A0C2;
        A0C2.setColor(resources.getColor(R.color.grey_5));
        this.A04.setFlags(1);
        this.A04.setStrokeWidth(AnonymousClass7TE.A01(resources, R.dimen.afi_indicator_arrow_margin_top));
        float[] fArr = LSj.A00;
        this.A0A = C62580KiD.values().length;
        Context context2 = getContext();
        this.A09 = 2Yu.A0F(context2, R.attr.tintPickerLineColor);
        Drawable drawable = context2.getDrawable(2Yu.A0H(context2, R.attr.tintPickerKnob));
        0qQ.A0C(drawable, C273654mx.A00(16));
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        this.A0E = layerDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.seek_bar_knob_outer_circle);
        this.A0D = findDrawableByLayerId;
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.seek_bar_knob_inner_circle);
        this.A0C = findDrawableByLayerId2;
        this.A0B = resources.getDimensionPixelSize(2Yu.A0H(context2, R.attr.tintPickerSelectedSize));
        int A002 = LSj.A00(context2, C62580KiD.A06, this.A06);
        AnonymousClass7TE.A1R(findDrawableByLayerId, A002);
        AnonymousClass7TE.A1R(findDrawableByLayerId2, A002);
        2cp A003 = C61340me.A00();
        this.A0F = A003;
        C71392co A042 = C71392co.A04(4.0d, 4.0d);
        2cs A022 = A003.A02();
        this.A08 = A022;
        A022.A09(A042);
        K0E.A00(A022, this, 7);
        this.A07 = true;
        this.A06 = true;
        setOnTouchListener(this);
        setWillNotDraw(false);
    }

    public /* synthetic */ IgTintColorPicker(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
