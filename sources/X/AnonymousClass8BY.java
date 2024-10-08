package X;

import android.graphics.RectF;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.Iterator;

/* renamed from: X.8BY  reason: invalid class name */
public final class AnonymousClass8BY implements C252203oj {
    public final /* synthetic */ ColorPalette A00;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r13) {
        0qQ.A0B(r13, 0);
        float f = (float) r13.A09.A00;
        ColorPalette colorPalette = this.A00;
        Iterator it = colorPalette.A0F.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            A9X a9x = (A9X) next;
            float f2 = a9x.A01;
            a9x.A00 = f2 + ((0.0f - f2) * f);
            RectF rectF = a9x.A06;
            RectF rectF2 = a9x.A04;
            RectF rectF3 = a9x.A05;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = rectF.right;
            float f6 = rectF.bottom;
            rectF3.set(f3 + ((rectF2.left - f3) * f), f4 + ((rectF2.top - f4) * f), f5 + ((rectF2.right - f5) * f), f6 + ((rectF2.bottom - f6) * f));
            int i = (int) (255.0f + ((0.0f - 255.0f) * f));
            a9x.A0B.A0D.setAlpha(i);
            a9x.A02.setAlpha(i);
            a9x.A03.setAlpha(255 - i);
        }
        colorPalette.invalidate();
    }

    public AnonymousClass8BY(ColorPalette colorPalette) {
        this.A00 = colorPalette;
    }
}
