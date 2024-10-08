package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;

public final class IQW implements C66483MTm {
    public final /* synthetic */ ClipsMidcardVirtualVideoPlayerController A00;

    public final void D6q(AnonymousClass3Q2 r6) {
        MediaComposition mediaComposition = r6.A0r;
        if (mediaComposition == null) {
            DbT.A1Q(0wj.A01, "ClipsMidcardVirtualVideoPlayerController: generated draft mediaComposition is null", 817892914);
            return;
        }
        try {
            mediaComposition.A0A(false);
            ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController = this.A00;
            HnX hnX = clipsMidcardVirtualVideoPlayerController.midcardPlayerManager;
            if (hnX == null) {
                0qQ.A0F("midcardPlayerManager");
                throw AnonymousClass00P.createAndThrow();
            }
            LVB lvb = hnX.A00;
            if (lvb != null) {
                lvb.A01(mediaComposition);
            }
            clipsMidcardVirtualVideoPlayerController.A00 = true;
            C51971G9r.A1K(clipsMidcardVirtualVideoPlayerController.A05);
        } catch (TQC e) {
            0wj r2 = 0wj.A01;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("ClipsMidcardVirtualVideoPlayerController: draft VVP failed, error: ");
            DbT.A1Q(r2, AnonymousClass7TF.A0i(e.getStackTrace(), A1A), 817892914);
        }
    }

    public IQW(ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController) {
        this.A00 = clipsMidcardVirtualVideoPlayerController;
    }

    public final void D6p(String str) {
        DbT.A1Q(0wj.A01, 002.A0R("ClipsMidcardVirtualVideoPlayerController: failed to generate pending media from draft. failure message is: ", AnonymousClass000.A00(147)), 817892914);
    }
}
