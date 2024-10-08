package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.common.session.UserSession;

/* renamed from: X.35G  reason: invalid class name */
public final class AnonymousClass35G extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C227802jw A01;

    public final void run() {
        String str;
        0xY AR4;
        Boolean bool = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        C227802jw r1 = this.A01;
        UserSession A05 = r1.getSession();
        0qQ.A0B(A05, 0);
        0wc A02 = AnonymousClass0kN.A02(A05);
        0tX A012 = 0xn.A01("IgAttributionState");
        Context context = this.A00;
        UserSession A052 = r1.getSession();
        0qQ.A0B(A052, 1);
        long parseLong = Long.parseLong(A052.A06);
        boolean z = false;
        String string = A012.getString("AttributionId", (String) null);
        long j3 = A012.getLong("UserId", -1);
        long j4 = A012.getLong("Timestamp", -1);
        A012.getBoolean("ExposeAndroidId", false);
        String string2 = A012.getString("PreviousAdvertisingId", (String) null);
        boolean z2 = A012.getBoolean("IsTrackingEnabled", false);
        if (!(string == null || string.length() == 0 || j3 == -1 || j4 == -1)) {
            bool = Boolean.valueOf(z2);
            z = true;
            j2 = j3;
            j = j4;
            str2 = string2;
        }
        C60820jg r9 = 0jh.A04;
        r9.A01(A05).A02(19f.A1F);
        String str3 = "";
        synchronized (r9.A01(A05)) {
        }
        if (!z) {
            bool = null;
        } else if (str2 != null) {
            str3 = str2;
        }
        C62880wX r17 = C61170le.A00;
        String string3 = AnonymousClass0xl.A00(r17).A00.getString("google_ad_id", (String) null);
        int A03 = GoogleApiAvailability.A00.A03(context, 12451000);
        if (string3 == null) {
            long j5 = A012.getLong(002.A0O("ErrorCode", 2), -1);
            if (j5 == -1 || Long.valueOf(j5) == null || System.currentTimeMillis() > j5 + 3600000) {
                0wc A022 = AnonymousClass0kN.A02(A05);
                1Ln r3 = new 1Ln(A022.A00(A022.A00, "ads_tracking_status"), 0);
                0Aj r2 = r3.A00;
                if (r2.isSampled()) {
                    r2.A8k(TraceFieldType.ErrorCode, 2);
                    r3.A0R("error", "Fail to get advertising info.");
                    r3.Cgf();
                    long currentTimeMillis = System.currentTimeMillis();
                    AR4 = A012.AR4();
                    AR4.E5c(002.A0O("ErrorCode", 2), currentTimeMillis);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (!z || bool == null || j2 != parseLong || 0qQ.A0K(Boolean.valueOf(AnonymousClass0xl.A00(r17).A00.getBoolean("opt_out_ads", false)), bool) || !0qQ.A0K(AnonymousClass0xl.A00(r17).A00.getString("google_ad_id", (String) null), str2) || System.currentTimeMillis() > j + 3600000) {
            String obj = AnonymousClass0HM.A00().toString();
            0qQ.A07(obj);
            boolean z3 = AnonymousClass0xl.A00(r17).A00.getBoolean("opt_out_ads", false);
            long currentTimeMillis2 = System.currentTimeMillis();
            boolean z4 = !z3;
            Boolean valueOf = Boolean.valueOf(z4);
            0xY AR42 = A012.AR4();
            AR42.E5g("AttributionId", obj);
            AR42.E5c("UserId", parseLong);
            AR42.E5c("Timestamp", currentTimeMillis2);
            AR42.E5T("ExposeAndroidId", false);
            AR42.E5g("PreviousAdvertisingId", string3);
            if (valueOf != null) {
                AR42.E5T("IsTrackingEnabled", z4);
            } else if (A012.contains("IsTrackingEnabled")) {
                AR42.ED3("IsTrackingEnabled");
            }
            AR42.apply();
            Integer valueOf2 = Integer.valueOf(A03);
            0wc r0 = A02;
            1Ln r22 = new 1Ln(r0.A00(r0.A00, "ads_tracking_status"), 0);
            if (r22.A00.isSampled()) {
                r22.A0R("advertiser_id", AnonymousClass0xl.A00(r17).A00.getString("google_ad_id", (String) null));
                r22.A0O("tracking_enabled", Boolean.valueOf(!AnonymousClass0xl.A00(r17).A00.getBoolean("opt_out_ads", false)));
                if (valueOf2 != null) {
                    str = valueOf2.toString();
                } else {
                    str = null;
                }
                r22.A0R("google_play_service_installation", str);
                r22.A0R("previous_advertiser_id", str3);
                r22.Cgf();
                0xY AR43 = A012.AR4();
                String A0O = 002.A0O("ErrorCode", 2);
                if (A012.contains(A0O)) {
                    AR43.ED3(A0O);
                    AR43.apply();
                }
                0xY AR44 = A012.AR4();
                String A0O2 = 002.A0O("ErrorCode", 3);
                if (A012.contains(A0O2)) {
                    AR44.ED3(A0O2);
                    AR44.apply();
                }
                0xY AR45 = A012.AR4();
                String A0O3 = 002.A0O("ErrorCode", 4);
                if (A012.contains(A0O3)) {
                    AR45.ED3(A0O3);
                    AR45.apply();
                }
                AR4 = A012.AR4();
                String A0O4 = 002.A0O("ErrorCode", 5);
                if (A012.contains(A0O4)) {
                    AR4.ED3(A0O4);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        AR4.apply();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass35G(Context context, C227802jw r5) {
        super(1254696479, 3, false, false);
        this.A01 = r5;
        this.A00 = context;
    }
}
