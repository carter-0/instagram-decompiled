package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* renamed from: X.4uR  reason: invalid class name and case insensitive filesystem */
public final class C277104uR implements C277114uS {
    public static C277104uR A00;
    public static final AnonymousClass4uT A01 = new Object();

    public final void Cgk(String str, String str2, String str3, C62320sa r26, long j, boolean z) {
        String str4;
        String str5 = str;
        0qQ.A0B(str5, 0);
        String str6 = str2;
        0qQ.A0B(str6, 1);
        String str7 = str3;
        0qQ.A0B(str7, 2);
        String fFDBToken = FFSingletonJNILogger.getFFDBToken();
        0qQ.A07(fFDBToken);
        int length = fFDBToken.length();
        boolean z2 = false;
        if (length > 0) {
            z2 = true;
        }
        if (r26 == null || !z2) {
            str4 = "";
        } else {
            str4 = (String) r26.invoke();
        }
        FFSingletonJNILogger.bumpHealthCountersWithDebugInfo(FFSingletonJNILogger.createIdentitiesWithFacebookUser("test_device_id", "test_family_device_id", "", 0, "1.0.0", "test_bundle_id", "test_session_id", 0, 0, (String[]) null, 0, 0), str5, str6, str7, str4, 1);
    }

    public final void Cgo(long j, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        Cgk(str, str2, str3, (C62320sa) null, 1, true);
    }
}
