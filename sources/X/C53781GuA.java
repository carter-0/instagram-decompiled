package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GuA  reason: case insensitive filesystem */
public final class C53781GuA extends C251343mx {
    public final C55678Hlb A00;
    public final C267324bN A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final HashMap A04;

    public final C251263mp A0X(AnonymousClass3Y5 r26) {
        String str;
        C276014sL r0;
        1Xj r02;
        ImageUrl A1Q;
        AnonymousClass3Y5 r8 = r26;
        0qQ.A0B(r8, 0);
        C267324bN r24 = this.A01;
        C53328GmE A022 = r24.A02();
        if (A022 != null) {
            str = A022.A0D;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (A022 != null) {
            String str3 = A022.A0A;
            if (str3 == null) {
                str3 = str2;
            }
            List list = A022.A0F;
            if (!(list == null || (r0 = (C276014sL) 00k.A0O(list, 0)) == null || (r02 = r0.A00) == null || (A1Q = r02.A1Q()) == null)) {
                String str4 = A022.A07;
                if (str4 != null) {
                    str2 = str4;
                }
                Object A002 = AnonymousClass3Zw.A00(r8, C58597IuU.A00, new Object[0]);
                AnonymousClass3XV r03 = 2WX.A02;
                long A06 = C51967G9n.A06(r8);
                Integer num = AnonymousClass05K.A08;
                2WX A003 = AnonymousClass9JR.A00((2WX) null, num, 0, A06);
                long A032 = C244013aV.A03(r8);
                Integer num2 = AnonymousClass05K.A04;
                2WX A004 = AnonymousClass9JR.A00(A003, num2, 0, A032);
                Integer num3 = AnonymousClass05K.A0N;
                2WX A0Y = C51971G9r.A0Y(A004, num3, str, 0);
                long A0C = C244013aV.A0C(r8, R.dimen.avatar_search_sticker_tray_text_size);
                2V1 r11 = r8.A05;
                Context context = r11.A0C;
                Context context2 = context;
                int A09 = C51972G9s.A09(context, r8);
                Typeface typeface = Typeface.DEFAULT;
                long A0D = C51969G9p.A0D();
                Integer num4 = AnonymousClass05K.A00;
                C244103ae A0b = C51971G9r.A0b(r11, (2V5) null, str, 0);
                C51973G9u.A16(r8, A0b, A09, A0C);
                A0b.A0R(1);
                G9w.A11(typeface, r8, A0b, A0D);
                C51970G9q.A1J(A0b, num4);
                C51970G9q.A1I(A0b, 1.09f, false);
                A0b.A0M(2);
                C51974G9v.A0z(A0Y, A0b, false);
                2WW A0A = A0b.A0A();
                2WX A0T = C51973G9u.A0T(AnonymousClass9JR.A00((2WX) null, num, 0, C244013aV.A03(r8)), C51970G9q.A0c(r8, num2, R.dimen.abc_dropdownitem_icon_width, 0), num3, str3, 0);
                int A08 = C51969G9p.A08(r8, 2Yu.A0E(context2));
                long A042 = C244013aV.A04(r8);
                C244103ae A0b2 = C51971G9r.A0b(r11, (2V5) null, str3, 0);
                C51973G9u.A16(r8, A0b2, A08, A042);
                A0b2.A0R(0);
                G9w.A11(typeface, r8, A0b2, A0D);
                A0b2.A0B();
                C51973G9u.A1A(A0b2, num4, 1.09f, false);
                A0b2.A0M(3);
                C51974G9v.A0z(A0T, A0b2, false);
                2WW A0A2 = A0b2.A0A();
                2WX A0X = C51971G9r.A0X((2WX) null, num4, 100.0f, 0);
                Integer num5 = AnonymousClass05K.A01;
                2WX A0X2 = C51971G9r.A0X(A0X, num5, 100.0f, 0);
                2Wb A0S = AnonymousClass7TG.A0S(r11);
                AnonymousClass0iw r112 = this.A02;
                A0S.A00(new C53753Gti(A1Q, r112));
                2WX A005 = AnonymousClass9JR.A00(C51971G9r.A0X((2WX) null, num5, 1.0f, 1), AnonymousClass05K.A15, 0, C244013aV.A0C(A0S, R.dimen.abc_dropdownitem_icon_width));
                2Wb A0w = G9t.A0w(A0S);
                A0w.A00(new C53919GwP(r24, r112, this.A03, this.A04));
                A0w.A00(A0A);
                A0w.A00(A0A2);
                2WX A0W = C51973G9u.A0W(C51973G9u.A0W((2WX) null, A0w, num, R.dimen.abc_dialog_padding_material, 0), A0w, num2, R.dimen.abc_dropdownitem_icon_width, 0);
                2Wb A0L = C51973G9u.A0L(A0w);
                A0L.A00(new C53752Gth(C58697Iw6.A00(r24, A002, this, 37), str2, 2Yu.A0H(A0L.A00.A0C, R.attr.igds_color_text_on_white)));
                C51971G9r.A1F(C243563Zg.A0F(A0L, A0w, A0W), A0w, A0S, A005);
                return C243563Zg.A05(A0S, r8, A0X2);
            }
        }
        throw AnonymousClass7TE.A0y();
    }

    public C53781GuA(C267324bN r1, AnonymousClass0iw r2, UserSession userSession, C55678Hlb hlb, HashMap hashMap) {
        C51974G9v.A1L(r2, userSession, hashMap);
        this.A02 = r2;
        this.A03 = userSession;
        this.A01 = r1;
        this.A04 = hashMap;
        this.A00 = hlb;
    }
}
