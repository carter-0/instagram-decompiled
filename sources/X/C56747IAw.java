package X;

import android.content.Context;
import android.view.View;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.IAw  reason: case insensitive filesystem */
public final /* synthetic */ class C56747IAw implements View.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C55835HoI A01;

    public /* synthetic */ C56747IAw(1Xj r1, C55835HoI hoI) {
        this.A01 = hoI;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        Object obj;
        User user;
        ProductDetailsProductItemDictIntf Bfu;
        C55835HoI hoI = this.A01;
        1Xj r8 = this.A00;
        AnonymousClass325 r7 = new AnonymousClass325(hoI.A00, hoI.A02, hoI.A03);
        Context requireContext = r7.A00.requireContext();
        FeaturedProductPermissionStatus featuredProductPermissionStatus = FeaturedProductPermissionStatus.APPROVED;
        1Xj A012 = C254423sS.A01(r8, featuredProductPermissionStatus);
        if (A012 != null) {
            Iterator it = C254423sS.A05(A012).iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C74546Pwf Bbg = ((C46292DTv) obj).Bbg();
                if (Bbg != null && Bbg.BzM() == featuredProductPermissionStatus) {
                    break;
                }
            }
            C46292DTv dTv = (C46292DTv) obj;
            if (dTv == null || (Bfu = dTv.Bfu()) == null) {
                user = null;
            } else {
                user = Bfu.BRo();
            }
            C358248ab A0Y = DbS.A0Y(requireContext);
            A0Y.A09(2131962242);
            int i = 2131962266;
            if (A012.BR7() == 1iA.A0Q) {
                i = 2131962240;
            }
            if (user != null) {
                str = user.A03.getUsername();
            }
            DbY.A0w(requireContext, A0Y, str, i);
            A0Y.A0P(new I8H(2, A012, r8, r7), C358278ae.RED, 2131971974);
            DbT.A1V(A0Y);
        }
    }
}
