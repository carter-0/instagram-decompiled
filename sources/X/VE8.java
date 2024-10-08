package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

public abstract class VE8 {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.5u1, java.lang.Object] */
    public static C298785u1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    obj.A07 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1C(A0q)) {
                    obj.A02 = VE6.A00(r4.A1Q());
                } else if ("owner".equals(A0q)) {
                    obj.A03 = C41845B3m.A0a(r4, false);
                } else if (C41845B3m.A1E(A0q)) {
                    obj.A08 = AnonymousClass7TG.A0l(r4);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("feedback_item".equals(A0q)) {
                    obj.A01 = 1Xj.A00(r4);
                } else if (AnonymousClass000.A00(3604).equals(A0q)) {
                    obj.A00 = D1H.parseFromJson(r4);
                } else if (AnonymousClass000.A00(723).equals(A0q)) {
                    obj.A04 = AnonymousClass7TF.A0X(r4);
                } else if (AnonymousClass000.A00(2767).equals(A0q)) {
                    obj.A09 = r4.A0d();
                } else if (C273654mx.A00(3462).equals(A0q)) {
                    obj.A05 = AnonymousClass7TF.A0Z(r4);
                } else if ("is_draft".equals(A0q)) {
                    obj.A0A = r4.A0d();
                } else if (C273654mx.A00(287).equals(A0q)) {
                    obj.A0B = r4.A0d();
                } else if ("show_map".equals(A0q)) {
                    r4.A0d();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
