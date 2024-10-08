package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.9Xe  reason: invalid class name and case insensitive filesystem */
public final class C380239Xe extends CharacterStyle implements AnonymousClass6MP, AnonymousClass6MR {
    public int A00;
    public int A01;
    public C306576Mr A02 = C306576Mr.DISABLED;
    public TextShadow A03 = TextShadow.A03;
    public Float A04;
    public Integer A05;
    public final Context A06;

    public final /* synthetic */ void AQG(Canvas canvas) {
    }

    public final /* synthetic */ void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(canvas, 2);
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    public final /* synthetic */ void FLc(Layout layout, Integer num, float f, int i, int i2) {
    }

    public final int BfU() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.WUh, X.X6W] */
    public final X6W By4() {
        int i = this.A00;
        C306576Mr r1 = this.A02;
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = r1;
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A02;
    }

    public final void ESD(int i, int i2) {
        this.A01 = i;
        this.A00 = i;
    }

    public final /* synthetic */ boolean onPreDraw() {
        return true;
    }

    public final void updateDrawState(TextPaint textPaint) {
        int i;
        float A012;
        TextColors ALC = C358888bd.A02.ALC(this.A00);
        TextShadow textShadow = ALC.A01;
        if (textShadow != null) {
            this.A03 = textShadow;
        }
        if (textPaint != null) {
            Integer num = this.A05;
            if (num != null) {
                i = num.intValue();
            } else {
                i = ALC.A00;
            }
            textPaint.setColor(i);
            Float f = this.A04;
            if (f != null) {
                A012 = f.floatValue();
            } else {
                A012 = this.A03.A01(this.A06);
            }
            textPaint.setShadowLayer(A012, 0.0f, this.A03.A00(this.A06), this.A03.A00);
        }
    }

    public C380239Xe(Context context) {
        this.A06 = context;
    }
}
