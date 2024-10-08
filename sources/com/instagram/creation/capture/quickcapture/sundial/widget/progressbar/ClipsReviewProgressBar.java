package com.instagram.creation.capture.quickcapture.sundial.widget.progressbar;

import X.0qQ;
import X.0sn;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass831;
import X.C359268cW;
import X.C61195Jyo;
import X.JTO;
import X.JTP;
import X.JTT;
import X.JTU;
import X.LSY;
import X.SN3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipsReviewProgressBar extends View {
    public int A00;
    public int A01;
    public AnonymousClass831 A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C359268cW A07;
    public final Paint A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsReviewProgressBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        A00(canvas, 0.0f, AnonymousClass7TE.A02(this), this.A03);
        int A082 = JTO.A08(this.A02);
        float f = 0.0f;
        for (int i = 0; i < A082; i++) {
            float A002 = JTU.A00(this, this.A02.A00(i));
            int i2 = 178;
            if (this.A01 < this.A02.A01(i)) {
                i2 = 76;
            }
            A00(canvas, f, A002, (this.A05 & 16777215) | (i2 << 24));
            f += A002;
        }
        this.A07.draw(canvas);
        int A083 = JTO.A08(this.A02);
        float f2 = 0.0f;
        for (int i3 = 0; i3 < A083; i3++) {
            f2 += JTU.A00(this, this.A02.A00(i3));
            float f3 = (float) this.A06;
            A00(canvas, f2 - f3, f3, this.A05);
        }
    }

    private final void A00(Canvas canvas, float f, float f2, int i) {
        Paint paint = this.A08;
        paint.setColor(i);
        Canvas canvas2 = canvas;
        canvas2.drawRect(f, 0.0f, f + f2, (float) this.A04, paint);
    }

    public final void A01(int i, int i2) {
        if (this.A02.A04(i) != null) {
            LSY.A02(new C61195Jyo(i2), this.A02, i);
            invalidate();
        }
    }

    public final void A02(List list, int i) {
        0qQ.A0B(this.A02, 0);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 0);
        this.A02 = new AnonymousClass831(r1, false);
        this.A00 = i;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(new C61195Jyo(AnonymousClass7TG.A0F(it)));
        }
        this.A02 = new AnonymousClass831(A1C, false);
        invalidate();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.A07.setBounds(0, 0, (int) JTU.A00(this, this.A01), this.A04);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A04, SN3.MAX_SIGNED_POWER_OF_TWO));
    }

    public final void setPlaybackPosition(int i) {
        int min = Math.min(i, this.A02.A00);
        this.A01 = min;
        this.A07.setBounds(0, 0, (int) JTU.A00(this, min), this.A04);
        invalidate();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1667956959);
        this.A07.A00(i, i2);
        AnonymousClass0fD.A0D(180472124, A062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsReviewProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A02 = new AnonymousClass831(0sn.A00, false);
        this.A08 = AnonymousClass7TE.A0V(1);
        this.A00 = 15000;
        Resources resources = getResources();
        this.A04 = JTP.A03(resources);
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A03 = context.getColor(R.color.clips_progress_bar_background_color);
        this.A05 = AnonymousClass7TE.A09(context);
        this.A07 = new C359268cW(context, context.getColor(R.color.clips_progress_bar_gradient_color_0), context.getColor(R.color.clips_progress_bar_gradient_color_1));
    }

    public /* synthetic */ ClipsReviewProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsReviewProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
