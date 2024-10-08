package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VCh  reason: case insensitive filesystem */
public abstract class C16955VCh {
    public static VY7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VY7 vy7 = new VY7();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("__typename".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("cache_key".equals(A17)) {
                    vy7.A00 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A17(A17)) {
                    vy7.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("md5_hash".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("uri".equals(A17)) {
                    vy7.A02 = AnonymousClass7TG.A0l(r4);
                } else if (TraceFieldType.CompressionType.equals(A17)) {
                    EnumHelper.A00(r4.A1Q(), C16620UyG.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("string_identifiers".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    vy7.A03 = arrayList;
                }
                r4.A0z();
            }
            return vy7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
