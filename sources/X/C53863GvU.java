package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;

/* renamed from: X.GvU  reason: case insensitive filesystem */
public final class C53863GvU extends C251343mx {
    public final C267324bN A00;
    public final AnonymousClass0iw A01;
    public final GC5 A02;
    public final 2V5 A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final JTB A06;
    public final JQX A07;
    public final HashMap A08;
    public final HashMap A09;
    public final boolean A0A;

    public final C251263mp A0X(AnonymousClass3Y5 r32) {
        String str;
        String str2;
        GYW gyw;
        AnonymousClass3Y5 r6 = r32;
        0qQ.A0B(r6, 0);
        C267324bN r7 = this.A00;
        C267334bO r4 = r7.A0G;
        0qQ.A0C(r4, "null cannot be cast to non-null type com.instagram.clips.model.QPMidcardImpressionItem");
        AnonymousClass4UC r0 = ((C57029ILv) r4).A00;
        AnonymousClass4UC r30 = r0;
        if (0qQ.A0K(r0.A09.A00, "instagram_reels_video_midcard")) {
            UserSession userSession = this.A05;
            AnonymousClass0iw r9 = this.A01;
            GC5 gc5 = this.A02;
            JTB jtb = this.A06;
            HashMap hashMap = this.A09;
            HashMap hashMap2 = this.A08;
            return new C53864GvV(this.A03, r7, this.A04, r9, userSession, jtb, gc5, this.A07, hashMap, hashMap2, this.A0A);
        }
        0qQ.A0C(r4, "null cannot be cast to non-null type com.instagram.clips.model.QPMidcardImpressionItem");
        AnonymousClass4V7 r1 = r30.A08;
        AnonymousClass4V8 r8 = r1.A09;
        C283845Jo r02 = r1.A03;
        if (r02 != null) {
            str = DbZ.A0n(r02);
        } else {
            str = "";
        }
        C283905Ju r12 = r1.A07;
        AnonymousClass4VG r03 = r1.A01;
        if (r03 != null) {
            str2 = DbZ.A0n(r03.A00);
        } else {
            str2 = null;
        }
        if (r12 != null) {
            AnonymousClass3XV r04 = 2WX.A02;
            gyw = new GYW(ImageView.ScaleType.CENTER_CROP, C51974G9v.A0I(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0Y, C244413b9.RELATIVE, 3), C51965G9l.A0c(AnonymousClass05K.A00, 0, C244013aV.A0C(r6, R.dimen.abc_list_item_height_large_material)), r6, R.dimen.abc_list_item_height_large_material), this.A01, r12.A00, (ImageUrl) null, (C240963Ni) null, (C226632hb) null, (String) null, 3, false, false);
        } else {
            gyw = null;
        }
        AnonymousClass3XV r05 = 2WX.A02;
        long A032 = C244013aV.A03(r6);
        long A062 = C244013aV.A06(r6);
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A08, 0, A032);
        Integer num = AnonymousClass05K.A0A;
        2WX A003 = AnonymousClass9JR.A00(A002, num, 0, A062);
        long A033 = C244013aV.A03(r6);
        Integer num2 = AnonymousClass05K.A04;
        2WX A004 = AnonymousClass9JR.A00(A003, num2, 0, A033);
        String A0n = DbZ.A0n(r8);
        Integer num3 = AnonymousClass05K.A0N;
        2WX A0Y = C51971G9r.A0Y(A004, num3, A0n, 0);
        Integer num4 = AnonymousClass05K.A0C;
        long A0C = C244013aV.A0C(r6, R.dimen.avatar_search_sticker_tray_text_size);
        2V1 r92 = r6.A05;
        Context context = r92.A0C;
        Context context2 = context;
        int A092 = C51972G9s.A09(context, r6);
        String A0n2 = DbZ.A0n(r8);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num5 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r92, (2V5) null, A0n2, 0);
        C51973G9u.A16(r6, A0b, A092, A0C);
        A0b.A0R(0);
        G9w.A11(typeface, r6, A0b, A0D);
        C51970G9q.A1K(A0b, num4, num5);
        C51970G9q.A1I(A0b, 1.09f, false);
        A0b.A0M(2);
        C51974G9v.A0z(A0Y, A0b, false);
        2WW A0A2 = A0b.A0A();
        2WX A0T = C51973G9u.A0T(AnonymousClass9JR.A00((2WX) null, num, 0, C244013aV.A03(r6)), C51965G9l.A0c(num2, 0, C244013aV.A03(r6)), num3, str, 0);
        int A093 = C51972G9s.A09(context2, r6);
        long A042 = C244013aV.A04(r6);
        C244103ae A0b2 = C51971G9r.A0b(r92, (2V5) null, str, 0);
        C51973G9u.A16(r6, A0b2, A093, A042);
        A0b2.A0R(0);
        G9w.A11(typeface, r6, A0b2, A0D);
        A0b2.A0W(num4);
        C51973G9u.A1A(A0b2, num5, 1.09f, false);
        A0b2.A0M(3);
        C51974G9v.A0z(A0T, A0b2, false);
        2WW A0A3 = A0b2.A0A();
        Integer num6 = AnonymousClass05K.A01;
        2WX A0Y2 = C51971G9r.A0Y((2WX) null, num6, "android.widget.Button", 0);
        if (str2 != null) {
            A0Y2 = C51971G9r.A0Y(A0Y2, num3, str2, 0);
        }
        2WX A0Y3 = C51971G9r.A0Y(C51973G9u.A0Q(A0Y2, C51970G9q.A0c(r6, num2, R.dimen.ad4ad_button_bottom_margin, 0), 0, C244013aV.A09(r6)), num5, C244013aV.A0D(r6, R.drawable.rounded_gray_button), 4);
        J6Q A005 = J6Q.A00(r30, this, 14);
        Integer num7 = AnonymousClass05K.A1F;
        2WX A0Y4 = C51971G9r.A0Y(A0Y3, num7, A005, 4);
        int A094 = C51972G9s.A09(context2, r6);
        long A0C2 = C244013aV.A0C(r6, R.dimen.button_text_size);
        C244103ae A0b3 = C51971G9r.A0b(r92, (2V5) null, str2, 0);
        C51973G9u.A16(r6, A0b3, A094, A0C2);
        A0b3.A0R(1);
        G9w.A11(typeface, r6, A0b3, A0D);
        A0b3.A0W(num4);
        C51974G9v.A13(A0b3, num4, 1.09f);
        2WW A0c = C51971G9r.A0c((AnonymousClass2VW) null, A0Y4, A0b3);
        2WX A0Y5 = C51971G9r.A0Y(C51973G9u.A0Y(AnonymousClass9JR.A00(C51971G9r.A0Y((2WX) null, num6, "android.widget.Button", 0), AnonymousClass05K.A06, 0, C244013aV.A06(r6)), num6, true), num7, J6Q.A00(r30, this, 13), 4);
        int A0A4 = C51972G9s.A0A(context2, r6, R.attr.igds_color_secondary_text_on_media);
        long A0C3 = C244013aV.A0C(r6, R.dimen.button_text_size);
        C244103ae A0b4 = C51971G9r.A0b(r92, (2V5) null, "Hide", 0);
        C51973G9u.A16(r6, A0b4, A0A4, A0C3);
        A0b4.A0R(0);
        G9w.A11(typeface, r6, A0b4, A0D);
        A0b4.A0W(num5);
        A0b4.A0C();
        A0b4.A0X(num5);
        C51970G9q.A1I(A0b4, 1.0f, false);
        A0b4.A0E();
        C51973G9u.A19(A0Y5, A0b4, false);
        2WW A0A5 = A0b4.A0A();
        2WX A0O = C51974G9v.A0O((2WX) null, num5, num6, 100.0f, 0);
        2Wb A0S = AnonymousClass7TG.A0S(r92);
        2WX A0X = C51971G9r.A0X((2WX) null, num6, 1.0f, 1);
        2V1 r11 = A0S.A00;
        2Wb A0J = C51973G9u.A0J(gyw, A0A2, r11);
        A0J.A00(A0A3);
        C51971G9r.A1F(A0c, A0J, A0S, A0X);
        A0S.A00(C243563Zg.A01(G9t.A0v(A0A5, r11), A0S, AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, 0, C244013aV.A03(A0S)), num, 0, C244013aV.A03(A0S))));
        return C243563Zg.A05(A0S, r6, A0O);
    }

    public C53863GvU(2V5 r2, C267324bN r3, C52058GDe gDe, AnonymousClass0iw r5, UserSession userSession, JTB jtb, GC5 gc5, JQX jqx, HashMap hashMap, HashMap hashMap2, boolean z) {
        AnonymousClass7TG.A1U(r3, userSession, r5);
        0qQ.A0B(hashMap, 6);
        C51973G9u.A0u(7, hashMap2, gDe, r2);
        this.A00 = r3;
        this.A05 = userSession;
        this.A01 = r5;
        this.A02 = gc5;
        this.A06 = jtb;
        this.A09 = hashMap;
        this.A08 = hashMap2;
        this.A07 = jqx;
        this.A04 = gDe;
        this.A03 = r2;
        this.A0A = z;
    }
}
