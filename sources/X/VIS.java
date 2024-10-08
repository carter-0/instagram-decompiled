package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VIS {
    public static C19335WUr parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C19335WUr wUr = new C19335WUr();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("primary_color".equals(A17)) {
                    wUr.A06 = r5.A1D();
                } else if ("contrast_color".equals(A17)) {
                    wUr.A05 = r5.A1D();
                } else if ("corner_radius".equals(A17)) {
                    wUr.A01 = (float) r5.A0U();
                } else {
                    ArrayList arrayList = null;
                    if ("serializable_paths".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                C306506Mk parseFromJson = VIE.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        wUr.A08 = arrayList;
                    } else if ("is_frosted".equals(A17)) {
                        wUr.A09 = r5.A0d();
                    } else if ("top_padding_ratio".equals(A17)) {
                        wUr.A04 = (float) r5.A0U();
                    } else if ("bottom_padding_ratio".equals(A17)) {
                        wUr.A00 = (float) r5.A0U();
                    } else if ("horizontal_padding_ratio".equals(A17)) {
                        wUr.A02 = (float) r5.A0U();
                    } else if ("line_spacing_multiplier".equals(A17)) {
                        wUr.A03 = (float) r5.A0U();
                    } else if ("text_emphasis_mode".equals(A17)) {
                        wUr.A07 = A1S.A00(AnonymousClass7TG.A0l(r5));
                    }
                }
                r5.A0z();
            }
            return wUr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
