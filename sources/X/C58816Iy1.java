package X;

import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.Iy1  reason: case insensitive filesystem */
public final class C58816Iy1 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58816Iy1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i) {
        super(1);
        this.A00 = i;
        this.A07 = obj;
        this.A08 = str;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A03 = obj7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            IIT iit = (IIT) obj2;
            0qQ.A0B(iit, 0);
            List list = (List) this.A01;
            J52 j52 = J52.A00;
            String str = this.A08;
            FoaUserSession foaUserSession = (FoaUserSession) this.A03;
            C59143J7z j7z = new C59143J7z(foaUserSession, this.A06, this.A07, str, 3);
            0qQ.A0B(j52, 1);
            if (list.iterator().hasNext()) {
                iit.A02.add(new C57539IcR(list, j52, j7z));
            }
            C251263mp r1 = (C251263mp) this.A05;
            if (r1 != null) {
                iit.A00(r1);
            }
            C251263mp r12 = (C251263mp) this.A04;
            if (r12 != null) {
                iit.A00(r12);
            }
            C49949FGe.A00.A05(foaUserSession);
            C251263mp r0 = (C251263mp) this.A02;
            if (r0 != null) {
                iit.A00(r0);
            }
        } else {
            C305006Gb r3 = (C305006Gb) obj2;
            0qQ.A0B(r3, 0);
            String str2 = this.A08;
            Object obj3 = this.A05;
            Object obj4 = this.A06;
            Object obj5 = this.A01;
            r3.Ey2((Object) null, (Object) null, AnonymousClass5PI.A04(new JH9(obj5, obj3, this.A04, obj4, str2, 0), -1211286911, true));
            C61040Jve jve = (C61040Jve) this.A07;
            boolean z = jve.A05;
            if (!z) {
                C51967G9n.A10(r3, new JJU(14, this.A02, jve), 1042818072);
            }
            if (jve.A04) {
                r3.Cf4((Object) null, C55308Hfb.A00);
            } else if (z) {
                Object obj6 = this.A02;
                C51967G9n.A10(r3, new JJU(15, obj6, jve), -804180784);
                List list2 = (List) jve.A01;
                JET jet = JET.A00;
                Object obj7 = this.A03;
                r3.CfA(new C59103J6l(21, (Object) list2, (Object) jet), new MP6(list2, 5), AnonymousClass5PI.A04(new JK1(1, obj7, obj5, (Object) list2), -1091073711, true), list2.size());
                if (AnonymousClass7TE.A1b(list2)) {
                    C51967G9n.A10(r3, new JJU(16, obj6, jve), 1166520427);
                }
            }
        }
        return C60340gF.A00;
    }
}
