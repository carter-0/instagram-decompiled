package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gwz  reason: case insensitive filesystem */
public final class C53955Gwz extends C243963aQ {
    public final C262754Fw A00;
    public final C56011HrJ A01;
    public final List A02;
    public final 0sP A03;
    public final 0sL A04;
    public final 2WX A05;
    public final UserSession A06;

    public C53955Gwz(2WX r2, UserSession userSession, C262754Fw r4, C56011HrJ hrJ, List list, 0sP r7, 0sL r8) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(list, r4, hrJ, r8, r7);
        0qQ.A0B(r2, 7);
        this.A06 = userSession;
        this.A02 = list;
        this.A00 = r4;
        this.A01 = hrJ;
        this.A04 = r8;
        this.A03 = r7;
        this.A05 = r2;
    }

    public final C244523bK A0X(C244463bE r11) {
        0qQ.A0B(r11, 0);
        Object A002 = AnonymousClass3Zw.A00(r11, new C58684Ivt(r11, 5), new Object[]{this.A00.A0K});
        boolean A062 = 182.A06(0Tu.A05, this.A06, 36329397485060185L);
        Object A003 = AnonymousClass3Zw.A00(r11, new C58684Ivt(this, 6), new Object[]{this.A04, this.A03});
        long A0D = C51969G9p.A0D();
        return C51965G9l.A0W(this.A05, new 2WO(A0D, A0D), C51969G9p.A0f(r11, C51967G9n.A0W(new IJ1(A062), 2, true), C58398IrH.A00, new C74188PqU(23, A003, A002, (Object) this)));
    }
}
