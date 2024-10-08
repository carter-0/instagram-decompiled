package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UkZ  reason: case insensitive filesystem */
public final class C15909UkZ extends AnonymousClass5MM {
    public UOC A00;
    public C306576Mr A01;
    public int A02;
    public List A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Paint A07;
    public final ArrayList A08 = new ArrayList();
    public final ArrayList A09 = new ArrayList();
    public final int A0A;
    public final int A0B;
    public final Typeface A0C;
    public final TextPaint A0D;
    public final TextPaint A0E;
    public final C18048VkW A0F = new C18048VkW();
    public final C18439Vri A0G;
    public final ArrayList A0H = new ArrayList();

    public C15909UkZ(Context context, UOC uoc, C18439Vri vri) {
        int i;
        int intValue;
        int A002;
        int A003;
        this.A06 = context;
        int A004 = (int) 0nA.A00(context, 350.0f);
        this.A0B = A004;
        this.A0A = (int) 0nA.A00(context, 55.0f);
        Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A0U);
        this.A0C = A022;
        float A005 = 0nA.A00(context, 26.0f);
        this.A05 = 0nA.A00(context, 8.0f);
        this.A04 = 0nA.A00(context, 8.0f);
        this.A01 = uoc.A03;
        this.A02 = uoc.A00;
        Integer num = uoc.A05;
        Integer num2 = uoc.A04;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(C18789W1r.A02(this.A01, num, this.A02));
        Paint.Align align = Paint.Align.CENTER;
        C13990Tnq.A0p(align, textPaint, A022, A005);
        this.A0E = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.A02;
        }
        textPaint2.setColor(i);
        C13990Tnq.A0p(align, textPaint2, A022, A005);
        JTO.A1N(textPaint2);
        textPaint2.setStrokeWidth(textPaint.getTextSize() * 0.11363637f);
        textPaint2.setStrokeJoin(Paint.Join.ROUND);
        this.A0D = textPaint2;
        Paint paint = new Paint();
        if (num2 == null && (num2 = C18789W1r.A04(this.A01, this.A02)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        paint.setAlpha(196);
        this.A07 = paint;
        if (vri != null) {
            A002 = vri.A00;
            A003 = vri.A01;
        } else {
            A002 = C18789W1r.A00(A022, A005, A004, 1);
            A003 = C18789W1r.A00(A022, A005, A004, 1);
        }
        this.A0G = new C18439Vri(A003, A002);
        this.A03 = new ArrayList();
        this.A00 = uoc;
        A00();
    }

    public final void A08(UOC uoc) {
        0qQ.A0B(uoc, 0);
        if (!0qQ.A0K(this.A00, uoc)) {
            this.A00 = uoc;
            A00();
        }
    }

    public final void A09(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
        A02();
    }

    public final void draw(Canvas canvas) {
        VVW A002;
        int i;
        0qQ.A0B(canvas, 0);
        ArrayList arrayList = this.A09;
        if (arrayList != null && !arrayList.isEmpty() && (A002 = this.A0F.A00()) != null && (i = A002.A01) >= 0 && i < arrayList.size()) {
            float A012 = C13990Tnq.A01(canvas, this);
            Layout layout = (Layout) DbZ.A0g(arrayList, i);
            canvas.translate(0.0f, ((float) (-layout.getHeight())) / A012);
            if (this.A01 != C306576Mr.INVERTED) {
                int A003 = AnonymousClass6M0.A00(layout);
                int A013 = AnonymousClass6M0.A01(layout);
                int lineBottom = layout.getLineBottom(layout.getLineCount() - 1);
                int lineTop = layout.getLineTop(0);
                float f = ((float) (A013 - A003)) / A012;
                float f2 = this.A04;
                float f3 = this.A05;
                RectF rectF = new RectF(((float) A003) - f2, ((float) lineTop) - f3, ((float) A013) + f2, ((float) lineBottom) + f3);
                canvas.translate(-f, -0.0f);
                float A004 = 0nA.A00(this.A06, 4.0f);
                canvas.drawRoundRect(rectF, A004, A004, this.A07);
                canvas.translate(f, 0.0f);
            } else {
                ((Layout) DbZ.A0g(this.A08, i)).draw(canvas);
            }
            layout.draw(canvas);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A01();
    }

    private final void A00() {
        this.A0F.A02(this.A00.A07);
        this.A03 = new C17854Vh7(this.A0G, this.A00.A07).A00();
        A01();
    }

    private final void A01() {
        int size;
        ArrayList arrayList = this.A09;
        arrayList.clear();
        ArrayList arrayList2 = this.A08;
        arrayList2.clear();
        ArrayList arrayList3 = this.A0H;
        arrayList3.clear();
        StringBuilder sb = new StringBuilder();
        int size2 = this.A03.size();
        int i = 0;
        while (i < size2) {
            sb.setLength(0);
            int A0I = C51971G9r.A0I(this.A03, i);
            i++;
            Number number = (Number) 00k.A0O(this.A03, i);
            if (number != null) {
                size = number.intValue();
            } else {
                size = this.A00.A07.size();
            }
            Iterator it = this.A00.A07.subList(A0I, size).iterator();
            while (it.hasNext()) {
                C15092UOk.A00(sb, it);
            }
            0eP A0x = AnonymousClass7TF.A0x(Integer.valueOf(((C15092UOk) this.A00.A07.get(A0I)).A01()), UOC.A00(this.A00, size));
            TextPaint textPaint = this.A0E;
            String A10 = DbT.A10(sb);
            int intrinsicWidth = getIntrinsicWidth();
            0qQ.A0B(textPaint, 1);
            Layout.Alignment alignment = C18381Vqh.A00;
            StaticLayout A002 = C18381Vqh.A00(alignment, textPaint, A10, -1, intrinsicWidth);
            TextPaint textPaint2 = this.A0D;
            String A102 = DbT.A10(sb);
            int intrinsicWidth2 = getIntrinsicWidth();
            0qQ.A0B(textPaint2, 1);
            StaticLayout A003 = C18381Vqh.A00(alignment, textPaint2, A102, -1, intrinsicWidth2);
            while (A0I < size) {
                arrayList.add(A002);
                arrayList2.add(A003);
                arrayList3.add(A0x);
                A0I++;
            }
        }
    }

    private final void A02() {
        int i;
        this.A0E.setColor(C18789W1r.A02(this.A01, (Integer) null, this.A02));
        this.A0D.setColor(this.A02);
        Paint paint = this.A07;
        Integer A042 = C18789W1r.A04(this.A01, this.A02);
        if (A042 != null) {
            i = A042.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        paint.setAlpha(196);
        invalidateSelf();
    }

    public final int A04() {
        return this.A02;
    }

    public final UOC A05() {
        return this.A00;
    }

    public final C306576Mr A06() {
        return this.A01;
    }

    public final void A07(int i) {
        this.A02 = i;
        A02();
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        return this.A00;
    }

    public final void EXC(int i, int i2) {
        this.A0F.A01(i);
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return this.A00.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A0A;
    }

    public final int getIntrinsicWidth() {
        float f;
        if (this.A01 != C306576Mr.INVERTED) {
            f = 2.0f * this.A04;
        } else {
            f = 0.0f;
        }
        return this.A0B + ((int) f);
    }

    public final void setAlpha(int i) {
        this.A0E.setAlpha(i);
        this.A0D.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0E.setColorFilter(colorFilter);
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
