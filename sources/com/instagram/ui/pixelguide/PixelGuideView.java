package com.instagram.ui.pixelguide;

import X.002;
import X.0nA;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C65763LzH;
import X.DbS;
import X.JTO;
import X.JTP;
import X.MT0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public class PixelGuideView extends View {
    public int A00;
    public int A01;
    public int A02;
    public Paint A03;
    public Paint A04;
    public Rect A05;
    public MT0 A06;
    public String A07;
    public int A08;
    public int A09;
    public int A0A;

    public final void onDraw(Canvas canvas) {
        int i = this.A09;
        if (i != 0) {
            this.A06.AQH(canvas, i, this.A08);
            canvas.drawText(this.A07, (float) this.A0A, (float) this.A02, this.A03);
        }
    }

    public PixelGuideView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        Paint A0C = JTO.A0C();
        this.A04 = A0C;
        A0C.setColor(587137024);
        Context context = getContext();
        this.A07 = 002.A0N("Device Density: ", 0nA.A0H(context).density);
        this.A00 = getLayoutDirection();
        Paint A0D = JTP.A0D();
        this.A03 = A0D;
        Resources resources = getResources();
        A0D.setTextSize(AnonymousClass7TE.A01(resources, R.dimen.account_group_management_row_text_size));
        this.A03.setColor(resources.getColor(R.color.green_5, (Resources.Theme) null));
        Rect A0W = AnonymousClass7TE.A0W();
        this.A05 = A0W;
        Paint paint = this.A03;
        String str = this.A07;
        paint.getTextBounds(str, 0, str.length(), A0W);
        this.A02 = this.A05.height();
        int i = this.A00;
        int i2 = R.dimen.add_account_icon_circle_radius;
        if (i == 0) {
            i2 = R.dimen.account_group_management_clickable_width;
        }
        this.A01 = resources.getDimensionPixelSize(i2);
        this.A06 = new C65763LzH(DbS.A02(context, 8));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A062 = AnonymousClass0fD.A06(855974320);
        super.onSizeChanged(i, i2, i3, i4);
        this.A09 = i;
        this.A08 = i2;
        if (this.A00 == 0) {
            i5 = (i - this.A05.width()) - this.A01;
        } else {
            i5 = this.A01;
        }
        this.A0A = i5;
        AnonymousClass0fD.A0D(370788972, A062);
    }

    public PixelGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public PixelGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
