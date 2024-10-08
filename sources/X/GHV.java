package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class GHV extends C251343mx {
    public final View.OnTouchListener A00;
    public final C61077JwF A01;
    public final GEG A02;
    public final ClipsViewerConfig A03;
    public final C267324bN A04;
    public final C52058GDe A05;
    public final UserSession A06;
    public final JTB A07;
    public final 0sP A08;
    public final 0sL A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C54588HJx A0D;
    public final C59523JMv A0E;
    public final C59524JMw A0F;

    public GHV(View.OnTouchListener onTouchListener, C61077JwF jwF, GEG geg, ClipsViewerConfig clipsViewerConfig, C267324bN r6, C52058GDe gDe, UserSession userSession, JTB jtb, C54588HJx hJx, C59523JMv jMv, C59524JMw jMw, 0sP r13, 0sL r14, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(jMw, 1);
        C51974G9v.A0d(2, jMv, userSession, gDe, geg);
        C51974G9v.A1Q(clipsViewerConfig, jtb, onTouchListener, r14);
        this.A0F = jMw;
        this.A0E = jMv;
        this.A04 = r6;
        this.A06 = userSession;
        this.A05 = gDe;
        this.A02 = geg;
        this.A03 = clipsViewerConfig;
        this.A07 = jtb;
        this.A00 = onTouchListener;
        this.A09 = r14;
        this.A08 = r13;
        this.A0C = z;
        this.A0D = hJx;
        this.A0B = z2;
        this.A0A = z3;
        this.A01 = jwF;
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [X.2T3, java.lang.Object] */
    public final C251263mp A0X(AnonymousClass3Y5 r35) {
        2V5 r1;
        2V5 r12;
        GEQ geq;
        SpannableStringBuilder A002;
        Integer num;
        long A092;
        AnonymousClass3Y5 r3 = r35;
        0qQ.A0B(r3, 0);
        C54588HJx hJx = this.A0D;
        if (hJx != null) {
            r1 = hJx.A05;
        } else {
            r1 = new 2V5((Object) null);
        }
        C53372Gmw gmw = (C53372Gmw) C52149GGr.A00(r3, r1);
        if (hJx != null) {
            r12 = hJx.A04;
        } else {
            r12 = new 2V5(C51967G9n.A0j());
        }
        Integer num2 = (Integer) C52149GGr.A00(r3, r12);
        C59524JMw jMw = this.A0F;
        User user = null;
        if (jMw instanceof GEQ) {
            geq = (GEQ) jMw;
        } else {
            geq = null;
        }
        int i = 0;
        if (geq == null) {
            A002 = C51965G9l.A0E();
        } else {
            C267324bN r10 = this.A04;
            1Xj r6 = r10.A02;
            if (r6 != null) {
                UserSession userSession = this.A06;
                String str = AnonymousClass93S.A00(userSession).A00;
                switch (GEN.A00(this.A02, r10, userSession, r6, geq.A02).intValue()) {
                    case 1:
                        List list = geq.A01;
                        A002 = AnonymousClass3ZI.A01(C243803a8.A00(r3), userSession, (String) null, list, new C58693Iw2(48, this, r6), this.A09, list.size(), C51972G9s.A09(r3.Aqq().A0C, r3), 2, true, true);
                        break;
                    case 2:
                        User A2A = r6.A2A(userSession);
                        if (A2A != null) {
                            String AyM = r10.AyM(userSession);
                            if (AyM != null) {
                                String A0J = C231122qu.A0J(AyM);
                                if (A2A.A2Q() && A0J != null) {
                                    AyM = A0J;
                                }
                                User A29 = r6.A29();
                                if (A29 != null) {
                                    String fullName = A29.getFullName();
                                    if (fullName != null) {
                                        String A0J2 = C231122qu.A0J(fullName);
                                        if (!A29.A2Q() || A0J2 == null) {
                                            A0J2 = A29.getUsername();
                                        }
                                        int i2 = 2131953743;
                                        if (C231122qu.A0a(r6)) {
                                            i2 = 2131953753;
                                        }
                                        A002 = 1sx.A02(AyM, A0J2, C244013aV.A0E(r3, i2));
                                        AnonymousClass7AV.A02(A002, new Q8I(4, this, A29), A0J2);
                                        AnonymousClass7AV.A02(A002, new CharacterStyle(), AyM);
                                        break;
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    case 5:
                        Context A003 = C243803a8.A00(r3);
                        int A093 = C51972G9s.A09(r3.Aqq().A0C, r3);
                        if (gmw != null) {
                            user = (User) gmw.A04;
                        }
                        A002 = AnonymousClass3ZI.A00(A003, userSession, r6, user, num2, (String) null, new C58693Iw2(49, this, r6), new J96(gmw, r3, r6, this, hJx, num2, str), A093, true);
                        break;
                    default:
                        A002 = SpannableStringBuilder.valueOf(((GEQ) jMw).A00);
                        break;
                }
                i = 1;
                0qQ.A0A(A002);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0B(A002, 0);
        int i3 = i ^ 1;
        if (i != 0) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        2WX r7 = null;
        Typeface A032 = 0oh.A03((Context) null, Typeface.DEFAULT, num);
        int i4 = 1;
        if (i != 0) {
            i4 = 2;
        }
        Integer num3 = AnonymousClass05K.A0N;
        J6F A004 = J6F.A00(this, 43);
        AnonymousClass3XV r0 = 2WX.A02;
        long A0A2 = C244013aV.A0A(r3);
        if (!this.A0C || this.A02.A0K) {
            A092 = C244013aV.A09(r3);
        } else {
            A092 = C51969G9p.A0D();
        }
        2WX A0R = C51972G9s.A0R((2WX) null, 0, A0A2);
        Integer num4 = AnonymousClass05K.A1F;
        2WX A005 = AnonymousClass9JR.A00(A0R, num4, 0, A092);
        C243573Zh r02 = C243573Zh.CENTER;
        Integer num5 = AnonymousClass05K.A00;
        2WX A0U = C51972G9s.A0U(C51971G9r.A0Y(C51971G9r.A0Y(C51973G9u.A0N(C244063aa.TITLE, C51971G9r.A0Y(C51971G9r.A0Y(G9t.A0z(A005, num5, r02), AnonymousClass05K.A08, G9t.A19(), 4), AnonymousClass05K.A0D, "clips_author_info_username_component", 4)), AnonymousClass05K.A04, A004, 4), num4, this.A08, 4), AnonymousClass05K.A01, 0);
        int A082 = C51969G9p.A08(r3, R.color.design_dark_default_color_on_background);
        long A042 = C244013aV.A04(r3);
        UserSession userSession2 = this.A06;
        long A033 = GHW.A03(userSession2);
        int A022 = GHW.A02(userSession2, C51969G9p.A08(r3, R.color.black));
        long A043 = GHW.A04(userSession2);
        Integer A052 = GHW.A05(userSession2, C51969G9p.A08(r3, R.color.black));
        long A0D2 = C51969G9p.A0D();
        2V1 Aqq = r3.Aqq();
        C244103ae A13 = G9t.A13(Aqq, A002, A082);
        C51971G9r.A1J(A13, r3.Bnf(), i3, A042);
        A13.A0S(A032);
        A13.A0O(A022);
        C51974G9v.A10(A13, r3, C51969G9p.A09(r3, A033), A0D2);
        C51974G9v.A11(A13, r3.Bnf(), A052, A043);
        C51974G9v.A16(A13, num3, num5);
        A13.A0M(i4);
        C51974G9v.A0z(A0U, A13, false);
        2WW A0A3 = A13.A0A();
        C61077JwF jwF = this.A01;
        if (jwF == null || !jwF.A02) {
            return A0A3;
        }
        if (i4 > 1 || this.A0A) {
            jwF.A02 = false;
            return A0A3;
        }
        ? obj = new Object();
        2V1 Aqq2 = r3.Aqq();
        A0A3.A0L(Aqq2, obj, 0, 0);
        Context context = Aqq2.A0C;
        Resources resources = context.getResources();
        boolean z = this.A0B;
        int i5 = R.dimen.biz_sign_up_divider_bottom_margin;
        if (z) {
            i5 = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i5);
        int i6 = obj.A00;
        if (dimensionPixelSize <= i6) {
            jwF.A02 = false;
        } else {
            float f = ((float) (dimensionPixelSize - i6)) / 2.0f;
            jwF.A00 = Float.valueOf(f);
            r7 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, 0, C51965G9l.A06(0nA.A01(DbT.A05(context), f)));
        }
        2WX A006 = A0U.A00(r7);
        int A083 = C51969G9p.A08(r3, R.color.design_dark_default_color_on_background);
        long A044 = C244013aV.A04(r3);
        long A034 = GHW.A03(userSession2);
        int A023 = GHW.A02(userSession2, C51969G9p.A08(r3, R.color.black));
        long A045 = GHW.A04(userSession2);
        Integer A053 = GHW.A05(userSession2, C51969G9p.A08(r3, R.color.black));
        C244103ae A132 = G9t.A13(Aqq, A002, A083);
        C51971G9r.A1J(A132, r3.Bnf(), i3, A044);
        A132.A0S(A032);
        A132.A0O(A023);
        C51974G9v.A10(A132, r3, C51969G9p.A09(r3, A034), A0D2);
        C51974G9v.A11(A132, r3.Bnf(), A053, A045);
        C51974G9v.A16(A132, num3, num5);
        A132.A0M(i4);
        C51974G9v.A0z(A006, A132, false);
        return A132.A0A();
    }
}
