package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductWithMediaImage;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class UA0 extends 2Rw {
    public AnonymousClass2r0 A00;
    public String A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final List A04 = new ArrayList();
    public final List A05 = new ArrayList();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A02;
        View A09 = DbW.A09(LayoutInflater.from(context), viewGroup, R.layout.merchant_card_layout, false);
        C16277Urf urf = new C16277Urf(A09);
        int A002 = C17095VHr.A00(context);
        0nA.A0f(urf.A00, A002);
        int A052 = ((A002 - (AnonymousClass7TG.A05(context) * 2)) - context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material)) / 2;
        LinearLayout linearLayout = urf.A01;
        0nA.A0V(linearLayout, A052);
        LayoutInflater from = LayoutInflater.from(context);
        int i2 = 0;
        do {
            View A0A = DbU.A0A(from, linearLayout, R.layout.merchant_card_product_thumbnail, false);
            0nA.A0g(A0A, A052, A052);
            if (i2 > 0) {
                0nA.A0d(A0A, AnonymousClass7TF.A02(context, R.dimen.abc_control_corner_material));
            }
            linearLayout.addView(A0A);
            urf.A05.add(AnonymousClass7TE.A0b(A0A, R.id.product_thumbnail_image));
            i2++;
        } while (i2 < 2);
        0qQ.A0B(A09, 0);
        A09.setOnTouchListener(WC1.A00);
        Object A0U = C13988Tno.A0U(A09, urf);
        if (A0U != null) {
            return (C249703kE) A0U;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r14, int i) {
        0sn r5;
        ImageInfo imageInfo;
        ExtendedImageUrl A032;
        UBP ubp = (UBP) r14;
        0qQ.A0B(ubp, 0);
        AnonymousClass2r0 r9 = this.A00;
        if (r9 != null) {
            C16277Urf urf = (C16277Urf) ubp;
            String str = this.A01;
            List list = this.A05;
            ShoppingBrandWithProducts shoppingBrandWithProducts = (ShoppingBrandWithProducts) list.get(i);
            AnonymousClass0iw r3 = this.A03;
            int A022 = DbW.A02(0, urf, shoppingBrandWithProducts);
            User CCd = shoppingBrandWithProducts.CCd();
            LinearLayout linearLayout = urf.A00;
            AnonymousClass0fU.A00(new WA2(shoppingBrandWithProducts, r9, str, i, A022), linearLayout);
            urf.A04.setUrl(CCd.Bh3(), r3);
            TextView textView = urf.A03;
            DbU.A1H(textView, CCd);
            textView.getPaint().setFakeBoldText(true);
            C244273av.A0C(textView, CCd.isVerified());
            TextView textView2 = urf.A02;
            String Ar0 = shoppingBrandWithProducts.Ar0();
            if (Ar0 == null) {
                Ar0 = AnonymousClass7TF.A0d(DbU.A05(linearLayout), 2131966176);
            }
            textView2.setText(Ar0);
            List Bga = shoppingBrandWithProducts.Bga();
            if (Bga == null || (r5 = Collections.unmodifiableList(C14502TxO.A02(Bga))) == null) {
                List<ProductWithMediaImage> unmodifiableList = Collections.unmodifiableList(shoppingBrandWithProducts.BgX());
                if (unmodifiableList != null) {
                    r5 = new ArrayList();
                    for (ProductWithMediaImage BSv : unmodifiableList) {
                        r5.add(C14502TxO.A00(BSv.BSv()));
                    }
                } else {
                    r5 = 0sn.A00;
                }
            }
            int i2 = 0;
            do {
                View childAt = urf.A01.getChildAt(i2);
                0qQ.A0A(childAt);
                int i3 = 8;
                if (i2 < r5.size()) {
                    i3 = 0;
                }
                childAt.setVisibility(i3);
                if (!(childAt.getVisibility() != 0 || (imageInfo = ((Product) r5.get(i2)).A08) == null || (A032 = 1iI.A03(imageInfo)) == null)) {
                    ((IgImageView) urf.A05.get(i2)).setUrl(A032, r3);
                }
                i2++;
            } while (i2 < A022);
            r9.EBo(linearLayout, ((ShoppingBrandWithProducts) list.get(i)).CCd());
        }
    }

    public UA0(Context context, AnonymousClass0iw r3) {
        this.A02 = context;
        this.A03 = r3;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1225634002);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(1950267535, A032);
        return size;
    }
}
