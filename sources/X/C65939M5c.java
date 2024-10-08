package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.widget.balloonsview.BalloonsView;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.M5c  reason: case insensitive filesystem */
public final /* synthetic */ class C65939M5c implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C65939M5c(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void run() {
        Bitmap A07;
        ReelViewerFragment reelViewerFragment = this.A00;
        C314116hg r5 = reelViewerFragment.mBalloonsAnimationController;
        SimpleImageUrl A0V = DbS.A0V(reelViewerFragment.A25);
        C314116hg.A00(r5, new C65777LzV(reelViewerFragment, 1), C62490Kgf.Emoji, false);
        Bitmap decodeFile = BitmapFactory.decodeFile(A0V.getUrl());
        if (!(decodeFile == null || (A07 = 1MF.A07(decodeFile, 200, 200)) == null)) {
            BalloonsView balloonsView = (BalloonsView) r5.A00.getView();
            if (!balloonsView.A03) {
                balloonsView.A08.add(A07);
                BalloonsView.A00(balloonsView);
            }
        }
        reelViewerFragment.A25 = null;
    }
}
