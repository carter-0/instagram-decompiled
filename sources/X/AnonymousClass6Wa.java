package X;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.instagram.user.model.User;

/* renamed from: X.6Wa  reason: invalid class name */
public abstract class AnonymousClass6Wa {
    public static final void A00(C255773uh r9, C316926mR r10) {
        int i;
        0qQ.A0B(r10, 0);
        C255783ui A00 = C289745e8.A00(AnonymousClass3WT.STOREFRONT, r9.A0b());
        if (A00 != null) {
            C42133BIn bIn = A00.A0r;
            if (bIn != null && !"storefront_reshare_sticker".equals(C44945Cnf.A00(bIn))) {
                ImageView imageView = (ImageView) r10.A03.getValue();
                Context context = r10.A00;
                0qQ.A06(context);
                String A002 = C44945Cnf.A00(bIn);
                User user = bIn.A00;
                if (user != null) {
                    C389749q8 r2 = new C389749q8(context, user, A002);
                    String str = bIn.A06;
                    if (str != null) {
                        i = Color.parseColor(str);
                    } else {
                        i = -1;
                    }
                    r2.A00(bIn.A03, i);
                    C380069Wl r0 = r2.A01;
                    r0.A02 = i;
                    r0.invalidateSelf();
                    r2.setTextFormat(C358878bc.A00(bIn.A04));
                    imageView.setImageDrawable(r2);
                    imageView.setFocusable(true);
                    imageView.setVisibility(0);
                    imageView.requestLayout();
                    0nA.A0q(imageView, new C57916IiX(r9, A00, r10));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        r10.A02.setVisibility(8);
    }
}
