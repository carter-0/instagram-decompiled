package X;

import android.view.View;
import com.instagram.android.R;

public final /* synthetic */ class JKA extends 015 {
    public static final JKA A00 = new JKA();

    public JKA() {
        super(HPA.class, "callerContextTag", "getCallerContextTag(Landroid/widget/ImageView;)Ljava/lang/Object;", 1);
    }

    public final void A02(Object obj, Object obj2) {
        ((View) obj).setTag(R.id.fresco_vito_caller_context_tag, obj2);
    }

    public final Object get(Object obj) {
        return ((View) obj).getTag(R.id.fresco_vito_caller_context_tag);
    }
}
