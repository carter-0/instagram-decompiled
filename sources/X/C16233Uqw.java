package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uqw  reason: case insensitive filesystem */
public final class C16233Uqw extends VP2 {
    public final C18782W1i A00;
    public final X9C A01;
    public final C18020Vjw A02;

    public final void A00(1XO r29, C15248UXi uXi, Integer num, String str, String str2) {
        String A002;
        String str3;
        String A003;
        Product product = this.A01.Bz5().A08;
        0qQ.A0A(product);
        Integer num2 = num;
        String A004 = VHK.A00(product, num2);
        if (num2 == AnonymousClass05K.A0C) {
            C18782W1i w1i = this.A00;
            Product product2 = w1i.A0B.Bz5().A08;
            if (product2 != null) {
                ArrayList arrayList = new ArrayList();
                String str4 = "";
                1XO r7 = r29;
                String str5 = str2;
                String str6 = str;
                if (r29 != null) {
                    Iterator it = r7.A06.iterator();
                    while (it.hasNext()) {
                        String A0v = C51971G9r.A0v(it);
                        if (A0v != null) {
                            arrayList.add(A0v);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C249713kF r20 = C249713kF.A00;
                    FragmentActivity fragmentActivity = w1i.A05;
                    UserSession userSession = w1i.A08;
                    AnonymousClass4DU r3 = w1i.A09;
                    ProductDetailsPageLoggingInfo A005 = C18782W1i.A00(w1i);
                    String str7 = w1i.A0J;
                    User user = product2.A0B;
                    if (!(user == null || (A003 = AnonymousClass3ZA.A00(user)) == null)) {
                        str4 = A003;
                    }
                    r20.A0v(fragmentActivity, userSession, r3, new FeaturedProductMediaFeedGridConfiguration(str5, A004, str4, r7.A04, (String) null, (String) null, (String) null, 0sr.A1P(new FeaturedProductPermissionStatus[]{FeaturedProductPermissionStatus.APPROVED, FeaturedProductPermissionStatus.PENDING}), arrayList, true), A005, str6, str7);
                    return;
                }
                C15248UXi uXi2 = uXi;
                if (uXi != null) {
                    HashSet hashSet = new HashSet();
                    List<1Xg> list = uXi2.A01;
                    if (list != null) {
                        for (1Xg r8 : list) {
                            1UQ r5 = r8.A06;
                            if (r5 == 1UQ.A0Y) {
                                AnonymousClass1Xn r32 = r8.A05;
                                if (1Xi.A02(r32) != null) {
                                    1Xj A022 = 1Xi.A02(r32);
                                    if (A022 == null || (str3 = A022.getId()) == null) {
                                        str3 = str4;
                                    }
                                    arrayList.add(str3);
                                }
                            }
                            if (r5 == 1UQ.A0d) {
                                AnonymousClass1Xn r33 = r8.A05;
                                String A006 = AnonymousClass000.A00(37);
                                0qQ.A0C(r33, A006);
                                if (r33 != null) {
                                    0qQ.A0C(r33, A006);
                                    hashSet.add(r33);
                                }
                            }
                        }
                        UserSession userSession2 = w1i.A08;
                        C268334dD.A00(userSession2).A00(hashSet);
                        C249713kF r202 = C249713kF.A00;
                        FragmentActivity fragmentActivity2 = w1i.A05;
                        AnonymousClass4DU r34 = w1i.A09;
                        ProductDetailsPageLoggingInfo A007 = C18782W1i.A00(w1i);
                        String str8 = w1i.A0J;
                        User user2 = product2.A0B;
                        if (!(user2 == null || (A002 = AnonymousClass3ZA.A00(user2)) == null)) {
                            str4 = A002;
                        }
                        r202.A0w(fragmentActivity2, userSession2, r34, new FeaturedProductMediaFeedGridConfiguration(str5, A004, str4, uXi2.A00, (String) null, (String) null, (String) null, 0sr.A1P(new FeaturedProductPermissionStatus[]{FeaturedProductPermissionStatus.APPROVED, FeaturedProductPermissionStatus.PENDING}), arrayList, true), A007, str6, str8);
                        return;
                    }
                    0qQ.A0F("mediaFeed");
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16233Uqw(C18782W1i w1i, X9C x9c, C18020Vjw vjw) {
        super(vjw);
        AnonymousClass7TG.A1Q(w1i, vjw);
        this.A02 = vjw;
        this.A01 = x9c;
        this.A00 = w1i;
    }
}
