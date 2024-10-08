package com.instagram.ui.widget.nametag;

import X.002;
import X.0mq;
import X.0nA;
import X.2PP;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass37O;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C377749Nb;
import X.C59992Jd1;
import X.JTO;
import X.M50;
import X.MRH;
import X.Pxd;
import X.U16;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.user.model.User;
import java.util.Deque;
import java.util.Iterator;
import java.util.Locale;

public class NametagCardView extends View {
    public static final int[][] A0F = {new int[]{-10752, -65175}, new int[]{-65175, -9029382}, new int[]{-16738826, -9029382}, new int[]{-14888625, -16738826}, new int[]{-14342618, -14342618}};
    public float A00;
    public String A01;
    public int A02;
    public int A03;
    public ColorFilter A04;
    public C59992Jd1 A05;
    public MRH A06;
    public final Rect A07;
    public final TextPaint A08;
    public final U16 A09;
    public final Runnable A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final Drawable.Callback A0E;

    public NametagCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setUser(User user) {
        A01(user, 0);
    }

    private void A00() {
        RectF rectF = this.A0D;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, rectF.width(), rectF.height(), this.A03, this.A02, Shader.TileMode.CLAMP);
        Paint paint = this.A0B;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        U16 u16 = this.A09;
        u16.A07.setShader(linearGradient);
        u16.invalidateSelf();
        this.A08.setShader(linearGradient);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        Rect rect = this.A07;
        canvas2.getClipBounds(rect);
        float width = (float) rect.width();
        float f = 0.032f * width;
        float f2 = 0.6f * width;
        Context context = getContext();
        float A042 = 0nA.A04(context, 12);
        float f3 = 0.1f * width;
        String str = this.A01;
        String str2 = "";
        String str3 = str2;
        if (str != null) {
            str3 = str;
        }
        TextPaint textPaint = this.A08;
        float A002 = 0mq.A00(Layout.Alignment.ALIGN_CENTER, textPaint, str3, Math.round(width - 0nA.A04(context, 48)), 1, 0, Math.round(f3));
        float abs = Math.abs(textPaint.getFontMetrics().ascent) / 2.0f;
        int round = Math.round((width / 2.0f) - (f2 / 2.0f));
        int round2 = Math.round((width - ((A042 + f2) + abs)) / 2.0f);
        int round3 = Math.round(((float) round) + f2);
        int round4 = Math.round(((float) round2) + f2);
        U16 u16 = this.A09;
        u16.setBounds(round, round2, round3, round4);
        u16.draw(canvas2);
        textPaint.setTextSize(A002);
        textPaint.setTextAlign(Paint.Align.CENTER);
        float f4 = (float) round4;
        float height = f4 + (((((float) rect.height()) - (f * 2.0f)) - f4) / 2.0f) + abs;
        String str4 = this.A01;
        if (str4 != null) {
            str2 = str4;
        }
        canvas2.drawText(str2, ((float) rect.width()) / 2.0f, height, textPaint);
    }

    public void setGradientTintColors(int i) {
        int[][] iArr = A0F;
        if (i >= 5) {
            i = 0;
        }
        int[] iArr2 = iArr[i];
        this.A03 = iArr2[0];
        this.A02 = iArr2[iArr2.length - 1];
        A00();
        this.A09.setColorFilter((ColorFilter) null);
        this.A08.setColorFilter((ColorFilter) null);
        if (this.A00 > 0.0f) {
            invalidate();
        }
    }

    public void setName(String str, String str2) {
        this.A01 = 002.A0R("@", str.toUpperCase(Locale.US));
        U16 u16 = this.A09;
        if (!2PP.A00(u16.A03, str)) {
            u16.A02 = 002.A0g(Pxd.A00(759), str, "?utm_source=qr");
            u16.A03 = str;
            U16.A00(u16);
        }
    }

    public void setUrl(String str) {
        U16 u16 = this.A09;
        u16.A02 = str;
        U16.A00(u16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r3 != null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.user.model.User r8, int r9) {
        /*
            r7 = this;
            java.lang.String r1 = r8.getUsername()
            java.lang.String r0 = r8.getFullName()
            r7.setName(r1, r0)
            X.KiN r3 = X.C62590KiN.A07
            X.4Cl r0 = r8.A03
            X.16l r6 = r0.BVO()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 0
            if (r6 == 0) goto L_0x007d
            java.lang.Integer r0 = r6.BTW()
            if (r0 == 0) goto L_0x007b
            java.lang.Integer r0 = r6.BTW()
            int r2 = r0.intValue()
        L_0x0026:
            android.util.SparseArray r1 = X.C62590KiN.A04
            android.util.SparseArray r0 = X.C62590KiN.A03
            int r0 = r0.size()
            if (r2 < r0) goto L_0x0031
            r2 = 0
        L_0x0031:
            java.lang.Object r3 = r1.get(r2)
            X.KiN r3 = (X.C62590KiN) r3
            java.lang.Integer r0 = r6.B9f()
            if (r0 == 0) goto L_0x0079
            java.lang.Integer r0 = r6.B9f()
            int r1 = r0.intValue()
        L_0x0045:
            java.lang.Integer r0 = r6.B0q()
            if (r0 == 0) goto L_0x0053
            java.lang.Integer r0 = r6.B0q()
            int r5 = r0.intValue()
        L_0x0053:
            r2 = r5
            r5 = r1
            if (r3 == 0) goto L_0x0067
        L_0x0057:
            int r1 = r3.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0075
            r0 = 1
            if (r1 == r0) goto L_0x0071
            r0 = 2
            if (r1 != r0) goto L_0x0067
            r7.setTintColor(r4)
        L_0x0067:
            if (r9 <= 0) goto L_0x0070
            X.Jd1 r0 = new X.Jd1
            r0.<init>(r9)
            r7.A05 = r0
        L_0x0070:
            return
        L_0x0071:
            r7.setTintColor(r2)
            goto L_0x0067
        L_0x0075:
            r7.setGradientTintColors(r5)
            goto L_0x0067
        L_0x0079:
            r1 = 0
            goto L_0x0045
        L_0x007b:
            r2 = 0
            goto L_0x0026
        L_0x007d:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.nametag.NametagCardView.A01(com.instagram.user.model.User, int):void");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1687045333);
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i;
        this.A00 = f;
        float f2 = (float) i2;
        this.A0D.set(f * 0.085f, 0.085f * f2, f * 0.915f, 0.915f * f2);
        C59992Jd1 jd1 = this.A05;
        if (jd1 != null) {
            float f3 = f2 * 0.015f;
            jd1.A02 = f3;
            int[] iArr = C59992Jd1.A08;
            float f4 = f3 / ((float) iArr[0]);
            jd1.A00 = f4;
            jd1.A01 = 4.0f * f4;
            jd1.A03 = f4 * 1.0f;
            jd1.A04 = 0.0f;
            Deque deque = jd1.A05;
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                jd1.A04 += ((float) iArr[AnonymousClass7TG.A0F(it) - 1]) * jd1.A00;
            }
            jd1.A04 += ((float) (deque.size() - 1)) * jd1.A01;
        }
        if (getBackground() == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(0.06f * f);
            gradientDrawable.setColor(-1);
            setBackground(new InsetDrawable(gradientDrawable, (int) (f * 0.032f)));
        }
        A00();
        if (this.A00 > 0.0f) {
            invalidate();
        }
        AnonymousClass0fD.A0D(-1271930356, A062);
    }

    public void setTintColor(int i) {
        ColorFilter A002 = AnonymousClass37O.A00(i);
        this.A04 = A002;
        this.A0C.setColorFilter(A002);
        this.A03 = i;
        this.A02 = i;
        A00();
        this.A09.setColorFilter((ColorFilter) null);
        this.A08.setColorFilter((ColorFilter) null);
        if (this.A00 > 0.0f) {
            invalidate();
        }
    }

    public void setOnSizeChangedListener(MRH mrh) {
        this.A06 = mrh;
    }

    public NametagCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = AnonymousClass7TE.A0Y();
        this.A07 = AnonymousClass7TE.A0W();
        this.A0B = JTO.A0C();
        this.A0C = JTO.A0C();
        this.A0A = new M50(this);
        Integer num = AnonymousClass05K.A01;
        U16 u16 = new U16();
        u16.invalidateSelf();
        u16.A01 = num;
        U16.A00(u16);
        u16.A07.setShader((Shader) null);
        u16.invalidateSelf();
        u16.A02 = null;
        U16.A00(u16);
        this.A09 = u16;
        C377749Nb r0 = new C377749Nb(this, 2);
        this.A0E = r0;
        u16.setCallback(r0);
        TextPaint textPaint = new TextPaint(1);
        this.A08 = textPaint;
        textPaint.setTypeface(AnonymousClass7TG.A0O(context));
        textPaint.setLetterSpacing(0.03f);
    }

    public NametagCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
