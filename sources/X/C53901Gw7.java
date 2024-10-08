package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gw7  reason: case insensitive filesystem */
public final class C53901Gw7 extends C251343mx {
    public final C334297b2 A00;
    public final UserSession A01;
    public final C70804OLz A02;
    public final C60314JjH A03;
    public final MQV A04;
    public final AnonymousClass7L2 A05;
    public final AnonymousClass4DU A06;

    public final C251263mp A0X(AnonymousClass3Y5 r43) {
        C60452Jlk jlk;
        C53879Gvk A002;
        AnonymousClass3Y5 r6 = r43;
        0qQ.A0B(r6, 0);
        C334997cD r7 = (C334997cD) C243643Zq.A00(r6, C334987cC.A00).A03;
        Object A003 = AnonymousClass3Zw.A00(r6, C58376Iqv.A00, new Object[0]);
        C70804OLz oLz = this.A02;
        C60480JmD jmD = (C60480JmD) AnonymousClass3Zw.A00(r6, new C73664Phd(27, this, r6), C51968G9o.A1b(oLz.A00()));
        if (jmD != null) {
            jmD.A04 = new L1C(this);
        }
        MQV mqv = this.A04;
        C243773a4.A00(r6, new C41567AwZ(39, r7, this, A003), new Object[]{mqv});
        Object A004 = AnonymousClass3Zw.A00(r6, new C73664Phd(28, this, r6), new Object[]{this.A05});
        if (mqv instanceof C61197Jyq) {
            UserSession userSession = this.A01;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36319407395446100L)) {
                return new C53879Gvk(oLz.A01);
            }
            return A00(r6);
        } else if (mqv instanceof C61198Jyr) {
            AnonymousClass3XV r0 = 2WX.A02;
            2WX A005 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A15, 0, C51970G9q.A0H());
            2Wb A0K = C51973G9u.A0K(r6);
            for (C333827aD r3 : ((C61198Jyr) mqv).A00) {
                if (r3 instanceof C54214H3j) {
                    A0K.A00(new C53686Gsd((C54214H3j) r3, this.A01, this.A03));
                }
            }
            UserSession userSession2 = this.A01;
            if (182.A06(DbS.A0J(userSession2, 0), userSession2, 36319407395446100L)) {
                A002 = new C53879Gvk(oLz.A01);
            } else {
                A002 = A00(A0K);
            }
            return C51967G9n.A0N(A002, A0K, r6, A005);
        } else if (mqv instanceof C61199Jys) {
            C61199Jys jys = (C61199Jys) mqv;
            List list = jys.A03;
            if (list.isEmpty()) {
                AnonymousClass3XV r02 = 2WX.A02;
                Integer num = AnonymousClass05K.A00;
                2WX A0D = C51974G9v.A0D((2WX) null, C51965G9l.A0b(num, 100.0f, 0), 100.0f, 0);
                2Wb A0K2 = C51973G9u.A0K(r6);
                String A0E = C244013aV.A0E(A0K2, 2131954214);
                2V1 r8 = A0K2.A00;
                Context context = r8.A0C;
                int A062 = C51968G9o.A06(context, A0K2);
                long A0C = C244013aV.A0C(A0K2, R.dimen.backup_codes_text_size);
                Typeface typeface = Typeface.DEFAULT;
                long A0D2 = C51969G9p.A0D();
                C244103ae A0b = C51971G9r.A0b(r8, (2V5) null, A0E, 0);
                C51973G9u.A17(A0K2, A0b, A062, A0C);
                A0b.A0R(1);
                G9w.A12(typeface, A0K2, A0b, A0D2);
                A0b.A0B();
                C51974G9v.A1A(A0b, num, false, true);
                C51967G9n.A1G(A0K2, A0b);
                String A0E2 = C244013aV.A0E(A0K2, 2131954213);
                2WX A006 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A15, 0, C51970G9q.A0I());
                int A07 = C51968G9o.A07(context, A0K2);
                long A08 = C244013aV.A08(A0K2);
                C244103ae A0b2 = C51971G9r.A0b(r8, (2V5) null, A0E2, 0);
                C51973G9u.A17(A0K2, A0b2, A07, A08);
                A0b2.A0R(0);
                G9w.A12(typeface, A0K2, A0b2, A0D2);
                A0b2.A0B();
                C51974G9v.A1A(A0b2, num, false, true);
                C244123ag.A00(A0b2, A006);
                C51967G9n.A1G(A0K2, A0b2);
                return C243563Zg.A04(A0K2, r6, A0D);
            }
            if (jmD != null) {
                jlk = jmD.A08;
            } else {
                jlk = null;
            }
            long A0H = C51970G9q.A0H();
            C53095GiT giT = new C53095GiT(this, 1);
            C335477d1 r03 = new C335477d1(new C73657PhW(this, 40));
            2Wd A0e = C51965G9l.A0e(A0H);
            long A0D3 = C51969G9p.A0D();
            Integer num2 = AnonymousClass05K.A00;
            AnonymousClass3AS r19 = C336767f9.A00;
            2V1 Aqq = r6.Aqq();
            2Sa r1 = Aqq.A02.A01;
            AnonymousClass3X7 r21 = r1.A02;
            boolean z = r1.A0W;
            C336547en r2 = new C336547en(Aqq);
            r2.A01(list, C59010J2v.A00, JG3.A00(jys, this, A004, 18));
            if (jys.A00.A03) {
                r2.A00(A00(r2), (Object) null, -1.0f, -1.0f);
            }
            C336687f1 A012 = C336677f0.A01(Aqq, r21, num2, 1, AnonymousClass972.MUTABLE_FLAG_MASK, G9t.A0i(r6, A0D3), false, z);
            return new C336707f3(r19, jlk, jmD, giT, (2WX) null, (C334327b5) null, A012, r2.A01, r7, r03, (2Wd) null, (2Wd) null, A0e, (2Wd) null, false, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public static final 2Tp A00(C70832Wc r8) {
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A002 = AnonymousClass9JR.A00(C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0)), AnonymousClass05K.A05, 0, C51970G9q.A0G());
        2Wb A0M = C51973G9u.A0M(r8);
        A0M.A00(new C53962Gx6(C51974G9v.A0M((2WX) null, num, 0, Double.doubleToRawLongBits(50.0d)), R.drawable.spinner_large));
        return C243563Zg.A0F(A0M, r8, A002);
    }

    public C53901Gw7(C334297b2 r1, UserSession userSession, C70804OLz oLz, C60314JjH jjH, MQV mqv, AnonymousClass7L2 r6, AnonymousClass4DU r7) {
        this.A04 = mqv;
        this.A02 = oLz;
        this.A05 = r6;
        this.A01 = userSession;
        this.A03 = jjH;
        this.A06 = r7;
        this.A00 = r1;
    }
}
