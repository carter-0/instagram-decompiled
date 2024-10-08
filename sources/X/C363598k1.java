package X;

import java.io.IOException;

/* renamed from: X.8k1  reason: invalid class name and case insensitive filesystem */
public final class C363598k1 {
    public static C363578jy parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("default_share_to_fb_enabled".equals(A0q)) {
                    r1.A01 = Boolean.valueOf(r8.A0d());
                } else if ("oa_reuse_on_fb_enabled".equals(A0q)) {
                    r1.A02 = Boolean.valueOf(r8.A0d());
                } else if ("share_to_fb_unavailable".equals(A0q)) {
                    r1.A03 = Boolean.valueOf(r8.A0d());
                } else if ("show_bonus_prompt_in_creation".equals(A0q)) {
                    r1.A04 = Boolean.valueOf(r8.A0d());
                } else if ("show_share_to_fb_prompt_in_creation_flow".equals(A0q)) {
                    r1.A05 = Boolean.valueOf(r8.A0d());
                } else if ("show_share_to_fb_prompt_in_media_viewer".equals(A0q)) {
                    r1.A06 = Boolean.valueOf(r8.A0d());
                } else {
                    1XY.A01(r8, r1, A0q);
                }
                r8.A0z();
            }
            Boolean bool = r1.A01;
            0qQ.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = r1.A02;
            0qQ.A0A(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = r1.A03;
            0qQ.A0A(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = r1.A04;
            0qQ.A0A(bool4);
            boolean booleanValue4 = bool4.booleanValue();
            Boolean bool5 = r1.A05;
            0qQ.A0A(bool5);
            boolean booleanValue5 = bool5.booleanValue();
            Boolean bool6 = r1.A06;
            0qQ.A0A(bool6);
            r1.A00 = new C299695vg(booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, bool6.booleanValue());
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
