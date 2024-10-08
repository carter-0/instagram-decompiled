package X;

import java.io.IOException;

/* renamed from: X.A0z  reason: case insensitive filesystem */
public abstract class C39583A0z {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Af1] */
    public static Af1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C273654mx.A00(831).equals(A17)) {
                    obj.A04 = A11.A00(r4.A1Q());
                } else if ("music_sticker_model".equals(A17)) {
                    obj.Edm(C255673uX.parseFromJson(r4));
                } else if (C273654mx.A00(345).equals(A17)) {
                    AnonymousClass9SE parseFromJson = AnonymousClass9SD.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A01 = parseFromJson;
                } else if ("text_color".equals(A17)) {
                    obj.A00 = r4.A1D();
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
