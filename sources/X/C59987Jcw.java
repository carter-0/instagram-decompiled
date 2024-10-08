package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jcw  reason: case insensitive filesystem */
public final class C59987Jcw extends Drawable {
    public int A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final LAI A0A;
    public final List A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(MKG.A00);
    public final Context A0D;
    public final Paint A0E;
    public final float[] A0F;

    public C59987Jcw(Context context, int i, int i2) {
        this.A0D = context;
        this.A08 = i;
        this.A00 = i2;
        this.A09 = JTR.A07(context);
        this.A05 = DbY.A01(context);
        this.A04 = AnonymousClass7TG.A03(context);
        this.A07 = AnonymousClass7TG.A02(context);
        this.A06 = AnonymousClass7TG.A04(context);
        float A052 = (float) JTR.A05(context);
        this.A01 = A052;
        List nCopies = Collections.nCopies(8, Float.valueOf(A052));
        0qQ.A07(nCopies);
        this.A0F = 00k.A0w(nCopies);
        this.A02 = AnonymousClass7TE.A0A(context);
        this.A03 = context.getColor(R.color.igds_error_or_destructive);
        Paint A0V = AnonymousClass7TE.A0V(3);
        AnonymousClass7TE.A1N(context, A0V, R.color.black_60_transparent);
        Paint.Style style = Paint.Style.FILL;
        A0V.setStyle(style);
        this.A0E = A0V;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i3 = 0; i3 < i; i3++) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(this.A0F, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setColor(this.A02);
            shapeDrawable.getPaint().setStyle(style);
            shapeDrawable.getPaint().setAntiAlias(true);
            shapeDrawable.getPaint().setFlags(1);
            A1C.add(shapeDrawable);
        }
        this.A0B = A1C;
        Iterator it = A1C.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            } else {
                ((ShapeDrawable) next).getPaint().setColor(this.A02);
                i4 = i5;
            }
        }
        Rect A0X = AnonymousClass7TE.A0X(this);
        int i6 = A0X.top;
        int i7 = this.A05;
        int i8 = this.A06;
        int i9 = i6 + i7 + i8;
        int i10 = this.A04;
        int i11 = i10 + i9;
        int i12 = A0X.left + i7;
        int i13 = i10 + i12;
        for (Drawable bounds : this.A0B) {
            bounds.setBounds(i12, i9, i13, i11);
            i9 = (i8 * 2) + i11;
            i11 = i10 + i9;
        }
        this.A0A = new LAI(this, this.A00);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        List<Drawable> list = this.A0B;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    break;
                }
                ((ShapeDrawable) next).getPaint().setColor(DbW.A04(JTR.A11(this.A0A.A04, i), "null cannot be cast to non-null type kotlin.Int"));
                i = i2;
            } else {
                int i3 = 0;
                for (Object next2 : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        Drawable drawable = (Drawable) next2;
                        drawable.setBounds(drawable.getBounds().left, drawable.getBounds().top, DbW.A04(JTR.A11(this.A0A.A03, i3), "null cannot be cast to non-null type kotlin.Int"), JTO.A06(drawable));
                        i3 = i4;
                    }
                }
                canvas.save();
                canvas.drawPath((Path) this.A0C.getValue(), this.A0E);
                for (Drawable draw : list) {
                    draw.draw(canvas);
                }
                canvas.restore();
                return;
            }
        }
        0sr.A1T();
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Path path = (Path) this.A0C.getValue();
        path.reset();
        float f = (float) rect.left;
        float f2 = (float) rect.top;
        RectF rectF = new RectF(f, f2, f + ((float) this.A09), ((float) getIntrinsicHeight()) + f2);
        List nCopies = Collections.nCopies(8, Float.valueOf(this.A01));
        0qQ.A07(nCopies);
        path.addRoundRect(rectF, 00k.A0w(nCopies), Path.Direction.CW);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return (this.A05 * 2) + (this.A08 * ((this.A06 * 2) + this.A04));
    }

    public final int getIntrinsicWidth() {
        return this.A09;
    }
}
