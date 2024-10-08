package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VCi  reason: case insensitive filesystem */
public abstract class C16956VCi {
    public static C17672Vc3 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17672Vc3 vc3 = new C17672Vc3();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C273654mx.A00(2918).equals(A17)) {
                    vc3.A08 = r4.A0d();
                } else if (C273654mx.A00(2374).equals(A17)) {
                    vc3.A00 = r4.A1D();
                } else if (AnonymousClass000.A00(5353).equals(A17)) {
                    vc3.A01 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("cache_key".equals(A17)) {
                        vc3.A03 = AnonymousClass7TG.A0l(r4);
                    } else if (C41845B3m.A17(A17)) {
                        vc3.A04 = AnonymousClass7TG.A0l(r4);
                    } else if ("md5_hash".equals(A17)) {
                        vc3.A05 = AnonymousClass7TG.A0l(r4);
                    } else if ("uri".equals(A17)) {
                        vc3.A06 = AnonymousClass7TG.A0l(r4);
                    } else if (TraceFieldType.CompressionType.equals(A17)) {
                        vc3.A02 = (C16620UyG) EnumHelper.A00(r4.A1Q(), C16620UyG.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if (C273654mx.A00(2302).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                VY7 parseFromJson = C16955VCh.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        vc3.A07 = arrayList;
                    }
                }
                r4.A0z();
            }
            return vc3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
