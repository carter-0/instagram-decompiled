package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jdv  reason: case insensitive filesystem */
public final class C60042Jdv extends View {
    public 0sP A00;
    public LDz A01;
    public boolean A02;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        LDz lDz = this.A01;
        if (lDz != null) {
            C63954LFa lFa = lDz.A01;
            if (lFa != null) {
                canvas.drawPath(lFa.A00(), lFa.A02);
            }
            for (C63954LFa lFa2 : lDz.A02) {
                canvas.drawPath(lFa2.A00(), lFa2.A02);
            }
        }
    }

    public final void setBarViewModel(LDz lDz) {
        0qQ.A0B(lDz, 0);
        this.A01 = lDz;
        A00(this, getMeasuredWidth());
    }

    public final void setOnLayoutListener(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public static final void A00(C60042Jdv jdv, int i) {
        C60042Jdv jdv2 = jdv;
        LDz lDz = jdv2.A01;
        if (lDz != null) {
            lDz.A00 = i;
            Context A0S = AnonymousClass7TE.A0S(jdv2);
            float f = (float) lDz.A05;
            int applyDimension = (int) TypedValue.applyDimension(1, f, AnonymousClass7TF.A0E(A0S));
            float f2 = lDz.A03;
            int applyDimension2 = (int) TypedValue.applyDimension(1, f2, AnonymousClass7TF.A0E(A0S));
            Paint A0C = JTO.A0C();
            Paint.Style style = Paint.Style.FILL;
            A0C.setStyle(style);
            A0C.setColor(lDz.A04);
            int i2 = 0;
            lDz.A01 = new C63954LFa(A0C, (float) applyDimension2, 0, lDz.A00, applyDimension, true, true);
            int A04 = AnonymousClass7TG.A04(A0S);
            int applyDimension3 = (int) TypedValue.applyDimension(1, f, AnonymousClass7TF.A0E(A0S));
            int applyDimension4 = (int) TypedValue.applyDimension(1, f2, AnonymousClass7TF.A0E(A0S));
            ArrayList A1C = AnonymousClass7TE.A1C();
            List list = lDz.A06;
            int i3 = 0;
            int i4 = 0;
            for (Object next : list) {
                i2++;
                if (i3 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C63916LCc lCc = (C63916LCc) next;
                int i5 = (int) (lCc.A00 * ((float) lDz.A00));
                Paint A0C2 = JTO.A0C();
                A0C2.setStyle(style);
                A0C2.setColor(lCc.A01);
                Paint paint = A0C2;
                A1C.add(new C63954LFa(paint, (float) applyDimension4, i4, i4 + i5, applyDimension3, AnonymousClass7TF.A1Q(i3), AnonymousClass7TF.A1S(i3, DbT.A02(list, 1))));
                i4 += i5 + A04;
                i3 = i2;
            }
            lDz.A02 = A1C;
            jdv2.invalidate();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        0sP r1;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A02 && (r1 = this.A00) != null) {
            C51967G9n.A0w(getWidth(), r1);
            this.A02 = true;
        }
    }
}
