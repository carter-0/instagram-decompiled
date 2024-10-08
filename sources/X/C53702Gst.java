package X;

import android.text.TextUtils;
import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.Gst  reason: case insensitive filesystem */
public final class C53702Gst extends C251343mx {
    public final FoaUserSession A00;
    public final C52970GgN A01;
    public final C55670HlT A02;

    public final C251263mp A0X(AnonymousClass3Y5 r34) {
        AnonymousClass3Y5 r13 = r34;
        0qQ.A0B(r13, 0);
        2Wa A002 = C243643Zq.A00(r13, C58561Itu.A00);
        FoaUserSession foaUserSession = this.A00;
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 1.0f, 1));
        Integer num2 = AnonymousClass05K.A00;
        2WX A0y = G9t.A0y(A0X, num2, 0);
        2Wb A0Q = C51972G9s.A0Q(r13);
        long A0F = C51970G9q.A0F();
        long A0F2 = C51969G9p.A0F();
        2WX A0G = C51974G9v.A0G((2WX) null, C51967G9n.A0S(0, A0F), 0, A0F2);
        Integer num3 = AnonymousClass05K.A1I;
        2WX A003 = AnonymousClass9JR.A00(A0G, num3, 0, A0F2);
        Integer num4 = AnonymousClass05K.A0C;
        2WX A0X2 = C51971G9r.A0X(A003, num4, 0.0f, 1);
        2Wb A0w = G9t.A0w(A0Q);
        0qQ.A0B(foaUserSession, 0);
        String A0F3 = C244013aV.A0F(A0w, C51970G9q.A0h(0Tu.A05, C56316HwT.A00(foaUserSession), 36607311934920229L), 2131966029);
        HNO hno = HNO.A0Y;
        Integer num5 = AnonymousClass05K.A03;
        long A0J = C51970G9q.A0J();
        AnonymousClass90N r23 = AnonymousClass90N.CENTER;
        long A0D = C51970G9q.A0D();
        long j = A0J;
        A0w.A00(new C53907GwD(AnonymousClass9JR.A00((2WX) null, num3, 0, A0D), r23, hno, A0F3, num5, 0, A0J, j));
        J6R A004 = J6R.A00(this, A0w, 1);
        C52813Gd5 gd5 = new C52813Gd5(A0w);
        A004.invoke(gd5);
        CharSequence expandTemplate = TextUtils.expandTemplate(C244013aV.A0E(A0w, 2131966027), new CharSequence[]{gd5});
        0qQ.A0A(expandTemplate);
        C51971G9r.A1D(new C53907GwD(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A08, 0, A0D), r23, hno, expandTemplate, AnonymousClass05K.A0N, 0, A0J, j), A0w, A0Q, A0X2);
        C55670HlT hlT = this.A02;
        2WX A0X3 = C51971G9r.A0X((2WX) null, num, 1.0f, 1);
        FoaUserSession foaUserSession2 = foaUserSession;
        A0Q.A00(new C53944Gwo(A0X3, foaUserSession2, (C55547HjT) C58714IwN.A00(r13, A002, new Object[]{foaUserSession}, 29), hlT));
        List list = (List) A002.A03;
        if (AnonymousClass7TE.A1b(list)) {
            A0Q.A00(new C53703Gsu(G9t.A10(C51971G9r.A0X(G9t.A0y(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51974G9v.A0B((2WX) null), AnonymousClass05K.A0j, 1, C51969G9p.A0D()), num3, 0, A0D), num2, 0), num4, 0.0f, 1), num2, C51965G9l.A0Y(I61.A00(A0Q, HNO.A0e))), list, C58688Ivx.A00(list, this, 17)));
        }
        return C243563Zg.A03(A0Q, r13, A0y);
    }

    public C53702Gst(FoaUserSession foaUserSession, C52970GgN ggN, C55670HlT hlT) {
        AnonymousClass7TG.A1Q(ggN, hlT);
        this.A00 = foaUserSession;
        this.A01 = ggN;
        this.A02 = hlT;
    }
}
