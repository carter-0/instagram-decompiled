package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

public final class GGB extends C251343mx {
    public final AnonymousClass3W1 A00;
    public final UserSession A01;
    public final String A02 = "caption_bg";

    public final C251263mp A0X(AnonymousClass3Y5 r29) {
        AnonymousClass3Y5 r3 = r29;
        0qQ.A0B(r3, 0);
        2Wa A002 = C243643Zq.A00(r3, C58715IwO.A01(r3, 30));
        Float A0g = C51967G9n.A0g();
        2V5 A003 = C247343gB.A00(r3, A0g);
        2V5 A004 = C247343gB.A00(r3, A0g);
        2V5 A005 = C247343gB.A00(r3, A0g);
        2V5 A0Z = C51968G9o.A0Z(r3, 1.0f);
        2V5 A006 = C247343gB.A00(r3, A0g);
        2V5 A007 = C247343gB.A00(r3, A0g);
        AnonymousClass4Ey A008 = 2Vi.A00(2Vi.A04, this.A02);
        C51966G9m.A1M(A008, 30000);
        A008.A03(C246033ds.A00);
        AnonymousClass4F7.A00(r3, A008);
        Object A009 = AnonymousClass3Zw.A00(r3, new C58194Iny(6, A003, A004, A0Z), new Object[0]);
        2V5 r19 = A005;
        2Wa r20 = A002;
        2V5 r21 = A0Z;
        Object A0010 = AnonymousClass3Zw.A00(r3, new C73679Phs(2, r19, r20, r21, A006, A004, A003, r3, A007), new Object[0]);
        C243773a4.A00(r3, new C58194Iny(5, A0010, this, A009), C51970G9q.A1b());
        Drawable drawable = (Drawable) A002.A03;
        if (drawable == null) {
            return null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51971G9r.A0X((2WX) null, AnonymousClass05K.A01, 1.0f, 1);
        C243573Zh r02 = C243573Zh.CENTER;
        Integer num = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(G9t.A0y(C51971G9r.A0Y(A0X, num, r02, 3), num, 0), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3);
        2Wb A0Q = C51972G9s.A0Q(r3);
        C51974G9v.A0h(drawable, A0Q.A00, A0Q, C51971G9r.A0W(A0Z, C51971G9r.A0W(A007, C51971G9r.A0W(A006, C51971G9r.A0W(A005, C51974G9v.A0A(A004, G9t.A10((2WX) null, AnonymousClass05K.A08, "like_heart"), new AnonymousClass9JS(A003, AnonymousClass05K.A1F)), AnonymousClass05K.A0j), AnonymousClass05K.A02), AnonymousClass05K.A03), num));
        return C243563Zg.A0F(A0Q, r3, A0Y);
    }

    public GGB(UserSession userSession, AnonymousClass3W1 r3) {
        this.A01 = userSession;
        this.A00 = r3;
    }
}
