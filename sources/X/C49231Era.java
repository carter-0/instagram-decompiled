package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.Era  reason: case insensitive filesystem */
public abstract class C49231Era {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.82j, java.lang.Object] */
    public static C3499082j parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    obj.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("subtitle".equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("fundraiser_creator".equals(A17)) {
                    obj.A03 = ABS.parseFromJson(r3);
                } else if ("fundraiser_id".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(713).equals(A17)) {
                    obj.A01 = C64130LPe.parseFromJson(r3);
                } else if (AnonymousClass000.A00(1235).equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("beneficiary".equals(A17)) {
                    obj.A02 = ABS.parseFromJson(r3);
                } else if ("source".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("cohosts_count".equals(A17)) {
                    obj.A00 = r3.A1D();
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
