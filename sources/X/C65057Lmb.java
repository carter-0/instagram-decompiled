package X;

import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.Lmb  reason: case insensitive filesystem */
public final class C65057Lmb implements C41820B2a {
    public final /* synthetic */ K5W A00;

    public final void DCZ() {
    }

    public C65057Lmb(K5W k5w) {
        this.A00 = k5w;
    }

    public final void DYy() {
        String str;
        K5W k5w = this.A00;
        if (k5w.A06 != null) {
            LoadingSpinnerView loadingSpinnerView = k5w.A0K;
            if (loadingSpinnerView == null) {
                str = "spinner";
            } else {
                loadingSpinnerView.setLoadingStatus(JY5.SUCCESS);
                JTT.A13(k5w.A06);
                IgImageView igImageView = k5w.A0A;
                if (igImageView == null) {
                    str = "loadingThumbnailImageView";
                } else {
                    igImageView.setVisibility(8);
                    ViewGroup viewGroup = k5w.A08;
                    if (viewGroup == null) {
                        str = "clipsReviewContainer";
                    } else {
                        viewGroup.postOnAnimation(k5w.A0U);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0z("TextureView should always exist while showing");
    }

    public final void onCompletion() {
        K5W k5w = this.A00;
        C66567MWv mWv = k5w.A0E;
        if (mWv != null) {
            mWv.seekTo(k5w.A01);
            C66567MWv mWv2 = k5w.A0E;
            if (mWv2 != null) {
                mWv2.start();
            }
        }
    }
}
