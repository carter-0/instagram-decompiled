package X;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Gvo  reason: case insensitive filesystem */
public final class C53883Gvo extends C251343mx {
    public static final Map A01 = 0Yt.A06(new 0eP[]{AnonymousClass7TF.A0x(C54637HLu.ONLY_ME, 2131966048), AnonymousClass7TF.A0x(C54637HLu.CLOSE_FRIENDS, 2131966046), AnonymousClass7TF.A0x(C54637HLu.FOLLOWERS_YOU_FOLLOW_BACK, 2131966047), AnonymousClass7TF.A0x(C54637HLu.ALL_FOLLOWERS, 2131966045)});
    public final C62320sa A00;

    public final C251263mp A0X(AnonymousClass3Y5 r40) {
        AnonymousClass3Y5 r38 = r40;
        AnonymousClass3Y5 r1 = r38;
        0qQ.A0B(r1, 0);
        String A0E = C244013aV.A0E(r1, 2131966049);
        HNN hnn = HNN.A0F;
        HNO hno = HNO.A0h;
        C56111Hsy hsy = new C56111Hsy(I61.A04(r38, hnn, (HNN) null, Integer.valueOf(I61.A00(r1, hno))), A0E, C58565Ity.A00);
        C243573Zh r24 = C243573Zh.FLEX_START;
        C243583Zi r23 = C243583Zi.CENTER;
        AnonymousClass3XV r12 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
        2Wb A0Q = C51972G9s.A0Q(r38);
        long doubleToRawLongBits = Double.doubleToRawLongBits(34.0d);
        long A0F = C51970G9q.A0F();
        Integer num3 = AnonymousClass05K.A0E;
        Integer num4 = num3;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num4, 0, A0F);
        Integer num5 = AnonymousClass05K.A08;
        2WX A003 = AnonymousClass9JR.A00(A002, num5, 0, doubleToRawLongBits);
        Integer num6 = AnonymousClass05K.A0C;
        2WX A0X3 = C51971G9r.A0X(A003, num6, 0.0f, 1);
        String A0E2 = C244013aV.A0E(A0Q, 2131966051);
        AnonymousClass90N r29 = AnonymousClass90N.CENTER;
        HNO hno2 = HNO.A0Y;
        Integer num7 = AnonymousClass05K.A0H;
        long A0H = C51970G9q.A0H();
        long j = A0H;
        A0Q.A00(new C53907GwD(A0X3, r29, hno2, A0E2, num7, 0, A0H, j));
        A0Q.A00(new C53907GwD(C51973G9u.A0S(AnonymousClass9JR.A00((2WX) null, num4, 0, A0F), C51965G9l.A0c(num5, 0, C51970G9q.A0I()), num6, 0.0f, 1), r29, hno2, C244013aV.A0E(A0Q, 2131966050), AnonymousClass05K.A0N, 0, A0H, j));
        2WX A0X4 = C51971G9r.A0X(C51971G9r.A0X(C51973G9u.A0X(C51971G9r.A0X((2WX) null, num, 84.6f, 0), num5, 30.0d, 0), num2, 1.0f, 1), num6, 0.0f, 1);
        C243573Zh r8 = C243573Zh.CENTER;
        2WX A0Y = C51971G9r.A0Y(A0X4, num, r8, 3);
        Map map = A01;
        ArrayList A0v = DbS.A0v(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            C56111Hsy hsy2 = new C56111Hsy((Drawable) null, C244013aV.A0E(A0Q, AnonymousClass7TE.A0M(A1J.getValue())), (C62320sa) null);
            C56111Hsy hsy3 = null;
            if (A1J.getKey() == C54637HLu.CLOSE_FRIENDS) {
                hsy3 = hsy;
            }
            A0v.add(new C56112Hsz(hsy2, hsy3, J5S.A00));
        }
        A0Q.A00(new C53710Gt1(A0Y, A0v, 00k.A03(map.keySet(), C54637HLu.FOLLOWERS_YOU_FOLLOW_BACK)));
        2WX A0Y2 = C51971G9r.A0Y(C51973G9u.A0S(AnonymousClass9JR.A00((2WX) null, num3, 0, A0F), C51965G9l.A0c(num5, 0, Double.doubleToRawLongBits(100.0d)), num6, 0.0f, 1), num, r8, 3);
        String A0E3 = C244013aV.A0E(A0Q, 2131966052);
        long A0B = C51969G9p.A0B();
        A0Q.A00(new C53907GwD(A0Y2, r29, hno, A0E3, num6, 0, A0B, A0B));
        long A0E4 = C51969G9p.A0E();
        Integer num8 = AnonymousClass05K.A0G;
        Integer num9 = num2;
        A0Q.A00(new C53861GvS(C51974G9v.A0O(C51973G9u.A0X(C51973G9u.A0X(C51971G9r.A0X(C51973G9u.A0T((2WX) null, C51965G9l.A0c(num8, 0, A0E4), num, r8, 3), num, 92.8f, 0), num8, 16.0d, 0), num9, 42.0d, 0), num9, num6, 0.0f, 1), HNO.A0P, HNO.A0S, (HNO) null, C244013aV.A0E(A0Q, 2131966103), num, num, num, num3, C58714IwN.A01(this, 36)));
        return C243563Zg.A07(A0Q, r38, A0X2, r24, r23);
    }

    public C53883Gvo(C62320sa r1) {
        this.A00 = r1;
    }
}
