package X;

import com.instagram.common.session.UserSession;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LeT  reason: case insensitive filesystem */
public final class C64585LeT implements AnonymousClass0iw, MUI {
    public static final String __redex_internal_original_name = "ProductTagSuggestionsRowDelegate";
    public final UserSession A00;
    public final C3499582p A01;
    public final C3499682q A02;
    public final KO3 A03;
    public final LP7 A04;
    public final String A05;
    public final 0sL A06;

    public final void D22(MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
        String str;
        String str2;
        ArrayList arrayList;
        0sL r5 = this.A06;
        UserSession userSession = this.A00;
        Iterator A0w = JTP.A0w(this.A01.A00());
        loop0:
        while (true) {
            if (!A0w.hasNext()) {
                str = null;
                break;
            }
            AnonymousClass3Q2 A0U = JTS.A0U(userSession, A0w);
            if (!(A0U == null || (arrayList = A0U.A43) == null)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (0qQ.A0K(JTU.A0Y(it), mediaSuggestedProductTag.getId())) {
                        str = A0U.A3t;
                        break loop0;
                    }
                }
                continue;
            }
        }
        r5.invoke(str, "product_suggestion_cell");
        Product A07 = mediaSuggestedProductTag.A07();
        if (A07 != null) {
            String str3 = this.A05;
            String str4 = A07.A0H;
            String A0r = DbX.A0r(A07.A0B);
            Float A08 = mediaSuggestedProductTag.A08();
            if (LRu.A02(userSession, this.A02, this.A03.A00, this.A04)) {
                str2 = "opt";
            } else {
                str2 = "seller";
            }
            LTQ.A07(this, userSession, A08, str3, str4, A0r, "feed", str2, i);
        }
    }

    public final void DkO(boolean z, int i) {
        ArrayList arrayList = this.A03.A04().A43;
        if (arrayList != null && !arrayList.isEmpty()) {
            UserSession userSession = this.A00;
            String str = this.A05;
            int i2 = i;
            LTQ.A05(LTQ.A00(arrayList), C64832Lit.A04.A00(userSession).A00(str, str), this, userSession, str, i2, this.A02.COf(), z);
        }
    }

    public final String getModuleName() {
        return "media_broadcast_share";
    }

    public C64585LeT(UserSession userSession, C3499582p r2, C3499682q r3, KO3 ko3, LP7 lp7, String str, 0sL r7) {
        this.A03 = ko3;
        this.A00 = userSession;
        this.A02 = r3;
        this.A05 = str;
        this.A01 = r2;
        this.A04 = lp7;
        this.A06 = r7;
    }
}
