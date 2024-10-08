package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;

/* renamed from: X.OTt  reason: case insensitive filesystem */
public final class C70972OTt {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.OTt, java.lang.Object] */
    public static C70972OTt A00(Bundle bundle) {
        ? obj = new Object();
        obj.A06 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        obj.A00 = bundle.getFloat(Location.LATITUDE);
        obj.A01 = bundle.getFloat("longitude");
        obj.A04 = bundle.getLong("timestamp");
        obj.A03 = bundle.getLong("status_update_timestamp");
        obj.A05 = bundle.getString("device");
        obj.A07 = bundle.getString("location");
        obj.A09 = bundle.getBoolean("is_confirmed");
        obj.A02 = bundle.getInt("position");
        obj.A0A = bundle.getBoolean("is_current");
        obj.A0B = bundle.getBoolean("is_suspicious_login");
        obj.A08 = bundle.getString(C66584MXp.A0S());
        return obj;
    }
}
