package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class P91 implements C74403PuJ {
    public final /* synthetic */ ConstrainedImageView A00;
    public final /* synthetic */ PB3 A01;
    public final /* synthetic */ PBM A02;

    public final void D55(String str, boolean z) {
        0qQ.A0B(str, 0);
        this.A02.A00 = null;
        IgImageView igImageView = this.A00;
        igImageView.setUrl(new ExtendedImageUrl(str, igImageView.getWidth(), igImageView.getHeight()), this.A01.A00);
    }

    public P91(ConstrainedImageView constrainedImageView, PB3 pb3, PBM pbm) {
        this.A02 = pbm;
        this.A00 = constrainedImageView;
        this.A01 = pb3;
    }

    public final void onError(String str) {
        0wb.A03("StickerReactionContentDefinition", "Error while fetching avatar sticker from Instamadillo media store");
    }
}
