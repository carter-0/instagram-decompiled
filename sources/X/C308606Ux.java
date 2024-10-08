package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Ux  reason: invalid class name and case insensitive filesystem */
public final class C308606Ux {
    public final C308596Uw A00;
    public final List A01 = new ArrayList();
    public final Map A02 = new LinkedHashMap();

    public static final void A00(AnonymousClass0iw r8, ImageUrl imageUrl, IgImageView igImageView, C308596Uw r11, C308606Ux r12, String str, float f, boolean z, boolean z2) {
        IgImageView igImageView2 = igImageView;
        if (imageUrl != null) {
            String A0R = 002.A0R(str, imageUrl.getUrl());
            C308606Ux r3 = r12;
            Bitmap bitmap = (Bitmap) r12.A02.get(A0R);
            C308596Uw r2 = r11;
            if (bitmap != null) {
                r11.A01();
                igImageView.setImageBitmap(bitmap);
                return;
            }
            igImageView.A0E = new C64861LjN(igImageView2, r2, r3, A0R, f, z, z2);
            igImageView.setUrl(imageUrl, r8);
            return;
        }
        igImageView.setVisibility(4);
        C14164Tr2.A01(str, "Null image");
    }

    public C308606Ux(C308596Uw r2) {
        this.A00 = r2;
    }
}
