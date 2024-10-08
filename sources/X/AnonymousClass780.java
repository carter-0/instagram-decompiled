package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.780  reason: invalid class name */
public final class AnonymousClass780 implements AnonymousClass3AG {
    public AnonymousClass7L2 A00;
    public boolean A01;
    public boolean A02;
    public LayerDrawable A03;
    public String A04;
    public final int A05;
    public final int A06;
    public final LayerDrawable A07;
    public final LayerDrawable A08;
    public final TextPaint A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public AnonymousClass780(Context context, AnonymousClass7L2 r6, String str, String str2, int i, int i2, int i3, int i4) {
        Drawable drawable = context.getDrawable(i3);
        0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        this.A08 = (LayerDrawable) drawable;
        Drawable drawable2 = context.getDrawable(i2);
        0qQ.A0C(drawable2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable2;
        this.A07 = layerDrawable;
        TextPaint textPaint = new TextPaint();
        this.A09 = textPaint;
        this.A03 = layerDrawable;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0A = str;
        this.A0B = context.getResources().getString(i);
        this.A0D = str2;
        this.A0C = context.getResources().getString(i4);
        this.A04 = str;
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        textPaint.setAntiAlias(true);
        this.A00 = r6;
        A00();
    }

    public final void D8Z(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
    }

    public final void EEy(Canvas canvas, View view, RefreshableNestedScrollingParent refreshableNestedScrollingParent, float f, int i, boolean z) {
        float f2 = f;
        if (f > 0.0f) {
            Canvas canvas2 = canvas;
            canvas2.save();
            try {
                int i2 = this.A05;
                canvas2.translate(0.0f, (((float) (view.getBottom() - view.getPaddingBottom())) - (((float) i) * f)) - ((float) i2));
                float width = (float) canvas2.getWidth();
                canvas2.clipRect(0.0f, 0.0f, width, Float.MAX_VALUE);
                int i3 = this.A06;
                int i4 = (int) ((width - ((float) i3)) / 2.0f);
                this.A03.setBounds(i4, 0, i4 + i3, i3);
                this.A03.setLevel((int) (Math.max(0.0f, f2) * 10000.0f));
                this.A03.draw(canvas2);
                StaticLayout staticLayout = new StaticLayout(this.A04, this.A09, (int) (((double) canvas2.getWidth()) * 0.9d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                canvas2.translate(width / 2.0f, (float) (i3 - i2));
                staticLayout.draw(canvas2);
            } finally {
                canvas2.restore();
            }
        }
    }

    public final void EaP(boolean z) {
    }

    public final void A00() {
        String str;
        LayerDrawable layerDrawable;
        TextPaint textPaint;
        int i;
        String str2;
        boolean z = this.A02;
        boolean z2 = this.A01;
        if (z) {
            if (z2) {
                str2 = this.A0C;
            } else {
                str2 = this.A0B;
            }
            this.A04 = str2;
            layerDrawable = this.A08;
        } else {
            if (z2) {
                str = this.A0D;
            } else {
                str = this.A0A;
            }
            this.A04 = str;
            layerDrawable = this.A07;
        }
        this.A03 = layerDrawable;
        if (z2) {
            layerDrawable.setColorFilter(AnonymousClass37O.A00(this.A00.A04.A04));
            textPaint = this.A09;
            i = this.A00.A04.A04;
        } else {
            layerDrawable.setColorFilter((ColorFilter) null);
            textPaint = this.A09;
            i = this.A00.A00;
        }
        textPaint.setColor(i);
    }
}
