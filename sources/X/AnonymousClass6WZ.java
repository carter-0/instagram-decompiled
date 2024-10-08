package X;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.6WZ  reason: invalid class name */
public abstract class AnonymousClass6WZ {
    public static final void A00(C255773uh r9, C317676ne r10, C316916mQ r11) {
        int i;
        C255773uh r8 = r9;
        C255783ui A00 = C289745e8.A00(AnonymousClass3WT.PRODUCT_COLLECTION, r9.A0b());
        if (A00 == null) {
            r11.A02.setVisibility(8);
            return;
        }
        C42131BIk bIk = A00.A0o;
        if (bIk != null) {
            if (!"seller_collection_reshare_sticker".equals(C44933CnT.A00(bIk))) {
                IgFrameLayout igFrameLayout = r11.A02;
                ImageView imageView = r11.A01;
                ProductCollection productCollection = bIk.A02;
                if (productCollection != null) {
                    String str = bIk.A09;
                    if (str != null) {
                        i = Color.parseColor(str);
                    } else {
                        i = -1;
                    }
                    Context context = igFrameLayout.getContext();
                    0qQ.A07(context);
                    C389719q5 r1 = new C389719q5(context, productCollection, C44933CnT.A00(bIk));
                    r1.A00(i);
                    C380069Wl r0 = r1.A00;
                    r0.A02 = i;
                    r0.invalidateSelf();
                    r1.setTextFormat(C358878bc.A00(bIk.A07));
                    imageView.setImageDrawable(r1);
                    imageView.setContentDescription(context.getString(2131973829, new Object[]{productCollection.getTitle()}));
                    igFrameLayout.setFocusable(true);
                    igFrameLayout.setVisibility(0);
                }
            }
            IgFrameLayout igFrameLayout2 = r11.A02;
            igFrameLayout2.requestLayout();
            0nA.A0q(igFrameLayout2, new C57966IjL(igFrameLayout2, r8, A00, r10, r11));
            return;
        }
        throw new IllegalStateException("product collection sticker expected");
    }
}
