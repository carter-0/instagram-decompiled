package X;

import android.content.Context;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.instagram.common.session.UserSession;

public final class L9Z {
    public VideoStickerAnythingProcessor A00;
    public VideoStickerAnythingProcessorV2 A01;
    public 0sP A02;
    public final C11769SgG A03;
    public final UserSession A04;
    public final RRN A05;

    public L9Z(Context context, UserSession userSession) {
        long j;
        AnonymousClass7TG.A1O(context, userSession);
        this.A04 = userSession;
        boolean A032 = LRr.A03(userSession);
        RRN A002 = C62959KpB.A00();
        if (A032) {
            j = 360;
        } else {
            j = 720;
        }
        A002.A03 = j;
        A002.A02 = 30;
        A002.A00 = 30.0d;
        A002.A01 = 15;
        this.A05 = A002;
        this.A00 = new VideoStickerAnythingProcessor(context, A002, userSession);
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = new VideoStickerAnythingProcessorV2(context, A002, userSession);
        this.A01 = videoStickerAnythingProcessorV2;
        this.A03 = new C11769SgG(A002, videoStickerAnythingProcessorV2, AnonymousClass05K.A01);
        this.A00.A06 = new C22131Xvv(this);
        this.A01.A04 = new C22132Xvw(this);
    }
}
