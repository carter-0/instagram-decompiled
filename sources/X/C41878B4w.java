package X;

import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4w  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41878B4w {
    public static Map A00(ClipsContextualHighlightInfoIntf clipsContextualHighlightInfoIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (clipsContextualHighlightInfoIntf.getChainingMediaId() != null) {
            A1H.put("chaining_media_id", clipsContextualHighlightInfoIntf.getChainingMediaId());
        }
        if (clipsContextualHighlightInfoIntf.getContextualHighlightId() != null) {
            A1H.put("contextual_highlight_id", clipsContextualHighlightInfoIntf.getContextualHighlightId());
        }
        if (clipsContextualHighlightInfoIntf.getContextualHighlightTitle() != null) {
            A1H.put("contextual_highlight_title", clipsContextualHighlightInfoIntf.getContextualHighlightTitle());
        }
        if (clipsContextualHighlightInfoIntf.Ar9() != null) {
            ContextualHighlightType Ar9 = clipsContextualHighlightInfoIntf.Ar9();
            0qQ.A0B(Ar9, 0);
            A1H.put("contextual_highlight_type", Ar9.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
