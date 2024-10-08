package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gts  reason: case insensitive filesystem */
public final class C53763Gts extends C251343mx {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final 0sP A04;

    public final C251263mp A0X(AnonymousClass3Y5 r39) {
        AnonymousClass3Y5 r6 = r39;
        0qQ.A0B(r6, 0);
        List A0s = C51967G9n.A0s(new String[]{C244013aV.A0E(r6, 2131956393), C244013aV.A0E(r6, 2131956390), C244013aV.A0E(r6, 2131956394), C244013aV.A0E(r6, 2131956392), C244013aV.A0E(r6, 2131956391)});
        AnonymousClass3XV r0 = 2WX.A02;
        2V1 r5 = r6.A05;
        Context context = r5.A0C;
        int color = context.getColor(2Yu.A0C(context));
        Integer num = AnonymousClass05K.A00;
        2WX A0T = C51972G9s.A0T(AnonymousClass9JR.A00(C51971G9r.A0Z(G9t.A0y(C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, C51965G9l.A0Y(color), 4)), num, 0), AnonymousClass05K.A0Y, new J6I(this, 10), (String) null), AnonymousClass05K.A05, 0, C51969G9p.A0B()), 0, C51970G9q.A0C());
        long A0D = C51970G9q.A0D();
        C67832Mva A002 = HSQ.A00(r6, C51965G9l.A0e(A0D), C51965G9l.A0e(A0D), C51965G9l.A0e(A0D));
        long A0D2 = C51969G9p.A0D();
        AnonymousClass3AS r15 = C336767f9.A00;
        2Sa r7 = r5.A02.A01;
        AnonymousClass3X7 r14 = r7.A02;
        boolean z = r7.A0W;
        C336547en r8 = new C336547en(r5);
        r8.A01(A0s, J1Y.A00, new C59112J6u(this, 3));
        return new C336707f3(r15, A002, (C331097Pn) null, (C249403jg) null, A0T, (C334327b5) null, C336677f0.A01(r5, r14, num, 0, AnonymousClass972.MUTABLE_FLAG_MASK, G9t.A0i(r6, A0D2), false, z), r8.A01, (C334997cD) null, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false);
    }

    public C53763Gts(UserSession userSession, String str, String str2, String str3, 0sP r5) {
        AnonymousClass7TG.A1O(userSession, r5);
        this.A00 = userSession;
        this.A04 = r5;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }
}
