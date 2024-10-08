package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

public final class SFI {
    public static final Object A04 = Pxe.A0p();
    public TZo A00;
    public final Context A01;
    public final String A02;
    public final Map A03;

    public SFI(Drawable.Callback callback, String str, Map map) {
        Context applicationContext;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = 002.A0C(str, '/');
        }
        this.A02 = str;
        this.A03 = map;
        this.A00 = null;
        if (!(callback instanceof View)) {
            applicationContext = null;
        } else {
            applicationContext = ((View) callback).getContext().getApplicationContext();
        }
        this.A01 = applicationContext;
    }
}
