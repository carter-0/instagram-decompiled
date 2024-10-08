package X;

import android.app.Activity;
import android.view.View;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

public final class LXC implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ K7b A01;

    public LXC(Activity activity, K7b k7b) {
        this.A01 = k7b;
        this.A00 = activity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1817012424);
        K7b k7b = this.A01;
        MusicPickReelTag musicPickReelTag = (MusicPickReelTag) k7b.requireArguments().getParcelable(C273654mx.A00(546));
        if (musicPickReelTag != null) {
            AnonymousClass0eM r1 = k7b.A0C;
            if (r1.getValue() != null) {
                ((C310516bB) k7b.A0D.getValue()).A01(28D.A3Y, musicPickReelTag, (MusicPickStickerModel) r1.getValue());
            }
        }
        DbX.A10(this.A00, AnonymousClass37D.A00);
        AnonymousClass0fD.A0C(-489921430, A05);
    }
}
