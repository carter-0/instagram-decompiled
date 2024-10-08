package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

public final class IKL implements AnonymousClass2WK {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final String A04;
    public final 0sP A05;
    public final 0sP A06;

    public final 2WL Cfk(2WI r9, long j) {
        0qQ.A0B(r9, 0);
        SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) C51969G9p.A0N(r9, C53981GxP.A08);
        Drawable drawable = this.A03;
        String str = this.A04;
        float f = this.A01;
        C63264Ku9.A00(drawable, slideInAndOutIconView, str, this.A06, this.A05, f, this.A00, this.A02);
        return G9w.A0S(slideInAndOutIconView, j);
    }

    public IKL(Drawable drawable, String str, 0sP r3, 0sP r4, float f, float f2, int i) {
        AnonymousClass7TG.A1R(r3, r4);
        this.A03 = drawable;
        this.A04 = str;
        this.A01 = f;
        this.A06 = r3;
        this.A05 = r4;
        this.A02 = i;
        this.A00 = f2;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
