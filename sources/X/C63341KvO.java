package X;

import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import com.instagram.model.shopping.sizechart.SizeChartRow;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KvO  reason: case insensitive filesystem */
public abstract class C63341KvO {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.model.shopping.sizechart.SizeChartRow] */
    public static SizeChartRow parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("label".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("measurements".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            SizeChartMeasurement parseFromJson = C63340KvN.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
