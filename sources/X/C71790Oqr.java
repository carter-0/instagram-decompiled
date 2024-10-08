package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import java.util.List;

/* renamed from: X.Oqr  reason: case insensitive filesystem */
public final class C71790Oqr implements C74300PsZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;

    public C71790Oqr(Context context, int i, int i2, int i3) {
        0qQ.A0B(context, 1);
        this.A03 = context;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final List AN4(C70644OEq oEq) {
        int i;
        0qQ.A0B(oEq, 0);
        String obj = oEq.A02.toString().subSequence(oEq.A01, oEq.A00).toString();
        int i2 = 0;
        for (int i3 = 0; i3 < obj.length(); i3++) {
            if (obj.charAt(i3) == 10) {
                i2++;
            }
        }
        Context context = this.A03;
        C68384NEl nEl = new C68384NEl(context, i2);
        int i4 = this.A02;
        nEl.A01 = i4;
        Paint paint = nEl.A02;
        if (paint != null) {
            paint.setColor(i4);
        }
        nEl.A00 = TypedValue.applyDimension(1, 12.0f, AnonymousClass7TF.A0E(context));
        if (oEq.A03) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        return 0sr.A1P(new Object[]{new TextAppearanceSpan(context, i), nEl});
    }
}
