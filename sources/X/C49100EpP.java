package X;

import android.content.Context;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.EpP  reason: case insensitive filesystem */
public abstract class C49100EpP {
    public static final SimpleImageUrl A00(Context context, AnonymousClass3ID r3) {
        AnonymousClass7TG.A1N(r3, context);
        String str = r3.A01;
        if (str == null || !AnonymousClass3HA.A00(context)) {
            str = r3.A00;
        }
        return DbS.A0V(str);
    }
}
