package X;

import java.io.IOException;

/* renamed from: X.4wi  reason: invalid class name and case insensitive filesystem */
public abstract class C278334wi {
    public static C376649Iu parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            C278354wk r3 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("link_context".equals(A0q)) {
                    r3 = C278344wj.parseFromJson(r5);
                } else if ("text".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            C376649Iu r0 = new C376649Iu(str);
            if (r3 != null) {
                r0.A00 = r3;
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C376649Iu r3, 17Z r4) {
        r4.A0c();
        if (r3.A00 != null) {
            r4.A0q("link_context");
            C278354wk r2 = (C278354wk) r3.A00;
            r4.A0c();
            if (r2.A00 != null) {
                r4.A0q("link_image_url");
                16h.A01(r4, r2.A00);
            }
            String str = r2.A03;
            if (str != null) {
                r4.A0R("link_title", str);
            }
            String str2 = r2.A02;
            if (str2 != null) {
                r4.A0R("link_body", str2);
            }
            String str3 = r2.A05;
            if (str3 != null) {
                r4.A0R("link_url", str3);
            }
            String str4 = r2.A04;
            if (str4 != null) {
                r4.A0R("link_summary", str4);
            }
            String str5 = r2.A01;
            if (str5 != null) {
                r4.A0R("link_playable_audio_url", str5);
            }
            if (r2.A06 != null) {
                16P.A03(r4, "link_music_preview_countries_allowed");
                for (String str6 : r2.A06) {
                    if (str6 != null) {
                        r4.A0t(str6);
                    }
                }
                r4.A0Y();
            }
            r4.A0Z();
        }
        String str7 = r3.A01;
        if (str7 != null) {
            r4.A0R("text", str7);
        }
        r4.A0Z();
    }
}
