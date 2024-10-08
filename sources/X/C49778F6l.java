package X;

import android.content.Intent;
import android.os.Parcelable;

/* renamed from: X.F6l  reason: case insensitive filesystem */
public abstract class C49778F6l {
    public static final String A00(Integer num) {
        String str;
        if (1 - num.intValue() != 0) {
            str = "REG_FLOW";
        } else {
            str = "NUX_FLOW";
        }
        return AnonymousClass7TF.A0j(str);
    }

    public static void A01(Intent intent, Parcelable parcelable, Integer num, String str, int i) {
        intent.putExtra("argument_flow", A00(num));
        intent.putExtra("argument_requested_code", i);
        intent.putExtra("argument_access_token", str);
        intent.putExtra("argument_content", parcelable);
    }
}
