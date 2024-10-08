package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Uo3  reason: case insensitive filesystem */
public final class C16076Uo3 extends C14955UGt {
    public int A00 = 255;
    public long A01;
    public TextPaint A02;
    public TextPaint A03;
    public ImageUrl A04;
    public U0Z A05;
    public C20958X6l A06;
    public Integer A07 = AnonymousClass05K.A01;
    public String A08;
    public String A09;
    public final float A0A;
    public final int A0B;
    public final Context A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final C19879Wh8 A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final float A0K;
    public final Rect A0L = new Rect();

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public C16076Uo3(Drawable drawable, C19879Wh8 wh8, WFU wfu, ImageUrl imageUrl, C20958X6l x6l, String str, String str2, String str3, double d, double d2, int i, boolean z, boolean z2, boolean z3) {
        super(wfu);
        this.A0G = str2;
        Context context = wfu.A0G;
        this.A0C = context;
        this.A06 = x6l;
        this.A0F = wh8;
        this.A0E = new RectF();
        this.A0D = new RectF();
        this.A0K = 0nA.A04(context, 4);
        this.A00 = W2R.A01(d2);
        this.A01 = W2R.A00(d);
        this.A0B = i;
        this.A0A = 1.0f;
        this.A0I = z;
        this.A0H = z2;
        this.A0J = z3;
        A01(drawable, imageUrl, this, str, str3);
    }

    public static Rect A00(C16076Uo3 uo3) {
        if (uo3.A05 == null) {
            Rect rect = uo3.A0L;
            rect.set(-1, -1, -1, -1);
            return rect;
        }
        W2R w2r = uo3.A08;
        double d = uo3.A00;
        double d2 = uo3.A01;
        float[] fArr = uo3.A0C;
        w2r.A06(fArr, d, d2);
        float f = fArr[0];
        float f2 = fArr[1];
        Rect bounds = uo3.A05.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        Rect rect2 = uo3.A0L;
        float A012 = C13988Tno.A01(width);
        rect2.set(Math.round(f - A012), Math.round(f2 - ((float) height)), Math.round(f + A012), Math.round(f2));
        return rect2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.Uo4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.Uo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.Uo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.Uo6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.Uo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Uo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.Uo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.Uo5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.graphics.drawable.Drawable r11, com.instagram.common.typedurl.ImageUrl r12, X.C16076Uo3 r13, java.lang.String r14, java.lang.String r15) {
        /*
            r13.A08 = r14
            r6 = r12
            r13.A04 = r12
            r13.A09 = r15
            r5 = r11
            if (r12 != 0) goto L_0x000c
            if (r11 == 0) goto L_0x0062
        L_0x000c:
            if (r14 == 0) goto L_0x0062
            X.U0Z r2 = r13.A05
            boolean r0 = r2 instanceof X.C16079Uo6
            if (r0 != 0) goto L_0x004a
            android.content.Context r4 = r13.A0C
            int r9 = r13.A0B
            float r8 = r13.A0A
            boolean r10 = r13.A0I
            boolean r11 = r13.A0H
            boolean r12 = r13.A0J
            r0 = 1
            java.lang.String r7 = "media_map"
            X.Uo6 r3 = new X.Uo6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3.A0E = r0
            r3.setCallback(r13)
            float r0 = r3.A03
            int r2 = java.lang.Math.round(r0)
            float r0 = r3.A00
            int r1 = java.lang.Math.round(r0)
        L_0x0039:
            r0 = 0
            r3.setBounds(r0, r0, r2, r1)
        L_0x003d:
            r13.A05 = r3
        L_0x003f:
            X.WFU r0 = r13.A07
            X.U4m r0 = r0.A0I
            r0.invalidate()
            A02(r13)
            return
        L_0x004a:
            X.Uo6 r2 = (X.C16079Uo6) r2
            java.lang.String r1 = "media_map"
            com.instagram.common.typedurl.ImageUrl r0 = r2.A0B
            boolean r0 = X.2PP.A00(r0, r12)
            if (r0 != 0) goto L_0x003f
            r2.A0B = r12
            if (r12 == 0) goto L_0x003f
            X.1NK r0 = X.1NK.A00()
            X.C13989Tnp.A1P(r2, r0, r12, r1)
            goto L_0x003f
        L_0x0062:
            boolean r1 = r13.A0J
            X.U0Z r0 = r13.A05
            if (r1 == 0) goto L_0x007d
            boolean r0 = r0 instanceof X.C16077Uo4
            if (r0 != 0) goto L_0x003f
            android.content.Context r0 = r13.A0C
            X.Uo4 r3 = new X.Uo4
            r3.<init>(r0)
            r3.setCallback(r13)
            int r1 = r3.A00
            r0 = 0
            r3.setBounds(r0, r0, r1, r1)
            goto L_0x003d
        L_0x007d:
            boolean r0 = r0 instanceof X.C16078Uo5
            if (r0 != 0) goto L_0x003f
            android.content.Context r0 = r13.A0C
            X.Uo5 r3 = new X.Uo5
            r3.<init>(r0)
            r3.setCallback(r13)
            int r2 = r3.A08
            int r1 = r3.A07
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16076Uo3.A01(android.graphics.drawable.Drawable, com.instagram.common.typedurl.ImageUrl, X.Uo3, java.lang.String, java.lang.String):void");
    }

    public static void A02(C16076Uo3 uo3) {
        U0Z u0z = uo3.A05;
        if (u0z != null) {
            u0z.setAlpha(uo3.A00);
        }
        TextPaint textPaint = uo3.A02;
        if (textPaint != null) {
            textPaint.setAlpha(uo3.A00);
        }
        TextPaint textPaint2 = uo3.A03;
        if (textPaint2 != null) {
            textPaint2.setAlpha(uo3.A00);
        }
        uo3.A05();
    }

    public final void A0D(Canvas canvas) {
        RectF rectF;
        int min;
        C19879Wh8 wh8;
        Rect A002 = A00(this);
        this.A08.A06(this.A0C, this.A00, this.A01);
        float width = (float) A002.width();
        float height = (float) A002.height();
        float f = (float) A002.left;
        float f2 = (float) A002.top;
        float centerX = (float) A002.centerX();
        float f3 = (float) A002.bottom;
        U0Z u0z = this.A05;
        if (u0z instanceof C16079Uo6) {
            rectF = new RectF(((C16079Uo6) u0z).A0P);
        } else {
            rectF = new RectF(u0z.getBounds());
        }
        float width2 = rectF.width();
        float height2 = rectF.height();
        this.A0E.set(f, f2, width + f, height + f2);
        RectF rectF2 = this.A0D;
        float f4 = rectF.left + f;
        float f5 = rectF.top + f2;
        rectF2.set(f4, f5, width2 + f4, f5 + height2);
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(f, f2);
        this.A05.draw(canvas2);
        canvas2.restore();
        U0Z u0z2 = this.A05;
        int A022 = u0z2.A02();
        String str = this.A09;
        if (str != null && !(u0z2 instanceof C16077Uo4)) {
            if (this.A03 == null) {
                TextPaint textPaint = new TextPaint();
                this.A02 = textPaint;
                textPaint.setFlags(1);
                TextPaint textPaint2 = this.A02;
                Context context = this.A0C;
                AnonymousClass7TE.A1N(context, textPaint2, 2Yu.A0C(context));
                TextPaint textPaint3 = this.A02;
                Paint.Align align = Paint.Align.CENTER;
                textPaint3.setTextAlign(align);
                C13988Tno.A0t(context.getResources(), this.A02, R.dimen.autocomplete_dropdown_header_text_size);
                this.A02.setFakeBoldText(true);
                JTO.A1N(this.A02);
                this.A02.setStrokeWidth((float) AnonymousClass7TG.A04(context));
                TextPaint textPaint4 = new TextPaint();
                this.A03 = textPaint4;
                textPaint4.setFlags(1);
                AnonymousClass7TE.A1N(context, this.A03, 2Yu.A07(context));
                this.A03.setTextAlign(align);
                this.A03.setFakeBoldText(true);
                this.A03.setTextSize((float) AnonymousClass7TF.A02(context, R.dimen.autocomplete_dropdown_header_text_size));
                A02(this);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.A01;
            if (currentTimeMillis < 300) {
                float f6 = 0.0f;
                float f7 = 255.0f;
                if (this.A07 == AnonymousClass05K.A0C) {
                    f6 = 255.0f;
                    f7 = 0.0f;
                }
                min = Math.min(Math.round(0mi.A02((float) currentTimeMillis, 0.0f, 300.0f, f6, f7)), A022);
            } else {
                if (this.A07 != AnonymousClass05K.A0C) {
                    min = Math.min(A022, this.A00);
                }
                canvas2.save();
                canvas2.translate(centerX, f3 + this.A0K);
                canvas2.drawText(str, 0.0f, 0.0f, this.A02);
                canvas2.drawText(str, 0.0f, 0.0f, this.A03);
                wh8 = this.A0F;
                if (wh8 != null && wh8.A03 > 1) {
                    StaticLayout staticLayout = new StaticLayout(str, this.A02, canvas2.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    String A0e = AnonymousClass7TF.A0e(this.A07.A0G.getResources(), Integer.valueOf(wh8.A03 - 1), 2131965921);
                    canvas2.drawText(A0e, 0.0f, (float) staticLayout.getHeight(), this.A02);
                    canvas2.drawText(A0e, 0.0f, (float) staticLayout.getHeight(), this.A03);
                }
                canvas2.restore();
            }
            this.A02.setAlpha(min);
            this.A03.setAlpha(min);
            canvas2.save();
            canvas2.translate(centerX, f3 + this.A0K);
            canvas2.drawText(str, 0.0f, 0.0f, this.A02);
            canvas2.drawText(str, 0.0f, 0.0f, this.A03);
            wh8 = this.A0F;
            StaticLayout staticLayout2 = new StaticLayout(str, this.A02, canvas2.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            String A0e2 = AnonymousClass7TF.A0e(this.A07.A0G.getResources(), Integer.valueOf(wh8.A03 - 1), 2131965921);
            canvas2.drawText(A0e2, 0.0f, (float) staticLayout2.getHeight(), this.A02);
            canvas2.drawText(A0e2, 0.0f, (float) staticLayout2.getHeight(), this.A03);
            canvas2.restore();
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.A07.A0I.invalidate();
    }
}
