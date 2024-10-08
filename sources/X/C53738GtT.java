package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GtT  reason: case insensitive filesystem */
public final class C53738GtT extends C251343mx {
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final AnonymousClass0r6 A03;

    public C53738GtT(FoaUserSession foaUserSession, String str, String str2, AnonymousClass0r6 r5) {
        0qQ.A0B(r5, 1);
        this.A03 = r5;
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r45) {
        Object hhh;
        Object obj;
        AnonymousClass3Y5 r4 = r45;
        0qQ.A0B(r4, 0);
        AnonymousClass0r6 r7 = this.A03;
        0qQ.A0B(r7, 1);
        if (r7 instanceof AnonymousClass0Ud) {
            hhh = ((AnonymousClass0Ud) r7).getValue();
        } else {
            0sn r0 = 0sn.A00;
            hhh = new HHH(r0, r0, 0);
        }
        HHH hhh2 = (HHH) C247253g2.A00(r4, C58686Ivv.A00(hhh, 38), new MGC((Object) r7, (AnonymousClass4D7) null, 33, 42), new Object[]{r7});
        List list = hhh2.A01;
        int i = hhh2.A00;
        List list2 = hhh2.A02;
        C52706GbJ gbJ = (C52706GbJ) AnonymousClass3Zw.A00(r4, C58544Itd.A00, new Object[0]);
        2Wa A002 = C243643Zq.A00(r4, C58535ItU.A00);
        2Wa A003 = C243643Zq.A00(r4, C46028DJl.A00);
        2V1 r3 = r4.A05;
        Object A06 = r3.A06(C49726F3q.class);
        if (A06 != null) {
            C54715HPu A012 = I3H.A01(r4, C54615HKy.A02);
            C334997cD r6 = (C334997cD) C243643Zq.A00(r4, C334987cC.A00).A03;
            C243773a4.A00(r4, C58686Ivv.A00(this, 41), C51966G9m.A1b());
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = ((UserAccountInfo) obj).A09;
                if (!0qQ.A0K(str, "CURRENT")) {
                    if (0qQ.A0K(str, "CURRENT_AP")) {
                        break;
                    }
                } else {
                    break;
                }
            }
            0sL A022 = AnonymousClass3j0.A02(r4, new J8X(7, A002, this, obj, r4, A06));
            0sP A013 = AnonymousClass3j0.A01(r4, new C58768IxF(29, obj, this, r4, A06));
            if (obj == null) {
                return new C53694Gsl(C21255XRa.A1w, new 2WX((2WX) null, (AnonymousClass2WY) null).A00(G9t.A0z((2WX) null, AnonymousClass05K.A00, C243573Zh.CENTER)), AnonymousClass05K.A0N);
            }
            JH7 jh7 = new JH7(3, this, A012, A013, A022, obj);
            J6T j6t = new J6T(35, (Object) jh7, (Object) list2);
            String string = C51969G9p.A0M(r4).getString(2131962810);
            if (string == null) {
                string = "";
            }
            C53693Gsk gsk = new C53693Gsk(gbJ, string, new C58223IoR(10, jh7, j6t, list, A003, r6, gbJ));
            String string2 = C51969G9p.A0M(r4).getString(2131962811);
            if (string2 == null) {
                string2 = "";
            }
            C56102Hsp hsp = new C56102Hsp(string2, AnonymousClass05K.A0C, C58686Ivv.A00(A06, 43));
            AnonymousClass3XV r02 = 2WX.A02;
            2WX A0P = C51973G9u.A0P((2WX) null, -8.0d);
            C58686Ivv A004 = C58686Ivv.A00(r6, 42);
            long A0D = C51969G9p.A0D();
            AnonymousClass3AS r21 = C336767f9.A00;
            AnonymousClass3X7 r13 = r3.A02.A01.A02;
            C336547en r11 = new C336547en(r3);
            jh7.invoke(r11, list, Boolean.valueOf(AnonymousClass7TF.A1T(list.size(), i)));
            C336707f3 r20 = new C336707f3(r21, (AnonymousClass3B3) null, (C331097Pn) null, (C249403jg) null, A0P, (C334327b5) null, C336677f0.A00(r3, r13, G9t.A0i(r4, A0D), true), r11.A01, r6, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, A004, (0sI) null, true, false);
            2Wa r03 = A002;
            return new C53796GuP(r20, gsk, hsp, C58697Iw6.A00(r03, j6t, A003, 5), C58687Ivw.A00(r03, gbJ, 15), (0sP) A003.A03);
        }
        throw AnonymousClass7TE.A0y();
    }
}
