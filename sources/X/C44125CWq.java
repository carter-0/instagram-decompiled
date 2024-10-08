package X;

import com.instagram.api.schemas.CreatorViewerSignalInfo;
import com.instagram.api.schemas.CreatorViewerSignalType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44125CWq {
    public static Map A00(CreatorViewerSignalInfo creatorViewerSignalInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorViewerSignalInfo.BwL() != null) {
            CreatorViewerSignalType BwL = creatorViewerSignalInfo.BwL();
            0qQ.A0B(BwL, 0);
            A1H.put("signal_type", BwL.A00);
        }
        if (creatorViewerSignalInfo.getText() != null) {
            C41845B3m.A10(creatorViewerSignalInfo.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
