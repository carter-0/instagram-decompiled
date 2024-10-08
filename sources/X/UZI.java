package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Arrays;

public final class UZI extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DebugFragment";
    public final AnonymousClass0eM A00 = C20692WxO.A00(this, 43);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969803);
    }

    public final String getModuleName() {
        return "pdp_debug";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.recycler_view);
        Dba.A17(recyclerView, this.A00);
        DbU.A15(getContext(), recyclerView, 1, false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        int A02 = AnonymousClass0fD.A02(-2138554340);
        UZI.super.onCreate(bundle);
        Product product = (Product) requireArguments().getParcelable("product");
        if (product != null) {
            User user = product.A0B;
            UA5 ua5 = (UA5) this.A00.getValue();
            C16267UrU urU = new C16267UrU("Info");
            String str4 = product.A0H;
            C16269UrW urW = new C16269UrW("Product ID", str4);
            C16269UrW urW2 = new C16269UrW("Name", product.A0J);
            C16269UrW urW3 = new C16269UrW("Description", product.A0E);
            ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
            C16269UrW urW4 = new C16269UrW("Has Rich Text Description", String.valueOf(AnonymousClass7TF.A1V(productDetailsProductItemDict.A0m)));
            C16269UrW urW5 = new C16269UrW("Checkout Style", DbX.A0t(productDetailsProductItemDict.A00));
            String str5 = null;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            } else {
                str = null;
            }
            C16269UrW urW6 = new C16269UrW("Merchant ID", str);
            if (user != null) {
                str2 = C13988Tno.A0b(user);
            } else {
                str2 = null;
            }
            C16269UrW urW7 = new C16269UrW("Merchant Username", str2);
            C16269UrW urW8 = new C16269UrW("External URL", product.A0F);
            if (user != null) {
                str3 = C13988Tno.A0b(user);
                str5 = AnonymousClass3ZA.A00(user);
            } else {
                str3 = null;
            }
            String format = String.format("http://www.instagram.com/_n/product_details_page?business_username=%s&business_user_id=%s&product_id=%s", Arrays.copyOf(new Object[]{str3, str5, str4}, 3));
            0qQ.A07(format);
            C16269UrW urW9 = urW;
            C16269UrW urW10 = urW2;
            C16269UrW urW11 = urW3;
            ua5.A00 = 0sr.A1P(new VPM[]{urU, urW9, urW10, urW11, urW4, urW5, urW6, urW7, urW8, new C16269UrW("Deeplink URL", format), new C16269UrW("Review Status", product.A05.A00), new C16267UrU("Deep Link Launcher"), new C16268UrV("Pin this Product Details Page", new C20613Wvu(28, this, product)), new C16268UrV("Pin this User's Profile Shop", new C20613Wvu(29, this, product))});
            ua5.notifyDataSetChanged();
            AnonymousClass0fD.A09(1841214951, A02);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Product is required to launch DebugFragment");
        AnonymousClass0fD.A09(-2035311328, A02);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-67654276);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        AnonymousClass0fD.A09(-2049686965, A02);
        return inflate;
    }
}
