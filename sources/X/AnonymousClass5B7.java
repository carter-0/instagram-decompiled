package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import com.instagram.android.R;

/* renamed from: X.5B7  reason: invalid class name */
public abstract class AnonymousClass5B7 {
    public static Typeface A00;

    public static 1rR A00(Context context) {
        Runnable tDi;
        1rR r7 = new 1rR("Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs);
        C375509Dw r6 = new C375509Dw();
        Handler handler = new Handler(C64021Cb.A00());
        try {
            26z A002 = C67001rX.A00(context, r7);
            if (A002.A00 != 0) {
                handler.post(new C12917TDg(r6));
                return r7;
            }
            26x[] r4 = A002.A01;
            if (r4 != null) {
                int length = r4.length;
                if (length == 0) {
                    tDi = new C12918TDh(r6);
                } else {
                    int i = 0;
                    do {
                        int i2 = r4[i].A00;
                        if (i2 == 0) {
                            i++;
                        } else if (i2 < 0) {
                            tDi = new C12919TDi(r6);
                        } else {
                            handler.post(new THW(r6, i2));
                            return r7;
                        }
                    } while (i < length);
                    Typeface A03 = 270.A01.A03(context, (CancellationSignal) null, r4, 0);
                    if (A03 == null) {
                        handler.post(new C12920TDj(r6));
                        return r7;
                    }
                    handler.post(new AnonymousClass9EE(A03, r6));
                    return r7;
                }
                handler.post(tDi);
                return r7;
            }
            return r7;
        } catch (PackageManager.NameNotFoundException unused) {
            handler.post(new C12916TDf(r6));
        }
    }
}
