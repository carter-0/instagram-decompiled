package X;

import android.content.Context;
import android.text.Spanned;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.List;

public final class Gw2 extends C251343mx {
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final UserAccountInfo A03;
    public final UserAccountInfo A04;

    public final C251263mp A0X(AnonymousClass3Y5 r51) {
        Integer num;
        C54625HLi hLi;
        AnonymousClass3Y5 r9 = r51;
        0qQ.A0B(r9, 0);
        C243773a4.A00(r9, C58686Ivv.A00(this, 46), C51966G9m.A1b());
        2V1 r14 = r9.A05;
        Object A06 = r14.A06(C49726F3q.class);
        if (A06 != null) {
            Context A002 = C243803a8.A00(r9);
            UserAccountInfo userAccountInfo = this.A03;
            0qQ.A0B(userAccountInfo, 1);
            Spanned A07 = DbU.A07(A002.getResources(), userAccountInfo.A0A, 2131974903);
            0qQ.A07(A07);
            FoaUserSession foaUserSession = this.A00;
            0qQ.A0B(foaUserSession, 0);
            long j = 0xn.A01(1An.A1U.toString()).getLong(AnonymousClass3H8.A00(C56316HwT.A00(foaUserSession).A06), 0);
            if (j == 0 || j < System.currentTimeMillis()) {
                num = AnonymousClass05K.A00;
            } else if (j == Long.MAX_VALUE) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                hLi = C54625HLi.SHOW;
            } else if (intValue != 1) {
                hLi = C54625HLi.HIDE_FOR_30_DAYS;
            } else {
                hLi = C54625HLi.HIDE;
            }
            2Wa A003 = C243643Zq.A00(r9, C58677Ivm.A00(hLi, 1));
            C59098J6g A012 = C59098J6g.A01(A003, 27);
            C54715HPu A013 = I3H.A01(r9, C54615HKy.A02);
            AnonymousClass3XV r1 = 2WX.A02;
            long A0J = C51970G9q.A0J();
            Integer num2 = AnonymousClass05K.A08;
            2WX A004 = AnonymousClass9JR.A00((2WX) null, num2, 0, A0J);
            long A0F = C51969G9p.A0F();
            2WX A005 = AnonymousClass9JR.A00(A004, AnonymousClass05K.A1I, 0, A0F);
            long A0D = C51969G9p.A0D();
            Integer num3 = AnonymousClass05K.A00;
            AnonymousClass3AS r27 = C336767f9.A00;
            2Sa r5 = r14.A02.A01;
            AnonymousClass3X7 r29 = r5.A02;
            boolean z = r5.A0W;
            C336547en r3 = new C336547en(r14);
            2WX A006 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0A, 0, C51970G9q.A0H());
            Integer num4 = AnonymousClass05K.A04;
            2WX A007 = AnonymousClass9JR.A00(A006, num4, 0, A0F);
            2V1 r26 = r3.A00;
            r3.A00(C51967G9n.A0Q(new C53833Gv0(C21255XRa.A2B, (2WX) null, AnonymousClass90N.TEXT_START, A07, num3, 0, A0J, Double.doubleToRawLongBits(3.0d)), AnonymousClass7TG.A0S(r26), r3, A007), (Object) null, -1.0f, -1.0f);
            I3H.A02(r3, A013, new C59104J6m(43, (Object) A003, (Object) A012, (Object) this));
            2WX A0G = C51974G9v.A0G((2WX) null, C51965G9l.A0c(num4, 0, A0F), 0, C51970G9q.A0K());
            2Wb A0S = AnonymousClass7TG.A0S(r26);
            2Wb A0w = G9t.A0w(A0S);
            String A0E = C244013aV.A0E(A0w, 2131974905);
            Integer num5 = AnonymousClass05K.A01;
            boolean A1a = C51969G9p.A1a(hLi, A003.A03);
            C58218IoM ioM = new C58218IoM(35, A06, hLi, this, A0w, A003);
            C54691HOw hOw = C54691HOw.FILLED;
            C56464Hyw hyw = C56464Hyw.A00;
            A0w.A00(new C53841Gv8(hOw, (2WX) null, hyw, A0E, num5, num3, num3, ioM, A1a));
            C54691HOw hOw2 = hOw;
            A0w.A00(new C53841Gv8(hOw2, new 2WX((2WX) null, (AnonymousClass2WY) null).A00(AnonymousClass9JR.A00((2WX) null, num2, 0, C51970G9q.A0I())), hyw, C244013aV.A0E(A0w, 2131974900), num5, num5, num3, C58677Ivm.A00(A06, 0), true));
            r3.A00(C51967G9n.A0N(C243563Zg.A00(A0w), A0S, r3, A0G), (Object) null, -1.0f, -1.0f);
            return new C336707f3(r27, (AnonymousClass3B3) null, (C331097Pn) null, (C249403jg) null, A005, (C334327b5) null, C336677f0.A00(r14, r29, G9t.A0i(r9, A0D), z), r3.A01, (C334997cD) null, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C57534IcM A00(C54625HLi hLi, C54625HLi hLi2) {
        XSY xsy;
        C54691HOw hOw;
        C54690HOv hOv;
        C21255XRa xRa;
        if (hLi == hLi2) {
            xsy = XSY.CIRCLE_CIRCLE;
            hOw = C54691HOw.OUTLINE;
            hOv = C54690HOv.SIZE_24;
            xRa = C21255XRa.A39;
        } else {
            xsy = XSY.CIRCLE;
            hOw = C54691HOw.OUTLINE;
            hOv = C54690HOv.SIZE_24;
            xRa = C21255XRa.A38;
        }
        return new C57534IcM(xsy, (XSY) null, hOv, hOw, xRa);
    }

    public Gw2(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2, FoaUserSession foaUserSession, String str, String str2) {
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = userAccountInfo;
        this.A04 = userAccountInfo2;
    }
}
