package X;

import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.Gvf  reason: case insensitive filesystem */
public final class C53874Gvf extends C251343mx {
    public final int A00;
    public final 2WX A01;
    public final MidCardClipsClickedAction A02;
    public final JSG A03;
    public final MidCardLayoutType A04;
    public final C59619JQn A05;
    public final String A06;
    public final C62320sa A07;
    public final C62320sa A08;
    public final boolean A09;
    public final int A0A;
    public final int A0B;
    public final AnonymousClass0iw A0C;
    public final ImageUrl A0D;
    public final String A0E;
    public final String A0F;
    public final HashMap A0G;
    public final AnonymousClass0Ud A0H;

    public C53874Gvf(2WX r2, MidCardClipsClickedAction midCardClipsClickedAction, JSG jsg, MidCardLayoutType midCardLayoutType, AnonymousClass0iw r6, ImageUrl imageUrl, C59619JQn jQn, String str, String str2, String str3, HashMap hashMap, C62320sa r13, C62320sa r14, AnonymousClass0Ud r15, int i, int i2, int i3, boolean z) {
        C51969G9p.A1P(r6, 1, midCardLayoutType);
        C51969G9p.A1S(hashMap, 15, str3);
        this.A0C = r6;
        this.A06 = str;
        this.A0H = r15;
        this.A0E = str2;
        this.A01 = r2;
        this.A00 = i;
        this.A0B = i2;
        this.A09 = z;
        this.A05 = jQn;
        this.A02 = midCardClipsClickedAction;
        this.A03 = jsg;
        this.A08 = r13;
        this.A07 = r14;
        this.A04 = midCardLayoutType;
        this.A0G = hashMap;
        this.A0A = i3;
        this.A0F = str3;
        this.A0D = imageUrl;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        AnonymousClass3Y5 r31 = r33;
        0qQ.A0B(r31, 0);
        MidCardLayoutType midCardLayoutType = this.A04;
        MidCardLayoutType midCardLayoutType2 = MidCardLayoutType.GRID;
        int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (midCardLayoutType == midCardLayoutType2) {
            i = R.dimen.account_discovery_bottom_gap;
        }
        C243583Zi r22 = C243583Zi.FLEX_END;
        2WX r1 = this.A01;
        AnonymousClass3XV r0 = 2WX.A02;
        2V1 r7 = r31.A05;
        0qQ.A0B(r7, 0);
        2Ts r9 = new 2Ts();
        AnonymousClass2V4 r11 = r7.A0D;
        C244143ai r6 = C244143ai.ALL;
        if (r11 != null) {
            r9.A01(r6, 1);
            r9.A00(r6, C51972G9s.A0A(r7.A0C, r31, R.attr.igds_color_photo_border));
            int i2 = this.A00;
            Arrays.fill(r9.A00, 0, 4, (float) r11.A03(i2));
            2WX A002 = r1.A00(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A01, r9, 3));
            2Wb A0S = AnonymousClass7TG.A0S(r7);
            HashMap hashMap = this.A0G;
            int i3 = this.A0A;
            String str = this.A0F;
            AnonymousClass0iw r13 = this.A0C;
            int A0D2 = C51972G9s.A0D(A0S, i2);
            A0S.A00(new C53978GxM(C51972G9s.A0V((2WX) null, new J6L(this, 1)).A00(r1), r13, this.A0D, str, hashMap, i3, A0D2));
            2V1 Aqq = A0S.Aqq();
            GOI A003 = GOJ.A00(Aqq);
            A003.A00.A02 = r22;
            C244413b9 r62 = C244413b9.ABSOLUTE;
            A003.A08(r62);
            C244143ai r112 = C244143ai.BOTTOM;
            A003.A07(r112, A003.A02.A00(0.0f));
            C244123ag.A00(A003, r1);
            GOI A004 = GOJ.A00(Aqq);
            A004.A08(r62);
            A004.A07(r112, A004.A02.A00(0.0f));
            A004.A03();
            A004.A00.A0Z().A08(39.0f);
            A004.A0A(new C53972GxG(r1, 0sr.A1P(new Integer[]{Integer.valueOf(R.color.fds_transparent), Integer.valueOf(R.color.black_15_transparent), Integer.valueOf(R.color.black_40_transparent), Integer.valueOf(R.color.black_60_transparent)}), C51972G9s.A0D(A0S, i2), false));
            A003.A0A(A004.A00);
            A0S.A00(A003.A00);
            Integer num = AnonymousClass05K.A00;
            2WX A0Y = C51971G9r.A0Y(C51971G9r.A0X((2WX) null, num, 100.0f, 0), AnonymousClass05K.A0Y, r62, 3);
            2Wb A0w = G9t.A0w(A0S);
            AnonymousClass0Ud r3 = this.A0H;
            if (r3 != null) {
                long A0C2 = C244013aV.A0C(A0w, i);
                2WX A0E2 = C51974G9v.A0E((2WX) null, C51967G9n.A0S(0, A0C2), 0, C244013aV.A03(A0w));
                2Wb A0w2 = G9t.A0w(A0w);
                int A0E3 = 2Yu.A0E(A0w2.A00.A0C);
                int i4 = this.A0B;
                C51971G9r.A1F(new GZ8(C51971G9r.A0X((2WX) null, num, 100.0f, 0), this.A07, r3, R.drawable.clips_viewer_multi_media_card_cta_background, A0E3, i4, 104), A0w2, A0w, A0E2);
            }
            String str2 = this.A0E;
            if (str2 != null) {
                C243573Zh r17 = C243573Zh.FLEX_START;
                long A0C3 = C244013aV.A0C(A0w, i);
                2WX A0E4 = C51974G9v.A0E((2WX) null, C51967G9n.A0S(0, A0C3), 0, C244013aV.A0C(A0w, i));
                2Wb A0w3 = G9t.A0w(A0w);
                2V1 r15 = A0w3.A00;
                int A0C4 = C51971G9r.A0C(r15, A0w3);
                long A062 = C244013aV.A06(A0w3);
                int A022 = A0w3.Bnf().A02(R.color.black_30_transparent);
                long A0C5 = C244013aV.A0C(A0w3, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                Typeface typeface = Typeface.DEFAULT;
                long A0D3 = C51969G9p.A0D();
                C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, str2, 0);
                C51973G9u.A17(A0w3, A0b, A0C4, A062);
                G9w.A1F(A0w3, A0b, 2Wd.A00(G9t.A15(typeface, A0w3, A0b, 0, A022), A0C5), A0D3);
                C51974G9v.A19(A0b, num, false);
                A0b.A0M(1);
                C51974G9v.A0y(A0w3, A0b, false);
                A0w.A00(C243563Zg.A07(A0w3, A0w, A0E4, r17, (C243583Zi) null));
            }
            C51967G9n.A1F(A0w, A0S, A0Y);
            return C243563Zg.A08(A0S, r31, A002, r22);
        }
        throw AnonymousClass7TE.A0z("This builder has already been disposed / built!");
    }
}
