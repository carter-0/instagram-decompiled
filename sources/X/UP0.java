package X;

import android.graphics.Rect;
import com.instagram.ui.widget.textureview.CircularTextureView;

public final class UP0 extends AnonymousClass8GD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public UP0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final void A01(Exception exc) {
        if (this.A00 == 0) {
            C340577lU.A00(22, 0, exc);
            AnonymousClass9RJ r4 = (AnonymousClass9RJ) this.A01;
            C340757lm r3 = r4.A0R;
            r3.A05(new C20140Wm0((C364018kj) this.A03, exc), r4.A0Q.A03);
            if (!C348137xw.A02(C348147xx.A01) || !r4.A0S.get()) {
                r3.A07("take_photo_exception_restart_preview", new C41347AsU(8, this.A02, this));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C343047pa r0;
        int i;
        int i2;
        int i3;
        if (this.A00 != 0) {
            X7C x7c = (X7C) this.A02;
            CircularTextureView Ajl = x7c.Ajl();
            if (Ajl.A01() && (r0 = (C343047pa) this.A03) != null) {
                int i4 = r0.A01;
                int i5 = r0.A02;
                17k.A0F(Ajl.A01());
                int width = Ajl.getWidth();
                int height = Ajl.getHeight();
                float f = ((float) i4) / ((float) i5);
                float f2 = (float) width;
                float f3 = (float) height;
                if (f < f2 / f3) {
                    i2 = (int) (f3 / f);
                    i = width;
                } else {
                    i = (int) (f * f2);
                    i2 = height;
                }
                if (i2 == 0 || i == 0) {
                    throw new IllegalArgumentException("Invalid media or view size. Can't fit media to view");
                }
                int i6 = 0;
                if (i < i2) {
                    i3 = (i2 - height) / 2;
                    Ajl.A00 = ((float) i2) / f3;
                } else {
                    i6 = (i - width) / 2;
                    Ajl.A01 = ((float) i) / f2;
                    i3 = 0;
                }
                Ajl.A02 = new Rect(-i6, -i3, i - i6, i2 - i3);
                C18518VtI vtI = Ajl.A04;
                vtI.getClass();
                Rect rect = Ajl.A02;
                rect.getClass();
                vtI.A0A = rect;
                C18518VtI vtI2 = Ajl.A04;
                float f4 = Ajl.A00;
                float f5 = Ajl.A01;
                if (vtI2.A05 == AnonymousClass05K.A0Y) {
                    C17313VQs vQs = vtI2.A03;
                    vQs.getClass();
                    C13989Tnp.A1V(vQs.A00.A0B, f4, f5);
                    x7c.EQU((C340307l3) this.A01);
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }
}
