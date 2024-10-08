package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

/* renamed from: X.JHa  reason: case insensitive filesystem */
public final class C59374JHa extends 0Yg implements 0sK {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C299665vd A01;
    public final /* synthetic */ C299575vQ A02;
    public final /* synthetic */ C299635va A03;
    public final /* synthetic */ C303846Ba A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59374JHa(LineType lineType, C299665vd r3, C299575vQ r4, C299635va r5, C303846Ba r6, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(3);
        this.A02 = r4;
        this.A0B = z;
        this.A05 = userSession;
        this.A01 = r3;
        this.A06 = str;
        this.A03 = r5;
        this.A07 = str2;
        this.A00 = lineType;
        this.A04 = r6;
        this.A09 = z2;
        this.A08 = z3;
        this.A0A = z4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        AnonymousClass6D0 A002;
        C286565Wx A0H;
        C286575Wy r13 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1258874037, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:605)");
            }
            C299605vT r8 = (C299605vT) this.A02;
            C299515vK r4 = r8.A02;
            0sP r3 = null;
            boolean z2 = true;
            if (r8.A08) {
                r13.ExS(63018369);
                UserSession A0f = C51970G9q.A0f(r13);
                z = this.A0B;
                A002 = C304316Cz.A01(A0f, (Integer) null, 2.0f, z);
                A0H = C51965G9l.A0H(r13, false);
            } else if (r8.A09) {
                r13.ExS(63368545);
                UserSession A0h = C51968G9o.A0h(r13);
                boolean z3 = r8.A00.A01;
                z = this.A0B;
                A002 = C304316Cz.A00(r4, A0h, 295, z3, z);
                A0H = C51965G9l.A0H(r13, false);
            } else {
                r13.ExS(63778303);
                UserSession A0h2 = C51968G9o.A0h(r13);
                boolean z4 = r8.A00.A01;
                Integer num = r8.A03;
                if (num == null || num.intValue() <= 0) {
                    num = null;
                }
                z = this.A0B;
                A002 = C304316Cz.A00(r4, A0h2, num, z4, z);
                A0H = C51965G9l.A0H(r13, false);
            }
            boolean z5 = r8.A05;
            if (!r8.A04 || r4.AXm() == null) {
                z2 = false;
            }
            UserSession userSession = this.A05;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36327696678206078L)) {
                r13.ExS(65058696);
                if (r8.A06) {
                    r13.ExS(65100732);
                    Object AJO = r13.AJO(AnonymousClass5YA.A05);
                    boolean A1Z = C51967G9n.A1Z(r13, AJO, -1660465161);
                    C299665vd r82 = this.A01;
                    boolean A1Z2 = C51965G9l.A1Z(r13, r82, A1Z);
                    String str = this.A06;
                    boolean A1Z3 = C51965G9l.A1Z(r13, str, A1Z2);
                    Object ECw = r13.ECw();
                    if (A1Z3 || ECw == AnonymousClass5XT.A00) {
                        ECw = C51970G9q.A0z(r13, AJO, r82, str, 10);
                    }
                    r3 = C51965G9l.A0z(A0H, ECw);
                    C286565Wx.A0L(A0H, false);
                } else {
                    r13.ExS(65445421);
                    r13.ExS(-1660456181);
                    C299665vd r32 = this.A01;
                    boolean AGu = r13.AGu(r32);
                    Object ECw2 = r13.ECw();
                    if (AGu || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = C59099J6h.A00(r13, r32, 44);
                    }
                    r3 = C51965G9l.A0z(A0H, ECw2);
                    C286565Wx.A0L(A0H, false);
                }
            } else if (r8.A07) {
                r13.ExS(65693204);
                r13.ExS(-1660448850);
                C299635va r9 = this.A03;
                boolean AGu2 = r13.AGu(r9);
                String str2 = this.A06;
                boolean A1X = C51972G9s.A1X(r13, str2, (Object) null, AGu2);
                String str3 = this.A07;
                boolean A1Z4 = C51965G9l.A1Z(r13, str3, A1X);
                Object ECw3 = r13.ECw();
                if (A1Z4 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C58753Ix0(r9, str2, str3, 2);
                    r13.FLL(ECw3);
                }
                r3 = C51965G9l.A0z(A0H, ECw3);
            } else {
                r13.ExS(66056306);
            }
            C286565Wx.A0L(A0H, false);
            String str4 = this.A06;
            LineType lineType = this.A00;
            C303846Ba r11 = this.A04;
            r13.ExS(-1660484863);
            C299665vd r10 = this.A01;
            boolean A1U = C51971G9r.A1U(r13, r10, (Object) null);
            String str5 = this.A07;
            boolean A1Z5 = C51965G9l.A1Z(r13, str5, A1U);
            Object ECw4 = r13.ECw();
            if (A1Z5 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = new C59363JGp(r10, (String) null, str5, 1);
                r13.FLL(ECw4);
            }
            0sK r0 = (0sK) ECw4;
            C286565Wx.A0L(A0H, false);
            boolean A1Z6 = G9t.A1Z(r13, r10, str4, -1660435649);
            Object ECw5 = r13.ECw();
            if (A1Z6 || ECw5 == AnonymousClass5XT.A00) {
                ECw5 = new J74(str4, r10, 3);
                r13.FLL(ECw5);
            }
            0sL A10 = C51965G9l.A10(A0H, ECw5);
            r13.ExS(-1660426993);
            C299635va r92 = this.A03;
            boolean AGu3 = r13.AGu(r92);
            Object ECw6 = r13.ECw();
            if (AGu3 || ECw6 == AnonymousClass5XT.A00) {
                ECw6 = C59099J6h.A00(r13, r92, 45);
            }
            C299515vK r18 = r4;
            C303846Ba r17 = r11;
            AnonymousClass6D1.A00(r13, (Modifier) null, lineType, A002, r17, r18, str4, (C62320sa) null, (C62320sa) null, r3, C51965G9l.A0z(A0H, ECw6), A10, r0, 0, 0, 159744, z, z5, z2, this.A09, this.A08, false, this.A0A);
            if (0fL.A02()) {
                0fL.A00(2029160725);
            }
        } else {
            r13.Evl();
        }
        return C60340gF.A00;
    }
}
