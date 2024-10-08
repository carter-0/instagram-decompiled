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

/* renamed from: X.Uka  reason: case insensitive filesystem */
public final class C15910Uka extends AnonymousClass5MM {
    public UOC A00;
    public C306576Mr A01;
    public int A02;
    public List A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Paint A07;
    public final TextPaint A08;
    public final TextPaint A09;
    public final ArrayList A0A = new ArrayList();
    public final ArrayList A0B = new ArrayList();
    public final ArrayList A0C = new ArrayList();
    public final ArrayList A0D = new ArrayList();
    public final int A0E;
    public final int A0F;
    public final Typeface A0G;
    public final TextPaint A0H;
    public final TextPaint A0I;
    public final C18048VkW A0J = new C18048VkW();
    public final C18439Vri A0K;
    public final ArrayList A0L = new ArrayList();

    public C15910Uka(Context context, UOC uoc, C18439Vri vri) {
        int i;
        int i2;
        int intValue;
        int A002;
        int A003;
        this.A06 = context;
        int A004 = (int) 0nA.A00(context, 420.0f);
        this.A0F = A004;
        this.A0E = (int) 0nA.A00(context, 55.0f);
        Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A0u);
        this.A0G = A022;
        float A005 = 0nA.A00(context, 25.0f);
        this.A05 = 0nA.A00(context, 12.0f);
        this.A04 = 0nA.A00(context, 8.0f);
        this.A01 = uoc.A03;
        this.A02 = uoc.A00;
        Integer num = uoc.A05;
        Integer num2 = uoc.A04;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(C18789W1r.A02(this.A01, num, this.A02));
        Paint.Align align = Paint.Align.LEFT;
        C13990Tnq.A0p(align, textPaint, A022, A005);
        this.A09 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(C18789W1r.A02(this.A01, num, this.A02));
        C13990Tnq.A0p(align, textPaint2, A022, A005);
        this.A0I = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.A02;
        }
        textPaint3.setColor(i);
        C13990Tnq.A0p(align, textPaint3, A022, A005);
        textPaint3.setStyle(Paint.Style.FILL_AND_STROKE);
        float f = A005 * 0.11363637f;
        textPaint3.setStrokeWidth(f);
        Paint.Join join = Paint.Join.ROUND;
        textPaint3.setStrokeJoin(join);
        this.A08 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = this.A02;
        }
        textPaint4.setColor(i2);
        C13990Tnq.A0p(align, textPaint4, A022, A005);
        JTO.A1N(textPaint4);
        textPaint4.setStrokeWidth(f);
        textPaint4.setStrokeJoin(join);
        this.A0H = textPaint4;
        Paint paint = new Paint();
        if (num2 == null && (num2 = C18789W1r.A04(this.A01, this.A02)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A07 = paint;
        this.A03 = new ArrayList();
        if (vri != null) {
            A002 = vri.A00;
            A003 = vri.A01;
        } else {
            A002 = C18789W1r.A00(A022, A005, A004, 1);
            A003 = C18789W1r.A00(A022, A005, A004, 1);
        }
        this.A0K = new C18439Vri(A003, A002);
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
        ArrayList arrayList = this.A0D;
        if (arrayList != null && !arrayList.isEmpty() && (A002 = this.A0J.A00()) != null && (i = A002.A01) >= 0 && i < arrayList.size()) {
            int i2 = 128;
            this.A09.setAlpha(128);
            TextPaint textPaint = this.A08;
            C306576Mr r0 = this.A01;
            C306576Mr r8 = C306576Mr.INVERTED;
            if (r0 != r8) {
                i2 = 255;
            }
            textPaint.setAlpha(i2);
            float A012 = C13990Tnq.A01(canvas, this);
            Layout layout = (Layout) DbZ.A0g(arrayList, i);
            Layout layout2 = (Layout) DbZ.A0g(this.A0A, i);
            Layout layout3 = (Layout) DbZ.A0g(this.A0B, i);
            canvas.translate(0.0f, ((float) (-layout.getHeight())) / A012);
            int A003 = AnonymousClass6M0.A00(layout);
            int A013 = AnonymousClass6M0.A01(layout);
            float lineBottom = (float) layout.getLineBottom(layout.getLineCount() - 1);
            float f = ((float) (A013 - A003)) / A012;
            canvas.translate(-f, 0.0f);
            if (this.A01 != r8) {
                float f2 = this.A04;
                float f3 = this.A05;
                RectF rectF = new RectF(((float) A003) - f2, ((float) layout.getLineTop(0)) - f3, ((float) A013) + f2, lineBottom + f3);
                float A004 = 0nA.A00(this.A06, 4.0f);
                canvas.drawRoundRect(rectF, A004, A004, this.A07);
            } else {
                ((Layout) DbZ.A0g(this.A0C, i)).draw(canvas);
            }
            if (this.A01 == r8) {
                layout3.draw(canvas);
            }
            layout2.draw(canvas);
            layout.draw(canvas);
            canvas.translate(f, 0.0f);
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

    public final void setAlpha(int i) {
    }

    private final void A00() {
        this.A0J.A02(this.A00.A07);
        this.A03 = new C17854Vh7(this.A0K, this.A00.A07).A00();
        A01();
    }

    private final void A01() {
        int size;
        ArrayList arrayList = this.A0D;
        arrayList.clear();
        ArrayList arrayList2 = this.A0C;
        arrayList2.clear();
        ArrayList arrayList3 = this.A0A;
        arrayList3.clear();
        ArrayList arrayList4 = this.A0B;
        arrayList4.clear();
        ArrayList arrayList5 = this.A0L;
        arrayList5.clear();
        StringBuilder sb = new StringBuilder();
        int size2 = this.A03.size();
        int i = 0;
        while (i < size2) {
            sb.setLength(0);
            int A0I2 = C51971G9r.A0I(this.A03, i);
            i++;
            Number number = (Number) 00k.A0O(this.A03, i);
            if (number != null) {
                size = number.intValue();
            } else {
                size = this.A00.A07.size();
            }
            Iterator it = this.A00.A07.subList(A0I2, size).iterator();
            while (it.hasNext()) {
                C15092UOk.A00(sb, it);
                TextPaint textPaint = this.A0I;
                String A10 = DbT.A10(sb);
                int intrinsicWidth = getIntrinsicWidth();
                0qQ.A0B(textPaint, 1);
                Layout.Alignment alignment = C18381Vqh.A00;
                arrayList3.add(C18381Vqh.A00(alignment, textPaint, A10, 1, intrinsicWidth));
                TextPaint textPaint2 = this.A0H;
                String A102 = DbT.A10(sb);
                int intrinsicWidth2 = getIntrinsicWidth();
                0qQ.A0B(textPaint2, 1);
                arrayList4.add(C18381Vqh.A00(alignment, textPaint2, A102, 1, intrinsicWidth2));
            }
            0eP A0x = AnonymousClass7TF.A0x(Integer.valueOf(((C15092UOk) this.A00.A07.get(A0I2)).A01()), UOC.A00(this.A00, size));
            TextPaint textPaint3 = this.A09;
            String A103 = DbT.A10(sb);
            int intrinsicWidth3 = getIntrinsicWidth();
            0qQ.A0B(textPaint3, 1);
            Layout.Alignment alignment2 = C18381Vqh.A00;
            StaticLayout A002 = C18381Vqh.A00(alignment2, textPaint3, A103, 1, intrinsicWidth3);
            TextPaint textPaint4 = this.A08;
            String A104 = DbT.A10(sb);
            int intrinsicWidth4 = getIntrinsicWidth();
            0qQ.A0B(textPaint4, 1);
            StaticLayout A003 = C18381Vqh.A00(alignment2, textPaint4, A104, 1, intrinsicWidth4);
            while (A0I2 < size) {
                arrayList.add(A002);
                arrayList2.add(A003);
                arrayList5.add(A0x);
                A0I2++;
            }
        }
    }

    private final void A02() {
        int i;
        int A022 = C18789W1r.A02(this.A01, (Integer) null, this.A02);
        this.A09.setColor(A022);
        this.A0I.setColor(A022);
        this.A0H.setColor(this.A02);
        Paint paint = this.A07;
        Integer A042 = C18789W1r.A04(this.A01, this.A02);
        if (A042 != null) {
            i = A042.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
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
        this.A0J.A01(i);
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return this.A00.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A0E;
    }

    public final int getIntrinsicWidth() {
        float f;
        if (this.A01 != C306576Mr.INVERTED) {
            f = 2.0f * this.A04;
        } else {
            f = 0.0f;
        }
        return this.A0F + ((int) f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
