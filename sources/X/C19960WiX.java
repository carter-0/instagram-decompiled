package X;

import android.graphics.Rect;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.WiX  reason: case insensitive filesystem */
public final class C19960WiX implements Runnable {
    public final /* synthetic */ U3C A00;

    public C19960WiX(U3C u3c) {
        this.A00 = u3c;
    }

    public final void run() {
        U3C u3c = this.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = u3c.A00;
        if (j == 0) {
            j = uptimeMillis - 16;
            u3c.A00 = j;
        }
        float f = ((float) (uptimeMillis - j)) / 1000.0f;
        u3c.A00 = uptimeMillis;
        List list = u3c.A07;
        for (int size = list.size() - 1; -1 < size; size--) {
            C17477VXe vXe = (C17477VXe) list.get(size);
            C18619VvC vvC = vXe.A02;
            C18573VuP vuP = vXe.A03;
            Rect A0X = AnonymousClass7TE.A0X(vXe.A01);
            float f2 = 0.5f;
            if (AnonymousClass7TF.A1Q((vXe.A00 > 0.0f ? 1 : (vXe.A00 == 0.0f ? 0 : -1))) && u3c.getWidth() > 0) {
                float f3 = 1.0f;
                if (vuP.A05 + ((float) A0X.centerX()) > ((float) u3c.getWidth()) * 0.5f) {
                    f3 = -1.0f;
                }
                vXe.A00 = f3;
            }
            vvC.A01(f);
            float f4 = vXe.A00;
            float f5 = vvC.A09;
            float f6 = f4 * (-f5);
            if (f5 >= 0.0f) {
                f2 = 0.125f;
            }
            vvC.A08 = f6 * f2;
            float f7 = vXe.A00;
            float f8 = vvC.A09;
            float f9 = f7 * (-f8);
            float f10 = 0.05f;
            if (f8 < 0.0f) {
                f10 = 0.1f;
            }
            vvC.A04 = f9 * f10;
            float f11 = vvC.A09 / u3c.A03;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            vvC.A05 = f11;
            vvC.A06 = f11;
            vvC.A02(vuP, f);
            if (u3c.getHeight() != 0) {
                Rect A0X2 = AnonymousClass7TE.A0X(vXe.A01);
                int max = Math.max(A0X2.width(), A0X2.height());
                C18573VuP vuP2 = vXe.A03;
                if ((((float) A0X2.top) + vuP2.A06) - (vuP2.A03 * ((float) max)) > ((float) u3c.getHeight())) {
                    list.remove(size);
                }
            }
            U12 u12 = vXe.A01;
            float f12 = u12.A02;
            float min = Math.min(f12 + (u3c.A04 * f), u3c.A05);
            if (f12 != min) {
                u12.A02 = min;
                u12.A05 = true;
                u12.invalidateSelf();
            }
            float f13 = vvC.A09 / 260.0f;
            C14090Tph tph = u12.A03;
            if (tph != null) {
                tph.A01();
            }
            u12.A03 = null;
            if (u12.A00 != f13) {
                u12.A00 = f13;
                u12.invalidateSelf();
            }
        }
        u3c.invalidate();
        if (AnonymousClass7TE.A1b(list)) {
            u3c.postOnAnimation(u3c.A06);
            return;
        }
        u3c.A00 = 0;
        0sP r0 = u3c.A01;
        if (r0 != null) {
            r0.invoke(u3c);
        }
    }
}
