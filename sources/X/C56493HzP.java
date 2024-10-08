package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.HzP  reason: case insensitive filesystem */
public abstract class C56493HzP {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04 = C51969G9p.A0F();
    public static final long A05 = Double.doubleToRawLongBits(168.0d);
    public static final long A06;
    public static final HNO A07 = HNO.A0m;
    public static final HNO A08 = HNO.A04;
    public static final HNO A09 = HNO.A0A;

    public static final GradientDrawable A00(C70832Wc r4, Integer num, float f, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(C51972G9s.A0E(r4, 1.0d), C51967G9n.A04(num, 0));
        return gradientDrawable;
    }

    static {
        long A0D = C51970G9q.A0D();
        A03 = A0D;
        A02 = A0D;
        long A0I = C51970G9q.A0I();
        A01 = A0I;
        A00 = A0I;
        A06 = A0I;
    }
}
