package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8w2  reason: invalid class name and case insensitive filesystem */
public abstract class C370228w2 {
    public static C370158vv parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C370158vv r0 = new C370158vv(false);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("clips_voiceover_segments".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            M1Y parseFromJson = C394769yf.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A05 = arrayList;
                } else if ("video_volume".equals(A0q)) {
                    r0.A03 = (float) r5.A0U();
                } else if ("audio_overlay_volume".equals(A0q)) {
                    r0.A00 = (float) r5.A0U();
                } else if ("voiceover_volume".equals(A0q)) {
                    r0.A04 = (float) r5.A0U();
                } else if ("sound_effects_volume".equals(A0q)) {
                    r0.A01 = (float) r5.A0U();
                } else if ("sticker_volume".equals(A0q)) {
                    r0.A02 = (float) r5.A0U();
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
