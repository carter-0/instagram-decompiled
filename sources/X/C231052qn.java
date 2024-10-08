package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.2qn  reason: invalid class name and case insensitive filesystem */
public final class C231052qn {
    public final 2el A00;
    public final C229932oe A01 = new C229932oe();
    public final C231082qq A02;
    public final C231102qs A03;

    public final void A01(View view, C268374dH r4, String str) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(str, 2);
        C229932oe r1 = this.A01;
        String A0R = 002.A0R(r4.getId(), str);
        0qQ.A07(A0R);
        this.A00.A05(view, r1.A00(A0R));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.V3X] */
    public final void A02(ProductFeedItem productFeedItem, C17524VZd vZd, String str) {
        0qQ.A0B(str, 1);
        ? obj = new Object();
        obj.A00 = productFeedItem;
        obj.A01 = str;
        C229932oe r5 = this.A01;
        String Bxn = vZd.A02.Bxn();
        String A0R = 002.A0R("product_pivot_impression_", productFeedItem.getId());
        if (Bxn != null) {
            A0R = 002.A0T(A0R, Bxn, '_');
        }
        String A0R2 = 002.A0R("product_pivot_impression_", productFeedItem.getId());
        if (Bxn != null) {
            A0R2 = 002.A0T(A0R2, Bxn, '_');
        }
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(obj, vZd, A0R2);
        r1.A00(this.A03);
        r5.A01(r1.A01(), A0R);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.V3Y, java.lang.Object] */
    public final void A03(C268374dH r8, String str, int i) {
        0qQ.A0B(str, 1);
        ? obj = new Object();
        obj.A00 = r8;
        obj.A01 = str;
        C229932oe r5 = this.A01;
        String A0R = 002.A0R(r8.getId(), str);
        0qQ.A07(A0R);
        Integer valueOf = Integer.valueOf(i);
        String A0R2 = 002.A0R(obj.A00.getId(), obj.A01);
        0qQ.A07(A0R2);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(obj, valueOf, A0R2);
        r1.A00(this.A02);
        r5.A01(r1.A01(), A0R);
    }

    public C231052qn(UserSession userSession, 2el r29, AnonymousClass4DU r30, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8 = str4;
        String str9 = str;
        2el r1 = r29;
        0qQ.A0B(r1, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        this.A00 = r1;
        AnonymousClass4DU r9 = r30;
        String str10 = str5;
        String str11 = str6;
        String str12 = str7;
        int i2 = i;
        C231062qo r17 = new C231062qo(userSession2, r9, str9, str3, str8, str10, str11, str12, i2);
        1Bk r2 = C229232n3.A00(userSession2).A00.A00;
        0qQ.A07(r2);
        this.A02 = new C231082qq(r2, new C231072qp(), r17);
        str9 = str == null ? "" : str9;
        1Bk r6 = C229232n3.A00(userSession2).A00.A00;
        0qQ.A07(r6);
        this.A03 = new C231102qs(r6, userSession2, new C231092qr(), r9, str9 == null ? "" : str9, str2, str4 == null ? "" : str8, str10, str11, str12, i2);
    }

    public final void A00(View view, ProductFeedItem productFeedItem, String str) {
        C229932oe r2 = this.A01;
        String A0R = 002.A0R("product_pivot_impression_", productFeedItem.getId());
        if (str != null) {
            A0R = 002.A0T(A0R, str, '_');
        }
        this.A00.A05(view, r2.A00(A0R));
    }
}
