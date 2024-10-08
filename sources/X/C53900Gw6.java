package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.Gw6  reason: case insensitive filesystem */
public final class C53900Gw6 extends C251343mx {
    public final C70802Vt A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final SocialContextBubbleUiState A03;
    public final C246853fL A04;
    public final 2WX A05;
    public final boolean A06;

    public C53900Gw6(C70802Vt r2, 2WX r3, AnonymousClass0iw r4, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, C246853fL r7, boolean z) {
        AnonymousClass7TF.A1E(userSession, 5, r2);
        this.A05 = r3;
        this.A01 = r4;
        this.A03 = socialContextBubbleUiState;
        this.A06 = z;
        this.A02 = userSession;
        this.A04 = r7;
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.2T3, java.lang.Object] */
    public final C251263mp A0X(AnonymousClass3Y5 r38) {
        double d;
        AnonymousClass3Y5 r7 = r38;
        0qQ.A0B(r7, 0);
        ? obj = new Object();
        int A002 = A00(r7) - C51972G9s.A0B(r7, 48.0d);
        I4F i4f = I4F.A00;
        2V1 Aqq = r7.Aqq();
        Context A0B = C51965G9l.A0B(Aqq);
        UserSession userSession = this.A02;
        SocialContextBubbleUiState socialContextBubbleUiState = this.A03;
        SpannableStringBuilder A012 = i4f.A01(A0B, this.A00, userSession, socialContextBubbleUiState, this.A04, R.attr.igds_color_primary_text_on_media, R.attr.textColorBoldLink);
        long A0G = C51972G9s.A0G(14.0f);
        AnonymousClass3XV r2 = 2WX.A02;
        long A0G2 = C51969G9p.A0G(A002);
        Integer num = AnonymousClass05K.A0N;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num, 0, A0G2);
        int A0A = C51972G9s.A0A(A0B, r7, R.attr.igds_color_primary_text_on_media);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(Aqq, (2V5) null, A012, 0);
        C51973G9u.A16(r7, A0b, A0A, A0G);
        A0b.A0R(0);
        G9w.A11(typeface, r7, A0b, A0D);
        C51974G9v.A16(A0b, num, num2);
        A0b.A0M(2);
        C51974G9v.A0z(A003, A0b, false);
        2WW A0A2 = A0b.A0A();
        2V1 r1 = r7.A05;
        A0A2.A0L(r1, obj, 0, 0);
        int i = obj.A00;
        long A0G3 = C51970G9q.A0G();
        if (i > C51969G9p.A07(r7, A0G3)) {
            d = 6.0d;
        } else {
            d = 8.0d;
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        2WX r36 = this.A05;
        2Wb A0S = AnonymousClass7TG.A0S(r1);
        int A0C = obj.A01 + C51972G9s.A0C(A0S, 42.0d);
        int A09 = obj.A00 + (C51968G9o.A09(A0S, doubleToRawLongBits) * 2);
        int A004 = A00(A0S);
        AnonymousClass3XV r14 = 2WX.A02;
        2WX A0B2 = C51974G9v.A0B((2WX) null);
        Integer num3 = AnonymousClass05K.A0C;
        2WX A0N = C51974G9v.A0N(A0B2, num3, 1, A0D);
        2Wb A0L = C51973G9u.A0L(A0S);
        Drawable A0D2 = C244013aV.A0D(A0L, R.drawable.friendly_viewer_comment_bubble_transparent);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        Integer num4 = AnonymousClass05K.A01;
        2WX A005 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C52112GFg.A01(r14, 0.8f), num2, 0, ((long) A0C) | 9221401712017801216L), num4, 0, ((long) A09) | 9221401712017801216L), num, 0, ((long) A004) | 9221401712017801216L);
        C247393gG A006 = C247373gE.A00(A0L.A00);
        A006.A0D(A0D2);
        A006.A0E(scaleType);
        A006.A0C();
        C244123ag.A00(A006, A005);
        C51971G9r.A1C(A006.A0A(), A0L, A0S, A0N);
        long A0B3 = C51969G9p.A0B();
        2WX A0S2 = C51972G9s.A0S((2WX) null, 0, A0B3);
        Integer num5 = AnonymousClass05K.A09;
        2WX A007 = AnonymousClass9JR.A00(A0S2, num5, 0, A0B3);
        2Wb A0w = G9t.A0w(A0S);
        2WX A0S3 = C51973G9u.A0S(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A0G3), num4, 0, A0G3), C51965G9l.A0c(num5, 0, A0B3), num3, 0.0f, 1);
        ImageUrl imageUrl = socialContextBubbleUiState.A03;
        AnonymousClass0iw r3 = this.A01;
        AnonymousClass0iw r27 = r3;
        ImageUrl imageUrl2 = imageUrl;
        A0w.A00(new C244443bC(A0S3, r27, imageUrl2, (AnonymousClass3NK) null, A0w.Bnf().A02(2Yu.A04(A0w.Aqq().A0C)), 0, -16777216, false, true, false));
        C51971G9r.A1E(C243563Zg.A0B(G9t.A0v(A0A2, A0w.A00), A0w, C51974G9v.A0E((2WX) null, C51967G9n.A0V(doubleToRawLongBits), 0, doubleToRawLongBits)), A0w, A0S, A007);
        return C243563Zg.A0B(A0S, r7, r36);
    }

    private final int A00(C70832Wc r4) {
        double d;
        int i = AnonymousClass7TF.A0A(r4.Aqq().A0C).getDisplayMetrics().widthPixels;
        if (this.A06) {
            d = 57.0d;
        } else {
            d = 92.0d;
        }
        return i - C51972G9s.A0E(r4, d);
    }
}
