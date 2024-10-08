package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UfG  reason: case insensitive filesystem */
public final class C15588UfG extends 1P0 {
    public final /* synthetic */ C17827Vgg A00;
    public final /* synthetic */ C323426xT A01;

    public C15588UfG(C17827Vgg vgg, C323426xT r2) {
        this.A01 = r2;
        this.A00 = vgg;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-157411856);
        C323426xT r3 = this.A01;
        C323426xT.A02(r3.A03(), r3, C16508Uw5.FAILED, false);
        AnonymousClass0fD.A0A(1911929637, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        MultiProductComponent multiProductComponent;
        String A002;
        int i;
        int A03 = AnonymousClass0fD.A03(791107876);
        CG7 cg7 = (CG7) obj;
        int A032 = AnonymousClass0fD.A03(927756478);
        C323426xT r5 = this.A01;
        C323486xZ r7 = r5.A07;
        0qQ.A0B(cg7, 0);
        C323486xZ.A03(r7, cg7.A02, cg7.A01);
        Iterator A0o = DbY.A0o(cg7.A02);
        while (A0o.hasNext()) {
            C45393CvZ cvZ = (C45393CvZ) A0o.next();
            User user = cvZ.A01;
            if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                throw DbU.A0h();
            }
            Map map = r7.A0C;
            C18071Vky A06 = r7.A06(A002);
            if (A06 != null) {
                i = A06.A00;
            } else {
                i = cvZ.A00;
            }
            C66580MXl.A1T(A002, map, i);
            Number A14 = C51966G9m.A14(A002, map);
            if (A14 != null) {
                cvZ.A00 = A14.intValue();
            }
            r7.A01 = cvZ.A02;
            r7.A0D.put(A002, cvZ.A03);
        }
        C323486xZ.A02(r7);
        LinkedHashMap linkedHashMap = r5.A05;
        if (linkedHashMap == null) {
            r5.A05 = new LinkedHashMap();
        } else {
            linkedHashMap.clear();
        }
        LinkedHashMap linkedHashMap2 = r5.A04;
        if (linkedHashMap2 == null) {
            r5.A04 = new LinkedHashMap();
        } else {
            linkedHashMap2.clear();
        }
        Iterator A0o2 = DbY.A0o(cg7.A02);
        while (A0o2.hasNext()) {
            C45393CvZ cvZ2 = (C45393CvZ) A0o2.next();
            if (cvZ2.A00 > 0) {
                r5.A05.put(AnonymousClass3ZA.A00(cvZ2.A01), cvZ2);
            }
        }
        Iterator A0o3 = DbY.A0o(cg7.A01);
        while (A0o3.hasNext()) {
            C18622VvF vvF = (C18622VvF) A0o3.next();
            r5.A04.put(AnonymousClass3ZA.A00(vvF.A05), vvF);
        }
        if (C51966G9m.A1J(cg7.A03).isEmpty()) {
            multiProductComponent = null;
        } else {
            multiProductComponent = (MultiProductComponent) C51966G9m.A1J(cg7.A03).get(0);
        }
        r5.A01 = multiProductComponent;
        r5.A00 = cg7.A00;
        C323426xT.A02(r5.A03(), r5, C16508Uw5.LOADED, false);
        C17827Vgg vgg = this.A00;
        if (vgg != null) {
            vgg.A00();
        }
        AnonymousClass0fD.A0A(270974100, A032);
        AnonymousClass0fD.A0A(852667036, A03);
    }
}
