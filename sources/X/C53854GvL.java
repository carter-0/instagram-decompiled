package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

/* renamed from: X.GvL  reason: case insensitive filesystem */
public final class C53854GvL extends C251343mx {
    public final HNN A00;
    public final HNN A01;
    public final Integer A02;
    public final int A03 = 1;
    public final int A04;
    public final 2WX A05;
    public final Integer A06;
    public final String A07;
    public final C62320sa A08;
    public final boolean A09;

    public C53854GvL(2WX r2, HNN hnn, HNN hnn2, Integer num, Integer num2, String str, C62320sa r8, int i, boolean z) {
        this.A00 = hnn;
        this.A07 = str;
        this.A06 = num;
        this.A02 = num2;
        this.A04 = i;
        this.A09 = z;
        this.A08 = r8;
        this.A01 = hnn2;
        this.A05 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r18) {
        GradientDrawable gradientDrawable;
        AnonymousClass3Y5 r2 = r18;
        0qQ.A0B(r2, 0);
        Drawable A002 = C55218He9.A00(r2, C58688Ivx.A00(r2, this, 34), new Object[]{this.A00, this.A02, this.A01});
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            int i = this.A04;
            int i2 = this.A03;
            gradientDrawable = C51972G9s.A0H(0, intValue);
            gradientDrawable.setStroke(C51972G9s.A0B(r2, (double) i2), 0);
            gradientDrawable.setCornerRadius((float) C51972G9s.A0B(r2, (double) i));
        } else {
            gradientDrawable = null;
        }
        boolean z = this.A09;
        float f = 1.0f;
        if (!z) {
            f = 0.3f;
        }
        2WX r10 = 2WX.A02;
        2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1F, 2, C51969G9p.A0E()), AnonymousClass05K.A0F, Boolean.valueOf(z), 4);
        String str = this.A07;
        if (str != null) {
            A0Y = C51971G9r.A0Y(A0Y, AnonymousClass05K.A0N, str, 0);
        }
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Y2 = C51971G9r.A0Y(A0Y, num2, gradientDrawable, 4);
        Integer num3 = AnonymousClass05K.A01;
        2WX A012 = C52112GFg.A01(C51972G9s.A0U(A0Y2, num3, 0), f);
        C62320sa r1 = this.A08;
        if (r1 == null || !z) {
            return C51967G9n.A0O(new C53949Gwt(A002, ImageView.ScaleType.CENTER_CROP, (2WX) null, 0, false), AnonymousClass7TG.A0S(r2.Aqq()), r2, A012.A00(this.A05));
        }
        2Tp A0O = C51967G9n.A0O(new C53949Gwt(A002, ImageView.ScaleType.CENTER_CROP, (2WX) null, 0, false), AnonymousClass7TG.A0S(r2.Aqq()), r2, A012);
        C57550Icc icc = new C57550Icc(num2, AnonymousClass05K.A0C, num3);
        2WX r8 = this.A05;
        if (r8 == null) {
            r8 = r10;
        }
        return new C53775Gu4(A0O, r8, icc, r1, (C62320sa) null);
    }
}
