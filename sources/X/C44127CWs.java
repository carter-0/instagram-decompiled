package X;

import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.InspirationSignalType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWs  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44127CWs {
    public static Map A00(CreatorViewerSignalModel creatorViewerSignalModel) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorViewerSignalModel.Awl() != null) {
            A1H.put("details", creatorViewerSignalModel.Awl().FHC());
        }
        if (creatorViewerSignalModel.BwM() != null) {
            InspirationSignalType BwM = creatorViewerSignalModel.BwM();
            0qQ.A0B(BwM, 0);
            A1H.put("signal_type", BwM.A00);
        }
        if (creatorViewerSignalModel.getTitle() != null) {
            C41845B3m.A12(creatorViewerSignalModel.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
