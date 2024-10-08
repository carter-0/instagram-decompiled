package com.instagram.creation.capture.quickcapture.sundial.sfx.widget;

import X.01V;
import X.0qQ;
import X.2HY;
import X.2Yu;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C229632nm;
import X.C295305nv;
import X.C52395GQu;
import X.C64094LMn;
import X.DbY;
import X.JTO;
import X.JTT;
import X.MAY;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SfxSeekBarView extends View {
    public float A00;
    public int A01;
    public int A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final RectF A0A;
    public final RectF A0B;
    public final List A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SfxSeekBarView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A01(Bitmap bitmap, String str, int i, int i2) {
        0qQ.A0B(str, 0);
        Bitmap bitmap2 = bitmap;
        C64094LMn lMn = new C64094LMn(bitmap2, this, str, i, i2);
        List list = this.A0C;
        list.add(lMn);
        if (list.size() > 1) {
            01V.A1D(list, new MAY(11));
        }
        postInvalidate();
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        super.onDraw(canvas2);
        RectF rectF = this.A0A;
        canvas2.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A09);
        List<C64094LMn> list = this.A0C;
        for (C64094LMn lMn : list) {
            int i = lMn.A01;
            SfxSeekBarView sfxSeekBarView = lMn.A04;
            float f = sfxSeekBarView.A00;
            float f2 = (float) sfxSeekBarView.A01;
            float f3 = sfxSeekBarView.A0A.bottom;
            canvas2.drawLine((((float) i) * f) / f2, f3, (((float) (i + lMn.A00)) * f) / f2, f3, sfxSeekBarView.A07);
        }
        for (C64094LMn lMn2 : list) {
            float A002 = C64094LMn.A00(lMn2);
            SfxSeekBarView sfxSeekBarView2 = lMn2.A04;
            RectF rectF2 = sfxSeekBarView2.A0A;
            float centerY = rectF2.centerY();
            float f4 = sfxSeekBarView2.A03;
            Paint paint = sfxSeekBarView2.A07;
            canvas2.drawCircle(A002, centerY, 3.0f + f4, paint);
            canvas2.drawCircle(C64094LMn.A00(lMn2), rectF2.centerY(), f4, sfxSeekBarView2.A06);
            Bitmap bitmap = lMn2.A02;
            float A003 = C64094LMn.A00(lMn2);
            float f5 = ((float) sfxSeekBarView2.A04) * 0.5f;
            canvas2.drawBitmap(bitmap, A003 - f5, sfxSeekBarView2.A0B.top - f5, paint);
        }
        canvas2.drawCircle(getThumbCenterX(), this.A0B.top, (float) this.A05, this.A08);
    }

    private final void A00() {
        RectF rectF = this.A0B;
        rectF.left = (float) getPaddingStart();
        rectF.top = ((float) (getPaddingTop() + this.A05)) + C295305nv.A00(getContext(), 2);
        rectF.right = ((((float) this.A02) * this.A00) / ((float) this.A01)) + ((float) getPaddingStart());
        float f = rectF.top;
        rectF.bottom = f;
        RectF rectF2 = this.A0A;
        rectF2.left = rectF.left;
        rectF2.top = f;
        rectF2.right = (float) (getMeasuredWidth() - getPaddingEnd());
        rectF2.bottom = rectF.bottom;
    }

    private final float getThumbCenterX() {
        Float valueOf = Float.valueOf(this.A0B.right);
        float f = (float) this.A05;
        return AnonymousClass7TE.A04(C229632nm.A09(valueOf, new C52395GQu(f, this.A0A.right - f)));
    }

    public final int getMax() {
        return this.A01;
    }

    public final int getProgress() {
        return this.A02;
    }

    public final void setMax(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            A00();
            postInvalidate();
        }
    }

    public final void setProgress(int i) {
        int A052 = C229632nm.A05(new 2HY(0, this.A01), i);
        this.A02 = A052;
        this.A0B.right = ((((float) A052) * this.A00) / ((float) this.A01)) + ((float) getPaddingStart());
        postInvalidate();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00 = (float) ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd());
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SfxSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0C = AnonymousClass7TE.A1C();
        this.A01 = 1;
        int A0H = 2Yu.A0H(context, R.attr.igds_color_creation_button);
        int A032 = AnonymousClass7TG.A03(context);
        Paint A0C2 = JTO.A0C();
        AnonymousClass7TE.A1N(context, A0C2, A0H);
        float f = (float) A032;
        A0C2.setStrokeWidth(f);
        A0C2.setAntiAlias(true);
        Paint.Cap cap = Paint.Cap.ROUND;
        A0C2.setStrokeCap(cap);
        this.A09 = A0C2;
        this.A0B = AnonymousClass7TE.A0Y();
        this.A0A = AnonymousClass7TE.A0Y();
        this.A03 = ((float) DbY.A01(context)) * 1.0f;
        this.A04 = AnonymousClass7TG.A05(context);
        Paint A0C3 = JTO.A0C();
        A0C3.setStrokeWidth(f);
        A0C3.setStrokeCap(cap);
        A0C3.setAntiAlias(true);
        AnonymousClass7TE.A1N(context, A0C3, 2Yu.A0H(context, R.attr.igds_color_icon_badge));
        this.A07 = A0C3;
        Paint A0C4 = JTO.A0C();
        A0C4.setAntiAlias(true);
        AnonymousClass7TE.A1Q(A0C4);
        AnonymousClass7TE.A1N(context, A0C4, 2Yu.A0H(context, R.attr.igds_color_tag_or_toast_background));
        this.A06 = A0C4;
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        Paint A0C5 = JTO.A0C();
        AnonymousClass7TE.A1N(context, A0C5, R.color.canvas_bottom_sheet_description_text_color);
        A0C5.setStyle(Paint.Style.FILL_AND_STROKE);
        A0C5.setAntiAlias(true);
        this.A08 = A0C5;
    }

    public /* synthetic */ SfxSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SfxSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
