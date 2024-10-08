package X;

import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.OnImpressionStyle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GOj  reason: case insensitive filesystem */
public final class C52340GOj extends C251343mx {
    public final C257873y6 A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final UserSession A03;
    public final JR6 A04;
    public final boolean A05;

    public C52340GOj(C257873y6 r2, C267324bN r3, C52058GDe gDe, UserSession userSession, JR6 jr6, boolean z) {
        AnonymousClass7TG.A0w(1, userSession, r3, gDe);
        0qQ.A0B(jr6, 5);
        this.A03 = userSession;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = gDe;
        this.A04 = jr6;
        this.A05 = z;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        Drawable drawable;
        Drawable drawable2;
        long A0C;
        2Tp gOl;
        AnonymousClass3Y5 r3 = r33;
        0qQ.A0B(r3, 0);
        C257873y6 r26 = this.A00;
        String BVi = r26.BVi();
        if (BVi != null) {
            drawable = C14091Tpi.A02(r3.A05.A0C, BVi);
        } else {
            drawable = null;
        }
        String Bdx = r26.Bdx();
        if (Bdx != null) {
            drawable2 = C14091Tpi.A02(r3.A05.A0C, Bdx);
        } else {
            drawable2 = null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        boolean z = this.A05;
        if (z) {
            A0C = C244013aV.A0C(r3, R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin);
        } else {
            A0C = C244013aV.A0C(r3, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        Integer num = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num, 0, A0C);
        C243573Zh r7 = C243573Zh.CENTER;
        Integer num2 = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X(C51971G9r.A0Y(A002, num2, r7, 3), num2, 100.0f, 0);
        C243583Zi r14 = C243583Zi.FLEX_START;
        2Wb A0Q = C51972G9s.A0Q(r3);
        2WX A0S = C51973G9u.A0S(C51973G9u.A0W((2WX) null, A0Q, num, R.dimen.account_recs_header_image_margin, 0), C51965G9l.A0d(num2, r7, 3), num2, 100.0f, 0);
        2V1 Aqq = A0Q.Aqq();
        C51967G9n.A1C((2Wb) null, A0Q, G9t.A10(A0S, num2, C51965G9l.A0Y(Aqq.A0C.getColor(R.color.clips_segment_buttons_color_disabled))));
        OnImpressionStyle C23 = r26.C23();
        if (C23 != null) {
            int ordinal = C23.ordinal();
            if (ordinal == 7) {
                gOl = new C52342GOl(drawable, C243573Zh.FLEX_START, (Boolean) null, r26.BVj(), C58715IwO.A01(this, 14), false, z);
            } else if (ordinal == 3) {
                1Xj r9 = this.A01.A02;
                if (r9 != null) {
                    2WX A0O = C51974G9v.A0O(C51971G9r.A0Y((2WX) null, num2, r7, 3), num2, num, 100.0f, 0);
                    C243583Zi r1 = C243583Zi.SPACE_EVENLY;
                    2Wb A0S2 = AnonymousClass7TG.A0S(Aqq);
                    A0S2.A00(new C52342GOl(drawable, r7, (Boolean) null, r26.BVj(), C58715IwO.A01(this, 12), false, z));
                    A0S2.A00(new C52342GOl(drawable2, r7, Boolean.valueOf(AnonymousClass941.A00(this.A03).A01(r9)), r26.Bdy(), C58715IwO.A01(this, 13), true, z));
                    gOl = C243563Zg.A0K(A0S2, A0Q, A0O, r1);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A0Q.A00(gOl);
        }
        return C243563Zg.A08(A0Q, r3, A0X, r14);
    }
}
