package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class IQY implements C66483MTm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52079GDz A01;
    public final /* synthetic */ ClipsMidcardVirtualVideoPlayerController A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;

    public final void D6q(AnonymousClass3Q2 r9) {
        MediaComposition mediaComposition = r9.A0r;
        if (mediaComposition == null) {
            DbT.A1Q(0wj.A01, "ClipsMidcardVirtualVideoPlayerController: generated draft mediaComposition is null", 817892914);
            return;
        }
        try {
            mediaComposition.A0A(AnonymousClass7TF.A0R(0Tu.A05, this.A02.A05, 36330389622571622L));
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(this.A00);
            map.put(valueOf, mediaComposition);
            this.A03.put(valueOf, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(Q1Z.A00((C13725Tfv) null, C266714aE.VIDEO, mediaComposition))));
        } catch (TQC e) {
            0wj r2 = 0wj.A01;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("ClipsMidcardVirtualVideoPlayerController: draft VVP failed, error: ");
            DbT.A1Q(r2, AnonymousClass7TF.A0i(e.getStackTrace(), A1A), 817892914);
        }
        Map map2 = this.A04;
        if (map2.size() == 4) {
            ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController = this.A02;
            clipsMidcardVirtualVideoPlayerController.A00 = true;
            C51971G9r.A1K(clipsMidcardVirtualVideoPlayerController.A05);
            I04 i04 = clipsMidcardVirtualVideoPlayerController.sequentialPlayerManager;
            if (i04 == null) {
                0qQ.A0F("sequentialPlayerManager");
                throw AnonymousClass00P.createAndThrow();
            }
            Map map3 = this.A03;
            List list = this.A01.A0D;
            AnonymousClass7TF.A1B(map3, 1, list);
            i04.A04 = map2;
            i04.A03 = map3;
            i04.A02 = list;
            if (i04.A00 == -1) {
                i04.A00 = 0;
            }
            I04.A00(i04);
        }
    }

    public IQY(C52079GDz gDz, ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController, Map map, Map map2, int i) {
        this.A02 = clipsMidcardVirtualVideoPlayerController;
        this.A04 = map;
        this.A00 = i;
        this.A03 = map2;
        this.A01 = gDz;
    }

    public final void D6p(String str) {
        DbT.A1Q(0wj.A01, 002.A0R("ClipsMidcardVirtualVideoPlayerController: failed to generate pending media from draft. failure message is: ", AnonymousClass000.A00(147)), 817892914);
    }
}
