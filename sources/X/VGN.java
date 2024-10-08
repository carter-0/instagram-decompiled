package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.user.model.Product;
import java.lang.reflect.Method;
import java.util.List;

public abstract class VGN {
    public static final void A00(1Xj r8, VWP vwp) {
        C255783ui r4;
        ImageView imageView;
        0qQ.A0B(vwp, 0);
        List A3o = r8.A3o(AnonymousClass3WT.PRODUCT);
        if (A3o == null || A3o.isEmpty()) {
            r4 = null;
        } else {
            r4 = (C255783ui) A3o.get(0);
        }
        if (r4 == null) {
            imageView = vwp.A02;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Context context = vwp.A00;
            String A0K = r4.A0K();
            if (A0K == null || r4.A0I().A0J == null) {
                imageView = vwp.A02;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                C389739q7 r5 = new C389739q7(context, A0K);
                Product A0I = r4.A0I();
                String A0L = r4.A0L();
                ProductSticker productSticker = r4.A0q;
                productSticker.getClass();
                String str = productSticker.A0D;
                int i = -1;
                if (str != null) {
                    try {
                        i = Color.parseColor(str);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                r5.A05(A0I, A0L, i, false);
                Method method = r5.getClass().getMethod("setTextFormat", new Class[]{C358868bb.class});
                ProductSticker productSticker2 = r4.A0q;
                productSticker2.getClass();
                method.invoke(r5, new Object[]{C358878bc.A00(productSticker2.A0B)});
                ImageView imageView2 = vwp.A02;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(r5);
                    imageView2.setVisibility(0);
                    View view = vwp.A01;
                    if (view != null) {
                        0nA.A0q(view, new C20309Woy(r8, r4, vwp));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        imageView.setVisibility(8);
    }
}
