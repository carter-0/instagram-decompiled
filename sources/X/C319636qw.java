package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.6qw  reason: invalid class name and case insensitive filesystem */
public abstract class C319636qw {
    public static C319646qx parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            C319646qx r0 = new C319646qx();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("upsell_seen_before".equals(A0q)) {
                    r0.A0B = r7.A0d();
                } else if ("allow_non_fb_sso".equals(A0q)) {
                    r0.A08 = r7.A0d();
                } else if ("rejected_sso_upsell".equals(A0q)) {
                    r0.A0A = r7.A0d();
                } else {
                    String str = null;
                    if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                        if (r7.A11() != 16L.A0G) {
                            str = r7.A1P();
                        }
                        r0.A06 = str;
                    } else if ("login_nonce".equals(A0q)) {
                        if (r7.A11() != 16L.A0G) {
                            str = r7.A1P();
                        }
                        r0.A05 = str;
                    } else if ("login_token".equals(A0q)) {
                        if (r7.A11() != 16L.A0G) {
                            str = r7.A1P();
                        }
                        r0.A03 = str;
                    } else if (Dbe.A02(31, 8, 89).equals(A0q)) {
                        if (r7.A11() != 16L.A0G) {
                            str = r7.A1P();
                        }
                        r0.A07 = str;
                    } else if ("profile_pic_url".equals(A0q)) {
                        r0.A02 = 16h.A00(r7);
                    } else if ("last_logout_timestamp".equals(A0q)) {
                        r0.A01 = r7.A0y();
                    } else if ("login_token_update_timestamp".equals(A0q)) {
                        r0.A00 = r7.A0y();
                    } else if ("is_fx_sso".equals(A0q)) {
                        r0.A09 = r7.A0d();
                    } else if ("is_app_level_spi".equals(A0q)) {
                        if (r7.A11() != 16L.A0G) {
                            str = r7.A1P();
                        }
                        0qQ.A0B(str, 0);
                        r0.A04 = str;
                    }
                }
                r7.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
