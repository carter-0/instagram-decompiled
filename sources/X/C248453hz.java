package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.3hz  reason: invalid class name and case insensitive filesystem */
public final class C248453hz extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass3WV A01;
    public final AnonymousClass4DU A02;
    public final boolean A03;
    public final 2WX A04;
    public final AnonymousClass33C A05;
    public final C62320sa A06;

    public C248453hz(2WX r2, UserSession userSession, AnonymousClass33C r4, AnonymousClass3WV r5, AnonymousClass4DU r6, C62320sa r7, boolean z) {
        0qQ.A0B(r6, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(userSession, 5);
        0qQ.A0B(r4, 6);
        this.A06 = r7;
        this.A02 = r6;
        this.A01 = r5;
        this.A03 = z;
        this.A00 = userSession;
        this.A05 = r4;
        this.A04 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r63) {
        C248733iV r18;
        long A0C;
        long A0C2;
        2WX A002;
        C249273jQ r43;
        String str;
        long doubleToRawLongBits;
        C249273jQ r42;
        2WX r4;
        C249263jP r24;
        long doubleToRawLongBits2;
        C249263jP r242;
        AnonymousClass3Y5 r1 = r63;
        0qQ.A0B(r1, 0);
        C247453gM r0 = (C247453gM) this.A06.invoke();
        C243673Zt A003 = C243633Zp.A00(r1, C248713iT.A00);
        boolean z = r0.A0N;
        boolean z2 = r0.A0J;
        if (z || z2) {
            r18 = C248733iV.SANDWICH;
        } else {
            r18 = C248733iV.STANDARD;
        }
        2Wa A004 = C243643Zq.A00(r1, C248913in.A00);
        2Wa A005 = C243643Zq.A00(r1, C248983iu.A00);
        2V5 A006 = C247343gB.A00(r1, Float.valueOf(0.0f));
        Float valueOf = Float.valueOf(1.0f);
        2V5 A007 = C247343gB.A00(r1, valueOf);
        Float f = valueOf;
        2V5 A008 = C247343gB.A00(r1, f);
        2V5 A009 = C247343gB.A00(r1, f);
        2Wa A0010 = C243643Zq.A00(r1, C249013ix.A00);
        0sP A012 = AnonymousClass3j0.A01(r1, new AnonymousClass9MC(18, this, A0010, r0));
        C249123jA r8 = new C249123jA(A006, A007);
        C249183jG r7 = new C249183jG(A004, A005);
        UserSession userSession = this.A00;
        UserSession userSession2 = userSession;
        Object obj = C249213jJ.A00(r7, r8, userSession).A00;
        2WX r39 = 2WX.A02;
        Integer num = AnonymousClass05K.A1F;
        2WX r72 = new 2WX((2WX) null, new AnonymousClass9JS(A006, num));
        Integer num2 = AnonymousClass05K.A1I;
        2WX r3 = new 2WX(r72, new AnonymousClass9JS(A006, num2));
        Integer num3 = AnonymousClass05K.A00;
        2WX r82 = new 2WX(r3, new AnonymousClass9JS(A007, num3));
        C244413b9 r28 = C244413b9.ABSOLUTE;
        Integer num4 = AnonymousClass05K.A0Y;
        2WX r2 = new 2WX(r82, new AnonymousClass9JS(num4, r28, 3));
        C247003fc r17 = (C247003fc) AnonymousClass3Zw.A00(r1, new C377479Lz(46, A0010, this), new Object[]{A0010});
        C247433gK r243 = r0.A04;
        C248733iV r12 = C248733iV.SANDWICH;
        if (r18 != r12 || !r0.A05.A07) {
            A0C = C244013aV.A0C(r1, R.dimen.audience_selector_pill_layout_height);
        } else {
            A0C = Double.doubleToRawLongBits(65.0d);
        }
        Integer num5 = AnonymousClass05K.A0C;
        2WX r6 = null;
        2WX r13 = new 2WX((2WX) null, new AnonymousClass9JS(num5, false, 4));
        if (z) {
            A0C2 = C244013aV.A0C(r1, R.dimen.account_discovery_bottom_gap);
        } else {
            A0C2 = C244013aV.A0C(r1, R.dimen.abc_button_inset_vertical_material);
        }
        2WX r22 = new 2WX(new 2WX(new 2WX(r13, new AnonymousClass9JR(AnonymousClass05K.A0u, 0, A0C2)), new AnonymousClass9JR(num, 0, C244013aV.A0C(r1, R.dimen.abc_button_inset_vertical_material))), new AnonymousClass9JQ(num3, 100.0f, 0));
        AnonymousClass3ZH r59 = r0.A07;
        AnonymousClass4DU r32 = this.A02;
        AnonymousClass4DU r58 = r32;
        2WX A0011 = C244243as.A00(A003, C244223aq.A00((C238863Ds) null, r22, userSession2, r59, r32, (Integer) null, false, false), "onUfiVisible", new C377259Ld(r0, 3));
        boolean A0012 = C246383eV.A00(r59);
        AnonymousClass3WV r33 = this.A01;
        AnonymousClass3W1 r23 = r0.A09;
        C231592rv r48 = C231592rv.LITHO_MEDIA_UFI;
        2WX r45 = r39;
        UserSession userSession3 = userSession2;
        AnonymousClass3WV r47 = r33;
        AnonymousClass3ZH r49 = r59;
        AnonymousClass3W1 r50 = r23;
        if (A0012) {
            A002 = C244263au.A00(r45, userSession3, r47, r48, r49, r50, true);
        } else {
            A002 = C244263au.A00(r45, userSession3, r47, r48, r49, r50, false);
        }
        2WX A0013 = A0011.A00(A002);
        if (this.A03) {
            r6 = new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A0j, 4, 0));
        }
        2WX A0014 = A0013.A00(r6);
        Integer valueOf2 = Integer.valueOf(R.id.row_feed_view_group_buttons);
        Integer num6 = AnonymousClass05K.A0D;
        AnonymousClass9JS r34 = new AnonymousClass9JS(num6, valueOf2, 4);
        if (A0014 == r39) {
            A0014 = null;
        }
        2WX r14 = new 2WX(A0014, r34);
        Integer num7 = AnonymousClass05K.A0B;
        2WX r35 = new 2WX(r14, new AnonymousClass9JS(num7, valueOf2, 4));
        Integer num8 = AnonymousClass05K.A01;
        2WX A0015 = new 2WX(r35, new AnonymousClass9JR(num8, 0, A0C)).A00(this.A04);
        2V1 r25 = r1.A05;
        2V1 r55 = r25;
        2Wb r36 = new 2Wb(r25, new ArrayList());
        if (r18 == r12 && r0.A05.A07) {
            2WX r122 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num8, 1.0f, 1)), new AnonymousClass9JS(num4, r28, 3));
            long doubleToRawLongBits3 = Double.doubleToRawLongBits(0.0d);
            2WX r9 = new 2WX(new 2WX(new 2WX(new 2WX(r122, new AnonymousClass9JR(num2, 1, doubleToRawLongBits3)), new AnonymousClass9JR(num5, 1, Double.doubleToRawLongBits(5.0d))), new AnonymousClass9JR(num4, 1, doubleToRawLongBits3)), new AnonymousClass9JR(AnonymousClass05K.A0j, 0, Double.doubleToRawLongBits(30.0d)));
            C243583Zi r502 = C243583Zi.CENTER;
            2Wb r37 = new 2Wb(r36.A00, new ArrayList());
            r37.A00(A00(r37, r0));
            r36.A00(C243563Zg.A0H(r37, r36, r9, (C243573Zh) null, (C243573Zh) null, r502, (C244343b2) null, false));
        }
        2WX r26 = new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num8, 1.0f, 1)), new AnonymousClass9JS(num3, C243573Zh.FLEX_END, 3)), new AnonymousClass9JR(num8, 0, C244013aV.A0C(r36, R.dimen.audience_selector_pill_layout_height)));
        2Wb r27 = new 2Wb(r36.A00, new ArrayList());
        2WX r29 = new 2WX((2WX) null, new AnonymousClass9JQ(num8, 2.0f, 1));
        2V1 r210 = r27.A00;
        2V1 r57 = r210;
        2Wb r38 = new 2Wb(r210, new ArrayList());
        2Wb r211 = r38;
        r211.A00(new C249243jM(userSession2, r0, r58, A012, z));
        2V1 r310 = r211.A00;
        2Wb r212 = new 2Wb(r310, new ArrayList());
        String str2 = null;
        if (!r0.A0F) {
            r43 = null;
        } else {
            int A013 = r1.Bnf().A01(R.attr.glyphColorPrimary);
            2WX r132 = new 2WX(new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r1, 2131956343), 0)), new AnonymousClass9JS(num3, C243573Zh.STRETCH, 3)), new AnonymousClass9JS(A008, num)), new AnonymousClass9JS(A008, num2)), new AnonymousClass9JS(A009, num3));
            Integer valueOf3 = Integer.valueOf(R.id.row_feed_button_comment);
            2WX r10 = new 2WX(new 2WX(r132, new AnonymousClass9JS(num6, valueOf3, 4)), new AnonymousClass9JS(num7, valueOf3, 4));
            Context context = r55.A0C;
            0qQ.A07(context);
            C249263jP r44 = new C249263jP(ImageView.ScaleType.CENTER, C244243as.A00(A003, new 2WX(r10, new AnonymousClass9JS(num3, ((0sL) r0.A00.A01).invoke(context, r0.A06), 4)), "getCommentComponent", new AnonymousClass9M5(29, r0, r1)), (Integer) null, R.drawable.instagram_comment_pano_outline_24, A013);
            if (r0.A0Q) {
                str2 = r0.A0B;
            }
            r43 = new C249273jQ(r44, r39, (Integer) null, str2, new AnonymousClass9M5(27, this, r0), (0sP) null, (0sP) null, new AnonymousClass9M5(28, this, r0), R.dimen.account_discovery_bottom_gap, z);
        }
        r212.A00(r43);
        r38.A00(new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, r212.A01, false));
        2Wb r213 = new 2Wb(r310, new ArrayList());
        Object A0016 = AnonymousClass3Zw.A00(r1, C249283jR.A00, new Object[0]);
        Float f2 = valueOf;
        2V5 A0017 = C247343gB.A00(r1, f2);
        2V5 A0018 = C247343gB.A00(r1, f2);
        2Wa A0019 = C243643Zq.A00(r1, C249293jS.A00);
        Object obj2 = C249213jJ.A01(new C249303jT(A0017, A0018), userSession2).A00;
        if (!r0.A0M) {
            r42 = null;
        } else {
            int A014 = r1.Bnf().A01(R.attr.glyphColorPrimary);
            2WX r92 = new 2WX(new 2WX(new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(num3, C243573Zh.STRETCH, 3)), new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r1, 2131973092), 0)), new AnonymousClass9JS(num8, "android.widget.Button", 0)), new AnonymousClass9JS(A0017, num)), new AnonymousClass9JS(A0017, num2)), new AnonymousClass9JS(A0018, num3));
            Integer valueOf4 = Integer.valueOf(R.id.row_feed_button_share);
            2WX r311 = new 2WX(new 2WX(r92, new AnonymousClass9JS(num6, valueOf4, 4)), new AnonymousClass9JS(num7, valueOf4, 4));
            Context context2 = r55.A0C;
            0qQ.A07(context2);
            C249263jP r472 = new C249263jP(ImageView.ScaleType.CENTER, new 2WX(C244243as.A00(A003, new 2WX(r311, new AnonymousClass9JS(num3, ((0sL) r0.A00.A01).invoke(context2, r0.A06), 4)), "getShareComponent", new AnonymousClass9M5(34, r0, r1)), new C244253at(num5, new C377529Me(1, A0016, this, A0019, obj, obj2, A004, r0), (String) null)), (Integer) null, R.drawable.instagram_direct_pano_outline_24, A014);
            C243773a4.A00(r1, new C377539Mf(3, obj, obj2, this, A0010, A004, A0019, A0016), new Object[]{A0010});
            if (r0.A0S) {
                str = r0.A0D;
            } else {
                str = null;
            }
            0sP r15 = new AnonymousClass9M5(30, this, r0);
            0sP r142 = new AnonymousClass9M5(31, this, r0);
            0sP r133 = new AnonymousClass9M5(32, this, r0);
            0sP r123 = new AnonymousClass9M5(33, this, r0);
            if (z) {
                doubleToRawLongBits = C244013aV.A0C(r1, R.dimen.abc_button_inset_vertical_material);
            } else {
                doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
            }
            r42 = new C249273jQ(r472, new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A07, 0, doubleToRawLongBits)), (Integer) null, str, r15, r142, r133, r123, R.dimen.abc_button_inset_vertical_material, z);
        }
        r213.A00(r42);
        if (((Boolean) A004.A03).booleanValue()) {
            C247433gK r214 = r243;
            0qQ.A0B(r214, 0);
            if (r214 instanceof C247413gI) {
                long A0C3 = C244013aV.A0C(r213, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
                2Wb r312 = r213;
                r312.A00(new C53858GvP(r2, userSession2, r17, this.A05, (C247413gI) r243, r0, r58, new WeakReference(C61270mF.A00(C243803a8.A00(r213))), new C41557AwP(this), new C41558AwQ(this), A0C3));
            }
        }
        2Wb r215 = r38;
        r215.A00(new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, r213.A01, false));
        2Wb r40 = r27;
        r27.A00(C243563Zg.A0H(r215, r40, r29, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, false));
        if (r18 == C248733iV.STANDARD) {
            2WX r313 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(num4, r28, 3)), new AnonymousClass9JR(num8, 1, 9221401712017801216L));
            C243583Zi r442 = C243583Zi.CENTER;
            2Wb r46 = new 2Wb(r57, new ArrayList());
            r46.A00(A00(r46, r0));
            r27.A00(C243563Zg.A0H(r46, r40, r313, (C243573Zh) null, (C243573Zh) null, r442, (C244343b2) null, false));
        }
        C243583Zi r172 = C243583Zi.FLEX_END;
        2WX r93 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num8, 1.0f, 1)), new AnonymousClass9JR(num8, 0, C244013aV.A0C(r27, R.dimen.audience_selector_pill_layout_height)));
        2Wb r216 = new 2Wb(r57, new ArrayList());
        if (r0.A0P) {
            if (!r0.A0K) {
                r242 = null;
            } else {
                2WX r124 = new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(num3, 0, Double.doubleToRawLongBits(24.0d))), new AnonymousClass9JQ(num5, 0.0f, 1)), new AnonymousClass9JS(num3, C243573Zh.STRETCH, 3)), new AnonymousClass9JS(num8, "android.widget.Button", 0));
                Context context3 = r216.Aqq().A0C;
                0qQ.A07(context3);
                2WX r102 = new 2WX(r124, new AnonymousClass9JS(num3, ((0sL) r0.A00.A01).invoke(context3, r0.A06), 4));
                if (z) {
                    doubleToRawLongBits2 = C244013aV.A09(r216);
                } else {
                    doubleToRawLongBits2 = Double.doubleToRawLongBits(0.0d);
                }
                r242 = new C249263jP(ImageView.ScaleType.CENTER, new 2WX(new 2WX(r102, new AnonymousClass9JR(AnonymousClass05K.A07, 0, doubleToRawLongBits2)), new AnonymousClass9JS(num, new J6H(r0, 41), 4)), Integer.valueOf(C244013aV.A01(r216, R.attr.feedSaveActiveColor)), R.drawable.instagram_visual_search_pano_outline_24, C244013aV.A01(r216, R.attr.glyphColorPrimary));
            }
            r216.A00(r242);
        }
        if (!r0.A0K) {
            r24 = null;
        } else {
            2WX r134 = new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(num3, 0, C244013aV.A0C(r216, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size))), new AnonymousClass9JS(num3, C243573Zh.STRETCH, 3));
            boolean z3 = r0.A0L;
            int i = 2131952388;
            if (z3) {
                i = 2131972043;
            }
            2WX r83 = new 2WX(new 2WX(new 2WX(r134, new AnonymousClass9JS(AnonymousClass05K.A0N, C244013aV.A0E(r216, i), 0)), new AnonymousClass9JS(num8, "android.widget.Button", 0)), new AnonymousClass9JS(AnonymousClass05K.A06, Boolean.valueOf(z3), 4));
            Context context4 = r216.Aqq().A0C;
            0qQ.A07(context4);
            2WX r84 = new 2WX(C244223aq.A00(C238863Ds.SAVE_BUTTON, new 2WX(new 2WX(r83, new AnonymousClass9JS(num3, ((0sL) r0.A00.A01).invoke(context4, r0.A06), 4)), new AnonymousClass9JS(num7, Integer.valueOf(R.id.row_feed_button_save), 4)), userSession2, r59, r58, (Integer) null, false, false), new AnonymousClass9JS(num, new C377259Ld(r0, 5), 4));
            if (!r0.A0H) {
                r4 = new 2WX(r84, new AnonymousClass9JS(AnonymousClass05K.A03, new C377259Ld(r0, 4), 4));
            } else {
                r4 = r84;
            }
            r24 = new C249263jP(ImageView.ScaleType.CENTER, r4, Integer.valueOf(C244013aV.A01(r216, R.attr.feedSaveActiveColor)), R.drawable.ufi_save_icon, C244013aV.A01(r216, R.attr.glyphColorPrimary));
        }
        r216.A00(r24);
        2Wb r135 = r27;
        r135.A00(C243563Zg.A0H(r216, r135, r93, (C243573Zh) null, (C243573Zh) null, r172, (C244343b2) null, false));
        2Wb r73 = r36;
        r73.A00(C243563Zg.A0H(r135, r73, r26, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, false));
        2Tp A0H = C243563Zg.A0H(r73, r1, A0015, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, false);
        C247273g4 r217 = r0.A08;
        if (!r217.A04 || !r0.A0O) {
            return A0H;
        }
        return new C53655Gs8(A0H, r217);
    }

    public static final C277184ud A00(C70832Wc r8, C247453gM r9) {
        Integer num;
        C247113fn r1 = r9.A05;
        Integer num2 = null;
        if (!r1.A07) {
            return null;
        }
        AnonymousClass3ZH r2 = r9.A07;
        AnonymousClass3W1 r3 = r9.A09;
        int i = r1.A00;
        boolean z = r1.A06;
        Integer num3 = r1.A02.A00;
        if (num3 != null) {
            num = Integer.valueOf(C244013aV.A02(r8, num3.intValue()));
        } else {
            num = null;
        }
        Integer num4 = r1.A03.A00;
        if (num4 != null) {
            num2 = Integer.valueOf(C244013aV.A02(r8, num4.intValue()));
        }
        return new C277184ud(r1, r2, r3, num, num2, i, z);
    }
}
