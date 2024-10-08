package X;

import android.content.Context;
import androidx.compose.ui.window.PopupLayout;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IoO  reason: case insensitive filesystem */
public final class C58220IoO extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58220IoO(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A05 = str;
        this.A01 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Long l;
        switch (this.A00) {
            case 0:
                ((PopupLayout) this.A03).A0B((AnonymousClass5Q8) this.A01, (C56020HrS) this.A04, this.A05, (C62320sa) this.A02);
                break;
            case 1:
                LHV.A01((Context) this.A01, (C307896Rx) this.A02, (C277014uI) this.A03, (UserSession) this.A04, this.A05);
                break;
            case 2:
                C333717a0 r4 = (C333717a0) this.A03;
                String str = this.A05;
                List list = (List) this.A04;
                AnonymousClass7TG.A1N(str, list);
                I21.A00.A02(r4.A02);
                C333717a0.A02(r4, "restrict_accounts_action", str, list);
                ((05G) this.A01).Epw(new AnonymousClass9IW(00k.A0a((Iterable) this.A02)));
                break;
            case 3:
                X9C x9c = ((C16239Ur2) this.A04).A03;
                W2j w2j = new W2j(x9c.Bz5());
                C18570VuM vuM = new C18570VuM(x9c.Bz5().A04);
                vuM.A04.put(((C16272UrZ) ((C18001Vjd) this.A03)).A02, C16605Uxz.FAILED);
                w2j.A04 = new W1L(vuM);
                x9c.Elq(new C18588Vuf(w2j));
                C74546Pwf Bbg = ((C46292DTv) this.A01).Bbg();
                String str2 = null;
                if (Bbg != null) {
                    l = Bbg.BEY();
                } else {
                    l = null;
                }
                String.valueOf(l);
                0qQ.A0A(x9c.Bz5().A08);
                Product product = x9c.Bz5().A08;
                0qQ.A0A(product);
                User user = product.A0B;
                if (user != null) {
                    str2 = AnonymousClass3ZA.A00(user);
                }
                0qQ.A0A(str2);
                break;
            case 4:
                AnonymousClass325.A02((AnonymousClass325) this.A04);
                1Xj r2 = (1Xj) this.A01;
                String id = r2.getId();
                if (id != null) {
                    if (r2.A5D()) {
                        0qQ.A0A(r2.A1f(id));
                    }
                    ((JQL) this.A03).DeI();
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            default:
                ((C49726F3q) this.A02).A03(new C58210IoE(this.A01, this.A04, this.A03, this.A05, 19));
                break;
        }
        return C60340gF.A00;
    }
}
