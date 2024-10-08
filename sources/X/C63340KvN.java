package X;

import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import java.io.IOException;

/* renamed from: X.KvN  reason: case insensitive filesystem */
public abstract class C63340KvN {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.model.shopping.sizechart.SizeChartMeasurement, java.lang.Object] */
    public static SizeChartMeasurement parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("dimension".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("max_size".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0X(r3);
                } else if ("min_size".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0X(r3);
                } else if ("string_measurement".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
