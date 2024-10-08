package X;

import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTATextVariantSource;
import java.io.IOException;

/* renamed from: X.Ecr  reason: case insensitive filesystem */
public abstract class C48334Ecr {
    public static IGCTATextVariantImpl parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            IGCTATextVariantSource iGCTATextVariantSource = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (AnonymousClass000.A00(1254).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("has_emoji".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("language".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if (AnonymousClass000.A00(1883).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    iGCTATextVariantSource = (IGCTATextVariantSource) IGCTATextVariantSource.A01.get(str);
                    if (iGCTATextVariantSource == null) {
                        iGCTATextVariantSource = IGCTATextVariantSource.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            return new IGCTATextVariantImpl(iGCTATextVariantSource, bool, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
