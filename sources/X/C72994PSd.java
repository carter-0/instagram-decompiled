package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PSd  reason: case insensitive filesystem */
public final class C72994PSd implements 1aV {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass77B A02;
    public final /* synthetic */ C66819MdB A03;
    public final /* synthetic */ IgProgressImageView A04;
    public final /* synthetic */ 0sP A05;

    public C72994PSd(AnonymousClass0iw r1, UserSession userSession, AnonymousClass77B r3, C66819MdB mdB, IgProgressImageView igProgressImageView, 0sP r6) {
        this.A02 = r3;
        this.A04 = igProgressImageView;
        this.A03 = mdB;
        this.A01 = userSession;
        this.A00 = r1;
        this.A05 = r6;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        ImageUrl imageUrl = (ImageUrl) obj;
        AnonymousClass77B r3 = this.A02;
        1Xj r0 = r3.A0E;
        if (r0 != null) {
            this.A04.setExpiration(r0.A17());
        }
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = r3.A01;
        if (privacyMediaOverlayViewModel == null || !((i = privacyMediaOverlayViewModel.A00) == 2 || i == 1)) {
            this.A04.setPostProcessor((C226642hc) null);
        }
        C66819MdB.A00(imageUrl, this.A03);
        this.A04.setUrl(this.A01, imageUrl, this.A00);
        this.A05.invoke(Float.valueOf(r3.A02));
    }
}
