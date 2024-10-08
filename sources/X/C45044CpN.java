package X;

import java.io.IOException;

/* renamed from: X.CpN  reason: case insensitive filesystem */
public abstract class C45044CpN {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cvt, java.lang.Object] */
    public static C45413Cvt parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C273654mx.A00(45).equals(A17)) {
                    obj.A03 = C45080Cpx.A00(AnonymousClass7TG.A0l(r3));
                } else if (C41845B3m.A1E(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1D(A17)) {
                    obj.A00 = 1XW.parseFromJson(r3);
                } else if ("pivot_items".equals(A17)) {
                    obj.A02 = C17066VGo.parseFromJson(r3);
                } else if ("cta".equals(A17)) {
                    obj.A01 = C45043CpM.parseFromJson(r3);
                } else if ("show_attribution".equals(A17)) {
                    obj.A05 = r3.A0d();
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
