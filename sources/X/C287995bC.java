package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.5bC  reason: invalid class name and case insensitive filesystem */
public abstract class C287995bC {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, C288005bD.A00);

    public static final AnonymousClass2DO A00(Drawable drawable, C286575Wy r6) {
        Object r4;
        r6.ExT(1756822313);
        if (0fL.A02()) {
            0fL.A01(-1246235708, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:151)");
        }
        r6.ExT(-1791785024);
        boolean AGu = r6.AGu(drawable);
        Object ECw = r6.ECw();
        if (AGu || ECw == AnonymousClass5XT.A00) {
            if (drawable == null) {
                ECw = C52929Gf3.A00;
            } else {
                if (drawable instanceof ColorDrawable) {
                    long j = AnonymousClass5RW.A01;
                    r4 = new C52928Gf2(((long) ((ColorDrawable) drawable).getColor()) << 32);
                } else {
                    Drawable mutate = drawable.mutate();
                    0qQ.A07(mutate);
                    r4 = new C287985bB(mutate);
                }
                ECw = (AnonymousClass2DO) r4;
            }
            r6.FLL(ECw);
        }
        AnonymousClass2DO r42 = (AnonymousClass2DO) ECw;
        C286565Wx r62 = (C286565Wx) r6;
        C286565Wx.A0L(r62, false);
        if (0fL.A02()) {
            0fL.A00(1538635476);
        }
        C286565Wx.A0L(r62, false);
        return r42;
    }
}
