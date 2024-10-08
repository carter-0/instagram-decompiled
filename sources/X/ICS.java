package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ICS implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public ICS(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj3;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj4;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        String str;
        ProductCollectionFooterLink productCollectionFooterLink;
        String str2;
        String str3;
        Long l;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(-1694272176);
                LRN lrn = (LRN) this.A02;
                User user = (User) this.A03;
                String id = user.getId();
                String str4 = this.A05;
                0qQ.A0B(str4, 1);
                lrn.A01.A02(LRN.A00(lrn, (Boolean) null, (Boolean) null, AnonymousClass05K.A0N, AnonymousClass05K.A03, (Long) null, str4, id, (List) null), lrn.A00.A03);
                K8G k8g = (K8G) this.A04;
                Activity activity = (Activity) this.A01;
                C49174Eqf.A00(activity, activity, k8g, k8g, AnonymousClass7TE.A0l(k8g.A08), new C51032FnO(activity, 0), user);
                i = -1454836701;
                break;
            case 1:
                A052 = AnonymousClass0fD.A05(770863999);
                UserSession userSession = (UserSession) this.A04;
                String str5 = this.A05;
                C71093OcF A012 = ORV.A01((Activity) this.A01, (AnonymousClass0iw) this.A02, userSession, C14068TpH.BCN_POST_TIFU, C16677UzD.MEDIA, str5);
                A012.A03 = new C57473IbH(userSession, str5, (0sP) this.A03);
                C71093OcF.A00((C331157Pu) null, A012);
                i = -279180885;
                break;
            case 2:
                A052 = AnonymousClass0fD.A05(1745880413);
                C15697Uh3 uh3 = (C15697Uh3) this.A02;
                C15433Ucj ucj = (C15433Ucj) this.A03;
                List list = ucj.A02;
                Product product = (Product) this.A04;
                String str6 = this.A05;
                String id2 = ucj.getId();
                if (0qQ.A0K(str6, id2)) {
                    id2 = null;
                }
                String A1F = C51966G9m.A1F(this.A01);
                0qQ.A0B(A1F, 4);
                FragmentActivity requireActivity = uh3.A0I.requireActivity();
                UserSession userSession2 = uh3.A0O;
                1Xj r6 = uh3.A0Q;
                1Nv r5 = uh3.A08;
                if (r5 != null) {
                    WWU wwu = uh3.A04;
                    if (wwu != null) {
                        HWG.A00(requireActivity, userSession2, wwu, r5, r6, uh3, product, A1F, str6, id2, (String) null, list, uh3.A0S);
                        i = -287168623;
                        break;
                    } else {
                        str = "insightProcessor";
                    }
                } else {
                    str = "impressionItem";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 3:
                A052 = AnonymousClass0fD.A05(1352533047);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                AnonymousClass0iw r52 = (AnonymousClass0iw) this.A02;
                String str7 = this.A05;
                C71110Ocp.A00.A06(fragmentActivity, GPK.NOTE_THREE_DOT, r52, (UserSession) this.A04, (ContentNoteMetadata) this.A03, str7, false);
                i = 104706610;
                break;
            default:
                A052 = AnonymousClass0fD.A05(-901460579);
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.A01;
                String str8 = this.A05;
                1Xj r8 = (1Xj) this.A03;
                UserSession userSession3 = (UserSession) this.A04;
                ArrayList arrayList = ((ProductCollectionFooter) this.A02).A01;
                if (!arrayList.isEmpty() && (productCollectionFooterLink = (ProductCollectionFooterLink) arrayList.get(0)) != null) {
                    AnonymousClass47L r0 = AnonymousClass47L.AD_DESTINATION_WEB;
                    AnonymousClass47L r2 = productCollectionFooterLink.A00;
                    if (r0 == r2) {
                        str2 = productCollectionFooterLink.A02;
                        str3 = "webclick";
                    } else if (AnonymousClass47L.AD_DESTINATION_DEEPLINK == r2) {
                        str2 = productCollectionFooterLink.A01;
                        str3 = "deeplink";
                    } else {
                        throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(productCollectionFooterLink, "Unexpected value for footerLink: ", AnonymousClass7TE.A1A()));
                    }
                    String id3 = r8.getId();
                    String A0I = C231122qu.A0I(userSession3, id3);
                    ITW itw = new ITW(str8);
                    User A2A = r8.A2A(userSession3);
                    A2A.getClass();
                    0wc A013 = AnonymousClass0kN.A01(itw, userSession3);
                    String A07 = C231122qu.A07(userSession3, r8);
                    0Aj A0e = AnonymousClass7TE.A0e(A013, "instagram_ad_shop_collection_action");
                    DbS.A1J(A0e, str3);
                    A0e.AAJ("from", Pxd.A00(880));
                    C51965G9l.A1L(A0e, A0I);
                    A0e.AAJ("url", str2);
                    if (A07 != null) {
                        l = Long.valueOf(A07);
                    } else {
                        l = null;
                    }
                    C51965G9l.A1D(A0e, l);
                    A0e.AAJ("follow_status", A2A.B6o().toString());
                    A0e.AAJ("author_id", A2A.getId());
                    C51965G9l.A1J(A0e, r8.getId());
                    A0e.AAJ("source_of_action", Pxd.A00(19));
                    A0e.Cgf();
                    String str9 = id3;
                    String str10 = str2;
                    FH7.A07(fragmentActivity2, userSession3, productCollectionFooterLink.A00, (2EG) null, str10, str9, str8, (String) null, (String) null, Collections.emptyList());
                }
                i = -706450258;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
