package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ckr  reason: case insensitive filesystem */
public abstract class C44780Ckr {
    public static C45294Ctx parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45294Ctx ctx = new C45294Ctx();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("country_code".equals(A17)) {
                    ctx.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("area_codes".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    ctx.A01 = arrayList;
                }
                r4.A0z();
            }
            return ctx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
