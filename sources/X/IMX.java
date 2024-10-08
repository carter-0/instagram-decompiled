package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class IMX implements C270674h7 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void D3t(C52228GJt gJt) {
    }

    public IMX(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final void D3r(H3D h3d) {
        List list;
        switch (this.A00) {
            case 0:
                list = (List) this.A02;
                list.clear();
                ((C55857Hoe) this.A03).A01.Epw("0");
                break;
            case 1:
                list = (List) this.A02;
                list.clear();
                break;
            default:
                0qQ.A0B(h3d, 0);
                ((C55879Hp0) this.A03).A00.A0T(h3d.A01);
                return;
        }
        C51975G9x.A1D(this.A01, list);
    }

    public final void D3s() {
    }

    public final void D3u(C52263GLe gLe) {
        ImageUrl imageUrl;
        switch (this.A00) {
            case 0:
                0qQ.A0B(gLe, 0);
                C55857Hoe hoe = (C55857Hoe) this.A03;
                05G r1 = hoe.A01;
                C298835u7 r2 = gLe.A01;
                r1.Epw(((C54193H2n) r2).A02);
                AnonymousClass7TF.A1O(hoe.A02, ((C298815u5) r2).BaP().BU8());
                List list = (List) this.A02;
                list.addAll(gLe.A09);
                C51975G9x.A1D(this.A01, list);
                return;
            case 1:
                0qQ.A0B(gLe, 0);
                boolean z = gLe.A0D;
                if (z) {
                    C55874Hov hov = (C55874Hov) this.A03;
                    05G r12 = hov.A03;
                    C43879CGt cGt = (C43879CGt) gLe.A01;
                    r12.Epw(cGt.A01);
                    hov.A01.Epw(cGt.A00);
                }
                C55874Hov hov2 = (C55874Hov) this.A03;
                AnonymousClass7TF.A1O(hov2.A02, ((C298815u5) gLe.A01).BaP().BU8());
                AnonymousClass7TF.A1O(hov2.A04, z);
                List list2 = (List) this.A02;
                list2.addAll(gLe.A09);
                C51975G9x.A1D(this.A01, list2);
                return;
            default:
                0qQ.A0B(gLe, 0);
                boolean z2 = gLe.A0D;
                if (z2) {
                    String str = ((C43877CGr) gLe.A01).A00;
                    if (str == null) {
                        str = "";
                    }
                    Object obj = gLe.A09.get(0);
                    C55879Hp0 hp0 = (C55879Hp0) this.A03;
                    C267324bN r22 = (C267324bN) obj;
                    UserSession userSession = hp0.A02;
                    String AyM = r22.AyM(userSession);
                    User A08 = r22.A08(userSession);
                    if (A08 != null) {
                        imageUrl = A08.A0D();
                    } else {
                        imageUrl = null;
                    }
                    if (!(AyM == null || imageUrl == null)) {
                        hp0.A05.Epw(new C53381GnB((C56078HsR) null, (C56078HsR) null, (ImageUrl) null, imageUrl, (Boolean) null, hp0.A03, AyM, str, 224));
                    }
                }
                C55879Hp0 hp02 = (C55879Hp0) this.A03;
                AnonymousClass7TF.A1O(hp02.A04, ((C298815u5) gLe.A01).BaP().BU8());
                AnonymousClass7TF.A1O(hp02.A06, z2);
                List list3 = (List) this.A02;
                list3.addAll(gLe.A09);
                C51975G9x.A1D(this.A01, list3);
                return;
        }
    }
}
