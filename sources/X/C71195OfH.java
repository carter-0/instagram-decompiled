package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OfH  reason: case insensitive filesystem */
public final class C71195OfH implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C71195OfH(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String C6C;
        String str;
        Long BST;
        switch (this.A00) {
            case 0:
                User user = (User) this.A02;
                String str2 = this.A04;
                String str3 = this.A06;
                AnonymousClass73V.A0B((0wc) this.A01, user, "approval_page_approve_and_unrestrict", str2, str3, this.A05);
                C52971GgO ggO = (C52971GgO) this.A03;
                ggO.A0a(str2, str3);
                ggO.A0V(user, str2, str3);
                return;
            case 1:
                String str4 = this.A04;
                String str5 = this.A06;
                AnonymousClass73V.A0B((0wc) this.A01, (User) this.A02, "approval_page_approve_this_comment", str4, str5, this.A05);
                dialogInterface.dismiss();
                ((C52971GgO) this.A03).A0a(str4, str5);
                return;
            default:
                P9R p9r = (P9R) this.A03;
                C69497Nmf nmf = C69497Nmf.CONFIRM;
                String str6 = this.A05;
                C333517Zg r2 = (C333517Zg) this.A01;
                P9R.A05(nmf, (C70846ONz) this.A02, r2, str6);
                String str7 = this.A04;
                String str8 = this.A06;
                if (str6 != null && (C6C = r2.C6l().C6C()) != null) {
                    UserSession userSession = p9r.A05;
                    C66665MaY A08 = C66669Mac.A08(userSession, C66461nF.class);
                    User A0j = DbV.A0j(userSession, str8);
                    if (A0j == null || (BST = A0j.BST()) == null || (str = BST.toString()) == null) {
                        str = "";
                    }
                    0qQ.A0B(A08, 1);
                    1OS r0 = new 1OS(A08);
                    r0.A03 = C6C;
                    r0.A00 = str7;
                    r0.A01 = str;
                    r0.A02 = str6;
                    C66580MXl.A1P(userSession, r0);
                    return;
                }
                return;
        }
    }
}
