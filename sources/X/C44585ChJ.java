package X;

import com.instagram.api.schemas.WordOffsetImpl;
import java.io.IOException;

/* renamed from: X.ChJ  reason: case insensitive filesystem */
public abstract class C44585ChJ {
    public static WordOffsetImpl parseFromJson(16F r18) {
        16F r5 = r18;
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Boolean bool = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("end_index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("end_offset_ms".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else if ("start_index".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r5);
                } else if ("start_offset_ms".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r5);
                } else {
                    bool = C41847B3o.A0z(r5, bool, A17, "trailing_space");
                }
                r5.A0z();
            }
            if (num == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end_index", r5, "WordOffsetImpl");
            } else if (num2 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end_offset_ms", r5, "WordOffsetImpl");
            } else if (num3 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("start_index", r5, "WordOffsetImpl");
            } else if (num4 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("start_offset_ms", r5, "WordOffsetImpl");
            } else if (bool != null || !(r5 instanceof 0c9)) {
                return new WordOffsetImpl(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("trailing_space", r5, "WordOffsetImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
