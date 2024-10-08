package X;

import android.content.Context;
import java.io.IOException;

/* renamed from: X.8zr  reason: invalid class name and case insensitive filesystem */
public final class C372168zr {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public C372168zr(Context context, String str, String str2, String str3, String str4) {
        try {
            this.A00 = C393039vn.A00(context, str, "fb_ht_init_net.pb").getCanonicalPath();
            this.A01 = C393039vn.A00(context, str2, "fb_ht_predict_net.pb").getCanonicalPath();
            this.A02 = C393039vn.A00(context, str3, "fb_ht_kp_init_net.pb").getCanonicalPath();
            this.A03 = C393039vn.A00(context, str4, "fb_ht_kp_predict_net.pb").getCanonicalPath();
        } catch (IOException e) {
            this.A00 = str;
            this.A01 = str2;
            this.A02 = str3;
            this.A03 = str4;
            0KC.A0F("HandTrackingDataProviderConfiguration", "Error while loading hand tracking models from asset.", e);
        }
    }
}
