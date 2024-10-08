package X;

import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.7fG  reason: invalid class name and case insensitive filesystem */
public final class C336837fG extends C251343mx {
    public final C52971GgO A00;
    public final UserSession A01;
    public final User A02;
    public final String A03;
    public final boolean A04;
    public final AnonymousClass4DU A05;
    public final boolean A06;
    public final boolean A07;

    public C336837fG(C52971GgO ggO, UserSession userSession, AnonymousClass4DU r4, User user, String str, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(ggO, 7);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = user;
        this.A07 = z;
        this.A04 = z2;
        this.A05 = r4;
        this.A00 = ggO;
        this.A06 = z3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r35) {
        User user;
        String A0F;
        C244403b8 r18;
        C244423bA r15;
        AnonymousClass3Y5 r3 = r35;
        0qQ.A0B(r3, 0);
        2Wa A002 = C243643Zq.A00(r3, new C377119Kp(this, 36));
        C62320sa A003 = AnonymousClass3j0.A00(r3, new C377429Lu(1, A002, this));
        Reel reel = (Reel) A002.A03;
        int i = 36;
        int i2 = 44;
        if (this.A07) {
            i = 28;
            i2 = 33;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX r02 = new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A1F, new AnonymousClass9MC(9, this, reel, A003), 4));
        long doubleToRawLongBits = Double.doubleToRawLongBits((double) i);
        Integer num = AnonymousClass05K.A00;
        2WX r13 = new 2WX((2WX) null, new AnonymousClass9JR(num, 0, doubleToRawLongBits));
        Integer num2 = AnonymousClass05K.A01;
        2WX r4 = new 2WX(r13, new AnonymousClass9JR(num2, 0, doubleToRawLongBits));
        float f = 1.0f;
        if (this.A06) {
            f = 0.4f;
        }
        2WX A012 = C52112GFg.A01(r4, f);
        String A0E = C244013aV.A0E(r3, 2131970052);
        Integer num3 = AnonymousClass05K.A0N;
        2WX r132 = new 2WX(A012, new AnonymousClass9JS(num3, A0E, 0));
        Integer num4 = AnonymousClass05K.A0C;
        2WX r14 = new 2WX(r132, new AnonymousClass9JQ(num4, 0.0f, 1));
        Integer num5 = AnonymousClass05K.A08;
        2WX r133 = new 2WX(r14, new AnonymousClass9JS(num5, "row_comment_imageview", 4));
        if (reel != null) {
            user = this.A02;
            A0F = C244013aV.A0F(r3, user.getUsername(), 2131976678);
        } else {
            user = this.A02;
            A0F = C244013aV.A0F(r3, user.getUsername(), 2131963112);
        }
        2WX A004 = new 2WX(r133, new AnonymousClass9JS(num3, A0F, 0)).A00(r02);
        ImageUrl simpleImageUrl = new SimpleImageUrl(user.Bh3().getUrl(), i, i);
        AnonymousClass4DU r7 = this.A05;
        2V1 r03 = r3.A05;
        2V1 r33 = r03;
        C244443bC r22 = new C244443bC(A004, r7, simpleImageUrl, (AnonymousClass3NK) null, C244013aV.A02(r3, 2Yu.A0H(r03.A0C, R.attr.igds_color_highlight_background)), 0, -16777216, false, true, false);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits((double) i2);
        2WX r6 = new 2WX((2WX) null, new AnonymousClass9JR(num4, 0, doubleToRawLongBits2));
        Integer num6 = AnonymousClass05K.A0Y;
        Integer num7 = num5;
        2WX r5 = new 2WX(new 2WX(new 2WX(new 2WX(r6, new AnonymousClass9JR(num6, 0, doubleToRawLongBits2)), new AnonymousClass9JR(num7, 0, Double.doubleToRawLongBits(12.0d))), new AnonymousClass9JR(AnonymousClass05K.A09, 0, Double.doubleToRawLongBits(9.0d))), new AnonymousClass9JR(AnonymousClass05K.A0A, 0, Double.doubleToRawLongBits(3.0d)));
        C243583Zi r142 = C243583Zi.CENTER;
        C243573Zh r134 = C243573Zh.CENTER;
        2Wb r42 = new 2Wb(r33, new ArrayList());
        r42.A00(r22);
        if (reel == null) {
            r15 = null;
        } else {
            2WX A005 = new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(num, 0, doubleToRawLongBits2)), new AnonymousClass9JR(num2, 0, doubleToRawLongBits2)), new AnonymousClass9JS(num6, C244413b9.ABSOLUTE, 3)), new AnonymousClass9JS(AnonymousClass05K.A0j, 2, 0)).A00(r02);
            UserSession userSession = this.A01;
            RingSpec A052 = reel.A05(userSession);
            if (A052 == null) {
                A052 = AnonymousClass3NW.A00(userSession, reel);
            }
            if (reel.A16(userSession)) {
                r18 = C244403b8.STATE_INACTIVE;
            } else {
                r18 = C244403b8.STATE_ACTIVE;
            }
            r15 = new C244423bA(A005, A052, r18, Float.valueOf(C244013aV.A00(r42, R.dimen.afi_indicator_arrow_margin_top)), Float.valueOf(C244013aV.A00(r42, R.dimen.account_recs_header_image_margin)));
        }
        r42.A00(r15);
        return C243563Zg.A06(r42, r3, r5, (C243573Zh) null, r134, r142, false);
    }
}
