package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ccd  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44295Ccd {
    public static Map A00(DTO dto) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dto.getOriginalMediaId() != null) {
            A1H.put("original_media_id", dto.getOriginalMediaId());
        }
        if (dto.Bno() != null) {
            A1H.put("response_creator_username", dto.Bno());
        }
        if (dto.Bnp() != null) {
            A1H.put("response_id", dto.Bnp());
        }
        return 0Yt.A0B(A1H);
    }
}
