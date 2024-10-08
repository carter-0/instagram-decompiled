package X;

import android.view.View;
import com.instagram.android.R;

public final /* synthetic */ class JK9 extends 015 {
    public static final JK9 A00 = new JK9();

    public JK9() {
        super(HPA.class, "imageOptionsTag", "getImageOptionsTag(Landroid/widget/ImageView;)Lcom/facebook/fresco/vito/options/ImageOptions;", 1);
    }

    public final void A02(Object obj, Object obj2) {
        ((View) obj).setTag(R.id.fresco_vito_image_options_tag, obj2);
    }

    public final Object get(Object obj) {
        return ((View) obj).getTag(R.id.fresco_vito_image_options_tag);
    }
}
