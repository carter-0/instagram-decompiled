package X;

import com.instagram.login.twofac.model.TotpSeed;
import com.instagram.login.twofac.model.TrustedDevice;
import java.io.IOException;
import java.util.ArrayList;

public final class F65 {
    public static DwU parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("totp_seeds".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            TotpSeed parseFromJson = C48978EnG.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A05 = arrayList;
                } else if ("is_two_factor_enabled".equals(A17)) {
                    r0.A08 = r4.A0d();
                } else if ("is_totp_two_factor_enabled".equals(A17)) {
                    r0.A07 = r4.A0d();
                } else if ("can_add_additional_totp_seed".equals(A17)) {
                    r0.A09 = r4.A0d();
                } else if (Dbb.A0T().equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("country_code".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("national_number".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("is_phone_confirmed".equals(A17)) {
                    r0.A0F = r4.A0d();
                } else if ("backup_codes".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    r0.A04 = arrayList;
                } else if ("trusted_devices".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            TrustedDevice parseFromJson2 = C48979EnH.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r0.A06 = arrayList;
                } else if ("email".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("has_reachable_email".equals(A17)) {
                    r0.A0B = r4.A0d();
                } else if ("eligible_for_trusted_notifications".equals(A17)) {
                    r0.A0A = r4.A0d();
                } else if ("is_trusted_notifications_enabled".equals(A17)) {
                    r0.A0H = r4.A0d();
                } else if ("is_eligible_for_whatsapp_two_factor".equals(A17)) {
                    r0.A0E = r4.A0d();
                } else if ("is_whatsapp_two_factor_enabled".equals(A17)) {
                    r0.A0I = r4.A0d();
                } else if ("is_eligible_for_multiple_totp".equals(A17)) {
                    r0.A0C = r4.A0d();
                } else if ("is_eligible_for_phone_number_confirmed_badge_toggle".equals(A17)) {
                    r0.A0D = r4.A0d();
                } else if ("is_phone_number_confirmed_badge_enabled".equals(A17)) {
                    r0.A0G = r4.A0d();
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
