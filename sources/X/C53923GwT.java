package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.GwT  reason: case insensitive filesystem */
public final class C53923GwT extends C251343mx {
    public final 2WX A00;
    public final GEG A01;
    public final ClipsViewerConfig A02;
    public final C267324bN A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final AnonymousClass3NK A06 = new C54310H7f(this, 10);
    public final AnonymousClass4DU A07;
    public final User A08;
    public final JTB A09;
    public final C52046GCs A0A;
    public final boolean A0B;
    public final float A0C;
    public final AnonymousClass0iw A0D;
    public final boolean A0E;

    public C53923GwT(2WX r3, GEG geg, ClipsViewerConfig clipsViewerConfig, C267324bN r6, C52058GDe gDe, AnonymousClass0iw r8, UserSession userSession, AnonymousClass4DU r10, User user, JTB jtb, C52046GCs gCs, float f, boolean z, boolean z2) {
        C51974G9v.A0d(2, geg, r8, gDe, r10);
        AnonymousClass7TF.A1G(jtb, 8, clipsViewerConfig);
        0qQ.A0B(gCs, 10);
        this.A03 = r6;
        this.A01 = geg;
        this.A05 = userSession;
        this.A0D = r8;
        this.A04 = gDe;
        this.A07 = r10;
        this.A08 = user;
        this.A09 = jtb;
        this.A02 = clipsViewerConfig;
        this.A0A = gCs;
        this.A0B = z;
        this.A0E = z2;
        this.A00 = r3;
        this.A0C = f;
    }

    private final C244443bC A00(C70832Wc r21) {
        C54319H7o h7o = new C54319H7o(this, 0);
        AnonymousClass3XV r0 = 2WX.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(44.0d);
        Integer num = AnonymousClass05K.A00;
        2WX A0z = G9t.A0z(C51974G9v.A0M((2WX) null, num, 0, doubleToRawLongBits), num, C243573Zh.CENTER);
        User user = this.A08;
        C70832Wc r2 = r21;
        2WX A0Y = C51971G9r.A0Y(A0z, AnonymousClass05K.A0N, C244013aV.A0F(r2, user.getUsername(), 2131970055), 0);
        C267324bN r1 = this.A03;
        AnonymousClass4DU r6 = this.A07;
        C267324bN r16 = r1;
        return new C244443bC(C51973G9u.A0N(C244063aa.PROFILE_IMAGE, C51971G9r.A0Y(C51971G9r.A0X(C51971G9r.A0Y(GFM.A02(C238863Ds.PAGE_PROFILE_PIC, A0Y, r16, this.A05, r6, true), AnonymousClass05K.A08, "profile_picture", 4), AnonymousClass05K.A0C, 0.0f, 1), AnonymousClass05K.A0D, "clips_author_info_profile_pic_component", 4)), r6, user.Bh3(), h7o, r2.Bnf().A02(2Yu.A04(r2.Aqq().A0C)), 0, -16777216, false, true, false);
    }

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        float f;
        2Tl r0;
        SpannableStringBuilder spannableStringBuilder;
        C244403b8 r18;
        AnonymousClass3Y5 r31 = r33;
        AnonymousClass3Y5 r02 = r31;
        0qQ.A0B(r02, 0);
        2V1 r6 = r02.A05;
        Context A0B2 = C51965G9l.A0B(r6);
        int A022 = DbS.A02(A0B2, 44);
        2Wa A002 = C58705IwE.A00(r31, this, 40);
        UserSession userSession = this.A05;
        float f2 = 108.0f;
        if (C56375HxT.A01(userSession)) {
            f2 = 85.0f;
        }
        if (this.A0E) {
            f = (float) C226122ff.A01();
        } else {
            f = 0.0f;
        }
        if (C56375HxT.A00(userSession) || !C56375HxT.A01(userSession)) {
            f = 0nA.A01(A0B2, this.A0C + f + 6.0f);
        }
        2WX r11 = 2WX.A02;
        C244413b9 r03 = C244413b9.RELATIVE;
        Integer num = AnonymousClass05K.A0Y;
        2WX A0X = C51965G9l.A0X((2WX) null, C51968G9o.A0d(num, r03));
        long A062 = C51965G9l.A06(f2);
        Integer num2 = AnonymousClass05K.A01;
        2WX A003 = AnonymousClass9JR.A00(A0X, num2, 0, A062);
        Integer num3 = AnonymousClass05K.A00;
        2WX A0X2 = C51971G9r.A0X(A003, num3, 100.0f, 0);
        2WX r04 = this.A00;
        2WX r29 = r04;
        2WX A004 = A0X2.A00(r04);
        J6N A005 = J6N.A00(this, 11);
        Integer num4 = AnonymousClass05K.A1F;
        AnonymousClass9JS A0d = C51965G9l.A0d(num4, A005, 4);
        if (A004 == r11) {
            A004 = null;
        }
        2WX A0X3 = C51965G9l.A0X(A004, A0d);
        long A063 = C51965G9l.A06(f);
        Integer num5 = AnonymousClass05K.A08;
        2WX A006 = AnonymousClass9JR.A00(A0X3, num5, 0, A063);
        C243573Zh r25 = C243573Zh.CENTER;
        2Wb A0S = AnonymousClass7TG.A0S(r6);
        Reel reel = (Reel) A002.A03;
        C267324bN r2 = this.A03;
        1Xj r1 = r2.A02;
        if (r1 != null) {
            Integer A012 = GEN.A01(r2, userSession, r1, false);
            2V1 Aqq = A0S.Aqq();
            Context A0B3 = C51965G9l.A0B(Aqq);
            long A0G = C51969G9p.A0G(AnonymousClass0od.A05(A0B3, A022, DbS.A02(A0B3, 54)));
            if (!this.A0B || (!(A012 == num || A012 == num3 || A012 == AnonymousClass05K.A0N) || reel == null)) {
                r0 = A00(A0S);
            } else {
                0qQ.A07(A0B3);
                float A007 = AnonymousClass0od.A00(A0B3, 0nA.A00(A0B3, 1.5f), A022);
                float A013 = AnonymousClass0od.A01(A0B3, 0nA.A00(A0B3, 1.0f), A022);
                2WX A0z = G9t.A0z(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num3, 0, A0G), num2, 0, A0G), num, C244413b9.ABSOLUTE);
                UserSession userSession2 = userSession;
                RingSpec A052 = reel.A05(userSession2);
                if (A052 == null) {
                    A052 = AnonymousClass3NW.A00(userSession2, reel);
                }
                if (reel.A16(userSession2)) {
                    r18 = C244403b8.STATE_INACTIVE;
                } else {
                    r18 = C244403b8.STATE_ACTIVE;
                }
                C244423bA r15 = new C244423bA(A0z, A052, r18, Float.valueOf(A007), Float.valueOf(A013));
                2WX A008 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0C, 0, A0G), num, 0, A0G);
                2Wb A0S2 = AnonymousClass7TG.A0S(Aqq);
                A0S2.A00(A00(A0S2));
                A0S2.A00(r15);
                r0 = C243563Zg.A05(A0S2, A0S, A008);
            }
            A0S.A00(r0);
            2WX A0z2 = G9t.A0z((2WX) null, num3, r25);
            Integer num6 = AnonymousClass05K.A0C;
            2WX A0X4 = C51971G9r.A0X(A0z2, num6, 0.0f, 1);
            long A0B4 = C51969G9p.A0B();
            2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00(A0X4, num5, 0, A0B4), num4, J6N.A00(this, 10), 4);
            SparseArray A009 = C244083ac.A00(C244063aa.TITLE);
            Integer num7 = AnonymousClass05K.A0E;
            2WX A0010 = C51971G9r.A0Y(A0Y, num7, A009, 4).A00(r29);
            1Xj r12 = r2.A02;
            if (r12 != null) {
                GEG geg = this.A01;
                int intValue = GEN.A00(geg, r2, userSession, r12, false).intValue();
                if (intValue == 3 || !(intValue == 5 || intValue == 0 || intValue == 4)) {
                    spannableStringBuilder = DbS.A0C(r2.A06().A0U);
                } else {
                    String AyM = r2.AyM(userSession);
                    if (AyM != null) {
                        spannableStringBuilder = DbS.A0C(AyM);
                        if (geg.A0K) {
                            C244273av.A08(C243803a8.A00(A0S), spannableStringBuilder, false);
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                long A0D2 = C51969G9p.A0D();
                Typeface typeface = Typeface.DEFAULT;
                Typeface A032 = 0oh.A03((Context) null, typeface, num6);
                int A023 = A0S.Bnf().A02(R.color.design_dark_default_color_on_background);
                long A0C2 = C244013aV.A0C(A0S, R.dimen.backup_codes_text_size);
                C244103ae A0b = C51971G9r.A0b(Aqq, (2V5) null, spannableStringBuilder, 0);
                C51973G9u.A17(A0S, A0b, A023, A0C2);
                A0b.A0R(1);
                G9w.A12(A032, A0S, A0b, A0D2);
                C51974G9v.A16(A0b, num6, num3);
                A0b.A0M(1);
                A0b.A01.A00 = (float) C51968G9o.A09(A0S, A0D2);
                C51969G9p.A1I(A0b);
                A0b.A0D();
                G9t.A1M(A0S, A0010, A0b);
                if (!C56375HxT.A01(userSession)) {
                    2WX A0011 = C51971G9r.A0Y(C51971G9r.A0Y(C51974G9v.A0F(C51973G9u.A0S((2WX) null, C51968G9o.A0d(num3, r25), num6, 0.0f, 1), C51965G9l.A0c(num5, 0, A0B4), 0, A0B4), num4, J6N.A00(this, 9), 4), num7, C244083ac.A00(C244063aa.SPONSORED_LABEL), 4).A00(r29);
                    String A0E2 = C244013aV.A0E(A0S, 2131963717);
                    Typeface A033 = 0oh.A03((Context) null, typeface, num6);
                    int A024 = A0S.Bnf().A02(R.color.design_dark_default_color_on_background);
                    long A082 = C244013aV.A08(A0S);
                    C244103ae A0b2 = C51971G9r.A0b(Aqq, (2V5) null, A0E2, 0);
                    C51973G9u.A17(A0S, A0b2, A024, A082);
                    A0b2.A0R(0);
                    G9w.A12(A033, A0S, A0b2, A0D2);
                    C51974G9v.A16(A0b2, num6, num3);
                    A0b2.A0M(1);
                    A0b2.A01.A00 = (float) C51968G9o.A09(A0S, A0D2);
                    C51969G9p.A1I(A0b2);
                    A0b2.A0D();
                    G9t.A1M(A0S, A0011, A0b2);
                }
                return C243563Zg.A05(A0S, r31, A006);
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A04(View view, User user, C53923GwT gwT, String str, String str2) {
        HLF hlf;
        Object obj;
        C53923GwT gwT2 = gwT;
        C267324bN r6 = gwT2.A03;
        1Xj r2 = r6.A02;
        if (r2 != null) {
            UserSession userSession = gwT2.A05;
            C71342cb.A00(userSession).A08 = r2.A30();
            C71342cb.A00(userSession).A09 = DbT.A0x(r2);
            AnonymousClass4DU r1 = gwT2.A07;
            User user2 = gwT2.A08;
            C319976rX.A08(r1, userSession, Dbb.A0O(userSession, user2), "tap_clips_tab", user2.getId(), r6.getId(), r6.A0P, "clips_tab");
            User user3 = user;
            if (!r2.A4z() || !00p.A0j(C51968G9o.A15(C51966G9m.A11(r2)), user3.getId(), false)) {
                hlf = HLF.BRAND;
            } else {
                hlf = HLF.INFLUENCER;
            }
            JTB jtb = gwT2.A09;
            C52058GDe gDe = gwT2.A04;
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            View view2 = null;
            if (0qQ.A0K(obj, "clips_author_info_profile_pic_component")) {
                view2 = view;
            }
            jtb.Da6(view2, r6, gDe, hlf, user3, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Float) null, (Float) null, str, str2, (String) null, (C62320sa) null, false, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
