package X;

import java.io.IOException;

/* renamed from: X.Clf  reason: case insensitive filesystem */
public abstract class C44829Clf {
    public static C45411Cvr parseFromJson(16F r4) {
        Integer num;
        String str;
        0qQ.A0B(r4, 0);
        try {
            C45411Cvr cvr = new C45411Cvr();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("info_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    cvr.A05 = str;
                } else if ("bloks_data".equals(A17)) {
                    if (11Z.A07()) {
                        0wb.A01(0kg.A0A, "BloksRenderModel.parse", "BloksRenderModel is being parsed on the UI thread, move this to a background thread");
                    }
                    C257593xe parseFromJson = C45662D0m.parseFromJson(r4);
                    cvr.A02 = new C270044g6(parseFromJson.A00, parseFromJson.A01);
                } else if ("sticker_share_data".equals(A17)) {
                    cvr.A03 = C44830Clg.parseFromJson(r4);
                } else if ("padding_top".equals(A17)) {
                    cvr.A01 = r4.A1D();
                } else if ("padding_bottom".equals(A17)) {
                    cvr.A00 = r4.A1D();
                }
                r4.A0z();
            }
            if (cvr.A02 != null) {
                num = AnonymousClass05K.A01;
            } else if (cvr.A03 == null) {
                return cvr;
            } else {
                num = AnonymousClass05K.A0C;
            }
            cvr.A04 = num;
            return cvr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
