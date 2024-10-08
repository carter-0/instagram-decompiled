package X;

import android.os.Bundle;

public final class SOK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static SOK A00(Bundle bundle) {
        if (bundle == null) {
            return A01("appmanager_missing_utm_bundle");
        }
        return new SOK(bundle.getString("utm_source", "appmanager_unknown"), bundle.getString("utm_medium", "appmanager_unknown"), bundle.getString("utm_campaign", "appmanager_unknown"), bundle.getString("utm_content", "appmanager_unknown"), bundle.getString("utm_term", "appmanager_unknown"), bundle.getString("utm_id", "appmanager_unknown"), bundle.getString("impression_id", ""), bundle.getString("custom_data", ""));
    }

    public static SOK A01(String str) {
        return new SOK("appmanager_unknown", "appmanager_unknown", str, "appmanager_unknown", "appmanager_unknown", "appmanager_unknown", "", "");
    }

    public SOK(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A05 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A03 = str7;
        this.A02 = str8;
    }

    public final Bundle A02() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("utm_source", this.A05);
        A0a.putString("utm_medium", this.A04);
        A0a.putString("utm_campaign", this.A00);
        A0a.putString("utm_content", this.A01);
        A0a.putString("utm_term", this.A06);
        A0a.putString("utm_id", this.A07);
        A0a.putString("impression_id", this.A03);
        A0a.putString("custom_data", this.A02);
        return A0a;
    }
}
