package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.84u  reason: invalid class name and case insensitive filesystem */
public final class C3504784u implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "ShoppingCameraControllerImpl";
    public 28D A00;
    public ProductItemWithAR A01;
    public ShoppingCameraSurveyMetadata A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final AnonymousClass4DH A0A;
    public final UserSession A0B;
    public final IgFundedIncentive A0C;
    public final C17865VhI A0D;
    public final C39690A5g A0E;
    public final C18644Vvm A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final Map A0J;
    public final Map A0K;
    public final AnonymousClass4DU A0L;

    public final String getModuleName() {
        return "instagram_shopping_camera";
    }

    public static final 1Xj A00(C3504784u r2) {
        1Xj A022;
        if (r2.A07 == null || (A022 = 1E7.A00(r2.A0B).A02(r2.A07)) == null || !A022.CcK()) {
            return null;
        }
        return A022;
    }

    public static final List A01(C3504784u r5) {
        ProductItemWithAR A012 = r5.A0F.A01(r5.A05);
        String str = "";
        if (A012 == null) {
            0wb.A03(__redex_internal_original_name, "Unable to getCurrentEffectId as the current master product is null");
        } else {
            String str2 = A012.A00.A03;
            if (str2 != null) {
                str = str2;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (ProductItemWithAR productItemWithAR : r5.A0I) {
            String str3 = productItemWithAR.A00.A03;
            if (!str.equals(str3)) {
                arrayList.add(str3);
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static final void A02(ProductItemWithAR productItemWithAR, C3504784u r4) {
        JSONObject jSONObject;
        HashMap hashMap = productItemWithAR.A00.A05;
        if (hashMap == null || !(!hashMap.isEmpty())) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(hashMap);
        }
        r4.A0J.put(C18386Vqm.A00(C14502TxO.A00(productItemWithAR.A01)), jSONObject);
    }

    public final Product A04() {
        Object obj = this.A0K.get(this.A05);
        if (obj != null) {
            return (Product) this.A0F.A03.get(obj);
        }
        return null;
    }

    public final boolean A05() {
        String str;
        String Bfs = AnonymousClass0t1.A01.A01(this.A0B).A03.Bfs();
        if (Bfs == null || Bfs.length() == 0) {
            Context context = this.A0A.getContext();
            if (context == null) {
                return true;
            }
            Bfs = context.getResources().getConfiguration().locale.getCountry();
            str = "GB";
        } else {
            str = "United Kingdom";
        }
        return !str.equalsIgnoreCase(Bfs);
    }

    public C3504784u(AnonymousClass4DH r6, UserSession userSession, ProductItemWithAR productItemWithAR, String str, String str2) {
        String str3;
        this.A0A = r6;
        this.A0B = userSession;
        this.A01 = productItemWithAR;
        if (str2 == null) {
            str2 = UUID.randomUUID().toString();
            0qQ.A07(str2);
        }
        this.A0H = str2;
        this.A00 = 28D.A5J;
        C18644Vvm vvm = new C18644Vvm(r6, userSession);
        this.A0F = vvm;
        ArrayList arrayList = new ArrayList();
        this.A0I = arrayList;
        this.A0J = new HashMap();
        HashMap hashMap = new HashMap();
        this.A0K = hashMap;
        this.A0C = C323426xT.A00(userSession).A00;
        C40516AdP adP = new C40516AdP(this);
        this.A0L = adP;
        if (str == null) {
            str3 = C228022kf.A00((Bundle) null);
        } else {
            str3 = str;
        }
        this.A0G = str3;
        ProductItemWithAR productItemWithAR2 = this.A01;
        arrayList.add(productItemWithAR2);
        vvm.A02(productItemWithAR2);
        A02(this.A01, this);
        Product A002 = C14502TxO.A00(this.A01.A01);
        vvm.A03(A002);
        String A003 = C18386Vqm.A00(A002);
        this.A05 = A003;
        hashMap.put(A003, A003);
        this.A0E = new C39690A5g(userSession);
        this.A0D = new C17865VhI(userSession, adP, str == null ? "" : str);
    }

    public final Product A03() {
        Product A042 = A04();
        if (A042 != null) {
            return A042;
        }
        ProductItemWithAR A012 = this.A0F.A01(this.A05);
        if (A012 != null) {
            return C14502TxO.A00(A012.A01);
        }
        0wb.A03(__redex_internal_original_name, "Master ProductItemWithAR should not be null for fallback product");
        return null;
    }

    public final boolean A06() {
        Product A042 = A04();
        if (A042 == null) {
            A042 = C14502TxO.A00(this.A01.A01);
        }
        ProductCheckoutProperties productCheckoutProperties = A042.A01.A0C;
        if (productCheckoutProperties == null) {
            return false;
        }
        Boolean bool = true;
        if (!bool.equals(productCheckoutProperties.A02)) {
            return false;
        }
        if (182.A06(0Tu.A05, this.A0B, 36311835363771167L)) {
            return true;
        }
        return false;
    }

    public C3504784u() {
    }
}
