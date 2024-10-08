package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.Map;

/* renamed from: X.GvM  reason: case insensitive filesystem */
public final class C53855GvM extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass3OA A01;
    public final JQA A02;
    public final C229382nI A03;
    public final 1Xj A04;
    public final C59659JSd A05;
    public final String A06;
    public final Map A07;
    public final boolean A08;
    public final boolean A09;

    public C53855GvM(JQA jqa, C229382nI r3, UserSession userSession, 1Xj r5, AnonymousClass3OA r6, C59659JSd jSd, String str, Map map, boolean z, boolean z2) {
        C51973G9u.A0s(2, r3, map, jSd);
        this.A01 = r6;
        this.A03 = r3;
        this.A00 = userSession;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = str;
        this.A07 = map;
        this.A05 = jSd;
        this.A02 = jqa;
        this.A04 = r5;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r25) {
        IgShowreelComposition Bw9;
        C257853y4 r0;
        C251263mp gx4;
        AnonymousClass3Y5 r7 = r25;
        0qQ.A0B(r7, 0);
        2Wa A002 = C243643Zq.A00(r7, C58582IuF.A00);
        AnonymousClass3OA r8 = this.A01;
        C257643xj r02 = r8.A06;
        if (r02 == null || (Bw9 = r02.Bw9()) == null) {
            throw AnonymousClass7TE.A0z("Expected a valid ShowreelComposition");
        }
        2Wa A003 = C243643Zq.A00(r7, new C58676Ivl(Bw9, 34));
        boolean z = false;
        String str = (String) AnonymousClass3Zw.A00(r7, new C58676Ivl(this, 35), new Object[]{r8.A0S, r8.A0j});
        Object obj = A003.A03;
        AnonymousClass6Q8 r11 = (AnonymousClass6Q8) AnonymousClass3Zw.A00(r7, new C58694Iw3(str, A003, 33), new Object[]{str, obj});
        AnonymousClass6LP r12 = (AnonymousClass6LP) AnonymousClass3Zw.A00(r7, new C58693Iw2(9, this, r11), new Object[]{r11});
        IZD izd = (IZD) AnonymousClass3Zw.A00(r7, new C58693Iw2(8, this, r7), new Object[0]);
        C244173al r1 = new C244173al((String) null, new TY5(new C58750Iwx(1, A002, r12, izd), 19));
        2V1 r4 = r7.A05;
        2Vz r03 = r4.A05;
        r03.getClass();
        r03.A01 = r1;
        if (A002.A03 != null) {
            gx4 = new AnonymousClass3XA();
        } else {
            1Xj r04 = this.A04;
            if ((r04 != null && r04.CeS()) || !((r0 = r8.A0I) == null || r0.BUi() == null)) {
                z = true;
            }
            String AqT = ((IgShowreelComposition) obj).AqT();
            C229382nI r14 = this.A03;
            UserSession userSession = this.A00;
            boolean z2 = this.A09;
            boolean z3 = this.A08;
            String str2 = this.A06;
            Map map = this.A07;
            IZD izd2 = izd;
            gx4 = new C53960Gx4(r11, r12, this.A02, r14, userSession, izd2, this.A05, AqT, str2, map, z2, z, z3);
        }
        0tS A0h = DbT.A0h();
        boolean A0c = A0h.A0c();
        boolean A0d = A0h.A0d();
        if (!A0c && !A0d) {
            return gx4;
        }
        String A0t = 0rw.A0t(002.A11(C273654mx.A00(1021), r11.A01, C273654mx.A00(1022), r11.A04, C273654mx.A00(430)));
        AnonymousClass3XV r05 = 2WX.A02;
        2WX A0L = C51974G9v.A0L((2WX) null, AnonymousClass05K.A01);
        return C51967G9n.A0Q(new C53941Gwl(A0t, A0c, A0d), G9t.A0v(gx4, r4), r7, A0L);
    }
}
