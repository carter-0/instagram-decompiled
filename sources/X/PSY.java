package X;

import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

public final class PSY implements 1aV {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass77B A02;
    public final /* synthetic */ C66819MdB A03;
    public final /* synthetic */ IgProgressImageView A04;

    public PSY(AnonymousClass0iw r1, UserSession userSession, AnonymousClass77B r3, C66819MdB mdB, IgProgressImageView igProgressImageView) {
        this.A02 = r3;
        this.A04 = igProgressImageView;
        this.A03 = mdB;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImageUrl imageUrl = (ImageUrl) obj;
        AnonymousClass77B r3 = this.A02;
        1Xj r0 = r3.A0E;
        if (r0 != null) {
            this.A04.setExpiration(r0.A17());
        }
        IgProgressImageView igProgressImageView = this.A04;
        igProgressImageView.setPostProcessor((C226642hc) null);
        C66819MdB.A00(imageUrl, this.A03);
        igProgressImageView.setUrl(this.A01, imageUrl, this.A00);
        igProgressImageView.setAspectRatio(r3.A02);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
