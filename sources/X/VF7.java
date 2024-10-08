package X;

import com.instagram.music.common.model.WordOffset;
import java.io.IOException;

public abstract class VF7 {
    public static WordOffset parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            WordOffset wordOffset = new WordOffset();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("start_index".equals(A17)) {
                    wordOffset.A02 = r3.A1D();
                } else if ("end_index".equals(A17)) {
                    wordOffset.A00 = r3.A1D();
                } else if ("start_offset_ms".equals(A17)) {
                    wordOffset.A03 = r3.A1D();
                } else if ("end_offset_ms".equals(A17)) {
                    wordOffset.A01 = r3.A1D();
                } else if ("trailing_space".equals(A17)) {
                    wordOffset.A04 = r3.A0d();
                }
                r3.A0z();
            }
            return wordOffset;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
