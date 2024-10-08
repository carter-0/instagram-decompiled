package X;

import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.GvJ  reason: case insensitive filesystem */
public final class C53852GvJ extends C251343mx {
    public final C52972GgP A00;
    public final HMY A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final C251263mp A0X(AnonymousClass3Y5 r29) {
        View view;
        C49726F3q f3q;
        Fragment A002;
        AnonymousClass3Y5 r9 = r29;
        0qQ.A0B(r9, 0);
        C52706GbJ gbJ = (C52706GbJ) AnonymousClass3Zw.A00(r9, C58544Itd.A00, new Object[0]);
        C52972GgP ggP = this.A00;
        HQ2 hq2 = (HQ2) GMJ.A00(r9, ggP.A0O);
        C56562I1q i1q = (C56562I1q) GMJ.A00(r9, ggP.A0Q);
        2Wa A003 = C243643Zq.A00(r9, C58677Ivm.A00(r9, 40));
        2V1 r2 = r9.A05;
        Object A062 = r2.A06(C49726F3q.class);
        if (!(A062 instanceof C49726F3q) || (f3q = (C49726F3q) A062) == null || (A002 = f3q.A00()) == null) {
            view = null;
        } else {
            view = A002.mView;
        }
        C55222HeD.A00(new SpannableString(""), view, r9, A003, new C58133Imz(A003.A03, 47));
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X((2WX) null, num, 1.0f, 1);
        2Wb A0S = AnonymousClass7TG.A0S(r2);
        boolean z = this.A04;
        boolean z2 = this.A06;
        HMY hmy = this.A01;
        boolean z3 = this.A09;
        boolean z4 = this.A07;
        0sP iml = new C58119Iml(ggP, 4);
        boolean z5 = this.A03;
        boolean z6 = this.A05;
        2WX A0O = C51974G9v.A0O((2WX) null, AnonymousClass05K.A00, num, 100.0f, 0);
        long A0D = C51970G9q.A0D();
        Integer num2 = AnonymousClass05K.A0A;
        A0S.A00(new C53851GvI(AnonymousClass9JR.A00(A0O, num2, 0, A0D), hq2, hmy, iml, z, z2, z3, z4, z5, z6));
        0sP iml2 = new C58119Iml(ggP, 5);
        String str = this.A02;
        boolean z7 = this.A08;
        2WX A0X2 = C51971G9r.A0X(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0Y, 0, Double.doubleToRawLongBits(44.0d)), AnonymousClass05K.A0C, 0.0f, 1);
        long A0F = C51969G9p.A0F();
        A0S.A00(new C53902Gw8(AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X2, AnonymousClass05K.A04, 0, A0F), num2, 0, A0F), gbJ, i1q, hq2, str, iml2, z7));
        return C243563Zg.A05(A0S, r9, A0X);
    }

    public C53852GvJ(C52972GgP ggP, HMY hmy, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A04 = z;
        this.A06 = z2;
        this.A01 = hmy;
        this.A09 = z3;
        this.A07 = z4;
        this.A02 = str;
        this.A08 = z5;
        this.A03 = z6;
        this.A00 = ggP;
        this.A05 = z7;
    }
}
