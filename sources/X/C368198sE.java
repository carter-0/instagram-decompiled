package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.HashMap;

/* renamed from: X.8sE  reason: invalid class name and case insensitive filesystem */
public final class C368198sE implements C368168sB {
    public String A00;
    public final 0lg A01;
    public final QuickPerformanceLogger A02 = 02m.A0p;

    public final void CtA(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(DevServerEntity.COLUMN_DESCRIPTION, String.format(DevServerEntity.COLUMN_DESCRIPTION, new Object[]{str}));
        Long l = null;
        try {
            String str2 = this.A00;
            if (str2 != null) {
                l = Long.valueOf(Long.parseLong(str2));
            }
        } catch (NumberFormatException unused) {
        }
        0wc A022 = AnonymousClass0kN.A02(this.A01);
        0Aj A002 = A022.A00(A022.A00, "fx_sso_library");
        A002.AAJ("fx_sso_library_event", "auth_token_fetch_failure");
        A002.AAJ("fx_sso_library_failure_reason", (String) null);
        A002.A9F(AnonymousClass000.A00(4878), l);
        A002.A8M((AnonymousClass0Ac) null, AnonymousClass000.A00(4879));
        A002.AAJ("version_id", "1.0");
        A002.A9H("debug_test_data", hashMap);
        A002.Cgf();
    }

    public final void DmG(C368148s9 r4) {
        this.A02.markerPoint(857814189, "CONTENT_PROVIDER_RESOLVED");
    }

    public C368198sE(0lg r2, String str) {
        this.A01 = r2;
        this.A00 = str;
    }
}
