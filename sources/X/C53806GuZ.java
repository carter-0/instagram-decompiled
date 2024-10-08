package X;

import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.GuZ  reason: case insensitive filesystem */
public final class C53806GuZ extends C251343mx {
    public final C267324bN A00;
    public final UserSession A01;
    public final JTB A02;
    public final JQX A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass3W1 A05;

    public final C251263mp A0X(AnonymousClass3Y5 r37) {
        String str;
        String str2;
        long j;
        long A012;
        long j2;
        long A0R;
        long j3;
        Double d;
        AnonymousClass3Y5 r34 = r37;
        0qQ.A0B(r34, 0);
        2Wa A002 = C243643Zq.A00(r34, C58715IwO.A01(this, 29));
        AnonymousClass3W1 r4 = this.A05;
        boolean A1a = AnonymousClass7TE.A1a(r4.A3Z.A00);
        AnonymousClass3Y5 r0 = r34;
        2Wa A013 = C243753a2.A01(r0, r4, J61.A00, 70, false);
        2Wa A014 = C243753a2.A01(r0, r4, J62.A00, 66, false);
        2Wa A015 = C243753a2.A01(r0, r4, J63.A00, 69, false);
        2Wa A016 = C243753a2.A01(r0, r4, J60.A00, 71, false);
        long BXX = this.A02.BXX();
        C57686Iep iep = new C57686Iep(1, A002, this);
        Object[] objArr = {this.A03};
        C243773a4.A00(r34, C58692Iw1.A00(iep, this, 15), objArr);
        AnonymousClass3XV r02 = 2WX.A02;
        2WX A003 = AnonymousClass9JR.A00(C51973G9u.A0P(C51965G9l.A0X((2WX) null, C51965G9l.A0d(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3)), 48.0d), AnonymousClass05K.A06, 0, C51970G9q.A0I());
        int A08 = C51969G9p.A08(r34, R.color.design_dark_default_color_on_background);
        Integer num = AnonymousClass05K.A00;
        2WX A10 = G9t.A10(A003, num, C51965G9l.A0Y(A08));
        2V1 r12 = r34.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0qQ.A0B(r12, 1);
        2WX A0Y = C51971G9r.A0Y((2WX) null, num, C243573Zh.CENTER, 3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r12, (2V5) null, "AutoScroll Debug", 0);
        A0b.A0P(-16777216);
        AnonymousClass2V4 r9 = r12.A0D;
        0qQ.A07(r9);
        C51971G9r.A1J(A0b, r9, 0, ((long) Float.floatToRawIntBits(18.0f)) | 9221683186994511872L);
        A0b.A0S(typeface);
        G9w.A1G(A0b, r9, num, A0D);
        A0b.A0a(false);
        A0b.A0N(0);
        A0b.A0E();
        C51973G9u.A19(A0Y, A0b, false);
        A1C.add(A0b.A0A());
        String A1D = 002.A1D("Is Eligible For AutoScroll?: ", C51969G9p.A1V(A002));
        long A0K = C51971G9r.A0K();
        C244103ae A13 = G9t.A13(r12, A1D, -16777216);
        C51971G9r.A1J(A13, r9, 0, A0K);
        A13.A0S(typeface);
        G9w.A1G(A13, r9, num, A0D);
        C51974G9v.A1B(A13, A1C);
        C244103ae A132 = G9t.A13(r12, 002.A1D("Show AutoScroll Countdown?: ", A1a), -16777216);
        C51971G9r.A1J(A132, r9, 0, A0K);
        A132.A0S(typeface);
        G9w.A1G(A132, r9, num, A0D);
        C51974G9v.A1B(A132, A1C);
        0eP r6 = (0eP) A016.A03;
        if (r6 != null) {
            str = (String) r6.A00;
        } else {
            str = null;
        }
        C244103ae A133 = G9t.A13(r12, 002.A0R("Cancel Reason: ", str), -16777216);
        C51971G9r.A1J(A133, r9, 0, A0K);
        A133.A0S(typeface);
        G9w.A1G(A133, r9, num, A0D);
        C51974G9v.A1B(A133, A1C);
        if (r6 != null) {
            str2 = (String) r6.A01;
        } else {
            str2 = null;
        }
        C244103ae A134 = G9t.A13(r12, 002.A0R("Cancel Behavior: ", str2), -16777216);
        C51971G9r.A1J(A134, r9, 0, A0K);
        A134.A0S(typeface);
        G9w.A1G(A134, r9, num, A0D);
        C51974G9v.A1B(A134, A1C);
        C244103ae A135 = G9t.A13(r12, 002.A0I("Loops Left: ", ' ', AnonymousClass7TE.A0M(A013.A03)), -16777216);
        C51971G9r.A1J(A135, r9, 0, A0K);
        A135.A0S(typeface);
        G9w.A1G(A135, r9, num, A0D);
        C51974G9v.A1B(A135, A1C);
        C267324bN r33 = this.A00;
        UserSession userSession = this.A01;
        UserSession userSession2 = userSession;
        AnonymousClass3WR A09 = r33.A09(userSession, (Integer) null);
        if (A09 == null || (d = A09.A0C) == null) {
            j = 1000;
        } else {
            j = AnonymousClass30M.A03(AnonymousClass30K.A02(AnonymousClass30J.SECONDS, d.doubleValue()));
        }
        boolean CcK = r33.CcK();
        0Tu A0J = DbS.A0J(userSession2, 0);
        if (CcK) {
            0Tu r7 = A0J;
            UserSession userSession3 = userSession2;
            if (182.A06(r7, userSession3, 36323539150646525L)) {
                A012 = 182.A01(r7, userSession3, 36605014127285421L);
            } else {
                A012 = 182.A01(r7, userSession3, 36605014126498985L);
            }
        } else {
            0Tu r72 = A0J;
            UserSession userSession4 = userSession2;
            if (182.A06(r72, userSession4, 36322632912808247L)) {
                A012 = 182.A01(r72, userSession4, 36604107889447950L);
            } else {
                A012 = 182.A01(r72, userSession4, 36604107888399369L);
            }
        }
        if (r33.CcK()) {
            j2 = 36605014126433448L;
        } else {
            j2 = 36604107888464906L;
        }
        long A017 = 182.A01(A0J, userSession2, j2);
        AnonymousClass30J r20 = AnonymousClass30J.SECONDS;
        long A032 = AnonymousClass30M.A03(AnonymousClass30K.A04(r20, A017));
        if (A012 * j < A032) {
            A012 = (long) Math.ceil(((double) A032) / ((double) j));
        }
        C244103ae A136 = G9t.A13(r12, 002.A0K("Required Loops: ", ' ', A012), -16777216);
        C51971G9r.A1J(A136, r9, 0, A0K);
        A136.A0S(typeface);
        G9w.A1G(A136, r9, num, A0D);
        C51974G9v.A1B(A136, A1C);
        C244103ae A137 = G9t.A13(r12, 002.A0K("Sequential Autoscrolls: ", ' ', BXX), -16777216);
        C51971G9r.A1J(A137, r9, 0, A0K);
        A137.A0S(typeface);
        G9w.A1G(A137, r9, num, A0D);
        C51974G9v.A1B(A137, A1C);
        1Xj r03 = r33.A02;
        if (r03 == null || !r03.A5p()) {
            A0R = AnonymousClass7TE.A0R(A015.A03);
        } else {
            A0R = AnonymousClass7TE.A0R(A014.A03);
        }
        C244103ae A138 = G9t.A13(r12, 002.A0K("Remaining Time: ", ' ', A0R), -16777216);
        C51971G9r.A1J(A138, r9, 0, A0K);
        A138.A0S(typeface);
        G9w.A1G(A138, r9, num, A0D);
        C51974G9v.A1B(A138, A1C);
        if (r33.CcK()) {
            j3 = 36605014126892203L;
        } else {
            j3 = 36604107888333832L;
        }
        C244103ae A139 = G9t.A13(r12, 002.A0Q("Countdown Value: ", AnonymousClass30M.A03(AnonymousClass30K.A04(r20, 182.A01(A0J, userSession2, j3)))), -16777216);
        C51971G9r.A1J(A139, r9, 0, A0K);
        A139.A0S(typeface);
        G9w.A1G(A139, r9, num, A0D);
        C51974G9v.A1B(A139, A1C);
        C244103ae A1310 = G9t.A13(r12, 002.A0R("Container Module: ", this.A04.getModuleName()), -16777216);
        C51971G9r.A1J(A1310, r9, 0, A0K);
        A1310.A0S(typeface);
        G9w.A1G(A1310, r9, num, A0D);
        ArrayList arrayList = A1C;
        C51974G9v.A1B(A1310, arrayList);
        2Tl r3 = new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, arrayList, false);
        2WX r04 = A10;
        r04.A01(r3.A0Z(), r34.Aqq());
        return r3;
    }

    public C53806GuZ(C267324bN r2, UserSession userSession, AnonymousClass4DU r4, AnonymousClass3W1 r5, JTB jtb, JQX jqx) {
        AnonymousClass7TG.A1O(jqx, userSession);
        0qQ.A0B(jtb, 6);
        this.A03 = jqx;
        this.A01 = userSession;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = r2;
        this.A02 = jtb;
    }
}
