package X;

import java.io.IOException;

/* renamed from: X.RUv  reason: case insensitive filesystem */
public abstract class C9244RUv {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.RxA] */
    public static C10731RxA parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("download_url".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("uncompressed_file_sha256_checksum".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(1003).equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("dod_version_number".equals(A17)) {
                    obj.A01 = r3.A1D();
                } else if ("compression_format".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
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
