package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.3FP  reason: invalid class name */
public abstract class AnonymousClass3FP {
    public static final void A00(Context context, 0lg r6) {
        "app_installations".getClass();
        0xI A01 = 0xI.A01("app_installations", (String) null);
        for (Map.Entry entry : C64511Pt.A02.entrySet()) {
            A01.A09((String) entry.getKey(), Boolean.valueOf(0oI.A0I(context.getPackageManager(), (String) entry.getValue())));
        }
        C60510iO.A00(r6).EFq(A01);
    }
}
