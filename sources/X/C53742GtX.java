package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.GtX  reason: case insensitive filesystem */
public final class C53742GtX extends C251343mx {
    public final String A00;
    public final 0sP A01;
    public final C226662he A02;
    public final String A03;

    public C53742GtX(C226662he r2, String str, String str2, 0sP r5) {
        0qQ.A0B(str2, 3);
        this.A02 = r2;
        this.A03 = str;
        this.A00 = str2;
        this.A01 = r5;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        AnonymousClass3Y5 r4 = r33;
        JSK A002 = I41.A00(I3I.A00(r4));
        Drawable A003 = C55218He9.A00(r4, C58677Ivm.A00(r4, 22), C51966G9m.A1b());
        2Wb A0S = AnonymousClass7TG.A0S(r4.A05);
        C226662he r15 = this.A02;
        String str = this.A03;
        int EIZ = A002.EIZ(AnonymousClass05K.A0b);
        int EIZ2 = A002.EIZ(AnonymousClass05K.A0d);
        int EIZ3 = A002.EIZ(AnonymousClass05K.A0c);
        int EIZ4 = A002.EIZ(AnonymousClass05K.A0e);
        long A07 = C51965G9l.A07(EIZ3);
        int A004 = I61.A00(A0S, HNO.A06);
        long A0J = C51970G9q.A0J();
        2V1 Aqq = A0S.Aqq();
        C52334GOc gOc = new C52334GOc(Aqq, new C52335GOd());
        C52335GOd gOd = gOc.A01;
        gOd.A0C = true;
        gOd.A02 = A004;
        gOd.A00 = (float) C51968G9o.A09(A0S, A07);
        gOd.A01 = (float) C51968G9o.A09(A0S, A0J);
        gOd.A03 = 0;
        gOd.A06 = 922746880;
        gOd.A05 = 50331648;
        gOd.A04 = -1;
        gOd.A0A = false;
        gOd.A0B = false;
        gOd.A08 = false;
        gOd.A09 = false;
        AnonymousClass3XV r28 = 2WX.A02;
        2WX A005 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0N, 0, C51965G9l.A07(EIZ));
        long A072 = C51965G9l.A07(EIZ2);
        Integer num = AnonymousClass05K.A01;
        2WX A006 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A005, num, 0, A072), AnonymousClass05K.A1F, 0, C51969G9p.A0F());
        2Wb A0S2 = AnonymousClass7TG.A0S(Aqq);
        if (r15 == null) {
            A0S2.A00(new AnonymousClass3XA());
        } else {
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            2WX A0X = C51971G9r.A0X((2WX) null, AnonymousClass05K.A0Y, 1.0f, 1);
            long A073 = C51965G9l.A07(EIZ4);
            2WX A007 = AnonymousClass9JR.A00(A0X, num, 0, A073);
            Integer num2 = AnonymousClass05K.A00;
            A0S2.A00(new C53958Gx2(A003, (Drawable) null, scaleType, (AnonymousClass579) null, (C226672hf) null, r15, (C268764dx) null, C51974G9v.A0J(A007, C51965G9l.A0c(num2, 0, A073), num2), "SearchLinkSearchInfoComponent", 0));
        }
        if (str == null) {
            str = "";
        }
        Integer num3 = AnonymousClass05K.A0j;
        C52334GOc.A01(C51967G9n.A0Q(new C53907GwD(C51972G9s.A0R(G9t.A0z((2WX) null, AnonymousClass05K.A00, C243573Zh.CENTER), 0, C51970G9q.A0H()), (AnonymousClass90N) null, HNO.A0Y, str, num3, 1, 112), A0S2, A0S, A006), gOc);
        A0S.A00(new C53775Gu4(gOd, r28, new C57550Icc(num, num, num), C58677Ivm.A00(this, 21), (C62320sa) null));
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0S.A01, false);
    }
}
