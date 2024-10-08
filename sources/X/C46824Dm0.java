package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dm0  reason: case insensitive filesystem */
public final class C46824Dm0 extends 2Rw {
    public final AnonymousClass0iw A00;
    public final ProductSharePickerFragment A01;
    public final List A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46973DoR(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.product_share_picker_row, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        String str;
        C46973DoR doR = (C46973DoR) r7;
        0qQ.A0B(doR, 0);
        Product product = (Product) 00k.A0O(this.A02, i);
        if (product != null) {
            ProductSharePickerFragment productSharePickerFragment = this.A01;
            AnonymousClass0iw r2 = this.A00;
            Context A07 = DbS.A07(doR);
            ImageInfo imageInfo = product.A08;
            if (imageInfo == null && (imageInfo = product.A07) == null) {
                doR.A02.A09();
            } else {
                ExtendedImageUrl A03 = 1iI.A03(imageInfo);
                if (A03 != null) {
                    doR.A02.setUrl(A03, r2);
                }
            }
            doR.A01.setText(product.A0J);
            TextView textView = doR.A00;
            User user = product.A0B;
            if (user != null) {
                str = user.getUsername();
            } else {
                str = null;
            }
            DbX.A13(A07, textView, str, 2131969825);
            FP7.A00(doR.itemView, 5, productSharePickerFragment, product);
        }
    }

    public C46824Dm0(AnonymousClass0iw r2, ProductSharePickerFragment productSharePickerFragment, List list) {
        this.A01 = productSharePickerFragment;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A02 = A1C;
        A1C.addAll(list);
        this.A00 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1283463463);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(531921867, A03);
        return size;
    }
}
