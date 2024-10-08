package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;

public final class MJC extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJC(Object obj, Object obj2, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = z;
        this.A01 = obj2;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Integer num;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        String str;
        switch (this.A00) {
            case 0:
                C65329LrS lrS = (C65329LrS) this.A02;
                MXF mxf = lrS.A00;
                if (this.A04) {
                    num = AnonymousClass05K.A0U;
                } else {
                    num = AnonymousClass05K.A0T;
                }
                HashMap A1E = AnonymousClass7TE.A1E();
                C64808LiT liT = (C64808LiT) this.A01;
                C64127LPb.A00(C61220JzD.A00(liT.A01, A1E, liT.A00), mxf, num, (String) null, (String) null, A1E);
                String str2 = this.A03;
                KUQ kuq = (KUQ) liT;
                kuq.A00(!kuq.A03);
                C60327JjW jjW = lrS.A02;
                C61220JzD jzD = kuq.A01;
                0qQ.A0B(str2, 0);
                jjW.A07.A0B(jzD, str2, true);
                if (kuq.A03) {
                    C65329LrS.A00(lrS, new C65454Ltc(new LE6(2131975851, new C73673Phm(kuq, lrS, str2, 23), 2131966631)));
                    break;
                }
                break;
            case 1:
                C16236Uqz uqz = (C16236Uqz) this.A02;
                C16236Uqz.A03(uqz);
                AnonymousClass326 r2 = uqz.A03;
                String valueOf = String.valueOf(((C68282N8v) this.A01).A02);
                if (this.A04) {
                    featuredProductPermissionStatus = FeaturedProductPermissionStatus.APPROVED;
                } else {
                    featuredProductPermissionStatus = FeaturedProductPermissionStatus.DECLINED;
                }
                X9C x9c = uqz.A04;
                Product product = x9c.Bz5().A08;
                0qQ.A0A(product);
                String str3 = product.A0H;
                Product product2 = x9c.Bz5().A08;
                0qQ.A0A(product2);
                User user = product2.A0B;
                if (user != null) {
                    str = AnonymousClass3ZA.A00(user);
                } else {
                    str = null;
                }
                0qQ.A0A(str);
                r2.A02(featuredProductPermissionStatus, valueOf, str3, str, this.A03);
                break;
            default:
                UserSession userSession = ((C63951LEt) this.A02).A00;
                AnonymousClass0iw r1 = (AnonymousClass0iw) this.A01;
                0qQ.A0B(r1, 2);
                if (!this.A04) {
                    DbZ.A1R(AnonymousClass0kN.A01(r1, userSession), "instagram_shopping_auto_highlight_disabled");
                    break;
                } else {
                    String str4 = this.A03;
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "instagram_shopping_auto_highlight_enabled");
                    if (A0e.isSampled()) {
                        C51965G9l.A1I(A0e, str4);
                        A0e.Cgf();
                        break;
                    }
                }
                break;
        }
        return C60340gF.A00;
    }
}
