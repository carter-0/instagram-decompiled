package X;

import android.webkit.URLUtil;
import com.instagram.common.typedurl.SimpleImageUrl;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.PXr  reason: case insensitive filesystem */
public final /* synthetic */ class C73156PXr implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C73156PXr(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void run() {
        C314116hg r3;
        SimpleImageUrl A0V;
        int i;
        ReelViewerFragment reelViewerFragment = this.A00;
        if (URLUtil.isContentUrl(reelViewerFragment.A1t) || URLUtil.isFileUrl(reelViewerFragment.A1t)) {
            String A002 = AnonymousClass6FA.A00(reelViewerFragment.getSession()).A00(reelViewerFragment.A1t);
            if (A002 != null) {
                r3 = reelViewerFragment.mBalloonsAnimationController;
                A0V = DbS.A0V(A002);
                i = 4;
            } else {
                return;
            }
        } else {
            r3 = reelViewerFragment.mBalloonsAnimationController;
            A0V = DbS.A0V(reelViewerFragment.A1t);
            i = 3;
        }
        r3.A01(A0V, new C65777LzV(reelViewerFragment, i));
    }
}
