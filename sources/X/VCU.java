package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VCU {
    public static VY6 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VY6 vy6 = new VY6();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("__typename".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("depth".equals(A17)) {
                    vy6.A00 = r4.A1D();
                } else if (C41845B3m.A1A(A17)) {
                    vy6.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("block_type".equals(A17)) {
                    vy6.A01 = (C16619UyF) EnumHelper.A00(r4.A1Q(), C16619UyF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if (Pxd.A00(229).equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17434VVn parseFromJson = VCT.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vy6.A03 = arrayList;
                }
                r4.A0z();
            }
            return vy6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
