package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gv3  reason: case insensitive filesystem */
public final class C53836Gv3 extends C251343mx {
    public final C56105Hss A00;
    public final 0sP A01;
    public final 0sL A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final 2WX A06;
    public final HMY A07;

    public C53836Gv3(2WX r2, HMY hmy, C56105Hss hss, 0sP r5, 0sL r6, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TF.A1E(hmy, 4, r5);
        this.A00 = hss;
        this.A03 = z;
        this.A04 = z2;
        this.A07 = hmy;
        this.A05 = z3;
        this.A02 = r6;
        this.A01 = r5;
        this.A06 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r32) {
        Bitmap bitmap;
        String str;
        AnonymousClass3Y5 r10 = r32;
        0qQ.A0B(r10, 0);
        C56105Hss hss = this.A00;
        if (hss != null) {
            bitmap = hss.A01;
        } else {
            bitmap = null;
        }
        Drawable drawable = (Drawable) AnonymousClass3Zw.A00(r10, C58687Ivw.A00(r10, this, 39), new Object[]{bitmap});
        if (hss != null) {
            str = hss.A02.A04;
        } else {
            str = null;
        }
        C56091Hse hse = (C56091Hse) AnonymousClass3Zw.A00(r10, C58548Ith.A00, new Object[]{str});
        AnonymousClass3XV r1 = 2WX.A02;
        long A0D = C51970G9q.A0D();
        2WX A002 = C51974G9v.A0F((2WX) null, C51966G9m.A0k(0, A0D), 0, A0D).A00(this.A06);
        2Wb A0Q = C51972G9s.A0Q(r10);
        2Wb A0w = G9t.A0w(A0Q);
        long A022 = I61.A02(A0w, AnonymousClass05K.A0X);
        2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0G, 0, C51969G9p.A0F());
        float f = this.A07.A00;
        Integer num = AnonymousClass05K.A0Y;
        2WX A0X = C51971G9r.A0X(A003, num, f, 1);
        Integer num2 = AnonymousClass05K.A01;
        A0w.A00(new C53815Gui(drawable, C51971G9r.A0X(A0X, num2, 100.0f, 0), C58677Ivm.A00(this, 31), J5D.A00, A022));
        C243583Zi r28 = C243583Zi.FLEX_END;
        C243573Zh r26 = C243573Zh.FLEX_END;
        2WX A0z = G9t.A0z(C51973G9u.A0X((2WX) null, num2, 100.0d, 0), num, C244413b9.ABSOLUTE);
        long A0G = C51970G9q.A0G();
        2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0z, AnonymousClass05K.A0N, 1, A0G), num, 1, A0G);
        2Wb A0w2 = G9t.A0w(A0w);
        AnonymousClass2VW r13 = hse.A00;
        String str2 = hse.A01;
        C58687Ivw A005 = C58687Ivw.A00(hse, this, 38);
        HNN hnn = HNN.A0X;
        int A006 = I61.A00(A0w2, HNO.A0k);
        int EIY = I41.A00(I3I.A01(A0w2)).EIY(HNO.A0Q, false);
        String A0E = C244013aV.A0E(A0w2, 2131966338);
        long A042 = G9w.A04();
        C53854GvL gvL = new C53854GvL(G9t.A10(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, A042), num2, 0, A042), AnonymousClass05K.A0D, str2), hnn, (HNN) null, Integer.valueOf(A006), Integer.valueOf(EIY), A0E, A005, 40, true);
        AnonymousClass56V.A00(gvL, r13);
        A0w2.A00(gvL);
        A0w.A00(C243563Zg.A0H(A0w2, A0w, A004, r26, (C243573Zh) null, r28, (C244343b2) null, false));
        return C51967G9n.A0O(C243563Zg.A0A(A0w, A0Q), A0Q, r10, A002);
    }
}
