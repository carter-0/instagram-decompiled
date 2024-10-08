package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Pmz  reason: case insensitive filesystem */
public final class C73981Pmz extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Object obj2 = obj;
        if (this.A00 != 0) {
            C254783t2 r3 = (C254783t2) obj2;
            List list = (List) this.A02;
            String str2 = this.A08;
            0qQ.A0A(r3);
            0qQ.A0B(list, 0);
            String str3 = this.A07;
            C255773uh r5 = (C255773uh) this.A03;
            LOD lod = (LOD) this.A04;
            C311506cn.A00(new DirectShareTarget(r3, str2, list, DbW.A1Y(r3)), r5, (C250973mM) this.A01, lod, (C311506cn) this.A05, str3);
        } else {
            NAY nay = (NAY) obj2;
            0qQ.A0B(nay, 0);
            String str4 = this.A08;
            Long BST = ((User) this.A04).BST();
            if (BST != null) {
                long longValue = BST.longValue();
                List list2 = (List) this.A05;
                List list3 = (List) this.A03;
                String str5 = this.A06;
                if (((0r1) this.A02).A00) {
                    str = null;
                } else {
                    str = this.A07;
                }
                C71721Opf opf = new C71721Opf(45, (0sP) this.A01);
                AnonymousClass68L A0I = C66581MXm.A0I(nay);
                MailboxFutureImpl A0J = C66581MXm.A0J(A0I, opf);
                C66582MXn.A1E(A0I, new C71690OpA(nay, A0J, str4, str5, str, list2, list3, longValue), A0J);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73981Pmz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A08 = str;
        this.A04 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A06 = str2;
        this.A02 = obj4;
        this.A07 = str3;
        this.A01 = obj5;
    }
}
