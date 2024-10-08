package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.Guf  reason: case insensitive filesystem */
public final class C53812Guf extends C251343mx {
    public final UserAccountInfo A00;
    public final UserAccountInfo A01;
    public final C49726F3q A02;
    public final FoaUserSession A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public C53812Guf(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2, C49726F3q f3q, FoaUserSession foaUserSession, Integer num, String str, String str2) {
        0qQ.A0B(num, 7);
        this.A03 = foaUserSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = userAccountInfo;
        this.A01 = userAccountInfo2;
        this.A02 = f3q;
        this.A04 = num;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r41) {
        int i;
        double d;
        AnonymousClass3Y5 r10 = r41;
        0qQ.A0B(r10, 0);
        C243773a4.A00(r10, C58686Ivv.A00(this, 44), C51966G9m.A1b());
        2V1 r8 = r10.A05;
        Object A062 = r8.A06(C49726F3q.class);
        if (A062 != null) {
            Integer num = this.A04;
            int intValue = num.intValue();
            if (intValue == 0) {
                i = 2131974894;
            } else if (intValue == 1) {
                i = 2131976931;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            String A0E = C244013aV.A0E(r10, i);
            C62320sa A002 = AnonymousClass3j0.A00(r10, C58697Iw6.A00(A062, r10, this, 7));
            if (num == AnonymousClass05K.A01) {
                d = 16.0d;
            } else {
                d = 0.0d;
            }
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            C54715HPu A012 = I3H.A01(r10, C54615HKy.A02);
            AnonymousClass3XV r0 = 2WX.A02;
            2WX A0F = C51974G9v.A0F((2WX) null, C51965G9l.A0c(AnonymousClass05K.A08, 0, Double.doubleToRawLongBits(-8.0d)), 0, doubleToRawLongBits);
            long A0D = C51969G9p.A0D();
            AnonymousClass3AS r17 = C336767f9.A00;
            2Sa r02 = r8.A02.A01;
            AnonymousClass3X7 r13 = r02.A02;
            boolean z = r02.A0W;
            C336547en r5 = new C336547en(r8);
            I3H.A02(r5, A012, new C73949PmT(this, A002, A0E, 41));
            return new C336707f3(r17, (AnonymousClass3B3) null, (C331097Pn) null, (C249403jg) null, A0F, (C334327b5) null, C336677f0.A00(r8, r13, G9t.A0i(r10, A0D), z), r5.A01, (C334997cD) null, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false);
        }
        throw AnonymousClass7TE.A0y();
    }
}
