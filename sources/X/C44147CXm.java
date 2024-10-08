package X;

import com.instagram.api.schemas.FileCandidate;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXm  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44147CXm {
    public static Map A00(FileCandidate fileCandidate) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (fileCandidate.B41() != null) {
            A1H.put("favicon_url", fileCandidate.B41());
        }
        if (fileCandidate.B5e() != null) {
            A1H.put("file_extension", fileCandidate.B5e());
        }
        if (fileCandidate.B5i() != null) {
            A1H.put("file_size", fileCandidate.B5i());
        }
        if (fileCandidate.Bd4() != null) {
            A1H.put(AnonymousClass000.A00(347), fileCandidate.Bd4());
        }
        if (fileCandidate.Bd5() != null) {
            A1H.put("playable_url_expiration_timestamp_ms", fileCandidate.Bd5());
        }
        if (fileCandidate.Bd6() != null) {
            A1H.put("playable_url_fallback", fileCandidate.Bd6());
        }
        if (fileCandidate.C7x() != null) {
            A1H.put("title_text", fileCandidate.C7x());
        }
        return 0Yt.A0B(A1H);
    }
}
