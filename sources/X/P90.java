package X;

import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class P90 implements C74403PuJ {
    public final /* synthetic */ IgImageView A00;
    public final /* synthetic */ AnonymousClass78H A01;
    public final /* synthetic */ C3263876o A02;

    public final void D55(String str, boolean z) {
        0qQ.A0B(str, 0);
        this.A02.A00 = null;
        IgImageView igImageView = this.A00;
        igImageView.setUrl(new ExtendedImageUrl(str, igImageView.getWidth(), igImageView.getHeight()), this.A01.A01);
    }

    public final void onError(String str) {
    }

    public P90(IgImageView igImageView, AnonymousClass78H r2, C3263876o r3) {
        this.A02 = r3;
        this.A00 = igImageView;
        this.A01 = r2;
    }
}
