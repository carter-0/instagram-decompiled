package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.List;

/* renamed from: X.VvA  reason: case insensitive filesystem */
public final class C18617VvA {
    public final 2el A00;
    public final C15895UkJ A01;
    public final C229932oe A02 = new C229932oe();
    public final C17909Vi0 A03;
    public final C17984VjM A04;
    public final C15890UkE A05;
    public final C15903UkR A06;
    public final C15900UkO A07;
    public final List A08;

    public C18617VvA(UserSession userSession, 2el r16, AnonymousClass4DU r17, C231112qt r18, String str, String str2, String str3, String str4, List list) {
        C17984VjM vjM;
        C231112qt r11 = r18;
        0qQ.A0B(r11, 10);
        this.A00 = r16;
        this.A08 = list;
        AnonymousClass4DU r5 = r17;
        String str5 = str2;
        C17909Vi0 vi0 = new C17909Vi0(userSession, r5, str, str5, str3, str4);
        this.A03 = vi0;
        this.A05 = new C15890UkE(C13988Tno.A0K(userSession), new C19311WTt(0), vi0);
        this.A06 = new C15903UkR(C13988Tno.A0K(userSession), new C19311WTt(1), vi0);
        this.A01 = new C15895UkJ(userSession, r5, r11, str5);
        if (C55146Hcu.A00(r5.getModuleName())) {
            vjM = new C17984VjM(userSession, r5);
        } else {
            vjM = null;
        }
        this.A04 = vjM;
        this.A07 = new C15900UkO(userSession, r5, r11, vjM, str5);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.V3x] */
    public static final AnonymousClass30Y A00(C17372VSz vSz, UO3 uo3, C18617VvA vvA, String str) {
        C2354830a r2;
        ProductFeedItem productFeedItem = uo3.A02;
        int intValue = productFeedItem.A06.intValue();
        if (intValue == 0) {
            MultiProductComponent multiProductComponent = productFeedItem.A01;
            if (multiProductComponent != null) {
                String str2 = uo3.A05;
                FiltersLoggingInfo filtersLoggingInfo = uo3.A01;
                Long l = uo3.A00;
                ? obj = new Object();
                obj.A01 = multiProductComponent;
                obj.A03 = str2;
                obj.A00 = filtersLoggingInfo;
                obj.A04 = str;
                obj.A02 = l;
                C2354830a A002 = AnonymousClass30Y.A00(obj, vSz, uo3.A04);
                A002.A00(vvA.A05);
                return DbU.A0a(vvA.A06, A002);
            }
        } else if (intValue == 3 || intValue == 2) {
            r2 = AnonymousClass30Y.A00(uo3, vSz, uo3.A04);
            r2.A00(vvA.A07);
            List<C250603lj> list = vvA.A08;
            if (list != null) {
                for (C250603lj A003 : list) {
                    r2.A00(A003);
                }
            }
            return r2.A01();
        }
        r2 = AnonymousClass30Y.A00(uo3, vSz, uo3.A04);
        return r2.A01();
    }

    public final void A01(View view, UO3 uo3) {
        this.A00.A05(view, this.A02.A00(uo3.A04));
    }

    public final void A02(C17372VSz vSz, UO3 uo3, String str) {
        this.A02.A01(A00(vSz, uo3, this, str), uo3.A04);
    }
}
