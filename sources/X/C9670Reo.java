package X;

import android.widget.ImageView;
import java.util.List;

/* renamed from: X.Reo  reason: case insensitive filesystem */
public abstract class C9670Reo {
    public static void A00(ImageView imageView, List list, int i) {
        String str = (String) list.get(i);
        imageView.setVisibility(0);
        C10911S0m A0G = AnonymousClass2E0.A0G();
        0qQ.A0B(str, 0);
        new C8287QnT(A0G.A00, str, "ContentValues").A02(imageView);
    }
}
