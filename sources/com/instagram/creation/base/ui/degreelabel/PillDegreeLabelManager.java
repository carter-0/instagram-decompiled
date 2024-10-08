package com.instagram.creation.base.ui.degreelabel;

import X.002;
import X.2Yu;
import X.2cp;
import X.2cs;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C60012JdL;
import X.C61340me;
import X.C64436Lbr;
import X.C71392co;
import X.JTO;
import X.JTQ;
import X.LYT;
import X.MV1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PillDegreeLabelManager extends View implements MV1 {
    public float A00 = Float.NaN;
    public boolean A01 = true;
    public boolean A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public Drawable A0C;
    public DrawableContainer A0D;
    public 2cs A0E;
    public 2cs A0F;
    public 2cs A0G;
    public 2cs A0H;
    public 2cs A0I;
    public 2cs A0J;
    public 2cs A0K;
    public 2cs A0L;
    public 2cp A0M;
    public String A0N = "";
    public boolean A0O;
    public final Paint A0P = JTO.A0C();
    public final ShapeDrawable A0Q = new ShapeDrawable();
    public final Handler A0R = new C60012JdL(this, 1);

    private 2cs A00(C71392co r5) {
        2cs A022 = this.A0M.A02();
        A022.A09(r5);
        A022.A08(-1000.0d, true);
        A022.A00 = 1.0d;
        A022.A02 = 60.0d;
        A022.A06 = true;
        return A022;
    }

    public static void A04(PillDegreeLabelManager pillDegreeLabelManager) {
        if (pillDegreeLabelManager.A02) {
            float A022 = AnonymousClass7TE.A02(pillDegreeLabelManager) / 2.0f;
            double d = 0.0d;
            if (!pillDegreeLabelManager.A01) {
                float f = pillDegreeLabelManager.A09;
                float f2 = pillDegreeLabelManager.A06;
                A02(pillDegreeLabelManager.A0L, (double) f2);
                float f3 = pillDegreeLabelManager.A07;
                float f4 = f + f3 + f2;
                if (pillDegreeLabelManager.A0O) {
                    f4 += f3 + ((float) pillDegreeLabelManager.A0C.getIntrinsicWidth());
                }
                float f5 = f4 + pillDegreeLabelManager.A04 + pillDegreeLabelManager.A05;
                A02(pillDegreeLabelManager.A0G, (double) f5);
                A02(pillDegreeLabelManager.A0E, 255.0d);
                float f6 = A022 - (f5 / 2.0f);
                A02(pillDegreeLabelManager.A0F, (double) f6);
                float f7 = f6 + pillDegreeLabelManager.A04;
                A02(pillDegreeLabelManager.A0K, (double) f7);
                float f8 = f7 + f2 + pillDegreeLabelManager.A07;
                A02(pillDegreeLabelManager.A0J, (double) ((pillDegreeLabelManager.A09 / 2.0f) + f8));
                A02(pillDegreeLabelManager.A0I, (double) (f8 + pillDegreeLabelManager.A09 + pillDegreeLabelManager.A07));
                2cs r1 = pillDegreeLabelManager.A0H;
                if (pillDegreeLabelManager.A0O) {
                    d = 255.0d;
                }
                A02(r1, d);
            } else {
                DrawableContainer drawableContainer = pillDegreeLabelManager.A0D;
                drawableContainer.getClass();
                float intrinsicWidth = (float) drawableContainer.getIntrinsicWidth();
                double d2 = (double) intrinsicWidth;
                A02(pillDegreeLabelManager.A0L, d2);
                double d3 = (double) (A022 - (intrinsicWidth / 2.0f));
                A02(pillDegreeLabelManager.A0K, d3);
                A02(pillDegreeLabelManager.A0J, (double) A022);
                pillDegreeLabelManager.A0I.A08(-1000.0d, true);
                A02(pillDegreeLabelManager.A0H, 0.0d);
                A02(pillDegreeLabelManager.A0G, d2);
                A02(pillDegreeLabelManager.A0E, 0.0d);
                A02(pillDegreeLabelManager.A0F, d3);
            }
            A03(pillDegreeLabelManager);
        }
    }

    public final void hide() {
        List A1D;
        Handler handler = this.A0R;
        if (handler.hasMessages(1)) {
            this.A01 = true;
            handler.removeMessages(1);
        }
        Collection values = this.A0M.A02.values();
        if (values instanceof List) {
            A1D = (List) values;
        } else {
            A1D = AnonymousClass7TE.A1D(values);
        }
        Iterator A0h = JTQ.A0h(A1D);
        while (A0h.hasNext()) {
            2cs r2 = (2cs) A0h.next();
            r2.A08(r2.A09.A00, true);
        }
        this.A0M.A04.clear();
    }

    public void setDegree(float f) {
        if (!this.A02) {
            this.A00 = f;
        } else if (f != 0.0f || !this.A01) {
            this.A0N = 002.A0C(String.valueOf(f), 176);
            Handler handler = this.A0R;
            handler.removeMessages(1);
            float measureText = this.A0P.measureText(this.A0N);
            if (this.A01 || AnonymousClass7TE.A00(this.A09, measureText) >= 2.0f) {
                this.A01 = false;
                this.A09 = measureText;
                A04(this);
            } else {
                invalidate();
            }
            if (f == 0.0f) {
                handler.sendEmptyMessageDelayed(1, 750);
            }
        }
    }

    public void setSelected(boolean z) {
        int i;
        this.A0O = z;
        DrawableContainer drawableContainer = this.A0D;
        drawableContainer.getClass();
        drawableContainer.selectDrawable(this.A0O ^ true ? 1 : 0);
        if (this.A0O) {
            i = this.A0A;
        } else {
            i = this.A0B;
        }
        AnonymousClass7TE.A1R(this.A0C, i);
        AnonymousClass7TE.A1R(this.A0D, i);
        this.A0Q.getPaint().setColor(i);
        this.A0P.setColor(i);
        A04(this);
    }

    public final void show() {
        2cp r0 = this.A0M;
        r0.A04.add(new C64436Lbr(this));
    }

    public PillDegreeLabelManager(Context context) {
        super(2Yu.A0I(context, R.attr.pillLabelStyle));
        A01();
    }

    private void A01() {
        this.A0M = C61340me.A00();
        C71392co A042 = C71392co.A04(20.0d, 4.0d);
        this.A0K = A00(A042);
        this.A0L = A00(A042);
        this.A0G = A00(A042);
        this.A0F = A00(A042);
        this.A0E = A00(A042);
        this.A0J = A00(A042);
        this.A0I = A00(A042);
        this.A0H = A00(A042);
        Resources resources = getResources();
        Context context = getContext();
        this.A0A = 2Yu.A0F(context, R.attr.pillSelectedColor);
        this.A0B = 2Yu.A0F(context, R.attr.pillUnselectedColor);
        float dimension = resources.getDimension(R.dimen.afi_indicator_arrow_margin_top);
        Drawable drawable = resources.getDrawable(R.drawable.adjust_reset_off);
        drawable.getClass();
        this.A0C = drawable;
        drawable.mutate();
        this.A03 = resources.getDimension(R.dimen.add_account_icon_circle_radius);
        this.A04 = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A05 = resources.getDimension(R.dimen.abc_button_inset_vertical_material);
        this.A07 = resources.getDimension(R.dimen.accent_edge_thickness);
        this.A06 = resources.getDimension(R.dimen.abc_select_dialog_padding_start_material);
        float f = this.A03 / 2.0f;
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = f;
            i++;
        } while (i < 8);
        ShapeDrawable shapeDrawable = this.A0Q;
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        JTO.A1N(shapeDrawable.getPaint());
        shapeDrawable.getPaint().setStrokeWidth(dimension);
        Paint paint = this.A0P;
        paint.setTextSize(resources.getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        paint.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.A08 = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
        addOnLayoutChangeListener(new LYT(this, 2));
    }

    public static void A03(PillDegreeLabelManager pillDegreeLabelManager) {
        float A032 = AnonymousClass7TE.A03(pillDegreeLabelManager) / 2.0f;
        float A033 = JTO.A03(pillDegreeLabelManager.A0K);
        float A034 = JTO.A03(pillDegreeLabelManager.A0L);
        float A035 = JTO.A03(pillDegreeLabelManager.A0F);
        float A036 = JTO.A03(pillDegreeLabelManager.A0G);
        int max = Math.max(Math.min((int) Math.round(pillDegreeLabelManager.A0E.A09.A00), 255), 0);
        2cs r3 = pillDegreeLabelManager.A0I;
        float A037 = JTO.A03(r3);
        int max2 = Math.max(Math.min((int) Math.round(pillDegreeLabelManager.A0H.A09.A00), 255), 0);
        if (max2 < 255 && r3.A01 != -1000.0d) {
            A037 -= ((float) pillDegreeLabelManager.A0C.getIntrinsicHeight()) * (((float) (255 - max2)) / 255.0f);
        }
        float f = A032 - (A034 / 2.0f);
        DrawableContainer drawableContainer = pillDegreeLabelManager.A0D;
        drawableContainer.getClass();
        drawableContainer.setBounds((int) A033, (int) f, Math.round(A033 + A034), Math.round(f + A034));
        float f2 = pillDegreeLabelManager.A03;
        float f3 = A032 - (f2 / 2.0f);
        ShapeDrawable shapeDrawable = pillDegreeLabelManager.A0Q;
        shapeDrawable.setBounds((int) A035, (int) f3, Math.round(A035 + A036), Math.round(f3 + f2));
        shapeDrawable.setAlpha(max);
        pillDegreeLabelManager.A0P.setAlpha(max);
        int round = Math.round(A032) - (pillDegreeLabelManager.A0C.getIntrinsicHeight() / 2);
        Drawable drawable = pillDegreeLabelManager.A0C;
        drawable.setBounds((int) A037, round, Math.round(A037 + ((float) drawable.getIntrinsicWidth())), pillDegreeLabelManager.A0C.getIntrinsicHeight() + round);
        pillDegreeLabelManager.A0C.setAlpha(max2);
        pillDegreeLabelManager.invalidate();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(738023877);
        super.onDetachedFromWindow();
        this.A0R.removeMessages(1);
        AnonymousClass0fD.A0D(-1439474659, A062);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DrawableContainer drawableContainer = this.A0D;
        drawableContainer.getClass();
        drawableContainer.draw(canvas);
        boolean z = false;
        if (this.A0E.A09.A00 >= 1.0d) {
            z = true;
            canvas.drawText(this.A0N, (float) Math.round(this.A0J.A09.A00 - ((double) (this.A09 / 2.0f))), (float) Math.round((AnonymousClass7TE.A03(this) / 2.0f) - this.A08), this.A0P);
        }
        if (this.A0I.A01 != -1000.0d && this.A0H.A09.A00 >= 1.0d) {
            this.A0C.draw(canvas);
        }
        if (z && this.A0G.A09.A00 > 0.0d) {
            this.A0Q.draw(canvas);
        }
    }

    public void setDegreeLabelResource(int i) {
        this.A0D = (DrawableContainer) getContext().getDrawable(i);
    }

    public static void A02(2cs r5, double d) {
        if (d == -1000.0d || r5.A09.A00 == -1000.0d) {
            r5.A08(d, true);
        } else {
            r5.A06(d);
        }
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet, int i) {
        super(2Yu.A0I(context, R.attr.pillLabelStyle), attributeSet, i);
        A01();
    }

    public PillDegreeLabelManager(Context context, AttributeSet attributeSet) {
        super(2Yu.A0I(context, R.attr.pillLabelStyle), attributeSet);
        A01();
    }
}
