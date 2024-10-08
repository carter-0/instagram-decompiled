package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.shopping.ProductArEffectMetadataIntf;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.Product;

public final class OVZ {
    public Fragment A00;
    public String A01;
    public String A02;
    public String A03;
    public final C3503184e A04 = new C71838Orf(this);
    public final C357648Za A05;
    public final FragmentActivity A06;
    public final 28D A07;
    public final UserSession A08;
    public final ProductItemWithAR A09;
    public final Boolean A0A;
    public final String A0B;
    public final String A0C;

    public final void A01() {
        C357648Za r2 = this.A05;
        r2.A01(this.A04);
        Boolean bool = this.A0A;
        if (bool != null && bool.booleanValue() && !r2.A04.A00()) {
            if (r2.A05(AnonymousClass05K.A0Y, AnonymousClass7TG.A0j())) {
                return;
            }
        }
        A00(this);
    }

    public OVZ(FragmentActivity fragmentActivity, 28D r9, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, Boolean bool, String str, String str2) {
        this.A06 = fragmentActivity;
        this.A08 = userSession;
        this.A0C = str;
        this.A07 = r9;
        this.A0B = str2;
        this.A0A = bool;
        this.A09 = new ProductItemWithAR(productArEffectMetadataIntf.FFJ(), product.A01);
        0xG A0O = DbS.A0O("ShoppingCameraNavigator");
        this.A05 = new C357648Za(DbT.A05(fragmentActivity), fragmentActivity, (AnonymousClass4DH) null, A0O, userSession);
    }

    public static final void A00(OVZ ovz) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("camera_product_item_with_ar", ovz.A09);
        A0a.putSerializable(C273654mx.A00(2125), ovz.A07);
        A0a.putString(AnonymousClass000.A00(55), ovz.A0C);
        A0a.putString("viewer_session_id", ovz.A03);
        A0a.putString("prior_module_name", ovz.A0B);
        A0a.putString(AnonymousClass000.A00(267), ovz.A01);
        A0a.putString(AnonymousClass000.A00(4023), ovz.A02);
        A0a.putString("ch", (String) null);
        A0a.putString("container_effect_config_id", (String) null);
        A0a.putString("test_object_id", (String) null);
        FragmentActivity fragmentActivity = ovz.A06;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(fragmentActivity, A0a, ovz.A08, TransparentModalActivity.class, C273654mx.A00(3334));
        Dbc.A0y(A022);
        Fragment fragment = ovz.A00;
        if (fragment != null) {
            A022.A0D(fragment, 5);
        } else {
            A022.A0C(fragmentActivity);
        }
        ovz.A05.A02(ovz.A04);
    }
}
