package com.instagram.ui.widget.triangleshape;

import X.0nA;
import X.17k;
import X.AnonymousClass0fD;
import X.C14149Tql;
import X.C71382cm;
import X.C71622eP;
import X.JTO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class TriangleShape extends View {
    public View A00 = this;
    public int A01;
    public Paint A02;
    public Paint A03;
    public Path A04;
    public Path A05;
    public C14149Tql A06 = C14149Tql.NORTH;
    public int[] A07;

    public void setDirection(C14149Tql tql) {
        this.A06 = tql;
    }

    public void setNotchCenterXOn(View view) {
        this.A00 = view;
    }

    public TriangleShape(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2N);
        int color = obtainStyledAttributes.getColor(1, -1);
        boolean z = false;
        this.A01 = obtainStyledAttributes.getColor(2, 0);
        int i = 0;
        if (!TextUtils.isEmpty(C71622eP.A00(context, obtainStyledAttributes, 0))) {
            int i2 = obtainStyledAttributes.getInt(0, C14149Tql.NORTH.A00);
            C14149Tql[] values = C14149Tql.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                } else if (values[i].A00 == i2) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            17k.A0C("Received unknown direction id %d", i2, z);
            C14149Tql tql = (C14149Tql) C14149Tql.A01.get(i2);
            tql.getClass();
            this.A06 = tql;
        }
        obtainStyledAttributes.recycle();
        this.A07 = new int[2];
        Paint paint = new Paint(1);
        this.A02 = paint;
        paint.setColor(color);
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = new Paint(1);
        this.A03 = paint2;
        paint2.setColor(this.A01);
        JTO.A1N(this.A03);
        this.A03.setStrokeWidth(1.0f);
        Path path = new Path();
        this.A04 = path;
        Path.FillType fillType = Path.FillType.EVEN_ODD;
        path.setFillType(fillType);
        Path path2 = new Path();
        this.A05 = path2;
        path2.setFillType(fillType);
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(-1455847097);
        int height = getHeight();
        this.A00.getLocationInWindow(this.A07);
        int width = this.A07[0] + ((int) ((((float) this.A00.getWidth()) * this.A00.getScaleX()) / 2.0f));
        getLocationInWindow(this.A07);
        int i = width - this.A07[0];
        this.A04.reset();
        this.A05.reset();
        C14149Tql tql = this.A06;
        C14149Tql tql2 = C14149Tql.SOUTH;
        Path path = this.A04;
        float f = (float) (i - height);
        if (tql == tql2) {
            path.moveTo(f, 0.0f);
            float f2 = (float) (i + height);
            this.A04.lineTo(f2, 0.0f);
            float f3 = (float) i;
            float f4 = (float) height;
            this.A04.lineTo(f3, f4);
            if (this.A01 != 0) {
                this.A05.moveTo(0.0f, 0.0f);
                this.A05.lineTo(f, 0.0f);
                this.A05.lineTo(f3, f4);
                this.A05.lineTo(f2, 0.0f);
                this.A05.lineTo((float) 0nA.A09(getContext()), 0.0f);
            }
        } else {
            float f5 = (float) height;
            path.moveTo(f, f5);
            float f6 = (float) (height + i);
            this.A04.lineTo(f6, f5);
            float f7 = (float) i;
            this.A04.lineTo(f7, 0.0f);
            if (this.A01 != 0) {
                this.A05.moveTo(0.0f, f5);
                this.A05.lineTo(f, f5);
                this.A05.lineTo(f7, 0.0f);
                this.A05.lineTo(f6, f5);
                this.A05.lineTo((float) 0nA.A09(getContext()), f5);
            }
        }
        this.A04.close();
        canvas.drawPath(this.A04, this.A02);
        canvas.drawPath(this.A05, this.A03);
        AnonymousClass0fD.A0A(-238294174, A032);
    }

    public TriangleShape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public TriangleShape(Context context) {
        super(context);
        A00((AttributeSet) null);
    }
}
