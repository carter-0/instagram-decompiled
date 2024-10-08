package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class H7G extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C59613JQh A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        IOX iox = (IOX) r10;
        C53135Gj7 gj7 = (C53135Gj7) r11;
        AnonymousClass7TG.A1N(iox, gj7);
        AnonymousClass0iw r3 = this.A00;
        C59613JQh jQh = this.A01;
        AnonymousClass7TG.A1Q(r3, jQh);
        User user = iox.A00;
        if (user.A03.Bh3() == null) {
            gj7.A03.A0B();
        } else {
            ImageUrl Bh3 = user.A03.Bh3();
            if (Bh3 != null) {
                gj7.A03.setUrl(Bh3, r3);
            }
        }
        TextView textView = gj7.A01;
        textView.setText(user.A03.getUsername());
        TextView textView2 = gj7.A02;
        String str = iox.A01;
        textView2.setText(str);
        ImageView imageView = gj7.A00;
        boolean z = iox.A02;
        imageView.setVisibility(DbW.A01(z ? 1 : 0));
        View view = gj7.itemView;
        if (z) {
            ID2.A02(view, 47, jQh, iox);
        } else {
            view.setClickable(false);
        }
        ID2.A02(gj7.A03, 48, jQh, iox);
        ID2.A02(textView, 49, jQh, iox);
        ID2.A02(textView2, 50, jQh, iox);
        gj7.itemView.setContentDescription(002.A0T(user.A03.getUsername(), str, ' '));
    }

    public final Class modelClass() {
        return IOX.class;
    }

    public H7G(AnonymousClass0iw r1, C59613JQh jQh, Integer num) {
        this.A00 = r1;
        this.A01 = jQh;
        this.A02 = num;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        Integer num = this.A02;
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(layoutInflater, viewGroup, R.layout.shopping_cart_merchant_row, C51970G9q.A1Y(num));
        viewGroup2.setTag(new C53135Gj7(viewGroup2, num));
        Object tag = viewGroup2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.common.MerchantRowViewBinder.Holder");
        return (C249703kE) tag;
    }
}
