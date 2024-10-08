package X;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
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

/* renamed from: X.Ukc  reason: case insensitive filesystem */
public final class C15912Ukc extends AnonymousClass5MM {
    public UOC A00;
    public int A01;
    public int A02;
    public C306576Mr A03;
    public List A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Camera A0A;
    public final Paint A0B;
    public final Typeface A0C;
    public final TextPaint A0D;
    public final C18048VkW A0E = new C18048VkW();
    public final C18439Vri A0F;
    public final ArrayList A0G = new ArrayList();
    public final ArrayList A0H = new ArrayList();

    public C15912Ukc(Context context, UOC uoc, C18439Vri vri) {
        int A012;
        int intValue;
        int A002;
        int A003;
        this.A09 = context;
        int A004 = (int) 0nA.A00(context, 300.0f);
        this.A08 = A004;
        float A005 = 0nA.A00(context, 29.0f);
        this.A06 = 0nA.A00(context, 4.0f);
        this.A05 = 0nA.A00(context, 8.0f);
        Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A10);
        this.A0C = A022;
        this.A03 = uoc.A03;
        this.A02 = uoc.A00;
        Integer num = uoc.A05;
        Integer num2 = uoc.A04;
        TextPaint textPaint = new TextPaint(1);
        if (num != null) {
            A012 = num.intValue();
        } else {
            A012 = C18789W1r.A01(this.A03, this.A02);
        }
        textPaint.setColor(A012);
        C13990Tnq.A0p(Paint.Align.CENTER, textPaint, A022, A005);
        this.A0D = textPaint;
        Paint paint = new Paint();
        if (num2 == null && (num2 = C18789W1r.A03(this.A03, this.A02)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A0B = paint;
        if (vri != null) {
            A002 = vri.A00;
            A003 = vri.A01;
        } else {
            A002 = C18789W1r.A00(A022, A005, A004, 3);
            A003 = C18789W1r.A00(A022, A005, A004, 3);
        }
        this.A0F = new C18439Vri(A003, A002);
        Camera camera = new Camera();
        camera.setLocation(0.0f, 0.0f, 50.0f);
        this.A0A = camera;
        this.A07 = C17039VFn.A00(textPaint) * 3;
        this.A01 = Color.alpha(textPaint.getColor());
        this.A04 = new ArrayList();
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
        this.A03 = r2;
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r11.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.util.ArrayList r8 = r11.A0G
            if (r8 == 0) goto L_0x0057
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0057
            X.VkW r4 = r11.A0E
            X.VVW r0 = r4.A00()
            if (r0 == 0) goto L_0x0057
            int r5 = r0.A01
            java.util.ArrayList r0 = r11.A0H
            java.lang.Object r2 = X.DbZ.A0g(r0, r5)
            X.0eP r2 = (X.0eP) r2
            java.lang.Object r0 = r2.A00
            int r1 = X.AnonymousClass7TE.A0M(r0)
            int r3 = X.C51969G9p.A0A(r2)
            int r0 = r4.A00
            float r2 = (float) r0
            float r1 = (float) r1
            float r0 = (float) r3
            r6 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r10 = X.0mi.A02(r2, r1, r0, r6, r4)
            r9 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            android.text.TextPaint r3 = r11.A0D
            if (r0 > 0) goto L_0x0058
            int r0 = r11.A01
            r3.setAlpha(r0)
            r3 = 1093664768(0x41300000, float:11.0)
            r2 = -1053818880(0xffffffffc1300000, float:-11.0)
            float r4 = r9 - r6
            float r2 = r2 - r3
            r1 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0052
            float r10 = r10 - r6
        L_0x0050:
            float r1 = r10 / r4
        L_0x0052:
            float r1 = r1 * r2
            float r1 = r1 + r3
            r11.A03(r12, r1, r5)
        L_0x0057:
            return
        L_0x0058:
            int r0 = r11.A01
            float r7 = (float) r0
            float r4 = r4 - r9
            float r2 = r6 - r7
            r1 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            float r1 = r10 - r9
            float r1 = r1 / r4
        L_0x0066:
            float r1 = r1 * r2
            float r1 = r1 + r7
            int r0 = (int) r1
            r3.setAlpha(r0)
            r7 = -1053818880(0xffffffffc1300000, float:-11.0)
            r2 = -1029832704(0xffffffffc29e0000, float:-79.0)
            float r2 = r2 - r7
            r1 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            float r1 = r10 - r9
            float r1 = r1 / r4
        L_0x0079:
            float r1 = r1 * r2
            float r1 = r1 + r7
            r11.A03(r12, r1, r5)
            java.lang.Object r1 = X.DbZ.A0g(r8, r5)
        L_0x0082:
            int r5 = r5 + 1
            int r0 = r8.size()
            if (r5 >= r0) goto L_0x0095
            java.lang.Object r0 = r8.get(r5)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0095
            goto L_0x0082
        L_0x0095:
            int r0 = r11.A01
            float r2 = (float) r0
            float r2 = r2 - r6
            r1 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            float r1 = r10 - r9
            float r1 = r1 / r4
        L_0x00a1:
            float r1 = r1 * r2
            float r1 = r1 + r6
            int r0 = (int) r1
            r3.setAlpha(r0)
            r3 = 1117650944(0x429e0000, float:79.0)
            r2 = 1093664768(0x41300000, float:11.0)
            float r2 = r2 - r3
            r1 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0052
            float r10 = r10 - r9
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15912Ukc.draw(android.graphics.Canvas):void");
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
        this.A0E.A02(this.A00.A07);
        this.A04 = new C17854Vh7(this.A0F, this.A00.A07).A00();
        A01();
    }

    private final void A01() {
        int size;
        ArrayList arrayList = this.A0G;
        arrayList.clear();
        ArrayList arrayList2 = this.A0H;
        arrayList2.clear();
        StringBuilder sb = new StringBuilder();
        int size2 = this.A04.size();
        int i = 0;
        while (i < size2) {
            sb.setLength(0);
            int A0I = C51971G9r.A0I(this.A04, i);
            i++;
            Number number = (Number) 00k.A0O(this.A04, i);
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
            TextPaint textPaint = this.A0D;
            String A10 = DbT.A10(sb);
            int intrinsicWidth = getIntrinsicWidth();
            0qQ.A0B(textPaint, 1);
            StaticLayout A002 = C18381Vqh.A00(C18381Vqh.A00, textPaint, A10, 3, intrinsicWidth);
            while (A0I < size) {
                arrayList.add(A002);
                arrayList2.add(A0x);
                A0I++;
            }
        }
    }

    private final void A02() {
        int i;
        TextPaint textPaint = this.A0D;
        textPaint.setColor(C18789W1r.A01(this.A03, this.A02));
        Paint paint = this.A0B;
        Integer A032 = C18789W1r.A03(this.A03, this.A02);
        if (A032 != null) {
            i = A032.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        this.A01 = Color.alpha(textPaint.getColor());
        invalidateSelf();
    }

    private final void A03(Canvas canvas, float f, int i) {
        if (i >= 0) {
            ArrayList arrayList = this.A0G;
            if (i < arrayList.size()) {
                float A012 = C13990Tnq.A01(canvas, this);
                Camera camera = this.A0A;
                camera.save();
                int i2 = this.A07;
                camera.translate(0.0f, 0.0f, ((float) (-i2)) / A012);
                camera.rotateX(f);
                camera.translate(0.0f, 0.0f, ((float) i2) / A012);
                camera.applyToCanvas(canvas);
                camera.restore();
                Layout layout = (Layout) DbZ.A0g(arrayList, i);
                canvas.translate(0.0f, ((float) (-layout.getHeight())) / A012);
                if (this.A03 != C306576Mr.DISABLED) {
                    Paint paint = this.A0B;
                    paint.setAlpha(this.A0D.getAlpha());
                    int A002 = AnonymousClass6M0.A00(layout);
                    int A013 = AnonymousClass6M0.A01(layout);
                    float f2 = ((float) (A013 - A002)) / A012;
                    float f3 = this.A05;
                    float f4 = this.A06;
                    RectF rectF = new RectF(((float) A002) - f3, ((float) layout.getLineTop(0)) - f4, ((float) A013) + f3, ((float) layout.getLineBottom(layout.getLineCount() - 1)) + f4);
                    canvas.translate(-f2, 0.0f);
                    canvas.drawRect(rectF, paint);
                    canvas.translate(f2, 0.0f);
                }
                layout.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int A04() {
        return this.A02;
    }

    public final UOC A05() {
        return this.A00;
    }

    public final C306576Mr A06() {
        return this.A03;
    }

    public final void A07(int i) {
        this.A02 = i;
        A02();
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        return this.A00;
    }

    public final void EXC(int i, int i2) {
        this.A0E.A01(i);
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return this.A00.A01;
    }

    public final int getIntrinsicHeight() {
        int i;
        if (this.A03 != C306576Mr.DISABLED) {
            i = (int) (this.A06 * 2.0f);
        } else {
            i = 0;
        }
        return ((int) (((float) this.A07) * 1.35f)) + (i * 2);
    }

    public final int getIntrinsicWidth() {
        int i;
        int i2 = 0;
        if (this.A03 != C306576Mr.DISABLED) {
            i = (int) (this.A05 * 2.0f);
        } else {
            i = 0;
        }
        ArrayList arrayList = this.A0G;
        if (arrayList.isEmpty()) {
            i2 = this.A08;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i2 = Math.max(i2, AnonymousClass6M0.A02((Layout) it.next()));
            }
        }
        return i2 + i;
    }

    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
