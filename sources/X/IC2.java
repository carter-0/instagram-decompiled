package X;

import android.view.View;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

public final class IC2 implements View.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C317616nY A02;
    public final /* synthetic */ C316826mH A03;

    public IC2(C255773uh r1, C255783ui r2, C317616nY r3, C316826mH r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1389854371);
        C255783ui r5 = this.A01;
        MusicPickStickerModel A0D = r5.A0D();
        if (A0D != null) {
            C316826mH r1 = this.A03;
            C317616nY r4 = this.A02;
            C255773uh r3 = this.A00;
            if (A0D.A01 == 0) {
                View view2 = r1.A00;
                if (view2 == null) {
                    0qQ.A0F("buttonView");
                    throw AnonymousClass00P.createAndThrow();
                }
                view2.performHapticFeedback(1);
                MusicPickStickerModel A0D2 = r5.A0D();
                if (A0D2 != null) {
                    r4.DSw(new MusicPickReelTag(r5.A03, r5.A04, r5.A02, r5.A00, r5.A01, r3.A00(), r5.A09), A0D2);
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0C(-1530706351, A05);
                    throw A0y;
                }
            }
        }
        AnonymousClass0fD.A0C(137839453, A05);
    }
}
