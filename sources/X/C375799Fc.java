package X;

import com.facebook.ppml.enigma.EnigmaSQLite;
import com.facebook.ppml.enigma.InstallReferrerEventV2;
import java.util.List;

/* renamed from: X.9Fc  reason: invalid class name and case insensitive filesystem */
public final class C375799Fc {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C375809Fd.A00);
    public final 0wc A01;

    public final InstallReferrerEventV2 A01(String str, String str2) {
        String str3 = str2;
        0qQ.A0B(str3, 4);
        String str4 = str;
        try {
            List installReferrerEventV3 = ((EnigmaSQLite) this.A00.getValue()).getInstallReferrerEventV3(str4, 0, 0, str3, 1);
            if (!(!installReferrerEventV3.isEmpty())) {
                return null;
            }
            InstallReferrerEventV2 installReferrerEventV2 = (InstallReferrerEventV2) installReferrerEventV3.get(0);
            A00(this, "getv2", installReferrerEventV2.assetID, (String) null, (String) null, (long) installReferrerEventV2.activityType);
            return installReferrerEventV2;
        } catch (Exception e) {
            A00(this, "getv2", str4, (String) null, e.getMessage(), -1);
            return null;
        }
    }

    public static final void A00(C375799Fc r2, String str, String str2, String str3, String str4, long j) {
        Long l;
        0wc r22 = r2.A01;
        0Aj A002 = r22.A00(r22.A00, "android_on_device_install_referrer_logging");
        if (A002.isSampled()) {
            A002.AAJ("action", str);
            A002.AAJ("asset_id", str2);
            A002.A9F("activity_type", Long.valueOf(j));
            A002.AAJ("error", str4);
            if (str3 != null) {
                l = 00y.A0n(10, str3);
            } else {
                l = null;
            }
            A002.A9F("ad_id", l);
            A002.Cgf();
        }
    }

    public final void A02(InstallReferrerEventV2 installReferrerEventV2, String str) {
        InstallReferrerEventV2 installReferrerEventV22 = installReferrerEventV2;
        String str2 = str;
        try {
            ((EnigmaSQLite) this.A00.getValue()).insertInstallReferrerEventV2(installReferrerEventV22.assetID, installReferrerEventV22.activityType, installReferrerEventV22.installReferrer, installReferrerEventV22.timestamp, installReferrerEventV22.packageName, 1);
            A00(this, "savev2", installReferrerEventV22.assetID, str2, (String) null, (long) installReferrerEventV22.activityType);
        } catch (Exception e) {
            A00(this, "savev2", installReferrerEventV22.assetID, str2, e.getMessage(), (long) installReferrerEventV22.activityType);
        }
    }

    public C375799Fc() {
        AnonymousClass0kM r1 = new AnonymousClass0kM(C61170le.A00);
        r1.A01 = "odir_storage";
        this.A01 = r1.A00();
    }
}
