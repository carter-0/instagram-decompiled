package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.59D  reason: invalid class name */
public final class AnonymousClass59D extends AnonymousClass59E {
    public final Object A00;
    public final String A01;
    public final View A02;

    /* JADX WARNING: type inference failed for: r11v1, types: [X.59F, android.view.View] */
    public AnonymousClass59D(View view, C244063aa r12, Object obj, String str) {
        super(view, r12);
        boolean z;
        Object tag;
        this.A02 = view;
        this.A01 = str;
        this.A00 = obj;
        Map map = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component_type", "image");
        if (view instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) view;
            ImageUrl imageUrl = igImageView.A0C;
            if (imageUrl != null) {
                String url = imageUrl.getUrl();
                0qQ.A07(url);
                linkedHashMap.put("media_urls", 002.A0E(url, '[', ']'));
            }
            linkedHashMap.put("has_fully_rendered", Boolean.valueOf(igImageView.A0N));
            linkedHashMap.put("view_rendering_component_type", "NATIVE");
        }
        if (!(!(view instanceof ImageView) || view.getTag(R.id.image_component_uri_tag) == null || (tag = view.getTag(R.id.image_component_uri_tag)) == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(tag);
            sb.append(']');
            linkedHashMap.put("media_urls", sb.toString());
        }
        Integer A06 = AnonymousClass59A.A00.A06(this.A01);
        if (A06 != null) {
            linkedHashMap.put("index_of_card", A06);
            Object obj2 = this.A00;
            if (obj2 instanceof 1Xj) {
                1Xj r8 = (1Xj) obj2;
                int intValue = A06.intValue();
                1Xj A1c = r8.A1c(intValue);
                String id = (A1c == null ? r8 : A1c).getId();
                if (id != null) {
                    linkedHashMap.put("carousel_media_id", id);
                    1Xj A1c2 = r8.A1c(intValue);
                    linkedHashMap.put("carousel_media_type", (A1c2 == null ? r8 : A1c2).BR7().name());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        map.putAll(linkedHashMap);
        if (view instanceof AnonymousClass59F) {
            ? r11 = (AnonymousClass59F) view;
            Context context = r11.getContext();
            0qQ.A0A(context);
            map.put("x_pos", Double.valueOf((double) 0nA.A01(context, r11.A00)));
            map.put("y_pos", Double.valueOf((double) 0nA.A01(context, r11.A01)));
            map.put(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf((double) 0nA.A01(context, (float) r11.A03)));
            map.put(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf((double) 0nA.A01(context, (float) r11.A02)));
            map.put("media_urls", 002.A0E(r11.A05, '[', ']'));
            Drawable drawable = r11.A04;
            if (drawable == null) {
                z = false;
            } else if (drawable instanceof C244303ay) {
                z = ((C244303ay) drawable).A00;
            } else {
                z = true;
            }
            map.put("has_fully_rendered", Boolean.valueOf(z));
        }
    }
}
