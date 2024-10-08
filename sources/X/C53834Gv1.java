package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

/* renamed from: X.Gv1  reason: case insensitive filesystem */
public final class C53834Gv1 extends C251343mx {
    public final int A00;
    public final int A01;
    public final long A02;
    public final boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final 2WX A07;

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        0qQ.A0B(r15, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        int i = this.A04;
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(C51969G9p.A07(r15, this.A06), i);
        Drawable A002 = C55218He9.A00(r15, C58687Ivw.A00(r15, this, 24), new Object[]{Boolean.valueOf(this.A03), Integer.valueOf(this.A01), C51965G9l.A0e(this.A02), Integer.valueOf(this.A00)});
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        2WX r8 = this.A07;
        long j = this.A05;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass9JR A0c = C51965G9l.A0c(num, 0, j);
        if (r8 == 2WX.A02) {
            r8 = null;
        }
        return new C53949Gwt(A002, scaleType, C51973G9u.A0T(C51965G9l.A0X(r8, A0c), C51965G9l.A0c(AnonymousClass05K.A01, 0, j), num, gradientDrawable, 4), 0, false);
    }

    public C53834Gv1(2WX r2, int i, int i2, int i3, long j, long j2, long j3, boolean z) {
        0qQ.A0B(r2, 8);
        this.A00 = i;
        this.A02 = j;
        this.A05 = j2;
        this.A04 = i2;
        this.A06 = j3;
        this.A03 = z;
        this.A01 = i3;
        this.A07 = r2;
    }
}
