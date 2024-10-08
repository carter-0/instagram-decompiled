package X;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.avatars.coinflip.CoinFlipAvatarImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.72n  reason: invalid class name and case insensitive filesystem */
public abstract class C3254672n extends ConstraintLayout {
    public ConstraintLayout A00;
    public CoinFlipAvatarImageView A01;
    public IgImageView A02;
    public IgImageView A03;
    public String A04;
    public boolean A05;

    public final void setBackgroundUrl(String str) {
        0qQ.A0B(str, 0);
        this.A04 = str;
    }

    public final void setCircleBackgroundImage(ImageUrl imageUrl, AnonymousClass0iw r3) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r3, 1);
        this.A04 = imageUrl.getUrl();
        this.A02.setUrl(imageUrl, r3);
    }

    public void setProfilePicUrl(ImageUrl imageUrl, AnonymousClass0iw r3) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r3, 1);
        this.A03.setUrl(imageUrl, r3);
    }

    public final void setProfilePicView(IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        this.A03 = igImageView;
    }

    public final CoinFlipAvatarImageView getAvatarView() {
        return this.A01;
    }

    public final String getBackgroundUrl() {
        return this.A04;
    }

    public final IgImageView getCircleView() {
        return this.A02;
    }

    public final Drawable getDrawable() {
        return this.A03.getDrawable();
    }

    public final IgImageView getProfilePicView() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.avatars.coinflip.CoinFlipAvatarImageView, android.widget.ImageView, android.view.View] */
    public final void setAvatarImageDrawable(Drawable drawable) {
        ? r0 = this.A01;
        r0.setVisibility(0);
        r0.setImageDrawable(drawable);
        if (this.A05 && (drawable instanceof C321016tR)) {
            ConstraintLayout constraintLayout = this.A00;
            if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                constraintLayout.addOnLayoutChangeListener(new C46429Deq(drawable, this));
            } else {
                this.A01.setTopMarginRatio(((C321016tR) drawable).A01);
            }
        }
        this.A02.setVisibility(0);
        this.A03.setVisibility(4);
    }

    public final void setCircleBackgroundColor(int i) {
        IgImageView igImageView = this.A02;
        igImageView.A09();
        igImageView.setBackgroundColor(i);
    }

    public final void setFramePopEnabled(boolean z) {
        this.A05 = z;
    }
}
