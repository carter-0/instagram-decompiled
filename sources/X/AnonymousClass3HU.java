package X;

import java.io.IOException;

/* renamed from: X.3HU  reason: invalid class name */
public abstract class AnonymousClass3HU {
    public static AnonymousClass3HV parseFromJson(16F r37) {
        16F r2 = r37;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Double d4 = null;
            Double d5 = null;
            Double d6 = null;
            Double d7 = null;
            Double d8 = null;
            Double d9 = null;
            Double d10 = null;
            Double d11 = null;
            Double d12 = null;
            Double d13 = null;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            Double d19 = null;
            Double d20 = null;
            Double d21 = null;
            Double d22 = null;
            Double d23 = null;
            Double d24 = null;
            Double d25 = null;
            Double d26 = null;
            Double d27 = null;
            Double d28 = null;
            Double d29 = null;
            Double d30 = null;
            String str = null;
            Double d31 = null;
            Double d32 = null;
            Double d33 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("adjust_ide_holdout_scores".equals(A0q)) {
                    d = Double.valueOf(r2.A0U());
                } else if ("adjust_integrity_scores".equals(A0q)) {
                    d2 = Double.valueOf(r2.A0U());
                } else if ("bff_scores".equals(A0q)) {
                    d3 = Double.valueOf(r2.A0U());
                } else if ("crown_vm_scores_final".equals(A0q)) {
                    d4 = Double.valueOf(r2.A0U());
                } else if ("emeimps".equals(A0q)) {
                    d5 = Double.valueOf(r2.A0U());
                } else if ("ereply".equals(A0q)) {
                    d6 = Double.valueOf(r2.A0U());
                } else if ("fp".equals(A0q)) {
                    d7 = Double.valueOf(r2.A0U());
                } else if ("general_vm_scores_final".equals(A0q)) {
                    d8 = Double.valueOf(r2.A0U());
                } else if ("models_is_reciprocal_convos_send_mtml".equals(A0q)) {
                    d9 = Double.valueOf(r2.A0U());
                } else if ("models_pviewer_or_author_contact".equals(A0q)) {
                    d10 = Double.valueOf(r2.A0U());
                } else if ("models_stories_emeimps_rate_mtml_gpu".equals(A0q)) {
                    d11 = Double.valueOf(r2.A0U());
                } else if ("models_stories_evpvd_mtml_gpu".equals(A0q)) {
                    d12 = Double.valueOf(r2.A0U());
                } else if ("models_stories_plike_mtml_gpu".equals(A0q)) {
                    d13 = Double.valueOf(r2.A0U());
                } else if ("models_stories_pnext_pos_gpu".equals(A0q)) {
                    d14 = Double.valueOf(r2.A0U());
                } else if ("models_stories_preply_bar_tap_time_spent_3_5_sec_gpu".equals(A0q)) {
                    d15 = Double.valueOf(r2.A0U());
                } else if ("models_stories_preply_bar_tap_time_spent_rate_3_5_sec_gpu".equals(A0q)) {
                    d16 = Double.valueOf(r2.A0U());
                } else if ("models_stories_preshare_button_tap_rate_mtml_gpu".equals(A0q)) {
                    d17 = Double.valueOf(r2.A0U());
                } else if ("models_stories_pskip_photos_075_videos_085".equals(A0q)) {
                    d18 = Double.valueOf(r2.A0U());
                } else if ("models_stories_ptap_new_mtml_gpu".equals(A0q)) {
                    d19 = Double.valueOf(r2.A0U());
                } else if ("models_stories_vm_interaction".equals(A0q)) {
                    d20 = Double.valueOf(r2.A0U());
                } else if ("pcontact".equals(A0q)) {
                    d21 = Double.valueOf(r2.A0U());
                } else if ("pevpvd".equals(A0q)) {
                    d22 = Double.valueOf(r2.A0U());
                } else if ("plike".equals(A0q)) {
                    d23 = Double.valueOf(r2.A0U());
                } else if ("pnext".equals(A0q)) {
                    d24 = Double.valueOf(r2.A0U());
                } else if ("preciprocal".equals(A0q)) {
                    d25 = Double.valueOf(r2.A0U());
                } else if ("preply".equals(A0q)) {
                    d26 = Double.valueOf(r2.A0U());
                } else if ("preshare".equals(A0q)) {
                    d27 = Double.valueOf(r2.A0U());
                } else if ("pscreenshot".equals(A0q)) {
                    d28 = Double.valueOf(r2.A0U());
                } else if ("pskip".equals(A0q)) {
                    d29 = Double.valueOf(r2.A0U());
                } else if ("ptap".equals(A0q)) {
                    d30 = Double.valueOf(r2.A0U());
                } else if ("ranking_info_token".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("time_spent".equals(A0q)) {
                    d31 = Double.valueOf(r2.A0U());
                } else if ("vm".equals(A0q)) {
                    d32 = Double.valueOf(r2.A0U());
                } else if ("vm_interaction".equals(A0q)) {
                    d33 = Double.valueOf(r2.A0U());
                }
                r2.A0z();
            }
            return new AnonymousClass3HV(d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
