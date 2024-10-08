package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MrZ  reason: case insensitive filesystem */
public final class C67646MrZ extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Context A05;
    public final Drawable A06;
    public final TextPaint A07;
    public final UserSession A08;
    public final N2d A09;
    public final N2R A0A;
    public final String A0B;
    public final String A0C = "Friends";
    public final List A0D;

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        Path A0C2 = C51965G9l.A0C();
        float f = this.A02;
        A0C2.addArc(new RectF(0.0f, 0.0f, f, f), 90.0f, 180.0f);
        float A002 = A00();
        float f2 = f / 2.0f;
        A0C2.addRect(new RectF(f2, 0.0f, f2 + A002, f), Path.Direction.CW);
        A0C2.addArc(new RectF(A002, 0.0f, A002 + f, f), 270.0f, 180.0f);
        canvas2.drawPath(A0C2, this.A0A.A00);
        TextPaint textPaint = this.A07;
        String str = this.A0C;
        int measureText = (int) textPaint.measureText(str);
        float descent = textPaint.descent() - textPaint.ascent();
        StaticLayout staticLayout = new StaticLayout(str, textPaint, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        canvas2.save();
        float f3 = this.A03;
        canvas2.translate(((f3 + A00()) - textPaint.measureText(str)) + (f2 - f3), (f - descent) / 2.0f);
        staticLayout.draw(canvas2);
        canvas2.restore();
        Drawable drawable = this.A06;
        int intrinsicHeight = (int) ((f - ((float) drawable.getIntrinsicHeight())) / 2.0f);
        int i = (int) f3;
        drawable.setBounds(i, intrinsicHeight, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + intrinsicHeight);
        drawable.draw(canvas2);
        invalidateSelf();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ C67646MrZ(UserSession userSession, String str, List list) {
        C62880wX r7 = userSession.A03;
        Context A062 = r7.A06();
        N2d n2d = new N2d(A062.getColor(R.color.primary_text_disabled_material_dark), A062.getColor(R.color.black), A062.getColor(R.color.design_dark_default_color_on_background), A062.getColor(R.color.design_dark_default_color_on_background));
        Paint A0V = AnonymousClass7TE.A0V(1);
        A0V.setColor(n2d.A00);
        Paint.Style style = Paint.Style.FILL;
        A0V.setStyle(style);
        Paint A0V2 = AnonymousClass7TE.A0V(3);
        A0V2.setColor(n2d.A01);
        A0V2.setStyle(style);
        N2R n2r = new N2R(A0V, A0V2);
        0qQ.A0B(str, 3);
        this.A08 = userSession;
        this.A0D = list;
        this.A0B = str;
        this.A09 = n2d;
        this.A0A = n2r;
        Context A063 = r7.A06();
        this.A05 = A063;
        this.A00 = 0nA.A00(A063, 20.0f);
        this.A01 = 0nA.A00(A063, 1.0f);
        this.A02 = 0nA.A00(A063, 30.0f);
        this.A03 = 0nA.A00(A063, 12.0f);
        float A002 = 0nA.A00(A063, 14.0f);
        this.A04 = 0nA.A00(A063, 5.0f);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(A002);
        textPaint.setColor(n2d.A03);
        textPaint.setTypeface(AnonymousClass0qo.A00(A063).A02(0qm.A0X));
        this.A07 = textPaint;
        ON3 on3 = new ON3(this.A05, this.A0B, this.A0D, (int) this.A00);
        on3.A0B = true;
        on3.A07 = AnonymousClass05K.A00;
        on3.A0D = true;
        on3.A08 = Integer.valueOf(this.A09.A02);
        on3.A01((int) this.A01);
        on3.A0G = true;
        this.A06 = on3.A00();
    }

    private final float A00() {
        float measureText = this.A07.measureText(this.A0C);
        if (!this.A0D.isEmpty()) {
            measureText = measureText + this.A04 + ((float) this.A06.getIntrinsicWidth());
        }
        return measureText - 6.0f;
    }

    public final int getIntrinsicHeight() {
        return (int) this.A02;
    }

    public final int getIntrinsicWidth() {
        return (int) (this.A02 + A00());
    }
}
