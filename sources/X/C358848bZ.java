package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.8bZ  reason: invalid class name and case insensitive filesystem */
public final class C358848bZ extends CharacterStyle implements AnonymousClass6MR, C358858ba {
    public float A00;
    public float A01;
    public TextColors A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final Context A06;

    public C358848bZ(Context context, TextColors textColors) {
        this.A06 = context;
        this.A02 = textColors;
        this.A05 = textColors.A00;
        this.A04 = true;
        A00(textColors);
    }

    public final void A00(TextColors textColors) {
        0qQ.A0B(textColors, 0);
        this.A02 = textColors;
        TextShadow textShadow = textColors.A01;
        if (textShadow != null) {
            Context context = this.A06;
            this.A00 = textShadow.A00(context);
            this.A01 = textShadow.A01(context);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        if (this.A04) {
            textPaint.setColor(this.A02.A00);
            TextShadow textShadow = this.A02.A01;
            if (textShadow != null) {
                textPaint.setShadowLayer(this.A01, 0.0f, this.A00, textShadow.A00);
            }
            Integer num = this.A03;
            if (num != null) {
                textPaint.setAlpha(num.intValue());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Abt, java.lang.Object, X.X6W] */
    public final X6W By4() {
        TextColors textColors = this.A02;
        int i = this.A05;
        0qQ.A0B(textColors, 1);
        ? obj = new Object();
        obj.A01 = textColors;
        obj.A00 = i;
        return obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C358848bZ(Context context, C358888bd r3, int i) {
        this(context, r3.ALC(i));
        0qQ.A0B(r3, 2);
    }
}
