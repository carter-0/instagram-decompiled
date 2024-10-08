package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GtM  reason: case insensitive filesystem */
public final class C53731GtM extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass4Fs A01;
    public final AnonymousClass3W1 A02;
    public final 2WX A03;

    public final C251263mp A0X(AnonymousClass3Y5 r28) {
        2WX r0;
        AnonymousClass3Y5 r6 = r28;
        0qQ.A0B(r6, 0);
        2Wa A002 = C243643Zq.A00(r6, new C58684Ivt(this, 1));
        AnonymousClass3W1 r2 = this.A02;
        C243773a4.A00(r6, new C58187Inr(26, this, A002), new Object[]{r2});
        Object A003 = AnonymousClass3Zw.A00(r6, new C58684Ivt(r6, 0), C51966G9m.A1b());
        Object obj = A002.A03;
        AnonymousClass4F7.A01(r6, new J6H(A002, 13), new Object[]{obj});
        C243673Zt A004 = C243633Zp.A00(r6, C58394IrD.A00);
        2WX r5 = this.A03;
        2Tl r15 = null;
        2Wb A0S = AnonymousClass7TG.A0S(r6.A05);
        C61072JwA jwA = (C61072JwA) obj;
        int A0M = AnonymousClass7TE.A0M(jwA.A02);
        if (A0M == 0) {
            2WX r8 = 2WX.A02;
            if (r2.A23) {
                r0 = C51971G9r.A0Z(C51965G9l.A0X((2WX) null, new C244253at(AnonymousClass05K.A00, J6S.A00(A002, A004, 17), (String) null)), AnonymousClass05K.A01, new J6H(A004, 14), (String) null);
            } else {
                r0 = r8;
            }
            2WX A005 = r8.A00(r0);
            2V1 r13 = A0S.A00;
            C243543Ze r02 = new C243543Ze(r13, C243533Zd.LOCAL, "carousel_page_indicator");
            if (A005 == r8) {
                A005 = null;
            }
            2WX A0Q = C51973G9u.A0Q(C51971G9r.A0Y(C51971G9r.A0Y(C51965G9l.A0X(A005, r02), AnonymousClass05K.A00, A003, 4), AnonymousClass05K.A0j, 4, 0), C51967G9n.A0S(0, C244013aV.A0C(A0S, R.dimen.album_music_sticker_text_vertical_padding)), 0, C244013aV.A0C(A0S, R.dimen.media_tag_indicator_padding));
            2Wb A0S2 = AnonymousClass7TG.A0S(r13);
            int i = jwA.A01;
            AnonymousClass4Fs r132 = this.A01;
            boolean z = r132.A06;
            boolean z2 = r132.A05;
            int i2 = r132.A00;
            int i3 = r132.A03;
            if (!C247023fe.A01(this.A00, i2, i3, z, z2)) {
                i3 = r132.A01;
            }
            SpannableStringBuilder A0E = C51965G9l.A0E();
            A0E.append(StringFormatUtil.formatStrLocaleSafe("%d/%d", Integer.valueOf(i + 1), Integer.valueOf(i3)));
            C51971G9r.A0y(A0E, new CharacterStyle(), 0);
            r15 = C51967G9n.A0N(new C244473bF((TextUtils.TruncateAt) null, (MovementMethod) null, C51973G9u.A0N(C244063aa.CAROUSEL_INDEX_INDICATOR, C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0B, Integer.valueOf(R.id.carousel_index_indicator_text_view), 4)), C51965G9l.A0e(C244013aV.A08(A0S2)), C244473bF.A0C, (Boolean) null, A0E, (Float) null, Integer.valueOf(C244013aV.A01(A0S2, R.attr.igds_color_primary_text_on_media)), 1, (Integer) null, (Integer) null), A0S2, A0S, A0Q);
        } else if (A0M != 1) {
            throw AnonymousClass7TE.A1K();
        }
        return C51967G9n.A0Q(r15, A0S, r6, r5);
    }

    public C53731GtM(2WX r1, UserSession userSession, AnonymousClass4Fs r3, AnonymousClass3W1 r4) {
        AnonymousClass7TG.A1U(userSession, r4, r3);
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r1;
    }
}
