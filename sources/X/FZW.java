package X;

import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.SpritesheetInfo;

public final class FZW implements C250603lj {
    public final int A00;
    public final int A01;
    public final AnimatedThumbnailView A02;
    public final AnonymousClass0iw A03;
    public final IgImageView A04;
    public final 1Xj A05;
    public final E23 A06;
    public final String A07;

    /* JADX WARNING: type inference failed for: r1v3, types: [com.instagram.clips.animatedthumbnail.AnimatedThumbnailView, android.view.View] */
    public final void ATF(AnonymousClass30Y r12, C252093oY r13) {
        Integer num;
        0qQ.A0B(r12, 0);
        if (r13 != null) {
            num = r13.CEk(r12);
        } else {
            num = null;
        }
        SpritesheetInfo spritesheetInfo = (SpritesheetInfo) r12.A03;
        if ((num != AnonymousClass05K.A00 && num != AnonymousClass05K.A01) || r13.B0M(r12) <= 1000) {
            return;
        }
        if (spritesheetInfo != null) {
            IgImageView igImageView = this.A02;
            igImageView.getLayoutParams().width = this.A01;
            igImageView.getLayoutParams().height = this.A00;
            igImageView.A00 = 0.5f;
            igImageView.A0I(this.A03, spritesheetInfo, 1.5d, 0, false);
            FP0.A00(igImageView, 3, this);
            igImageView.A0E = new WTN(1, this, igImageView);
            return;
        }
        this.A02.setVisibility(8);
        this.A04.setVisibility(0);
    }

    public FZW(AnimatedThumbnailView animatedThumbnailView, AnonymousClass0iw r2, IgImageView igImageView, 1Xj r4, E23 e23, String str, int i, int i2) {
        this.A04 = igImageView;
        this.A02 = animatedThumbnailView;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = e23;
        this.A03 = r2;
        this.A05 = r4;
        this.A07 = str;
    }
}
