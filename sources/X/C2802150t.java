package X;

import android.text.Layout;
import java.io.IOException;

/* renamed from: X.50t  reason: invalid class name and case insensitive filesystem */
public abstract class C2802150t {
    public static C2802250u parseFromJson(16F r8) {
        C306396Lz r2;
        C360728f3 r22;
        String str;
        0qQ.A0B(r8, 0);
        try {
            C2802250u r0 = new C2802250u();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("text_metadata".equals(A0q)) {
                    r0.A0D = C2802450w.parseFromJson(r8);
                } else if ("text_emphasis".equals(A0q)) {
                    r0.A0A = Layout.Alignment.valueOf(r8.A1Q());
                } else if ("padding_x".equals(A0q)) {
                    r0.A03 = (float) r8.A0U();
                } else if ("padding_y".equals(A0q)) {
                    r0.A04 = (float) r8.A0U();
                } else if ("text_color".equals(A0q)) {
                    r0.A07 = r8.A1D();
                } else if ("text_size".equals(A0q)) {
                    r0.A05 = (float) r8.A0U();
                } else if ("shadow_layer".equals(A0q)) {
                    r0.A0E = VIX.parseFromJson(r8);
                } else if ("line_spacing_add".equals(A0q)) {
                    r0.A01 = (float) r8.A0U();
                } else if ("line_spacing_mult".equals(A0q)) {
                    r0.A02 = (float) r8.A0U();
                } else if ("letter_spacing".equals(A0q)) {
                    r0.A00 = (float) r8.A0U();
                } else if ("truncation_max_lines".equals(A0q)) {
                    r0.A09 = r8.A1D();
                } else if ("truncation_suffix".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    r0.A0G = str;
                } else if ("is_animated".equals(A0q)) {
                    r0.A0H = r8.A0d();
                } else if ("safe_width".equals(A0q)) {
                    r0.A06 = r8.A1D();
                } else if ("drawable_source".equals(A0q)) {
                    r0.A0F = AnonymousClass511.A00(r8.A1Q());
                } else if ("is_story_text_drawable".equals(A0q)) {
                    r0.A0I = r8.A0d();
                } else if ("animation_id".equals(A0q)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    C360728f3[] values = C360728f3.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r22 = null;
                            break;
                        }
                        r22 = values[i];
                        if (0qQ.A0K(r22.A00, A1Q)) {
                            break;
                        }
                        i++;
                    }
                    r0.A0B = r22;
                } else if ("effect_id".equals(A0q)) {
                    String A1Q2 = r8.A1Q();
                    0qQ.A0B(A1Q2, 0);
                    C306396Lz[] values2 = C306396Lz.values();
                    int length2 = values2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            r2 = null;
                            break;
                        }
                        r2 = values2[i2];
                        if (0qQ.A0K(r2.A00, A1Q2)) {
                            break;
                        }
                        i2++;
                    }
                    r0.A0C = r2;
                } else if ("text_effect_color".equals(A0q)) {
                    r0.A08 = r8.A1D();
                }
                r8.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
