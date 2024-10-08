package X;

import java.io.IOException;

/* renamed from: X.Cnp  reason: case insensitive filesystem */
public abstract class C44955Cnp {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.JZC, java.lang.Object] */
    public static JZC parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("track".equals(A17)) {
                    obj.A08 = AnonymousClass3UP.parseFromJson(r3);
                } else if ("metadata".equals(A17)) {
                    obj.A0A = D0F.parseFromJson(r3);
                } else if ("original_sound".equals(A17)) {
                    obj.A05 = 1dk.parseFromJson(r3);
                } else if ("original_sound_schema".equals(A17)) {
                    obj.A06 = 1dk.parseFromJson(r3);
                } else if ("mood".equals(A17)) {
                    obj.A01 = C44217Cae.parseFromJson(r3);
                } else if ("genre".equals(A17)) {
                    obj.A00 = CY7.parseFromJson(r3);
                } else if ("playlist".equals(A17)) {
                    obj.A07 = CbU.parseFromJson(r3);
                } else if ("category".equals(A17)) {
                    obj.A04 = CVS.parseFromJson(r3);
                } else if ("collection".equals(A17)) {
                    obj.A03 = C44065CUi.parseFromJson(r3);
                } else if ("artist".equals(A17)) {
                    obj.A02 = C63010Kq0.parseFromJson(r3);
                }
                r3.A0z();
            }
            obj.A02();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
