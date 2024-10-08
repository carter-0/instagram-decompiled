package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.PAn  reason: case insensitive filesystem */
public final class C72556PAn implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;
    public final AnonymousClass7DZ A03;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        PBY pby = new PBY(DbU.A0A(layoutInflater, viewGroup, R.layout.direct_animated_sticker_message_with_big_heart, false));
        this.A03.A00(pby);
        return pby;
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r8, AnonymousClass7FW r9) {
        PBY pby = (PBY) r8;
        NYT nyt = (NYT) r9;
        AnonymousClass7TG.A1N(pby, nyt);
        String A002 = nyt.BSG().A00();
        if (A002 != null) {
            ((AnonymousClass7TJ) this.A02).CjC(A002, nyt.CU2());
        }
        IgImageView igImageView = pby.A03;
        Object tag = igImageView.getTag();
        String A003 = nyt.BSG().A00();
        if (A003 == null || !A003.equals(tag)) {
            igImageView.setTag(nyt.BSG().A00());
            Context context = igImageView.getContext();
            TypedImageUrl typedImageUrl = nyt.A00;
            ImageUrl imageUrl = typedImageUrl.A00;
            if (typedImageUrl.A02) {
                GifUrlImpl gifUrlImpl = new GifUrlImpl(imageUrl.getUrl(), (float) imageUrl.getWidth(), (float) imageUrl.getHeight());
                JTQ.A1K(context);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad_tag_max_width);
                igImageView.setImageDrawable(C70049NwR.A00(context, this.A01, gifUrlImpl, Integer.valueOf(dimensionPixelSize), nyt.BSG().A01));
            } else {
                igImageView.setUrl(imageUrl, this.A00);
            }
            igImageView.setContentDescription(nyt.A01);
        }
        this.A03.A02(pby, nyt);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        PBY pby = (PBY) r3;
        0qQ.A0B(pby, 0);
        pby.A03.setTag((Object) null);
        this.A03.A01(pby);
    }

    public C72556PAn(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7XR r3, AnonymousClass7DZ r4) {
        this.A01 = userSession;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }
}
