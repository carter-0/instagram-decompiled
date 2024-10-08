package X;

import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.5tc  reason: invalid class name and case insensitive filesystem */
public final class C298535tc extends C251343mx {
    public final C226662he A00;
    public final C251263mp A01;
    public final JMT A02;
    public final C56920IHp A03;
    public final Integer A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final 0sP A08;
    public final long A09;
    public final 2WX A0A;

    public C298535tc(C226662he r2, C251263mp r3, 2WX r4, JMT jmt, C56920IHp iHp, Integer num, C62320sa r8, C62320sa r9, C62320sa r10, 0sP r11, long j) {
        0qQ.A0B(jmt, 3);
        this.A00 = r2;
        this.A09 = j;
        this.A02 = jmt;
        this.A0A = r4;
        this.A04 = num;
        this.A05 = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A01 = r3;
        this.A03 = iHp;
        this.A08 = r11;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        boolean z = true;
        int i = 0;
        Drawable A002 = C55218He9.A00(r13, new C58708IwH(r13, 1), new Object[]{C60340gF.A00});
        if ((this.A05 == null && this.A06 == null) || !(this.A02 instanceof C57577Id4)) {
            z = false;
        }
        AnonymousClass4Ey A003 = 2Vi.A00(2Vi.A04, "image_fade_in_transition");
        A003.A03(C246033ds.A00);
        A003.A01(0.0f);
        Integer num = this.A04;
        if (num != null) {
            i = num.intValue();
        }
        A003.A02 = new AnonymousClass4Ex(new AccelerateDecelerateInterpolator(), i);
        AnonymousClass4F7.A00(r13, A003);
        long j = this.A09;
        AnonymousClass3XV r8 = 2WX.A02;
        C53705Gsw gsw = new C53705Gsw(r8.A00(this.A0A), new C58697Iw6(26, A002, r13, this), j);
        if (z) {
            return new C53775Gu4(gsw, r8, new C57550Icc(AnonymousClass05K.A01, AnonymousClass05K.A00, AnonymousClass05K.A0C), new C58714IwN(this, 49), new C58708IwH(this, 0));
        }
        return gsw;
    }
}
