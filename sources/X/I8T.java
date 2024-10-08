package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class I8T implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ I00 A04;
    public final /* synthetic */ C59631JQz A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public I8T(Context context, AnonymousClass07i r2, UserSession userSession, 1Xj r4, I00 i00, C59631JQz jQz, String str, String str2) {
        this.A04 = i00;
        this.A07 = str;
        this.A06 = str2;
        this.A03 = r4;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r2;
        this.A05 = jQz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        I00 i00 = this.A04;
        0Aj A0e = AnonymousClass7TE.A0e(i00.A01, "instagram_shopping_merchant_product_tag_removed");
        A0e.A9F("product_id", Long.valueOf(i00.A00));
        A0e.AAE(C263944Ny.A00(i00.A03), "merchant_id");
        A0e.A7p("is_checkout_enabled", Boolean.valueOf(i00.A04));
        1Xj r2 = i00.A02;
        C51974G9v.A0p(A0e, r2, "m_pk", r2.getId());
        A0e.Cgf();
        String str = this.A07;
        String str2 = this.A06;
        1Xj r8 = this.A03;
        UserSession userSession = this.A02;
        Context context = this.A00;
        AnonymousClass07i r3 = this.A01;
        C59631JQz jQz = this.A05;
        1NY A0M = DbU.A0M(userSession);
        String A30 = r8.A30();
        if (A30 != null) {
            DbU.A1P(A0M, "commerce/media/%s/remove_product_tag_from_influencer/", new Object[]{A30});
            A0M.A04();
            A0M.A0Q(C61290K1b.class, C64024LJl.class);
            A0M.A9m("product_id", str);
            1OC A0T = DbT.A0T(A0M, "merchant_id", str2);
            A0T.A00 = new H4O(context, r8, jQz, str, 1);
            1ES.A00(context, r3, A0T);
            dialogInterface.dismiss();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
