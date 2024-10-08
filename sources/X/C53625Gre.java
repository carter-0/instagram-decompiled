package X;

import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Gre  reason: case insensitive filesystem */
public final class C53625Gre extends C251343mx {
    public final C251263mp A0X(AnonymousClass3Y5 r25) {
        AnonymousClass3Y5 r0 = r25;
        0qQ.A0B(r0, 0);
        C243583Zi r21 = C243583Zi.CENTER;
        C243573Zh r20 = C243573Zh.CENTER;
        2Wb A0S = AnonymousClass7TG.A0S(r0.A05);
        AnonymousClass3XV r1 = 2WX.A02;
        long A06 = C244013aV.A06(A0S);
        Integer num = AnonymousClass05K.A1I;
        C51974G9v.A0g(C244013aV.A0D(A0S, R.drawable.instagram_icons_exceptions_illo_blend_refresh_outline_96), ImageView.ScaleType.CENTER_CROP, A0S.A00, A0S, C51974G9v.A0I(AnonymousClass9JR.A00((2WX) null, num, 0, A06), C51965G9l.A0c(AnonymousClass05K.A00, 0, C244013aV.A0C(A0S, R.dimen.blend_endcard_hero_image_size)), A0S, R.dimen.blend_endcard_hero_image_size));
        String A0E = C244013aV.A0E(A0S, 2131955296);
        Integer valueOf = Integer.valueOf(A0S.Bnf().A01(R.attr.igds_color_primary_text_on_media));
        2WX A0V = C51973G9u.A0V((2WX) null, A0S, num, 0);
        C56970IJo iJo = C56970IJo.A00;
        C243983aS r4 = C243983aS.A00;
        A0S.A00(new C244473bF((TextUtils.TruncateAt) null, (MovementMethod) null, A0V, (2Wd) null, new 2WU(r4, iJo, 3, true), (Boolean) null, A0E, (Float) null, valueOf, (Integer) null, (Integer) null, (Integer) null));
        String A0E2 = C244013aV.A0E(A0S, 2131955295);
        int A01 = A0S.Bnf().A01(R.attr.igds_color_secondary_text_on_media);
        A0S.A00(new C244473bF((TextUtils.TruncateAt) null, (MovementMethod) null, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A04, 0, C244013aV.A0C(A0S, R.dimen.abc_dropdownitem_icon_width)), (2Wd) null, new 2WU(r4, C56971IJp.A00, 3, true), (Boolean) null, A0E2, (Float) null, Integer.valueOf(A01), (Integer) null, (Integer) null, 17));
        return new 2Tl((C243573Zh) null, r20, r21, A0S.A01, false);
    }
}
