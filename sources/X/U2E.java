package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class U2E extends CharacterStyle implements AnonymousClass6MP, AnonymousClass6MR {
    public int A00;
    public int A01;
    public int A02;
    public C306576Mr A03 = C306576Mr.DISABLED;

    public final void AQG(Canvas canvas) {
    }

    public final void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
    }

    public final boolean onPreDraw() {
        return true;
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.bgColor = this.A00;
    }

    public final int BfU() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.WUi, X.X6W] */
    public final X6W By4() {
        int i = this.A01;
        int i2 = this.A02;
        ? obj = new Object();
        obj.A01 = i;
        obj.A00 = i2;
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A03;
    }

    public final void ESD(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i2;
    }
}
