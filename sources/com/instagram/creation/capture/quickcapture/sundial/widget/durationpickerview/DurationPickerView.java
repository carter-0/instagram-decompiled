package com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview;

import X.0mi;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass1GB;
import X.AnonymousClass7TE;
import X.C355238Pf;
import X.C355368Ps;
import X.C355378Pt;
import X.C355408Pw;
import X.C59972Jch;
import X.C64882Lji;
import X.JTO;
import X.JTP;
import X.JTT;
import X.L0Y;
import X.MQS;
import X.MS8;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DurationPickerView extends View implements MS8 {
    public float A00;
    public int A01;
    public long A02;
    public MQS A03;
    public boolean A04;
    public float[] A05;
    public float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final C355368Ps A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Paint A0H;
    public final Rect A0I;
    public final C355378Pt A0J;
    public final C355238Pf A0K;
    public final C59972Jch A0L;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DurationPickerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        C355378Pt r2 = this.A0J;
        float A012 = (float) r2.A01();
        int i = r2.getBounds().top;
        int i2 = r2.A0D;
        C355368Ps r7 = this.A0D;
        canvas2.drawRect(A012, (float) (i + i2), (float) r7.getLeftInnerEdge(), (float) (JTO.A06(r2) - i2), this.A0H);
        r2.draw(canvas2);
        if (this.A04) {
            float f = this.A00;
            if (f > 0.0f || f < 1.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                this.A02 = currentTimeMillis;
                float min = Math.min(1.0f, f + (((float) (currentTimeMillis - this.A02)) / 150.0f));
                this.A00 = min;
                if (min < 1.0f) {
                    invalidate();
                }
                this.A0A.setAlpha(AnonymousClass7TE.A06(255.0f, this.A00));
            }
        }
        canvas2.drawRect(this.A0I, this.A0A);
        this.A0L.draw(canvas2);
        float top = ((float) r7.getTop()) + (AnonymousClass7TE.A03(r7) / 2.0f);
        int left = r7.getLeft();
        int i3 = this.A07;
        float f2 = (float) (left + i3);
        float right = ((float) ((r7.getRight() - i3) - this.A09)) - f2;
        float leftTrimmerValue = r7.getLeftTrimmerValue();
        for (float f3 : this.A05) {
            if (f3 > leftTrimmerValue) {
                float f4 = (f3 * right) + f2;
                float f5 = (float) this.A08;
                canvas2.drawCircle(f4, top, f5, this.A0B);
                canvas2.drawCircle(f4, top, f5, this.A0C);
            }
        }
        r7.draw(canvas2);
    }

    private final void A00() {
        if (!Float.isNaN(this.A06)) {
            C355368Ps r5 = this.A0D;
            int leftInnerEdge = r5.getLeftInnerEdge();
            this.A0I.set(leftInnerEdge, r5.getTopInnerEdge(), AnonymousClass7TE.A06((float) (r5.getRightInnerEdge() - leftInnerEdge), this.A06) + leftInnerEdge, r5.getBottomInnerEdge());
            invalidate();
        }
    }

    public void setProgress(float f) {
        if (!this.A04) {
            this.A04 = true;
            this.A02 = System.currentTimeMillis();
            invalidate();
        }
        float A002 = 0mi.A00(f, 0.0f, 1.0f);
        if (A002 != this.A06) {
            this.A06 = A002;
            A00();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1456064567);
        int i5 = i;
        int i6 = i2;
        super.onSizeChanged(i5, i6, i3, i4);
        C355378Pt r11 = this.A0J;
        r11.setBounds(0, 0, i5, i6);
        C59972Jch jch = this.A0L;
        float f = (float) i6;
        float f2 = f / 2.0f;
        float f3 = ((float) this.A0E) / 2.0f;
        jch.setBounds(0, AnonymousClass1GB.A01(f2 - f3), r11.A02(), AnonymousClass1GB.A01(f2 + f3));
        C355368Ps r1 = this.A0D;
        r1.layout(0, 0, i5, i6);
        A00();
        LinearGradient linearGradient = new LinearGradient(0.0f, f, (float) i5, 0.0f, this.A0F, this.A0G, Shader.TileMode.CLAMP);
        r1.setShader(linearGradient);
        this.A0A.setShader(linearGradient);
        this.A0B.setShader(linearGradient);
        AnonymousClass0fD.A0D(1689719783, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ViewParent parent;
        int A052 = AnonymousClass0fD.A05(-974043255);
        0qQ.A0B(motionEvent, 0);
        int action = motionEvent.getAction();
        if (action == 0 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        C355368Ps r4 = this.A0D;
        if (r4.onTouchEvent(motionEvent)) {
            i = -44253811;
        } else {
            float x = motionEvent.getX();
            if (action != 0 || ((float) r4.getLeftInnerEdge()) > x || x > ((float) r4.getRight())) {
                AnonymousClass0fD.A0C(-857072612, A052);
                return false;
            }
            C355368Ps.A02(r4, motionEvent.getX());
            r4.A0A = true;
            r4.A08 = true;
            r4.A00 = motionEvent.getX();
            r4.A03 = motionEvent.getEventTime();
            C355238Pf r0 = r4.A05;
            if (r0 != null) {
                r0.Dsi();
            }
            i = -1120700945;
        }
        AnonymousClass0fD.A0C(i, A052);
        return true;
    }

    public void setDelegate(MQS mqs) {
        this.A03 = mqs;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DurationPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C64882Lji lji = new C64882Lji(this);
        this.A0K = lji;
        this.A01 = 100;
        this.A05 = new float[0];
        Resources resources = context.getResources();
        int A0D2 = AnonymousClass7TE.A0D(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A09 = dimensionPixelSize;
        this.A0E = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A07 = dimensionPixelSize2;
        this.A08 = resources.getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        this.A0F = context.getColor(R.color.clips_progress_bar_gradient_color_0);
        this.A0G = context.getColor(R.color.clips_progress_bar_gradient_color_1);
        int A0F2 = 2Yu.A0F(context, R.attr.durationPickerBackgroundTrimmerColor);
        C355378Pt r3 = new C355378Pt(A0F2, A0D2, dimensionPixelSize2, 0);
        if (dimensionPixelSize > 0) {
            C355408Pw r0 = new C355408Pw(dimensionPixelSize, A0F2);
            r0.A00((Drawable) null, dimensionPixelSize2);
            r3.A09(r0);
        }
        r3.A06(0);
        this.A0J = r3;
        Paint A0C2 = JTO.A0C();
        this.A0H = A0C2;
        A0C2.setColor(A0F2);
        this.A0I = AnonymousClass7TE.A0W();
        this.A0A = AnonymousClass7TE.A0V(1);
        int A0F3 = 2Yu.A0F(context, R.attr.durationPickerSoundwaveColor);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A0B = A0V;
        AnonymousClass7TE.A1Q(A0V);
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0C = A0V2;
        JTO.A1N(A0V2);
        A0V2.setStrokeWidth((float) JTP.A04(resources));
        A0V2.setColor(A0F3);
        this.A0L = new C59972Jch(new L0Y(this), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A0F3);
        C355368Ps r4 = new C355368Ps(context);
        this.A0D = r4;
        Drawable drawable = context.getDrawable(R.drawable.duration_picker_trim_handle_icon);
        C355378Pt r1 = new C355378Pt(-16777216, A0D2, dimensionPixelSize2, 0);
        if (dimensionPixelSize > 0) {
            C355408Pw r02 = new C355408Pw(dimensionPixelSize, -16777216);
            r02.A00(drawable, dimensionPixelSize2);
            r1.A09(r02);
        }
        r1.A06(0);
        JTT.A1J(r1, r4);
        r4.invalidate();
        r4.A05 = lji;
    }

    public /* synthetic */ DurationPickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DurationPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
