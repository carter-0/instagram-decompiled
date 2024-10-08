package X;

import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import java.io.IOException;

public abstract class VBC {
    public static ReelsVisualRepliesModel parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ReelsVisualRepliesModel reelsVisualRepliesModel = new ReelsVisualRepliesModel();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C273654mx.A00(3018).equals(A17)) {
                    reelsVisualRepliesModel.A00 = C45594Cz6.parseFromJson(r3);
                } else {
                    AAV.A01(r3, reelsVisualRepliesModel, A17);
                }
                r3.A0z();
            }
            return reelsVisualRepliesModel;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
