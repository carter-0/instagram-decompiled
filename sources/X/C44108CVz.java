package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.CVz  reason: case insensitive filesystem */
public abstract class C44108CVz {
    public static C68156N2w parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            Long l = null;
            Integer num2 = null;
            Integer num3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (AnonymousClass000.A00(1340).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (C41845B3m.A1G(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("mime_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (C41845B3m.A18(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (AnonymousClass000.A00(390).equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r10);
                } else if ("video_duration".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r10);
                } else {
                    num3 = C41847B3o.A13(r10, num3, A17, IgReactMediaPickerNativeModule.WIDTH);
                }
                r10.A0z();
            }
            return new C68156N2w(num, num2, num3, l, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
