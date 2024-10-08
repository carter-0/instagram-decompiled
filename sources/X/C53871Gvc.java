package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gvc  reason: case insensitive filesystem */
public final class C53871Gvc extends C251343mx {
    public final C53601GrG A00;
    public final JT5 A01;
    public final String A02;
    public final boolean A03;
    public final float A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C59619JQn A07;
    public final HashMap A08;
    public final HashMap A09;
    public final List A0A;
    public final List A0B;

    public final C251263mp A0X(AnonymousClass3Y5 r39) {
        JT5 jt5;
        ImageUrl imageUrl;
        1Xj A0u;
        JT5 jt52;
        AnonymousClass3Y5 r12 = r39;
        0qQ.A0B(r12, 0);
        2Wa A002 = C243643Zq.A00(r12, C58711IwK.A00(this, 3));
        C55677Hla hla = (C55677Hla) AnonymousClass3Zw.A00(r12, C58665Iva.A00, new Object[0]);
        Number number = (Number) A002.A03;
        int intValue = number.intValue();
        boolean z = this.A03;
        boolean z2 = z;
        C53601GrG grG = this.A00;
        if (!z) {
            List list = grG.A06;
            if (!(intValue >= list.size() || (A0u = C51966G9m.A0u(list, intValue)) == null || (jt52 = this.A01) == null)) {
                jt52.FJY(A0u, this.A02, intValue);
            }
        } else if (intValue < grG.A00 && (jt5 = this.A01) != null) {
            jt5.FJZ(intValue);
        }
        AnonymousClass3XV r2 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0));
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
        2Wb A0Q = C51972G9s.A0Q(r12);
        int intValue2 = number.intValue();
        List list2 = grG.A05;
        if (!((list2 == null || (imageUrl = (ImageUrl) 00k.A0O(list2, intValue2)) == null) && (imageUrl = grG.A02) == null)) {
            AnonymousClass0iw r10 = this.A05;
            TransitionDrawable transitionDrawable = new TransitionDrawable(new ColorDrawable[]{C51965G9l.A0D(C244013aV.A02(A0Q, R.color.cds_white_a20)), C51965G9l.A0D(C244013aV.A02(A0Q, R.color.fds_transparent))});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(200);
            A0Q.A00(new GZ4(G9t.A10((2WX) null, num, transitionDrawable), r10, imageUrl));
        }
        2WX A003 = AnonymousClass9JR.A00(C51974G9v.A0O((2WX) null, num, num2, 100.0f, 0), AnonymousClass05K.A08, 0, C51969G9p.A0G((int) (((float) C51972G9s.A0D(A0Q, R.dimen.barcelona_countdown_sticker_digit_background_height)) + this.A04)));
        2Wb A0w = G9t.A0w(A0Q);
        A0w.A00(new GZ5(C51974G9v.A0C((2WX) null, C51965G9l.A0b(num2, 1.0f, 1), 0.0f), grG.A04, grG.A03, 1.0f, 1.0f, R.attr.igds_color_primary_text_on_media, R.attr.igds_color_secondary_text_on_media, 0, R.dimen.abc_button_padding_horizontal_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, 58940, 0, false));
        2WX A0S = C51973G9u.A0S((2WX) null, C51965G9l.A0b(num, 100.0f, 0), num2, 1.0f, 1);
        2Wb A0w2 = G9t.A0w(A0w);
        UserSession userSession = this.A06;
        AnonymousClass0iw r21 = this.A05;
        C61054Jvs jvs = grG.A01;
        C59619JQn jQn = this.A07;
        HashMap hashMap = this.A08;
        HashMap hashMap2 = this.A09;
        List list3 = this.A0A;
        List list4 = this.A0B;
        long A0C = C244013aV.A0C(A0w2, R.dimen.clips_mega_card_center_video_width);
        long A0C2 = C244013aV.A0C(A0w2, R.dimen.clips_mega_card_center_video_height);
        C61054Jvs jvs2 = jvs;
        C51971G9r.A1F(new C53988GxW(jvs2, AnonymousClass9JR.A00(C51971G9r.A0X(C51971G9r.A0X((2WX) null, num, 100.0f, 0), num2, 90.0f, 0), AnonymousClass05K.A0j, 0, C244013aV.A0C(A0w2, R.dimen.clips_mega_card_center_video_height)), r21, userSession, jQn, hla, this.A02, hashMap, hashMap2, list3, list4, J6Q.A00(A002, hla, 30), number.intValue(), A0C, A0C2, z2), A0w2, A0w, A0S);
        A0Q.A00(C243563Zg.A01(A0w, A0Q, A003));
        return C243563Zg.A01(A0Q, r12, A0X2);
    }

    public C53871Gvc(AnonymousClass0iw r2, UserSession userSession, C59619JQn jQn, C53601GrG grG, JT5 jt5, String str, HashMap hashMap, HashMap hashMap2, List list, List list2, float f, boolean z) {
        AnonymousClass7TG.A1O(r2, userSession);
        C51974G9v.A1N(jQn, hashMap, hashMap2);
        0qQ.A0B(str, 12);
        this.A05 = r2;
        this.A06 = userSession;
        this.A03 = z;
        this.A00 = grG;
        this.A07 = jQn;
        this.A08 = hashMap;
        this.A09 = hashMap2;
        this.A0A = list;
        this.A0B = list2;
        this.A04 = f;
        this.A01 = jt5;
        this.A02 = str;
    }
}
