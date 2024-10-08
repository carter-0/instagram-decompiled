package X;

import java.io.IOException;

/* renamed from: X.5ou  reason: invalid class name and case insensitive filesystem */
public abstract class C295785ou {
    public static C295795ov parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C295795ov r1 = new C295795ov();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("channel".equals(A0q)) {
                    r1.A02 = Ha2.parseFromJson(r3);
                } else if ("media".equals(A0q)) {
                    r1.A0A = 1Xj.A00(r3);
                } else if ("account_recs_3up".equals(A0q)) {
                    r1.A0C = C44753CkP.parseFromJson(r3);
                } else if ("account_rec".equals(A0q)) {
                    r1.A01 = C44195CZi.parseFromJson(r3);
                } else if ("igtv".equals(A0q)) {
                    r1.A05 = C54970Ha3.parseFromJson(r3);
                } else if ("shopping".equals(A0q)) {
                    r1.A09 = C16941VBt.parseFromJson(r3);
                } else if ("rec_cover".equals(A0q)) {
                    r1.A04 = C48891Elr.parseFromJson(r3);
                } else if ("media_location_map".equals(A0q)) {
                    r1.A08 = C70279O0j.parseFromJson(r3);
                } else if ("clips".equals(A0q)) {
                    r1.A03 = C295815ox.parseFromJson(r3);
                } else if ("guide".equals(A0q)) {
                    r1.A0D = VE8.parseFromJson(r3);
                } else if ("media_or_ad".equals(A0q)) {
                    r1.A0B = 1Xj.A00(r3);
                } else if ("interest_keyword_recommendation".equals(A0q)) {
                    r1.A06 = VBW.parseFromJson(r3);
                } else if ("interest_keyword_recommendations".equals(A0q)) {
                    r1.A0E = O1C.parseFromJson(r3);
                } else if ("topic_tile".equals(A0q)) {
                    r1.A07 = C44728Cjw.parseFromJson(r3);
                }
                r3.A0z();
            }
            r1.A01();
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
