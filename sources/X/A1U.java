package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class A1U {
    public static C40424Abv parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C40424Abv abv = new C40424Abv();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("primary_color".equals(A17)) {
                    abv.A01 = r5.A1D();
                } else if ("secondary_color".equals(A17)) {
                    abv.A02 = r5.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("font_name".equals(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r5);
                        0qQ.A0B(A0l, 0);
                        abv.A04 = A0l;
                    } else if ("letter_spacing_multiplier".equals(A17)) {
                        abv.A00 = (float) r5.A0U();
                    } else if ("text_emphasis_mode".equals(A17)) {
                        abv.A03 = A1S.A00(AnonymousClass7TG.A0l(r5));
                    } else if ("line_coordinate_x".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                arrayList.add(AnonymousClass7TF.A0U(r5));
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        abv.A05 = arrayList;
                    } else if ("line_coordinate_y".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                arrayList.add(AnonymousClass7TF.A0U(r5));
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        abv.A06 = arrayList;
                    }
                }
                r5.A0z();
            }
            return abv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
