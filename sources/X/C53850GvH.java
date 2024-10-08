package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.GvH  reason: case insensitive filesystem */
public final class C53850GvH extends C251343mx {
    public final GNY A00;
    public final C70802Vt A01;
    public final 2WX A02;
    public final 2WX A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final SocialContextBubbleUiState A06;
    public final C246853fL A07;
    public final boolean A08;
    public final boolean A09;

    public C53850GvH(GNY gny, C70802Vt r3, 2WX r4, 2WX r5, AnonymousClass0iw r6, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, C246853fL r9, boolean z, boolean z2) {
        AnonymousClass7TF.A1F(userSession, 6, r3);
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = gny;
        this.A06 = socialContextBubbleUiState;
        this.A09 = z;
        this.A05 = userSession;
        this.A07 = r9;
        this.A01 = r3;
        this.A03 = r5;
        this.A08 = z2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r48) {
        2WX r5;
        AnonymousClass3Y5 r46 = r48;
        0qQ.A0B(r46, 0);
        boolean z = this.A08;
        int i = R.attr.igds_color_primary_text;
        int i2 = R.attr.igds_color_link;
        int i3 = R.attr.textColorBoldLink;
        if (z) {
            i = R.attr.igds_color_primary_text_on_media;
            i2 = R.attr.igds_color_primary_text_on_media;
            i3 = R.attr.igds_color_primary_text_on_media;
        }
        UserSession userSession = this.A05;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36329680953229564L)) {
            AnonymousClass3XV r52 = 2WX.A02;
            0eP A1E = G9t.A1E(0.0f, 100.0f);
            r5 = r52.A00(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A00, C244513bJ.A00(new GPF(A1E), new Object[]{A1E}), 2));
        } else {
            r5 = null;
        }
        2WX r10 = this.A02;
        AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A1I, 0, Double.doubleToRawLongBits(3.0d));
        if (r10 == 2WX.A02) {
            r10 = null;
        }
        2WX A002 = C51971G9r.A0X(C51965G9l.A0X(r10, A0c), AnonymousClass05K.A0N, 100.0f, 0).A00(r5).A00(this.A03);
        C246853fL r45 = this.A07;
        SocialContextBubbleUiState socialContextBubbleUiState = this.A06;
        String str = socialContextBubbleUiState.A08;
        String str2 = str;
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        2WX A003 = A002.A00(r45.ApP(str3));
        C243573Zh r22 = C243573Zh.FLEX_START;
        C243583Zi r21 = C243583Zi.FLEX_START;
        2Wb A0Q = C51972G9s.A0Q(r46);
        GNY gny = this.A00;
        AnonymousClass0iw r1 = this.A04;
        2V1 r14 = A0Q.A00;
        Context context = r14.A0C;
        A0Q.A00(new C52288GMe((Animator) null, (C376459Ib) null, gny, (2V5) null, (2V5) null, (2V5) null, r1, userSession, (String) null, C51968G9o.A08(context, A0Q, R.attr.igds_color_photo_border), 3, 2, false, false, false));
        Integer num = AnonymousClass05K.A00;
        2WX A0R = C51972G9s.A0R(C51971G9r.A0Y((2WX) null, num, r22, 3), 0, C51970G9q.A0H());
        Integer num2 = AnonymousClass05K.A01;
        2WX A004 = C51971G9r.A0X(A0R, num2, 1.0f, 1).A00(r45.B57());
        I4F i4f = I4F.A00;
        0qQ.A07(context);
        SpannableStringBuilder A012 = i4f.A01(context, this.A01, userSession, socialContextBubbleUiState, r45, i2, i3);
        int A082 = C51968G9o.A08(context, A0Q, i);
        Typeface A032 = 0oh.A03(context, Typeface.DEFAULT, num);
        long A042 = C244013aV.A04(A0Q);
        long A072 = C244013aV.A07(A0Q);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r14, (2V5) null, A012, 0);
        C51973G9u.A17(A0Q, A0b, A082, A042);
        A0b.A0R(0);
        G9w.A12(A032, A0Q, A0b, A0D);
        A0b.A0W(num);
        C51973G9u.A1A(A0b, num2, 1.0f, false);
        A0b.A0M(2);
        A0b.A01.A00 = (float) C51968G9o.A09(A0Q, A072);
        A0b.A0b(true);
        A0b.A0Y(false);
        A0b.A0Z(false);
        A0b.A0D();
        G9t.A1M(A0Q, A004, A0b);
        if (this.A09) {
            if (str2 == null) {
                str2 = "";
            }
            String str4 = socialContextBubbleUiState.A07;
            if (str4 == null) {
                str4 = "";
            }
            A0Q.A00(new C53766Gtv(C51971G9r.A0Y((2WX) null, num, C243573Zh.CENTER, 3), str2, str4, new C58163InT(r45, 5), socialContextBubbleUiState.A0C));
        }
        return C243563Zg.A0I(A0Q, r46, A003, r22, r21);
    }
}
