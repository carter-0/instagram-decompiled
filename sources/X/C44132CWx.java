package X;

import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.CWx  reason: case insensitive filesystem */
public abstract class C44132CWx {
    public static CreatorViewerSignalReelsTextDetailsImpl parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            FormattedStringImpl formattedStringImpl = null;
            ClipsTextFormatType clipsTextFormatType = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1L(A17)) {
                    formattedStringImpl = C44152CXr.parseFromJson(r5);
                } else if ("text_format_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    clipsTextFormatType = C248693iQ.A00(str);
                }
                r5.A0z();
            }
            return new CreatorViewerSignalReelsTextDetailsImpl(clipsTextFormatType, formattedStringImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
